package defpackage;

import com.sofascore.results.player.statistics.season.baseball.BaseballPlayerSeasonStatisticsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ga1 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ BaseballPlayerSeasonStatisticsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga1(BaseballPlayerSeasonStatisticsFragment baseballPlayerSeasonStatisticsFragment, int i) {
        super(0);
        this.i = i;
        this.j = baseballPlayerSeasonStatisticsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        BaseballPlayerSeasonStatisticsFragment baseballPlayerSeasonStatisticsFragment = this.j;
        switch (i) {
            case 0:
                return baseballPlayerSeasonStatisticsFragment.requireActivity().getViewModelStore();
            case 1:
                return baseballPlayerSeasonStatisticsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return baseballPlayerSeasonStatisticsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return baseballPlayerSeasonStatisticsFragment;
        }
    }
}
