package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import android.widget.Spinner;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.results.R;
import com.sofascore.results.crowdsourcing.EventContributeFragment;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.league.LeagueActivity;
import com.sofascore.results.league.fragment.topStats.TopStatsCategory;
import com.sofascore.results.player.PlayerActivity;
import com.sofascore.results.profile.LoginScreenActivity;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class jw5 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jw5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ServerType serverType;
        v5i v5iVar;
        ServerType serverType2;
        v5i v5iVar2;
        int i = this.a;
        a99 a99Var = nf3.a;
        char c = 1;
        final int i2 = 0;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                final EventContributeFragment eventContributeFragment = (EventContributeFragment) obj5;
                k64 k64Var = (k64) obj2;
                of3 of3Var = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                k64Var.getClass();
                if (k64Var instanceof j64) {
                    av8 av8Var = (av8) of3Var;
                    av8Var.d0(288110855);
                    j64 j64Var = (j64) k64Var;
                    tr3 D = eventContributeFragment.D();
                    boolean i3 = av8Var.i(D);
                    Object O = av8Var.O();
                    if (i3 || O == a99Var) {
                        ny nyVar = new ny(0, D, tr3.class, "onHowToContributeClick", "onHowToContributeClick()V", 0, 14);
                        av8Var.n0(nyVar);
                        O = nyVar;
                    }
                    KFunction kFunction = (KFunction) O;
                    tr3 D2 = eventContributeFragment.D();
                    boolean i4 = av8Var.i(D2);
                    Object O2 = av8Var.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new ny(0, D2, tr3.class, "onAddGoal", "onAddGoal()V", 0, 17);
                        av8Var.n0(O2);
                    }
                    KFunction kFunction2 = (KFunction) O2;
                    tr3 D3 = eventContributeFragment.D();
                    boolean i5 = av8Var.i(D3);
                    Object O3 = av8Var.O();
                    if (i5 || O3 == a99Var) {
                        O3 = new mw5(1, 0, tr3.class, D3, "onEditIncident", "onEditIncident(Lcom/sofascore/model/crowdsourcing/EventSuggest$IncidentSuggest;)V");
                        av8Var.n0(O3);
                    }
                    KFunction kFunction3 = (KFunction) O3;
                    tr3 D4 = eventContributeFragment.D();
                    boolean i6 = av8Var.i(D4);
                    Object O4 = av8Var.O();
                    if (i6 || O4 == a99Var) {
                        O4 = new ny(0, D4, tr3.class, "onLegendInfoClick", "onLegendInfoClick()V", 0, 20);
                        av8Var.n0(O4);
                    }
                    KFunction kFunction4 = (KFunction) O4;
                    tr3 D5 = eventContributeFragment.D();
                    boolean i7 = av8Var.i(D5);
                    Object O5 = av8Var.O();
                    if (i7 || O5 == a99Var) {
                        O5 = new k43(1, D5, tr3.class, "onFinalScoreIncrement", "onFinalScoreIncrement(Lcom/sofascore/model/crowdsourcing/TeamSide;)V", 0, 26);
                        av8Var.n0(O5);
                    }
                    KFunction kFunction5 = (KFunction) O5;
                    tr3 D6 = eventContributeFragment.D();
                    boolean i8 = av8Var.i(D6);
                    Object O6 = av8Var.O();
                    if (i8 || O6 == a99Var) {
                        k43 k43Var = new k43(1, D6, tr3.class, "onFinalScoreDecrement", "onFinalScoreDecrement(Lcom/sofascore/model/crowdsourcing/TeamSide;)V", 0, 27);
                        av8Var.n0(k43Var);
                        O6 = k43Var;
                    }
                    KFunction kFunction6 = (KFunction) O6;
                    tr3 D7 = eventContributeFragment.D();
                    boolean i9 = av8Var.i(D7);
                    Object O7 = av8Var.O();
                    if (i9 || O7 == a99Var) {
                        O7 = new i43(1, D7, tr3.class, "onToggleFinalScore", "onToggleFinalScore(Z)Lkotlinx/coroutines/Job;", 8, 3);
                        av8Var.n0(O7);
                    }
                    Function1 function1 = (Function1) O7;
                    tr3 D8 = eventContributeFragment.D();
                    boolean i10 = av8Var.i(D8);
                    Object O8 = av8Var.O();
                    if (i10 || O8 == a99Var) {
                        O8 = new p1(2, D8, tr3.class, "onReorderIncident", "onReorderIncident(II)V", 0, 4);
                        av8Var.n0(O8);
                    }
                    KFunction kFunction7 = (KFunction) O8;
                    tr3 D9 = eventContributeFragment.D();
                    boolean i11 = av8Var.i(D9);
                    Object O9 = av8Var.O();
                    if (i11 || O9 == a99Var) {
                        O9 = new k43(1, D9, tr3.class, "onTimeConfirmButtonClick", "onTimeConfirmButtonClick(Z)V", 0, 28);
                        av8Var.n0(O9);
                    }
                    KFunction kFunction8 = (KFunction) O9;
                    tr3 D10 = eventContributeFragment.D();
                    boolean i12 = av8Var.i(D10);
                    Object O10 = av8Var.O();
                    if (i12 || O10 == a99Var) {
                        O10 = new k43(1, D10, tr3.class, "onTimeChanged", "onTimeChanged(J)V", 0, 21);
                        av8Var.n0(O10);
                    }
                    KFunction kFunction9 = (KFunction) O10;
                    tr3 D11 = eventContributeFragment.D();
                    boolean i13 = av8Var.i(D11);
                    Object O11 = av8Var.O();
                    if (i13 || O11 == a99Var) {
                        O11 = new ny(0, D11, tr3.class, "submitTimeSuggest", "submitTimeSuggest()V", 0, 15);
                        av8Var.n0(O11);
                    }
                    KFunction kFunction10 = (KFunction) O11;
                    tr3 D12 = eventContributeFragment.D();
                    boolean i14 = av8Var.i(D12);
                    Object O12 = av8Var.O();
                    if (i14 || O12 == a99Var) {
                        O12 = new lw5(1, 0, tr3.class, D12, "onAddCard", "onAddCard(Lcom/sofascore/model/crowdsourcing/CrowdsourcingIncidentType$Card;)V");
                        av8Var.n0(O12);
                    }
                    KFunction kFunction11 = (KFunction) O12;
                    tr3 D13 = eventContributeFragment.D();
                    boolean i15 = av8Var.i(D13);
                    Object O13 = av8Var.O();
                    if (i15 || O13 == a99Var) {
                        O13 = new k43(1, D13, tr3.class, "onMatchEndedToggle", "onMatchEndedToggle(Z)V", 0, 22);
                        av8Var.n0(O13);
                    }
                    KFunction kFunction12 = (KFunction) O13;
                    tr3 D14 = eventContributeFragment.D();
                    boolean i16 = av8Var.i(D14);
                    Object O14 = av8Var.O();
                    if (i16 || O14 == a99Var) {
                        O14 = new k43(1, D14, tr3.class, "onMatchEndedScoreIncrement", "onMatchEndedScoreIncrement(Lcom/sofascore/model/crowdsourcing/TeamSide;)V", 0, 23);
                        av8Var.n0(O14);
                    }
                    KFunction kFunction13 = (KFunction) O14;
                    tr3 D15 = eventContributeFragment.D();
                    boolean i17 = av8Var.i(D15);
                    Object O15 = av8Var.O();
                    if (i17 || O15 == a99Var) {
                        O15 = new k43(1, D15, tr3.class, "onMatchEndedScoreDecrement", "onMatchEndedScoreDecrement(Lcom/sofascore/model/crowdsourcing/TeamSide;)V", 0, 24);
                        av8Var.n0(O15);
                    }
                    KFunction kFunction14 = (KFunction) O15;
                    tr3 D16 = eventContributeFragment.D();
                    boolean i18 = av8Var.i(D16);
                    Object O16 = av8Var.O();
                    if (i18 || O16 == a99Var) {
                        O16 = new k43(1, D16, tr3.class, "onMatchEndedTimeChanged", "onMatchEndedTimeChanged(J)V", 0, 25);
                        av8Var.n0(O16);
                    }
                    KFunction kFunction15 = (KFunction) O16;
                    tr3 D17 = eventContributeFragment.D();
                    boolean i19 = av8Var.i(D17);
                    Object O17 = av8Var.O();
                    if (i19 || O17 == a99Var) {
                        O17 = new ny(0, D17, tr3.class, "submitMatchEndedSuggest", "submitMatchEndedSuggest()V", 0, 16);
                        av8Var.n0(O17);
                    }
                    KFunction kFunction16 = (KFunction) O17;
                    Function0 function0 = (Function0) kFunction;
                    Function1 function12 = (Function1) kFunction8;
                    Function1 function13 = (Function1) kFunction9;
                    Function0 function02 = (Function0) kFunction10;
                    Function0 function03 = (Function0) kFunction2;
                    Function1 function14 = (Function1) kFunction3;
                    Function1 function15 = (Function1) kFunction11;
                    Function0 function04 = (Function0) kFunction4;
                    Function1 function16 = (Function1) kFunction5;
                    Function1 function17 = (Function1) kFunction6;
                    boolean i20 = av8Var.i(eventContributeFragment);
                    Object O18 = av8Var.O();
                    if (i20 || O18 == a99Var) {
                        final int i21 = 0;
                        O18 = new Function0() { // from class: kw5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i22 = i21;
                                EventContributeFragment eventContributeFragment2 = eventContributeFragment;
                                switch (i22) {
                                    case 0:
                                        eventContributeFragment2.D().x(true);
                                        break;
                                    case 1:
                                        tr3 D18 = eventContributeFragment2.D();
                                        xw3.L(un0.z(D18), null, null, new rr3(D18, true, null), 3).n(new vq3(D18, 0));
                                        break;
                                    default:
                                        de deVar = eventContributeFragment2.t;
                                        int i23 = LoginScreenActivity.M;
                                        FragmentActivity requireActivity = eventContributeFragment2.requireActivity();
                                        requireActivity.getClass();
                                        deVar.a(wxf.v(requireActivity, null, 6), null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O18);
                    }
                    Function0 function05 = (Function0) O18;
                    Function2 function2 = (Function2) kFunction7;
                    boolean i22 = av8Var.i(eventContributeFragment);
                    Object O19 = av8Var.O();
                    if (i22 || O19 == a99Var) {
                        final int i23 = 1;
                        O19 = new Function0() { // from class: kw5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i222 = i23;
                                EventContributeFragment eventContributeFragment2 = eventContributeFragment;
                                switch (i222) {
                                    case 0:
                                        eventContributeFragment2.D().x(true);
                                        break;
                                    case 1:
                                        tr3 D18 = eventContributeFragment2.D();
                                        xw3.L(un0.z(D18), null, null, new rr3(D18, true, null), 3).n(new vq3(D18, 0));
                                        break;
                                    default:
                                        de deVar = eventContributeFragment2.t;
                                        int i232 = LoginScreenActivity.M;
                                        FragmentActivity requireActivity = eventContributeFragment2.requireActivity();
                                        requireActivity.getClass();
                                        deVar.a(wxf.v(requireActivity, null, 6), null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O19);
                    }
                    Function0 function06 = (Function0) O19;
                    Function1 function18 = (Function1) kFunction12;
                    Function1 function19 = (Function1) kFunction13;
                    Function1 function110 = (Function1) kFunction14;
                    Function1 function111 = (Function1) kFunction15;
                    Function0 function07 = (Function0) kFunction16;
                    boolean i24 = av8Var.i(eventContributeFragment);
                    Object O20 = av8Var.O();
                    if (i24 || O20 == a99Var) {
                        final int i25 = 2;
                        O20 = new Function0() { // from class: kw5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i222 = i25;
                                EventContributeFragment eventContributeFragment2 = eventContributeFragment;
                                switch (i222) {
                                    case 0:
                                        eventContributeFragment2.D().x(true);
                                        break;
                                    case 1:
                                        tr3 D18 = eventContributeFragment2.D();
                                        xw3.L(un0.z(D18), null, null, new rr3(D18, true, null), 3).n(new vq3(D18, 0));
                                        break;
                                    default:
                                        de deVar = eventContributeFragment2.t;
                                        int i232 = LoginScreenActivity.M;
                                        FragmentActivity requireActivity = eventContributeFragment2.requireActivity();
                                        requireActivity.getClass();
                                        deVar.a(wxf.v(requireActivity, null, 6), null);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var.n0(O20);
                    }
                    t64.a(j64Var, function0, function12, function13, function02, function03, function14, function15, function04, function16, function17, function05, function1, function2, function06, function18, function19, function110, function111, function07, (Function0) O20, av8Var, (intValue >> 3) & 14);
                    av8Var.s(false);
                } else if (k64Var instanceof i64) {
                    av8 av8Var2 = (av8) of3Var;
                    av8Var2.d0(563538442);
                    i64 i64Var = (i64) k64Var;
                    tr3 D18 = eventContributeFragment.D();
                    boolean i26 = av8Var2.i(D18);
                    Object O21 = av8Var2.O();
                    if (i26 || O21 == a99Var) {
                        ny nyVar2 = new ny(0, D18, tr3.class, "onHowToContributeClick", "onHowToContributeClick()V", 0, 18);
                        av8Var2.n0(nyVar2);
                        O21 = nyVar2;
                    }
                    Function0 function08 = (Function0) ((KFunction) O21);
                    tr3 D19 = eventContributeFragment.D();
                    boolean i27 = av8Var2.i(D19);
                    Object O22 = av8Var2.O();
                    if (i27 || O22 == a99Var) {
                        ny nyVar3 = new ny(0, D19, tr3.class, "onLegendInfoClick", "onLegendInfoClick()V", 0, 19);
                        av8Var2.n0(nyVar3);
                        O22 = nyVar3;
                    }
                    f64.a(i64Var, function08, (Function0) ((KFunction) O22), av8Var2, (intValue >> 3) & 14);
                    av8Var2.s(false);
                } else {
                    if (!k64Var.equals(h64.a)) {
                        throw dmi.h((av8) of3Var, 563481226, false);
                    }
                    av8 av8Var3 = (av8) of3Var;
                    av8Var3.d0(563548323);
                    g28 g28Var = bkh.c;
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var3.T);
                    aee m = av8Var3.m();
                    xtc C = fqj.C(av8Var3, g28Var);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var3.h0();
                    if (av8Var3.S) {
                        av8Var3.l(zg3Var);
                    } else {
                        av8Var3.q0();
                    }
                    waa.K(av8Var3, c2, hf3.g);
                    waa.K(av8Var3, m, hf3.f);
                    waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var3, hf3.k);
                    waa.K(av8Var3, C, hf3.d);
                    s6a.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 62, 0L, 0L, av8Var3, bkh.l(utc.a, 24.0f));
                    av8Var3.s(true);
                    av8Var3.s(false);
                }
                return Unit.a;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                j72.l(((rt7) ((vt7) obj5).d().get(intValue2)).a, bkh.c, (of3) obj3, 48);
                return Unit.a;
            case 2:
                a20 a20Var = (a20) obj5;
                i6k c3 = ((vf8) a20Var.e).c((tf8) obj, (wg8) obj2, ((rg8) obj3).a, ((sg8) obj4).a);
                if (c3 instanceof h6k) {
                    Object obj6 = ((h6k) c3).a;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                sx2 sx2Var = new sx2(c3, a20Var.j);
                a20Var.j = sx2Var;
                Object obj7 = sx2Var.c;
                obj7.getClass();
                return (Typeface) obj7;
            case 3:
                int intValue3 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                td4.v((String) ((y80) obj5).q.get(intValue3), 0L, true, (of3) obj3, 384, 2);
                return Unit.a;
            case 4:
                int intValue4 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                td4.v((String) ((b94) obj5).o.get(intValue4), 0L, false, (of3) obj3, 0, 6);
                return Unit.a;
            case 5:
                String str = (String) obj3;
                str.getClass();
                k7d.c((k7d) obj5, new ab7(((Integer) obj).intValue(), ((Integer) obj2).intValue(), str, (FantasyRoundPlayerUiModel) obj4));
                return Unit.a;
            case 6:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((hni) obj5).i(new yr8(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 7:
                ct8 ct8Var = (ct8) obj5;
                Object obj8 = (xpa) obj;
                ((Integer) obj2).intValue();
                of3 of3Var2 = (of3) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((av8) of3Var2).g(obj8) ? 4 : 2;
                }
                av8 av8Var4 = (av8) of3Var2;
                if (av8Var4.T(intValue5 & 1, (intValue5 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    ct8Var.invoke(obj8, av8Var4, Integer.valueOf(intValue5 & 14));
                } else {
                    av8Var4.W();
                }
                return Unit.a;
            case 8:
                LeagueActivity leagueActivity = (LeagueActivity) obj5;
                ((Integer) obj3).getClass();
                ((Long) obj4).getClass();
                a99 a99Var2 = LeagueActivity.h0;
                Object selectedItem = ((Spinner) leagueActivity.S().g.k).getSelectedItem();
                selectedItem.getClass();
                leagueActivity.Q((Season) selectedItem);
                return Unit.a;
            case 9:
                final sxa sxaVar = (sxa) obj5;
                int intValue6 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((u5e) obj).getClass();
                TopStatsCategory topStatsCategory = (TopStatsCategory) sxaVar.c.get(intValue6);
                av8 av8Var5 = (av8) ((of3) obj3);
                Object O23 = av8Var5.O();
                if (O23 == a99Var) {
                    O23 = new ila(10);
                    av8Var5.n0(O23);
                }
                Function0 function09 = (Function0) O23;
                Object O24 = av8Var5.O();
                if (O24 == a99Var) {
                    O24 = new ila(11);
                    av8Var5.n0(O24);
                }
                Function0 function010 = (Function0) O24;
                long D20 = lz.D(R.color.surface_2, av8Var5);
                int size = ((TopStatsCategory) sxaVar.c.get(intValue6)).getB().size();
                boolean i28 = av8Var5.i(sxaVar);
                Object O25 = av8Var5.O();
                if (i28 || O25 == a99Var) {
                    O25 = new Function2() { // from class: qxa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            int i29 = i2;
                            sxa sxaVar2 = sxaVar;
                            switch (i29) {
                                case 0:
                                    Context context = (Context) obj9;
                                    int intValue7 = ((Integer) obj10).intValue();
                                    context.getClass();
                                    int i30 = TeamActivity.Z;
                                    jle.r(context, intValue7, t4j.h, Integer.valueOf(sxaVar2.a), null, 104);
                                    break;
                                default:
                                    Context context2 = (Context) obj9;
                                    int intValue8 = ((Integer) obj10).intValue();
                                    context2.getClass();
                                    rxa rxaVar = sxaVar2.d;
                                    if (rxaVar != null) {
                                        zxe zxeVar = rxaVar.b ? zxe.f : zxe.d;
                                        int i31 = PlayerActivity.Z;
                                        jle.q(context2, intValue8, sxaVar2.a, Integer.valueOf(rxaVar.a), zxeVar, false, null, null, 480);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var5.n0(O25);
                }
                Function2 function22 = (Function2) O25;
                boolean i29 = av8Var5.i(sxaVar);
                Object O26 = av8Var5.O();
                if (i29 || O26 == a99Var) {
                    final char c4 = c == true ? 1 : 0;
                    O26 = new Function2() { // from class: qxa
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj9, Object obj10) {
                            int i292 = c4;
                            sxa sxaVar2 = sxaVar;
                            switch (i292) {
                                case 0:
                                    Context context = (Context) obj9;
                                    int intValue7 = ((Integer) obj10).intValue();
                                    context.getClass();
                                    int i30 = TeamActivity.Z;
                                    jle.r(context, intValue7, t4j.h, Integer.valueOf(sxaVar2.a), null, 104);
                                    break;
                                default:
                                    Context context2 = (Context) obj9;
                                    int intValue8 = ((Integer) obj10).intValue();
                                    context2.getClass();
                                    rxa rxaVar = sxaVar2.d;
                                    if (rxaVar != null) {
                                        zxe zxeVar = rxaVar.b ? zxe.f : zxe.d;
                                        int i31 = PlayerActivity.Z;
                                        jle.q(context2, intValue8, sxaVar2.a, Integer.valueOf(rxaVar.a), zxeVar, false, null, null, 480);
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    av8Var5.n0(O26);
                }
                mha.k(Sports.FOOTBALL, topStatsCategory, function09, false, function010, null, D20, false, size, false, false, 8.0f, function22, (Function2) O26, av8Var5, 817917318, 54, 32);
                return Unit.a;
            case 10:
                lza lzaVar = (lza) obj5;
                int intValue7 = ((Integer) obj3).intValue();
                ((Long) obj4).getClass();
                lzaVar.f = lzaVar.b.get(intValue7);
                lzaVar.notifyDataSetChanged();
                return Unit.a;
            default:
                e5i e5iVar = (e5i) obj5;
                x5i x5iVar = (x5i) obj2;
                of3 of3Var3 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                x5iVar.getClass();
                int ordinal = x5iVar.ordinal();
                if (ordinal == 0) {
                    av8 av8Var6 = (av8) of3Var3;
                    av8Var6.d0(-1369409409);
                    wmd wmdVar = e5iVar.c;
                    int i30 = wmdVar.a;
                    String str2 = wmdVar.e;
                    wmd wmdVar2 = wmdVar.h;
                    if (wmdVar2 == null || (serverType = wmdVar2.b) == null) {
                        serverType = wmdVar.b;
                    }
                    switch (serverType != null ? y5i.a[serverType.ordinal()] : -1) {
                        case 1:
                        case 2:
                            v5iVar = v5i.Practice;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            v5iVar = v5i.Qualifying;
                            break;
                        case 7:
                        default:
                            v5iVar = v5i.Race;
                            break;
                        case 8:
                            v5iVar = v5i.Season;
                            break;
                    }
                    d5i.a(i30, str2, v5iVar.a, e5iVar.d, e5iVar.e, e5iVar.f, av8Var6, 0);
                    av8Var6.s(false);
                } else {
                    if (ordinal != 1) {
                        throw dmi.h((av8) of3Var3, 94371733, false);
                    }
                    av8 av8Var7 = (av8) of3Var3;
                    av8Var7.d0(-1368880270);
                    wmd wmdVar3 = e5iVar.c;
                    int i31 = wmdVar3.a;
                    String str3 = wmdVar3.e;
                    wmd wmdVar4 = wmdVar3.h;
                    if (wmdVar4 == null || (serverType2 = wmdVar4.b) == null) {
                        serverType2 = wmdVar3.b;
                    }
                    switch (serverType2 != null ? y5i.a[serverType2.ordinal()] : -1) {
                        case 1:
                        case 2:
                            v5iVar2 = v5i.Practice;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            v5iVar2 = v5i.Qualifying;
                            break;
                        case 7:
                        default:
                            v5iVar2 = v5i.Race;
                            break;
                        case 8:
                            v5iVar2 = v5i.Season;
                            break;
                    }
                    r5i.d(i31, str3, v5iVar2.a, e5iVar.d, e5iVar.e, av8Var7, 0);
                    av8Var7.s(false);
                }
                return Unit.a;
        }
    }
}
