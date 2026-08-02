package defpackage;

import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class h37 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyLeagueActivity b;

    public /* synthetic */ h37(FantasyLeagueActivity fantasyLeagueActivity, int i) {
        this.a = i;
        this.b = fantasyLeagueActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyLeagueActivity fantasyLeagueActivity = this.b;
        switch (i) {
            case 0:
                return fantasyLeagueActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyLeagueActivity.getViewModelStore();
            default:
                return fantasyLeagueActivity.getDefaultViewModelCreationExtras();
        }
    }
}
