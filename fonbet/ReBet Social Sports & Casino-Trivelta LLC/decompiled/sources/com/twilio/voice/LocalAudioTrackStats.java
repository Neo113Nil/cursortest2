package com.twilio.voice;

/* loaded from: classes4.dex */
public class LocalAudioTrackStats extends LocalTrackStats {
    public final int audioLevel;
    public final int jitter;

    public LocalAudioTrackStats(String str, int i10, String str2, String str3, double d10, long j10, int i11, long j11, int i12, int i13) {
        super(str, i10, str2, str3, d10, j10, i11, j11);
        this.audioLevel = i12;
        this.jitter = i13;
    }
}
