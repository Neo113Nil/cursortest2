package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.storage;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/storage/SecuredStorageResult;", "", "result", "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SecuredStorageResult {

    @NotNull
    private final String result;
    private final String token;

    public SecuredStorageResult(@NotNull String result, String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.token = str;
    }

    public static /* synthetic */ SecuredStorageResult copy$default(SecuredStorageResult securedStorageResult, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = securedStorageResult.result;
        }
        if ((i11 & 2) != 0) {
            str2 = securedStorageResult.token;
        }
        return securedStorageResult.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final SecuredStorageResult copy(@NotNull String result, String token) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new SecuredStorageResult(result, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecuredStorageResult)) {
            return false;
        }
        SecuredStorageResult securedStorageResult = (SecuredStorageResult) other;
        return Intrinsics.d(this.result, securedStorageResult.result) && Intrinsics.d(this.token, securedStorageResult.token);
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = this.result.hashCode() * 31;
        String str = this.token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return e.a("SecuredStorageResult(result=", this.result, ", token=", this.token, ")");
    }

    public /* synthetic */ SecuredStorageResult(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2);
    }
}
