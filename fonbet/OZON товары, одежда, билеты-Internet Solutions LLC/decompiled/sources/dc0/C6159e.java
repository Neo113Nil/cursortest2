package dc0;

import Hb0.f;
import Sc.InterfaceC4008j;
import Vb0.b;
import android.accounts.Account;
import android.accounts.AccountManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6159e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<AccountManager> f61539a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Fb0.f f61540b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<Hb0.c> f61541c;

    public C6159e(@NotNull Fb0.f ozonIdConfig, @NotNull InterfaceC4008j accountManager, @NotNull InterfaceC4008j featureFlagsStore) {
        Intrinsics.checkNotNullParameter(accountManager, "accountManager");
        Intrinsics.checkNotNullParameter(ozonIdConfig, "ozonIdConfig");
        Intrinsics.checkNotNullParameter(featureFlagsStore, "featureFlagsStore");
        this.f61539a = accountManager;
        this.f61540b = ozonIdConfig;
        this.f61541c = featureFlagsStore;
    }

    private final Account b(boolean z11) {
        Fb0.f fVar;
        Account account;
        InterfaceC4008j<AccountManager> interfaceC4008j = this.f61539a;
        try {
            Account[] accountsByType = interfaceC4008j.getValue().getAccountsByType("ru.ozon.id.authorized.account");
            Intrinsics.checkNotNullExpressionValue(accountsByType, "getAccountsByType(...)");
            int length = accountsByType.length;
            int i11 = 0;
            while (true) {
                fVar = this.f61540b;
                if (i11 >= length) {
                    account = null;
                    break;
                }
                account = accountsByType[i11];
                if (Intrinsics.d(account.name, fVar.getPrimaryDomain().n() ? "OZON ID Stage" : "OZON ID")) {
                    break;
                }
                i11++;
            }
        } catch (RuntimeException e11) {
            if (((Boolean) this.f61541c.getValue().b(f.j.f10807a)).booleanValue()) {
                b.a.f(Vb0.b.f28514a, "Account manager not available", e11);
            }
        }
        if (account != null) {
            return account;
        }
        if (z11) {
            interfaceC4008j.getValue().addAccountExplicitly(new Account(fVar.getPrimaryDomain().n() ? "OZON ID Stage" : "OZON ID", "ru.ozon.id.authorized.account"), null, null);
            Account b11 = b(false);
            if (b11 != null) {
                return b11;
            }
            throw new IllegalStateException("Unexpected account manager behaviour!");
        }
        return null;
    }

    public final Account a() {
        return b(true);
    }
}
