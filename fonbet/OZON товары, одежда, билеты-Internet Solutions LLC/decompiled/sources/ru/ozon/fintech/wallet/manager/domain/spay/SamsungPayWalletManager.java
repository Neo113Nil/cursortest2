package ru.ozon.fintech.wallet.manager.domain.spay;

import android.nfc.cardemulation.CardEmulation;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/spay/SamsungPayWalletManager;", "", "isDefaultWallet", "", "emulation", "Landroid/nfc/cardemulation/CardEmulation;", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SamsungPayWalletManager {
    boolean isDefaultWallet(@NotNull CardEmulation emulation);
}
