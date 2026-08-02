package ru.ozon.app.android.bank.di;

import Jb.e;
import Jb.j;
import O30.b;

/* loaded from: classes6.dex */
public final class FintechPayModule_ProvideFintechLibTypeFactory implements e<b> {
    private final FintechPayModule module;

    public FintechPayModule_ProvideFintechLibTypeFactory(FintechPayModule fintechPayModule) {
        this.module = fintechPayModule;
    }

    public static FintechPayModule_ProvideFintechLibTypeFactory create(FintechPayModule fintechPayModule) {
        return new FintechPayModule_ProvideFintechLibTypeFactory(fintechPayModule);
    }

    public static b provideFintechLibType(FintechPayModule fintechPayModule) {
        b provideFintechLibType = fintechPayModule.provideFintechLibType();
        j.d(provideFintechLibType);
        return provideFintechLibType;
    }

    @Override // Pc.a
    public b get() {
        return provideFintechLibType(this.module);
    }
}
