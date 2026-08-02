package defpackage;

import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hej {
    public final e1d a = e.f(null);
    public q80 b;
    public final SnapshotStateList c;

    public hej(q80 q80Var) {
        qaj qajVar = new qaj(7);
        q80Var.getClass();
        o80 o80Var = new o80(q80Var);
        ArrayList arrayList = o80Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) qajVar.invoke(((n80) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                p80 p80Var = (p80) list.get(i2);
                arrayList3.add(new n80(p80Var.a, p80Var.d, p80Var.b, p80Var.c));
            }
            o13.v(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = o80Var.h();
        this.c = new SnapshotStateList();
    }

    public static p80 c(p80 p80Var, aej aejVar) {
        int c = aejVar.b.c(r4.f - 1, false);
        if (p80Var.b < c) {
            return p80.a(p80Var, null, 0, Math.min(p80Var.c, c), 11);
        }
        return null;
    }

    public final void a(int i, of3 of3Var) {
        char c;
        boolean z;
        boolean z2;
        Object obj;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1154651354);
        char c2 = 2;
        int i2 = (av8Var.i(this) ? 4 : 2) | i;
        boolean z3 = false;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            p40 p40Var = (p40) av8Var.k(dh3.s);
            q80 q80Var = this.b;
            List a = q80Var.a(q80Var.b.length());
            int size = a.size();
            int i3 = 0;
            while (i3 < size) {
                p80 p80Var = (p80) a.get(i3);
                int i4 = p80Var.b;
                Object obj2 = p80Var.a;
                if (i4 != p80Var.c) {
                    av8Var.d0(725478935);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    Object obj3 = O;
                    if (O == a99Var) {
                        obj3 = mz1.e(av8Var);
                    }
                    wzc wzcVar = (wzc) obj3;
                    c = c2;
                    xtc M = s02.M(utc.a, new dvi(17, this, p80Var));
                    Object O2 = av8Var.O();
                    if (O2 == a99Var) {
                        z2 = true;
                        qaj qajVar = new qaj(8);
                        av8Var.n0(qajVar);
                        obj = qajVar;
                    } else {
                        z2 = true;
                        obj = O2;
                    }
                    xtc w = zm2.w(o3h.a(M, z3, (Function1) obj).z(new qej(new ow9(13, this, p80Var))), wzcVar);
                    kze.a.getClass();
                    xtc w2 = sea.w(w, n9e.g);
                    boolean i5 = av8Var.i(this) | av8Var.g(p80Var) | av8Var.i(p40Var);
                    Object O3 = av8Var.O();
                    Object obj4 = O3;
                    if (i5 || O3 == a99Var) {
                        fej fejVar = new fej(this, p80Var, p40Var);
                        av8Var.n0(fejVar);
                        obj4 = fejVar;
                    }
                    e12.a(0, av8Var, oyn.y(w2, wzcVar, (Function0) obj4));
                    gbb gbbVar = (gbb) obj2;
                    iej a2 = gbbVar.a();
                    if (a2 == null || (a2.a == null && a2.b == null && a2.c == null && a2.d == null)) {
                        z = false;
                        av8Var.d0(728331710);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(726303039);
                        Object O4 = av8Var.O();
                        Object obj5 = O4;
                        if (O4 == a99Var) {
                            hbb hbbVar = new hbb(wzcVar);
                            av8Var.n0(hbbVar);
                            obj5 = hbbVar;
                        }
                        hbb hbbVar2 = (hbb) obj5;
                        Unit unit = Unit.a;
                        Object O5 = av8Var.O();
                        boolean z4 = false;
                        Object obj6 = O5;
                        if (O5 == a99Var) {
                            w9g w9gVar = new w9g(hbbVar2, z4 ? 1 : 0, 28);
                            av8Var.n0(w9gVar);
                            obj6 = w9gVar;
                        }
                        hz8.o(av8Var, unit, (Function2) obj6);
                        znh znhVar = hbbVar2.b;
                        znh znhVar2 = hbbVar2.b;
                        Boolean valueOf = Boolean.valueOf((znhVar.h() & 2) != 0 ? z2 : false);
                        Boolean valueOf2 = Boolean.valueOf((znhVar2.h() & 1) != 0 ? z2 : false);
                        Boolean valueOf3 = Boolean.valueOf((znhVar2.h() & 4) != 0 ? z2 : false);
                        iej a3 = gbbVar.a();
                        pwh pwhVar = a3 != null ? a3.a : null;
                        iej a4 = gbbVar.a();
                        pwh pwhVar2 = a4 != null ? a4.b : null;
                        iej a5 = gbbVar.a();
                        pwh pwhVar3 = a5 != null ? a5.c : null;
                        iej a6 = gbbVar.a();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, pwhVar, pwhVar2, pwhVar3, a6 != null ? a6.d : null};
                        boolean i6 = av8Var.i(this) | av8Var.g(p80Var);
                        Object O6 = av8Var.O();
                        Object obj7 = O6;
                        if (i6 || O6 == a99Var) {
                            dvi dviVar = new dvi(16, this, p80Var, hbbVar2);
                            av8Var.n0(dviVar);
                            obj7 = dviVar;
                        }
                        b(objArr, (Function1) obj7, av8Var, (i2 << 6) & 896);
                        z = false;
                        av8Var.s(false);
                    }
                    av8Var.s(z);
                } else {
                    c = c2;
                    z = z3;
                    av8Var.d0(728345598);
                    av8Var.s(z);
                }
                i3++;
                z3 = z;
                c2 = c;
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new q8i(this, i, 27);
        }
    }

    public final void b(Object[] objArr, Function1 function1, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2083052099);
        int i2 = (i & 48) == 0 ? (av8Var.i(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= av8Var.i(this) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        av8Var.a0(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (av8Var.e(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= av8Var.i(obj) ? 4 : 0;
        }
        av8Var.s(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            k89 k89Var = new k89(2);
            k89Var.a(function1);
            k89Var.b(objArr);
            ArrayList arrayList = k89Var.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean i5 = av8Var.i(this) | ((i3 & 112) == 32);
            Object O = av8Var.O();
            if (i5 || O == nf3.a) {
                O = new bp1(this, function1, i4);
                av8Var.n0(O);
            }
            hz8.h(array, (Function1) O, av8Var);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(this, objArr, function1, i, 12);
        }
    }
}
