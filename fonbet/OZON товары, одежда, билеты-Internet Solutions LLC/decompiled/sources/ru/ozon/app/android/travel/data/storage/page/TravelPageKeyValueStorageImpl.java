package ru.ozon.app.android.travel.data.storage.page;

import Ej.b;
import Lm0.a;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u001c\u0010\r\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorageImpl;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "<init>", "()V", "storage", "", "", "", "getValue", "key", "put", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "putAll", "map", "", ProductAction.ACTION_REMOVE, "getAll", "clear", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelPageKeyValueStorageImpl implements TravelPageKeyValueStorage {

    @NotNull
    private final Map<String, Object> storage = new LinkedHashMap();

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    public void clear() {
        this.storage.clear();
        a.f17149a.d("TravelPageKeyValueStorageImpl clear", new Object[0]);
    }

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    public Object get(@NotNull String str) {
        return TravelPageKeyValueStorage.DefaultImpls.get(this, str);
    }

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    @NotNull
    public Map<String, Object> getAll() {
        return U.t(this.storage);
    }

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    public Object getValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        a.f17149a.d(Nk.a.b("TravelPageKeyValueStorageImpl getValue ", key), new Object[0]);
        return this.storage.get(key);
    }

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    public void put(@NotNull String key, @NotNull Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.storage.put(key, value);
        a.f17149a.d("TravelPageKeyValueStorageImpl put " + key + " - " + value, new Object[0]);
    }

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    public void putAll(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.storage.putAll(map);
        a.f17149a.d(b.a(map.size(), "TravelPageKeyValueStorageImpl putAll "), new Object[0]);
    }

    @Override // ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage
    public void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.storage.remove(key);
        a.f17149a.d(Nk.a.b("TravelPageKeyValueStorageImpl remove ", key), new Object[0]);
    }
}
