package defpackage;

import com.sofascore.results.feed.FeedFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hx7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FeedFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hx7(FeedFragment feedFragment, int i) {
        super(0);
        this.i = i;
        this.j = feedFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FeedFragment feedFragment = this.j;
        switch (i) {
            case 0:
                return feedFragment.requireActivity().getViewModelStore();
            case 1:
                return feedFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return feedFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 3:
                return feedFragment.requireActivity().getViewModelStore();
            case 4:
                return feedFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 5:
                return feedFragment.requireActivity().getDefaultViewModelProviderFactory();
            case 6:
                return feedFragment.requireActivity().getViewModelStore();
            case 7:
                return feedFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 8:
                return feedFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return feedFragment;
        }
    }
}
