package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class guj {
    static {
        ypa.b(new eej(24));
        ypa.b(new eej(25));
    }

    public static final void a(gv9 gv9Var, huj hujVar, boolean z, xtc xtcVar, Function1 function1, of3 of3Var, int i) {
        av8 av8Var;
        boolean z2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-601788520);
        int i2 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.g(hujVar) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.g(xtcVar) ? a.o : 1024) | (av8Var2.i(function1) ? 16384 : 8192);
        if (av8Var2.T(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z3 = hujVar.a == 241802;
            t3e t3eVar = new t3e(4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            boolean z4 = (i2 & 14) == 4;
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z4 || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it = gv9Var.iterator();
                while (it.hasNext()) {
                    huj hujVar2 = (huj) it.next();
                    arrayList.add(new oxh(hujVar2, hujVar2.b, null, new tc3(-6917387, new uri(hujVar2, 13), true), null, false, 244));
                }
                z2 = true;
                O = l6g.W(arrayList);
                av8Var2.n0(O);
            } else {
                z2 = true;
            }
            gv9 gv9Var2 = (gv9) O;
            boolean z5 = z2;
            boolean z6 = z3;
            oxh oxhVar = new oxh(hujVar, z ? hujVar.b : null, null, yqo.H(1885586040, av8Var2, new pu5(z3, hujVar, 3)), null, false, 244);
            boolean z7 = (57344 & i2) == 16384 ? z5 : false;
            Object O2 = av8Var2.O();
            if (z7 || O2 == a99Var) {
                O2 = new fuj(0, function1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            r4a.j(gv9Var2, oxhVar, (Function1) O2, xtcVar, null, true, t3eVar, z6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i2 & 7168) | 12779520, 592);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(gv9Var, hujVar, z, xtcVar, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    public static final void b(gv9 gv9Var, gv9 gv9Var2, Function0 function0, Function0 function02, Function2 function2, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        xtc xtcVar;
        Object obj;
        gv9 gv9Var3;
        boolean z;
        boolean z2;
        gv9Var.getClass();
        gv9Var2.getClass();
        function0.getClass();
        function02.getClass();
        function2.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(709199314);
        int i3 = i | (av8Var2.g(gv9Var) ? 4 : 2) | (av8Var2.g(gv9Var2) ? 32 : 16) | (av8Var2.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function02) ? a.o : 1024) | (av8Var2.i(function2) ? 16384 : 8192);
        boolean z3 = true;
        if (av8Var2.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc xtcVar2 = utc.a;
            xtc f0 = l98.f0(l98.d0(bkh.d(xtcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            l8g a = k8g.a(ww9.b, uxf.m, av8Var2, 48);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            int size = gv9Var2.size();
            if (size > 1) {
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                xtcVar2 = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            }
            xtc xtcVar3 = xtcVar2;
            av8Var2.d0(226589386);
            int i4 = 0;
            for (Object obj2 : gv9Var2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                k0j k0jVar = (k0j) obj2;
                huj hujVar = k0jVar.a;
                huj hujVar2 = k0jVar.a;
                av8Var2.a0(343360933, Integer.valueOf(hujVar.a));
                boolean z4 = (i3 & 112) == 32 ? z3 : false;
                Object O = av8Var2.O();
                a99 a99Var = nf3.a;
                if (z4 || O == a99Var) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : gv9Var2) {
                        int i6 = i3;
                        xtc xtcVar4 = xtcVar3;
                        if (((k0j) obj3).a.a != hujVar2.a) {
                            arrayList.add(obj3);
                        }
                        i3 = i6;
                        xtcVar3 = xtcVar4;
                    }
                    i2 = i3;
                    xtcVar = xtcVar3;
                    ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(((k0j) it.next()).a.a));
                    }
                    av8Var2.n0(arrayList2);
                    obj = arrayList2;
                } else {
                    i2 = i3;
                    xtcVar = xtcVar3;
                    obj = O;
                }
                List list = (List) obj;
                boolean g = ((i2 & 14) == 4) | av8Var2.g(list);
                Object O2 = av8Var2.O();
                Object obj4 = O2;
                if (g || O2 == a99Var) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : gv9Var) {
                        if (!list.contains(Integer.valueOf(((huj) obj5).a))) {
                            arrayList3.add(obj5);
                        }
                    }
                    gv9 W = l6g.W(arrayList3);
                    av8Var2.n0(W);
                    obj4 = W;
                }
                gv9 gv9Var4 = (gv9) obj4;
                if (size < 3) {
                    gv9Var3 = gv9Var4;
                    z = true;
                } else {
                    gv9Var3 = gv9Var4;
                    z = false;
                }
                boolean e = ((i2 & 57344) == 16384) | av8Var2.e(i4);
                Object O3 = av8Var2.O();
                if (e || O3 == a99Var) {
                    z2 = true;
                    O3 = new muh(i4, 1, function2);
                    av8Var2.n0(O3);
                } else {
                    z2 = true;
                }
                xtcVar3 = xtcVar;
                a(gv9Var3, hujVar2, z, xtcVar3, (Function1) O3, av8Var2, 0);
                av8Var2.s(false);
                z3 = z2;
                i4 = i5;
                i3 = i2;
            }
            ?? r0 = z3;
            av8Var2.s(false);
            fz8.d(size > r0 ? r0 == true ? 1 : 0 : false, null, null, null, null, yqo.H(841732878, av8Var2, new r64(11, function0)), av8Var2, 1572870, 30);
            if (size < 2) {
                av8Var2.d0(-1564467954);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                nq8.h(av8Var2, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, r0));
                av8Var2.s(false);
            } else {
                av8Var2.d0(-1564408372);
                av8Var2.s(false);
            }
            l98.b(size == r0 ? mh.b : (2 > size || size >= 4) ? mh.a : mh.c, null, null, null, null, null, yqo.H(-2054483603, av8Var2, new rsh(8, function02, gv9Var2)), av8Var2, 1572864, 62);
            av8 av8Var3 = av8Var2;
            av8Var3.s(r0);
            av8Var = av8Var3;
        } else {
            av8Var2.W();
            av8Var = av8Var2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ere(gv9Var, gv9Var2, function0, function02, function2, i, 24);
        }
    }
}
