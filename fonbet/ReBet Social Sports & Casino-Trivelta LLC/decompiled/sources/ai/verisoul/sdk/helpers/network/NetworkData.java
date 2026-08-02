package ai.verisoul.sdk.helpers.network;

import Gb.c;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bHÆ\u0003J\u0096\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0018R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0004\u0010\u0016R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006/"}, d2 = {"Lai/verisoul/sdk/helpers/network/NetworkData;", "", "isConnected", "", "isWiFi", "isCellular", "networkType", "", "networkOperatorName", "simOperatorName", "networkInterfaces", "", "errorMessage", "cellInfo", "Lai/verisoul/sdk/helpers/network/CellInfoData;", "wifiNetworks", "Lai/verisoul/sdk/helpers/network/WifiScanData;", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCellInfo", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "getNetworkInterfaces", "getNetworkOperatorName", "getNetworkType", "getSimOperatorName", "getWifiNetworks", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lai/verisoul/sdk/helpers/network/NetworkData;", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkData {

    @c("cellInfos")
    @Nullable
    private final List<CellInfoData> cellInfo;

    @c("errorMessage")
    @Nullable
    private final String errorMessage;

    @c("isCellular")
    @Nullable
    private final Boolean isCellular;

    @c("isConnected")
    private final boolean isConnected;

    @c("isWiFi")
    @Nullable
    private final Boolean isWiFi;

    @c("networkInterfaces")
    @Nullable
    private final List<String> networkInterfaces;

    @c("networkOperatorName")
    @Nullable
    private final String networkOperatorName;

    @c("networkType")
    @Nullable
    private final String networkType;

    @c("simOperatorName")
    @Nullable
    private final String simOperatorName;

    @c("wifiNetworks")
    @Nullable
    private final List<WifiScanData> wifiNetworks;

    public NetworkData() {
        this(false, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ NetworkData copy$default(NetworkData networkData, boolean z10, Boolean bool, Boolean bool2, String str, String str2, String str3, List list, String str4, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = networkData.isConnected;
        }
        if ((i10 & 2) != 0) {
            bool = networkData.isWiFi;
        }
        if ((i10 & 4) != 0) {
            bool2 = networkData.isCellular;
        }
        if ((i10 & 8) != 0) {
            str = networkData.networkType;
        }
        if ((i10 & 16) != 0) {
            str2 = networkData.networkOperatorName;
        }
        if ((i10 & 32) != 0) {
            str3 = networkData.simOperatorName;
        }
        if ((i10 & 64) != 0) {
            list = networkData.networkInterfaces;
        }
        if ((i10 & 128) != 0) {
            str4 = networkData.errorMessage;
        }
        if ((i10 & 256) != 0) {
            list2 = networkData.cellInfo;
        }
        if ((i10 & 512) != 0) {
            list3 = networkData.wifiNetworks;
        }
        List list4 = list2;
        List list5 = list3;
        List list6 = list;
        String str5 = str4;
        String str6 = str2;
        String str7 = str3;
        return networkData.copy(z10, bool, bool2, str, str6, str7, list6, str5, list4, list5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    @Nullable
    public final List<WifiScanData> component10() {
        return this.wifiNetworks;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsWiFi() {
        return this.isWiFi;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsCellular() {
        return this.isCellular;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getNetworkOperatorName() {
        return this.networkOperatorName;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getSimOperatorName() {
        return this.simOperatorName;
    }

    @Nullable
    public final List<String> component7() {
        return this.networkInterfaces;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final List<CellInfoData> component9() {
        return this.cellInfo;
    }

    @NotNull
    public final NetworkData copy(boolean isConnected, @Nullable Boolean isWiFi, @Nullable Boolean isCellular, @Nullable String networkType, @Nullable String networkOperatorName, @Nullable String simOperatorName, @Nullable List<String> networkInterfaces, @Nullable String errorMessage, @Nullable List<CellInfoData> cellInfo, @Nullable List<WifiScanData> wifiNetworks) {
        return new NetworkData(isConnected, isWiFi, isCellular, networkType, networkOperatorName, simOperatorName, networkInterfaces, errorMessage, cellInfo, wifiNetworks);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkData)) {
            return false;
        }
        NetworkData networkData = (NetworkData) other;
        return this.isConnected == networkData.isConnected && Intrinsics.areEqual(this.isWiFi, networkData.isWiFi) && Intrinsics.areEqual(this.isCellular, networkData.isCellular) && Intrinsics.areEqual(this.networkType, networkData.networkType) && Intrinsics.areEqual(this.networkOperatorName, networkData.networkOperatorName) && Intrinsics.areEqual(this.simOperatorName, networkData.simOperatorName) && Intrinsics.areEqual(this.networkInterfaces, networkData.networkInterfaces) && Intrinsics.areEqual(this.errorMessage, networkData.errorMessage) && Intrinsics.areEqual(this.cellInfo, networkData.cellInfo) && Intrinsics.areEqual(this.wifiNetworks, networkData.wifiNetworks);
    }

    @Nullable
    public final List<CellInfoData> getCellInfo() {
        return this.cellInfo;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Nullable
    public final List<String> getNetworkInterfaces() {
        return this.networkInterfaces;
    }

    @Nullable
    public final String getNetworkOperatorName() {
        return this.networkOperatorName;
    }

    @Nullable
    public final String getNetworkType() {
        return this.networkType;
    }

    @Nullable
    public final String getSimOperatorName() {
        return this.simOperatorName;
    }

    @Nullable
    public final List<WifiScanData> getWifiNetworks() {
        return this.wifiNetworks;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isConnected) * 31;
        Boolean bool = this.isWiFi;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCellular;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.networkType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.networkOperatorName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.simOperatorName;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.networkInterfaces;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.errorMessage;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<CellInfoData> list2 = this.cellInfo;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<WifiScanData> list3 = this.wifiNetworks;
        return hashCode9 + (list3 != null ? list3.hashCode() : 0);
    }

    @Nullable
    public final Boolean isCellular() {
        return this.isCellular;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    @Nullable
    public final Boolean isWiFi() {
        return this.isWiFi;
    }

    @NotNull
    public String toString() {
        return "NetworkData(isConnected=" + this.isConnected + ", isWiFi=" + this.isWiFi + ", isCellular=" + this.isCellular + ", networkType=" + this.networkType + ", networkOperatorName=" + this.networkOperatorName + ", simOperatorName=" + this.simOperatorName + ", networkInterfaces=" + this.networkInterfaces + ", errorMessage=" + this.errorMessage + ", cellInfo=" + this.cellInfo + ", wifiNetworks=" + this.wifiNetworks + ")";
    }

    public NetworkData(boolean z10, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable List<CellInfoData> list2, @Nullable List<WifiScanData> list3) {
        this.isConnected = z10;
        this.isWiFi = bool;
        this.isCellular = bool2;
        this.networkType = str;
        this.networkOperatorName = str2;
        this.simOperatorName = str3;
        this.networkInterfaces = list;
        this.errorMessage = str4;
        this.cellInfo = list2;
        this.wifiNetworks = list3;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ NetworkData(boolean r2, java.lang.Boolean r3, java.lang.Boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.List r8, java.lang.String r9, java.util.List r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L5
            r2 = 0
        L5:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lb
            r3 = r0
        Lb:
            r13 = r12 & 4
            if (r13 == 0) goto L10
            r4 = r0
        L10:
            r13 = r12 & 8
            if (r13 == 0) goto L15
            r5 = r0
        L15:
            r13 = r12 & 16
            if (r13 == 0) goto L1a
            r6 = r0
        L1a:
            r13 = r12 & 32
            if (r13 == 0) goto L1f
            r7 = r0
        L1f:
            r13 = r12 & 64
            if (r13 == 0) goto L24
            r8 = r0
        L24:
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L29
            r9 = r0
        L29:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L2e
            r10 = r0
        L2e:
            r12 = r12 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L3e
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L49
        L3e:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L49:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.verisoul.sdk.helpers.network.NetworkData.<init>(boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
