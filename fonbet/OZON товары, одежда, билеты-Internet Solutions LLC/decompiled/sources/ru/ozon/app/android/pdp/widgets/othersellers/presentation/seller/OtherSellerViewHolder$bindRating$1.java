package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.WidgetOtherSellersSellerBinding;
import ru.ozon.app.android.pdp.widgets.othersellers.data.OtherSellersDTO;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/WidgetOtherSellersSellerBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class OtherSellerViewHolder$bindRating$1 extends AbstractC7737t implements Function1<WidgetOtherSellersSellerBinding, Unit> {
    final /* synthetic */ OtherSellersDTO.Seller.Rating $rating;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OtherSellerViewHolder$bindRating$1(OtherSellersDTO.Seller.Rating rating) {
        super(1);
        this.$rating = rating;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetOtherSellersSellerBinding widgetOtherSellersSellerBinding) {
        invoke2(widgetOtherSellersSellerBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetOtherSellersSellerBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        OtherSellersDTO.Seller.Rating rating = this.$rating;
        if (rating == null) {
            VectorRatingBar sellerRb = binding.sellerRb;
            Intrinsics.checkNotNullExpressionValue(sellerRb, "sellerRb");
            ViewExtKt.gone(sellerRb);
            TextView sellerRatingTv = binding.sellerRatingTv;
            Intrinsics.checkNotNullExpressionValue(sellerRatingTv, "sellerRatingTv");
            ViewExtKt.gone(sellerRatingTv);
            return;
        }
        binding.sellerRb.setRating(rating.getRating());
        binding.sellerRatingTv.setText(this.$rating.getText());
        VectorRatingBar sellerRb2 = binding.sellerRb;
        Intrinsics.checkNotNullExpressionValue(sellerRb2, "sellerRb");
        ViewExtKt.show(sellerRb2);
        TextView sellerRatingTv2 = binding.sellerRatingTv;
        Intrinsics.checkNotNullExpressionValue(sellerRatingTv2, "sellerRatingTv");
        ViewExtKt.show(sellerRatingTv2);
        binding.sellerRb.setIndicator(true);
    }
}
