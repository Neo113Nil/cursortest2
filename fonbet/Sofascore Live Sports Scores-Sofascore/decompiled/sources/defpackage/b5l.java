package defpackage;

import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b5l implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyPredictionsActivity b;

    public /* synthetic */ b5l(WeeklyPredictionsActivity weeklyPredictionsActivity, int i) {
        this.a = i;
        this.b = weeklyPredictionsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        WeeklyPredictionsActivity weeklyPredictionsActivity = this.b;
        switch (i) {
            case 0:
                return weeklyPredictionsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return weeklyPredictionsActivity.getViewModelStore();
            default:
                return weeklyPredictionsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
