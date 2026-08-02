package defpackage;

import com.sofascore.results.player.statistics.regular.PlayerSeasonStatisticsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hwe extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ PlayerSeasonStatisticsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hwe(PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment, int i) {
        super(0);
        this.i = i;
        this.j = playerSeasonStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        PlayerSeasonStatisticsFragment playerSeasonStatisticsFragment = this.j;
        switch (i) {
            case 0:
                return playerSeasonStatisticsFragment.requireActivity().getViewModelStore();
            case 1:
                return playerSeasonStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return playerSeasonStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return playerSeasonStatisticsFragment.requireActivity().getViewModelStore();
            case 4:
                return playerSeasonStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return playerSeasonStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return playerSeasonStatisticsFragment;
        }
    }
}
