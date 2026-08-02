package com.inmobi.media;

import defpackage.b98;
import defpackage.ku3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.se, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3755se implements b98 {
    public final /* synthetic */ He a;

    public C3755se(ku3 ku3Var, He he) {
        this.a = he;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        AbstractC3650oc abstractC3650oc = (AbstractC3650oc) obj;
        C3289ad c3289ad = this.a.b.f;
        c3289ad.getClass();
        abstractC3650oc.getClass();
        if (abstractC3650oc instanceof C3377dn) {
            c3289ad.a.d = Gl.a(((C3377dn) abstractC3650oc).a);
        } else if (abstractC3650oc instanceof C3868wn) {
            c3289ad.a.e = ((C3868wn) abstractC3650oc).a;
        }
        if (!(abstractC3650oc instanceof C3868wn)) {
            InterfaceC3880x9 l = this.a.l();
            if (l != null) {
                ((C3906y9) l).a("NativeRenderedState", "listenMediaEvents - processing media event: " + abstractC3650oc);
            }
            ((C3418fd) this.a.b.m.getValue()).a(abstractC3650oc);
            Ii ii = (Ii) this.a.b.n.getValue();
            ii.getClass();
            abstractC3650oc.getClass();
            if (abstractC3650oc instanceof AbstractC3712qm) {
                ii.b.a((AbstractC3712qm) abstractC3650oc);
            }
            Ii ii2 = (Ii) this.a.b.n.getValue();
            ii2.getClass();
            abstractC3650oc.getClass();
            Nc nc = ii2.c.c;
            if (abstractC3650oc instanceof Jn) {
                nc.f();
            } else if (abstractC3650oc instanceof Gn) {
                nc.i();
            } else if (abstractC3650oc instanceof C3635nn) {
                nc.b();
            } else if (abstractC3650oc instanceof C3660om) {
                nc.h();
            } else if (abstractC3650oc instanceof W1) {
                nc.a(((W1) abstractC3650oc).a);
            }
            Ii ii3 = (Ii) this.a.b.n.getValue();
            ii3.getClass();
            abstractC3650oc.getClass();
            if (abstractC3650oc instanceof C3660om) {
                ii3.a.g();
            }
        }
        return Unit.a;
    }
}
