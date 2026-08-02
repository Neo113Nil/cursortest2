package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation;

import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache;", "", "<init>", "()V", "cacheMap", "ru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache$cacheMap$1", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/DescriptorCache$cacheMap$1;", "get", "Lru/ozon/app/android/travel/feature/hotels/map/shared/presentation/BitmapContainer;", "key", "", "put", "", "container", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DescriptorCache {

    @NotNull
    private final DescriptorCache$cacheMap$1 cacheMap;

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DescriptorCache$cacheMap$1] */
    public DescriptorCache() {
        final int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL) / 8);
        this.cacheMap = new LruCache<Integer, BitmapContainer>(maxMemory) { // from class: ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DescriptorCache$cacheMap$1
            @Override // android.util.LruCache
            public /* bridge */ /* synthetic */ int sizeOf(Integer num, BitmapContainer bitmapContainer) {
                return sizeOf(num.intValue(), bitmapContainer);
            }

            protected int sizeOf(int key, BitmapContainer bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return bitmap.getSize();
            }
        };
    }

    public final BitmapContainer get(int key) {
        return get(Integer.valueOf(key));
    }

    public final void put(@NotNull BitmapContainer container, int key) {
        Intrinsics.checkNotNullParameter(container, "container");
        synchronized (this.cacheMap) {
            put(Integer.valueOf(key), container);
        }
    }
}
