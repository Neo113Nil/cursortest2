package ru.ozon.app.android.common.buttonwidget.di;

import GZ.g;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.common.buttonwidget.core.ButtonMapper;
import ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.localstorage.di.FavoritesDataComponentApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.di.FavoritesUIComponentApi;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000½\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010%\u001a\u00060 j\u0002`!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u00103R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R(\u0010=\u001a\u0010\u0012\f\u0012\n <*\u0004\u0018\u00010;0;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0018\u0010[\u001a\u00060Wj\u0002`X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"ru/ozon/app/android/common/buttonwidget/di/ButtonWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/common/buttonwidget/di/ButtonWidgetComponent;", "Lru/ozon/app/android/account/di/AccountComponentApi;", "accountComponentApi", "Lru/ozon/app/android/account/di/AccountComponentApi;", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "Lru/ozon/app/android/favorites/ui/di/FavoritesUIComponentApi;", "favoritesUIComponentApi", "Lru/ozon/app/android/favorites/ui/di/FavoritesUIComponentApi;", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "favoritesDataComponentApi", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/localstorage/di/FavoritesDataComponentApi;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "interactor", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "eventsManager", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentDependencies;", "customActionHandlersComponentDependencies", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentDependencies;", "Lru/ozon/app/android/common/buttonwidget/core/ButtonMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/common/buttonwidget/core/ButtonMapper;", "mapper", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer$delegate", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "LGZ/g;", "ozonRouter$delegate", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService$delegate", "getCartService", "()Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "getActionSheetEventHandler", "()Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "LPc/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "kotlin.jvm.PlatformType", "shoppingListsViewModelProvider", "LPc/a;", "getShoppingListsViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "getAdultHandler", "()Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "getSellerFavoriteService", "()Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "getFavoritesListsInteractor", "()Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "getFavoritesListsEventsManager", "()Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "getFavoriteEntityInteractor", "()Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "getCreateFavoritesListDelegate", "()Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "getButtonWidgetCustomActionHandlers", "()Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "buttonWidgetCustomActionHandlers", "button-widget_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ButtonWidgetComponent$Companion$create$1$1 implements ButtonWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AccountComponentApi accountComponentApi;
    private final ActionSheetEventHandler actionSheetEventHandler;

    /* renamed from: cartService$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j cartService;
    private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
    private final CustomActionHandlersComponentDependencies customActionHandlersComponentDependencies;
    private final FavoritesListsEventsManager eventsManager;
    private final FavoriteCoreComponentApi favoriteCoreComponentApi;
    private final FavoritesDataComponentApi favoritesDataComponentApi;
    private final FavoritesUIComponentApi favoritesUIComponentApi;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor;
    private final FavoritesListsInteractor interactor;

    /* renamed from: jsonDeserializer$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j jsonDeserializer;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;

    /* renamed from: ozonRouter$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j ozonRouter;
    private final a<ShoppingListsViewModel> shoppingListsViewModelProvider;

    ButtonWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.accountComponentApi = (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class);
        FavoriteCoreComponentApi favoriteCoreComponentApi = (FavoriteCoreComponentApi) c7475g.getComponent(FavoriteCoreComponentApi.class);
        this.favoriteCoreComponentApi = favoriteCoreComponentApi;
        FavoritesUIComponentApi favoritesUIComponentApi = (FavoritesUIComponentApi) c7475g.getComponent(FavoritesUIComponentApi.class);
        this.favoritesUIComponentApi = favoritesUIComponentApi;
        this.favoritesDataComponentApi = (FavoritesDataComponentApi) c7475g.getComponent(FavoritesDataComponentApi.class);
        this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.interactor = favoriteCoreComponentApi.getFavoritesListsInteractor();
        this.eventsManager = favoritesUIComponentApi.getFavoritesListsEventsManager();
        this.customActionHandlersComponentDependencies = (CustomActionHandlersComponentDependencies) c7475g.getComponent(CustomActionHandlersComponentDependencies.class);
        this.mapper = k.b(ButtonWidgetComponent$Companion$create$1$1$mapper$2.INSTANCE);
        this.jsonDeserializer = k.b(new ButtonWidgetComponent$Companion$create$1$1$jsonDeserializer$2(c7475g));
        this.ozonRouter = k.b(new ButtonWidgetComponent$Companion$create$1$1$ozonRouter$2(c7475g));
        this.handlersInhibitor = k.b(ButtonWidgetComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);
        this.cartService = k.b(new ButtonWidgetComponent$Companion$create$1$1$cartService$2(c7475g));
        this.actionSheetEventHandler = ((ActionComponentApi) c7475g.getComponent(ActionComponentApi.class)).getActionSheetEventHandler();
        this.shoppingListsViewModelProvider = new a() { // from class: Cq.a
            @Override // Pc.a
            public final Object get() {
                ShoppingListsViewModel shoppingListsViewModelProvider$lambda$0;
                shoppingListsViewModelProvider$lambda$0 = ButtonWidgetComponent$Companion$create$1$1.shoppingListsViewModelProvider$lambda$0(ButtonWidgetComponent$Companion$create$1$1.this);
                return shoppingListsViewModelProvider$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShoppingListsViewModel shoppingListsViewModelProvider$lambda$0(ButtonWidgetComponent$Companion$create$1$1 buttonWidgetComponent$Companion$create$1$1) {
        return new ShoppingListsViewModel(buttonWidgetComponent$Companion$create$1$1.interactor, buttonWidgetComponent$Companion$create$1$1.eventsManager);
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public ActionSheetEventHandler getActionSheetEventHandler() {
        return this.actionSheetEventHandler;
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public AdultHandler getAdultHandler() {
        return this.accountComponentApi.getAdultHandler();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers() {
        return this.customActionHandlersComponentDependencies.getButtonWidgetCustomActionHandlers();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public CartService getCartService() {
        return (CartService) this.cartService.getValue();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public CreateFavoritesListDelegate getCreateFavoritesListDelegate() {
        return new CreateFavoritesListDelegate(this.interactor, this.eventsManager, ((StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class)).getAuthStateStorage(), getOzonRouter());
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public FavoriteEntityInteractor getFavoriteEntityInteractor() {
        return this.favoritesDataComponentApi.getFavoriteEntityInteractor();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    /* renamed from: getFavoritesListsEventsManager, reason: from getter */
    public FavoritesListsEventsManager getEventsManager() {
        return this.eventsManager;
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    /* renamed from: getFavoritesListsInteractor, reason: from getter */
    public FavoritesListsInteractor getInteractor() {
        return this.interactor;
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public JsonParser getJsonDeserializer() {
        return (JsonParser) this.jsonDeserializer.getValue();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public ButtonMapper getMapper() {
        return (ButtonMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public g getOzonRouter() {
        return (g) this.ozonRouter.getValue();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public SellerFavoriteService getSellerFavoriteService() {
        return this.accountComponentApi.getSellerFavoriteService();
    }

    @Override // ru.ozon.app.android.common.buttonwidget.di.ButtonWidgetComponent
    public a<ShoppingListsViewModel> getShoppingListsViewModelProvider() {
        return this.shoppingListsViewModelProvider;
    }
}
