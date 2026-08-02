package defpackage;

import com.sofascore.results.fantasy.comparison.FantasyPlayerComparisonActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mc7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyPlayerComparisonActivity b;

    public /* synthetic */ mc7(FantasyPlayerComparisonActivity fantasyPlayerComparisonActivity, int i) {
        this.a = i;
        this.b = fantasyPlayerComparisonActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyPlayerComparisonActivity fantasyPlayerComparisonActivity = this.b;
        switch (i) {
            case 0:
                return fantasyPlayerComparisonActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyPlayerComparisonActivity.getViewModelStore();
            default:
                return fantasyPlayerComparisonActivity.getDefaultViewModelCreationExtras();
        }
    }
}
