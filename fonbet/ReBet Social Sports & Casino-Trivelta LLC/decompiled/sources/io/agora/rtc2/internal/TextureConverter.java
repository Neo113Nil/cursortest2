package io.agora.rtc2.internal;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Build;
import androidx.annotation.NonNull;
import io.agora.base.TextureBufferHelper;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.GlRectDrawer;
import io.agora.base.internal.video.GlTextureFrameBuffer;
import io.agora.base.internal.video.GlUtil;
import io.agora.base.internal.video.VideoFrameDrawer;
import io.agora.rtc2.gl.EglBaseProvider;
import io.agora.utils2.internal.Logging;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class TextureConverter {
    private static final String TAG = "TextureConverter";
    private GlTextureFrameBuffer textureFrameBuffer;
    private static List<String> GL_LOCK_LIST = Arrays.asList("DUA-AL00");
    private static boolean UseConverterGlFinish = false;
    private EglBase.Context eglContext = null;
    private TextureBufferHelper textureBufferHelper = null;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    private final Matrix drawMatrix = new Matrix();

    @CalledByNative
    public TextureConverter() {
        Logging.d(TAG, "constructor()");
    }

    private boolean configEglEnv(@NonNull EglBase.Context context) {
        TextureBufferHelper create = TextureBufferHelper.create("AgConvertor", context);
        this.textureBufferHelper = create;
        if (create == null) {
            Logging.e(TAG, "Failed to create texture buffer helper.");
            return false;
        }
        this.eglContext = context;
        return true;
    }

    private boolean reconfigEglEnv(EglBase.Context context) {
        if (context == null) {
            return false;
        }
        if (context.equals(this.eglContext)) {
            return true;
        }
        Logging.d(TAG, "reconfigEglEnv(()");
        releaseEglEnv();
        return configEglEnv(context);
    }

    private void releaseEglEnv() {
        TextureBufferHelper textureBufferHelper = this.textureBufferHelper;
        if (textureBufferHelper != null) {
            if (this.textureFrameBuffer != null) {
                textureBufferHelper.invoke(new Callable<Object>() { // from class: io.agora.rtc2.internal.TextureConverter.2
                    @Override // java.util.concurrent.Callable
                    public Object call() {
                        if (TextureConverter.this.textureFrameBuffer != null) {
                            TextureConverter.this.textureFrameBuffer.release();
                        }
                        TextureConverter.this.textureFrameBuffer = null;
                        return null;
                    }
                });
            }
            this.textureBufferHelper.dispose();
            this.textureBufferHelper = null;
        }
        this.eglContext = null;
    }

    @CalledByNative
    public static void setUseGlfinishInConverter(boolean z10) {
        Logging.i(TAG, "setUseGlfinishInConverter " + z10);
        UseConverterGlFinish = z10;
    }

    @CalledByNative
    public VideoFrame convert(final VideoFrame videoFrame) {
        if (videoFrame == null || videoFrame.getBuffer() == null) {
            return null;
        }
        EglBase.Context eglBaseContext = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer ? ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).getEglBaseContext() : null;
        if (videoFrame.getBuffer() instanceof VideoFrame.I420Buffer) {
            eglBaseContext = EglBaseProvider.instance().getRootEglBase().getEglBaseContext();
        }
        if (eglBaseContext == null) {
            return null;
        }
        if (reconfigEglEnv(eglBaseContext)) {
            return (VideoFrame) this.textureBufferHelper.invoke(new Callable<VideoFrame>() { // from class: io.agora.rtc2.internal.TextureConverter.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoFrame call() {
                    if (TextureConverter.this.textureBufferHelper.isTextureInUse()) {
                        Logging.e(TextureConverter.TAG, "failed to convert, texture in use");
                        return null;
                    }
                    if (TextureConverter.this.textureFrameBuffer == null) {
                        TextureConverter.this.textureFrameBuffer = new GlTextureFrameBuffer(6408);
                    }
                    int rotatedWidth = videoFrame.getRotatedWidth();
                    int rotatedHeight = videoFrame.getRotatedHeight();
                    int rotation = videoFrame.getRotation() % 360;
                    if (rotation == 90 || rotation == 270) {
                        int i10 = rotatedWidth ^ rotatedHeight;
                        rotatedHeight ^= i10;
                        rotatedWidth = i10 ^ rotatedHeight;
                    }
                    int i11 = rotatedWidth;
                    int i12 = rotatedHeight;
                    TextureConverter.this.textureFrameBuffer.setSize(i11, i12);
                    GLES20.glBindFramebuffer(36160, TextureConverter.this.textureFrameBuffer.getFrameBufferId());
                    GlUtil.checkNoGLES2Error("VideoFrameRotator.glBindFramebuffer");
                    GLES20.glClear(16384);
                    TextureConverter.this.frameDrawer.convertByDrawFrame(videoFrame, TextureConverter.this.textureDrawer, TextureConverter.this.drawMatrix, 0, 0, i11, i12);
                    GlUtil.checkNoGLES2Error("VideoFrameRotator.drawFrame");
                    GLES20.glBindFramebuffer(36160, 0);
                    if (TextureConverter.UseConverterGlFinish || TextureConverter.GL_LOCK_LIST.contains(Build.MODEL)) {
                        GLES20.glFinish();
                    } else {
                        GLES20.glFlush();
                    }
                    return new VideoFrame(TextureConverter.this.textureBufferHelper.wrapTextureBuffer(i11, i12, VideoFrame.TextureBuffer.Type.RGB, TextureConverter.this.textureFrameBuffer.getTextureId(), new Matrix()), videoFrame.getRotation(), videoFrame.getTimestampNs());
                }
            });
        }
        Logging.e(TAG, "failed to reconfig egl env");
        return null;
    }

    @CalledByNative
    public void dispose() {
        Logging.d(TAG, "dispose()");
        releaseEglEnv();
    }
}
