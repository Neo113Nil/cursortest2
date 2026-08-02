package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import com.sofascore.results.player.statistics.compare.model.ComparisonSeasonInfo;
import com.sofascore.results.wc26.bottomSheet.WorldCupTeamPickerBottomSheet;
import com.sofascore.results.wc26.bottomSheet.WorldCupTotrChatBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lwc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lwc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a7  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        tn6 tn6Var;
        r9k r9kVar;
        r9k m9kVar;
        String str;
        int i = this.a;
        int i2 = 12;
        int i3 = 10;
        int i4 = 29;
        int i5 = 6;
        int i6 = 4;
        int i7 = 2;
        final byte b = 0;
        int i8 = 3;
        rq3 rq3Var = null;
        char c = 1;
        char c2 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                csf csfVar = (csf) obj5;
                qwc qwcVar = (qwc) obj4;
                qvg qvgVar = (qvg) obj3;
                ke keVar = (ke) obj2;
                b80 b80Var = (b80) obj;
                float floatValue = ((Number) ((eoh) b80Var.e).getValue()).floatValue() - csfVar.a;
                if (!aik.W(floatValue)) {
                    if (!aik.W(floatValue - qwcVar.k(qvgVar, floatValue))) {
                        b80Var.a();
                        return Unit.a;
                    }
                    csfVar.a += floatValue;
                }
                if (((Boolean) keVar.invoke(Float.valueOf(csfVar.a))).booleanValue()) {
                    b80Var.a();
                }
                return Unit.a;
            case 1:
                d6d d6dVar = (d6d) obj;
                d6dVar.getClass();
                ((asf) obj5).a = true;
                ((k6d) obj4).a((s6d) obj3, (Bundle) obj2, d6dVar, km5.a);
                return Unit.a;
            case 2:
                e1d e1dVar = (e1d) obj2;
                f7b f7bVar = (f7b) obj;
                f7bVar.getClass();
                tra traVar = new tra(9, (e1d) obj4);
                tra traVar2 = new tra(i3, (e1d) obj3);
                vg6 a = new wf6((Context) obj5).a();
                vel velVar = vel.a;
                String str2 = vel.d() ? "https://files.sofascore.com/assets/4b3be469b33ad6e445c9c03e6983821f" : "https://api.sofascore.com/api/v1/asset/video/ln-2023-sofascore-sports-overview-4x5-latest";
                h5c h5cVar = new h5c();
                h5cVar.b(str2);
                a.l(h5cVar.a());
                a.m.a(new qrd(traVar2, traVar, a));
                a.setRepeatMode(1);
                a.a();
                e1dVar.setValue(a);
                return new ux0(f7bVar, e1dVar, c == true ? 1 : 0);
            case 3:
                fsf fsfVar = (fsf) obj5;
                fsf fsfVar2 = (fsf) obj4;
                gv9 gv9Var = (gv9) obj3;
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) obj2;
                ysd ysdVar = (ysd) obj;
                xbb b2 = a.b();
                Object obj6 = (OnboardingItemUiModel) fsfVar.a;
                if (obj6 != null) {
                    onboardingViewModel.s++;
                    b2.add(0, obj6);
                }
                Object obj7 = (OnboardingItemUiModel) fsfVar2.a;
                if (obj7 != null) {
                    onboardingViewModel.s++;
                    b2.add(0, obj7);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : gv9Var) {
                    OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) obj8;
                    if (!Intrinsics.c(onboardingItemUiModel, fsfVar2.a) && !Intrinsics.c(onboardingItemUiModel, fsfVar.a)) {
                        arrayList.add(obj8);
                    }
                }
                b2.addAll(arrayList);
                return ysd.a(ysdVar, 0, l6g.W(a.a(b2)), null, null, 27);
            case 4:
                osa osaVar = (osa) obj5;
                Context context = (Context) obj3;
                e1d e1dVar2 = (e1d) obj2;
                esa esaVar = (esa) obj;
                esaVar.getClass();
                esaVar.f("Disclaimer", "Disclaimer", new tc3(1629608266, new g2e((e1d) obj4, context), true));
                if (Intrinsics.c((Boolean) e1dVar2.getValue(), Boolean.TRUE)) {
                    Object b3 = osaVar.b(0);
                    Object b4 = osaVar.b(1);
                    Object b5 = osaVar.b(2);
                    if (b3 != null && b4 != null && b5 != null) {
                        esaVar.f("Podium", "Podium", new tc3(498120297, new zya(i7, (d2e) b3, (d2e) b4, (d2e) b5), true));
                    }
                }
                esaVar.f("Spacing", "Spacing", xw3.c);
                esaVar.a(osaVar.c(), new x83(osaVar, i6), new etd(6), new tc3(-1969059501, new c61(12, osaVar, e1dVar2, context), true));
                return Unit.a;
            case 5:
                Context context2 = (Context) obj5;
                Function2 function2 = (Function2) obj4;
                jre jreVar = (jre) obj3;
                d87 d87Var = (d87) obj2;
                yqe yqeVar = (yqe) obj;
                yqeVar.getClass();
                if (yqeVar instanceof xqe) {
                    int i9 = ((xqe) yqeVar).a;
                    nj7[] nj7VarArr = nj7.a;
                    context2.getClass();
                    nv.A(context2, "open_rules", null);
                    StringBuilder sb = new StringBuilder("https://www.sofascore.com/fantasy/rules");
                    sb.append("?competitionId=" + i9);
                    sb.append("#scoring");
                    p4h.w(context2, sb.toString());
                } else if (yqeVar instanceof vqe) {
                    vqe vqeVar = (vqe) yqeVar;
                    function2.invoke(vqeVar.a, Integer.valueOf(vqeVar.b));
                } else if (yqeVar instanceof uqe) {
                    jreVar.l(((uqe) yqeVar).a);
                } else {
                    if (!(yqeVar instanceof wqe)) {
                        zzl.b();
                        return null;
                    }
                    int i10 = ((wqe) yqeVar).a;
                    if (!((Boolean) ((eoh) d87Var.d).getValue()).booleanValue()) {
                        d87Var.a(true);
                        xw3.L(d87Var.b, null, null, new qu1(d87Var, i10, rq3Var, 9), 3);
                    }
                }
                return Unit.a;
            case 6:
                final hre hreVar = (hre) obj5;
                final Function1 function1 = (Function1) obj4;
                cdi cdiVar = (cdi) obj3;
                Context context3 = (Context) obj2;
                esa esaVar2 = (esa) obj;
                esaVar2.getClass();
                gv9 gv9Var2 = hreVar.a;
                gv9 gv9Var3 = hreVar.e;
                if (gv9Var2 != null && !gv9Var2.isEmpty() && (tn6Var = hreVar.b) != null) {
                    esa.b(esaVar2, null, new tc3(-90173684, new nlj(7, hreVar, cdiVar, tn6Var, function1), true), 3);
                }
                FantasyPlayerUiModel fantasyPlayerUiModel = hreVar.d;
                if (fantasyPlayerUiModel != null) {
                    esaVar2.f("overview_card", "overview_card", new tc3(-980009290, new bba(fantasyPlayerUiModel, 28), true));
                    if (hreVar.c != null) {
                        esaVar2.f("price_graph", "price_graph", new tc3(-1688863833, new bba(hreVar, i4), true));
                    }
                    if (!gv9Var3.isEmpty()) {
                        esaVar2.f("fixtures_title", "fixtures_title", l98.c);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj9 : gv9Var3) {
                        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) obj9;
                        if (fantasyPlayerFixtureUiModel.q == null || fantasyPlayerFixtureUiModel.s == null || fantasyPlayerFixtureUiModel.t == null) {
                            arrayList3.add(obj9);
                        } else {
                            arrayList2.add(obj9);
                        }
                    }
                    List j = b.j(arrayList2, arrayList3);
                    ArrayList arrayList4 = new ArrayList(k13.r(j, 10));
                    int i11 = 0;
                    for (Object obj10 : j) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            b.q();
                            throw null;
                        }
                        arrayList4.add(new Pair(i11 == 0 ? zqe.PAST : zqe.FUTURE, (List) obj10));
                        i11 = i12;
                    }
                    Iterator it = arrayList4.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            b.q();
                            throw null;
                        }
                        Pair pair = (Pair) next;
                        zqe zqeVar = (zqe) pair.a;
                        List list = (List) pair.b;
                        if (!list.isEmpty()) {
                            esaVar2.f("fixture_group_" + zqeVar, "fixture_group", new tc3(-694950642, new yya(i2, zqeVar, context3), true));
                        }
                        ArrayList arrayList5 = arrayList4;
                        esaVar2.a(list.size(), new wsd(i6, new eee(b, 16), list), new tx5(1, list, list, arrayList4), new tc3(2039820996, new gre(list, list, i13, arrayList5, function1, hreVar), true));
                        i13 = i14;
                        arrayList4 = arrayList5;
                        i2 = 12;
                    }
                    esaVar2.f("rules_card", "rules_card", new tc3(1709690157, new ct8() { // from class: dre
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            int i15 = b;
                            a99 a99Var = nf3.a;
                            utc utcVar = utc.a;
                            final hre hreVar2 = hreVar;
                            final Function1 function12 = function1;
                            final int i16 = 1;
                            Object[] objArr = 0;
                            switch (i15) {
                                case 0:
                                    xpa xpaVar = (xpa) obj11;
                                    of3 of3Var = (of3) obj12;
                                    int intValue = ((Integer) obj13).intValue();
                                    xpaVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                                    }
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                                        String v = oea.v(R.string.fantasy_learn_how_to_play, av8Var);
                                        xtc f0 = l98.f0(xpa.a(xpaVar, utcVar, 7), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        boolean g = av8Var.g(function12) | av8Var.g(hreVar2);
                                        Object O = av8Var.O();
                                        if (g || O == a99Var) {
                                            O = new Function0() { // from class: cre
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = i16;
                                                    hre hreVar3 = hreVar2;
                                                    Function1 function13 = function12;
                                                    switch (i17) {
                                                        case 0:
                                                            tn6 tn6Var2 = hreVar3.b;
                                                            function13.invoke(new wqe(tn6Var2 != null ? tn6Var2.d : 0));
                                                            return Unit.a;
                                                        default:
                                                            tn6 tn6Var3 = hreVar3.b;
                                                            Integer valueOf = tn6Var3 != null ? Integer.valueOf(tn6Var3.a) : null;
                                                            if (valueOf != null) {
                                                                function13.invoke(new xqe(valueOf.intValue()));
                                                                return Unit.a;
                                                            }
                                                            a70.r("Required value was null.");
                                                            return null;
                                                    }
                                                }
                                            };
                                            av8Var.n0(O);
                                        }
                                        x2a.d(v, f0, null, 0L, 0L, 0L, (Function0) O, l98.d, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 12582912, 0, 1852);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    xpa xpaVar2 = (xpa) obj11;
                                    of3 of3Var2 = (of3) obj12;
                                    int intValue2 = ((Integer) obj13).intValue();
                                    xpaVar2.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                                    }
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        xtc f02 = l98.f0(xpa.a(xpaVar2, utcVar, 7), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        boolean g2 = av8Var2.g(function12) | av8Var2.g(hreVar2);
                                        Object O2 = av8Var2.O();
                                        if (g2 || O2 == a99Var) {
                                            final Object[] objArr2 = objArr == true ? 1 : 0;
                                            O2 = new Function0() { // from class: cre
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = objArr2;
                                                    hre hreVar3 = hreVar2;
                                                    Function1 function13 = function12;
                                                    switch (i17) {
                                                        case 0:
                                                            tn6 tn6Var2 = hreVar3.b;
                                                            function13.invoke(new wqe(tn6Var2 != null ? tn6Var2.d : 0));
                                                            return Unit.a;
                                                        default:
                                                            tn6 tn6Var3 = hreVar3.b;
                                                            Integer valueOf = tn6Var3 != null ? Integer.valueOf(tn6Var3.a) : null;
                                                            if (valueOf != null) {
                                                                function13.invoke(new xqe(valueOf.intValue()));
                                                                return Unit.a;
                                                            }
                                                            a70.r("Required value was null.");
                                                            return null;
                                                    }
                                                }
                                            };
                                            av8Var2.n0(O2);
                                        }
                                        pco.k(3072, av8Var2, f02, (Function0) O2, false);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true));
                    final char c3 = c2 == true ? 1 : 0;
                    esaVar2.f("promotion_banner", "promotion_banner", new tc3(-1002925074, new ct8() { // from class: dre
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ct8
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            int i15 = c3;
                            a99 a99Var = nf3.a;
                            utc utcVar = utc.a;
                            final hre hreVar2 = hreVar;
                            final Function1 function12 = function1;
                            final int i16 = 1;
                            Object[] objArr = 0;
                            switch (i15) {
                                case 0:
                                    xpa xpaVar = (xpa) obj11;
                                    of3 of3Var = (of3) obj12;
                                    int intValue = ((Integer) obj13).intValue();
                                    xpaVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
                                    }
                                    av8 av8Var = (av8) of3Var;
                                    if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                                        String v = oea.v(R.string.fantasy_learn_how_to_play, av8Var);
                                        xtc f0 = l98.f0(xpa.a(xpaVar, utcVar, 7), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        boolean g = av8Var.g(function12) | av8Var.g(hreVar2);
                                        Object O = av8Var.O();
                                        if (g || O == a99Var) {
                                            O = new Function0() { // from class: cre
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = i16;
                                                    hre hreVar3 = hreVar2;
                                                    Function1 function13 = function12;
                                                    switch (i17) {
                                                        case 0:
                                                            tn6 tn6Var2 = hreVar3.b;
                                                            function13.invoke(new wqe(tn6Var2 != null ? tn6Var2.d : 0));
                                                            return Unit.a;
                                                        default:
                                                            tn6 tn6Var3 = hreVar3.b;
                                                            Integer valueOf = tn6Var3 != null ? Integer.valueOf(tn6Var3.a) : null;
                                                            if (valueOf != null) {
                                                                function13.invoke(new xqe(valueOf.intValue()));
                                                                return Unit.a;
                                                            }
                                                            a70.r("Required value was null.");
                                                            return null;
                                                    }
                                                }
                                            };
                                            av8Var.n0(O);
                                        }
                                        x2a.d(v, f0, null, 0L, 0L, 0L, (Function0) O, l98.d, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, av8Var, 12582912, 0, 1852);
                                    } else {
                                        av8Var.W();
                                    }
                                    break;
                                default:
                                    xpa xpaVar2 = (xpa) obj11;
                                    of3 of3Var2 = (of3) obj12;
                                    int intValue2 = ((Integer) obj13).intValue();
                                    xpaVar2.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((av8) of3Var2).g(xpaVar2) ? 4 : 2;
                                    }
                                    av8 av8Var2 = (av8) of3Var2;
                                    if (av8Var2.T(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        xtc f02 = l98.f0(xpa.a(xpaVar2, utcVar, 7), 8.0f, 8.0f, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                                        boolean g2 = av8Var2.g(function12) | av8Var2.g(hreVar2);
                                        Object O2 = av8Var2.O();
                                        if (g2 || O2 == a99Var) {
                                            final int objArr2 = objArr == true ? 1 : 0;
                                            O2 = new Function0() { // from class: cre
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i17 = objArr2;
                                                    hre hreVar3 = hreVar2;
                                                    Function1 function13 = function12;
                                                    switch (i17) {
                                                        case 0:
                                                            tn6 tn6Var2 = hreVar3.b;
                                                            function13.invoke(new wqe(tn6Var2 != null ? tn6Var2.d : 0));
                                                            return Unit.a;
                                                        default:
                                                            tn6 tn6Var3 = hreVar3.b;
                                                            Integer valueOf = tn6Var3 != null ? Integer.valueOf(tn6Var3.a) : null;
                                                            if (valueOf != null) {
                                                                function13.invoke(new xqe(valueOf.intValue()));
                                                                return Unit.a;
                                                            }
                                                            a70.r("Required value was null.");
                                                            return null;
                                                    }
                                                }
                                            };
                                            av8Var2.n0(O2);
                                        }
                                        pco.k(3072, av8Var2, f02, (Function0) O2, false);
                                    } else {
                                        av8Var2.W();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true));
                }
                return Unit.a;
            case 7:
                m93 m93Var = (m93) obj5;
                pyg pygVar = (pyg) obj4;
                ComparisonSeasonInfo comparisonSeasonInfo = (ComparisonSeasonInfo) obj3;
                y83 y83Var = (y83) obj2;
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                Integer num = m93Var != null ? m93Var.a : null;
                pygVar.getClass();
                boolean z = comparisonSeasonInfo instanceof ComparisonSeasonInfo.TennisYearInfo;
                if (z) {
                    m9kVar = new q9k(R.string.all);
                } else {
                    if (y83Var == null) {
                        r9kVar = null;
                        gv9 t = pygVar.t(comparisonSeasonInfo, y83Var, m93Var == null ? m93Var.c : null);
                        if (!z) {
                            str = ((ComparisonSeasonInfo.TennisYearInfo) comparisonSeasonInfo).a;
                        } else {
                            if (!(comparisonSeasonInfo instanceof ComparisonSeasonInfo.UniqueTournamentSeasonInfo)) {
                                zzl.b();
                                return null;
                            }
                            str = ((ComparisonSeasonInfo.UniqueTournamentSeasonInfo) comparisonSeasonInfo).c;
                        }
                        return i73.a(i73Var, num, r9kVar, z, t, str, 15);
                    }
                    m9kVar = new m9k(y83Var.d);
                }
                r9kVar = m9kVar;
                gv9 t2 = pygVar.t(comparisonSeasonInfo, y83Var, m93Var == null ? m93Var.c : null);
                if (!z) {
                }
                return i73.a(i73Var, num, r9kVar, z, t2, str, 15);
            case 8:
                f49 f49Var = (f49) obj5;
                esa esaVar3 = (esa) obj;
                esaVar3.getClass();
                gv9 gv9Var4 = f49Var.m;
                esaVar3.a(gv9Var4.size(), null, new dyg(gv9Var4, 1), new tc3(2039820996, new o7d(gv9Var4, (wla) obj4, (Context) obj3, (ct8) obj2, f49Var, 1), true));
                return Unit.a;
            case 9:
                f6i f6iVar = (f6i) obj5;
                gv9 gv9Var5 = (gv9) obj4;
                old oldVar = (old) obj3;
                Context context4 = (Context) obj2;
                esa esaVar4 = (esa) obj;
                esaVar4.getClass();
                w5i w5iVar = f6iVar.f;
                if (w5iVar == w5i.d) {
                    esa.d(esaVar4, null, null, o1j.b, 3);
                } else if (w5iVar == w5i.e) {
                    esa.d(esaVar4, null, null, o1j.c, 3);
                }
                if (Intrinsics.c(Boolean.valueOf(f6iVar.d.c), Boolean.TRUE)) {
                    esa.d(esaVar4, null, null, new tc3(-1635321292, new e6i(oldVar, f6iVar), true), 3);
                }
                int i15 = 7;
                esa.e(esaVar4, gv9Var5.size(), new uo(i15, gv9Var5), null, new tc3(-1408733667, new rsh(i5, gv9Var5, f6iVar), true), 4);
                esa.d(esaVar4, null, null, new tc3(1641626822, new yya(i4, context4, f6iVar), true), 3);
                w5i w5iVar2 = f6iVar.f;
                if (w5iVar2 == w5i.h) {
                    esa.d(esaVar4, null, null, new tc3(125895379, new tu5(context4, i15), true), 3);
                } else if (w5iVar2 == w5i.g) {
                    esa.d(esaVar4, null, null, o1j.d, 3);
                }
                return Unit.a;
            case 10:
                n29 n29Var = (n29) obj5;
                ku3 ku3Var = (ku3) obj4;
                e1d e1dVar3 = (e1d) obj2;
                yma ymaVar = (yma) obj;
                ymaVar.getClass();
                if (((Boolean) ((e1d) obj3).getValue()).booleanValue()) {
                    ha5.s0(ymaVar, n29Var, new da5(ymaVar, 3));
                    xw3.L(ku3Var, null, null, new d27(n29Var, e1dVar3, rq3Var, i7), 3);
                }
                return Unit.a;
            case 11:
                Serializable serializable = (Serializable) obj;
                serializable.getClass();
                l3j.c(serializable, ((ynj) obj5).a, (ksa) obj4, (Context) obj3, (ku3) obj2);
                return Unit.a;
            case 12:
                Function0 function0 = (Function0) obj4;
                lcj lcjVar = (lcj) obj3;
                gfj gfjVar = (gfj) obj2;
                r8j r8jVar = (r8j) obj;
                ((Function0) obj5).invoke();
                if (function0 != null ? ((Boolean) function0.invoke()).booleanValue() : true) {
                    r8jVar.close();
                }
                lcjVar.x(gfjVar);
                return Unit.a;
            case 13:
                esa esaVar5 = (esa) obj;
                esaVar5.getClass();
                esa.e(esaVar5, Integer.MAX_VALUE, null, null, new tc3(646247518, new nlj((xtc) obj5, (dfj) obj4, (List) obj3, (znh) obj2, 8), true), 6);
                return Unit.a;
            case 14:
                yma ymaVar2 = (yma) obj;
                ymaVar2.getClass();
                b20 b20Var = ((cxd) ((voi) obj5).a(ymaVar2.a.n(), ymaVar2.getLayoutDirection(), (kx4) obj4)).g;
                ha5.D(ymaVar2, b20Var, (pvh) obj3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 60);
                ha5.D(ymaVar2, b20Var, (v7b) obj2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(ymaVar2.H0(2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), 0, 52);
                ymaVar2.a();
                return Unit.a;
            case 15:
                String str3 = (String) obj5;
                e1d e1dVar4 = (e1d) obj3;
                e1d e1dVar5 = (e1d) obj2;
                aej aejVar = (aej) obj;
                aejVar.getClass();
                if (((Boolean) ((e1d) obj4).getValue()).booleanValue() || !aejVar.d()) {
                    return Unit.a;
                }
                e1dVar4.setValue(Boolean.TRUE);
                if (((Integer) e1dVar5.getValue()) == null) {
                    int c4 = (aejVar.b.c(1, true) - str3.length()) - 2;
                    if (c4 >= 0) {
                        b = c4;
                    }
                } else {
                    Integer num2 = (Integer) e1dVar5.getValue();
                    int intValue = (num2 != null ? num2.intValue() : 0) - 4;
                    if (intValue >= 0) {
                        b = intValue;
                    }
                }
                Integer num3 = (Integer) e1dVar5.getValue();
                if ((num3 == null || b != num3.intValue()) && b > 0) {
                    e1dVar5.setValue(Integer.valueOf(b));
                }
                return Unit.a;
            case 16:
                Context context5 = (Context) obj5;
                qkl qklVar = (qkl) obj4;
                znh znhVar = (znh) obj3;
                znh znhVar2 = (znh) obj2;
                pel pelVar = (pel) obj;
                pelVar.getClass();
                if (pelVar.equals(nel.a)) {
                    WorldCupTeamPickerBottomSheet worldCupTeamPickerBottomSheet = new WorldCupTeamPickerBottomSheet();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("is_retarget", true);
                    worldCupTeamPickerBottomSheet.setArguments(bundle);
                    context5.getClass();
                    if (context5 instanceof csk) {
                        context5 = ((csk) context5).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity = context5 instanceof AppCompatActivity ? (AppCompatActivity) context5 : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(worldCupTeamPickerBottomSheet, appCompatActivity, rq3Var, i8));
                    }
                } else if (pelVar.equals(jel.a)) {
                    WorldCupTeamPickerBottomSheet worldCupTeamPickerBottomSheet2 = new WorldCupTeamPickerBottomSheet();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("is_retarget", false);
                    worldCupTeamPickerBottomSheet2.setArguments(bundle2);
                    context5.getClass();
                    if (context5 instanceof csk) {
                        context5 = ((csk) context5).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity2 = context5 instanceof AppCompatActivity ? (AppCompatActivity) context5 : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(worldCupTeamPickerBottomSheet2, appCompatActivity2, rq3Var, i8));
                    }
                } else if (pelVar.equals(oel.a)) {
                    WorldCupTotrChatBottomSheet worldCupTotrChatBottomSheet = new WorldCupTotrChatBottomSheet();
                    context5.getClass();
                    if (context5 instanceof csk) {
                        context5 = ((csk) context5).getBaseContext();
                    }
                    AppCompatActivity appCompatActivity3 = context5 instanceof AppCompatActivity ? (AppCompatActivity) context5 : null;
                    if (appCompatActivity3 != null) {
                        wca.x(appCompatActivity3.getLifecycle()).b(new r1(worldCupTotrChatBottomSheet, appCompatActivity3, rq3Var, i8));
                    }
                } else if (pelVar.equals(mel.a)) {
                    qklVar.getClass();
                    context5.getClass();
                    qklVar.x.getClass();
                    kgl.e(context5);
                } else if (pelVar.equals(kel.a)) {
                    znhVar.i(znhVar.h() + 1);
                } else {
                    if (!pelVar.equals(lel.a)) {
                        zzl.b();
                        return null;
                    }
                    znhVar2.i(znhVar2.h() + 1);
                }
                return Unit.a;
            default:
                String str4 = (String) obj5;
                Function1 function12 = (Function1) obj4;
                mvh mvhVar = (mvh) obj3;
                wd8 wd8Var = (wd8) obj2;
                ((hja) obj).getClass();
                if (!StringsKt.R(str4)) {
                    function12.invoke(str4);
                    if (mvhVar != null) {
                        ((lw4) mvhVar).a();
                    }
                    wd8.a(wd8Var);
                }
                return Unit.a;
        }
    }
}
