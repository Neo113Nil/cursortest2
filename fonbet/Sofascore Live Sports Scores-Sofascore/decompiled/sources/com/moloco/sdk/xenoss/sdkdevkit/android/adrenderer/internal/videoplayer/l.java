package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q;
import defpackage.a62;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.beh;
import defpackage.ddi;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.gdi;
import defpackage.jof;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.un0;
import defpackage.v24;
import defpackage.v98;
import defpackage.weh;
import defpackage.wf2;
import defpackage.yf4;
import defpackage.yso;
import defpackage.z88;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l implements j {
    public final j a;
    public final ad2 b;
    public final aeh c;
    public final fdi d;

    public l(j jVar, q qVar) {
        z88 c;
        qVar.getClass();
        this.a = jVar;
        ad2 k = s9a.k();
        this.b = k;
        View c2 = jVar.c();
        rq3 rq3Var = null;
        jof K = un0.K((c2 == null || (c = i0.c(yso.r(new fdl(c2, qVar, rq3Var, 10)))) == null) ? new wf2(Boolean.FALSE, 6) : c, k, weh.a, Boolean.FALSE);
        int i = 1;
        aeh b = beh.b(1, 0, a62.b, 2);
        this.c = b;
        this.d = gdi.a(d.a((d) jVar.isPlaying().getValue(), ((Boolean) K.a.getValue()).booleanValue()));
        fcp.m0(new yf4(K, b, new k(this, null), i), k);
        int i2 = 3;
        fcp.m0(new v98(new yf4(jVar.isPlaying(), K, new v24(i2, rq3Var, 7), i), new e(this, rq3Var, i2), i2), k);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final Object a(rq3 rq3Var) {
        return this.a.a(rq3Var);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final View c() {
        return this.a.c();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.b, null);
        this.a.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final ddi f() {
        return this.a.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final ddi isPlaying() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final ddi p() {
        return this.a.p();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void pause() {
        this.c.b(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void play() {
        this.c.b(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void seekTo(long j) {
        this.a.seekTo(j);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.j
    public final void a(String str) {
        this.a.a(str);
    }
}
