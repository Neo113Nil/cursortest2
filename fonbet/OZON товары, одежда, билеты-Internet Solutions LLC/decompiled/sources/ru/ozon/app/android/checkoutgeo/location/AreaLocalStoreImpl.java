package ru.ozon.app.android.checkoutgeo.location;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.I0;
import Ae.InterfaceC2395h;
import Ae.M0;
import Ae.w0;
import De.C2862e;
import Nc.C3667a;
import android.content.SharedPreferences;
import fi0.e;
import io.reactivex.p;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.api.ComposerLocationResponse;
import xe.N;
import ze.EnumC11113a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\fJ\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0012\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0016¨\u00062"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/AreaLocalStoreImpl;", "Lru/ozon/app/android/location/AreaLocalStore;", "Landroid/content/SharedPreferences;", "preferences", "Lfi0/e;", "customPropertyTracker", "<init>", "(Landroid/content/SharedPreferences;Lfi0/e;)V", "", "locationUid", "", "saveLocationUid", "(Ljava/lang/String;)V", "Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;", "location", "saveLocation", "(Lru/ozon/app/android/location/api/ComposerLocationResponse$Location;)V", "", "areaId", "storeArea", "(J)V", "getStoredAreaId", "()J", "countryCode", "saveCountryCode", "Lio/reactivex/p;", "getCountryCode", "()Lio/reactivex/p;", "getLocationUid", "()Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Lfi0/e;", "LNc/a;", "LNc/a;", "Ljava/lang/String;", "LAe/w0;", "_areaIdChangedFlow", "LAe/w0;", "LAe/h;", "areaIdChangedFlow", "LAe/h;", "getAreaIdChangedFlow", "()LAe/h;", "LAe/M0;", "areaIdFlow", "LAe/M0;", "getAreaIdFlow", "()LAe/M0;", "getAreaId", "Companion", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AreaLocalStoreImpl implements AreaLocalStore {

    @NotNull
    private final w0<Long> _areaIdChangedFlow;

    @NotNull
    private final InterfaceC2395h<Long> areaIdChangedFlow;

    @NotNull
    private final M0<Long> areaIdFlow;

    @NotNull
    private final C3667a<String> countryCode;

    @NotNull
    private final e customPropertyTracker;

    @NotNull
    private String locationUid;

    @NotNull
    private final SharedPreferences preferences;

    public AreaLocalStoreImpl(@NotNull SharedPreferences preferences, @NotNull e customPropertyTracker) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(customPropertyTracker, "customPropertyTracker");
        this.preferences = preferences;
        this.customPropertyTracker = customPropertyTracker;
        C3667a<String> e11 = C3667a.e("RUS");
        Intrinsics.checkNotNullExpressionValue(e11, "createDefault(...)");
        this.countryCode = e11;
        this.locationUid = "";
        C0 b11 = E0.b(0, 0, null, 7);
        this._areaIdChangedFlow = b11;
        this.areaIdChangedFlow = C2399j.o(b11);
        InterfaceC2395h c11 = C2399j.c(getAreaIdChangedFlow(), 1, EnumC11113a.DROP_OLDEST);
        C2862e a11 = N.a(xe.E0.a());
        int i11 = I0.f818a;
        this.areaIdFlow = C2399j.M(c11, a11, I0.a.b(3), Long.valueOf(preferences.getLong("LAST_CHOSEN_AREA_ID", 2L)));
        String string = preferences.getString("COUNTRY_CODE", null);
        e11.onNext(string != null ? string : "RUS");
    }

    private final void saveLocationUid(String locationUid) {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString("LOCATION_UID", locationUid);
        edit.apply();
        this.locationUid = locationUid;
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    public long getAreaId() {
        return getAreaIdFlow().getValue().longValue();
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    @NotNull
    public InterfaceC2395h<Long> getAreaIdChangedFlow() {
        return this.areaIdChangedFlow;
    }

    @NotNull
    public M0<Long> getAreaIdFlow() {
        return this.areaIdFlow;
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    @NotNull
    public p<String> getCountryCode() {
        return this.countryCode;
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    public String getLocationUid() {
        String str = this.locationUid;
        if (h.K(str)) {
            return null;
        }
        return str;
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    public long getStoredAreaId() {
        return this.preferences.getLong("LAST_CHOSEN_AREA_ID", 2L);
    }

    public void saveCountryCode(@NotNull String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString("COUNTRY_CODE", countryCode);
        edit.apply();
        this.countryCode.onNext(countryCode);
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    public void saveLocation(ComposerLocationResponse.Location location) {
        String str;
        String str2;
        storeArea(location != null ? location.getAreaId() : 2L);
        if (location == null || (str = location.getCountryCode()) == null) {
            str = "RUS";
        }
        if (location == null || (str2 = location.getUid()) == null) {
            str2 = "";
        }
        saveCountryCode(str);
        saveLocationUid(str2);
    }

    @Override // ru.ozon.app.android.location.AreaLocalStore
    public void storeArea(long areaId) {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putLong("LAST_CHOSEN_AREA_ID", areaId);
        edit.apply();
        this._areaIdChangedFlow.tryEmit(Long.valueOf(areaId));
        this.customPropertyTracker.a(areaId);
    }
}
