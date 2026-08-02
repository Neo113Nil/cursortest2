package defpackage;

import android.content.Context;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class gr1 {
    public static final List a = b.j(RequestConfiguration.MAX_AD_CONTENT_RATING_PG, "SG", "SF", "PF", "C");
    public static final List b = b.j(Integer.valueOf(R.string.injury_status_out), Integer.valueOf(R.string.injury_status_day_to_day));

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final void a(tee teeVar, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        int i3;
        boolean z;
        teeVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(81026212);
        int i4 = (av8Var.g(teeVar) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        ?? r6 = 1;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc q = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar = utc.a;
            xtc e0 = l98.e0(utcVar, 40.0f, 16.0f, 16.0f, 16.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(-1966262542);
            int i5 = 0;
            while (true) {
                if (i5 >= 5) {
                    break;
                }
                int i6 = i5 + 1;
                String p = i5 != 0 ? yid.p(i6) : null;
                if (p == null) {
                    z = false;
                    p = ljg.k(av8Var, 212204032, R.string.starters, av8Var, false);
                } else {
                    z = false;
                    av8Var.d0(212202513);
                    av8Var.s(false);
                }
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                q5a.w(p, bkh.q(new goa(1.0f, r6), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, r6), lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, new p7j(3), 0L, 2, false, 1, 0, xth.m(), av8Var2, 0, 24960, 109560);
                av8Var = av8Var2;
                i5 = i6;
                utcVar = utcVar;
                r6 = 1;
            }
            utc utcVar2 = utcVar;
            av8Var.s(false);
            av8Var.s(true);
            av8Var.d0(-1812183086);
            List list = a;
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    b.q();
                    throw null;
                }
                String str = (String) obj;
                gv9 gv9Var = (gv9) teeVar.get(str);
                if (gv9Var == null) {
                    av8Var.d0(1436746302);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1436746303);
                    b(str, gv9Var, i7 == list.size() + (-1), null, av8Var, 0);
                    Unit unit = Unit.a;
                    av8Var.s(false);
                }
                i7 = i8;
            }
            av8Var.s(false);
            av8 av8Var3 = av8Var;
            tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 14, 0L, 0L, av8Var3, l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7));
            av8Var = av8Var3;
            av8Var.d0(-1812170547);
            Iterator it = b.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue == R.string.injury_status_out) {
                    i2 = -868577664;
                    i3 = R.color.error;
                } else {
                    i2 = -868577152;
                    i3 = R.color.alert;
                }
                utc utcVar3 = utcVar2;
                c(intValue, 3072, ljg.f(av8Var, i2, i3, av8Var, false), av8Var, l98.f0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 4.0f, 2));
                utcVar2 = utcVar3;
            }
            bf3.t(av8Var, false, utcVar2, 4.0f, av8Var);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(teeVar, xtcVar, i, 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r8v4, types: [p8g] */
    public static final void b(String str, gv9 gv9Var, boolean z, xtc xtcVar, of3 of3Var, int i) {
        gv9 gv9Var2;
        xtc xtcVar2;
        Iterator it;
        float f;
        ?? r30;
        char c;
        float f2;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        ?? r12;
        char c2;
        int i4;
        int i5;
        lv1 lv1Var = uxf.m;
        p4h p4hVar = ww9.d;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-854664449);
        int i6 = i | (av8Var.g(str) ? 4 : 2) | (av8Var.g(gv9Var) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | 3072;
        if (av8Var.T(i6 & 1, (i6 & 1171) != 1170)) {
            Context context = (Context) av8Var.k(nz.b);
            u23 a2 = t23.a(p4hVar, uxf.o, av8Var, 0);
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
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc e = bkh.e(bkh.d(utcVar, 1.0f), 72.0f);
            p4h p4hVar2 = p4hVar;
            l8g a3 = k8g.a(ww9.b, lv1Var, av8Var, 48);
            int i7 = 48;
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            yf8 yf8Var = xth.a;
            float f3 = 8.0f;
            Context context2 = context;
            ?? r0 = 1;
            q5a.w(str, bkh.p(l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), 16.0f), lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(3), 0L, 2, false, 2, 0, xth.g(), av8Var, (i6 & 14) | 48, 24960, 109560);
            av8Var = av8Var;
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            ?? r14 = 1098907648;
            char c3 = 6;
            float f4 = 4.0f;
            l8g a4 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.l, av8Var, 6);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            gv9Var2 = gv9Var;
            Iterator p = ljg.p(av8Var, C3, f50Var3, 655572564, gv9Var2);
            while (p.hasNext()) {
                coe coeVar = (coe) p.next();
                ?? r8 = p8g.a;
                if (coeVar != null) {
                    String str2 = coeVar.e;
                    av8Var.d0(-1309742760);
                    xtc A = wnn.A(bkh.e(bkh.q(r8.a(1.0f, utcVar, r0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, r0), 72.0f), o7g.a(f4));
                    Context context3 = context2;
                    boolean i8 = av8Var.i(context3) | av8Var.g(coeVar);
                    Object O = av8Var.O();
                    if (i8 || O == nf3.a) {
                        O = new j4(27, context3, coeVar);
                        av8Var.n0(O);
                    }
                    context2 = context3;
                    float f5 = f4;
                    av8 av8Var2 = av8Var;
                    f2 = f3;
                    xtc f02 = l98.f0(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var2, 31), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    p4h p4hVar3 = p4hVar2;
                    u23 a5 = t23.a(p4hVar3, uxf.p, av8Var2, i7);
                    int hashCode4 = Long.hashCode(av8Var2.T);
                    aee m4 = av8Var2.m();
                    xtc C4 = fqj.C(av8Var2, f02);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var2, a5, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var2, m4, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var2, valueOf2, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var2, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var2, C4, f50Var6);
                    xtc p2 = bkh.p(utcVar, 56.0f);
                    mv1 mv1Var = uxf.c;
                    p4hVar2 = p4hVar3;
                    k1c c4 = e12.c(mv1Var, false);
                    int hashCode5 = Long.hashCode(av8Var2.T);
                    aee m5 = av8Var2.m();
                    xtc C5 = fqj.C(av8Var2, p2);
                    av8Var2.h0();
                    it = p;
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var2);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, c4, f50Var4);
                    waa.K(av8Var2, m5, ff3Var2);
                    bf3.s(hashCode5, av8Var2, f50Var5, av8Var2, ryVar2);
                    waa.K(av8Var2, C5, f50Var6);
                    if (Intrinsics.c(str2, "dayToDay")) {
                        i2 = 870158965;
                        i3 = R.color.alert;
                        z2 = false;
                    } else {
                        z2 = false;
                        if (str2 != null) {
                            i2 = 870160341;
                            i3 = R.color.error;
                        } else {
                            i2 = 870160852;
                            i3 = R.color.n_lv_4;
                        }
                    }
                    long f6 = ljg.f(av8Var2, i2, i3, av8Var2, z2);
                    int i9 = coeVar.a;
                    mv1 mv1Var2 = uxf.g;
                    n12 n12Var = n12.a;
                    f = f5;
                    td4.C(i9, qx9.p(bkh.l(l98.f0(n12Var.a(utcVar, mv1Var2), 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, f5, 2), 40.0f), 1.0f), f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var2, 0, 8);
                    if (str2 != null) {
                        av8Var2.d0(1205833328);
                        c2 = 6;
                        ImageVector N = s6a.N(R.drawable.ic_cross, 6, av8Var2);
                        xtc a6 = n12Var.a(utcVar, mv1Var);
                        n7g n7gVar = o7g.a;
                        r12 = 1098907648;
                        kq9.b(N, null, bkh.l(n9e.q(yso.o(wnn.A(a6, n7gVar), 1.0f, lz.D(R.color.neutral_highlight, av8Var2), n7gVar), lz.D(R.color.on_color_primary, av8Var2), oyn.e), 16.0f), f6, av8Var2, 48, 0);
                        z3 = false;
                        av8Var2.s(false);
                    } else {
                        z3 = false;
                        r12 = 1098907648;
                        c2 = 6;
                        av8Var2.d0(1206734839);
                        av8Var2.s(false);
                    }
                    av8Var2.s(true);
                    String str3 = coeVar.b;
                    yf8 yf8Var2 = xth.a;
                    dfj n = xth.n();
                    if (str2 == null) {
                        i4 = 1265022170;
                        i5 = R.color.n_lv_1;
                    } else {
                        i4 = 1265022650;
                        i5 = R.color.n_lv_3;
                    }
                    long f7 = ljg.f(av8Var2, i4, i5, av8Var2, z3);
                    c = c2;
                    r30 = r12;
                    i7 = 48;
                    q5a.w(str3, null, f7, null, 0L, 0L, null, 0L, 2, false, 1, 0, n, av8Var2, 0, 24960, 110586);
                    av8Var = av8Var2;
                    av8Var.s(true);
                    av8Var.s(z3);
                } else {
                    boolean z4 = r0;
                    it = p;
                    f = f4;
                    r30 = r14;
                    c = c3;
                    f2 = f3;
                    av8Var.d0(-1306921419);
                    xtc b2 = r8.b(bkh.q(r8.a(1.0f, utcVar, z4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 56.0f, z4 ? 1 : 0), lv1Var);
                    yf8 yf8Var3 = xth.a;
                    av8 av8Var3 = av8Var;
                    q5a.w("-", b2, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, new p7j(3), 0L, 0, false, 0, 0, xth.n(), av8Var3, 6, 0, 130040);
                    av8Var = av8Var3;
                    av8Var.s(false);
                }
                c3 = c;
                p = it;
                f4 = f;
                f3 = f2;
                r14 = r30;
                r0 = 1;
            }
            boolean z5 = r0;
            ljg.t(av8Var, false, z5, z5);
            if (z) {
                av8Var.d0(1656226925);
                av8Var.s(false);
            } else {
                av8Var.d0(1656185602);
                av8 av8Var4 = av8Var;
                tz9.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 15, 0L, 0L, av8Var4, null);
                av8Var = av8Var4;
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            gv9Var2 = gv9Var;
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(str, gv9Var2, z, xtcVar2, i, 2);
        }
    }

    public static final void c(int i, int i2, long j, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1059507005);
        int i3 = i2 | (av8Var.e(R.drawable.ic_cross) ? 4 : 2) | (av8Var.e(i) ? 32 : 16) | (av8Var.f(j) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            l8g a2 = k8g.a(new ng0(8.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            int i4 = i3 << 3;
            kq9.b(s6a.N(R.drawable.ic_cross, (i4 & 112) | 6, av8Var), null, bkh.l(utc.a, 24.0f), j, av8Var, (i4 & 7168) | 432, 0);
            yf8 yf8Var = xth.a;
            q5a.w(oea.v(i, av8Var), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.b(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fr1(i, j, xtcVar, i2, 0);
        }
    }
}
