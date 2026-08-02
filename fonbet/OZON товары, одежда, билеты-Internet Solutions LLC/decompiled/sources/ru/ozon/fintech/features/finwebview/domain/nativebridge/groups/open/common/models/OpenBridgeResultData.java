package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.open.common.models;

import I0.C3173b;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/open/common/models/OpenBridgeResultData;", "", "file", "", "fileName", "mimeType", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Ljava/lang/String;", "getFileName", "getMimeType", "getErrorMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OpenBridgeResultData {
    private final String errorMessage;
    private final String file;
    private final String fileName;
    private final String mimeType;

    public OpenBridgeResultData(@i(name = "file") String str, @i(name = "fileName") String str2, @i(name = "mime") String str3, @i(name = "errorMessage") String str4) {
        this.file = str;
        this.fileName = str2;
        this.mimeType = str3;
        this.errorMessage = str4;
    }

    public static /* synthetic */ OpenBridgeResultData copy$default(OpenBridgeResultData openBridgeResultData, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = openBridgeResultData.file;
        }
        if ((i11 & 2) != 0) {
            str2 = openBridgeResultData.fileName;
        }
        if ((i11 & 4) != 0) {
            str3 = openBridgeResultData.mimeType;
        }
        if ((i11 & 8) != 0) {
            str4 = openBridgeResultData.errorMessage;
        }
        return openBridgeResultData.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFile() {
        return this.file;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final OpenBridgeResultData copy(@i(name = "file") String file, @i(name = "fileName") String fileName, @i(name = "mime") String mimeType, @i(name = "errorMessage") String errorMessage) {
        return new OpenBridgeResultData(file, fileName, mimeType, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBridgeResultData)) {
            return false;
        }
        OpenBridgeResultData openBridgeResultData = (OpenBridgeResultData) other;
        return Intrinsics.d(this.file, openBridgeResultData.file) && Intrinsics.d(this.fileName, openBridgeResultData.fileName) && Intrinsics.d(this.mimeType, openBridgeResultData.mimeType) && Intrinsics.d(this.errorMessage, openBridgeResultData.errorMessage);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public int hashCode() {
        String str = this.file;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fileName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mimeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMessage;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.file;
        String str2 = this.fileName;
        return C3173b.c(C3660k.d("OpenBridgeResultData(file=", str, ", fileName=", str2, ", mimeType="), this.mimeType, ", errorMessage=", this.errorMessage, ")");
    }

    public /* synthetic */ OpenBridgeResultData(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4);
    }
}
