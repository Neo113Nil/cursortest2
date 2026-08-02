package ru.ozon.app.android.mediaupload.video.dto.chunks;

import G.g;
import Pk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.mediaupload.video.InputStreamRequestBody;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/mediaupload/video/dto/chunks/ChunkInfo;", "", "Lru/ozon/app/android/mediaupload/video/InputStreamRequestBody;", "data", "", "uploadingId", "", "chunkBytesSize", "fileSize", "<init>", "(Lru/ozon/app/android/mediaupload/video/InputStreamRequestBody;Ljava/lang/String;JJ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/mediaupload/video/InputStreamRequestBody;", "getData", "()Lru/ozon/app/android/mediaupload/video/InputStreamRequestBody;", "Ljava/lang/String;", "getUploadingId", "J", "getChunkBytesSize", "()J", "getFileSize", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChunkInfo {
    private final long chunkBytesSize;

    @NotNull
    private final InputStreamRequestBody data;
    private final long fileSize;

    @NotNull
    private final String uploadingId;

    public ChunkInfo(@NotNull InputStreamRequestBody data, @NotNull String uploadingId, long j11, long j12) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uploadingId, "uploadingId");
        this.data = data;
        this.uploadingId = uploadingId;
        this.chunkBytesSize = j11;
        this.fileSize = j12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChunkInfo)) {
            return false;
        }
        ChunkInfo chunkInfo = (ChunkInfo) other;
        return Intrinsics.d(this.data, chunkInfo.data) && Intrinsics.d(this.uploadingId, chunkInfo.uploadingId) && this.chunkBytesSize == chunkInfo.chunkBytesSize && this.fileSize == chunkInfo.fileSize;
    }

    public final long getChunkBytesSize() {
        return this.chunkBytesSize;
    }

    @NotNull
    public final InputStreamRequestBody getData() {
        return this.data;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final String getUploadingId() {
        return this.uploadingId;
    }

    public int hashCode() {
        return Long.hashCode(this.fileSize) + c.a(g.a(this.data.hashCode() * 31, 31, this.uploadingId), 31, this.chunkBytesSize);
    }

    @NotNull
    public String toString() {
        return "ChunkInfo(data=" + this.data + ", uploadingId=" + this.uploadingId + ", chunkBytesSize=" + this.chunkBytesSize + ", fileSize=" + this.fileSize + ")";
    }
}
