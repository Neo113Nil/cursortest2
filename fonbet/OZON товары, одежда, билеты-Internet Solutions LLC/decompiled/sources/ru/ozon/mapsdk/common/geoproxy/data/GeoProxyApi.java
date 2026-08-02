package ru.ozon.mapsdk.common.geoproxy.data;

import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.ozon.mapsdk.common.geoproxy.data.model.CountriesResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProvidersV2Response;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeocodeSuggestResponse;
import ru.ozon.mapsdk.common.geoproxy.data.model.MapKeysResponse;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JJ\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJd\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00102\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015Jv\u0010\u0019\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u00052\b\b\u0001\u0010\u0018\u001a\u00020\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0094\u0001\u0010#\u001a\u00020\"2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0001\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%H§@¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/GeoProxyApi;", "", "", "clientName", "locationUid", "", "lat", "lng", "lang", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProvidersV2Response;", "geoProvidersV2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", SearchIntents.EXTRA_QUERY, "languageCode", "", "excludeEnricher", "", "preferredProviders", "requestSessionId", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeResponse;", "geocode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "latitude", "longitude", "resultType", "reverseGeocode", "(Ljava/lang/String;DDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "count", "leftLowerCornerLat", "leftLowerCornerLon", "rightUpperCornerLat", "rightUpperCornerLon", "contextLocationUID", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeocodeSuggestResponse;", "suggest", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/model/CountriesResponse;", "getDisallowedCountries", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/mapsdk/common/geoproxy/data/model/MapKeysResponse;", "getMapKeys", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GeoProxyApi {
    @GET("GeoProvidersV2")
    Object geoProvidersV2(@NotNull @Query("clientName") String str, @Query("locationUid") String str2, @Query("point.lat") Double d11, @Query("point.lon") Double d12, @Query("lang") String str3, @NotNull d<? super GeoProvidersV2Response> dVar);

    @GET("Geocode")
    Object geocode(@NotNull @Query("clientName") String str, @NotNull @Query("query") String str2, @Query("lang") String str3, @Query("locationUID") String str4, @Query("excludeEnricher") boolean z11, @Query("preferredProviders") List<String> list, @Query("requestSessionId") String str5, @NotNull d<? super GeocodeResponse> dVar);

    @GET("UIDisallowedCountries")
    Object getDisallowedCountries(@NotNull d<? super CountriesResponse> dVar);

    @GET("MapKeys")
    Object getMapKeys(@NotNull @Query("clientName") String str, @NotNull d<? super MapKeysResponse> dVar);

    @GET("RevGeocode")
    Object reverseGeocode(@NotNull @Query("clientName") String str, @Query("point.lat") double d11, @Query("point.lon") double d12, @NotNull @Query("resultType") String str2, @Query("lang") String str3, @Query("locationUID") String str4, @Query("excludeEnricher") boolean z11, @Query("requestSessionId") String str5, @NotNull @Query("preferredProviders") List<String> list, @NotNull d<? super GeocodeResponse> dVar);

    @GET("Suggest")
    Object suggest(@NotNull @Query("clientName") String str, @NotNull @Query("query") String str2, @Query("count") int i11, @Query("lang") String str3, @NotNull @Query("preferredProviders") List<String> list, @Query("bbox.leftLowerCorner.lat") Double d11, @Query("bbox.leftLowerCorner.lon") Double d12, @Query("bbox.rightUpperCorner.lat") Double d13, @Query("bbox.rightUpperCorner.lon") Double d14, @Query("contextLocationUID") String str4, @Query("requestSessionId") String str5, @NotNull d<? super GeocodeSuggestResponse> dVar);
}
