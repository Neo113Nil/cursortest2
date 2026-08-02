package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideExternalFintechAuthFactory implements e<ExternalFintechAuth> {
    private final FintechFinanceModule module;
    private final a<UserManager> userManagerProvider;

    public FintechFinanceModule_ProvideExternalFintechAuthFactory(FintechFinanceModule fintechFinanceModule, a<UserManager> aVar) {
        this.module = fintechFinanceModule;
        this.userManagerProvider = aVar;
    }

    public static FintechFinanceModule_ProvideExternalFintechAuthFactory create(FintechFinanceModule fintechFinanceModule, a<UserManager> aVar) {
        return new FintechFinanceModule_ProvideExternalFintechAuthFactory(fintechFinanceModule, aVar);
    }

    public static ExternalFintechAuth provideExternalFintechAuth(FintechFinanceModule fintechFinanceModule, UserManager userManager) {
        ExternalFintechAuth provideExternalFintechAuth = fintechFinanceModule.provideExternalFintechAuth(userManager);
        j.d(provideExternalFintechAuth);
        return provideExternalFintechAuth;
    }

    @Override // Pc.a
    public ExternalFintechAuth get() {
        return provideExternalFintechAuth(this.module, this.userManagerProvider.get());
    }
}
