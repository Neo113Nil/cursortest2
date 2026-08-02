package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.color;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.SquareAspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2ColorLayoutBinding;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2ColorLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2ColorViewHolder$setColors$1 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2ColorLayoutBinding, Unit> {
    final /* synthetic */ AspectsColorVariantV2VO $this_setColors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2ColorViewHolder$setColors$1(AspectsColorVariantV2VO aspectsColorVariantV2VO) {
        super(1);
        this.$this_setColors = aspectsColorVariantV2VO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2ColorLayoutBinding widgetAspectsCompactV2ColorLayoutBinding) {
        invoke2(widgetAspectsCompactV2ColorLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsCompactV2ColorLayoutBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        binding.colorView.setColors(this.$this_setColors.getColors());
        binding.colorView.setAlpha(this.$this_setColors.getIsAvailable() ? 1.0f : 0.5f);
        SquareAspectColorVariantView colorView = binding.colorView;
        Intrinsics.checkNotNullExpressionValue(colorView, "colorView");
        ViewExtKt.show(colorView);
    }
}
