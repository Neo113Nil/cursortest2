package defpackage;

import com.sofascore.results.league.LeagueActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mta implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LeagueActivity b;

    public /* synthetic */ mta(LeagueActivity leagueActivity, int i) {
        this.a = i;
        this.b = leagueActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LeagueActivity leagueActivity = this.b;
        switch (i) {
            case 0:
                return leagueActivity.getDefaultViewModelProviderFactory();
            case 1:
                return leagueActivity.getViewModelStore();
            case 2:
                return leagueActivity.getDefaultViewModelCreationExtras();
            case 3:
                return leagueActivity.getDefaultViewModelProviderFactory();
            case 4:
                return leagueActivity.getViewModelStore();
            case 5:
                return leagueActivity.getDefaultViewModelCreationExtras();
            case 6:
                return leagueActivity.getDefaultViewModelProviderFactory();
            case 7:
                return leagueActivity.getViewModelStore();
            case 8:
                return leagueActivity.getDefaultViewModelCreationExtras();
            case 9:
                return leagueActivity.getDefaultViewModelProviderFactory();
            case 10:
                return leagueActivity.getViewModelStore();
            default:
                return leagueActivity.getDefaultViewModelCreationExtras();
        }
    }
}
