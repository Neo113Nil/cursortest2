package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSink;

/* renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2870kV implements C5V {
    public MP A02;
    public long A01 = 5242880;
    public int A00 = CacheDataSink.DEFAULT_BUFFER_SIZE;

    public final C2870kV A00(MP mp) {
        this.A02 = mp;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C5V
    public final C2869kU A5H() {
        return new C2869kU((MP) AbstractC14363y.A01(this.A02), this.A01, this.A00);
    }
}
