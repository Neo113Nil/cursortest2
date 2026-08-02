package com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;

/* loaded from: classes12.dex */
public final class c {
    public final int a;
    public final long b;

    public c(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static c a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, n nVar) {
        bVar.a(nVar.a, 0, 8, false);
        nVar.e(0);
        return new c(nVar.b(), nVar.e());
    }
}
