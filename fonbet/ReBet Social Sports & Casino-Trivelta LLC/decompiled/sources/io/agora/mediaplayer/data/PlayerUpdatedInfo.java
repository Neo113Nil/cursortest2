package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class PlayerUpdatedInfo {
    public long audioBitsPerSample;
    public long audioChannels;
    public long audioSampleRate;
    public String deviceId;
    public String internalPlayerUuid;
    public long videoHeight;
    public long videoWidth;

    public PlayerUpdatedInfo() {
        this.internalPlayerUuid = null;
        this.deviceId = null;
    }

    public long getAudioBitsPerSample() {
        return this.audioBitsPerSample;
    }

    public long getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @CalledByNative
    public String getDeviceId() {
        return this.deviceId;
    }

    @CalledByNative
    public String getInternalPlayerUuid() {
        return this.internalPlayerUuid;
    }

    public long getVideoHeight() {
        return this.videoHeight;
    }

    public long getVideoWidth() {
        return this.videoWidth;
    }

    public long getaudioChannels() {
        return this.audioChannels;
    }

    @CalledByNative
    public void setAudioBitsPerSample(long j10) {
        this.audioBitsPerSample = j10;
    }

    @CalledByNative
    public void setAudioChannels(long j10) {
        this.audioChannels = j10;
    }

    @CalledByNative
    public void setAudioSampleRate(long j10) {
        this.audioSampleRate = j10;
    }

    @CalledByNative
    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    @CalledByNative
    public void setInternalPlayerUuid(String str) {
        this.internalPlayerUuid = str;
    }

    @CalledByNative
    public void setVideoHeight(long j10) {
        this.videoHeight = j10;
    }

    @CalledByNative
    public void setVideoWidth(long j10) {
        this.videoWidth = j10;
    }

    public String toString() {
        return "PlayerUpdatedInfo{internalPlayerUuid=" + this.internalPlayerUuid + ", deviceId=" + this.deviceId + "videoHeight=" + this.videoHeight + ", videoWidth=" + this.videoWidth + ", audioSampleRate=" + this.audioSampleRate + "audioChannels=" + this.audioChannels + "audioBitsPerSample=" + this.audioBitsPerSample + '}';
    }

    @CalledByNative
    public PlayerUpdatedInfo(String str, String str2) {
        this.internalPlayerUuid = str;
        this.deviceId = str2;
    }

    @CalledByNative
    public PlayerUpdatedInfo(String str, String str2, long j10, long j11, long j12, long j13, long j14) {
        this.internalPlayerUuid = str;
        this.deviceId = str2;
        this.videoHeight = j10;
        this.videoWidth = j11;
        this.audioSampleRate = j12;
        this.audioChannels = j13;
        this.audioBitsPerSample = j14;
    }
}
