package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.image;

import Sc.o;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.SquareAspectColorVariantView;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.image.AspectsImageVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsCompactV2ImageLayoutBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsCompactV2ImageLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV2ImageViewHolder$setContent$1 extends AbstractC7737t implements Function1<WidgetAspectsCompactV2ImageLayoutBinding, Unit> {
    final /* synthetic */ AspectsImageVariantV2VO $this_setContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV2ImageViewHolder$setContent$1(AspectsImageVariantV2VO aspectsImageVariantV2VO) {
        super(1);
        this.$this_setContent = aspectsImageVariantV2VO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsCompactV2ImageLayoutBinding widgetAspectsCompactV2ImageLayoutBinding) {
        invoke2(widgetAspectsCompactV2ImageLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsCompactV2ImageLayoutBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        AspectsImageVariantV2VO.ImageVariant imageVariant = this.$this_setContent.getImageVariant();
        if (imageVariant instanceof AspectsImageVariantV2VO.ImageVariant.Image) {
            ShapeableImageView shapeableImageView = binding.imageView;
            AspectsImageVariantV2VO aspectsImageVariantV2VO = this.$this_setContent;
            Intrinsics.f(shapeableImageView);
            ImageViewExtKt.loadImageOrGone(shapeableImageView, ((AspectsImageVariantV2VO.ImageVariant.Image) aspectsImageVariantV2VO.getImageVariant()).getImageUrl());
            shapeableImageView.setAlpha(aspectsImageVariantV2VO.getIsAvailable() ? 1.0f : 0.5f);
            SquareAspectColorVariantView colorView = binding.colorView;
            Intrinsics.checkNotNullExpressionValue(colorView, "colorView");
            ViewExtKt.gone(colorView);
            return;
        }
        if (!(imageVariant instanceof AspectsImageVariantV2VO.ImageVariant.Color)) {
            throw new o();
        }
        SquareAspectColorVariantView squareAspectColorVariantView = binding.colorView;
        AspectsImageVariantV2VO aspectsImageVariantV2VO2 = this.$this_setContent;
        squareAspectColorVariantView.setColors(((AspectsImageVariantV2VO.ImageVariant.Color) aspectsImageVariantV2VO2.getImageVariant()).getColors());
        squareAspectColorVariantView.setAlpha(aspectsImageVariantV2VO2.getIsAvailable() ? 1.0f : 0.5f);
        ViewExtKt.show(squareAspectColorVariantView);
        ShapeableImageView imageView = binding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ViewExtKt.gone(imageView);
    }
}
