package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class DefaultAudioDevice implements AudioDevice {
    private boolean useHardwareAcousticEchoCanceler = true;
    private boolean useHardwareNoiseSuppressor = true;

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
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onInitRenderer() {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onStartCapturing(@NonNull AudioDeviceContext audioDeviceContext) {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onStartRendering(@NonNull AudioDeviceContext audioDeviceContext) {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceCapturer
    public boolean onStopCapturing() {
        return false;
    }

    @Override // com.twilio.voice.AudioDeviceRenderer
    public boolean onStopRendering() {
        return false;
    }

    public void setUseHardwareAcousticEchoCanceler(boolean z10) {
        this.useHardwareAcousticEchoCanceler = z10;
    }

    public void setUseHardwareNoiseSuppressor(boolean z10) {
        this.useHardwareNoiseSuppressor = z10;
    }

    public boolean useHardwareAcousticEchoCanceler() {
        return this.useHardwareAcousticEchoCanceler;
    }

    public boolean useHardwareNoiseSuppressor() {
        return this.useHardwareNoiseSuppressor;
    }
}
