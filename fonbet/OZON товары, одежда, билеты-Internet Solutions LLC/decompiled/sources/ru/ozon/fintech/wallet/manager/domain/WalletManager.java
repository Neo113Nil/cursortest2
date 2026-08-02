package ru.ozon.fintech.wallet.manager.domain;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager;
import ru.ozon.fintech.wallet.manager.domain.model.DefaultWallet;
import ru.ozon.fintech.wallet.manager.domain.spay.SamsungPayWalletManager;
import ta0.InterfaceC9791a;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/WalletManager;", "", "Lru/ozon/fintech/wallet/manager/domain/model/DefaultWallet;", "getCurrentKindOfWallet", "()Lru/ozon/fintech/wallet/manager/domain/model/DefaultWallet;", "Lru/ozon/fintech/wallet/manager/domain/gpay/GooglePayWalletManager;", "getGooglePayWalletManager", "()Lru/ozon/fintech/wallet/manager/domain/gpay/GooglePayWalletManager;", "Lru/ozon/fintech/wallet/manager/domain/spay/SamsungPayWalletManager;", "getSamsungPayWalletManager", "()Lru/ozon/fintech/wallet/manager/domain/spay/SamsungPayWalletManager;", "Lta0/a;", "getMirPayWalletManager", "()Lta0/a;", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WalletManager {
    @NotNull
    DefaultWallet getCurrentKindOfWallet();

    @NotNull
    GooglePayWalletManager getGooglePayWalletManager();

    @NotNull
    InterfaceC9791a getMirPayWalletManager();

    @NotNull
    SamsungPayWalletManager getSamsungPayWalletManager();
}
