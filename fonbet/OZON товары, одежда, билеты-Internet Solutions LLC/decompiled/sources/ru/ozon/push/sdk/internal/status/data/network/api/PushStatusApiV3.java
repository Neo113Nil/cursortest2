package ru.ozon.push.sdk.internal.status.data.network.api;

import Bh0.a;
import We.M;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.push.sdk.internal.status.data.network.models.PushstatusRequestBodyV3;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/api/PushStatusApiV3;", "", "Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3;", "requestBody", "Lretrofit2/Call;", "LWe/M;", "sendPushStatus", "(Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3;)Lretrofit2/Call;", "sendPushStatusWithSmallCallTimeout", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PushStatusApiV3 {
    @POST("mobile-api.comms/v3/pushstatus")
    @NotNull
    Call<M> sendPushStatus(@Body @NotNull PushstatusRequestBodyV3 requestBody);

    @a
    @POST("mobile-api.comms/v3/pushstatus")
    @NotNull
    Call<M> sendPushStatusWithSmallCallTimeout(@Body @NotNull PushstatusRequestBodyV3 requestBody);
}
