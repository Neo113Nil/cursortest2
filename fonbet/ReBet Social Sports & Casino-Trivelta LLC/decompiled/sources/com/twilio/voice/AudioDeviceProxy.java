package com.twilio.voice;

import android.content.Context;
import androidx.annotation.NonNull;
import com.twilio.voice.ThreadUtils;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
class AudioDeviceProxy extends AudioDeviceContext implements AudioDevice {
    private static final Logger logger = Logger.getLogger(AudioDeviceProxy.class);
    private static long nativeAudioDeviceProxyHandle;
    private AudioDevice audioDevice;
    ThreadUtils.ThreadChecker threadChecker;
    private boolean released = false;
    private boolean capturingStopped = false;
    private boolean renderingStopped = false;

    private AudioDeviceProxy(Context context, long j10, AudioDevice audioDevice) {
        nativeAudioDeviceProxyHandle = j10;
        this.audioDevice = audioDevice;
    }

    private void checkIsOnValidThread() {
        if (this.threadChecker == null) {
            this.threadChecker = new ThreadUtils.ThreadChecker(Thread.currentThread());
        }
        this.threadChecker.checkIsOnValidThread();
    }

    private boolean isValid() {
        if (this.renderingStopped || this.released) {
            return (this.capturingStopped || this.released) ? false : true;
        }
        return true;
    }

    private static native void nativeExecuteWorkerBlock(long j10, Runnable runnable);

    private static native void nativeFormatChanged(long j10, AudioFormat audioFormat, AudioFormat audioFormat2);

    private static native void nativeReadData(long j10, ByteBuffer byteBuffer, int i10);

    private static native void nativeRelease(long j10);

    private static native void nativeWriteData(long j10, ByteBuffer byteBuffer, int i10);

    public void executeWorkerBlock(Runnable runnable) {
        if (isValid()) {
            nativeExecuteWorkerBlock(nativeAudioDeviceProxyHandle, runnable);
        } else {
            logger.w("Calling executeWorkerBlock not a valid operation");
        }
    }

    public void formatChanged() {
        Logger logger2 = logger;
        logger2.d("formatChanged");
        if (isValid()) {
            nativeFormatChanged(nativeAudioDeviceProxyHandle, this.audioDevice.getCapturerFormat(), this.audioDevice.getRendererFormat());
        } else {
            logger2.w("Calling formatChanged not a valid operation");
        }
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public AudioFormat getCapturerFormat() {
        return null;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public AudioFormat getRendererFormat() {
        return null;
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onInitCapturer() {
        logger.d("onInitCapturer");
        checkIsOnValidThread();
        this.capturingStopped = false;
        if (this.released) {
            return true;
        }
        try {
            this.audioDevice.onInitCapturer();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onInitRenderer() {
        logger.d("onInitRenderer");
        checkIsOnValidThread();
        this.renderingStopped = false;
        if (this.released) {
            return true;
        }
        try {
            this.audioDevice.onInitRenderer();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onStartCapturing(@NonNull AudioDeviceContext audioDeviceContext) {
        logger.d("onStartCapturing");
        checkIsOnValidThread();
        if (this.released) {
            return true;
        }
        try {
            this.audioDevice.onStartCapturing(this);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onStartRendering(@NonNull AudioDeviceContext audioDeviceContext) {
        logger.d("onStartRendering");
        checkIsOnValidThread();
        if (this.released) {
            return true;
        }
        try {
            this.audioDevice.onStartRendering(this);
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onStopCapturing() {
        logger.d("onStopCapturing");
        checkIsOnValidThread();
        this.capturingStopped = true;
        if (!this.released) {
            try {
                this.audioDevice.onStopCapturing();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return true;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onStopRendering() {
        logger.d("onStopRendering");
        checkIsOnValidThread();
        this.renderingStopped = true;
        if (!this.released) {
            try {
                this.audioDevice.onStopRendering();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return true;
    }

    public void readRenderData(ByteBuffer byteBuffer) {
        try {
            if (this.renderingStopped || this.released) {
                logger.d("Ignoring readRenderData because either AudioDeviceProxy is released or rendering stopped");
            } else {
                nativeReadData(nativeAudioDeviceProxyHandle, byteBuffer, byteBuffer.capacity());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void release() {
        logger.d("release");
        if (this.released) {
            return;
        }
        long j10 = nativeAudioDeviceProxyHandle;
        if (j10 != 0) {
            nativeRelease(j10);
            nativeAudioDeviceProxyHandle = 0L;
        }
        this.released = true;
    }

    public void writeCaptureData(ByteBuffer byteBuffer) {
        try {
            if (this.capturingStopped || this.released) {
                logger.d("Ignoring writeCaptureData because either AudioDeviceProxy is released or capturing stopped");
            } else {
                nativeWriteData(nativeAudioDeviceProxyHandle, byteBuffer, byteBuffer.capacity());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
