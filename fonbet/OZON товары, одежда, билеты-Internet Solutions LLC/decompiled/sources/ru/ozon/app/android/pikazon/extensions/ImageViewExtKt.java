package ru.ozon.app.android.pikazon.extensions;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import android.widget.ImageView;
import androidx.core.content.a;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.internal.StringExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a]\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015\u001aG\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0018\u001aG\u0010\u0019\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001c\u001a\u00020\u0011*\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001d\u001a'\u0010\u001f\u001a\u00020\u0011*\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010\u001d\u001a'\u0010 \u001a\u00020\u0011*\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b \u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"\u001a9\u0010#\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b#\u0010$\u001aE\u0010%\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010'\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010\"\u001a\u001b\u0010(\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b(\u0010\"\u001a\u0011\u0010)\u001a\u00020\u0011*\u00020\u0000¢\u0006\u0004\b)\u0010*\u001a#\u0010-\u001a\u00020\u0011*\u00020\u00002\u0006\u0010+\u001a\u00020\r2\b\b\u0001\u0010,\u001a\u00020\t¢\u0006\u0004\b-\u0010.\u001a!\u0010/\u001a\u00020\u0011*\u00020\u00002\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b/\u0010.\u001aQ\u00102\u001a\u00020\u0011*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Landroid/widget/ImageView;", "", "imageUrl", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "Landroid/graphics/drawable/Drawable;", "callback", "", "placeholderRes", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "", "withCrossFade", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "loadPriority", "", "load", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;Lru/ozon/app/android/pikazon/image/ImageSize;ZLru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", "loadOriginal", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;ZLru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)V", "loadAsBitmap", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", ImagesContract.URL, "loadCircleImage", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "radius", "loadWithRoundCorners", "loadWithRoundCornersRes", "loadWithPlaceholder", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "loadWithCrossFade", "(Landroid/widget/ImageView;Ljava/lang/String;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;)V", "loadWithBlur", "(Landroid/widget/ImageView;Ljava/lang/String;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;)V", "loadImageOrGone", "loadImageOrInvisible", "clearResource", "(Landroid/widget/ImageView;)V", "shouldOverlay", "color", "setOverlay", "(Landroid/widget/ImageView;ZI)V", "setOverlayColor", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "inscribedUrlProcessor", "loadAsBitmapInscribedSize", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;)V", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageViewExtKt {
    public static final void clearResource(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        c.o(imageView).clear(imageView);
    }

    public static final void load(@NotNull ImageView imageView, String str, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Drawable> pikazonLoaderCallback, Integer num, ImageSize imageSize, boolean z11, @NotNull LoadPriority loadPriority) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        if (URLUtil.isNetworkUrl(str)) {
            ViewExtKt.trackPlaceholderVisibility(imageView);
        }
        ru.ozon.app.android.pikazon.extensions.internal.ImageViewExtKt.loadResource(imageView, str, Drawable.class, imageSize, transformations, pikazonLoaderCallback, num, z11, loadPriority);
    }

    public static void load$default(ImageView imageView, String str, List list, PikazonLoaderCallback pikazonLoaderCallback, Integer num, ImageSize imageSize, boolean z11, LoadPriority loadPriority, int i11, Object obj) {
        load(imageView, str, (i11 & 2) != 0 ? K.f71697a : list, (i11 & 4) != 0 ? null : pikazonLoaderCallback, (i11 & 8) != 0 ? null : num, (i11 & 16) == 0 ? imageSize : null, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? LoadPriority.NORMAL : loadPriority);
    }

    public static final void loadAsBitmap(@NotNull ImageView imageView, String str, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Bitmap> pikazonLoaderCallback, @NotNull LoadPriority loadPriority) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        ru.ozon.app.android.pikazon.extensions.internal.ImageViewExtKt.loadResource(imageView, str, Bitmap.class, null, transformations, pikazonLoaderCallback, null, false, loadPriority);
    }

    public static void loadAsBitmap$default(ImageView imageView, String str, List list, PikazonLoaderCallback pikazonLoaderCallback, LoadPriority loadPriority, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = K.f71697a;
        }
        if ((i11 & 4) != 0) {
            pikazonLoaderCallback = null;
        }
        if ((i11 & 8) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        loadAsBitmap(imageView, str, list, pikazonLoaderCallback, loadPriority);
    }

    public static final void loadAsBitmapInscribedSize(@NotNull ImageView imageView, String str, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Bitmap> pikazonLoaderCallback, @NotNull LoadPriority loadPriority, @NotNull InscribedUrlProcessor inscribedUrlProcessor) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        Intrinsics.checkNotNullParameter(inscribedUrlProcessor, "inscribedUrlProcessor");
        ru.ozon.app.android.pikazon.extensions.internal.ImageViewExtKt.loadResource(imageView, inscribedUrlProcessor.computeUrl(str), Bitmap.class, null, transformations, pikazonLoaderCallback, null, false, loadPriority);
    }

    public static void loadAsBitmapInscribedSize$default(ImageView imageView, String str, List list, PikazonLoaderCallback pikazonLoaderCallback, LoadPriority loadPriority, InscribedUrlProcessor inscribedUrlProcessor, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = K.f71697a;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            pikazonLoaderCallback = null;
        }
        PikazonLoaderCallback pikazonLoaderCallback2 = pikazonLoaderCallback;
        if ((i11 & 8) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        LoadPriority loadPriority2 = loadPriority;
        if ((i11 & 16) != 0) {
            inscribedUrlProcessor = InscribedUrlProcessor.InscribedNormal.INSTANCE;
        }
        loadAsBitmapInscribedSize(imageView, str, list2, pikazonLoaderCallback2, loadPriority2, inscribedUrlProcessor);
    }

    public static final void loadCircleImage(@NotNull ImageView imageView, String str, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        load$default(imageView, str, C7714v.a0(ImageTransformation.CircleCrop.INSTANCE), null, num, null, false, null, 116, null);
    }

    public static /* synthetic */ void loadCircleImage$default(ImageView imageView, String str, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        loadCircleImage(imageView, str, num);
    }

    public static final void loadImageOrGone(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null || str.length() == 0) {
            ru.ozon.app.android.pikazon.extensions.internal.ViewExtKt.gone(imageView);
        } else {
            load$default(imageView, str, null, null, null, null, false, null, 126, null);
            ru.ozon.app.android.pikazon.extensions.internal.ViewExtKt.show(imageView);
        }
    }

    public static final void loadImageOrInvisible(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null || str.length() == 0) {
            ru.ozon.app.android.pikazon.extensions.internal.ViewExtKt.invisible(imageView);
        } else {
            load$default(imageView, str, null, null, null, null, false, null, 126, null);
            ru.ozon.app.android.pikazon.extensions.internal.ViewExtKt.show(imageView);
        }
    }

    public static final void loadOriginal(@NotNull ImageView imageView, String str, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Drawable> pikazonLoaderCallback, Integer num, boolean z11, @NotNull LoadPriority loadPriority) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        ru.ozon.app.android.pikazon.extensions.internal.ImageViewExtKt.loadResource(imageView, str != null ? StringExtKt.ignoreResize(str) : null, Drawable.class, null, transformations, pikazonLoaderCallback, num, z11, loadPriority);
    }

    public static void loadOriginal$default(ImageView imageView, String str, List list, PikazonLoaderCallback pikazonLoaderCallback, Integer num, boolean z11, LoadPriority loadPriority, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = K.f71697a;
        }
        List list2 = list;
        PikazonLoaderCallback pikazonLoaderCallback2 = (i11 & 4) != 0 ? null : pikazonLoaderCallback;
        Integer num2 = (i11 & 8) != 0 ? null : num;
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        loadOriginal(imageView, str, list2, pikazonLoaderCallback2, num2, z12, loadPriority);
    }

    public static final void loadWithBlur(@NotNull ImageView imageView, String str, ImageSize imageSize, PikazonLoaderCallback<Drawable> pikazonLoaderCallback, Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        int i11 = 0;
        load$default(imageView, str, C7714v.a0(new ImageTransformation.Blur(i11, i11, 3, null)), pikazonLoaderCallback, num, imageSize, false, null, 96, null);
    }

    public static /* synthetic */ void loadWithBlur$default(ImageView imageView, String str, ImageSize imageSize, PikazonLoaderCallback pikazonLoaderCallback, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            imageSize = null;
        }
        if ((i11 & 4) != 0) {
            pikazonLoaderCallback = null;
        }
        if ((i11 & 8) != 0) {
            num = null;
        }
        loadWithBlur(imageView, str, imageSize, pikazonLoaderCallback, num);
    }

    public static final void loadWithCrossFade(@NotNull ImageView imageView, String str, ImageSize imageSize, PikazonLoaderCallback<Drawable> pikazonLoaderCallback) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        load$default(imageView, str, null, pikazonLoaderCallback, null, imageSize, true, null, 74, null);
    }

    public static /* synthetic */ void loadWithCrossFade$default(ImageView imageView, String str, ImageSize imageSize, PikazonLoaderCallback pikazonLoaderCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            imageSize = null;
        }
        if ((i11 & 4) != 0) {
            pikazonLoaderCallback = null;
        }
        loadWithCrossFade(imageView, str, imageSize, pikazonLoaderCallback);
    }

    public static final void loadWithPlaceholder(@NotNull ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        load$default(imageView, str, null, null, Integer.valueOf(Pikazon.INSTANCE.getInstance().getConfig().getDefaultImage()), null, false, null, 118, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void loadWithRoundCorners(@NotNull ImageView imageView, String str, Integer num) {
        ImageTransformation.RoundedCorners roundedCorners;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ImageTransformation.RoundedCorners.CornerType cornerType = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (num != null) {
            roundedCorners = new ImageTransformation.RoundedCorners(num.intValue(), cornerType, 2, objArr3 == true ? 1 : 0);
        } else {
            roundedCorners = new ImageTransformation.RoundedCorners(0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
        load$default(imageView, str, C7714v.a0(roundedCorners), null, null, null, false, null, 124, null);
    }

    public static /* synthetic */ void loadWithRoundCorners$default(ImageView imageView, String str, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        loadWithRoundCorners(imageView, str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void loadWithRoundCornersRes(@NotNull ImageView imageView, String str, Integer num) {
        ImageTransformation.RoundedCorners roundedCorners;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ImageTransformation.RoundedCorners.CornerType cornerType = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (num != null) {
            roundedCorners = new ImageTransformation.RoundedCorners(imageView.getContext().getResources().getDimensionPixelSize(num.intValue()), cornerType, 2, objArr3 == true ? 1 : 0);
        } else {
            roundedCorners = new ImageTransformation.RoundedCorners(0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
        load$default(imageView, str, C7714v.a0(roundedCorners), null, null, null, false, null, 124, null);
    }

    public static /* synthetic */ void loadWithRoundCornersRes$default(ImageView imageView, String str, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        loadWithRoundCornersRes(imageView, str, num);
    }

    public static final void setOverlay(@NotNull ImageView imageView, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (z11) {
            imageView.setColorFilter(a.getColor(imageView.getContext(), i11), PorterDuff.Mode.SRC_OVER);
        } else {
            imageView.clearColorFilter();
        }
    }

    public static final void setOverlayColor(@NotNull ImageView imageView, boolean z11, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (z11) {
            imageView.setColorFilter(i11, PorterDuff.Mode.SRC_OVER);
        } else {
            imageView.clearColorFilter();
        }
    }

    public static void load$default(ImageView imageView, Bitmap bitmap, LoadPriority loadPriority, List list, PikazonLoaderCallback pikazonLoaderCallback, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        if ((i11 & 4) != 0) {
            list = K.f71697a;
        }
        if ((i11 & 8) != 0) {
            pikazonLoaderCallback = null;
        }
        load(imageView, bitmap, loadPriority, list, pikazonLoaderCallback);
    }

    public static final void load(@NotNull ImageView imageView, Bitmap bitmap, @NotNull LoadPriority loadPriority, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Bitmap> pikazonLoaderCallback) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(loadPriority, "loadPriority");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        ru.ozon.app.android.pikazon.extensions.internal.ImageViewExtKt.loadResource(imageView, bitmap, Bitmap.class, null, transformations, pikazonLoaderCallback, null, false, loadPriority);
    }
}
