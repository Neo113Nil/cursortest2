package com.twilio.voice;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class OpusCodec extends AudioCodec {
    static int DEFAULT_BITRATE = 0;
    static int MAX_BITRATE = 510000;
    static int MIN_BITRATE = 6000;

    @NonNull
    public static final String NAME = "opus";
    private int maxAverageBitrate;
    private boolean useDtx;

    public OpusCodec() {
        super(NAME);
        this.maxAverageBitrate = DEFAULT_BITRATE;
        this.useDtx = false;
    }

    public int getMaxAverageBitrate() {
        return this.maxAverageBitrate;
    }

    public boolean isDtxEnabled() {
        return this.useDtx;
    }

    public OpusCodec(int i10) {
        super(NAME);
        this.maxAverageBitrate = DEFAULT_BITRATE;
        this.useDtx = false;
        if (i10 < MIN_BITRATE || i10 > MAX_BITRATE) {
            return;
        }
        this.maxAverageBitrate = i10;
    }

    public OpusCodec(int i10, boolean z10) {
        super(NAME);
        this.maxAverageBitrate = DEFAULT_BITRATE;
        this.useDtx = false;
        if (i10 >= MIN_BITRATE && i10 <= MAX_BITRATE) {
            this.maxAverageBitrate = i10;
        }
        this.useDtx = z10;
    }
}
