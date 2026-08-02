package ru.ozon.app.android.pdp.widgets.seller.presentation;

import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.databinding.PdpWidgetSellerBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerViewHolder$bindLogo$1 extends AbstractC7737t implements Function1<PdpWidgetSellerBinding, Unit> {
    final /* synthetic */ String $logo;
    final /* synthetic */ String $logoPlaceholder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerViewHolder$bindLogo$1(String str, String str2) {
        super(1);
        this.$logo = str;
        this.$logoPlaceholder = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetSellerBinding pdpWidgetSellerBinding) {
        invoke2(pdpWidgetSellerBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetSellerBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        if (this.$logo == null) {
            ImageView logoIv = binding.logoIv;
            Intrinsics.checkNotNullExpressionValue(logoIv, "logoIv");
            ViewExtKt.gone(logoIv);
            binding.logoTv.setText(this.$logoPlaceholder);
            TextView logoTv = binding.logoTv;
            Intrinsics.checkNotNullExpressionValue(logoTv, "logoTv");
            ViewExtKt.show(logoTv);
            return;
        }
        ImageView logoIv2 = binding.logoIv;
        Intrinsics.checkNotNullExpressionValue(logoIv2, "logoIv");
        ImageViewExtKt.loadCircleImage$default(logoIv2, this.$logo, null, 2, null);
        ImageView logoIv3 = binding.logoIv;
        Intrinsics.checkNotNullExpressionValue(logoIv3, "logoIv");
        ViewExtKt.show(logoIv3);
        TextView logoTv2 = binding.logoTv;
        Intrinsics.checkNotNullExpressionValue(logoTv2, "logoTv");
        ViewExtKt.gone(logoTv2);
    }
}
