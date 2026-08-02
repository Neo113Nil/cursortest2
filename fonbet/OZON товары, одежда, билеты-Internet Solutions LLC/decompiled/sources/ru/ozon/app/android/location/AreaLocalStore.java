package ru.ozon.app.android.location;

import Ae.InterfaceC2395h;
import io.reactivex.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.api.ComposerLocationResponse;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/location/AreaLocalStore;", "", "", "areaId", "", "storeArea", "(J)V", "getStoredAreaId", "()J", "Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "location", "saveLocation", "(Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;)V", "Lio/reactivex/p;", "", "getCountryCode", "()Lio/reactivex/p;", "getLocationUid", "()Ljava/lang/String;", "LAe/h;", "getAreaIdChangedFlow", "()LAe/h;", "areaIdChangedFlow", "getAreaId", "location_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AreaLocalStore {
    long getAreaId();

    @NotNull
    InterfaceC2395h<Long> getAreaIdChangedFlow();

    @NotNull
    p<String> getCountryCode();

    String getLocationUid();

    long getStoredAreaId();

    void saveLocation(ComposerLocationResponse.Location location);

    void storeArea(long areaId);
}
