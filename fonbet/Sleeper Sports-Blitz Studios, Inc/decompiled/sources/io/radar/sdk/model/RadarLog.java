package io.radar.sdk.model;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.radar.sdk.Radar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: RadarLog.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\"B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0014HÖ\u0001J\u0006\u0010\u001f\u001a\u00020 J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, d2 = {"Lio/radar/sdk/model/RadarLog;", "", "level", "Lio/radar/sdk/Radar$RadarLogLevel;", "message", "", "type", "Lio/radar/sdk/Radar$RadarLogType;", RadarLog.CREATED_AT, "Ljava/util/Date;", "(Lio/radar/sdk/Radar$RadarLogLevel;Ljava/lang/String;Lio/radar/sdk/Radar$RadarLogType;Ljava/util/Date;)V", "getCreatedAt", "()Ljava/util/Date;", "getLevel", "()Lio/radar/sdk/Radar$RadarLogLevel;", "getMessage", "()Ljava/lang/String;", "getType", "()Lio/radar/sdk/Radar$RadarLogType;", "compareTo", "", "other", "component1", "component2", "component3", "component4", "copy", "equals", "", "", "hashCode", "toJson", "Lorg/json/JSONObject;", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarLog implements Comparable<RadarLog> {
    private static final String CREATED_AT = "createdAt";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String LEVEL = "level";
    private static final String MESSAGE = "message";
    private static final String TYPE = "type";
    private final Date createdAt;
    private final Radar.RadarLogLevel level;
    private final String message;
    private final Radar.RadarLogType type;

    public static /* synthetic */ RadarLog copy$default(RadarLog radarLog, Radar.RadarLogLevel radarLogLevel, String str, Radar.RadarLogType radarLogType, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            radarLogLevel = radarLog.level;
        }
        if ((i & 2) != 0) {
            str = radarLog.message;
        }
        if ((i & 4) != 0) {
            radarLogType = radarLog.type;
        }
        if ((i & 8) != 0) {
            date = radarLog.createdAt;
        }
        return radarLog.copy(radarLogLevel, str, radarLogType, date);
    }

    @JvmStatic
    public static final RadarLog fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final Radar.RadarLogLevel getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final Radar.RadarLogType getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final RadarLog copy(Radar.RadarLogLevel level, String message, Radar.RadarLogType type, Date createdAt) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new RadarLog(level, message, type, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarLog)) {
            return false;
        }
        RadarLog radarLog = (RadarLog) other;
        return this.level == radarLog.level && Intrinsics.areEqual(this.message, radarLog.message) && this.type == radarLog.type && Intrinsics.areEqual(this.createdAt, radarLog.createdAt);
    }

    public int hashCode() {
        int hashCode = ((this.level.hashCode() * 31) + this.message.hashCode()) * 31;
        Radar.RadarLogType radarLogType = this.type;
        return ((hashCode + (radarLogType == null ? 0 : radarLogType.hashCode())) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        return "RadarLog(level=" + this.level + ", message=" + this.message + ", type=" + this.type + ", createdAt=" + this.createdAt + ')';
    }

    public RadarLog(Radar.RadarLogLevel level, String message, Radar.RadarLogType radarLogType, Date createdAt) {
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.level = level;
        this.message = message;
        this.type = radarLogType;
        this.createdAt = createdAt;
    }

    public final Radar.RadarLogLevel getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Radar.RadarLogType getType() {
        return this.type;
    }

    public /* synthetic */ RadarLog(Radar.RadarLogLevel radarLogLevel, String str, Radar.RadarLogType radarLogType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(radarLogLevel, str, radarLogType, (i & 8) != 0 ? new Date() : date);
    }

    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* compiled from: RadarLog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/radar/sdk/model/RadarLog$Companion;", "", "()V", "CREATED_AT", "", "LEVEL", "MESSAGE", CredentialProviderBaseController.TYPE_TAG, "fromJson", "Lio/radar/sdk/model/RadarLog;", "json", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarLog fromJson(JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            String optString = json.optString("level");
            String optString2 = json.optString("type");
            Intrinsics.checkNotNull(optString);
            Radar.RadarLogLevel valueOf = !StringsKt.isBlank(optString) ? Radar.RadarLogLevel.valueOf(optString) : Radar.RadarLogLevel.INFO;
            Intrinsics.checkNotNull(optString2);
            Radar.RadarLogType valueOf2 = (StringsKt.isBlank(optString2) || Intrinsics.areEqual(optString2, "NONE")) ? null : Radar.RadarLogType.valueOf(optString2);
            String optString3 = json.optString("message");
            Date date = new Date(json.optLong(RadarLog.CREATED_AT));
            Intrinsics.checkNotNull(optString3);
            return new RadarLog(valueOf, optString3, valueOf2, date);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(CREATED_AT, Long.valueOf(this.createdAt.getTime()));
        jSONObject.putOpt("level", this.level.name());
        Radar.RadarLogType radarLogType = this.type;
        jSONObject.putOpt("type", radarLogType != null ? radarLogType.name() : null);
        jSONObject.putOpt("message", this.message);
        return jSONObject;
    }

    @Override // java.lang.Comparable
    public int compareTo(RadarLog other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.createdAt.compareTo(other.createdAt);
    }
}
