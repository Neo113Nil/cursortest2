package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class e2h {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final i2h i2hVar, final Function1 function1, final xtc xtcVar, float f, of3 of3Var, final int i, final int i2) {
        int i3;
        float f2;
        final float f3;
        eqf u;
        xtc xtcVar2;
        long f4;
        long j;
        i2hVar.getClass();
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-500995151);
        if ((i & 6) == 0) {
            i3 = (av8Var.i(i2hVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f2 = f;
            i3 |= av8Var.d(f2) ? a.o : 1024;
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
                f3 = f2;
            } else {
                f3 = i4 != 0 ? 24.0f : f2;
                xtc r = bkh.r(xtcVar, null, 3);
                boolean z = i2hVar.b;
                boolean z2 = i2hVar.c;
                CrowdsourcingIncidentType crowdsourcingIncidentType = i2hVar.a;
                if (z) {
                    av8Var.d0(-419991932);
                    xtcVar2 = r;
                    f4 = r13.c(lz.D(R.color.crowdsourcing, av8Var), 0.15f);
                    av8Var.s(false);
                } else {
                    xtcVar2 = r;
                    f4 = ljg.f(av8Var, -419991138, R.color.surface_2, av8Var, false);
                }
                xtc A = wnn.A(yso.o(n9e.q(xtcVar2, f4, o7g.a(8.0f)), z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? ljg.f(av8Var, -419984566, R.color.crowdsourcing, av8Var, false) : ljg.f(av8Var, -419983586, R.color.surface_2, av8Var, false), o7g.a(8.0f)), o7g.a(8.0f));
                boolean z3 = i2hVar.c;
                boolean i5 = ((i3 & 112) == 32) | av8Var.i(i2hVar);
                Object O = av8Var.O();
                if (i5 || O == nf3.a) {
                    O = new zbe(29, function1, i2hVar);
                    av8Var.n0(O);
                }
                xtc b0 = l98.b0(tol.y(A, z3, false, false, 0L, null, (Function0) O, av8Var, 30), 8.0f);
                u23 a = t23.a(ww9.d, uxf.o, av8Var, 0);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, b0);
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
                d7e t = haa.t(j34.a(crowdsourcingIncidentType), 0, av8Var);
                utc utcVar = utc.a;
                xtc l = bkh.l(utcVar, 24.0f);
                if (z2 || z) {
                    av8Var.d0(986573286);
                    av8Var.s(false);
                    j = r13.i;
                } else {
                    j = ljg.f(av8Var, 986573828, R.color.n_lv_3, av8Var, false);
                }
                kq9.a(t, null, l, j, av8Var, 440, 0);
                nq8.h(av8Var, bkh.e(utcVar, f3));
                String e = j34.e(crowdsourcingIncidentType, (Context) av8Var.k(nz.b));
                yf8 yf8Var = xth.a;
                udj.c(e, null, (z2 || z) ? ljg.f(av8Var, 986582340, R.color.n_lv_1, av8Var, false) : ljg.f(av8Var, 986582820, R.color.n_lv_3, av8Var, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(true);
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: d2h
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        e2h.a(i2h.this, function1, xtcVar, f3, (of3) obj, aba.K(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f2 = f;
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void b(int i, of3 of3Var, xtc xtcVar, List list, Function1 function1) {
        int i2;
        Function1 function12;
        av8 av8Var;
        xtc xtcVar2;
        int i3;
        int i4;
        Function1 function13 = function1;
        list.getClass();
        function13.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(1925051306);
        if ((i & 6) == 0) {
            i2 = (av8Var2.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var2.i(function13) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = i2;
        if (av8Var2.T(i5 & 1, (i5 & 147) != 146)) {
            xtc h = ljg.h(16.0f, d2a.E(xtcVar, 1.0f, o7g.a(16.0f), false, 0L, 28), lz.D(R.color.surface_1, av8Var2), 16.0f);
            u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            xtc C = fqj.C(av8Var2, h);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var2, a, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var2, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var2, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var2, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var2, C, f50Var3);
            CrowdsourcingIncidentType crowdsourcingIncidentType = ((i2h) CollectionsKt.Y(list)).a;
            if (crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Card) {
                i3 = 1330746249;
                i4 = R.string.crowdsourcing_card_type;
            } else {
                if (!(crowdsourcingIncidentType instanceof CrowdsourcingIncidentType.Goal)) {
                    throw dmi.h(av8Var2, 1330743642, false);
                }
                i3 = 1330749673;
                i4 = R.string.crowdsourcing_goal_type;
            }
            String k = ljg.k(av8Var2, i3, i4, av8Var2, false);
            yf8 yf8Var = xth.a;
            boolean z = true;
            udj.c(k, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131066);
            utc utcVar = utc.a;
            nq8.h(av8Var2, bkh.e(utcVar, 12.0f));
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.l, av8Var2, 6);
            int hashCode2 = Long.hashCode(av8Var2.T);
            aee m2 = av8Var2.m();
            xtc C2 = fqj.C(av8Var2, utcVar);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, f50Var);
            waa.K(av8Var2, m2, ff3Var);
            bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C2, f50Var3);
            av8Var2.d0(1057189429);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Function1 function14 = function13;
                a((i2h) it.next(), function14, new goa(1.0f, z), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, i5 & 112, 8);
                function13 = function14;
                z = z;
            }
            boolean z2 = z;
            function12 = function13;
            av8Var = av8Var2;
            xtcVar2 = xtcVar;
            ljg.t(av8Var, false, z2, z2);
        } else {
            function12 = function13;
            av8Var = av8Var2;
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new c2h(list, function12, xtcVar2, i);
        }
    }
}
