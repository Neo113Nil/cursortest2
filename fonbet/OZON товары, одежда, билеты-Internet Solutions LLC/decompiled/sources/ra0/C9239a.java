package ra0;

import DJ.c;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.nfc.cardemulation.CardEmulation;
import androidx.activity.ActivityC5043j;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.UserAddress;
import com.google.android.gms.tasks.Task;
import io.sentry.util.x;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager;
import ru.ozon.fintech.wallet.manager.domain.model.UserAddressInfo;
import ru.ozon.fintech.wallet.manager.domain.model.WalletCard;
import ru.ozon.fintech.wallet.manager.domain.model.WalletId;

/* renamed from: ra0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9239a implements GooglePayWalletManager, G {

    /* renamed from: a, reason: collision with root package name */
    private TapAndPayClient f83262a;

    /* renamed from: b, reason: collision with root package name */
    private ActivityC5043j f83263b;

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final void getListTokens(@NotNull Function1<? super List<WalletCard>, Unit> resultCallback) {
        Task<List<TokenInfo>> listTokens;
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        TapAndPayClient tapAndPayClient = this.f83262a;
        if (tapAndPayClient == null || (listTokens = tapAndPayClient.listTokens()) == null) {
            return;
        }
        listTokens.addOnCompleteListener(new AJ.a(resultCallback, 6));
    }

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final void getWalletId(@NotNull Function1<? super WalletId, Unit> resultCallback) {
        Task<String> activeWalletId;
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        TapAndPayClient tapAndPayClient = this.f83262a;
        if (tapAndPayClient == null || (activeWalletId = tapAndPayClient.getActiveWalletId()) == null) {
            return;
        }
        activeWalletId.addOnCompleteListener(new c(resultCallback, 9));
    }

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final void init(@NotNull ActivityC5043j activity) {
        AbstractC5434v lifecycle;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f83262a = TapAndPay.getClient((Activity) activity);
        this.f83263b = activity;
        if (activity == null || (lifecycle = activity.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final boolean isDefaultWallet(@NotNull CardEmulation emulation) {
        Intrinsics.checkNotNullParameter(emulation, "emulation");
        return emulation.isDefaultServiceForCategory(new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.hce.service.TpHceService"), "payment");
    }

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final void isTokenized(@NotNull WalletCard walletCard, @NotNull Function1<? super Boolean, Unit> resultCallback) {
        Intrinsics.checkNotNullParameter(walletCard, "walletCard");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        TapAndPayClient tapAndPayClient = this.f83262a;
        if (tapAndPayClient != null) {
            tapAndPayClient.isTokenized(new IsTokenizedRequest.Builder().setIdentifier("1234").setNetwork(walletCard.getCardNetwork()).setTokenServiceProvider(walletCard.getTokenServiceProvider()).build()).addOnCompleteListener(new x(this, resultCallback));
        }
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        AbstractC5434v lifecycle;
        AbstractC5434v lifecycle2;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        ActivityC5043j activityC5043j = this.f83263b;
        if (((activityC5043j == null || (lifecycle2 = activityC5043j.getLifecycle()) == null) ? null : lifecycle2.b()) == AbstractC5434v.b.DESTROYED) {
            ActivityC5043j activityC5043j2 = this.f83263b;
            if (activityC5043j2 != null && (lifecycle = activityC5043j2.getLifecycle()) != null) {
                lifecycle.e(this);
            }
            this.f83263b = null;
            this.f83262a = null;
        }
    }

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final void pushTokenize(@NotNull ActivityC5043j activity, @NotNull WalletCard walletCard, @NotNull String opc, int i11, UserAddressInfo userAddressInfo) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(walletCard, "walletCard");
        Intrinsics.checkNotNullParameter(opc, "opc");
        TapAndPayClient tapAndPayClient = this.f83262a;
        if (tapAndPayClient != null) {
            UserAddress.Builder newBuilder = UserAddress.newBuilder();
            if (userAddressInfo != null) {
                newBuilder.setAddress1(userAddressInfo.getAddress()).setName(userAddressInfo.getName()).setCountryCode(userAddressInfo.getCountryCode()).setLocality(userAddressInfo.getLocality()).setPhoneNumber(userAddressInfo.getPhoneNumber()).setPostalCode(userAddressInfo.getPostCode());
            }
            PushTokenizeRequest.Builder builder = new PushTokenizeRequest.Builder();
            byte[] bytes = opc.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            tapAndPayClient.pushTokenize(activity, builder.setOpaquePaymentCard(bytes).setNetwork(walletCard.getCardNetwork()).setTokenServiceProvider(walletCard.getTokenServiceProvider()).setDisplayName(walletCard.getPortfolioName()).setLastDigits(walletCard.getFPanLastFour()).setUserAddress(newBuilder.build()).build(), i11);
        }
    }

    @Override // ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager
    public final void setAsDefaultWallet(@NotNull ActivityC5043j activity, int i11) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
        intent.putExtra("category", "payment");
        intent.putExtra("component", new ComponentName("com.google.android.gms", "com.google.android.gms.tapandpay.hce.service.TpHceService"));
        activity.startActivityForResult(intent, i11);
    }
}
