package com.orkestapay.orkestapay.core.networking;

import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/orkestapay/orkestapay/core/networking/OrkestapayError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", EventKeys.ERROR_CODE, "", "errorDescription", "", "(ILjava/lang/String;)V", "getCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OrkestapayError extends Exception {
    private final int code;

    @NotNull
    private final String errorDescription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrkestapayError(int i10, @NotNull String errorDescription) {
        super("Error: " + i10 + " - Description: " + errorDescription);
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        this.code = i10;
        this.errorDescription = errorDescription;
    }

    public static /* synthetic */ OrkestapayError copy$default(OrkestapayError orkestapayError, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = orkestapayError.code;
        }
        if ((i11 & 2) != 0) {
            str = orkestapayError.errorDescription;
        }
        return orkestapayError.copy(i10, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    @NotNull
    public final OrkestapayError copy(int code, @NotNull String errorDescription) {
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        return new OrkestapayError(code, errorDescription);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrkestapayError)) {
            return false;
        }
        OrkestapayError orkestapayError = (OrkestapayError) other;
        return this.code == orkestapayError.code && Intrinsics.areEqual(this.errorDescription, orkestapayError.errorDescription);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.errorDescription.hashCode();
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return "OrkestapayError(code=" + this.code + ", errorDescription=" + this.errorDescription + ')';
    }
}
