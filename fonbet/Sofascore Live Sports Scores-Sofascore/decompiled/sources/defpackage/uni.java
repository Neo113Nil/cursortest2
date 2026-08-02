package defpackage;

import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class uni {
    public static final ff5 a = new ff5(0, new egi(8));

    public static final void a(xtc xtcVar, uah uahVar, long j, long j2, float f, float f2, qz1 qz1Var, Function2 function2, of3 of3Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            xtcVar = utc.a;
        }
        if ((i2 & 2) != 0) {
            uahVar = oyn.e;
        }
        if ((i2 & 4) != 0) {
            j = ((g23) ((av8) of3Var).k(i23.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = i23.b(j, of3Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            qz1Var = null;
        }
        av8 av8Var = (av8) of3Var;
        ff5 ff5Var = a;
        float f3 = f + ((p75) av8Var.k(ff5Var)).a;
        tol.c(new gb0[]{lo3.a.a(new r13(j2)), ff5Var.a(new p75(f3))}, yqo.H(421772006, av8Var, new rni(xtcVar, uahVar, j, f3, qz1Var, f2, function2)), av8Var, 56);
    }

    public static final void b(boolean z, Function0 function0, xtc xtcVar, boolean z2, uah uahVar, long j, qz1 qz1Var, tc3 tc3Var, of3 of3Var, int i) {
        long b = i23.b(j, of3Var);
        av8 av8Var = (av8) of3Var;
        av8Var.d0(1528143336);
        Object O = av8Var.O();
        if (O == nf3.a) {
            O = mz1.e(av8Var);
        }
        av8Var.s(false);
        av8 av8Var2 = (av8) of3Var;
        ff5 ff5Var = a;
        float f = ((p75) av8Var2.k(ff5Var)).a + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        tol.c(new gb0[]{lo3.a.a(new r13(b)), ff5Var.a(new p75(f))}, yqo.H(1508735219, av8Var2, new tni(xtcVar, uahVar, j, f, qz1Var, z, (wzc) O, z2, function0, tc3Var)), av8Var2, 56);
    }

    public static final void c(Function0 function0, xtc xtcVar, boolean z, uah uahVar, long j, long j2, float f, float f2, qz1 qz1Var, wzc wzcVar, tc3 tc3Var, of3 of3Var, int i, int i2) {
        wzc wzcVar2;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        float f3 = (i2 & 64) != 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f;
        qz1 qz1Var2 = (i2 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : qz1Var;
        av8 av8Var = (av8) of3Var;
        if (wzcVar == null) {
            av8Var.d0(-1701037204);
            Object O = av8Var.O();
            if (O == nf3.a) {
                O = mz1.e(av8Var);
            }
            av8Var.s(false);
            wzcVar2 = (wzc) O;
        } else {
            av8Var.d0(2023337163);
            av8Var.s(false);
            wzcVar2 = wzcVar;
        }
        av8 av8Var2 = (av8) of3Var;
        ff5 ff5Var = a;
        float f4 = ((p75) av8Var2.k(ff5Var)).a + f3;
        tol.c(new gb0[]{lo3.a.a(new r13(j2)), ff5Var.a(new p75(f4))}, yqo.H(849208527, av8Var2, new sni(f4, f2, j, qz1Var2, tc3Var, xtcVar, wzcVar2, uahVar, function0, z2)), av8Var2, 56);
    }

    public static final xtc d(xtc xtcVar, uah uahVar, long j, qz1 qz1Var, float f) {
        uah uahVar2;
        xtc xtcVar2;
        xtc xtcVar3 = utc.a;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            uahVar2 = uahVar;
            xtcVar2 = s02.N(xtcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, uahVar2, 124895);
        } else {
            uahVar2 = uahVar;
            xtcVar2 = xtcVar3;
        }
        xtc z = xtcVar.z(xtcVar2);
        if (qz1Var != null) {
            xtcVar3 = yso.p(xtcVar3, qz1Var.a, qz1Var.b, uahVar2);
        }
        return wnn.A(n9e.q(z.z(xtcVar3), j, uahVar2), uahVar2);
    }

    public static final long e(long j, float f, av8 av8Var) {
        g23 g23Var = (g23) av8Var.k(i23.a);
        boolean booleanValue = ((Boolean) av8Var.k(i23.b)).booleanValue();
        long j2 = g23Var.p;
        int i = r13.j;
        if (!e8k.a(j, j2) || !booleanValue) {
            return j;
        }
        if (p75.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            return j2;
        }
        return hkg.B(r13.c(g23Var.t, ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
