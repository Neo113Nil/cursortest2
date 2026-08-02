package com.inmobi.media;

import defpackage.b98;
import defpackage.fcp;
import defpackage.fdi;
import defpackage.g9i;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.rob;
import defpackage.rq3;
import defpackage.v98;
import defpackage.xw3;
import defpackage.yda;
import defpackage.z45;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3867wm implements b98 {
    public final /* synthetic */ Nm a;

    public C3867wm(ku3 ku3Var, Nm nm) {
        this.a = nm;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C3906y9 c3906y9 = this.a.e;
        if (c3906y9 != null) {
            c3906y9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + booleanValue);
        }
        Nm nm = this.a;
        if (booleanValue) {
            C3906y9 c3906y92 = nm.e;
            if (c3906y92 != null) {
                c3906y92.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC3727rc interfaceC3727rc = nm.h;
            if (interfaceC3727rc == null) {
                Intrinsics.i("mediaPlayer");
                throw null;
            }
            C3445ge c3445ge = (C3445ge) interfaceC3727rc;
            On on = c3445ge.m;
            on.d.set(true);
            Ng ng = (Ng) on.i.d.getValue();
            ((fdi) ng.b).l(EnumC3610mo.HIDDEN);
            ng.f.set(true);
            P6.a(ng.e);
            ng.e = null;
            Ng ng2 = (Ng) on.i.d.getValue();
            ng2.a();
            C3816un c3816un = new C3816un(ng2.b);
            ku3 ku3Var = on.a;
            hs4 hs4Var = z45.a;
            g9i L = xw3.L(ku3Var, rob.a, null, new Mn(c3816un, null, on), 2);
            ArrayList arrayList = on.e;
            arrayList.getClass();
            arrayList.add(L);
            on.a();
            g9i L2 = xw3.L(c3445ge.a, null, null, new Yd(new C3316be(c3445ge.o), null, c3445ge), 3);
            ArrayList arrayList2 = c3445ge.d;
            arrayList2.getClass();
            arrayList2.add(L2);
            c3445ge.l.b();
            C3906y9 c3906y93 = nm.e;
            if (c3906y93 != null) {
                c3906y93.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC3727rc interfaceC3727rc2 = nm.h;
            if (interfaceC3727rc2 == null) {
                Intrinsics.i("mediaPlayer");
                throw null;
            }
            yda m0 = fcp.m0(new v98(new Hm(new v98(((C3445ge) interfaceC3727rc2).o, new Im(nm, null), 3)), new Jm(nm, null), 3), nm.b);
            ArrayList arrayList3 = nm.f;
            arrayList3.getClass();
            arrayList3.add(m0);
            X4.a(nm.b, new Mm(nm, null));
            nm.c();
        } else {
            nm.b();
        }
        return Unit.a;
    }
}
