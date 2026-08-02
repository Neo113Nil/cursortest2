package defpackage;

import com.sofascore.results.player.statistics.career.PlayerCareerStatisticsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hme extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ PlayerCareerStatisticsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hme(PlayerCareerStatisticsFragment playerCareerStatisticsFragment, int i) {
        super(0);
        this.i = i;
        this.j = playerCareerStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        PlayerCareerStatisticsFragment playerCareerStatisticsFragment = this.j;
        switch (i) {
            case 0:
                return playerCareerStatisticsFragment.requireActivity().getViewModelStore();
            case 1:
                return playerCareerStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return playerCareerStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return playerCareerStatisticsFragment.requireActivity().getViewModelStore();
            case 4:
                return playerCareerStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return playerCareerStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return playerCareerStatisticsFragment.requireActivity().getViewModelStore();
            case 7:
                return playerCareerStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return playerCareerStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
