package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/FreshSubscriptionApi;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SubscribeRequest;", "request", "Lretrofit2/Response;", "", "subscribeToItemAvailabilityChange", "(Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SubscribeRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "unsubscribeFromItemAvailabilityChange", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FreshSubscriptionApi {
    @POST("/composer-api.bx/_action/subscriptionsSubscribeToStock")
    Object subscribeToItemAvailabilityChange(@Body @NotNull SubscribeRequest subscribeRequest, @NotNull d<? super Response<Unit>> dVar);

    @POST("/composer-api.bx/_action/subscriptionsUnsubscribeFromStock")
    Object unsubscribeFromItemAvailabilityChange(@Body @NotNull SubscribeRequest subscribeRequest, @NotNull d<? super Response<Unit>> dVar);
}
