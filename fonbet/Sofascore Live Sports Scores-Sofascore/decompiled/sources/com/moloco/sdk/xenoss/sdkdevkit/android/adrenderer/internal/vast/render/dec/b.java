package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import android.content.Context;
import com.moloco.sdk.acm.eventprocessing.f;
import com.moloco.sdk.internal.services.events.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import defpackage.ad2;
import defpackage.aeh;
import defpackage.b10;
import defpackage.beh;
import defpackage.ddi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.ng2;
import defpackage.rob;
import defpackage.s9a;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b implements o, h {
    public final m0 a;
    public final k b;
    public final ad2 c;
    public final b10 d;
    public final f e;
    public final aeh f;
    public final aeh g;
    public final String h;
    public final s0 i;
    public final ng2 j;

    public b(m0 m0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h hVar, int i, Context context, c cVar, t0 t0Var, k kVar) {
        m0Var.getClass();
        context.getClass();
        cVar.getClass();
        t0Var.getClass();
        this.a = m0Var;
        this.b = kVar;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.c = c;
        this.d = new b10(i, c);
        this.e = new f(cVar, kotlin.collections.b.k(m0Var.c), kotlin.collections.b.k(m0Var.d), kotlin.collections.b.k(m0Var.e));
        aeh b = beh.b(0, 0, null, 7);
        this.f = b;
        this.g = b;
        this.h = m0Var.a;
        this.i = new s0(m0Var.f, m0Var.g, m0Var.h, m0Var.i);
        this.j = new ng2(hVar != null ? hVar.a : null, hVar != null ? Integer.valueOf(hVar.b) : null, hVar != null ? Integer.valueOf(hVar.c) : null, hVar != null ? hVar.d : null, c, context, cVar, t0Var, null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.c, null);
        this.j.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final ddi l() {
        return (jof) this.d.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h
    public final void reset() {
        this.d.reset();
    }
}
