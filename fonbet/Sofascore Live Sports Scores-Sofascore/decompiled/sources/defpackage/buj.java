package defpackage;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class buj {
    static {
        ypa.b(new eej(21));
        ypa.b(new eej(22));
    }

    public static final void a(cuj cujVar, Function1 function1, qug qugVar, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1931305322);
        int i3 = (i & 6) == 0 ? (av8Var2.g(cujVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var2.g(qugVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            av8Var2.Y();
            if ((i & 1) != 0 && !av8Var2.B()) {
                av8Var2.W();
            }
            av8Var2.t();
            xtc u0 = hkg.u0(lz.J(bkh.c, jaa.L(av8Var2), null), qugVar, false, 14);
            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, u0);
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
            int i4 = cujVar.c;
            utj utjVar = cujVar.p;
            gv9<k0j> gv9Var = cujVar.k;
            s6a.b(i4, 0, av8Var2, cujVar.a, cujVar.b);
            int size = cujVar.i.size();
            int size2 = cujVar.d.size();
            Integer num = cujVar.e;
            int i5 = utjVar.c;
            gv9 gv9Var2 = cujVar.o;
            boolean g = av8Var2.g(gv9Var);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (g || O == a99Var) {
                ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                for (k0j k0jVar : gv9Var) {
                    int i6 = i3;
                    gv9 gv9Var3 = k0jVar.b;
                    if (gv9Var3 == null) {
                        gv9Var3 = rlh.b;
                    }
                    arrayList.add(new tui(gv9Var3, k0jVar.e));
                    i3 = i6;
                }
                i2 = i3;
                O = l6g.W(arrayList);
                av8Var2.n0(O);
            } else {
                i2 = i3;
            }
            gv9 gv9Var4 = (gv9) O;
            int i7 = i2 & 112;
            boolean z = i7 == 32;
            Object O2 = av8Var2.O();
            if (z || O2 == a99Var) {
                O2 = new k1e(29, function1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            b6a.g(size, size2, num, gv9Var4, (Function1) O2, null, i5, gv9Var2, av8Var, 0);
            Integer num2 = cujVar.e;
            if (num2 == null) {
                av8Var.d0(1757241549);
                av8Var.s(false);
            } else {
                av8Var.d0(1757241550);
                int intValue = num2.intValue();
                b7g b7gVar = cujVar.f;
                if (b7gVar == null) {
                    av8Var.d0(384980560);
                    av8Var.s(false);
                } else {
                    av8Var.d0(384980561);
                    boolean z2 = cujVar.g;
                    boolean z3 = cujVar.h;
                    boolean e = (i7 == 32) | av8Var.e(intValue);
                    Object O3 = av8Var.O();
                    if (e || O3 == a99Var) {
                        O3 = new kj4(intValue, 4, function1);
                        av8Var.n0(O3);
                    }
                    Function0 function0 = (Function0) O3;
                    boolean e2 = (i7 == 32) | av8Var.e(intValue);
                    Object O4 = av8Var.O();
                    if (e2 || O4 == a99Var) {
                        O4 = new kj4(intValue, 5, function1);
                        av8Var.n0(O4);
                    }
                    t6a.d(b7gVar, z2, z3, function0, (Function0) O4, av8Var, 0);
                    Unit unit = Unit.a;
                    av8Var.s(false);
                }
                av8Var.s(false);
            }
            gv9 gv9Var5 = cujVar.i;
            gv9 gv9Var6 = cujVar.k;
            boolean z4 = i7 == 32;
            Object O5 = av8Var.O();
            if (z4 || O5 == a99Var) {
                O5 = new b4j(3, function1);
                av8Var.n0(O5);
            }
            Function0 function02 = (Function0) O5;
            boolean z5 = i7 == 32;
            Object O6 = av8Var.O();
            if (z5 || O6 == a99Var) {
                O6 = new b4j(4, function1);
                av8Var.n0(O6);
            }
            Function0 function03 = (Function0) O6;
            boolean z6 = i7 == 32;
            Object O7 = av8Var.O();
            if (z6 || O7 == a99Var) {
                O7 = new o34(12, function1);
                av8Var.n0(O7);
            }
            guj.b(gv9Var5, gv9Var6, function02, function03, (Function2) O7, av8Var, 0);
            int size3 = gv9Var.size();
            euj.f(gv9Var, l98.f0(utc.a, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, size3 == 1 ? 12.0f : (2 > size3 || size3 >= 4) ? 44.0f : 88.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), av8Var, 0);
            o6a.c(cujVar.l && utjVar.a, cujVar.m, cujVar.n, av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(cujVar, function1, qugVar, i, 13);
        }
    }

    public static final void b(muj mujVar, qug qugVar, of3 of3Var, int i) {
        mujVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(668390606);
        int i2 = (av8Var.i(mujVar) ? 4 : 2) | i | (av8Var.g(qugVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            ktm.t((vnb) rfo.x(mujVar.f, av8Var, 0).getValue(), null, false, null, null, yqo.H(-230453597, av8Var, new e6i(15, mujVar, qugVar)), av8Var, 196608, 30);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bmj(mujVar, qugVar, i, 4);
        }
    }
}
