package ru.ozon.fintech.notifications.network;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import ru.ozon.fintech.notifications.models.GetPushBodyResponse;
import ru.ozon.fintech.notifications.models.NotificationGwt3dsBody;
import ru.ozon.fintech.notifications.models.NotificationGwt3dsResponse;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/fintech/notifications/network/FintechNotificationApi;", "", "", "id", "Lru/ozon/fintech/notifications/models/GetPushBodyResponse;", "getPushBody", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/notifications/models/NotificationGwt3dsBody;", "notificationGwt3dsBody", "Lru/ozon/fintech/notifications/models/NotificationGwt3dsResponse;", "encryptedPush", "(Lru/ozon/fintech/notifications/models/NotificationGwt3dsBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FintechNotificationApi {
    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("mobile/obank/encryptedPush")
    Object encryptedPush(@Body @NotNull NotificationGwt3dsBody notificationGwt3dsBody, @NotNull d<? super NotificationGwt3dsResponse> dVar);

    @POST("mobile/rudy/get-push")
    Object getPushBody(@NotNull @Query("id") String str, @NotNull d<? super GetPushBodyResponse> dVar);
}
