package ru.ozon.app.android.favorites.shoppinglistv2.presentation.item;

import a00.h;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.favoriteslist.FavoritesListsInteractor;
import ru.ozon.app.android.favorites.ui.FavoritesListsEventsManager;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.favorites.ui.shoppinglists.SharedSellerViewModel;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/shoppinglistv2/presentation/item/ShoppingListsV2ItemViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ShoppingListsV2ItemViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ShoppingListsV2ItemViewHolder> {
    final /* synthetic */ ShoppingListsV2ItemViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShoppingListsV2ItemViewMapper$holderProducer$1(ShoppingListsV2ItemViewMapper shoppingListsV2ItemViewMapper) {
        super(2);
        this.this$0 = shoppingListsV2ItemViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ShoppingListsV2ItemViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        ActionSheetEventHandler actionSheetEventHandler = this.this$0.component().getActionSheetEventHandler();
        h viewModelOwnerProvider = ref.getViewModelOwnerProvider();
        final ShoppingListsV2ItemViewMapper shoppingListsV2ItemViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SharedSellerViewModel sharedSellerViewModel = ShoppingListsV2ItemViewMapper.this.component().getSellerViewModelProvider().get();
                Intrinsics.g(sharedSellerViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedSellerViewModel;
            }
        }).a(SharedSellerViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "sharedViewModel(...)");
        SharedSellerViewModel sharedSellerViewModel = (SharedSellerViewModel) a11;
        JsonParser jsonDeserializer = this.this$0.component().getJsonDeserializer();
        FavoritesListsInteractor interactor = this.this$0.component().getInteractor();
        FavoritesListsEventsManager eventsManager = this.this$0.component().getEventsManager();
        CreateFavoritesListDelegate createFavoritesListDelegate = this.this$0.component().getCreateFavoritesListDelegate();
        B0 a12 = ref.getViewModelOwnerProvider().a();
        final ShoppingListsV2ItemViewMapper shoppingListsV2ItemViewMapper2 = this.this$0;
        w0 a13 = new z0(a12, new z0.c() { // from class: ru.ozon.app.android.favorites.shoppinglistv2.presentation.item.ShoppingListsV2ItemViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ShoppingListsViewModel shoppingListsViewModel = ShoppingListsV2ItemViewMapper.this.component().getShoppingListsViewModelProvider().get();
                Intrinsics.g(shoppingListsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return shoppingListsViewModel;
            }
        }).a(ShoppingListsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a13, "createViewModel(...)");
        return new ShoppingListsV2ItemViewHolder(view, ref, actionSheetEventHandler, sharedSellerViewModel, jsonDeserializer, interactor, eventsManager, createFavoritesListDelegate, (ShoppingListsViewModel) a13, this.this$0.component().getCartService(), this.this$0.component().getAdultHandler(), this.this$0.component().getSellerFavoriteService(), this.this$0.component().getOzonRouter(), this.this$0.component().getFavoriteEntityInteractor());
    }
}
