package com.twilio.voice;

/* loaded from: classes4.dex */
public abstract class RemoteTrackStats extends BaseTrackStats {
    public final long bytesReceived;
    public final int packetsReceived;

    public RemoteTrackStats(String str, int i10, String str2, String str3, double d10, long j10, int i11) {
        super(str, i10, str2, str3, d10);
        this.bytesReceived = j10;
        this.packetsReceived = i11;
    }
}
