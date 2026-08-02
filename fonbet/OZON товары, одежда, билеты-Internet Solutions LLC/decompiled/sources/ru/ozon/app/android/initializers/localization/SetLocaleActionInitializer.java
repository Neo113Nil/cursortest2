package ru.ozon.app.android.initializers.localization;

import Pc.a;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.localization.util.LocalizationActivityCallback;
import ru.ozon.app.android.initializers.localization.util.LocalizationSwitcher;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/initializers/localization/SetLocaleActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/app/Application;", "application", "Lru/ozon/app/android/initializers/localization/util/LocalizationSwitcher;", "localizationSwitcher", "LPc/a;", "Lru/ozon/app/android/initializers/localization/util/LocalizationActivityCallback;", "activityCallbackProvider", "<init>", "(Landroid/app/Application;Lru/ozon/app/android/initializers/localization/util/LocalizationSwitcher;LPc/a;)V", "", "init", "()V", "Landroid/app/Application;", "Lru/ozon/app/android/initializers/localization/util/LocalizationSwitcher;", "LPc/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SetLocaleActionInitializer implements ActionInitializer {

    @NotNull
    private final a<LocalizationActivityCallback> activityCallbackProvider;

    @NotNull
    private final Application application;

    @NotNull
    private final LocalizationSwitcher localizationSwitcher;

    public SetLocaleActionInitializer(@NotNull Application application, @NotNull LocalizationSwitcher localizationSwitcher, @NotNull a<LocalizationActivityCallback> activityCallbackProvider) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(localizationSwitcher, "localizationSwitcher");
        Intrinsics.checkNotNullParameter(activityCallbackProvider, "activityCallbackProvider");
        this.application = application;
        this.localizationSwitcher = localizationSwitcher;
        this.activityCallbackProvider = activityCallbackProvider;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.localizationSwitcher.updateToSavedLocale(this.application);
        this.application.registerActivityLifecycleCallbacks(this.activityCallbackProvider.get());
    }
}
