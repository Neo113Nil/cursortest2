package spay.sdk.data.dto;

import Am.C2438a;
import B0.C2454a;
import B90.C2618u;
import J0.P;
import J8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006!"}, d2 = {"Lspay/sdk/data/dto/StartDeviceInfoModel;", "", "compromised", "", "emulator", "rdpConnection", "accessibilityServices", "Lspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;", "rdpConnectionDuration", "debugger", "(IIILspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;II)V", "getAccessibilityServices", "()Lspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;", "getCompromised", "()I", "getDebugger", "getEmulator", "getRdpConnection", "getRdpConnectionDuration", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "AccessibilityServices", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StartDeviceInfoModel {

    @b("AccessibilityServices")
    @NotNull
    private final AccessibilityServices accessibilityServices;

    @b("Compromised")
    private final int compromised;

    @b("Debugger")
    private final int debugger;

    @b("Emulator")
    private final int emulator;

    @b("RdpConnection")
    private final int rdpConnection;

    @b("RdpConnectionDuration")
    private final int rdpConnectionDuration;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lspay/sdk/data/dto/StartDeviceInfoModel$AccessibilityServices;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AccessibilityServices {

        @b("enabled")
        private final boolean enabled;

        public AccessibilityServices(boolean z11) {
            this.enabled = z11;
        }

        public static /* synthetic */ AccessibilityServices copy$default(AccessibilityServices accessibilityServices, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = accessibilityServices.enabled;
            }
            return accessibilityServices.copy(z11);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final AccessibilityServices copy(boolean enabled) {
            return new AccessibilityServices(enabled);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccessibilityServices) && this.enabled == ((AccessibilityServices) other).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            boolean z11 = this.enabled;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        @NotNull
        public String toString() {
            return C2618u.g("AccessibilityServices(enabled=", ")", this.enabled);
        }
    }

    public StartDeviceInfoModel(int i11, int i12, int i13, @NotNull AccessibilityServices accessibilityServices, int i14, int i15) {
        Intrinsics.checkNotNullParameter(accessibilityServices, "accessibilityServices");
        this.compromised = i11;
        this.emulator = i12;
        this.rdpConnection = i13;
        this.accessibilityServices = accessibilityServices;
        this.rdpConnectionDuration = i14;
        this.debugger = i15;
    }

    public static /* synthetic */ StartDeviceInfoModel copy$default(StartDeviceInfoModel startDeviceInfoModel, int i11, int i12, int i13, AccessibilityServices accessibilityServices, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = startDeviceInfoModel.compromised;
        }
        if ((i16 & 2) != 0) {
            i12 = startDeviceInfoModel.emulator;
        }
        if ((i16 & 4) != 0) {
            i13 = startDeviceInfoModel.rdpConnection;
        }
        if ((i16 & 8) != 0) {
            accessibilityServices = startDeviceInfoModel.accessibilityServices;
        }
        if ((i16 & 16) != 0) {
            i14 = startDeviceInfoModel.rdpConnectionDuration;
        }
        if ((i16 & 32) != 0) {
            i15 = startDeviceInfoModel.debugger;
        }
        int i17 = i14;
        int i18 = i15;
        return startDeviceInfoModel.copy(i11, i12, i13, accessibilityServices, i17, i18);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCompromised() {
        return this.compromised;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEmulator() {
        return this.emulator;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRdpConnection() {
        return this.rdpConnection;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AccessibilityServices getAccessibilityServices() {
        return this.accessibilityServices;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRdpConnectionDuration() {
        return this.rdpConnectionDuration;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDebugger() {
        return this.debugger;
    }

    @NotNull
    public final StartDeviceInfoModel copy(int compromised, int emulator, int rdpConnection, @NotNull AccessibilityServices accessibilityServices, int rdpConnectionDuration, int debugger) {
        Intrinsics.checkNotNullParameter(accessibilityServices, "accessibilityServices");
        return new StartDeviceInfoModel(compromised, emulator, rdpConnection, accessibilityServices, rdpConnectionDuration, debugger);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartDeviceInfoModel)) {
            return false;
        }
        StartDeviceInfoModel startDeviceInfoModel = (StartDeviceInfoModel) other;
        return this.compromised == startDeviceInfoModel.compromised && this.emulator == startDeviceInfoModel.emulator && this.rdpConnection == startDeviceInfoModel.rdpConnection && Intrinsics.d(this.accessibilityServices, startDeviceInfoModel.accessibilityServices) && this.rdpConnectionDuration == startDeviceInfoModel.rdpConnectionDuration && this.debugger == startDeviceInfoModel.debugger;
    }

    @NotNull
    public final AccessibilityServices getAccessibilityServices() {
        return this.accessibilityServices;
    }

    public final int getCompromised() {
        return this.compromised;
    }

    public final int getDebugger() {
        return this.debugger;
    }

    public final int getEmulator() {
        return this.emulator;
    }

    public final int getRdpConnection() {
        return this.rdpConnection;
    }

    public final int getRdpConnectionDuration() {
        return this.rdpConnectionDuration;
    }

    public int hashCode() {
        return Integer.hashCode(this.debugger) + C2454a.a(this.rdpConnectionDuration, (this.accessibilityServices.hashCode() + C2454a.a(this.rdpConnection, C2454a.a(this.emulator, Integer.hashCode(this.compromised) * 31, 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.compromised;
        int i12 = this.emulator;
        int i13 = this.rdpConnection;
        AccessibilityServices accessibilityServices = this.accessibilityServices;
        int i14 = this.rdpConnectionDuration;
        int i15 = this.debugger;
        StringBuilder a11 = C2438a.a("StartDeviceInfoModel(compromised=", i11, ", emulator=", ", rdpConnection=", i12);
        a11.append(i13);
        a11.append(", accessibilityServices=");
        a11.append(accessibilityServices);
        a11.append(", rdpConnectionDuration=");
        return P.a(i14, i15, ", debugger=", ")", a11);
    }
}
