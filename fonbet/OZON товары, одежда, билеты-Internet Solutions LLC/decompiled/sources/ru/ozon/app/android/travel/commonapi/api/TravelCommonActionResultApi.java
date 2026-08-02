package ru.ozon.app.android.travel.commonapi.api;

import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Url;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H'¢\u0006\u0004\b\n\u0010\tJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\f\u0010\tJ5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\r\u001a\u00020\u00022\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\tJ2\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResultApi;", "", "", "actionName", "", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponse;", "performAction", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "performActionWithAnyParams", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;", "performActionWithError", "path", "requestBody", "performCustomPostRequest", "suspendActionWithAnyParams", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "commonapi_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TravelCommonActionResultApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<TravelCommonActionResponse> performAction(@Path("actionName") @NotNull String actionName, @Body @NotNull Map<String, String> request);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<TravelCommonActionResponse> performActionWithAnyParams(@Path("actionName") @NotNull String actionName, @Body @NotNull Map<String, Object> request);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @NotNull
    y<TravelCommonActionWithErrorResponse> performActionWithError(@Path("actionName") @NotNull String actionName, @Body @NotNull Map<String, String> request);

    @LongPollingAnnotation
    @POST
    @NotNull
    y<TravelCommonActionWithErrorResponse> performCustomPostRequest(@Url @NotNull String path, @Body @NotNull Map<String, String> requestBody);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    Object suspendActionWithAnyParams(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<TravelCommonActionResponse> dVar);
}
