package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonActionResponse;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Api;", "", "", "actionName", "", "body", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonActionResponse;", "saveLuggage", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface AdditionalLuggageV2Api {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/v2/{actionName}")
    Object saveLuggage(@Path("actionName") @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super ActionV2Response<TravelCommonActionResponse>> dVar);
}
