package ru.ozon.fintech.analytic.models;

import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthNetworkInfo;", "", "vpn", "", "connectionType", "", "<init>", "(ZLjava/lang/String;)V", "getVpn", "()Z", "getConnectionType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthNetworkInfo {

    @i(name = "connection_type")
    @NotNull
    private final String connectionType;

    @i(name = "vpn")
    private final boolean vpn;

    public HealthNetworkInfo(boolean z11, @NotNull String connectionType) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        this.vpn = z11;
        this.connectionType = connectionType;
    }

    public static /* synthetic */ HealthNetworkInfo copy$default(HealthNetworkInfo healthNetworkInfo, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = healthNetworkInfo.vpn;
        }
        if ((i11 & 2) != 0) {
            str = healthNetworkInfo.connectionType;
        }
        return healthNetworkInfo.copy(z11, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVpn() {
        return this.vpn;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getConnectionType() {
        return this.connectionType;
    }

    @NotNull
    public final HealthNetworkInfo copy(boolean vpn, @NotNull String connectionType) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        return new HealthNetworkInfo(vpn, connectionType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthNetworkInfo)) {
            return false;
        }
        HealthNetworkInfo healthNetworkInfo = (HealthNetworkInfo) other;
        return this.vpn == healthNetworkInfo.vpn && Intrinsics.d(this.connectionType, healthNetworkInfo.connectionType);
    }

    @NotNull
    public final String getConnectionType() {
        return this.connectionType;
    }

    public final boolean getVpn() {
        return this.vpn;
    }

    public int hashCode() {
        return this.connectionType.hashCode() + (Boolean.hashCode(this.vpn) * 31);
    }

    @NotNull
    public String toString() {
        return "HealthNetworkInfo(vpn=" + this.vpn + ", connectionType=" + this.connectionType + ")";
    }
}
