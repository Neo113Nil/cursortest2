package ru.ozon.app.android.travel.data.storage.page;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0005¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "", "", "key", "getValue", "(Ljava/lang/String;)Ljava/lang/Object;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "put", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "map", "putAll", "(Ljava/util/Map;)V", ProductAction.ACTION_REMOVE, "(Ljava/lang/String;)V", "getAll", "()Ljava/util/Map;", "clear", "()V", "get", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TravelPageKeyValueStorage {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Object get(@NotNull TravelPageKeyValueStorage travelPageKeyValueStorage, @NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return travelPageKeyValueStorage.getValue(key);
        }
    }

    void clear();

    Object get(@NotNull String key);

    @NotNull
    Map<String, Object> getAll();

    Object getValue(@NotNull String key);

    void put(@NotNull String key, @NotNull Object value);

    void putAll(@NotNull Map<String, ? extends Object> map);

    void remove(@NotNull String key);
}
