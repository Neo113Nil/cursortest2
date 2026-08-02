package ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "dto", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TransparentNavBarV2WidgetViewHolder$bind$2 extends AbstractC7737t implements Function2<ProductFavoriteMoleculeV4ButtonView, FavoriteProductModel, Unit> {
    final /* synthetic */ TransparentNavBarV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransparentNavBarV2WidgetViewHolder$bind$2(TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder) {
        super(2);
        this.this$0 = transparentNavBarV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView, FavoriteProductModel favoriteProductModel) {
        invoke2(productFavoriteMoleculeV4ButtonView, favoriteProductModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProductFavoriteMoleculeV4ButtonView view, FavoriteProductModel dto) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dto, "dto");
        TransparentNavBarV2WidgetViewHolder transparentNavBarV2WidgetViewHolder = this.this$0;
        transparentNavBarV2WidgetViewHolder.bindFavoriteProductButton(view, dto, new AnalyticData(transparentNavBarV2WidgetViewHolder.getTrackingData(), this.this$0.getViewItem()));
    }
}
