package ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle;

import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.AspectsImageTitleVariantV2VO;
import ru.ozon.app.android.pdp.ui.configurators.databinding.WidgetAspectsV2TextImageLayoutBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/databinding/WidgetAspectsV2TextImageLayoutBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ImageTitleVariantV2ViewHolder$bind$1 extends AbstractC7737t implements Function1<WidgetAspectsV2TextImageLayoutBinding, Unit> {
    final /* synthetic */ AspectsCompactVO$Variant $item;
    final /* synthetic */ ImageTitleVariantV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageTitleVariantV2ViewHolder$bind$1(AspectsCompactVO$Variant aspectsCompactVO$Variant, ImageTitleVariantV2ViewHolder imageTitleVariantV2ViewHolder) {
        super(1);
        this.$item = aspectsCompactVO$Variant;
        this.this$0 = imageTitleVariantV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WidgetAspectsV2TextImageLayoutBinding widgetAspectsV2TextImageLayoutBinding) {
        invoke2(widgetAspectsV2TextImageLayoutBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WidgetAspectsV2TextImageLayoutBinding binding) {
        String imageUrl;
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        AspectsCompactVO$Variant aspectsCompactVO$Variant = this.$item;
        AspectsImageTitleVariantV2VO aspectsImageTitleVariantV2VO = aspectsCompactVO$Variant instanceof AspectsImageTitleVariantV2VO ? (AspectsImageTitleVariantV2VO) aspectsCompactVO$Variant : null;
        if (aspectsImageTitleVariantV2VO != null) {
            ImageTitleVariantV2ViewHolder imageTitleVariantV2ViewHolder = this.this$0;
            TextAtomV2View titleTav = binding.titleTav;
            Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
            imageTitleVariantV2ViewHolder.setTitle(aspectsImageTitleVariantV2VO, titleTav);
            imageTitleVariantV2ViewHolder.bindSelection(aspectsImageTitleVariantV2VO);
            AspectsImageTitleVariantV2VO.ImageVariant imageVariant = aspectsImageTitleVariantV2VO.getImageVariant();
            AspectsImageTitleVariantV2VO.ImageVariant.Image image = imageVariant instanceof AspectsImageTitleVariantV2VO.ImageVariant.Image ? (AspectsImageTitleVariantV2VO.ImageVariant.Image) imageVariant : null;
            if (image == null || (imageUrl = image.getImageUrl()) == null) {
                ShapeableImageView imageView = binding.imageView;
                Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
                ViewExtKt.gone(imageView);
            } else if (imageUrl.length() <= 0) {
                ShapeableImageView imageView2 = binding.imageView;
                Intrinsics.checkNotNullExpressionValue(imageView2, "imageView");
                ViewExtKt.gone(imageView2);
            } else {
                ShapeableImageView shapeableImageView = binding.imageView;
                Intrinsics.f(shapeableImageView);
                ImageViewExtKt.loadImageOrGone(shapeableImageView, imageUrl);
                shapeableImageView.setAlpha(aspectsImageTitleVariantV2VO.getIsAvailable() ? 1.0f : 0.5f);
            }
        }
    }
}
