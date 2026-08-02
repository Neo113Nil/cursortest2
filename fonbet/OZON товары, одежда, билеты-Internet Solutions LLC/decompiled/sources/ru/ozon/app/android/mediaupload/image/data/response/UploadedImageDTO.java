package ru.ozon.app.android.mediaupload.image.data.response;

import Ef0.c;
import G.g;
import I0.C3173b;
import N3.C3660k;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JT\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "", "filename", "", ImagesContract.URL, "width", "", "height", "bucket", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getUrl", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getBucket", "getKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/mediaupload/image/data/response/UploadedImageDTO;", "equals", "", "other", "hashCode", "toString", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadedImageDTO {
    private final String bucket;
    private final String filename;
    private final Integer height;
    private final String key;

    @NotNull
    private final String url;
    private final Integer width;

    public UploadedImageDTO(String str, @NotNull String url, Integer num, Integer num2, String str2, String str3) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.filename = str;
        this.url = url;
        this.width = num;
        this.height = num2;
        this.bucket = str2;
        this.key = str3;
    }

    public static /* synthetic */ UploadedImageDTO copy$default(UploadedImageDTO uploadedImageDTO, String str, String str2, Integer num, Integer num2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadedImageDTO.filename;
        }
        if ((i11 & 2) != 0) {
            str2 = uploadedImageDTO.url;
        }
        if ((i11 & 4) != 0) {
            num = uploadedImageDTO.width;
        }
        if ((i11 & 8) != 0) {
            num2 = uploadedImageDTO.height;
        }
        if ((i11 & 16) != 0) {
            str3 = uploadedImageDTO.bucket;
        }
        if ((i11 & 32) != 0) {
            str4 = uploadedImageDTO.key;
        }
        String str5 = str3;
        String str6 = str4;
        return uploadedImageDTO.copy(str, str2, num, num2, str5, str6);
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

    /* renamed from: component6, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final UploadedImageDTO copy(String filename, @NotNull String url, Integer width, Integer height, String bucket, String key) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new UploadedImageDTO(filename, url, width, height, bucket, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedImageDTO)) {
            return false;
        }
        UploadedImageDTO uploadedImageDTO = (UploadedImageDTO) other;
        return Intrinsics.d(this.filename, uploadedImageDTO.filename) && Intrinsics.d(this.url, uploadedImageDTO.url) && Intrinsics.d(this.width, uploadedImageDTO.width) && Intrinsics.d(this.height, uploadedImageDTO.height) && Intrinsics.d(this.bucket, uploadedImageDTO.bucket) && Intrinsics.d(this.key, uploadedImageDTO.key);
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

    public final String getKey() {
        return this.key;
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
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.filename;
        String str2 = this.url;
        Integer num = this.width;
        Integer num2 = this.height;
        String str3 = this.bucket;
        String str4 = this.key;
        StringBuilder d11 = C3660k.d("UploadedImageDTO(filename=", str, ", url=", str2, ", width=");
        c.e(d11, num, ", height=", num2, ", bucket=");
        return C3173b.c(d11, str3, ", key=", str4, ")");
    }
}
