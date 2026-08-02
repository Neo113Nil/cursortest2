package ru.ozon.push.sdk.internal.token.api;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/OldTokenApi;", "Lru/ozon/push/sdk/internal/token/api/TokenApi;", "updateToken", "Lretrofit2/Call;", "", "request", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest;", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OldTokenApi extends TokenApi {
    @Override // ru.ozon.push.sdk.internal.token.api.TokenApi
    @POST("composer-api.bx/_action/actionV2TokenUpdate")
    @NotNull
    Call<Unit> updateToken(@Body @NotNull TokenUpdateRequest request);
}
