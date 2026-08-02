package defpackage;

import com.sofascore.results.main.favorites.FavoriteEntitiesFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wq7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ FavoriteEntitiesFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wq7(FavoriteEntitiesFragment favoriteEntitiesFragment, int i) {
        super(0);
        this.i = i;
        this.j = favoriteEntitiesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        FavoriteEntitiesFragment favoriteEntitiesFragment = this.j;
        switch (i) {
            case 0:
                return favoriteEntitiesFragment.requireActivity().getViewModelStore();
            case 1:
                return favoriteEntitiesFragment.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return favoriteEntitiesFragment.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return favoriteEntitiesFragment;
        }
    }
}
