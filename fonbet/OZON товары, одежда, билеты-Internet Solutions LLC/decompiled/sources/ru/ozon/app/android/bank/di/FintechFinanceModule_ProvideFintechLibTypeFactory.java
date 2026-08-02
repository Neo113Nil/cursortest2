package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import O30.b;

/* loaded from: classes6.dex */
public final class FintechFinanceModule_ProvideFintechLibTypeFactory implements e<b> {
    private final FintechFinanceModule module;

    public FintechFinanceModule_ProvideFintechLibTypeFactory(FintechFinanceModule fintechFinanceModule) {
        this.module = fintechFinanceModule;
    }

    public static FintechFinanceModule_ProvideFintechLibTypeFactory create(FintechFinanceModule fintechFinanceModule) {
        return new FintechFinanceModule_ProvideFintechLibTypeFactory(fintechFinanceModule);
    }

    public static b provideFintechLibType(FintechFinanceModule fintechFinanceModule) {
        b provideFintechLibType = fintechFinanceModule.provideFintechLibType();
        j.d(provideFintechLibType);
        return provideFintechLibType;
    }

    @Override // Pc.a
    public b get() {
        return provideFintechLibType(this.module);
    }
}
