package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.price;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.ScrollablePriceGradientOverlayDrawable;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceV2MainPriceView$scrollableGradientV$1 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PriceV2MainPriceView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV2MainPriceView$scrollableGradientV$1(Context context, PriceV2MainPriceView priceV2MainPriceView) {
        super(0);
        this.$context = context;
        this.this$0 = priceV2MainPriceView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        ScrollablePriceGradientOverlayDrawable scrollableGradientDrawable;
        View view = new View(this.$context);
        PriceV2MainPriceView priceV2MainPriceView = this.this$0;
        view.setId(R$id.scrollableStartOverlayGradientV);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollableGradientDrawable = priceV2MainPriceView.getScrollableGradientDrawable();
        view.setBackground(scrollableGradientDrawable);
        return view;
    }
}
