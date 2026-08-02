package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.atoms.extensions.ClickableCiewKt;
import ru.ozon.app.android.pdp.databinding.WidgetOtherSellersSellerBinding;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersSellerBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$bindClickable$1 extends AbstractC7737t implements Function1<WidgetOtherSellersSellerBinding, Unit> {
    final /* synthetic */ String $deeplink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellerViewHolder$bindClickable$1(String str) {
        super(1);
        this.$deeplink = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetOtherSellersSellerBinding widgetOtherSellersSellerBinding) {
        invoke2(widgetOtherSellersSellerBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetOtherSellersSellerBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        boolean z11 = this.$deeplink != null;
        ConstraintLayout sellerCl = binding.sellerCl;
        Intrinsics.checkNotNullExpressionValue(sellerCl, "sellerCl");
        ClickableCiewKt.switchBluewaveRectRipple(sellerCl, z11);
        CardView cardView = binding.otherSellerCv;
        cardView.setClickable(z11);
        cardView.setFocusable(z11);
    }
}
