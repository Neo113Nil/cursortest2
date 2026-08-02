package ru.ozon.app.android.geo.map.clusterization;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkBitmapCache;", "", "<init>", "()V", "cacheMap", "ru/ozon/app/android/geo/map/clusterization/MapPlacemarkBitmapCache$cacheMap$1", "Lru/ozon/app/android/geo/map/clusterization/MapPlacemarkBitmapCache$cacheMap$1;", "get", "Lru/ozon/app/android/geo/map/clusterization/BitmapContainer;", "key", "", "put", "bitmap", "Landroid/graphics/Bitmap;", "anchor", "Landroid/graphics/PointF;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapPlacemarkBitmapCache {

    @NotNull
    private final MapPlacemarkBitmapCache$cacheMap$1 cacheMap;

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.geo.map.clusterization.MapPlacemarkBitmapCache$cacheMap$1] */
    public MapPlacemarkBitmapCache() {
        final int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL) / 8);
        this.cacheMap = new LruCache<Integer, BitmapContainer>(maxMemory) { // from class: ru.ozon.app.android.geo.map.clusterization.MapPlacemarkBitmapCache$cacheMap$1
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

    @NotNull
    public final BitmapContainer put(@NotNull Bitmap bitmap, int key, @NotNull PointF anchor) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        BitmapContainer bitmapContainer = new BitmapContainer(bitmap, anchor);
        synchronized (this.cacheMap) {
            put(Integer.valueOf(key), bitmapContainer);
        }
        return bitmapContainer;
    }
}
