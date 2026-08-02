package ru.ozon.app.android.fintech;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.bank.lifecycle.FintechActivityLifecycleCallback;

/* loaded from: classes6.dex */
public final class FintechDependenciesModule_ProvideFintechActivityLifecycleCallbackFactory implements e<FintechActivityLifecycleCallback> {
    public static FintechActivityLifecycleCallback provideFintechActivityLifecycleCallback(FintechDependenciesModule fintechDependenciesModule) {
        FintechActivityLifecycleCallback provideFintechActivityLifecycleCallback = fintechDependenciesModule.provideFintechActivityLifecycleCallback();
        j.d(provideFintechActivityLifecycleCallback);
        return provideFintechActivityLifecycleCallback;
    }
}
