package defpackage;

import android.content.Context;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.newNetwork.PlayerPenaltyHistoryResponse;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class r64 implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ r64(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String Q;
        xce xceVar;
        Function0 function0;
        e1d e1dVar;
        int i = this.a;
        n12 n12Var = n12.a;
        utc utcVar = utc.a;
        Object obj4 = nf3.a;
        Function0 function02 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 17) != 16)) {
                    nq8.h(av8Var, bkh.e(utcVar, 8.0f));
                    yqo.b(0, av8Var, null, function02);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((xpa) obj).getClass();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 17) != 16)) {
                    dy0.c(l64.a, false, this.b, l98.d0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), av8Var2, 3126);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            case 2:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                lv1 lv1Var = uxf.m;
                xtc c0 = l98.c0(wnn.A(utcVar, o7g.a(8.0f)), 12.0f, 4.0f);
                av8 av8Var3 = (av8) ((of3) obj2);
                boolean g = av8Var3.g(function02);
                Object O = av8Var3.O();
                if (g || O == obj4) {
                    O = new ve7(2, function02);
                    av8Var3.n0(O);
                }
                xtc y = tol.y(c0, false, false, false, 0L, null, (Function0) O, av8Var3, 31);
                l8g a = k8g.a(ww9.b, lv1Var, av8Var3, 48);
                int hashCode = Long.hashCode(av8Var3.T);
                aee m = av8Var3.m();
                xtc C = fqj.C(av8Var3, y);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var3.h0();
                if (av8Var3.S) {
                    av8Var3.l(zg3Var);
                } else {
                    av8Var3.q0();
                }
                waa.K(av8Var3, a, hf3.g);
                waa.K(av8Var3, m, hf3.f);
                waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var3, hf3.k);
                waa.K(av8Var3, C, hf3.d);
                String v = oea.v(R.string.fantasy_show_fixtures_button, av8Var3);
                long D = lz.D(R.color.on_color_primary, av8Var3);
                yf8 yf8Var = xth.a;
                udj.c(v, null, D, null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
                kq9.b(s6a.N(R.drawable.ic_chevron_right_small_16, 6, av8Var3), null, ljg.i(utcVar, 2.0f, av8Var3, utcVar, 16.0f), lz.D(R.color.on_color_primary, av8Var3), av8Var3, 432, 0);
                av8Var3.s(true);
                return Unit.a;
            case 3:
                of3 of3Var3 = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var4 = (av8) of3Var3;
                if (av8Var4.T(intValue3 & 1, (intValue3 & 17) != 16)) {
                    utc utcVar2 = utc.a;
                    xtc d0 = l98.d0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    u23 a2 = t23.a(ww9.d, uxf.o, av8Var4, 0);
                    int hashCode2 = Long.hashCode(av8Var4.T);
                    aee m2 = av8Var4.m();
                    xtc C2 = fqj.C(av8Var4, d0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var4.h0();
                    if (av8Var4.S) {
                        av8Var4.l(zg3Var2);
                    } else {
                        av8Var4.q0();
                    }
                    waa.K(av8Var4, a2, hf3.g);
                    waa.K(av8Var4, m2, hf3.f);
                    waa.K(av8Var4, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var4, hf3.k);
                    waa.K(av8Var4, C2, hf3.d);
                    xtc f0 = l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5);
                    String v2 = oea.v(R.string.how_it_works, av8Var4);
                    yf8 yf8Var2 = xth.a;
                    udj.c(v2, f0, lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var4, 48, 0, 131064);
                    udj.c(oea.v(R.string.referral_program_explainer, av8Var4), l98.d0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var4, 48, 0, 131064);
                    udj.c(oea.v(R.string.referral_program_your_tasks, av8Var4), l98.f0(utcVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6.0f, 5), lz.D(R.color.n_lv_1, av8Var4), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var4, 48, 0, 131064);
                    s02.u("1", R.string.referral_program_invite_with_link, null, null, av8Var4, 6, 12);
                    s02.u("2", R.string.referral_program_wait_for_friends, null, null, av8Var4, 6, 12);
                    mha.h(oea.v(R.string.button_invite_friends, av8Var4), this.b, l98.d0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 1), kqh.a, new bqh(s6a.N(R.drawable.ic_add_member, 6, av8Var4), uxf.q), false, false, false, 0L, 0, 0, av8Var4, 3456, 0, 2016);
                    av8Var4.s(true);
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 4:
                xce xceVar2 = (xce) obj;
                of3 of3Var4 = (of3) obj2;
                ((Integer) obj3).getClass();
                if (xceVar2 != null) {
                    Player player = xceVar2.a;
                    Player player2 = xceVar2.b;
                    av8 av8Var5 = (av8) of3Var4;
                    av8Var5.d0(-421404888);
                    Context context = (Context) av8Var5.k(nz.b);
                    Object O2 = av8Var5.O();
                    if (O2 == obj4) {
                        O2 = e.f(Boolean.TRUE);
                        av8Var5.n0(O2);
                    }
                    e1d e1dVar2 = (e1d) O2;
                    Gender gender = player2 != null ? player2.getGender() : null;
                    boolean e = av8Var5.e(gender == null ? -1 : gender.ordinal());
                    Object O3 = av8Var5.O();
                    if (e || O3 == obj4) {
                        Boolean bool = Boolean.TRUE;
                        Q = hkg.Q(context, R.string.football_penalty_taker, player.getGender(), new Object[0]);
                        O3 = b.j(new s1h(bool, Q, true), new s1h(Boolean.FALSE, hkg.Q(context, R.string.goalkeeper, player2 != null ? player2.getGender() : null, new Object[0]), player2 != null));
                        av8Var5.n0(O3);
                    }
                    List list = (List) O3;
                    xtc u0 = hkg.u0(bkh.d(utcVar, 1.0f), hkg.o0(av8Var5), false, 14);
                    u23 a3 = t23.a(ww9.d, uxf.o, av8Var5, 0);
                    int hashCode3 = Long.hashCode(av8Var5.T);
                    aee m3 = av8Var5.m();
                    xtc C3 = fqj.C(av8Var5, u0);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var5.h0();
                    if (av8Var5.S) {
                        av8Var5.l(zg3Var3);
                    } else {
                        av8Var5.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var5, a3, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var5, m3, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var5, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var5, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var5, C3, f50Var3);
                    xtc d = bkh.d(utcVar, 1.0f);
                    gv9 W = l6g.W(list);
                    Boolean bool2 = (Boolean) e1dVar2.getValue();
                    bool2.booleanValue();
                    v1h v1hVar = v1h.f;
                    Object O4 = av8Var5.O();
                    if (O4 == obj4) {
                        O4 = new fw6(22, e1dVar2);
                        av8Var5.n0(O4);
                    }
                    l4a.a(W, bool2, (Function1) O4, d, v1hVar, true, av8Var5, 224640, 0);
                    if (((Boolean) e1dVar2.getValue()).booleanValue()) {
                        player2 = player;
                    }
                    if (player2 != null) {
                        av8Var5.d0(243004760);
                        Integer valueOf2 = ((Boolean) e1dVar2.getValue()).booleanValue() ? Integer.valueOf(xceVar2.c) : xceVar2.d;
                        boolean booleanValue = ((Boolean) e1dVar2.getValue()).booleanValue();
                        Integer num = valueOf2;
                        xtc d2 = bkh.d(utcVar, 1.0f);
                        long D2 = lz.D(R.color.n_lv_4, av8Var5);
                        Object O5 = av8Var5.O();
                        if (O5 == obj4) {
                            O5 = mz1.e(av8Var5);
                        }
                        wzc wzcVar = (wzc) O5;
                        Object[] objArr = new Object[0];
                        Object O6 = av8Var5.O();
                        if (O6 == obj4) {
                            O6 = mce.d;
                            av8Var5.n0(O6);
                        }
                        function0 = function02;
                        qea.f(player2, num, booleanValue, tol.y(d2, true, true, true, D2, wzcVar, new mz9((boh) o3a.N(objArr, (Function0) O6, av8Var5, 48), context, player2, 1), av8Var5, 0), av8Var5, 0);
                        av8Var5 = av8Var5;
                        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = ((Boolean) e1dVar2.getValue()).booleanValue() ? xceVar2.e : xceVar2.f;
                        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse2 = yid.m(playerPenaltyHistoryResponse != null ? Integer.valueOf(playerPenaltyHistoryResponse.getAttempts()) : null) > 0 ? playerPenaltyHistoryResponse : null;
                        if (playerPenaltyHistoryResponse2 != null) {
                            av8Var5.d0(243883734);
                            xtc c02 = l98.c0(bkh.d(utcVar, 1.0f), 16.0f, 8.0f);
                            xceVar = xceVar2;
                            l8g a4 = k8g.a(ww9.b, uxf.m, av8Var5, 48);
                            e1dVar = e1dVar2;
                            int hashCode4 = Long.hashCode(av8Var5.T);
                            aee m4 = av8Var5.m();
                            xtc C4 = fqj.C(av8Var5, c02);
                            av8Var5.h0();
                            if (av8Var5.S) {
                                av8Var5.l(zg3Var3);
                            } else {
                                av8Var5.q0();
                            }
                            waa.K(av8Var5, a4, f50Var);
                            waa.K(av8Var5, m4, ff3Var);
                            bf3.s(hashCode4, av8Var5, f50Var2, av8Var5, ryVar);
                            goa g2 = ljg.g(av8Var5, C4, f50Var3, 1.0f, true);
                            String v3 = oea.v(((Boolean) e1dVar.getValue()).booleanValue() ? R.string.football_penalties_scored : R.string.football_penalties_saved, av8Var5);
                            yf8 yf8Var3 = xth.a;
                            udj.c(v3, g2, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var5, 0, 0, 131064);
                            int scored = ((Boolean) e1dVar.getValue()).booleanValue() ? playerPenaltyHistoryResponse2.getScored() : playerPenaltyHistoryResponse2.getAttempts() - playerPenaltyHistoryResponse2.getScored();
                            udj.c(scored + "/" + playerPenaltyHistoryResponse2.getAttempts() + " (" + rei.d(scored, playerPenaltyHistoryResponse2.getAttempts(), 0, 12) + ")", null, lz.D(R.color.n_lv_1, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var5, 0, 0, 131066);
                            av8Var5.s(true);
                            av8Var5.s(false);
                        } else {
                            xceVar = xceVar2;
                            e1dVar = e1dVar2;
                            av8Var5.d0(245427100);
                            av8Var5.s(false);
                        }
                        xtc d3 = bkh.d(utcVar, 1.0f);
                        Object O7 = av8Var5.O();
                        if (O7 == obj4) {
                            O7 = new etd(17);
                            av8Var5.n0(O7);
                        }
                        Function1 function1 = (Function1) O7;
                        boolean i2 = av8Var5.i(playerPenaltyHistoryResponse2) | av8Var5.i(player2);
                        Object O8 = av8Var5.O();
                        if (i2 || O8 == obj4) {
                            O8 = new vsc(8, playerPenaltyHistoryResponse2, player2, e1dVar);
                            av8Var5.n0(O8);
                        }
                        td4.a(function1, d3, (Function1) O8, av8Var5, 54, 0);
                        av8Var5.s(false);
                    } else {
                        xceVar = xceVar2;
                        function0 = function02;
                        av8Var5.d0(246514332);
                        av8Var5.s(false);
                    }
                    fz8.b(x23.a, xceVar.g, null, null, null, null, yqo.H(428812958, av8Var5, new r64(5, function0)), av8Var5, 1572870, 30);
                    av8Var5.s(true);
                    av8Var5.s(false);
                } else {
                    av8 av8Var6 = (av8) of3Var4;
                    av8Var6.d0(-416185945);
                    xtc d4 = bkh.d(utcVar, 1.0f);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode5 = Long.hashCode(av8Var6.T);
                    aee m5 = av8Var6.m();
                    xtc C5 = fqj.C(av8Var6, d4);
                    if3.k7.getClass();
                    zg3 zg3Var4 = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var4);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, c, hf3.g);
                    waa.K(av8Var6, m5, hf3.f);
                    waa.K(av8Var6, Integer.valueOf(hashCode5), hf3.j);
                    waa.J(av8Var6, hf3.k);
                    waa.K(av8Var6, C5, hf3.d);
                    ncf.a(bkh.l(l98.f0(n12Var.a(utcVar, uxf.g), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48.0f, 5), 64.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var6, 0, 62);
                    av8Var6.s(true);
                    av8Var6.s(false);
                }
                return Unit.a;
            case 5:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                pea.a(0, (of3) obj2, l98.f0(utc.a, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 16.0f, 2), function02);
                return Unit.a;
            case 6:
                of3 of3Var5 = (of3) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((v23) obj).getClass();
                av8 av8Var7 = (av8) of3Var5;
                if (av8Var7.T(intValue4 & 1, (intValue4 & 17) != 16)) {
                    utc utcVar3 = utc.a;
                    xtc Y = fz8.Y(bkh.d(utcVar3, 1.0f), n9a.a);
                    long D3 = lz.D(R.color.n_lv_4, av8Var7);
                    Object O9 = av8Var7.O();
                    if (O9 == obj4) {
                        O9 = mz1.e(av8Var7);
                    }
                    wzc wzcVar2 = (wzc) O9;
                    Object[] objArr2 = new Object[0];
                    Object O10 = av8Var7.O();
                    if (O10 == obj4) {
                        O10 = mce.m;
                        av8Var7.n0(O10);
                    }
                    xtc b0 = l98.b0(tol.y(Y, true, true, true, D3, wzcVar2, new p28(function02, (boh) o3a.N(objArr2, (Function0) O10, av8Var7, 48), 26), av8Var7, 0), 16.0f);
                    lv1 lv1Var2 = uxf.m;
                    wxf wxfVar = ww9.b;
                    l8g a5 = k8g.a(wxfVar, lv1Var2, av8Var7, 48);
                    int hashCode6 = Long.hashCode(av8Var7.T);
                    aee m6 = av8Var7.m();
                    xtc C6 = fqj.C(av8Var7, b0);
                    if3.k7.getClass();
                    zg3 zg3Var5 = hf3.b;
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var5);
                    } else {
                        av8Var7.q0();
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var7, a5, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var7, m6, ff3Var2);
                    Integer valueOf3 = Integer.valueOf(hashCode6);
                    f50 f50Var5 = hf3.j;
                    waa.K(av8Var7, valueOf3, f50Var5);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var7, ryVar2);
                    f50 f50Var6 = hf3.d;
                    waa.K(av8Var7, C6, f50Var6);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode7 = Long.hashCode(av8Var7.T);
                    aee m7 = av8Var7.m();
                    xtc C7 = fqj.C(av8Var7, utcVar3);
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var5);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, c2, f50Var4);
                    waa.K(av8Var7, m7, ff3Var2);
                    bf3.s(hashCode7, av8Var7, f50Var5, av8Var7, ryVar2);
                    waa.K(av8Var7, C7, f50Var6);
                    wkn.k(haa.t(2131231092, 0, av8Var7), null, wnn.A(utcVar3, o7g.a(8.0f)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var7, 56, 120);
                    wkn.k(haa.t(R.drawable.ic_beta_referral, 0, av8Var7), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var7, 56, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    av8Var7.s(true);
                    xtc f02 = l98.f0(utcVar3, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    u23 a6 = t23.a(ww9.d, uxf.o, av8Var7, 0);
                    int hashCode8 = Long.hashCode(av8Var7.T);
                    aee m8 = av8Var7.m();
                    xtc C8 = fqj.C(av8Var7, f02);
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var5);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, a6, f50Var4);
                    waa.K(av8Var7, m8, ff3Var2);
                    bf3.s(hashCode8, av8Var7, f50Var5, av8Var7, ryVar2);
                    waa.K(av8Var7, C8, f50Var6);
                    String v4 = oea.v(R.string.referral_program_header, av8Var7);
                    yf8 yf8Var4 = xth.a;
                    udj.c(v4, null, lz.D(R.color.n_lv_1, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var7, 0, 0, 131066);
                    udj.c(oea.v(R.string.referral_program_body, av8Var7), l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 5), lz.D(R.color.n_lv_3, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var7, 48, 0, 131064);
                    xtc f03 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    l8g a7 = k8g.a(wxfVar, lv1Var2, av8Var7, 48);
                    int hashCode9 = Long.hashCode(av8Var7.T);
                    aee m9 = av8Var7.m();
                    xtc C9 = fqj.C(av8Var7, f03);
                    av8Var7.h0();
                    if (av8Var7.S) {
                        av8Var7.l(zg3Var5);
                    } else {
                        av8Var7.q0();
                    }
                    waa.K(av8Var7, a7, f50Var4);
                    waa.K(av8Var7, m9, ff3Var2);
                    bf3.s(hashCode9, av8Var7, f50Var5, av8Var7, ryVar2);
                    waa.K(av8Var7, C9, f50Var6);
                    udj.c(oea.v(R.string.button_invite_friends, av8Var7), null, lz.D(R.color.primary_default, av8Var7), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var7, 0, 0, 131066);
                    kq9.b(s6a.N(R.drawable.ic_chevron_right_large_16, 6, av8Var7), null, bkh.l(l98.f0(utcVar3, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 16.0f), lz.D(R.color.primary_default, av8Var7), av8Var7, 432, 0);
                    ljg.t(av8Var7, true, true, true);
                } else {
                    av8Var7.W();
                }
                return Unit.a;
            case 7:
                of3 of3Var6 = (of3) obj2;
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                ImageVector N = s6a.N(R.drawable.ic_close, 6, of3Var6);
                long D4 = lz.D(R.color.on_color_primary, of3Var6);
                xtc l = bkh.l(utcVar, 36.0f);
                long D5 = lz.D(R.color.n_lv_4, of3Var6);
                av8 av8Var8 = (av8) of3Var6;
                Object O11 = av8Var8.O();
                if (O11 == obj4) {
                    O11 = mz1.e(av8Var8);
                }
                wzc wzcVar3 = (wzc) O11;
                Object[] objArr3 = new Object[0];
                Object O12 = av8Var8.O();
                if (O12 == obj4) {
                    O12 = mce.v;
                    av8Var8.n0(O12);
                }
                kq9.b(N, null, l98.b0(tol.y(l, true, true, true, D5, wzcVar3, new cyg(function02, (boh) o3a.N(objArr3, (Function0) O12, av8Var8, 48), 1), av8Var8, 0), 6.0f), D4, av8Var8, 48, 0);
                return Unit.a;
            case 8:
                m1c m1cVar = (m1c) obj;
                g1c g1cVar = (g1c) obj2;
                m1cVar.getClass();
                g1cVar.getClass();
                qhe J = g1cVar.J(((an3) obj3).a);
                int b = wzb.b(((Number) function02.invoke()).floatValue());
                int i3 = J.b + b;
                return m1c.G0(m1cVar, J.a, i3 < 0 ? 0 : i3, new ja(J, b, 3));
            case 9:
                f4j f4jVar = (f4j) obj;
                of3 of3Var7 = (of3) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var7).g(f4jVar) ? 4 : 2;
                }
                av8 av8Var9 = (av8) of3Var7;
                if (av8Var9.T(intValue5 & 1, (intValue5 & 19) != 18)) {
                    xtc d5 = bkh.d(utcVar, 1.0f);
                    u23 a8 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.p, av8Var9, 54);
                    int hashCode10 = Long.hashCode(av8Var9.T);
                    aee m10 = av8Var9.m();
                    xtc C10 = fqj.C(av8Var9, d5);
                    if3.k7.getClass();
                    zg3 zg3Var6 = hf3.b;
                    av8Var9.h0();
                    if (av8Var9.S) {
                        av8Var9.l(zg3Var6);
                    } else {
                        av8Var9.q0();
                    }
                    f50 f50Var7 = hf3.g;
                    waa.K(av8Var9, a8, f50Var7);
                    ff3 ff3Var3 = hf3.f;
                    waa.K(av8Var9, m10, ff3Var3);
                    Integer valueOf4 = Integer.valueOf(hashCode10);
                    f50 f50Var8 = hf3.j;
                    waa.K(av8Var9, valueOf4, f50Var8);
                    ry ryVar3 = hf3.k;
                    waa.J(av8Var9, ryVar3);
                    f50 f50Var9 = hf3.d;
                    waa.K(av8Var9, C10, f50Var9);
                    if (f4jVar != null) {
                        av8Var9.d0(684920941);
                        int i4 = f4jVar.a;
                        xtc l2 = bkh.l(utcVar, 48.0f);
                        long D6 = lz.D(R.color.n_lv_4, av8Var9);
                        Object O13 = av8Var9.O();
                        if (O13 == obj4) {
                            O13 = mz1.e(av8Var9);
                        }
                        wzc wzcVar4 = (wzc) O13;
                        Object[] objArr4 = new Object[0];
                        Object O14 = av8Var9.O();
                        if (O14 == obj4) {
                            O14 = nuh.s;
                            av8Var9.n0(O14);
                        }
                        td4.G(i4, tol.y(l2, true, true, true, D6, wzcVar4, new cyg(function02, (boh) o3a.N(objArr4, (Function0) O14, av8Var9, 48), 17), av8Var9, 0), false, 0L, av8Var9, 0, 12);
                        av8Var9 = av8Var9;
                        String str = f4jVar.b;
                        yf8 yf8Var5 = xth.a;
                        udj.c(str, null, lz.D(R.color.n_lv_1, av8Var9), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var9, 0, 24960, 110586);
                        av8Var9.s(false);
                    } else {
                        av8Var9.d0(685489729);
                        xtc l3 = bkh.l(utcVar, 48.0f);
                        n7g n7gVar = o7g.a;
                        xtc q = n9e.q(d2a.E(l3, 2.0f, n7gVar, false, 0L, 28), lz.D(R.color.surface_1, av8Var9), n7gVar);
                        k1c c3 = e12.c(uxf.c, false);
                        int hashCode11 = Long.hashCode(av8Var9.T);
                        aee m11 = av8Var9.m();
                        xtc C11 = fqj.C(av8Var9, q);
                        av8Var9.h0();
                        if (av8Var9.S) {
                            av8Var9.l(zg3Var6);
                        } else {
                            av8Var9.q0();
                        }
                        waa.K(av8Var9, c3, f50Var7);
                        waa.K(av8Var9, m11, ff3Var3);
                        bf3.s(hashCode11, av8Var9, f50Var8, av8Var9, ryVar3);
                        waa.K(av8Var9, C11, f50Var9);
                        kq9.b(s6a.N(R.drawable.ic_plus, 6, av8Var9), null, bkh.l(n12Var.a(utcVar, uxf.g), 24.0f), lz.D(R.color.primary_default, av8Var9), av8Var9, 48, 0);
                        av8Var9.s(true);
                        String v5 = oea.v(R.string.select_team, av8Var9);
                        yf8 yf8Var6 = xth.a;
                        udj.c(v5, null, lz.D(R.color.primary_default, av8Var9), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var9, 0, 0, 131066);
                        av8Var9.s(false);
                    }
                    av8Var9.s(true);
                } else {
                    av8Var9.W();
                }
                return Unit.a;
            case 10:
                m1c m1cVar2 = (m1c) obj;
                g1c g1cVar2 = (g1c) obj2;
                an3 an3Var = (an3) obj3;
                float f = ((p75) function02.invoke()).a;
                qhe J2 = g1cVar2.J(an3.a(an3Var.a, 0, 0, cn3.f(!p75.b(f, Float.NaN) ? m1cVar2.e0(f) : 0, an3Var.a), 0, 11));
                return m1c.G0(m1cVar2, J2.a, J2.b, new b3(J2, 17));
            default:
                ((Integer) obj3).getClass();
                ((r70) obj).getClass();
                xtc l4 = bkh.l(l98.f0(utc.a, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 24.0f);
                av8 av8Var10 = (av8) ((of3) obj2);
                boolean g3 = av8Var10.g(function02);
                Object O15 = av8Var10.O();
                if (g3 || O15 == obj4) {
                    O15 = new rsd(22, function02);
                    av8Var10.n0(O15);
                }
                kq9.b(s6a.N(R.drawable.ic_close, 6, av8Var10), null, tol.y(l4, false, false, false, 0L, null, (Function0) O15, av8Var10, 29), lz.D(R.color.primary_default, av8Var10), av8Var10, 48, 0);
                return Unit.a;
        }
    }
}
