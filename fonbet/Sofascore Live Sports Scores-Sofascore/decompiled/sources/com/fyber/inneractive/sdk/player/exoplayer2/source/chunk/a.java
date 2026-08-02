package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a implements z {
    public final k a;
    public final int b;
    public final o c;
    public final int d;
    public final Object e;
    public final long f;
    public final long g;
    public final h h;

    public a(int i, int i2, long j, long j2, o oVar, h hVar, k kVar, Object obj) {
        hVar.getClass();
        this.h = hVar;
        this.a = kVar;
        this.b = i;
        this.c = oVar;
        this.d = i2;
        this.e = obj;
        this.f = j;
        this.g = j2;
    }

    public abstract long c();
}
