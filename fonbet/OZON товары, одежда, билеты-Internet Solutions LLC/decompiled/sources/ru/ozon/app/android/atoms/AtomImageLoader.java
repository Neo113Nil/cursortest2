package ru.ozon.app.android.atoms;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.utils.ContextExtKt;
import ru.ozon.app.android.utils.ThreadUtilsKt;
import ru.ozon.uni.R$dimen;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.common.ImageLoader;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J@\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00050\u0010H\u0016J\u001a\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/atoms/AtomImageLoader;", "Lru/ozon/uni/atoms/common/ImageLoader;", "<init>", "()V", "load", "", "imageView", "Landroid/widget/ImageView;", ImagesContract.URL, "", "context", "Landroid/content/Context;", "imageWidth", "", "imageHeight", "block", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "loadRoundCorners", "loadCircle", "loadCropInDark", "loadCropAndRoundInDark", "isImageLoadingAllowed", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AtomImageLoader implements ImageLoader {
    private final boolean isImageLoadingAllowed(Context context) {
        return ThreadUtilsKt.isCurrentThreadMain() && !ContextExtKt.isDestroyed(context);
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void load(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isImageLoadingAllowed(context)) {
            ImageViewExtKt.load$default(imageView, url, null, null, null, null, false, null, 126, null);
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadCircle(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isImageLoadingAllowed(context)) {
            ImageViewExtKt.loadCircleImage$default(imageView, url, null, 2, null);
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadCropAndRoundInDark(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isImageLoadingAllowed(context)) {
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (!ThemeExtKt.isDarkThemeActive(context2)) {
                loadRoundCorners(imageView, url);
            } else {
                ImageViewExtKt.load$default(imageView, url, C7714v.b0(ImageTransformation.CropOnWhite.INSTANCE, new ImageTransformation.RoundedCorners(R$dimen.design_default_radius, null, 2, null)), null, null, null, false, null, 124, null);
                ThemeExtKt.setParandjaForDarkTheme(imageView);
            }
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadCropInDark(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isImageLoadingAllowed(context)) {
            Context context2 = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (!ThemeExtKt.isDarkThemeActive(context2)) {
                load(imageView, url);
            } else {
                ImageViewExtKt.load$default(imageView, url, C7714v.a0(ImageTransformation.CropOnWhite.INSTANCE), null, null, null, false, null, 124, null);
                ThemeExtKt.setParandjaForDarkTheme(imageView);
            }
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void loadRoundCorners(@NotNull ImageView imageView, String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (isImageLoadingAllowed(context)) {
            ImageViewExtKt.loadWithRoundCornersRes(imageView, url, Integer.valueOf(R$dimen.design_default_radius));
        }
    }

    @Override // ru.ozon.uni.atoms.common.ImageLoader
    public void load(@NotNull Context context, String url, int imageWidth, int imageHeight, @NotNull final Function1<? super Drawable, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (isImageLoadingAllowed(context)) {
            ru.ozon.app.android.pikazon.extensions.ContextExtKt.load(context, url, (r15 & 2) != 0 ? K.f71697a : null, (r15 & 4) != 0 ? null : new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.atoms.AtomImageLoader$load$1
                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadFailed(Exception exc) {
                    PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
                }

                @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
                public void onLoadSuccessful(Drawable resource) {
                    PikazonLoaderCallback.DefaultImpls.onLoadSuccessful(this, resource);
                    block.invoke(resource);
                }
            }, (r15 & 8) != 0 ? null : null, (r15 & 16) != 0 ? LoadPriority.NORMAL : null, (r15 & 32) != 0 ? false : false, (r15 & 64) != 0 ? null : new ImageSize(imageWidth, imageHeight));
        }
    }
}
