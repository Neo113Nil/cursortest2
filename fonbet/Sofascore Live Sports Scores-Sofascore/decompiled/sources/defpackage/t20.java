package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t20 {
    public static final ff5 a = new ff5(0, mz.q);
    public static final ff5 b = new ff5(0, mz.p);

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f2f f2fVar, Function0 function0, g2f g2fVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        Function0 function02;
        g2f g2fVar2;
        Function0 function03;
        eqf u;
        int i4;
        String str;
        boolean z;
        ema emaVar;
        int i5;
        Object obj;
        f2f f2fVar2 = f2fVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(f2fVar2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= av8Var.i(function02) ? 32 : 16;
            if ((i & 384) != 0) {
                g2fVar2 = g2fVar;
                i3 |= av8Var.g(g2fVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            } else {
                g2fVar2 = g2fVar;
            }
            if ((i & 3072) == 0) {
                i3 |= av8Var.i(tc3Var) ? a.o : 1024;
            }
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
                function03 = function02;
            } else {
                Function0 function04 = i6 != 0 ? null : function02;
                View view = (View) av8Var.k(nz.f);
                kx4 kx4Var = (kx4) av8Var.k(dh3.h);
                String str2 = (String) av8Var.k(a);
                ema emaVar2 = (ema) av8Var.k(dh3.n);
                androidx.compose.runtime.a S = z8e.S(av8Var);
                e1d g = e.g(tc3Var, av8Var);
                Object[] objArr = new Object[0];
                Object O = av8Var.O();
                a99 a99Var = nf3.a;
                Object obj2 = O;
                if (O == a99Var) {
                    mz mzVar = mz.r;
                    av8Var.n0(mzVar);
                    obj2 = mzVar;
                }
                UUID uuid = (UUID) o3a.N(objArr, (Function0) obj2, av8Var, 48);
                boolean booleanValue = ((Boolean) av8Var.k(b)).booleanValue();
                Object O2 = av8Var.O();
                if (O2 == a99Var) {
                    str = str2;
                    i4 = i3;
                    z = true;
                    b2f b2fVar = new b2f(function04, g2fVar2, str, view, kx4Var, f2fVar2, uuid, booleanValue);
                    f2fVar2 = f2fVar2;
                    b2fVar.m(S, new tc3(-297523940, new s20(b2fVar, g, true ? 1 : 0), true));
                    av8Var.n0(b2fVar);
                    O2 = b2fVar;
                } else {
                    i4 = i3;
                    str = str2;
                    z = true;
                }
                b2f b2fVar2 = (b2f) O2;
                int i7 = i4 & 112;
                int i8 = i4 & 896;
                boolean i9 = av8Var.i(b2fVar2) | (i7 == 32 ? z : false) | (i8 == 256 ? z : false) | av8Var.g(str) | av8Var.e(emaVar2.ordinal());
                Object O3 = av8Var.O();
                if (i9 || O3 == a99Var) {
                    O3 = new m20(b2fVar2, function04, g2fVar, str, emaVar2);
                    av8Var.n0(O3);
                }
                hz8.d(b2fVar2, (Function1) O3, av8Var);
                boolean i10 = av8Var.i(b2fVar2) | (i7 == 32 ? z : false) | (i8 == 256 ? z : false) | av8Var.g(str) | av8Var.e(emaVar2.ordinal());
                Object O4 = av8Var.O();
                if (i10 || O4 == a99Var) {
                    O4 = new n20(b2fVar2, function04, g2fVar, str, emaVar2);
                    emaVar = emaVar2;
                    av8Var.n0(O4);
                } else {
                    emaVar = emaVar2;
                }
                hz8.t((Function0) O4, av8Var);
                boolean i11 = av8Var.i(b2fVar2) | ((i4 & 14) == 4 ? z : false);
                Object O5 = av8Var.O();
                Object obj3 = O5;
                if (i11 || O5 == a99Var) {
                    i20 i20Var = new i20(2, b2fVar2, f2fVar2);
                    av8Var.n0(i20Var);
                    obj3 = i20Var;
                }
                hz8.d(f2fVar2, (Function1) obj3, av8Var);
                boolean i12 = av8Var.i(b2fVar2);
                Object O6 = av8Var.O();
                Object obj4 = O6;
                if (i12 || O6 == a99Var) {
                    l0 l0Var = new l0(b2fVar2, null, 13);
                    av8Var.n0(l0Var);
                    obj4 = l0Var;
                }
                hz8.o(av8Var, b2fVar2, (Function2) obj4);
                boolean i13 = av8Var.i(b2fVar2);
                Object O7 = av8Var.O();
                if (i13 || O7 == a99Var) {
                    i5 = 0;
                    p20 p20Var = new p20(b2fVar2, 0);
                    av8Var.n0(p20Var);
                    obj = p20Var;
                } else {
                    i5 = 0;
                    obj = O7;
                }
                xtc A = un0.A(utc.a, (Function1) obj);
                boolean i14 = av8Var.i(b2fVar2) | av8Var.e(emaVar.ordinal());
                Object O8 = av8Var.O();
                Object obj5 = O8;
                if (i14 || O8 == a99Var) {
                    q20 q20Var = new q20(i5, b2fVar2, emaVar);
                    av8Var.n0(q20Var);
                    obj5 = q20Var;
                }
                k1c k1cVar = (k1c) obj5;
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, A);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, k1cVar, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                av8Var.s(z);
                function03 = function04;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new r20(f2fVar2, function03, g2fVar, tc3Var, i, i2, 0);
                return;
            }
            return;
        }
        function02 = function0;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(mv1 mv1Var, long j, Function0 function0, g2f g2fVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        int i3;
        long j2;
        int i4;
        g2f g2fVar2;
        tc3 tc3Var2;
        eqf u;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(71005054);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(mv1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= av8Var.f(j2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                g2fVar2 = g2fVar;
                i3 |= av8Var.g(g2fVar2) ? a.o : 1024;
                if ((i & 24576) == 0) {
                    tc3Var2 = tc3Var;
                    i3 |= av8Var.i(tc3Var2) ? 16384 : 8192;
                } else {
                    tc3Var2 = tc3Var;
                }
                if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        j2 = 0;
                    }
                    if (i4 != 0) {
                        g2fVar2 = new g2f(31);
                    }
                    boolean e = ((i3 & 14) == 4) | ((i3 & 112) == 32) | av8Var.e(g2fVar2.f) | av8Var.g(null);
                    Object O = av8Var.O();
                    if (e || O == nf3.a) {
                        O = new ro(mv1Var, j2);
                        av8Var.n0(O);
                    }
                    a((ro) O, function0, g2fVar2, tc3Var2, av8Var, (i3 >> 3) & 8176, 0);
                } else {
                    av8Var.W();
                }
                long j3 = j2;
                g2f g2fVar3 = g2fVar2;
                u = av8Var.u();
                if (u != null) {
                    u.d = new l20(mv1Var, j3, function0, g2fVar3, tc3Var, i, i2);
                    return;
                }
                return;
            }
            g2fVar2 = g2fVar;
            if ((i & 24576) == 0) {
            }
            if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            }
            long j32 = j2;
            g2f g2fVar32 = g2fVar2;
            u = av8Var.u();
            if (u != null) {
            }
        }
        j2 = j;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        g2fVar2 = g2fVar;
        if ((i & 24576) == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
        }
        long j322 = j2;
        g2f g2fVar322 = g2fVar2;
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
