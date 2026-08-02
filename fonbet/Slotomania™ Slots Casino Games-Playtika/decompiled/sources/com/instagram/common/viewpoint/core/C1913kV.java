package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;

/* renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1913kV implements C5V {
    public MP A02;
    public long A01 = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    public int A00 = CacheDataSink.DEFAULT_BUFFER_SIZE;

    public final C1913kV A00(MP mp) {
        this.A02 = mp;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.C5V
    public final C1912kU A5H() {
        return new C1912kU((MP) AbstractC04793y.A01(this.A02), this.A01, this.A00);
    }
}
