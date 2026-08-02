package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import android.content.res.ColorStateList;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpWidgetOutOfStockBinding;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.uni.R$color;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetOutOfStockBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OutOfStockViewHolder$bindCartButton$1 extends AbstractC7737t implements Function1<PdpWidgetOutOfStockBinding, Unit> {
    final /* synthetic */ boolean $isInCart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutOfStockViewHolder$bindCartButton$1(boolean z11) {
        super(1);
        this.$isInCart = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetOutOfStockBinding pdpWidgetOutOfStockBinding) {
        invoke2(pdpWidgetOutOfStockBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetOutOfStockBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        binding.cartBtn.setText(this.$isInCart ? R$string.common_button_go_to_cart : ru.ozon.app.android.pdp.R$string.common_add_to_cart);
        TextView textView = binding.cartBtn;
        textView.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(textView.getContext(), this.$isInCart ? R$color.oz_green_ui : R$color.oz_blue)));
    }
}
