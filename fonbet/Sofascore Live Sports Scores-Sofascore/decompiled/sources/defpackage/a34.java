package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.V2;
import com.sofascore.model.crowdsourcing.CrowdsourcingIncidentType;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class a34 {
    public static final void a(ey4 ey4Var, xtc xtcVar, int i, Function1 function1, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        f50 f50Var;
        Pair pair;
        Pair pair2;
        boolean z;
        utc utcVar;
        boolean z2;
        Integer valueOf = Integer.valueOf(R.string.suggestion_pending);
        ey4Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1410912614);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.i(ey4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= av8Var.e(i) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.i(function1) ? 2048 : 1024;
        }
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            float G = ao2.G(i, (Context) av8Var.k(nz.b));
            if (G > 48.0f) {
                G = 48.0f;
            }
            float f = (48.0f - G) / 48.0f;
            float f2 = 16.0f * f;
            float f3 = 8.0f * f;
            boolean d = av8Var.d(f);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d || O == a99Var) {
                O = e.f(Boolean.valueOf(!(f == 1.0f)));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            Object value = e1dVar.getValue();
            boolean g = ((i4 & 7168) == 2048) | av8Var.g(e1dVar);
            Object O2 = av8Var.O();
            rq3 rq3Var = null;
            if (g || O2 == a99Var) {
                O2 = new y24(function1, e1dVar, rq3Var, 0);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, value, (Function2) O2);
            utc utcVar2 = utc.a;
            xtc f0 = l98.f0(n9e.q(d2a.E(l98.f0(mha.G(utcVar2, 2.0f), f3, f3, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 1.0f, o7g.a(f2), false, 0L, 28), lz.D(R.color.surface_1, av8Var), o7g.a(f2)), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 2);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.o;
            u23 a = t23.a(p4hVar, kv1Var, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, f0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, a, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf2 = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf2, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            int i5 = i4;
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            xtc e = bkh.e(utcVar2, 48.0f * f);
            u23 a2 = t23.a(ww9.f, kv1Var, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, e);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, f50Var2);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var4);
            SuggestStatus suggestStatus = ey4Var.a;
            if (suggestStatus == null) {
                av8Var.d0(-1522929798);
                String v = oea.v(R.string.crowdsourcing_detail_preview, av8Var);
                yf8 yf8Var = xth.a;
                z = true;
                utcVar = utcVar2;
                udj.c(v, null, r13.c(lz.D(R.color.n_lv_1, av8Var), f * 1.0f), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
                z2 = false;
            } else {
                av8Var.d0(-1522635887);
                int i6 = z24.a[suggestStatus.ordinal()];
                if (i6 == 1) {
                    f50Var = f50Var2;
                    av8Var.d0(-326208815);
                    if (Intrinsics.c(ey4Var.i, Boolean.TRUE)) {
                        av8Var.d0(-1522517963);
                        pair = new Pair(Integer.valueOf(R.string.crowdsourcing_accepted_status), new r13(lz.D(R.color.success, av8Var)));
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-1522398365);
                        pair = new Pair(valueOf, new r13(lz.D(R.color.n_lv_3, av8Var)));
                        av8Var.s(false);
                    }
                    pair2 = pair;
                    av8Var.s(false);
                } else if (i6 == 2) {
                    f50Var = f50Var2;
                    av8Var.d0(-326199575);
                    pair2 = new Pair(Integer.valueOf(R.string.suggestion_declined), new r13(lz.D(R.color.error, av8Var)));
                    av8Var.s(false);
                } else if (i6 == 3) {
                    f50Var = f50Var2;
                    av8Var.d0(-326196525);
                    pair2 = new Pair(Integer.valueOf(R.string.crowdsourcing_submitted_status), new r13(lz.D(R.color.n_lv_3, av8Var)));
                    av8Var.s(false);
                } else if (i6 == 4) {
                    f50Var = f50Var2;
                    av8Var.d0(-326193241);
                    pair2 = new Pair(valueOf, new r13(lz.D(R.color.n_lv_3, av8Var)));
                    av8Var.s(false);
                } else {
                    if (i6 != 5) {
                        throw dmi.h(av8Var, -326211233, false);
                    }
                    av8Var.d0(-326190326);
                    f50Var = f50Var2;
                    pair2 = new Pair(Integer.valueOf(R.string.suggestion_unresolved), new r13(lz.D(R.color.n_lv_3, av8Var)));
                    av8Var.s(false);
                }
                int intValue = ((Number) pair2.a).intValue();
                long j = ((r13) pair2.b).a;
                l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, utcVar2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var3, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var4);
                String v2 = oea.v(intValue, av8Var);
                yf8 yf8Var2 = xth.a;
                z = true;
                utcVar = utcVar2;
                z2 = false;
                udj.c(v2, null, j, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                nq8.h(av8Var, new goa(1.0f, true));
                kq9.a(haa.t(j34.b(suggestStatus), 0, av8Var), null, bkh.l(utcVar, 24.0f), j, av8Var, 440, 0);
                av8Var.s(true);
                av8Var.s(false);
            }
            av8Var.s(z);
            TeamSide teamSide = ey4Var.h;
            int i7 = teamSide == null ? -1 : z24.b[teamSide.ordinal()];
            if (i7 == -1 || i7 == z) {
                av8Var.d0(-1016612153);
                c(ey4Var, null, av8Var, i5 & 14, 2);
                av8Var.s(z2);
                Unit unit = Unit.a;
            } else {
                if (i7 != 2) {
                    throw dmi.h(av8Var, -1016613888, z2);
                }
                av8Var.d0(-1016610457);
                b(ey4Var, null, av8Var, i5 & 14, 2);
                av8Var.s(z2);
                Unit unit2 = Unit.a;
            }
            av8Var.s(z);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new r22(ey4Var, xtcVar2, i, function1, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ey4 ey4Var, xtc xtcVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        xtc xtcVar3;
        eqf u;
        ey4Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1133155588);
        if ((i & 6) == 0) {
            i3 = i | (av8Var.i(ey4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var.g(xtcVar2) ? 32 : 16;
            if (av8Var.T(i3 & 1, (i3 & 19) == 18)) {
                av8Var.W();
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar4 = i4 != 0 ? utcVar : xtcVar2;
                xtc o = yso.o(bkh.e(bkh.d(xtcVar4, 1.0f), 56.0f), 1.0f, lz.D(R.color.n_lv_4, av8Var), o7g.a(8.0f));
                l8g a = k8g.a(ww9.c, uxf.m, av8Var, 54);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, o);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                xtc xtcVar5 = xtcVar4;
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                xtc c = bkh.c(utcVar, 1.0f);
                kg0 kg0Var = ww9.f;
                u23 a2 = t23.a(kg0Var, uxf.o, av8Var, 6);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String str = ey4Var.f;
                Integer num = ey4Var.e;
                Integer num2 = ey4Var.d;
                if (str == null) {
                    str = "";
                }
                yf8 yf8Var = xth.a;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                String str2 = ey4Var.g;
                if (str2 == null) {
                    av8Var.d0(-1111785039);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1111785038);
                    udj.c(wv8.i(oea.v(R.string.football_assist, av8Var), ": ", str2), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
                    av8Var = av8Var;
                    Unit unit = Unit.a;
                    av8Var.s(false);
                }
                boolean z = true;
                i.o(av8Var, true, utcVar, 12.0f, av8Var);
                if (num2 == null || num == null) {
                    av8Var.d0(1215006730);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1214756870);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    TeamSide teamSide = ey4Var.h;
                    if (teamSide == null) {
                        teamSide = TeamSide.HOME;
                    }
                    pd0.d(intValue, intValue2, teamSide, av8Var, 0);
                    bf3.u(utcVar, 12.0f, av8Var, false);
                }
                nq8.h(av8Var, n9e.q(bkh.e(bkh.p(utcVar, 1.0f), 40.0f), lz.D(R.color.n_lv_4, av8Var), oyn.e));
                xtc q = bkh.q(l98.d0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 34.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                u23 a3 = t23.a(kg0Var, uxf.p, av8Var, 54);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, q);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                kq9.b(s6a.N(j34.a(ey4Var.b), 6, av8Var), null, bkh.l(utcVar, 24.0f), r13.i, av8Var, V2.b.f, 0);
                String str3 = ey4Var.c;
                if (str3 == null) {
                    av8Var.d0(-1253289823);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-1253289822);
                    nq8.h(av8Var, bkh.e(utcVar, 4.0f));
                    av8 av8Var2 = av8Var;
                    udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                    av8Var = av8Var2;
                    Unit unit2 = Unit.a;
                    av8Var.s(false);
                    z = true;
                }
                av8Var.s(z);
                av8Var.s(z);
                xtcVar3 = xtcVar5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new x24(ey4Var, xtcVar3, i, i2, 0);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var.T(i3 & 1, (i3 & 19) == 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0046  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(ey4 ey4Var, xtc xtcVar, of3 of3Var, int i, int i2) {
        int i3;
        xtc xtcVar2;
        xtc xtcVar3;
        av8 av8Var;
        eqf u;
        Integer num;
        zg3 zg3Var;
        xtc xtcVar4;
        kg0 kg0Var;
        TeamSide teamSide;
        Integer num2;
        ?? r1;
        av8 av8Var2;
        TeamSide teamSide2;
        boolean z;
        av8 av8Var3;
        av8 av8Var4;
        ey4Var.getClass();
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(-1211869333);
        if ((i & 6) == 0) {
            i3 = i | (av8Var5.i(ey4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            xtcVar2 = xtcVar;
            i3 |= av8Var5.g(xtcVar2) ? 32 : 16;
            if (av8Var5.T(i3 & 1, (i3 & 19) == 18)) {
                av8Var5.W();
                xtcVar3 = xtcVar2;
                av8Var = av8Var5;
            } else {
                utc utcVar = utc.a;
                xtc xtcVar5 = i4 != 0 ? utcVar : xtcVar2;
                xtc o = yso.o(bkh.e(bkh.d(xtcVar5, 1.0f), 56.0f), 1.0f, lz.D(R.color.n_lv_4, av8Var5), o7g.a(8.0f));
                l8g a = k8g.a(ww9.b, uxf.m, av8Var5, 48);
                int hashCode = Long.hashCode(av8Var5.T);
                aee m = av8Var5.m();
                xtc C = fqj.C(av8Var5, o);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var2);
                } else {
                    av8Var5.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var5, a, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var5, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var5, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var5, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var5, C, f50Var3);
                xtc q = bkh.q(l98.d0(utcVar, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 34.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                kg0 kg0Var2 = ww9.f;
                u23 a2 = t23.a(kg0Var2, uxf.p, av8Var5, 54);
                xtc xtcVar6 = xtcVar5;
                int hashCode2 = Long.hashCode(av8Var5.T);
                aee m2 = av8Var5.m();
                xtc C2 = fqj.C(av8Var5, q);
                av8Var5.h0();
                if (av8Var5.S) {
                    av8Var5.l(zg3Var2);
                } else {
                    av8Var5.q0();
                }
                waa.K(av8Var5, a2, f50Var);
                waa.K(av8Var5, m2, ff3Var);
                bf3.s(hashCode2, av8Var5, f50Var2, av8Var5, ryVar);
                waa.K(av8Var5, C2, f50Var3);
                CrowdsourcingIncidentType crowdsourcingIncidentType = ey4Var.b;
                TeamSide teamSide3 = ey4Var.h;
                Integer num3 = ey4Var.e;
                Integer num4 = ey4Var.d;
                kq9.b(s6a.N(j34.a(crowdsourcingIncidentType), 6, av8Var5), null, bkh.l(utcVar, 24.0f), r13.i, av8Var5, V2.b.f, 0);
                String str = ey4Var.c;
                if (str == null) {
                    av8Var5.d0(-1020825445);
                    av8Var5.s(false);
                    r1 = 0;
                    kg0Var = kg0Var2;
                    teamSide = teamSide3;
                    num2 = num3;
                    num = num4;
                    zg3Var = zg3Var2;
                    xtcVar4 = xtcVar6;
                    av8Var2 = av8Var5;
                } else {
                    bf3.r(4.0f, -1020825444, av8Var5, av8Var5, utcVar);
                    yf8 yf8Var = xth.a;
                    num = num4;
                    zg3Var = zg3Var2;
                    xtcVar4 = xtcVar6;
                    kg0Var = kg0Var2;
                    teamSide = teamSide3;
                    num2 = num3;
                    r1 = 0;
                    udj.c(str, null, lz.D(R.color.n_lv_3, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var5, 0, 0, 131066);
                    av8 av8Var6 = av8Var5;
                    Unit unit = Unit.a;
                    av8Var6.s(false);
                    av8Var2 = av8Var6;
                }
                av8Var2.s(true);
                nq8.h(av8Var2, n9e.q(bkh.e(bkh.p(utcVar, 1.0f), 40.0f), lz.D(R.color.n_lv_4, av8Var2), oyn.e));
                nq8.h(av8Var2, bkh.p(utcVar, 12.0f));
                if (num == null || num2 == null) {
                    teamSide2 = teamSide;
                    av8Var2.d0(1306072251);
                    av8Var2.s(r1);
                } else {
                    av8Var2.d0(1305839689);
                    teamSide2 = teamSide;
                    pd0.d(num.intValue(), num2.intValue(), teamSide2, av8Var2, r1);
                    bf3.u(utcVar, 12.0f, av8Var2, r1);
                }
                if (teamSide2 != null) {
                    av8Var2.d0(1306137971);
                    xtc c = bkh.c(utcVar, 1.0f);
                    u23 a3 = t23.a(kg0Var, uxf.o, av8Var2, 6);
                    int hashCode3 = Long.hashCode(av8Var2.T);
                    aee m3 = av8Var2.m();
                    xtc C3 = fqj.C(av8Var2, c);
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    waa.K(av8Var2, a3, f50Var);
                    waa.K(av8Var2, m3, ff3Var);
                    bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
                    waa.K(av8Var2, C3, f50Var3);
                    String str2 = ey4Var.f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    yf8 yf8Var2 = xth.a;
                    of3 of3Var2 = av8Var2;
                    udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), of3Var2, 0, 24960, 110586);
                    av8 av8Var7 = of3Var2;
                    String str3 = ey4Var.g;
                    if (str3 == null) {
                        av8Var7.d0(921549584);
                        av8Var7.s(r1);
                        av8Var4 = av8Var7;
                    } else {
                        av8Var7.d0(921549585);
                        udj.c(wv8.i(oea.v(R.string.football_assist, av8Var7), ": ", str3), null, lz.D(R.color.n_lv_3, av8Var7), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var7, 0, 24960, 110586);
                        av8 av8Var8 = av8Var7;
                        Unit unit2 = Unit.a;
                        av8Var8.s(r1);
                        av8Var4 = av8Var8;
                    }
                    z = true;
                    av8Var4.s(true);
                    av8Var4.s(r1);
                    av8Var3 = av8Var4;
                } else {
                    z = true;
                    av8Var2.d0(1307037467);
                    av8Var2.s(r1);
                    av8Var3 = av8Var2;
                }
                av8Var3.s(z);
                xtcVar3 = xtcVar4;
                av8Var = av8Var3;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new x24(ey4Var, xtcVar3, i, i2, 1);
                return;
            }
            return;
        }
        xtcVar2 = xtcVar;
        if (av8Var5.T(i3 & 1, (i3 & 19) == 18)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }
}
