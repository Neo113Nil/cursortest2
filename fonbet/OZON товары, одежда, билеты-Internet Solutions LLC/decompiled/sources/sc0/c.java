package sc0;

import Sc.InterfaceC4008j;
import android.accounts.Account;
import android.accounts.AccountManager;
import dc0.C6159e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AccountManager> f98556a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6159e f98557b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull InterfaceC4008j<? extends AccountManager> accountManager, @NotNull C6159e accountManagerHelper) {
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(accountManagerHelper, "accountManagerHelper");
        this.f98556a = accountManager;
        this.f98557b = accountManagerHelper;
    }

    public final void a() {
        Account a11 = this.f98557b.a();
        if (a11 != null) {
            this.f98556a.getValue().setUserData(a11, "ru.ozon.id.account.was_migrated_key", null);
        }
    }

    public final void b() {
        Account a11 = this.f98557b.a();
        if (a11 != null) {
            this.f98556a.getValue().setUserData(a11, "ru.ozon.id.account.was_migrated_key", "true");
        }
    }

    public final boolean c() {
        Account a11 = this.f98557b.a();
        if (a11 != null) {
            return Intrinsics.d(this.f98556a.getValue().getUserData(a11, "ru.ozon.id.account.was_migrated_key"), "true");
        }
        return false;
    }
}
