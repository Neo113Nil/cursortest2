package ru.ozon.app.android.mediaupload.video.api;

import We.K;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Tag;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkUploadingResponseDTO;
import ru.ozon.app.android.mediaupload.video.dto.chunks.UploadedResponseDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JV\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;", "", "", "uploadProcessID", "LWe/K;", "data", "uploadingId", "", "chunkPosition", "chunkBytesSize", "fileSize", "endpointTag", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkUploadingResponseDTO;", "chunkUpload", "(Ljava/lang/String;LWe/K;Ljava/lang/String;JJJLjava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/mediaupload/video/dto/chunks/UploadedResponseDTO;", "checkUploaded", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface VideoUploadingApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object checkUploaded$default(VideoUploadingApi videoUploadingApi, String str, String str2, String str3, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUploaded");
            }
            if ((i11 & 4) != 0) {
                str3 = "checkUploadedTag";
            }
            return videoUploadingApi.checkUploaded(str, str2, str3, dVar);
        }

        public static /* synthetic */ Object chunkUpload$default(VideoUploadingApi videoUploadingApi, String str, K k11, String str2, long j11, long j12, long j13, String str3, d dVar, int i11, Object obj) {
            if (obj == null) {
                return videoUploadingApi.chunkUpload(str, k11, str2, j11, j12, j13, (i11 & 64) != 0 ? "chunkUploadTag" : str3, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: chunkUpload");
        }
    }

    @GET("uploaded")
    Object checkUploaded(@Header("x-o3-vua-process-id") @NotNull String str, @NotNull @Query("id") String str2, @Tag @NotNull String str3, @NotNull d<? super UploadedResponseDTO> dVar);

    @POST("v2/upload")
    Object chunkUpload(@Header("x-o3-vua-process-id") @NotNull String str, @Body @NotNull K k11, @NotNull @Query("id") String str2, @Query("pos") long j11, @Query("chunk") long j12, @Query("size") long j13, @Tag @NotNull String str3, @NotNull d<? super ChunkUploadingResponseDTO> dVar);
}
