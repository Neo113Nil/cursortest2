package ru.ozon.id.nativeauth.data.api;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;
import ru.ozon.id.nativeauth.biometry.data.dto.BiometryEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.DeeplinkOtpFlowDTO;
import ru.ozon.id.nativeauth.data.models.FastEntryActionDTO;
import ru.ozon.id.nativeauth.data.models.LoginErrorActionDTO;
import ru.ozon.id.nativeauth.data.models.PkceAuthParamEntryActionDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007H§@¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0006J0\u0010\u0010\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007H§@¢\u0006\u0004\b\u0010\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0006J0\u0010\u0013\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0007H§@¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/id/nativeauth/data/api/ActionApi;", "", "", ImagesContract.URL, "Lru/ozon/id/nativeauth/data/models/DeeplinkOtpFlowDTO;", "startOtpFlow", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "body", "Lru/ozon/id/nativeauth/data/models/FastEntryActionDTO;", "fastEntryAuth", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/biometry/data/dto/BiometryEntryActionDTO;", "biometryEntryAuth", "Lru/ozon/id/nativeauth/data/models/LoginErrorActionDTO;", "loginError", "continueMobileId", "Lru/ozon/id/nativeauth/data/models/PkceAuthParamEntryActionDTO;", "getPkceAuthVkIdParam", "ozonIdSocialAuthRedirect", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ActionApi {
    @POST
    Object biometryEntryAuth(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super BiometryEntryActionDTO> dVar);

    @POST
    Object continueMobileId(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super FastEntryActionDTO> dVar);

    @POST
    Object fastEntryAuth(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super FastEntryActionDTO> dVar);

    @POST
    Object getPkceAuthVkIdParam(@Url @NotNull String str, @NotNull d<? super PkceAuthParamEntryActionDTO> dVar);

    @POST
    Object loginError(@Url @NotNull String str, @NotNull d<? super LoginErrorActionDTO> dVar);

    @POST
    Object ozonIdSocialAuthRedirect(@Url @NotNull String str, @Body @NotNull Map<String, Object> map, @NotNull d<? super FastEntryActionDTO> dVar);

    @POST
    Object startOtpFlow(@Url @NotNull String str, @NotNull d<? super DeeplinkOtpFlowDTO> dVar);
}
