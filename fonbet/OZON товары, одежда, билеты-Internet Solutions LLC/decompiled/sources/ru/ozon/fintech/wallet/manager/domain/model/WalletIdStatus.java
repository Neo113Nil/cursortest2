package ru.ozon.fintech.wallet.manager.domain.model;

import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/model/WalletIdStatus;", "", "<init>", "(Ljava/lang/String;I)V", "AVAILABLE_WALLET_ID", "NO_ACTIVE_WALLET", "INTERNAL_ERROR", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletIdStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ WalletIdStatus[] $VALUES;
    public static final WalletIdStatus AVAILABLE_WALLET_ID = new WalletIdStatus("AVAILABLE_WALLET_ID", 0);
    public static final WalletIdStatus NO_ACTIVE_WALLET = new WalletIdStatus("NO_ACTIVE_WALLET", 1);
    public static final WalletIdStatus INTERNAL_ERROR = new WalletIdStatus("INTERNAL_ERROR", 2);

    private static final /* synthetic */ WalletIdStatus[] $values() {
        return new WalletIdStatus[]{AVAILABLE_WALLET_ID, NO_ACTIVE_WALLET, INTERNAL_ERROR};
    }

    static {
        WalletIdStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private WalletIdStatus(String str, int i11) {
    }

    @NotNull
    public static a<WalletIdStatus> getEntries() {
        return $ENTRIES;
    }

    public static WalletIdStatus valueOf(String str) {
        return (WalletIdStatus) Enum.valueOf(WalletIdStatus.class, str);
    }

    public static WalletIdStatus[] values() {
        return (WalletIdStatus[]) $VALUES.clone();
    }
}
