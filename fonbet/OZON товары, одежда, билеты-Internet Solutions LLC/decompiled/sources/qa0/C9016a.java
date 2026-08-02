package qa0;

import B90.C2620w;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.nfc.NfcManager;
import android.nfc.cardemulation.CardEmulation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra0.C9239a;
import ru.ozon.fintech.wallet.manager.domain.WalletManager;
import ru.ozon.fintech.wallet.manager.domain.gpay.GooglePayWalletManager;
import ru.ozon.fintech.wallet.manager.domain.model.DefaultWallet;
import ru.ozon.fintech.wallet.manager.domain.spay.SamsungPayWalletManager;
import ta0.InterfaceC9791a;
import ua0.C9993a;

/* renamed from: qa0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9016a implements WalletManager {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f81801a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f81802b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f81803c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f81804d;

    public C9016a(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f81801a = appContext;
        n nVar = n.PUBLICATION;
        int i11 = 3;
        this.f81802b = k.a(nVar, new C2620w(this, i11));
        this.f81803c = k.a(nVar, new A30.a(this, i11));
        this.f81804d = k.a(nVar, new B50.k(this, 2));
    }

    public static ru.ozon.fintech.wallet.manager.domain.mpay.a a(C9016a c9016a) {
        return new ru.ozon.fintech.wallet.manager.domain.mpay.a(c9016a.f81801a);
    }

    public static C9239a b(C9016a c9016a) {
        Context context = c9016a.f81801a;
        Intrinsics.checkNotNullParameter(context, "context");
        return new C9239a();
    }

    public static C9993a c(C9016a c9016a) {
        Context appContext = c9016a.f81801a;
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return new C9993a();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.fintech.wallet.manager.domain.WalletManager
    @NotNull
    public final DefaultWallet getCurrentKindOfWallet() {
        NfcManager nfcManager = (NfcManager) this.f81801a.getSystemService("nfc");
        if (nfcManager == null || nfcManager.getDefaultAdapter() == null) {
            return DefaultWallet.NFC_NOT_AVAILABLE;
        }
        CardEmulation cardEmulation = CardEmulation.getInstance(nfcManager.getDefaultAdapter());
        Intrinsics.checkNotNullExpressionValue(cardEmulation, "getInstance(...)");
        return ((GooglePayWalletManager) this.f81802b.getValue()).isDefaultWallet(cardEmulation) ? DefaultWallet.GOOGLE_PAY : ((SamsungPayWalletManager) this.f81803c.getValue()).isDefaultWallet(cardEmulation) ? DefaultWallet.SAMSUNG_PAY : ((InterfaceC9791a) this.f81804d.getValue()).j() ? DefaultWallet.MIR_PAY : DefaultWallet.NONE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.fintech.wallet.manager.domain.WalletManager
    @NotNull
    public final GooglePayWalletManager getGooglePayWalletManager() {
        return (GooglePayWalletManager) this.f81802b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.fintech.wallet.manager.domain.WalletManager
    @NotNull
    public final InterfaceC9791a getMirPayWalletManager() {
        return (InterfaceC9791a) this.f81804d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.fintech.wallet.manager.domain.WalletManager
    @NotNull
    public final SamsungPayWalletManager getSamsungPayWalletManager() {
        return (SamsungPayWalletManager) this.f81803c.getValue();
    }
}
