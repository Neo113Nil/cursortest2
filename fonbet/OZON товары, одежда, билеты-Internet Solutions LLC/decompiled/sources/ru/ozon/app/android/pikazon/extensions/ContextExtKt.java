package ru.ozon.app.android.pikazon.extensions;

import Lm0.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.g;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l6.InterfaceFutureC7881d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.internal.StringExtKt;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.InscribedUrlProcessor;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\r\u001a\u00020\u0016*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\r\u0010\u0018\u001aU\u0010\u0019\u001a\u00020\u0016*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0019\u0010\u0018\u001ai\u0010 \u001a\u00020\u0016*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010!\u001as\u0010$\u001a\u00020\u0016*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%\u001aq\u0010(\u001a\u00020\u0016*\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010#\u001a\u00020\"2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160&2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroid/content/Context;", "", "source", "Landroid/graphics/drawable/Drawable;", "loadIconByString", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "loadDrawableByName", ImagesContract.URL, "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "Ljava/util/concurrent/Future;", "Landroid/graphics/Bitmap;", "loadAsBitmap", "(Landroid/content/Context;Ljava/lang/String;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)Ljava/util/concurrent/Future;", "imageUrl", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lkotlin/Function1;", "", "block", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Lkotlin/jvm/functions/Function1;)V", "loadOriginalBitmap", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "", "placeholderRes", "", "withCrossFade", "load", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;ZLru/ozon/app/android/pikazon/image/ImageSize;)V", "Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;", "inscribedUrlProcessor", "loadInscribedSize", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;ZLru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;)V", "Lkotlin/Function0;", "onFailure", "loadAsBitmapInscribedSize", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Lru/ozon/app/android/pikazon/processors/InscribedUrlProcessor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContextExtKt {
    public static final void load(@NotNull Context context, String str, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Drawable> pikazonLoaderCallback, Integer num, @NotNull LoadPriority priority, boolean z11, ImageSize imageSize) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt.loadResource$default(context, str, Drawable.class, transformations, pikazonLoaderCallback, num, z11, imageSize, priority, false, 256, null);
    }

    public static final void loadAsBitmap(@NotNull Context context, String str, @NotNull List<? extends ImageTransformation> transformations, ImageSize imageSize, @NotNull LoadPriority priority, @NotNull Function1<? super Bitmap, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(block, "block");
        ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt.loadAsBitmap$default(context, str, transformations, block, null, imageSize, null, false, priority, 104, null);
    }

    public static /* synthetic */ Future loadAsBitmap$default(Context context, String str, LoadPriority loadPriority, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        return loadAsBitmap(context, str, loadPriority);
    }

    public static final void loadAsBitmapInscribedSize(@NotNull Context context, String str, @NotNull List<? extends ImageTransformation> transformations, ImageSize imageSize, @NotNull LoadPriority priority, @NotNull InscribedUrlProcessor inscribedUrlProcessor, @NotNull Function0<Unit> onFailure, @NotNull Function1<? super Bitmap, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(inscribedUrlProcessor, "inscribedUrlProcessor");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(block, "block");
        ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt.loadAsBitmap$default(context, inscribedUrlProcessor.computeUrl(str), transformations, block, onFailure, imageSize, null, false, priority, 96, null);
    }

    public static final Drawable loadDrawableByName(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        int identifier = context.getResources().getIdentifier(name, "drawable", context.getApplicationContext().getPackageName());
        if (identifier != 0) {
            return g.d(context.getResources(), identifier, context.getTheme());
        }
        return null;
    }

    public static final Drawable loadIconByString(@NotNull Context context, @NotNull String source) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (!h.e0(source, "ic_", false)) {
            return null;
        }
        try {
            return loadDrawableByName(context, source);
        } catch (Exception e11) {
            a.f17149a.e(e11);
            return null;
        }
    }

    public static final void loadInscribedSize(@NotNull Context context, String str, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Drawable> pikazonLoaderCallback, Integer num, @NotNull LoadPriority priority, boolean z11, ImageSize imageSize, @NotNull InscribedUrlProcessor inscribedUrlProcessor) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(inscribedUrlProcessor, "inscribedUrlProcessor");
        ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt.loadResource$default(context, inscribedUrlProcessor.computeUrl(str), Drawable.class, transformations, pikazonLoaderCallback, num, z11, imageSize, priority, false, 256, null);
    }

    public static final void loadOriginalBitmap(@NotNull Context context, String str, @NotNull List<? extends ImageTransformation> transformations, ImageSize imageSize, @NotNull LoadPriority priority, @NotNull Function1<? super Bitmap, Unit> block) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(block, "block");
        ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt.loadAsBitmap$default(context, str != null ? StringExtKt.ignoreResize(str) : null, transformations, block, null, imageSize, null, false, priority, 104, null);
    }

    public static void loadOriginalBitmap$default(Context context, String str, List list, ImageSize imageSize, LoadPriority loadPriority, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = K.f71697a;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            imageSize = null;
        }
        ImageSize imageSize2 = imageSize;
        if ((i11 & 8) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        loadOriginalBitmap(context, str, list2, imageSize2, loadPriority, function1);
    }

    @NotNull
    public static final Future<Bitmap> loadAsBitmap(@NotNull Context context, @NotNull String url, @NotNull LoadPriority priority) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(priority, "priority");
        InterfaceFutureC7881d submit = ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt.prepareContextRequest$default(ImageLoaderKt.createRequest(context, Bitmap.class), context, url, Bitmap.class, null, priority, K.f71697a, null, false, null, false, 840, null).submit();
        Intrinsics.checkNotNullExpressionValue(submit, "submit(...)");
        return submit;
    }

    public static void loadAsBitmap$default(Context context, String str, List list, ImageSize imageSize, LoadPriority loadPriority, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = K.f71697a;
        }
        List list2 = list;
        if ((i11 & 4) != 0) {
            imageSize = null;
        }
        ImageSize imageSize2 = imageSize;
        if ((i11 & 8) != 0) {
            loadPriority = LoadPriority.NORMAL;
        }
        loadAsBitmap(context, str, list2, imageSize2, loadPriority, function1);
    }
}
