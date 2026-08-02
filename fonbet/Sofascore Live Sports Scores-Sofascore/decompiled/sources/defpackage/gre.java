package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class gre implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ hre f;

    public gre(List list, List list2, int i, ArrayList arrayList, Function1 function1, hre hreVar) {
        this.a = list;
        this.b = list2;
        this.c = i;
        this.d = arrayList;
        this.e = function1;
        this.f = hreVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        jf9 jf9Var = oyn.e;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = (FantasyPlayerFixtureUiModel) this.a.get(intValue);
            av8Var.d0(-1058497992);
            int size = this.b.size() - 1;
            utc utcVar = utc.a;
            Object obj5 = nf3.a;
            Function1 function1 = this.e;
            hre hreVar = this.f;
            if (intValue == size) {
                ArrayList arrayList = this.d;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i2 = -1;
                        break;
                    }
                    if (!((Collection) ((Pair) listIterator.previous()).b).isEmpty()) {
                        i2 = listIterator.nextIndex();
                        break;
                    }
                }
                if (this.c == i2) {
                    av8Var.d0(-1058432242);
                    xtc f0 = l98.f0(n9e.q(wnn.A(l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3)), lz.D(R.color.surface_1, av8Var), jf9Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
                    k1c c = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, f0);
                    if3.k7.getClass();
                    Function0 function0 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(function0);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    FantasyCompetitionType fantasyCompetitionType = FantasyCompetitionType.SEASON;
                    boolean g = av8Var.g(function1) | av8Var.g(fantasyPlayerFixtureUiModel) | av8Var.g(hreVar);
                    Object O = av8Var.O();
                    if (g || O == obj5) {
                        O = new fre(function1, fantasyPlayerFixtureUiModel, hreVar, 0);
                        av8Var.n0(O);
                    }
                    qx9.g(fantasyPlayerFixtureUiModel, fantasyCompetitionType, (Function0) O, hreVar.h, null, av8Var, 48, 16);
                    av8Var.s(true);
                    av8Var.s(false);
                    av8Var.s(false);
                }
            }
            av8Var.d0(-1057388038);
            FantasyCompetitionType fantasyCompetitionType2 = FantasyCompetitionType.SEASON;
            boolean g2 = av8Var.g(function1) | av8Var.g(fantasyPlayerFixtureUiModel) | av8Var.g(hreVar);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj5) {
                O2 = new fre(function1, fantasyPlayerFixtureUiModel, hreVar, 1);
                av8Var.n0(O2);
            }
            qx9.g(fantasyPlayerFixtureUiModel, fantasyCompetitionType2, (Function0) O2, hreVar.h, n9e.q(l98.d0(xpa.a(xpaVar, utcVar, 7), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(R.color.surface_1, av8Var), jf9Var), av8Var, 48, 0);
            av8Var.s(false);
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
