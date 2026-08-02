package ru.ozon.tracker.model;

import B0.C2454a;
import C.o0;
import Ek.a;
import G.g;
import Pk0.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Namespace;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0015HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J·\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001J\u0006\u0010@\u001a\u00020\u0007J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0007HÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006L"}, d2 = {"Lru/ozon/tracker/model/TrinityAttributes;", "Landroid/os/Parcelable;", "namespace", "Lru/ozon/tracker/sendEvent/Namespace;", "appVersion", "", "screenResolutionX", "", "screenResolutionY", "domainName", "buildNumber", "platformStore", "appsflyerId", "installId", "advertisingId", "osVersion", "deviceModel", "firebaseInstallId", "deviceType", "theme", "screenDensity", "", "userAgent", "<init>", "(Lru/ozon/tracker/sendEvent/Namespace;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V", "getNamespace", "()Lru/ozon/tracker/sendEvent/Namespace;", "getAppVersion", "()Ljava/lang/String;", "getScreenResolutionX", "()I", "getScreenResolutionY", "getDomainName", "getBuildNumber", "getPlatformStore", "getAppsflyerId", "getInstallId", "getAdvertisingId", "getOsVersion", "getDeviceModel", "getFirebaseInstallId", "getDeviceType", "getTheme", "getScreenDensity", "()F", "getUserAgent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TrinityAttributes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrinityAttributes> CREATOR = new Creator();

    @NotNull
    private final String advertisingId;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String appsflyerId;
    private final int buildNumber;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String deviceType;

    @NotNull
    private final String domainName;
    private final String firebaseInstallId;

    @NotNull
    private final String installId;

    @NotNull
    private final Namespace namespace;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String platformStore;
    private final float screenDensity;
    private final int screenResolutionX;
    private final int screenResolutionY;
    private final String theme;

    @NotNull
    private final String userAgent;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrinityAttributes> {
        @Override // android.os.Parcelable.Creator
        public final TrinityAttributes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrinityAttributes(Namespace.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TrinityAttributes[] newArray(int i11) {
            return new TrinityAttributes[i11];
        }
    }

    public TrinityAttributes(@NotNull Namespace namespace, @NotNull String appVersion, int i11, int i12, @NotNull String domainName, int i13, @NotNull String platformStore, @NotNull String appsflyerId, @NotNull String installId, @NotNull String advertisingId, @NotNull String osVersion, @NotNull String deviceModel, String str, @NotNull String deviceType, String str2, float f7, @NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(platformStore, "platformStore");
        Intrinsics.checkNotNullParameter(appsflyerId, "appsflyerId");
        Intrinsics.checkNotNullParameter(installId, "installId");
        Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        this.namespace = namespace;
        this.appVersion = appVersion;
        this.screenResolutionX = i11;
        this.screenResolutionY = i12;
        this.domainName = domainName;
        this.buildNumber = i13;
        this.platformStore = platformStore;
        this.appsflyerId = appsflyerId;
        this.installId = installId;
        this.advertisingId = advertisingId;
        this.osVersion = osVersion;
        this.deviceModel = deviceModel;
        this.firebaseInstallId = str;
        this.deviceType = deviceType;
        this.theme = str2;
        this.screenDensity = f7;
        this.userAgent = userAgent;
    }

    public static /* synthetic */ TrinityAttributes copy$default(TrinityAttributes trinityAttributes, Namespace namespace, String str, int i11, int i12, String str2, int i13, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, float f7, String str12, int i14, Object obj) {
        String str13;
        float f11;
        Namespace namespace2;
        TrinityAttributes trinityAttributes2;
        String str14;
        String str15;
        int i15;
        int i16;
        String str16;
        int i17;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        Namespace namespace3 = (i14 & 1) != 0 ? trinityAttributes.namespace : namespace;
        String str25 = (i14 & 2) != 0 ? trinityAttributes.appVersion : str;
        int i18 = (i14 & 4) != 0 ? trinityAttributes.screenResolutionX : i11;
        int i19 = (i14 & 8) != 0 ? trinityAttributes.screenResolutionY : i12;
        String str26 = (i14 & 16) != 0 ? trinityAttributes.domainName : str2;
        int i21 = (i14 & 32) != 0 ? trinityAttributes.buildNumber : i13;
        String str27 = (i14 & 64) != 0 ? trinityAttributes.platformStore : str3;
        String str28 = (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? trinityAttributes.appsflyerId : str4;
        String str29 = (i14 & 256) != 0 ? trinityAttributes.installId : str5;
        String str30 = (i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? trinityAttributes.advertisingId : str6;
        String str31 = (i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? trinityAttributes.osVersion : str7;
        String str32 = (i14 & 2048) != 0 ? trinityAttributes.deviceModel : str8;
        String str33 = (i14 & 4096) != 0 ? trinityAttributes.firebaseInstallId : str9;
        String str34 = (i14 & 8192) != 0 ? trinityAttributes.deviceType : str10;
        Namespace namespace4 = namespace3;
        String str35 = (i14 & 16384) != 0 ? trinityAttributes.theme : str11;
        float f12 = (i14 & 32768) != 0 ? trinityAttributes.screenDensity : f7;
        if ((i14 & 65536) != 0) {
            f11 = f12;
            str13 = trinityAttributes.userAgent;
            str14 = str35;
            str15 = str25;
            i15 = i18;
            i16 = i19;
            str16 = str26;
            i17 = i21;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            str21 = str31;
            str22 = str32;
            str23 = str33;
            str24 = str34;
            namespace2 = namespace4;
            trinityAttributes2 = trinityAttributes;
        } else {
            str13 = str12;
            f11 = f12;
            namespace2 = namespace4;
            trinityAttributes2 = trinityAttributes;
            str14 = str35;
            str15 = str25;
            i15 = i18;
            i16 = i19;
            str16 = str26;
            i17 = i21;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            str21 = str31;
            str22 = str32;
            str23 = str33;
            str24 = str34;
        }
        return trinityAttributes2.copy(namespace2, str15, i15, i16, str16, i17, str17, str18, str19, str20, str21, str22, str23, str24, str14, f11, str13);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Namespace getNamespace() {
        return this.namespace;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component13, reason: from getter */
    public final String getFirebaseInstallId() {
        return this.firebaseInstallId;
    }

    @NotNull
    /* renamed from: component14, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* renamed from: component16, reason: from getter */
    public final float getScreenDensity() {
        return this.screenDensity;
    }

    @NotNull
    /* renamed from: component17, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScreenResolutionX() {
        return this.screenResolutionX;
    }

    /* renamed from: component4, reason: from getter */
    public final int getScreenResolutionY() {
        return this.screenResolutionY;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDomainName() {
        return this.domainName;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBuildNumber() {
        return this.buildNumber;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getPlatformStore() {
        return this.platformStore;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getAppsflyerId() {
        return this.appsflyerId;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getInstallId() {
        return this.installId;
    }

    @NotNull
    public final TrinityAttributes copy(@NotNull Namespace namespace, @NotNull String appVersion, int screenResolutionX, int screenResolutionY, @NotNull String domainName, int buildNumber, @NotNull String platformStore, @NotNull String appsflyerId, @NotNull String installId, @NotNull String advertisingId, @NotNull String osVersion, @NotNull String deviceModel, String firebaseInstallId, @NotNull String deviceType, String theme, float screenDensity, @NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(platformStore, "platformStore");
        Intrinsics.checkNotNullParameter(appsflyerId, "appsflyerId");
        Intrinsics.checkNotNullParameter(installId, "installId");
        Intrinsics.checkNotNullParameter(advertisingId, "advertisingId");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        return new TrinityAttributes(namespace, appVersion, screenResolutionX, screenResolutionY, domainName, buildNumber, platformStore, appsflyerId, installId, advertisingId, osVersion, deviceModel, firebaseInstallId, deviceType, theme, screenDensity, userAgent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrinityAttributes)) {
            return false;
        }
        TrinityAttributes trinityAttributes = (TrinityAttributes) other;
        return this.namespace == trinityAttributes.namespace && Intrinsics.d(this.appVersion, trinityAttributes.appVersion) && this.screenResolutionX == trinityAttributes.screenResolutionX && this.screenResolutionY == trinityAttributes.screenResolutionY && Intrinsics.d(this.domainName, trinityAttributes.domainName) && this.buildNumber == trinityAttributes.buildNumber && Intrinsics.d(this.platformStore, trinityAttributes.platformStore) && Intrinsics.d(this.appsflyerId, trinityAttributes.appsflyerId) && Intrinsics.d(this.installId, trinityAttributes.installId) && Intrinsics.d(this.advertisingId, trinityAttributes.advertisingId) && Intrinsics.d(this.osVersion, trinityAttributes.osVersion) && Intrinsics.d(this.deviceModel, trinityAttributes.deviceModel) && Intrinsics.d(this.firebaseInstallId, trinityAttributes.firebaseInstallId) && Intrinsics.d(this.deviceType, trinityAttributes.deviceType) && Intrinsics.d(this.theme, trinityAttributes.theme) && Float.compare(this.screenDensity, trinityAttributes.screenDensity) == 0 && Intrinsics.d(this.userAgent, trinityAttributes.userAgent);
    }

    @NotNull
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getAppsflyerId() {
        return this.appsflyerId;
    }

    public final int getBuildNumber() {
        return this.buildNumber;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDomainName() {
        return this.domainName;
    }

    public final String getFirebaseInstallId() {
        return this.firebaseInstallId;
    }

    @NotNull
    public final String getInstallId() {
        return this.installId;
    }

    @NotNull
    public final Namespace getNamespace() {
        return this.namespace;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getPlatformStore() {
        return this.platformStore;
    }

    public final float getScreenDensity() {
        return this.screenDensity;
    }

    public final int getScreenResolutionX() {
        return this.screenResolutionX;
    }

    public final int getScreenResolutionY() {
        return this.screenResolutionY;
    }

    public final String getTheme() {
        return this.theme;
    }

    @NotNull
    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int a11 = g.a(g.a(g.a(g.a(g.a(g.a(C2454a.a(this.buildNumber, g.a(C2454a.a(this.screenResolutionY, C2454a.a(this.screenResolutionX, g.a(this.namespace.hashCode() * 31, 31, this.appVersion), 31), 31), 31, this.domainName), 31), 31, this.platformStore), 31, this.appsflyerId), 31, this.installId), 31, this.advertisingId), 31, this.osVersion), 31, this.deviceModel);
        String str = this.firebaseInstallId;
        int a12 = g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.deviceType);
        String str2 = this.theme;
        return this.userAgent.hashCode() + b.a(this.screenDensity, (a12 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        Namespace namespace = this.namespace;
        String str = this.appVersion;
        int i11 = this.screenResolutionX;
        int i12 = this.screenResolutionY;
        String str2 = this.domainName;
        int i13 = this.buildNumber;
        String str3 = this.platformStore;
        String str4 = this.appsflyerId;
        String str5 = this.installId;
        String str6 = this.advertisingId;
        String str7 = this.osVersion;
        String str8 = this.deviceModel;
        String str9 = this.firebaseInstallId;
        String str10 = this.deviceType;
        String str11 = this.theme;
        float f7 = this.screenDensity;
        String str12 = this.userAgent;
        StringBuilder sb2 = new StringBuilder("TrinityAttributes(namespace=");
        sb2.append(namespace);
        sb2.append(", appVersion=");
        sb2.append(str);
        sb2.append(", screenResolutionX=");
        a.f(i11, i12, ", screenResolutionY=", ", domainName=", sb2);
        Pk0.g.d(i13, str2, ", buildNumber=", ", platformStore=", sb2);
        Nh.a.h(sb2, str3, ", appsflyerId=", str4, ", installId=");
        Nh.a.h(sb2, str5, ", advertisingId=", str6, ", osVersion=");
        Nh.a.h(sb2, str7, ", deviceModel=", str8, ", firebaseInstallId=");
        Nh.a.h(sb2, str9, ", deviceType=", str10, ", theme=");
        sb2.append(str11);
        sb2.append(", screenDensity=");
        sb2.append(f7);
        sb2.append(", userAgent=");
        return o0.c(sb2, str12, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.namespace.name());
        dest.writeString(this.appVersion);
        dest.writeInt(this.screenResolutionX);
        dest.writeInt(this.screenResolutionY);
        dest.writeString(this.domainName);
        dest.writeInt(this.buildNumber);
        dest.writeString(this.platformStore);
        dest.writeString(this.appsflyerId);
        dest.writeString(this.installId);
        dest.writeString(this.advertisingId);
        dest.writeString(this.osVersion);
        dest.writeString(this.deviceModel);
        dest.writeString(this.firebaseInstallId);
        dest.writeString(this.deviceType);
        dest.writeString(this.theme);
        dest.writeFloat(this.screenDensity);
        dest.writeString(this.userAgent);
    }

    public /* synthetic */ TrinityAttributes(Namespace namespace, String str, int i11, int i12, String str2, int i13, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, float f7, String str12, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(namespace, str, i11, i12, (i14 & 16) != 0 ? "ozon.ru" : str2, i13, str3, str4, str5, str6, str7, str8, str9, str10, str11, f7, (i14 & 65536) != 0 ? "TrackerSDK_Android v9.1.4" : str12);
    }
}
