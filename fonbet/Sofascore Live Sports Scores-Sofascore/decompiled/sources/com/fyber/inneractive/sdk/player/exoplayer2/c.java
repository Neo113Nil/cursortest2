package com.fyber.inneractive.sdk.player.exoplayer2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();
    public final long b = 15000000;
    public final long c = 30000000;
    public final long d = 2500000;
    public final long e = 5000000;
    public int f;
    public boolean g;

    public final void a(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
