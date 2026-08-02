package com.inmobi.media;

import defpackage.ah2;
import defpackage.d2g;
import defpackage.lj2;
import defpackage.oed;
import defpackage.p2g;
import defpackage.qh2;
import defpackage.u2g;
import defpackage.w2g;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cl implements qh2 {
    public final /* synthetic */ lj2 a;

    public Cl(lj2 lj2Var) {
        this.a = lj2Var;
    }

    @Override // defpackage.qh2
    public final void onFailure(ah2 ah2Var, IOException iOException) {
        ah2Var.getClass();
        iOException.getClass();
        lj2 lj2Var = this.a;
        lj2Var.getClass();
        if (lj2Var.r() instanceof oed) {
            try {
                p2g p2gVar = w2g.b;
                lj2Var.resumeWith(new u2g(iOException));
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // defpackage.qh2
    public final void onResponse(ah2 ah2Var, d2g d2gVar) {
        ah2Var.getClass();
        d2gVar.getClass();
        X4.a(this.a, d2gVar);
    }
}
