package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public interface AudioDeviceRenderer {
    AudioFormat getRendererFormat();

    boolean onInitRenderer();

    boolean onStartRendering(@NonNull AudioDeviceContext audioDeviceContext);

    boolean onStopRendering();
}
