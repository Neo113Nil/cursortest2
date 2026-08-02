package ai.verisoul.sdk.data.remote;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lai/verisoul/sdk/data/remote/IntegritySubmitRequest;", "", "projectId", "", "sessionId", EventKeys.DATA, "Lai/verisoul/sdk/data/remote/IntegritySubmitRequestData;", "(Ljava/lang/String;Ljava/lang/String;Lai/verisoul/sdk/data/remote/IntegritySubmitRequestData;)V", "getData", "()Lai/verisoul/sdk/data/remote/IntegritySubmitRequestData;", "getProjectId", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IntegritySubmitRequest {

    @c(EventKeys.DATA)
    @NotNull
    private final IntegritySubmitRequestData data;

    @c("project_id")
    @NotNull
    private final String projectId;

    @c("session_id")
    @NotNull
    private final String sessionId;

    public IntegritySubmitRequest(@NotNull String projectId, @NotNull String sessionId, @NotNull IntegritySubmitRequestData data) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.projectId = projectId;
        this.sessionId = sessionId;
        this.data = data;
    }

    public static /* synthetic */ IntegritySubmitRequest copy$default(IntegritySubmitRequest integritySubmitRequest, String str, String str2, IntegritySubmitRequestData integritySubmitRequestData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = integritySubmitRequest.projectId;
        }
        if ((i10 & 2) != 0) {
            str2 = integritySubmitRequest.sessionId;
        }
        if ((i10 & 4) != 0) {
            integritySubmitRequestData = integritySubmitRequest.data;
        }
        return integritySubmitRequest.copy(str, str2, integritySubmitRequestData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IntegritySubmitRequestData getData() {
        return this.data;
    }

    @NotNull
    public final IntegritySubmitRequest copy(@NotNull String projectId, @NotNull String sessionId, @NotNull IntegritySubmitRequestData data) {
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(data, "data");
        return new IntegritySubmitRequest(projectId, sessionId, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegritySubmitRequest)) {
            return false;
        }
        IntegritySubmitRequest integritySubmitRequest = (IntegritySubmitRequest) other;
        return Intrinsics.areEqual(this.projectId, integritySubmitRequest.projectId) && Intrinsics.areEqual(this.sessionId, integritySubmitRequest.sessionId) && Intrinsics.areEqual(this.data, integritySubmitRequest.data);
    }

    @NotNull
    public final IntegritySubmitRequestData getData() {
        return this.data;
    }

    @NotNull
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (((this.projectId.hashCode() * 31) + this.sessionId.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "IntegritySubmitRequest(projectId=" + this.projectId + ", sessionId=" + this.sessionId + ", data=" + this.data + ")";
    }
}
