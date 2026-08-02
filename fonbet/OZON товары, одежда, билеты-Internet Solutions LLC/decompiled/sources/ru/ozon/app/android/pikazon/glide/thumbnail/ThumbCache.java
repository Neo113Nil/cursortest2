package ru.ozon.app.android.pikazon.glide.thumbnail;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\tH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pikazon/glide/thumbnail/ThumbCache;", "", "put", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pikazon/glide/thumbnail/Thumb;", "get", "", ImagesContract.URL, "", ProductAction.ACTION_REMOVE, "thumb", "getPendingOrNull", "uuid", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ThumbCache {
    @NotNull
    Set<Thumb> get(@NotNull String url);

    Thumb getPendingOrNull(@NotNull String uuid);

    void put(@NotNull Thumb value);

    void remove(@NotNull String url, @NotNull Thumb thumb);
}
