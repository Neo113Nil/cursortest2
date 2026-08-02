package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nz9 {
    public static final mqi a;

    static {
        ypa.b(new us9(6));
        a = ypa.b(new us9(7));
    }

    public static final void a(h0a h0aVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-176406006);
        p8g p8gVar = p8g.a;
        int i2 = 4;
        int i3 = (av8Var.g(p8gVar) ? 4 : 2) | i | (av8Var.g(h0aVar) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc a2 = p8gVar.a(1.0f, utc.a, false);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, a2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            av8Var.d0(-1689701378);
            xbb b = a.b();
            String str = h0aVar.f;
            if (str == null) {
                av8Var.d0(764774902);
                av8Var.s(false);
            } else {
                av8Var.d0(764774903);
                b.add(rfo.e);
                b.add(yqo.H(-1339040618, av8Var, new op9(3, h0aVar, str)));
                av8Var.s(false);
            }
            String str2 = h0aVar.g;
            if (str2 == null) {
                av8Var.d0(765272948);
                av8Var.s(false);
            } else {
                av8Var.d0(765272949);
                b.add(rfo.f);
                b.add(yqo.H(-1834781969, av8Var, new tk1(str2, 7)));
                av8Var.s(false);
            }
            Iterable a4 = a.a(b);
            av8Var.s(false);
            if (!h0aVar.a) {
                a4 = CollectionsKt.B0(a4);
            }
            av8Var.d0(-1689665162);
            Iterator it = a4.iterator();
            while (it.hasNext()) {
                ((Function2) it.next()).invoke(av8Var, 0);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz9(h0aVar, i, i2);
        }
    }

    public static final void b(rz9 rz9Var, of3 of3Var, int i) {
        xtc xtcVar;
        ff3 ff3Var;
        r13 r13Var;
        boolean z;
        mv1 mv1Var = uxf.g;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1371814921);
        int i2 = i | (av8Var.g(rz9Var) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc e = bkh.e(utcVar, 26.0f);
            k1c c = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, e);
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
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            String str = rz9Var.e;
            Integer num = rz9Var.b;
            mv1 mv1Var2 = str != null ? uxf.d : mv1Var;
            n12 n12Var = n12.a;
            xtc D = f6a.D(bkh.l(n12Var.a(utcVar, mv1Var2), 16.0f), rz9Var.c ? -1.0f : 1.0f, rz9Var.d ? -1.0f : 1.0f);
            ImageVector N = s6a.N(rz9Var.a, 6, av8Var);
            if (num == null) {
                av8Var.d0(-653210620);
                av8Var.s(false);
                r13Var = null;
                xtcVar = D;
                ff3Var = ff3Var2;
            } else {
                av8Var.d0(-653210619);
                xtcVar = D;
                ff3Var = ff3Var2;
                long D2 = lz.D(num.intValue(), av8Var);
                av8Var.s(false);
                r13Var = new r13(D2);
            }
            kq9.b(N, null, xtcVar, r13Var != null ? r13Var.a : r13.i, av8Var, 48, 0);
            if (rz9Var.e == null) {
                av8Var.d0(-653042445);
                av8Var.s(false);
                z = true;
            } else {
                av8Var.d0(-653042444);
                xtc q = n9e.q(bkh.p(l98.f0(n9e.q(n12Var.a(utcVar, uxf.j), lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 16.0f), lz.D(R.color.n_lv_1, av8Var), o7g.a(2.0f));
                k1c c2 = e12.c(mv1Var, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, q);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String str2 = rz9Var.e;
                yf8 yf8Var = xth.a;
                z = true;
                q5a.w(str2, null, lz.D(R.color.surface_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 1, 0, xth.k(), av8Var, 0, 24576, 114682);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            }
            av8Var.s(z);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new lz9(rz9Var, i);
        }
    }

    public static final void c(h0a h0aVar, boolean z, Gender gender, Function0 function0, Function0 function02, of3 of3Var, int i) {
        av8 av8Var;
        int i2;
        int i3;
        uz9 uz9Var = h0aVar.o;
        function0.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(815580149);
        int i4 = i | (av8Var2.g(h0aVar) ? 4 : 2) | (av8Var2.h(z) ? 32 : 16) | (av8Var2.e(gender == null ? -1 : gender.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function0) ? com.ironsource.mediationsdk.metadata.a.o : 1024) | (av8Var2.i(function02) ? 16384 : 8192);
        if (av8Var2.T(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) av8Var2.k(nz.b);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.FALSE);
                av8Var2.n0(O);
            }
            e1d e1dVar = (e1d) O;
            if (((Boolean) e1dVar.getValue()).booleanValue() || uz9Var != null) {
                i2 = 2088488930;
                i3 = R.color.surface_2;
            } else {
                i2 = 2088489538;
                i3 = R.color.surface_1;
            }
            av8Var = av8Var2;
            xtc y = tol.y(n9e.q(utc.a, ((r13) wih.a(ljg.f(av8Var2, i2, i3, av8Var2, false), s02.h0(150, 0, null, 6), null, av8Var2, 48, 12).getValue()).a, oyn.e), z, false, false, 0L, null, function0, av8Var, 30);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, y);
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
            if (uz9Var == null) {
                av8Var.d0(-737142798);
                av8Var.s(false);
            } else {
                av8Var.d0(-737142797);
                e(uz9Var, h0aVar.a, av8Var, 0);
                av8Var.s(false);
            }
            boolean booleanValue = ((Boolean) e1dVar.getValue()).booleanValue();
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = new v30(26, e1dVar);
                av8Var.n0(O2);
            }
            d(h0aVar, booleanValue, (Function0) O2, function02, av8Var, (i4 & 14) | 384 | ((i4 >> 3) & 7168), 0);
            kae kaeVar = h0aVar.k;
            if (kaeVar == null) {
                av8Var.d0(-736529897);
                av8Var.s(false);
            } else {
                av8Var.d0(-736529896);
                fz8.b(x23.a, ((Boolean) e1dVar.getValue()).booleanValue(), null, uo5.d(s02.h0(150, 0, null, 6), null, 14), uo5.l(s02.h0(150, 0, null, 6), null, 14), null, yqo.H(407739778, av8Var, new ff7(kaeVar, h0aVar, context, gender, e1dVar)), av8Var, 1600518, 18);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new f70(h0aVar, z, gender, function0, function02, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(h0a h0aVar, boolean z, Function0 function0, Function0 function02, of3 of3Var, int i, int i2) {
        int i3;
        Function0 function03;
        eqf u;
        h0a h0aVar2 = h0aVar;
        boolean z2 = h0aVar2.a;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-678576643);
        if ((i & 6) == 0) {
            i3 = (av8Var.g(h0aVar2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function03 = function02;
            i3 |= av8Var.i(function03) ? com.ironsource.mediationsdk.metadata.a.o : 1024;
            int i5 = 1;
            int i6 = 0;
            if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
                av8Var.W();
            } else {
                int i7 = 5;
                if (i4 != 0) {
                    Object O = av8Var.O();
                    if (O == nf3.a) {
                        O = new us9(5);
                        av8Var.n0(O);
                    }
                    function03 = (Function0) O;
                }
                Context context = (Context) av8Var.k(nz.b);
                xtc c0 = l98.c0(bkh.o(bkh.d(utc.a, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 40.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 4.0f, 8.0f);
                l8g a2 = k8g.a(z2 ? ww9.b : ww9.c, uxf.m, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, c0);
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
                av8Var.d0(1129490365);
                xbb b = a.b();
                String str = h0aVar2.b;
                if (str == null) {
                    av8Var.d0(-842229125);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-842229124);
                    b.add(yqo.H(1695234420, av8Var, new tk1(str, 4)));
                    av8Var.s(false);
                }
                rz9 rz9Var = h0aVar2.c;
                if (rz9Var == null) {
                    av8Var.d0(-841818282);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-841818281);
                    b.add(yqo.H(-142912009, av8Var, new kz9(h0aVar2, i6)));
                    b.add(yqo.H(-706055520, av8Var, new lz9(rz9Var)));
                    av8Var.s(false);
                }
                String str2 = h0aVar2.d;
                if (str2 == null) {
                    av8Var.d0(-841548458);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-841548457);
                    b.add(rfo.b);
                    b.add(yqo.H(744147685, av8Var, new tk1(str2, i7)));
                    av8Var.s(false);
                }
                wz9 wz9Var = h0aVar2.e;
                if (wz9Var == null) {
                    av8Var.d0(-841351825);
                    av8Var.s(false);
                    h0aVar2 = h0aVar2;
                } else {
                    av8Var.d0(-841351824);
                    b.add(rfo.c);
                    x64 x64Var = new x64(wz9Var, z, context, h0aVar2, function03, function0);
                    h0aVar2 = h0aVar2;
                    b.add(yqo.H(1308680631, av8Var, x64Var));
                    av8Var.s(false);
                }
                if (h0aVar2.j) {
                    av8Var.d0(-840310162);
                    b.add(yqo.H(-1845244771, av8Var, new kz9(h0aVar2, i5)));
                    av8Var.s(false);
                } else {
                    av8Var.d0(-840202964);
                    b.add(yqo.H(-535879244, av8Var, new kz9(h0aVar2, 2)));
                    av8Var.s(false);
                }
                Iterable a3 = a.a(b);
                av8Var.s(false);
                if (!z2) {
                    a3 = CollectionsKt.B0(a3);
                }
                av8Var.d0(1129562665);
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    ((Function2) it.next()).invoke(av8Var, 0);
                }
                av8Var.s(false);
                av8Var.s(true);
            }
            Function0 function04 = function03;
            u = av8Var.u();
            if (u == null) {
                u.d = new vm7(h0aVar2, z, function0, function04, i, i2);
                return;
            }
            return;
        }
        function03 = function02;
        int i52 = 1;
        int i62 = 0;
        if (av8Var.T(i3 & 1, (i3 & 1171) == 1170)) {
        }
        Function0 function042 = function03;
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void e(uz9 uz9Var, boolean z, of3 of3Var, int i) {
        av8 av8Var;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2;
        f50 f50Var;
        Context context;
        a99 a99Var;
        ff3 ff3Var;
        ry ryVar;
        utc utcVar;
        f50 f50Var2;
        zg3 zg3Var;
        f50 f50Var3;
        av8 av8Var2;
        e1d e1dVar;
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse3;
        boolean z2;
        boolean z3;
        boolean z4;
        Player player;
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-550956769);
        int i2 = i | (av8Var3.i(uz9Var) ? 4 : 2) | (av8Var3.h(z) ? 32 : 16);
        if (av8Var3.T(i2 & 1, (i2 & 19) != 18)) {
            Context context2 = (Context) av8Var3.k(nz.b);
            Object O = av8Var3.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(Boolean.TRUE);
                av8Var3.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            long D = lz.D(R.color.surface_2, av8Var3);
            jf9 jf9Var = oyn.e;
            utc utcVar2 = utc.a;
            xtc q = n9e.q(utcVar2, D, jf9Var);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, q);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var3, a2, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var3, m, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var3, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var3, C, f50Var6);
            PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse4 = uz9Var.a;
            PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse5 = uz9Var.b;
            Player player2 = playerPenaltyHistoryResponse4.getPlayer();
            if (player2 == null) {
                av8Var3.d0(-1089659820);
                av8Var3.s(false);
                av8Var2 = av8Var3;
                context = context2;
                a99Var = a99Var2;
                playerPenaltyHistoryResponse = playerPenaltyHistoryResponse4;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var2 = f50Var5;
                zg3Var = zg3Var2;
                f50Var3 = f50Var4;
                f50Var = f50Var6;
                playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse5;
            } else {
                av8Var3.d0(-1089659819);
                rz9 rz9Var = new rz9(R.drawable.ic_penalty_16, Integer.valueOf(R.color.n_lv_1), false, false, null, 12);
                String H = s02.H(R.string.football_possible_penalty_taker, player2.getGender(), null, av8Var3, 4);
                String C2 = tba.C(player2);
                if (C2 == null) {
                    C2 = tba.t(player2);
                }
                playerPenaltyHistoryResponse = playerPenaltyHistoryResponse4;
                playerPenaltyHistoryResponse2 = playerPenaltyHistoryResponse5;
                f50Var = f50Var6;
                context = context2;
                a99Var = a99Var2;
                ff3Var = ff3Var2;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var2 = f50Var5;
                zg3Var = zg3Var2;
                f50Var3 = f50Var4;
                h0a h0aVar = new h0a(z, "-", rz9Var, null, null, H, C2, null, null, false, null, false, null, 0, null, 32664);
                Object O2 = av8Var3.O();
                if (O2 == a99Var) {
                    O2 = new us9(8);
                    av8Var2 = av8Var3;
                    av8Var2.n0(O2);
                } else {
                    av8Var2 = av8Var3;
                }
                d(h0aVar, false, (Function0) O2, null, av8Var2, 432, 8);
                av8Var2.s(false);
            }
            av8Var2.d0(1904531493);
            xbb b = a.b();
            Boolean bool = Boolean.TRUE;
            Player player3 = playerPenaltyHistoryResponse.getPlayer();
            b.add(new s1h(bool, s02.H(R.string.football_penalty_taker, player3 != null ? player3.getGender() : null, null, av8Var2, 4), true));
            PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse6 = playerPenaltyHistoryResponse2;
            b.add(new s1h(Boolean.FALSE, s02.H(R.string.goalkeeper, (playerPenaltyHistoryResponse6 == null || (player = playerPenaltyHistoryResponse6.getPlayer()) == null) ? null : player.getGender(), null, av8Var2, 4), playerPenaltyHistoryResponse6 != null));
            xbb a3 = a.a(b);
            av8Var2.s(false);
            utc utcVar3 = utcVar;
            xtc d = bkh.d(utcVar3, 1.0f);
            gv9 W = l6g.W(a3);
            Boolean bool2 = (Boolean) e1dVar2.getValue();
            bool2.booleanValue();
            x1h x1hVar = x1h.f;
            Object O3 = av8Var2.O();
            int i3 = 13;
            if (O3 == a99Var) {
                e1dVar = e1dVar2;
                O3 = new fw6(i3, e1dVar);
                av8Var2.n0(O3);
            } else {
                e1dVar = e1dVar2;
            }
            av8 av8Var4 = av8Var2;
            e1d e1dVar3 = e1dVar;
            l4a.a(W, bool2, (Function1) O3, d, x1hVar, true, av8Var4, 224640, 0);
            Pair pair = ((Boolean) e1dVar3.getValue()).booleanValue() ? new Pair(playerPenaltyHistoryResponse, uz9Var.c) : new Pair(playerPenaltyHistoryResponse6, uz9Var.d);
            PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse7 = (PlayerPenaltyHistoryResponse) pair.a;
            Team team = (Team) pair.b;
            Player player4 = playerPenaltyHistoryResponse7 != null ? playerPenaltyHistoryResponse7.getPlayer() : null;
            if (player4 != null) {
                av8Var4.d0(-1087956524);
                Integer valueOf2 = Integer.valueOf(team.getId());
                boolean booleanValue = ((Boolean) e1dVar3.getValue()).booleanValue();
                xtc d2 = bkh.d(utcVar3, 1.0f);
                long D2 = lz.D(R.color.n_lv_4, av8Var4);
                Object O4 = av8Var4.O();
                if (O4 == a99Var) {
                    O4 = mz1.e(av8Var4);
                }
                wzc wzcVar = (wzc) O4;
                Object[] objArr = new Object[0];
                Object O5 = av8Var4.O();
                if (O5 == a99Var) {
                    O5 = o67.q;
                    av8Var4.n0(O5);
                }
                mz9 mz9Var = new mz9((boh) o3a.N(objArr, (Function0) O5, av8Var4, 48), context, player4, 0);
                Player player5 = player4;
                playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse7;
                av8Var = av8Var4;
                qea.f(player5, valueOf2, booleanValue, tol.y(d2, true, true, true, D2, wzcVar, mz9Var, av8Var4, 0), av8Var, 0);
                av8Var.s(false);
                z2 = false;
            } else {
                playerPenaltyHistoryResponse3 = playerPenaltyHistoryResponse7;
                Context context3 = context;
                av8Var4.d0(-1087472645);
                xtc d3 = bkh.d(utcVar3, 1.0f);
                long D3 = lz.D(R.color.n_lv_4, av8Var4);
                Object O6 = av8Var4.O();
                if (O6 == a99Var) {
                    O6 = mz1.e(av8Var4);
                }
                wzc wzcVar2 = (wzc) O6;
                Object[] objArr2 = new Object[0];
                Object O7 = av8Var4.O();
                if (O7 == a99Var) {
                    O7 = o67.r;
                    av8Var4.n0(O7);
                }
                xtc y = tol.y(d3, true, true, true, D3, wzcVar2, new gi(i3, (boh) o3a.N(objArr2, (Function0) O7, av8Var4, 48), context3, team), av8Var4, 0);
                av8Var = av8Var4;
                z2 = false;
                qea.g(team, y, av8Var, 0);
                av8Var.s(false);
            }
            if (playerPenaltyHistoryResponse3 == null) {
                av8Var.d0(-1087021224);
                av8Var.s(z2);
                z3 = true;
            } else {
                av8Var.d0(-1087021223);
                xtc c0 = l98.c0(bkh.d(utcVar3, 1.0f), 16.0f, 8.0f);
                l8g a4 = k8g.a(ww9.b, uxf.m, av8Var, 48);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C3 = fqj.C(av8Var, c0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a4, f50Var3);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                goa g = ljg.g(av8Var, C3, f50Var, 1.0f, true);
                String v = oea.v(R.string.football_recent_penalties, av8Var);
                yf8 yf8Var = xth.a;
                av8 av8Var5 = av8Var;
                PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse8 = playerPenaltyHistoryResponse3;
                a99 a99Var3 = a99Var;
                q5a.w(v, g, lz.D(R.color.n_lv_1, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var5, 0, 0, 131064);
                int scored = ((Boolean) e1dVar3.getValue()).booleanValue() ? playerPenaltyHistoryResponse8.getScored() : playerPenaltyHistoryResponse8.getAttempts() - playerPenaltyHistoryResponse8.getScored();
                q5a.w(scored + "/" + playerPenaltyHistoryResponse8.getAttempts() + " (" + rei.d(scored, playerPenaltyHistoryResponse8.getAttempts(), 0, 12) + ")", null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.e(), av8Var5, 0, 0, 131066);
                av8Var = av8Var5;
                z3 = true;
                av8Var.s(true);
                if (playerPenaltyHistoryResponse8.getPenalties().isEmpty()) {
                    z4 = false;
                    av8Var.d0(-2114749288);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-2115480082);
                    xtc e = bkh.e(bkh.d(utcVar3, 1.0f), 172.0f);
                    Object O8 = av8Var.O();
                    if (O8 == a99Var3) {
                        O8 = new yo9(12);
                        av8Var.n0(O8);
                    }
                    Function1 function1 = (Function1) O8;
                    boolean i4 = av8Var.i(playerPenaltyHistoryResponse8);
                    Object O9 = av8Var.O();
                    if (i4 || O9 == a99Var3) {
                        O9 = new uf8(10, playerPenaltyHistoryResponse8, e1dVar3);
                        av8Var.n0(O9);
                    }
                    td4.a(function1, e, (Function1) O9, av8Var, 54, 0);
                    av8Var = av8Var;
                    z4 = false;
                    av8Var.s(false);
                }
                av8Var.s(z4);
            }
            av8Var.s(z3);
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new m81(i, 7, uz9Var, z);
        }
    }

    public static final void f(String str, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-822537497);
        int i2 = i | (av8Var.g(str) ? 4 : 2);
        if (av8Var.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc q = n9e.q(bkh.l(utcVar, 24.0f), lz.D(R.color.surface_2, av8Var), o7g.a(16.0f));
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
            waa.K(av8Var, c, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            xtc a2 = n12.a.a(utcVar, uxf.g);
            yf8 yf8Var = xth.a;
            q5a.w(str, a2, lz.D(R.color.primary_default, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.i(), av8Var, i2 & 14, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tk1(str, i, 6);
        }
    }

    public static final void g(wz9 wz9Var, boolean z, Function0 function0, of3 of3Var, int i) {
        xtc xtcVar;
        utc utcVar;
        boolean z2;
        boolean z3;
        utc utcVar2;
        float f;
        boolean z4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-371145918);
        int i2 = i | (av8Var.g(wz9Var) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i2 & 1, (i2 & 147) != 146)) {
            av8Var.d0(-188927911);
            av8Var.d0(-188931487);
            av8Var.d0(-188935223);
            n7g a2 = o7g.a(16.0f);
            utc utcVar3 = utc.a;
            xtc A = wnn.A(utcVar3, a2);
            boolean z5 = wz9Var.b;
            boolean z6 = wz9Var.c;
            if (z5) {
                utcVar = utcVar3;
                z3 = z6;
                z2 = z5;
                xtc y = tol.y(utcVar, false, false, false, 0L, null, function0, av8Var, 31);
                av8Var = av8Var;
                xtcVar = A.z(y);
            } else {
                xtcVar = A;
                utcVar = utcVar3;
                z2 = z5;
                z3 = z6;
            }
            av8Var.s(false);
            if (!z3) {
                xtcVar = xtcVar.z(n9e.q(utcVar, lz.D(R.color.surface_2, av8Var), oyn.e));
            }
            av8Var.s(false);
            if (!z3 && z2) {
                xtcVar = xtcVar.z(yso.o(utcVar, 1.5f, lz.D(R.color.primary_default, av8Var), o7g.a(16.0f)));
            }
            av8Var.s(false);
            xtc c0 = l98.c0(xtcVar, z3 ? 0.0f : 8.0f, 2.0f);
            l8g a3 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (z2) {
                av8Var.d0(-356355422);
                int i3 = ((i2 >> 3) & 14) | 1572864;
                f = 0.0f;
                utcVar2 = utcVar;
                l98.b(Boolean.valueOf(z), null, null, null, null, null, rfo.d, av8Var, i3, 62);
                av8Var.s(false);
            } else {
                utcVar2 = utcVar;
                f = 0.0f;
                av8Var.d0(-355953724);
                av8Var.s(false);
            }
            if (wz9Var.a == null) {
                av8Var.d0(-355919656);
                av8Var.s(false);
                z4 = true;
            } else {
                av8Var.d0(-355919655);
                xtc d0 = l98.d0(utcVar2, 1.0f, f, 2);
                String str = wz9Var.a;
                yf8 yf8Var = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(str, d0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, z3 ? xth.l() : xth.i(), av8Var2, 48, 0, 131064);
                av8Var = av8Var2;
                av8Var.s(false);
                z4 = true;
            }
            av8Var.s(z4);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(wz9Var, z, function0, i, 17);
        }
    }

    public static final void h(h0a h0aVar, of3 of3Var, int i) {
        int i2;
        int i3;
        boolean z;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1029263368);
        p8g p8gVar = p8g.a;
        int i4 = i | (av8Var.g(p8gVar) ? 4 : 2) | (av8Var.g(h0aVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            xtc d0 = l98.d0(p8gVar.a(1.0f, utc.a, false), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, h0aVar.a ? uxf.o : uxf.q, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            String str = h0aVar.f;
            if (str == null) {
                av8Var.d0(-1437511032);
                av8Var.s(false);
                z = false;
            } else {
                av8Var.d0(-1437511031);
                yf8 yf8Var = xth.a;
                dfj e = xth.e();
                if (h0aVar.l) {
                    i2 = 17226729;
                    i3 = R.color.live;
                } else {
                    i2 = 17227209;
                    i3 = R.color.n_lv_1;
                }
                z = false;
                udj.c(str, null, ljg.f(av8Var, i2, i3, av8Var, false), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, e, av8Var, 0, 24960, 110586);
                av8Var = av8Var;
                av8Var.s(false);
            }
            String str2 = h0aVar.g;
            if (str2 == null) {
                av8Var.d0(-1437170528);
                av8Var.s(z);
            } else {
                av8Var.d0(-1437170527);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                udj.c(str2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, h0aVar.n, false, 1, 0, null, xth.g(), av8Var2, 0, 24576, 110586);
                av8Var = av8Var2;
                av8Var.s(z);
            }
            String str3 = h0aVar.h;
            if (str3 == null) {
                av8Var.d0(-1436854545);
                av8Var.s(z);
            } else {
                av8Var.d0(-1436854544);
                yf8 yf8Var3 = xth.a;
                av8 av8Var3 = av8Var;
                udj.c(str3, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var3, 0, 24960, 110586);
                av8Var = av8Var3;
                av8Var.s(z);
            }
            String str4 = h0aVar.i;
            if (str4 == null) {
                av8Var.d0(-1436551923);
                av8Var.s(z);
            } else {
                av8Var.d0(-1436551922);
                yf8 yf8Var4 = xth.a;
                av8 av8Var4 = av8Var;
                udj.c(str4, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.g(), av8Var4, 0, 24960, 110586);
                av8Var = av8Var4;
                av8Var.s(z);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kz9(h0aVar, i, 3);
        }
    }
}
