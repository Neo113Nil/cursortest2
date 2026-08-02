package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteproduct.ui.buttonview.FavoriteButton;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "favBtn", "Lru/ozon/app/android/favorites/ui/favoritebutton/favoriteproduct/ui/buttonview/FavoriteButton;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardWidgetViewHolder$bind$2$1 extends AbstractC7737t implements Function1<FavoriteButton, Unit> {
    final /* synthetic */ HotelsSearchResultsV5CardVO $this_with;
    final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardWidgetViewHolder$bind$2$1(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder, HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO) {
        super(1);
        this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
        this.$this_with = hotelsSearchResultsV5CardVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FavoriteButton favoriteButton) {
        invoke2(favoriteButton);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FavoriteButton favBtn) {
        Intrinsics.checkNotNullParameter(favBtn, "favBtn");
        this.this$0.bindFavoriteProductButton(favBtn, this.$this_with.getFavoriteButton(), new AnalyticData(this.this$0.getTrackingData(), this.this$0.getViewItem()));
    }
}
