package ru.ozon.app.android.travel.utils.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.image.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageAspectRatio;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u001a\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\n¨\u0006\u000b"}, d2 = {"bindWithCallback", "", "Lru/ozon/uni/android/atom/image/Image;", "item", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "callback", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "createAdaptiveImageCallback", "showPlaceholder", "Landroidx/appcompat/widget/AppCompatImageView;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageExtensionsKt {
    public static final void bindWithCallback(@NotNull Image image, @NotNull ImageDTO item, PikazonLoaderCallback<Drawable> pikazonLoaderCallback) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.clearResource(image);
        boolean z11 = false;
        image.layout(0, 0, 0, 0);
        ImageDTO.ImageType imageType = item.getImageType();
        if ((imageType != null && imageType.getIsFixed()) || (item.getImageType() == null && item.getImageWidth() != null)) {
            z11 = true;
        }
        image.setFixedMode(z11);
        ImageAspectRatio aspectRatio = item.getAspectRatio();
        if (aspectRatio == null) {
            aspectRatio = ImageAspectRatio.RATIO_1_1;
        }
        if (z11) {
            Integer imageWidth = item.getImageWidth();
            image.setSize(imageWidth != null ? imageWidth.intValue() : 168, aspectRatio);
        } else {
            image.setRatio(aspectRatio);
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
        image.m1673setPaddingBzXJzOA(cellLayoutPadding2, cellLayoutPadding3, cellLayoutPadding4, cellLayoutPadding);
        CornerRadius cornerRadius = item.getCornerRadius();
        if (cornerRadius == null) {
            cornerRadius = CornerRadius.NO_RADIUS;
        }
        image.setCornerRadius(cornerRadius);
        image.setHasParanja(item.getHasParanja());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = image.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, item.getBackgroundColor());
        if (mapColor != null) {
            image.setImageBackgroundColor(image.getContext().getColor(mapColor.intValue()));
        }
        ImageViewExtKt.load$default(image, item.getImage(), null, pikazonLoaderCallback, null, null, false, null, 122, null);
    }

    @NotNull
    public static final PikazonLoaderCallback<Drawable> createAdaptiveImageCallback(@NotNull final Image image) {
        Intrinsics.checkNotNullParameter(image, "<this>");
        return new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.travel.utils.extensions.ImageExtensionsKt$createAdaptiveImageCallback$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                ImageExtensionsKt.showPlaceholder(Image.this);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                Image.this.clearColorFilter();
                Image.this.setScaleType((resource != null ? resource.getIntrinsicHeight() : 0) > (resource != null ? resource.getIntrinsicWidth() : 0) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
            }
        };
    }

    public static final void showPlaceholder(@NotNull final AppCompatImageView appCompatImageView) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "<this>");
        appCompatImageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.utils.extensions.ImageExtensionsKt$showPlaceholder$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnLayoutChangeListener(this);
                AppCompatImageView.this.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ru.ozon.uni.android.uikit.extensions.view.ImageViewExtKt.setVectorDrawable(AppCompatImageView.this, R$drawable.ic_m_no_photo);
                AppCompatImageView appCompatImageView2 = AppCompatImageView.this;
                Context context = appCompatImageView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ThemeExtKt.tint(appCompatImageView2, Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.graphicTertiaryOnLight)));
            }
        });
    }
}
