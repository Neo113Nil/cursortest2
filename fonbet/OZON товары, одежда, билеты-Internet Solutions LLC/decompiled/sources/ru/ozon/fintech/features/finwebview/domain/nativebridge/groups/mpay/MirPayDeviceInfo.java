package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.mpay;

import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/mpay/MirPayDeviceInfo;", "", "deviceId", "", "walletId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getWalletId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MirPayDeviceInfo {

    @NotNull
    private final String deviceId;

    @NotNull
    private final String walletId;

    public MirPayDeviceInfo(@i(name = "device_id") @NotNull String deviceId, @i(name = "wallet_id") @NotNull String walletId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        this.deviceId = deviceId;
        this.walletId = walletId;
    }

    public static /* synthetic */ MirPayDeviceInfo copy$default(MirPayDeviceInfo mirPayDeviceInfo, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mirPayDeviceInfo.deviceId;
        }
        if ((i11 & 2) != 0) {
            str2 = mirPayDeviceInfo.walletId;
        }
        return mirPayDeviceInfo.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }

    @NotNull
    public final MirPayDeviceInfo copy(@i(name = "device_id") @NotNull String deviceId, @i(name = "wallet_id") @NotNull String walletId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        return new MirPayDeviceInfo(deviceId, walletId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MirPayDeviceInfo)) {
            return false;
        }
        MirPayDeviceInfo mirPayDeviceInfo = (MirPayDeviceInfo) other;
        return Intrinsics.d(this.deviceId, mirPayDeviceInfo.deviceId) && Intrinsics.d(this.walletId, mirPayDeviceInfo.walletId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getWalletId() {
        return this.walletId;
    }

    public int hashCode() {
        return this.walletId.hashCode() + (this.deviceId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("MirPayDeviceInfo(deviceId=", this.deviceId, ", walletId=", this.walletId, ")");
    }
}
