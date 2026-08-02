package ru.ozon.uni.atoms.v3.holders.image;

import Sc.InterfaceC3999a;
import android.content.Context;
import androidx.core.content.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.uni.android.atom.image.ImageFixed;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageFixedDTO;
import ru.ozon.uni.atoms.v3.AtomV3;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/image/ImageFixedHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/image/ImageFixedDTO;", "Lru/ozon/uni/android/atom/image/ImageFixed;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/atom/image/ImageFixed;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageFixedHolder extends AtomV3<ImageFixedDTO, ImageFixed> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageFixedHolder(@NotNull ImageFixed view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageFixedHolder(@NotNull Context context, String str) {
        this(new ImageFixed(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ImageFixedDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ImageFixedHolder) item);
        ImageFixed containerView = getContainerView();
        int imageWidth = item.getImageWidth();
        ImageAspectRatio aspectRatio = item.getAspectRatio();
        if (aspectRatio == null) {
            aspectRatio = ImageAspectRatio.RATIO_1_1;
        }
        containerView.setImageSize(imageWidth, aspectRatio);
        CommonCellSettings.LayoutPadding layoutPaddingTop = item.getLayoutPaddingTop();
        if (layoutPaddingTop == null) {
            layoutPaddingTop = CommonCellSettings.LayoutPadding.NONE;
        }
        int cellLayoutPadding = layoutPaddingTop.getCellLayoutPadding();
        CommonCellSettings.LayoutPadding layoutPaddingBottom = item.getLayoutPaddingBottom();
        if (layoutPaddingBottom == null) {
            layoutPaddingBottom = CommonCellSettings.LayoutPadding.NONE;
        }
        containerView.m1674setPaddingiecL5Sw(cellLayoutPadding, layoutPaddingBottom.getCellLayoutPadding());
        containerView.setHasParanja(item.getHasParanja());
        CornerRadius cornerRadius = item.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.NO_RADIUS;
        }
        containerView.setCornerRadius(cornerRadius);
        ArrayList m02 = C7714v.m0(ImageTransformation.CenterCrop.INSTANCE);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, item.getBackgroundColor());
        if (mapColor != null) {
            containerView.setImageBackgroundColor(a.getColor(containerView.getContext(), mapColor.intValue()));
        }
        ImageViewExtKt.load$default(containerView, item.getImage(), m02, null, null, null, false, null, 124, null);
    }
}
