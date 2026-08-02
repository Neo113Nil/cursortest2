package ru.ozon.fintech.auth.network;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import ru.ozon.fintech.auth.network.dto.AuthCreateBiometricTokenRequestDto;
import ru.ozon.fintech.auth.network.dto.AuthCreateBiometricTokenResponseDto;
import ru.ozon.fintech.auth.network.dto.AuthLoginRequestDto;
import ru.ozon.fintech.auth.network.dto.AuthLoginResponseDto;
import ru.ozon.fintech.auth.network.dto.AuthThrottleStatusResponseDto;
import ru.ozon.fintech.auth.network.dto.EnableFastEntryRequestDto;
import ru.ozon.fintech.auth.network.dto.EnableFastEntryResponseDto;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/auth/network/AuthNetworkApiV2;", "", "Lru/ozon/fintech/auth/network/dto/AuthLoginRequestDto;", "authLoginRequestDto", "Lru/ozon/fintech/auth/network/dto/AuthLoginResponseDto;", "authLogin", "(Lru/ozon/fintech/auth/network/dto/AuthLoginRequestDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/auth/network/dto/AuthCreateBiometricTokenRequestDto;", "authCreateBiometricTokenRequestDto", "Lru/ozon/fintech/auth/network/dto/AuthCreateBiometricTokenResponseDto;", "authCreateBiometricToken", "(Lru/ozon/fintech/auth/network/dto/AuthCreateBiometricTokenRequestDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/fintech/auth/network/dto/AuthThrottleStatusResponseDto;", "authThrottleStatus", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "logOut", "Lru/ozon/fintech/auth/network/dto/EnableFastEntryRequestDto;", "request", "Lru/ozon/fintech/auth/network/dto/EnableFastEntryResponseDto;", "enableFastEntry", "(Lru/ozon/fintech/auth/network/dto/EnableFastEntryRequestDto;Lkotlin/coroutines/d;)Ljava/lang/Object;", "fintech-auth_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AuthNetworkApiV2 {
    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("mobile/auth/createBiometricToken")
    Object authCreateBiometricToken(@Body @NotNull AuthCreateBiometricTokenRequestDto authCreateBiometricTokenRequestDto, @NotNull d<? super AuthCreateBiometricTokenResponseDto> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("mobile/auth/login")
    Object authLogin(@Body @NotNull AuthLoginRequestDto authLoginRequestDto, @NotNull d<? super AuthLoginResponseDto> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("mobile/auth/throttleStatus")
    Object authThrottleStatus(@NotNull d<? super AuthThrottleStatusResponseDto> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("/mobile/auth/enableFastLogin")
    Object enableFastEntry(@Body @NotNull EnableFastEntryRequestDto enableFastEntryRequestDto, @NotNull d<? super EnableFastEntryResponseDto> dVar);

    @Headers({"Cache-Control: no-cache", "accept: application/json"})
    @POST("mobile/obank/postLogout")
    Object logOut(@NotNull d<? super Unit> dVar);
}
