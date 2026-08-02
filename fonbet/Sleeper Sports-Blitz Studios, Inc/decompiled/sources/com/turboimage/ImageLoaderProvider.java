package com.turboimage;

import android.content.Context;
import coil.ImageLoader;
import com.turboimage.events.interceptor.ProgressInterceptor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* compiled from: ImageLoaderProvider.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/turboimage/ImageLoaderProvider;", "", "<init>", "()V", "defaultLoader", "Lcoil/ImageLoader;", "urlCacheLoader", "sharedOkHttpClient", "Lokhttp3/OkHttpClient;", "getSharedOkHttpClient", "()Lokhttp3/OkHttpClient;", "sharedOkHttpClient$delegate", "Lkotlin/Lazy;", "buildImageLoader", "context", "Landroid/content/Context;", "respectCacheHeaders", "", "observerEnabled", "get", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ImageLoaderProvider {
    private static volatile ImageLoader defaultLoader;
    private static volatile ImageLoader urlCacheLoader;
    public static final ImageLoaderProvider INSTANCE = new ImageLoaderProvider();

    /* renamed from: sharedOkHttpClient$delegate, reason: from kotlin metadata */
    private static final Lazy sharedOkHttpClient = LazyKt.lazy(new Function0() { // from class: com.turboimage.ImageLoaderProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            OkHttpClient sharedOkHttpClient_delegate$lambda$0;
            sharedOkHttpClient_delegate$lambda$0 = ImageLoaderProvider.sharedOkHttpClient_delegate$lambda$0();
            return sharedOkHttpClient_delegate$lambda$0;
        }
    });

    private ImageLoaderProvider() {
    }

    private final OkHttpClient getSharedOkHttpClient() {
        return (OkHttpClient) sharedOkHttpClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient sharedOkHttpClient_delegate$lambda$0() {
        return new OkHttpClient.Builder().addInterceptor(new ProgressInterceptor()).build();
    }

    static /* synthetic */ ImageLoader buildImageLoader$default(ImageLoaderProvider imageLoaderProvider, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        return imageLoaderProvider.buildImageLoader(context, z, z2);
    }

    private final ImageLoader buildImageLoader(Context context, boolean respectCacheHeaders, boolean observerEnabled) {
        return new ImageLoader.Builder(context).okHttpClient(getSharedOkHttpClient()).respectCacheHeaders(respectCacheHeaders).networkObserverEnabled(observerEnabled).build();
    }

    public final ImageLoader get(Context context, boolean respectCacheHeaders) {
        ImageLoader imageLoader;
        ImageLoader imageLoader2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (respectCacheHeaders) {
            ImageLoader imageLoader3 = urlCacheLoader;
            if (imageLoader3 != null) {
                return imageLoader3;
            }
            synchronized (this) {
                imageLoader2 = urlCacheLoader;
                if (imageLoader2 == null) {
                    imageLoader2 = INSTANCE.buildImageLoader(context, true, true);
                    urlCacheLoader = imageLoader2;
                }
            }
            return imageLoader2;
        }
        ImageLoader imageLoader4 = defaultLoader;
        if (imageLoader4 != null) {
            return imageLoader4;
        }
        synchronized (this) {
            imageLoader = defaultLoader;
            if (imageLoader == null) {
                imageLoader = INSTANCE.buildImageLoader(context, false, true);
                defaultLoader = imageLoader;
            }
        }
        return imageLoader;
    }
}
