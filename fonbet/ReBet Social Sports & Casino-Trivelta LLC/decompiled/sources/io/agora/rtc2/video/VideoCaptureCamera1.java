package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.room.w;
import io.agora.base.NV21Buffer;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.ISurfaceTextureHelper;
import io.agora.base.internal.video.SurfaceTextureHelper;
import io.agora.rtc2.video.VideoCapture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@TargetApi(15)
/* loaded from: classes3.dex */
public class VideoCaptureCamera1 extends VideoCaptureCamera {
    private static final int CAMERA_ERROR_DISABLED = 3;
    private static final SparseArray<String> COLOR_TEMPERATURES_MAP;
    private static final boolean DEBUG = false;
    private static final int GL_TEXTURE_EXTERNAL_OES = 36197;
    private static int IMAGE_FORMAT = 0;
    private static final int NUM_CAPTURE_BUFFERS = 3;
    private static final String TAG = "VideoCaptureCamera1";
    private static Map<Integer, Camera.Parameters> cameraParametersMaps;
    private static final ReentrantLock mFocalLengthLock;
    private boolean isFirstFrameCaptured;
    private Camera.Area mAreaOfInterest;
    private Camera mCamera;
    private volatile boolean mCameraErrorTrigger;
    private int mExpectedFrameSize;
    private boolean mIsRunning;
    private final Set<ParameterType> mModifiedParameters;
    private final Object mObjectLock;
    private int mPhysicalId;
    private ReentrantLock mPreviewBufferLock;
    private Camera.Parameters mPreviewParameters;
    private VideoCaptureFormat mVideoCaptureFormat;
    private boolean physicalCameraInVaild;

    /* renamed from: io.agora.rtc2.video.VideoCaptureCamera1$15, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass15 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType;

        static {
            int[] iArr = new int[ParameterType.values().length];
            $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType = iArr;
            try {
                iArr[ParameterType.ZOOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.FOCUS_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.EXPOSURE_COMPENSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.FLASH_MODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.WHITE_BALANCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.VIDEO_STABILIZATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.ANTIBANDING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.METERING_AREAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[ParameterType.FOCUS_AREAS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static class BuggyDeviceHack {
        private static final String[] COLORSPACE_BUGGY_DEVICE_LIST = {"SAMSUNG-SGH-I747", "ODROID-U2", "XT1092", "XT1095", "XT1096", "XT1097"};

        private BuggyDeviceHack() {
        }

        public static int getImageFormat() {
            if (isBuggyDevice()) {
                return 17;
            }
            return VideoCapture.AndroidImageFormat.YV12;
        }

        public static boolean isBuggyDevice() {
            for (String str : COLORSPACE_BUGGY_DEVICE_LIST) {
                if (str.contentEquals(Build.MODEL)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class CameraLengthTask implements Runnable {
        static int length;
        final CountDownLatch countDown = new CountDownLatch(1);

        public int getCameraIdLength() {
            new Thread(this).start();
            if (!ThreadUtils.awaitUninterruptibly(this.countDown, VideoCaptureCamera.MAX_CAMERA_TIME_MS)) {
                Logging.e(VideoCaptureCamera1.TAG, "getNumberOfCameras timeout");
            }
            return length;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    length = Camera.getNumberOfCameras();
                } catch (Exception e10) {
                    Logging.e(VideoCaptureCamera1.TAG, "getNumberOfCameras: " + e10.toString());
                }
            } finally {
                this.countDown.countDown();
            }
        }
    }

    public class CrErrorCallback implements Camera.ErrorCallback {
        public CrErrorCallback() {
        }

        @Override // android.hardware.Camera.ErrorCallback
        public void onError(int i10, Camera camera) {
            Logging.e(VideoCaptureCamera1.TAG, "Camera ErrorCallback id: " + i10);
            int i11 = 3;
            if (i10 == 2 || i10 == 100 || i10 == 1 || i10 == 3) {
                if (i10 == 2) {
                    VideoCaptureCamera1.this.mCameraErrorTrigger = true;
                    i11 = 6;
                } else if (i10 == 100) {
                    VideoCaptureCamera1.this.deallocate();
                    i11 = 5;
                } else if (i10 == 3) {
                    VideoCaptureCamera1.this.mCameraErrorTrigger = true;
                } else {
                    VideoCaptureCamera1.this.deallocate();
                    i11 = VideoCapture.AndroidVideoCaptureError.kCameraErrorRuntimeUnknown;
                }
                VideoCaptureCamera1.this.onError(i11, "Camera ErrorCallback id: " + i10);
            }
        }
    }

    public enum ParameterType {
        ZOOM,
        FOCUS_MODE,
        EXPOSURE_COMPENSATION,
        FLASH_MODE,
        WHITE_BALANCE,
        VIDEO_STABILIZATION,
        ANTIBANDING,
        METERING_AREAS,
        FOCUS_AREAS
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        COLOR_TEMPERATURES_MAP = sparseArray;
        sparseArray.append(2850, "incandescent");
        sparseArray.append(2950, "warm-fluorescent");
        sparseArray.append(4250, "fluorescent");
        sparseArray.append(4600, "twilight");
        sparseArray.append(5500, "daylight");
        sparseArray.append(6000, "cloudy-daylight");
        sparseArray.append(7000, "shade");
        IMAGE_FORMAT = 17;
        mFocalLengthLock = new ReentrantLock();
        cameraParametersMaps = new ConcurrentHashMap();
    }

    public VideoCaptureCamera1(int i10, long j10, boolean z10, boolean z11, int i11, boolean z12, int i12, EglBase.Context context, int i13, VideoCaptureParameter videoCaptureParameter) {
        super(i10, j10, z10, z11, i11, z12, i12, context, i13, videoCaptureParameter.camera1FocusMode, videoCaptureParameter);
        this.mPhysicalId = -1;
        this.mPreviewBufferLock = new ReentrantLock();
        this.physicalCameraInVaild = false;
        this.mCameraErrorTrigger = false;
        this.mObjectLock = new Object();
        this.isFirstFrameCaptured = false;
        this.mModifiedParameters = Collections.newSetFromMap(new ConcurrentHashMap());
        int i14 = videoCaptureParameter.physicalId;
        if (i14 >= 0) {
            this.mPhysicalId = i14;
        }
    }

    private static Camera.CameraInfo getCameraInfo(int i10) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i10, cameraInfo);
            return cameraInfo;
        } catch (RuntimeException e10) {
            Logging.e(TAG, "getCameraInfo: Camera.getCameraInfo: " + e10);
            return null;
        }
    }

    public static int getCaptureApiType(int i10) {
        return getCameraInfo(i10) == null ? 11 : 6;
    }

    private String getClosestWhiteBalance(int i10, List<String> list) {
        int abs;
        int i11 = Integer.MAX_VALUE;
        String str = null;
        int i12 = 0;
        while (true) {
            SparseArray<String> sparseArray = COLOR_TEMPERATURES_MAP;
            if (i12 >= sparseArray.size()) {
                return str;
            }
            if (list.contains(sparseArray.valueAt(i12)) && (abs = Math.abs(i10 - sparseArray.keyAt(i12))) < i11) {
                str = sparseArray.valueAt(i12);
                i11 = abs;
            }
            i12++;
        }
    }

    public static String getDeviceId(int i10) {
        return Integer.toString(i10);
    }

    public static List<VideoCaptureFormat> getDeviceSupportedFormats(int i10) {
        Camera open;
        String str = TAG;
        Logging.i(str, "getDeviceSupportedFormats() " + i10);
        ArrayList arrayList = new ArrayList();
        try {
            ReentrantLock reentrantLock = mFocalLengthLock;
            if (!reentrantLock.tryLock(VideoCaptureCamera.MAX_CAMERA_TIME_MS, TimeUnit.MILLISECONDS)) {
                Logging.w(str, "getDeviceSupportedFormats tryLock mFocalLengthLock timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                return arrayList;
            }
            List<VideoCaptureFormat> list = null;
            Camera.Parameters parameters = null;
            try {
                try {
                    open = Camera.open(i10);
                } catch (RuntimeException e10) {
                    Logging.e(TAG, "Camera.open: " + e10);
                }
                if (open == null) {
                    reentrantLock.unlock();
                    return null;
                }
                try {
                    parameters = open.getParameters();
                } catch (RuntimeException e11) {
                    Logging.e(TAG, "Failed to get camera parameters " + i10, e11);
                }
                list = getFormatsFromParemeters(parameters, IMAGE_FORMAT);
                try {
                    open.release();
                } catch (Exception e12) {
                    Logging.e(TAG, "Failed to release camera: " + i10, e12);
                }
                return list;
            } finally {
                mFocalLengthLock.unlock();
            }
        } catch (InterruptedException e13) {
            Logging.e(TAG, "getDeviceSupportedFormats tryLock mFocalLengthLock", e13);
            Thread.currentThread().interrupt();
            return arrayList;
        }
    }

    public static int getFacingMode(int i10) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i10);
        if (cameraInfo == null) {
            return 0;
        }
        int i11 = cameraInfo.facing;
        if (i11 != 0) {
            return i11 != 1 ? 0 : 1;
        }
        return 2;
    }

    public static float getFocalLength(Camera.Parameters parameters) {
        if (parameters == null) {
            Logging.e(TAG, "failed get focalLength");
            return -1.0f;
        }
        float focalLength = parameters.getFocalLength();
        Logging.d(TAG, "getCameraParameters: Camera.focalLength: " + focalLength);
        return focalLength;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:15|16|17|(1:19)(1:49)|20|(1:22)(1:48)|23|24|(6:40|(2:(1:45)(1:47)|46)|33|34|35|36)(3:(1:29)|30|31)|32|33|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0120, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0121, code lost:
    
        io.agora.base.internal.Logging.e(io.agora.rtc2.video.VideoCaptureCamera1.TAG, "Failed to release camera: " + r19, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean getFocalLengthInfo(int i10, int i11, boolean z10, FocalLengthInfo[] focalLengthInfoArr) {
        boolean z11 = false;
        int i12 = 0;
        z11 = false;
        try {
            ReentrantLock reentrantLock = mFocalLengthLock;
            try {
                if (!reentrantLock.tryLock(VideoCaptureCamera.MAX_CAMERA_TIME_MS, TimeUnit.MILLISECONDS)) {
                    Logging.w(TAG, "getFocalLengthInfo tryLock mFocalLengthLock timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                    return false;
                }
                try {
                    Camera open = Camera.open(i11);
                    if (open == null) {
                        reentrantLock.unlock();
                        return false;
                    }
                    try {
                        float focalLength = getFocalLength(open.getParameters());
                        String str = TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("The ");
                        sb2.append(z10 ? "front Camera " : "rear Camera ");
                        sb2.append("minimum supported value is: ");
                        sb2.append(10.0f * focalLength);
                        sb2.append("mm");
                        Logging.d(str, sb2.toString());
                        int i13 = (i10 - 1) * 6;
                        int i14 = (z10 ? 0 : 3) + i13;
                        focalLengthInfoArr[i14] = new FocalLengthInfo(z10 ? 1 : 0, i14, i11, 0);
                        if (focalLength < 2.4f || focalLength >= 3.5f) {
                            if (focalLength < 2.4f && focalLength > 0.1d) {
                                if (!z10) {
                                    i12 = 3;
                                }
                                int i15 = i13 + i12 + 2;
                                Logging.d(str, "getFocalLengthInfo cameraDirection " + (z10 ? 1 : 0) + " index: " + i15 + " id: " + i11 + " focalLengthType: 2 front: " + z10);
                                focalLengthInfoArr[i15] = new FocalLengthInfo(z10 ? 1 : 0, i15, i11, 2);
                            }
                            open.release();
                            mFocalLengthLock.unlock();
                            return z11;
                        }
                        int i16 = i13 + (z10 ? 0 : 3) + 1;
                        Logging.d(str, "getFocalLengthInfo cameraDirection " + (z10 ? 1 : 0) + " index: " + i16 + " id: " + i11 + " focalLengthType: 1 front: " + z10);
                        focalLengthInfoArr[i16] = new FocalLengthInfo(z10 ? 1 : 0, i16, i11, 1);
                        z11 = true;
                        open.release();
                        mFocalLengthLock.unlock();
                        return z11;
                    } catch (RuntimeException e10) {
                        Logging.e(TAG, "Failed to get camera parameters " + i11, e10);
                        mFocalLengthLock.unlock();
                        return false;
                    }
                } catch (RuntimeException e11) {
                    Logging.e(TAG, "Camera.open: " + e11);
                    mFocalLengthLock.unlock();
                    return false;
                }
            } catch (Throwable th2) {
                mFocalLengthLock.unlock();
                throw th2;
            }
        } catch (InterruptedException e12) {
            Logging.e(TAG, "getFocalLengthInfo tryLock mFocalLengthLock", e12);
            Thread.currentThread().interrupt();
            return false;
        }
    }

    @NonNull
    private static List<VideoCaptureFormat> getFormatsFromParemeters(Camera.Parameters parameters, int i10) {
        List<int[]> list;
        String str = TAG;
        Logging.i(str, "getFormatsFromParemeters() ");
        ArrayList arrayList = new ArrayList();
        if (parameters != null) {
            List<Integer> supportedPreviewFormats = parameters.getSupportedPreviewFormats();
            if (supportedPreviewFormats == null || supportedPreviewFormats.isEmpty()) {
                Logging.i(str, "failed to getFormatsFromParemeters, preview formats null or empty");
                return arrayList;
            }
            Iterator<Integer> it = supportedPreviewFormats.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == i10) {
                    try {
                        list = parameters.getSupportedPreviewFpsRange();
                    } catch (StringIndexOutOfBoundsException e10) {
                        Logging.e(TAG, "Camera.Parameters.getSupportedPreviewFpsRange: " + e10);
                        list = null;
                    }
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    int i11 = 0;
                    if (list.size() == 0) {
                        list.add(new int[]{0, 0});
                    }
                    Iterator<int[]> it2 = list.iterator();
                    while (it2.hasNext()) {
                        int i12 = (it2.next()[1] + w.MAX_BIND_PARAMETER_CNT) / 1000;
                        if (i11 < i12) {
                            i11 = i12;
                        }
                    }
                    List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                    if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
                        for (Camera.Size size : supportedPreviewSizes) {
                            if (!VideoCaptureCamera.shouldExcludeSize(size.width, size.height)) {
                                arrayList.add(new VideoCaptureFormat(size.width, size.height, i11, 17));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String getName(int i10) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i10);
        if (cameraInfo != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("camera ");
            sb2.append(i10);
            sb2.append(", facing ");
            sb2.append(cameraInfo.facing == 1 ? "front" : "back");
            return sb2.toString();
        }
        Logging.e(TAG, "getName: " + i10 + " , failed to getCameraInfo.");
        return null;
    }

    public static int getNumberOfCameras() {
        return new CameraLengthTask().getCameraIdLength();
    }

    private List<Integer> getZoomRatios() {
        if (this.mCamera == null) {
            return null;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (isZoomSupported(cameraParameters)) {
            return cameraParameters.getZoomRatios();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSupported(String str, List<String> list) {
        return list != null && list.indexOf(str) >= 0;
    }

    private void listenForBytebufferFrames() {
        this.mCamera.setPreviewCallbackWithBuffer(new Camera.PreviewCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.14
            @Override // android.hardware.Camera.PreviewCallback
            public void onPreviewFrame(final byte[] bArr, final Camera camera) {
                VideoCaptureCamera1.this.updateRealCaptureFpsStatsOnFrameCaptured();
                VideoCaptureCamera1.this.mPreviewBufferLock.lock();
                if (!VideoCaptureCamera1.this.mIsRunning) {
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    VideoCaptureCamera1.this.onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                    return;
                }
                if (!VideoCaptureCamera1.this.mFirstVideoFrameCaptured) {
                    Logging.i(VideoCaptureCamera1.TAG, "first video frame captured by camera1 yuv!");
                    VideoCaptureCamera1.this.mFirstVideoFrameCaptured = true;
                }
                VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                if (videoCaptureCamera1.dropCount > 0) {
                    if (camera != null) {
                        camera.addCallbackBuffer(bArr);
                    }
                    Logging.d(VideoCaptureCamera1.TAG, "Should drop " + VideoCaptureCamera1.this.dropCount + " frames after start capture.");
                    VideoCaptureCamera1 videoCaptureCamera12 = VideoCaptureCamera1.this;
                    videoCaptureCamera12.dropCount = videoCaptureCamera12.dropCount - 1;
                    videoCaptureCamera12.mPreviewBufferLock.unlock();
                    return;
                }
                if (bArr.length == videoCaptureCamera1.mExpectedFrameSize) {
                    VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, VideoCaptureCamera1.this.mCaptureFormat.getWidth(), VideoCaptureCamera1.this.mCaptureFormat.getHeight(), new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.14.1
                        @Override // java.lang.Runnable
                        public void run() {
                            VideoCaptureCamera1.this.mPreviewBufferLock.lock();
                            if (!VideoCaptureCamera1.this.mIsRunning) {
                                VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                                return;
                            }
                            VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                            if (camera != null) {
                                VideoCaptureCamera1.this.mCamera.addCallbackBuffer(bArr);
                            }
                        }
                    }), VideoCaptureCamera1.this.getCameraRotation(), TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime()));
                    VideoCaptureCamera1.this.attachPerFrameMetaInfos(videoFrame);
                    VideoCaptureCamera1.this.onFrameCaptured(videoFrame);
                    videoFrame.release();
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                } else {
                    VideoCaptureCamera1.this.onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    if (camera != null) {
                        camera.addCallbackBuffer(bArr);
                    }
                }
                if (VideoCaptureCamera1.this.isFirstFrameCaptured) {
                    return;
                }
                Logging.i(VideoCaptureCamera1.TAG, "first frame captured.");
                VideoCaptureCamera1.this.isFirstFrameCaptured = true;
                VideoCaptureCamera1.this.onFirstFrameCaptured();
            }
        });
    }

    private void listenForTextureFrames() {
        ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
        if (iSurfaceTextureHelper == null) {
            return;
        }
        iSurfaceTextureHelper.startListening(new SurfaceTextureHelper.IVideoCapture() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.13
            @Override // io.agora.base.internal.video.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                VideoCaptureCamera1.this.updateRealCaptureFpsStatsOnFrameCaptured();
                VideoCaptureCamera1.this.mPreviewBufferLock.lock();
                try {
                    if (!VideoCaptureCamera1.this.mIsRunning) {
                        onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                        return;
                    }
                    if (!VideoCaptureCamera1.this.mFirstVideoFrameCaptured) {
                        Logging.i(VideoCaptureCamera1.TAG, "first video frame captured by camera1 texture!");
                        VideoCaptureCamera1.this.mFirstVideoFrameCaptured = true;
                    }
                    if (VideoCaptureCamera1.this.dropCount > 0) {
                        Logging.i(VideoCaptureCamera1.TAG, "Drop frames after restart capture. Left " + VideoCaptureCamera1.this.dropCount + " .");
                        VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                        videoCaptureCamera1.dropCount = videoCaptureCamera1.dropCount - 1;
                        videoCaptureCamera1.mPreviewBufferLock.unlock();
                        return;
                    }
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    if (buffer == null) {
                        onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                        return;
                    }
                    VideoCaptureCamera1 videoCaptureCamera12 = VideoCaptureCamera1.this;
                    if (videoCaptureCamera12.mEnableTextureCopy && (buffer = ((SurfaceTextureHelper) videoCaptureCamera12.mSurfaceTextureHelper).textureCopy((VideoFrame.TextureBuffer) videoFrame.getBuffer())) == null) {
                        onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DO_COPY_FAIL);
                        Logging.i(VideoCaptureCamera1.TAG, "TextureVideoSinkListener copy frame error");
                        return;
                    }
                    VideoFrame videoFrame2 = new VideoFrame(VideoCapture.createTextureBufferWithModifiedTransformMatrix((TextureBuffer) buffer, !VideoCaptureCamera1.this.mInvertDeviceOrientationReadings, 0), VideoCaptureCamera1.this.getCameraRotation(), videoFrame.getTimestampNs());
                    VideoCaptureCamera1.this.attachPerFrameMetaInfos(videoFrame2);
                    VideoCaptureCamera1.this.onFrameCaptured(videoFrame2);
                    if (VideoCaptureCamera1.this.mEnableTextureCopy) {
                        buffer.release();
                    }
                    videoFrame2.release();
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                    if (VideoCaptureCamera1.this.isFirstFrameCaptured) {
                        return;
                    }
                    Logging.i(VideoCaptureCamera1.TAG, "first frame captured.");
                    VideoCaptureCamera1.this.isFirstFrameCaptured = true;
                    VideoCaptureCamera1.this.onFirstFrameCaptured();
                } finally {
                    VideoCaptureCamera1.this.mPreviewBufferLock.unlock();
                }
            }

            @Override // io.agora.base.internal.video.SurfaceTextureHelper.IVideoCapture
            public void onFrameDropped(int i10) {
                VideoCaptureCamera1.super.onFrameDropped(i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFaceDetection(Camera.Face[] faceArr) {
        double pow;
        double d10;
        ArrayList<RectF> arrayList = new ArrayList<>();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        Camera.Parameters cameraParameters = getCameraParameters();
        this.mPreviewParameters = cameraParameters;
        if (cameraParameters == null || cameraParameters.getPreviewSize() == null || faceArr == null) {
            return;
        }
        for (Camera.Face face : faceArr) {
            RectF cameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(face.rect));
            if (cameraToNormalized != null) {
                if (this.mId == 1) {
                    pow = Math.pow(cameraToNormalized.width(), -0.958d);
                    d10 = 11.237d;
                } else {
                    pow = Math.pow(cameraToNormalized.height(), -0.971d);
                    d10 = 14.719d;
                }
                arrayList2.add(Double.valueOf(pow * d10));
                int width = this.mRenderView.getWidth();
                int height = this.mRenderView.getHeight();
                int i10 = this.mPreviewParameters.getPreviewSize().width;
                int i11 = this.mPreviewParameters.getPreviewSize().height;
                int i12 = this.mId;
                RectF normalizedToView = CoordinatesTransform.normalizedToView(cameraToNormalized, width, height, i10, i11, i12 == 1, getCameraRotation() * (i12 == 1 ? 1 : -1), this.mRenderMode);
                if (normalizedToView == null) {
                    arrayList2.remove(arrayList2.size() - 1);
                } else {
                    arrayList.add(normalizedToView);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        notifyFaceDetection(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), arrayList, arrayList2);
    }

    private void onFaceDetectionRequestChanged() {
        if (this.mEnableAutoFaceFocus) {
            Logging.i(TAG, "startFaceDetection for auto focus enabled");
            Camera.FaceDetectionListener faceDetectionListener = new Camera.FaceDetectionListener() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.3
                private long mLastFocusedTs;

                @Override // android.hardware.Camera.FaceDetectionListener
                public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                    if (videoCaptureCamera1.mEnableFaceDetection) {
                        videoCaptureCamera1.notifyFaceDetection(faceArr);
                    }
                    if (faceArr == null || faceArr.length == 0 || camera == null || !VideoCaptureCamera1.this.mEnableAutoFaceFocus) {
                        return;
                    }
                    if (System.currentTimeMillis() - this.mLastFocusedTs < 3000) {
                        Camera.Face face = faceArr[0];
                        if (face.score > 20) {
                            Rect rect = face.rect;
                            if (rect != null && !rect.equals(VideoCaptureCamera1.this.lastFocusAreaRect)) {
                                VideoCaptureCamera1.this.notifyCameraFocusAreaChanged(faceArr[0].rect);
                            }
                            VideoCaptureCamera1.this.lastFocusAreaRect = faceArr[0].rect;
                            return;
                        }
                        return;
                    }
                    if (faceArr[0].score <= 50) {
                        Logging.d(VideoCaptureCamera1.TAG, "face score = " + faceArr[0].score);
                        this.mLastFocusedTs = System.currentTimeMillis();
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Camera.Area(faceArr[0].rect, 1000));
                        if (camera.getParameters().getMaxNumFocusAreas() > 0) {
                            camera.getParameters().setFocusAreas(arrayList);
                        }
                        if (camera.getParameters().getMaxNumMeteringAreas() > 0) {
                            camera.getParameters().setMeteringAreas(arrayList);
                        }
                        VideoCaptureCamera1.this.notifyCameraFocusAreaChanged(faceArr[0].rect);
                        if (VideoCaptureCamera1.this.isAutoFaceFocusSupported()) {
                            camera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.3.1
                                @Override // android.hardware.Camera.AutoFocusCallback
                                public void onAutoFocus(boolean z10, Camera camera2) {
                                    Logging.d(VideoCaptureCamera1.TAG, "auto face focus called api1 every 3 seconds");
                                    if (camera2 != null) {
                                        try {
                                            camera2.cancelAutoFocus();
                                        } catch (RuntimeException e10) {
                                            Logging.w(VideoCaptureCamera1.TAG, "Exception in cancelAutoFocus: " + Log.getStackTraceString(e10));
                                        }
                                    }
                                }
                            });
                        }
                        this.mLastFocusedTs = System.currentTimeMillis();
                    } catch (RuntimeException e10) {
                        Logging.w(VideoCaptureCamera1.TAG, "Exception in onFaceDetection callback: " + Log.getStackTraceString(e10));
                    }
                }
            };
            if (isFaceDetectSupported()) {
                safetyStarFaceDetection(faceDetectionListener);
                return;
            }
            return;
        }
        if (!this.mEnableFaceDetection || !isFaceDetectSupported()) {
            safetyStopFaceDetection();
            return;
        }
        Camera.FaceDetectionListener faceDetectionListener2 = new Camera.FaceDetectionListener() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.4
            @Override // android.hardware.Camera.FaceDetectionListener
            public void onFaceDetection(Camera.Face[] faceArr, Camera camera) {
                VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                if (videoCaptureCamera1.mEnableFaceDetection) {
                    videoCaptureCamera1.notifyFaceDetection(faceArr);
                }
            }
        };
        Logging.i(TAG, "startFaceDetection for face dectect enabled");
        safetyStarFaceDetection(faceDetectionListener2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstFrameCaptured() {
        if (this.mIsmCameraExposureStarted) {
            return;
        }
        float[] fArr = this.mCameraExposurePositions;
        float f10 = fArr[0];
        if (f10 > 0.0f) {
            float f11 = fArr[1];
            if (f11 > 0.0f) {
                setExposure(f10, f11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean physicalFallback() {
        try {
            ReentrantLock reentrantLock = mFocalLengthLock;
            if (!reentrantLock.tryLock(VideoCaptureCamera.MAX_CAMERA_TIME_MS, TimeUnit.MILLISECONDS)) {
                Logging.w(TAG, "physicalFallback tryLock mFocalLengthLock timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                return false;
            }
            try {
                try {
                    this.mCamera = Camera.open(this.mId);
                    reentrantLock.unlock();
                    return true;
                } catch (RuntimeException e10) {
                    Logging.e(TAG, "allocate: Camera.open: " + e10);
                    mFocalLengthLock.unlock();
                    return false;
                }
            } catch (Throwable th2) {
                mFocalLengthLock.unlock();
                throw th2;
            }
        } catch (InterruptedException e11) {
            Logging.e(TAG, "physicalFallback tryLock mFocalLengthLock", e11);
            Thread.currentThread().interrupt();
            return false;
        }
    }

    @NonNull
    public static List<FocalLengthInfo> queryCameraFocalLengthCapability() {
        int i10;
        int numberOfCameras = getNumberOfCameras();
        if (numberOfCameras <= 0) {
            return null;
        }
        FocalLengthInfo[] focalLengthInfoArr = new FocalLengthInfo[12];
        boolean z10 = false;
        for (0; i10 < numberOfCameras; i10 + 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i10, cameraInfo);
            if (i10 <= Math.max(1, 0)) {
                i10 = getFocalLengthInfo(1, i10, cameraInfo.facing == 1, focalLengthInfoArr) ? 0 : i10 + 1;
                z10 = true;
            } else {
                if (!getFocalLengthInfo(2, i10, cameraInfo.facing == 1, focalLengthInfoArr)) {
                }
                z10 = true;
            }
        }
        if (z10) {
            Logging.d(TAG, "Logical Camera, FocalLengths available.");
        } else {
            Logging.w(TAG, "Logical Camera, FocalLengths empty!");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 12; i11++) {
            FocalLengthInfo focalLengthInfo = focalLengthInfoArr[i11];
            if (!arrayList.contains(focalLengthInfo)) {
                arrayList.add(focalLengthInfo);
            }
        }
        return arrayList;
    }

    private void releaseCamera() {
        Handler handler = this.mProxyThreadHandler;
        if (handler == null) {
            Logging.w(TAG, "proxyThread unavailable");
            return;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.12
                @Override // java.util.concurrent.Callable
                public Void call() {
                    try {
                        if (VideoCaptureCamera1.this.mCamera != null) {
                            VideoCaptureCamera1.this.resetModifiedParameters();
                            VideoCaptureCamera1.this.mCamera.release();
                            VideoCaptureCamera1.this.mCamera = null;
                            Logging.i(VideoCaptureCamera1.TAG, "releaseCamera done!");
                        }
                    } catch (Exception e10) {
                        Logging.e(VideoCaptureCamera1.TAG, "releaseCamera: failed to release camera, " + e10);
                    }
                    return null;
                }
            });
        } catch (Exception e10) {
            Logging.e(TAG, "releaseCamera: failed to release camera, " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetModifiedParameters() {
        if (this.mModifiedParameters.isEmpty()) {
            return;
        }
        Camera.Parameters parameters = cameraParametersMaps.get(Integer.valueOf(this.mId));
        if (parameters == null) {
            Logging.w(TAG, "resetModifiedParameters: no cached parameters for camera " + this.mId);
            this.mModifiedParameters.clear();
            return;
        }
        Logging.i(TAG, "resetModifiedParameters: resetting " + this.mModifiedParameters.size() + " parameters for camera " + this.mId);
        for (ParameterType parameterType : this.mModifiedParameters) {
            try {
                switch (AnonymousClass15.$SwitchMap$io$agora$rtc2$video$VideoCaptureCamera1$ParameterType[parameterType.ordinal()]) {
                    case 1:
                        parameters.setZoom(0);
                        break;
                    case 2:
                        parameters.setFocusMode("auto");
                        break;
                    case 3:
                        parameters.setExposureCompensation(0);
                        break;
                    case 4:
                        parameters.setFlashMode("off");
                        break;
                    case 5:
                        parameters.setWhiteBalance("auto");
                        break;
                    case 6:
                        parameters.setVideoStabilization(false);
                        break;
                    case 7:
                        parameters.setAntibanding("off");
                        break;
                    case 8:
                        parameters.setMeteringAreas(null);
                        break;
                    case 9:
                        parameters.setFocusAreas(null);
                        break;
                }
                Logging.d(TAG, "resetModifiedParameters: reset " + parameterType);
            } catch (Exception e10) {
                Logging.w(TAG, "resetModifiedParameters: failed to reset " + parameterType + ": " + e10);
            }
        }
        this.mModifiedParameters.clear();
    }

    private void safetyStarFaceDetection(Camera.FaceDetectionListener faceDetectionListener) {
        Logging.i(TAG, "facedetect: " + this.mEnableFaceDetection);
        try {
            Camera camera = this.mCamera;
            if (camera != null) {
                if (this.mIsFaceDetectionStarted) {
                    camera.stopFaceDetection();
                }
                this.mCamera.setFaceDetectionListener(faceDetectionListener);
                this.mCamera.startFaceDetection();
                this.mIsFaceDetectionStarted = true;
            }
        } catch (Exception e10) {
            Logging.e(TAG, "Failed to stop face detection", e10);
            Camera camera2 = this.mCamera;
            if (camera2 != null) {
                camera2.stopFaceDetection();
                this.mCamera.setFaceDetectionListener(null);
                this.mIsFaceDetectionStarted = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safetyStopFaceDetection() {
        Logging.i(TAG, "stopFaceDetection()");
        try {
            try {
                if (this.mIsFaceDetectionStarted) {
                    Camera camera = this.mCamera;
                    if (camera != null) {
                        camera.stopFaceDetection();
                    }
                    this.mIsFaceDetectionStarted = false;
                    this.mPerFrameFaceDetectionInfoQueue.clear();
                }
                Camera camera2 = this.mCamera;
                if (camera2 != null) {
                    camera2.setFaceDetectionListener(null);
                }
            } catch (RuntimeException e10) {
                Logging.e(TAG, "Failed to stop face detection", e10);
                Camera camera3 = this.mCamera;
                if (camera3 != null) {
                    camera3.setFaceDetectionListener(null);
                }
            }
        } catch (Throwable th2) {
            Camera camera4 = this.mCamera;
            if (camera4 != null) {
                camera4.setFaceDetectionListener(null);
            }
            throw th2;
        }
    }

    private int setFocusByCustom(float f10, float f11) {
        Rect calculateFocusArea = CoordinatesTransform.calculateFocusArea(f10, f11, 1.0f);
        Rect calculateFocusArea2 = CoordinatesTransform.calculateFocusArea(f10, f11, 1.5f);
        try {
            this.mCamera.cancelAutoFocus();
        } catch (RuntimeException e10) {
            Logging.w(TAG, "Failed to cancle AutoFocus" + e10);
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters == null) {
            return -1;
        }
        if (cameraParameters.getMaxNumFocusAreas() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Camera.Area(calculateFocusArea, 800));
            cameraParameters.setFocusAreas(arrayList);
        } else {
            Logging.w(TAG, "focus areas not supported");
        }
        if (cameraParameters.getMaxNumMeteringAreas() > 0) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Camera.Area(calculateFocusArea2, 800));
            cameraParameters.setMeteringAreas(arrayList2);
        } else {
            Logging.w(TAG, "metering areas not supported");
        }
        RectF normalizedToSensor = CoordinatesTransform.normalizedToSensor(CoordinatesTransform.cameraToNormalized(new RectF(calculateFocusArea2)), this.mPreviewParameters.getPreviewSize().width, this.mPreviewParameters.getPreviewSize().height, this.mPreviewParameters.getPreviewSize().width, this.mPreviewParameters.getPreviewSize().height, 0, false);
        if (normalizedToSensor == null) {
            Logging.e(TAG, "Failed to translate input coordinate");
            return -1;
        }
        normalizedToSensor.round(calculateFocusArea2);
        final String focusMode = cameraParameters.getFocusMode();
        if (isSupported("macro", cameraParameters.getSupportedFocusModes())) {
            cameraParameters.setFocusMode("macro");
            synchronized (this.mObjectLock) {
                try {
                    setParameterWithTracking(cameraParameters, ParameterType.FOCUS_AREAS, ParameterType.METERING_AREAS, ParameterType.FOCUS_MODE);
                } catch (Exception e11) {
                    Logging.w(TAG, "mCamera.setParameters Exception: " + e11);
                }
            }
        } else {
            Logging.w("focus", "FOCUS_MODE_MACRO is not supported");
        }
        try {
            this.mIsmCameraFocusStarted = true;
            this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.9
                @Override // android.hardware.Camera.AutoFocusCallback
                public void onAutoFocus(boolean z10, Camera camera) {
                    if (VideoCaptureCamera1.this.mCamera == null || VideoCaptureCamera.shouldSkipRefocus()) {
                        return;
                    }
                    try {
                        Camera.Parameters parameters = camera.getParameters();
                        parameters.setFocusMode(focusMode);
                        synchronized (VideoCaptureCamera1.this.mObjectLock) {
                            camera.setParameters(parameters);
                        }
                    } catch (Exception e12) {
                        Logging.w(VideoCaptureCamera1.TAG, "mCamera getParameters/setParameters Exception: " + e12);
                    }
                }
            });
            Rect rect = new Rect();
            RectF cameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(calculateFocusArea));
            if (cameraToNormalized == null) {
                Logging.w(TAG, "failed to translate coordinate from normalized to view!");
                return -1;
            }
            new RectF(cameraToNormalized.left * 1000.0f, cameraToNormalized.top * 1000.0f, cameraToNormalized.right * 1000.0f, cameraToNormalized.bottom * 1000.0f).round(rect);
            notifyCameraFocusAreaChanged(rect);
            return 0;
        } catch (Exception e12) {
            Logging.w(TAG, "mCamera.autoFocus Exception: " + e12);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameterWithTracking(Camera.Parameters parameters, ParameterType... parameterTypeArr) {
        Camera camera = this.mCamera;
        if (camera != null && parameters != null) {
            camera.setParameters(parameters);
        }
        if (parameterTypeArr != null) {
            for (ParameterType parameterType : parameterTypeArr) {
                if (parameterType != null) {
                    this.mModifiedParameters.add(parameterType);
                }
            }
        }
    }

    private void setPreviewFrameRateMode(Camera.Parameters parameters, int i10, boolean z10) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.size() == 0) {
            Logging.w(TAG, "allocate: camera don't supported fps first.");
            parameters.setPreviewFrameRate(i10);
            return;
        }
        int i11 = supportedPreviewFpsRange.get(0)[0] > 1000 ? 1 : 1000;
        ArrayList arrayList = new ArrayList(supportedPreviewFpsRange.size());
        for (int[] iArr : supportedPreviewFpsRange) {
            arrayList.add(new VideoCapture.FramerateRange(iArr[0] * i11, iArr[1] * i11));
        }
        VideoCapture.FramerateRange findBestFrameRateRange = VideoCaptureCamera.findBestFrameRateRange(arrayList, i10 * 1000, z10, this.mPQFirstType, this.mPQFirstDiff * 1000, this.mCustomMinFps * 1000, this.mCustomMaxFps * 1000);
        if (findBestFrameRateRange != null) {
            parameters.setPreviewFpsRange(findBestFrameRateRange.min / i11, findBestFrameRateRange.max / i11);
        }
    }

    private void setPreviewFrameRateModePQ(Camera.Parameters parameters, int i10) {
        List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
        if (supportedPreviewFrameRates == null || supportedPreviewFrameRates.size() == 0) {
            Logging.w(TAG, "allocate: camera don't supported PQ first.");
            setPreviewFrameRateMode(parameters, i10, false);
            return;
        }
        int abs = Math.abs(supportedPreviewFrameRates.get(0).intValue() - i10);
        int intValue = supportedPreviewFrameRates.get(0).intValue();
        for (Integer num : supportedPreviewFrameRates) {
            int abs2 = Math.abs(num.intValue() - i10);
            if (abs2 < abs) {
                intValue = num.intValue();
                abs = abs2;
            }
        }
        parameters.setPreviewFrameRate(intValue);
        Logging.i(TAG, String.format(Locale.US, "allocate: matched (%d x %d) @%d -set- @%d, PQ first", Integer.valueOf(this.mCaptureFormat.mWidth), Integer.valueOf(this.mCaptureFormat.mHeight), Integer.valueOf(i10), Integer.valueOf(intValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String toCamera1ABMode(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "auto" : "60hz" : "50hz" : "off";
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0227 A[Catch: Exception -> 0x0222, TryCatch #4 {Exception -> 0x0222, blocks: (B:69:0x0216, B:88:0x0227, B:90:0x0233, B:91:0x023d), top: B:66:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0231  */
    @Override // io.agora.rtc2.video.IVideoCapture
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        Camera.Parameters parameters;
        boolean z10;
        List<String> supportedWhiteBalance;
        boolean z11;
        int i10;
        int i11;
        String str = TAG;
        Locale locale = Locale.US;
        Logging.i(str, String.format(locale, "allocate: requested (%d x %d) @%dfps", Integer.valueOf(videoCaptureFormat.getWidth()), Integer.valueOf(videoCaptureFormat.getHeight()), Integer.valueOf(videoCaptureFormat.getFramerate())));
        if (this.mSurfaceTextureHelper == null) {
            Logging.e(str, "surfaceTextureHelper null");
            return false;
        }
        if (this.mProxyThreadHandler == null) {
            Logging.w(str, "proxyThread unavailable");
            return false;
        }
        Camera.CameraInfo cameraInfo = getCameraInfo(this.mId);
        if (cameraInfo == null) {
            Logging.e(str, "failed to get camera info for " + this.mId);
            releaseCamera();
            return false;
        }
        this.physicalCameraInVaild = false;
        try {
            Boolean bool = (Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Boolean>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    Logging.i(VideoCaptureCamera1.TAG, "allocate openCamera camera name:" + VideoCaptureCamera1.this.mId + " ,physicalId: " + VideoCaptureCamera1.this.mPhysicalId);
                    try {
                        if (!VideoCaptureCamera1.mFocalLengthLock.tryLock(VideoCaptureCamera.MAX_CAMERA_TIME_MS, TimeUnit.MILLISECONDS)) {
                            Logging.w(VideoCaptureCamera1.TAG, "allocate tryLock mFocalLengthLock timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                            return Boolean.FALSE;
                        }
                        if (VideoCaptureCamera1.this.mPhysicalId >= 0) {
                            try {
                                try {
                                    Logging.i(VideoCaptureCamera1.TAG, "allocate openCamera start");
                                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                                    videoCaptureCamera1.mCamera = Camera.open(videoCaptureCamera1.mPhysicalId);
                                    Logging.i(VideoCaptureCamera1.TAG, "allocate openCamera done");
                                } catch (RuntimeException e10) {
                                    Logging.e(VideoCaptureCamera1.TAG, "allocate: Camera.open: " + e10);
                                    VideoCaptureCamera1.this.physicalCameraInVaild = true;
                                }
                                if (!VideoCaptureCamera1.this.physicalCameraInVaild) {
                                    VideoCaptureCamera1 videoCaptureCamera12 = VideoCaptureCamera1.this;
                                    videoCaptureCamera12.mId = videoCaptureCamera12.mPhysicalId;
                                }
                            } finally {
                            }
                        } else {
                            try {
                                Logging.i(VideoCaptureCamera1.TAG, "allocate openCamera start");
                                VideoCaptureCamera1 videoCaptureCamera13 = VideoCaptureCamera1.this;
                                videoCaptureCamera13.mCamera = Camera.open(videoCaptureCamera13.mId);
                                Logging.i(VideoCaptureCamera1.TAG, "allocate openCamera done");
                            } catch (RuntimeException e11) {
                                Logging.e(VideoCaptureCamera1.TAG, "allocate: Camera.open: " + e11);
                                return Boolean.FALSE;
                            } finally {
                            }
                        }
                        if (VideoCaptureCamera1.this.physicalCameraInVaild && !VideoCaptureCamera1.this.physicalFallback()) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera1.this.mIsRunning && VideoCaptureCamera1.this.mCamera != null) {
                            VideoCaptureCamera1 videoCaptureCamera14 = VideoCaptureCamera1.this;
                            if (videoCaptureCamera14.mProxyThreadHandler == null) {
                                try {
                                    videoCaptureCamera14.mCamera.release();
                                    VideoCaptureCamera1.this.mCamera = null;
                                    Logging.i(VideoCaptureCamera1.TAG, "allocate releaseCamera after stopping!");
                                } catch (Exception e12) {
                                    Logging.e(VideoCaptureCamera1.TAG, "allocate releaseCamera: failed to release camera, " + e12);
                                }
                            }
                        }
                        return Boolean.TRUE;
                    } catch (InterruptedException e13) {
                        Logging.e(VideoCaptureCamera1.TAG, "allocate tryLock mFocalLengthLock", e13);
                        Thread.currentThread().interrupt();
                        return Boolean.FALSE;
                    }
                }
            });
            Logging.i(str, "allocate openCamera result:" + bool);
            if (bool != null && bool.booleanValue()) {
                this.mVideoCaptureFormat = videoCaptureFormat;
                this.mCameraNativeOrientation = cameraInfo.orientation;
                this.mInvertDeviceOrientationReadings = cameraInfo.facing == 0;
                Logging.i(str, String.format(locale, "allocate: Rotation dev=%d, cam=%d, facing back? %s", Integer.valueOf(getDeviceRotation()), Integer.valueOf(this.mCameraNativeOrientation), Boolean.valueOf(this.mInvertDeviceOrientationReadings)));
                try {
                    parameters = getCameraParameters();
                } catch (RuntimeException e10) {
                    Logging.e(TAG, "failed to get camera parameters for " + this.mId, e10);
                    parameters = null;
                }
                if (parameters == null) {
                    Logging.e(TAG, "failed to get camera parameters");
                    releaseCamera();
                    return false;
                }
                List<VideoCaptureFormat> formatsFromParemeters = getFormatsFromParemeters(parameters, IMAGE_FORMAT);
                if (formatsFromParemeters == null) {
                    return false;
                }
                String str2 = TAG;
                Logging.i(str2, "format list: " + Arrays.toString(formatsFromParemeters.toArray()));
                VideoCaptureFormat FindBestMatchedCapability = VideoCapture.FindBestMatchedCapability(formatsFromParemeters, videoCaptureFormat);
                this.mCaptureFormat = FindBestMatchedCapability;
                if (FindBestMatchedCapability == null) {
                    Logging.e(str2, "failed to match capability");
                    releaseCamera();
                    return false;
                }
                int i12 = FindBestMatchedCapability.mFramerate;
                if (this.mParameter.camera1FpsRange || !this.mPQFirst) {
                    setPreviewFrameRateMode(parameters, i12, this.mPQFirst);
                } else {
                    setPreviewFrameRateModePQ(parameters, i12);
                }
                List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                try {
                    try {
                        if (supportedFocusModes != null && this.mCameraFocusMode != 0) {
                            Logging.i(str2, "supported focusModes: " + Arrays.toString(supportedFocusModes.toArray()));
                            if (supportedFocusModes.contains("continuous-video") && ((i11 = this.mCameraFocusMode) == 2 || i11 == 1)) {
                                parameters.setFocusMode("continuous-video");
                                Logging.i(str2, "Continuous focus mode continuous video.");
                            } else if (supportedFocusModes.contains("continuous-picture") && ((i10 = this.mCameraFocusMode) == 3 || i10 == 1)) {
                                parameters.setFocusMode("continuous-picture");
                                Logging.i(str2, "Continuous focus mode continuous picture.");
                            } else if (supportedFocusModes.contains("auto") && this.mCameraFocusMode == 1) {
                                parameters.setFocusMode("auto");
                                Logging.i(str2, "Continuous focus mode auto.");
                            } else {
                                Logging.i(str2, "Continuous focus mode not supported.");
                            }
                            z10 = true;
                            if (this.mSkipControl == 1 && parameters.getSupportedFocusModes().contains("continuous-video")) {
                                parameters.setFocusMode("continuous-video");
                                z10 = true;
                            } else {
                                Logging.i(str2, "Continuous focus mode not supported.");
                            }
                            supportedWhiteBalance = parameters.getSupportedWhiteBalance();
                            if (supportedWhiteBalance != null) {
                                Logging.i(str2, "Camera " + this.mId + "supports white balance: " + Arrays.toString(supportedWhiteBalance.toArray()));
                                if (this.mParameter.autoWhiteBalance && supportedWhiteBalance.contains("auto")) {
                                    parameters.setWhiteBalance("auto");
                                    z11 = true;
                                    VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
                                    parameters.setPreviewSize(videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight);
                                    parameters.setPreviewFormat(this.mCaptureFormat.mPixelFormat);
                                    if (!z10 && z11) {
                                        setParameterWithTracking(parameters, ParameterType.FOCUS_MODE, ParameterType.WHITE_BALANCE);
                                    } else if (z10) {
                                        setParameterWithTracking(parameters, ParameterType.FOCUS_MODE);
                                    } else if (z11) {
                                        setParameterWithTracking(parameters, ParameterType.WHITE_BALANCE);
                                    } else {
                                        this.mCamera.setParameters(parameters);
                                    }
                                    ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
                                    VideoCaptureFormat videoCaptureFormat3 = this.mCaptureFormat;
                                    iSurfaceTextureHelper.setTextureSize(videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight);
                                    this.mCamera.setPreviewTexture(this.mSurfaceTextureHelper.getSurfaceTexture());
                                    CrErrorCallback crErrorCallback = new CrErrorCallback();
                                    notifyInjector(crErrorCallback);
                                    this.mCamera.setErrorCallback(crErrorCallback);
                                    if (!this.mCaptureToTexture) {
                                        VideoCaptureFormat videoCaptureFormat4 = this.mCaptureFormat;
                                        this.mExpectedFrameSize = ((videoCaptureFormat4.mWidth * videoCaptureFormat4.mHeight) * ImageFormat.getBitsPerPixel(videoCaptureFormat4.mPixelFormat)) / 8;
                                        for (int i13 = 0; i13 < 3; i13++) {
                                            this.mCamera.addCallbackBuffer(new byte[this.mExpectedFrameSize]);
                                        }
                                    }
                                    this.mCamera.setDisplayOrientation(0);
                                    return true;
                                }
                            }
                            z11 = false;
                            VideoCaptureFormat videoCaptureFormat22 = this.mCaptureFormat;
                            parameters.setPreviewSize(videoCaptureFormat22.mWidth, videoCaptureFormat22.mHeight);
                            parameters.setPreviewFormat(this.mCaptureFormat.mPixelFormat);
                            if (!z10) {
                            }
                            if (z10) {
                            }
                            ISurfaceTextureHelper iSurfaceTextureHelper2 = this.mSurfaceTextureHelper;
                            VideoCaptureFormat videoCaptureFormat32 = this.mCaptureFormat;
                            iSurfaceTextureHelper2.setTextureSize(videoCaptureFormat32.mWidth, videoCaptureFormat32.mHeight);
                            this.mCamera.setPreviewTexture(this.mSurfaceTextureHelper.getSurfaceTexture());
                            CrErrorCallback crErrorCallback2 = new CrErrorCallback();
                            notifyInjector(crErrorCallback2);
                            this.mCamera.setErrorCallback(crErrorCallback2);
                            if (!this.mCaptureToTexture) {
                            }
                            this.mCamera.setDisplayOrientation(0);
                            return true;
                        }
                        ISurfaceTextureHelper iSurfaceTextureHelper22 = this.mSurfaceTextureHelper;
                        VideoCaptureFormat videoCaptureFormat322 = this.mCaptureFormat;
                        iSurfaceTextureHelper22.setTextureSize(videoCaptureFormat322.mWidth, videoCaptureFormat322.mHeight);
                        this.mCamera.setPreviewTexture(this.mSurfaceTextureHelper.getSurfaceTexture());
                        CrErrorCallback crErrorCallback22 = new CrErrorCallback();
                        notifyInjector(crErrorCallback22);
                        this.mCamera.setErrorCallback(crErrorCallback22);
                        if (!this.mCaptureToTexture) {
                        }
                        this.mCamera.setDisplayOrientation(0);
                        return true;
                    } catch (IOException e11) {
                        Logging.e(TAG, "allocate: " + e11);
                        releaseCamera();
                        return false;
                    } catch (Exception e12) {
                        Logging.e(TAG, "allocate: " + e12);
                        releaseCamera();
                        return false;
                    }
                    if (!z10) {
                    }
                    if (z10) {
                    }
                } catch (Exception e13) {
                    Logging.e(TAG, "setParameters: " + e13);
                    releaseCamera();
                }
                z10 = false;
                if (this.mSkipControl == 1) {
                }
                Logging.i(str2, "Continuous focus mode not supported.");
                supportedWhiteBalance = parameters.getSupportedWhiteBalance();
                if (supportedWhiteBalance != null) {
                }
                z11 = false;
                VideoCaptureFormat videoCaptureFormat222 = this.mCaptureFormat;
                parameters.setPreviewSize(videoCaptureFormat222.mWidth, videoCaptureFormat222.mHeight);
                parameters.setPreviewFormat(this.mCaptureFormat.mPixelFormat);
            }
            return false;
        } catch (Exception e14) {
            Logging.e(TAG, "allocate: " + e14);
            return false;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        String str = TAG;
        Logging.i(str, "deallocate()");
        stopCaptureAndBlockUntilStopped();
        Handler handler = this.mProxyThreadHandler;
        if (handler == null) {
            Logging.w(str, "proxyThread unavailable");
        } else {
            handler.post(new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (VideoCaptureCamera1.this.mCamera != null) {
                            synchronized (EglBase.lock) {
                                VideoCaptureCamera1.this.mCamera.setPreviewTexture(null);
                            }
                        }
                    } catch (Exception e10) {
                        Logging.e(VideoCaptureCamera1.TAG, "deallocate: failed to setPreviewTexture " + e10);
                    }
                    VideoCaptureCamera1.this.mCaptureFormat = null;
                }
            });
            releaseCamera();
        }
    }

    public Camera.Parameters getCameraParameters() {
        if (this.mCamera == null) {
            return null;
        }
        try {
            Camera.Parameters parameters = cameraParametersMaps.get(Integer.valueOf(this.mId));
            if (parameters != null) {
                return parameters;
            }
            Camera.Parameters parameters2 = this.mCamera.getParameters();
            cameraParametersMaps.put(Integer.valueOf(this.mId), parameters2);
            return parameters2;
        } catch (RuntimeException e10) {
            Logging.e(TAG, "getCameraParameters: Camera.getParameters: ", e10);
            if (this.mCamera != null) {
                safetyStopFaceDetection();
                releaseCamera();
            }
            return null;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public float getMaxZoom() {
        if (this.mCamera == null) {
            return -1.0f;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        int maxZoom = isZoomSupported(cameraParameters) ? cameraParameters.getMaxZoom() : 0;
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null || zoomRatios.size() <= maxZoom) {
            return -1.0f;
        }
        return zoomRatios.get(maxZoom).intValue() / 100.0f;
    }

    public int getModifiedParameterCount() {
        return this.mModifiedParameters.size();
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    @NonNull
    public VideoCapture.FramerateRange getSelectedFramerateRange() {
        Camera camera = this.mCamera;
        if (camera == null) {
            return new VideoCapture.FramerateRange(0, 0);
        }
        Camera.Parameters parameters = camera.getParameters();
        int i10 = parameters.getSupportedPreviewFpsRange().get(0)[0] > 1000 ? 1 : 1000;
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        return new VideoCapture.FramerateRange(iArr[0] * i10, iArr[1] * i10);
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    @NonNull
    public List<VideoCapture.FramerateRange> getSupportFramerateRanges() {
        ArrayList arrayList = new ArrayList();
        Camera camera = this.mCamera;
        if (camera != null) {
            List<int[]> supportedPreviewFpsRange = camera.getParameters().getSupportedPreviewFpsRange();
            int i10 = supportedPreviewFpsRange.get(0)[0] > 1000 ? 1 : 1000;
            for (int[] iArr : supportedPreviewFpsRange) {
                arrayList.add(new VideoCapture.FramerateRange(iArr[0] * i10, iArr[1] * i10));
            }
        }
        return arrayList;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isAutoFaceFocusSupported() {
        Camera.Parameters cameraParameters;
        return this.mCamera != null && (cameraParameters = getCameraParameters()) != null && cameraParameters.getMaxNumDetectedFaces() > 0 && cameraParameters.getMaxNumFocusAreas() > 0 && isSupported("auto", cameraParameters.getSupportedFocusModes());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isCameraExposureSupported() {
        Camera.Parameters cameraParameters;
        if (this.mCamera != null && (cameraParameters = getCameraParameters()) != null) {
            int minExposureCompensation = cameraParameters.getMinExposureCompensation();
            int maxExposureCompensation = cameraParameters.getMaxExposureCompensation();
            Logging.i(TAG, "isCameraExposureSupported compensation min: " + minExposureCompensation + " max: " + maxExposureCompensation);
            if (minExposureCompensation < 0 && maxExposureCompensation > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isExposureSupported() {
        Camera.Parameters cameraParameters;
        return (this.mCamera == null || (cameraParameters = getCameraParameters()) == null || cameraParameters.getMaxNumMeteringAreas() <= 0) ? false : true;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFaceDetectSupported() {
        Camera.Parameters cameraParameters;
        if (this.mCamera != null && (cameraParameters = getCameraParameters()) != null) {
            Logging.i(TAG, "face dedect, numDetectedFaces: " + cameraParameters.getMaxNumDetectedFaces());
            if (cameraParameters.getMaxNumDetectedFaces() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFocusSupported() {
        Camera.Parameters cameraParameters;
        return this.mCamera != null && (cameraParameters = getCameraParameters()) != null && cameraParameters.getMaxNumFocusAreas() > 0 && isSupported("auto", cameraParameters.getSupportedFocusModes());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isTorchSupported() {
        Camera.Parameters cameraParameters;
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return false;
        }
        return isSupported("torch", cameraParameters.getSupportedFlashModes());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isZoomSupported() {
        if (this.mCamera != null) {
            return isZoomSupported(getCameraParameters());
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean needFallback() {
        return false;
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraAvailable(String str) {
        if (str.equals(Integer.toString(this.mId))) {
            if (getCameraInfo(this.mId) == null) {
                Logging.e(TAG, "failed to get camera info for " + this.mId);
                return;
            }
            this.mPreviewBufferLock.lock();
            try {
                if (this.mIsRunning && this.mCameraErrorTrigger) {
                    this.mPreviewBufferLock.unlock();
                    onAvailable(0);
                    return;
                }
                Logging.i(TAG, "onCameraAvailable, Wrong state, mIsRunning: " + this.mIsRunning + " cameraError: " + this.mCameraErrorTrigger);
            } finally {
                this.mPreviewBufferLock.unlock();
            }
        }
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraUnavailable(String str) {
        if (str.equals(Integer.toString(this.mId))) {
            if (getCameraInfo(this.mId) == null) {
                Logging.e(TAG, "failed to get camera info for " + this.mId);
                return;
            }
            this.mPreviewBufferLock.lock();
            try {
                if (this.mIsRunning && this.mCameraErrorTrigger) {
                    this.mPreviewBufferLock.unlock();
                    onAvailable(1);
                    return;
                }
                Logging.i(TAG, "onCameraUnavailable, Wrong state, mIsRunning: " + this.mIsRunning + " cameraError: " + this.mCameraErrorTrigger);
            } finally {
                this.mPreviewBufferLock.unlock();
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAntiBandingMode(final int i10) {
        Integer num;
        Handler handler = this.mProxyThreadHandler;
        if (handler == null || (num = (Integer) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<Integer>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() {
                Camera.Parameters cameraParameters;
                Logging.i(VideoCaptureCamera1.TAG, "setAntiBandingMode:" + i10);
                String camera1ABMode = VideoCaptureCamera1.this.toCamera1ABMode(i10);
                if (VideoCaptureCamera1.this.mCamera == null || (cameraParameters = VideoCaptureCamera1.this.getCameraParameters()) == null) {
                    return -1;
                }
                if (!VideoCaptureCamera1.isSupported(camera1ABMode, cameraParameters.getSupportedAntibanding())) {
                    Logging.e(VideoCaptureCamera1.TAG, "not supported anti-banding = " + camera1ABMode);
                    return -1;
                }
                Logging.i(VideoCaptureCamera1.TAG, "AgoraVideo set anti-banding = " + camera1ABMode);
                cameraParameters.setAntibanding(camera1ABMode);
                try {
                    VideoCaptureCamera1.this.setParameterWithTracking(cameraParameters, ParameterType.ANTIBANDING);
                } catch (Exception e10) {
                    Logging.e(VideoCaptureCamera1.TAG, "anti banding got exception:" + e10);
                }
                return 0;
            }
        })) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAutoFaceFocus(boolean z10) {
        if (this.mEnableAutoFaceFocus == z10) {
            return 0;
        }
        this.mEnableAutoFaceFocus = z10;
        onFaceDetectionRequestChanged();
        return 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public void setCameraDropCount(int i10) {
        int i11;
        if (i10 < 0) {
            this.dropCount = 0;
        }
        VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
        if (videoCaptureFormat != null && i10 > (i11 = videoCaptureFormat.mFramerate)) {
            this.dropCount = i11;
        }
        this.dropCount = i10;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setEdgeEnhanceMode(int i10) {
        Logging.e(TAG, "EdgeEnhancement not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposure(float f10, float f11) {
        if (this.mCamera == null || this.mRenderView.getWidth() == 0 || this.mRenderView.getHeight() == 0) {
            float[] fArr = this.mCameraExposurePositions;
            fArr[0] = f10;
            fArr[1] = f11;
            return 0;
        }
        if (this.mIsmCameraExposureStarted && Math.abs(this.mCameraExposurePositions[0] - f10) < 0.1d && Math.abs(this.mCameraExposurePositions[1] - f11) < 0.1d) {
            return 0;
        }
        float[] fArr2 = this.mCameraExposurePositions;
        fArr2[0] = f10;
        fArr2[1] = f11;
        String str = TAG;
        Logging.i(str, "setExposure called camera api1 x = " + f10 + " y = " + f11);
        if (f10 < 0.0f || f10 > this.mRenderView.getWidth() || f11 < 0.0f || f11 > this.mRenderView.getHeight()) {
            Logging.i(str, "setExposure unreasonable inputs!");
            return -1;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        this.mPreviewParameters = cameraParameters;
        if (cameraParameters == null || cameraParameters.getPreviewSize() == null) {
            return -1;
        }
        RectF rectF = new RectF(f10, f11, f10, f11);
        int width = this.mRenderView.getWidth();
        int height = this.mRenderView.getHeight();
        int i10 = this.mPreviewParameters.getPreviewSize().width;
        int i11 = this.mPreviewParameters.getPreviewSize().height;
        int i12 = this.mId;
        RectF viewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i10, i11, i12 == 1, (i12 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
        if (viewToNormalized == null) {
            Logging.w(str, "Failed to translate input coordinate");
            return -1;
        }
        Rect calculateFocusArea = CoordinatesTransform.calculateFocusArea(viewToNormalized.left, viewToNormalized.top, 1.5f);
        if (this.mCamera != null) {
            Camera.Parameters cameraParameters2 = getCameraParameters();
            if (cameraParameters2 == null) {
                Logging.d(str, "getCameraParameters null");
                return -1;
            }
            if (cameraParameters2.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(calculateFocusArea, 800));
                cameraParameters2.setMeteringAreas(arrayList);
            } else {
                Logging.i(str, "metering areas not supported");
            }
            try {
                setParameterWithTracking(cameraParameters2, ParameterType.METERING_AREAS);
                this.mIsmCameraExposureStarted = true;
            } catch (Exception e10) {
                Logging.i(TAG, "setExposure failed, " + e10);
                return -1;
            }
        }
        RectF cameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(calculateFocusArea));
        if (cameraToNormalized == null) {
            Logging.e(str, "Failed to translate input coordinate");
            return -1;
        }
        VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
        int i13 = videoCaptureFormat.mWidth;
        int i14 = videoCaptureFormat.mHeight;
        RectF normalizedToSensor = CoordinatesTransform.normalizedToSensor(cameraToNormalized, i13, i14, i13, i14, 0, false);
        if (normalizedToSensor == null) {
            Logging.e(str, "Failed to translate input coordinate");
            return -1;
        }
        normalizedToSensor.round(calculateFocusArea);
        Rect rect = new Rect();
        RectF rectF2 = new RectF(calculateFocusArea);
        int width2 = this.mCaptureFormat.getWidth();
        int height2 = this.mCaptureFormat.getHeight();
        VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
        RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF2, width2, height2, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, false);
        int width3 = this.mRenderView.getWidth();
        int height3 = this.mRenderView.getHeight();
        int width4 = this.mCaptureFormat.getWidth();
        int height4 = this.mCaptureFormat.getHeight();
        int i15 = this.mId;
        RectF normalizedToView = CoordinatesTransform.normalizedToView(sensorToNormalized, width3, height3, width4, height4, i15 == 1, (i15 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
        if (normalizedToView == null) {
            Logging.w(str, "failed to translate coordinate from normalized to view!");
            return -1;
        }
        normalizedToView.round(rect);
        notifyCameraExposureAreaChanged(rect);
        return 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposureCompensation(int i10) {
        if (this.mCamera == null) {
            this.mCameraExposureCompensation = i10;
            return 0;
        }
        if (this.mIsExposureCompensationStarted && this.mCameraExposureCompensation == i10) {
            return 0;
        }
        this.mCameraExposureCompensation = i10;
        String str = TAG;
        Logging.i(str, "setExposureCompensation:" + i10);
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters == null) {
            return -1;
        }
        float exposureCompensationStep = cameraParameters.getExposureCompensationStep();
        int minExposureCompensation = cameraParameters.getMinExposureCompensation();
        int maxExposureCompensation = cameraParameters.getMaxExposureCompensation();
        Logging.i(str, "compensation step=" + exposureCompensationStep + ", min=" + minExposureCompensation + ", max=" + maxExposureCompensation + ", cur index=" + cameraParameters.getExposureCompensation());
        if (i10 <= maxExposureCompensation) {
            maxExposureCompensation = i10;
        }
        if (i10 >= minExposureCompensation) {
            minExposureCompensation = maxExposureCompensation;
        }
        cameraParameters.setExposureCompensation(minExposureCompensation);
        try {
            this.mIsExposureCompensationStarted = true;
            setParameterWithTracking(cameraParameters, ParameterType.EXPOSURE_COMPENSATION);
            int exposureCompensation = cameraParameters.getExposureCompensation();
            Logging.i(str, "cur index=" + exposureCompensation + ", ev=" + (exposureCompensationStep * exposureCompensation));
            return 0;
        } catch (Exception e10) {
            Logging.e(TAG, "exposure compensation got exception:" + e10);
            return -1;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFaceDetection(boolean z10) {
        Logging.i(TAG, "setFaceDetection:" + z10);
        if (this.mEnableFaceDetection == z10) {
            return 0;
        }
        this.mEnableFaceDetection = z10;
        onFaceDetectionRequestChanged();
        return 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFocus(float f10, float f11) {
        if (this.mCamera == null || this.mRenderView.getWidth() == 0 || this.mRenderView.getHeight() == 0) {
            float[] fArr = this.mCameraFocusPositions;
            fArr[0] = f10;
            fArr[1] = f11;
            return 0;
        }
        if (this.mIsmCameraFocusStarted && Math.abs(this.mCameraFocusPositions[0] - f10) < 0.1d && Math.abs(this.mCameraFocusPositions[1] - f11) < 0.1d) {
            return 0;
        }
        float[] fArr2 = this.mCameraFocusPositions;
        fArr2[0] = f10;
        fArr2[1] = f11;
        String str = TAG;
        Logging.i(str, "setFocus " + f10 + " - " + f11);
        if (f10 < 0.0f || f10 > this.mRenderView.getWidth() || f11 < 0.0f || f11 > this.mRenderView.getHeight()) {
            Logging.e(str, "set focus unreasonable inputs");
            return -1;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        this.mPreviewParameters = cameraParameters;
        if (cameraParameters != null && cameraParameters.getPreviewSize() != null) {
            if (f10 <= 1.0f && f11 <= 1.0f) {
                return setFocusByCustom(f10, f11);
            }
            RectF rectF = new RectF(f10, f11, f10, f11);
            int width = this.mRenderView.getWidth();
            int height = this.mRenderView.getHeight();
            int i10 = this.mPreviewParameters.getPreviewSize().width;
            int i11 = this.mPreviewParameters.getPreviewSize().height;
            int i12 = this.mId;
            RectF viewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i10, i11, i12 == 1, (i12 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
            if (viewToNormalized == null) {
                Logging.e(str, "Failed to translate input coordinate");
                return -1;
            }
            float f12 = viewToNormalized.left;
            float f13 = viewToNormalized.top;
            Rect calculateFocusArea = CoordinatesTransform.calculateFocusArea(f12, f13, 1.0f);
            Rect calculateFocusArea2 = CoordinatesTransform.calculateFocusArea(f12, f13, 1.5f);
            Log.w(str, "mCamera.autoFocus focusRect: " + calculateFocusArea + ", meteringRect: " + calculateFocusArea2);
            try {
                this.mCamera.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Logging.w(TAG, "Failed to cancle AutoFocus" + e10);
            }
            Camera.Parameters cameraParameters2 = getCameraParameters();
            if (cameraParameters2 == null) {
                return -1;
            }
            if (cameraParameters2.getMaxNumFocusAreas() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Camera.Area(calculateFocusArea, 800));
                cameraParameters2.setFocusAreas(arrayList);
            } else {
                Logging.w(TAG, "focus areas not supported");
            }
            if (cameraParameters2.getMaxNumMeteringAreas() > 0) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new Camera.Area(calculateFocusArea2, 800));
                cameraParameters2.setMeteringAreas(arrayList2);
            } else {
                Logging.w(TAG, "metering areas not supported");
            }
            RectF normalizedToSensor = CoordinatesTransform.normalizedToSensor(CoordinatesTransform.cameraToNormalized(new RectF(calculateFocusArea2)), this.mPreviewParameters.getPreviewSize().width, this.mPreviewParameters.getPreviewSize().height, this.mPreviewParameters.getPreviewSize().width, this.mPreviewParameters.getPreviewSize().height, 0, false);
            if (normalizedToSensor == null) {
                Logging.e(TAG, "Failed to translate input coordinate");
                return -1;
            }
            normalizedToSensor.round(calculateFocusArea2);
            final String focusMode = cameraParameters2.getFocusMode();
            if (isSupported("macro", cameraParameters2.getSupportedFocusModes())) {
                cameraParameters2.setFocusMode("macro");
                synchronized (this.mObjectLock) {
                    try {
                        setParameterWithTracking(cameraParameters2, ParameterType.FOCUS_AREAS, ParameterType.METERING_AREAS, ParameterType.FOCUS_MODE);
                    } catch (Exception e11) {
                        Logging.w(TAG, "mCamera.setParameters Exception: " + e11);
                    }
                }
            } else {
                Logging.w("focus", "FOCUS_MODE_MACRO is not supported");
            }
            try {
                this.mIsmCameraFocusStarted = true;
                this.mCamera.autoFocus(new Camera.AutoFocusCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.8
                    @Override // android.hardware.Camera.AutoFocusCallback
                    public void onAutoFocus(boolean z10, Camera camera) {
                        if (VideoCaptureCamera1.this.mCamera == null || VideoCaptureCamera.shouldSkipRefocus()) {
                            return;
                        }
                        try {
                            Camera.Parameters parameters = camera.getParameters();
                            parameters.setFocusMode(focusMode);
                            synchronized (VideoCaptureCamera1.this.mObjectLock) {
                                camera.setParameters(parameters);
                            }
                        } catch (Exception e12) {
                            Logging.w(VideoCaptureCamera1.TAG, "mCamera getParameters/setParameters Exception: " + e12);
                        }
                    }
                });
                Rect rect = new Rect();
                RectF rectF2 = new RectF(calculateFocusArea2);
                int width2 = this.mCaptureFormat.getWidth();
                int height2 = this.mCaptureFormat.getHeight();
                VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
                RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF2, width2, height2, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, false);
                int width3 = this.mRenderView.getWidth();
                int height3 = this.mRenderView.getHeight();
                int width4 = this.mCaptureFormat.getWidth();
                int height4 = this.mCaptureFormat.getHeight();
                int i13 = this.mId;
                RectF normalizedToView = CoordinatesTransform.normalizedToView(sensorToNormalized, width3, height3, width4, height4, i13 == 1, (i13 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
                if (normalizedToView == null) {
                    Logging.w(TAG, "failed to translate coordinate from normalized to view!");
                    return -1;
                }
                normalizedToView.round(rect);
                notifyCameraExposureAreaChanged(rect);
                RectF cameraToNormalized = CoordinatesTransform.cameraToNormalized(new RectF(calculateFocusArea));
                int width5 = this.mRenderView.getWidth();
                int height5 = this.mRenderView.getHeight();
                int width6 = this.mCaptureFormat.getWidth();
                int height6 = this.mCaptureFormat.getHeight();
                int i14 = this.mId;
                RectF normalizedToView2 = CoordinatesTransform.normalizedToView(cameraToNormalized, width5, height5, width6, height6, i14 == 1, (i14 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
                if (normalizedToView2 == null) {
                    Logging.w(TAG, "failed to translate coordinate from normalized to view!");
                    return -1;
                }
                normalizedToView2.round(rect);
                notifyCameraFocusAreaChanged(rect);
                return 0;
            } catch (Exception e12) {
                Logging.w(TAG, "mCamera.autoFocus Exception: " + e12);
            }
        }
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setNoiseReductionMode(int i10) {
        Logging.e(TAG, "NoiseReduction not supported in camera1 ");
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setTorchMode(boolean z10) {
        int i10 = z10 ? 1 : -1;
        if (this.mCamera == null) {
            this.mTorchMode = z10 ? 1 : -1;
            return 0;
        }
        if (this.mIsCameraTorchStarted && this.mTorchMode == i10) {
            return 0;
        }
        this.mTorchMode = i10;
        String str = TAG;
        Logging.i(str, "setTorchMode isOn: " + z10);
        Camera.Parameters cameraParameters = getCameraParameters();
        if (cameraParameters == null) {
            return -2;
        }
        List<String> supportedFlashModes = cameraParameters.getSupportedFlashModes();
        if (supportedFlashModes != null) {
            if (supportedFlashModes.contains("torch")) {
                Logging.w(str, "setTorchMode isFlashSupported: true");
                if (z10) {
                    cameraParameters.setFlashMode("torch");
                } else {
                    cameraParameters.setFlashMode("off");
                }
                try {
                    this.mIsCameraTorchStarted = true;
                    setParameterWithTracking(cameraParameters, ParameterType.FLASH_MODE);
                    return 0;
                } catch (Exception e10) {
                    String str2 = TAG;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("setTorchMode failed, mode: ");
                    sb2.append(z10 ? "torch" : "off");
                    sb2.append(", ");
                    sb2.append(e10);
                    Logging.w(str2, sb2.toString());
                    return -1;
                }
            }
        }
        Logging.w(str, "setTorchMode isFlashSupported: false");
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoEdgeMode(int i10) {
        Logging.w(TAG, "setVideoEdgeMode failure: " + i10);
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoStabilityMode(int i10) {
        Camera.Parameters cameraParameters;
        String str = TAG;
        Logging.w(str, "setVideoStabilityMode: " + i10);
        if (this.mCamera == null || (cameraParameters = getCameraParameters()) == null) {
            return -1;
        }
        if (!cameraParameters.isVideoStabilizationSupported()) {
            Logging.e(str, "not supported VideoStability Mode = " + i10);
            return -1;
        }
        if (i10 == 1) {
            cameraParameters.setVideoStabilization(true);
        } else if (i10 == 0) {
            cameraParameters.setVideoStabilization(false);
        }
        try {
            setParameterWithTracking(cameraParameters, ParameterType.VIDEO_STABILIZATION);
            return 0;
        } catch (Exception e10) {
            Logging.w(TAG, "setVideoStabilityMode failed, mode: " + i10 + ", " + e10);
            return -1;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setZoom(float f10) {
        if (this.mCamera == null) {
            this.mCameraZoomFactor = f10;
            return 0;
        }
        if (this.mIsmCameraZoomStarted && Math.abs(this.mCameraZoomFactor - f10) < 0.1d) {
            return 0;
        }
        this.mCameraZoomFactor = f10;
        Logging.i(TAG, "setCameraZoom api1 called zoomValue =" + f10);
        if (f10 < 0.0f) {
            return -1;
        }
        int i10 = (int) ((f10 * 100.0f) + 0.5f);
        List<Integer> zoomRatios = getZoomRatios();
        if (zoomRatios == null) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= zoomRatios.size()) {
                i11 = 0;
                break;
            }
            if (i10 <= zoomRatios.get(i11).intValue()) {
                break;
            }
            i11++;
        }
        Camera.Parameters cameraParameters = getCameraParameters();
        if (!isZoomSupported(cameraParameters)) {
            return -1;
        }
        if (i11 > cameraParameters.getMaxZoom()) {
            Logging.w(TAG, "zoom value is larger than maxZoom value");
            return -1;
        }
        cameraParameters.setZoom(i11);
        try {
            this.mIsmCameraZoomStarted = true;
            setParameterWithTracking(cameraParameters, ParameterType.ZOOM);
            return 0;
        } catch (Exception e10) {
            Logging.w(TAG, "setParameters failed, zoomLevel: " + i11 + ", " + e10);
            return -1;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        int i10;
        int i11;
        String str = TAG;
        Logging.i(str, "startCaptureMaybeAsync, use Texture: " + this.mCaptureToTexture);
        if (this.mCamera == null) {
            Logging.e(str, "startCaptureAsync: mCamera is null");
            return false;
        }
        if (this.mProxyThreadHandler == null) {
            Logging.w(str, "proxyThread unavailable");
            return false;
        }
        this.mPreviewBufferLock.lock();
        try {
            if (this.mIsRunning) {
                return true;
            }
            this.mPreviewBufferLock.unlock();
            if (this.mCaptureToTexture) {
                listenForTextureFrames();
            } else {
                listenForBytebufferFrames();
            }
            try {
                Boolean bool = (Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Boolean>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public Boolean call() {
                        try {
                            VideoCaptureCamera1.this.mCamera.startPreview();
                            Logging.i(VideoCaptureCamera1.TAG, "startCaptureMaybeAsync done.");
                            return Boolean.TRUE;
                        } catch (Exception e10) {
                            Logging.e(VideoCaptureCamera1.TAG, "startCaptureAsync: Camera.startPreview: " + e10);
                            return Boolean.FALSE;
                        }
                    }
                });
                if (bool != null && bool.booleanValue()) {
                    if (!this.mIsCameraTorchStarted && (i11 = this.mTorchMode) != 0) {
                        setTorchMode(i11 == 1);
                    }
                    if (!this.mIsmCameraExposureStarted) {
                        float[] fArr = this.mCameraExposurePositions;
                        float f10 = fArr[0];
                        if (f10 > 0.0f) {
                            float f11 = fArr[1];
                            if (f11 > 0.0f) {
                                setExposure(f10, f11);
                            }
                        }
                    }
                    if (!this.mIsmCameraFocusStarted) {
                        float[] fArr2 = this.mCameraFocusPositions;
                        float f12 = fArr2[0];
                        if (f12 > 0.0f) {
                            float f13 = fArr2[1];
                            if (f13 > 0.0f) {
                                setFocus(f12, f13);
                            }
                        }
                    }
                    if (!this.mIsmCameraZoomStarted) {
                        float f14 = this.mCameraZoomFactor;
                        if (f14 > 0.0f) {
                            setZoom(f14);
                        }
                    }
                    if (!this.mIsExposureCompensationStarted && (i10 = this.mCameraExposureCompensation) != 0) {
                        setExposureCompensation(i10);
                    }
                    boolean z10 = this.mParameter.faceFocusing;
                    if (z10) {
                        setAutoFaceFocus(z10);
                    }
                    onFaceDetectionRequestChanged();
                    this.mPreviewBufferLock.lock();
                    try {
                        onStarted();
                        this.mIsRunning = true;
                        this.mPreviewBufferLock.unlock();
                        if (ContextUtils.getApplicationContext() == null || this.mProxyThreadHandler == null) {
                            Logging.w(str, "context or proxyThread unavailable");
                            return true;
                        }
                        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
                        if (cameraManager != null) {
                            registerCameraAvailableCallback(cameraManager);
                        }
                        return true;
                    } finally {
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } finally {
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        String str = TAG;
        Logging.i(str, "stopCaptureAndBlockUntilStopped()");
        unRegisterAvailabilityCallback();
        if (this.mProxyThreadHandler == null) {
            Logging.w(str, "proxyThread unavailable");
            return;
        }
        this.mPreviewBufferLock.lock();
        try {
            if (!this.mIsRunning) {
                this.mPreviewBufferLock.unlock();
                ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.5
                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                        ISurfaceTextureHelper iSurfaceTextureHelper = videoCaptureCamera1.mSurfaceTextureHelper;
                        if (iSurfaceTextureHelper != null) {
                            videoCaptureCamera1.mSurfaceTextureHelper = null;
                            iSurfaceTextureHelper.stopListening();
                            iSurfaceTextureHelper.dispose();
                        }
                        return null;
                    }
                });
                if (this.mSurfaceTextureHelper != null) {
                    Logging.e(str, "waiting camera proxy thread disposing timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                    ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
                    this.mSurfaceTextureHelper = null;
                    iSurfaceTextureHelper.stopListening();
                    iSurfaceTextureHelper.dispose();
                    return;
                }
                return;
            }
            this.mIsRunning = false;
            this.mPreviewBufferLock.unlock();
            ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.5
                @Override // java.util.concurrent.Callable
                public Void call() {
                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                    ISurfaceTextureHelper iSurfaceTextureHelper2 = videoCaptureCamera1.mSurfaceTextureHelper;
                    if (iSurfaceTextureHelper2 != null) {
                        videoCaptureCamera1.mSurfaceTextureHelper = null;
                        iSurfaceTextureHelper2.stopListening();
                        iSurfaceTextureHelper2.dispose();
                    }
                    return null;
                }
            });
            if (this.mSurfaceTextureHelper != null) {
                Logging.e(str, "waiting camera proxy thread disposing timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                ISurfaceTextureHelper iSurfaceTextureHelper2 = this.mSurfaceTextureHelper;
                this.mSurfaceTextureHelper = null;
                iSurfaceTextureHelper2.stopListening();
                iSurfaceTextureHelper2.dispose();
            }
            this.mIsCameraTorchStarted = false;
            this.mIsmCameraExposureStarted = false;
            this.mIsmCameraFocusStarted = false;
            this.mIsmCameraZoomStarted = false;
            this.mIsExposureCompensationStarted = false;
            this.mProxyThreadHandler.post(new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.6
                @Override // java.lang.Runnable
                public void run() {
                    VideoCaptureCamera1.this.safetyStopFaceDetection();
                    try {
                        VideoCaptureCamera1.this.mCamera.cancelAutoFocus();
                    } catch (RuntimeException e10) {
                        Logging.e(VideoCaptureCamera1.TAG, "Failed to cancle AutoFocus", e10);
                    }
                }
            });
            try {
                ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.7
                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                        if (!videoCaptureCamera1.mCaptureToTexture) {
                            videoCaptureCamera1.mCamera.setPreviewCallbackWithBuffer(null);
                        }
                        try {
                            VideoCaptureCamera1.this.mCamera.stopPreview();
                            Logging.i(VideoCaptureCamera1.TAG, "stopPreview done!");
                        } catch (Exception e10) {
                            Logging.e(VideoCaptureCamera1.TAG, "stopPreview got exception:" + e10.toString());
                        }
                        return null;
                    }
                });
            } catch (Exception e10) {
                Logging.e(TAG, "stopPreview got exception:" + e10.toString());
            }
            Logging.i(TAG, "stopCaptureAndBlockUntilStopped() done");
        } catch (Throwable th2) {
            this.mPreviewBufferLock.unlock();
            ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera1.5
                @Override // java.util.concurrent.Callable
                public Void call() {
                    VideoCaptureCamera1 videoCaptureCamera1 = VideoCaptureCamera1.this;
                    ISurfaceTextureHelper iSurfaceTextureHelper22 = videoCaptureCamera1.mSurfaceTextureHelper;
                    if (iSurfaceTextureHelper22 != null) {
                        videoCaptureCamera1.mSurfaceTextureHelper = null;
                        iSurfaceTextureHelper22.stopListening();
                        iSurfaceTextureHelper22.dispose();
                    }
                    return null;
                }
            });
            if (this.mSurfaceTextureHelper != null) {
                Logging.e(TAG, "waiting camera proxy thread disposing timeout after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
                ISurfaceTextureHelper iSurfaceTextureHelper3 = this.mSurfaceTextureHelper;
                this.mSurfaceTextureHelper = null;
                iSurfaceTextureHelper3.stopListening();
                iSurfaceTextureHelper3.dispose();
            }
            throw th2;
        }
    }

    private boolean isZoomSupported(Camera.Parameters parameters) {
        if (parameters != null) {
            if (parameters.isZoomSupported()) {
                return true;
            }
            Logging.w(TAG, "camera zoom is not supported!");
        }
        return false;
    }
}
