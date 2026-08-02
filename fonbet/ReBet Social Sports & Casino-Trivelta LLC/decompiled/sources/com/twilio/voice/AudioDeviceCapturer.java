package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface AudioDeviceCapturer {
    AudioFormat getCapturerFormat();

    boolean onInitCapturer();

    boolean onStartCapturing(@NonNull AudioDeviceContext audioDeviceContext);

    boolean onStopCapturing();
}
