package ru.ozon.app.android.geo.map.clusterization;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.mapicons.ClusterPinIconView;

@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterBitmapCache;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "clusterCache", "ru/ozon/app/android/geo/map/clusterization/ClusterBitmapCache$clusterCache$1", "Lru/ozon/app/android/geo/map/clusterization/ClusterBitmapCache$clusterCache$1;", "getClusterBitmap", "Landroid/graphics/Bitmap;", "pinsCount", "", "createClusterBitmap", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClusterBitmapCache {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ClusterBitmapCache$clusterCache$1 clusterCache;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/map/clusterization/ClusterBitmapCache$Companion;", "", "<init>", "()V", "MEMORY_CACHE_SIZE", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.geo.map.clusterization.ClusterBitmapCache$clusterCache$1] */
    public ClusterBitmapCache(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.clusterCache = new LruCache<Integer, Bitmap>() { // from class: ru.ozon.app.android.geo.map.clusterization.ClusterBitmapCache$clusterCache$1
            @Override // android.util.LruCache
            public /* bridge */ /* synthetic */ int sizeOf(Integer num, Bitmap bitmap) {
                return sizeOf(num.intValue(), bitmap);
            }

            protected int sizeOf(int key, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return bitmap.getByteCount();
            }
        };
    }

    private final Bitmap createClusterBitmap(int pinsCount) {
        Bitmap bindAndGetBitmap = new ClusterPinIconView(this.context, null, 0, 0, 14, null).bindAndGetBitmap(pinsCount);
        put(Integer.valueOf(pinsCount), bindAndGetBitmap);
        return bindAndGetBitmap;
    }

    @NotNull
    public final Bitmap getClusterBitmap(int pinsCount) {
        Bitmap bitmap = get(Integer.valueOf(pinsCount));
        return bitmap == null ? createClusterBitmap(pinsCount) : bitmap;
    }
}
