package ru.ozon.app.android.mapcommon.mapcommon.di.provider;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.OzonMapControllerWrapperImpl;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProviderImpl;", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/MapCommonProvider;", "ozonMapProvider", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "areaLocalStore", "Lru/ozon/app/android/location/AreaLocalStore;", "ozonGeoProxyClient", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "provideOzonMapControllerWrapper", "Lru/ozon/app/android/mapcommon/mapcommon/OzonMapControllerWrapper;", "containerView", "Landroid/view/ViewGroup;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MapCommonProviderImpl implements MapCommonProvider {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final OzonMapProvider ozonMapProvider;

    public MapCommonProviderImpl(@NotNull OzonMapProvider ozonMapProvider, @NotNull AreaLocalStore areaLocalStore, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ozonMapProvider, "ozonMapProvider");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.ozonMapProvider = ozonMapProvider;
        this.areaLocalStore = areaLocalStore;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.featureChecker = featureChecker;
    }

    @Override // ru.ozon.app.android.mapcommon.mapcommon.di.provider.MapCommonProvider
    @NotNull
    public OzonMapControllerWrapper provideOzonMapControllerWrapper(@NotNull ViewGroup containerView) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        return new OzonMapControllerWrapperImpl(this.ozonMapProvider.provideMapController(containerView), this.areaLocalStore, this.ozonGeoProxyClient, this.featureChecker);
    }
}
