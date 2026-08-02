package ru.ozon.app.android.mediaupload.video.chunks;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.O0;
import Ae.x0;
import Ge.n;
import He.b;
import Sc.s;
import Wc.a;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.flags.ParallelVideoUploadChunksLimitFlag;
import ru.ozon.app.android.mediaupload.flags.ParallelVideoUploadPreferredChunkSizeFlag;
import ru.ozon.app.android.mediaupload.flags.ParallelVideoUploadSimultaneousChunksUploadLimitFlag;
import ru.ozon.app.android.mediaupload.video.api.VideoUploadingApi;
import ru.ozon.app.android.mediaupload.video.dto.UploadingProgress;
import ru.ozon.app.android.mediaupload.video.dto.VideoUploadingError;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkUploadingResponseDTO;
import ru.ozon.app.android.mediaupload.video.dto.chunks.SegmentReadInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.UnuploadedChunksInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.UploadedResponseDTO;
import ru.ozon.app.android.network.abtool.FeatureService;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 82\u00020\u0001:\u00018BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b!\u0010\"J,\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00182\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130*¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0016028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ozon/app/android/mediaupload/video/chunks/ChunksUploader;", "", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;", "uploadingApi", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "", "uploadingId", "uploadProcessId", "Landroid/net/Uri;", "fileUri", "", "fileSize", "", "retryChunksUploadWithFallback", "<init>", "(Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureService;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;JZ)V", "Lru/ozon/app/android/mediaupload/video/dto/UploadingProgress;", "upload", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "retryCnt", "", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkInfo;", "uploadChunksPortions", "uploadChunksPortionsAsync", "(ILjava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "reuploadIfNeeded", "(ILkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/mediaupload/video/dto/chunks/UnuploadedChunksInfo;", "chunksForReuploadInfo", "uploadChunks", "(Lru/ozon/app/android/mediaupload/video/dto/chunks/UnuploadedChunksInfo;ILkotlin/coroutines/d;)Ljava/lang/Object;", "chuncks", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkUploadingResponseDTO;", "uploadChunksAsync", "(Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "loadedPartSize", "getPartUploadedPercent", "(J)I", "LAe/h;", "startUploadByChunks", "()LAe/h;", "Lru/ozon/app/android/mediaupload/video/api/VideoUploadingApi;", "Ljava/lang/String;", "Landroid/net/Uri;", "J", "Z", "LAe/x0;", "uploadProgress", "LAe/x0;", "Lru/ozon/app/android/mediaupload/video/chunks/ChunksProvider;", "chunksProvider", "Lru/ozon/app/android/mediaupload/video/chunks/ChunksProvider;", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChunksUploader {

    @NotNull
    private final ChunksProvider chunksProvider;
    private final long fileSize;

    @NotNull
    private final Uri fileUri;
    private final boolean retryChunksUploadWithFallback;

    @NotNull
    private final String uploadProcessId;

    @NotNull
    private final x0<Integer> uploadProgress;

    @NotNull
    private final VideoUploadingApi uploadingApi;

    @NotNull
    private final String uploadingId;

    public ChunksUploader(@NotNull VideoUploadingApi uploadingApi, @NotNull Context appContext, @NotNull FeatureService featureService, @NotNull String uploadingId, @NotNull String uploadProcessId, @NotNull Uri fileUri, long j11, boolean z11) {
        Intrinsics.checkNotNullParameter(uploadingApi, "uploadingApi");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(uploadingId, "uploadingId");
        Intrinsics.checkNotNullParameter(uploadProcessId, "uploadProcessId");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        this.uploadingApi = uploadingApi;
        this.uploadingId = uploadingId;
        this.uploadProcessId = uploadProcessId;
        this.fileUri = fileUri;
        this.fileSize = j11;
        this.retryChunksUploadWithFallback = z11;
        this.uploadProgress = O0.a(0);
        ContentResolver contentResolver = appContext.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        this.chunksProvider = new ChunksProvider(j11, contentResolver, featureService.getIntKey(ParallelVideoUploadChunksLimitFlag.INSTANCE), featureService.getIntKey(ParallelVideoUploadSimultaneousChunksUploadLimitFlag.INSTANCE), featureService.getLongKey(ParallelVideoUploadPreferredChunkSizeFlag.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPartUploadedPercent(long loadedPartSize) {
        return (int) ((loadedPartSize / (this.fileSize - 1)) * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reuploadIfNeeded(int i11, d<? super UploadingProgress> dVar) {
        ChunksUploader$reuploadIfNeeded$1 chunksUploader$reuploadIfNeeded$1;
        int i12;
        int i13;
        Object checkUploaded$default;
        ChunksUploader chunksUploader;
        UploadedResponseDTO uploadedResponseDTO;
        if (dVar instanceof ChunksUploader$reuploadIfNeeded$1) {
            chunksUploader$reuploadIfNeeded$1 = (ChunksUploader$reuploadIfNeeded$1) dVar;
            int i14 = chunksUploader$reuploadIfNeeded$1.label;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                chunksUploader$reuploadIfNeeded$1.label = i14 - LinearLayoutManager.INVALID_OFFSET;
                ChunksUploader$reuploadIfNeeded$1 chunksUploader$reuploadIfNeeded$12 = chunksUploader$reuploadIfNeeded$1;
                Object obj = chunksUploader$reuploadIfNeeded$12.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i12 = chunksUploader$reuploadIfNeeded$12.label;
                if (i12 != 0) {
                    s.b(obj);
                    VideoUploadingApi videoUploadingApi = this.uploadingApi;
                    String str = this.uploadProcessId;
                    String str2 = this.uploadingId;
                    chunksUploader$reuploadIfNeeded$12.L$0 = this;
                    i13 = i11;
                    chunksUploader$reuploadIfNeeded$12.I$0 = i13;
                    chunksUploader$reuploadIfNeeded$12.label = 1;
                    checkUploaded$default = VideoUploadingApi.DefaultImpls.checkUploaded$default(videoUploadingApi, str, str2, null, chunksUploader$reuploadIfNeeded$12, 4, null);
                    if (checkUploaded$default != aVar) {
                        chunksUploader = this;
                    }
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                int i15 = chunksUploader$reuploadIfNeeded$12.I$0;
                chunksUploader = (ChunksUploader) chunksUploader$reuploadIfNeeded$12.L$0;
                s.b(obj);
                checkUploaded$default = obj;
                i13 = i15;
                uploadedResponseDTO = (UploadedResponseDTO) checkUploaded$default;
                if (uploadedResponseDTO.isUploadResponseValid()) {
                    throw new VideoUploadingError("Uploaded response invalid. Chunks overlapping. reuploadWithFallback will start: " + (!chunksUploader.retryChunksUploadWithFallback), !chunksUploader.retryChunksUploadWithFallback);
                }
                if (uploadedResponseDTO.isUploadSucceed(chunksUploader.fileSize)) {
                    return new UploadingProgress(null, true, n.b(chunksUploader.uploadProgress), 1, null);
                }
                UnuploadedChunksInfo notLoadedChunks = chunksUploader.chunksProvider.getNotLoadedChunks(chunksUploader.fileUri, chunksUploader.uploadingId, uploadedResponseDTO.getUploadedParts());
                if (notLoadedChunks.getUnuploadedChunksPortions().isEmpty()) {
                    return new UploadingProgress(null, true, n.b(chunksUploader.uploadProgress), 1, null);
                }
                chunksUploader$reuploadIfNeeded$12.L$0 = null;
                chunksUploader$reuploadIfNeeded$12.label = 2;
                Object uploadChunks = chunksUploader.uploadChunks(notLoadedChunks, i13, chunksUploader$reuploadIfNeeded$12);
                return uploadChunks == aVar ? aVar : uploadChunks;
            }
        }
        chunksUploader$reuploadIfNeeded$1 = new ChunksUploader$reuploadIfNeeded$1(this, dVar);
        ChunksUploader$reuploadIfNeeded$1 chunksUploader$reuploadIfNeeded$122 = chunksUploader$reuploadIfNeeded$1;
        Object obj2 = chunksUploader$reuploadIfNeeded$122.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = chunksUploader$reuploadIfNeeded$122.label;
        if (i12 != 0) {
        }
        uploadedResponseDTO = (UploadedResponseDTO) checkUploaded$default;
        if (uploadedResponseDTO.isUploadResponseValid()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object upload(d<? super UploadingProgress> dVar) {
        return uploadChunksPortionsAsync(4, this.chunksProvider.getNotLoadedChunks(this.fileUri, this.uploadingId, K.f71697a).getUnuploadedChunksPortions(), dVar);
    }

    private final Object uploadChunks(UnuploadedChunksInfo unuploadedChunksInfo, int i11, d<? super UploadingProgress> dVar) {
        boolean z11;
        Integer value;
        ArrayList N11 = C7714v.N(unuploadedChunksInfo.getUnuploadedChunksPortions());
        if (!N11.isEmpty()) {
            Iterator it = N11.iterator();
            while (it.hasNext()) {
                SegmentReadInfo segmentReadInfo = ((ChunkInfo) it.next()).getData().getSegmentReadInfo();
                if (segmentReadInfo != null && segmentReadInfo.getChunkLength() < 0) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (i11 <= 0) {
            throw new VideoUploadingError("retryCount limit reached", false, 2, null);
        }
        if (z11) {
            throw new VideoUploadingError(Nk.a.b("chunkLength < 0 occurred for uploadId: ", this.uploadingId), false, 2, null);
        }
        x0<Integer> x0Var = this.uploadProgress;
        do {
            value = x0Var.getValue();
            value.intValue();
        } while (!x0Var.b(value, new Integer(unuploadedChunksInfo.getLoadedPercent())));
        return uploadChunksPortionsAsync(i11, unuploadedChunksInfo.getUnuploadedChunksPortions(), dVar);
    }

    private final Object uploadChunksAsync(VideoUploadingApi videoUploadingApi, List<ChunkInfo> list, d<? super List<ChunkUploadingResponseDTO>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ChunksUploader$uploadChunksAsync$2(list, this, videoUploadingApi, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadChunksPortionsAsync(int i11, List<? extends List<ChunkInfo>> list, d<? super UploadingProgress> dVar) {
        ChunksUploader$uploadChunksPortionsAsync$1 chunksUploader$uploadChunksPortionsAsync$1;
        int i12;
        ChunksUploader chunksUploader;
        if (dVar instanceof ChunksUploader$uploadChunksPortionsAsync$1) {
            chunksUploader$uploadChunksPortionsAsync$1 = (ChunksUploader$uploadChunksPortionsAsync$1) dVar;
            int i13 = chunksUploader$uploadChunksPortionsAsync$1.label;
            if ((i13 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                chunksUploader$uploadChunksPortionsAsync$1.label = i13 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = chunksUploader$uploadChunksPortionsAsync$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i12 = chunksUploader$uploadChunksPortionsAsync$1.label;
                if (i12 != 0) {
                    s.b(obj);
                    if (list.isEmpty()) {
                        chunksUploader$uploadChunksPortionsAsync$1.label = 1;
                        Object reuploadIfNeeded = reuploadIfNeeded(i11 - 1, chunksUploader$uploadChunksPortionsAsync$1);
                        if (reuploadIfNeeded != aVar) {
                            return reuploadIfNeeded;
                        }
                    } else {
                        List<ChunkInfo> list2 = (List) C7714v.X(list);
                        VideoUploadingApi videoUploadingApi = this.uploadingApi;
                        chunksUploader$uploadChunksPortionsAsync$1.L$0 = this;
                        chunksUploader$uploadChunksPortionsAsync$1.L$1 = list;
                        chunksUploader$uploadChunksPortionsAsync$1.I$0 = i11;
                        chunksUploader$uploadChunksPortionsAsync$1.label = 2;
                        if (uploadChunksAsync(videoUploadingApi, list2, chunksUploader$uploadChunksPortionsAsync$1) != aVar) {
                            chunksUploader = this;
                        }
                    }
                }
                if (i12 == 1) {
                    s.b(obj);
                    return obj;
                }
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return obj;
                }
                i11 = chunksUploader$uploadChunksPortionsAsync$1.I$0;
                list = (List) chunksUploader$uploadChunksPortionsAsync$1.L$1;
                chunksUploader = (ChunksUploader) chunksUploader$uploadChunksPortionsAsync$1.L$0;
                s.b(obj);
                List<? extends List<ChunkInfo>> E11 = C7714v.E(list);
                chunksUploader$uploadChunksPortionsAsync$1.L$0 = null;
                chunksUploader$uploadChunksPortionsAsync$1.L$1 = null;
                chunksUploader$uploadChunksPortionsAsync$1.label = 3;
                Object uploadChunksPortionsAsync = chunksUploader.uploadChunksPortionsAsync(i11, E11, chunksUploader$uploadChunksPortionsAsync$1);
                return uploadChunksPortionsAsync != aVar ? aVar : uploadChunksPortionsAsync;
            }
        }
        chunksUploader$uploadChunksPortionsAsync$1 = new ChunksUploader$uploadChunksPortionsAsync$1(this, dVar);
        Object obj2 = chunksUploader$uploadChunksPortionsAsync$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i12 = chunksUploader$uploadChunksPortionsAsync$1.label;
        if (i12 != 0) {
        }
        List<? extends List<ChunkInfo>> E112 = C7714v.E(list);
        chunksUploader$uploadChunksPortionsAsync$1.L$0 = null;
        chunksUploader$uploadChunksPortionsAsync$1.L$1 = null;
        chunksUploader$uploadChunksPortionsAsync$1.label = 3;
        Object uploadChunksPortionsAsync2 = chunksUploader.uploadChunksPortionsAsync(i11, E112, chunksUploader$uploadChunksPortionsAsync$1);
        if (uploadChunksPortionsAsync2 != aVar2) {
        }
    }

    @NotNull
    public final InterfaceC2395h<UploadingProgress> startUploadByChunks() {
        return C2399j.A(new ChunksUploader$startUploadByChunks$1(this, null));
    }
}
