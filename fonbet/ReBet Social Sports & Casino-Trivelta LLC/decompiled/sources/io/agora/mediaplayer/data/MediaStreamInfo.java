package io.agora.mediaplayer.data;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public class MediaStreamInfo {
    private int audioBytesPerSample;
    private int audioChannels;
    private int audioSampleRate;
    private String codecName;
    private long duration;
    private String language;
    private int mediaStreamType;
    private int streamIndex;
    private int videoBitRate;
    private int videoFrameRate;
    private int videoHeight;
    private int videoRotation;
    private int videoWidth;

    public MediaStreamInfo() {
    }

    @CalledByNative
    public int getAudioBytesPerSample() {
        return this.audioBytesPerSample;
    }

    @CalledByNative
    public int getAudioChannels() {
        return this.audioChannels;
    }

    @CalledByNative
    public int getAudioSampleRate() {
        return this.audioSampleRate;
    }

    @CalledByNative
    public String getCodecName() {
        return this.codecName;
    }

    @CalledByNative
    public long getDuration() {
        return this.duration;
    }

    @CalledByNative
    public String getLanguage() {
        return this.language;
    }

    @CalledByNative
    public int getMediaStreamType() {
        return this.mediaStreamType;
    }

    @CalledByNative
    public int getStreamIndex() {
        return this.streamIndex;
    }

    @CalledByNative
    public int getVideoBitRate() {
        return this.videoBitRate;
    }

    @CalledByNative
    public int getVideoFrameRate() {
        return this.videoFrameRate;
    }

    @CalledByNative
    public int getVideoHeight() {
        return this.videoHeight;
    }

    public int getVideoRotation() {
        return this.videoRotation;
    }

    @CalledByNative
    public int getVideoWidth() {
        return this.videoWidth;
    }

    public void setAudioBytesPerSample(int i10) {
        this.audioBytesPerSample = i10;
    }

    public void setAudioChannels(int i10) {
        this.audioChannels = i10;
    }

    public void setAudioSampleRate(int i10) {
        this.audioSampleRate = i10;
    }

    public void setCodecName(String str) {
        this.codecName = str;
    }

    public void setDuration(long j10) {
        this.duration = j10;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMediaStreamType(int i10) {
        this.mediaStreamType = i10;
    }

    public void setStreamIndex(int i10) {
        this.streamIndex = i10;
    }

    public void setVideoBitRate(int i10) {
        this.videoBitRate = i10;
    }

    public void setVideoFrameRate(int i10) {
        this.videoFrameRate = i10;
    }

    public void setVideoHeight(int i10) {
        this.videoHeight = i10;
    }

    public void setVideoRotation(int i10) {
        this.videoRotation = i10;
    }

    public void setVideoWidth(int i10) {
        this.videoWidth = i10;
    }

    public String toString() {
        return "MediaStreamInfo{streamIndex=" + this.streamIndex + ", mediaStreamType=" + this.mediaStreamType + ", codecName='" + this.codecName + "', language='" + this.language + "', videoFrameRate=" + this.videoFrameRate + ", videoBitRate=" + this.videoBitRate + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", audioSampleRate=" + this.audioSampleRate + ", videoRotation=" + this.videoRotation + ", audioChannels=" + this.audioChannels + ", duration=" + this.duration + '}';
    }

    @CalledByNative
    public MediaStreamInfo(int i10, int i11, String str, String str2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j10) {
        this.streamIndex = i10;
        this.mediaStreamType = i11;
        this.codecName = str;
        this.language = str2;
        this.videoFrameRate = i12;
        this.videoBitRate = i13;
        this.videoWidth = i14;
        this.videoHeight = i15;
        this.videoRotation = i16;
        this.audioSampleRate = i17;
        this.audioChannels = i18;
        this.duration = j10;
    }
}
