package ru.ozon.app.android.pdp.widgets.seller.presentation;

import Cm.e;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
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
final class SellerViewHolder$bindBanner$1 extends AbstractC7737t implements Function1<PdpWidgetSellerBinding, Unit> {
    final /* synthetic */ String $banner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerViewHolder$bindBanner$1(String str) {
        super(1);
        this.$banner = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetSellerBinding pdpWidgetSellerBinding) {
        invoke2(pdpWidgetSellerBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetSellerBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        ImageView bannerIv = binding.bannerIv;
        Intrinsics.checkNotNullExpressionValue(bannerIv, "bannerIv");
        ImageViewExtKt.loadWithPlaceholder(bannerIv, this.$banner);
        ImageView bannerIv2 = binding.bannerIv;
        Intrinsics.checkNotNullExpressionValue(bannerIv2, "bannerIv");
        ViewExtKt.showOrGone(bannerIv2, Boolean.valueOf(this.$banner != null));
        ConstraintLayout rootCl = binding.rootCl;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        String str = this.$banner;
        d b11 = e.b(rootCl);
        if (str != null) {
            b11.s(binding.logoIv.getId(), 3, binding.bannerIv.getId(), 4);
            b11.s(binding.logoIv.getId(), 4, binding.bannerIv.getId(), 4);
        } else {
            b11.s(binding.logoIv.getId(), 3, binding.titleTav.getId(), 3);
            b11.s(binding.logoIv.getId(), 4, binding.nameTv.getId(), 4);
        }
        b11.f(rootCl);
    }
}
