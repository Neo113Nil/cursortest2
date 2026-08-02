package defpackage;

import com.sofascore.results.main.matches.redesign.livematches.LiveMatchesFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class seb extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ LiveMatchesFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seb(LiveMatchesFragment liveMatchesFragment, int i) {
        super(0);
        this.i = i;
        this.j = liveMatchesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        LiveMatchesFragment liveMatchesFragment = this.j;
        switch (i) {
            case 0:
                return liveMatchesFragment.requireActivity().getViewModelStore();
            case 1:
                return liveMatchesFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return liveMatchesFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return liveMatchesFragment;
        }
    }
}
