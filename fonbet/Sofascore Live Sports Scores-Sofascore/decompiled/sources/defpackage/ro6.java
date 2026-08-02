package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.fantasy.comparison.selectplayer.FantasyComparisonPlayersDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ro6 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyComparisonPlayersDialogFragment b;
    public final /* synthetic */ ComposeView c;

    public /* synthetic */ ro6(FantasyComparisonPlayersDialogFragment fantasyComparisonPlayersDialogFragment, ComposeView composeView, int i) {
        this.a = i;
        this.b = fantasyComparisonPlayersDialogFragment;
        this.c = composeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ComposeView composeView = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-528378133, av8Var, new ro6(this.b, composeView, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    FantasyComparisonPlayersDialogFragment fantasyComparisonPlayersDialogFragment = this.b;
                    gk7 gk7Var = (gk7) fantasyComparisonPlayersDialogFragment.B.getValue();
                    boolean z = ((yc7) fantasyComparisonPlayersDialogFragment.C.getValue()).h;
                    boolean i3 = av8Var2.i(fantasyComparisonPlayersDialogFragment);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (i3 || O == a99Var) {
                        ny nyVar = new ny(0, fantasyComparisonPlayersDialogFragment, FantasyComparisonPlayersDialogFragment.class, "dismiss", "dismiss()V", 0, 24);
                        av8Var2.n0(nyVar);
                        O = nyVar;
                    }
                    KFunction kFunction = (KFunction) O;
                    boolean i4 = av8Var2.i(fantasyComparisonPlayersDialogFragment);
                    Object O2 = av8Var2.O();
                    if (i4 || O2 == a99Var) {
                        O2 = new x16(fantasyComparisonPlayersDialogFragment, 5);
                        av8Var2.n0(O2);
                    }
                    Function1 function1 = (Function1) O2;
                    boolean i5 = av8Var2.i(composeView) | av8Var2.i(fantasyComparisonPlayersDialogFragment);
                    Object O3 = av8Var2.O();
                    if (i5 || O3 == a99Var) {
                        O3 = new xw5(22, composeView, fantasyComparisonPlayersDialogFragment);
                        av8Var2.n0(O3);
                    }
                    hkg.h(gk7Var, function1, (Function1) O3, (Function0) kFunction, z, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}
