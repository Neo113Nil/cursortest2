package ru.ozon.app.android.account.orders.recipientWidget.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientApi;", "", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;", "changeRecipientRequest", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRecipientResponse;", "changeRecipientForRegularDelivery", "(Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeRegularRecipientRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeOrderRecipientRequest;", "changeRecipientForOrder", "(Lru/ozon/app/android/account/orders/recipientWidget/data/ChangeOrderRecipientRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ChangeRecipientApi {
    @POST("composer-api.bx/_action/changeAddressee")
    Object changeRecipientForOrder(@Body @NotNull ChangeOrderRecipientRequest changeOrderRecipientRequest, @NotNull d<? super ChangeRecipientResponse> dVar);

    @POST("composer-api.bx/_action/deliveryUserReceiveUpdate")
    Object changeRecipientForRegularDelivery(@Body @NotNull ChangeRegularRecipientRequest changeRegularRecipientRequest, @NotNull d<? super ChangeRecipientResponse> dVar);
}
