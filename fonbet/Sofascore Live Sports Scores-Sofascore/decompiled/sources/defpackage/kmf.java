package defpackage;

import com.sofascore.results.ranking.RankingsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kmf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ RankingsActivity b;

    public /* synthetic */ kmf(RankingsActivity rankingsActivity, int i) {
        this.a = i;
        this.b = rankingsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        RankingsActivity rankingsActivity = this.b;
        switch (i) {
            case 0:
                return rankingsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return rankingsActivity.getViewModelStore();
            default:
                return rankingsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
