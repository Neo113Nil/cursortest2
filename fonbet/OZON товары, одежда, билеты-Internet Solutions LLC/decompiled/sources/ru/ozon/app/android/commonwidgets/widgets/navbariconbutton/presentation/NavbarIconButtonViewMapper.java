package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation;

import GZ.g;
import Pc.a;
import Vg.d;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.common.commonwidgets.R$id;
import ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.data.NavBarIconButtonDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.storefront.navBar.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001FB\u0085\u0001\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0018\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010+R\u001c\u00104\u001a\u0004\u0018\u0001038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R6\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u000609j\u0002`:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030;088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R<\u0010D\u001a$\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030Bj\b\u0012\u0004\u0012\u00020\u0003`C088\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?¨\u0006G"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavbarIconButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/data/NavBarIconButtonDTO;", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonVO;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "favoritesListsInteractor", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "favoritesListsEventsManager", "LPc/a;", "Lru/ozon/app/android/favorites/ui/shoppinglists/ShoppingListsViewModel;", "shoppingListsViewModelProvider", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "sellerFavoriteService", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "adultHandler", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "favoriteEntityInteractor", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/minifyLink/presentation/MinifyLinkViewModel;", "minifyLinkViewModelProvider", "<init>", "(Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;LPc/a;Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;Lru/ozon/app/android/account/adult/presenter/AdultHandler;LGZ/g;Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;LVg/d;LPc/a;)V", "Landroid/view/ViewGroup;", "parent", "Landroidx/appcompat/widget/AppCompatImageView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/favorites/domain/favoriteslist/FavoritesListsInteractor;", "Lru/ozon/app/android/favorites/ui/FavoritesListsEventsManager;", "LPc/a;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "Lru/ozon/app/android/account/favorites/seller/SellerFavoriteService;", "Lru/ozon/app/android/account/adult/presenter/AdultHandler;", "LGZ/g;", "Lru/ozon/app/android/favorites/domain/favoritebutton/favoriteentity/FavoriteEntityInteractor;", "LVg/d;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavbarIconButtonViewMapper extends WidgetViewMapper<NavBarIconButtonDTO, NavBarIconButtonVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int ICON_SIZE = ResourceExtKt.toPx(36);

    @NotNull
    private final AdultHandler adultHandler;

    @NotNull
    private final CartService cartService;

    @NotNull
    private final CreateFavoritesListDelegate createFavoritesListDelegate;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FavoriteEntityInteractor favoriteEntityInteractor;

    @NotNull
    private final FavoritesListsEventsManager favoritesListsEventsManager;

    @NotNull
    private final FavoritesListsInteractor favoritesListsInteractor;

    @NotNull
    private final Function2<View, ComposerReferences, k<NavBarIconButtonVO>> holderProducer;

    @NotNull
    private final JsonParser jsonDeserializer;
    private final Integer layout;

    @NotNull
    private final Function2<NavBarIconButtonDTO, l20.d, List<NavBarIconButtonVO>> mapper;

    @NotNull
    private final a<MinifyLinkViewModel> minifyLinkViewModelProvider;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final SellerFavoriteService sellerFavoriteService;

    @NotNull
    private final a<ShoppingListsViewModel> shoppingListsViewModelProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavbarIconButtonViewMapper$Companion;", "", "<init>", "()V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public NavbarIconButtonViewMapper(@NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull JsonParser jsonDeserializer, @NotNull FavoritesListsInteractor favoritesListsInteractor, @NotNull FavoritesListsEventsManager favoritesListsEventsManager, @NotNull a<ShoppingListsViewModel> shoppingListsViewModelProvider, @NotNull CartService cartService, @NotNull CreateFavoritesListDelegate createFavoritesListDelegate, @NotNull SellerFavoriteService sellerFavoriteService, @NotNull AdultHandler adultHandler, @NotNull g ozonRouter, @NotNull FavoriteEntityInteractor favoriteEntityInteractor, @NotNull d customActionHandlersStoreFactory, @NotNull a<MinifyLinkViewModel> minifyLinkViewModelProvider) {
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(favoritesListsInteractor, "favoritesListsInteractor");
        Intrinsics.checkNotNullParameter(favoritesListsEventsManager, "favoritesListsEventsManager");
        Intrinsics.checkNotNullParameter(shoppingListsViewModelProvider, "shoppingListsViewModelProvider");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(createFavoritesListDelegate, "createFavoritesListDelegate");
        Intrinsics.checkNotNullParameter(sellerFavoriteService, "sellerFavoriteService");
        Intrinsics.checkNotNullParameter(adultHandler, "adultHandler");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(favoriteEntityInteractor, "favoriteEntityInteractor");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(minifyLinkViewModelProvider, "minifyLinkViewModelProvider");
        this.jsonDeserializer = jsonDeserializer;
        this.favoritesListsInteractor = favoritesListsInteractor;
        this.favoritesListsEventsManager = favoritesListsEventsManager;
        this.shoppingListsViewModelProvider = shoppingListsViewModelProvider;
        this.cartService = cartService;
        this.createFavoritesListDelegate = createFavoritesListDelegate;
        this.sellerFavoriteService = sellerFavoriteService;
        this.adultHandler = adultHandler;
        this.ozonRouter = ozonRouter;
        this.favoriteEntityInteractor = favoriteEntityInteractor;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.minifyLinkViewModelProvider = minifyLinkViewModelProvider;
        this.mapper = NavbarIconButtonViewMapper$mapper$1.INSTANCE;
        this.holderProducer = new NavbarIconButtonViewMapper$holderProducer$1(this, actionSheetEventHandler);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<NavBarIconButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<NavBarIconButtonDTO, l20.d, List<NavBarIconButtonVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public AppCompatImageView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        AppCompatImageView appCompatImageView = new AppCompatImageView(parent.getContext());
        appCompatImageView.setId(R$id.iconButtonNavbarIv);
        int i11 = ICON_SIZE;
        appCompatImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(i11, i11));
        appCompatImageView.setMinimumWidth(i11);
        appCompatImageView.setMinimumHeight(i11);
        appCompatImageView.setTag(StringProvider.getString(R$string.commonwidgets_navbar_disable_color_filtering));
        return appCompatImageView;
    }
}
