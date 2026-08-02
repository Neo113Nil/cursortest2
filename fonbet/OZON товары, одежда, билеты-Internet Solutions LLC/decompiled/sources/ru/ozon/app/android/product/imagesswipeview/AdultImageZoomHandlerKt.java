package ru.ozon.app.android.product.imagesswipeview;

import De.C2862e;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ContextExtKt;
import ru.ozon.app.android.product.imagesswipeview.AdultImageView;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u0011\u001a\u00020\u0005*\u00020\u000b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/product/imagesswipeview/AdultImageView;", "Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;", "image", "Landroid/widget/ImageView;", "zoomableImageView", "", "onZoomStarted", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView;Lru/ozon/app/android/product/imagesswipeview/AdultImageView$Image;Landroid/widget/ImageView;)V", "Lru/ozon/app/android/product/imagesswipeview/ImageSize;", "calculateRelativeFullScreenSize", "(Lru/ozon/app/android/product/imagesswipeview/AdultImageView;)Lru/ozon/app/android/product/imagesswipeview/ImageSize;", "Landroid/view/View;", "Lkotlin/Function2;", "Lxe/M;", "Lkotlin/coroutines/d;", "", "block", "onBackground", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdultImageZoomHandlerKt {
    private static final ImageSize calculateRelativeFullScreenSize(AdultImageView adultImageView) {
        int i11;
        int i12;
        float f7;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int width = displayMetrics.widthPixels - adultImageView.getWidth();
        int height = displayMetrics.heightPixels - adultImageView.getHeight();
        float width2 = adultImageView.getWidth() / adultImageView.getHeight();
        if (width > height) {
            i12 = adultImageView.getWidth() + ((int) (height * width2));
            i11 = displayMetrics.heightPixels;
            f7 = i11 / adultImageView.getHeight();
        } else {
            int i13 = displayMetrics.widthPixels;
            int height2 = ((int) (width / width2)) + adultImageView.getHeight();
            float width3 = displayMetrics.widthPixels / adultImageView.getWidth();
            i11 = height2;
            i12 = i13;
            f7 = width3;
        }
        return new ImageSize(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824), f7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$OnAttachStateChangeListener, ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onBackground$listener$1] */
    public static final void onBackground(final View view, Function2<? super M, ? super d<? super Unit>, ? extends Object> function2) {
        final C2862e a11 = N.a(C10720e0.a());
        ?? r12 = new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.product.imagesswipeview.AdultImageZoomHandlerKt$onBackground$listener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v11) {
                Intrinsics.checkNotNullParameter(v11, "v");
                N.c(M.this, null);
                view.removeOnAttachStateChangeListener(this);
            }
        };
        view.addOnAttachStateChangeListener(r12);
        C10727i.c(a11, null, null, new AdultImageZoomHandlerKt$onBackground$1(function2, view, r12, null), 3);
    }

    public static final void onZoomStarted(@NotNull AdultImageView adultImageView, @NotNull AdultImageView.Image image, @NotNull ImageView zoomableImageView) {
        Intrinsics.checkNotNullParameter(adultImageView, "<this>");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(zoomableImageView, "zoomableImageView");
        ImageSize calculateRelativeFullScreenSize = calculateRelativeFullScreenSize(adultImageView);
        Context context = adultImageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AdultImageView adultImageView2 = new AdultImageView(context, null, 0, 6, null);
        adultImageView2.bind(AdultImageView.Image.copy$default(image, null, null, 0.0f, false, false, false, null, null, ImageView.ScaleType.FIT_CENTER, false, null, false, 3327, null));
        adultImageView2.setRadiusMultiplier$product_prodGoogleAllVendorsRelease(calculateRelativeFullScreenSize.getUpscaleFactor());
        adultImageView2.measure(calculateRelativeFullScreenSize.getWidthMeasureSpec(), calculateRelativeFullScreenSize.getHeightMeasureSpec());
        adultImageView2.layout(0, 0, adultImageView2.getMeasuredWidth(), adultImageView2.getMeasuredHeight());
        Context context2 = adultImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ContextExtKt.loadOriginalBitmap$default(context2, image.getUrl(), null, null, null, new AdultImageZoomHandlerKt$onZoomStarted$1$1(adultImageView2, zoomableImageView), 14, null);
    }
}
