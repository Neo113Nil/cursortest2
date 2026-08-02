package ru.ozon.app.android.fintech;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.lifecycle.FintechActivityLifecycleCallback;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fintech/FintechDependenciesModule;", "", "<init>", "()V", "provideFintechActivityLifecycleCallback", "Lru/ozon/app/android/bank/lifecycle/FintechActivityLifecycleCallback;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FintechDependenciesModule {
    @NotNull
    public final FintechActivityLifecycleCallback provideFintechActivityLifecycleCallback() {
        return new FintechActivityLifecycleCallback();
    }
}
