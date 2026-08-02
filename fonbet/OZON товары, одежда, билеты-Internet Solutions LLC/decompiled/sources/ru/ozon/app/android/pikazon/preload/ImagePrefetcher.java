package ru.ozon.app.android.pikazon.preload;

import android.content.Context;
import com.bumptech.glide.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.internal.ContextExtKt;
import ru.ozon.app.android.pikazon.image.ImageSize;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "T", "", "size", "", "providersStorage", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "<init>", "(ILru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;)V", "targetQueue", "Lru/ozon/app/android/pikazon/preload/PreloadTargetQueue;", "emptyImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "prefetch", "", "context", "Landroid/content/Context;", "items", "", "clear", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImagePrefetcher<T> {

    @NotNull
    private final ImageSize emptyImageSize;

    @NotNull
    private final ImagePrefetchInfoProviderStorage<T> providersStorage;
    private final int size;

    @NotNull
    private final PreloadTargetQueue targetQueue;

    public ImagePrefetcher(int i11, @NotNull ImagePrefetchInfoProviderStorage<T> providersStorage) {
        Intrinsics.checkNotNullParameter(providersStorage, "providersStorage");
        this.size = i11;
        this.providersStorage = providersStorage;
        this.targetQueue = new PreloadTargetQueue(i11);
        this.emptyImageSize = new ImageSize(0, 0);
    }

    public final void clear(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            c.n(context).clear(this.targetQueue.next(this.emptyImageSize));
        }
    }

    public final void prefetch(@NotNull Context context, @NotNull Iterable<? extends T> items) {
        ImageSize size;
        String url;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        for (T t2 : items) {
            ImagePrefetchInfoProvider<T> provider = this.providersStorage.getProvider(N.b(t2.getClass()));
            if (provider != null && (size = provider.getSize(t2, context)) != null && (url = provider.getUrl(t2)) != null) {
                ContextExtKt.preloadResource(context, url, size, this.targetQueue.next(size));
            }
        }
    }
}
