package ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation;

import GZ.g;
import Pc.a;
import Vg.d;
import WZ.l;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.account.favorites.seller.SellerFavoriteService;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.favoritebutton.favoriteentity.FavoriteEntityInteractor;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.FavoritesListAtomActionSheetHandler;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/commonwidgets/widgets/navbariconbutton/presentation/NavBarIconButtonWidgetViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavbarIconButtonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, NavBarIconButtonWidgetViewHolder> {
    final /* synthetic */ ActionSheetEventHandler $actionSheetEventHandler;
    final /* synthetic */ NavbarIconButtonViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavbarIconButtonViewMapper$holderProducer$1(NavbarIconButtonViewMapper navbarIconButtonViewMapper, ActionSheetEventHandler actionSheetEventHandler) {
        super(2);
        this.this$0 = navbarIconButtonViewMapper;
        this.$actionSheetEventHandler = actionSheetEventHandler;
    }

    @Override // kotlin.jvm.functions.Function2
    public final NavBarIconButtonWidgetViewHolder invoke(View view, ComposerReferences ref) {
        g gVar;
        JsonParser jsonParser;
        FavoritesListsInteractor favoritesListsInteractor;
        CartService cartService;
        FavoritesListsEventsManager favoritesListsEventsManager;
        CreateFavoritesListDelegate createFavoritesListDelegate;
        AdultHandler adultHandler;
        SellerFavoriteService sellerFavoriteService;
        FavoriteEntityInteractor favoriteEntityInteractor;
        d dVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        l tokenizedAnalytics = ref.getTokenizedAnalytics();
        gVar = this.this$0.ozonRouter;
        jsonParser = this.this$0.jsonDeserializer;
        favoritesListsInteractor = this.this$0.favoritesListsInteractor;
        B0 a11 = ref.getViewModelOwnerProvider().a();
        final NavbarIconButtonViewMapper navbarIconButtonViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation.NavbarIconButtonViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = NavbarIconButtonViewMapper.this.shoppingListsViewModelProvider;
                ShoppingListsViewModel shoppingListsViewModel = (ShoppingListsViewModel) aVar.get();
                Intrinsics.g(shoppingListsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return shoppingListsViewModel;
            }
        }).a(ShoppingListsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        cartService = this.this$0.cartService;
        favoritesListsEventsManager = this.this$0.favoritesListsEventsManager;
        createFavoritesListDelegate = this.this$0.createFavoritesListDelegate;
        adultHandler = this.this$0.adultHandler;
        sellerFavoriteService = this.this$0.sellerFavoriteService;
        favoriteEntityInteractor = this.this$0.favoriteEntityInteractor;
        HashSet a13 = e0.a(new FavoritesListAtomActionSheetHandler(gVar, jsonParser, favoritesListsInteractor, (ShoppingListsViewModel) a12, cartService, favoritesListsEventsManager, ref, createFavoritesListDelegate, adultHandler, sellerFavoriteService, favoriteEntityInteractor, null, true, null, 10240, null));
        dVar = this.this$0.customActionHandlersStoreFactory;
        B0 a14 = ref.getViewModelOwnerProvider().a();
        final NavbarIconButtonViewMapper navbarIconButtonViewMapper2 = this.this$0;
        w0 a15 = new z0(a14, new z0.c() { // from class: ru.ozon.app.android.commonwidgets.widgets.navbariconbutton.presentation.NavbarIconButtonViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = NavbarIconButtonViewMapper.this.minifyLinkViewModelProvider;
                MinifyLinkViewModel minifyLinkViewModel = (MinifyLinkViewModel) aVar.get();
                Intrinsics.g(minifyLinkViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return minifyLinkViewModel;
            }
        }).a(MinifyLinkViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a15, "viewModel(...)");
        return new NavBarIconButtonWidgetViewHolder((AppCompatImageView) view, tokenizedAnalytics, ref, this.$actionSheetEventHandler, a13, dVar, (MinifyLinkViewModel) a15);
    }
}
