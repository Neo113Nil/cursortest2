package ru.ozon.app.android.mediaupload.video.chunks;

import We.C;
import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.InputStreamRequestBody;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.ChunkStartEndStruct;
import ru.ozon.app.android.mediaupload.video.dto.chunks.SegmentReadInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.UnuploadedChunksInfo;
import ru.ozon.app.android.mediaupload.video.dto.chunks.UploadedResponseDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0016\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/mediaupload/video/chunks/ChunksProvider;", "", "fileSize", "", "contentResolver", "Landroid/content/ContentResolver;", "chunksCount", "", "chunkCountSimultaneousUploadPortionLimit", "preferredChunkSize", "<init>", "(JLandroid/content/ContentResolver;IIJ)V", "chunkSizeBytesCache", "Ljava/lang/Long;", "getNotLoadedChunks", "Lru/ozon/app/android/mediaupload/video/dto/chunks/UnuploadedChunksInfo;", "fileUri", "Landroid/net/Uri;", "uploadingId", "", "uploadedParts", "", "Lru/ozon/app/android/mediaupload/video/dto/chunks/UploadedResponseDTO$UploadedParts;", "getChunksForRetryList", "Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkStartEndStruct;", "getUnuploadedParts", "uploadedPartsList", "getUploadedPercent", "chunksForRetryList", "getChunkSizeBytes", "determineChunkSizeInBytes", "Companion", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChunksProvider {
    private final int chunkCountSimultaneousUploadPortionLimit;
    private Long chunkSizeBytesCache;
    private final int chunksCount;

    @NotNull
    private final ContentResolver contentResolver;
    private final long fileSize;
    private final long preferredChunkSize;

    public ChunksProvider(long j11, @NotNull ContentResolver contentResolver, int i11, int i12, long j12) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.fileSize = j11;
        this.contentResolver = contentResolver;
        this.chunksCount = i11;
        this.chunkCountSimultaneousUploadPortionLimit = i12;
        this.preferredChunkSize = j12;
    }

    private final long determineChunkSizeInBytes() {
        return Math.min(Math.max(this.fileSize / Math.max(1, this.chunksCount), this.preferredChunkSize), this.fileSize);
    }

    private final long getChunkSizeBytes() {
        Long l11 = this.chunkSizeBytesCache;
        if (l11 != null) {
            return l11.longValue();
        }
        long determineChunkSizeInBytes = determineChunkSizeInBytes();
        this.chunkSizeBytesCache = Long.valueOf(determineChunkSizeInBytes);
        return determineChunkSizeInBytes;
    }

    private final List<ChunkStartEndStruct> getChunksForRetryList(List<UploadedResponseDTO.UploadedParts> uploadedParts) {
        ArrayList arrayList = new ArrayList();
        long chunkSizeBytes = getChunkSizeBytes();
        for (ChunkStartEndStruct chunkStartEndStruct : getUnuploadedParts(uploadedParts, this.fileSize)) {
            if ((chunkStartEndStruct.getEnd() - chunkStartEndStruct.getStart()) + 1 > chunkSizeBytes) {
                long start = chunkStartEndStruct.getStart();
                long start2 = chunkStartEndStruct.getStart() + chunkSizeBytes;
                while (start2 <= chunkStartEndStruct.getEnd()) {
                    arrayList.add(new ChunkStartEndStruct(start, start2));
                    long j11 = chunkSizeBytes + 1;
                    start += j11;
                    start2 += j11;
                }
                if (start < chunkStartEndStruct.getEnd()) {
                    arrayList.add(new ChunkStartEndStruct(start, chunkStartEndStruct.getEnd()));
                }
            } else {
                arrayList.add(chunkStartEndStruct);
            }
        }
        return arrayList;
    }

    private final List<ChunkStartEndStruct> getUnuploadedParts(List<UploadedResponseDTO.UploadedParts> uploadedPartsList, long fileSize) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : uploadedPartsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            UploadedResponseDTO.UploadedParts uploadedParts = (UploadedResponseDTO.UploadedParts) obj;
            if (i11 == 0 && uploadedParts.getStart() > 0) {
                arrayList.add(new ChunkStartEndStruct(0L, uploadedParts.getStart() - 1));
                if (uploadedPartsList.size() == 1) {
                    long j11 = fileSize - 1;
                    if (uploadedParts.getEnd() < j11) {
                        arrayList.add(new ChunkStartEndStruct(uploadedParts.getEnd() + 1, j11));
                    }
                }
            } else if (i11 == uploadedPartsList.size() - 1) {
                long j12 = fileSize - 1;
                if (uploadedParts.getEnd() < j12) {
                    arrayList.add(new ChunkStartEndStruct(uploadedParts.getEnd() + 1, j12));
                } else {
                    ChunkStartEndStruct chunkStartEndStruct = new ChunkStartEndStruct(uploadedPartsList.get(i11 - 1).getEnd() + 1, uploadedParts.getStart() - 1);
                    if (!arrayList.contains(chunkStartEndStruct)) {
                        arrayList.add(chunkStartEndStruct);
                    }
                }
            } else {
                arrayList.add(new ChunkStartEndStruct(uploadedParts.getEnd() + 1, uploadedPartsList.get(i12).getStart() - 1));
            }
            i11 = i12;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new ChunkStartEndStruct(0L, fileSize - 1));
        }
        return arrayList;
    }

    private final int getUploadedPercent(List<ChunkStartEndStruct> chunksForRetryList) {
        float f7 = this.fileSize - 1;
        long j11 = 0;
        for (ChunkStartEndStruct chunkStartEndStruct : chunksForRetryList) {
            j11 += chunkStartEndStruct.getEnd() - (chunkStartEndStruct.getStart() - 1);
        }
        float f11 = 100;
        return (int) (f11 - ((j11 / f7) * f11));
    }

    @NotNull
    public final UnuploadedChunksInfo getNotLoadedChunks(@NotNull Uri fileUri, @NotNull String uploadingId, @NotNull List<UploadedResponseDTO.UploadedParts> uploadedParts) {
        Uri fileUri2 = fileUri;
        Intrinsics.checkNotNullParameter(fileUri2, "fileUri");
        String uploadingId2 = uploadingId;
        Intrinsics.checkNotNullParameter(uploadingId2, "uploadingId");
        Intrinsics.checkNotNullParameter(uploadedParts, "uploadedParts");
        List<ChunkStartEndStruct> chunksForRetryList = getChunksForRetryList(uploadedParts);
        int uploadedPercent = getUploadedPercent(chunksForRetryList);
        List<ChunkStartEndStruct> list = chunksForRetryList;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (ChunkStartEndStruct chunkStartEndStruct : list) {
            long end = chunkStartEndStruct.getEnd() - (chunkStartEndStruct.getStart() - 1);
            ContentResolver contentResolver = this.contentResolver;
            C.f33536g.getClass();
            arrayList.add(new ChunkInfo(new InputStreamRequestBody(contentResolver, fileUri2, C.a.a("application/octet-stream"), chunkStartEndStruct.getStart(), new SegmentReadInfo(2048L, end)), uploadingId2, end, this.fileSize));
            fileUri2 = fileUri;
            uploadingId2 = uploadingId;
        }
        return new UnuploadedChunksInfo(C7714v.y(arrayList, this.chunkCountSimultaneousUploadPortionLimit), uploadedPercent);
    }
}
