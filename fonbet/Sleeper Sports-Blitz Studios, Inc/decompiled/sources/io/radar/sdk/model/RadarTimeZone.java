package io.radar.sdk.model;

import io.radar.sdk.RadarUtils;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: RadarTimeZone.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lio/radar/sdk/model/RadarTimeZone;", "", "id", "", "name", "code", RadarTimeZone.FIELD_CURRENT_TIME, "Ljava/util/Date;", RadarTimeZone.FIELD_UTC_OFFSET, "", RadarTimeZone.FIELD_DST_OFFSET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;II)V", "getCode", "()Ljava/lang/String;", "getCurrentTime", "()Ljava/util/Date;", "getDstOffset", "()I", "getId", "getName", "getUtcOffset", "toJson", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarTimeZone {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FIELD_CODE = "code";
    private static final String FIELD_CURRENT_TIME = "currentTime";
    private static final String FIELD_DST_OFFSET = "dstOffset";
    private static final String FIELD_ID = "id";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_UTC_OFFSET = "utcOffset";
    private final String code;
    private final Date currentTime;
    private final int dstOffset;
    private final String id;
    private final String name;
    private final int utcOffset;

    @JvmStatic
    public static final RadarTimeZone fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    public RadarTimeZone(String id, String name, String code, Date currentTime, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currentTime, "currentTime");
        this.id = id;
        this.name = name;
        this.code = code;
        this.currentTime = currentTime;
        this.utcOffset = i;
        this.dstOffset = i2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final Date getCurrentTime() {
        return this.currentTime;
    }

    public final int getUtcOffset() {
        return this.utcOffset;
    }

    public final int getDstOffset() {
        return this.dstOffset;
    }

    /* compiled from: RadarTimeZone.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/radar/sdk/model/RadarTimeZone$Companion;", "", "()V", "FIELD_CODE", "", "FIELD_CURRENT_TIME", "FIELD_DST_OFFSET", "FIELD_ID", "FIELD_NAME", "FIELD_UTC_OFFSET", "fromJson", "Lio/radar/sdk/model/RadarTimeZone;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarTimeZone fromJson(JSONObject obj) {
            if (obj == null) {
                return null;
            }
            try {
                String string = obj.getString("id");
                String string2 = obj.getString("name");
                String string3 = obj.getString("code");
                int i = obj.getInt(RadarTimeZone.FIELD_UTC_OFFSET);
                int i2 = obj.getInt(RadarTimeZone.FIELD_DST_OFFSET);
                Date isoStringToDate$sdk_release = RadarUtils.INSTANCE.isoStringToDate$sdk_release(obj.getString(RadarTimeZone.FIELD_CURRENT_TIME));
                if (isoStringToDate$sdk_release == null) {
                    return null;
                }
                Intrinsics.checkNotNull(string);
                Intrinsics.checkNotNull(string2);
                Intrinsics.checkNotNull(string3);
                return new RadarTimeZone(string, string2, string3, isoStringToDate$sdk_release, i, i2);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final JSONObject toJson() {
        SimpleDateFormat simpleDateFormat;
        TimeZone timeZone;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("id", this.id);
        jSONObject.putOpt("name", this.name);
        jSONObject.putOpt("code", this.code);
        if (this.utcOffset == 0) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
        }
        if (this.utcOffset == 0) {
            timeZone = DesugarTimeZone.getTimeZone("UTC");
        } else {
            timeZone = DesugarTimeZone.getTimeZone(this.id);
        }
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(this.currentTime);
        if (this.utcOffset != 0) {
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNull(format);
            String substring = format.substring(0, format.length() - 2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb.append(substring);
            sb.append(AbstractJsonLexerKt.COLON);
            String substring2 = format.substring(format.length() - 2);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb.append(substring2);
            format = sb.toString();
        }
        jSONObject.putOpt(FIELD_CURRENT_TIME, format);
        jSONObject.putOpt(FIELD_UTC_OFFSET, Integer.valueOf(this.utcOffset));
        jSONObject.putOpt(FIELD_DST_OFFSET, Integer.valueOf(this.dstOffset));
        return jSONObject;
    }
}
