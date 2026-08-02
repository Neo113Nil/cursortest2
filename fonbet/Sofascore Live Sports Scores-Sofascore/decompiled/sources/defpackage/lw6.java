package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyRoundPlayerUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class lw6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ FantasyRoundPlayerUiModel c;

    public /* synthetic */ lw6(Function1 function1, FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel, int i) {
        this.a = i;
        this.b = function1;
        this.c = fantasyRoundPlayerUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyRoundPlayerUiModel fantasyRoundPlayerUiModel = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (function1 != null) {
                    function1.invoke(fantasyRoundPlayerUiModel);
                }
                break;
            case 1:
                if (function1 != null) {
                    function1.invoke(fantasyRoundPlayerUiModel);
                }
                break;
            case 2:
                if (function1 != null) {
                    function1.invoke(fantasyRoundPlayerUiModel);
                }
                break;
            case 3:
                function1.invoke(fantasyRoundPlayerUiModel);
                break;
            default:
                function1.invoke(fantasyRoundPlayerUiModel);
                break;
        }
        return Unit.a;
    }
}
