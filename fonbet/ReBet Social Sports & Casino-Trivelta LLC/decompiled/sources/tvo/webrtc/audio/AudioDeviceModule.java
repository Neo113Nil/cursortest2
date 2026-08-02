package tvo.webrtc.audio;

/* loaded from: classes5.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    default boolean setNoiseSuppressorEnabled(boolean z10) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f10) {
        return false;
    }

    void setSpeakerMute(boolean z10);
}
