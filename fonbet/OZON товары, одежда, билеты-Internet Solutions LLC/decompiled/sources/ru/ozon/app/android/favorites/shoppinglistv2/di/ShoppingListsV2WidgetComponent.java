package ru.ozon.app.android.favorites.shoppinglistv2.di;

import CN.a;
import GZ.g;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.ShoppingListsV2CreateListMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.ShoppingListsV2ItemsMapper;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 <2\u00060\u0001j\u0002`\u0002:\u0001<R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/di/ShoppingListsV2WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2CreateListMapper;", "getShoppingListsV2CreateListMapper", "()Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2CreateListMapper;", "shoppingListsV2CreateListMapper", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2ItemsMapper;", "getShoppingListsV2ItemsMapper", "()Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2ItemsMapper;", "shoppingListsV2ItemsMapper", "LPc/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "getShoppingListsViewModelProvider", "()LPc/a;", "shoppingListsViewModelProvider", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "getSellerViewModelProvider", "sellerViewModelProvider", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "getFavoritesListsInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "getFavoritesListsEventsManager", "()Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "getCreateFavoritesListDelegate", "()Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "getSellerFavoriteService", "()Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "getFavoriteEntityInteractor", "()Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Companion", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ShoppingListsV2WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/di/ShoppingListsV2WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/favorites/shoppinglistv2/di/ShoppingListsV2WidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ShoppingListsV2WidgetComponent create$lambda$0(C7475g c7475g) {
            return new ShoppingListsV2WidgetComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<ShoppingListsV2WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ShoppingListsV2WidgetComponent.class), new a(storage, 13));
        }
    }

    @NotNull
    ActionSheetEventHandler getActionSheetEventHandler();

    @NotNull
    AdultHandler getAdultHandler();

    @NotNull
    CartService getCartService();

    @NotNull
    CreateFavoritesListDelegate getCreateFavoritesListDelegate();

    @NotNull
    FavoriteEntityInteractor getFavoriteEntityInteractor();

    @NotNull
    /* renamed from: getFavoritesListsEventsManager */
    FavoritesListsEventsManager getEventsManager();

    @NotNull
    /* renamed from: getFavoritesListsInteractor */
    FavoritesListsInteractor getInteractor();

    @NotNull
    JsonParser getJsonDeserializer();

    @NotNull
    g getOzonRouter();

    @NotNull
    SellerFavoriteService getSellerFavoriteService();

    @NotNull
    Pc.a<SharedSellerViewModel> getSellerViewModelProvider();

    @NotNull
    ShoppingListsV2CreateListMapper getShoppingListsV2CreateListMapper();

    @NotNull
    ShoppingListsV2ItemsMapper getShoppingListsV2ItemsMapper();

    @NotNull
    Pc.a<ShoppingListsViewModel> getShoppingListsViewModelProvider();
}
