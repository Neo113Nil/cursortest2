package ru.ozon.app.android.pikazon.extensions.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.m;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m6.AbstractC8090c;
import n6.c;
import org.jetbrains.annotations.NotNull;
import p6.l;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.request.ImageLoaderKt;
import ru.ozon.app.android.pikazon.glide.targets.OzonMetricTargetExtKt;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.PreloadTarget;
import ru.ozon.app.android.pikazon.retry.RequestWithRetryCount;
import ru.ozon.app.android.pikazon.util.TestUtilKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0099\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u001d\u001a\u00020\u001c*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0085\u0001\u0010$\u001a\u00020\u001c\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c0\u001f2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b$\u0010%\u001a£\u0001\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010&\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010&2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0000¢\u0006\u0004\b)\u0010*\u001aC\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"", "Source", "Resource", "Landroid/content/Context;", "source", "Ljava/lang/Class;", "resourceType", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "", "placeholderRes", "", "withCrossFade", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "skipCache", "Lru/ozon/app/android/pikazon/retry/RequestWithRetryCount;", "loadResource", "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Ljava/util/List;Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Ljava/lang/Integer;ZLru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Z)Lru/ozon/app/android/pikazon/retry/RequestWithRetryCount;", "", ImagesContract.URL, "Lru/ozon/app/android/pikazon/preload/PreloadTarget;", "preloadTarget", "", "preloadResource", "(Landroid/content/Context;Ljava/lang/String;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/preload/PreloadTarget;)V", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "block", "Lkotlin/Function0;", "onFailure", "loadAsBitmap", "(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/pikazon/image/ImageSize;Ljava/lang/Integer;ZLru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;)V", "Lcom/bumptech/glide/m;", "context", "resourceClazz", "prepareContextRequest", "(Lcom/bumptech/glide/m;Landroid/content/Context;Ljava/lang/Object;Ljava/lang/Class;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Ljava/util/List;Ljava/lang/Integer;ZLru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Z)Lcom/bumptech/glide/m;", "loadTestImageBlocking", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/Integer;Ljava/util/List;)Ljava/lang/Object;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContextExtKt {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    @SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Source> void loadAsBitmap(@NotNull Context context, Source source, @NotNull List<? extends ImageTransformation> transformations, @NotNull final Function1<? super Bitmap, Unit> block, @NotNull final Function0<Unit> onFailure, ImageSize imageSize, Integer num, boolean z11, @NotNull LoadPriority priority) {
        final int i11;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (Pikazon.INSTANCE.getInstance().getIsInTestMode()) {
            block.invoke(loadTestImageBlocking(context, Bitmap.class, num, transformations));
            return;
        }
        if (source == null) {
            return;
        }
        m prepareContextRequest$default = prepareContextRequest$default(ImageLoaderKt.createRequest(context, Bitmap.class), context, source, Bitmap.class, imageSize, priority, transformations, num, z11, null, false, 768, null);
        final int i12 = LinearLayoutManager.INVALID_OFFSET;
        if (imageSize != null) {
            Integer valueOf = Integer.valueOf(imageSize.getWidth());
            if (!l.i(valueOf.intValue(), LinearLayoutManager.INVALID_OFFSET)) {
                valueOf = null;
            }
            if (valueOf != null) {
                i11 = valueOf.intValue();
                if (imageSize != null) {
                    Integer valueOf2 = Integer.valueOf(imageSize.getHeight());
                    Integer num2 = l.i(LinearLayoutManager.INVALID_OFFSET, valueOf2.intValue()) ? valueOf2 : null;
                    if (num2 != null) {
                        i12 = num2.intValue();
                    }
                }
                prepareContextRequest$default.into((m) OzonMetricTargetExtKt.toOzonMetricTarget(new AbstractC8090c<Object>(i11, i12) { // from class: ru.ozon.app.android.pikazon.glide.targets.TargetCreatorKt$createCustomTarget$1
                    @Override // m6.h
                    public void onLoadCleared(Drawable placeholder) {
                    }

                    @Override // m6.AbstractC8090c, m6.h
                    public void onLoadFailed(Drawable errorDrawable) {
                        onFailure.invoke();
                    }

                    @Override // m6.h
                    public void onResourceReady(Object resource, c<Object> transition) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        block.invoke(resource);
                    }
                }, priority, source));
            }
        }
        i11 = Integer.MIN_VALUE;
        if (imageSize != null) {
        }
        prepareContextRequest$default.into((m) OzonMetricTargetExtKt.toOzonMetricTarget(new AbstractC8090c<Object>(i11, i12) { // from class: ru.ozon.app.android.pikazon.glide.targets.TargetCreatorKt$createCustomTarget$1
            @Override // m6.h
            public void onLoadCleared(Drawable placeholder) {
            }

            @Override // m6.AbstractC8090c, m6.h
            public void onLoadFailed(Drawable errorDrawable) {
                onFailure.invoke();
            }

            @Override // m6.h
            public void onResourceReady(Object resource, c<Object> transition) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                block.invoke(resource);
            }
        }, priority, source));
    }

    public static void loadAsBitmap$default(Context context, Object obj, List list, Function1 function1, Function0 function0, ImageSize imageSize, Integer num, boolean z11, LoadPriority loadPriority, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            list = K.f71697a;
        }
        List list2 = list;
        if ((i11 & 8) != 0) {
            function0 = ContextExtKt$loadAsBitmap$1.INSTANCE;
        }
        loadAsBitmap(context, obj, list2, function1, function0, (i11 & 16) != 0 ? null : imageSize, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? false : z11, loadPriority);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"VisibleForTests"})
    public static final <Source, Resource> RequestWithRetryCount<Resource> loadResource(@NotNull Context context, Source source, @NotNull Class<Resource> resourceType, @NotNull List<? extends ImageTransformation> transformations, PikazonLoaderCallback<Resource> pikazonLoaderCallback, Integer num, boolean z11, ImageSize imageSize, @NotNull LoadPriority priority, boolean z12) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(resourceType, "resourceType");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (Pikazon.INSTANCE.getInstance().getIsInTestMode()) {
            if (pikazonLoaderCallback != 0) {
                pikazonLoaderCallback.onLoadSuccessful(loadTestImageBlocking(context, resourceType, num, transformations));
            }
            return null;
        }
        if (source == null) {
            return null;
        }
        return new RequestWithRetryCount<>(new ContextExtKt$loadResource$1(context, resourceType, source, imageSize, priority, transformations, num, z11, pikazonLoaderCallback, z12));
    }

    public static RequestWithRetryCount loadResource$default(Context context, Object obj, Class cls, List list, PikazonLoaderCallback pikazonLoaderCallback, Integer num, boolean z11, ImageSize imageSize, LoadPriority loadPriority, boolean z12, int i11, Object obj2) {
        boolean z13;
        Context context2;
        Object obj3;
        Class cls2;
        LoadPriority loadPriority2;
        if ((i11 & 4) != 0) {
            list = K.f71697a;
        }
        List list2 = list;
        PikazonLoaderCallback pikazonLoaderCallback2 = (i11 & 8) != 0 ? null : pikazonLoaderCallback;
        Integer num2 = (i11 & 16) != 0 ? null : num;
        boolean z14 = (i11 & 32) != 0 ? false : z11;
        ImageSize imageSize2 = (i11 & 64) != 0 ? null : imageSize;
        if ((i11 & 256) != 0) {
            z13 = false;
            context2 = context;
            obj3 = obj;
            loadPriority2 = loadPriority;
            cls2 = cls;
        } else {
            z13 = z12;
            context2 = context;
            obj3 = obj;
            cls2 = cls;
            loadPriority2 = loadPriority;
        }
        return loadResource(context2, obj3, cls2, list2, pikazonLoaderCallback2, num2, z14, imageSize2, loadPriority2, z13);
    }

    private static final <Resource> Resource loadTestImageBlocking(Context context, Class<Resource> cls, Integer num, List<? extends ImageTransformation> list) {
        return (Resource) TestUtilKt.loadTestResource(num != null ? num.intValue() : Pikazon.INSTANCE.getInstance().getConfig().getDefaultImage(), list, context, cls, null);
    }

    public static final void preloadResource(@NotNull Context context, @NotNull String url, @NotNull ImageSize imageSize, @NotNull PreloadTarget preloadTarget) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(preloadTarget, "preloadTarget");
        LoadPriority loadPriority = LoadPriority.LOW;
        prepareContextRequest$default(ImageLoaderKt.createRequest(context, Object.class), context, url, Object.class, imageSize, loadPriority, null, null, false, null, false, 992, null).into((m) OzonMetricTargetExtKt.toOzonMetricTarget(preloadTarget, loadPriority, url));
    }

    @NotNull
    public static final <Source, Resource> m<Resource> prepareContextRequest(@NotNull m<Resource> mVar, @NotNull Context context, @NotNull Source source, @NotNull Class<Resource> resourceClazz, ImageSize imageSize, @NotNull LoadPriority priority, @NotNull List<? extends ImageTransformation> transformations, Integer num, boolean z11, PikazonLoaderCallback<Resource> pikazonLoaderCallback, boolean z12) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(resourceClazz, "resourceClazz");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        return ImageLoaderKt.prepareRequest(mVar, ImageLoaderKt.pikazonUrlSource$default(ImageLoaderKt.sourceTransformation(context, source), null, 2, null), resourceClazz, imageSize, priority, transformations, num, z11, pikazonLoaderCallback, z12);
    }

    public static m prepareContextRequest$default(m mVar, Context context, Object obj, Class cls, ImageSize imageSize, LoadPriority loadPriority, List list, Integer num, boolean z11, PikazonLoaderCallback pikazonLoaderCallback, boolean z12, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            imageSize = null;
        }
        if ((i11 & 32) != 0) {
            list = K.f71697a;
        }
        if ((i11 & 64) != 0) {
            num = null;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = false;
        }
        if ((i11 & 256) != 0) {
            pikazonLoaderCallback = null;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z12 = false;
        }
        return prepareContextRequest(mVar, context, obj, cls, imageSize, loadPriority, list, num, z11, pikazonLoaderCallback, z12);
    }
}
