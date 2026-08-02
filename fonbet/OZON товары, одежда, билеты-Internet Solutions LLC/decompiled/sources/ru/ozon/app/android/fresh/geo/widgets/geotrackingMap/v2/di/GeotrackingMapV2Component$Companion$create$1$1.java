package ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.core.NetworkImageDataLoader;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2Mapper;
import ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.presentation.GeotrackingMapV2ViewModelImpl;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.map.provider.map.OzonMapProvider;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010-R\u0016\u00102\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"ru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/di/GeotrackingMapV2Component$Companion$create$1$1", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/di/GeotrackingMapV2Component;", "Lru/ozon/app/android/mapcommon/map/di/OzonMapComponentApi;", "ozonMapComponentApi", "Lru/ozon/app/android/mapcommon/map/di/OzonMapComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "LSc/j;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader;", "networkImageDataLoader$delegate", "getNetworkImageDataLoader", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/core/NetworkImageDataLoader;", "networkImageDataLoader", "Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider$delegate", "getOzonMapProvider", "()Lru/ozon/app/android/mapcommon/map/provider/map/OzonMapProvider;", "ozonMapProvider", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2Mapper;", "mapper", "LWZ/l;", "tokenizedAnalytics$delegate", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModelImpl;", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/fresh/geo/widgets/geotrackingMap/v2/presentation/GeotrackingMapV2ViewModelImpl;", "viewModel", "Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator$delegate", "getComposerNavigator", "()Lru/ozon/app/android/composer/ComposerNavigator;", "composerNavigator", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "getMapProviderName", "()Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig$SdkType;", "mapProviderName", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GeotrackingMapV2Component$Companion$create$1$1 implements GeotrackingMapV2Component {
    final /* synthetic */ C7475g $storage;
    private final NetworkComponentApi networkComponentApi;
    private final OzonMapComponentApi ozonMapComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker = k.b(new GeotrackingMapV2Component$Companion$create$1$1$featureChecker$2(this));

    /* renamed from: networkImageDataLoader$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j networkImageDataLoader = k.b(new GeotrackingMapV2Component$Companion$create$1$1$networkImageDataLoader$2(this));

    /* renamed from: ozonMapProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j ozonMapProvider = k.b(new GeotrackingMapV2Component$Companion$create$1$1$ozonMapProvider$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(GeotrackingMapV2Component$Companion$create$1$1$mapper$2.INSTANCE);

    /* renamed from: tokenizedAnalytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j tokenizedAnalytics = k.b(new GeotrackingMapV2Component$Companion$create$1$1$tokenizedAnalytics$2(this));

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModel = k.b(new GeotrackingMapV2Component$Companion$create$1$1$viewModel$2(this));

    /* renamed from: composerNavigator$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j composerNavigator = k.b(new GeotrackingMapV2Component$Companion$create$1$1$composerNavigator$2(this));

    GeotrackingMapV2Component$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.ozonMapComponentApi = (OzonMapComponentApi) c7475g.getComponent(OzonMapComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public ComposerNavigator getComposerNavigator() {
        return (ComposerNavigator) this.composerNavigator.getValue();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public GeoProviderConfig.SdkType getMapProviderName() {
        GeoProviderConfig geoProviderConfig = ((LocationComponentApi) this.$storage.getComponent(LocationComponentApi.class)).getOzonGeoProxyClient().getGeoProviderConfig();
        if (geoProviderConfig != null) {
            return geoProviderConfig.getSdkType();
        }
        return null;
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public GeotrackingMapV2Mapper getMapper() {
        return (GeotrackingMapV2Mapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public NetworkImageDataLoader getNetworkImageDataLoader() {
        return (NetworkImageDataLoader) this.networkImageDataLoader.getValue();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public OzonMapProvider getOzonMapProvider() {
        return (OzonMapProvider) this.ozonMapProvider.getValue();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public l getTokenizedAnalytics() {
        return (l) this.tokenizedAnalytics.getValue();
    }

    @Override // ru.ozon.app.android.fresh.geo.widgets.geotrackingMap.v2.di.GeotrackingMapV2Component
    public GeotrackingMapV2ViewModelImpl getViewModel() {
        return (GeotrackingMapV2ViewModelImpl) this.viewModel.getValue();
    }
}
