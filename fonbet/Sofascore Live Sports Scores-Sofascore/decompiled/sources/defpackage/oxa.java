package defpackage;

import com.sofascore.results.league.historical.LeagueHistoricalDataActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oxa implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueHistoricalDataActivity b;

    public /* synthetic */ oxa(LeagueHistoricalDataActivity leagueHistoricalDataActivity, int i) {
        this.a = i;
        this.b = leagueHistoricalDataActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LeagueHistoricalDataActivity leagueHistoricalDataActivity = this.b;
        switch (i) {
            case 0:
                return leagueHistoricalDataActivity.getDefaultViewModelProviderFactory();
            case 1:
                return leagueHistoricalDataActivity.getViewModelStore();
            default:
                return leagueHistoricalDataActivity.getDefaultViewModelCreationExtras();
        }
    }
}
