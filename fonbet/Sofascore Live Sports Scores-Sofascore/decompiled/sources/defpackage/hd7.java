package defpackage;

import com.sofascore.results.fantasy.ui.model.FantasyPlayerFixtureUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hd7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boh b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ FantasyPlayerFixtureUiModel d;

    public /* synthetic */ hd7(boh bohVar, Function1 function1, FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel, int i) {
        this.a = i;
        this.b = bohVar;
        this.c = function1;
        this.d = fantasyPlayerFixtureUiModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyPlayerFixtureUiModel fantasyPlayerFixtureUiModel = this.d;
        Function1 function1 = this.c;
        boh bohVar = this.b;
        switch (i) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis);
                    function1.invoke(Integer.valueOf(fantasyPlayerFixtureUiModel.a));
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - bohVar.h() >= 200) {
                    bohVar.i(currentTimeMillis2);
                    function1.invoke(Integer.valueOf(fantasyPlayerFixtureUiModel.a));
                }
                break;
        }
        return Unit.a;
    }
}
