package ru.ozon.id.nativeauth.instantAuth.data.api;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;
import ru.ozon.id.nativeauth.instantAuth.data.CredentialDTO;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginDisableRequestBody;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginDisableResponse;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginEnableRequestBody;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginRequestBody;
import ru.ozon.id.nativeauth.instantAuth.data.api.dto.InstantLoginResponse;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J:\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u0011\u001a\u00020\u00102\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/id/nativeauth/instantAuth/data/api/InstantLoginApi;", "", "Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginRequestBody;", "body", "Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginResponse;", "auth", "(Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "action", "", "queryParams", "Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginEnableRequestBody;", "Lru/ozon/id/nativeauth/instantAuth/data/CredentialDTO;", "enable", "(Ljava/lang/String;Ljava/util/Map;Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginEnableRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginDisableRequestBody;", "Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginDisableResponse;", "disable", "(Ljava/util/Map;Lru/ozon/id/nativeauth/instantAuth/data/api/dto/InstantLoginDisableRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InstantLoginApi {
    @POST("composer-api.bx/_action/instantLoginMobile")
    Object auth(@Body @NotNull InstantLoginRequestBody instantLoginRequestBody, @NotNull d<? super InstantLoginResponse> dVar);

    @POST("composer-api.bx/_action/instantLoginDisable")
    Object disable(@QueryMap @NotNull Map<String, String> map, @Body @NotNull InstantLoginDisableRequestBody instantLoginDisableRequestBody, @NotNull d<? super InstantLoginDisableResponse> dVar);

    @POST("composer-api.bx/_action/{action}")
    Object enable(@Path("action") @NotNull String str, @QueryMap @NotNull Map<String, String> map, @Body @NotNull InstantLoginEnableRequestBody instantLoginEnableRequestBody, @NotNull d<? super CredentialDTO> dVar);
}
