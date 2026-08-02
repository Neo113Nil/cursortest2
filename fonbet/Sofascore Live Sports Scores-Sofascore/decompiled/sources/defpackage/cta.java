package defpackage;

import com.sofascore.results.weeklyChallenge.leaderboard.LeaderboardInfoModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cta extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeaderboardInfoModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cta(LeaderboardInfoModal leaderboardInfoModal, int i) {
        super(0);
        this.i = i;
        this.j = leaderboardInfoModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeaderboardInfoModal leaderboardInfoModal = this.j;
        switch (i) {
            case 0:
                return leaderboardInfoModal.requireActivity().getViewModelStore();
            case 1:
                return leaderboardInfoModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return leaderboardInfoModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
