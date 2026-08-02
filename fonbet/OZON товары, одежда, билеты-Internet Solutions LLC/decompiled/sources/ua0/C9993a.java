package ua0;

import android.content.ComponentName;
import android.nfc.cardemulation.CardEmulation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.wallet.manager.domain.spay.SamsungPayWalletManager;

/* renamed from: ua0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9993a implements SamsungPayWalletManager {
    @Override // ru.ozon.fintech.wallet.manager.domain.spay.SamsungPayWalletManager
    public final boolean isDefaultWallet(@NotNull CardEmulation emulation) {
        Intrinsics.checkNotNullParameter(emulation, "emulation");
        return emulation.isDefaultServiceForCategory(new ComponentName("com.samsung.android.spayfw", "com.samsung.android.spayfw.core.hce.SPayHCEService"), "payment");
    }
}
