package ru.ozon.id.nativeauth.biometry.data.api;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import ru.ozon.id.nativeauth.biometry.data.dto.ClearBiometryDeviceRequestDTO;
import ru.ozon.id.nativeauth.biometry.data.dto.PublicKeyRequestDTO;
import ru.ozon.id.nativeauth.biometry.data.dto.SaveAuthBiometrySettingsRequestDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/id/nativeauth/biometry/data/api/AuthBiometryApi;", "", "Lru/ozon/id/nativeauth/biometry/data/dto/PublicKeyRequestDTO;", "body", "", "setDevicePublicKey", "(Lru/ozon/id/nativeauth/biometry/data/dto/PublicKeyRequestDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/biometry/data/dto/SaveAuthBiometrySettingsRequestDTO;", "saveAuthBiometricSettings", "(Lru/ozon/id/nativeauth/biometry/data/dto/SaveAuthBiometrySettingsRequestDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/biometry/data/dto/ClearBiometryDeviceRequestDTO;", "clearBiometryByDevice", "(Lru/ozon/id/nativeauth/biometry/data/dto/ClearBiometryDeviceRequestDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AuthBiometryApi {
    @POST("composer-api.bx/_action/clearBiometryByDevice")
    Object clearBiometryByDevice(@Body @NotNull ClearBiometryDeviceRequestDTO clearBiometryDeviceRequestDTO, @NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/saveAuthBiometrySettings")
    Object saveAuthBiometricSettings(@Body @NotNull SaveAuthBiometrySettingsRequestDTO saveAuthBiometrySettingsRequestDTO, @NotNull d<? super Unit> dVar);

    @POST("composer-api.bx/_action/setDevicePublicKey")
    Object setDevicePublicKey(@Body @NotNull PublicKeyRequestDTO publicKeyRequestDTO, @NotNull d<? super Unit> dVar);
}
