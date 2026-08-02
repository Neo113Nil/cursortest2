package ru.ozon.app.android.network.cronet;

import B0.C2454a;
import Kk.C3532b;
import Lh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetSettings;", "", "enableHints", "", "disableTlsZeroRtt", "maxServerConfigs", "", "cacheConnection", "<init>", "(ZZIZ)V", "getEnableHints", "()Z", "getDisableTlsZeroRtt", "getMaxServerConfigs", "()I", "getCacheConnection", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CronetSettings {
    private final boolean cacheConnection;
    private final boolean disableTlsZeroRtt;
    private final boolean enableHints;
    private final int maxServerConfigs;

    public CronetSettings() {
        this(false, false, 0, false, 15, null);
    }

    public static /* synthetic */ CronetSettings copy$default(CronetSettings cronetSettings, boolean z11, boolean z12, int i11, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = cronetSettings.enableHints;
        }
        if ((i12 & 2) != 0) {
            z12 = cronetSettings.disableTlsZeroRtt;
        }
        if ((i12 & 4) != 0) {
            i11 = cronetSettings.maxServerConfigs;
        }
        if ((i12 & 8) != 0) {
            z13 = cronetSettings.cacheConnection;
        }
        return cronetSettings.copy(z11, z12, i11, z13);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnableHints() {
        return this.enableHints;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisableTlsZeroRtt() {
        return this.disableTlsZeroRtt;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxServerConfigs() {
        return this.maxServerConfigs;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCacheConnection() {
        return this.cacheConnection;
    }

    @NotNull
    public final CronetSettings copy(boolean enableHints, boolean disableTlsZeroRtt, int maxServerConfigs, boolean cacheConnection) {
        return new CronetSettings(enableHints, disableTlsZeroRtt, maxServerConfigs, cacheConnection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CronetSettings)) {
            return false;
        }
        CronetSettings cronetSettings = (CronetSettings) other;
        return this.enableHints == cronetSettings.enableHints && this.disableTlsZeroRtt == cronetSettings.disableTlsZeroRtt && this.maxServerConfigs == cronetSettings.maxServerConfigs && this.cacheConnection == cronetSettings.cacheConnection;
    }

    public final boolean getCacheConnection() {
        return this.cacheConnection;
    }

    public final boolean getDisableTlsZeroRtt() {
        return this.disableTlsZeroRtt;
    }

    public final boolean getEnableHints() {
        return this.enableHints;
    }

    public final int getMaxServerConfigs() {
        return this.maxServerConfigs;
    }

    public int hashCode() {
        return Boolean.hashCode(this.cacheConnection) + C2454a.a(this.maxServerConfigs, C3532b.a(Boolean.hashCode(this.enableHints) * 31, 31, this.disableTlsZeroRtt), 31);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enableHints;
        boolean z12 = this.disableTlsZeroRtt;
        int i11 = this.maxServerConfigs;
        boolean z13 = this.cacheConnection;
        StringBuilder d11 = a.d("CronetSettings(enableHints=", ", disableTlsZeroRtt=", ", maxServerConfigs=", z11, z12);
        d11.append(i11);
        d11.append(", cacheConnection=");
        d11.append(z13);
        d11.append(")");
        return d11.toString();
    }

    public CronetSettings(boolean z11, boolean z12, int i11, boolean z13) {
        this.enableHints = z11;
        this.disableTlsZeroRtt = z12;
        this.maxServerConfigs = i11;
        this.cacheConnection = z13;
    }

    public /* synthetic */ CronetSettings(boolean z11, boolean z12, int i11, boolean z13, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z13);
    }
}
