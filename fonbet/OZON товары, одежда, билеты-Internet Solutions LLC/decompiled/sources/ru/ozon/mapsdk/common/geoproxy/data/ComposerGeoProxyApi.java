package ru.ozon.mapsdk.common.geoproxy.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.GeoProvidersV2Params;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.GeocodeParams;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.MapKeysParams;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.ReverseGeocodeParams;
import ru.ozon.mapsdk.common.geoproxy.data.composermodels.SuggestParams;
import ru.ozon.mapsdk.common.geoproxy.data.model.CountriesResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProvidersV2Response;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeSuggestResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.MapKeysResponse;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/ComposerGeoProxyApi;", "", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/GeoProvidersV2Params;", "params", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProvidersV2Response;", "geoProvidersV2", "(Lru/ozon/mapsdk/common/geoproxy/data/composermodels/GeoProvidersV2Params;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/GeocodeParams;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeResponse;", "geocode", "(Lru/ozon/mapsdk/common/geoproxy/data/composermodels/GeocodeParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ReverseGeocodeParams;", "reverseGeocode", "(Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ReverseGeocodeParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeSuggestResponse;", "suggest", "(Lru/ozon/mapsdk/common/geoproxy/data/composermodels/SuggestParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/model/CountriesResponse;", "getDisallowedCountries", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/MapKeysParams;", "Lru/ozon/mapsdk/common/geoproxy/data/model/MapKeysResponse;", "getMapKeys", "(Lru/ozon/mapsdk/common/geoproxy/data/composermodels/MapKeysParams;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ComposerGeoProxyApi {
    @POST("geoProvidersV2")
    Object geoProvidersV2(@Body @NotNull GeoProvidersV2Params geoProvidersV2Params, @NotNull d<? super GeoProvidersV2Response> dVar);

    @POST("geocode")
    Object geocode(@Body @NotNull GeocodeParams geocodeParams, @NotNull d<? super GeocodeResponse> dVar);

    @POST("disallowedCountries")
    Object getDisallowedCountries(@NotNull d<? super CountriesResponse> dVar);

    @POST("mapKeys")
    Object getMapKeys(@Body @NotNull MapKeysParams mapKeysParams, @NotNull d<? super MapKeysResponse> dVar);

    @POST("revGeocode")
    Object reverseGeocode(@Body @NotNull ReverseGeocodeParams reverseGeocodeParams, @NotNull d<? super GeocodeResponse> dVar);

    @POST("suggest")
    Object suggest(@Body @NotNull SuggestParams suggestParams, @NotNull d<? super GeocodeSuggestResponse> dVar);
}
