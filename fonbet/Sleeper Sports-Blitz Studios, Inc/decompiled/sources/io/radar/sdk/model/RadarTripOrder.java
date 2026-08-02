package io.radar.sdk.model;

import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarTripOrder.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012¨\u0006 "}, d2 = {"Lio/radar/sdk/model/RadarTripOrder;", "", "_id", "", RadarTripOrder.FIELD_GUID, RadarTripOrder.FIELD_HANDOFF_MODE, "status", "Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", RadarTripOrder.FIELD_FIRED_AT, "Ljava/util/Date;", RadarTripOrder.FIELD_FIRED_ATTEMPTS, "", RadarTripOrder.FIELD_FIRED_REASON, RadarTripOrder.FIELD_UPDATED_AT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;Ljava/util/Date;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Date;)V", "get_id", "()Ljava/lang/String;", "getFiredAt", "()Ljava/util/Date;", "getFiredAttempts", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFiredReason", "getGuid", "getHandoffMode", "getStatus", "()Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", "getUpdatedAt", "toJson", "Lorg/json/JSONObject;", "Companion", "RadarTripOrderStatus", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarTripOrder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_FIRED_AT = "firedAt";
    private static final String FIELD_FIRED_ATTEMPTS = "firedAttempts";
    private static final String FIELD_FIRED_REASON = "firedReason";
    private static final String FIELD_GUID = "guid";
    private static final String FIELD_HANDOFF_MODE = "handoffMode";
    private static final String FIELD_ID = "id";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_UPDATED_AT = "updatedAt";
    private final String _id;
    private final Date firedAt;
    private final Integer firedAttempts;
    private final String firedReason;
    private final String guid;
    private final String handoffMode;
    private final RadarTripOrderStatus status;
    private final Date updatedAt;

    @JvmStatic
    public static final RadarTripOrder fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarTripOrder[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    public static final String stringForStatus(RadarTripOrderStatus radarTripOrderStatus) {
        return INSTANCE.stringForStatus(radarTripOrderStatus);
    }

    @JvmStatic
    public static final JSONArray toJson(RadarTripOrder[] radarTripOrderArr) {
        return INSTANCE.toJson(radarTripOrderArr);
    }

    public RadarTripOrder(String _id, String str, String str2, RadarTripOrderStatus status, Date date, Integer num, String str3, Date updatedAt) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this._id = _id;
        this.guid = str;
        this.handoffMode = str2;
        this.status = status;
        this.firedAt = date;
        this.firedAttempts = num;
        this.firedReason = str3;
        this.updatedAt = updatedAt;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getHandoffMode() {
        return this.handoffMode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RadarTripOrder(String str, String str2, String str3, RadarTripOrderStatus radarTripOrderStatus, Date date, Integer num, String str4, Date date2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, radarTripOrderStatus, date, num, r9, r10);
        Date date3;
        String str5;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        radarTripOrderStatus = (i & 8) != 0 ? RadarTripOrderStatus.UNKNOWN : radarTripOrderStatus;
        date = (i & 16) != 0 ? null : date;
        num = (i & 32) != 0 ? null : num;
        if ((i & 64) != 0) {
            date3 = date2;
            str5 = null;
        } else {
            date3 = date2;
            str5 = str4;
        }
    }

    public final RadarTripOrderStatus getStatus() {
        return this.status;
    }

    public final Date getFiredAt() {
        return this.firedAt;
    }

    public final Integer getFiredAttempts() {
        return this.firedAttempts;
    }

    public final String getFiredReason() {
        return this.firedReason;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarTripOrder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "PENDING", "FIRED", "CANCELED", "COMPLETED", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarTripOrderStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarTripOrderStatus[] $VALUES;
        public static final RadarTripOrderStatus UNKNOWN = new RadarTripOrderStatus("UNKNOWN", 0);
        public static final RadarTripOrderStatus PENDING = new RadarTripOrderStatus("PENDING", 1);
        public static final RadarTripOrderStatus FIRED = new RadarTripOrderStatus("FIRED", 2);
        public static final RadarTripOrderStatus CANCELED = new RadarTripOrderStatus("CANCELED", 3);
        public static final RadarTripOrderStatus COMPLETED = new RadarTripOrderStatus("COMPLETED", 4);

        private static final /* synthetic */ RadarTripOrderStatus[] $values() {
            return new RadarTripOrderStatus[]{UNKNOWN, PENDING, FIRED, CANCELED, COMPLETED};
        }

        public static EnumEntries<RadarTripOrderStatus> getEntries() {
            return $ENTRIES;
        }

        public static RadarTripOrderStatus valueOf(String str) {
            return (RadarTripOrderStatus) Enum.valueOf(RadarTripOrderStatus.class, str);
        }

        public static RadarTripOrderStatus[] values() {
            return (RadarTripOrderStatus[]) $VALUES.clone();
        }

        private RadarTripOrderStatus(String str, int i) {
        }

        static {
            RadarTripOrderStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: RadarTripOrder.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lio/radar/sdk/model/RadarTripOrder$Companion;", "", "()V", "FIELD_FIRED_AT", "", "FIELD_FIRED_ATTEMPTS", "FIELD_FIRED_REASON", "FIELD_GUID", "FIELD_HANDOFF_MODE", "FIELD_ID", "FIELD_STATUS", "FIELD_UPDATED_AT", "fromJson", "", "Lio/radar/sdk/model/RadarTripOrder;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarTripOrder;", "obj", "Lorg/json/JSONObject;", "stringForStatus", "status", "Lio/radar/sdk/model/RadarTripOrder$RadarTripOrderStatus;", "toJson", "orders", "([Lio/radar/sdk/model/RadarTripOrder;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: RadarTripOrder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarTripOrderStatus.values().length];
                try {
                    iArr[RadarTripOrderStatus.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarTripOrderStatus.FIRED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[RadarTripOrderStatus.CANCELED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[RadarTripOrderStatus.COMPLETED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

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
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarTripOrder fromJson(JSONObject obj) {
            RadarTripOrderStatus radarTripOrderStatus;
            Date isoStringToDate$sdk_release;
            if (obj == null) {
                return null;
            }
            String optString = obj.optString("id");
            String str = optString;
            if (str == null || str.length() == 0) {
                return null;
            }
            String optString2 = obj.optString(RadarTripOrder.FIELD_GUID);
            Intrinsics.checkNotNull(optString2);
            String str2 = optString2.length() > 0 ? optString2 : null;
            String optString3 = obj.optString(RadarTripOrder.FIELD_HANDOFF_MODE);
            Intrinsics.checkNotNull(optString3);
            String str3 = optString3.length() > 0 ? optString3 : null;
            String optString4 = obj.optString("status");
            if (optString4 != null) {
                switch (optString4.hashCode()) {
                    case -1402931637:
                        if (optString4.equals(MetricTracker.Action.COMPLETED)) {
                            radarTripOrderStatus = RadarTripOrderStatus.COMPLETED;
                            break;
                        }
                        break;
                    case -682587753:
                        if (optString4.equals("pending")) {
                            radarTripOrderStatus = RadarTripOrderStatus.PENDING;
                            break;
                        }
                        break;
                    case -123173735:
                        if (optString4.equals("canceled")) {
                            radarTripOrderStatus = RadarTripOrderStatus.CANCELED;
                            break;
                        }
                        break;
                    case 97439982:
                        if (optString4.equals("fired")) {
                            radarTripOrderStatus = RadarTripOrderStatus.FIRED;
                            break;
                        }
                        break;
                }
                RadarTripOrderStatus radarTripOrderStatus2 = radarTripOrderStatus;
                Date isoStringToDate$sdk_release2 = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_FIRED_AT));
                Integer valueOf = (obj.has(RadarTripOrder.FIELD_FIRED_ATTEMPTS) || obj.isNull(RadarTripOrder.FIELD_FIRED_ATTEMPTS)) ? null : Integer.valueOf(obj.optInt(RadarTripOrder.FIELD_FIRED_ATTEMPTS));
                String optString5 = obj.optString(RadarTripOrder.FIELD_FIRED_REASON);
                Intrinsics.checkNotNull(optString5);
                String str4 = optString5.length() <= 0 ? optString5 : null;
                isoStringToDate$sdk_release = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_UPDATED_AT));
                if (isoStringToDate$sdk_release != null) {
                    return null;
                }
                Intrinsics.checkNotNull(optString);
                return new RadarTripOrder(optString, str2, str3, radarTripOrderStatus2, isoStringToDate$sdk_release2, valueOf, str4, isoStringToDate$sdk_release);
            }
            radarTripOrderStatus = RadarTripOrderStatus.UNKNOWN;
            RadarTripOrderStatus radarTripOrderStatus22 = radarTripOrderStatus;
            Date isoStringToDate$sdk_release22 = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_FIRED_AT));
            if (obj.has(RadarTripOrder.FIELD_FIRED_ATTEMPTS)) {
            }
            String optString52 = obj.optString(RadarTripOrder.FIELD_FIRED_REASON);
            Intrinsics.checkNotNull(optString52);
            if (optString52.length() <= 0) {
            }
            isoStringToDate$sdk_release = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarTripOrder.FIELD_UPDATED_AT));
            if (isoStringToDate$sdk_release != null) {
            }
        }

        @JvmStatic
        public final RadarTripOrder[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarTripOrder[] radarTripOrderArr = new RadarTripOrder[length];
            for (int i = 0; i < length; i++) {
                radarTripOrderArr[i] = RadarTripOrder.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarTripOrder[]) ArraysKt.filterNotNull(radarTripOrderArr).toArray(new RadarTripOrder[0]);
        }

        @JvmStatic
        public final String stringForStatus(RadarTripOrderStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                return "pending";
            }
            if (i == 2) {
                return "fired";
            }
            if (i == 3) {
                return "canceled";
            }
            if (i == 4) {
                return MetricTracker.Action.COMPLETED;
            }
            return "unknown";
        }

        @JvmStatic
        public final JSONArray toJson(RadarTripOrder[] orders) {
            if (orders == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarTripOrder radarTripOrder : orders) {
                jSONArray.put(radarTripOrder.toJson());
            }
            return jSONArray;
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("id", this._id);
        jSONObject.putOpt(FIELD_GUID, this.guid);
        jSONObject.putOpt(FIELD_HANDOFF_MODE, this.handoffMode);
        jSONObject.putOpt("status", INSTANCE.stringForStatus(this.status));
        jSONObject.putOpt(FIELD_FIRED_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(this.firedAt));
        jSONObject.putOpt(FIELD_FIRED_ATTEMPTS, this.firedAttempts);
        jSONObject.putOpt(FIELD_FIRED_REASON, this.firedReason);
        jSONObject.putOpt(FIELD_UPDATED_AT, RadarUtils.INSTANCE.dateToISOString$sdk_release(this.updatedAt));
        return jSONObject;
    }
}
