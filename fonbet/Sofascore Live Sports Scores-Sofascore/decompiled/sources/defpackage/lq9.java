package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class lq9 {
    public static final xtc a = bkh.l(utc.a, 24.0f);

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011d, code lost:
    
        if (java.lang.Float.isInfinite(java.lang.Float.intBitsToFloat((int) (r10 & 4294967295L))) != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, long j, of3 of3Var, xtc xtcVar, d7e d7eVar, String str) {
        d7e d7eVar2;
        int i2;
        xtc xtcVar2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1142959010);
        if ((i & 6) == 0) {
            d7eVar2 = d7eVar;
            i2 = (av8Var.i(d7eVar2) ? 4 : 2) | i;
        } else {
            d7eVar2 = d7eVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= av8Var.f(j) ? 2048 : 1024;
        }
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            av8Var.Y();
            if ((i & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            boolean z = (((i2 & 7168) ^ 3072) > 2048 && av8Var.f(j)) || (i2 & 3072) == 2048;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z || O == a99Var) {
                O = e8k.a(j, r13.i) ? null : new ay1(j, 5);
                av8Var.n0(O);
            }
            ay1 ay1Var = (ay1) O;
            xtc xtcVar3 = utc.a;
            if (str != null) {
                av8Var.d0(609219782);
                boolean z2 = (i2 & 112) == 32;
                Object O2 = av8Var.O();
                if (z2 || O2 == a99Var) {
                    O2 = new jp1(str, 18);
                    av8Var.n0(O2);
                }
                xtc a2 = o3h.a(xtcVar3, false, (Function1) O2);
                av8Var.s(false);
                xtcVar2 = a2;
            } else {
                av8Var.d0(609378564);
                av8Var.s(false);
                xtcVar2 = xtcVar3;
            }
            xtc xtcVar4 = xtcVar2;
            if (!njh.c(d7eVar2.i(), 9205357640488583168L)) {
                long i3 = d7eVar2.i();
                if (Float.isInfinite(Float.intBitsToFloat((int) (i3 >> 32)))) {
                }
                e12.a(0, av8Var, fz8.Z(xtcVar.z(xtcVar3), d7eVar2, null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, 22).z(xtcVar4));
            }
            xtcVar3 = a;
            e12.a(0, av8Var, fz8.Z(xtcVar.z(xtcVar3), d7eVar2, null, mp3.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ay1Var, 22).z(xtcVar4));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new jq9(d7eVar, str, xtcVar, j, i);
        }
    }

    public static final void b(ImageVector imageVector, xtc xtcVar, long j, of3 of3Var, int i) {
        a((i & 112) | 8 | (i & 896) | (i & 7168), j, of3Var, xtcVar, o6a.J(imageVector, of3Var), null);
    }
}
