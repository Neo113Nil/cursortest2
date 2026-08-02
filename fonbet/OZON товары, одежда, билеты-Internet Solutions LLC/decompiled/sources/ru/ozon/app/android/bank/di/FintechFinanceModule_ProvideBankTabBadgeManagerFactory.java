package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import android.content.Context;
import com.squareup.moshi.Moshi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.bank.domain.BankTabBadgeManager;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideBankTabBadgeManagerFactory implements e<BankTabBadgeManager> {
    private final a<ActionV2Repository> actionV2RepositoryProvider;
    private final a<Context> contextProvider;
    private final FintechFinanceModule module;
    private final a<Moshi> moshiProvider;
    private final a<UserManager> userManagerProvider;

    public FintechFinanceModule_ProvideBankTabBadgeManagerFactory(FintechFinanceModule fintechFinanceModule, a<ActionV2Repository> aVar, a<UserManager> aVar2, a<Context> aVar3, a<Moshi> aVar4) {
        this.module = fintechFinanceModule;
        this.actionV2RepositoryProvider = aVar;
        this.userManagerProvider = aVar2;
        this.contextProvider = aVar3;
        this.moshiProvider = aVar4;
    }

    public static FintechFinanceModule_ProvideBankTabBadgeManagerFactory create(FintechFinanceModule fintechFinanceModule, a<ActionV2Repository> aVar, a<UserManager> aVar2, a<Context> aVar3, a<Moshi> aVar4) {
        return new FintechFinanceModule_ProvideBankTabBadgeManagerFactory(fintechFinanceModule, aVar, aVar2, aVar3, aVar4);
    }

    public static BankTabBadgeManager provideBankTabBadgeManager(FintechFinanceModule fintechFinanceModule, ActionV2Repository actionV2Repository, UserManager userManager, Context context, Moshi moshi) {
        BankTabBadgeManager provideBankTabBadgeManager = fintechFinanceModule.provideBankTabBadgeManager(actionV2Repository, userManager, context, moshi);
        j.d(provideBankTabBadgeManager);
        return provideBankTabBadgeManager;
    }

    @Override // Pc.a
    public BankTabBadgeManager get() {
        return provideBankTabBadgeManager(this.module, this.actionV2RepositoryProvider.get(), this.userManagerProvider.get(), this.contextProvider.get(), this.moshiProvider.get());
    }
}
