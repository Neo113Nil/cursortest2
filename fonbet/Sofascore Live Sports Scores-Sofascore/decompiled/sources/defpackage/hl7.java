package defpackage;

import android.content.Context;
import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.odds.FeaturedOddsView;
import com.sofascore.results.fantasy.competition.home.bottomsheet.topplayers.FantasyTopPlayersBottomSheet;
import com.sofascore.results.fantasy.teammanagement.transfers.FantasyTransfersFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.review.FantasyTransfersReviewFragment;
import com.sofascore.results.fantasy.teammanagement.transfers.selectreplacement.FantasyTransfersSelectReplacementDialogFragment;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.sofascore.results.fantasy.walkthrough.createteam.selectreplacement.FantasyWalkthroughSelectReplacementDialogFragment;
import com.sofascore.results.featureWalkthrough.FeatureWalkthroughFullScreenDialog;
import com.sofascore.results.league.historical.topperformance.HistoricalDataTopPerformanceModal;
import com.squareup.wire.Message;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.FieldBinding;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hl7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl7(rwc rwcVar, Object obj) {
        this.a = 20;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        vn7 vn7Var;
        ho7 a;
        boolean c;
        boolean c2;
        boolean g;
        FantasyTransfersSelectReplacementDialogFragment fantasyTransfersSelectReplacementDialogFragment;
        Unit builderSetter$lambda$0;
        Unit builderSetter$lambda$1;
        Unit builderSetter$lambda$2;
        int i = this.a;
        int i2 = 21;
        rq3 rq3Var = null;
        a99 a99Var = nf3.a;
        int i3 = 2;
        final int i4 = 1;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                jl7.b((ml7) obj3, (of3) obj, aba.K(1));
                break;
            case 1:
                imh imhVar = (imh) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    hda.g(imhVar, null, yqo.H(-1951101091, av8Var, new s16(imhVar, 18)), av8Var, 384);
                } else {
                    av8Var.W();
                }
                break;
            case 2:
                FantasyTopPlayersBottomSheet fantasyTopPlayersBottomSheet = (FantasyTopPlayersBottomSheet) obj3;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ksa a2 = msa.a(0, 0, av8Var2, 0, 3);
                    ksa a3 = msa.a(0, 0, av8Var2, 0, 3);
                    cdi O = z1a.O(a2, av8Var2);
                    cm7 cm7Var = fantasyTopPlayersBottomSheet.G().k().c;
                    rz6 rz6Var = fantasyTopPlayersBottomSheet.G().k().d;
                    boolean g2 = av8Var2.g(a2);
                    Object O2 = av8Var2.O();
                    Object obj4 = O2;
                    if (g2 || O2 == a99Var) {
                        ck1 ck1Var = new ck1(7, rq3Var, a2);
                        av8Var2.n0(ck1Var);
                        obj4 = ck1Var;
                    }
                    hz8.q(cm7Var, rz6Var, (Function2) obj4, av8Var2);
                    haa.f(yqo.H(-1784006518, av8Var2, new fm7(fantasyTopPlayersBottomSheet, a2, a3, O)), av8Var2, 6);
                } else {
                    av8Var2.W();
                }
                break;
            case 3:
                final FantasyTransfersFragment fantasyTransfersFragment = (FantasyTransfersFragment) obj3;
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ao7 D = fantasyTransfersFragment.D();
                    boolean i5 = av8Var3.i(fantasyTransfersFragment);
                    Object O3 = av8Var3.O();
                    if (i5 || O3 == a99Var) {
                        final int i6 = false ? 1 : 0;
                        O3 = new Function0() { // from class: hn7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = i6;
                                FantasyTransfersFragment fantasyTransfersFragment2 = fantasyTransfersFragment;
                                switch (i7) {
                                    case 0:
                                        v8a.D(fantasyTransfersFragment2, new jc(R.id.action_squad_to_review));
                                        break;
                                    default:
                                        v8a.D(fantasyTransfersFragment2, new jc(R.id.action_squad_to_squad_info_mode_dialog));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var3.n0(O3);
                    }
                    Function0 function0 = (Function0) O3;
                    boolean i7 = av8Var3.i(fantasyTransfersFragment);
                    Object O4 = av8Var3.O();
                    if (i7 || O4 == a99Var) {
                        O4 = new x16(fantasyTransfersFragment, 27);
                        av8Var3.n0(O4);
                    }
                    Function1 function1 = (Function1) O4;
                    boolean i8 = av8Var3.i(fantasyTransfersFragment);
                    Object O5 = av8Var3.O();
                    if (i8 || O5 == a99Var) {
                        O5 = new Function0() { // from class: hn7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i4;
                                FantasyTransfersFragment fantasyTransfersFragment2 = fantasyTransfersFragment;
                                switch (i72) {
                                    case 0:
                                        v8a.D(fantasyTransfersFragment2, new jc(R.id.action_squad_to_review));
                                        break;
                                    default:
                                        v8a.D(fantasyTransfersFragment2, new jc(R.id.action_squad_to_squad_info_mode_dialog));
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        av8Var3.n0(O5);
                    }
                    tn7.a(D, function0, function1, (Function0) O5, null, av8Var3, 0);
                } else {
                    av8Var3.W();
                }
                break;
            case 4:
                FantasyTransfersReviewFragment fantasyTransfersReviewFragment = (FantasyTransfersReviewFragment) obj3;
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ao7 D2 = fantasyTransfersReviewFragment.D();
                    upd onBackPressedDispatcher = fantasyTransfersReviewFragment.requireActivity().getOnBackPressedDispatcher();
                    boolean i9 = av8Var4.i(onBackPressedDispatcher);
                    Object O6 = av8Var4.O();
                    if (i9 || O6 == a99Var) {
                        av6 av6Var = new av6(0, onBackPressedDispatcher, upd.class, "onBackPressed", "onBackPressed()V", 0, 21);
                        av8Var4.n0(av6Var);
                        O6 = av6Var;
                    }
                    ktm.p(D2, (Function0) ((KFunction) O6), null, av8Var4, 0);
                } else {
                    av8Var4.W();
                }
                break;
            case 5:
                ao7 ao7Var = (ao7) obj3;
                tl7 tl7Var = (tl7) obj;
                Boolean bool = (Boolean) obj2;
                boolean booleanValue = bool.booleanValue();
                tl7Var.getClass();
                ho7 ho7Var = ao7Var.f;
                ao7Var.u = (booleanValue && tl7Var == tl7.h && !ho7Var.f) ? bool : null;
                if (!booleanValue || tl7Var != tl7.g || ho7Var.e) {
                    bool = null;
                }
                ao7Var.v = bool;
                fdi fdiVar = ao7Var.n;
                do {
                    value = fdiVar.getValue();
                    vn7Var = (vn7) value;
                    ho7 ho7Var2 = vn7Var.a;
                    vl7 vl7Var = vn7Var.f;
                    vl7 vl7Var2 = vn7Var.e;
                    tl7 tl7Var2 = tl7.h;
                    boolean z = tl7Var == tl7Var2 && booleanValue;
                    tl7 tl7Var3 = tl7.g;
                    a = ho7.a(ho7Var2, null, 0, tl7Var == tl7Var3 && booleanValue, z, false, false, 207);
                    if (tl7Var == tl7Var2) {
                        if (booleanValue) {
                            if (!Intrinsics.c(vl7Var2 != null ? Boolean.valueOf(vl7Var2.c) : null, Boolean.TRUE)) {
                                c = false;
                            }
                        }
                        c = true;
                    } else {
                        c = Intrinsics.c(vl7Var2 != null ? Boolean.valueOf(vl7Var2.c) : null, Boolean.TRUE);
                    }
                    if (tl7Var == tl7Var3) {
                        if (booleanValue) {
                            if (!Intrinsics.c(vl7Var != null ? Boolean.valueOf(vl7Var.c) : null, Boolean.TRUE)) {
                                c2 = false;
                            }
                        }
                        c2 = true;
                    } else {
                        c2 = Intrinsics.c(vl7Var != null ? Boolean.valueOf(vl7Var.c) : null, Boolean.TRUE);
                    }
                    g = a.g();
                } while (!fdiVar.k(value, vn7.a(vn7Var, a, null, 0.0d, ao7Var.n(g), ao7Var.x(a, c), ao7Var.y(a, c2), g, false, false, false, 0, ao7Var.l(g), null, null, 6022)));
                ao7Var.o();
                break;
            case 6:
                FantasyTransfersSelectReplacementDialogFragment fantasyTransfersSelectReplacementDialogFragment2 = (FantasyTransfersSelectReplacementDialogFragment) obj3;
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Context context = (Context) av8Var5.k(nz.b);
                    e1d x = rfo.x(fantasyTransfersSelectReplacementDialogFragment2.w().o, av8Var5, 0);
                    gk7 gk7Var = (gk7) fantasyTransfersSelectReplacementDialogFragment2.A.getValue();
                    FantasyCompetitionType fantasyCompetitionType = fantasyTransfersSelectReplacementDialogFragment2.w().x;
                    boolean z2 = fantasyTransfersSelectReplacementDialogFragment2.w().g.A;
                    gv9 gv9Var = ((vn7) fantasyTransfersSelectReplacementDialogFragment2.w().n.getValue()).b;
                    ArrayList arrayList = new ArrayList(k13.r(gv9Var, 10));
                    Iterator<E> it = gv9Var.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((FantasyRoundPlayerUiModel) it.next()).a));
                    }
                    gv9 W = l6g.W(arrayList);
                    ao7 w = fantasyTransfersSelectReplacementDialogFragment2.w();
                    boolean i10 = av8Var5.i(w);
                    Object O7 = av8Var5.O();
                    if (i10 || O7 == a99Var) {
                        O7 = new s26(1, w, ao7.class, "setTransferringIn", "setTransferringIn(Lcom/sofascore/results/fantasy/ui/model/FantasyRoundPlayerUiModel;)V", 0, 13);
                        av8Var5.n0(O7);
                    }
                    KFunction kFunction = (KFunction) O7;
                    boolean i11 = av8Var5.i(fantasyTransfersSelectReplacementDialogFragment2);
                    Object O8 = av8Var5.O();
                    if (i11 || O8 == a99Var) {
                        fantasyTransfersSelectReplacementDialogFragment = fantasyTransfersSelectReplacementDialogFragment2;
                        av6 av6Var2 = new av6(0, fantasyTransfersSelectReplacementDialogFragment, FantasyTransfersSelectReplacementDialogFragment.class, "dismiss", "dismiss()V", 0, 24);
                        av8Var5.n0(av6Var2);
                        O8 = av6Var2;
                    } else {
                        fantasyTransfersSelectReplacementDialogFragment = fantasyTransfersSelectReplacementDialogFragment2;
                    }
                    KFunction kFunction2 = (KFunction) O8;
                    Function1 function12 = (Function1) kFunction;
                    boolean i12 = av8Var5.i(context) | av8Var5.i(fantasyTransfersSelectReplacementDialogFragment);
                    Object O9 = av8Var5.O();
                    if (i12 || O9 == a99Var) {
                        O9 = new w47(15, (Object) context, (Object) fantasyTransfersSelectReplacementDialogFragment);
                        av8Var5.n0(O9);
                    }
                    un0.o(gk7Var, fantasyCompetitionType, W, function12, (Function1) O9, (Function0) kFunction2, z2, null, yqo.H(-301361036, av8Var5, new kz6(i2, fantasyTransfersSelectReplacementDialogFragment, x)), av8Var5, 100663296, 128);
                } else {
                    av8Var5.W();
                }
                break;
            case 7:
                qp7 qp7Var = (qp7) obj3;
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    ng0 ng0Var = new ng0(8.0f, true, new a70(6));
                    xtc d0 = l98.d0(hkg.Z(bkh.d(utc.a, 1.0f), hkg.o0(av8Var6), false, 14), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    l8g a4 = k8g.a(ng0Var, uxf.l, av8Var6, 6);
                    int hashCode = Long.hashCode(av8Var6.T);
                    aee m = av8Var6.m();
                    xtc C = fqj.C(av8Var6, d0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var6.h0();
                    if (av8Var6.S) {
                        av8Var6.l(zg3Var);
                    } else {
                        av8Var6.q0();
                    }
                    waa.K(av8Var6, a4, hf3.g);
                    waa.K(av8Var6, m, hf3.f);
                    waa.K(av8Var6, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var6, hf3.k);
                    waa.K(av8Var6, C, hf3.d);
                    av8Var6.d0(1217655099);
                    for (e47 e47Var : qp7Var.i) {
                        i2a.e(e47Var.a, e47Var.b, e47Var.c, qp7Var.a.A, null, false, av8Var6, 0, 48);
                    }
                    av8Var6.s(false);
                    av8Var6.s(true);
                } else {
                    av8Var6.W();
                }
                break;
            case 8:
                FantasyWalkthroughSelectReplacementDialogFragment fantasyWalkthroughSelectReplacementDialogFragment = (FantasyWalkthroughSelectReplacementDialogFragment) obj3;
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Context context2 = (Context) av8Var7.k(nz.b);
                    gk7 gk7Var2 = (gk7) fantasyWalkthroughSelectReplacementDialogFragment.A.getValue();
                    FantasyCompetitionType fantasyCompetitionType2 = fantasyWalkthroughSelectReplacementDialogFragment.w().k().a.d;
                    boolean z3 = fantasyWalkthroughSelectReplacementDialogFragment.w().k().a.A;
                    gv9 gv9Var2 = fantasyWalkthroughSelectReplacementDialogFragment.w().k().d;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : gv9Var2) {
                        if (obj5 instanceof FantasyRoundPlayerUiModel) {
                            arrayList2.add(obj5);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(Integer.valueOf(((FantasyRoundPlayerUiModel) it2.next()).a));
                    }
                    gv9 W2 = l6g.W(arrayList3);
                    vp7 w2 = fantasyWalkthroughSelectReplacementDialogFragment.w();
                    boolean i13 = av8Var7.i(w2);
                    Object O10 = av8Var7.O();
                    if (i13 || O10 == a99Var) {
                        O10 = new s26(1, w2, vp7.class, "addPlayer", "addPlayer(Lcom/sofascore/results/fantasy/ui/model/FantasyRoundPlayerUiModel;)V", 0, 15);
                        av8Var7.n0(O10);
                    }
                    KFunction kFunction3 = (KFunction) O10;
                    boolean i14 = av8Var7.i(fantasyWalkthroughSelectReplacementDialogFragment);
                    Object O11 = av8Var7.O();
                    if (i14 || O11 == a99Var) {
                        av6 av6Var3 = new av6(0, fantasyWalkthroughSelectReplacementDialogFragment, FantasyWalkthroughSelectReplacementDialogFragment.class, "dismiss", "dismiss()V", 0, 27);
                        av8Var7.n0(av6Var3);
                        O11 = av6Var3;
                    }
                    KFunction kFunction4 = (KFunction) O11;
                    Function1 function13 = (Function1) kFunction3;
                    boolean i15 = av8Var7.i(fantasyWalkthroughSelectReplacementDialogFragment) | av8Var7.i(context2);
                    Object O12 = av8Var7.O();
                    Object obj6 = O12;
                    if (i15 || O12 == a99Var) {
                        w47 w47Var = new w47(17, context2, (Object) fantasyWalkthroughSelectReplacementDialogFragment);
                        av8Var7.n0(w47Var);
                        obj6 = w47Var;
                    }
                    un0.o(gk7Var2, fantasyCompetitionType2, W2, function13, (Function1) obj6, (Function0) kFunction4, z3, null, null, av8Var7, 0, 384);
                } else {
                    av8Var7.W();
                }
                break;
            case 9:
                FeatureWalkthroughFullScreenDialog featureWalkthroughFullScreenDialog = (FeatureWalkthroughFullScreenDialog) obj3;
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    vt7 vt7Var = (vt7) featureWalkthroughFullScreenDialog.v.getValue();
                    boolean i16 = av8Var8.i(featureWalkthroughFullScreenDialog);
                    Object O13 = av8Var8.O();
                    if (i16 || O13 == a99Var) {
                        O13 = new kt7(featureWalkthroughFullScreenDialog, i4);
                        av8Var8.n0(O13);
                    }
                    rfo.f(vt7Var, (Function0) O13, null, av8Var8, 0);
                } else {
                    av8Var8.W();
                }
                break;
            case 10:
                FeaturedOddsView featuredOddsView = (FeaturedOddsView) obj3;
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int i17 = FeaturedOddsView.p;
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    fz8.e(((Boolean) ((eoh) featuredOddsView.isOddsVisible).getValue()).booleanValue(), null, uo5.e(s02.h0(400, 0, null, 6), 2).a(uo5.d(s02.h0(400, 0, null, 6), null, 14)), uo5.f(s02.h0(400, 0, null, 6), 2).a(uo5.l(s02.h0(400, 0, null, 6), null, 14)), null, yqo.H(-1495892564, av8Var9, new s16(featuredOddsView, i2)), av8Var9, 200064, 18);
                } else {
                    av8Var9.W();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                wx7.a((k6c) obj3, (of3) obj, aba.K(1));
                break;
            case 12:
                rr7 rr7Var = (rr7) obj3;
                of3 of3Var10 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    gv9 W3 = l6g.W((Iterable) rfo.v(rr7Var.s, new ArrayList(), av8Var10, 0).getValue());
                    gv9 W4 = l6g.W((Iterable) rfo.v(rr7Var.t, km5.a, av8Var10, 48).getValue());
                    yq7 yq7Var = (yq7) rfo.x(rr7Var.r, av8Var10, 0).getValue();
                    boolean i18 = av8Var10.i(rr7Var);
                    Object O14 = av8Var10.O();
                    if (i18 || O14 == a99Var) {
                        O14 = new yx7(rr7Var, i3);
                        av8Var10.n0(O14);
                    }
                    hz8.n(W3, yq7Var, W4, (Function1) O14, av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                break;
            case 13:
                builderSetter$lambda$0 = FieldBinding.getBuilderSetter$lambda$0((WireField) obj3, (Message.Builder) obj, obj2);
                break;
            case 14:
                builderSetter$lambda$1 = FieldBinding.getBuilderSetter$lambda$1((Method) obj3, (Message.Builder) obj, obj2);
                break;
            case 15:
                builderSetter$lambda$2 = FieldBinding.getBuilderSetter$lambda$2((Field) obj3, (Message.Builder) obj, obj2);
                break;
            case 16:
                sk8 sk8Var = (sk8) obj3;
                of3 of3Var11 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Double d = sk8Var.r;
                    ux7 ux7Var = sk8Var.m;
                    int i19 = ux7Var.a;
                    String str = ux7Var.b;
                    String str2 = str == null ? "" : str;
                    int i20 = sk8Var.n.a;
                    String str3 = sk8Var.h;
                    yf8 yf8Var = xth.a;
                    l98.o(i19, str2, null, Integer.valueOf(i20), d, str3, true, xth.l(), av8Var11, 1572864, 4);
                } else {
                    av8Var11.W();
                }
                break;
            case 17:
                String str4 = (String) obj;
                ((Integer) obj2).getClass();
                str4.getClass();
                ((ml8) obj3).setTeamSide(vk8.valueOf(str4));
                break;
            case 18:
                tl8 tl8Var = (tl8) obj3;
                of3 of3Var12 = (of3) obj;
                int intValue12 = ((Integer) obj2).intValue();
                av8 av8Var12 = (av8) of3Var12;
                if (av8Var12.T(intValue12 & 1, (intValue12 & 3) != 2)) {
                    fy7 fy7Var = tl8Var.m;
                    int i21 = fy7Var.a;
                    String str5 = fy7Var.b;
                    l98.u(i21, str5 == null ? "" : str5, null, tl8Var.h, tl8Var.s, av8Var12, 0, 4);
                } else {
                    av8Var12.W();
                }
                break;
            case 19:
                qu8 qu8Var = (qu8) obj3;
                of3 of3Var13 = (of3) obj;
                int intValue13 = ((Integer) obj2).intValue();
                av8 av8Var13 = (av8) of3Var13;
                if (av8Var13.T(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ux7 ux7Var2 = qu8Var.m;
                    int i22 = ux7Var2.a;
                    String str6 = ux7Var2.b;
                    String str7 = str6 == null ? "" : str6;
                    String str8 = qu8Var.q;
                    String str9 = qu8Var.r;
                    int i23 = qu8Var.n.a;
                    bx7 bx7Var = qu8Var.l;
                    Integer num = bx7Var.m;
                    Integer num2 = bx7Var.n;
                    Integer num3 = bx7Var.q;
                    l98.m(i22, str7, str8, str9, i23, null, null, num, num2, num3 != null ? num3.intValue() : 0, 64.0f, av8Var13, 1769472, 6, 0);
                } else {
                    av8Var13.W();
                }
                break;
            case 20:
                of3 of3Var14 = (of3) obj;
                int intValue14 = ((Integer) obj2).intValue();
                av8 av8Var14 = (av8) of3Var14;
                if (av8Var14.T(intValue14 & 1, (intValue14 & 3) != 2)) {
                    qx9.c.invoke(obj3, av8Var14, 0);
                } else {
                    av8Var14.W();
                }
                break;
            case 21:
                String str10 = (String) obj;
                ((Integer) obj2).getClass();
                str10.getClass();
                ((s26) obj3).invoke(str10);
                break;
            case 22:
                ((Integer) obj2).getClass();
                ((na9) obj3).a(aba.K(1), (of3) obj);
                break;
            case 23:
                vvk vvkVar = (vvk) obj3;
                eb9 eb9Var = (eb9) obj;
                eb9 eb9Var2 = (eb9) obj2;
                eb9Var.getClass();
                eb9Var2.getClass();
                if (lz.O(vvkVar, eb9Var.a, sfb.b)) {
                    eb9Var.a = vvkVar;
                    eb9Var.b.b(vvkVar);
                }
                if (lz.O(vvkVar, eb9Var2.a, sfb.c)) {
                    eb9Var2.a = vvkVar;
                    eb9Var2.b.b(vvkVar);
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                ((nb9) obj3).a(aba.K(1), (of3) obj);
                break;
            case 25:
                HistoricalDataTopPerformanceModal historicalDataTopPerformanceModal = (HistoricalDataTopPerformanceModal) obj3;
                of3 of3Var15 = (of3) obj;
                int intValue15 = ((Integer) obj2).intValue();
                av8 av8Var15 = (av8) of3Var15;
                if (av8Var15.T(intValue15 & 1, (intValue15 & 3) != 2)) {
                    List<rlj> list = (List) ((eoh) historicalDataTopPerformanceModal.G).getValue();
                    ArrayList arrayList4 = new ArrayList(k13.r(list, 10));
                    for (rlj rljVar : list) {
                        arrayList4.add(new oxh(rljVar, rljVar.g0(), null, null, null, false, 252));
                    }
                    gv9 W5 = l6g.W(arrayList4);
                    Iterator<E> it3 = W5.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            Object next = it3.next();
                            if (Intrinsics.c(((oxh) next).a, (rlj) ((eoh) historicalDataTopPerformanceModal.H).getValue())) {
                                rq3Var = next;
                            }
                        }
                    }
                    oxh oxhVar = (oxh) rq3Var;
                    boolean i24 = av8Var15.i(historicalDataTopPerformanceModal);
                    Object O15 = av8Var15.O();
                    if (i24 || O15 == a99Var) {
                        O15 = new xb9(historicalDataTopPerformanceModal, i4);
                        av8Var15.n0(O15);
                    }
                    r4a.j(W5, oxhVar, (Function1) O15, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var15, 12582912, 888);
                } else {
                    av8Var15.W();
                }
                break;
            case 26:
                dc9 dc9Var = (dc9) obj3;
                of3 of3Var16 = (of3) obj;
                int intValue16 = ((Integer) obj2).intValue();
                av8 av8Var16 = (av8) of3Var16;
                if (av8Var16.T(intValue16 & 1, (intValue16 & 3) != 2)) {
                    List<rlj> list2 = (List) ((eoh) dc9Var.f).getValue();
                    ArrayList arrayList5 = new ArrayList(k13.r(list2, 10));
                    for (rlj rljVar2 : list2) {
                        arrayList5.add(new oxh(rljVar2, rljVar2.g0(), null, null, null, false, 252));
                    }
                    gv9 W6 = l6g.W(arrayList5);
                    Iterator<E> it4 = W6.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next2 = it4.next();
                            String g0 = ((rlj) ((oxh) next2).a).g0();
                            rlj rljVar3 = (rlj) ((eoh) dc9Var.g).getValue();
                            if (Intrinsics.c(g0, rljVar3 != null ? rljVar3.g0() : null)) {
                                rq3Var = next2;
                            }
                        }
                    }
                    oxh oxhVar2 = (oxh) rq3Var;
                    boolean i25 = av8Var16.i(dc9Var);
                    Object O16 = av8Var16.O();
                    if (i25 || O16 == a99Var) {
                        O16 = new yx7(dc9Var, 19);
                        av8Var16.n0(O16);
                    }
                    r4a.j(W6, oxhVar2, (Function1) O16, null, null, false, new t3e(8.0f, 8.0f, 8.0f, 8.0f), false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var16, 12582912, 888);
                } else {
                    av8Var16.W();
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((me9) obj3).j(aba.K(1), (of3) obj);
                break;
            case 28:
                ((Integer) obj2).getClass();
                ((dq9) obj3).j(aba.K(1), (of3) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((h2a) obj3).a(aba.K(1), (of3) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ hl7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ hl7(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
