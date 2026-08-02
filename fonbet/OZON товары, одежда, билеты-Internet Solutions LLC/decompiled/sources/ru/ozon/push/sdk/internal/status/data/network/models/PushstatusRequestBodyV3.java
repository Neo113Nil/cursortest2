package ru.ozon.push.sdk.internal.status.data.network.models;

import B0.C2454a;
import G.g;
import Kk.C3532b;
import Nh.a;
import Ql.c;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.PowerSaveState;
import ru.ozon.android.networkinfo.models.ConnectionType;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3;", "", "events", "", "Lru/ozon/push/sdk/internal/status/data/network/models/PushStatusEvent;", "stats", "Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "<init>", "(Ljava/util/List;Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;)V", "getEvents", "()Ljava/util/List;", "getStats", "()Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DeviceStats", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PushstatusRequestBodyV3 {

    @NotNull
    private final List<PushStatusEvent> events;

    @NotNull
    private final DeviceStats stats;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ`\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "", "deviceModel", "", "connectionType", "Lru/ozon/android/networkinfo/models/ConnectionType;", "cellularOperator", "networkProvider", "batteryCharge", "", "isEnergySavingModeEnabled", "", "powerSaveState", "Lru/ozon/android/hardwareinfo/powermanager/PowerSaveState;", "vpnOrProxyEnabled", "<init>", "(Ljava/lang/String;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/String;IZLru/ozon/android/hardwareinfo/powermanager/PowerSaveState;Ljava/lang/Boolean;)V", "getDeviceModel", "()Ljava/lang/String;", "getConnectionType", "()Lru/ozon/android/networkinfo/models/ConnectionType;", "getCellularOperator", "getNetworkProvider", "getBatteryCharge", "()I", "()Z", "getPowerSaveState", "()Lru/ozon/android/hardwareinfo/powermanager/PowerSaveState;", "getVpnOrProxyEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Lru/ozon/android/networkinfo/models/ConnectionType;Ljava/lang/String;Ljava/lang/String;IZLru/ozon/android/hardwareinfo/powermanager/PowerSaveState;Ljava/lang/Boolean;)Lru/ozon/push/sdk/internal/status/data/network/models/PushstatusRequestBodyV3$DeviceStats;", "equals", "other", "hashCode", "toString", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class DeviceStats {
        private final int batteryCharge;

        @NotNull
        private final String cellularOperator;

        @NotNull
        private final ConnectionType connectionType;

        @NotNull
        private final String deviceModel;
        private final boolean isEnergySavingModeEnabled;

        @NotNull
        private final String networkProvider;

        @NotNull
        private final PowerSaveState powerSaveState;
        private final Boolean vpnOrProxyEnabled;

        public DeviceStats(@i(name = "device_model") @NotNull String deviceModel, @i(name = "net") @NotNull ConnectionType connectionType, @i(name = "cellular_operator") @NotNull String cellularOperator, @i(name = "net_provider") @NotNull String networkProvider, @i(name = "battery_charge") int i11, @i(name = "energy_saving_mode") boolean z11, @i(name = "energy_saving_mode_android") @NotNull PowerSaveState powerSaveState, @i(name = "vpn") Boolean bool) {
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(connectionType, "connectionType");
            Intrinsics.checkNotNullParameter(cellularOperator, "cellularOperator");
            Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
            Intrinsics.checkNotNullParameter(powerSaveState, "powerSaveState");
            this.deviceModel = deviceModel;
            this.connectionType = connectionType;
            this.cellularOperator = cellularOperator;
            this.networkProvider = networkProvider;
            this.batteryCharge = i11;
            this.isEnergySavingModeEnabled = z11;
            this.powerSaveState = powerSaveState;
            this.vpnOrProxyEnabled = bool;
        }

        public static /* synthetic */ DeviceStats copy$default(DeviceStats deviceStats, String str, ConnectionType connectionType, String str2, String str3, int i11, boolean z11, PowerSaveState powerSaveState, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = deviceStats.deviceModel;
            }
            if ((i12 & 2) != 0) {
                connectionType = deviceStats.connectionType;
            }
            if ((i12 & 4) != 0) {
                str2 = deviceStats.cellularOperator;
            }
            if ((i12 & 8) != 0) {
                str3 = deviceStats.networkProvider;
            }
            if ((i12 & 16) != 0) {
                i11 = deviceStats.batteryCharge;
            }
            if ((i12 & 32) != 0) {
                z11 = deviceStats.isEnergySavingModeEnabled;
            }
            if ((i12 & 64) != 0) {
                powerSaveState = deviceStats.powerSaveState;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                bool = deviceStats.vpnOrProxyEnabled;
            }
            PowerSaveState powerSaveState2 = powerSaveState;
            Boolean bool2 = bool;
            int i13 = i11;
            boolean z12 = z11;
            return deviceStats.copy(str, connectionType, str2, str3, i13, z12, powerSaveState2, bool2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ConnectionType getConnectionType() {
            return this.connectionType;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getCellularOperator() {
            return this.cellularOperator;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getNetworkProvider() {
            return this.networkProvider;
        }

        /* renamed from: component5, reason: from getter */
        public final int getBatteryCharge() {
            return this.batteryCharge;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsEnergySavingModeEnabled() {
            return this.isEnergySavingModeEnabled;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final PowerSaveState getPowerSaveState() {
            return this.powerSaveState;
        }

        /* renamed from: component8, reason: from getter */
        public final Boolean getVpnOrProxyEnabled() {
            return this.vpnOrProxyEnabled;
        }

        @NotNull
        public final DeviceStats copy(@i(name = "device_model") @NotNull String deviceModel, @i(name = "net") @NotNull ConnectionType connectionType, @i(name = "cellular_operator") @NotNull String cellularOperator, @i(name = "net_provider") @NotNull String networkProvider, @i(name = "battery_charge") int batteryCharge, @i(name = "energy_saving_mode") boolean isEnergySavingModeEnabled, @i(name = "energy_saving_mode_android") @NotNull PowerSaveState powerSaveState, @i(name = "vpn") Boolean vpnOrProxyEnabled) {
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            Intrinsics.checkNotNullParameter(connectionType, "connectionType");
            Intrinsics.checkNotNullParameter(cellularOperator, "cellularOperator");
            Intrinsics.checkNotNullParameter(networkProvider, "networkProvider");
            Intrinsics.checkNotNullParameter(powerSaveState, "powerSaveState");
            return new DeviceStats(deviceModel, connectionType, cellularOperator, networkProvider, batteryCharge, isEnergySavingModeEnabled, powerSaveState, vpnOrProxyEnabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceStats)) {
                return false;
            }
            DeviceStats deviceStats = (DeviceStats) other;
            return Intrinsics.d(this.deviceModel, deviceStats.deviceModel) && this.connectionType == deviceStats.connectionType && Intrinsics.d(this.cellularOperator, deviceStats.cellularOperator) && Intrinsics.d(this.networkProvider, deviceStats.networkProvider) && this.batteryCharge == deviceStats.batteryCharge && this.isEnergySavingModeEnabled == deviceStats.isEnergySavingModeEnabled && this.powerSaveState == deviceStats.powerSaveState && Intrinsics.d(this.vpnOrProxyEnabled, deviceStats.vpnOrProxyEnabled);
        }

        public final int getBatteryCharge() {
            return this.batteryCharge;
        }

        @NotNull
        public final String getCellularOperator() {
            return this.cellularOperator;
        }

        @NotNull
        public final ConnectionType getConnectionType() {
            return this.connectionType;
        }

        @NotNull
        public final String getDeviceModel() {
            return this.deviceModel;
        }

        @NotNull
        public final String getNetworkProvider() {
            return this.networkProvider;
        }

        @NotNull
        public final PowerSaveState getPowerSaveState() {
            return this.powerSaveState;
        }

        public final Boolean getVpnOrProxyEnabled() {
            return this.vpnOrProxyEnabled;
        }

        public int hashCode() {
            int hashCode = (this.powerSaveState.hashCode() + C3532b.a(C2454a.a(this.batteryCharge, g.a(g.a((this.connectionType.hashCode() + (this.deviceModel.hashCode() * 31)) * 31, 31, this.cellularOperator), 31, this.networkProvider), 31), 31, this.isEnergySavingModeEnabled)) * 31;
            Boolean bool = this.vpnOrProxyEnabled;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean isEnergySavingModeEnabled() {
            return this.isEnergySavingModeEnabled;
        }

        @NotNull
        public String toString() {
            String str = this.deviceModel;
            ConnectionType connectionType = this.connectionType;
            String str2 = this.cellularOperator;
            String str3 = this.networkProvider;
            int i11 = this.batteryCharge;
            boolean z11 = this.isEnergySavingModeEnabled;
            PowerSaveState powerSaveState = this.powerSaveState;
            Boolean bool = this.vpnOrProxyEnabled;
            StringBuilder sb2 = new StringBuilder("DeviceStats(deviceModel=");
            sb2.append(str);
            sb2.append(", connectionType=");
            sb2.append(connectionType);
            sb2.append(", cellularOperator=");
            a.h(sb2, str2, ", networkProvider=", str3, ", batteryCharge=");
            c.d(sb2, i11, ", isEnergySavingModeEnabled=", z11, ", powerSaveState=");
            sb2.append(powerSaveState);
            sb2.append(", vpnOrProxyEnabled=");
            sb2.append(bool);
            sb2.append(")");
            return sb2.toString();
        }
    }

    public PushstatusRequestBodyV3(@i(name = "events") @NotNull List<PushStatusEvent> events, @i(name = "stats") @NotNull DeviceStats stats) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(stats, "stats");
        this.events = events;
        this.stats = stats;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PushstatusRequestBodyV3 copy$default(PushstatusRequestBodyV3 pushstatusRequestBodyV3, List list, DeviceStats deviceStats, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = pushstatusRequestBodyV3.events;
        }
        if ((i11 & 2) != 0) {
            deviceStats = pushstatusRequestBodyV3.stats;
        }
        return pushstatusRequestBodyV3.copy(list, deviceStats);
    }

    @NotNull
    public final List<PushStatusEvent> component1() {
        return this.events;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DeviceStats getStats() {
        return this.stats;
    }

    @NotNull
    public final PushstatusRequestBodyV3 copy(@i(name = "events") @NotNull List<PushStatusEvent> events, @i(name = "stats") @NotNull DeviceStats stats) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(stats, "stats");
        return new PushstatusRequestBodyV3(events, stats);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushstatusRequestBodyV3)) {
            return false;
        }
        PushstatusRequestBodyV3 pushstatusRequestBodyV3 = (PushstatusRequestBodyV3) other;
        return Intrinsics.d(this.events, pushstatusRequestBodyV3.events) && Intrinsics.d(this.stats, pushstatusRequestBodyV3.stats);
    }

    @NotNull
    public final List<PushStatusEvent> getEvents() {
        return this.events;
    }

    @NotNull
    public final DeviceStats getStats() {
        return this.stats;
    }

    public int hashCode() {
        return this.stats.hashCode() + (this.events.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PushstatusRequestBodyV3(events=" + this.events + ", stats=" + this.stats + ")";
    }
}
