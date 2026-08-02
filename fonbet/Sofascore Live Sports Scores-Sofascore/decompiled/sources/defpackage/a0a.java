package defpackage;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.i;
import com.ironsource.V2;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.crowdsourcing.EventSuggest;
import com.sofascore.model.crowdsourcing.SuggestStatus;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class a0a {
    public static final void a(EventSuggest.IncidentSuggest incidentSuggest, boolean z, String str, Function1 function1, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2 = xtcVar;
        incidentSuggest.getClass();
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1883794673);
        int i3 = i | (av8Var.i(incidentSuggest) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? a.o : 1024) | (av8Var.g(xtcVar2) ? 16384 : 8192);
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            long D = lz.D(R.color.surface_1, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q = n9e.q(xtcVar2, D, jf9Var);
            k1c c = e12.c(uxf.c, false);
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
            waa.K(av8Var, c, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            av8Var.d0(1921285459);
            utc utcVar = utc.a;
            xtc e = bkh.e(utcVar, 56.0f);
            boolean z2 = function1 != null;
            long D2 = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.s;
                av8Var.n0(O2);
            }
            xtc y = tol.y(e, z2, true, true, D2, wzcVar, new yz9((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, incidentSuggest, 0), av8Var, 0);
            if (z) {
                y = y.z(n9e.q(utcVar, lz.D(R.color.live_highlight, av8Var), jf9Var));
            }
            av8Var.s(false);
            xtc d0 = l98.d0(y, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            int i4 = zz9.a[incidentSuggest.getSide().ordinal()];
            if (i4 == 1) {
                i2 = 0;
                av8Var.d0(-1033399357);
                d(incidentSuggest, str, null, av8Var, ((i3 << 3) & 112) | 6 | (i3 & 896));
                av8Var.s(false);
                Unit unit = Unit.a;
            } else {
                if (i4 != 2) {
                    throw dmi.h(av8Var, -1033400877, false);
                }
                av8Var.d0(-1033393885);
                b(incidentSuggest, str, null, av8Var, ((i3 << 3) & 112) | 6 | (i3 & 896));
                i2 = 0;
                av8Var.s(false);
                Unit unit2 = Unit.a;
            }
            xtcVar2 = xtcVar;
            nq8.h(av8Var, bkh.p(xtcVar2, 8.0f));
            d7e t = haa.t(R.drawable.ic_reorder, i2, av8Var);
            long D3 = lz.D(R.color.crowdsourcing, av8Var);
            xtc l = bkh.l(utcVar, 24.0f);
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = new us9(9);
                av8Var.n0(O3);
            }
            kq9.a(t, null, tol.y(l, false, false, false, 0L, null, (Function0) O3, av8Var, 27), D3, av8Var, 56, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(incidentSuggest, z, str, function1, xtcVar2, i, 9);
        }
    }

    public static final void b(EventSuggest.IncidentSuggest incidentSuggest, String str, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtc xtcVar2;
        Pair pair;
        String str2;
        utc utcVar;
        String assistName;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1338831634);
        int i3 = i & 6;
        p8g p8gVar = p8g.a;
        if (i3 == 0) {
            i2 = (av8Var.g(p8gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.i(incidentSuggest) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i2 | 3072;
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar2 = utc.a;
            xtc a = p8gVar.a(1.0f, utcVar2, true);
            l8g a2 = k8g.a(ww9.c, uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a);
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
            xtc c = bkh.c(utcVar2, 1.0f);
            kg0 kg0Var = ww9.f;
            u23 a3 = t23.a(kg0Var, incidentSuggest.getSide() == TeamSide.HOME ? uxf.o : uxf.q, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c);
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
            if (incidentSuggest.getPlayer() != null) {
                av8Var.d0(1394866558);
                Player player = incidentSuggest.getPlayer();
                player.getClass();
                pair = new Pair(tba.t(player), new r13(lz.D(R.color.n_lv_1, av8Var)));
                av8Var.s(false);
            } else if (incidentSuggest.getPlayerName() != null) {
                av8Var.d0(1394979553);
                String playerName = incidentSuggest.getPlayerName();
                if (playerName == null) {
                    playerName = "";
                }
                pair = new Pair(playerName, new r13(lz.D(R.color.n_lv_1, av8Var)));
                av8Var.s(false);
            } else {
                av8Var.d0(1395058076);
                pair = new Pair(str, new r13(lz.D(R.color.crowdsourcing, av8Var)));
                av8Var.s(false);
            }
            String str3 = (String) pair.a;
            long j = ((r13) pair.b).a;
            boolean z = incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest;
            if (z) {
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                Player assist = goalSuggest.getAssist();
                if (assist == null || (assistName = tba.t(assist)) == null) {
                    assistName = goalSuggest.getAssistName();
                }
                str2 = assistName;
            } else {
                str2 = null;
            }
            yf8 yf8Var = xth.a;
            udj.c(str3, null, j, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            String str4 = str2;
            if (str4 == null) {
                av8Var.d0(1395556617);
                av8Var.s(false);
            } else {
                av8Var.d0(1395556618);
                udj.c(wv8.i(oea.v(R.string.football_assist, av8Var), ": ", str4), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                Unit unit = Unit.a;
                av8Var.s(false);
            }
            i.o(av8Var, true, utcVar2, 12.0f, av8Var);
            if (z) {
                av8Var.d0(-1107579154);
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                pd0.d(goalSuggest2.getHomeScoreSuggest(), goalSuggest2.getAwayScoreSuggest(), goalSuggest2.getSide(), av8Var, 0);
                bf3.u(utcVar2, 12.0f, av8Var, false);
            } else {
                av8Var.d0(-1107327372);
                av8Var.s(false);
            }
            xtc q = bkh.q(l98.d0(bkh.t(utcVar2, 3), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 34.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a4 = t23.a(kg0Var, uxf.p, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            kq9.b(s6a.N(j34.a(incidentSuggest.getType()), 6, av8Var), null, bkh.l(utcVar2, 20.0f), r13.i, av8Var, V2.b.f, 0);
            Integer time = incidentSuggest.getTime();
            Integer addedTime = incidentSuggest.getAddedTime();
            if (time != null) {
                r29 = addedTime != null ? ljg.j(addedTime.intValue(), "+") : null;
                r29 = time + "'" + (r29 == null ? "" : r29);
            }
            String str5 = r29;
            if (str5 == null) {
                av8Var.d0(-1440506965);
                av8Var.s(false);
                utcVar = utcVar2;
            } else {
                av8Var.d0(-1440506964);
                nq8.h(av8Var, bkh.e(utcVar2, 4.0f));
                av8 av8Var2 = av8Var;
                utcVar = utcVar2;
                udj.c(str5, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 0, 0, 131066);
                av8Var = av8Var2;
                Unit unit2 = Unit.a;
                av8Var.s(false);
            }
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz9(incidentSuggest, str, xtcVar2, i, 0);
        }
    }

    public static final void c(EventSuggest.IncidentSuggest incidentSuggest, String str, Function1 function1, xtc xtcVar, boolean z, uah uahVar, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        int i3;
        int i4;
        uah uahVar2;
        int i5;
        boolean z2;
        xtc xtcVar3;
        uah uahVar3;
        f50 f50Var;
        boolean z3;
        long f;
        jf9 jf9Var = oyn.e;
        incidentSuggest.getClass();
        str.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-488477707);
        int i6 = (av8Var.i(incidentSuggest) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= av8Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i6 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i6 | (av8Var.g(xtcVar2) ? a.o : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i3 | 24576;
        } else {
            i4 = i3 | (av8Var.h(z) ? 16384 : 8192);
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i5 = i4 | 196608;
            uahVar2 = uahVar;
        } else {
            uahVar2 = uahVar;
            i5 = i4 | (av8Var.g(uahVar2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE);
        }
        if (av8Var.T(i5 & 1, (74899 & i5) != 74898)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
            boolean z4 = i8 != 0 ? false : z;
            uah uahVar4 = i9 != 0 ? jf9Var : uahVar2;
            xtc q = n9e.q(utcVar, lz.D(R.color.surface_1, av8Var), uahVar4);
            k1c c = e12.c(uxf.c, false);
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
            f50 f50Var2 = hf3.g;
            waa.K(av8Var, c, f50Var2);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var3 = hf3.j;
            waa.K(av8Var, valueOf, f50Var3);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var4 = hf3.d;
            waa.K(av8Var, C, f50Var4);
            av8Var.d0(-802768085);
            xtc e = bkh.e(xtcVar4, 56.0f);
            if (z4) {
                f50Var = f50Var4;
                e = e.z(n9e.q(utcVar, lz.D(R.color.live_highlight, av8Var), jf9Var));
                z3 = false;
            } else {
                f50Var = f50Var4;
                z3 = false;
            }
            av8Var.s(z3);
            xtc A = wnn.A(e, uahVar4);
            boolean z5 = function1 != null;
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            int i10 = i5;
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = o67.t;
                av8Var.n0(O2);
            }
            xtc xtcVar5 = xtcVar4;
            f50 f50Var5 = f50Var;
            uah uahVar5 = uahVar4;
            xtc y = tol.y(A, z5, true, true, D, wzcVar, new yz9((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), function1, incidentSuggest, 1), av8Var, 0);
            av8Var = av8Var;
            xtc d0 = l98.d0(y, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, f50Var2);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var5);
            int i11 = zz9.a[incidentSuggest.getSide().ordinal()];
            if (i11 == 1) {
                av8Var.d0(66621033);
                d(incidentSuggest, incidentSuggest.getStatus() != SuggestStatus.SUBMITTED ? str : "", null, av8Var, ((i10 << 3) & 112) | 6);
                av8Var.s(false);
                Unit unit = Unit.a;
            } else {
                if (i11 != 2) {
                    throw dmi.h(av8Var, 66619567, false);
                }
                av8Var.d0(66628233);
                b(incidentSuggest, incidentSuggest.getStatus() != SuggestStatus.SUBMITTED ? str : "", null, av8Var, ((i10 << 3) & 112) | 6);
                av8Var.s(false);
                Unit unit2 = Unit.a;
            }
            nq8.h(av8Var, bkh.p(xtcVar5, 8.0f));
            d7e t = haa.t(j34.b(incidentSuggest.getStatus()), 0, av8Var);
            int i12 = zz9.b[incidentSuggest.getStatus().ordinal()];
            if (i12 != 1) {
                f = i12 != 2 ? ljg.f(av8Var, 66647540, R.color.n_lv_3, av8Var, false) : ljg.f(av8Var, 66646293, R.color.error, av8Var, false);
            } else {
                av8Var.d0(66643074);
                f = Intrinsics.c(incidentSuggest.getApplied(), Boolean.TRUE) ? ljg.f(av8Var, 66643927, R.color.success, av8Var, false) : ljg.f(av8Var, 66644500, R.color.n_lv_3, av8Var, false);
                av8Var.s(false);
            }
            kq9.a(t, null, bkh.l(utcVar, 24.0f), f, av8Var, 440, 0);
            nq8.h(av8Var, bkh.p(utcVar, 4.0f));
            av8Var.s(true);
            av8Var.s(true);
            uahVar3 = uahVar5;
            xtcVar3 = xtcVar5;
            z2 = z4;
        } else {
            av8Var.W();
            z2 = z;
            xtcVar3 = xtcVar2;
            uahVar3 = uahVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vr5(incidentSuggest, str, function1, xtcVar3, z2, uahVar3, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0321  */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(EventSuggest.IncidentSuggest incidentSuggest, String str, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        String str2;
        xtc xtcVar2;
        av8 av8Var;
        String str3;
        ff3 ff3Var;
        f50 f50Var;
        ?? r2;
        f50 f50Var2;
        utc utcVar;
        ry ryVar;
        av8 av8Var2;
        Pair pair;
        String str4;
        av8 av8Var3;
        EventSuggest.IncidentSuggest.GoalSuggest goalSuggest;
        Player assist;
        av8 av8Var4 = (av8) of3Var;
        av8Var4.f0(-274694717);
        int i3 = i & 6;
        p8g p8gVar = p8g.a;
        if (i3 == 0) {
            i2 = (av8Var4.g(p8gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var4.i(incidentSuggest) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var4.g(str) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i2 | 3072;
        if (av8Var4.T(i4 & 1, (i4 & 1171) != 1170)) {
            utc utcVar2 = utc.a;
            xtc a = p8gVar.a(1.0f, utcVar2, true);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var4, 48);
            int hashCode = Long.hashCode(av8Var4.T);
            aee m = av8Var4.m();
            xtc C = fqj.C(av8Var4, a);
            if3.k7.getClass();
            Function0 function0 = hf3.b;
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(function0);
            } else {
                av8Var4.q0();
            }
            f50 f50Var3 = hf3.g;
            waa.K(av8Var4, a2, f50Var3);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var4, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var4 = hf3.j;
            waa.K(av8Var4, valueOf, f50Var4);
            ry ryVar2 = hf3.k;
            waa.J(av8Var4, ryVar2);
            f50 f50Var5 = hf3.d;
            waa.K(av8Var4, C, f50Var5);
            xtc q = bkh.q(l98.d0(bkh.t(utcVar2, 3), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), 34.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            kg0 kg0Var = ww9.f;
            u23 a3 = t23.a(kg0Var, uxf.p, av8Var4, 54);
            int hashCode2 = Long.hashCode(av8Var4.T);
            aee m2 = av8Var4.m();
            xtc C2 = fqj.C(av8Var4, q);
            av8Var4.h0();
            if (av8Var4.S) {
                av8Var4.l(function0);
            } else {
                av8Var4.q0();
            }
            waa.K(av8Var4, a3, f50Var3);
            waa.K(av8Var4, m2, ff3Var2);
            bf3.s(hashCode2, av8Var4, f50Var4, av8Var4, ryVar2);
            waa.K(av8Var4, C2, f50Var5);
            incidentSuggest.getClass();
            kq9.b(s6a.N(j34.a(incidentSuggest.getType()), 6, av8Var4), null, bkh.l(utcVar2, 20.0f), r13.i, av8Var4, V2.b.f, 0);
            Integer time = incidentSuggest.getTime();
            Integer addedTime = incidentSuggest.getAddedTime();
            String str5 = null;
            if (time == null) {
                str3 = null;
            } else {
                String j = addedTime != null ? ljg.j(addedTime.intValue(), "+") : null;
                if (j == null) {
                    j = "";
                }
                str3 = time + "'" + j;
            }
            if (str3 == null) {
                av8Var4.d0(2105593827);
                av8Var4.s(false);
                r2 = 0;
                utcVar = utcVar2;
                f50Var2 = f50Var4;
                ryVar = ryVar2;
                f50Var = f50Var3;
                ff3Var = ff3Var2;
                av8Var2 = av8Var4;
            } else {
                bf3.r(4.0f, 2105593828, av8Var4, av8Var4, utcVar2);
                yf8 yf8Var = xth.a;
                ff3Var = ff3Var2;
                f50Var = f50Var3;
                r2 = 0;
                f50Var2 = f50Var4;
                utcVar = utcVar2;
                ryVar = ryVar2;
                udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var4, 0, 0, 131066);
                av8 av8Var5 = av8Var4;
                Unit unit = Unit.a;
                av8Var5.s(false);
                av8Var2 = av8Var5;
            }
            utc utcVar3 = utcVar;
            i.o(av8Var2, true, utcVar3, 12.0f, av8Var2);
            boolean z = incidentSuggest instanceof EventSuggest.IncidentSuggest.GoalSuggest;
            if (z) {
                av8Var2.d0(-397631875);
                EventSuggest.IncidentSuggest.GoalSuggest goalSuggest2 = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest;
                pd0.d(goalSuggest2.getHomeScoreSuggest(), goalSuggest2.getAwayScoreSuggest(), goalSuggest2.getSide(), av8Var2, r2);
                bf3.u(utcVar3, 12.0f, av8Var2, r2);
            } else {
                av8Var2.d0(-397380093);
                av8Var2.s(r2);
            }
            xtc c = bkh.c(utcVar3, 1.0f);
            u23 a4 = t23.a(kg0Var, incidentSuggest.getSide() == TeamSide.HOME ? uxf.o : uxf.q, av8Var2, 6);
            int hashCode3 = Long.hashCode(av8Var2.T);
            aee m3 = av8Var2.m();
            xtc C3 = fqj.C(av8Var2, c);
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(function0);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a4, f50Var);
            waa.K(av8Var2, m3, ff3Var);
            bf3.s(hashCode3, av8Var2, f50Var2, av8Var2, ryVar);
            waa.K(av8Var2, C3, f50Var5);
            if (incidentSuggest.getPlayer() != null) {
                av8Var2.d0(-730325852);
                Player player = incidentSuggest.getPlayer();
                player.getClass();
                pair = new Pair(tba.t(player), new r13(lz.D(R.color.n_lv_1, av8Var2)));
                av8Var2.s(r2);
            } else if (incidentSuggest.getPlayerName() != null) {
                av8Var2.d0(-730212857);
                String playerName = incidentSuggest.getPlayerName();
                if (playerName == null) {
                    playerName = "";
                }
                pair = new Pair(playerName, new r13(lz.D(R.color.n_lv_1, av8Var2)));
                av8Var2.s(r2);
            } else {
                av8Var2.d0(-730134334);
                str2 = str;
                pair = new Pair(str2, new r13(lz.D(R.color.crowdsourcing, av8Var2)));
                av8Var2.s(r2);
                String str6 = (String) pair.a;
                long j2 = ((r13) pair.b).a;
                if (z && ((assist = (goalSuggest = (EventSuggest.IncidentSuggest.GoalSuggest) incidentSuggest).getAssist()) == null || (str5 = tba.t(assist)) == null)) {
                    str5 = goalSuggest.getAssistName();
                }
                str4 = str5;
                yf8 yf8Var2 = xth.a;
                of3 of3Var2 = av8Var2;
                udj.c(str6, null, j2, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), of3Var2, 0, 24960, 110586);
                av8 av8Var6 = of3Var2;
                if (str4 != null) {
                    av8Var6.d0(-729635917);
                    av8Var6.s(r2);
                    av8Var3 = av8Var6;
                } else {
                    av8Var6.d0(-729635916);
                    udj.c(wv8.i(oea.v(R.string.football_assist, av8Var6), ": ", str4), null, lz.D(R.color.n_lv_3, av8Var6), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var6, 0, 24960, 110586);
                    av8 av8Var7 = av8Var6;
                    Unit unit2 = Unit.a;
                    av8Var7.s(r2);
                    av8Var3 = av8Var7;
                }
                av8Var3.s(true);
                av8Var3.s(true);
                xtcVar2 = utcVar3;
                av8Var = av8Var3;
            }
            str2 = str;
            String str62 = (String) pair.a;
            long j22 = ((r13) pair.b).a;
            if (z) {
                str5 = goalSuggest.getAssistName();
            }
            str4 = str5;
            yf8 yf8Var22 = xth.a;
            of3 of3Var22 = av8Var2;
            udj.c(str62, null, j22, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), of3Var22, 0, 24960, 110586);
            av8 av8Var62 = of3Var22;
            if (str4 != null) {
            }
            av8Var3.s(true);
            av8Var3.s(true);
            xtcVar2 = utcVar3;
            av8Var = av8Var3;
        } else {
            str2 = str;
            av8Var4.W();
            xtcVar2 = xtcVar;
            av8Var = av8Var4;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new xz9(incidentSuggest, str2, xtcVar2, i, 1);
        }
    }
}
