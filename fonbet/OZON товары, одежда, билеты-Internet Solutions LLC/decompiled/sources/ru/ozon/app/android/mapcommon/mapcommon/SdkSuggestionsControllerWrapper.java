package ru.ozon.app.android.mapcommon.mapcommon;

import io.reactivex.AbstractC7094b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mapcommon.map.OzonSuggestionsController;
import ru.ozon.mapsdk.common.geoproxy.data.model.AnalyticModuleState;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0003H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/mapcommon/mapcommon/SdkSuggestionsControllerWrapper;", "Lru/ozon/app/android/mapcommon/map/OzonSuggestionsController;", "Lkotlin/Function1;", "", "", "loading", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "customGeoProviderConfig", "Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;", "analyticModuleState", "forceFetch", "Lio/reactivex/b;", "createService", "(Lkotlin/jvm/functions/Function1;Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;Lru/ozon/mapsdk/common/geoproxy/data/model/AnalyticModuleState;Z)Lio/reactivex/b;", "map-common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SdkSuggestionsControllerWrapper extends OzonSuggestionsController {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AbstractC7094b createService$default(SdkSuggestionsControllerWrapper sdkSuggestionsControllerWrapper, Function1 function1, GeoProviderConfig geoProviderConfig, AnalyticModuleState analyticModuleState, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createService");
            }
            if ((i11 & 1) != 0) {
                function1 = null;
            }
            if ((i11 & 2) != 0) {
                geoProviderConfig = null;
            }
            if ((i11 & 4) != 0) {
                analyticModuleState = null;
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return sdkSuggestionsControllerWrapper.createService(function1, geoProviderConfig, analyticModuleState, z11);
        }
    }

    @NotNull
    AbstractC7094b createService(Function1<? super Boolean, Unit> loading, GeoProviderConfig customGeoProviderConfig, AnalyticModuleState analyticModuleState, boolean forceFetch);
}
