package io.agora.meta.internal;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.meta.EnterSceneConfig;
import io.agora.meta.ILocalUserAvatar;
import io.agora.meta.IMetaScene;
import io.agora.meta.IMetaSceneEventHandler;
import io.agora.meta.SceneDisplayConfig;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MetaSceneImpl extends IMetaScene {
    private static final String TAG = "MetaSceneImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private final ILocalUserAvatar mLocalUserAvatar;
    private long mNativeHandle;

    @CalledByNative
    public MetaSceneImpl(long j10) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = j10;
        this.mLocalUserAvatar = new LocalUserAvatarImpl(nativeGetLocalUserAvatar(j10));
    }

    private native int nativeAddEventHandler(long j10, Object obj);

    private native int nativeAddSceneView(long j10, TextureView textureView, SceneDisplayConfig sceneDisplayConfig);

    private static native int nativeDestroy(long j10);

    private native int nativeEnableFaceCapture(long j10, boolean z10);

    private native int nativeEnableSceneVideoCapture(long j10, TextureView textureView, boolean z10);

    private native int nativeEnableVideoDisplay(long j10, String str, boolean z10);

    private native int nativeEnterScene(long j10, EnterSceneConfig enterSceneConfig);

    private native long nativeGetLocalUserAvatar(long j10);

    private native int nativeLeaveScene(long j10);

    private native int nativePushAgoraVideoFrameToDisplay(long j10, String str, int i10, byte[] bArr, int i11, int i12, long j11);

    private native int nativePushVideoFrameToDisplay(long j10, String str, VideoFrame videoFrame);

    private native int nativeRemoveEventHandler(long j10, Object obj);

    private native int nativeRemoveSceneView(long j10, TextureView textureView);

    private native int nativeSendSceneMessage(long j10, byte[] bArr);

    private native int nativeSetSceneParameters(long j10, String str);

    @Override // io.agora.meta.IMetaScene
    public int addEventHandler(IMetaSceneEventHandler iMetaSceneEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(addEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (addEventHandler)");
                    return -7;
                }
                return nativeAddEventHandler(j10, iMetaSceneEventHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int addSceneView(TextureView textureView, SceneDisplayConfig sceneDisplayConfig) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(addSceneView)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (addSceneView)");
                    return -7;
                }
                return nativeAddSceneView(j10, textureView, sceneDisplayConfig);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableFaceCapture(boolean z10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enableFaceCapture)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enableFaceCapture)");
                    return -7;
                }
                return nativeEnableFaceCapture(j10, z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableSceneVideoCapture(TextureView textureView, boolean z10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enableSceneVideoCapture)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enableSceneVideoCapture)");
                    return -7;
                }
                return nativeEnableSceneVideoCapture(j10, textureView, z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableVideoDisplay(String str, boolean z10) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enableVideoDisplay)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enableVideoDisplay)");
                    return -7;
                }
                return nativeEnableVideoDisplay(j10, str, z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enterScene(EnterSceneConfig enterSceneConfig) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enterScene)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enterScene)");
                    return -7;
                }
                return nativeEnterScene(j10, enterSceneConfig);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public ILocalUserAvatar getLocalUserAvatar() {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(getLocalUserAvatar)");
            return null;
        }
        synchronized (this) {
            try {
                if (this.mNativeHandle == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (getLocalUserAvatar)");
                    return null;
                }
                return this.mLocalUserAvatar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int leaveScene() {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(leaveScene)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (leaveScene)");
                    return -7;
                }
                return nativeLeaveScene(j10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int pushVideoFrameToDisplay(String str, VideoFrame videoFrame) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(pushVideoFrameToDisplay(VideoFrame))");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (pushVideoFrameToDisplay)");
                    return -7;
                }
                return nativePushVideoFrameToDisplay(j10, str, videoFrame);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int release() {
        if (this.mNativeHandle != 0) {
            this.mIsDestroying.set(true);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
            this.mIsDestroying.set(false);
        }
        return 0;
    }

    @Override // io.agora.meta.IMetaScene
    public int removeEventHandler(IMetaSceneEventHandler iMetaSceneEventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(removeEventHandler)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (removeEventHandler)");
                    return -7;
                }
                return nativeRemoveEventHandler(j10, iMetaSceneEventHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int removeSceneView(TextureView textureView) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(removeSceneView)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (removeSceneView)");
                    return -7;
                }
                return nativeRemoveSceneView(j10, textureView);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int sendSceneMessage(byte[] bArr) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(sendSceneMessage)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (sendSceneMessage)");
                    return -7;
                }
                return nativeSendSceneMessage(j10, bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int setSceneParameters(String str) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(setSceneParameters)");
            return -8;
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (setSceneParameters)");
                    return -7;
                }
                return nativeSetSceneParameters(j10, str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int pushVideoFrameToDisplay(String str, AgoraVideoFrame agoraVideoFrame) {
        Throwable th2;
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(pushVideoFrameToDisplay(AgoraVideoFrame))");
            return -8;
        }
        synchronized (this) {
            try {
                try {
                    long j10 = this.mNativeHandle;
                    if (j10 != 0) {
                        return nativePushAgoraVideoFrameToDisplay(j10, str, agoraVideoFrame.format, agoraVideoFrame.buf, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.timeStamp);
                    }
                    try {
                        Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (pushVideoFrameToDisplay)");
                        return -7;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }
}
