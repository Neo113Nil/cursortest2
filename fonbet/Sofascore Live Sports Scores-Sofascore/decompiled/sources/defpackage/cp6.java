package defpackage;

import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cp6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyCompetitionActivity b;

    public /* synthetic */ cp6(FantasyCompetitionActivity fantasyCompetitionActivity, int i) {
        this.a = i;
        this.b = fantasyCompetitionActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyCompetitionActivity fantasyCompetitionActivity = this.b;
        switch (i) {
            case 0:
                return fantasyCompetitionActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyCompetitionActivity.getViewModelStore();
            case 2:
                return fantasyCompetitionActivity.getDefaultViewModelCreationExtras();
            case 3:
                return fantasyCompetitionActivity.getDefaultViewModelProviderFactory();
            case 4:
                return fantasyCompetitionActivity.getViewModelStore();
            default:
                return fantasyCompetitionActivity.getDefaultViewModelCreationExtras();
        }
    }
}
