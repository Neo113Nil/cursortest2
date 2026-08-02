package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class vt6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ hu6 c;

    public /* synthetic */ vt6(int i, hu6 hu6Var, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = hu6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        hu6 hu6Var = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    function1.invoke(new ns6(hu6Var.c.a.a));
                } else {
                    mj7 mj7Var = hu6Var.c.a;
                    function1.invoke(new rs6(mj7Var.a, mj7Var.c));
                }
                break;
            default:
                FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
                fantasyRoundPlayerUiModel.getClass();
                function1.invoke(new qs6(fantasyRoundPlayerUiModel, hu6Var.c));
                break;
        }
        return Unit.a;
    }
}
