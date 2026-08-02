package defpackage;

import com.sofascore.results.R;
import com.sofascore.results.fantasy.league.settings.bottomsheet.edit.FantasyEditLeagueBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class zv6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyEditLeagueBottomSheet b;

    public /* synthetic */ zv6(FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet, int i) {
        this.a = i;
        this.b = fantasyEditLeagueBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = nf3.a;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(1 & intValue, (intValue & 3) != 2)) {
                    String v = oea.v(R.string.fantasy_edit_league_info, av8Var);
                    FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet = this.b;
                    boolean i2 = av8Var.i(fantasyEditLeagueBottomSheet);
                    Object O = av8Var.O();
                    if (i2 || O == obj3) {
                        O = new av6(0, fantasyEditLeagueBottomSheet, FantasyEditLeagueBottomSheet.class, "dismiss", "dismiss()V", 0, 2);
                        av8Var.n0(O);
                    }
                    tz9.n(v, (Function0) ((KFunction) O), null, av8Var, 0);
                } else {
                    av8Var.W();
                }
                break;
            default:
                FantasyEditLeagueBottomSheet fantasyEditLeagueBottomSheet2 = this.b;
                otk otkVar = fantasyEditLeagueBottomSheet2.B;
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c51 w = fantasyEditLeagueBottomSheet2.w();
                    qug o0 = hkg.o0(av8Var2);
                    Integer valueOf = Integer.valueOf(o0.a.h());
                    boolean g = av8Var2.g(w) | av8Var2.g(o0);
                    Object O2 = av8Var2.O();
                    if (g || O2 == obj3) {
                        O2 = new iv6(w, o0, null, 1);
                        av8Var2.n0(O2);
                    }
                    hz8.o(av8Var2, valueOf, (Function2) O2);
                    e1d x = rfo.x(((j37) fantasyEditLeagueBottomSheet2.C.getValue()).k, av8Var2, 0);
                    e1d x2 = rfo.x(((dw6) otkVar.getValue()).f, av8Var2, 0);
                    hof hofVar = ((dw6) otkVar.getValue()).h;
                    boolean i3 = av8Var2.i(fantasyEditLeagueBottomSheet2);
                    Object O3 = av8Var2.O();
                    if (i3 || O3 == obj3) {
                        O3 = new x16(fantasyEditLeagueBottomSheet2, 10);
                        av8Var2.n0(O3);
                    }
                    w1a.c(hofVar, null, (Function1) O3, av8Var2, 0, 14);
                    boolean z = ((cw6) x2.getValue()).a;
                    boolean i4 = av8Var2.i(fantasyEditLeagueBottomSheet2) | av8Var2.g(x);
                    Object O4 = av8Var2.O();
                    if (i4 || O4 == obj3) {
                        O4 = new ns4(26, fantasyEditLeagueBottomSheet2, x);
                        av8Var2.n0(O4);
                    }
                    Function2 function2 = (Function2) O4;
                    String str = ((j67) x.getValue()).b;
                    String str2 = ((j67) x.getValue()).c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    tgj.d(z, function2, str, str2, null, o0, Intrinsics.c(((dw6) otkVar.getValue()).d, Boolean.TRUE), av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
