package spay.sdk.domain.model.request;

import B90.C2618u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lspay/sdk/domain/model/request/StatusReportRequestBody;", "", "sessionId", "", "status", "", "(Ljava/lang/String;I)V", "getSessionId", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StatusReportRequestBody {

    @NotNull
    private final String sessionId;
    private final int status;

    public StatusReportRequestBody(@NotNull String sessionId, int i11) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.sessionId = sessionId;
        this.status = i11;
    }

    public static /* synthetic */ StatusReportRequestBody copy$default(StatusReportRequestBody statusReportRequestBody, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = statusReportRequestBody.sessionId;
        }
        if ((i12 & 2) != 0) {
            i11 = statusReportRequestBody.status;
        }
        return statusReportRequestBody.copy(str, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final StatusReportRequestBody copy(@NotNull String sessionId, int status) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new StatusReportRequestBody(sessionId, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusReportRequestBody)) {
            return false;
        }
        StatusReportRequestBody statusReportRequestBody = (StatusReportRequestBody) other;
        return Intrinsics.d(this.sessionId, statusReportRequestBody.sessionId) && this.status == statusReportRequestBody.status;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + (this.sessionId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return C2618u.f(this.status, "StatusReportRequestBody(sessionId=", this.sessionId, ", status=", ")");
    }
}
