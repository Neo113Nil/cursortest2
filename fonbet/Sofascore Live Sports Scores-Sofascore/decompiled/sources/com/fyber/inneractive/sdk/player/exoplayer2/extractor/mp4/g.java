package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g implements e {
    public final int a;
    public final int b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n c;

    public g(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.c = nVar;
        nVar.e(12);
        this.a = nVar.m();
        this.b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i = this.a;
        return i == 0 ? this.c.m() : i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return this.a != 0;
    }
}
