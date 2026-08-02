package ru.ozon.app.android.pikazon.preload;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ3\u0010\r\u001a\u00020\f\"\b\b\u0001\u0010\n*\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eRP\u0010\u0011\u001a>\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\u000fj\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0007`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "", "T", "<init>", "()V", "Lkotlin/reflect/d;", "clazz", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "getProvider", "(Lkotlin/reflect/d;)Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "P", "prefetcher", "", "addProvider", "(Lkotlin/reflect/d;Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "prefetchers", "Ljava/util/HashMap;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagePrefetchInfoProviderStorage<T> {

    @NotNull
    private final HashMap<d<? extends T>, ImagePrefetchInfoProvider<? extends T>> prefetchers = new HashMap<>();

    public final <P extends T> void addProvider(@NotNull d<P> clazz, @NotNull ImagePrefetchInfoProvider<P> prefetcher) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(prefetcher, "prefetcher");
        this.prefetchers.put(clazz, prefetcher);
    }

    public final ImagePrefetchInfoProvider<T> getProvider(@NotNull d<? extends T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.prefetchers.get(clazz);
    }
}
