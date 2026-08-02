package ru.ozon.app.android.location.api;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/location/api/LocationApi;", "", "Lru/ozon/app/android/location/api/CitySaverRequest;", "citySaverRequest", "Lio/reactivex/y;", "Lru/ozon/app/android/location/api/CitySaverResponse;", "saveCity", "(Lru/ozon/app/android/location/api/CitySaverRequest;)Lio/reactivex/y;", "Lru/ozon/app/android/location/api/ComposerLocationResponse;", "getCurrentLocation", "()Lio/reactivex/y;", "location_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LocationApi {
    @GET("composer-api.bx/_action/currentLocation")
    @NotNull
    y<ComposerLocationResponse> getCurrentLocation();

    @POST("composer-api.bx/_action/citySaver")
    @NotNull
    y<CitySaverResponse> saveCity(@Body @NotNull CitySaverRequest citySaverRequest);
}
