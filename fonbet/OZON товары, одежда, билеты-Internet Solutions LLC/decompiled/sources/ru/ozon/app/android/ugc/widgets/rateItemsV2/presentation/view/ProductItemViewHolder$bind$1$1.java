package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2ProductItemBinding;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2VO;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductItemViewHolder$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ RateItemsV2VO.RateItemVO.RateProductItemVO $rateProductItem;
    final /* synthetic */ WidgetRateItemsV2ProductItemBinding $this_with;
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemViewHolder$bind$1$1(WidgetRateItemsV2ProductItemBinding widgetRateItemsV2ProductItemBinding, RateItemsV2VO.RateItemVO.RateProductItemVO rateProductItemVO, ProductItemViewHolder productItemViewHolder) {
        super(0);
        this.$this_with = widgetRateItemsV2ProductItemBinding;
        this.$rateProductItem = rateProductItemVO;
        this.this$0 = productItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        ProductMediaView productMedia = this.$this_with.productMedia;
        Intrinsics.checkNotNullExpressionValue(productMedia, "productMedia");
        ProductMediaDTO productMedia2 = this.$rateProductItem.getProductMedia();
        function1 = this.this$0.actionHandler;
        ProductMediaHolderKt.bindOrGone(productMedia, productMedia2, function1);
    }
}
