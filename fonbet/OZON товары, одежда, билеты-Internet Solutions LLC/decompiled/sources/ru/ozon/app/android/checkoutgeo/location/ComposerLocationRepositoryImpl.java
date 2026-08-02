package ru.ozon.app.android.checkoutgeo.location;

import Ae.InterfaceC2395h;
import Bc.r;
import Mc.a;
import android.annotation.SuppressLint;
import ht.b;
import io.reactivex.p;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.location.ComposerLocationRepository;
import ru.ozon.app.android.location.api.ComposerLocationResponse;
import ru.ozon.app.android.location.api.LocationApi;
import ru.ozon.app.android.mapcommon.map.flags.CacheGeoProviderFlag;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/checkoutgeo/location/ComposerLocationRepositoryImpl;", "Lru/ozon/app/android/location/ComposerLocationRepository;", "Lru/ozon/app/android/location/api/LocationApi;", "locationApi", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/location/api/LocationApi;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "oldLocationUid", "newLocationUid", "", "fetchGeoProvider", "(Ljava/lang/String;Ljava/lang/String;)V", "initLocation", "()V", "Lio/reactivex/p;", "getCountryCode", "()Lio/reactivex/p;", "Lru/ozon/app/android/location/api/LocationApi;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "", "getCurrentAreaId", "()J", "currentAreaId", "LAe/h;", "getCurrentAreaIdChangedFlow", "()LAe/h;", "currentAreaIdChangedFlow", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposerLocationRepositoryImpl implements ComposerLocationRepository {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final LocationApi locationApi;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    public ComposerLocationRepositoryImpl(@NotNull LocationApi locationApi, @NotNull AreaLocalStore areaLocalStore, @NotNull JsonParser jsonDeserializer, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(locationApi, "locationApi");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.locationApi = locationApi;
        this.areaLocalStore = areaLocalStore;
        this.jsonDeserializer = jsonDeserializer;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.featureChecker = featureChecker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchGeoProvider(String oldLocationUid, String newLocationUid) {
        if (!this.featureChecker.isEnabled(CacheGeoProviderFlag.INSTANCE) || Intrinsics.d(oldLocationUid, newLocationUid)) {
            return;
        }
        this.ozonGeoProxyClient.fetchGeoProvider(newLocationUid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposerLocationResponse.Location initLocation$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (ComposerLocationResponse.Location) function1.invoke(p02);
    }

    @Override // ru.ozon.app.android.location.ComposerLocationRepository
    @NotNull
    public p<String> getCountryCode() {
        return this.areaLocalStore.getCountryCode();
    }

    @Override // ru.ozon.app.android.location.ComposerLocationRepository
    public long getCurrentAreaId() {
        return this.areaLocalStore.getAreaId();
    }

    @Override // ru.ozon.app.android.location.ComposerLocationRepository
    @NotNull
    public InterfaceC2395h<Long> getCurrentAreaIdChangedFlow() {
        return this.areaLocalStore.getAreaIdChangedFlow();
    }

    @Override // ru.ozon.app.android.location.ComposerLocationRepository
    @SuppressLint({"CheckResult"})
    public void initLocation() {
        y<ComposerLocationResponse> currentLocation = this.locationApi.getCurrentLocation();
        b bVar = new b(ComposerLocationRepositoryImpl$initLocation$1.INSTANCE, 1);
        currentLocation.getClass();
        new r(currentLocation, bVar).j(a.b()).h(new Fl.a(new ComposerLocationRepositoryImpl$initLocation$2(this), 2), new Fl.b(new ComposerLocationRepositoryImpl$initLocation$3(Lm0.a.f17149a), 2));
    }
}
