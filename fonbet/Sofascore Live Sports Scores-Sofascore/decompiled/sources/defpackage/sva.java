package defpackage;

import com.sofascore.results.league.fragment.draft.LeagueDraftFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sva extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LeagueDraftFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sva(LeagueDraftFragment leagueDraftFragment, int i) {
        super(0);
        this.i = i;
        this.j = leagueDraftFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LeagueDraftFragment leagueDraftFragment = this.j;
        switch (i) {
            case 0:
                return leagueDraftFragment.requireActivity().getViewModelStore();
            case 1:
                return leagueDraftFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return leagueDraftFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return leagueDraftFragment;
        }
    }
}
