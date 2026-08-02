package io.agora.rtc2.audio;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class UserAudioSpectrumInfo {
    private AudioSpectrumInfo audioSpectrumInfo;
    private int uid;

    @CalledByNative
    public UserAudioSpectrumInfo(int i10, AudioSpectrumInfo audioSpectrumInfo) {
        this.uid = i10;
        this.audioSpectrumInfo = audioSpectrumInfo;
    }

    public AudioSpectrumInfo getAudioSpectrumInfo() {
        return this.audioSpectrumInfo;
    }

    public int getUid() {
        return this.uid;
    }
}
