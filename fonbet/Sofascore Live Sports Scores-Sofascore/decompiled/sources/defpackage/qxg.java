package defpackage;

import com.sofascore.results.player.statistics.compare.SeasonComparisonActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qxg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SeasonComparisonActivity b;

    public /* synthetic */ qxg(SeasonComparisonActivity seasonComparisonActivity, int i) {
        this.a = i;
        this.b = seasonComparisonActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        SeasonComparisonActivity seasonComparisonActivity = this.b;
        switch (i) {
            case 0:
                return seasonComparisonActivity.getDefaultViewModelProviderFactory();
            case 1:
                return seasonComparisonActivity.getViewModelStore();
            default:
                return seasonComparisonActivity.getDefaultViewModelCreationExtras();
        }
    }
}
