package ru.ozon.app.android.initializers.bundle;

import He.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.bundle.state.BundleDebugUtils;
import ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate;
import ru.ozon.app.android.platform.di.module.CustomBundleSaveEnabled;
import ru.ozon.app.android.platform.di.module.CustomBundleSaveLoggingEnabled;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/initializers/bundle/CleanCustomBundleStateActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "delegate", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureService", "<init>", "(Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "", "init", "()V", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lxe/M;", "coroutineScope", "Lxe/M;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CleanCustomBundleStateActionInitializer implements ActionInitializer {

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final ManualSaveRestoreStateDelegate delegate;

    @NotNull
    private final FeatureChecker featureService;

    public CleanCustomBundleStateActionInitializer(@NotNull ManualSaveRestoreStateDelegate delegate, @NotNull FeatureChecker featureService) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.delegate = delegate;
        this.featureService = featureService;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.coroutineScope = N.a(b.f10879b);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
        bundleDebugUtils.setRemoteErrorLoggingEnabled(this.featureService.isEnabled(CustomBundleSaveLoggingEnabled.INSTANCE));
        if (this.featureService.isEnabled(CustomBundleSaveEnabled.INSTANCE)) {
            C10727i.c(this.coroutineScope, null, null, new CleanCustomBundleStateActionInitializer$init$2(this, null), 3);
        } else if (bundleDebugUtils.isRemoteErrorLoggingEnabled()) {
            bundleDebugUtils.getLogger().f(c.INFO, "BundleDebugErrorLogger - main flag is disabled", null, Boolean.FALSE);
        }
    }
}
