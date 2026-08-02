package ru.ozon.app.android.favorites.shoppinglistv2.di;

import GZ.g;
import Pc.a;
import Xv.C4892a;
import jw.C7442a;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.ShoppingListsV2CreateListMapper;
import ru.ozon.app.android.favorites.shoppinglistv2.presentation.ShoppingListsV2ItemsMapper;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000¡\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u001b0\u001b0\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u0014\u0010 \u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0018\u0010@\u001a\u00060<j\u0002`=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"ru/ozon/app/android/favorites/shoppinglistv2/di/ShoppingListsV2WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/favorites/shoppinglistv2/di/ShoppingListsV2WidgetComponent;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoritesUIComponentApi;", "favoritesUIComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoritesUIComponentApi;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "favoritesDataComponentApi", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "interactor", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "eventsManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "LPc/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "kotlin.jvm.PlatformType", "shoppingListsViewModelProvider", "LPc/a;", "getShoppingListsViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/SharedSellerViewModel;", "sellerViewModelProvider", "getSellerViewModelProvider", "getFavoritesListsInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "getFavoritesListsEventsManager", "()Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "getFavoriteEntityInteractor", "()Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "getCreateFavoritesListDelegate", "()Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "getSellerFavoriteService", "()Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "Lru/ozon/app/android/cart/common/domain/CartService;", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2CreateListMapper;", "getShoppingListsV2CreateListMapper", "()Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2CreateListMapper;", "shoppingListsV2CreateListMapper", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2ItemsMapper;", "getShoppingListsV2ItemsMapper", "()Lru/ozon/app/android/favorites/shoppinglistv2/presentation/ShoppingListsV2ItemsMapper;", "shoppingListsV2ItemsMapper", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShoppingListsV2WidgetComponent$Companion$create$1$1 implements ShoppingListsV2WidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AccountComponentApi accountComponentApi;
    private final FavoritesListsEventsManager eventsManager;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final FavoritesDataComponentApi favoritesDataComponentApi;
    private final FavoritesUIComponentApi favoritesUIComponentApi;
    private final FavoritesListsInteractor interactor;
    private final a<SharedSellerViewModel> sellerViewModelProvider;
    private final a<ShoppingListsViewModel> shoppingListsViewModelProvider;

    ShoppingListsV2WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        FavoriteCoreComponentApi favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.favoriteCoreComponentApi = favoriteCoreComponentApi;
        FavoritesUIComponentApi favoritesUIComponentApi = (FavoritesUIComponentApi) c7475g.getComponent(FavoritesUIComponentApi.class);
        this.favoritesUIComponentApi = favoritesUIComponentApi;
        this.favoritesDataComponentApi = (FavoritesDataComponentApi) c7475g.getComponent(FavoritesDataComponentApi.class);
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        this.interactor = favoriteCoreComponentApi.getFavoritesListsInteractor();
        this.eventsManager = favoritesUIComponentApi.getFavoritesListsEventsManager();
        this.shoppingListsViewModelProvider = new C7442a(this, 2);
        this.sellerViewModelProvider = new C4892a(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedSellerViewModel sellerViewModelProvider$lambda$1() {
        return new SharedSellerViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShoppingListsViewModel shoppingListsViewModelProvider$lambda$0(ShoppingListsV2WidgetComponent$Companion$create$1$1 shoppingListsV2WidgetComponent$Companion$create$1$1) {
        return new ShoppingListsViewModel(shoppingListsV2WidgetComponent$Companion$create$1$1.interactor, shoppingListsV2WidgetComponent$Companion$create$1$1.eventsManager);
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public ActionSheetEventHandler getActionSheetEventHandler() {
        return ((ActionComponentApi) this.$storage.getComponent(ActionComponentApi.class)).getActionSheetEventHandler();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public AdultHandler getAdultHandler() {
        return this.accountComponentApi.getAdultHandler();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public CartService getCartService() {
        return ((CartServiceApi) this.$storage.getComponent(CartServiceApi.class)).getCartService();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public CreateFavoritesListDelegate getCreateFavoritesListDelegate() {
        return new CreateFavoritesListDelegate(this.interactor, this.eventsManager, ((StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class)).getAuthStateStorage(), getOzonRouter());
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public FavoriteEntityInteractor getFavoriteEntityInteractor() {
        return this.favoritesDataComponentApi.getFavoriteEntityInteractor();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    /* renamed from: getFavoritesListsEventsManager, reason: from getter */
    public FavoritesListsEventsManager getEventsManager() {
        return this.eventsManager;
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    /* renamed from: getFavoritesListsInteractor, reason: from getter */
    public FavoritesListsInteractor getInteractor() {
        return this.interactor;
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public JsonParser getJsonDeserializer() {
        return ((NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class)).getJsonDeserializer();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public g getOzonRouter() {
        return ((NavigationComponentApi) this.$storage.getComponent(NavigationComponentApi.class)).getOzonRouter();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public SellerFavoriteService getSellerFavoriteService() {
        return this.accountComponentApi.getSellerFavoriteService();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public a<SharedSellerViewModel> getSellerViewModelProvider() {
        return this.sellerViewModelProvider;
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public ShoppingListsV2CreateListMapper getShoppingListsV2CreateListMapper() {
        return new ShoppingListsV2CreateListMapper();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public ShoppingListsV2ItemsMapper getShoppingListsV2ItemsMapper() {
        return new ShoppingListsV2ItemsMapper();
    }

    @Override // ru.ozon.app.android.favorites.shoppinglistv2.di.ShoppingListsV2WidgetComponent
    public a<ShoppingListsViewModel> getShoppingListsViewModelProvider() {
        return this.shoppingListsViewModelProvider;
    }
}
