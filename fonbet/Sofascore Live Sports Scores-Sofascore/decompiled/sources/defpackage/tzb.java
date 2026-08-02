package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tzb {
    public static final ff5 a;

    static {
        ypa.b(new ogb(27));
        a = new ff5(1, new ogb(28));
    }

    public static final void a(g23 g23Var, awc awcVar, cch cchVar, a7k a7kVar, tc3 tc3Var, of3 of3Var, int i) {
        int i2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(904511636);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(g23Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(awcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(cchVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.g(a7kVar) ? a.o : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.i(tc3Var) ? 16384 : 8192;
        }
        if (av8Var.T(i2 & 1, (i2 & 9363) != 9362)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            int i3 = 7;
            p5g a2 = n5g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
            long j = g23Var.a;
            boolean f = av8Var.f(j);
            Object O = av8Var.O();
            if (f || O == nf3.a) {
                O = new wej(j, r13.c(j, 0.4f));
                av8Var.n0(O);
            }
            tol.c(new gb0[]{i23.a.a(g23Var), a.a(awcVar), f1a.a.a(a2), ech.a.a(cchVar), xej.a.a((wej) O), d7k.a.a(a7kVar)}, yqo.H(-1750539308, av8Var, new kp1(i3, a7kVar, tc3Var)), av8Var, 56);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(g23Var, awcVar, cchVar, a7kVar, tc3Var, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(g23 g23Var, cch cchVar, a7k a7kVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        cch cchVar2;
        int i3;
        int i4;
        g23 g23Var2;
        a7k a7kVar2;
        cch cchVar3;
        eqf u;
        a7k a7kVar3;
        g23 g23Var3;
        cch cchVar4;
        int i5;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-449719819);
        int i6 = i | 2;
        if ((i2 & 2) == 0) {
            cchVar2 = cchVar;
            if (av8Var.g(cchVar2)) {
                i3 = 32;
                i4 = i6 | i3 | 128;
                if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
                    av8Var.W();
                    g23Var2 = g23Var;
                    a7kVar2 = a7kVar;
                    cchVar3 = cchVar2;
                } else {
                    av8Var.Y();
                    if ((i & 1) == 0 || av8Var.B()) {
                        g23 g23Var4 = (g23) av8Var.k(i23.a);
                        int i7 = i4 & (-15);
                        if ((i2 & 2) != 0) {
                            cchVar2 = (cch) av8Var.k(ech.a);
                            i7 = i4 & (-127);
                        }
                        int i8 = i7 & (-897);
                        a7kVar3 = (a7k) av8Var.k(d7k.a);
                        g23Var3 = g23Var4;
                        cchVar4 = cchVar2;
                        i5 = i8;
                    } else {
                        av8Var.W();
                        int i9 = i4 & (-15);
                        if ((i2 & 2) != 0) {
                            i9 = i4 & (-127);
                        }
                        int i10 = i9 & (-897);
                        a7kVar3 = a7kVar;
                        cchVar4 = cchVar2;
                        i5 = i10;
                        g23Var3 = g23Var;
                    }
                    av8Var.t();
                    a(g23Var3, (awc) av8Var.k(a), cchVar4, a7kVar3, tc3Var, av8Var, ((i5 << 3) & 896) | 24576);
                    g23Var2 = g23Var3;
                    cchVar3 = cchVar4;
                    a7kVar2 = a7kVar3;
                }
                u = av8Var.u();
                if (u == null) {
                    u.d = new bk1(g23Var2, cchVar3, a7kVar2, tc3Var, i, i2, 22);
                    return;
                }
                return;
            }
        } else {
            cchVar2 = cchVar;
        }
        i3 = 16;
        i4 = i6 | i3 | 128;
        if (av8Var.T(i4 & 1, (i4 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}
