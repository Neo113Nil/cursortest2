package defpackage;

import com.sofascore.results.main.favorites.FavoriteEventsFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yr7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FavoriteEventsFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr7(FavoriteEventsFragment favoriteEventsFragment, int i) {
        super(0);
        this.i = i;
        this.j = favoriteEventsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FavoriteEventsFragment favoriteEventsFragment = this.j;
        switch (i) {
            case 0:
                return favoriteEventsFragment.requireActivity().getViewModelStore();
            case 1:
                return favoriteEventsFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return favoriteEventsFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return favoriteEventsFragment;
        }
    }
}
