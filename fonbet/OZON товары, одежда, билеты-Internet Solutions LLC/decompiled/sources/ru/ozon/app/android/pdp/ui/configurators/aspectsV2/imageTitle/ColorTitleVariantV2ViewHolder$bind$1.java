package ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.SquareAspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.AspectsImageTitleVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsV2TextColorLayoutBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2TextColorLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ColorTitleVariantV2ViewHolder$bind$1 extends AbstractC7737t implements Function1<WidgetAspectsV2TextColorLayoutBinding, Unit> {
    final /* synthetic */ AspectsCompactVO$Variant $item;
    final /* synthetic */ ColorTitleVariantV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ColorTitleVariantV2ViewHolder$bind$1(AspectsCompactVO$Variant aspectsCompactVO$Variant, ColorTitleVariantV2ViewHolder colorTitleVariantV2ViewHolder) {
        super(1);
        this.$item = aspectsCompactVO$Variant;
        this.this$0 = colorTitleVariantV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsV2TextColorLayoutBinding widgetAspectsV2TextColorLayoutBinding) {
        invoke2(widgetAspectsV2TextColorLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsV2TextColorLayoutBinding binding) {
        List<Integer> colors;
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        AspectsCompactVO$Variant aspectsCompactVO$Variant = this.$item;
        AspectsImageTitleVariantV2VO aspectsImageTitleVariantV2VO = aspectsCompactVO$Variant instanceof AspectsImageTitleVariantV2VO ? (AspectsImageTitleVariantV2VO) aspectsCompactVO$Variant : null;
        if (aspectsImageTitleVariantV2VO != null) {
            ColorTitleVariantV2ViewHolder colorTitleVariantV2ViewHolder = this.this$0;
            TextAtomV2View titleTav = binding.titleTav;
            Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
            colorTitleVariantV2ViewHolder.setTitle(aspectsImageTitleVariantV2VO, titleTav);
            colorTitleVariantV2ViewHolder.bindSelection(aspectsImageTitleVariantV2VO);
            AspectsImageTitleVariantV2VO.ImageVariant imageVariant = aspectsImageTitleVariantV2VO.getImageVariant();
            AspectsImageTitleVariantV2VO.ImageVariant.Color color = imageVariant instanceof AspectsImageTitleVariantV2VO.ImageVariant.Color ? (AspectsImageTitleVariantV2VO.ImageVariant.Color) imageVariant : null;
            if (color == null || (colors = color.getColors()) == null) {
                return;
            }
            if (colors.isEmpty()) {
                SquareAspectColorVariantView colorView = binding.colorView;
                Intrinsics.checkNotNullExpressionValue(colorView, "colorView");
                ViewExtKt.gone(colorView);
            } else {
                binding.colorView.setColors(colors);
                binding.colorView.setAlpha(aspectsImageTitleVariantV2VO.getIsAvailable() ? 1.0f : 0.5f);
                SquareAspectColorVariantView colorView2 = binding.colorView;
                Intrinsics.checkNotNullExpressionValue(colorView2, "colorView");
                ViewExtKt.show(colorView2);
            }
        }
    }
}
