package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class d5i {
    public static final void a(int i, String str, String str2, old oldVar, fgf fgfVar, r9k r9kVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-91607175);
        int i3 = i2 | (av8Var.e(i) ? 4 : 2) | (av8Var.g(str) ? 32 : 16) | (av8Var.g(str2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(oldVar) ? a.o : 1024) | (av8Var.g(fgfVar) ? 16384 : 8192) | (av8Var.g(r9kVar) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (av8Var.T(i3 & 1, (74899 & i3) != 74898)) {
            u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            dld dldVar = (dld) CollectionsKt.firstOrNull(fgfVar.e);
            zmd zmdVar = dldVar != null ? dldVar.f : null;
            if (zmdVar == null) {
                av8Var.d0(1863783622);
                av8Var.s(false);
            } else {
                av8Var.d0(1863783623);
                r5i.a(zmdVar, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7), false, yqo.H(416841826, av8Var, new p8b(oldVar, str2, i, 28)), av8Var, 3120, 4);
                av8Var.s(false);
            }
            fz8.b(x23.a, r9kVar != null, null, null, null, null, yqo.H(1036504939, av8Var, new pte(r9kVar, 27)), av8Var, 1572870, 30);
            nld.d(i, str, null, oldVar, fgfVar, vmd.RACE_RESULTS, "featured", null, 0L, false, cgf.c, false, true, str2, null, av8Var, (i3 & 14) | 1769856 | (i3 & 112) | (i3 & 7168) | (57344 & i3), ((i3 << 3) & 7168) | 390, 19328);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(i, str, str2, oldVar, fgfVar, r9kVar, i2);
        }
    }

    public static final void b(e5i e5iVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(21051301);
        int i2 = (av8Var.i(e5iVar) ? 4 : 2) | i;
        int i3 = 26;
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            fz8.e(e5iVar != null, null, null, null, null, yqo.H(-1738292275, av8Var, new pte(e5iVar, i3)), av8Var, 196608, 30);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fvg(e5iVar, i, i3);
        }
    }
}
