package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation;

import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProductActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ int $heightPx;
    final /* synthetic */ int $marginPx;
    final /* synthetic */ ProductActionBarViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductActionBarViewV2$setQuantityModeImmediately$updateLayoutParams$1(ProductActionBarViewV2 productActionBarViewV2, int i11, int i12) {
        super(0);
        this.this$0 = productActionBarViewV2;
        this.$marginPx = i11;
        this.$heightPx = i12;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CardView cardView;
        cardView = this.this$0.backgroundView;
        ProductActionBarViewV2 productActionBarViewV2 = this.this$0;
        int i11 = this.$marginPx;
        int i12 = this.$heightPx;
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = productActionBarViewV2.getMeasuredWidth() - (i11 * 2);
        layoutParams.height = i12;
        cardView.setLayoutParams(layoutParams);
    }
}
