package com.twilio.voice;

/* loaded from: classes4.dex */
public class RemoteAudioTrackStats extends RemoteTrackStats {
    public final int audioLevel;
    public final int jitter;
    public final float mos;

    public RemoteAudioTrackStats(String str, int i10, String str2, String str3, double d10, long j10, int i11, int i12, int i13, float f10) {
        super(str, i10, str2, str3, d10, j10, i11);
        this.audioLevel = i12;
        this.jitter = i13;
        this.mos = f10;
    }
}
