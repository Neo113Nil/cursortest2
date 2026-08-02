package ru.ozon.app.android.platform.bundle.state;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/StubManualStateBundleDelegate;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "<init>", "()V", "restoreState", "Landroid/os/Bundle;", "savedBundle", "classLoader", "Ljava/lang/ClassLoader;", "saveState", "", "outState", "screenGuid", "", "cloneAndFlush", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StubManualStateBundleDelegate implements ManualStateBundleDelegate {

    @NotNull
    public static final StubManualStateBundleDelegate INSTANCE = new StubManualStateBundleDelegate();

    private StubManualStateBundleDelegate() {
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate
    public Bundle cloneAndFlush(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
        if (bundleDebugUtils.isRemoteErrorLoggingEnabled()) {
            bundleDebugUtils.getLogger().f(c.INFO, "BundleDebugErrorLogger - StubManualStateBundleDelegate#cloneAndFlush log from stub", null, Boolean.FALSE);
        }
        return null;
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate
    public Bundle restoreState(Bundle savedBundle, @NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
        if (bundleDebugUtils.isRemoteErrorLoggingEnabled()) {
            bundleDebugUtils.getLogger().f(c.INFO, "BundleDebugErrorLogger - StubManualStateBundleDelegate#restoreState log from stub", null, Boolean.FALSE);
        }
        return null;
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate
    public boolean saveState(@NotNull Bundle outState, @NotNull String screenGuid) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(screenGuid, "screenGuid");
        BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
        if (!bundleDebugUtils.isRemoteErrorLoggingEnabled()) {
            return false;
        }
        bundleDebugUtils.getLogger().f(c.INFO, "BundleDebugErrorLogger - StubManualStateBundleDelegate#saveState log from stub", null, Boolean.FALSE);
        return false;
    }
}
