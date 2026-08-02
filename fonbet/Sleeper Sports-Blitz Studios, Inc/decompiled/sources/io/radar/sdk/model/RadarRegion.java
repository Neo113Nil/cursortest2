package io.radar.sdk.model;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarRegion.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 !2\u00020\u0001:\u0001!Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010J\u0006\u0010\u001f\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006\""}, d2 = {"Lio/radar/sdk/model/RadarRegion;", "", "_id", "", "name", "code", "type", "flag", RadarRegion.FIELD_ALLOWED, "", RadarRegion.FIELD_PASSED, RadarRegion.FIELD_IN_EXCLUSION_ZONE, RadarRegion.FIELD_IN_BUFFER_ZONE, RadarRegion.FIELD_DISTANCE_TO_BORDER, "", RadarRegion.FIELD_EXPECTED, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZDZ)V", "get_id", "()Ljava/lang/String;", "getAllowed", "()Z", "getCode", "getDistanceToBorder", "()D", "getExpected", "getFlag", "getInBufferZone", "getInExclusionZone", "getName", "getPassed", "getType", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarRegion {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_ALLOWED = "allowed";
    private static final String FIELD_CODE = "code";
    private static final String FIELD_DISTANCE_TO_BORDER = "distanceToBorder";
    private static final String FIELD_EXPECTED = "expected";
    private static final String FIELD_FLAG = "flag";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_IN_BUFFER_ZONE = "inBufferZone";
    private static final String FIELD_IN_EXCLUSION_ZONE = "inExclusionZone";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_PASSED = "passed";
    private static final String FIELD_TYPE = "type";
    private final String _id;
    private final boolean allowed;
    private final String code;
    private final double distanceToBorder;
    private final boolean expected;
    private final String flag;
    private final boolean inBufferZone;
    private final boolean inExclusionZone;
    private final String name;
    private final boolean passed;
    private final String type;

    @JvmStatic
    public static final RadarRegion fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    @JvmStatic
    public static final RadarRegion[] fromJson(JSONArray jSONArray) {
        return INSTANCE.fromJson(jSONArray);
    }

    public RadarRegion(String _id, String name, String code, String type, String str, boolean z, boolean z2, boolean z3, boolean z4, double d, boolean z5) {
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this._id = _id;
        this.name = name;
        this.code = code;
        this.type = type;
        this.flag = str;
        this.allowed = z;
        this.passed = z2;
        this.inExclusionZone = z3;
        this.inBufferZone = z4;
        this.distanceToBorder = d;
        this.expected = z5;
    }

    public /* synthetic */ RadarRegion(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, double d, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, d, (i & 1024) != 0 ? false : z5);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getType() {
        return this.type;
    }

    public final String getFlag() {
        return this.flag;
    }

    public final boolean getAllowed() {
        return this.allowed;
    }

    public final boolean getPassed() {
        return this.passed;
    }

    public final boolean getInExclusionZone() {
        return this.inExclusionZone;
    }

    public final boolean getInBufferZone() {
        return this.inBufferZone;
    }

    public final double getDistanceToBorder() {
        return this.distanceToBorder;
    }

    public final boolean getExpected() {
        return this.expected;
    }

    /* compiled from: RadarRegion.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lio/radar/sdk/model/RadarRegion$Companion;", "", "()V", "FIELD_ALLOWED", "", "FIELD_CODE", "FIELD_DISTANCE_TO_BORDER", "FIELD_EXPECTED", "FIELD_FLAG", "FIELD_ID", "FIELD_IN_BUFFER_ZONE", "FIELD_IN_EXCLUSION_ZONE", "FIELD_NAME", "FIELD_PASSED", "FIELD_TYPE", "fromJson", "", "Lio/radar/sdk/model/RadarRegion;", "arr", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Lio/radar/sdk/model/RadarRegion;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarRegion fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            String optString = obj.optString("_id");
            String str = optString == null ? "" : optString;
            String optString2 = obj.optString("name");
            String str2 = optString2 == null ? "" : optString2;
            String optString3 = obj.optString("code");
            String str3 = optString3 == null ? "" : optString3;
            String optString4 = obj.optString("type");
            String str4 = optString4 == null ? "" : optString4;
            String optString5 = obj.optString("flag");
            return new RadarRegion(str, str2, str3, str4, optString5 == null ? null : optString5, obj.optBoolean(RadarRegion.FIELD_ALLOWED), obj.optBoolean(RadarRegion.FIELD_PASSED), obj.optBoolean(RadarRegion.FIELD_IN_EXCLUSION_ZONE), obj.optBoolean(RadarRegion.FIELD_IN_BUFFER_ZONE), obj.optDouble(RadarRegion.FIELD_DISTANCE_TO_BORDER), obj.optBoolean(RadarRegion.FIELD_EXPECTED));
        }

        @JvmStatic
        public final RadarRegion[] fromJson(JSONArray arr) {
            if (arr == null) {
                return null;
            }
            int length = arr.length();
            RadarRegion[] radarRegionArr = new RadarRegion[length];
            for (int i = 0; i < length; i++) {
                radarRegionArr[i] = RadarRegion.INSTANCE.fromJson(arr.optJSONObject(i));
            }
            return (RadarRegion[]) ArraysKt.filterNotNull(radarRegionArr).toArray(new RadarRegion[0]);
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("_id", this._id);
        jSONObject.putOpt("name", this.name);
        jSONObject.putOpt("code", this.code);
        jSONObject.putOpt("type", this.type);
        jSONObject.putOpt("flag", this.flag);
        jSONObject.putOpt(FIELD_ALLOWED, Boolean.valueOf(this.allowed));
        jSONObject.putOpt(FIELD_PASSED, Boolean.valueOf(this.passed));
        jSONObject.putOpt(FIELD_IN_EXCLUSION_ZONE, Boolean.valueOf(this.inExclusionZone));
        jSONObject.putOpt(FIELD_IN_BUFFER_ZONE, Boolean.valueOf(this.inBufferZone));
        if (!Double.isNaN(this.distanceToBorder)) {
            jSONObject.putOpt(FIELD_DISTANCE_TO_BORDER, Double.valueOf(this.distanceToBorder));
        }
        jSONObject.putOpt(FIELD_EXPECTED, Boolean.valueOf(this.expected));
        return jSONObject;
    }
}
