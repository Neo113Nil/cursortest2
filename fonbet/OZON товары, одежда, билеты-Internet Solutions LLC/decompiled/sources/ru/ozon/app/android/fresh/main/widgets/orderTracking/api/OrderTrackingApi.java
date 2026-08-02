package ru.ozon.app.android.fresh.main.widgets.orderTracking.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.POST;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.fresh.main.widgets.orderTracking.data.OrderTrackingDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/orderTracking/api/OrderTrackingApi;", "", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/fresh/main/widgets/orderTracking/data/OrderTrackingDTO;", "getOrderTracking", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OrderTrackingApi {
    @POST("composer-api.bx/_action/getOrderTracking")
    Object getOrderTracking(@NotNull d<? super ActionV2Response<OrderTrackingDTO>> dVar);
}
