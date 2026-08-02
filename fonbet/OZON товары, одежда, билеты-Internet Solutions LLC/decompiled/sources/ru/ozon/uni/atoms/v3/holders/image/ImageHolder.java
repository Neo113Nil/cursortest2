package ru.ozon.uni.atoms.v3.holders.image;

import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/image/ImageHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/image/Image;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageHolder extends AtomV3<ImageDTO, Image> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageHolder(@NotNull Image view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageHolder(@NotNull Context context, String str) {
        this(new Image(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ImageDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ImageHolder) item);
        Image containerView = getContainerView();
        ImageViewExtKt.clearResource(containerView);
        boolean z11 = false;
        containerView.layout(0, 0, 0, 0);
        ImageDTO.ImageType imageType = item.getImageType();
        if ((imageType != null && imageType.getIsFixed()) || (item.getImageType() == null && item.getImageWidth() != null)) {
            z11 = true;
        }
        containerView.setFixedMode(z11);
        ImageAspectRatio aspectRatio = item.getAspectRatio();
        if (aspectRatio == null) {
            aspectRatio = ImageAspectRatio.RATIO_1_1;
        }
        if (z11) {
            Integer imageWidth = item.getImageWidth();
            containerView.setSize(imageWidth != null ? imageWidth.intValue() : 168, aspectRatio);
        } else {
            containerView.setRatio(aspectRatio);
        }
        ImageDTO.CustomRatio customRatio = item.getCustomRatio();
        if (customRatio != null) {
            containerView.setCustomRatio(customRatio.getWidth(), customRatio.getHeight());
        }
        int cellLayoutPadding = CommonCellSettings.LayoutPadding.NONE.getCellLayoutPadding();
        CommonCellSettings.LayoutPadding layoutPaddingLeft = item.getLayoutPaddingLeft();
        int cellLayoutPadding2 = layoutPaddingLeft != null ? layoutPaddingLeft.getCellLayoutPadding() : cellLayoutPadding;
        CommonCellSettings.LayoutPadding layoutPaddingTop = item.getLayoutPaddingTop();
        int cellLayoutPadding3 = layoutPaddingTop != null ? layoutPaddingTop.getCellLayoutPadding() : cellLayoutPadding;
        CommonCellSettings.LayoutPadding layoutPaddingRight = item.getLayoutPaddingRight();
        int cellLayoutPadding4 = layoutPaddingRight != null ? layoutPaddingRight.getCellLayoutPadding() : cellLayoutPadding;
        CommonCellSettings.LayoutPadding layoutPaddingBottom = item.getLayoutPaddingBottom();
        if (layoutPaddingBottom != null) {
            cellLayoutPadding = layoutPaddingBottom.getCellLayoutPadding();
        }
        containerView.m1673setPaddingBzXJzOA(cellLayoutPadding2, cellLayoutPadding3, cellLayoutPadding4, cellLayoutPadding);
        CornerRadius cornerRadius = item.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.NO_RADIUS;
        }
        containerView.setCornerRadius(cornerRadius);
        containerView.setHasParanja(item.getHasParanja());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, item.getBackgroundColor());
        if (mapColor != null) {
            containerView.setImageBackgroundColor(a.getColor(containerView.getContext(), mapColor.intValue()));
        }
        ImageViewExtKt.load$default(containerView, item.getImage(), C7714v.m0(item.getFitType() == ImageDTO.FitType.FIT_CENTER ? ImageTransformation.FitCenter.INSTANCE : ImageTransformation.CenterCrop.INSTANCE), null, null, null, false, null, 124, null);
    }
}
