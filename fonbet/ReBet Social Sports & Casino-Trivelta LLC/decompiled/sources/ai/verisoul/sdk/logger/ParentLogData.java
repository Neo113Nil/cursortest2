package ai.verisoul.sdk.logger;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006 "}, d2 = {"Lai/verisoul/sdk/logger/ParentLogData;", "", "type", "", "time", "eventId", "sessionId", "projectId", EventKeys.DATA, "Lai/verisoul/sdk/logger/DataContainer;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/verisoul/sdk/logger/DataContainer;)V", "getData", "()Lai/verisoul/sdk/logger/DataContainer;", "getEventId", "()Ljava/lang/String;", "getProjectId", "getSessionId", "getTime", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ParentLogData {

    @c(EventKeys.DATA)
    @NotNull
    private final DataContainer data;

    @c("event_id")
    @NotNull
    private final String eventId;

    @c("project_id")
    @NotNull
    private final String projectId;

    @c("session_id")
    @NotNull
    private final String sessionId;

    @c("time")
    @NotNull
    private final String time;

    @c("type")
    @NotNull
    private final String type;

    public ParentLogData(@NotNull String type, @NotNull String time, @NotNull String eventId, @NotNull String sessionId, @NotNull String projectId, @NotNull DataContainer data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.type = type;
        this.time = time;
        this.eventId = eventId;
        this.sessionId = sessionId;
        this.projectId = projectId;
        this.data = data;
    }

    public static /* synthetic */ ParentLogData copy$default(ParentLogData parentLogData, String str, String str2, String str3, String str4, String str5, DataContainer dataContainer, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = parentLogData.type;
        }
        if ((i10 & 2) != 0) {
            str2 = parentLogData.time;
        }
        if ((i10 & 4) != 0) {
            str3 = parentLogData.eventId;
        }
        if ((i10 & 8) != 0) {
            str4 = parentLogData.sessionId;
        }
        if ((i10 & 16) != 0) {
            str5 = parentLogData.projectId;
        }
        if ((i10 & 32) != 0) {
            dataContainer = parentLogData.data;
        }
        String str6 = str5;
        DataContainer dataContainer2 = dataContainer;
        return parentLogData.copy(str, str2, str3, str4, str6, dataContainer2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DataContainer getData() {
        return this.data;
    }

    @NotNull
    public final ParentLogData copy(@NotNull String type, @NotNull String time, @NotNull String eventId, @NotNull String sessionId, @NotNull String projectId, @NotNull DataContainer data) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(data, "data");
        return new ParentLogData(type, time, eventId, sessionId, projectId, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentLogData)) {
            return false;
        }
        ParentLogData parentLogData = (ParentLogData) other;
        return Intrinsics.areEqual(this.type, parentLogData.type) && Intrinsics.areEqual(this.time, parentLogData.time) && Intrinsics.areEqual(this.eventId, parentLogData.eventId) && Intrinsics.areEqual(this.sessionId, parentLogData.sessionId) && Intrinsics.areEqual(this.projectId, parentLogData.projectId) && Intrinsics.areEqual(this.data, parentLogData.data);
    }

    @NotNull
    public final DataContainer getData() {
        return this.data;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
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
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((this.type.hashCode() * 31) + this.time.hashCode()) * 31) + this.eventId.hashCode()) * 31) + this.sessionId.hashCode()) * 31) + this.projectId.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "ParentLogData(type=" + this.type + ", time=" + this.time + ", eventId=" + this.eventId + ", sessionId=" + this.sessionId + ", projectId=" + this.projectId + ", data=" + this.data + ")";
    }
}
