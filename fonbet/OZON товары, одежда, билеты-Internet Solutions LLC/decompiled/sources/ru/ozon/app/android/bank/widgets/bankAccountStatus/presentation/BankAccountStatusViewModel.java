package ru.ozon.app.android.bank.widgets.bankAccountStatus.presentation;

import Ae.O0;
import Ae.x0;
import Hs.b;
import Hs.c;
import Mc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.bank.widgets.bankAccountStatus.data.BankAccountStatusResponse;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/bank/widgets/bankAccountStatus/presentation/BankAccountStatusViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;)V", "", "onCleared", "()V", "handleBalanceState", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LAe/x0;", "", "balance", "LAe/x0;", "getBalance", "()LAe/x0;", "", "wasStopped", "Z", "getWasStopped", "()Z", "setWasStopped", "(Z)V", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankAccountStatusViewModel extends w0 implements InterfaceC6786a {

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final x0<String> balance;
    private boolean wasStopped;

    public BankAccountStatusViewModel(@NotNull ActionV2Repository actionV2Repository) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.balance = O0.a(null);
    }

    @NotNull
    public final x0<String> getBalance() {
        return this.balance;
    }

    public final boolean getWasStopped() {
        return this.wasStopped;
    }

    public final void handleBalanceState() {
        C5415f.a(this).a(this.actionV2Repository.callAction(new ActionV2Request(null, "bankAccountBalance", false, 5, null), BankAccountStatusResponse.class).j(a.b()).g(C8125a.a()).h(new b(new BankAccountStatusViewModel$handleBalanceState$1(this), 12), new c(new BankAccountStatusViewModel$handleBalanceState$2(Lm0.a.f17149a), 13)));
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        C5415f.a(this).d();
    }

    public final void setWasStopped(boolean z11) {
        this.wasStopped = z11;
    }
}
