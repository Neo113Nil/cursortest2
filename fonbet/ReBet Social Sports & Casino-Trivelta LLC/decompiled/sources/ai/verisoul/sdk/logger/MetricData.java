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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006."}, d2 = {"Lai/verisoul/sdk/logger/MetricData;", "Lai/verisoul/sdk/logger/ChildLogData;", "level", "", "message", "name", EventKeys.VALUE_KEY, "", "type", EventKeys.TIMESTAMP, "attributes", "Lai/verisoul/sdk/logger/AttributesData;", "sessionId", "projectId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLai/verisoul/sdk/logger/AttributesData;Ljava/lang/String;Ljava/lang/String;)V", "getAttributes", "()Lai/verisoul/sdk/logger/AttributesData;", "getLevel", "()Ljava/lang/String;", "getMessage", "getName", "getProjectId", "getSessionId", "setSessionId", "(Ljava/lang/String;)V", "getTimestamp", "()J", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MetricData extends ChildLogData {

    @c("attributes")
    @NotNull
    private final AttributesData attributes;

    @c("level")
    @NotNull
    private final String level;

    @c("message")
    @NotNull
    private final String message;

    @c("name")
    @NotNull
    private final String name;

    @c("project_id")
    @NotNull
    private final String projectId;

    @c("session_id")
    @Nullable
    private String sessionId;

    @c(EventKeys.TIMESTAMP)
    private final long timestamp;

    @c("type")
    @NotNull
    private final String type;

    @c(EventKeys.VALUE_KEY)
    private final long value;

    public /* synthetic */ MetricData(String str, String str2, String str3, long j10, String str4, long j11, AttributesData attributesData, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j10, str4, j11, attributesData, (i10 & 128) != 0 ? null : str5, str6);
    }

    public static /* synthetic */ MetricData copy$default(MetricData metricData, String str, String str2, String str3, long j10, String str4, long j11, AttributesData attributesData, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metricData.level;
        }
        if ((i10 & 2) != 0) {
            str2 = metricData.message;
        }
        if ((i10 & 4) != 0) {
            str3 = metricData.name;
        }
        if ((i10 & 8) != 0) {
            j10 = metricData.value;
        }
        if ((i10 & 16) != 0) {
            str4 = metricData.type;
        }
        if ((i10 & 32) != 0) {
            j11 = metricData.timestamp;
        }
        if ((i10 & 64) != 0) {
            attributesData = metricData.attributes;
        }
        if ((i10 & 128) != 0) {
            str5 = metricData.sessionId;
        }
        if ((i10 & 256) != 0) {
            str6 = metricData.projectId;
        }
        String str7 = str6;
        AttributesData attributesData2 = attributesData;
        String str8 = str4;
        long j12 = j10;
        String str9 = str3;
        return metricData.copy(str, str2, str9, j12, str8, j11, attributesData2, str5, str7);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final AttributesData getAttributes() {
        return this.attributes;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    @NotNull
    public final MetricData copy(@NotNull String level, @NotNull String message, @NotNull String name, long value, @NotNull String type, long timestamp, @NotNull AttributesData attributes, @Nullable String sessionId, @NotNull String projectId) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        return new MetricData(level, message, name, value, type, timestamp, attributes, sessionId, projectId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetricData)) {
            return false;
        }
        MetricData metricData = (MetricData) other;
        return Intrinsics.areEqual(this.level, metricData.level) && Intrinsics.areEqual(this.message, metricData.message) && Intrinsics.areEqual(this.name, metricData.name) && this.value == metricData.value && Intrinsics.areEqual(this.type, metricData.type) && this.timestamp == metricData.timestamp && Intrinsics.areEqual(this.attributes, metricData.attributes) && Intrinsics.areEqual(this.sessionId, metricData.sessionId) && Intrinsics.areEqual(this.projectId, metricData.projectId);
    }

    @NotNull
    public final AttributesData getAttributes() {
        return this.attributes;
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
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getProjectId() {
        return this.projectId;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.level.hashCode() * 31) + this.message.hashCode()) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.value)) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.attributes.hashCode()) * 31;
        String str = this.sessionId;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.projectId.hashCode();
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    @NotNull
    public String toString() {
        return "MetricData(level=" + this.level + ", message=" + this.message + ", name=" + this.name + ", value=" + this.value + ", type=" + this.type + ", timestamp=" + this.timestamp + ", attributes=" + this.attributes + ", sessionId=" + this.sessionId + ", projectId=" + this.projectId + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricData(@NotNull String level, @NotNull String message, @NotNull String name, long j10, @NotNull String type, long j11, @NotNull AttributesData attributes, @Nullable String str, @NotNull String projectId) {
        super(null);
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.level = level;
        this.message = message;
        this.name = name;
        this.value = j10;
        this.type = type;
        this.timestamp = j11;
        this.attributes = attributes;
        this.sessionId = str;
        this.projectId = projectId;
    }
}
