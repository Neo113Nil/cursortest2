package ru.ozon.fintech.wallet.manager.domain.model;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/model/WalletId;", "", "walletIdStatus", "Lru/ozon/fintech/wallet/manager/domain/model/WalletIdStatus;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Lru/ozon/fintech/wallet/manager/domain/model/WalletIdStatus;Ljava/lang/String;)V", "getWalletIdStatus", "()Lru/ozon/fintech/wallet/manager/domain/model/WalletIdStatus;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletId {
    private final String value;

    @NotNull
    private final WalletIdStatus walletIdStatus;

    public WalletId(@NotNull WalletIdStatus walletIdStatus, String str) {
        Intrinsics.checkNotNullParameter(walletIdStatus, "walletIdStatus");
        this.walletIdStatus = walletIdStatus;
        this.value = str;
    }

    public static /* synthetic */ WalletId copy$default(WalletId walletId, WalletIdStatus walletIdStatus, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            walletIdStatus = walletId.walletIdStatus;
        }
        if ((i11 & 2) != 0) {
            str = walletId.value;
        }
        return walletId.copy(walletIdStatus, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final WalletIdStatus getWalletIdStatus() {
        return this.walletIdStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final WalletId copy(@NotNull WalletIdStatus walletIdStatus, String value) {
        Intrinsics.checkNotNullParameter(walletIdStatus, "walletIdStatus");
        return new WalletId(walletIdStatus, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletId)) {
            return false;
        }
        WalletId walletId = (WalletId) other;
        return this.walletIdStatus == walletId.walletIdStatus && Intrinsics.d(this.value, walletId.value);
    }

    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final WalletIdStatus getWalletIdStatus() {
        return this.walletIdStatus;
    }

    public int hashCode() {
        int hashCode = this.walletIdStatus.hashCode() * 31;
        String str = this.value;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "WalletId(walletIdStatus=" + this.walletIdStatus + ", value=" + this.value + ")";
    }

    public /* synthetic */ WalletId(WalletIdStatus walletIdStatus, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(walletIdStatus, (i11 & 2) != 0 ? null : str);
    }
}
