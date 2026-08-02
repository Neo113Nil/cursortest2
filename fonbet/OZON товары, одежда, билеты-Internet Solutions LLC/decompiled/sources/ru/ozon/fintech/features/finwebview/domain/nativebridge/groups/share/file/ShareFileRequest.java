package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file;

import C.o0;
import G.g;
import N3.C3660k;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/share/file/ShareFileRequest;", "", "base64", "", "mimeType", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBase64", "()Ljava/lang/String;", "getMimeType", "getFilename", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShareFileRequest {

    @NotNull
    private final String base64;
    private final String filename;

    @NotNull
    private final String mimeType;

    public ShareFileRequest(@i(name = "base64") @NotNull String base64, @i(name = "mimeType") @NotNull String mimeType, @i(name = "fileName") String str) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.base64 = base64;
        this.mimeType = mimeType;
        this.filename = str;
    }

    public static /* synthetic */ ShareFileRequest copy$default(ShareFileRequest shareFileRequest, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareFileRequest.base64;
        }
        if ((i11 & 2) != 0) {
            str2 = shareFileRequest.mimeType;
        }
        if ((i11 & 4) != 0) {
            str3 = shareFileRequest.filename;
        }
        return shareFileRequest.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBase64() {
        return this.base64;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final ShareFileRequest copy(@i(name = "base64") @NotNull String base64, @i(name = "mimeType") @NotNull String mimeType, @i(name = "fileName") String filename) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new ShareFileRequest(base64, mimeType, filename);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareFileRequest)) {
            return false;
        }
        ShareFileRequest shareFileRequest = (ShareFileRequest) other;
        return Intrinsics.d(this.base64, shareFileRequest.base64) && Intrinsics.d(this.mimeType, shareFileRequest.mimeType) && Intrinsics.d(this.filename, shareFileRequest.filename);
    }

    @NotNull
    public final String getBase64() {
        return this.base64;
    }

    public final String getFilename() {
        return this.filename;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        int a11 = g.a(this.base64.hashCode() * 31, 31, this.mimeType);
        String str = this.filename;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.base64;
        String str2 = this.mimeType;
        return o0.c(C3660k.d("ShareFileRequest(base64=", str, ", mimeType=", str2, ", filename="), this.filename, ")");
    }

    public /* synthetic */ ShareFileRequest(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3);
    }
}
