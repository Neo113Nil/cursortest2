package ru.ozon.app.android.favorites.wishlistMultiselect.di;

import At.C2445a;
import GZ.g;
import Pc.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.common.SelectedProductsManager;
import ru.ozon.app.android.favorites.domain.eventmanager.FavoriteEventManager;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate.SelectedProductsManagerVmWrapper;
import ru.ozon.app.android.favorites.domain.wishlistManager.WishlistEventManager;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001c2\u00060\u0001j\u0002`\u0002:\u0001\u001cR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/di/WishlistMultiselectWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "getSelectedProductsManager", "()Lru/ozon/app/android/favorites/common/SelectedProductsManager;", "selectedProductsManager", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "getFavListInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favListInteractor", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "getFavoriteEventManager", "()Lru/ozon/app/android/favorites/domain/eventmanager/FavoriteEventManager;", "favoriteEventManager", "LPc/a;", "Lru/ozon/app/android/favorites/domain/favoritesv2/selectedstate/SelectedProductsManagerVmWrapper;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "getWishlistEventManager", "()Lru/ozon/app/android/favorites/domain/wishlistManager/WishlistEventManager;", "wishlistEventManager", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WishlistMultiselectWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/wishlistMultiselect/di/WishlistMultiselectWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/favorites/wishlistMultiselect/di/WishlistMultiselectWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final WishlistMultiselectWidgetComponent create$lambda$0(C7475g c7475g) {
            return new WishlistMultiselectWidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<WishlistMultiselectWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(WishlistMultiselectWidgetComponent.class), new C2445a(storage, 0));
        }
    }

    @NotNull
    FavoritesListsInteractor getFavListInteractor();

    @NotNull
    FavoriteEventManager getFavoriteEventManager();

    @NotNull
    g getRouter();

    @NotNull
    SelectedProductsManager getSelectedProductsManager();

    @NotNull
    a<SelectedProductsManagerVmWrapper> getViewModelProvider();

    @NotNull
    WishlistEventManager getWishlistEventManager();
}
