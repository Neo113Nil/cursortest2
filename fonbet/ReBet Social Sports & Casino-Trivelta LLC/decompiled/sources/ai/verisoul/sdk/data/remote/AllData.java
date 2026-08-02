package ai.verisoul.sdk.data.remote;

import Gb.c;
import ai.verisoul.sdk.helpers.app_clone.AppCloningData;
import ai.verisoul.sdk.helpers.app_set_id.AppSetIdData;
import ai.verisoul.sdk.helpers.device.DeviceData;
import ai.verisoul.sdk.helpers.emulator.EmulatorDetectionData;
import ai.verisoul.sdk.helpers.location.LocationData;
import ai.verisoul.sdk.helpers.network.NetworkData;
import ai.verisoul.sdk.helpers.settings.SettingsData;
import ai.verisoul.sdk.helpers.webview.WebViewData;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jo\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u000209HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006:"}, d2 = {"Lai/verisoul/sdk/data/remote/AllData;", "", "webViewData", "Lai/verisoul/sdk/helpers/webview/WebViewData;", "networkData", "Lai/verisoul/sdk/helpers/network/NetworkData;", "locationData", "Lai/verisoul/sdk/helpers/location/LocationData;", "deviceData", "Lai/verisoul/sdk/helpers/device/DeviceData;", "settingsData", "Lai/verisoul/sdk/helpers/settings/SettingsData;", "appCloningData", "Lai/verisoul/sdk/helpers/app_clone/AppCloningData;", "emulatorData", "Lai/verisoul/sdk/helpers/emulator/EmulatorDetectionData;", "appSetIdData", "Lai/verisoul/sdk/helpers/app_set_id/AppSetIdData;", "sdkInfo", "Lai/verisoul/sdk/data/remote/SDKInfo;", "(Lai/verisoul/sdk/helpers/webview/WebViewData;Lai/verisoul/sdk/helpers/network/NetworkData;Lai/verisoul/sdk/helpers/location/LocationData;Lai/verisoul/sdk/helpers/device/DeviceData;Lai/verisoul/sdk/helpers/settings/SettingsData;Lai/verisoul/sdk/helpers/app_clone/AppCloningData;Lai/verisoul/sdk/helpers/emulator/EmulatorDetectionData;Lai/verisoul/sdk/helpers/app_set_id/AppSetIdData;Lai/verisoul/sdk/data/remote/SDKInfo;)V", "getAppCloningData", "()Lai/verisoul/sdk/helpers/app_clone/AppCloningData;", "getAppSetIdData", "()Lai/verisoul/sdk/helpers/app_set_id/AppSetIdData;", "getDeviceData", "()Lai/verisoul/sdk/helpers/device/DeviceData;", "getEmulatorData", "()Lai/verisoul/sdk/helpers/emulator/EmulatorDetectionData;", "getLocationData", "()Lai/verisoul/sdk/helpers/location/LocationData;", "getNetworkData", "()Lai/verisoul/sdk/helpers/network/NetworkData;", "getSdkInfo", "()Lai/verisoul/sdk/data/remote/SDKInfo;", "getSettingsData", "()Lai/verisoul/sdk/helpers/settings/SettingsData;", "getWebViewData", "()Lai/verisoul/sdk/helpers/webview/WebViewData;", "setWebViewData", "(Lai/verisoul/sdk/helpers/webview/WebViewData;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AllData {

    @c("appCloningData")
    @Nullable
    private final AppCloningData appCloningData;

    @c("appSetIdData")
    @Nullable
    private final AppSetIdData appSetIdData;

    @c("deviceData")
    @NotNull
    private final DeviceData deviceData;

    @c("emulatorData")
    @NotNull
    private final EmulatorDetectionData emulatorData;

    @c("locationData")
    @Nullable
    private final LocationData locationData;

    @c("networkData")
    @Nullable
    private final NetworkData networkData;

    @c("sdk_info")
    @Nullable
    private final SDKInfo sdkInfo;

    @c("settingsData")
    @NotNull
    private final SettingsData settingsData;

    @c("webViewData")
    @Nullable
    private WebViewData webViewData;

    public AllData(@Nullable WebViewData webViewData, @Nullable NetworkData networkData, @Nullable LocationData locationData, @NotNull DeviceData deviceData, @NotNull SettingsData settingsData, @Nullable AppCloningData appCloningData, @NotNull EmulatorDetectionData emulatorData, @Nullable AppSetIdData appSetIdData, @Nullable SDKInfo sDKInfo) {
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        Intrinsics.checkNotNullParameter(emulatorData, "emulatorData");
        this.webViewData = webViewData;
        this.networkData = networkData;
        this.locationData = locationData;
        this.deviceData = deviceData;
        this.settingsData = settingsData;
        this.appCloningData = appCloningData;
        this.emulatorData = emulatorData;
        this.appSetIdData = appSetIdData;
        this.sdkInfo = sDKInfo;
    }

    public static /* synthetic */ AllData copy$default(AllData allData, WebViewData webViewData, NetworkData networkData, LocationData locationData, DeviceData deviceData, SettingsData settingsData, AppCloningData appCloningData, EmulatorDetectionData emulatorDetectionData, AppSetIdData appSetIdData, SDKInfo sDKInfo, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            webViewData = allData.webViewData;
        }
        if ((i10 & 2) != 0) {
            networkData = allData.networkData;
        }
        if ((i10 & 4) != 0) {
            locationData = allData.locationData;
        }
        if ((i10 & 8) != 0) {
            deviceData = allData.deviceData;
        }
        if ((i10 & 16) != 0) {
            settingsData = allData.settingsData;
        }
        if ((i10 & 32) != 0) {
            appCloningData = allData.appCloningData;
        }
        if ((i10 & 64) != 0) {
            emulatorDetectionData = allData.emulatorData;
        }
        if ((i10 & 128) != 0) {
            appSetIdData = allData.appSetIdData;
        }
        if ((i10 & 256) != 0) {
            sDKInfo = allData.sdkInfo;
        }
        AppSetIdData appSetIdData2 = appSetIdData;
        SDKInfo sDKInfo2 = sDKInfo;
        AppCloningData appCloningData2 = appCloningData;
        EmulatorDetectionData emulatorDetectionData2 = emulatorDetectionData;
        SettingsData settingsData2 = settingsData;
        LocationData locationData2 = locationData;
        return allData.copy(webViewData, networkData, locationData2, deviceData, settingsData2, appCloningData2, emulatorDetectionData2, appSetIdData2, sDKInfo2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final WebViewData getWebViewData() {
        return this.webViewData;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final NetworkData getNetworkData() {
        return this.networkData;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final LocationData getLocationData() {
        return this.locationData;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final DeviceData getDeviceData() {
        return this.deviceData;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final SettingsData getSettingsData() {
        return this.settingsData;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final AppCloningData getAppCloningData() {
        return this.appCloningData;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final EmulatorDetectionData getEmulatorData() {
        return this.emulatorData;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final AppSetIdData getAppSetIdData() {
        return this.appSetIdData;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final SDKInfo getSdkInfo() {
        return this.sdkInfo;
    }

    @NotNull
    public final AllData copy(@Nullable WebViewData webViewData, @Nullable NetworkData networkData, @Nullable LocationData locationData, @NotNull DeviceData deviceData, @NotNull SettingsData settingsData, @Nullable AppCloningData appCloningData, @NotNull EmulatorDetectionData emulatorData, @Nullable AppSetIdData appSetIdData, @Nullable SDKInfo sdkInfo) {
        Intrinsics.checkNotNullParameter(deviceData, "deviceData");
        Intrinsics.checkNotNullParameter(settingsData, "settingsData");
        Intrinsics.checkNotNullParameter(emulatorData, "emulatorData");
        return new AllData(webViewData, networkData, locationData, deviceData, settingsData, appCloningData, emulatorData, appSetIdData, sdkInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllData)) {
            return false;
        }
        AllData allData = (AllData) other;
        return Intrinsics.areEqual(this.webViewData, allData.webViewData) && Intrinsics.areEqual(this.networkData, allData.networkData) && Intrinsics.areEqual(this.locationData, allData.locationData) && Intrinsics.areEqual(this.deviceData, allData.deviceData) && Intrinsics.areEqual(this.settingsData, allData.settingsData) && Intrinsics.areEqual(this.appCloningData, allData.appCloningData) && Intrinsics.areEqual(this.emulatorData, allData.emulatorData) && Intrinsics.areEqual(this.appSetIdData, allData.appSetIdData) && Intrinsics.areEqual(this.sdkInfo, allData.sdkInfo);
    }

    @Nullable
    public final AppCloningData getAppCloningData() {
        return this.appCloningData;
    }

    @Nullable
    public final AppSetIdData getAppSetIdData() {
        return this.appSetIdData;
    }

    @NotNull
    public final DeviceData getDeviceData() {
        return this.deviceData;
    }

    @NotNull
    public final EmulatorDetectionData getEmulatorData() {
        return this.emulatorData;
    }

    @Nullable
    public final LocationData getLocationData() {
        return this.locationData;
    }

    @Nullable
    public final NetworkData getNetworkData() {
        return this.networkData;
    }

    @Nullable
    public final SDKInfo getSdkInfo() {
        return this.sdkInfo;
    }

    @NotNull
    public final SettingsData getSettingsData() {
        return this.settingsData;
    }

    @Nullable
    public final WebViewData getWebViewData() {
        return this.webViewData;
    }

    public int hashCode() {
        WebViewData webViewData = this.webViewData;
        int hashCode = (webViewData == null ? 0 : webViewData.hashCode()) * 31;
        NetworkData networkData = this.networkData;
        int hashCode2 = (hashCode + (networkData == null ? 0 : networkData.hashCode())) * 31;
        LocationData locationData = this.locationData;
        int hashCode3 = (((((hashCode2 + (locationData == null ? 0 : locationData.hashCode())) * 31) + this.deviceData.hashCode()) * 31) + this.settingsData.hashCode()) * 31;
        AppCloningData appCloningData = this.appCloningData;
        int hashCode4 = (((hashCode3 + (appCloningData == null ? 0 : appCloningData.hashCode())) * 31) + this.emulatorData.hashCode()) * 31;
        AppSetIdData appSetIdData = this.appSetIdData;
        int hashCode5 = (hashCode4 + (appSetIdData == null ? 0 : appSetIdData.hashCode())) * 31;
        SDKInfo sDKInfo = this.sdkInfo;
        return hashCode5 + (sDKInfo != null ? sDKInfo.hashCode() : 0);
    }

    public final void setWebViewData(@Nullable WebViewData webViewData) {
        this.webViewData = webViewData;
    }

    @NotNull
    public String toString() {
        return "AllData(webViewData=" + this.webViewData + ", networkData=" + this.networkData + ", locationData=" + this.locationData + ", deviceData=" + this.deviceData + ", settingsData=" + this.settingsData + ", appCloningData=" + this.appCloningData + ", emulatorData=" + this.emulatorData + ", appSetIdData=" + this.appSetIdData + ", sdkInfo=" + this.sdkInfo + ")";
    }
}
