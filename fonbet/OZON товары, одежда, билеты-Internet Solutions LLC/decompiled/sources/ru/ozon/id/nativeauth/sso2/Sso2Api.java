package ru.ozon.id.nativeauth.sso2;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Tag;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0013J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/ozon/id/nativeauth/sso2/Sso2Api;", "", "LIc0/j;", "tag", "Lretrofit2/Response;", "Lru/ozon/id/nativeauth/sso2/Sso2MobileConfigResponseDTO;", "ssoMobileConfig", "(LIc0/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileRequest;", "body", "Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileResponse;", "domainsAuthMobile", "(Lru/ozon/id/nativeauth/sso2/Sso2DomainsAuthMobileRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", ImagesContract.URL, "Lru/ozon/id/nativeauth/sso2/Sso2Api$a;", "", "authDomain", "(Ljava/lang/String;Lru/ozon/id/nativeauth/sso2/Sso2Api$a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Sso2Api {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f97363a = new a();

        private a() {
        }
    }

    @GET
    Object authDomain(@Url @NotNull String str, @Tag @NotNull a aVar, @NotNull kotlin.coroutines.d<? super Response<Unit>> dVar);

    @POST("composer-api.bx/_action/domainsAuthMobile")
    Object domainsAuthMobile(@Body @NotNull Sso2DomainsAuthMobileRequest sso2DomainsAuthMobileRequest, @NotNull kotlin.coroutines.d<? super Sso2DomainsAuthMobileResponse> dVar);

    @POST("composer-api.bx/_action/ssoMobileConfig")
    Object ssoMobileConfig(@Tag @NotNull Ic0.j jVar, @NotNull kotlin.coroutines.d<? super Response<Sso2MobileConfigResponseDTO>> dVar);
}
