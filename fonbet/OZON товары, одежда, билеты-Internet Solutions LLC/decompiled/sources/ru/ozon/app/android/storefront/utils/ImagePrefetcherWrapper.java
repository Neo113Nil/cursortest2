package ru.ozon.app.android.storefront.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\b\u0001\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "T", "", "imagePrefetcher", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "featureEnabled", "", "<init>", "(Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;Z)V", "prefetch", "", "context", "Landroid/content/Context;", "items", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImagePrefetcherWrapper<T> {
    private final boolean featureEnabled;

    @NotNull
    private final ImagePrefetcher<T> imagePrefetcher;

    public ImagePrefetcherWrapper(@NotNull ImagePrefetcher<T> imagePrefetcher, boolean z11) {
        Intrinsics.checkNotNullParameter(imagePrefetcher, "imagePrefetcher");
        this.imagePrefetcher = imagePrefetcher;
        this.featureEnabled = z11;
    }

    public final void prefetch(@NotNull Context context, @NotNull Iterable<? extends T> items) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        if (this.featureEnabled) {
            this.imagePrefetcher.prefetch(context, items);
        }
    }
}
