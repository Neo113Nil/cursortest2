package ru.ozon.fintech.wallet.manager.domain.gpay;

import android.nfc.cardemulation.CardEmulation;
import androidx.activity.ActivityC5043j;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.wallet.manager.domain.model.UserAddressInfo;
import ru.ozon.fintech.wallet.manager.domain.model.WalletCard;
import ru.ozon.fintech.wallet.manager.domain.model.WalletId;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00042\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00040\u0010H&¢\u0006\u0004\b\u0017\u0010\u0014J+\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0010H&¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001dH&¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/fintech/wallet/manager/domain/gpay/GooglePayWalletManager;", "", "Landroidx/activity/j;", "activity", "", "init", "(Landroidx/activity/j;)V", "Landroid/nfc/cardemulation/CardEmulation;", "emulation", "", "isDefaultWallet", "(Landroid/nfc/cardemulation/CardEmulation;)Z", "", "requestCode", "setAsDefaultWallet", "(Landroidx/activity/j;I)V", "Lkotlin/Function1;", "Lru/ozon/fintech/wallet/manager/domain/model/WalletId;", "resultCallback", "getWalletId", "(Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/fintech/wallet/manager/domain/model/WalletCard;", "getListTokens", "walletCard", "isTokenized", "(Lru/ozon/fintech/wallet/manager/domain/model/WalletCard;Lkotlin/jvm/functions/Function1;)V", "", "opc", "Lru/ozon/fintech/wallet/manager/domain/model/UserAddressInfo;", "userAddressInfo", "pushTokenize", "(Landroidx/activity/j;Lru/ozon/fintech/wallet/manager/domain/model/WalletCard;Ljava/lang/String;ILru/ozon/fintech/wallet/manager/domain/model/UserAddressInfo;)V", "manager_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GooglePayWalletManager {
    void getListTokens(@NotNull Function1<? super List<WalletCard>, Unit> resultCallback);

    void getWalletId(@NotNull Function1<? super WalletId, Unit> resultCallback);

    void init(@NotNull ActivityC5043j activity);

    boolean isDefaultWallet(@NotNull CardEmulation emulation);

    void isTokenized(@NotNull WalletCard walletCard, @NotNull Function1<? super Boolean, Unit> resultCallback);

    void pushTokenize(@NotNull ActivityC5043j activity, @NotNull WalletCard walletCard, @NotNull String opc, int requestCode, UserAddressInfo userAddressInfo);

    void setAsDefaultWallet(@NotNull ActivityC5043j activity, int requestCode);
}
