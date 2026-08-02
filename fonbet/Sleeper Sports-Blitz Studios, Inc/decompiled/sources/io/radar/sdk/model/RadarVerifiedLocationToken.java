package io.radar.sdk.model;

import io.radar.sdk.RadarUtils;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarVerifiedLocationToken.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 (2\u00020\u0001:\u0001(BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0006\u0010'\u001a\u00020\u0012R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lio/radar/sdk/model/RadarVerifiedLocationToken;", "", "user", "Lio/radar/sdk/model/RadarUser;", RadarVerifiedLocationToken.FIELD_EVENTS, "", "Lio/radar/sdk/model/RadarEvent;", "token", "", RadarVerifiedLocationToken.FIELD_EXPIRES_AT, "Ljava/util/Date;", RadarVerifiedLocationToken.FIELD_EXPIRES_IN, "", RadarVerifiedLocationToken.FIELD_PASSED, "", RadarVerifiedLocationToken.FIELD_FAILURE_REASONS, "_id", "fullJson", "Lorg/json/JSONObject;", "(Lio/radar/sdk/model/RadarUser;[Lio/radar/sdk/model/RadarEvent;Ljava/lang/String;Ljava/util/Date;IZ[Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "get_id", "()Ljava/lang/String;", "getEvents", "()[Lio/radar/sdk/model/RadarEvent;", "[Lio/radar/sdk/model/RadarEvent;", "getExpiresAt", "()Ljava/util/Date;", "getExpiresIn", "()I", "getFailureReasons", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getFullJson", "()Lorg/json/JSONObject;", "getPassed", "()Z", "getToken", "getUser", "()Lio/radar/sdk/model/RadarUser;", "toJson", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarVerifiedLocationToken {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_EVENTS = "events";
    private static final String FIELD_EXPIRES_AT = "expiresAt";
    private static final String FIELD_EXPIRES_IN = "expiresIn";
    private static final String FIELD_FAILURE_REASONS = "failureReasons";
    private static final String FIELD_ID = "_id";
    private static final String FIELD_PASSED = "passed";
    private static final String FIELD_TOKEN = "token";
    private static final String FIELD_USER = "user";
    private final String _id;
    private final RadarEvent[] events;
    private final Date expiresAt;
    private final int expiresIn;
    private final String[] failureReasons;
    private final JSONObject fullJson;
    private final boolean passed;
    private final String token;
    private final RadarUser user;

    public RadarVerifiedLocationToken(RadarUser user, RadarEvent[] events, String token, Date expiresAt, int i, boolean z, String[] failureReasons, String _id, JSONObject fullJson) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        Intrinsics.checkNotNullParameter(failureReasons, "failureReasons");
        Intrinsics.checkNotNullParameter(_id, "_id");
        Intrinsics.checkNotNullParameter(fullJson, "fullJson");
        this.user = user;
        this.events = events;
        this.token = token;
        this.expiresAt = expiresAt;
        this.expiresIn = i;
        this.passed = z;
        this.failureReasons = failureReasons;
        this._id = _id;
        this.fullJson = fullJson;
    }

    public final RadarUser getUser() {
        return this.user;
    }

    public final RadarEvent[] getEvents() {
        return this.events;
    }

    public final String getToken() {
        return this.token;
    }

    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final boolean getPassed() {
        return this.passed;
    }

    public final String[] getFailureReasons() {
        return this.failureReasons;
    }

    public final String get_id() {
        return this._id;
    }

    public final JSONObject getFullJson() {
        return this.fullJson;
    }

    /* compiled from: RadarVerifiedLocationToken.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/radar/sdk/model/RadarVerifiedLocationToken$Companion;", "", "()V", "FIELD_EVENTS", "", "FIELD_EXPIRES_AT", "FIELD_EXPIRES_IN", "FIELD_FAILURE_REASONS", "FIELD_ID", "FIELD_PASSED", "FIELD_TOKEN", "FIELD_USER", "fromJson", "Lio/radar/sdk/model/RadarVerifiedLocationToken;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final RadarVerifiedLocationToken fromJson(JSONObject obj) {
            String[] strArr;
            if (obj == null) {
                return null;
            }
            RadarUser fromJson = RadarUser.INSTANCE.fromJson(obj.optJSONObject("user"));
            RadarEvent[] fromJson2 = RadarEvent.INSTANCE.fromJson(obj.optJSONArray(RadarVerifiedLocationToken.FIELD_EVENTS));
            String optString = obj.optString("token");
            Date isoStringToDate$sdk_release = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.optString(RadarVerifiedLocationToken.FIELD_EXPIRES_AT));
            int optInt = obj.optInt(RadarVerifiedLocationToken.FIELD_EXPIRES_IN);
            boolean optBoolean = obj.optBoolean(RadarVerifiedLocationToken.FIELD_PASSED);
            JSONArray optJSONArray = obj.optJSONArray(RadarVerifiedLocationToken.FIELD_FAILURE_REASONS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    String optString2 = optJSONArray.optString(i);
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    strArr[i] = optString2;
                }
            } else {
                strArr = new String[0];
            }
            String optString3 = obj.optString("_id");
            if (optString3 == null) {
                optString3 = "";
            }
            String str = optString3;
            if (fromJson == null || fromJson2 == null || optString == null || isoStringToDate$sdk_release == null) {
                return null;
            }
            return new RadarVerifiedLocationToken(fromJson, fromJson2, optString, isoStringToDate$sdk_release, optInt, optBoolean, strArr, str, obj);
        }
    }

    public final JSONObject toJson() {
        return this.fullJson;
    }
}
