package com.twilio.voice;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public interface AudioDevice extends AudioDeviceCapturer, AudioDeviceRenderer {
    static void audioDeviceExecuteWorkerBlock(@NonNull AudioDeviceContext audioDeviceContext, @NonNull Runnable runnable) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(runnable, "runnable must not be null");
        ((AudioDeviceProxy) audioDeviceContext).executeWorkerBlock(runnable);
    }

    static void audioDeviceFormatChanged(@NonNull AudioDeviceContext audioDeviceContext) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        ((AudioDeviceProxy) audioDeviceContext).formatChanged();
    }

    static void audioDeviceReadRenderData(@NonNull AudioDeviceContext audioDeviceContext, @NonNull ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(byteBuffer, "runnable must not be null");
        ((AudioDeviceProxy) audioDeviceContext).readRenderData(byteBuffer);
    }

    static void audioDeviceWriteCaptureData(@NonNull AudioDeviceContext audioDeviceContext, @NonNull ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(audioDeviceContext, "audioDeviceContext must not be null");
        Preconditions.checkNotNull(byteBuffer, "audioSample must not be null");
        ((AudioDeviceProxy) audioDeviceContext).writeCaptureData(byteBuffer);
    }
}
