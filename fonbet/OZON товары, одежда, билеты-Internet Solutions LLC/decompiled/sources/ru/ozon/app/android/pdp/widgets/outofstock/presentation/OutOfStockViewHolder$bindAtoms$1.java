package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpWidgetOutOfStockBinding;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.price.PriceHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetOutOfStockBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OutOfStockViewHolder$bindAtoms$1 extends AbstractC7737t implements Function1<PdpWidgetOutOfStockBinding, Unit> {
    final /* synthetic */ TextDTO $delivery;
    final /* synthetic */ Price $price;
    final /* synthetic */ OutOfStockVO.SellerInfo $seller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutOfStockViewHolder$bindAtoms$1(Price price, TextDTO textDTO, OutOfStockVO.SellerInfo sellerInfo) {
        super(1);
        this.$price = price;
        this.$delivery = textDTO;
        this.$seller = sellerInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetOutOfStockBinding pdpWidgetOutOfStockBinding) {
        invoke2(pdpWidgetOutOfStockBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetOutOfStockBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        PriceView priceAtom = binding.priceAtom;
        Intrinsics.checkNotNullExpressionValue(priceAtom, "priceAtom");
        PriceHolderKt.bind$default(priceAtom, this.$price, null, 2, null);
        TextDTO textDTO = this.$delivery;
        if (textDTO != null) {
            TextAtomV2View deliveryAtom = binding.deliveryAtom;
            Intrinsics.checkNotNullExpressionValue(deliveryAtom, "deliveryAtom");
            TextHolderKt.bind$default(deliveryAtom, textDTO, null, 2, null);
        } else {
            TextAtomV2View deliveryAtom2 = binding.deliveryAtom;
            Intrinsics.checkNotNullExpressionValue(deliveryAtom2, "deliveryAtom");
            ViewExtKt.gone(deliveryAtom2);
        }
        OutOfStockVO.SellerInfo sellerInfo = this.$seller;
        TextAtomV2View sellerAtom = binding.sellerAtom;
        Intrinsics.checkNotNullExpressionValue(sellerAtom, "sellerAtom");
        if (sellerInfo != null) {
            TextHolderKt.bind$default(sellerAtom, sellerInfo.getAtom(), null, 2, null);
        } else {
            ViewExtKt.gone(sellerAtom);
        }
    }
}
