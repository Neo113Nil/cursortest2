package ru.ozon.id.nativeauth.fintech.api;

import We.D;
import We.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import ru.ozon.id.nativeauth.fintech.api.dto.CameraVideoUploadResponse;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\bJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\bJ(\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00100\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/id/nativeauth/fintech/api/FintechRecoveryCameraApi;", "", "", "token", "LWe/D$c;", "image", "", "uploadPassportPhoto", "(Ljava/lang/String;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "uploadSelfiePhoto", "video", "Lru/ozon/id/nativeauth/fintech/api/dto/CameraVideoUploadResponse;", "uploadVideo", "LWe/K;", "request", "Lretrofit2/Response;", "", "postForCachingTestCookie", "(LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FintechRecoveryCameraApi {
    @Headers({"Cache-Control: no-cache", "accept: application/json", "Content-Type: application/json"})
    @POST("/mobile/obank/features")
    Object postForCachingTestCookie(@Body @NotNull K k11, @NotNull d<? super Response<List<Object>>> dVar);

    @POST("/files/access-recovery/upload-doc-photo")
    @Multipart
    Object uploadPassportPhoto(@Header("IssueToken") @NotNull String str, @NotNull @Part D.c cVar, @NotNull d<? super Unit> dVar);

    @POST("/files/access-recovery/upload-self-photo")
    @Multipart
    Object uploadSelfiePhoto(@Header("IssueToken") @NotNull String str, @NotNull @Part D.c cVar, @NotNull d<? super Unit> dVar);

    @POST("/files/access-recovery/upload-video")
    @Multipart
    Object uploadVideo(@Header("IssueToken") @NotNull String str, @NotNull @Part D.c cVar, @NotNull d<? super CameraVideoUploadResponse> dVar);
}
