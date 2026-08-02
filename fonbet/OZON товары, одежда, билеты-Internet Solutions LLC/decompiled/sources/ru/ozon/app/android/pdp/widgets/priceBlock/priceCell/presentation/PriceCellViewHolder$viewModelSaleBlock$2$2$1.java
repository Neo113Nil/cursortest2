package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.view.animationsaleblock.ObjectAnimation;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/pdp/view/animationsaleblock/ObjectAnimation;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceCellViewHolder$viewModelSaleBlock$2$2$1 extends AbstractC7737t implements Function1<ObjectAnimation, Unit> {
    final /* synthetic */ PriceCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCellViewHolder$viewModelSaleBlock$2$2$1(PriceCellViewHolder priceCellViewHolder) {
        super(1);
        this.this$0 = priceCellViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ObjectAnimation objectAnimation) {
        invoke2(objectAnimation);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ObjectAnimation objectAnimation) {
        if (objectAnimation == ObjectAnimation.PRICE_CELL) {
            this.this$0.launchAnimation();
        }
    }
}
