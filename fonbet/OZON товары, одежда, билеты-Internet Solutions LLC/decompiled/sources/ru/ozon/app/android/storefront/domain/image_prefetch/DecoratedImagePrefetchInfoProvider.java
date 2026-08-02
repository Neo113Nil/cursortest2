package ru.ozon.app.android.storefront.domain.image_prefetch;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.image.ImageSize;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storefront/domain/image_prefetch/DecoratedImagePrefetchInfoProvider;", "T", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProvider;", "<init>", "()V", "canPrefetch", "", "item", "(Ljava/lang/Object;)Z", "getWidgetImageSize", "Lru/ozon/app/android/pikazon/image/ImageSize;", "context", "Landroid/content/Context;", "(Ljava/lang/Object;Landroid/content/Context;)Lru/ozon/app/android/pikazon/image/ImageSize;", "getWidgetImageUrl", "", "(Ljava/lang/Object;)Ljava/lang/String;", "getSize", "getUrl", "image-prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class DecoratedImagePrefetchInfoProvider<T> implements ImagePrefetchInfoProvider<T> {
    public abstract boolean canPrefetch(T item);

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public final ImageSize getSize(T item, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (canPrefetch(item)) {
            return getWidgetImageSize(item, context);
        }
        return null;
    }

    @Override // ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProvider
    public final String getUrl(T item) {
        if (canPrefetch(item)) {
            return getWidgetImageUrl(item);
        }
        return null;
    }

    public abstract ImageSize getWidgetImageSize(T item, @NotNull Context context);

    public abstract String getWidgetImageUrl(T item);
}
