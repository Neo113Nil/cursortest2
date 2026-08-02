package com.socure.idplus.device.internal.sigmaDeviceV2.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.socure.idplus.device.internal.behavior.model.a;
import io.sentry.protocol.OperatingSystem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0018HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u000eHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006H"}, d2 = {"Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceMetadata;", "", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "", "platform", OperatingSystem.TYPE, "osVersion", "deviceModel", "deviceManufacturer", "deviceType", "deviceMemory", "", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "timeZoneOffset", "", "language", "deviceArchitecture", "network", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceNetwork;", "battery", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/Battery;", "applicationType", "deviceContext", "androidAttributes", "Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/AndroidAttributes;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceNetwork;Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/Battery;Ljava/lang/String;Ljava/lang/String;Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/AndroidAttributes;)V", "getAndroidAttributes", "()Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/AndroidAttributes;", "getApplicationType", "()Ljava/lang/String;", "getBattery", "()Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/Battery;", "getDeviceArchitecture", "getDeviceContext", "getDeviceManufacturer", "getDeviceMemory", "()F", "getDeviceModel", "getDeviceType", "getLanguage", "getNetwork", "()Lcom/socure/idplus/device/internal/sigmaDeviceV2/model/DeviceNetwork;", "getOs", "getOsVersion", "getPlatform", "getSdkVersion", "getTimeZone", "getTimeZoneOffset", "()I", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "device-risk-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class DeviceMetadata {

    @SerializedName("androidAttributes")
    private final AndroidAttributes androidAttributes;

    @SerializedName("applicationType")
    private final String applicationType;

    @SerializedName("battery")
    private final Battery battery;

    @SerializedName("deviceArchitecture")
    private final String deviceArchitecture;

    @SerializedName("deviceContext")
    private final String deviceContext;

    @SerializedName("deviceManufacturer")
    private final String deviceManufacturer;

    @SerializedName("deviceMemory")
    private final float deviceMemory;

    @SerializedName("deviceModel")
    private final String deviceModel;

    @SerializedName("deviceType")
    private final String deviceType;

    @SerializedName("language")
    private final String language;

    @SerializedName("network")
    private final DeviceNetwork network;

    @SerializedName(OperatingSystem.TYPE)
    private final String os;

    @SerializedName("osVersion")
    private final String osVersion;

    @SerializedName("platform")
    private final String platform;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.SDK_VERSION)
    private final String sdkVersion;

    @SerializedName(RemoteConfigConstants.RequestFieldKey.TIME_ZONE)
    private final String timeZone;

    @SerializedName("timeZoneOffset")
    private final int timeZoneOffset;

    public DeviceMetadata(String sdkVersion, String platform, String os, String osVersion, String deviceModel, String deviceManufacturer, String deviceType, float f, String timeZone, int i, String language, String deviceArchitecture, DeviceNetwork network, Battery battery, String applicationType, String deviceContext, AndroidAttributes androidAttributes) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(deviceArchitecture, "deviceArchitecture");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(battery, "battery");
        Intrinsics.checkNotNullParameter(applicationType, "applicationType");
        Intrinsics.checkNotNullParameter(deviceContext, "deviceContext");
        Intrinsics.checkNotNullParameter(androidAttributes, "androidAttributes");
        this.sdkVersion = sdkVersion;
        this.platform = platform;
        this.os = os;
        this.osVersion = osVersion;
        this.deviceModel = deviceModel;
        this.deviceManufacturer = deviceManufacturer;
        this.deviceType = deviceType;
        this.deviceMemory = f;
        this.timeZone = timeZone;
        this.timeZoneOffset = i;
        this.language = language;
        this.deviceArchitecture = deviceArchitecture;
        this.network = network;
        this.battery = battery;
        this.applicationType = applicationType;
        this.deviceContext = deviceContext;
        this.androidAttributes = androidAttributes;
    }

    public static /* synthetic */ DeviceMetadata copy$default(DeviceMetadata deviceMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, String str8, int i, String str9, String str10, DeviceNetwork deviceNetwork, Battery battery, String str11, String str12, AndroidAttributes androidAttributes, int i2, Object obj) {
        AndroidAttributes androidAttributes2;
        String str13;
        String str14;
        DeviceMetadata deviceMetadata2;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        float f2;
        String str22;
        int i3;
        String str23;
        String str24;
        DeviceNetwork deviceNetwork2;
        Battery battery2;
        String str25 = (i2 & 1) != 0 ? deviceMetadata.sdkVersion : str;
        String str26 = (i2 & 2) != 0 ? deviceMetadata.platform : str2;
        String str27 = (i2 & 4) != 0 ? deviceMetadata.os : str3;
        String str28 = (i2 & 8) != 0 ? deviceMetadata.osVersion : str4;
        String str29 = (i2 & 16) != 0 ? deviceMetadata.deviceModel : str5;
        String str30 = (i2 & 32) != 0 ? deviceMetadata.deviceManufacturer : str6;
        String str31 = (i2 & 64) != 0 ? deviceMetadata.deviceType : str7;
        float f3 = (i2 & 128) != 0 ? deviceMetadata.deviceMemory : f;
        String str32 = (i2 & 256) != 0 ? deviceMetadata.timeZone : str8;
        int i4 = (i2 & 512) != 0 ? deviceMetadata.timeZoneOffset : i;
        String str33 = (i2 & 1024) != 0 ? deviceMetadata.language : str9;
        String str34 = (i2 & 2048) != 0 ? deviceMetadata.deviceArchitecture : str10;
        DeviceNetwork deviceNetwork3 = (i2 & 4096) != 0 ? deviceMetadata.network : deviceNetwork;
        Battery battery3 = (i2 & 8192) != 0 ? deviceMetadata.battery : battery;
        String str35 = str25;
        String str36 = (i2 & 16384) != 0 ? deviceMetadata.applicationType : str11;
        String str37 = (i2 & 32768) != 0 ? deviceMetadata.deviceContext : str12;
        if ((i2 & 65536) != 0) {
            str13 = str37;
            androidAttributes2 = deviceMetadata.androidAttributes;
            str15 = str36;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            str21 = str31;
            f2 = f3;
            str22 = str32;
            i3 = i4;
            str23 = str33;
            str24 = str34;
            deviceNetwork2 = deviceNetwork3;
            battery2 = battery3;
            str14 = str35;
            deviceMetadata2 = deviceMetadata;
        } else {
            androidAttributes2 = androidAttributes;
            str13 = str37;
            str14 = str35;
            deviceMetadata2 = deviceMetadata;
            str15 = str36;
            str16 = str26;
            str17 = str27;
            str18 = str28;
            str19 = str29;
            str20 = str30;
            str21 = str31;
            f2 = f3;
            str22 = str32;
            i3 = i4;
            str23 = str33;
            str24 = str34;
            deviceNetwork2 = deviceNetwork3;
            battery2 = battery3;
        }
        return deviceMetadata2.copy(str14, str16, str17, str18, str19, str20, str21, f2, str22, i3, str23, str24, deviceNetwork2, battery2, str15, str13, androidAttributes2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* renamed from: component11, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDeviceArchitecture() {
        return this.deviceArchitecture;
    }

    /* renamed from: component13, reason: from getter */
    public final DeviceNetwork getNetwork() {
        return this.network;
    }

    /* renamed from: component14, reason: from getter */
    public final Battery getBattery() {
        return this.battery;
    }

    /* renamed from: component15, reason: from getter */
    public final String getApplicationType() {
        return this.applicationType;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDeviceContext() {
        return this.deviceContext;
    }

    /* renamed from: component17, reason: from getter */
    public final AndroidAttributes getAndroidAttributes() {
        return this.androidAttributes;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component8, reason: from getter */
    public final float getDeviceMemory() {
        return this.deviceMemory;
    }

    /* renamed from: component9, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final DeviceMetadata copy(String sdkVersion, String platform, String os, String osVersion, String deviceModel, String deviceManufacturer, String deviceType, float deviceMemory, String timeZone, int timeZoneOffset, String language, String deviceArchitecture, DeviceNetwork network, Battery battery, String applicationType, String deviceContext, AndroidAttributes androidAttributes) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(deviceArchitecture, "deviceArchitecture");
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(battery, "battery");
        Intrinsics.checkNotNullParameter(applicationType, "applicationType");
        Intrinsics.checkNotNullParameter(deviceContext, "deviceContext");
        Intrinsics.checkNotNullParameter(androidAttributes, "androidAttributes");
        return new DeviceMetadata(sdkVersion, platform, os, osVersion, deviceModel, deviceManufacturer, deviceType, deviceMemory, timeZone, timeZoneOffset, language, deviceArchitecture, network, battery, applicationType, deviceContext, androidAttributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMetadata)) {
            return false;
        }
        DeviceMetadata deviceMetadata = (DeviceMetadata) other;
        return Intrinsics.areEqual(this.sdkVersion, deviceMetadata.sdkVersion) && Intrinsics.areEqual(this.platform, deviceMetadata.platform) && Intrinsics.areEqual(this.os, deviceMetadata.os) && Intrinsics.areEqual(this.osVersion, deviceMetadata.osVersion) && Intrinsics.areEqual(this.deviceModel, deviceMetadata.deviceModel) && Intrinsics.areEqual(this.deviceManufacturer, deviceMetadata.deviceManufacturer) && Intrinsics.areEqual(this.deviceType, deviceMetadata.deviceType) && Float.compare(this.deviceMemory, deviceMetadata.deviceMemory) == 0 && Intrinsics.areEqual(this.timeZone, deviceMetadata.timeZone) && this.timeZoneOffset == deviceMetadata.timeZoneOffset && Intrinsics.areEqual(this.language, deviceMetadata.language) && Intrinsics.areEqual(this.deviceArchitecture, deviceMetadata.deviceArchitecture) && Intrinsics.areEqual(this.network, deviceMetadata.network) && Intrinsics.areEqual(this.battery, deviceMetadata.battery) && Intrinsics.areEqual(this.applicationType, deviceMetadata.applicationType) && Intrinsics.areEqual(this.deviceContext, deviceMetadata.deviceContext) && Intrinsics.areEqual(this.androidAttributes, deviceMetadata.androidAttributes);
    }

    public final AndroidAttributes getAndroidAttributes() {
        return this.androidAttributes;
    }

    public final String getApplicationType() {
        return this.applicationType;
    }

    public final Battery getBattery() {
        return this.battery;
    }

    public final String getDeviceArchitecture() {
        return this.deviceArchitecture;
    }

    public final String getDeviceContext() {
        return this.deviceContext;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final float getDeviceMemory() {
        return this.deviceMemory;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final DeviceNetwork getNetwork() {
        return this.network;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final int getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public int hashCode() {
        return this.androidAttributes.hashCode() + a.a(this.deviceContext, a.a(this.applicationType, (this.battery.hashCode() + ((this.network.hashCode() + a.a(this.deviceArchitecture, a.a(this.language, (Integer.hashCode(this.timeZoneOffset) + a.a(this.timeZone, (Float.hashCode(this.deviceMemory) + a.a(this.deviceType, a.a(this.deviceManufacturer, a.a(this.deviceModel, a.a(this.osVersion, a.a(this.os, a.a(this.platform, this.sdkVersion.hashCode() * 31, 31), 31), 31), 31), 31), 31)) * 31, 31)) * 31, 31), 31)) * 31)) * 31, 31), 31);
    }

    public String toString() {
        return "DeviceMetadata(sdkVersion=" + this.sdkVersion + ", platform=" + this.platform + ", os=" + this.os + ", osVersion=" + this.osVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", deviceType=" + this.deviceType + ", deviceMemory=" + this.deviceMemory + ", timeZone=" + this.timeZone + ", timeZoneOffset=" + this.timeZoneOffset + ", language=" + this.language + ", deviceArchitecture=" + this.deviceArchitecture + ", network=" + this.network + ", battery=" + this.battery + ", applicationType=" + this.applicationType + ", deviceContext=" + this.deviceContext + ", androidAttributes=" + this.androidAttributes + ")";
    }

    public /* synthetic */ DeviceMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, float f, String str8, int i, String str9, String str10, DeviceNetwork deviceNetwork, Battery battery, String str11, String str12, AndroidAttributes androidAttributes, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "android" : str2, (i2 & 4) != 0 ? "android" : str3, str4, str5, str6, str7, f, str8, i, str9, str10, deviceNetwork, battery, str11, str12, androidAttributes);
    }
}
