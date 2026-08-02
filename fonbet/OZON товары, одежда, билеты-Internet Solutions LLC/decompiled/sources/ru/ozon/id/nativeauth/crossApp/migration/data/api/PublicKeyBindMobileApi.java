package ru.ozon.id.nativeauth.crossApp.migration.data.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import rc0.C9246c;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import ru.ozon.id.nativeauth.crossApp.migration.data.model.PublicKeyBindMobileRequestDto;
import ru.ozon.id.nativeauth.crossApp.migration.data.model.PublicKeyBindMobileResponseDto;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/migration/data/api/PublicKeyBindMobileApi;", "", "", "type", "Lru/ozon/id/nativeauth/crossApp/migration/data/model/PublicKeyBindMobileRequestDto;", "request", "Lrc0/c;", "tag", "Lru/ozon/id/nativeauth/crossApp/migration/data/model/PublicKeyBindMobileResponseDto;", "bind", "(Ljava/lang/String;Lru/ozon/id/nativeauth/crossApp/migration/data/model/PublicKeyBindMobileRequestDto;Lrc0/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PublicKeyBindMobileApi {

    public static final class a {
    }

    @POST("composer-api.bx/_action/publicKeyBindMobile")
    Object bind(@NotNull @Query("type") String str, @Body @NotNull PublicKeyBindMobileRequestDto publicKeyBindMobileRequestDto, @Tag @NotNull C9246c c9246c, @NotNull d<? super PublicKeyBindMobileResponseDto> dVar);
}
