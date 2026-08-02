package ru.ozon.app.android.pikazon.glide.request;

import V5.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import com.bumptech.glide.c;
import com.bumptech.glide.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.loadPriority.LoadPriority;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.processors.ImageSourceProcessor;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\n\u001a\u009b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\f*\u00020\u000b\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010\"\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Resource", "Landroid/view/View;", "view", "Ljava/lang/Class;", "resourceClazz", "Lcom/bumptech/glide/m;", "createRequest", "(Landroid/view/View;Ljava/lang/Class;)Lcom/bumptech/glide/m;", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/Class;)Lcom/bumptech/glide/m;", "", "Source", "source", "Lru/ozon/app/android/pikazon/image/ImageSize;", "imageSize", "Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;", "priority", "", "Lru/ozon/app/android/pikazon/glide/transformations/ImageTransformation;", "transformations", "", "placeholderRes", "", "withCrossFade", "Lru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;", "callback", "skipCache", "prepareRequest", "(Lcom/bumptech/glide/m;Ljava/lang/Object;Ljava/lang/Class;Lru/ozon/app/android/pikazon/image/ImageSize;Lru/ozon/app/android/pikazon/glide/loadPriority/LoadPriority;Ljava/util/List;Ljava/lang/Integer;ZLru/ozon/app/android/pikazon/callback/PikazonLoaderCallback;Z)Lcom/bumptech/glide/m;", "sourceTransformation", "(Landroid/content/Context;Ljava/lang/Object;)Ljava/lang/Object;", "", "uuid", "pikazonUrlSource", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", "lib_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageLoaderKt {
    @NotNull
    public static final <Resource> m<Resource> createRequest(@NotNull View view, @NotNull Class<Resource> resourceClazz) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(resourceClazz, "resourceClazz");
        m<Resource> as = c.o(view).as(resourceClazz);
        Intrinsics.checkNotNullExpressionValue(as, "as(...)");
        return as;
    }

    @NotNull
    public static final Object pikazonUrlSource(@NotNull Object source, @NotNull String uuid) {
        String url;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        if (source instanceof String) {
            url = (String) source;
        } else if (source instanceof Uri) {
            url = ((Uri) source).toString();
            Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
        } else {
            if (!(source instanceof URL)) {
                return source;
            }
            url = ((URL) source).toString();
            Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
        }
        return URLUtil.isNetworkUrl(url) ? new PikazonUrl(url, uuid) : source;
    }

    public static /* synthetic */ Object pikazonUrlSource$default(Object obj, String str, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            str = UUID.randomUUID().toString();
        }
        return pikazonUrlSource(obj, str);
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public static final <Source, Resource> m<Resource> prepareRequest(@NotNull m<Resource> mVar, @NotNull Source source, @NotNull Class<Resource> resourceClazz, ImageSize imageSize, @NotNull LoadPriority priority, @NotNull List<? extends ImageTransformation> transformations, Integer num, boolean z11, PikazonLoaderCallback<Resource> pikazonLoaderCallback, boolean z12) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(resourceClazz, "resourceClazz");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        m<Resource> load = mVar.load(source);
        Intrinsics.checkNotNullExpressionValue(load, "load(...)");
        m diskCacheStrategy = GlideRequestExtKt.priority(load, priority).skipMemoryCache(z12).diskCacheStrategy(z12 ? k.f28204a : k.f28206c);
        Intrinsics.checkNotNullExpressionValue(diskCacheStrategy, "diskCacheStrategy(...)");
        return GlideRequestExtKt.addCallback$default(GlideRequestExtKt.configure(GlideRequestExtKt.sizeWithDownsample$default(diskCacheStrategy, imageSize, null, 2, null), resourceClazz, transformations, num, z11), pikazonLoaderCallback, null, null, 6, null);
    }

    public static m prepareRequest$default(m mVar, Object obj, Class cls, ImageSize imageSize, LoadPriority loadPriority, List list, Integer num, boolean z11, PikazonLoaderCallback pikazonLoaderCallback, boolean z12, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            imageSize = null;
        }
        if ((i11 & 16) != 0) {
            list = K.f71697a;
        }
        if ((i11 & 32) != 0) {
            num = null;
        }
        if ((i11 & 64) != 0) {
            z11 = false;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            pikazonLoaderCallback = null;
        }
        if ((i11 & 256) != 0) {
            z12 = false;
        }
        return prepareRequest(mVar, obj, cls, imageSize, loadPriority, list, num, z11, pikazonLoaderCallback, z12);
    }

    @NotNull
    public static final Object sourceTransformation(@NotNull Context context, @NotNull Object source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Iterator<T> it = Pikazon.INSTANCE.getInstance().getConfig().getImageSourceProcessors().iterator();
        while (it.hasNext()) {
            Object transform = ((ImageSourceProcessor) it.next()).transform(source, context);
            if (transform != null) {
                return transform;
            }
        }
        return source;
    }

    @NotNull
    public static final <Resource> m<Resource> createRequest(@NotNull Context context, @NotNull Class<Resource> resourceClazz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resourceClazz, "resourceClazz");
        m<Resource> as = c.n(context).as(resourceClazz);
        Intrinsics.checkNotNullExpressionValue(as, "as(...)");
        return as;
    }
}
