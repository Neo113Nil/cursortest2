package ru.ozon.app.android.product.imagesswipeview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.R$drawable;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0010¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultServerBlurImageView;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindWithBlur", "", "image", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "bindWithBlur$product_prodGoogleAllVendorsRelease", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdultServerBlurImageView extends AdultImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdultServerBlurImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.product.imagesswipeview.AdultImageView
    public void bindWithBlur$product_prodGoogleAllVendorsRelease(@NotNull AdultImageView.Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        ImageViewExtKt.clearResource(getImageIv());
        getImageIv().setScaleType(ImageView.ScaleType.CENTER_CROP);
        ImageViewExtKt.load$default(getImageIv(), image.getBlurPlaceholderImage(), C7714v.a0(ImageTransformation.CenterCrop.INSTANCE), new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.product.imagesswipeview.AdultServerBlurImageView$bindWithBlur$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, e11);
                AdultServerBlurImageView.this.getImageIv().setImageResource(R$drawable.bg_image_white_overlay);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable drawable) {
                PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, drawable);
            }
        }, null, null, false, null, 120, null);
    }

    public /* synthetic */ AdultServerBlurImageView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdultServerBlurImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
