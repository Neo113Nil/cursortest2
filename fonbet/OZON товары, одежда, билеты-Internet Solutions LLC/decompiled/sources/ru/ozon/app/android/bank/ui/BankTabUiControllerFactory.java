package ru.ozon.app.android.bank.ui;

import Sc.InterfaceC4008j;
import android.app.Application;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;
import ru.ozon.app.android.tabbar.ui.controller.TabUiController;
import ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/bank/ui/BankTabUiControllerFactory;", "Lru/ozon/app/android/tabbar/ui/controller/TabUiControllerFactory;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Landroidx/fragment/app/m;", "fragment", "Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "create", "(Landroidx/fragment/app/m;)Lru/ozon/app/android/tabbar/ui/controller/TabUiController;", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "bankTabBadgeManager$delegate", "LSc/j;", "getBankTabBadgeManager", "()Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "bankTabBadgeManager", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BankTabUiControllerFactory implements TabUiControllerFactory {

    /* renamed from: bankTabBadgeManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bankTabBadgeManager;

    public BankTabUiControllerFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.bankTabBadgeManager = LazyUtilsKt.unsafeLazy(new BankTabUiControllerFactory$bankTabBadgeManager$2(application));
    }

    private final BankTabBadgeManager getBankTabBadgeManager() {
        return (BankTabBadgeManager) this.bankTabBadgeManager.getValue();
    }

    @Override // ru.ozon.app.android.tabbar.ui.controller.TabUiControllerFactory
    @NotNull
    public TabUiController create(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new BankTabUiController(getBankTabBadgeManager(), fragment);
    }
}
