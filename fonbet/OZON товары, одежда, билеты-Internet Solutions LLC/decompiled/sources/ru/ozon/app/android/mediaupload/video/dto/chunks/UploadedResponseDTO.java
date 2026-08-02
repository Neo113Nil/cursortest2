package ru.ozon.app.android.mediaupload.video.dto.chunks;

import An.C2439a;
import C.C2702w;
import Pk0.c;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/mediaupload/video/dto/chunks/UploadedResponseDTO;", "", "uploadId", "", "uploadedParts", "", "Lru/ozon/app/android/mediaupload/video/dto/chunks/UploadedResponseDTO$UploadedParts;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getUploadId", "()Ljava/lang/String;", "getUploadedParts", "()Ljava/util/List;", "isUploadSucceed", "", "fileSize", "", "isUploadResponseValid", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "UploadedParts", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadedResponseDTO {

    @NotNull
    private final String uploadId;

    @NotNull
    private final List<UploadedParts> uploadedParts;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/mediaupload/video/dto/chunks/UploadedResponseDTO$UploadedParts;", "", "start", "", "end", "size", "<init>", "(JJJ)V", "getStart", "()J", "getEnd", "getSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UploadedParts {
        private final long end;
        private final long size;
        private final long start;

        public UploadedParts(@i(name = "start") long j11, @i(name = "end") long j12, @i(name = "size") long j13) {
            this.start = j11;
            this.end = j12;
            this.size = j13;
        }

        public static /* synthetic */ UploadedParts copy$default(UploadedParts uploadedParts, long j11, long j12, long j13, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = uploadedParts.start;
            }
            long j14 = j11;
            if ((i11 & 2) != 0) {
                j12 = uploadedParts.end;
            }
            long j15 = j12;
            if ((i11 & 4) != 0) {
                j13 = uploadedParts.size;
            }
            return uploadedParts.copy(j14, j15, j13);
        }

        /* renamed from: component1, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* renamed from: component2, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* renamed from: component3, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        @NotNull
        public final UploadedParts copy(@i(name = "start") long start, @i(name = "end") long end, @i(name = "size") long size) {
            return new UploadedParts(start, end, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UploadedParts)) {
                return false;
            }
            UploadedParts uploadedParts = (UploadedParts) other;
            return this.start == uploadedParts.start && this.end == uploadedParts.end && this.size == uploadedParts.size;
        }

        public final long getEnd() {
            return this.end;
        }

        public final long getSize() {
            return this.size;
        }

        public final long getStart() {
            return this.start;
        }

        public int hashCode() {
            return Long.hashCode(this.size) + c.a(Long.hashCode(this.start) * 31, 31, this.end);
        }

        @NotNull
        public String toString() {
            long j11 = this.start;
            long j12 = this.end;
            long j13 = this.size;
            StringBuilder d11 = C2702w.d(j11, "UploadedParts(start=", ", end=");
            d11.append(j12);
            d11.append(", size=");
            d11.append(j13);
            d11.append(")");
            return d11.toString();
        }
    }

    public UploadedResponseDTO(@i(name = "upload_id") @NotNull String uploadId, @i(name = "parts") @NotNull List<UploadedParts> uploadedParts) {
        Intrinsics.checkNotNullParameter(uploadId, "uploadId");
        Intrinsics.checkNotNullParameter(uploadedParts, "uploadedParts");
        this.uploadId = uploadId;
        this.uploadedParts = uploadedParts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadedResponseDTO copy$default(UploadedResponseDTO uploadedResponseDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadedResponseDTO.uploadId;
        }
        if ((i11 & 2) != 0) {
            list = uploadedResponseDTO.uploadedParts;
        }
        return uploadedResponseDTO.copy(str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUploadId() {
        return this.uploadId;
    }

    @NotNull
    public final List<UploadedParts> component2() {
        return this.uploadedParts;
    }

    @NotNull
    public final UploadedResponseDTO copy(@i(name = "upload_id") @NotNull String uploadId, @i(name = "parts") @NotNull List<UploadedParts> uploadedParts) {
        Intrinsics.checkNotNullParameter(uploadId, "uploadId");
        Intrinsics.checkNotNullParameter(uploadedParts, "uploadedParts");
        return new UploadedResponseDTO(uploadId, uploadedParts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedResponseDTO)) {
            return false;
        }
        UploadedResponseDTO uploadedResponseDTO = (UploadedResponseDTO) other;
        return Intrinsics.d(this.uploadId, uploadedResponseDTO.uploadId) && Intrinsics.d(this.uploadedParts, uploadedResponseDTO.uploadedParts);
    }

    @NotNull
    public final String getUploadId() {
        return this.uploadId;
    }

    @NotNull
    public final List<UploadedParts> getUploadedParts() {
        return this.uploadedParts;
    }

    public int hashCode() {
        return this.uploadedParts.hashCode() + (this.uploadId.hashCode() * 31);
    }

    public final boolean isUploadResponseValid() {
        int i11 = 0;
        for (Object obj : this.uploadedParts) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            UploadedParts uploadedParts = (UploadedParts) obj;
            if (i11 > 0 && this.uploadedParts.get(i11 - 1).getEnd() >= uploadedParts.getStart()) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }

    public final boolean isUploadSucceed(long fileSize) {
        if (this.uploadedParts.size() == 1) {
            long j11 = 0;
            if (this.uploadedParts.get(0).getStart() == 0 && this.uploadedParts.get(0).getEnd() == this.uploadedParts.get(0).getSize() - 1) {
                Iterator<T> it = this.uploadedParts.iterator();
                while (it.hasNext()) {
                    j11 += ((UploadedParts) it.next()).getSize();
                }
                if (j11 == fileSize) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return C2439a.a("UploadedResponseDTO(uploadId=", this.uploadId, ", uploadedParts=", ")", this.uploadedParts);
    }
}
