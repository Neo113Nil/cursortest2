package io.agora.rtc2.video;

import android.annotation.TargetApi;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.ConditionVariable;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import io.agora.base.VideoFrame;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.ISurfaceTextureHelper;
import io.agora.base.internal.video.SurfaceTextureHelper;
import io.agora.base.internal.video.TimerSurfaceTextureHelper;
import java.util.Locale;

@TargetApi(21)
/* loaded from: classes3.dex */
public class VideoCaptureScreen extends VideoCapture implements SurfaceTextureHelper.IVideoCapture {
    private static final int DISPLAY_FLAGS = 3;
    private static final String TAG = "VideoCaptureScreen";
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private int lastRotation;
    private int mFramerate;
    private int mHeight;
    private MediaProjection mMediaProjection;
    private MediaProjection.Callback mMediaProjectionCallback;
    private MediaProjectionManager mMediaProjectionManager;
    private final Intent mMediaProjectionPermissionResultData;
    private VirtualDisplay mVirtualDisplay;
    private ConditionVariable mWaitForDeviceClosedConditionVariable;
    private int mWidth;

    public VideoCaptureScreen(long j10, EglBase.Context context, Intent intent) {
        super(j10, TimerSurfaceTextureHelper.create("ScreenCapturerThread", context));
        this.mMediaProjectionCallback = new MediaProjection.Callback() { // from class: io.agora.rtc2.video.VideoCaptureScreen.1
            @Override // android.media.projection.MediaProjection.Callback
            public void onStop() {
                Logging.w(VideoCaptureScreen.TAG, "media projection stopped");
            }
        };
        this.mWaitForDeviceClosedConditionVariable = new ConditionVariable();
        this.lastRotation = -1;
        this.mMediaProjectionPermissionResultData = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createVirtualDisplay() {
        ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
        if (iSurfaceTextureHelper == null || this.mMediaProjection == null) {
            return;
        }
        iSurfaceTextureHelper.setTextureSize(this.mWidth, this.mHeight);
        this.mVirtualDisplay = this.mMediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.mWidth, this.mHeight, 400, 3, new Surface(this.mSurfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean allocate(@NonNull VideoCaptureFormat videoCaptureFormat) {
        int i10;
        Logging.d(TAG, String.format(Locale.US, "allocate: requested (%d x %d) %d", Integer.valueOf(videoCaptureFormat.mWidth), Integer.valueOf(videoCaptureFormat.mHeight), Integer.valueOf(videoCaptureFormat.mFramerate)));
        int i11 = videoCaptureFormat.mFramerate;
        if (i11 <= 0) {
            throw new IllegalArgumentException("invalid frame rate");
        }
        this.mFramerate = i11;
        int i12 = videoCaptureFormat.mWidth;
        if (i12 == 0 || (i10 = videoCaptureFormat.mHeight) == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) ContextUtils.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.mWidth = displayMetrics.widthPixels;
            this.mHeight = displayMetrics.heightPixels;
        } else {
            this.mWidth = i12;
            this.mHeight = i10;
        }
        this.mCaptureFormat = new VideoCaptureFormat(this.mWidth, this.mHeight, videoCaptureFormat.getFramerate(), videoCaptureFormat.getPixelFormat());
        this.mMediaProjectionManager = (MediaProjectionManager) ContextUtils.getApplicationContext().getSystemService("media_projection");
        return true;
    }

    public synchronized void changeCaptureFormat(int i10, int i11, int i12) {
        Logging.d(TAG, "changeCaptureFormat, " + i10 + " x " + i11);
        this.mWidth = i10;
        this.mHeight = i11;
        if (this.mVirtualDisplay == null) {
            return;
        }
        ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
        if (iSurfaceTextureHelper == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(iSurfaceTextureHelper.getHandler(), new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureScreen.3
            @Override // java.lang.Runnable
            public void run() {
                VideoCaptureScreen.this.mVirtualDisplay.release();
                VideoCaptureScreen.this.createVirtualDisplay();
            }
        });
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void deallocate() {
        Logging.d(TAG, "deallocate()");
    }

    @Override // io.agora.base.internal.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        int deviceRotation = getDeviceRotation();
        if (this.lastRotation != deviceRotation) {
            this.lastRotation = deviceRotation;
            changeCaptureFormat(this.mHeight, this.mWidth, 15);
        }
        onFrameCaptured(videoFrame);
    }

    @Override // io.agora.rtc2.video.VideoCapture, io.agora.base.internal.video.SurfaceTextureHelper.IVideoCapture
    public void onFrameDropped(int i10) {
        super.onFrameDropped(i10);
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public boolean startCaptureMaybeAsync() {
        Logging.d(TAG, "startCaptureMaybeAsync()");
        try {
            MediaProjection mediaProjection = this.mMediaProjectionManager.getMediaProjection(-1, this.mMediaProjectionPermissionResultData);
            this.mMediaProjection = mediaProjection;
            if (mediaProjection == null) {
                Logging.e(TAG, "getMediaProjection error. invalid mediaProjectionPermissionResultData");
                return false;
            }
            if (this.mSurfaceTextureHelper == null) {
                Logging.e(TAG, "SurfaceTextureHelper null");
                return false;
            }
            this.lastRotation = getDeviceRotation();
            this.mMediaProjection.registerCallback(this.mMediaProjectionCallback, this.mSurfaceTextureHelper.getHandler());
            createVirtualDisplay();
            ((TimerSurfaceTextureHelper) this.mSurfaceTextureHelper).setFrameRate(this.mFramerate);
            this.mSurfaceTextureHelper.startListening(this);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "Failed to getMediaProjection, IllegalStateException!", e10);
            return false;
        } catch (SecurityException e11) {
            Logging.e(TAG, "Failed to getMediaProjection, you should start a foreground service before capture screen!", e11);
            return false;
        }
    }

    @Override // io.agora.rtc2.video.IVideoCapture
    public void stopCaptureAndBlockUntilStopped() {
        Logging.d(TAG, "stopCaptureAndBlockUntilStopped()");
        ISurfaceTextureHelper iSurfaceTextureHelper = this.mSurfaceTextureHelper;
        if (iSurfaceTextureHelper == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(iSurfaceTextureHelper.getHandler(), new Runnable() { // from class: io.agora.rtc2.video.VideoCaptureScreen.2
            @Override // java.lang.Runnable
            public void run() {
                VideoCaptureScreen.this.mSurfaceTextureHelper.stopListening();
                if (VideoCaptureScreen.this.mVirtualDisplay != null) {
                    VideoCaptureScreen.this.mVirtualDisplay.release();
                    VideoCaptureScreen.this.mVirtualDisplay = null;
                }
                if (VideoCaptureScreen.this.mMediaProjection != null) {
                    VideoCaptureScreen.this.mMediaProjection.unregisterCallback(VideoCaptureScreen.this.mMediaProjectionCallback);
                    try {
                        try {
                            VideoCaptureScreen.this.mMediaProjection.stop();
                        } catch (Exception e10) {
                            Logging.e(VideoCaptureScreen.TAG, "Exception when stopCaptureAndBlockUntilStopped: " + e10.getMessage());
                        }
                    } finally {
                        VideoCaptureScreen.this.mMediaProjection = null;
                    }
                }
                VideoCaptureScreen.this.mWaitForDeviceClosedConditionVariable.open();
            }
        });
        this.mWaitForDeviceClosedConditionVariable.block();
    }
}
