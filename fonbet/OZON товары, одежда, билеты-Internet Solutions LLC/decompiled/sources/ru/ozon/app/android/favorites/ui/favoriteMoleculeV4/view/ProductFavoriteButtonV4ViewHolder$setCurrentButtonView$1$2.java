package ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "model", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$2 extends AbstractC7737t implements Function2<FavoriteProductModel, View, Unit> {
    final /* synthetic */ ProductFavoriteButtonV4ViewHolder this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<FavoriteProductModel, Unit> {
        final /* synthetic */ ProductFavoriteButtonV4ViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ProductFavoriteButtonV4ViewHolder productFavoriteButtonV4ViewHolder) {
            super(1);
            this.this$0 = productFavoriteButtonV4ViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductModel favoriteProductModel) {
            invoke2(favoriteProductModel);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FavoriteProductModel it) {
            ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView;
            Intrinsics.checkNotNullParameter(it, "it");
            productFavoriteMoleculeV4ButtonView = this.this$0.currentButtonView;
            if (productFavoriteMoleculeV4ButtonView != null) {
                productFavoriteMoleculeV4ButtonView.revertAndRebindViewState();
            }
            Function1<FavoriteProductModel, Unit> onClick = this.this$0.getOnClick();
            if (onClick != null) {
                onClick.invoke(it);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductFavoriteButtonV4ViewHolder$setCurrentButtonView$1$2(ProductFavoriteButtonV4ViewHolder productFavoriteButtonV4ViewHolder) {
        super(2);
        this.this$0 = productFavoriteButtonV4ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteProductModel favoriteProductModel, View view) {
        invoke2(favoriteProductModel, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteProductModel model, View view) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(view, "view");
        ProductFavoriteButtonV4ViewHolder productFavoriteButtonV4ViewHolder = this.this$0;
        productFavoriteButtonV4ViewHolder.processRegularButtonAction(model, view, new AnonymousClass1(productFavoriteButtonV4ViewHolder));
    }
}
