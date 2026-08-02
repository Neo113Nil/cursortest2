package defpackage;

import com.sofascore.results.weeklyChallenge.leaderboard.PreviousWeeklyLeaderboardFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t6f extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ PreviousWeeklyLeaderboardFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6f(PreviousWeeklyLeaderboardFragment previousWeeklyLeaderboardFragment, int i) {
        super(0);
        this.i = i;
        this.j = previousWeeklyLeaderboardFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        PreviousWeeklyLeaderboardFragment previousWeeklyLeaderboardFragment = this.j;
        switch (i) {
            case 0:
                return previousWeeklyLeaderboardFragment.requireActivity().getViewModelStore();
            case 1:
                return previousWeeklyLeaderboardFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return previousWeeklyLeaderboardFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
