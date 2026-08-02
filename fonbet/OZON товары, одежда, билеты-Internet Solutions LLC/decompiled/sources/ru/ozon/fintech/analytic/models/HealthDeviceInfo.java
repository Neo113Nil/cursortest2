package ru.ozon.fintech.analytic.models;

import Bk.C2638a;
import De.C2860c;
import G.g;
import Nh.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b<\b\u0081\b\u0018\u0000 S2\u00020\u0001:\u0001TBÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b-\u0010'J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010 J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b/\u0010 J\u0012\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b0\u0010)J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001eJ\u0012\u00102\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b2\u00103Jè\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001eJ\u0010\u00107\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020\r2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b@\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bA\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bB\u0010\u001eR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010G\u001a\u0004\bI\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bL\u0010'R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\bM\u0010 R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010>\u001a\u0004\bN\u0010 R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bO\u0010)R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010<\u001a\u0004\bP\u0010\u001eR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\bR\u00103¨\u0006U"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "", "", "os", "", "", "osVer", "vendor", "model", "modelCode", "", "deviceId", "battery", "", "lowEnergyMode", "lockdownMode", "Lru/ozon/fintech/analytic/models/HealthRam;", "ram", "cpuCount", "", "cpuFreq", "Lru/ozon/fintech/analytic/models/HealthDisk;", "disks", "bluetooth", "language", "Lru/ozon/fintech/analytic/models/HealthLocation;", "geolocation", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/fintech/analytic/models/HealthRam;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/fintech/analytic/models/HealthLocation;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "()Ljava/lang/Integer;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "()Lru/ozon/fintech/analytic/models/HealthRam;", "component11", "component12", "component13", "component14", "component15", "component16", "()Lru/ozon/fintech/analytic/models/HealthLocation;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/ozon/fintech/analytic/models/HealthRam;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/fintech/analytic/models/HealthLocation;)Lru/ozon/fintech/analytic/models/HealthDeviceInfo;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOs", "Ljava/util/List;", "getOsVer", "getVendor", "getModel", "getModelCode", "Ljava/util/Map;", "getDeviceId", "Ljava/lang/Integer;", "getBattery", "Ljava/lang/Boolean;", "getLowEnergyMode", "getLockdownMode", "Lru/ozon/fintech/analytic/models/HealthRam;", "getRam", "getCpuCount", "getCpuFreq", "getDisks", "getBluetooth", "getLanguage", "Lru/ozon/fintech/analytic/models/HealthLocation;", "getGeolocation", "Companion", "a", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthDeviceInfo {

    @i(name = "battery")
    private final Integer battery;

    @i(name = "bluetooth")
    private final Boolean bluetooth;

    @i(name = "cpu_count")
    private final Integer cpuCount;

    @i(name = "cpu_freq")
    private final List<Double> cpuFreq;

    @i(name = "device_id")
    private final Map<String, String> deviceId;

    @i(name = "disks")
    private final List<HealthDisk> disks;

    @i(name = "geolocation")
    private final HealthLocation geolocation;

    @i(name = "language")
    private final String language;

    @i(name = "lockdown_mode")
    private final Boolean lockdownMode;

    @i(name = "low_energy_mode")
    private final Boolean lowEnergyMode;

    @i(name = "model")
    private final String model;

    @i(name = "model_code")
    @NotNull
    private final String modelCode;

    @i(name = "os")
    @NotNull
    private final String os;

    @i(name = "os_ver")
    @NotNull
    private final List<Integer> osVer;

    @i(name = "ram")
    private final HealthRam ram;

    @i(name = "vendor")
    private final String vendor;

    public HealthDeviceInfo(@NotNull String os, @NotNull List<Integer> osVer, String str, String str2, @NotNull String modelCode, Map<String, String> map, Integer num, Boolean bool, Boolean bool2, HealthRam healthRam, Integer num2, List<Double> list, List<HealthDisk> list2, Boolean bool3, String str3, HealthLocation healthLocation) {
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVer, "osVer");
        Intrinsics.checkNotNullParameter(modelCode, "modelCode");
        this.os = os;
        this.osVer = osVer;
        this.vendor = str;
        this.model = str2;
        this.modelCode = modelCode;
        this.deviceId = map;
        this.battery = num;
        this.lowEnergyMode = bool;
        this.lockdownMode = bool2;
        this.ram = healthRam;
        this.cpuCount = num2;
        this.cpuFreq = list;
        this.disks = list2;
        this.bluetooth = bool3;
        this.language = str3;
        this.geolocation = healthLocation;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: component10, reason: from getter */
    public final HealthRam getRam() {
        return this.ram;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getCpuCount() {
        return this.cpuCount;
    }

    public final List<Double> component12() {
        return this.cpuFreq;
    }

    public final List<HealthDisk> component13() {
        return this.disks;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getBluetooth() {
        return this.bluetooth;
    }

    /* renamed from: component15, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* renamed from: component16, reason: from getter */
    public final HealthLocation getGeolocation() {
        return this.geolocation;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.osVer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getModelCode() {
        return this.modelCode;
    }

    public final Map<String, String> component6() {
        return this.deviceId;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getBattery() {
        return this.battery;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getLowEnergyMode() {
        return this.lowEnergyMode;
    }

    /* renamed from: component9, reason: from getter */
    public final Boolean getLockdownMode() {
        return this.lockdownMode;
    }

    @NotNull
    public final HealthDeviceInfo copy(@NotNull String os, @NotNull List<Integer> osVer, String vendor, String model, @NotNull String modelCode, Map<String, String> deviceId, Integer battery, Boolean lowEnergyMode, Boolean lockdownMode, HealthRam ram, Integer cpuCount, List<Double> cpuFreq, List<HealthDisk> disks, Boolean bluetooth, String language, HealthLocation geolocation) {
        Intrinsics.checkNotNullParameter(os, "os");
        Intrinsics.checkNotNullParameter(osVer, "osVer");
        Intrinsics.checkNotNullParameter(modelCode, "modelCode");
        return new HealthDeviceInfo(os, osVer, vendor, model, modelCode, deviceId, battery, lowEnergyMode, lockdownMode, ram, cpuCount, cpuFreq, disks, bluetooth, language, geolocation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDeviceInfo)) {
            return false;
        }
        HealthDeviceInfo healthDeviceInfo = (HealthDeviceInfo) other;
        return Intrinsics.d(this.os, healthDeviceInfo.os) && Intrinsics.d(this.osVer, healthDeviceInfo.osVer) && Intrinsics.d(this.vendor, healthDeviceInfo.vendor) && Intrinsics.d(this.model, healthDeviceInfo.model) && Intrinsics.d(this.modelCode, healthDeviceInfo.modelCode) && Intrinsics.d(this.deviceId, healthDeviceInfo.deviceId) && Intrinsics.d(this.battery, healthDeviceInfo.battery) && Intrinsics.d(this.lowEnergyMode, healthDeviceInfo.lowEnergyMode) && Intrinsics.d(this.lockdownMode, healthDeviceInfo.lockdownMode) && Intrinsics.d(this.ram, healthDeviceInfo.ram) && Intrinsics.d(this.cpuCount, healthDeviceInfo.cpuCount) && Intrinsics.d(this.cpuFreq, healthDeviceInfo.cpuFreq) && Intrinsics.d(this.disks, healthDeviceInfo.disks) && Intrinsics.d(this.bluetooth, healthDeviceInfo.bluetooth) && Intrinsics.d(this.language, healthDeviceInfo.language) && Intrinsics.d(this.geolocation, healthDeviceInfo.geolocation);
    }

    public final Integer getBattery() {
        return this.battery;
    }

    public final Boolean getBluetooth() {
        return this.bluetooth;
    }

    public final Integer getCpuCount() {
        return this.cpuCount;
    }

    public final List<Double> getCpuFreq() {
        return this.cpuFreq;
    }

    public final Map<String, String> getDeviceId() {
        return this.deviceId;
    }

    public final List<HealthDisk> getDisks() {
        return this.disks;
    }

    public final HealthLocation getGeolocation() {
        return this.geolocation;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Boolean getLockdownMode() {
        return this.lockdownMode;
    }

    public final Boolean getLowEnergyMode() {
        return this.lowEnergyMode;
    }

    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getModelCode() {
        return this.modelCode;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final List<Integer> getOsVer() {
        return this.osVer;
    }

    public final HealthRam getRam() {
        return this.ram;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        int b11 = g.b(this.os.hashCode() * 31, 31, this.osVer);
        String str = this.vendor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.model;
        int a11 = g.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.modelCode);
        Map<String, String> map = this.deviceId;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.battery;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.lowEnergyMode;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.lockdownMode;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        HealthRam healthRam = this.ram;
        int hashCode6 = (hashCode5 + (healthRam == null ? 0 : healthRam.hashCode())) * 31;
        Integer num2 = this.cpuCount;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Double> list = this.cpuFreq;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<HealthDisk> list2 = this.disks;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool3 = this.bluetooth;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.language;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        HealthLocation healthLocation = this.geolocation;
        return hashCode11 + (healthLocation != null ? healthLocation.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.os;
        List<Integer> list = this.osVer;
        String str2 = this.vendor;
        String str3 = this.model;
        String str4 = this.modelCode;
        Map<String, String> map = this.deviceId;
        Integer num = this.battery;
        Boolean bool = this.lowEnergyMode;
        Boolean bool2 = this.lockdownMode;
        HealthRam healthRam = this.ram;
        Integer num2 = this.cpuCount;
        List<Double> list2 = this.cpuFreq;
        List<HealthDisk> list3 = this.disks;
        Boolean bool3 = this.bluetooth;
        String str5 = this.language;
        HealthLocation healthLocation = this.geolocation;
        StringBuilder f7 = b.f("HealthDeviceInfo(os=", str, ", osVer=", ", vendor=", list);
        a.h(f7, str2, ", model=", str3, ", modelCode=");
        C2638a.e(f7, str4, ", deviceId=", map, ", battery=");
        C2860c.f(bool, num, ", lowEnergyMode=", ", lockdownMode=", f7);
        f7.append(bool2);
        f7.append(", ram=");
        f7.append(healthRam);
        f7.append(", cpuCount=");
        f7.append(num2);
        f7.append(", cpuFreq=");
        f7.append(list2);
        f7.append(", disks=");
        f7.append(list3);
        f7.append(", bluetooth=");
        f7.append(bool3);
        f7.append(", language=");
        f7.append(str5);
        f7.append(", geolocation=");
        f7.append(healthLocation);
        f7.append(")");
        return f7.toString();
    }

    public /* synthetic */ HealthDeviceInfo(String str, List list, String str2, String str3, String str4, Map map, Integer num, Boolean bool, Boolean bool2, HealthRam healthRam, Integer num2, List list2, List list3, Boolean bool3, String str5, HealthLocation healthLocation, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, str4, (i11 & 32) != 0 ? U.c() : map, (i11 & 64) != 0 ? null : num, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : bool, (i11 & 256) != 0 ? Boolean.FALSE : bool2, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : healthRam, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : num2, (i11 & 2048) != 0 ? null : list2, (i11 & 4096) != 0 ? null : list3, (i11 & 8192) != 0 ? null : bool3, (i11 & 16384) != 0 ? null : str5, (i11 & 32768) != 0 ? null : healthLocation);
    }
}
