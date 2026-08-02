package ru.ozon.app.android.mediaupload.image.data.response;

import C.o0;
import Ef0.c;
import G.g;
import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lru/ozon/app/android/mediaupload/image/data/response/UploadedProductImageDTO;", "", "filename", "", ImagesContract.URL, "width", "", "height", "bucket", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getUrl", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getBucket", "toUploadedImageDTO", "Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/mediaupload/image/data/response/UploadedProductImageDTO;", "equals", "", "other", "hashCode", "toString", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadedProductImageDTO {
    private final String bucket;
    private final String filename;
    private final Integer height;

    @NotNull
    private final String url;
    private final Integer width;

    public UploadedProductImageDTO(@i(name = "file_name") String str, @NotNull String url, Integer num, Integer num2, String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.filename = str;
        this.url = url;
        this.width = num;
        this.height = num2;
        this.bucket = str2;
    }

    public static /* synthetic */ UploadedProductImageDTO copy$default(UploadedProductImageDTO uploadedProductImageDTO, String str, String str2, Integer num, Integer num2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadedProductImageDTO.filename;
        }
        if ((i11 & 2) != 0) {
            str2 = uploadedProductImageDTO.url;
        }
        if ((i11 & 4) != 0) {
            num = uploadedProductImageDTO.width;
        }
        if ((i11 & 8) != 0) {
            num2 = uploadedProductImageDTO.height;
        }
        if ((i11 & 16) != 0) {
            str3 = uploadedProductImageDTO.bucket;
        }
        String str4 = str3;
        Integer num3 = num;
        return uploadedProductImageDTO.copy(str, str2, num3, num2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    public final UploadedProductImageDTO copy(@i(name = "file_name") String filename, @NotNull String url, Integer width, Integer height, String bucket) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new UploadedProductImageDTO(filename, url, width, height, bucket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedProductImageDTO)) {
            return false;
        }
        UploadedProductImageDTO uploadedProductImageDTO = (UploadedProductImageDTO) other;
        return Intrinsics.d(this.filename, uploadedProductImageDTO.filename) && Intrinsics.d(this.url, uploadedProductImageDTO.url) && Intrinsics.d(this.width, uploadedProductImageDTO.width) && Intrinsics.d(this.height, uploadedProductImageDTO.height) && Intrinsics.d(this.bucket, uploadedProductImageDTO.bucket);
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.filename;
        int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.url);
        Integer num = this.width;
        int hashCode = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.bucket;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.filename;
        String str2 = this.url;
        Integer num = this.width;
        Integer num2 = this.height;
        String str3 = this.bucket;
        StringBuilder d11 = C3660k.d("UploadedProductImageDTO(filename=", str, ", url=", str2, ", width=");
        c.e(d11, num, ", height=", num2, ", bucket=");
        return o0.c(d11, str3, ")");
    }

    @NotNull
    public final UploadedImageDTO toUploadedImageDTO() {
        return new UploadedImageDTO(this.filename, this.url, this.width, this.height, this.bucket, null);
    }
}
