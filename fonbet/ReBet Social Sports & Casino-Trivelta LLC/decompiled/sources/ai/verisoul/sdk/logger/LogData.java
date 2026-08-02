package ai.verisoul.sdk.logger;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JG\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006!"}, d2 = {"Lai/verisoul/sdk/logger/LogData;", "Lai/verisoul/sdk/logger/ChildLogData;", "level", "", "message", "sessionId", "projectId", EventKeys.PLATFORM, "version", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()Ljava/lang/String;", "getMessage", "getPlatform", "getProjectId", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LogData extends ChildLogData {

    @c("level")
    @NotNull
    private final String level;

    @c("message")
    @NotNull
    private final String message;

    @c(EventKeys.PLATFORM)
    @NotNull
    private final String platform;

    @c("project_id")
    @NotNull
    private final String projectId;

    @c("session_id")
    @Nullable
    private String sessionId;

    @c("version")
    @NotNull
    private final String version;

    public /* synthetic */ LogData(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : str3, str4, str5, str6);
    }

    public static /* synthetic */ LogData copy$default(LogData logData, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = logData.level;
        }
        if ((i10 & 2) != 0) {
            str2 = logData.message;
        }
        if ((i10 & 4) != 0) {
            str3 = logData.sessionId;
        }
        if ((i10 & 8) != 0) {
            str4 = logData.projectId;
        }
        if ((i10 & 16) != 0) {
            str5 = logData.platform;
        }
        if ((i10 & 32) != 0) {
            str6 = logData.version;
        }
        String str7 = str5;
        String str8 = str6;
        return logData.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final LogData copy(@NotNull String level, @NotNull String message, @Nullable String sessionId, @NotNull String projectId, @NotNull String platform, @NotNull String version) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        return new LogData(level, message, sessionId, projectId, platform, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogData)) {
            return false;
        }
        LogData logData = (LogData) other;
        return Intrinsics.areEqual(this.level, logData.level) && Intrinsics.areEqual(this.message, logData.message) && Intrinsics.areEqual(this.sessionId, logData.sessionId) && Intrinsics.areEqual(this.projectId, logData.projectId) && Intrinsics.areEqual(this.platform, logData.platform) && Intrinsics.areEqual(this.version, logData.version);
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getProjectId() {
        return this.projectId;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = ((this.level.hashCode() * 31) + this.message.hashCode()) * 31;
        String str = this.sessionId;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.projectId.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.version.hashCode();
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        return "LogData(level=" + this.level + ", message=" + this.message + ", sessionId=" + this.sessionId + ", projectId=" + this.projectId + ", platform=" + this.platform + ", version=" + this.version + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogData(@NotNull String level, @NotNull String message, @Nullable String str, @NotNull String projectId, @NotNull String platform, @NotNull String version) {
        super(null);
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(version, "version");
        this.level = level;
        this.message = message;
        this.sessionId = str;
        this.projectId = projectId;
        this.platform = platform;
        this.version = version;
    }
}
