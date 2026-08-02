package ru.ozon.app.android.mapcommon.mapcommon.di.provider;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.provider.suggestions.OzonSuggestionsProvider;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper;
import ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapperImpl;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProviderImpl;", "Lru/ozon/app/android/mapcommon/mapcommon/di/provider/SdkSuggestionsControllerWrapperProvider;", "areaLocalStore", "Lru/ozon/app/android/location/AreaLocalStore;", "ozonSuggestionsProvider", "Lru/ozon/app/android/mapcommon/map/provider/suggestions/OzonSuggestionsProvider;", "ozonGeoProxyClient", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "<init>", "(Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/mapcommon/map/provider/suggestions/OzonSuggestionsProvider;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "provideSuggestionsController", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SdkSuggestionsControllerWrapperProviderImpl implements SdkSuggestionsControllerWrapperProvider {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final OzonSuggestionsProvider ozonSuggestionsProvider;

    public SdkSuggestionsControllerWrapperProviderImpl(@NotNull AreaLocalStore areaLocalStore, @NotNull OzonSuggestionsProvider ozonSuggestionsProvider, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(ozonSuggestionsProvider, "ozonSuggestionsProvider");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.areaLocalStore = areaLocalStore;
        this.ozonSuggestionsProvider = ozonSuggestionsProvider;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.featureChecker = featureChecker;
    }

    @Override // ru.ozon.app.android.mapcommon.mapcommon.di.provider.SdkSuggestionsControllerWrapperProvider
    @NotNull
    public SdkSuggestionsControllerWrapper provideSuggestionsController() {
        return new SdkSuggestionsControllerWrapperImpl(this.ozonSuggestionsProvider.provideSuggestionsController(), this.areaLocalStore, this.ozonGeoProxyClient, this.featureChecker);
    }
}
