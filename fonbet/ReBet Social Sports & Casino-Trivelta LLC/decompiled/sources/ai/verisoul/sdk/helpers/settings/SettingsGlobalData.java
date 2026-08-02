package ai.verisoul.sdk.helpers.settings;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u0080\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u000f\u0010\u001cR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00062"}, d2 = {"Lai/verisoul/sdk/helpers/settings/SettingsGlobalData;", "", "adbEnabled", "", "autoTime", "autoTimeZone", "bluetoothOn", "bootCount", "dataRoaming", "developmentSettingsEnabled", "httpProxy", "", "transitionAnimationScale", "", "windowAnimationScale", "isNetworkRoaming", "", "(IIIIIIILjava/lang/String;FFLjava/lang/Boolean;)V", "getAdbEnabled", "()I", "getAutoTime", "getAutoTimeZone", "getBluetoothOn", "getBootCount", "getDataRoaming", "getDevelopmentSettingsEnabled", "getHttpProxy", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTransitionAnimationScale", "()F", "getWindowAnimationScale", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIIIIILjava/lang/String;FFLjava/lang/Boolean;)Lai/verisoul/sdk/helpers/settings/SettingsGlobalData;", "equals", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SettingsGlobalData {

    @c("adbEnabled")
    private final int adbEnabled;

    @c("autoTime")
    private final int autoTime;

    @c("autoTimeZone")
    private final int autoTimeZone;

    @c("bluetoothOn")
    private final int bluetoothOn;

    @c("bootCount")
    private final int bootCount;

    @c("dataRoaming")
    private final int dataRoaming;

    @c("developmentSettingsEnabled")
    private final int developmentSettingsEnabled;

    @c("httpProxy")
    @Nullable
    private final String httpProxy;

    @c("isNetworkRoaming")
    @Nullable
    private final Boolean isNetworkRoaming;

    @c("transitionAnimationScale")
    private final float transitionAnimationScale;

    @c("windowAnimationScale")
    private final float windowAnimationScale;

    public SettingsGlobalData(int i10, int i11, int i12, int i13, int i14, int i15, int i16, @Nullable String str, float f10, float f11, @Nullable Boolean bool) {
        this.adbEnabled = i10;
        this.autoTime = i11;
        this.autoTimeZone = i12;
        this.bluetoothOn = i13;
        this.bootCount = i14;
        this.dataRoaming = i15;
        this.developmentSettingsEnabled = i16;
        this.httpProxy = str;
        this.transitionAnimationScale = f10;
        this.windowAnimationScale = f11;
        this.isNetworkRoaming = bool;
    }

    public static /* synthetic */ SettingsGlobalData copy$default(SettingsGlobalData settingsGlobalData, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, float f10, float f11, Boolean bool, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i10 = settingsGlobalData.adbEnabled;
        }
        if ((i17 & 2) != 0) {
            i11 = settingsGlobalData.autoTime;
        }
        if ((i17 & 4) != 0) {
            i12 = settingsGlobalData.autoTimeZone;
        }
        if ((i17 & 8) != 0) {
            i13 = settingsGlobalData.bluetoothOn;
        }
        if ((i17 & 16) != 0) {
            i14 = settingsGlobalData.bootCount;
        }
        if ((i17 & 32) != 0) {
            i15 = settingsGlobalData.dataRoaming;
        }
        if ((i17 & 64) != 0) {
            i16 = settingsGlobalData.developmentSettingsEnabled;
        }
        if ((i17 & 128) != 0) {
            str = settingsGlobalData.httpProxy;
        }
        if ((i17 & 256) != 0) {
            f10 = settingsGlobalData.transitionAnimationScale;
        }
        if ((i17 & 512) != 0) {
            f11 = settingsGlobalData.windowAnimationScale;
        }
        if ((i17 & 1024) != 0) {
            bool = settingsGlobalData.isNetworkRoaming;
        }
        float f12 = f11;
        Boolean bool2 = bool;
        String str2 = str;
        float f13 = f10;
        int i18 = i15;
        int i19 = i16;
        int i20 = i14;
        int i21 = i12;
        return settingsGlobalData.copy(i10, i11, i21, i13, i20, i18, i19, str2, f13, f12, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAdbEnabled() {
        return this.adbEnabled;
    }

    /* renamed from: component10, reason: from getter */
    public final float getWindowAnimationScale() {
        return this.windowAnimationScale;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Boolean getIsNetworkRoaming() {
        return this.isNetworkRoaming;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAutoTime() {
        return this.autoTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAutoTimeZone() {
        return this.autoTimeZone;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBluetoothOn() {
        return this.bluetoothOn;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBootCount() {
        return this.bootCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDataRoaming() {
        return this.dataRoaming;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDevelopmentSettingsEnabled() {
        return this.developmentSettingsEnabled;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getHttpProxy() {
        return this.httpProxy;
    }

    /* renamed from: component9, reason: from getter */
    public final float getTransitionAnimationScale() {
        return this.transitionAnimationScale;
    }

    @NotNull
    public final SettingsGlobalData copy(int adbEnabled, int autoTime, int autoTimeZone, int bluetoothOn, int bootCount, int dataRoaming, int developmentSettingsEnabled, @Nullable String httpProxy, float transitionAnimationScale, float windowAnimationScale, @Nullable Boolean isNetworkRoaming) {
        return new SettingsGlobalData(adbEnabled, autoTime, autoTimeZone, bluetoothOn, bootCount, dataRoaming, developmentSettingsEnabled, httpProxy, transitionAnimationScale, windowAnimationScale, isNetworkRoaming);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsGlobalData)) {
            return false;
        }
        SettingsGlobalData settingsGlobalData = (SettingsGlobalData) other;
        return this.adbEnabled == settingsGlobalData.adbEnabled && this.autoTime == settingsGlobalData.autoTime && this.autoTimeZone == settingsGlobalData.autoTimeZone && this.bluetoothOn == settingsGlobalData.bluetoothOn && this.bootCount == settingsGlobalData.bootCount && this.dataRoaming == settingsGlobalData.dataRoaming && this.developmentSettingsEnabled == settingsGlobalData.developmentSettingsEnabled && Intrinsics.areEqual(this.httpProxy, settingsGlobalData.httpProxy) && Float.compare(this.transitionAnimationScale, settingsGlobalData.transitionAnimationScale) == 0 && Float.compare(this.windowAnimationScale, settingsGlobalData.windowAnimationScale) == 0 && Intrinsics.areEqual(this.isNetworkRoaming, settingsGlobalData.isNetworkRoaming);
    }

    public final int getAdbEnabled() {
        return this.adbEnabled;
    }

    public final int getAutoTime() {
        return this.autoTime;
    }

    public final int getAutoTimeZone() {
        return this.autoTimeZone;
    }

    public final int getBluetoothOn() {
        return this.bluetoothOn;
    }

    public final int getBootCount() {
        return this.bootCount;
    }

    public final int getDataRoaming() {
        return this.dataRoaming;
    }

    public final int getDevelopmentSettingsEnabled() {
        return this.developmentSettingsEnabled;
    }

    @Nullable
    public final String getHttpProxy() {
        return this.httpProxy;
    }

    public final float getTransitionAnimationScale() {
        return this.transitionAnimationScale;
    }

    public final float getWindowAnimationScale() {
        return this.windowAnimationScale;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.adbEnabled) * 31) + Integer.hashCode(this.autoTime)) * 31) + Integer.hashCode(this.autoTimeZone)) * 31) + Integer.hashCode(this.bluetoothOn)) * 31) + Integer.hashCode(this.bootCount)) * 31) + Integer.hashCode(this.dataRoaming)) * 31) + Integer.hashCode(this.developmentSettingsEnabled)) * 31;
        String str = this.httpProxy;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.transitionAnimationScale)) * 31) + Float.hashCode(this.windowAnimationScale)) * 31;
        Boolean bool = this.isNetworkRoaming;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNetworkRoaming() {
        return this.isNetworkRoaming;
    }

    @NotNull
    public String toString() {
        return "SettingsGlobalData(adbEnabled=" + this.adbEnabled + ", autoTime=" + this.autoTime + ", autoTimeZone=" + this.autoTimeZone + ", bluetoothOn=" + this.bluetoothOn + ", bootCount=" + this.bootCount + ", dataRoaming=" + this.dataRoaming + ", developmentSettingsEnabled=" + this.developmentSettingsEnabled + ", httpProxy=" + this.httpProxy + ", transitionAnimationScale=" + this.transitionAnimationScale + ", windowAnimationScale=" + this.windowAnimationScale + ", isNetworkRoaming=" + this.isNetworkRoaming + ")";
    }
}
