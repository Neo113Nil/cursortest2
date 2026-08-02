package io.radar.sdk;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.radar.sdk.Radar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarTripOptions.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b-\b\u0086\b\u0018\u0000 ;2\u00020\u0001:\u0001;B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003Ja\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00106\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u00108\u001a\u00020\rHÖ\u0001J\u0006\u00109\u001a\u00020\u0005J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006<"}, d2 = {"Lio/radar/sdk/RadarTripOptions;", "", RadarTripOptions.KEY_EXTERNAL_ID, "", "metadata", "Lorg/json/JSONObject;", RadarTripOptions.KEY_DESTINATION_GEOFENCE_TAG, RadarTripOptions.KEY_DESTINATION_GEOFENCE_EXTERNAL_ID, "mode", "Lio/radar/sdk/Radar$RadarRouteMode;", RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT, "Ljava/util/Date;", RadarTripOptions.KEY_APPROACHING_THRESHOLD, "", RadarTripOptions.KEY_START_TRACKING, "", "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Lio/radar/sdk/Radar$RadarRouteMode;Ljava/util/Date;IZ)V", "getApproachingThreshold", "()I", "setApproachingThreshold", "(I)V", "getDestinationGeofenceExternalId", "()Ljava/lang/String;", "setDestinationGeofenceExternalId", "(Ljava/lang/String;)V", "getDestinationGeofenceTag", "setDestinationGeofenceTag", "getExternalId", "setExternalId", "getMetadata", "()Lorg/json/JSONObject;", "setMetadata", "(Lorg/json/JSONObject;)V", "getMode", "()Lio/radar/sdk/Radar$RadarRouteMode;", "setMode", "(Lio/radar/sdk/Radar$RadarRouteMode;)V", "getScheduledArrivalAt", "()Ljava/util/Date;", "setScheduledArrivalAt", "(Ljava/util/Date;)V", "getStartTracking", "()Z", "setStartTracking", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toJson", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarTripOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_APPROACHING_THRESHOLD = "approachingThreshold";
    public static final String KEY_DESTINATION_GEOFENCE_EXTERNAL_ID = "destinationGeofenceExternalId";
    public static final String KEY_DESTINATION_GEOFENCE_TAG = "destinationGeofenceTag";
    public static final String KEY_EXTERNAL_ID = "externalId";
    public static final String KEY_METADATA = "metadata";
    public static final String KEY_MODE = "mode";
    public static final String KEY_SCHEDULED_ARRIVAL_AT = "scheduledArrivalAt";
    public static final String KEY_START_TRACKING = "startTracking";
    private int approachingThreshold;
    private String destinationGeofenceExternalId;
    private String destinationGeofenceTag;
    private String externalId;
    private JSONObject metadata;
    private Radar.RadarRouteMode mode;
    private Date scheduledArrivalAt;
    private boolean startTracking;

    public static /* synthetic */ RadarTripOptions copy$default(RadarTripOptions radarTripOptions, String str, JSONObject jSONObject, String str2, String str3, Radar.RadarRouteMode radarRouteMode, Date date, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = radarTripOptions.externalId;
        }
        if ((i2 & 2) != 0) {
            jSONObject = radarTripOptions.metadata;
        }
        if ((i2 & 4) != 0) {
            str2 = radarTripOptions.destinationGeofenceTag;
        }
        if ((i2 & 8) != 0) {
            str3 = radarTripOptions.destinationGeofenceExternalId;
        }
        if ((i2 & 16) != 0) {
            radarRouteMode = radarTripOptions.mode;
        }
        if ((i2 & 32) != 0) {
            date = radarTripOptions.scheduledArrivalAt;
        }
        if ((i2 & 64) != 0) {
            i = radarTripOptions.approachingThreshold;
        }
        if ((i2 & 128) != 0) {
            z = radarTripOptions.startTracking;
        }
        int i3 = i;
        boolean z2 = z;
        Radar.RadarRouteMode radarRouteMode2 = radarRouteMode;
        Date date2 = date;
        return radarTripOptions.copy(str, jSONObject, str2, str3, radarRouteMode2, date2, i3, z2);
    }

    @JvmStatic
    public static final RadarTripOptions fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* renamed from: component2, reason: from getter */
    public final JSONObject getMetadata() {
        return this.metadata;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDestinationGeofenceTag() {
        return this.destinationGeofenceTag;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDestinationGeofenceExternalId() {
        return this.destinationGeofenceExternalId;
    }

    /* renamed from: component5, reason: from getter */
    public final Radar.RadarRouteMode getMode() {
        return this.mode;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getScheduledArrivalAt() {
        return this.scheduledArrivalAt;
    }

    /* renamed from: component7, reason: from getter */
    public final int getApproachingThreshold() {
        return this.approachingThreshold;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getStartTracking() {
        return this.startTracking;
    }

    public final RadarTripOptions copy(String externalId, JSONObject metadata, String destinationGeofenceTag, String destinationGeofenceExternalId, Radar.RadarRouteMode mode, Date scheduledArrivalAt, int approachingThreshold, boolean startTracking) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new RadarTripOptions(externalId, metadata, destinationGeofenceTag, destinationGeofenceExternalId, mode, scheduledArrivalAt, approachingThreshold, startTracking);
    }

    public int hashCode() {
        int hashCode = this.externalId.hashCode() * 31;
        JSONObject jSONObject = this.metadata;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.destinationGeofenceTag;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.destinationGeofenceExternalId;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.mode.hashCode()) * 31;
        Date date = this.scheduledArrivalAt;
        return ((((hashCode4 + (date != null ? date.hashCode() : 0)) * 31) + Integer.hashCode(this.approachingThreshold)) * 31) + Boolean.hashCode(this.startTracking);
    }

    public String toString() {
        return "RadarTripOptions(externalId=" + this.externalId + ", metadata=" + this.metadata + ", destinationGeofenceTag=" + this.destinationGeofenceTag + ", destinationGeofenceExternalId=" + this.destinationGeofenceExternalId + ", mode=" + this.mode + ", scheduledArrivalAt=" + this.scheduledArrivalAt + ", approachingThreshold=" + this.approachingThreshold + ", startTracking=" + this.startTracking + ')';
    }

    public RadarTripOptions(String externalId, JSONObject jSONObject, String str, String str2, Radar.RadarRouteMode mode, Date date, int i, boolean z) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.externalId = externalId;
        this.metadata = jSONObject;
        this.destinationGeofenceTag = str;
        this.destinationGeofenceExternalId = str2;
        this.mode = mode;
        this.scheduledArrivalAt = date;
        this.approachingThreshold = i;
        this.startTracking = z;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final void setExternalId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.externalId = str;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final void setMetadata(JSONObject jSONObject) {
        this.metadata = jSONObject;
    }

    public final String getDestinationGeofenceTag() {
        return this.destinationGeofenceTag;
    }

    public final void setDestinationGeofenceTag(String str) {
        this.destinationGeofenceTag = str;
    }

    public final String getDestinationGeofenceExternalId() {
        return this.destinationGeofenceExternalId;
    }

    public final void setDestinationGeofenceExternalId(String str) {
        this.destinationGeofenceExternalId = str;
    }

    public /* synthetic */ RadarTripOptions(String str, JSONObject jSONObject, String str2, String str3, Radar.RadarRouteMode radarRouteMode, Date date, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : jSONObject, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? Radar.RadarRouteMode.CAR : radarRouteMode, (i2 & 32) != 0 ? null : date, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? true : z);
    }

    public final Radar.RadarRouteMode getMode() {
        return this.mode;
    }

    public final void setMode(Radar.RadarRouteMode radarRouteMode) {
        Intrinsics.checkNotNullParameter(radarRouteMode, "<set-?>");
        this.mode = radarRouteMode;
    }

    public final Date getScheduledArrivalAt() {
        return this.scheduledArrivalAt;
    }

    public final void setScheduledArrivalAt(Date date) {
        this.scheduledArrivalAt = date;
    }

    public final int getApproachingThreshold() {
        return this.approachingThreshold;
    }

    public final void setApproachingThreshold(int i) {
        this.approachingThreshold = i;
    }

    public final boolean getStartTracking() {
        return this.startTracking;
    }

    public final void setStartTracking(boolean z) {
        this.startTracking = z;
    }

    /* compiled from: RadarTripOptions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/radar/sdk/RadarTripOptions$Companion;", "", "()V", "KEY_APPROACHING_THRESHOLD", "", "KEY_DESTINATION_GEOFENCE_EXTERNAL_ID", "KEY_DESTINATION_GEOFENCE_TAG", "KEY_EXTERNAL_ID", "KEY_METADATA", "KEY_MODE", "KEY_SCHEDULED_ARRIVAL_AT", "KEY_START_TRACKING", "fromJson", "Lio/radar/sdk/RadarTripOptions;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarTripOptions fromJson(JSONObject obj) {
            Radar.RadarRouteMode radarRouteMode;
            Date date;
            Intrinsics.checkNotNullParameter(obj, "obj");
            String optString = obj.optString(RadarTripOptions.KEY_EXTERNAL_ID);
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            String optString2 = obj.optString(RadarTripOptions.KEY_DESTINATION_GEOFENCE_TAG);
            String optString3 = obj.optString(RadarTripOptions.KEY_DESTINATION_GEOFENCE_EXTERNAL_ID);
            String optString4 = obj.optString("mode");
            if (optString4 != null) {
                switch (optString4.hashCode()) {
                    case -403236394:
                        if (optString4.equals("motorbike")) {
                            radarRouteMode = Radar.RadarRouteMode.MOTORBIKE;
                            break;
                        }
                        break;
                    case 3023841:
                        if (optString4.equals("bike")) {
                            radarRouteMode = Radar.RadarRouteMode.BIKE;
                            break;
                        }
                        break;
                    case 3148910:
                        if (optString4.equals("foot")) {
                            radarRouteMode = Radar.RadarRouteMode.FOOT;
                            break;
                        }
                        break;
                    case 110640223:
                        if (optString4.equals("truck")) {
                            radarRouteMode = Radar.RadarRouteMode.TRUCK;
                            break;
                        }
                        break;
                }
                Radar.RadarRouteMode radarRouteMode2 = radarRouteMode;
                if (obj.has(RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT)) {
                    date = null;
                } else {
                    long optLong = obj.optLong(RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT);
                    date = optLong != 0 ? new Date(optLong) : RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT));
                }
                return new RadarTripOptions(optString, optJSONObject, optString2, optString3, radarRouteMode2, date, obj.optInt(RadarTripOptions.KEY_APPROACHING_THRESHOLD), obj.optBoolean(RadarTripOptions.KEY_START_TRACKING, true));
            }
            radarRouteMode = Radar.RadarRouteMode.CAR;
            Radar.RadarRouteMode radarRouteMode22 = radarRouteMode;
            if (obj.has(RadarTripOptions.KEY_SCHEDULED_ARRIVAL_AT)) {
            }
            return new RadarTripOptions(optString, optJSONObject, optString2, optString3, radarRouteMode22, date, obj.optInt(RadarTripOptions.KEY_APPROACHING_THRESHOLD), obj.optBoolean(RadarTripOptions.KEY_START_TRACKING, true));
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_EXTERNAL_ID, this.externalId);
        jSONObject.put("metadata", this.metadata);
        jSONObject.put(KEY_DESTINATION_GEOFENCE_TAG, this.destinationGeofenceTag);
        jSONObject.put(KEY_DESTINATION_GEOFENCE_EXTERNAL_ID, this.destinationGeofenceExternalId);
        jSONObject.put("mode", Radar.stringForMode(this.mode));
        if (this.scheduledArrivalAt != null) {
            jSONObject.put(KEY_SCHEDULED_ARRIVAL_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(this.scheduledArrivalAt));
        }
        int i = this.approachingThreshold;
        if (i > 0) {
            jSONObject.put(KEY_APPROACHING_THRESHOLD, i);
        }
        jSONObject.put(KEY_START_TRACKING, this.startTracking);
        return jSONObject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.radar.sdk.RadarTripOptions");
        RadarTripOptions radarTripOptions = (RadarTripOptions) other;
        if (Intrinsics.areEqual(this.externalId, radarTripOptions.externalId)) {
            JSONObject jSONObject = this.metadata;
            String jSONObject2 = jSONObject != null ? jSONObject.toString() : null;
            JSONObject jSONObject3 = radarTripOptions.metadata;
            if (Intrinsics.areEqual(jSONObject2, jSONObject3 != null ? jSONObject3.toString() : null) && Intrinsics.areEqual(this.destinationGeofenceTag, radarTripOptions.destinationGeofenceTag) && Intrinsics.areEqual(this.destinationGeofenceExternalId, radarTripOptions.destinationGeofenceExternalId) && this.mode == radarTripOptions.mode) {
                Date date = this.scheduledArrivalAt;
                Long valueOf = date != null ? Long.valueOf(date.getTime()) : null;
                Date date2 = radarTripOptions.scheduledArrivalAt;
                if (Intrinsics.areEqual(valueOf, date2 != null ? Long.valueOf(date2.getTime()) : null) && this.approachingThreshold == radarTripOptions.approachingThreshold && this.startTracking == radarTripOptions.startTracking) {
                    return true;
                }
            }
        }
        return false;
    }
}
