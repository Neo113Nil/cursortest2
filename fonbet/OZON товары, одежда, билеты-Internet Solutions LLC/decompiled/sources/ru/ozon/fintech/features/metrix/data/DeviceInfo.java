package ru.ozon.fintech.features.metrix.data;

import Am.C2438a;
import B0.C2454a;
import Ds.C2880a;
import G.g;
import K00.b;
import Kk.C3532b;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/features/metrix/data/DeviceInfo;", "", "battery", "", "cpu", "deviceModel", "", "prefetched", "", "ram", "<init>", "(IILjava/lang/String;ZI)V", "getBattery", "()I", "getCpu", "getDeviceModel", "()Ljava/lang/String;", "getPrefetched", "()Z", "getRam", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DeviceInfo {

    @i(name = "battery")
    private final int battery;

    @i(name = "cpu")
    private final int cpu;

    @i(name = "device_model")
    @NotNull
    private final String deviceModel;

    @i(name = "prefetched")
    private final boolean prefetched;

    @i(name = "ram")
    private final int ram;

    public DeviceInfo(int i11, int i12, @NotNull String deviceModel, boolean z11, int i13) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.battery = i11;
        this.cpu = i12;
        this.deviceModel = deviceModel;
        this.prefetched = z11;
        this.ram = i13;
    }

    public static /* synthetic */ DeviceInfo copy$default(DeviceInfo deviceInfo, int i11, int i12, String str, boolean z11, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = deviceInfo.battery;
        }
        if ((i14 & 2) != 0) {
            i12 = deviceInfo.cpu;
        }
        if ((i14 & 4) != 0) {
            str = deviceInfo.deviceModel;
        }
        if ((i14 & 8) != 0) {
            z11 = deviceInfo.prefetched;
        }
        if ((i14 & 16) != 0) {
            i13 = deviceInfo.ram;
        }
        int i15 = i13;
        String str2 = str;
        return deviceInfo.copy(i11, i12, str2, z11, i15);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBattery() {
        return this.battery;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCpu() {
        return this.cpu;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPrefetched() {
        return this.prefetched;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRam() {
        return this.ram;
    }

    @NotNull
    public final DeviceInfo copy(int battery, int cpu, @NotNull String deviceModel, boolean prefetched, int ram) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new DeviceInfo(battery, cpu, deviceModel, prefetched, ram);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return this.battery == deviceInfo.battery && this.cpu == deviceInfo.cpu && Intrinsics.d(this.deviceModel, deviceInfo.deviceModel) && this.prefetched == deviceInfo.prefetched && this.ram == deviceInfo.ram;
    }

    public final int getBattery() {
        return this.battery;
    }

    public final int getCpu() {
        return this.cpu;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final boolean getPrefetched() {
        return this.prefetched;
    }

    public final int getRam() {
        return this.ram;
    }

    public int hashCode() {
        return Integer.hashCode(this.ram) + C3532b.a(g.a(C2454a.a(this.cpu, Integer.hashCode(this.battery) * 31, 31), 31, this.deviceModel), 31, this.prefetched);
    }

    @NotNull
    public String toString() {
        int i11 = this.battery;
        int i12 = this.cpu;
        String str = this.deviceModel;
        boolean z11 = this.prefetched;
        int i13 = this.ram;
        StringBuilder a11 = C2438a.a("DeviceInfo(battery=", i11, ", cpu=", ", deviceModel=", i12);
        C2880a.c(str, ", prefetched=", ", ram=", a11, z11);
        return b.e(i13, ")", a11);
    }
}
