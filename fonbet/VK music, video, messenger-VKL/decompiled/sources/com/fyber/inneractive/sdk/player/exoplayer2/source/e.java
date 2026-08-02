package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes12.dex */
public final class e implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ long b;
    public final /* synthetic */ f c;

    public e(f fVar, int i, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i2, Object obj, long j) {
        this.c = fVar;
        this.a = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.c.b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}
