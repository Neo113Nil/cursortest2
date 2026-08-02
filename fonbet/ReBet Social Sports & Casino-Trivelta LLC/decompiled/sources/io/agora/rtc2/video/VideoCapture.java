package io.agora.rtc2.video;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import io.agora.base.TextureBuffer;
import io.agora.base.VideoFrame;
import io.agora.base.VideoFrameMetaInfo;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.ISurfaceTextureHelper;
import io.agora.base.internal.video.SurfaceTextureHelper;
import io.agora.rtc2.video.IVideoCapture;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Observable;

/* loaded from: classes3.dex */
public abstract class VideoCapture implements IVideoCapture {
    public static final boolean DEBUG_MODE = false;
    public static final int ERR_FAILED = 1;
    public static final int ERR_INVALID_ARGUMENT = 2;
    public static final int ERR_NOT_READY = 3;
    public static final int ERR_NOT_SUPPORTED = 4;
    public static final int ERR_OK = 0;
    public static final int PQFIRST_TYPE_DIFF_MODE = 1;
    public static final int PQFIRST_TYPE_MINIMUM_LIMIT_MODE = 2;
    public static final int PQFIRST_TYPE_NORMAL = 0;
    private static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";
    protected int mCameraNativeOrientation;
    protected VideoCaptureFormat mCaptureFormat;
    private IVideoCapture.Events mEventsCallback;
    private Observable mInjector;
    protected boolean mInvertDeviceOrientationReadings;
    protected final long mNativeVideoCaptureAndroid;
    protected boolean mPQFirst;
    protected int mPQFirstType;
    protected Handler mProxyThreadHandler;
    protected ISurfaceTextureHelper mSurfaceTextureHelper;

    public @interface AndroidFillLightMode {
        public static final int AUTO = 2;
        public static final int FLASH = 3;
        public static final int NOT_SET = 0;
        public static final int OFF = 1;
    }

    public @interface AndroidImageFormat {
        public static final int NV21 = 17;
        public static final int UNKNOWN = 0;
        public static final int YUV_420_888 = 35;
        public static final int YUY2 = 20;
        public static final int YV12 = 842094169;
    }

    public @interface AndroidMeteringMode {
        public static final int CONTINUOUS = 4;
        public static final int FIXED = 2;
        public static final int NONE = 1;
        public static final int NOT_SET = 0;
        public static final int SINGLE_SHOT = 3;
    }

    public @interface AndroidVideoCaptureDropType {
        public static final int CAPTURER_DEFENSIVE_PROGRAMMING = 100201;
        public static final int CAPTURER_DO_COPY_FAIL = 100204;
    }

    public @interface AndroidVideoCaptureError {
        public static final int kCameraErrorCameraDevice = 4;
        public static final int kCameraErrorCameraDisabled = 3;
        public static final int kCameraErrorCameraInUse = 1;
        public static final int kCameraErrorCameraService = 5;
        public static final int kCameraErrorConfigureInitiation = 100;
        public static final int kCameraErrorConfigureRequest = 102;
        public static final int kCameraErrorConfigureSession = 101;
        public static final int kCameraErrorDeviceNotFound = 7;
        public static final int kCameraErrorDisconnected = 6;
        public static final int kCameraErrorMaxCamerasInUse = 2;
        public static final int kCameraErrorNoPermission = 8;
        public static final int kCameraErrorRuntimeUnknown = 901;
        public static final int kVideoCaptureEventNone = 0;
    }

    public @interface CAMERA_DIRECTION {
        public static final int CAMERA_FRONT = 1;
        public static final int CAMERA_REAR = 0;
    }

    public static class FramerateRange {
        public int max;
        public int min;

        public FramerateRange(int i10, int i11) {
            this.min = i10;
            this.max = i11;
        }

        public String toString() {
            return "{\"min\":" + this.min + ",\"max\":" + this.max + '}';
        }
    }

    public @interface VideoCaptureApi {
        public static final int ANDROID_API1 = 6;
        public static final int ANDROID_API2_FULL = 8;
        public static final int ANDROID_API2_LEGACY = 7;
        public static final int ANDROID_API2_LIMITED = 9;
        public static final int LINUX_V4L2_SINGLE_PLANE = 0;
        public static final int MACOSX_AVFOUNDATION = 4;
        public static final int MACOSX_DECKLINK = 5;
        public static final int UNKNOWN = 11;
        public static final int VIRTUAL_DEVICE = 10;
        public static final int WIN_DIRECT_SHOW = 3;
        public static final int WIN_MEDIA_FOUNDATION = 1;
        public static final int WIN_MEDIA_FOUNDATION_SENSOR = 2;
    }

    public @interface VideoCaptureTransportType {
        public static final int MACOSX_USB_OR_BUILT_IN = 0;
        public static final int OTHER_TRANSPORT = 1;
    }

    public @interface VideoFacingMode {
        public static final int MEDIA_VIDEO_FACING_ENVIRONMENT = 2;
        public static final int MEDIA_VIDEO_FACING_NONE = 0;
        public static final int MEDIA_VIDEO_FACING_USER = 1;
        public static final int NUM_MEDIA_VIDEO_FACING_MODES = 3;
    }

    public VideoCapture(long j10, EglBase.Context context, int i10) {
        this(j10, SurfaceTextureHelper.create(VIDEO_CAPTURER_THREAD_NAME, context, i10, 0));
    }

    public static VideoCaptureFormat FindBestMatchedCapability(List<VideoCaptureFormat> list, VideoCaptureFormat videoCaptureFormat) {
        if (list == null || videoCaptureFormat == null) {
            return null;
        }
        return nativeFindBestMatchedCapability(list, videoCaptureFormat);
    }

    public static VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(TextureBuffer textureBuffer, boolean z10, int i10) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z10) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i10);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBuffer.applyTransformMatrix(matrix, textureBuffer.getWidth(), textureBuffer.getHeight());
    }

    public static native VideoCaptureFormat nativeFindBestMatchedCapability(List<VideoCaptureFormat> list, VideoCaptureFormat videoCaptureFormat);

    private native int nativeGetDisplayRotation(long j10);

    private native void nativeOnAvailable(long j10, int i10);

    private native void nativeOnError(long j10, int i10, String str);

    private native void nativeOnFrameCaptured(long j10, int i10, int i11, int i12, long j11, int i13, boolean z10, VideoFrame.Buffer buffer, VideoFrameMetaInfo videoFrameMetaInfo);

    private native void nativeOnFrameDropped(long j10, int i10);

    private native void nativeOnI420FrameAvailable(long j10, ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, long j11, int i16, boolean z10, VideoFrameMetaInfo videoFrameMetaInfo);

    private native void nativeOnStarted(long j10);

    private native void nativeUpdateRealCaptureFpsStatsOnFrameCaptured(long j10);

    public boolean allocate(int i10, int i11, int i12) {
        return allocate(new VideoCaptureFormat(i10, i11, i12, 0));
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void dispose() {
        Handler handler = this.mProxyThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mProxyThreadHandler.getLooper().quitSafely();
            this.mProxyThreadHandler = null;
        }
    }

    public final int getCameraRotation() {
        return (this.mCameraNativeOrientation + (this.mInvertDeviceOrientationReadings ? 360 - getDeviceRotation() : getDeviceRotation())) % 360;
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public VideoCaptureFormat getCaptureFormat() {
        return this.mCaptureFormat;
    }

    public final int getDeviceRotation() {
        int displayRotation = getDisplayRotation();
        if (displayRotation == 1) {
            return 90;
        }
        if (displayRotation != 2) {
            return displayRotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public int getDisplayRotation() {
        long j10 = this.mNativeVideoCaptureAndroid;
        if (j10 != 0) {
            return nativeGetDisplayRotation(j10);
        }
        return -1;
    }

    public Handler getProxyThreadHandler() {
        return this.mProxyThreadHandler;
    }

    public ISurfaceTextureHelper getSurfaceTextureHelper() {
        return this.mSurfaceTextureHelper;
    }

    public void notifyInjector(Object obj) {
        Observable observable = this.mInjector;
        if (observable != null) {
            observable.notifyObservers(obj);
        }
    }

    public void onAvailable(int i10) {
        IVideoCapture.Events events = this.mEventsCallback;
        if (events != null) {
            events.onAvailable(i10);
            return;
        }
        long j10 = this.mNativeVideoCaptureAndroid;
        if (j10 != 0) {
            nativeOnAvailable(j10, i10);
        }
    }

    public void onError(int i10, String str) {
        IVideoCapture.Events events = this.mEventsCallback;
        if (events != null) {
            events.onError(i10, str);
            return;
        }
        long j10 = this.mNativeVideoCaptureAndroid;
        if (j10 != 0) {
            nativeOnError(j10, i10, str);
        }
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        IVideoCapture.Events events = this.mEventsCallback;
        if (events != null) {
            events.onFrameCaptured(videoFrame);
        } else {
            nativeOnFrameCaptured(this.mNativeVideoCaptureAndroid, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs(), this.mCameraNativeOrientation, !this.mInvertDeviceOrientationReadings, videoFrame.getBuffer(), videoFrame.getMetaInfo());
        }
    }

    public void onFrameDropped(int i10) {
        IVideoCapture.Events events = this.mEventsCallback;
        if (events != null) {
            events.onFrameDropped(i10);
        } else {
            nativeOnFrameDropped(this.mNativeVideoCaptureAndroid, i10);
        }
    }

    public void onI420FrameAvailable(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i11, int i12, int i13, int i14, int i15, long j10, VideoFrameMetaInfo videoFrameMetaInfo) {
        IVideoCapture.Events events = this.mEventsCallback;
        if (events != null) {
            events.onI420FrameAvailable(byteBuffer, i10, byteBuffer2, byteBuffer3, i11, i12, i13, i14, i15, j10, videoFrameMetaInfo);
        } else {
            nativeOnI420FrameAvailable(this.mNativeVideoCaptureAndroid, byteBuffer, i10, byteBuffer2, byteBuffer3, i11, i12, i13, i14, i15, j10, this.mCameraNativeOrientation, !this.mInvertDeviceOrientationReadings, videoFrameMetaInfo);
        }
    }

    public void onStarted() {
        IVideoCapture.Events events = this.mEventsCallback;
        if (events != null) {
            events.onStarted();
        } else {
            nativeOnStarted(this.mNativeVideoCaptureAndroid);
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void setEventsCallback(IVideoCapture.Events events) {
        this.mEventsCallback = events;
    }

    public void setInjector(Observable observable) {
        this.mInjector = observable;
    }

    public void updateRealCaptureFpsStatsOnFrameCaptured() {
        long j10 = this.mNativeVideoCaptureAndroid;
        if (j10 != 0) {
            nativeUpdateRealCaptureFpsStatsOnFrameCaptured(j10);
        }
    }

    public VideoCapture(long j10, ISurfaceTextureHelper iSurfaceTextureHelper) {
        this.mPQFirst = false;
        this.mPQFirstType = 0;
        this.mNativeVideoCaptureAndroid = j10;
        this.mSurfaceTextureHelper = iSurfaceTextureHelper;
        HandlerThread handlerThread = new HandlerThread("VideoCaptureCamera_ProxyThread");
        handlerThread.start();
        this.mProxyThreadHandler = new Handler(handlerThread.getLooper());
    }
}
