package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.vo3;
import defpackage.xw3;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class x0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {
    public final ku3 a;
    public final com.moloco.sdk.internal.ortb.model.y b;
    public final com.facebook.internal.t c;
    public final Function1 d;
    public final fdi e;
    public final fdi f;
    public com.moloco.sdk.internal.l0 g;

    public x0(ku3 ku3Var, com.moloco.sdk.internal.ortb.model.y yVar, com.facebook.internal.t tVar, Function1 function1) {
        this.a = ku3Var;
        this.b = yVar;
        this.c = tVar;
        this.d = function1;
        fdi a = gdi.a(Boolean.FALSE);
        this.e = a;
        this.f = a;
        this.g = new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        xw3.L(this.a, null, null, new vo3(this, gVar, j, (rq3) null, 5), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.f;
    }
}
