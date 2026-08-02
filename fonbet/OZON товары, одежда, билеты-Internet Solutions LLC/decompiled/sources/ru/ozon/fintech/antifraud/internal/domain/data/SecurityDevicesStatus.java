package ru.ozon.fintech.antifraud.internal.domain.data;

import B0.C2454a;
import G.g;
import N3.C3660k;
import android.os.Build;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.antifraud.internal.models.DeviceStatus;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/fintech/antifraud/internal/domain/data/SecurityDevicesStatus;", "", "app", "", "appVersion", "os", "jsonVersion", "", "osver", "deviceStatus", "Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;)V", "getApp", "()Ljava/lang/String;", "getAppVersion", "getOs", "getJsonVersion", "()I", "getOsver", "getDeviceStatus", "()Lru/ozon/fintech/antifraud/internal/models/DeviceStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "internal_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SecurityDevicesStatus {

    @i(name = "app")
    @NotNull
    private final String app;

    @i(name = "appver")
    @NotNull
    private final String appVersion;

    @i(name = "data")
    @NotNull
    private final DeviceStatus deviceStatus;

    @i(name = "ver")
    private final int jsonVersion;

    @i(name = "os")
    @NotNull
    private final String os;

    @i(name = "osver")
    @NotNull
    private final String osver;

    public SecurityDevicesStatus(@NotNull String app, @NotNull String appVersion, @NotNull String os, int i11, @NotNull String osver, @NotNull DeviceStatus deviceStatus) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osver, "osver");
        Intrinsics.checkNotNullParameter(deviceStatus, "deviceStatus");
        this.app = app;
        this.appVersion = appVersion;
        this.os = os;
        this.jsonVersion = i11;
        this.osver = osver;
        this.deviceStatus = deviceStatus;
    }

    public static /* synthetic */ SecurityDevicesStatus copy$default(SecurityDevicesStatus securityDevicesStatus, String str, String str2, String str3, int i11, String str4, DeviceStatus deviceStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = securityDevicesStatus.app;
        }
        if ((i12 & 2) != 0) {
            str2 = securityDevicesStatus.appVersion;
        }
        if ((i12 & 4) != 0) {
            str3 = securityDevicesStatus.os;
        }
        if ((i12 & 8) != 0) {
            i11 = securityDevicesStatus.jsonVersion;
        }
        if ((i12 & 16) != 0) {
            str4 = securityDevicesStatus.osver;
        }
        if ((i12 & 32) != 0) {
            deviceStatus = securityDevicesStatus.deviceStatus;
        }
        String str5 = str4;
        DeviceStatus deviceStatus2 = deviceStatus;
        return securityDevicesStatus.copy(str, str2, str3, i11, str5, deviceStatus2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component4, reason: from getter */
    public final int getJsonVersion() {
        return this.jsonVersion;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getOsver() {
        return this.osver;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final DeviceStatus getDeviceStatus() {
        return this.deviceStatus;
    }

    @NotNull
    public final SecurityDevicesStatus copy(@NotNull String app, @NotNull String appVersion, @NotNull String os, int jsonVersion, @NotNull String osver, @NotNull DeviceStatus deviceStatus) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osver, "osver");
        Intrinsics.checkNotNullParameter(deviceStatus, "deviceStatus");
        return new SecurityDevicesStatus(app, appVersion, os, jsonVersion, osver, deviceStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityDevicesStatus)) {
            return false;
        }
        SecurityDevicesStatus securityDevicesStatus = (SecurityDevicesStatus) other;
        return Intrinsics.d(this.app, securityDevicesStatus.app) && Intrinsics.d(this.appVersion, securityDevicesStatus.appVersion) && Intrinsics.d(this.os, securityDevicesStatus.os) && this.jsonVersion == securityDevicesStatus.jsonVersion && Intrinsics.d(this.osver, securityDevicesStatus.osver) && Intrinsics.d(this.deviceStatus, securityDevicesStatus.deviceStatus);
    }

    @NotNull
    public final String getApp() {
        return this.app;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final DeviceStatus getDeviceStatus() {
        return this.deviceStatus;
    }

    public final int getJsonVersion() {
        return this.jsonVersion;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsver() {
        return this.osver;
    }

    public int hashCode() {
        return this.deviceStatus.hashCode() + g.a(C2454a.a(this.jsonVersion, g.a(g.a(this.app.hashCode() * 31, 31, this.appVersion), 31, this.os), 31), 31, this.osver);
    }

    @NotNull
    public String toString() {
        String str = this.app;
        String str2 = this.appVersion;
        String str3 = this.os;
        int i11 = this.jsonVersion;
        String str4 = this.osver;
        DeviceStatus deviceStatus = this.deviceStatus;
        StringBuilder d11 = C3660k.d("SecurityDevicesStatus(app=", str, ", appVersion=", str2, ", os=");
        Pk0.g.d(i11, str3, ", jsonVersion=", ", osver=", d11);
        d11.append(str4);
        d11.append(", deviceStatus=");
        d11.append(deviceStatus);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ SecurityDevicesStatus(String str, String str2, String str3, int i11, String str4, DeviceStatus deviceStatus, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? "android" : str3, (i12 & 8) != 0 ? 11 : i11, (i12 & 16) != 0 ? Build.VERSION.RELEASE : str4, deviceStatus);
    }
}
