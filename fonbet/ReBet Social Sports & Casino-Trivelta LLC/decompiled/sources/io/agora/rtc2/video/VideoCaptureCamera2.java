package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.annotation.NonNull;
import com.facebook.hermes.intl.Constants;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.ISurfaceTextureHelper;
import io.agora.base.internal.video.SurfaceTextureHelper;
import io.agora.rtc2.video.VideoCapture;
import io.agora.rtc2.video.VideoCaptureFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import lb.C5444x;

@TargetApi(23)
/* loaded from: classes3.dex */
public class VideoCaptureCamera2 extends VideoCaptureCamera {
    private static final String[] AE_TARGET_FPS_RANGE_BUGGY_DEVICE_LIST = {"Pixel 3", "Pixel 3 XL", "SDM845"};
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_3 = 5;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_AUTO = -1;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_EXTERNAL = 2;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_FULL = 4;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_LEGACY = 1;
    static final int ANDROID_CAMERA_HARDWARE_LEVEL_LIMITED = 3;
    static final SparseIntArray ANDROID_CAMERA_HARDWARE_LEVEL_MAP;
    static final int ANDROID_CAMERA_HARDWARE_NOT_SUPPORT = Integer.MIN_VALUE;
    private static final SparseIntArray COLOR_TEMPERATURES_MAP;
    private static final float DEFAULT_VALUE = -1.0f;
    private static int IMAGE_FORMAT = 35;
    private static final String TAG = "VideoCaptureCamera2";
    private static final float ZOOM_UNSUPPORTED_DEFAULT_VALUE = 0.5f;
    static Map<String, CameraCharacteristics> cameraCharacteristicMaps = null;
    private static final long kNanosecondsPer100Microsecond = 100000;
    private static final double kNanosecondsPerSecond = 1.0E9d;
    static volatile String[] mCameraIds;
    private Range<Integer> mAeFpsRange;
    private CameraCaptureSession.CaptureCallback mAfCaptureCallback;
    private MeteringRectangle mAreaOfInterest;
    private CameraDevice mCameraDevice;
    private String mCameraId;
    private int mCameraState;
    private final Object mCameraStateLock;
    private Handler mCameraThreadHandler;
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;
    private int mColorTemperature;
    private Rect mCropRect;
    private float mCurrentFocusDistance;
    private int mExposureMode;
    private int mFaceDetectMode;
    private boolean mFaceDetectSupported;
    private int mFillLightMode;
    private int mFocusMode;
    private ImageReader mImageReader;
    private final Object mImageReaderLock;
    private int mIso;
    private long mLastExposureTimeNs;
    private float mLastZoomRatio;
    private float mMaxZoom;
    private Rect mNonScaleSrop;
    private String mPhysicalId;
    private CaptureRequest.Builder mPreviewRequestBuilder;
    private CameraCaptureSession mPreviewSession;
    private boolean mRedEyeReduction;
    private Rect mSensorRect;
    private Surface mSurface;
    private final Object mSwitchLock;
    private ThreadUtils.ThreadChecker mThreadChecker;
    private ThreadUtils.ConditionVariable mWaitForDeviceClosedConditionVariable;
    private ImageReader xiaomiReader;

    public static class CameraIdListTask implements Runnable {
        static String[] cameraIdList;
        final CountDownLatch countDown = new CountDownLatch(1);

        public String[] getCameraIdList() {
            try {
                new Thread(this).start();
                if (!ThreadUtils.awaitUninterruptibly(this.countDown, VideoCaptureCamera.MAX_CAMERA_TIME_MS)) {
                    Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras timeout");
                }
                String str = VideoCaptureCamera2.TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getCameraIdList() returning: ");
                String[] strArr = cameraIdList;
                sb2.append(strArr != null ? Integer.valueOf(strArr.length) : "null");
                Logging.i(str, sb2.toString());
                return cameraIdList;
            } catch (Exception e10) {
                Logging.e(VideoCaptureCamera2.TAG, "getCameraIdList Failed to create thread: " + e10);
                this.countDown.countDown();
                return cameraIdList;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    try {
                        try {
                            if (ContextUtils.getApplicationContext() == null) {
                                Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras error, context null");
                            } else {
                                CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
                                if (cameraManager == null) {
                                    Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras error, manager null");
                                } else {
                                    cameraIdList = cameraManager.getCameraIdList();
                                }
                            }
                        } catch (SecurityException e10) {
                            Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e10);
                        }
                    } catch (CameraAccessException e11) {
                        Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e11);
                    } catch (IllegalArgumentException e12) {
                        Logging.e(VideoCaptureCamera2.TAG, "getSystemService(Context.CAMERA_SERVICE): " + e12);
                    }
                } catch (AssertionError e13) {
                    Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e13);
                } catch (Exception e14) {
                    Logging.e(VideoCaptureCamera2.TAG, "getNumberOfCameras: getCameraIdList(): " + e14);
                }
            } finally {
                this.countDown.countDown();
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CameraState {
        public static final int CONFIGURING = 1;
        public static final int EVICTED = 3;
        public static final int OPENING = 0;
        public static final int STARTED = 2;
        public static final int STOPPED = 4;
        public static final int STOPPING = 5;
    }

    public class CrPreviewReaderListener implements ImageReader.OnImageAvailableListener {
        private CrPreviewReaderListener() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            String str;
            StringBuilder sb2;
            String str2;
            StringBuilder sb3;
            VideoCaptureCamera2 videoCaptureCamera2;
            VideoCaptureCamera2.this.updateRealCaptureFpsStatsOnFrameCaptured();
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            synchronized (VideoCaptureCamera2.this.mImageReaderLock) {
                Image image = null;
                try {
                    try {
                        if (!VideoCaptureCamera2.this.mFirstVideoFrameCaptured) {
                            Logging.i(VideoCaptureCamera2.TAG, "first video frame captured by camera2 yuv!");
                            VideoCaptureCamera2.this.mFirstVideoFrameCaptured = true;
                        }
                        videoCaptureCamera2 = VideoCaptureCamera2.this;
                    } catch (IllegalArgumentException e10) {
                        Logging.e(VideoCaptureCamera2.TAG, "acquireLatestImage():" + e10);
                        if (0 != 0) {
                            try {
                                image.close();
                            } catch (IllegalArgumentException e11) {
                                str2 = VideoCaptureCamera2.TAG;
                                sb3 = new StringBuilder();
                                sb3.append("Image Close():");
                                sb3.append(e11);
                                Logging.e(str2, sb3.toString());
                                return;
                            } catch (IllegalStateException e12) {
                                str = VideoCaptureCamera2.TAG;
                                sb2 = new StringBuilder();
                                sb2.append("Image Close():");
                                sb2.append(e12);
                                Logging.e(str, sb2.toString());
                                return;
                            }
                        }
                    } catch (IllegalStateException e13) {
                        Logging.e(VideoCaptureCamera2.TAG, "acquireLatestImage():" + e13);
                        if (0 != 0) {
                            try {
                                image.close();
                            } catch (IllegalArgumentException e14) {
                                str2 = VideoCaptureCamera2.TAG;
                                sb3 = new StringBuilder();
                                sb3.append("Image Close():");
                                sb3.append(e14);
                                Logging.e(str2, sb3.toString());
                                return;
                            } catch (IllegalStateException e15) {
                                str = VideoCaptureCamera2.TAG;
                                sb2 = new StringBuilder();
                                sb2.append("Image Close():");
                                sb2.append(e15);
                                Logging.e(str, sb2.toString());
                                return;
                            }
                        }
                    }
                    if (videoCaptureCamera2.dropCount > 0) {
                        Logging.d(VideoCaptureCamera2.TAG, "Should drop " + VideoCaptureCamera2.this.dropCount + " frames after start capture.");
                        VideoCaptureCamera2 videoCaptureCamera22 = VideoCaptureCamera2.this;
                        videoCaptureCamera22.dropCount = videoCaptureCamera22.dropCount - 1;
                    } else {
                        if (videoCaptureCamera2.mImageReader != null) {
                            Image acquireLatestImage = imageReader.acquireLatestImage();
                            if (acquireLatestImage == null) {
                                VideoCaptureCamera2.this.onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                                if (acquireLatestImage != null) {
                                    try {
                                        acquireLatestImage.close();
                                    } catch (IllegalArgumentException e16) {
                                        Logging.e(VideoCaptureCamera2.TAG, "Image Close():" + e16);
                                    } catch (IllegalStateException e17) {
                                        Logging.e(VideoCaptureCamera2.TAG, "Image Close():" + e17);
                                    }
                                }
                                return;
                            }
                            if (acquireLatestImage.getFormat() != 35 || acquireLatestImage.getPlanes().length != 3) {
                                Logging.e(VideoCaptureCamera2.TAG, "Unexpected image format: " + acquireLatestImage.getFormat() + " or #planes: " + acquireLatestImage.getPlanes().length);
                                throw new IllegalStateException();
                            }
                            if (imageReader.getWidth() != acquireLatestImage.getWidth() || imageReader.getHeight() != acquireLatestImage.getHeight()) {
                                Logging.e(VideoCaptureCamera2.TAG, "ImageReader size (" + imageReader.getWidth() + C5444x.f55808b + imageReader.getHeight() + ") did not match Image size (" + acquireLatestImage.getWidth() + C5444x.f55808b + acquireLatestImage.getHeight() + ")");
                                throw new IllegalStateException();
                            }
                            VideoCaptureCamera2.this.onI420FrameAvailable(acquireLatestImage.getPlanes()[0].getBuffer(), acquireLatestImage.getPlanes()[0].getRowStride(), acquireLatestImage.getPlanes()[1].getBuffer(), acquireLatestImage.getPlanes()[2].getBuffer(), acquireLatestImage.getPlanes()[1].getRowStride(), acquireLatestImage.getPlanes()[1].getPixelStride(), acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), VideoCaptureCamera2.this.getCameraRotation(), acquireLatestImage.getTimestamp(), VideoCaptureCamera2.this.getPerFrameMetaInfos());
                            try {
                                try {
                                    acquireLatestImage.close();
                                } catch (IllegalStateException e18) {
                                    str = VideoCaptureCamera2.TAG;
                                    sb2 = new StringBuilder();
                                    sb2.append("Image Close():");
                                    sb2.append(e18);
                                    Logging.e(str, sb2.toString());
                                    return;
                                }
                            } catch (IllegalArgumentException e19) {
                                str2 = VideoCaptureCamera2.TAG;
                                sb3 = new StringBuilder();
                                sb3.append("Image Close():");
                                sb3.append(e19);
                                Logging.e(str2, sb3.toString());
                                return;
                            }
                            return;
                        }
                        VideoCaptureCamera2.this.onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                    }
                } catch (Throwable th2) {
                    if (0 == 0) {
                        throw th2;
                    }
                    try {
                        image.close();
                        throw th2;
                    } catch (IllegalArgumentException e20) {
                        Logging.e(VideoCaptureCamera2.TAG, "Image Close():" + e20);
                        throw th2;
                    } catch (IllegalStateException e21) {
                        Logging.e(VideoCaptureCamera2.TAG, "Image Close():" + e21);
                        throw th2;
                    }
                }
            }
        }
    }

    public class CrPreviewSessionListener extends CameraCaptureSession.StateCallback {
        private CrPreviewSessionListener() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.i(VideoCaptureCamera2.TAG, "CrPreviewSessionListener.onClosed");
            VideoCaptureCamera2.this.mPreviewSession = null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.i(VideoCaptureCamera2.TAG, "CrPreviewSessionListener.onConfigureFailed");
            VideoCaptureCamera2.this.changeCameraStateAndNotify(4);
            VideoCaptureCamera2.this.mPreviewSession = null;
            VideoCaptureCamera2.this.onError(101, "Camera session configuration error");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.i(VideoCaptureCamera2.TAG, "CrPreviewSessionListener.onConfigured");
            VideoCaptureCamera2.this.mPreviewSession = cameraCaptureSession;
            try {
                if (VideoCaptureCamera2.this.mPreviewRequestBuilder != null && VideoCaptureCamera2.this.mPreviewSession != null) {
                    VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                    videoCaptureCamera2.requestFaceDetection(videoCaptureCamera2.mPreviewRequestBuilder, VideoCaptureCamera2.this.mFaceDetectMode);
                    VideoCaptureCamera2.this.mPreviewSession.setRepeatingRequest(VideoCaptureCamera2.this.mPreviewRequestBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, VideoCaptureCamera2.this.mCameraThreadHandler);
                }
                VideoCaptureCamera2 videoCaptureCamera22 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera22.mIsCameraTorchStarted && (i12 = videoCaptureCamera22.mTorchMode) != 0) {
                    videoCaptureCamera22.setTorchMode(i12 == 1);
                }
                VideoCaptureCamera2 videoCaptureCamera23 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera23.mIsmCameraExposureStarted) {
                    float[] fArr = videoCaptureCamera23.mCameraExposurePositions;
                    float f10 = fArr[0];
                    if (f10 > 0.0f) {
                        float f11 = fArr[1];
                        if (f11 > 0.0f) {
                            videoCaptureCamera23.setExposure(f10, f11);
                        }
                    }
                }
                VideoCaptureCamera2 videoCaptureCamera24 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera24.mIsmCameraFocusStarted) {
                    float[] fArr2 = videoCaptureCamera24.mCameraFocusPositions;
                    float f12 = fArr2[0];
                    if (f12 > 0.0f) {
                        float f13 = fArr2[1];
                        if (f13 > 0.0f) {
                            videoCaptureCamera24.setFocus(f12, f13);
                        }
                    }
                }
                VideoCaptureCamera2 videoCaptureCamera25 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera25.mIsmCameraZoomStarted) {
                    float f14 = videoCaptureCamera25.mCameraZoomFactor;
                    if (f14 > 0.0f) {
                        videoCaptureCamera25.setZoom(f14);
                    }
                }
                VideoCaptureCamera2 videoCaptureCamera26 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera26.mIsExposureCompensationStarted && (i11 = videoCaptureCamera26.mCameraExposureCompensation) != 0) {
                    videoCaptureCamera26.setExposureCompensation(i11);
                }
                VideoCaptureCamera2 videoCaptureCamera27 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera27.mIsNoiseReducationStarted && (i10 = videoCaptureCamera27.mCameraNoiseReduction) != 0) {
                    videoCaptureCamera27.setNoiseReductionMode(i10);
                }
                VideoCaptureCamera2 videoCaptureCamera28 = VideoCaptureCamera2.this;
                if (!videoCaptureCamera28.mAutoFaceDetectFocusStarted && (z10 = videoCaptureCamera28.mParameter.faceFocusing)) {
                    videoCaptureCamera28.setAutoFaceFocus(z10);
                }
                VideoCaptureCamera2.this.changeCameraStateAndNotify(2);
                VideoCaptureCamera2.this.onStarted();
            } catch (CameraAccessException e10) {
                Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest, by CameraAccessException: " + e10);
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (IllegalArgumentException e11) {
                Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest, by IllegalArgumentException: " + e11);
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (IllegalStateException e12) {
                Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest, by IllegalStateException: " + e12);
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (NoClassDefFoundError e13) {
                Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest, by NoClassDefFoundError: " + e13);
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            } catch (SecurityException e14) {
                Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest, by SecurityException: " + e14);
                VideoCaptureCamera2.this.onError(102, "Fail to setup capture session");
            }
        }
    }

    public class CrStateListener extends CameraDevice.StateCallback {
        public CrStateListener() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Logging.i(VideoCaptureCamera2.TAG, "cameraDevice closed");
            if (VideoCaptureCamera2.this.mPreviewSession != null) {
                VideoCaptureCamera2.this.mPreviewSession = null;
            }
            VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.open();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.e(VideoCaptureCamera2.TAG, "cameraDevice was closed unexpectedly");
            if (VideoCaptureCamera2.this.mCameraState == 4 || VideoCaptureCamera2.this.mCameraState == 3) {
                return;
            }
            if (VideoCaptureCamera2.this.mCameraDevice != null) {
                try {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                    VideoCaptureCamera2.this.mCameraDevice = null;
                    Logging.i(VideoCaptureCamera2.TAG, "CameraDevice close done!");
                } catch (IllegalStateException e10) {
                    Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close error", e10);
                } catch (Exception e11) {
                    Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close Exception error", e11);
                }
                VideoCaptureCamera2.this.mCameraDevice = null;
            }
            VideoCaptureCamera2.this.onError(6, "Camera disconnected");
            VideoCaptureCamera2.this.changeCameraStateAndNotify(3);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.e(VideoCaptureCamera2.TAG, "cameraDevice encountered an error, code: " + i10);
            int i11 = 4;
            if (VideoCaptureCamera2.this.mCameraState == 4 || VideoCaptureCamera2.this.mCameraState == 3) {
                return;
            }
            if (VideoCaptureCamera2.this.mCameraDevice != null) {
                try {
                    VideoCaptureCamera2.this.mCameraDevice.close();
                } catch (IllegalStateException e10) {
                    Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close error", e10);
                } catch (Exception e11) {
                    Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close Exception error", e11);
                }
                VideoCaptureCamera2.this.mCameraDevice = null;
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(3);
            String str = "Camera In Use";
            int i12 = 1;
            if (i10 != 1) {
                i12 = 2;
                if (i10 != 2) {
                    if (i10 == 3) {
                        str = "Camera disabled";
                        i11 = 3;
                    } else if (i10 != 4) {
                        i11 = 5;
                        if (i10 != 5) {
                            i11 = VideoCapture.AndroidVideoCaptureError.kCameraErrorRuntimeUnknown;
                            str = "Camera runtime erro";
                        } else {
                            str = "Camera service error";
                        }
                    } else {
                        str = "Camera device error";
                    }
                    VideoCaptureCamera2.this.onError(i11, str);
                }
            }
            i11 = i12;
            VideoCaptureCamera2.this.onError(i11, str);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            Logging.i(VideoCaptureCamera2.TAG, "CameraDevice.StateCallback onOpened");
            synchronized (VideoCaptureCamera2.this.mCameraStateLock) {
                if (VideoCaptureCamera2.this.mCameraState != 4 && VideoCaptureCamera2.this.mCameraState != 5) {
                    VideoCaptureCamera2.this.mCameraDevice = cameraDevice;
                    VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.close();
                    VideoCaptureCamera2.this.changeCameraStateAndNotify(1);
                    VideoCaptureCamera2.this.createPreviewObjectsAndStartPreviewOrFailWith(100);
                    return;
                }
                try {
                    Logging.w(VideoCaptureCamera2.TAG, "cameraDevice state error,  should manual close! mCameraState=" + VideoCaptureCamera2.this.mCameraState);
                    cameraDevice.close();
                } catch (IllegalStateException e10) {
                    Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close error", e10);
                }
            }
        }
    }

    public class StopCaptureTask implements Runnable {
        private StopCaptureTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCaptureCamera2.this.mThreadChecker.checkIsOnValidThread();
            if (VideoCaptureCamera2.this.mCameraDevice == null) {
                return;
            }
            try {
                VideoCaptureCamera2.this.mCameraDevice.close();
                VideoCaptureCamera2.this.mCameraDevice = null;
                Logging.i(VideoCaptureCamera2.TAG, "closeCamera in task done!");
            } catch (IllegalStateException e10) {
                Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close error in task.", e10);
            } catch (Exception e11) {
                Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close error in task. Exception error", e11);
            }
            VideoCaptureCamera2.this.changeCameraStateAndNotify(4);
            VideoCaptureCamera2.this.mCropRect = new Rect();
        }
    }

    public class TextureVideoSinkListener implements SurfaceTextureHelper.IVideoCapture {
        private TextureVideoSinkListener() {
        }

        @Override // io.agora.base.internal.video.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            VideoCaptureCamera2.this.updateRealCaptureFpsStatsOnFrameCaptured();
            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
            if (videoCaptureCamera2.dropCount > 0) {
                Logging.i(VideoCaptureCamera2.TAG, "Drop frames after restart capture. Left " + VideoCaptureCamera2.this.dropCount + " .");
                VideoCaptureCamera2 videoCaptureCamera22 = VideoCaptureCamera2.this;
                videoCaptureCamera22.dropCount = videoCaptureCamera22.dropCount - 1;
                return;
            }
            if (!videoCaptureCamera2.mFirstVideoFrameCaptured) {
                Logging.i(VideoCaptureCamera2.TAG, "first video frame captured by camera2 texture!");
                VideoCaptureCamera2.this.mFirstVideoFrameCaptured = true;
            }
            synchronized (VideoCaptureCamera2.this.mCameraStateLock) {
                try {
                    if (VideoCaptureCamera2.this.mCameraState != 2) {
                        Logging.w(VideoCaptureCamera2.TAG, "Camera state wrong. current state is " + VideoCaptureCamera2.this.mCameraState);
                        return;
                    }
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    if (buffer == null) {
                        onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DEFENSIVE_PROGRAMMING);
                        return;
                    }
                    VideoCaptureCamera2 videoCaptureCamera23 = VideoCaptureCamera2.this;
                    if (videoCaptureCamera23.mEnableTextureCopy && (buffer = ((SurfaceTextureHelper) videoCaptureCamera23.mSurfaceTextureHelper).textureCopy((VideoFrame.TextureBuffer) videoFrame.getBuffer())) == null) {
                        onFrameDropped(VideoCapture.AndroidVideoCaptureDropType.CAPTURER_DO_COPY_FAIL);
                        Logging.i(VideoCaptureCamera2.TAG, "[HWS] TextureVideoSinkListener copy frame error");
                        return;
                    }
                    VideoCaptureCamera2 videoCaptureCamera24 = VideoCaptureCamera2.this;
                    VideoFrame videoFrame2 = new VideoFrame(VideoCapture.createTextureBufferWithModifiedTransformMatrix((TextureBuffer) buffer, true ^ videoCaptureCamera24.mInvertDeviceOrientationReadings, -videoCaptureCamera24.mCameraNativeOrientation), VideoCaptureCamera2.this.getCameraRotation(), videoFrame.getTimestampNs());
                    VideoCaptureCamera2.this.attachPerFrameMetaInfos(videoFrame2);
                    VideoCaptureCamera2.this.onFrameCaptured(videoFrame2);
                    if (VideoCaptureCamera2.this.mEnableTextureCopy) {
                        buffer.release();
                    }
                    videoFrame2.release();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.agora.base.internal.video.SurfaceTextureHelper.IVideoCapture
        public void onFrameDropped(int i10) {
            VideoCaptureCamera2.super.onFrameDropped(i10);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        COLOR_TEMPERATURES_MAP = sparseIntArray;
        sparseIntArray.append(2850, 2);
        sparseIntArray.append(2950, 4);
        sparseIntArray.append(4250, 3);
        sparseIntArray.append(4600, 7);
        sparseIntArray.append(5000, 5);
        sparseIntArray.append(6000, 6);
        sparseIntArray.append(7000, 8);
        cameraCharacteristicMaps = new ConcurrentHashMap();
        mCameraIds = null;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        ANDROID_CAMERA_HARDWARE_LEVEL_MAP = sparseIntArray2;
        int i10 = Build.VERSION.SDK_INT;
        sparseIntArray2.append(2, 1);
        sparseIntArray2.append(0, 3);
        sparseIntArray2.append(1, 4);
        if (i10 >= 28) {
            sparseIntArray2.append(4, 2);
        }
        sparseIntArray2.append(3, 5);
    }

    public VideoCaptureCamera2(int i10, long j10, boolean z10, boolean z11, int i11, boolean z12, int i12, EglBase.Context context, int i13, VideoCaptureParameter videoCaptureParameter) {
        super(i10, j10, z10, z11, i11, z12, i12, context, i13, videoCaptureParameter.camera2FocusMode, videoCaptureParameter);
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.1
            private long mLastFocusedTs;

            private void addRegionsToCaptureRequestBuilder(CaptureRequest.Builder builder, MeteringRectangle[] meteringRectangleArr) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                builder.set(key, 2);
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
                builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                builder.set(key, 0);
                builder.set(key, 1);
            }

            private void notifyCameraFocusAreaChanged(Rect rect, Rect rect2) {
                RectF rectF = new RectF(rect2);
                int width = rect.width();
                int height = rect.height();
                VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera2.this.mCaptureFormat;
                RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF, width, height, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, true);
                int width2 = VideoCaptureCamera2.this.mRenderView.getWidth();
                int height2 = VideoCaptureCamera2.this.mRenderView.getHeight();
                int width3 = VideoCaptureCamera2.this.mCaptureFormat.getWidth();
                int height3 = VideoCaptureCamera2.this.mCaptureFormat.getHeight();
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                int i14 = videoCaptureCamera2.mId;
                RectF normalizedToView = CoordinatesTransform.normalizedToView(sensorToNormalized, width2, height2, width3, height3, i14 == 1, (i14 != 1 ? -1 : 1) * videoCaptureCamera2.getCameraRotation(), VideoCaptureCamera2.this.mRenderMode);
                if (normalizedToView == null) {
                    Logging.w(VideoCaptureCamera2.TAG, "Failed to translate coordinate from normalized to view!!");
                    return;
                }
                Rect rect3 = new Rect();
                normalizedToView.round(rect3);
                VideoCaptureCamera2.this.notifyCameraFocusAreaChanged(rect3);
            }

            private void notifyFaceDetection(Rect rect, Face[] faceArr) {
                double pow;
                double d10;
                ArrayList<RectF> arrayList = new ArrayList<>();
                ArrayList<Double> arrayList2 = new ArrayList<>();
                if (faceArr == null) {
                    return;
                }
                for (Face face : faceArr) {
                    RectF rectF = new RectF(face.getBounds());
                    int width = rect.width();
                    int height = rect.height();
                    VideoCaptureFormat videoCaptureFormat = VideoCaptureCamera2.this.mCaptureFormat;
                    RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF, width, height, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, true);
                    if (sensorToNormalized != null) {
                        if (VideoCaptureCamera2.this.mId == 1) {
                            pow = Math.pow(sensorToNormalized.width(), -0.958d);
                            d10 = 11.237d;
                        } else {
                            pow = Math.pow(sensorToNormalized.height(), -0.971d);
                            d10 = 14.719d;
                        }
                        arrayList2.add(Double.valueOf(pow * d10));
                        int width2 = VideoCaptureCamera2.this.mRenderView.getWidth();
                        int height2 = VideoCaptureCamera2.this.mRenderView.getHeight();
                        VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                        VideoCaptureFormat videoCaptureFormat2 = videoCaptureCamera2.mCaptureFormat;
                        int i14 = videoCaptureFormat2.mWidth;
                        int i15 = videoCaptureFormat2.mHeight;
                        int i16 = videoCaptureCamera2.mId;
                        RectF normalizedToView = CoordinatesTransform.normalizedToView(sensorToNormalized, width2, height2, i14, i15, i16 == 1, (i16 == 1 ? 1 : -1) * videoCaptureCamera2.getCameraRotation(), VideoCaptureCamera2.this.mRenderMode);
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
                VideoCaptureCamera2 videoCaptureCamera22 = VideoCaptureCamera2.this;
                VideoCaptureFormat videoCaptureFormat3 = videoCaptureCamera22.mCaptureFormat;
                videoCaptureCamera22.notifyFaceDetection(videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight, arrayList, arrayList2);
            }

            private void process(CaptureResult captureResult) {
                Face[] faceArr = (Face[]) captureResult.get(CaptureResult.STATISTICS_FACES);
                if (faceArr == null || faceArr.length <= 0) {
                    return;
                }
                if (System.currentTimeMillis() - this.mLastFocusedTs < 3000) {
                    if (faceArr[0].getScore() > 20) {
                        Rect rect = (Rect) captureResult.get(CaptureResult.SCALER_CROP_REGION);
                        Rect bounds = faceArr[0].getBounds();
                        if (bounds != null && !bounds.equals(VideoCaptureCamera2.this.lastFocusAreaRect)) {
                            notifyCameraFocusAreaChanged(rect, bounds);
                        }
                        VideoCaptureCamera2.this.lastFocusAreaRect = bounds;
                        return;
                    }
                    return;
                }
                if (faceArr[0].getScore() <= 50) {
                    return;
                }
                Rect clampFace = VideoCaptureCamera2.this.clampFace(faceArr[0].getBounds());
                if (clampFace.width() <= 0 || clampFace.height() <= 0) {
                    return;
                }
                addRegionsToCaptureRequestBuilder(VideoCaptureCamera2.this.mPreviewRequestBuilder, new MeteringRectangle[]{new MeteringRectangle(clampFace, 1000)});
                if (VideoCaptureCamera2.this.mCameraState != 2) {
                    return;
                }
                try {
                    Rect rect2 = (Rect) captureResult.get(CaptureResult.SCALER_CROP_REGION);
                    Logging.d(VideoCaptureCamera2.TAG, "cropRegion = " + rect2);
                    Logging.d(VideoCaptureCamera2.TAG, "capture size wxh = " + VideoCaptureCamera2.this.mCaptureFormat.getWidth() + " x " + VideoCaptureCamera2.this.mCaptureFormat.getHeight());
                    notifyCameraFocusAreaChanged(rect2, clampFace);
                    this.mLastFocusedTs = System.currentTimeMillis();
                } catch (Exception e10) {
                    Logging.e(VideoCaptureCamera2.TAG, "capture: " + e10);
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
                if (l10 != null) {
                    VideoCaptureCamera2.this.mLastExposureTimeNs = l10.longValue();
                }
                VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                if (videoCaptureCamera2.mEnableAutoFaceFocus && videoCaptureCamera2.isAutoFaceFocusSupported()) {
                    process(totalCaptureResult);
                }
                if (VideoCaptureCamera2.this.mEnableFaceDetection) {
                    notifyFaceDetection((Rect) totalCaptureResult.get(CaptureResult.SCALER_CROP_REGION), (Face[]) totalCaptureResult.get(CaptureResult.STATISTICS_FACES));
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                if (VideoCaptureCamera.enableCameraCaptureRequestActiveDetect && captureFailure.getReason() == 0 && VideoCaptureCamera2.this.mCameraState != 4 && VideoCaptureCamera2.this.mCameraState != 3) {
                    if (VideoCaptureCamera2.this.mCameraDevice != null) {
                        try {
                            VideoCaptureCamera2.this.mCameraDevice.close();
                            VideoCaptureCamera2.this.mCameraDevice = null;
                            Logging.i(VideoCaptureCamera2.TAG, "onCaptureFailed, CameraDevice close done!");
                        } catch (IllegalStateException e10) {
                            Logging.e(VideoCaptureCamera2.TAG, "onCaptureFailed, cameraDevice close error", e10);
                        } catch (Exception e11) {
                            Logging.e(VideoCaptureCamera2.TAG, "onCaptureFailed, cameraDevice close Exception error", e11);
                        }
                        VideoCaptureCamera2.this.mCameraDevice = null;
                    }
                    VideoCaptureCamera2.this.onError(6, "Camera disconnected");
                    VideoCaptureCamera2.this.changeCameraStateAndNotify(3);
                }
            }
        };
        this.mAfCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.2
            private void process(CaptureResult captureResult) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return;
                }
                if (4 == num.intValue() || 5 == num.intValue()) {
                    VideoCaptureCamera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    VideoCaptureCamera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    VideoCaptureCamera2.this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    try {
                        VideoCaptureCamera2.this.mPreviewSession.setRepeatingRequest(VideoCaptureCamera2.this.mPreviewRequestBuilder.build(), VideoCaptureCamera2.this.mCaptureCallback, VideoCaptureCamera2.this.mCameraThreadHandler);
                    } catch (CameraAccessException e10) {
                        Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e10);
                    } catch (IllegalArgumentException e11) {
                        Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e11);
                    } catch (IllegalStateException e12) {
                        Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e12);
                    } catch (NoClassDefFoundError e13) {
                        Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e13);
                    } catch (SecurityException e14) {
                        Logging.e(VideoCaptureCamera2.TAG, "setRepeatingRequest failed, error message : " + e14);
                    }
                }
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                process(totalCaptureResult);
            }

            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
            public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                process(captureResult);
            }
        };
        this.mSwitchLock = new Object();
        this.mCameraStateLock = new Object();
        this.mImageReaderLock = new Object();
        this.mWaitForDeviceClosedConditionVariable = new ThreadUtils.ConditionVariable();
        this.mCameraState = 4;
        this.mMaxZoom = 1.0f;
        this.mCropRect = new Rect();
        this.mFocusMode = 4;
        this.mCurrentFocusDistance = 1.0f;
        this.mExposureMode = 4;
        this.mColorTemperature = -1;
        this.mFillLightMode = 1;
        this.mLastZoomRatio = DEFAULT_VALUE;
        this.mSensorRect = null;
        this.mFaceDetectSupported = false;
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera2_CameraThread");
        handlerThread.start();
        if (videoCaptureParameter.physicalId >= 0) {
            this.mPhysicalId = videoCaptureParameter.physicalId + "";
        }
        this.mCameraThreadHandler = new Handler(handlerThread.getLooper());
        this.mThreadChecker = new ThreadUtils.ThreadChecker(handlerThread);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i10);
        if (cameraCharacteristics != null) {
            this.mMaxZoom = getMaxZoom(cameraCharacteristics);
        }
        int i14 = this.mSkipControl;
        if (i14 == 1) {
            this.mExposureMode = 1;
        }
        if (i14 == 2) {
            this.mFocusMode = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeCameraStateAndNotify(int i10) {
        Logging.i(TAG, "changeCameraStateAndNotify() " + i10);
        synchronized (this.mCameraStateLock) {
            this.mCameraState = i10;
            this.mCameraStateLock.notifyAll();
        }
    }

    private void configureCommonCaptureSettings(CaptureRequest.Builder builder) {
        int i10;
        int i11;
        this.mThreadChecker.checkIsOnValidThread();
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return;
        }
        int i12 = this.mFocusMode;
        if (i12 == 4) {
            if (isSupportedFocusMode(cameraCharacteristics, 3) && ((i11 = this.mCameraFocusMode) == 2 || i11 == 1)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            } else if (isSupportedFocusMode(cameraCharacteristics, 4) && ((i10 = this.mCameraFocusMode) == 3 || i10 == 1)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 4);
            }
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        } else if (i12 == 2) {
            builder.set(CaptureRequest.CONTROL_AF_MODE, 0);
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(1.0f / this.mCurrentFocusDistance));
        }
        int i13 = this.mExposureMode;
        if (i13 == 1 || i13 == 2) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 0);
            long j10 = this.mLastExposureTimeNs;
            if (j10 != 0) {
                builder.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(j10 / kNanosecondsPer100Microsecond));
            } else {
                Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE);
                builder.set(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf((((Long) range.getLower()).longValue() + ((((Long) range.getUpper()).longValue() + ((Long) range.getLower()).longValue()) / 2)) / kNanosecondsPer100Microsecond));
            }
        } else {
            builder.set(CaptureRequest.CONTROL_MODE, 1);
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            if (!shouldSkipSettingAeTargetFpsRange()) {
                builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.mAeFpsRange);
            }
        }
        if (this.mIsCameraTorchStarted) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mExposureMode == 4 ? 1 : 0));
            builder.set(CaptureRequest.FLASH_MODE, 2);
        } else {
            int i14 = this.mFillLightMode;
            if (i14 == 1) {
                builder.set(CaptureRequest.FLASH_MODE, 0);
            } else if (i14 == 2) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.mRedEyeReduction ? 4 : 2));
            } else if (i14 == 3) {
                builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
                builder.set(CaptureRequest.FLASH_MODE, 1);
            }
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
        }
        int i15 = this.mColorTemperature;
        if (i15 > 0) {
            int closestWhiteBalance = getClosestWhiteBalance(i15, (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES));
            Logging.d(TAG, String.format(Locale.US, " Color temperature (%d ==> %d)", Integer.valueOf(this.mColorTemperature), Integer.valueOf(closestWhiteBalance)));
            if (closestWhiteBalance != -1) {
                builder.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(closestWhiteBalance));
            }
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null || iArr.length <= 0) {
            Logging.i(TAG, "Camera " + this.mCameraId + " does not support white balance");
        } else {
            Logging.i(TAG, "Camera " + this.mCameraId + " supports white balance, " + Arrays.toString(iArr));
            if (this.mParameter.autoWhiteBalance && isSupported(1, iArr)) {
                builder.set(CaptureRequest.CONTROL_AWB_MODE, 1);
            }
        }
        MeteringRectangle meteringRectangle = this.mAreaOfInterest;
        if (meteringRectangle != null) {
            MeteringRectangle[] meteringRectangleArr = {meteringRectangle};
            Logging.i(TAG, String.format(Locale.US, "Area of interest %s", meteringRectangle.toString()));
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr);
            builder.set(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr);
        }
        if (!this.mCropRect.isEmpty()) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, this.mCropRect);
        }
        int i16 = this.mIso;
        if (i16 > 0) {
            builder.set(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf(i16));
        }
    }

    @Deprecated
    private boolean createBufferPreviewObjectsAndStartPreview() {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mCameraDevice == null) {
            return false;
        }
        synchronized (this.mImageReaderLock) {
            this.mImageReader = ImageReader.newInstance(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), this.mCaptureFormat.getPixelFormat(), 2);
            try {
                this.mImageReader.setOnImageAvailableListener(new CrPreviewReaderListener(), this.mCameraThreadHandler);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "setOnImageAvailableListener error", e10);
            }
        }
        return createPreviewObjectsAndStartPreview(this.mImageReader.getSurface());
    }

    private int createCaptureRequest() {
        try {
            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, null);
            return 0;
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "setRepeatingRequest: ", e10);
            return -1;
        } catch (IllegalArgumentException e11) {
            Logging.e(TAG, "setRepeatingRequest: ", e11);
            return -2;
        } catch (IllegalStateException e12) {
            Logging.e(TAG, "capture:" + e12);
            return -4;
        } catch (NoClassDefFoundError unused) {
            return -1;
        } catch (SecurityException e13) {
            Logging.e(TAG, "setRepeatingRequest: ", e13);
            return -3;
        }
    }

    private boolean createPreviewObjectsAndStartPreview(Surface surface) {
        ImageReader newInstance;
        List<Surface> asList;
        boolean z10;
        int i10;
        int i11;
        int i12;
        try {
            int i13 = this.mCameraTemplateType == 0 ? 1 : 3;
            String str = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("createCaptureRequest templateType: ");
            sb2.append(this.mCameraTemplateType == 0 ? "preview" : "record");
            Logging.i(str, sb2.toString());
            CaptureRequest.Builder createCaptureRequest = this.mCameraDevice.createCaptureRequest(i13);
            this.mPreviewRequestBuilder = createCaptureRequest;
            if (createCaptureRequest == null) {
                Logging.e(str, "mPreviewRequestBuilder error");
                return false;
            }
            createCaptureRequest.addTarget(surface);
            CaptureRequest.Builder builder = this.mPreviewRequestBuilder;
            CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
            builder.set(key, 1);
            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            configureCommonCaptureSettings(this.mPreviewRequestBuilder);
            if (this.mEnableFaceDetection || this.mParameter.faceFocusing) {
                this.mPreviewRequestBuilder.set(key, 2);
                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_SCENE_MODE, 1);
            }
            requestFaceDetection(this.mPreviewRequestBuilder, this.mFaceDetectMode);
            if (!this.mIsCameraTorchStarted && (i12 = this.mTorchMode) != 0) {
                setTorchMode(i12 == 1);
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
            if (!this.mIsExposureCompensationStarted && (i11 = this.mCameraExposureCompensation) != 0) {
                setExposureCompensation(i11);
            }
            if (!this.mIsNoiseReducationStarted && (i10 = this.mCameraNoiseReduction) != 0) {
                setNoiseReductionMode(i10);
            }
            if (!this.mAutoFaceDetectFocusStarted && (z10 = this.mParameter.faceFocusing)) {
                setAutoFaceFocus(z10);
            }
            try {
                if (!this.mCameraExtraSurface) {
                    String str2 = Build.MODEL;
                    if (!str2.equalsIgnoreCase("redmi note 8") && !str2.equalsIgnoreCase("redmi note 8 pro")) {
                        asList = Collections.singletonList(surface);
                        this.mCameraDevice.createCaptureSession(asList, new CrPreviewSessionListener(), null);
                        return true;
                    }
                }
                this.mCameraDevice.createCaptureSession(asList, new CrPreviewSessionListener(), null);
                return true;
            } catch (CameraAccessException e10) {
                Logging.e(TAG, "createCaptureSession, by CameraAccessException: " + e10);
                return false;
            } catch (IllegalArgumentException e11) {
                Logging.e(TAG, "createCaptureSession, by IllegalArgumentException: " + e11);
                return false;
            } catch (NoClassDefFoundError e12) {
                Logging.e(TAG, "createCaptureSession, by NoClassDefFoundError: " + e12);
                return false;
            } catch (SecurityException e13) {
                Logging.e(TAG, "createCaptureSession, by SecurityException: " + e13);
                return false;
            }
            synchronized (this.mImageReaderLock) {
                newInstance = ImageReader.newInstance(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight(), this.mCaptureFormat.getPixelFormat(), 2);
                this.xiaomiReader = newInstance;
            }
            asList = Arrays.asList(surface, newInstance.getSurface());
            Logging.e(str, "createCaptureSession add extra surface.");
        } catch (CameraAccessException e14) {
            Logging.e(TAG, "createCaptureRequest, by CameraAccessException: " + e14);
            return false;
        } catch (IllegalArgumentException e15) {
            Logging.e(TAG, "createCaptureRequest, by IllegalArgumentException: " + e15);
            return false;
        } catch (SecurityException e16) {
            Logging.e(TAG, "createCaptureRequest, by SecurityException: " + e16);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createPreviewObjectsAndStartPreviewOrFailWith(int i10) {
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mCaptureToTexture) {
            if (createTexturePreviewObjectsAndStartPreview()) {
                return;
            }
        } else if (createBufferPreviewObjectsAndStartPreview()) {
            return;
        }
        changeCameraStateAndNotify(4);
        onError(i10, "Error starting or restarting preview");
    }

    private boolean createTexturePreviewObjectsAndStartPreview() {
        ISurfaceTextureHelper iSurfaceTextureHelper;
        this.mThreadChecker.checkIsOnValidThread();
        if (this.mCameraDevice != null && (iSurfaceTextureHelper = this.mSurfaceTextureHelper) != null) {
            try {
                iSurfaceTextureHelper.setTextureSize(this.mCaptureFormat.getWidth(), this.mCaptureFormat.getHeight());
                this.mSurface = new Surface(this.mSurfaceTextureHelper.getSurfaceTexture());
                this.mSurfaceTextureHelper.startListening(new TextureVideoSinkListener());
                return createPreviewObjectsAndStartPreview(this.mSurface);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "setTextureSize:", e10);
            }
        }
        return false;
    }

    private Rect cropRegionForZoom(float f10) {
        int width = this.mSensorRect.width() / 2;
        int height = this.mSensorRect.height() / 2;
        int width2 = (int) ((this.mSensorRect.width() * ZOOM_UNSUPPORTED_DEFAULT_VALUE) / f10);
        int height2 = (int) ((this.mSensorRect.height() * ZOOM_UNSUPPORTED_DEFAULT_VALUE) / f10);
        return new Rect(width - width2, height - height2, width + width2, height + height2);
    }

    private static int findInIntArray(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static boolean getCamera2SupportedAutoFocus(int i10) {
        int[] iArr;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i10);
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) == null) {
            return false;
        }
        for (int i11 : iArr) {
            Logging.i(TAG, "Auto-focus mode: " + i11);
        }
        boolean z10 = isSupported(3, iArr) || isSupported(4, iArr);
        if (!z10) {
            Logging.i(TAG, "Auto-focus is not available.");
        }
        return z10;
    }

    public static int getCamera2SupportedFaceDetect(int i10) {
        int i11;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i10);
        boolean z10 = false;
        if (cameraCharacteristics == null) {
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        if (iArr != null) {
            i11 = 1;
            if (iArr.length > 1 && num != null && num.intValue() > 0) {
                int i12 = 0;
                for (int i13 : iArr) {
                    Logging.d(TAG, "fdMode: " + i13);
                    i12 += i13;
                }
                if (i12 % 2 != 0) {
                    z10 = true;
                } else {
                    i11 = 2;
                    z10 = true;
                }
                Logging.i(TAG, "faceDetectSupported: " + z10 + " ,faceDetectMode: " + i11);
                return i11;
            }
        }
        i11 = 0;
        Logging.i(TAG, "faceDetectSupported: " + z10 + " ,faceDetectMode: " + i11);
        return i11;
    }

    public static int getCamera2SupportedLevel(int i10) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(i10);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "getCamera2SupportedLevel fail, cameraCharacteristics null");
            return 2;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            return num.intValue();
        }
        Logging.w(TAG, "get camera hardware level fail!, level null");
        return 2;
    }

    public static boolean getCamera2SupportedNoise(int i10) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i10));
        if (cameraCharacteristics == null) {
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
        String str = TAG;
        Logging.i(str, "noise_reduction_mode_high_quality supported: " + isSupported(2, iArr));
        boolean isSupported = isSupported(1, iArr);
        Logging.i(str, "noise_reduction_mode_fast supported: " + isSupported);
        return isSupported;
    }

    private static CameraCharacteristics getCameraCharacteristics(int i10) {
        CameraCharacteristics cameraCharacteristics;
        boolean cameraCacheNumbers = VideoCaptureFactory.ChromiumCameraInfo.getCameraCacheNumbers();
        if (cameraCacheNumbers && mCameraIds != null && i10 < mCameraIds.length && (cameraCharacteristics = cameraCharacteristicMaps.get(mCameraIds[i10])) != null) {
            return cameraCharacteristics;
        }
        if (ContextUtils.getApplicationContext() == null) {
            Logging.e(TAG, "getCameraCharacteristics error, context null");
            return null;
        }
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        if (cameraManager == null) {
            Logging.e(TAG, "getCameraCharacteristics error, manager null");
            return null;
        }
        try {
            mCameraIds = cameraManager.getCameraIdList();
            if (i10 >= mCameraIds.length) {
                Logging.i(TAG, "physical camera Index: " + i10);
            }
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(mCameraIds[i10]);
            if (cameraCacheNumbers) {
                cameraCharacteristicMaps.put(mCameraIds[i10], cameraCharacteristics2);
            }
            return cameraCharacteristics2;
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "getCameraCharacteristics, CameraAccessException: " + e10);
            return null;
        } catch (AssertionError e11) {
            Logging.e(TAG, "getCameraCharacteristics, AssertionError: " + e11);
            return null;
        } catch (IllegalArgumentException e12) {
            Logging.e(TAG, "getCameraCharacteristics, IllegalArgumentException: " + e12);
            return null;
        } catch (Exception e13) {
            Logging.e(TAG, "getCameraCharacteristics: got exception, Exception: " + e13);
            return null;
        }
    }

    public static int getCaptureApiType(int i10) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i10));
        if (cameraCharacteristics == null) {
            return 11;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue == 2) {
            return 7;
        }
        for (int i11 : (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) {
            if (i11 == 0) {
                if (intValue != 0) {
                    return intValue != 1 ? 7 : 8;
                }
                return 9;
            }
        }
        return 11;
    }

    private static int getClosestWhiteBalance(int i10, int[] iArr) {
        int abs;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            SparseIntArray sparseIntArray = COLOR_TEMPERATURES_MAP;
            if (i12 >= sparseIntArray.size()) {
                return i13;
            }
            if (findInIntArray(iArr, sparseIntArray.valueAt(i12)) != -1 && (abs = Math.abs(i10 - sparseIntArray.keyAt(i12))) < i11) {
                i13 = sparseIntArray.valueAt(i12);
                i11 = abs;
            }
            i12++;
        }
    }

    public static String getDeviceId(int i10) {
        try {
            String[] cameraIdList = ((CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")).getCameraIdList();
            if (i10 >= cameraIdList.length) {
                Logging.e(TAG, "Invalid camera index: " + i10);
            }
            return cameraIdList[i10];
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "manager.getCameraIdList: " + e10);
            return null;
        } catch (Exception e11) {
            Logging.e(TAG, "manager.getCameraIdList: " + e11);
            return null;
        }
    }

    public static List<VideoCaptureFormat> getDeviceSupportedFormats(int i10) {
        Logging.i(TAG, "getDeviceSupportedFormats() " + i10);
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i10));
        if (cameraCharacteristics == null) {
            return null;
        }
        return getFormatsFromParemeters(cameraCharacteristics, IMAGE_FORMAT);
    }

    public static int getFacingMode(int i10) {
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i10));
        if (cameraCharacteristics == null) {
            return 0;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        if (intValue != 0) {
            return intValue != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    private static boolean getFocalLengthInfo(CameraCharacteristics cameraCharacteristics, String str, int i10, FocalLengthInfo[] focalLengthInfoArr) {
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return false;
        }
        ?? r22 = num.intValue() == 0 ? 1 : 0;
        float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        int i11 = (i10 - 1) * 6;
        int i12 = (r22 != 0 ? 0 : 3) + i11;
        if (focalLengthInfoArr[i12] == null) {
            Logging.d(TAG, "getFocalLengthInfo cameraDirection " + ((int) r22) + " index: " + i12 + " id: " + str + " focalLengthType: 0 front: " + ((boolean) r22));
            focalLengthInfoArr[i12] = new FocalLengthInfo(r22, i12, Integer.parseInt(str), 0);
        }
        if (fArr != null && fArr.length != 0) {
            float f10 = fArr[0];
            for (float f11 : fArr) {
                f10 = Math.min(f11, f10);
            }
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The ");
            sb2.append(r22 != 0 ? "front Camera " : "rear Camera ");
            sb2.append("minimum supported value is: ");
            sb2.append(10.0f * f10);
            sb2.append("mm");
            Logging.d(str2, sb2.toString());
            if (f10 >= 2.4f && f10 < 3.5f) {
                int i13 = i11 + (r22 == 0 ? 3 : 0) + 1;
                Logging.d(str2, "getFocalLengthInfo cameraDirection " + ((int) r22) + " index: " + i13 + " id: " + str + " focalLengthType: 1 front: " + ((boolean) r22));
                focalLengthInfoArr[i13] = new FocalLengthInfo(r22, i13, Integer.parseInt(str), 1);
                return true;
            }
            if (f10 < 2.4f && f10 > 0.1d) {
                int i14 = i11 + (r22 == 0 ? 3 : 0) + 2;
                Logging.d(str2, "getFocalLengthInfo cameraDirection " + ((int) r22) + " index: " + i14 + " id: " + str + " focalLengthType: 2 front: " + ((boolean) r22));
                focalLengthInfoArr[i14] = new FocalLengthInfo(r22, i14, Integer.parseInt(str), 2);
                return true;
            }
        }
        return false;
    }

    @NonNull
    private static List<VideoCaptureFormat> getFormatsFromParemeters(@NonNull CameraCharacteristics cameraCharacteristics, int i10) {
        boolean z10;
        Size[] outputSizes;
        double d10;
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                z10 = false;
                break;
            }
            z10 = true;
            if (iArr[i11] == 1) {
                break;
            }
            i11++;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            for (int i12 : streamConfigurationMap.getOutputFormats()) {
                if (i12 == i10 && (outputSizes = streamConfigurationMap.getOutputSizes(i12)) != null) {
                    for (Size size : outputSizes) {
                        if (!VideoCaptureCamera.shouldExcludeSize(size.getWidth(), size.getHeight())) {
                            if (z10) {
                                long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(i12, size);
                                if (outputMinFrameDuration != 0) {
                                    d10 = kNanosecondsPerSecond / outputMinFrameDuration;
                                    arrayList.add(new VideoCaptureFormat(size.getWidth(), size.getHeight(), (int) d10, i12));
                                }
                            }
                            d10 = 30;
                            arrayList.add(new VideoCaptureFormat(size.getWidth(), size.getHeight(), (int) d10, i12));
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e10) {
            Logging.e(TAG, "Unable to catch device supported video formats: ", e10);
            return arrayList;
        }
    }

    public static String getName(int i10) {
        String str;
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(indexConvertCameraId(i10));
        if (cameraCharacteristics == null) {
            Logging.e(TAG, "getName: " + i10 + " , failed to getCameraCharacteristics.");
            return null;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue();
        if (intValue != 0) {
            str = "back";
            if (intValue != 1) {
                if (intValue != 2) {
                    Logging.e(TAG, "Invalid camera facing value, and fallback to back: " + intValue);
                } else {
                    str = "extra";
                }
            }
        } else {
            str = "front";
        }
        return "camera2 " + i10 + ", facing " + str;
    }

    public static int getNumberOfCameras() {
        String[] cameraIdList = new CameraIdListTask().getCameraIdList();
        if (cameraIdList != null) {
            return cameraIdList.length;
        }
        Logging.e(TAG, "getNumberOfCameras error, cameraIdList null");
        return 0;
    }

    private static Range<Float> getZoomRationRange(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
        }
        return null;
    }

    private static String indexConvertCameraId(int i10) {
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        if (cameraManager == null) {
            Logging.e(TAG, "indexConvertCameraId, manager null");
            return null;
        }
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (i10 >= cameraIdList.length) {
                Logging.d(TAG, "physical camera Index: " + i10);
            }
            return cameraIdList[i10];
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "indexConvertCameraId, CameraAccessException: " + e10);
            return null;
        } catch (AssertionError e11) {
            Logging.e(TAG, "indexConvertCameraId, AssertionError: " + e11);
            return null;
        } catch (IllegalArgumentException e12) {
            Logging.e(TAG, "indexConvertCameraId, IllegalArgumentException: " + e12);
            return null;
        } catch (Exception e13) {
            Logging.e(TAG, "indexConvertCameraId, Exception: " + e13);
            return null;
        }
    }

    public static boolean isLegacyDevice(int i10) {
        if (getCameraCharacteristics(indexConvertCameraId(i10)) != null) {
            return getCamera2SupportedLevel(i10) == 2;
        }
        Logging.e(TAG, "isLegacyDevice error, cameraCharacteristics null, identified as LegacyDevice");
        return true;
    }

    private static boolean isSupported(int i10, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedFocusMode(CameraCharacteristics cameraCharacteristics, int i10) {
        int[] iArr;
        if (cameraCharacteristics == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) == null) {
            return false;
        }
        for (int i11 : iArr) {
            Logging.i(TAG, "availableFocusModes: " + i11);
            if (i11 == i10) {
                return true;
            }
        }
        Logging.i(TAG, "Auto-focus is not available.");
        return false;
    }

    private boolean isSupportedStability(int i10, int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean physicalFallback(CameraManager cameraManager, CrStateListener crStateListener) {
        try {
            this.mPhysicalId = null;
            String str = TAG;
            Logging.d(str, "allocate physical camera failure, try logical camera.");
            String[] cameraIdList = cameraManager.getCameraIdList();
            if (this.mId >= cameraIdList.length) {
                Logging.e(str, "Invalid camera Id: " + this.mId);
                return false;
            }
            Logging.d(str, "allocate open logicalCamera: " + this.mId + " camera name:" + cameraIdList[this.mId]);
            cameraManager.openCamera(cameraIdList[this.mId], crStateListener, this.mCameraThreadHandler);
            this.mCameraId = cameraIdList[this.mId];
            return true;
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "allocate: manager.openCamera: " + e10);
            return false;
        } catch (IllegalArgumentException e11) {
            Logging.e(TAG, "allocate: manager.openCamera: " + e11);
            return false;
        } catch (SecurityException e12) {
            Logging.e(TAG, "allocate: manager.openCamera: " + e12);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<FocalLengthInfo> queryCameraFocalLengthCapability(boolean z10) {
        CameraManager cameraManager;
        CameraCharacteristics cameraCharacteristics;
        int i10;
        boolean z11;
        CameraCharacteristics cameraCharacteristics2 = null;
        if (ContextUtils.getApplicationContext() == null || (cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera")) == null) {
            return null;
        }
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            FocalLengthInfo[] focalLengthInfoArr = new FocalLengthInfo[18];
            if (queryLogicalFocalLengths(cameraManager, cameraIdList, focalLengthInfoArr)) {
                Logging.d(TAG, "Logical Camera, FocalLengths available.");
            } else {
                Logging.w(TAG, "Logical Camera, FocalLengths empty!");
            }
            try {
                cameraCharacteristics = cameraManager.getCameraCharacteristics("0");
                try {
                    cameraCharacteristics2 = cameraManager.getCameraCharacteristics("1");
                } catch (CameraAccessException e10) {
                    e = e10;
                    e.printStackTrace();
                    if (z10) {
                    }
                    if (z11) {
                    }
                    if ((cameraCharacteristics2 == null && queryZoomFocalLengths(cameraCharacteristics2, "1", focalLengthInfoArr)) ? true : cameraCharacteristics == null && queryZoomFocalLengths(cameraCharacteristics, "0", focalLengthInfoArr)) {
                    }
                    ArrayList arrayList = new ArrayList();
                    while (i10 < 18) {
                    }
                    return arrayList;
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    if (z10) {
                    }
                    if (z11) {
                    }
                    if ((cameraCharacteristics2 == null && queryZoomFocalLengths(cameraCharacteristics2, "1", focalLengthInfoArr)) ? true : cameraCharacteristics == null && queryZoomFocalLengths(cameraCharacteristics, "0", focalLengthInfoArr)) {
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (i10 < 18) {
                    }
                    return arrayList2;
                }
            } catch (CameraAccessException e12) {
                e = e12;
                cameraCharacteristics = null;
            } catch (Exception e13) {
                e = e13;
                cameraCharacteristics = null;
            }
            if (z10) {
                Logging.w(TAG, "Skip find physical camera focalLength capability.");
                z11 = false;
            } else {
                z11 = queryPhysicalFocalLengths(cameraManager, cameraCharacteristics, cameraIdList, focalLengthInfoArr);
                if (queryPhysicalFocalLengths(cameraManager, cameraCharacteristics2, cameraIdList, focalLengthInfoArr)) {
                    z11 = true;
                }
            }
            if (z11) {
                Logging.d(TAG, "Physical Camera, FocalLengths available.");
            } else {
                Logging.w(TAG, "Physical Camera, FocalLengths empty!");
            }
            if ((cameraCharacteristics2 == null && queryZoomFocalLengths(cameraCharacteristics2, "1", focalLengthInfoArr)) ? true : cameraCharacteristics == null && queryZoomFocalLengths(cameraCharacteristics, "0", focalLengthInfoArr)) {
                Logging.d(TAG, "Supports scaling of less than 1.0 magnification, FocalLengths available.");
            } else {
                Logging.w(TAG, "Scaling less than 1.0 magnification is not supported.");
            }
            ArrayList arrayList22 = new ArrayList();
            for (i10 = 0; i10 < 18; i10++) {
                FocalLengthInfo focalLengthInfo = focalLengthInfoArr[i10];
                if (!arrayList22.contains(focalLengthInfo)) {
                    arrayList22.add(focalLengthInfo);
                }
            }
            return arrayList22;
        } catch (CameraAccessException e14) {
            e14.printStackTrace();
            return null;
        }
    }

    public static boolean queryLogicalFocalLengths(CameraManager cameraManager, String[] strArr, FocalLengthInfo[] focalLengthInfoArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        boolean z10 = false;
        for (String str : strArr) {
            try {
                if (getFocalLengthInfo(cameraManager.getCameraCharacteristics(str), str, 1, focalLengthInfoArr)) {
                    z10 = true;
                }
            } catch (CameraAccessException e10) {
                e10.printStackTrace();
            }
        }
        return z10;
    }

    private static boolean queryPhysicalFocalLengths(CameraManager cameraManager, CameraCharacteristics cameraCharacteristics, String[] strArr, FocalLengthInfo[] focalLengthInfoArr) {
        boolean z10;
        Set<String> physicalCameraIds;
        boolean z11 = false;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        if (strArr != null && strArr.length != 0 && cameraCharacteristics != null) {
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i10 : iArr) {
                    if (i10 == 11) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            Logging.d(TAG, "physicalCamera Available: " + z10);
            if (!z10) {
                return false;
            }
            physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
            if (physicalCameraIds.isEmpty()) {
                return false;
            }
            for (String str : physicalCameraIds) {
                try {
                    if (getFocalLengthInfo(cameraManager.getCameraCharacteristics(str), str, 2, focalLengthInfoArr)) {
                        z11 = true;
                    }
                } catch (CameraAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static boolean queryZoomFocalLengths(CameraCharacteristics cameraCharacteristics, String str, FocalLengthInfo[] focalLengthInfoArr) {
        if (cameraCharacteristics == null) {
            return false;
        }
        Range<Float> zoomRationRange = getZoomRationRange(cameraCharacteristics);
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
        if (num == null) {
            return false;
        }
        ?? r22 = num.intValue() == 0 ? 1 : 0;
        int i10 = (r22 != 0 ? 0 : 3) + 12;
        if (focalLengthInfoArr[i10] == null) {
            Logging.d(TAG, "Zoom FocalLengthInfo cameraDirection " + ((int) r22) + " index: " + i10 + " id: " + str + " focalLengthType: 0 front: " + ((boolean) r22));
            focalLengthInfoArr[i10] = new FocalLengthInfo(r22, i10, Integer.parseInt(str), 0);
        }
        if (zoomRationRange == null || zoomRationRange.getLower().floatValue() >= 1.0f) {
            return false;
        }
        if (!getFocalLengthInfo(cameraCharacteristics, str, 3, focalLengthInfoArr)) {
            int i11 = (r22 == 0 ? 3 : 0) + 13;
            Logging.d(TAG, "Zoom FocalLengthInfo cameraDirection " + ((int) r22) + " index: " + i11 + " id: " + str + " focalLengthType: 1 front: " + ((boolean) r22));
            focalLengthInfoArr[i11] = new FocalLengthInfo(r22, i11, Integer.parseInt(str), 1);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestFaceDetection(CaptureRequest.Builder builder, int i10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (builder == null) {
                        Logging.e(TAG, "face detect requestBuilder error");
                        return;
                    }
                    if (!this.mFaceDetectSupported) {
                        Logging.w(TAG, "face detect not supported");
                        return;
                    }
                    if (this.mEnableAutoFaceFocus || this.mEnableFaceDetection) {
                        if (i10 == 0 || this.mIsFaceDetectionStarted) {
                            if (i10 == 0) {
                                this.mIsFaceDetectionStarted = false;
                                Logging.i(TAG, "requestFaceDetection = 0");
                                this.mPreviewRequestBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                                this.mPerFrameFaceDetectionInfoQueue.clear();
                                return;
                            }
                            return;
                        }
                        this.mIsFaceDetectionStarted = true;
                        Logging.i(TAG, "requestFaceDetection = " + i10);
                        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(i10));
                        return;
                    }
                    return;
                }
                Logging.w(TAG, "face detect not ready");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int setFocusByCustom(float f10, float f11) {
        Rect rect = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
        Rect rect2 = this.mNonScaleSrop;
        if (rect2 != null) {
            rect = rect2;
        }
        if (rect == null) {
            return -1;
        }
        int width = rect.width();
        int height = rect.height();
        RectF rectF = new RectF();
        rectF.left = CoordinatesTransform.clamp(f10 - 0.05f, 0.0f, 1.0f);
        rectF.right = CoordinatesTransform.clamp(f10 + 0.05f, 0.0f, 1.0f);
        rectF.top = CoordinatesTransform.clamp(f11 - 0.05f, 0.0f, 1.0f);
        rectF.bottom = CoordinatesTransform.clamp(f11 + 0.05f, 0.0f, 1.0f);
        VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
        RectF normalizedToSensor = CoordinatesTransform.normalizedToSensor(rectF, videoCaptureFormat.mWidth, videoCaptureFormat.mHeight, width, height, (this.mId == 1 ? 1 : -1) * getCameraRotation(), true);
        if (normalizedToSensor == null) {
            Logging.w(TAG, "Failed to translate input coordinate");
            return -1;
        }
        Rect rect3 = new Rect();
        if (normalizedToSensor.width() == 0.0f || normalizedToSensor.height() == 0.0f) {
            rect3 = new Rect(0, 0, 0, 0);
        } else {
            normalizedToSensor.round(rect3);
        }
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect3, 1000)});
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect3, 1000)});
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        if (this.mCameraThreadHandler != null) {
            CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
            if (cameraCaptureSession != null) {
                try {
                    this.mIsmCameraFocusStarted = true;
                    cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), VideoCaptureCamera.shouldSkipRefocus() ? null : this.mAfCaptureCallback, this.mCameraThreadHandler);
                } catch (CameraAccessException e10) {
                    e10.printStackTrace();
                    return -1;
                } catch (IllegalArgumentException e11) {
                    e11.printStackTrace();
                    return -1;
                } catch (IllegalStateException e12) {
                    e12.printStackTrace();
                    return -1;
                }
            }
            VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
            RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(normalizedToSensor, width, height, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, true);
            if (sensorToNormalized == null) {
                Logging.w(TAG, "Failed to translate normalized from sensor!!");
                return -1;
            }
            new RectF(sensorToNormalized.left * 1000.0f, sensorToNormalized.top * 1000.0f, sensorToNormalized.right * 1000.0f, sensorToNormalized.bottom * 1000.0f).round(rect3);
            notifyCameraFocusAreaChanged(rect3);
        }
        return 0;
    }

    private static boolean shouldSkipSettingAeTargetFpsRange() {
        for (String str : AE_TARGET_FPS_RANGE_BUGGY_DEVICE_LIST) {
            if (Build.MODEL.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private int toCamera2EdgeEnhanceMode(int i10) {
        if (i10 < 0 || i10 > 3) {
            return 0;
        }
        return i10;
    }

    private int toCamera2VideoStabilityMode(int i10) {
        if (i10 < 0 || i10 > 1) {
            return 0;
        }
        return i10;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        float f10;
        String str = TAG;
        Logging.i(str, String.format(Locale.US, "allocate: requested (%d x %d) @%dfps", Integer.valueOf(videoCaptureFormat.getWidth()), Integer.valueOf(videoCaptureFormat.getHeight()), Integer.valueOf(videoCaptureFormat.getFramerate())));
        synchronized (this.mCameraStateLock) {
            int i10 = this.mCameraState;
            if (i10 != 0 && i10 != 1) {
                String str2 = this.mPhysicalId;
                CameraCharacteristics cameraCharacteristics = str2 != null ? getCameraCharacteristics(str2) : getCameraCharacteristics(this.mId);
                if (cameraCharacteristics == null) {
                    Logging.e(str, "failed to getCameraCharacteristics.");
                    return false;
                }
                List<VideoCaptureFormat> formatsFromParemeters = getFormatsFromParemeters(cameraCharacteristics, IMAGE_FORMAT);
                Logging.i(str, "format list: " + Arrays.toString(formatsFromParemeters.toArray()));
                VideoCaptureFormat FindBestMatchedCapability = VideoCapture.FindBestMatchedCapability(formatsFromParemeters, videoCaptureFormat);
                this.mCaptureFormat = FindBestMatchedCapability;
                if (FindBestMatchedCapability == null) {
                    Logging.e(str, "failed to match capability");
                    return false;
                }
                List<Range> asList = Arrays.asList((Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
                Logging.i(str, "fpsRanges: " + Arrays.toString(asList.toArray()));
                if (asList.isEmpty()) {
                    Logging.e(str, "No supported framerate ranges.");
                    return false;
                }
                ArrayList arrayList = new ArrayList(asList.size());
                int i11 = ((Integer) ((Range) asList.get(0)).getUpper()).intValue() > 1000 ? 1 : 1000;
                for (Range range : asList) {
                    arrayList.add(new VideoCapture.FramerateRange(((Integer) range.getLower()).intValue() * i11, ((Integer) range.getUpper()).intValue() * i11));
                }
                VideoCapture.FramerateRange findBestFrameRateRange = VideoCaptureCamera.findBestFrameRateRange(arrayList, this.mCaptureFormat.getFramerate() * 1000, this.mPQFirst, this.mPQFirstType, this.mPQFirstDiff * 1000, this.mCustomMinFps * 1000, this.mCustomMaxFps * 1000);
                if (findBestFrameRateRange == null) {
                    Logging.e(TAG, "No matched framerate ranges.");
                    return false;
                }
                float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                if (fArr == null || fArr.length <= 0) {
                    f10 = 0.0f;
                } else {
                    f10 = fArr[0];
                    for (float f11 : fArr) {
                        f10 = Math.min(f11, f10);
                    }
                }
                this.mAeFpsRange = new Range<>(Integer.valueOf(findBestFrameRateRange.min / i11), Integer.valueOf(findBestFrameRateRange.max / i11));
                Logging.i(TAG, String.format(Locale.US, "allocate: matched (%d x %d) @[%d - %d], %dmm", Integer.valueOf(this.mCaptureFormat.mWidth), Integer.valueOf(this.mCaptureFormat.mHeight), this.mAeFpsRange.getLower(), this.mAeFpsRange.getUpper(), Integer.valueOf((int) (f10 * 10.0f))));
                this.mCameraNativeOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                this.mInvertDeviceOrientationReadings = ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
                int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
                if (iArr != null && iArr.length > 1 && num != null && num.intValue() > 0) {
                    this.mFaceDetectSupported = true;
                    int i12 = 0;
                    for (int i13 : iArr) {
                        i12 += i13;
                    }
                    if (i12 % 2 != 0) {
                        this.mFaceDetectMode = 1;
                    } else {
                        this.mFaceDetectMode = 2;
                    }
                }
                Logging.i(TAG, "allocate() face detection: " + this.mFaceDetectMode + " " + num + " " + this.mFaceDetectSupported);
                return true;
            }
            Logging.e(str, "allocate() invoked while Camera is busy opening/configuring.");
            return false;
        }
    }

    public Rect clampFace(Rect rect) {
        int clamp = CoordinatesTransform.clamp(rect.left, 0, rect.right);
        int clamp2 = CoordinatesTransform.clamp(rect.top, 0, rect.bottom);
        int i10 = rect.right;
        int clamp3 = CoordinatesTransform.clamp(i10, 0, i10);
        int i11 = rect.bottom;
        return new Rect(clamp, clamp2, clamp3, CoordinatesTransform.clamp(i11, 0, i11));
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        Logging.i(TAG, "deallocate()");
    }

    public void finalize() {
        Handler handler = this.mCameraThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mCameraThreadHandler.getLooper().quitSafely();
            this.mCameraThreadHandler = null;
        }
    }

    public Handler getCameraThreadHandler() {
        return this.mCameraThreadHandler;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public float getMaxZoom() {
        if (this.mMaxZoom <= 1.0f) {
            String str = this.mPhysicalId;
            CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
            if (cameraCharacteristics != null) {
                this.mMaxZoom = getMaxZoom(cameraCharacteristics);
            }
        }
        return this.mMaxZoom;
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    @NonNull
    public VideoCapture.FramerateRange getSelectedFramerateRange() {
        return new VideoCapture.FramerateRange(this.mAeFpsRange.getLower().intValue() * 1000, this.mAeFpsRange.getUpper().intValue() * 1000);
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    @NonNull
    public List<VideoCapture.FramerateRange> getSupportFramerateRanges() {
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        String str = this.mPhysicalId;
        if (str == null) {
            str = this.mId + "";
        }
        try {
            List<Range> asList = Arrays.asList((Range[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
            ArrayList arrayList = new ArrayList(asList.size());
            int i10 = ((Integer) ((Range) asList.get(0)).getUpper()).intValue() > 1000 ? 1 : 1000;
            for (Range range : asList) {
                arrayList.add(new VideoCapture.FramerateRange(((Integer) range.getLower()).intValue() * i10, ((Integer) range.getUpper()).intValue() * i10));
            }
            return arrayList;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isAutoFaceFocusSupported() {
        if (!isFocusSupported()) {
            return false;
        }
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        return num != null && num.intValue() > 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isCameraExposureSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
        Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range != null && rational != null) {
            int intValue = ((Integer) range.getUpper()).intValue();
            int intValue2 = ((Integer) range.getLower()).intValue();
            Logging.i(TAG, "isCameraExposureSupported compensation min: " + intValue2 + " max: " + intValue);
            if (intValue2 < 0 && intValue > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isExposureSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                Logging.i(TAG, "isExposureSupported AE mode = " + iArr[i10]);
                if (1 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFaceDetectSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        int intValue = num == null ? 0 : num.intValue();
        Logging.i(TAG, "face dedect, numDetectedFaces: " + intValue);
        return intValue > 0;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isFocusSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i10 = 0; i10 < iArr.length; i10++) {
                if (1 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isTorchSupported() {
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return false;
        }
        Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean isZoomSupported() {
        if (this.mMaxZoom > 1.0f) {
            return true;
        }
        String str = this.mPhysicalId;
        CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
        if (cameraCharacteristics != null) {
            this.mMaxZoom = getMaxZoom(cameraCharacteristics);
        }
        return this.mMaxZoom > 1.0f;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public boolean needFallback() {
        return true;
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraAvailable(String str) {
        String str2 = TAG;
        Logging.i(str2, "onCameraAvailable " + str + " mCameraId: " + this.mCameraId);
        if (str.equals(this.mCameraId)) {
            synchronized (this.mCameraStateLock) {
                try {
                    if (this.mCameraState == 3) {
                        onAvailable(0);
                        return;
                    }
                    Logging.i(str2, "onCameraAvailable, Wrong state " + this.mCameraState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.agora.rtc2.video.VideoCaptureCamera
    public void onCameraUnavailable(String str) {
        if (str.equals(this.mCameraId)) {
            synchronized (this.mCameraStateLock) {
                try {
                    if (this.mCameraState == 3) {
                        onAvailable(1);
                        return;
                    }
                    Logging.i(TAG, "onCameraUnavailable, Wrong state " + this.mCameraState);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAntiBandingMode(int i10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsAntiBandingStarted && this.mCameraAntiBandingMode == i10) {
                        return 0;
                    }
                    this.mCameraAntiBandingMode = i10;
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (i10 < 0 || i10 > 3) {
                        i10 = 3;
                    }
                    int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_ANTIBANDING_MODES);
                    if (iArr != null && iArr.length > 0) {
                        for (int i11 : iArr) {
                            if (i11 == i10) {
                                if (this.mPreviewSession != null) {
                                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(i10));
                                    try {
                                        Logging.i(TAG, "setAntiBandingMode = " + i10);
                                        this.mIsAntiBandingStarted = true;
                                        this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                                        return 0;
                                    } catch (CameraAccessException e10) {
                                        e10.printStackTrace();
                                    } catch (IllegalArgumentException e11) {
                                        e11.printStackTrace();
                                    } catch (IllegalStateException e12) {
                                        e12.printStackTrace();
                                    }
                                }
                                Logging.i(TAG, "AgoraVideo set anti-banding = " + i10);
                                return -1;
                            }
                        }
                    }
                    Logging.e(TAG, "not supported anti-banding = " + i10);
                    return -1;
                }
                this.mCameraAntiBandingMode = i10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setAutoFaceFocus(boolean z10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mEnableAutoFaceFocus == z10) {
                    Logging.w(TAG, "face detect no change");
                    return 0;
                }
                this.mEnableAutoFaceFocus = z10;
                String str = TAG;
                Logging.i(str, "setAutoFaceFocus called camera api2, enable: " + z10);
                if (!this.mFaceDetectSupported) {
                    Logging.w(str, "face detect not supported");
                    return 0;
                }
                if (this.mPreviewSession != null && this.mCameraThreadHandler != null && this.mPreviewRequestBuilder != null) {
                    if (this.mEnableAutoFaceFocus) {
                        if (!this.mIsFaceDetectionStarted) {
                            this.mIsFaceDetectionStarted = true;
                            Logging.i(str, "setAutoFaceFocus called camera api2 done, mode: " + this.mFaceDetectMode);
                            this.mPreviewRequestBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.mFaceDetectMode));
                        }
                    } else {
                        if (this.mEnableFaceDetection) {
                            Logging.w(str, "face detect did not turn off due to faceDistance on");
                            return 0;
                        }
                        Logging.i(str, "setAutoFaceFocus called camera api2 done, mode: " + this.mFaceDetectMode);
                        this.mIsFaceDetectionStarted = false;
                        this.mPreviewRequestBuilder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                        this.mPerFrameFaceDetectionInfoQueue.clear();
                    }
                    CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                    if (cameraCaptureSession != null) {
                        try {
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e10) {
                            e10.printStackTrace();
                        } catch (IllegalArgumentException e11) {
                            e11.printStackTrace();
                        } catch (IllegalStateException e12) {
                            e12.printStackTrace();
                        }
                    }
                    return 0;
                }
                Logging.w(str, "face detect not ready");
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
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

    public void setCameraThreadHandler() {
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera2_CameraThread");
        handlerThread.start();
        this.mCameraThreadHandler = new Handler(handlerThread.getLooper());
        this.mThreadChecker = new ThreadUtils.ThreadChecker(handlerThread);
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setEdgeEnhanceMode(int i10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsEdgeEnhanceStarted && this.mCamerEdgeEnhanceMode == i10) {
                        return 0;
                    }
                    this.mCamerEdgeEnhanceMode = i10;
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (i10 < 0 || i10 > 3) {
                        i10 = 0;
                    }
                    if (isSupported(i10, (int[]) cameraCharacteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES)) && this.mPreviewSession != null) {
                        this.mPreviewRequestBuilder.set(CaptureRequest.EDGE_MODE, Integer.valueOf(i10));
                        try {
                            Logging.i(TAG, "setEdgeEnhanceMode = " + i10);
                            this.mIsEdgeEnhanceStarted = true;
                            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e10) {
                            e10.printStackTrace();
                        } catch (IllegalArgumentException e11) {
                            e11.printStackTrace();
                        } catch (IllegalStateException e12) {
                            e12.printStackTrace();
                        }
                    }
                    Logging.e(TAG, "not supported EdgeEnhance Mode = " + i10);
                    return -1;
                }
                this.mCamerEdgeEnhanceMode = i10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposure(float f10, float f11) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null && this.mRenderView.getWidth() != 0 && this.mRenderView.getHeight() != 0) {
                    if (this.mIsmCameraExposureStarted && Math.abs(this.mCameraExposurePositions[0] - f10) < 0.1d && Math.abs(this.mCameraExposurePositions[1] - f11) < 0.1d) {
                        return 0;
                    }
                    float[] fArr = this.mCameraExposurePositions;
                    fArr[0] = f10;
                    fArr[1] = f11;
                    String str = TAG;
                    Logging.i(str, "setExposure called camera api2 " + f10 + C5444x.f55808b + f11);
                    if (f10 < 0.0f || f10 > this.mRenderView.getWidth() || f11 < 0.0f || f11 > this.mRenderView.getHeight()) {
                        Logging.e(str, "set exposure unreasonable inputs");
                        return -1;
                    }
                    Rect rect = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
                    if (rect == null) {
                        return -1;
                    }
                    RectF rectF = new RectF(f10, f11, f10, f11);
                    int width = this.mRenderView.getWidth();
                    int height = this.mRenderView.getHeight();
                    VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
                    int i10 = videoCaptureFormat.mWidth;
                    int i11 = videoCaptureFormat.mHeight;
                    int i12 = this.mId;
                    RectF viewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i10, i11, i12 == 1, (i12 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
                    if (viewToNormalized == null) {
                        Logging.i(str, "setExposure coordinate " + f10 + " - " + f11 + " out of image bounds!!");
                        return -1;
                    }
                    float f12 = viewToNormalized.left;
                    float f13 = viewToNormalized.top;
                    RectF rectF2 = new RectF();
                    rectF2.left = CoordinatesTransform.clamp(f12 - 0.05f, 0.0f, 1.0f);
                    rectF2.right = CoordinatesTransform.clamp(f12 + 0.05f, 0.0f, 1.0f);
                    rectF2.top = CoordinatesTransform.clamp(f13 - 0.05f, 0.0f, 1.0f);
                    rectF2.bottom = CoordinatesTransform.clamp(f13 + 0.05f, 0.0f, 1.0f);
                    VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
                    RectF normalizedToSensor = CoordinatesTransform.normalizedToSensor(rectF2, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, rect.width(), rect.height(), (this.mId == 1 ? 1 : -1) * getCameraRotation(), true);
                    if (normalizedToSensor == null) {
                        Logging.w(str, "Failed to translate input coordinate");
                        return -1;
                    }
                    Rect rect2 = new Rect();
                    if (normalizedToSensor.width() == 0.0f || normalizedToSensor.height() == 0.0f) {
                        rect2 = new Rect(0, 0, 0, 0);
                    } else {
                        normalizedToSensor.round(rect2);
                    }
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                    if (cameraCaptureSession != null) {
                        try {
                            this.mIsmCameraExposureStarted = true;
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), null, this.mCameraThreadHandler);
                        } catch (CameraAccessException e10) {
                            e10.printStackTrace();
                            return -1;
                        } catch (IllegalArgumentException e11) {
                            e11.printStackTrace();
                            return -1;
                        } catch (IllegalStateException e12) {
                            e12.printStackTrace();
                            return -1;
                        } catch (NoClassDefFoundError e13) {
                            e13.printStackTrace();
                            return -1;
                        }
                    }
                    RectF rectF3 = new RectF(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    int width2 = rect.width();
                    int height2 = rect.height();
                    VideoCaptureFormat videoCaptureFormat3 = this.mCaptureFormat;
                    RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(rectF3, width2, height2, videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight, true);
                    int width3 = this.mRenderView.getWidth();
                    int height3 = this.mRenderView.getHeight();
                    int width4 = this.mCaptureFormat.getWidth();
                    int height4 = this.mCaptureFormat.getHeight();
                    int i13 = this.mId;
                    RectF normalizedToView = CoordinatesTransform.normalizedToView(sensorToNormalized, width3, height3, width4, height4, i13 == 1, (i13 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
                    if (normalizedToView == null) {
                        Logging.w(str, "Failed to translate coordinate from normalized to view!!");
                        return -1;
                    }
                    normalizedToView.round(rect2);
                    notifyCameraExposureAreaChanged(rect2);
                    return 0;
                }
                float[] fArr2 = this.mCameraExposurePositions;
                fArr2[0] = f10;
                fArr2[1] = f11;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setExposureCompensation(int i10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsExposureCompensationStarted && this.mCameraExposureCompensation == i10) {
                        return 0;
                    }
                    this.mCameraExposureCompensation = i10;
                    String str = TAG;
                    Logging.i(str, "setExposureCompensation:" + i10);
                    String str2 = this.mPhysicalId;
                    CameraCharacteristics cameraCharacteristics = str2 != null ? getCameraCharacteristics(str2) : getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    Rational rational = (Rational) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
                    Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
                    if (range != null && rational != null) {
                        int intValue = ((Integer) range.getUpper()).intValue();
                        int intValue2 = ((Integer) range.getLower()).intValue();
                        Logging.i(str, "compensation step=" + rational + ", min=" + intValue2 + ", max=" + intValue);
                        if (i10 > intValue) {
                            i10 = intValue;
                        }
                        if (i10 >= intValue2) {
                            intValue2 = i10;
                        }
                        if (this.mPreviewSession != null) {
                            try {
                                this.mIsExposureCompensationStarted = true;
                                this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(intValue2));
                                this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                                return 0;
                            } catch (CameraAccessException e10) {
                                e10.printStackTrace();
                            } catch (IllegalArgumentException e11) {
                                e11.printStackTrace();
                            } catch (IllegalStateException e12) {
                                e12.printStackTrace();
                            } catch (NoClassDefFoundError e13) {
                                e13.printStackTrace();
                            }
                        }
                    }
                    return -1;
                }
                this.mCameraExposureCompensation = i10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFaceDetection(boolean z10) {
        CaptureRequest.Builder builder;
        CaptureRequest.Builder builder2;
        CameraCaptureSession cameraCaptureSession;
        String str = TAG;
        Logging.i(str, "setFaceDetection:" + z10);
        synchronized (this.mSwitchLock) {
            try {
                if (this.mEnableFaceDetection == z10) {
                    Logging.w(str, "face detect no change");
                    return 0;
                }
                this.mEnableFaceDetection = z10;
                if (!this.mFaceDetectSupported) {
                    Logging.w(str, "face detect not supported");
                    return 0;
                }
                if (this.mPreviewSession != null && this.mCameraThreadHandler != null && (builder = this.mPreviewRequestBuilder) != null) {
                    if (z10) {
                        if (!this.mIsFaceDetectionStarted) {
                            this.mIsFaceDetectionStarted = true;
                            builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.mFaceDetectMode));
                        }
                    } else {
                        if (this.mEnableAutoFaceFocus) {
                            Logging.w(str, "face detect did not turn off due to autoFocus on");
                            return 0;
                        }
                        this.mIsFaceDetectionStarted = false;
                        builder.set(CaptureRequest.STATISTICS_FACE_DETECT_MODE, 0);
                        this.mPerFrameFaceDetectionInfoQueue.clear();
                    }
                    if (this.mCameraThreadHandler != null && (builder2 = this.mPreviewRequestBuilder) != null && (cameraCaptureSession = this.mPreviewSession) != null) {
                        try {
                            cameraCaptureSession.setRepeatingRequest(builder2.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                        } catch (CameraAccessException e10) {
                            e10.printStackTrace();
                        } catch (IllegalArgumentException e11) {
                            e11.printStackTrace();
                        } catch (IllegalStateException e12) {
                            e12.printStackTrace();
                        } catch (NoClassDefFoundError e13) {
                            e13.printStackTrace();
                        }
                    }
                    return 0;
                }
                Logging.w(str, "face detect not ready");
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setFocus(float f10, float f11) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null && this.mRenderView.getWidth() != 0 && this.mRenderView.getHeight() != 0) {
                    if (this.mIsmCameraFocusStarted && Math.abs(this.mCameraFocusPositions[0] - f10) < 0.1d && Math.abs(this.mCameraFocusPositions[1] - f11) < 0.1d) {
                        return 0;
                    }
                    float[] fArr = this.mCameraFocusPositions;
                    fArr[0] = f10;
                    fArr[1] = f11;
                    String str = TAG;
                    Logging.i(str, "setFocus " + f10 + " - " + f11);
                    if (f10 < 0.0f || f10 > this.mRenderView.getWidth() || f11 < 0.0f || f11 > this.mRenderView.getHeight()) {
                        Logging.e(str, "set focus unreasonable inputs");
                        return -1;
                    }
                    if (f10 <= 1.0f && f11 <= 1.0f) {
                        return setFocusByCustom(f10, f11);
                    }
                    RectF rectF = new RectF(f10, f11, f10, f11);
                    int width = this.mRenderView.getWidth();
                    int height = this.mRenderView.getHeight();
                    VideoCaptureFormat videoCaptureFormat = this.mCaptureFormat;
                    int i10 = videoCaptureFormat.mWidth;
                    int i11 = videoCaptureFormat.mHeight;
                    int i12 = this.mId;
                    RectF viewToNormalized = CoordinatesTransform.viewToNormalized(rectF, width, height, i10, i11, i12 == 1, (i12 == 1 ? 1 : -1) * getCameraRotation(), this.mRenderMode);
                    if (viewToNormalized == null) {
                        Logging.i(str, "setFocus coordinate " + f10 + " - " + f11 + " out of image bounds!!");
                        return -1;
                    }
                    Rect rect = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
                    Rect rect2 = this.mNonScaleSrop;
                    if (rect2 != null) {
                        rect = rect2;
                    }
                    if (rect == null) {
                        return -1;
                    }
                    int width2 = rect.width();
                    int height2 = rect.height();
                    float f12 = viewToNormalized.left;
                    float f13 = viewToNormalized.top;
                    RectF rectF2 = new RectF();
                    rectF2.left = CoordinatesTransform.clamp(f12 - 0.05f, 0.0f, 1.0f);
                    rectF2.right = CoordinatesTransform.clamp(f12 + 0.05f, 0.0f, 1.0f);
                    rectF2.top = CoordinatesTransform.clamp(f13 - 0.05f, 0.0f, 1.0f);
                    rectF2.bottom = CoordinatesTransform.clamp(f13 + 0.05f, 0.0f, 1.0f);
                    VideoCaptureFormat videoCaptureFormat2 = this.mCaptureFormat;
                    RectF normalizedToSensor = CoordinatesTransform.normalizedToSensor(rectF2, videoCaptureFormat2.mWidth, videoCaptureFormat2.mHeight, width2, height2, (this.mId == 1 ? 1 : -1) * getCameraRotation(), true);
                    if (normalizedToSensor == null) {
                        Logging.w(str, "Failed to translate input coordinate");
                        return -1;
                    }
                    Rect rect3 = new Rect();
                    if (normalizedToSensor.width() == 0.0f || normalizedToSensor.height() == 0.0f) {
                        rect3 = new Rect(0, 0, 0, 0);
                    } else {
                        normalizedToSensor.round(rect3);
                    }
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect3, 1000)});
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect3, 1000)});
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
                    if (this.mCameraThreadHandler != null) {
                        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                        if (cameraCaptureSession != null) {
                            try {
                                this.mIsmCameraFocusStarted = true;
                                cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), VideoCaptureCamera.shouldSkipRefocus() ? null : this.mAfCaptureCallback, this.mCameraThreadHandler);
                            } catch (CameraAccessException e10) {
                                e10.printStackTrace();
                                return -1;
                            } catch (IllegalArgumentException e11) {
                                e11.printStackTrace();
                                return -1;
                            } catch (IllegalStateException e12) {
                                e12.printStackTrace();
                                return -1;
                            }
                        }
                        VideoCaptureFormat videoCaptureFormat3 = this.mCaptureFormat;
                        RectF sensorToNormalized = CoordinatesTransform.sensorToNormalized(normalizedToSensor, width2, height2, videoCaptureFormat3.mWidth, videoCaptureFormat3.mHeight, true);
                        int width3 = this.mRenderView.getWidth();
                        int height3 = this.mRenderView.getHeight();
                        int width4 = this.mCaptureFormat.getWidth();
                        int height4 = this.mCaptureFormat.getHeight();
                        int i13 = this.mId;
                        RectF normalizedToView = CoordinatesTransform.normalizedToView(sensorToNormalized, width3, height3, width4, height4, i13 == 1, (i13 != 1 ? -1 : 1) * getCameraRotation(), this.mRenderMode);
                        if (normalizedToView == null) {
                            Logging.w(str, "Failed to translate coordinate from normalized to view!!");
                            return -1;
                        }
                        normalizedToView.round(rect3);
                        notifyCameraFocusAreaChanged(rect3);
                    }
                    return 0;
                }
                float[] fArr2 = this.mCameraFocusPositions;
                fArr2[0] = f10;
                fArr2[1] = f11;
                return 0;
            } finally {
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setNoiseReductionMode(int i10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsNoiseReducationStarted && this.mCameraNoiseReduction == i10) {
                        return -1;
                    }
                    this.mCameraNoiseReductionMode = i10;
                    this.mCameraNoiseReduction = i10;
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (i10 < 0 || i10 > 4) {
                        i10 = 0;
                    }
                    int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
                    if (isSupported(i10, iArr)) {
                        if (this.mPreviewSession != null) {
                            try {
                                Logging.i(TAG, "setNoiseReductionMode = " + i10);
                                this.mIsNoiseReducationStarted = true;
                                this.mPreviewRequestBuilder.set(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(i10));
                                this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                                return 0;
                            } catch (CameraAccessException e10) {
                                e10.printStackTrace();
                            } catch (IllegalArgumentException e11) {
                                e11.printStackTrace();
                            } catch (IllegalStateException e12) {
                                e12.printStackTrace();
                            }
                        }
                    } else if (i10 == 2 && isSupported(1, iArr) && this.mPreviewSession != null) {
                        try {
                            this.mCameraNoiseReduction = 1;
                            Logging.i(TAG, "setNoiseReductionMode = " + i10 + " ,by fallback.");
                            this.mIsNoiseReducationStarted = true;
                            this.mPreviewRequestBuilder.set(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(this.mCameraNoiseReduction));
                            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e13) {
                            e13.printStackTrace();
                        } catch (IllegalArgumentException e14) {
                            e14.printStackTrace();
                        } catch (IllegalStateException e15) {
                            e15.printStackTrace();
                        }
                    }
                    return -1;
                }
                this.mCameraNoiseReductionMode = i10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setTorchMode(boolean z10) {
        synchronized (this.mSwitchLock) {
            int i10 = z10 ? 1 : -1;
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsCameraTorchStarted && this.mTorchMode == i10) {
                        return 0;
                    }
                    this.mTorchMode = i10;
                    String str = TAG;
                    Logging.i(str, "setTorchMode called camera api2, isOn: " + z10);
                    CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        Logging.w(str, "warning cameraCharacteristics is null");
                        return -1;
                    }
                    Boolean bool = (Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    boolean booleanValue = bool == null ? false : bool.booleanValue();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("setTorchMode isFlashSupported: ");
                    sb2.append(booleanValue ? "true" : Constants.CASEFIRST_FALSE);
                    Logging.w(str, sb2.toString());
                    if (booleanValue) {
                        if (z10) {
                            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 2);
                        } else {
                            this.mPreviewRequestBuilder.set(CaptureRequest.FLASH_MODE, 0);
                        }
                        CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                        if (cameraCaptureSession != null) {
                            try {
                                cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), null, this.mCameraThreadHandler);
                                this.mIsCameraTorchStarted = true;
                                return 0;
                            } catch (CameraAccessException e10) {
                                e10.printStackTrace();
                            } catch (IllegalArgumentException e11) {
                                e11.printStackTrace();
                            } catch (IllegalStateException e12) {
                                e12.printStackTrace();
                            } catch (NoClassDefFoundError e13) {
                                e13.printStackTrace();
                            }
                        }
                    } else {
                        Logging.w(str, "flash is not supported");
                    }
                    return -1;
                }
                this.mTorchMode = i10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoEdgeMode(int i10) {
        if (this.mPreviewRequestBuilder == null) {
            Logging.i(TAG, "setVideoEdgeMode mPreviewRequestBuilder return.");
            return -1;
        }
        CameraCharacteristics cameraCharacteristics = getCameraCharacteristics(this.mId);
        if (cameraCharacteristics == null) {
            return -1;
        }
        if (isSupported(toCamera2EdgeEnhanceMode(i10), (int[]) cameraCharacteristics.get(CameraCharacteristics.EDGE_AVAILABLE_EDGE_MODES)) && this.mPreviewSession != null) {
            try {
                Logging.i(TAG, "setVideoEdgeMode = " + i10);
                this.mPreviewRequestBuilder.set(CaptureRequest.EDGE_MODE, Integer.valueOf(i10));
                this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                return 0;
            } catch (CameraAccessException e10) {
                e10.printStackTrace();
            } catch (IllegalStateException e11) {
                e11.printStackTrace();
            }
        }
        Logging.e(TAG, "not supported VideoEdge Mode = " + i10);
        return -1;
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setVideoStabilityMode(int i10) {
        CaptureRequest.Builder builder;
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && (builder = this.mPreviewRequestBuilder) != null) {
                    if (this.mIsStabilityStarted && this.mCameraVideoStabilityMode == i10) {
                        return 0;
                    }
                    this.mCameraVideoStabilityMode = i10;
                    if (builder == null) {
                        Logging.i(TAG, "setVideoStabilityMode mPreviewRequestBuilder return.");
                        return -1;
                    }
                    int camera2VideoStabilityMode = toCamera2VideoStabilityMode(i10);
                    String str = this.mPhysicalId;
                    CameraCharacteristics cameraCharacteristics = str != null ? getCameraCharacteristics(str) : getCameraCharacteristics(this.mId);
                    if (cameraCharacteristics == null) {
                        return -1;
                    }
                    if (isSupportedStability(camera2VideoStabilityMode, (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) && this.mPreviewSession != null) {
                        try {
                            Logging.i(TAG, "setVideoStabilityMode = " + i10);
                            this.mIsStabilityStarted = true;
                            this.mPreviewRequestBuilder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(camera2VideoStabilityMode));
                            this.mPreviewSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                            return 0;
                        } catch (CameraAccessException e10) {
                            e10.printStackTrace();
                        } catch (IllegalArgumentException e11) {
                            e11.printStackTrace();
                        } catch (IllegalStateException e12) {
                            e12.printStackTrace();
                        }
                    }
                    Logging.e(TAG, "not supported VideoStability Mode = " + i10);
                    return -1;
                }
                this.mCameraVideoStabilityMode = i10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCaptureCamera
    public int setZoom(float f10) {
        synchronized (this.mSwitchLock) {
            try {
                if (this.mPreviewSession != null && this.mPreviewRequestBuilder != null) {
                    if (this.mIsmCameraZoomStarted && Math.abs(this.mCameraZoomFactor - f10) < 0.1d) {
                        return 0;
                    }
                    this.mCameraZoomFactor = f10;
                    String str = TAG;
                    Logging.i(str, "setCameraZoom api2 called zoomValue =" + f10);
                    if (f10 <= 0.0f) {
                        return -1;
                    }
                    if (this.mSensorRect == null) {
                        String str2 = this.mPhysicalId;
                        CameraCharacteristics cameraCharacteristics = str2 != null ? getCameraCharacteristics(str2) : getCameraCharacteristics(this.mId);
                        if (cameraCharacteristics == null) {
                            Logging.w(str, "warning cameraCharacteristics is null");
                            return -1;
                        }
                        this.mSensorRect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                        this.mMaxZoom = getMaxZoom(cameraCharacteristics);
                    }
                    if (Math.abs(this.mMaxZoom - ZOOM_UNSUPPORTED_DEFAULT_VALUE) < 0.001f) {
                        Logging.e(str, "Camera " + this.mId + " does not support camera zoom");
                        return -1;
                    }
                    if (f10 < ZOOM_UNSUPPORTED_DEFAULT_VALUE || f10 > this.mMaxZoom || f10 == this.mLastZoomRatio) {
                        Logging.e(str, "needZoom! ");
                        return -2;
                    }
                    if (this.mNonScaleSrop == null) {
                        this.mNonScaleSrop = (Rect) this.mPreviewRequestBuilder.get(CaptureRequest.SCALER_CROP_REGION);
                    }
                    this.mPreviewRequestBuilder.set(CaptureRequest.SCALER_CROP_REGION, cropRegionForZoom(f10));
                    this.mLastZoomRatio = f10;
                    CameraCaptureSession cameraCaptureSession = this.mPreviewSession;
                    if (cameraCaptureSession != null) {
                        try {
                            this.mIsmCameraZoomStarted = true;
                            cameraCaptureSession.setRepeatingRequest(this.mPreviewRequestBuilder.build(), this.mCaptureCallback, this.mCameraThreadHandler);
                        } catch (CameraAccessException e10) {
                            e10.printStackTrace();
                            return -3;
                        } catch (IllegalArgumentException e11) {
                            e11.printStackTrace();
                            return -4;
                        } catch (IllegalStateException e12) {
                            e12.printStackTrace();
                            return -4;
                        }
                    }
                    Logging.i(str, "setCameraZoom api2 called success!");
                    return 0;
                }
                this.mCameraZoomFactor = f10;
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        String str = TAG;
        Logging.i(str, "startCaptureMaybeAsync, use Texture: " + this.mCaptureToTexture);
        changeCameraStateAndNotify(0);
        if (ContextUtils.getApplicationContext() == null || this.mProxyThreadHandler == null) {
            Logging.w(str, "context or proxyThread unavailable");
            return false;
        }
        final CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        if (cameraManager == null) {
            Logging.w(str, "startCapture error, manager null");
            return false;
        }
        final CrStateListener crStateListener = new CrStateListener();
        notifyInjector(crStateListener);
        try {
            Boolean bool = (Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.mProxyThreadHandler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Boolean>() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.3
                /* JADX WARN: Can't rename method to resolve collision */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Boolean call() {
                    try {
                        String[] cameraIdList = cameraManager.getCameraIdList();
                        if (VideoCaptureCamera2.this.mPhysicalId != null) {
                            Logging.i(VideoCaptureCamera2.TAG, "allocate openCamera camera name:" + VideoCaptureCamera2.this.mPhysicalId);
                            cameraManager.openCamera(VideoCaptureCamera2.this.mPhysicalId, crStateListener, VideoCaptureCamera2.this.mCameraThreadHandler);
                            VideoCaptureCamera2 videoCaptureCamera2 = VideoCaptureCamera2.this;
                            videoCaptureCamera2.mCameraId = videoCaptureCamera2.mPhysicalId;
                        } else {
                            if (VideoCaptureCamera2.this.mId >= cameraIdList.length) {
                                Logging.e(VideoCaptureCamera2.TAG, "Invalid camera Id: " + VideoCaptureCamera2.this.mId);
                                return Boolean.FALSE;
                            }
                            Logging.i(VideoCaptureCamera2.TAG, "allocate openCamera: " + VideoCaptureCamera2.this.mId + " camera name:" + cameraIdList[VideoCaptureCamera2.this.mId]);
                            CameraManager cameraManager2 = cameraManager;
                            VideoCaptureCamera2 videoCaptureCamera22 = VideoCaptureCamera2.this;
                            cameraManager2.openCamera(cameraIdList[videoCaptureCamera22.mId], crStateListener, videoCaptureCamera22.mCameraThreadHandler);
                            VideoCaptureCamera2 videoCaptureCamera23 = VideoCaptureCamera2.this;
                            videoCaptureCamera23.mCameraId = cameraIdList[videoCaptureCamera23.mId];
                        }
                    } catch (CameraAccessException e10) {
                        Logging.e(VideoCaptureCamera2.TAG, "allocate: manager.openCamera, by CameraAccessException: " + e10);
                        if (VideoCaptureCamera2.this.mPhysicalId == null) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera2.this.physicalFallback(cameraManager, crStateListener)) {
                            return Boolean.FALSE;
                        }
                        return Boolean.TRUE;
                    } catch (IllegalArgumentException e11) {
                        Logging.e(VideoCaptureCamera2.TAG, "allocate: manager.openCamera, by IllegalArgumentException: " + e11);
                        if (VideoCaptureCamera2.this.mPhysicalId == null) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera2.this.physicalFallback(cameraManager, crStateListener)) {
                        }
                        return Boolean.TRUE;
                    } catch (SecurityException e12) {
                        Logging.e(VideoCaptureCamera2.TAG, "allocate: manager.openCamera, by SecurityException: " + e12);
                        if (VideoCaptureCamera2.this.mPhysicalId == null) {
                            return Boolean.FALSE;
                        }
                        if (!VideoCaptureCamera2.this.physicalFallback(cameraManager, crStateListener)) {
                        }
                        return Boolean.TRUE;
                    }
                    return Boolean.TRUE;
                }
            });
            if (bool != null && bool.booleanValue()) {
                registerCameraAvailableCallback(cameraManager);
                return bool.booleanValue();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("allocate: manager.openCamera stopped: ");
            sb2.append(bool == null ? " openCamera null " : " openCamera false");
            Logging.e(str, sb2.toString());
            changeCameraStateAndNotify(4);
            return false;
        } catch (Exception unused) {
            changeCameraStateAndNotify(4);
            return false;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        String str = TAG;
        Logging.i(str, "stopCaptureAndBlockUntilStopped()");
        unRegisterAvailabilityCallback();
        Handler handler = this.mProxyThreadHandler;
        if (handler == null) {
            Logging.w(str, "proxyThread unavailable");
            return;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, VideoCaptureCamera.MAX_CAMERA_TIME_MS, new Callable<Void>() { // from class: io.agora.rtc2.video.VideoCaptureCamera2.4
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
                
                    if (r1 != null) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00dc, code lost:
                
                    r0.mSurfaceTextureHelper = null;
                    r1.stopListening();
                    r1.dispose();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:40:0x011e, code lost:
                
                    return null;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:0x011b, code lost:
                
                    if (r1 == null) goto L46;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Void call() {
                    VideoCaptureCamera2 videoCaptureCamera2;
                    ISurfaceTextureHelper iSurfaceTextureHelper;
                    synchronized (VideoCaptureCamera2.this.mCameraStateLock) {
                        while (VideoCaptureCamera2.this.mCameraState != 2 && VideoCaptureCamera2.this.mCameraState != 4 && VideoCaptureCamera2.this.mCameraState != 3) {
                            try {
                                Logging.w(VideoCaptureCamera2.TAG, "CameraStateLock wait for STARTED, STOPPED or EVICTED");
                                VideoCaptureCamera2.this.mCameraStateLock.wait();
                            } catch (InterruptedException e10) {
                                Logging.e(VideoCaptureCamera2.TAG, "CaptureStartedEvent, by InterruptedException: " + e10);
                            }
                        }
                        ISurfaceTextureHelper iSurfaceTextureHelper2 = null;
                        Object[] objArr = 0;
                        if (VideoCaptureCamera2.this.mCameraState != 4 && VideoCaptureCamera2.this.mCameraState != 3) {
                            VideoCaptureCamera2.this.changeCameraStateAndNotify(5);
                            try {
                                try {
                                    VideoCaptureCamera2 videoCaptureCamera22 = VideoCaptureCamera2.this;
                                    videoCaptureCamera22.requestFaceDetection(videoCaptureCamera22.mPreviewRequestBuilder, 0);
                                    VideoCaptureCamera2.this.mCameraThreadHandler.postAtFrontOfQueue(new StopCaptureTask());
                                    if (!VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.opened() && !VideoCaptureCamera2.this.mWaitForDeviceClosedConditionVariable.block(VideoCaptureCamera.MAX_CAMERA_TIME_MS / 2)) {
                                        Logging.e(VideoCaptureCamera2.TAG, "waiting camera device close failed after " + (VideoCaptureCamera.MAX_CAMERA_TIME_MS / 2) + "ms");
                                        throw new RuntimeException();
                                    }
                                    Logging.i(VideoCaptureCamera2.TAG, "releaseCamera done!");
                                    videoCaptureCamera2 = VideoCaptureCamera2.this;
                                    iSurfaceTextureHelper = videoCaptureCamera2.mSurfaceTextureHelper;
                                } catch (Exception e11) {
                                    Logging.e(VideoCaptureCamera2.TAG, "releaseCamera error!", e11);
                                    if (VideoCaptureCamera2.this.mCameraDevice != null) {
                                        try {
                                            VideoCaptureCamera2.this.mCameraDevice.close();
                                            VideoCaptureCamera2.this.mCameraDevice = null;
                                            Logging.i(VideoCaptureCamera2.TAG, "closeCamera done!");
                                        } catch (Exception unused) {
                                            Logging.e(VideoCaptureCamera2.TAG, "cameraDevice close error.", e11);
                                        }
                                    }
                                    videoCaptureCamera2 = VideoCaptureCamera2.this;
                                    iSurfaceTextureHelper = videoCaptureCamera2.mSurfaceTextureHelper;
                                }
                            } finally {
                                VideoCaptureCamera2 videoCaptureCamera23 = VideoCaptureCamera2.this;
                                ISurfaceTextureHelper iSurfaceTextureHelper3 = videoCaptureCamera23.mSurfaceTextureHelper;
                                if (iSurfaceTextureHelper3 != null) {
                                    videoCaptureCamera23.mSurfaceTextureHelper = null;
                                    iSurfaceTextureHelper3.stopListening();
                                    iSurfaceTextureHelper3.dispose();
                                }
                            }
                        }
                        return null;
                    }
                }
            });
        } catch (Exception e10) {
            Logging.e(TAG, "stopCaptureAndBlockUntilStopped fail: " + e10);
        }
        int i10 = this.mCameraState;
        if (i10 != 4 && i10 != 3) {
            changeCameraStateAndNotify(5);
        }
        synchronized (this.mImageReaderLock) {
            ImageReader imageReader = this.mImageReader;
            if (imageReader != null) {
                try {
                    try {
                        imageReader.setOnImageAvailableListener(null, null);
                        this.mImageReader.close();
                    } catch (IllegalStateException e11) {
                        Logging.e(TAG, "ImageReader Close():" + e11);
                    }
                } catch (IllegalArgumentException e12) {
                    Logging.e(TAG, "ImageReader Close():" + e12);
                }
                this.mImageReader = null;
            }
            ImageReader imageReader2 = this.xiaomiReader;
            if (imageReader2 != null) {
                try {
                    try {
                        imageReader2.setOnImageAvailableListener(null, null);
                        this.xiaomiReader.close();
                    } catch (IllegalStateException e13) {
                        Logging.e(TAG, "ImageReader Close():" + e13);
                    }
                } catch (IllegalArgumentException e14) {
                    Logging.e(TAG, "ImageReader Close():" + e14);
                }
                this.xiaomiReader = null;
            }
        }
        Handler handler2 = this.mCameraThreadHandler;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
            this.mCameraThreadHandler.getLooper().quitSafely();
            this.mCameraThreadHandler = null;
        }
        if (this.mSurfaceTextureHelper != null) {
            Logging.e(TAG, "waiting camera stopped failed after " + VideoCaptureCamera.MAX_CAMERA_TIME_MS + "ms");
            ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
            this.mSurfaceTextureHelper = null;
            iSurfaceTextureHelper.stopListening();
            iSurfaceTextureHelper.dispose();
        }
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        this.mIsFaceDetectionStarted = false;
        this.mIsCameraTorchStarted = false;
        this.mIsmCameraExposureStarted = false;
        this.mIsmCameraFocusStarted = false;
        this.mIsmCameraZoomStarted = false;
        this.mIsExposureCompensationStarted = false;
        this.mIsAntiBandingStarted = false;
        this.mIsEdgeEnhanceStarted = false;
        this.mIsStabilityStarted = false;
        this.mIsNoiseReducationStarted = false;
        this.mAutoFaceDetectFocusStarted = false;
        this.mPerFrameFaceDetectionInfoQueue.clear();
        Logging.i(TAG, "stopCaptureAndBlockUntilStopped done.");
    }

    private static float getMaxZoom(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            Logging.w(TAG, "warning cameraCharacteristics is null");
            return DEFAULT_VALUE;
        }
        Float f10 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f10 == null) {
            Logging.w(TAG, "warning get max zoom return null");
            return DEFAULT_VALUE;
        }
        return f10.floatValue();
    }

    private static CameraCharacteristics getCameraCharacteristics(String str) {
        CameraCharacteristics cameraCharacteristics;
        if (str == null) {
            return null;
        }
        boolean cameraCacheNumbers = VideoCaptureFactory.ChromiumCameraInfo.getCameraCacheNumbers();
        if (cameraCacheNumbers && (cameraCharacteristics = cameraCharacteristicMaps.get(str)) != null) {
            return cameraCharacteristics;
        }
        CameraManager cameraManager = (CameraManager) ContextUtils.getApplicationContext().getSystemService("camera");
        if (cameraManager == null) {
            Logging.e(TAG, "getCameraCharacteristics error,  manager null");
            return null;
        }
        try {
            mCameraIds = cameraManager.getCameraIdList();
            if (mCameraIds.length == 0) {
                Logging.e(TAG, "getCameraCharacteristics error,  length 0");
                return null;
            }
            String[] strArr = mCameraIds;
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (strArr[i10].contains(str)) {
                        break;
                    }
                    i10++;
                } else {
                    Logging.i(TAG, "physical cameraId: " + str);
                    break;
                }
            }
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str);
            if (cameraCacheNumbers) {
                cameraCharacteristicMaps.put(str, cameraCharacteristics2);
            }
            return cameraCharacteristics2;
        } catch (CameraAccessException e10) {
            Logging.e(TAG, "getCameraCharacteristics, CameraAccessException: " + e10);
            return null;
        } catch (AssertionError e11) {
            Logging.e(TAG, "getCameraCharacteristics, AssertionError: " + e11);
            return null;
        } catch (IllegalArgumentException e12) {
            Logging.e(TAG, "getCameraCharacteristics, IllegalArgumentException: " + e12);
            return null;
        } catch (Exception e13) {
            Logging.e(TAG, "getCameraCharacteristics, Exception: " + e13);
            return null;
        }
    }
}
