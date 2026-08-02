package ru.ozon.app.android.account.orders.cancel.data;

import W10.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JR\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/data/CancelOrderRepository;", "", "", "link", "reasonId", "comment", "", "returnItemsToCart", "", "body", "LW10/c;", "trackingData", "Lru/ozon/app/android/account/orders/cancel/data/CancelOrderResponse;", "cancelOrder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/orders/cancel/data/FetchCancelPostingsAction;", "fetchCancelPostings", "(Ljava/lang/String;Ljava/util/Map;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/orders/cancel/data/AcceptPointsResponse;", "declineCancelPostings", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CancelOrderRepository {
    Object cancelOrder(@NotNull String str, @NotNull String str2, String str3, Boolean bool, Map<String, String> map, @NotNull c cVar, @NotNull d<? super CancelOrderResponse> dVar);

    Object declineCancelPostings(@NotNull String str, Map<String, String> map, @NotNull c cVar, @NotNull d<? super AcceptPointsResponse> dVar);

    Object fetchCancelPostings(@NotNull String str, Map<String, String> map, @NotNull c cVar, @NotNull d<? super FetchCancelPostingsAction> dVar);
}
