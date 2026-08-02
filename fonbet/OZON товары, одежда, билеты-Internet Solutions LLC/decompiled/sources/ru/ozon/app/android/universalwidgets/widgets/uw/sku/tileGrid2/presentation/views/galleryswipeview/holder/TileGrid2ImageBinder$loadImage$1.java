package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.product.tiles.tilegrid2.presentation.views.galleryswipeview.data.TileGrid2GalleryModel;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.cache.image.TileGrid2ImageCache;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.prefetch.TileGrid2ImageSizeCalculator;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.image.AspectRatioImageWithBgView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2ImageBinder$loadImage$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ TileGrid2GalleryModel.Image $image;
    final /* synthetic */ TileGrid2ImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileGrid2ImageBinder$loadImage$1(TileGrid2ImageBinder tileGrid2ImageBinder, TileGrid2GalleryModel.Image image) {
        super(0);
        this.this$0 = tileGrid2ImageBinder;
        this.$image = image;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AspectRatioImageWithBgView aspectRatioImageWithBgView;
        TileGrid2ImageSizeCalculator tileGrid2ImageSizeCalculator;
        ImageSize imageSize;
        Context context;
        aspectRatioImageWithBgView = this.this$0.imageView;
        String url = this.$image.getUrl();
        tileGrid2ImageSizeCalculator = this.this$0.imageSizeCalculator;
        if (tileGrid2ImageSizeCalculator != null) {
            float ratio = this.$image.getRatio();
            context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "access$getContext(...)");
            imageSize = tileGrid2ImageSizeCalculator.calculate(ratio, context);
        } else {
            imageSize = null;
        }
        final TileGrid2ImageBinder tileGrid2ImageBinder = this.this$0;
        final TileGrid2GalleryModel.Image image = this.$image;
        ImageViewExtKt.loadWithCrossFade(aspectRatioImageWithBgView, url, imageSize, new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.holder.TileGrid2ImageBinder$loadImage$1.1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                TileGrid2ImageCache tileGrid2ImageCache;
                TileGrid2ImageBinder.this.bindBackgroundColors(image);
                BitmapDrawable bitmapDrawable = resource instanceof BitmapDrawable ? (BitmapDrawable) resource : null;
                if (bitmapDrawable != null) {
                    TileGrid2ImageBinder tileGrid2ImageBinder2 = TileGrid2ImageBinder.this;
                    TileGrid2GalleryModel.Image image2 = image;
                    tileGrid2ImageCache = tileGrid2ImageBinder2.imageCache;
                    tileGrid2ImageCache.saveImage(image2.getUrl(), bitmapDrawable);
                }
            }
        });
    }
}
