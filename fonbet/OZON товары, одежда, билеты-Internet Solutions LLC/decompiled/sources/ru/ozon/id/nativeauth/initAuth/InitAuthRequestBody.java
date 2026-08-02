package ru.ozon.id.nativeauth.initAuth;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/id/nativeauth/initAuth/InitAuthRequestBody;", "", "clientId", "", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getTraceId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InitAuthRequestBody {

    @NotNull
    private final String clientId;
    private final String traceId;

    public InitAuthRequestBody(@NotNull String clientId, String str) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        this.clientId = clientId;
        this.traceId = str;
    }

    public static /* synthetic */ InitAuthRequestBody copy$default(InitAuthRequestBody initAuthRequestBody, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = initAuthRequestBody.clientId;
        }
        if ((i11 & 2) != 0) {
            str2 = initAuthRequestBody.traceId;
        }
        return initAuthRequestBody.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    @NotNull
    public final InitAuthRequestBody copy(@NotNull String clientId, String traceId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return new InitAuthRequestBody(clientId, traceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitAuthRequestBody)) {
            return false;
        }
        InitAuthRequestBody initAuthRequestBody = (InitAuthRequestBody) other;
        return Intrinsics.d(this.clientId, initAuthRequestBody.clientId) && Intrinsics.d(this.traceId, initAuthRequestBody.traceId);
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        int hashCode = this.clientId.hashCode() * 31;
        String str = this.traceId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return e.a("InitAuthRequestBody(clientId=", this.clientId, ", traceId=", this.traceId, ")");
    }
}
