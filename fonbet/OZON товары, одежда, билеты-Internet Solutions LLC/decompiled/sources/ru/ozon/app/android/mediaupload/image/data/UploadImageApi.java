package ru.ozon.app.android.mediaupload.image.data;

import We.D;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import ru.ozon.app.android.mediaupload.image.data.response.ReturnUploadImageDTO;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedImageDTO;
import ru.ozon.app.android.mediaupload.image.data.response.UploadedProductImageDTO;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\n\u0010\tJ:\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\n\u0010\fJ0\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u000e\u0010\tJ:\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u000e\u0010\fJ0\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/mediaupload/image/data/UploadImageApi;", "", "LWe/D$c;", "body", "", "", "params", "Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "uploadSocialPostImage", "(LWe/D$c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "uploadReviewImage", "actionName", "(Ljava/lang/String;LWe/D$c;Ljava/util/Map;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/mediaupload/image/data/response/UploadedProductImageDTO;", "uploadProductImage", "Lru/ozon/app/android/mediaupload/image/data/response/ReturnUploadImageDTO;", "uploadReturnImage", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface UploadImageApi {
    @LongPollingAnnotation
    @POST("/composer-api.bx/_action/rpImageUpload")
    @Multipart
    Object uploadProductImage(@NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super UploadedProductImageDTO> dVar);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @Multipart
    Object uploadProductImage(@Path("actionName") @NotNull String str, @NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super UploadedProductImageDTO> dVar);

    @LongPollingAnnotation
    @POST("/composer-api.bx/_action/rmsUploadImages")
    @Multipart
    Object uploadReturnImage(@NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super ReturnUploadImageDTO> dVar);

    @LongPollingAnnotation
    @POST("/composer-api.bx/_action/rdImageUpload")
    @Multipart
    Object uploadReviewImage(@NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super UploadedImageDTO> dVar);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    @Multipart
    Object uploadReviewImage(@Path("actionName") @NotNull String str, @NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super UploadedImageDTO> dVar);

    @LongPollingAnnotation
    @POST("/composer-api.bx/_action/postImageUpload")
    @Multipart
    Object uploadSocialPostImage(@NotNull @Part D.c cVar, @NotNull @PartMap Map<String, String> map, @NotNull d<? super UploadedImageDTO> dVar);
}
