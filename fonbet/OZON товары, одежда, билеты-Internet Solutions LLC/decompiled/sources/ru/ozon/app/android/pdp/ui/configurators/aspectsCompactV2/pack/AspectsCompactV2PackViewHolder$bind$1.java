package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2PackLayoutBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2PackLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2PackViewHolder$bind$1 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2PackLayoutBinding, Unit> {
    final /* synthetic */ AspectsCompactVO$Variant $item;
    final /* synthetic */ AspectsCompactV2PackViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2PackViewHolder$bind$1(AspectsCompactVO$Variant aspectsCompactVO$Variant, AspectsCompactV2PackViewHolder aspectsCompactV2PackViewHolder) {
        super(1);
        this.$item = aspectsCompactVO$Variant;
        this.this$0 = aspectsCompactV2PackViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2PackLayoutBinding widgetAspectsCompactV2PackLayoutBinding) {
        invoke2(widgetAspectsCompactV2PackLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsCompactV2PackLayoutBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        AspectsCompactVO$Variant aspectsCompactVO$Variant = this.$item;
        Intrinsics.g(aspectsCompactVO$Variant, "null cannot be cast to non-null type ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.AspectsCompactPackVariantV2VO");
        AspectsCompactPackVariantV2VO aspectsCompactPackVariantV2VO = (AspectsCompactPackVariantV2VO) aspectsCompactVO$Variant;
        AspectsCompactV2PackViewHolder aspectsCompactV2PackViewHolder = this.this$0;
        TextAtomV2View titleTav = binding.titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextAtomV2View subtitleTav = binding.subtitleTav;
        Intrinsics.checkNotNullExpressionValue(subtitleTav, "subtitleTav");
        aspectsCompactV2PackViewHolder.setTexts(aspectsCompactPackVariantV2VO, titleTav, subtitleTav);
        aspectsCompactV2PackViewHolder.bindSelection(aspectsCompactPackVariantV2VO);
        ViewGroup.LayoutParams layoutParams = binding.infoFl.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = aspectsCompactPackVariantV2VO.getIsListHasTopBadge() ? aspectsCompactV2PackViewHolder.getMarginIfHasBadge() : 0;
    }
}
