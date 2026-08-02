package ru.ozon.app.android.travel.feature.avia.widgets.aviaFavoriteList.presentation.flight;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "view", "Lru/ozon/app/android/favorites/ui/favoriteMoleculeV4/view/ProductFavoriteMoleculeV4ButtonView;", "dto", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaFavoriteListFlightWidgetViewHolder$bind$1 extends AbstractC7737t implements Function2<ProductFavoriteMoleculeV4ButtonView, FavoriteProductModel, Unit> {
    final /* synthetic */ AviaFavoriteListFlightWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaFavoriteListFlightWidgetViewHolder$bind$1(AviaFavoriteListFlightWidgetViewHolder aviaFavoriteListFlightWidgetViewHolder) {
        super(2);
        this.this$0 = aviaFavoriteListFlightWidgetViewHolder;
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
        AviaFavoriteListFlightWidgetViewHolder aviaFavoriteListFlightWidgetViewHolder = this.this$0;
        aviaFavoriteListFlightWidgetViewHolder.bindFavoriteProductButton(view, dto, new AnalyticData(aviaFavoriteListFlightWidgetViewHolder.getTrackingData(), this.this$0.getViewItem()));
    }
}
