package ru.ozon.app.android.mapcommon.mapcommon;

import He0.a;
import Sc.r;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.AbstractC7094b;
import java.util.List;
import je0.C7406a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.location.AreaLocalStore;
import ru.ozon.app.android.mapcommon.map.OzonSuggestionsController;
import ru.ozon.app.android.mapcommon.map.flags.CacheGeoProviderFlag;
import ru.ozon.app.android.mapcommon.map.model.BoundingBoxModel;
import ru.ozon.app.android.mapcommon.map.model.SuggestionType;
import ru.ozon.app.android.mapcommon.ozongeoproxyclient.OzonGeoProxyClient;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00102\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010&\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010%\u001a\u0004\u0018\u00010\u001fH\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b(\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R6\u00104\u001a\u001c\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapperImpl;", "Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;", "ozonSuggestionsController", "Lru/ozon/app/android/location/AreaLocalStore;", "areaLocalStore", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "ozonGeoProxyClient", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;Lru/ozon/app/android/location/AreaLocalStore;Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lkotlin/Function1;", "", "", "loading", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "customGeoProviderConfig", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "analyticModuleState", "forceFetch", "Lio/reactivex/b;", "createService", "(Lkotlin/jvm/functions/Function1;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;Z)Lio/reactivex/b;", "geoProviderConfig", "Lje0/a;", "analyticModule", "createSuggestionsService", "(Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lkotlin/jvm/functions/Function1;Lje0/a;)Lio/reactivex/b;", "onStart", "()V", "", SearchIntents.EXTRA_QUERY, "Lru/ozon/app/android/mapcommon/map/model/SuggestionType;", "suggestionType", "Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;", "boundingBox", "contextLocationUid", "search", "(Ljava/lang/String;Lru/ozon/app/android/mapcommon/map/model/SuggestionType;Lru/ozon/app/android/mapcommon/map/model/BoundingBoxModel;Ljava/lang/String;)V", "clear", "Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;", "Lru/ozon/app/android/location/AreaLocalStore;", "Lru/ozon/app/android/mapcommon/ozongeoproxyclient/OzonGeoProxyClient;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "LSc/r;", "", "LHe0/a;", "getSearchListener", "()Lkotlin/jvm/functions/Function1;", "setSearchListener", "(Lkotlin/jvm/functions/Function1;)V", "searchListener", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SdkSuggestionsControllerWrapperImpl implements SdkSuggestionsControllerWrapper, OzonSuggestionsController {

    @NotNull
    private final AreaLocalStore areaLocalStore;

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final OzonGeoProxyClient ozonGeoProxyClient;

    @NotNull
    private final OzonSuggestionsController ozonSuggestionsController;

    public SdkSuggestionsControllerWrapperImpl(@NotNull OzonSuggestionsController ozonSuggestionsController, @NotNull AreaLocalStore areaLocalStore, @NotNull OzonGeoProxyClient ozonGeoProxyClient, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(ozonSuggestionsController, "ozonSuggestionsController");
        Intrinsics.checkNotNullParameter(areaLocalStore, "areaLocalStore");
        Intrinsics.checkNotNullParameter(ozonGeoProxyClient, "ozonGeoProxyClient");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.ozonSuggestionsController = ozonSuggestionsController;
        this.areaLocalStore = areaLocalStore;
        this.ozonGeoProxyClient = ozonGeoProxyClient;
        this.featureChecker = featureChecker;
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void clear() {
        this.ozonSuggestionsController.clear();
    }

    @Override // ru.ozon.app.android.mapcommon.mapcommon.SdkSuggestionsControllerWrapper
    @NotNull
    public AbstractC7094b createService(Function1<? super Boolean, Unit> loading, GeoProviderConfig customGeoProviderConfig, AnalyticModuleState analyticModuleState, boolean forceFetch) {
        if (customGeoProviderConfig != null && analyticModuleState != null) {
            return this.ozonSuggestionsController.createSuggestionsService(customGeoProviderConfig, loading, C7406a.C1146a.a(analyticModuleState));
        }
        GeoProviderConfig fetchGeoProviderWithResult = forceFetch ? this.ozonGeoProxyClient.fetchGeoProviderWithResult(this.areaLocalStore.getLocationUid()) : this.ozonGeoProxyClient.getGeoProviderConfig();
        return (fetchGeoProviderWithResult == null || !(this.featureChecker.isEnabled(CacheGeoProviderFlag.INSTANCE) || forceFetch)) ? OzonSuggestionsController.DefaultImpls.createSuggestionsService$default(this.ozonSuggestionsController, this.ozonGeoProxyClient.fetchGeoProviderWithResult(this.areaLocalStore.getLocationUid()), loading, null, 4, null) : OzonSuggestionsController.DefaultImpls.createSuggestionsService$default(this.ozonSuggestionsController, fetchGeoProviderWithResult, loading, null, 4, null);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    @NotNull
    public AbstractC7094b createSuggestionsService(@NotNull GeoProviderConfig geoProviderConfig, Function1<? super Boolean, Unit> loading, C7406a analyticModule) {
        Intrinsics.checkNotNullParameter(geoProviderConfig, "geoProviderConfig");
        return this.ozonSuggestionsController.createSuggestionsService(geoProviderConfig, loading, analyticModule);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void onStart() {
        this.ozonSuggestionsController.onStart();
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void search(@NotNull String query, @NotNull SuggestionType suggestionType, BoundingBoxModel boundingBox, String contextLocationUid) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(suggestionType, "suggestionType");
        this.ozonSuggestionsController.search(query, suggestionType, boundingBox, contextLocationUid);
    }

    @Override // ru.ozon.app.android.mapcommon.map.OzonSuggestionsController
    public void setSearchListener(Function1<? super r<? extends List<a>>, Unit> function1) {
        this.ozonSuggestionsController.setSearchListener(function1);
    }
}
