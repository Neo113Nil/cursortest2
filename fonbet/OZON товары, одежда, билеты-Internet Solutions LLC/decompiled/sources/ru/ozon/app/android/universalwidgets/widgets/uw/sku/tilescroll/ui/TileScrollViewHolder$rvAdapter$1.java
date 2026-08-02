package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.model.AnalyticData;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/model/AnalyticData;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TileScrollViewHolder$rvAdapter$1 extends AbstractC7737t implements Function0<AnalyticData> {
    final /* synthetic */ TileScrollViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileScrollViewHolder$rvAdapter$1(TileScrollViewHolder tileScrollViewHolder) {
        super(0);
        this.this$0 = tileScrollViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AnalyticData invoke() {
        return new AnalyticData(this.this$0.getTrackingData(), this.this$0.getViewItem());
    }
}
