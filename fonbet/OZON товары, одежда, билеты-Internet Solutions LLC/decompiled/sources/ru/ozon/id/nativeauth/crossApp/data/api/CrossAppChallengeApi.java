package ru.ozon.id.nativeauth.crossApp.data.api;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import retrofit2.http.Url;
import ru.ozon.id.nativeauth.crossApp.data.api.CrossAppApi;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeRequestDto;
import ru.ozon.id.nativeauth.crossApp.dto.CrossAppChallengeResponseDto;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/data/api/CrossAppChallengeApi;", "", "", ImagesContract.URL, "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDto;", "body", "Lru/ozon/id/nativeauth/crossApp/data/api/CrossAppApi$a;", "tag", "Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeResponseDto;", "challengeEntryMobile", "(Ljava/lang/String;Lru/ozon/id/nativeauth/crossApp/dto/CrossAppChallengeRequestDto;Lru/ozon/id/nativeauth/crossApp/data/api/CrossAppApi$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CrossAppChallengeApi {

    public static final class a {
    }

    @POST
    Object challengeEntryMobile(@Url @NotNull String str, @Body @NotNull CrossAppChallengeRequestDto crossAppChallengeRequestDto, @Tag @NotNull CrossAppApi.a aVar, @NotNull d<? super CrossAppChallengeResponseDto> dVar);
}
