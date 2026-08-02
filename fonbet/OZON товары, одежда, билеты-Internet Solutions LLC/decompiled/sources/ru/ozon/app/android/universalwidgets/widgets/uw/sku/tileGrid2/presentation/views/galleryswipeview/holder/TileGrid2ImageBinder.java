package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.product.utils.ImageLoadExtKt;
import ru.ozon.app.android.universalwidgets.R$drawable;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.AspectRatioImageWithBgView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/galleryswipeview/holder/TileGrid2ImageBinder;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;", "imageView", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "imageCache", "", "isGalleryOverdrawEnabled", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "imageSizeCalculator", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;ZLru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;)V", "Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;", "image", "", "loadImage", "(Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;)V", "bindBackgroundColors", "setImageParams", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;Lru/ozon/app/android/product/tiles/tilegrid2/presentation/views/galleryswipeview/data/TileGrid2GalleryModel$Image;)V", "bind", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/views/image/AspectRatioImageWithBgView;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/cache/image/TileGrid2ImageCache;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tileGrid2/presentation/prefetch/TileGrid2ImageSizeCalculator;", "Landroid/graphics/drawable/Drawable;", "paranjaDrawable$delegate", "LSc/j;", "getParanjaDrawable", "()Landroid/graphics/drawable/Drawable;", "paranjaDrawable", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "getContext", "()Landroid/content/Context;", "context", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TileGrid2ImageBinder {

    @NotNull
    private final TileGrid2ImageCache imageCache;
    private final TileGrid2ImageSizeCalculator imageSizeCalculator;

    @NotNull
    private final AspectRatioImageWithBgView imageView;

    /* renamed from: paranjaDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paranjaDrawable;

    public TileGrid2ImageBinder(@NotNull AspectRatioImageWithBgView imageView, @NotNull TileGrid2ImageCache imageCache, boolean z11, TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.imageView = imageView;
        this.imageCache = imageCache;
        this.imageSizeCalculator = tileGrid2ImageSizeCalculator;
        this.paranjaDrawable = k.b(new TileGrid2ImageBinder$paranjaDrawable$2(this));
        if (z11) {
            imageView.setBackground(a.getDrawable(getContext(), R$drawable.bg_white_color));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBackgroundColors(TileGrid2GalleryModel.Image image) {
        AspectRatioImageWithBgView aspectRatioImageWithBgView = this.imageView;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "<get-context>(...)");
        Integer parseColor = styleParser.parseColor(context, image.getTopBgColor());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "<get-context>(...)");
        aspectRatioImageWithBgView.bindBackgroundColors(parseColor, styleParser.parseColor(context2, image.getBottomBgColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        return this.imageView.getContext();
    }

    private final Drawable getParanjaDrawable() {
        return (Drawable) this.paranjaDrawable.getValue();
    }

    private final void loadImage(TileGrid2GalleryModel.Image image) {
        ImageLoadExtKt.loadImageWithCrossFadeSafely$default(this.imageView, image.getUrl(), null, new TileGrid2ImageBinder$loadImage$1(this, image), null, 10, null);
    }

    private final void setImageParams(AspectRatioImageWithBgView aspectRatioImageWithBgView, TileGrid2GalleryModel.Image image) {
        aspectRatioImageWithBgView.setRatio(Float.valueOf(image.getRatio()));
        aspectRatioImageWithBgView.setAlpha(image.getAlpha());
        aspectRatioImageWithBgView.setScaleType(image.getScaleType());
    }

    public final void bind(@NotNull TileGrid2GalleryModel.Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        AspectRatioImageWithBgView aspectRatioImageWithBgView = this.imageView;
        aspectRatioImageWithBgView.bindBackgroundColors(null, null);
        setImageParams(aspectRatioImageWithBgView, image);
        aspectRatioImageWithBgView.setForeground(image.getEnableParanja() ? getParanjaDrawable() : null);
        BitmapDrawable image2 = this.imageCache.getImage(image.getUrl());
        if (image2 == null) {
            loadImage(image);
            return;
        }
        ImageViewExtKt.clearResource(this.imageView);
        this.imageView.setImageDrawable(image2);
        bindBackgroundColors(image);
    }

    public /* synthetic */ TileGrid2ImageBinder(AspectRatioImageWithBgView aspectRatioImageWithBgView, TileGrid2ImageCache tileGrid2ImageCache, boolean z11, TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aspectRatioImageWithBgView, tileGrid2ImageCache, (i11 & 4) != 0 ? true : z11, tileGrid2ImageSizeCalculator);
    }
}
