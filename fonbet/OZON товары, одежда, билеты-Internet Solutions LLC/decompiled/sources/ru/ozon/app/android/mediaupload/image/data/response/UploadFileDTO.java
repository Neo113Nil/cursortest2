package ru.ozon.app.android.mediaupload.image.data.response;

import C.o0;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ve.C4636t5;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/mediaupload/image/data/response/UploadFileDTO;", "", "link", "", "success", "", "fileName", "bucket", "key", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLink", "()Ljava/lang/String;", "getSuccess", "()Z", "getFileName", "getBucket", "getKey", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadFileDTO {
    private final String bucket;

    @NotNull
    private final String fileName;
    private final String key;

    @NotNull
    private final String link;
    private final boolean success;

    public UploadFileDTO(@NotNull String link, boolean z11, @NotNull String fileName, String str, String str2) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.link = link;
        this.success = z11;
        this.fileName = fileName;
        this.bucket = str;
        this.key = str2;
    }

    public static /* synthetic */ UploadFileDTO copy$default(UploadFileDTO uploadFileDTO, String str, boolean z11, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadFileDTO.link;
        }
        if ((i11 & 2) != 0) {
            z11 = uploadFileDTO.success;
        }
        if ((i11 & 4) != 0) {
            str2 = uploadFileDTO.fileName;
        }
        if ((i11 & 8) != 0) {
            str3 = uploadFileDTO.bucket;
        }
        if ((i11 & 16) != 0) {
            str4 = uploadFileDTO.key;
        }
        String str5 = str4;
        String str6 = str2;
        return uploadFileDTO.copy(str, z11, str6, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    /* renamed from: component5, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final UploadFileDTO copy(@NotNull String link, boolean success, @NotNull String fileName, String bucket, String key) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new UploadFileDTO(link, success, fileName, bucket, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFileDTO)) {
            return false;
        }
        UploadFileDTO uploadFileDTO = (UploadFileDTO) other;
        return Intrinsics.d(this.link, uploadFileDTO.link) && this.success == uploadFileDTO.success && Intrinsics.d(this.fileName, uploadFileDTO.fileName) && Intrinsics.d(this.bucket, uploadFileDTO.bucket) && Intrinsics.d(this.key, uploadFileDTO.key);
    }

    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int a11 = g.a(C3532b.a(this.link.hashCode() * 31, 31, this.success), 31, this.fileName);
        String str = this.bucket;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.key;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.link;
        boolean z11 = this.success;
        String str2 = this.fileName;
        String str3 = this.bucket;
        String str4 = this.key;
        StringBuilder b11 = C4636t5.b("UploadFileDTO(link=", str, ", success=", ", fileName=", z11);
        a.h(b11, str2, ", bucket=", str3, ", key=");
        return o0.c(b11, str4, ")");
    }
}
