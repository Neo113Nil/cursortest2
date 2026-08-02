package ru.ozon.app.android.mediaupload.image.domain;

import G.g;
import N3.C3660k;
import Nh.a;
import T7.Z;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/mediaupload/image/domain/UploadedImage;", "", "", "fileName", "bucket", "key", ImagesContract.URL, "", "width", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileName", "getBucket", "getKey", "getUrl", "Ljava/lang/Integer;", "getWidth", "()Ljava/lang/Integer;", "getHeight", "mediaupload_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UploadedImage {
    private final String bucket;
    private final String fileName;
    private final Integer height;
    private final String key;

    @NotNull
    private final String url;
    private final Integer width;

    public UploadedImage(String str, String str2, String str3, @NotNull String url, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.fileName = str;
        this.bucket = str2;
        this.key = str3;
        this.url = url;
        this.width = num;
        this.height = num2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedImage)) {
            return false;
        }
        UploadedImage uploadedImage = (UploadedImage) other;
        return Intrinsics.d(this.fileName, uploadedImage.fileName) && Intrinsics.d(this.bucket, uploadedImage.bucket) && Intrinsics.d(this.key, uploadedImage.key) && Intrinsics.d(this.url, uploadedImage.url) && Intrinsics.d(this.width, uploadedImage.width) && Intrinsics.d(this.height, uploadedImage.height);
    }

    public final String getBucket() {
        return this.bucket;
    }

    public final String getFileName() {
        return this.fileName;
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
        String str = this.fileName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bucket;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int a11 = g.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.url);
        Integer num = this.width;
        int hashCode3 = (a11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.fileName;
        String str2 = this.bucket;
        String str3 = this.key;
        String str4 = this.url;
        Integer num = this.width;
        Integer num2 = this.height;
        StringBuilder d11 = C3660k.d("UploadedImage(fileName=", str, ", bucket=", str2, ", key=");
        a.h(d11, str3, ", url=", str4, ", width=");
        return Z.c(d11, num, ", height=", num2, ")");
    }
}
