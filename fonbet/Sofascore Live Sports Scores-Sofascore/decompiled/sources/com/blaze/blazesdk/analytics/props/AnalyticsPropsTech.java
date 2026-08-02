package com.blaze.blazesdk.analytics.props;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020&HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u00062"}, d2 = {"Lcom/blaze/blazesdk/analytics/props/AnalyticsPropsTech;", "Landroid/os/Parcelable;", "device_type", "", "device_brand", Payload.DEVICE_MODEL, "operating_system", "operating_system_version", "screen_resolution", MBridgeConstans.APP_ID, "app_version", "connection_type", "localization_setting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice_type", "()Ljava/lang/String;", "getDevice_brand", "getDevice_model", "getOperating_system", "getOperating_system_version", "getScreen_resolution", "getApp_id", "getApp_version", "getConnection_type", "getLocalization_setting", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AnalyticsPropsTech implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<AnalyticsPropsTech> CREATOR = new a();

    @b6h(MBridgeConstans.APP_ID)
    @Nullable
    private final String app_id;

    @b6h("app_version")
    @Nullable
    private final String app_version;

    @b6h("connection_type")
    @Nullable
    private final String connection_type;

    @b6h("device_brand")
    @Nullable
    private final String device_brand;

    @b6h(Payload.DEVICE_MODEL)
    @Nullable
    private final String device_model;

    @b6h("device_type")
    @Nullable
    private final String device_type;

    @b6h("localization_setting")
    @Nullable
    private final String localization_setting;

    @b6h("operating_system")
    @Nullable
    private final String operating_system;

    @b6h("operating_system_version")
    @Nullable
    private final String operating_system_version;

    @b6h("screen_resolution")
    @Nullable
    private final String screen_resolution;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AnalyticsPropsTech(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnalyticsPropsTech[i];
        }
    }

    public /* synthetic */ AnalyticsPropsTech(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }

    public static /* synthetic */ AnalyticsPropsTech copy$default(AnalyticsPropsTech analyticsPropsTech, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsPropsTech.device_type;
        }
        if ((i & 2) != 0) {
            str2 = analyticsPropsTech.device_brand;
        }
        if ((i & 4) != 0) {
            str3 = analyticsPropsTech.device_model;
        }
        if ((i & 8) != 0) {
            str4 = analyticsPropsTech.operating_system;
        }
        if ((i & 16) != 0) {
            str5 = analyticsPropsTech.operating_system_version;
        }
        if ((i & 32) != 0) {
            str6 = analyticsPropsTech.screen_resolution;
        }
        if ((i & 64) != 0) {
            str7 = analyticsPropsTech.app_id;
        }
        if ((i & 128) != 0) {
            str8 = analyticsPropsTech.app_version;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str9 = analyticsPropsTech.connection_type;
        }
        if ((i & 512) != 0) {
            str10 = analyticsPropsTech.localization_setting;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return analyticsPropsTech.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDevice_type() {
        return this.device_type;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getLocalization_setting() {
        return this.localization_setting;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDevice_brand() {
        return this.device_brand;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getDevice_model() {
        return this.device_model;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getOperating_system() {
        return this.operating_system;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getOperating_system_version() {
        return this.operating_system_version;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getScreen_resolution() {
        return this.screen_resolution;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getApp_id() {
        return this.app_id;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getApp_version() {
        return this.app_version;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getConnection_type() {
        return this.connection_type;
    }

    @NotNull
    public final AnalyticsPropsTech copy(@Nullable String device_type, @Nullable String device_brand, @Nullable String device_model, @Nullable String operating_system, @Nullable String operating_system_version, @Nullable String screen_resolution, @Nullable String app_id, @Nullable String app_version, @Nullable String connection_type, @Nullable String localization_setting) {
        return new AnalyticsPropsTech(device_type, device_brand, device_model, operating_system, operating_system_version, screen_resolution, app_id, app_version, connection_type, localization_setting);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsPropsTech)) {
            return false;
        }
        AnalyticsPropsTech analyticsPropsTech = (AnalyticsPropsTech) other;
        return Intrinsics.c(this.device_type, analyticsPropsTech.device_type) && Intrinsics.c(this.device_brand, analyticsPropsTech.device_brand) && Intrinsics.c(this.device_model, analyticsPropsTech.device_model) && Intrinsics.c(this.operating_system, analyticsPropsTech.operating_system) && Intrinsics.c(this.operating_system_version, analyticsPropsTech.operating_system_version) && Intrinsics.c(this.screen_resolution, analyticsPropsTech.screen_resolution) && Intrinsics.c(this.app_id, analyticsPropsTech.app_id) && Intrinsics.c(this.app_version, analyticsPropsTech.app_version) && Intrinsics.c(this.connection_type, analyticsPropsTech.connection_type) && Intrinsics.c(this.localization_setting, analyticsPropsTech.localization_setting);
    }

    @Nullable
    public final String getApp_id() {
        return this.app_id;
    }

    @Nullable
    public final String getApp_version() {
        return this.app_version;
    }

    @Nullable
    public final String getConnection_type() {
        return this.connection_type;
    }

    @Nullable
    public final String getDevice_brand() {
        return this.device_brand;
    }

    @Nullable
    public final String getDevice_model() {
        return this.device_model;
    }

    @Nullable
    public final String getDevice_type() {
        return this.device_type;
    }

    @Nullable
    public final String getLocalization_setting() {
        return this.localization_setting;
    }

    @Nullable
    public final String getOperating_system() {
        return this.operating_system;
    }

    @Nullable
    public final String getOperating_system_version() {
        return this.operating_system_version;
    }

    @Nullable
    public final String getScreen_resolution() {
        return this.screen_resolution;
    }

    public int hashCode() {
        String str = this.device_type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.device_brand;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.device_model;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.operating_system;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.operating_system_version;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.screen_resolution;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.app_id;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.app_version;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.connection_type;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.localization_setting;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsPropsTech(device_type=");
        sb.append(this.device_type);
        sb.append(", device_brand=");
        sb.append(this.device_brand);
        sb.append(", device_model=");
        sb.append(this.device_model);
        sb.append(", operating_system=");
        sb.append(this.operating_system);
        sb.append(", operating_system_version=");
        sb.append(this.operating_system_version);
        sb.append(", screen_resolution=");
        sb.append(this.screen_resolution);
        sb.append(", app_id=");
        sb.append(this.app_id);
        sb.append(", app_version=");
        sb.append(this.app_version);
        sb.append(", connection_type=");
        sb.append(this.connection_type);
        sb.append(", localization_setting=");
        return lnb.q(sb, this.localization_setting, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.device_type);
        dest.writeString(this.device_brand);
        dest.writeString(this.device_model);
        dest.writeString(this.operating_system);
        dest.writeString(this.operating_system_version);
        dest.writeString(this.screen_resolution);
        dest.writeString(this.app_id);
        dest.writeString(this.app_version);
        dest.writeString(this.connection_type);
        dest.writeString(this.localization_setting);
    }

    public AnalyticsPropsTech(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.device_type = str;
        this.device_brand = str2;
        this.device_model = str3;
        this.operating_system = str4;
        this.operating_system_version = str5;
        this.screen_resolution = str6;
        this.app_id = str7;
        this.app_version = str8;
        this.connection_type = str9;
        this.localization_setting = str10;
    }

    public AnalyticsPropsTech() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }
}
