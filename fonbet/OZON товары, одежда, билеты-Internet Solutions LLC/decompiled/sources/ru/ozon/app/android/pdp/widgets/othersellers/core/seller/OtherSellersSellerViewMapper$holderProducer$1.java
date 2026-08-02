package ru.ozon.app.android.pdp.widgets.othersellers.core.seller;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.domain.favorite.FavoriteInteractor;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.OtherSellersViewModel;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OtherSellersSellerViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OtherSellerViewHolder> {
    final /* synthetic */ OtherSellersSellerViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellersSellerViewMapper$holderProducer$1(OtherSellersSellerViewMapper otherSellersSellerViewMapper) {
        super(2);
        this.this$0 = otherSellersSellerViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OtherSellerViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        CartService cartService = this.this$0.component().getCartService();
        FavoriteInteractor favoriteInteractor = this.this$0.component().getFavoriteInteractor();
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final OtherSellersSellerViewMapper otherSellersSellerViewMapper = this.this$0;
        return new OtherSellerViewHolder(view, refs, cartService, favoriteInteractor, (OtherSellersViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.othersellers.core.seller.OtherSellersSellerViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OtherSellersViewModel otherSellersViewModel = OtherSellersSellerViewMapper.this.component().getOtherSellersViewModel();
                Intrinsics.g(otherSellersViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return otherSellersViewModel;
            }
        }).a(OtherSellersViewModel.class), this.this$0.component().getOzonRouter(), this.this$0.component().getTokenizedAnalytics());
    }
}
