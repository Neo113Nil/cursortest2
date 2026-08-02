package ru.ozon.app.android.mediaupload.video.api;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import ru.ozon.app.android.mediaupload.video.NewUploadingRequest;
import ru.ozon.app.android.mediaupload.video.NewUploadingResponse;
import ru.ozon.app.android.network.interceptors.LongPollingAnnotation;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ>\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/mediaupload/video/api/VideoUploadingComposerApi;", "", "", "uploadProcessID", "uploadRequestId", "Lru/ozon/app/android/mediaupload/video/NewUploadingRequest;", "request", "Lretrofit2/Response;", "Lru/ozon/app/android/mediaupload/video/NewUploadingResponse;", "newUploading", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/mediaupload/video/NewUploadingRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "actionName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/mediaupload/video/NewUploadingRequest;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface VideoUploadingComposerApi {
    @LongPollingAnnotation
    @POST("composer-api.bx/_action/{actionName}")
    Object newUploading(@Header("x-o3-vua-process-id") @NotNull String str, @Header("x-o3-vua-request-id") @NotNull String str2, @Path("actionName") @NotNull String str3, @Body @NotNull NewUploadingRequest newUploadingRequest, @NotNull d<? super Response<NewUploadingResponse>> dVar);

    @LongPollingAnnotation
    @POST("composer-api.bx/_action/newUpload")
    Object newUploading(@Header("x-o3-vua-process-id") @NotNull String str, @Header("x-o3-vua-request-id") @NotNull String str2, @Body @NotNull NewUploadingRequest newUploadingRequest, @NotNull d<? super Response<NewUploadingResponse>> dVar);
}
