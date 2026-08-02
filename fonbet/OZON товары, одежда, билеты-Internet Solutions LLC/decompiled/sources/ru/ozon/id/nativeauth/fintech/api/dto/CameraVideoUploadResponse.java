package ru.ozon.id.nativeauth.fintech.api.dto;

import B0.A0;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/id/nativeauth/fintech/api/dto/CameraVideoUploadResponse;", "", "fileKey", "", "<init>", "(Ljava/lang/String;)V", "getFileKey", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CameraVideoUploadResponse {

    @i(name = "FileKey")
    @NotNull
    private final String fileKey;

    public CameraVideoUploadResponse(@NotNull String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        this.fileKey = fileKey;
    }

    public static /* synthetic */ CameraVideoUploadResponse copy$default(CameraVideoUploadResponse cameraVideoUploadResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cameraVideoUploadResponse.fileKey;
        }
        return cameraVideoUploadResponse.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFileKey() {
        return this.fileKey;
    }

    @NotNull
    public final CameraVideoUploadResponse copy(@NotNull String fileKey) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        return new CameraVideoUploadResponse(fileKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CameraVideoUploadResponse) && Intrinsics.d(this.fileKey, ((CameraVideoUploadResponse) other).fileKey);
    }

    @NotNull
    public final String getFileKey() {
        return this.fileKey;
    }

    public int hashCode() {
        return this.fileKey.hashCode();
    }

    @NotNull
    public String toString() {
        return A0.b("CameraVideoUploadResponse(fileKey=", this.fileKey, ")");
    }
}
