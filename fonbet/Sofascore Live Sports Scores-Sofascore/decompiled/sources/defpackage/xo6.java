package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xo6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ xo6(Function1 function1, Function0 function0, int i) {
        this.a = i;
        this.b = function1;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function0 function0 = this.c;
        Function1 function1 = this.b;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = (FantasyRoundPlayerUiModel) obj;
        switch (i) {
            case 0:
                fantasyRoundPlayerUiModel.getClass();
                function1.invoke(fantasyRoundPlayerUiModel);
                function0.invoke();
                break;
            default:
                fantasyRoundPlayerUiModel.getClass();
                function1.invoke(fantasyRoundPlayerUiModel);
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
