package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ f d;

    public b(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i, int i2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.d = fVar;
        this.a = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.d.b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.b);
        f.a(this.d, this.c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", b0Var.a());
    }
}
