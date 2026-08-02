package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fre implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ FantasyPlayerFixtureUiModel c;
    public final /* synthetic */ hre d;

    public /* synthetic */ fre(Function1 function1, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, hre hreVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = fantasyPlayerFixtureUiModel;
        this.d = hreVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        hre hreVar = this.d;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                tn6 tn6Var = hreVar.b;
                Integer valueOf = tn6Var != null ? Integer.valueOf(tn6Var.a) : null;
                if (valueOf == null) {
                    a70.r("Required value was null.");
                    break;
                } else {
                    function1.invoke(new vqe(fantasyPlayerFixtureUiModel, valueOf.intValue()));
                    break;
                }
            default:
                tn6 tn6Var2 = hreVar.b;
                Integer valueOf2 = tn6Var2 != null ? Integer.valueOf(tn6Var2.a) : null;
                if (valueOf2 == null) {
                    a70.r("Required value was null.");
                    break;
                } else {
                    function1.invoke(new vqe(fantasyPlayerFixtureUiModel, valueOf2.intValue()));
                    break;
                }
        }
        return null;
    }
}
