package defpackage;

import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.fantasy.ui.model.BasicTournamentInfo;
import com.sofascore.results.fantasy.ui.model.FantasyPlayerUiModel;
import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rw6 implements Function2 {
    public final /* synthetic */ am3 a;
    public final /* synthetic */ qug b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ll3 d;
    public final /* synthetic */ xl3 e;
    public final /* synthetic */ View f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ FantasyRoundPlayerUiModel h;
    public final /* synthetic */ mei i;

    public rw6(am3 am3Var, qug qugVar, boolean z, ll3 ll3Var, xl3 xl3Var, View view, Function1 function1, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, mei meiVar) {
        this.a = am3Var;
        this.b = qugVar;
        this.c = z;
        this.d = ll3Var;
        this.e = xl3Var;
        this.f = view;
        this.g = function1;
        this.h = fantasyRoundPlayerUiModel;
        this.i = meiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            ng0 ng0Var = new ng0(8.0f, true, new l1(uxf.q, 5));
            lv1 lv1Var = uxf.m;
            av8Var.d0(2051241198);
            boolean z = this.c;
            utc utcVar = utc.a;
            xtc f0 = l98.f0(hkg.Z(utcVar, this.b, z, 12), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            xl3 xl3Var = this.e;
            boolean g = av8Var.g(xl3Var);
            Object O = av8Var.O();
            if (g || O == nf3.a) {
                O = new qw6(xl3Var, 1);
                av8Var.n0(O);
            }
            this.a.getClass();
            xtc b = am3.b(f0, this.d, (Function1) O);
            av8Var.s(false);
            l8g a = k8g.a(ng0Var, lv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = this.h;
            Float f = fantasyRoundPlayerUiModel.q;
            FantasyPlayerUiModel fantasyPlayerUiModel = fantasyRoundPlayerUiModel.g;
            String format = f != null ? String.format(dla.d(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f.floatValue())}, 1)) : "-";
            mei meiVar = mei.m;
            mei meiVar2 = this.i;
            ww9.p(0, meiVar2 == meiVar ? ljg.f(av8Var, 2027449740, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 2027450530, R.color.n_lv_3, av8Var, false), av8Var, null, format);
            tgj.j(fantasyRoundPlayerUiModel.C.f, bkh.p(utcVar, mei.n.e), av8Var, 48);
            xtc p = bkh.p(utcVar, mei.o.e);
            BasicTournamentInfo basicTournamentInfo = fantasyRoundPlayerUiModel.B;
            if (basicTournamentInfo == null || (str = basicTournamentInfo.b) == null) {
                str = "-";
            }
            tgj.b(384, av8Var, p, basicTournamentInfo != null ? Integer.valueOf(basicTournamentInfo.c) : null, str);
            Float f2 = fantasyPlayerUiModel.m;
            ww9.p(0, meiVar2 == mei.l ? ljg.f(av8Var, 2027474316, R.color.primary_default, av8Var, false) : ljg.f(av8Var, 2027475106, R.color.n_lv_3, av8Var, false), av8Var, null, f2 != null ? yid.q(f2.floatValue(), 1) : "-");
            tgj.l(fantasyPlayerUiModel.z != null ? Double.valueOf(r1.floatValue()) : null, bkh.p(utcVar, mei.p.e), av8Var, 48);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
