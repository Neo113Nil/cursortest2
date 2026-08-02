package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d0 implements z {
    public final k a;
    public final h b;
    public final c0 c;
    public volatile com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e d;
    public volatile boolean e;
    public volatile long f;

    public d0(h hVar, Uri uri, c0 c0Var) {
        this.b = hVar;
        this.a = new k(uri, 0L, 0L, -1L, null, 1);
        this.c = c0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final boolean a() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void b() {
        this.e = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.z
    public final void load() {
        j jVar = new j(this.b, this.a);
        try {
            jVar.a.a(jVar.b);
            jVar.d = true;
            this.d = ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g) this.c).a(this.b.a(), jVar);
        } finally {
            this.f = jVar.f;
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(jVar);
        }
    }
}
