package npi.spay;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;
import spay.sdk.data.dto.response.SPaySdkConfigDto;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lnpi/spay/Kq;", "", "Lretrofit2/Response;", "Lspay/sdk/data/dto/response/SPaySdkConfigDto;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "ipServiceUrl", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Kq {
    @GET
    Object a(@Url @NotNull String str, @NotNull d<? super Response<String>> dVar);

    @GET("sdk-gateway/v1/remoteConfigAndroidv4")
    Object a(@NotNull d<? super Response<SPaySdkConfigDto>> dVar);
}
