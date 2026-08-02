package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.t;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {
    public final l a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g c;
    public final d d;

    public f(l lVar, o oVar) {
        t tVar = new t();
        d dVar = new d(lVar);
        this.a = lVar;
        this.b = oVar;
        this.c = tVar;
        this.d = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a() {
        l lVar = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a = this.b.a();
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h a2 = this.c.a();
        d dVar = this.d;
        return new e(lVar, a, a2, dVar != null ? new c(dVar.a) : null);
    }
}
