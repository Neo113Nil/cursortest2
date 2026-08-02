package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class BaseTrackStats {

    @NonNull
    public final String codec;
    public final int packetsLost;

    @NonNull
    public final String ssrc;
    public final double timestamp;

    @NonNull
    public final String trackId;

    public BaseTrackStats(String str, int i10, String str2, String str3, double d10) {
        this.trackId = str;
        this.packetsLost = i10;
        this.codec = str2;
        this.ssrc = str3;
        this.timestamp = d10;
    }
}
