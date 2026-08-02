package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.travel.map.flags.TravelOzonMapClientName;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/SwitchMapProviderObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "travelGeoProvidersStorage", "<init>", "(Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;)V", "", "getMapProviderForTravel", "()V", "getDefaultMapProvider", "Landroidx/lifecycle/J;", "owner", "onCreate", "(Landroidx/lifecycle/J;)V", "onDestroy", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/travel/map/storage/TravelGeoProvidersStorage;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwitchMapProviderObserver implements DefaultLifecycleObserver {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final TravelGeoProvidersStorage travelGeoProvidersStorage;

    public SwitchMapProviderObserver(@NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull AreaLocalStore areaLocalStore, @NotNull FeatureService featureService, @NotNull TravelGeoProvidersStorage travelGeoProvidersStorage) {
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(travelGeoProvidersStorage, "travelGeoProvidersStorage");
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.areaLocalStore = areaLocalStore;
        this.featureService = featureService;
        this.travelGeoProvidersStorage = travelGeoProvidersStorage;
    }

    private final void getDefaultMapProvider() {
        this.ozonGeoProxyClient.setAppName("ozonapp_android", this.areaLocalStore.getLocationUid());
    }

    private final void getMapProviderForTravel() {
        String stringKey = this.featureService.getStringKey(TravelOzonMapClientName.INSTANCE);
        this.ozonGeoProxyClient.setAppName(stringKey, this.areaLocalStore.getLocationUid());
        this.travelGeoProvidersStorage.setAppName(stringKey);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        getMapProviderForTravel();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        r activity;
        Intrinsics.checkNotNullParameter(owner, "owner");
        ComponentCallbacksC5392m componentCallbacksC5392m = owner instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) owner : null;
        if (componentCallbacksC5392m == null || (activity = componentCallbacksC5392m.getActivity()) == null || !activity.isChangingConfigurations()) {
            getDefaultMapProvider();
        }
        owner.getLifecycle().e(this);
    }
}
