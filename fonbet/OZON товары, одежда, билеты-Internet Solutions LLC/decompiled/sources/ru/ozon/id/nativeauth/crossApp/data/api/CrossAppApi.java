package ru.ozon.id.nativeauth.crossApp.data.api;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import retrofit2.http.Url;
import ru.ozon.id.nativeauth.crossApp.autologin.data.dto.InitAutologinRequestDto;
import ru.ozon.id.nativeauth.crossApp.autologin.data.dto.InitAutologinResponseDto;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppRequestBodyDTO;
import ru.ozon.id.nativeauth.crossApp.dto.ModalCrossAppResponseDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0012J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\f2\b\b\u0003\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/data/api/CrossAppApi;", "", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;", "body", "Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppResponseDTO;", "modalCrossAppSendChallenge", "(Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", ImagesContract.URL, "modalCrossAppCheckChallenge", "(Ljava/lang/String;Lru/ozon/id/nativeauth/crossApp/dto/ModalCrossAppRequestBodyDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "type", "Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinRequestDto;", "Lru/ozon/id/nativeauth/crossApp/data/api/CrossAppApi$a;", "tag", "Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinResponseDto;", "initAutologinMobile", "(Ljava/lang/String;Lru/ozon/id/nativeauth/crossApp/autologin/data/dto/InitAutologinRequestDto;Lru/ozon/id/nativeauth/crossApp/data/api/CrossAppApi$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CrossAppApi {

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f97223a = new a();

        private a() {
        }
    }

    public static final class b {
    }

    @POST("composer-api.bx/_action/initAutologinMobile")
    Object initAutologinMobile(@NotNull @Query("type") String str, @Body @NotNull InitAutologinRequestDto initAutologinRequestDto, @Tag @NotNull a aVar, @NotNull d<? super InitAutologinResponseDto> dVar);

    @POST
    Object modalCrossAppCheckChallenge(@Url @NotNull String str, @Body @NotNull ModalCrossAppRequestBodyDTO modalCrossAppRequestBodyDTO, @NotNull d<? super ModalCrossAppResponseDTO> dVar);

    @POST("composer-api.bx/_action/ozonIdModalCrossApp?type=sendChallenge")
    Object modalCrossAppSendChallenge(@Body @NotNull ModalCrossAppRequestBodyDTO modalCrossAppRequestBodyDTO, @NotNull d<? super ModalCrossAppResponseDTO> dVar);
}
