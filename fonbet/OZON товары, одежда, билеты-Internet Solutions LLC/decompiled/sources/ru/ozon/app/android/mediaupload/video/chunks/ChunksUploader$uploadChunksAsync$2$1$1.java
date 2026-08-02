package ru.ozon.app.android.mediaupload.video.chunks;

import Ae.x0;
import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.video.InputStreamRequestBody;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingApi;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkUploadingResponseDTO;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkUploadingResponseDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkUploadingResponseDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.mediaupload.video.chunks.ChunksUploader$uploadChunksAsync$2$1$1", f = "ChunksUploader.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChunksUploader$uploadChunksAsync$2$1$1 extends j implements Function2<M, d<? super ChunkUploadingResponseDTO>, Object> {
    final /* synthetic */ ChunkInfo $chunkInfo;
    final /* synthetic */ VideoUploadingApi $uploadingApi;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChunksUploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChunksUploader$uploadChunksAsync$2$1$1(ChunksUploader chunksUploader, VideoUploadingApi videoUploadingApi, ChunkInfo chunkInfo, d<? super ChunksUploader$uploadChunksAsync$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = chunksUploader;
        this.$uploadingApi = videoUploadingApi;
        this.$chunkInfo = chunkInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChunksUploader$uploadChunksAsync$2$1$1 chunksUploader$uploadChunksAsync$2$1$1 = new ChunksUploader$uploadChunksAsync$2$1$1(this.this$0, this.$uploadingApi, this.$chunkInfo, dVar);
        chunksUploader$uploadChunksAsync$2$1$1.L$0 = obj;
        return chunksUploader$uploadChunksAsync$2$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object failure;
        x0 x0Var;
        Object value;
        int intValue;
        int partUploadedPercent;
        String str;
        Object chunkUpload$default;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                VideoUploadingApi videoUploadingApi = this.$uploadingApi;
                ChunksUploader chunksUploader = this.this$0;
                ChunkInfo chunkInfo = this.$chunkInfo;
                str = chunksUploader.uploadProcessId;
                InputStreamRequestBody data = chunkInfo.getData();
                String uploadingId = chunkInfo.getUploadingId();
                long startPosition = chunkInfo.getData().getStartPosition();
                long chunkBytesSize = chunkInfo.getChunkBytesSize();
                long fileSize = chunkInfo.getFileSize();
                this.label = 1;
                chunkUpload$default = VideoUploadingApi.DefaultImpls.chunkUpload$default(videoUploadingApi, str, data, uploadingId, startPosition, chunkBytesSize, fileSize, null, this, 64, null);
                if (chunkUpload$default == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                chunkUpload$default = obj;
            }
            failure = new Result.Success((ChunkUploadingResponseDTO) chunkUpload$default);
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        if (failure instanceof Result.Failure) {
            return new ChunkUploadingResponseDTO(Nk.a.b("Chunk upload failed with: ", ((Result.Failure) failure).getThrowable().getMessage()));
        }
        if (!(failure instanceof Result.Success)) {
            throw new o();
        }
        x0Var = this.this$0.uploadProgress;
        ChunksUploader chunksUploader2 = this.this$0;
        ChunkInfo chunkInfo2 = this.$chunkInfo;
        do {
            value = x0Var.getValue();
            intValue = ((Number) value).intValue();
            partUploadedPercent = chunksUploader2.getPartUploadedPercent(chunkInfo2.getChunkBytesSize());
        } while (!x0Var.b(value, new Integer(partUploadedPercent + intValue)));
        return (ChunkUploadingResponseDTO) ((Result.Success) failure).getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super ChunkUploadingResponseDTO> dVar) {
        return ((ChunksUploader$uploadChunksAsync$2$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
