package com.sofascore.results.fantasy.onboarding.steps;

import androidx.activity.ComponentActivity;
import defpackage.a70;
import defpackage.ace;
import defpackage.av8;
import defpackage.cal;
import defpackage.d6d;
import defpackage.duf;
import defpackage.e1d;
import defpackage.e5h;
import defpackage.eqf;
import defpackage.ere;
import defpackage.et8;
import defpackage.ff7;
import defpackage.g7d;
import defpackage.hz8;
import defpackage.k7d;
import defpackage.kik;
import defpackage.nf3;
import defpackage.ngb;
import defpackage.of3;
import defpackage.pb7;
import defpackage.q5a;
import defpackage.qea;
import defpackage.rfo;
import defpackage.s6d;
import defpackage.sb7;
import defpackage.sea;
import defpackage.ub7;
import defpackage.ufa;
import defpackage.un0;
import defpackage.utc;
import defpackage.wb7;
import defpackage.xtc;
import defpackage.y8d;
import defpackage.yqo;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class h {
    public static final void a(et8 et8Var, Function1 function1, Function1 function12, xtc xtcVar, k7d k7dVar, of3 of3Var, int i) {
        xtc xtcVar2;
        k7d k7dVar2;
        k7d N;
        xtc xtcVar3;
        Object obj;
        s6d s6dVar;
        et8Var.getClass();
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(475018204);
        int i2 = i | (av8Var.i(et8Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | 11264;
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            av8Var.Y();
            if ((i & 1) == 0 || av8Var.B()) {
                N = q5a.N(new y8d[0], av8Var);
                xtcVar3 = utc.a;
            } else {
                av8Var.W();
                xtcVar3 = xtcVar;
                N = k7dVar;
            }
            av8Var.t();
            Object k = av8Var.k(ngb.a);
            if (k == null) {
                a70.r("Required value was null.");
                return;
            }
            ComponentActivity componentActivity = (ComponentActivity) k;
            wb7 wb7Var = (wb7) sea.A(duf.a.getOrCreateKotlinClass(wb7.class), componentActivity, kik.V(ufa.s(componentActivity), av8Var), ufa.r(componentActivity), av8Var);
            e1d x = rfo.x(wb7Var.k, av8Var, 0);
            Iterator it = CollectionsKt.B0(N.b.f).iterator();
            if (it.hasNext()) {
                it.next();
            }
            Iterator it2 = e5h.b(it).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (!(((d6d) obj).b instanceof g7d)) {
                        break;
                    }
                }
            }
            boolean z = ((d6d) obj) != null;
            d6d d6dVar = (d6d) sea.k(un0.t(N.b.z), null, null, av8Var, 48, 2).getValue();
            String str = (d6dVar == null || (s6dVar = d6dVar.b) == null) ? null : (String) s6dVar.b.g;
            Object O = av8Var.O();
            Object obj2 = nf3.a;
            if (O == obj2) {
                O = androidx.compose.runtime.e.f(Boolean.FALSE);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Object O2 = av8Var.O();
            if (O2 == obj2) {
                O2 = androidx.compose.runtime.e.f(Boolean.FALSE);
                av8Var.n0(O2);
            }
            e1d e1dVar2 = (e1d) O2;
            boolean g = av8Var.g(str) | av8Var.i(wb7Var);
            Object O3 = av8Var.O();
            if (g || O3 == obj2) {
                O3 = new g(str, wb7Var, null);
                av8Var.n0(O3);
            }
            hz8.o(av8Var, str, (Function2) O3);
            boolean z2 = ((pb7) x.getValue()).u;
            boolean i3 = av8Var.i(wb7Var);
            Object O4 = av8Var.O();
            if (i3 || O4 == obj2) {
                O4 = new sb7(0, wb7Var, e1dVar2);
                av8Var.n0(O4);
            }
            k7d k7dVar3 = N;
            String str2 = str;
            un0.f(z2, (Function0) O4, false, false, yqo.H(1216203789, av8Var, new ace(componentActivity, wb7Var, k7dVar3, e1dVar2, 26)), av8Var, 24576, 12);
            WeakHashMap weakHashMap = cal.w;
            xtc xtcVar4 = xtcVar3;
            q5a.p(xtcVar4, yqo.H(-908864104, av8Var, new ub7(z, x, e1dVar, str2, wb7Var, k7dVar3, componentActivity, function12, e1dVar2)), null, null, null, 0, 0L, 0L, qea.p(av8Var).f, yqo.H(601373357, av8Var, new ff7((Object) k7dVar3, (Object) et8Var, function1, (Object) x, (Object) e1dVar, 7)), av8Var, 805306422, 252);
            xtcVar2 = xtcVar4;
            k7dVar2 = k7dVar3;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            k7dVar2 = k7dVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere((Object) et8Var, function1, (Object) function12, (Object) xtcVar2, (Object) k7dVar2, i, 8);
        }
    }
}
