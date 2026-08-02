package io.radar.sdk;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarNotificationOptions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003J\b\u0010 \u001a\u0004\u0018\u00010\u0003J\b\u0010!\u001a\u0004\u0018\u00010\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020%J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006("}, d2 = {"Lio/radar/sdk/RadarNotificationOptions;", "", "iconString", "", "iconColor", RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_STRING, RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_COLOR, RadarNotificationOptions.KEY_EVENT_ICON_STRING, RadarNotificationOptions.KEY_EVENT_ICON_COLOR, "deepLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeepLink", "()Ljava/lang/String;", "getEventIconColor", "getEventIconString", "getForegroundServiceIconColor", "getForegroundServiceIconString", "getIconColor", "getIconString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "getEventColor", "getEventIcon", "getForegroundServiceColor", "getForegroundServiceIcon", "hashCode", "", "toJson", "Lorg/json/JSONObject;", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RadarNotificationOptions {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_DEEPLINK = "deepLink";
    public static final String KEY_EVENT_ICON_COLOR = "eventIconColor";
    public static final String KEY_EVENT_ICON_STRING = "eventIconString";
    public static final String KEY_FOREGROUNDSERVICE_ICON_COLOR = "foregroundServiceIconColor";
    public static final String KEY_FOREGROUNDSERVICE_ICON_STRING = "foregroundServiceIconString";
    public static final String KEY_ICON_COLOR = "iconColor";
    public static final String KEY_ICON_STRING = "iconString";
    private final String deepLink;
    private final String eventIconColor;
    private final String eventIconString;
    private final String foregroundServiceIconColor;
    private final String foregroundServiceIconString;
    private final String iconColor;
    private final String iconString;

    public RadarNotificationOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ RadarNotificationOptions copy$default(RadarNotificationOptions radarNotificationOptions, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = radarNotificationOptions.iconString;
        }
        if ((i & 2) != 0) {
            str2 = radarNotificationOptions.iconColor;
        }
        if ((i & 4) != 0) {
            str3 = radarNotificationOptions.foregroundServiceIconString;
        }
        if ((i & 8) != 0) {
            str4 = radarNotificationOptions.foregroundServiceIconColor;
        }
        if ((i & 16) != 0) {
            str5 = radarNotificationOptions.eventIconString;
        }
        if ((i & 32) != 0) {
            str6 = radarNotificationOptions.eventIconColor;
        }
        if ((i & 64) != 0) {
            str7 = radarNotificationOptions.deepLink;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return radarNotificationOptions.copy(str, str2, str11, str4, str10, str8, str9);
    }

    @JvmStatic
    public static final RadarNotificationOptions fromJson(JSONObject jSONObject) {
        return INSTANCE.fromJson(jSONObject);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIconString() {
        return this.iconString;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getForegroundServiceIconString() {
        return this.foregroundServiceIconString;
    }

    /* renamed from: component4, reason: from getter */
    public final String getForegroundServiceIconColor() {
        return this.foregroundServiceIconColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getEventIconString() {
        return this.eventIconString;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEventIconColor() {
        return this.eventIconColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeepLink() {
        return this.deepLink;
    }

    public final RadarNotificationOptions copy(String iconString, String iconColor, String foregroundServiceIconString, String foregroundServiceIconColor, String eventIconString, String eventIconColor, String deepLink) {
        return new RadarNotificationOptions(iconString, iconColor, foregroundServiceIconString, foregroundServiceIconColor, eventIconString, eventIconColor, deepLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadarNotificationOptions)) {
            return false;
        }
        RadarNotificationOptions radarNotificationOptions = (RadarNotificationOptions) other;
        return Intrinsics.areEqual(this.iconString, radarNotificationOptions.iconString) && Intrinsics.areEqual(this.iconColor, radarNotificationOptions.iconColor) && Intrinsics.areEqual(this.foregroundServiceIconString, radarNotificationOptions.foregroundServiceIconString) && Intrinsics.areEqual(this.foregroundServiceIconColor, radarNotificationOptions.foregroundServiceIconColor) && Intrinsics.areEqual(this.eventIconString, radarNotificationOptions.eventIconString) && Intrinsics.areEqual(this.eventIconColor, radarNotificationOptions.eventIconColor) && Intrinsics.areEqual(this.deepLink, radarNotificationOptions.deepLink);
    }

    public int hashCode() {
        String str = this.iconString;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.foregroundServiceIconString;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.foregroundServiceIconColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.eventIconString;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.eventIconColor;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deepLink;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "RadarNotificationOptions(iconString=" + this.iconString + ", iconColor=" + this.iconColor + ", foregroundServiceIconString=" + this.foregroundServiceIconString + ", foregroundServiceIconColor=" + this.foregroundServiceIconColor + ", eventIconString=" + this.eventIconString + ", eventIconColor=" + this.eventIconColor + ", deepLink=" + this.deepLink + ')';
    }

    public RadarNotificationOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.iconString = str;
        this.iconColor = str2;
        this.foregroundServiceIconString = str3;
        this.foregroundServiceIconColor = str4;
        this.eventIconString = str5;
        this.eventIconColor = str6;
        this.deepLink = str7;
    }

    public /* synthetic */ RadarNotificationOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public final String getIconString() {
        return this.iconString;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final String getForegroundServiceIconString() {
        return this.foregroundServiceIconString;
    }

    public final String getForegroundServiceIconColor() {
        return this.foregroundServiceIconColor;
    }

    public final String getEventIconString() {
        return this.eventIconString;
    }

    public final String getEventIconColor() {
        return this.eventIconColor;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    /* compiled from: RadarNotificationOptions.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/radar/sdk/RadarNotificationOptions$Companion;", "", "()V", "KEY_DEEPLINK", "", "KEY_EVENT_ICON_COLOR", "KEY_EVENT_ICON_STRING", "KEY_FOREGROUNDSERVICE_ICON_COLOR", "KEY_FOREGROUNDSERVICE_ICON_STRING", "KEY_ICON_COLOR", "KEY_ICON_STRING", "fromJson", "Lio/radar/sdk/RadarNotificationOptions;", "obj", "Lorg/json/JSONObject;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RadarNotificationOptions fromJson(JSONObject obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            return new RadarNotificationOptions(obj.isNull("iconString") ? null : obj.optString("iconString"), obj.isNull("iconColor") ? null : obj.optString("iconColor"), obj.isNull(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_STRING) ? null : obj.optString(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_STRING), obj.isNull(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_COLOR) ? null : obj.optString(RadarNotificationOptions.KEY_FOREGROUNDSERVICE_ICON_COLOR), obj.isNull(RadarNotificationOptions.KEY_EVENT_ICON_STRING) ? null : obj.optString(RadarNotificationOptions.KEY_EVENT_ICON_STRING), obj.isNull(RadarNotificationOptions.KEY_EVENT_ICON_COLOR) ? null : obj.optString(RadarNotificationOptions.KEY_EVENT_ICON_COLOR), obj.isNull("deepLink") ? null : obj.optString("deepLink"));
        }
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iconString", this.iconString);
        jSONObject.put("iconColor", this.iconColor);
        jSONObject.put(KEY_FOREGROUNDSERVICE_ICON_STRING, this.foregroundServiceIconString);
        jSONObject.put(KEY_FOREGROUNDSERVICE_ICON_COLOR, this.foregroundServiceIconColor);
        jSONObject.put(KEY_EVENT_ICON_STRING, this.eventIconString);
        jSONObject.put(KEY_EVENT_ICON_COLOR, this.eventIconColor);
        jSONObject.put("deepLink", this.deepLink);
        return jSONObject;
    }

    public final String getForegroundServiceIcon() {
        String str = this.foregroundServiceIconString;
        return str == null ? this.iconString : str;
    }

    public final String getForegroundServiceColor() {
        String str = this.foregroundServiceIconColor;
        return str == null ? this.iconColor : str;
    }

    public final String getEventIcon() {
        String str = this.eventIconString;
        return str == null ? this.iconString : str;
    }

    public final String getEventColor() {
        String str = this.eventIconColor;
        return str == null ? this.iconColor : str;
    }
}
