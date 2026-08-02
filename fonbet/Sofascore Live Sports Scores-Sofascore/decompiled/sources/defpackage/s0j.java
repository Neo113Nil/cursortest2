package defpackage;

import com.sofascore.results.team.statistics.TeamSeasonStatisticsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s0j extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ TeamSeasonStatisticsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0j(TeamSeasonStatisticsFragment teamSeasonStatisticsFragment, int i) {
        super(0);
        this.i = i;
        this.j = teamSeasonStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        TeamSeasonStatisticsFragment teamSeasonStatisticsFragment = this.j;
        switch (i) {
            case 0:
                return teamSeasonStatisticsFragment.requireActivity().getViewModelStore();
            case 1:
                return teamSeasonStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return teamSeasonStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return teamSeasonStatisticsFragment;
        }
    }
}
