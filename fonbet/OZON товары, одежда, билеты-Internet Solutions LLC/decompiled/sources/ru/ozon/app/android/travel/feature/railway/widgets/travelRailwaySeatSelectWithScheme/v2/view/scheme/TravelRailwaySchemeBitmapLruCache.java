package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002J\u0013\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLruCache;", "", "<init>", "()V", "cache", "ru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLruCache$cache$1", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/view/scheme/TravelRailwaySchemeBitmapLruCache$cache$1;", "set", "", "key", "", "bitmap", "Landroid/graphics/Bitmap;", "get", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySchemeBitmapLruCache {

    @NotNull
    private final TravelRailwaySchemeBitmapLruCache$cache$1 cache;

    /* JADX WARN: Type inference failed for: r1v0, types: [ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeBitmapLruCache$cache$1] */
    public TravelRailwaySchemeBitmapLruCache() {
        final int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / UserVerificationMethods.USER_VERIFY_ALL) / 8);
        this.cache = new LruCache<String, Bitmap>(maxMemory) { // from class: ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.scheme.TravelRailwaySchemeBitmapLruCache$cache$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return bitmap.getByteCount() / UserVerificationMethods.USER_VERIFY_ALL;
            }
        };
    }

    public final Bitmap get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get(key);
    }

    public final void set(@NotNull String key, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        put(key, bitmap);
    }
}
