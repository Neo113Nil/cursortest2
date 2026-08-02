package ru.ozon.app.android.platform.bundle.state;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.di.module.AsyncCustomBundleStateEnabled;
import ru.ozon.app.android.platform.di.module.CustomBundleSaveEnabled;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegateProvider;", "", "featureChecker", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "delegate", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureChecker;Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;)V", "get", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManualStateBundleDelegateProvider {

    @NotNull
    private final ManualSaveRestoreStateDelegate delegate;

    @NotNull
    private final FeatureChecker featureChecker;

    public ManualStateBundleDelegateProvider(@NotNull FeatureChecker featureChecker, @NotNull ManualSaveRestoreStateDelegate delegate) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.featureChecker = featureChecker;
        this.delegate = delegate;
    }

    @NotNull
    public final ManualStateBundleDelegate get() {
        return !this.featureChecker.isEnabled(CustomBundleSaveEnabled.INSTANCE) ? StubManualStateBundleDelegate.INSTANCE : this.featureChecker.isEnabled(AsyncCustomBundleStateEnabled.INSTANCE) ? new ManualStateBundleDelegateAsyncExecutor(this.delegate) : new ManualStateBundleDelegateSyncExecutor(this.delegate);
    }
}
