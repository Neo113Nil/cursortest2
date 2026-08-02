package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.rob;
import defpackage.s9a;
import defpackage.z45;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class p implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {
    public final Context a;
    public final com.moloco.sdk.internal.ortb.model.y b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b c;
    public final com.moloco.sdk.acm.recorder.c d;
    public final ad2 e;
    public final n f;
    public final fdi g;
    public final fdi h;
    public final fdi i;
    public final fdi j;

    public p(Context context, com.moloco.sdk.internal.ortb.model.y yVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u uVar, com.facebook.internal.t tVar, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b bVar, com.moloco.sdk.acm.recorder.c cVar) {
        this.a = context;
        this.b = yVar;
        this.c = bVar;
        this.d = cVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m mVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
        hs4 hs4Var = z45.a;
        ad2 c = s9a.c(rob.a);
        this.e = c;
        this.f = new n(yVar, c, uVar, tVar, z, cVar);
        Boolean bool = Boolean.FALSE;
        fdi a = gdi.a(bool);
        this.g = a;
        this.h = a;
        fdi a2 = gdi.a(bool);
        this.i = a2;
        this.j = a2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.f.a(j, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final void destroy() {
        s9a.o(this.e, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m getCreativeType() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m.a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.f.i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public final ddi k() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final ddi l() {
        return this.h;
    }
}
