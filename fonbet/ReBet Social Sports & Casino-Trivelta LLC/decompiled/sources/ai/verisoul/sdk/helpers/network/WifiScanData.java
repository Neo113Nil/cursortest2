package ai.verisoul.sdk.helpers.network;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lai/verisoul/sdk/helpers/network/WifiScanData;", "", "ssid", "", "bssid", "rssi", "", "frequency", "(Ljava/lang/String;Ljava/lang/String;II)V", "getBssid", "()Ljava/lang/String;", "getFrequency", "()I", "getRssi", "getSsid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WifiScanData {

    @c("bssid")
    @NotNull
    private final String bssid;

    @c("frequency")
    private final int frequency;

    @c("rssi")
    private final int rssi;

    @c("ssid")
    @NotNull
    private final String ssid;

    public WifiScanData(@NotNull String ssid, @NotNull String bssid, int i10, int i11) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(bssid, "bssid");
        this.ssid = ssid;
        this.bssid = bssid;
        this.rssi = i10;
        this.frequency = i11;
    }

    public static /* synthetic */ WifiScanData copy$default(WifiScanData wifiScanData, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = wifiScanData.ssid;
        }
        if ((i12 & 2) != 0) {
            str2 = wifiScanData.bssid;
        }
        if ((i12 & 4) != 0) {
            i10 = wifiScanData.rssi;
        }
        if ((i12 & 8) != 0) {
            i11 = wifiScanData.frequency;
        }
        return wifiScanData.copy(str, str2, i10, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSsid() {
        return this.ssid;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBssid() {
        return this.bssid;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    @NotNull
    public final WifiScanData copy(@NotNull String ssid, @NotNull String bssid, int rssi, int frequency) {
        Intrinsics.checkNotNullParameter(ssid, "ssid");
        Intrinsics.checkNotNullParameter(bssid, "bssid");
        return new WifiScanData(ssid, bssid, rssi, frequency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WifiScanData)) {
            return false;
        }
        WifiScanData wifiScanData = (WifiScanData) other;
        return Intrinsics.areEqual(this.ssid, wifiScanData.ssid) && Intrinsics.areEqual(this.bssid, wifiScanData.bssid) && this.rssi == wifiScanData.rssi && this.frequency == wifiScanData.frequency;
    }

    @NotNull
    public final String getBssid() {
        return this.bssid;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final int getRssi() {
        return this.rssi;
    }

    @NotNull
    public final String getSsid() {
        return this.ssid;
    }

    public int hashCode() {
        return (((((this.ssid.hashCode() * 31) + this.bssid.hashCode()) * 31) + Integer.hashCode(this.rssi)) * 31) + Integer.hashCode(this.frequency);
    }

    @NotNull
    public String toString() {
        return "WifiScanData(ssid=" + this.ssid + ", bssid=" + this.bssid + ", rssi=" + this.rssi + ", frequency=" + this.frequency + ")";
    }
}
