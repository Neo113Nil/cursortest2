package com.inmobi.media;

import defpackage.lu3;
import defpackage.rq3;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sc implements Qo, InterfaceC3404f {
    public final Rc a;
    public final Wc b;

    public Sc(Rc rc) {
        rc.getClass();
        this.a = rc;
        this.b = new Wc(rc);
    }

    public final void a() {
        Bj bj = this.b.c;
        He he = bj instanceof He ? (He) bj : null;
        if (he != null) {
            InterfaceC3880x9 l = he.l();
            if (l != null) {
                ((C3906y9) l).a("NativeRenderedState", "takeAction");
            }
            ((C3858wd) he.b.p.getValue()).b();
        }
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return Po.a(this.a.a, d);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return Po.a(this.a.a, i, d);
    }

    @Override // com.inmobi.media.InterfaceC3404f
    public final Object a(rq3 rq3Var) {
        Object a = this.b.a(rq3Var);
        return a == lu3.a ? a : Unit.a;
    }
}
