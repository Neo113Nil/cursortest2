package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.gdi;
import defpackage.h2;
import defpackage.jof;
import defpackage.kea;
import defpackage.ku3;
import defpackage.rq3;
import defpackage.un0;
import defpackage.vo3;
import defpackage.xw3;
import defpackage.zu4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class n implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {
    public final com.moloco.sdk.internal.ortb.model.y a;
    public final ku3 b;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u c;
    public final com.facebook.internal.t d;
    public final boolean e;
    public final com.moloco.sdk.acm.recorder.b f;
    public com.moloco.sdk.internal.l0 g;
    public final fdi h;
    public final jof i;
    public g9i j;
    public com.moloco.sdk.acm.h k;
    public String l;

    public n(com.moloco.sdk.internal.ortb.model.y yVar, ad2 ad2Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.u uVar, com.facebook.internal.t tVar, boolean z, com.moloco.sdk.acm.recorder.c cVar) {
        yVar.getClass();
        ad2Var.getClass();
        this.a = yVar;
        this.b = ad2Var;
        this.c = uVar;
        this.d = tVar;
        this.e = z;
        this.f = cVar;
        this.g = new com.moloco.sdk.internal.j0(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.a);
        fdi a = gdi.a(Boolean.FALSE);
        this.h = a;
        this.i = un0.u(a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        g9i g9iVar = this.j;
        ku3 ku3Var = this.b;
        if (this.e) {
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.j = xw3.L(ku3Var, null, null, new vo3(this, gVar, j, (rq3) null, 3), 3);
        } else {
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            this.j = xw3.L(ku3Var, null, null, new h2(this, gVar, j, (rq3) null, 12), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(zu4 zu4Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoad", "Vast AD failed to load: " + cVar, null, false, 12, null);
        ((kea) zu4Var).e(null);
        this.g = new com.moloco.sdk.internal.j0(cVar);
        gVar.a(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final ddi isLoaded() {
        return this.i;
    }
}
