package ru.ozon.app.android.pikazon.glide.thumbnail;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCacheStub;", "Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "<init>", "()V", "put", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "get", "", ImagesContract.URL, "", ProductAction.ACTION_REMOVE, "thumb", "getPendingOrNull", "uuid", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ThumbCacheStub implements ThumbCache {
    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    @NotNull
    public Set<Thumb> get(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return M.f71699a;
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public Thumb getPendingOrNull(@NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return null;
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public void put(@NotNull Thumb value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // ru.ozon.app.android.pikazon.glide.thumbnail.ThumbCache
    public void remove(@NotNull String url, @NotNull Thumb thumb) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
    }
}
