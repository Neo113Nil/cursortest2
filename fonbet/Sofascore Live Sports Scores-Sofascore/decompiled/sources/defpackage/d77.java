package defpackage;

import android.content.Context;
import com.sofascore.results.fantasy.competition.managerprofile.FantasyManagerProfileActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class d77 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyManagerProfileActivity b;

    public /* synthetic */ d77(FantasyManagerProfileActivity fantasyManagerProfileActivity, int i) {
        this.a = i;
        this.b = fantasyManagerProfileActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 1;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = FantasyManagerProfileActivity.N;
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(482468773, av8Var, new d77(this.b, i)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = FantasyManagerProfileActivity.N;
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Context context = (Context) av8Var2.k(nz.b);
                    FantasyManagerProfileActivity fantasyManagerProfileActivity = this.b;
                    r77 R = fantasyManagerProfileActivity.R();
                    g9a g9aVar = (g9a) fantasyManagerProfileActivity.M.getValue();
                    boolean i4 = av8Var2.i(fantasyManagerProfileActivity);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i4 || O == a99Var) {
                        av6 av6Var = new av6(0, fantasyManagerProfileActivity, FantasyManagerProfileActivity.class, "showInterstitialAd", "showInterstitialAd()V", 0, 12);
                        av8Var2.n0(av6Var);
                        O = av6Var;
                    }
                    Function0 function0 = (Function0) ((KFunction) O);
                    boolean i5 = av8Var2.i(fantasyManagerProfileActivity);
                    Object O2 = av8Var2.O();
                    if (i5 || O2 == a99Var) {
                        O2 = new x16(fantasyManagerProfileActivity, 16);
                        av8Var2.n0(O2);
                    }
                    Function1 function1 = (Function1) O2;
                    boolean i6 = av8Var2.i(context) | av8Var2.i(fantasyManagerProfileActivity);
                    Object O3 = av8Var2.O();
                    if (i6 || O3 == a99Var) {
                        O3 = new w47(3, (Object) context, (Object) fantasyManagerProfileActivity);
                        av8Var2.n0(O3);
                    }
                    m77.d(R, g9aVar, function0, function1, (Function1) O3, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
