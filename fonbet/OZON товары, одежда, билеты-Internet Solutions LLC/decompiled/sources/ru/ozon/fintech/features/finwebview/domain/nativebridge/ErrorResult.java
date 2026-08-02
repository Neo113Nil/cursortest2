package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import B90.C2618u;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@com.squareup.moshi.j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/ErrorResult;", "", "error", "", "errorCode", "", "<init>", "(Ljava/lang/String;I)V", "getError", "()Ljava/lang/String;", "getErrorCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorResult {

    @NotNull
    private final String error;
    private final int errorCode;

    public ErrorResult(@com.squareup.moshi.i(name = "error_description") @NotNull String error, @com.squareup.moshi.i(name = "error_code") int i11) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
        this.errorCode = i11;
    }

    public static /* synthetic */ ErrorResult copy$default(ErrorResult errorResult, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = errorResult.error;
        }
        if ((i12 & 2) != 0) {
            i11 = errorResult.errorCode;
        }
        return errorResult.copy(str, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final ErrorResult copy(@com.squareup.moshi.i(name = "error_description") @NotNull String error, @com.squareup.moshi.i(name = "error_code") int errorCode) {
        Intrinsics.checkNotNullParameter(error, "error");
        return new ErrorResult(error, errorCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) other;
        return Intrinsics.d(this.error, errorResult.error) && this.errorCode == errorResult.errorCode;
    }

    @NotNull
    public final String getError() {
        return this.error;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.errorCode) + (this.error.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2618u.f(this.errorCode, "ErrorResult(error=", this.error, ", errorCode=", ")");
    }
}
