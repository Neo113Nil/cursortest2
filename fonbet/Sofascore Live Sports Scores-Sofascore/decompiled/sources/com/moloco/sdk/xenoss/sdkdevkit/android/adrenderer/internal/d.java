package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

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
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {
    public final String a;
    public final ku3 b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c c;
    public final fdi d;
    public final fdi e;

    public d(String str, ad2 ad2Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.c cVar) {
        str.getClass();
        ad2Var.getClass();
        this.a = str;
        this.b = ad2Var;
        this.c = cVar;
        fdi a = gdi.a(Boolean.FALSE);
        this.d = a;
        this.e = a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        xw3.L(this.b, null, null, new a74(this, j, gVar, (rq3) null, 13), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.e;
    }
}
