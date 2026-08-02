package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import androidx.annotation.NonNull;
import io.agora.base.FaceDetectionInfo;
import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import io.agora.rtc2.video.VideoCapture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

@TargetApi(17)
/* loaded from: classes3.dex */
public abstract class VideoCaptureCamera extends VideoCapture implements IVideoCaptureCamera {
    static final int ANDROID_CAMERA_SKIP_CONTROL_AE = 1;
    static final int ANDROID_CAMERA_SKIP_CONTROL_AF = 2;
    static final int ANDROID_CAMERA_SKIP_CONTROL_DEFAULT = 0;
    protected static final int CAMERA_TEMPLATE_PREVIEW = 0;
    protected static final int CAMERA_TEMPLATE_RECORD = 1;
    protected static final int CAMERA_TORCH_DEFAULT = 0;
    protected static final int CAMERA_TORCH_DISENABLE = -1;
    protected static final int CAMERA_TORCH_ENABLE = 1;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_AUTO = 1;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_NONE = 0;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_PICTURE = 3;
    protected static final int CONTROL_VIDEO_FOCUS_MODE_VIDEO = 2;
    protected static final int CONTROL_VIDEO_STABILIZATION_MODE_OFF = 0;
    protected static final int CONTROL_VIDEO_STABILIZATION_MODE_ON = 1;
    protected static final int FOCAL_LENGTH_STEP = 6;
    protected static final int FOCAL_LENGTH_TYPE_SUPPORTED_OF_LOGICAL = 1;
    protected static final int FOCAL_LENGTH_TYPE_SUPPORTED_OF_PHYSICAL = 2;
    protected static final int FOCAL_LENGTH_TYPE_SUPPORTED_OF_ZOOM = 3;
    protected static final float FOCAL_LENGTH_ULTRA_WIDE_ANGLE_UPPER_LIMIT = 3.5f;
    protected static final float FOCAL_LENGTH_WIDE_ANGLE_UPPER_LIMIT = 2.4f;
    protected static int MAX_CAMERA_TIME_MS = 2000;
    protected static final int MAX_CAMERA_TIME_MS_LIMIT = 1000000;
    static final int PQ_FIRST_DIFF = 7;
    protected static final int SIZE_HEIGHT_OF_2K = 1440;
    protected static final int SIZE_WIDTH_OF_2K = 2560;
    private static final String TAG = "VideoCaptureCamera";
    private static int cameraSkipCapturHeight = 0;
    private static int cameraSkipCaptureWidth = 0;
    protected static boolean enableCameraCaptureRequestActiveDetect = false;
    protected static boolean mCustomStrictMode = false;
    protected static boolean mEnableRefocus = true;
    protected static boolean mEnableTargetFps = false;
    protected static int mLowFpsLimit;
    protected int dropCount;
    boolean isMirror;
    protected Rect lastFocusAreaRect;
    protected boolean mAutoFaceDetectFocusStarted;
    protected int mCamerEdgeEnhanceMode;
    protected int mCameraAntiBandingMode;
    protected CameraManager.AvailabilityCallback mCameraAvailableListener;
    protected int mCameraExposureCompensation;
    protected float[] mCameraExposurePositions;
    protected boolean mCameraExtraSurface;
    protected int mCameraFocusMode;
    protected float[] mCameraFocusPositions;
    protected int mCameraNoiseReduction;
    protected int mCameraNoiseReductionMode;
    protected int mCameraTemplateType;
    protected int mCameraVideoStabilityMode;
    protected float mCameraZoomFactor;
    protected final boolean mCaptureToTexture;
    protected int mCustomMaxFps;
    protected int mCustomMinFps;
    protected boolean mEnableAutoFaceFocus;
    protected boolean mEnableFaceDetection;
    protected final boolean mEnableTextureCopy;
    protected boolean mFirstVideoFrameCaptured;
    protected int mId;
    protected boolean mIsAntiBandingStarted;
    protected boolean mIsCameraTorchStarted;
    protected boolean mIsEdgeEnhanceStarted;
    protected boolean mIsExposureCompensationStarted;
    protected boolean mIsFaceDetectionStarted;
    protected boolean mIsNoiseReducationStarted;
    protected boolean mIsStabilityStarted;
    protected boolean mIsmCameraExposureStarted;
    protected boolean mIsmCameraFocusStarted;
    protected boolean mIsmCameraZoomStarted;
    protected int mPQFirstDiff;
    protected final VideoCaptureParameter mParameter;
    protected LinkedBlockingQueue<List<FaceDetectionInfo>> mPerFrameFaceDetectionInfoQueue;
    int mRenderMode;
    CaptureViewWeakRef mRenderView;
    protected final int mSkipControl;
    protected int mTorchMode;
    private static final String[] SIZE_HEIGHT_GT_720_BUGGY_DEVICE_LIST = {"Lenovo K520"};
    private static final String[] SIZE_HEIGHT_1440_BUGGY_DEVICE_LIST = {"PDBM00"};
    static final String[] REFOCUS_BUGGY_DEVICE_LIST = {"noh-al00"};

    public class CameraAvailabilityCallback extends CameraManager.AvailabilityCallback {
        public CameraAvailabilityCallback() {
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            super.onCameraAccessPrioritiesChanged();
            Logging.w(VideoCaptureCamera.TAG, "Camera Access Priorities Changed");
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public synchronized void onCameraAvailable(String str) {
            super.onCameraAvailable(str);
            Logging.i(VideoCaptureCamera.TAG, "onCameraAvailable: " + str);
            VideoCaptureCamera.this.onCameraAvailable(str);
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public synchronized void onCameraUnavailable(String str) {
            super.onCameraUnavailable(str);
            Logging.w(VideoCaptureCamera.TAG, "onCameraUnavailable: " + str);
            VideoCaptureCamera.this.onCameraUnavailable(str);
        }
    }

    public class CaptureViewWeakRef<V> extends WeakReference<View> {
        public CaptureViewWeakRef(View view) {
            super(view);
        }

        public int getHeight() {
            VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera.this.mCaptureFormat;
            return get() == null ? videoCaptureFormat == null ? 0 : videoCaptureFormat.mHeight : get().getHeight();
        }

        public int getWidth() {
            VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera.this.mCaptureFormat;
            return get() == null ? videoCaptureFormat == null ? 0 : videoCaptureFormat.mWidth : get().getWidth();
        }
    }

    public VideoCaptureCamera(int i10, long j10, boolean z10, boolean z11, int i11, boolean z12, int i12, EglBase.Context context, int i13, int i14, VideoCaptureParameter videoCaptureParameter) {
        super(j10, context, i11);
        boolean z13 = false;
        this.mEnableAutoFaceFocus = false;
        this.mEnableFaceDetection = false;
        this.mIsFaceDetectionStarted = false;
        this.mTorchMode = 0;
        this.mIsmCameraExposureStarted = false;
        this.mCameraExposurePositions = new float[]{-1.0f, -1.0f};
        this.mIsmCameraFocusStarted = false;
        this.mCameraFocusPositions = new float[]{-1.0f, -1.0f};
        this.mIsmCameraZoomStarted = false;
        this.mCameraZoomFactor = -1.0f;
        this.dropCount = 0;
        this.mCameraExposureCompensation = 0;
        this.mCameraNoiseReductionMode = 0;
        this.mCameraAntiBandingMode = 0;
        this.mCameraVideoStabilityMode = 0;
        this.mCamerEdgeEnhanceMode = 0;
        this.mFirstVideoFrameCaptured = false;
        this.mIsExposureCompensationStarted = false;
        this.mIsAntiBandingStarted = false;
        this.mIsEdgeEnhanceStarted = false;
        this.mIsStabilityStarted = false;
        this.mIsNoiseReducationStarted = false;
        this.mAutoFaceDetectFocusStarted = false;
        this.mPerFrameFaceDetectionInfoQueue = new LinkedBlockingQueue<>();
        this.mRenderView = new CaptureViewWeakRef(null);
        this.isMirror = false;
        this.mParameter = videoCaptureParameter;
        this.mId = i10;
        this.mPQFirst = z12;
        this.mSkipControl = i12;
        this.mCameraTemplateType = i13;
        this.mCameraFocusMode = i14;
        boolean z14 = z10 && this.mSurfaceTextureHelper != null;
        this.mCaptureToTexture = z14;
        if (z14 && z11) {
            z13 = true;
        }
        this.mEnableTextureCopy = z13;
        this.mCameraExtraSurface = videoCaptureParameter.extraSurface;
        this.mCameraNoiseReduction = videoCaptureParameter.noiseReduce;
        mEnableRefocus = videoCaptureParameter.enableRefocus;
        this.mPQFirstType = videoCaptureParameter.pqFirstCaptureMode;
        this.mPQFirstDiff = videoCaptureParameter.pqFirstDiff;
        mEnableTargetFps = videoCaptureParameter.enableTargetFps;
        mCustomStrictMode = videoCaptureParameter.customStrictMode;
        mLowFpsLimit = videoCaptureParameter.lowFpsLimit;
        this.mCustomMinFps = videoCaptureParameter.customMinFps;
        this.mCustomMaxFps = videoCaptureParameter.customMaxFps;
        if (Build.MODEL.toLowerCase().contains("redmi 4a")) {
            MAX_CAMERA_TIME_MS = 50000;
        }
        int i15 = videoCaptureParameter.cameraTimeout;
        if (i15 > 0 && i15 < 1000000) {
            MAX_CAMERA_TIME_MS = i15;
        }
        Logging.i(TAG, "VideoCaptureCamera info ,mId:" + this.mId + ",mPQFirst:" + this.mPQFirst + ",mCaptureToTexture:" + z14 + ",mCaptureTextureBufferCount:" + i11 + ",mEnableTextureCopy:" + z13 + " ,autoFaceDetect:" + videoCaptureParameter.faceFocusing);
    }

    public static void enableCameraCaptureRequestActiveDetect(boolean z10) {
        enableCameraCaptureRequestActiveDetect = z10;
    }

    public static VideoCapture.FramerateRange findBestFrameRateRange(@NonNull List<VideoCapture.FramerateRange> list, int i10, boolean z10, int i11, int i12, int i13, int i14) {
        if (list.isEmpty()) {
            return null;
        }
        String str = TAG;
        Logging.i(str, "findBestFrameRateRange " + list.toString());
        VideoCapture.FramerateRange findBestFrameRateRangePreferPQ = z10 ? (i13 <= 0 || i14 <= 0) ? findBestFrameRateRangePreferPQ(list, i10, i11, i12) : findBestFrameRateRangeCustomRange(list, i10, i13, i14) : findBestFrameRateRangePreferFPS(list, i10);
        if (findBestFrameRateRangePreferPQ != null) {
            return findBestFrameRateRangePreferPQ;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to find match fps in ");
        sb2.append(z10 ? "PQ" : " FPS");
        sb2.append(" first mode, try closest.");
        Logging.e(str, sb2.toString());
        return getClosestFramerateRange(list, i10);
    }

    private static VideoCapture.FramerateRange findBestFrameRateRangeCustomRange(@NonNull List<VideoCapture.FramerateRange> list, int i10, int i11, int i12) {
        int i13;
        int i14;
        int abs;
        int i15;
        int min = Math.min(i11, i10);
        Math.max(i12, i10);
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            VideoCapture.FramerateRange framerateRange = list.get(i16);
            if (mCustomStrictMode) {
                if (framerateRange.max == i12 && framerateRange.min == i11) {
                    Logging.i(TAG, "set fps, by customRange strictMode, find index: " + i16);
                    return framerateRange;
                }
            } else if (framerateRange.max >= i10 && i10 >= (i15 = framerateRange.min) && !overLowFpsLimit(i15)) {
                arrayList.add(Integer.valueOf(i16));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MAX_VALUE;
        int i19 = -1;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            int i20 = list.get(intValue).min;
            if (min >= i20 && (abs = Math.abs(i20 - min)) < i18) {
                i19 = intValue;
                i18 = abs;
            }
        }
        String str = TAG;
        Logging.i(str, "set fps, by customRange lower limit, find index: " + i19);
        if (i19 != -1) {
            VideoCapture.FramerateRange framerateRange2 = list.get(i19);
            if (mEnableTargetFps && (i14 = framerateRange2.max) != i10 && i10 >= framerateRange2.min && i10 <= i14) {
                framerateRange2.max = i10;
            }
            Logging.i(str, "set fps : " + framerateRange2.toString() + " to camera in custom range mode, request:" + i10);
            return framerateRange2;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int intValue2 = ((Integer) it2.next()).intValue();
            int abs2 = Math.abs(list.get(intValue2).min - min);
            if (abs2 < i17) {
                i19 = intValue2;
                i17 = abs2;
            }
        }
        String str2 = TAG;
        Logging.i(str2, "set fps, by customRange closet mode, find index: " + i19);
        if (i19 == -1) {
            return null;
        }
        VideoCapture.FramerateRange framerateRange3 = list.get(i19);
        if (mEnableTargetFps && (i13 = framerateRange3.max) != i10 && i10 >= framerateRange3.min && i10 <= i13) {
            framerateRange3.max = i10;
        }
        Logging.i(str2, "set fps : " + framerateRange3.toString() + " to camera in custom range mode, request:" + i10);
        return framerateRange3;
    }

    private static VideoCapture.FramerateRange findBestFrameRateRangePreferFPS(@NonNull List<VideoCapture.FramerateRange> list, int i10) {
        Collections.sort(list, new Comparator<VideoCapture.FramerateRange>() { // from class: io.agora.rtc2.video.VideoCaptureCamera.2
            @Override // java.util.Comparator
            public int compare(VideoCapture.FramerateRange framerateRange, VideoCapture.FramerateRange framerateRange2) {
                int i11 = framerateRange.min - framerateRange2.min;
                return i11 == 0 ? framerateRange.max - framerateRange2.max : i11;
            }
        });
        Logging.i(TAG, "sorted fps Ranges List order by min first:" + list.toString());
        for (VideoCapture.FramerateRange framerateRange : list) {
            if (framerateRange.min >= i10) {
                Logging.i(TAG, "set fps : " + framerateRange.toString() + " to camera in fps first mode, request:" + i10);
                return framerateRange;
            }
        }
        return null;
    }

    private static VideoCapture.FramerateRange findBestFrameRateRangePreferPQ(@NonNull List<VideoCapture.FramerateRange> list, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Collections.sort(list, new Comparator<VideoCapture.FramerateRange>() { // from class: io.agora.rtc2.video.VideoCaptureCamera.3
            @Override // java.util.Comparator
            public int compare(VideoCapture.FramerateRange framerateRange, VideoCapture.FramerateRange framerateRange2) {
                int i19 = framerateRange.max - framerateRange2.max;
                return i19 == 0 ? framerateRange.min - framerateRange2.min : i19;
            }
        });
        Logging.i(TAG, "sorted fps Ranges List order by max first:" + list.toString());
        if (i11 == 0) {
            for (VideoCapture.FramerateRange framerateRange : list) {
                if (framerateRange.max >= i10) {
                    Logging.i(TAG, "set fps : " + framerateRange.toString() + " to camera in PQ first mode, request:" + i10);
                    return framerateRange;
                }
            }
            return null;
        }
        int i19 = 0;
        if (i11 != 2) {
            int i20 = -1;
            int i21 = 0;
            while (true) {
                if (i19 >= list.size()) {
                    i19 = i20;
                    break;
                }
                VideoCapture.FramerateRange framerateRange2 = list.get(i19);
                if (framerateRange2.max >= i10 && i10 >= (i14 = framerateRange2.min) && !overLowFpsLimit(i14) && (i15 = i10 - framerateRange2.min) > i21) {
                    if (i15 >= i12) {
                        break;
                    }
                    i20 = i19;
                    i21 = i15;
                }
                i19++;
            }
            String str = TAG;
            Logging.i(str, "set fps, by pqFirst diff mode, find index: " + i19);
            if (i19 == -1) {
                return null;
            }
            VideoCapture.FramerateRange framerateRange3 = list.get(i19);
            if (mEnableTargetFps && (i13 = framerateRange3.max) != i10 && i10 >= framerateRange3.min && i10 <= i13) {
                framerateRange3.max = i10;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("set fps : ");
            sb2.append(framerateRange3.toString());
            sb2.append(" to camera in PQ first mode, ");
            sb2.append(mEnableTargetFps ? "by target fps " : " by full fps");
            sb2.append(", request:");
            sb2.append(i10);
            Logging.i(str, sb2.toString());
            return framerateRange3;
        }
        ArrayList arrayList = new ArrayList();
        int i22 = Integer.MAX_VALUE;
        int i23 = Integer.MAX_VALUE;
        for (int i24 = 0; i24 < list.size(); i24++) {
            VideoCapture.FramerateRange framerateRange4 = list.get(i24);
            if (framerateRange4.max >= i10 && i10 >= (i18 = framerateRange4.min) && !overLowFpsLimit(i18)) {
                int i25 = framerateRange4.min;
                if (i25 < i23) {
                    arrayList.clear();
                    arrayList.add(Integer.valueOf(i24));
                    i23 = i25;
                } else if (i25 == i23) {
                    arrayList.add(Integer.valueOf(i24));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Logging.i(TAG, "set fps, fps ranges contain target were found: " + arrayList.toString());
            int intValue = ((Integer) arrayList.get(0)).intValue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                VideoCapture.FramerateRange framerateRange5 = list.get(intValue2);
                int i26 = framerateRange5.max - framerateRange5.min;
                if (i26 < i22) {
                    intValue = intValue2;
                    i22 = i26;
                }
            }
            VideoCapture.FramerateRange framerateRange6 = list.get(intValue);
            if (mEnableTargetFps) {
                framerateRange6.max = i10;
            }
            Logging.i(TAG, "set fps : " + framerateRange6.toString() + " to camera in PQ first mode: " + i11 + ", request:" + i10);
            return framerateRange6;
        }
        String str2 = TAG;
        Logging.i(str2, "set fps, fps ranges not contain target: " + i10);
        Logging.i(str2, "set fps, by minimum limit mode, find index: -1");
        int i27 = -1;
        for (int i28 = 0; i28 < list.size(); i28++) {
            VideoCapture.FramerateRange framerateRange7 = list.get(i28);
            int i29 = framerateRange7.min;
            if (i10 < i29) {
                i17 = i29 - i10;
            } else {
                int i30 = framerateRange7.max;
                i17 = i10 > i30 ? i10 - i30 : 0;
            }
            if (i17 < i22) {
                i27 = i28;
                i22 = i17;
            }
        }
        if (i27 == -1) {
            return null;
        }
        VideoCapture.FramerateRange framerateRange8 = list.get(i27);
        if (mEnableTargetFps && (i16 = framerateRange8.max) != i10 && i10 >= framerateRange8.min && i10 <= i16) {
            framerateRange8.max = i10;
        }
        Logging.i(TAG, "set fps : " + framerateRange8 + " to camera in PQ first mode: " + i11 + ", request:" + i10);
        return framerateRange8;
    }

    public static VideoCapture.FramerateRange getClosestFramerateRange(List<VideoCapture.FramerateRange> list, final int i10) {
        return (VideoCapture.FramerateRange) Collections.min(list, new Comparator<VideoCapture.FramerateRange>() { // from class: io.agora.rtc2.video.VideoCaptureCamera.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            private int progressivePenalty(int i11, int i12, int i13, int i14) {
                return i11 < i12 ? i11 * i13 : (i13 * i12) + ((i11 - i12) * i14);
            }

            public int diff(VideoCapture.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, 8000, 1, 4) + progressivePenalty(Math.abs(i10 - framerateRange.max), MAX_FPS_DIFF_THRESHOLD, 1, 3);
            }

            @Override // java.util.Comparator
            public int compare(VideoCapture.FramerateRange framerateRange, VideoCapture.FramerateRange framerateRange2) {
                return diff(framerateRange) - diff(framerateRange2);
            }
        });
    }

    public static boolean overLowFpsLimit(int i10) {
        int i11 = mLowFpsLimit;
        return i11 > 0 && i10 < i11 * 1000;
    }

    public static void setCameraSkipCapturHeight(int i10) {
        cameraSkipCapturHeight = i10;
    }

    public static void setCameraSkipCaptureWidth(int i10) {
        cameraSkipCaptureWidth = i10;
    }

    public static void setCustomStrictMode(boolean z10) {
        mCustomStrictMode = z10;
    }

    public static void setEnableTargetFps(boolean z10) {
        mEnableTargetFps = z10;
    }

    public static void setLowFpsLimit(int i10) {
        mLowFpsLimit = i10;
    }

    public static boolean shouldExcludeSize(int i10, int i11) {
        if (i10 == cameraSkipCaptureWidth) {
            Logging.w(TAG, "camera capture skip width: " + i10);
            return true;
        }
        if (i11 == cameraSkipCapturHeight) {
            Logging.w(TAG, "camera capture skip height: " + i10);
            return true;
        }
        if (i11 > 720) {
            for (String str : SIZE_HEIGHT_GT_720_BUGGY_DEVICE_LIST) {
                if (str.contentEquals(Build.MODEL)) {
                    return true;
                }
            }
        }
        if (i10 > SIZE_WIDTH_OF_2K || i11 > SIZE_HEIGHT_OF_2K || i10 * i11 > 3686400) {
            for (String str2 : SIZE_HEIGHT_1440_BUGGY_DEVICE_LIST) {
                if (Build.MODEL.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean shouldSkipRefocus() {
        for (String str : REFOCUS_BUGGY_DEVICE_LIST) {
            if (Build.MODEL.toLowerCase().contains(str)) {
                return true;
            }
        }
        return !mEnableRefocus;
    }

    public void attachPerFrameMetaInfos(VideoFrame videoFrame) {
        ArrayList arrayList;
        if (this.mPerFrameFaceDetectionInfoQueue.isEmpty() || (arrayList = (ArrayList) this.mPerFrameFaceDetectionInfoQueue.poll()) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FaceDetectionInfo faceDetectionInfo = (FaceDetectionInfo) it.next();
            videoFrame.getMetaInfo().getCustomMetaInfo(FaceDetectionInfo.class.getSimpleName()).put(faceDetectionInfo.getId(), faceDetectionInfo);
        }
    }

    public VideoFrameMetaInfo getPerFrameMetaInfos() {
        ArrayList arrayList;
        VideoFrameMetaInfo videoFrameMetaInfo = new VideoFrameMetaInfo();
        if (!this.mPerFrameFaceDetectionInfoQueue.isEmpty() && (arrayList = (ArrayList) this.mPerFrameFaceDetectionInfoQueue.poll()) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FaceDetectionInfo faceDetectionInfo = (FaceDetectionInfo) it.next();
                videoFrameMetaInfo.getCustomMetaInfo(FaceDetectionInfo.class.getSimpleName()).put(faceDetectionInfo.getId(), faceDetectionInfo);
            }
        }
        return videoFrameMetaInfo;
    }

    @NonNull
    public abstract VideoCapture.FramerateRange getSelectedFramerateRange();

    @NonNull
    public abstract List<VideoCapture.FramerateRange> getSupportFramerateRanges();

    public boolean isEnableAutoFaceFocus() {
        return this.mEnableAutoFaceFocus;
    }

    public boolean isEnableFaceDetection() {
        return this.mEnableFaceDetection;
    }

    public boolean isFaceDetectionStarted() {
        return this.mIsFaceDetectionStarted;
    }

    public native void nativeNotifyCameraExposureAreaChanged(long j10, int i10, int i11, int i12, int i13);

    public native void nativeNotifyCameraFocusAreaChanged(long j10, int i10, int i11, int i12, int i13);

    public void notifyCameraExposureAreaChanged(Rect rect) {
        long j10 = this.mNativeVideoCaptureAndroid;
        if (j10 != 0) {
            VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
            nativeNotifyCameraExposureAreaChanged(j10, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, rect.left, rect.top);
        }
    }

    public void notifyCameraFocusAreaChanged(Rect rect) {
        long j10 = this.mNativeVideoCaptureAndroid;
        if (j10 != 0) {
            nativeNotifyCameraFocusAreaChanged(j10, rect.width(), rect.height(), rect.left, rect.top);
        }
    }

    public void notifyFaceDetection(int i10, int i11, ArrayList<RectF> arrayList, ArrayList<Double> arrayList2) {
        int size = arrayList.size();
        if (this.mNativeVideoCaptureAndroid == 0 || size <= 0) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 <= size - 1; i12++) {
            Rect rect = new Rect();
            arrayList.get(i12).round(rect);
            arrayList3.add(new FaceDetectionInfo(i12, rect, arrayList2.get(i12).doubleValue()));
        }
        this.mPerFrameFaceDetectionInfoQueue.offer(arrayList3);
    }

    public abstract void onCameraAvailable(String str);

    public abstract void onCameraUnavailable(String str);

    public void registerCameraAvailableCallback(CameraManager cameraManager) {
        if (ContextUtils.getApplicationContext() == null) {
            return;
        }
        if (cameraManager == null) {
            cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        }
        if (cameraManager != null && this.mCameraAvailableListener == null) {
            try {
                this.mCameraAvailableListener = new CameraAvailabilityCallback();
                Logging.i(TAG, "register CameraAvailablyCallback");
                cameraManager.registerAvailabilityCallback(this.mCameraAvailableListener, this.mProxyThreadHandler);
            } catch (RuntimeException e10) {
                Logging.w(TAG, "registerAvailabilityCallback error " + e10.getMessage());
            }
        }
    }

    public void setCameraProxyHandler() {
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera_ProxyThread");
        handlerThread.start();
        this.mProxyThreadHandler = new Handler(handlerThread.getLooper());
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public void setPreviewInfo(Object obj, boolean z10, int i10) {
        this.isMirror = z10;
        this.mRenderMode = i10;
        if (obj instanceof View) {
            this.mRenderView = new CaptureViewWeakRef((View) obj);
            Logging.i(TAG, "setPreviewInfo " + this.mRenderView.getWidth() + " x " + this.mRenderView.getHeight());
        } else {
            Logging.i(TAG, "setPreviewInfo ");
        }
        if (!this.mIsmCameraFocusStarted) {
            float[] fArr = this.mCameraFocusPositions;
            float f10 = fArr[0];
            if (f10 > 0.0f) {
                float f11 = fArr[1];
                if (f11 > 0.0f) {
                    setFocus(f10, f11);
                }
            }
        }
        if (this.mIsmCameraExposureStarted) {
            return;
        }
        float[] fArr2 = this.mCameraExposurePositions;
        float f12 = fArr2[0];
        if (f12 > 0.0f) {
            float f13 = fArr2[1];
            if (f13 > 0.0f) {
                setExposure(f12, f13);
            }
        }
    }

    public void unRegisterAvailabilityCallback() {
        if (this.mCameraAvailableListener == null || ContextUtils.getApplicationContext() == null) {
            return;
        }
        try {
            CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
            if (cameraManager == null) {
                cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
            }
            if (cameraManager == null) {
                return;
            }
            cameraManager.unregisterAvailabilityCallback(this.mCameraAvailableListener);
            this.mCameraAvailableListener = null;
            Logging.i(TAG, "unregister Camera AvailabilityCallback done.");
        } catch (RuntimeException e10) {
            Logging.w(TAG, "unregisterAvailabilityCallback error " + e10.getMessage());
        }
    }
}
