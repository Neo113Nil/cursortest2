package ru.ozon.app.android.ugc.widgets.reviewTiles.presentation;

import De.C2860c;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.R$id;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ReviewTilesView$priceView$2 extends AbstractC7737t implements Function0<PriceAtomView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ReviewTilesView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewTilesView$priceView$2(Context context, ReviewTilesView reviewTilesView) {
        super(0);
        this.$context = context;
        this.this$0 = reviewTilesView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PriceAtomView invoke() {
        TextAtomV2View textView;
        PriceAtomView priceAtomView = new PriceAtomView(this.$context, null, 0, 6, null);
        ReviewTilesView reviewTilesView = this.this$0;
        ConstraintLayout.b b11 = C2860c.b(priceAtomView, R$id.reviewTilesPrice, 0, -2);
        textView = reviewTilesView.getTextView();
        b11.f41640k = textView.getId();
        b11.f41656t = 0;
        b11.f41658v = 0;
        Dimens dimens = Dimens.INSTANCE;
        b11.setMargins(dimens.getDP_8(), ((ViewGroup.MarginLayoutParams) b11).topMargin, dimens.getDP_8(), ((ViewGroup.MarginLayoutParams) b11).bottomMargin);
        priceAtomView.setLayoutParams(b11);
        priceAtomView.setZ(1.0f);
        this.this$0.addView(priceAtomView);
        return priceAtomView;
    }
}
