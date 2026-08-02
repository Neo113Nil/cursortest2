package ru.ozon.app.android.bank.ui;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/bank/ui/BankTabUiController;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "bankTabManager", "Landroidx/fragment/app/m;", "fragment", "<init>", "(Lru/ozon/app/android/bank/domain/BankTabBadgeManager;Landroidx/fragment/app/m;)V", "", "onInit", "()V", "onDestroy", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "Lxe/B0;", "job", "Lxe/B0;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankTabUiController extends TabUiController {

    @NotNull
    private final BankTabBadgeManager bankTabManager;
    private B0 job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankTabUiController(@NotNull BankTabBadgeManager bankTabManager, @NotNull ComponentCallbacksC5392m fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(bankTabManager, "bankTabManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.bankTabManager = bankTabManager;
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onDestroy() {
        this.bankTabManager.unregisterReceiver();
        super.onDestroy();
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiController
    public void onInit() {
        super.onInit();
        this.bankTabManager.registerReceiver();
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        J viewLifecycleOwner = getFragment().getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.job = C10727i.c(K.a(viewLifecycleOwner), null, null, new BankTabUiController$onInit$1(this, null), 3);
    }
}
