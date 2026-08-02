package com.twilio.voice;

/* loaded from: classes4.dex */
public abstract class LocalTrackStats extends BaseTrackStats {
    public final long bytesSent;
    public final int packetsSent;
    public final long roundTripTime;

    public LocalTrackStats(String str, int i10, String str2, String str3, double d10, long j10, int i11, long j11) {
        super(str, i10, str2, str3, d10);
        this.bytesSent = j10;
        this.packetsSent = i11;
        this.roundTripTime = j11;
    }
}
