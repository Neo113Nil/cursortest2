package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionWithErrorResponse;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J0\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursLoader/data/ToursLoaderApi;", "", "", "actionName", "", "request", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionWithErrorResponse;", "performActionWithError", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ToursLoaderApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    Object performActionWithError(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, String> map, @NotNull d<? super TravelCommonActionWithErrorResponse> dVar);
}
