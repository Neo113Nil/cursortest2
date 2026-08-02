package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.results.main.matches.redesign.MatchesRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class eyb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MatchesRootFragment b;

    public /* synthetic */ eyb(MatchesRootFragment matchesRootFragment, int i) {
        this.a = i;
        this.b = matchesRootFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SharedPreferences d;
        int i = this.a;
        int i2 = 2;
        MatchesRootFragment matchesRootFragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                ((Integer) obj2).getClass();
                str.getClass();
                matchesRootFragment.A().u.j(str);
                if (str.equals("competitions")) {
                    Context requireContext = matchesRootFragment.requireContext();
                    requireContext.getClass();
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = requireContext.getApplicationContext();
                        synchronized (uic.i) {
                            d = a5f.d(applicationContext);
                            uic.j = d;
                        }
                        d.getClass();
                        sharedPreferences = d;
                    }
                    SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "PREF_SHOW_LEAGUES_TOOLTIP", false);
                    Unit unit = Unit.a;
                    i3.apply();
                    krk krkVar = matchesRootFragment.l;
                    krkVar.getClass();
                    ((to8) krkVar).e.setVisibility(8);
                }
                return Unit.a;
            case 1:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1662028642, av8Var, new eyb(matchesRootFragment, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    zqb A = matchesRootFragment.A();
                    boolean i4 = av8Var2.i(matchesRootFragment);
                    Object O = av8Var2.O();
                    if (i4 || O == nf3.a) {
                        O = new ida(matchesRootFragment, 23);
                        av8Var2.n0(O);
                    }
                    jzh.e(A, (Function1) O, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                return Unit.a;
        }
    }
}
