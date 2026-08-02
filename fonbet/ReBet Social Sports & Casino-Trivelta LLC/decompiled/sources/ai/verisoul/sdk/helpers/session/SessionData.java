package ai.verisoul.sdk.helpers.session;

import ai.verisoul.sdk.VerisoulEnvironment;
import ai.verisoul.sdk.helpers.session.Status;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0006\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lai/verisoul/sdk/helpers/session/SessionData;", "", "sessionId", "", "expirationTime", "", "projectId", "env", "Lai/verisoul/sdk/VerisoulEnvironment;", "status", "Lai/verisoul/sdk/helpers/session/SessionStatus;", "(Ljava/lang/String;JLjava/lang/String;Lai/verisoul/sdk/VerisoulEnvironment;Lai/verisoul/sdk/helpers/session/SessionStatus;)V", "getEnv", "()Lai/verisoul/sdk/VerisoulEnvironment;", "getExpirationTime", "()J", "getProjectId", "()Ljava/lang/String;", "getSessionId", "getStatus", "()Lai/verisoul/sdk/helpers/session/SessionStatus;", "setStatus", "(Lai/verisoul/sdk/helpers/session/SessionStatus;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "isExpired", "toJson", "toString", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionData {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int EXPIRATION_TIME = 86400000;

    @NotNull
    private final VerisoulEnvironment env;
    private final long expirationTime;

    @NotNull
    private final String projectId;

    @NotNull
    private final String sessionId;

    @NotNull
    private SessionStatus status;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lai/verisoul/sdk/helpers/session/SessionData$Companion;", "", "()V", "EXPIRATION_TIME", "", "fromJson", "Lai/verisoul/sdk/helpers/session/SessionData;", "json", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SessionData fromJson(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject(json);
            String string = jSONObject.getString("sessionId");
            String string2 = jSONObject.getString("projectId");
            VerisoulEnvironment.Companion companion = VerisoulEnvironment.INSTANCE;
            String string3 = jSONObject.getString("env");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            VerisoulEnvironment fromValue = companion.fromValue(string3);
            long j10 = jSONObject.getLong("expiration");
            Status.Companion companion2 = Status.INSTANCE;
            String string4 = jSONObject.getJSONObject("status").getString("PlayIntegrity");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            Status fromString = companion2.fromString(string4);
            String string5 = jSONObject.getJSONObject("status").getString("NativeDataCollection");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            Status fromString2 = companion2.fromString(string5);
            String optString = jSONObject.getJSONObject("status").optString("TouchDataCollection");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            SessionStatus sessionStatus = new SessionStatus(fromString, fromString2, companion2.fromString(optString));
            Intrinsics.checkNotNull(string);
            Intrinsics.checkNotNull(string2);
            return new SessionData(string, j10, string2, fromValue, sessionStatus);
        }

        private Companion() {
        }
    }

    public SessionData(@NotNull String sessionId, long j10, @NotNull String projectId, @NotNull VerisoulEnvironment env, @NotNull SessionStatus status) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(status, "status");
        this.sessionId = sessionId;
        this.expirationTime = j10;
        this.projectId = projectId;
        this.env = env;
        this.status = status;
    }

    public static /* synthetic */ SessionData copy$default(SessionData sessionData, String str, long j10, String str2, VerisoulEnvironment verisoulEnvironment, SessionStatus sessionStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sessionData.sessionId;
        }
        if ((i10 & 2) != 0) {
            j10 = sessionData.expirationTime;
        }
        if ((i10 & 4) != 0) {
            str2 = sessionData.projectId;
        }
        if ((i10 & 8) != 0) {
            verisoulEnvironment = sessionData.env;
        }
        if ((i10 & 16) != 0) {
            sessionStatus = sessionData.status;
        }
        SessionStatus sessionStatus2 = sessionStatus;
        String str3 = str2;
        return sessionData.copy(str, j10, str3, verisoulEnvironment, sessionStatus2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final VerisoulEnvironment getEnv() {
        return this.env;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SessionStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final SessionData copy(@NotNull String sessionId, long expirationTime, @NotNull String projectId, @NotNull VerisoulEnvironment env, @NotNull SessionStatus status) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(status, "status");
        return new SessionData(sessionId, expirationTime, projectId, env, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) other;
        return Intrinsics.areEqual(this.sessionId, sessionData.sessionId) && this.expirationTime == sessionData.expirationTime && Intrinsics.areEqual(this.projectId, sessionData.projectId) && Intrinsics.areEqual(this.env, sessionData.env) && Intrinsics.areEqual(this.status, sessionData.status);
    }

    @NotNull
    public final VerisoulEnvironment getEnv() {
        return this.env;
    }

    public final long getExpirationTime() {
        return this.expirationTime;
    }

    @NotNull
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final SessionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.sessionId.hashCode() * 31) + Long.hashCode(this.expirationTime)) * 31) + this.projectId.hashCode()) * 31) + this.env.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean isExpired() {
        return System.currentTimeMillis() >= this.expirationTime;
    }

    public final void setStatus(@NotNull SessionStatus sessionStatus) {
        Intrinsics.checkNotNullParameter(sessionStatus, "<set-?>");
        this.status = sessionStatus;
    }

    @NotNull
    public final String toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sessionId", this.sessionId);
        jSONObject.put("projectId", this.projectId);
        jSONObject.put("env", this.env.getValue());
        jSONObject.put("expiration", this.expirationTime);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("PlayIntegrity", this.status.getPlayIntegrity().name());
        jSONObject2.put("NativeDataCollection", this.status.getNativeDataCollection().name());
        jSONObject2.put("TouchDataCollection", this.status.getTouchDataCollection().name());
        Unit unit = Unit.INSTANCE;
        jSONObject.put("status", jSONObject2);
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    @NotNull
    public String toString() {
        return "SessionData(sessionId=" + this.sessionId + ", expirationTime=" + this.expirationTime + ", projectId=" + this.projectId + ", env=" + this.env + ", status=" + this.status + ")";
    }
}
