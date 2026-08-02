package defpackage;

import com.sofascore.results.league.fragment.topStats.TopStatsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hnj extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ TopStatsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hnj(TopStatsFragment topStatsFragment, int i) {
        super(0);
        this.i = i;
        this.j = topStatsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        TopStatsFragment topStatsFragment = this.j;
        switch (i) {
            case 0:
                return topStatsFragment.requireActivity().getViewModelStore();
            case 1:
                return topStatsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return topStatsFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return topStatsFragment.requireActivity().getViewModelStore();
            case 4:
                return topStatsFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return topStatsFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
