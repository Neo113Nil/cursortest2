package defpackage;

import androidx.core.app.NotificationCompat;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class f64 {
    public static final void a(i64 i64Var, Function0 function0, Function0 function02, of3 of3Var, int i) {
        int i2;
        int i3;
        kv1 kv1Var;
        gv9 gv9Var;
        f50 f50Var;
        fci fciVar;
        boolean z;
        n7g a;
        h38 h38Var;
        p4h p4hVar;
        fci fciVar2;
        boolean z2;
        boolean z3;
        g38 g38Var;
        xtc q;
        boolean z4;
        utc utcVar;
        fci fciVar3;
        boolean z5;
        boolean z6;
        char c;
        i64 i64Var2 = i64Var;
        jf9 jf9Var = oyn.e;
        function0.getClass();
        function02.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1044694682);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? av8Var.g(i64Var2) : av8Var.i(i64Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            j9d L = jaa.L(av8Var);
            utc utcVar2 = utc.a;
            xtc u0 = hkg.u0(l98.d0(lz.J(utcVar2, L, null), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2).z(bkh.c), hkg.o0(av8Var), false, 14);
            p4h p4hVar2 = ww9.d;
            kv1 kv1Var2 = uxf.o;
            u23 a2 = t23.a(p4hVar2, kv1Var2, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, u0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a2, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            nq8.h(av8Var, bkh.e(utcVar2, 8.0f));
            yqo.b(i2 & 112, av8Var, null, function0);
            fci fciVar4 = i64Var2.a;
            gv9 gv9Var2 = i64Var2.c;
            h38 h38Var2 = i64Var2.b;
            if (fciVar4 == null && h38Var2 == null) {
                av8Var.d0(2099869906);
                av8Var.s(false);
                i3 = i2;
                f50Var = f50Var4;
                fciVar2 = fciVar4;
                p4hVar = p4hVar2;
                gv9Var = gv9Var2;
                z2 = false;
                kv1Var = kv1Var2;
                z3 = false;
                h38Var = h38Var2;
            } else {
                i3 = i2;
                bf3.r(8.0f, 2097856611, av8Var, av8Var, utcVar2);
                xtc q2 = n9e.q(utcVar2, lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                u23 a3 = t23.a(p4hVar2, kv1Var2, av8Var, 0);
                kv1Var = kv1Var2;
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, q2);
                av8Var.h0();
                gv9Var = gv9Var2;
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var2);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var4);
                if (fciVar4 == null) {
                    av8Var.d0(381759357);
                    z = false;
                    av8Var.s(false);
                    f50Var = f50Var4;
                    fciVar = fciVar4;
                } else {
                    av8Var.d0(381759358);
                    if (fciVar4 instanceof eci) {
                        av8Var.d0(-1938282322);
                        eci eciVar = (eci) fciVar4;
                        fciVar = fciVar4;
                        long D = lz.D(R.color.surface_1, av8Var);
                        if (h38Var2 != null) {
                            f50Var = f50Var4;
                            a = o7g.c(16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                        } else {
                            f50Var = f50Var4;
                            a = o7g.a(16.0f);
                        }
                        z = false;
                        o02.A(eciVar, n9e.q(utcVar2, D, a), av8Var, 0);
                        if (h38Var2 != null) {
                            av8Var.d0(-1937694872);
                            nq8.h(av8Var, n9e.q(bkh.d(bkh.e(utcVar2, 1.0f), 1.0f), lz.D(R.color.surface_0, av8Var), jf9Var));
                            av8Var.s(false);
                        } else {
                            av8Var.d0(-1937396962);
                            av8Var.s(false);
                        }
                        av8Var.s(false);
                    } else {
                        f50Var = f50Var4;
                        fciVar = fciVar4;
                        z = false;
                        av8Var.d0(-1937375138);
                        av8Var.s(false);
                    }
                    Unit unit = Unit.a;
                    av8Var.s(z);
                }
                if (h38Var2 == null) {
                    av8Var.d0(382811466);
                    av8Var.s(z);
                    p4hVar = p4hVar2;
                    fciVar2 = fciVar;
                    z2 = z;
                    h38Var = h38Var2;
                    z3 = false;
                } else {
                    av8Var.d0(382811467);
                    h38Var = h38Var2;
                    if (h38Var instanceof g38) {
                        av8Var.d0(1518690879);
                        g38 g38Var2 = (g38) h38Var;
                        if (fciVar != null) {
                            av8Var.d0(1518833448);
                            g38Var = g38Var2;
                            fciVar2 = fciVar;
                            z3 = false;
                            xtc q3 = n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3));
                            z2 = false;
                            av8Var.s(false);
                            q = q3;
                            p4hVar = p4hVar2;
                        } else {
                            g38Var = g38Var2;
                            fciVar2 = fciVar;
                            z2 = false;
                            z3 = false;
                            av8Var.d0(1519083401);
                            p4hVar = p4hVar2;
                            q = n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                            av8Var.s(false);
                        }
                        pco.n(g38Var, q, av8Var, z2 ? 1 : 0);
                        av8Var.s(z2);
                    } else {
                        p4hVar = p4hVar2;
                        fciVar2 = fciVar;
                        z2 = false;
                        z3 = false;
                        av8Var.d0(1519336671);
                        av8Var.s(false);
                    }
                    Unit unit2 = Unit.a;
                    av8Var.s(z2);
                }
                av8Var.s(true);
                av8Var.s(z2);
            }
            if (gv9Var.isEmpty()) {
                z4 = z2;
                utcVar = utcVar2;
                fciVar3 = fciVar2;
                av8Var.d0(2100784530);
                av8Var.s(z4);
            } else {
                bf3.r(8.0f, 2099947499, av8Var, av8Var, utcVar2);
                xtc q4 = n9e.q(bkh.d(utcVar2, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
                u23 a4 = t23.a(p4hVar, kv1Var, av8Var, 0);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, q4);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var2);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
                gv9 gv9Var3 = gv9Var;
                Iterator p = ljg.p(av8Var, C3, f50Var, 193840578, gv9Var3);
                int i4 = 0;
                while (p.hasNext()) {
                    Object next = p.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    EventSuggest.IncidentSuggest incidentSuggest = (EventSuggest.IncidentSuggest) next;
                    if (i4 != 0) {
                        av8Var.d0(-700324875);
                        c = 1554;
                        nq8.h(av8Var, n9e.q(bkh.d(bkh.e(utcVar2, 1.0f), 1.0f), lz.D(R.color.surface_0, av8Var), jf9Var));
                        z6 = false;
                        av8Var.s(false);
                    } else {
                        z6 = false;
                        c = 1554;
                        av8Var.d0(-700053873);
                        av8Var.s(false);
                    }
                    a0a.c(incidentSuggest, "", null, null, false, null, av8Var, 432, 56);
                    utcVar2 = utcVar2;
                    i4 = i5;
                    gv9Var3 = gv9Var3;
                    z3 = false;
                }
                gv9Var = gv9Var3;
                utcVar = utcVar2;
                fciVar3 = fciVar2;
                z4 = false;
                ljg.t(av8Var, false, true, false);
            }
            if ((h38Var instanceof g38) || (fciVar3 instanceof eci) || !gv9Var.isEmpty()) {
                av8Var.d0(2100995981);
                i64Var2 = i64Var;
                z5 = true;
                dy0.c(l64.b, i64Var2.d, function02, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), av8Var, (i3 & 896) | 3078);
                av8Var.s(z4);
            } else {
                av8Var.d0(2101308306);
                av8Var.s(z4);
                z5 = true;
                i64Var2 = i64Var;
            }
            av8Var.s(z5);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(i64Var2, function0, function02, i, 13);
        }
    }
}
