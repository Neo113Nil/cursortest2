package ru.ozon.app.android.composer.imageprefetch;

import android.content.Context;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Landroid/content/Context;", "context", "item", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "prefetcher", "", "prefetchImage", "(Landroid/content/Context;Ljava/lang/Object;Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;)V", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PrefetchUtilsKt {
    public static final <T> void prefetchImage(@NotNull Context context, T t2, @NotNull ImagePrefetcher<T> prefetcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        if (t2 == null) {
            return;
        }
        prefetcher.prefetch(context, C7714v.a0(t2));
    }
}
