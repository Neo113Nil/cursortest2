package ru.ozon.fintech.features.camera.network;

import We.D;
import We.E;
import We.K;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.ozon.fintech.features.camera.network.models.CameraVideoUploadResponse;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/camera/network/CameraNetwork;", "", "", "source", "LWe/D$c;", "video", "Lru/ozon/fintech/features/camera/network/models/CameraVideoUploadResponse;", "uploadVideo", "(Ljava/lang/String;LWe/D$c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "path", "LWe/K;", "request", "Lretrofit2/Response;", "", "postForCachingTestCookie", "(Ljava/lang/String;LWe/K;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Companion", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CameraNetwork {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/fintech/features/camera/network/CameraNetwork$Companion;", "", "<init>", "()V", "", "baseUrl", "LWe/E;", "okHttpClient", "Lru/ozon/fintech/features/camera/network/CameraNetwork;", "create", "(Ljava/lang/String;LWe/E;)Lru/ozon/fintech/features/camera/network/CameraNetwork;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CameraNetwork create(@NotNull String baseUrl, @NotNull E okHttpClient) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
            Object create = new Retrofit.Builder().baseUrl(baseUrl).client(okHttpClient).addConverterFactory(MoshiConverterFactory.create()).build().create(CameraNetwork.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (CameraNetwork) create;
        }
    }

    @Headers({"Cache-Control: no-cache", "Accept: application/json", "Content-Type: application/json"})
    @POST("{path}")
    Object postForCachingTestCookie(@Path(encoded = true, value = "path") @NotNull String str, @Body @NotNull K k11, @NotNull d<? super Response<List<Object>>> dVar);

    @POST("/public/files/upload")
    @Multipart
    Object uploadVideo(@NotNull @Query("source") String str, @NotNull @Part D.c cVar, @NotNull d<? super CameraVideoUploadResponse> dVar);
}
