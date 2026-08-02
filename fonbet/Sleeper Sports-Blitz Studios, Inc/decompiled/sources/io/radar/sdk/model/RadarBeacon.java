package io.radar.sdk.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarBeacon.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0002)*By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010'\u001a\u00020\rH\u0016J\u0006\u0010(\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0014¨\u0006+"}, d2 = {"Lio/radar/sdk/model/RadarBeacon;", "", "_id", "", "description", "tag", "externalId", "uuid", RadarBeacon.FIELD_MAJOR, RadarBeacon.FIELD_MINOR, "metadata", "Lorg/json/JSONObject;", RadarBeacon.FIELD_RSSI, "", FirebaseAnalytics.Param.LOCATION, "Lio/radar/sdk/model/RadarCoordinate;", "type", "Lio/radar/sdk/model/RadarBeacon$RadarBeaconType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Integer;Lio/radar/sdk/model/RadarCoordinate;Lio/radar/sdk/model/RadarBeacon$RadarBeaconType;)V", "get_id", "()Ljava/lang/String;", "getDescription", "getExternalId", "getLocation", "()Lio/radar/sdk/model/RadarCoordinate;", "getMajor", "getMetadata", "()Lorg/json/JSONObject;", "getMinor", "getRssi", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTag", "getType", "()Lio/radar/sdk/model/RadarBeacon$RadarBeaconType;", "getUuid", "equals", "", "other", "hashCode", "toJson", "Companion", "RadarBeaconType", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarBeacon {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_COORDINATES = "coordinates";
    private static final String FIELD_DESCRIPTION = "description";
    private static final String FIELD_EXTERNAL_ID = "externalId";
    private static final String FIELD_GEOMETRY = "geometry";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_INSTANCE = "instance";
    private static final String FIELD_MAJOR = "major";
    private static final String FIELD_METADATA = "metadata";
    private static final String FIELD_MINOR = "minor";
    private static final String FIELD_RSSI = "rssi";
    private static final String FIELD_TAG = "tag";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_UID = "uid";
    private static final String FIELD_UUID = "uuid";
    private final String _id;
    private final String description;
    private final String externalId;
    private final RadarCoordinate location;
    private final String major;
    private final JSONObject metadata;
    private final String minor;
    private final Integer rssi;
    private final String tag;
    private final RadarBeaconType type;
    private final String uuid;

    @JvmStatic
    public static final RadarBeacon fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarBeacon[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    @JvmStatic
    public static final String stringForType(RadarBeaconType radarBeaconType) {
        return INSTANCE.stringForType(radarBeaconType);
    }

    @JvmStatic
    public static final JSONArray toJson(RadarBeacon[] radarBeaconArr) {
        return INSTANCE.toJson(radarBeaconArr);
    }

    public RadarBeacon(String str, String str2, String str3, String str4, String uuid, String major, String minor, JSONObject jSONObject, Integer num, RadarCoordinate radarCoordinate, RadarBeaconType type) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(major, "major");
        Intrinsics.checkNotNullParameter(minor, "minor");
        Intrinsics.checkNotNullParameter(type, "type");
        this._id = str;
        this.description = str2;
        this.tag = str3;
        this.externalId = str4;
        this.uuid = uuid;
        this.major = major;
        this.minor = minor;
        this.metadata = jSONObject;
        this.rssi = num;
        this.location = radarCoordinate;
        this.type = type;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RadarBeacon(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, Integer num, RadarCoordinate radarCoordinate, RadarBeaconType radarBeaconType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, jSONObject, num, r12, r13);
        RadarBeaconType radarBeaconType2;
        RadarCoordinate radarCoordinate2;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        jSONObject = (i & 128) != 0 ? null : jSONObject;
        num = (i & 256) != 0 ? null : num;
        if ((i & 512) != 0) {
            radarBeaconType2 = radarBeaconType;
            radarCoordinate2 = null;
        } else {
            radarBeaconType2 = radarBeaconType;
            radarCoordinate2 = radarCoordinate;
        }
    }

    public final String get_id() {
        return this._id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getMajor() {
        return this.major;
    }

    public final String getMinor() {
        return this.minor;
    }

    public final JSONObject getMetadata() {
        return this.metadata;
    }

    public final Integer getRssi() {
        return this.rssi;
    }

    public final RadarCoordinate getLocation() {
        return this.location;
    }

    public final RadarBeaconType getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RadarBeacon.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/radar/sdk/model/RadarBeacon$RadarBeaconType;", "", "(Ljava/lang/String;I)V", "IBEACON", "EDDYSTONE", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RadarBeaconType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RadarBeaconType[] $VALUES;
        public static final RadarBeaconType IBEACON = new RadarBeaconType("IBEACON", 0);
        public static final RadarBeaconType EDDYSTONE = new RadarBeaconType("EDDYSTONE", 1);

        private static final /* synthetic */ RadarBeaconType[] $values() {
            return new RadarBeaconType[]{IBEACON, EDDYSTONE};
        }

        public static EnumEntries<RadarBeaconType> getEntries() {
            return $ENTRIES;
        }

        public static RadarBeaconType valueOf(String str) {
            return (RadarBeaconType) Enum.valueOf(RadarBeaconType.class, str);
        }

        public static RadarBeaconType[] values() {
            return (RadarBeaconType[]) $VALUES.clone();
        }

        private RadarBeaconType(String str, int i) {
        }

        static {
            RadarBeaconType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    /* compiled from: RadarBeacon.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001f\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lio/radar/sdk/model/RadarBeacon$Companion;", "", "()V", "FIELD_COORDINATES", "", "FIELD_DESCRIPTION", "FIELD_EXTERNAL_ID", "FIELD_GEOMETRY", "FIELD_ID", "FIELD_INSTANCE", "FIELD_MAJOR", "FIELD_METADATA", "FIELD_MINOR", "FIELD_RSSI", "FIELD_TAG", "FIELD_TYPE", "FIELD_UID", "FIELD_UUID", "fromJson", "", "Lio/radar/sdk/model/RadarBeacon;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarBeacon;", "obj", "Lorg/json/JSONObject;", "stringForType", "type", "Lio/radar/sdk/model/RadarBeacon$RadarBeaconType;", "toJson", RadarTrackingOptions.KEY_BEACONS, "([Lio/radar/sdk/model/RadarBeacon;)Lorg/json/JSONArray;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: RadarBeacon.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RadarBeaconType.values().length];
                try {
                    iArr[RadarBeaconType.EDDYSTONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[RadarBeaconType.IBEACON.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r8 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        
            r8 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        
            r9 = r8;
            r8 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0078, code lost:
        
            if (r8 == null) goto L32;
         */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final RadarBeacon fromJson(JSONObject obj) {
            String str;
            String str2;
            String optString;
            String optString2;
            int i;
            double d;
            if (obj == null) {
                return null;
            }
            RadarBeaconType radarBeaconType = Intrinsics.areEqual(obj.optString("type"), "eddystone") ? RadarBeaconType.EDDYSTONE : RadarBeaconType.IBEACON;
            String optString3 = obj.optString("_id");
            String str3 = optString3 == null ? "" : optString3;
            String optString4 = obj.optString("description");
            String str4 = optString4 == null ? "" : optString4;
            String optString5 = obj.optString("tag");
            String str5 = optString5 == null ? null : optString5;
            String optString6 = obj.optString("externalId");
            String str6 = optString6 == null ? null : optString6;
            if (radarBeaconType == RadarBeaconType.EDDYSTONE) {
                optString = obj.optString(RadarBeacon.FIELD_UID);
                if (optString == null) {
                    optString = "";
                }
                optString2 = obj.optString(RadarBeacon.FIELD_INSTANCE);
            } else if (radarBeaconType == RadarBeaconType.IBEACON) {
                optString = obj.optString("uuid");
                if (optString == null) {
                    optString = "";
                }
                optString2 = obj.optString(RadarBeacon.FIELD_MAJOR);
            } else {
                str = "";
                str2 = str;
            }
            String optString7 = obj.optString(RadarBeacon.FIELD_MINOR);
            String str7 = optString7 == null ? "" : optString7;
            JSONObject optJSONObject = obj.optJSONObject("metadata");
            JSONObject jSONObject = optJSONObject == null ? null : optJSONObject;
            int optInt = obj.optInt(RadarBeacon.FIELD_RSSI);
            JSONObject optJSONObject2 = obj.optJSONObject(RadarBeacon.FIELD_GEOMETRY);
            JSONArray optJSONArray = optJSONObject2 != null ? optJSONObject2.optJSONArray(RadarBeacon.FIELD_COORDINATES) : null;
            if (optJSONArray != null) {
                i = optInt;
                d = optJSONArray.optDouble(1);
            } else {
                i = optInt;
                d = 0.0d;
            }
            return new RadarBeacon(str3, str4, str5, str6, str, str2, str7, jSONObject, Integer.valueOf(i), new RadarCoordinate(d, optJSONArray != null ? optJSONArray.optDouble(0) : 0.0d), radarBeaconType);
        }

        @JvmStatic
        public final RadarBeacon[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarBeacon[] radarBeaconArr = new RadarBeacon[length];
            for (int i = 0; i < length; i++) {
                radarBeaconArr[i] = RadarBeacon.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarBeacon[]) ArraysKt.filterNotNull(radarBeaconArr).toArray(new RadarBeacon[0]);
        }

        @JvmStatic
        public final JSONArray toJson(RadarBeacon[] beacons) {
            if (beacons == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (RadarBeacon radarBeacon : beacons) {
                jSONArray.put(radarBeacon.toJson());
            }
            return jSONArray;
        }

        @JvmStatic
        public final String stringForType(RadarBeaconType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return "eddystone";
            }
            if (i == 2) {
                return "ibeacon";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public final JSONObject toJson() {
        JSONObject put;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("type", INSTANCE.stringForType(this.type));
        jSONObject.putOpt("_id", this._id);
        jSONObject.putOpt("description", this.description);
        jSONObject.putOpt("externalId", this.externalId);
        jSONObject.putOpt("tag", this.tag);
        if (this.type == RadarBeaconType.EDDYSTONE) {
            String lowerCase = this.uuid.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            jSONObject.putOpt(FIELD_UID, lowerCase);
            jSONObject.putOpt(FIELD_INSTANCE, this.major);
        } else if (this.type == RadarBeaconType.IBEACON) {
            String lowerCase2 = this.uuid.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            jSONObject.putOpt("uuid", lowerCase2);
            jSONObject.putOpt(FIELD_MAJOR, this.major);
            jSONObject.putOpt(FIELD_MINOR, this.minor);
        }
        jSONObject.putOpt("metadata", this.metadata);
        jSONObject.putOpt(FIELD_RSSI, this.rssi);
        RadarCoordinate radarCoordinate = this.location;
        if (radarCoordinate == null || (put = radarCoordinate.toJson()) == null) {
            put = new JSONObject().put(FIELD_COORDINATES, new int[]{0, 0});
        }
        jSONObject.putOpt(FIELD_GEOMETRY, put);
        return jSONObject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type io.radar.sdk.model.RadarBeacon");
        RadarBeacon radarBeacon = (RadarBeacon) other;
        return Intrinsics.areEqual(this.uuid, radarBeacon.uuid) && Intrinsics.areEqual(this.major, radarBeacon.major) && Intrinsics.areEqual(this.minor, radarBeacon.minor) && this.type == radarBeacon.type;
    }

    public int hashCode() {
        return (((this.uuid.hashCode() * 31) + this.major.hashCode()) * 31) + this.minor.hashCode();
    }
}
