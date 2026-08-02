package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@com.squareup.moshi.j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/CheckMethodResult;", "", "available", "", "type", "", "<init>", "(ZLjava/lang/String;)V", "getAvailable", "()Z", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckMethodResult {
    private final boolean available;
    private final String type;

    public CheckMethodResult(@com.squareup.moshi.i(name = "available") boolean z11, @com.squareup.moshi.i(name = "type") String str) {
        this.available = z11;
        this.type = str;
    }

    public static /* synthetic */ CheckMethodResult copy$default(CheckMethodResult checkMethodResult, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = checkMethodResult.available;
        }
        if ((i11 & 2) != 0) {
            str = checkMethodResult.type;
        }
        return checkMethodResult.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final CheckMethodResult copy(@com.squareup.moshi.i(name = "available") boolean available, @com.squareup.moshi.i(name = "type") String type) {
        return new CheckMethodResult(available, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckMethodResult)) {
            return false;
        }
        CheckMethodResult checkMethodResult = (CheckMethodResult) other;
        return this.available == checkMethodResult.available && Intrinsics.d(this.type, checkMethodResult.type);
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.available) * 31;
        String str = this.type;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CheckMethodResult(available=" + this.available + ", type=" + this.type + ")";
    }
}
