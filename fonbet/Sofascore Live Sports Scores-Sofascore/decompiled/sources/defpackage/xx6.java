package defpackage;

import com.sofascore.results.fantasy.finished.FantasyFinishedCompetitionsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xx6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FantasyFinishedCompetitionsActivity b;

    public /* synthetic */ xx6(FantasyFinishedCompetitionsActivity fantasyFinishedCompetitionsActivity, int i) {
        this.a = i;
        this.b = fantasyFinishedCompetitionsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FantasyFinishedCompetitionsActivity fantasyFinishedCompetitionsActivity = this.b;
        switch (i) {
            case 0:
                return fantasyFinishedCompetitionsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fantasyFinishedCompetitionsActivity.getViewModelStore();
            default:
                return fantasyFinishedCompetitionsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
