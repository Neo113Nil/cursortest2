package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.TileGrid2Constants;
import ru.ozon.uni.android.atom.rating.RatingView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/rating/RatingView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2RootView$ratingView$1 extends AbstractC7737t implements Function0<RatingView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TileGrid2RootView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2RootView$ratingView$1(Context context, TileGrid2RootView tileGrid2RootView) {
        super(0);
        this.$context = context;
        this.this$0 = tileGrid2RootView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RatingView invoke() {
        RatingView ratingView = new RatingView(this.$context, null, 0, 0, 14, null);
        TileGrid2RootView tileGrid2RootView = this.this$0;
        ratingView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(-2, -2);
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41638j = tileGrid2RootView.getGalleryViewDelegate().getBottomViewId();
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = TileGrid2Constants.INSTANCE.getRatingTopMargin();
        ratingView.setLayoutParams(bVar);
        this.this$0.addView(ratingView);
        return ratingView;
    }
}
