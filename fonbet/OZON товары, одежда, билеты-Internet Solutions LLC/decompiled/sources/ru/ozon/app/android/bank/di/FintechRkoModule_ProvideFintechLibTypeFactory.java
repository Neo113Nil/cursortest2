package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import O30.b;

/* loaded from: classes6.dex */
public final class FintechRkoModule_ProvideFintechLibTypeFactory implements e<b> {
    private final FintechRkoModule module;

    public FintechRkoModule_ProvideFintechLibTypeFactory(FintechRkoModule fintechRkoModule) {
        this.module = fintechRkoModule;
    }

    public static FintechRkoModule_ProvideFintechLibTypeFactory create(FintechRkoModule fintechRkoModule) {
        return new FintechRkoModule_ProvideFintechLibTypeFactory(fintechRkoModule);
    }

    public static b provideFintechLibType(FintechRkoModule fintechRkoModule) {
        b provideFintechLibType = fintechRkoModule.provideFintechLibType();
        j.d(provideFintechLibType);
        return provideFintechLibType;
    }

    @Override // Pc.a
    public b get() {
        return provideFintechLibType(this.module);
    }
}
