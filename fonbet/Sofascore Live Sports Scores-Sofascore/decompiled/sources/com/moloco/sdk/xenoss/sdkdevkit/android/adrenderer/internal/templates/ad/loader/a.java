package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f;
import defpackage.a74;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.xw3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a implements h {
    public final String a;
    public final ku3 b;
    public final f c;
    public final fdi d;
    public final fdi e;

    public a(String str, ad2 ad2Var, f fVar) {
        str.getClass();
        ad2Var.getClass();
        fVar.getClass();
        this.a = str;
        this.b = ad2Var;
        this.c = fVar;
        fdi a = gdi.a(Boolean.FALSE);
        this.d = a;
        this.e = a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, g gVar) {
        xw3.L(this.b, null, null, new a74(this, j, gVar, (rq3) null, 16), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.e;
    }
}
