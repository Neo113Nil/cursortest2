package ru.ozon.app.android.platform.bundle.state;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegateSyncExecutor;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "delegate", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "<init>", "(Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;)V", "restoreState", "Landroid/os/Bundle;", "savedBundle", "classLoader", "Ljava/lang/ClassLoader;", "saveState", "", "outState", "screenGuid", "", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ManualStateBundleDelegateSyncExecutor implements ManualStateBundleDelegate {

    @NotNull
    private final ManualSaveRestoreStateDelegate delegate;

    public ManualStateBundleDelegateSyncExecutor(@NotNull ManualSaveRestoreStateDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate
    public Bundle cloneAndFlush(@NotNull Bundle bundle) {
        return ManualStateBundleDelegate.DefaultImpls.cloneAndFlush(this, bundle);
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate
    public Bundle restoreState(Bundle savedBundle, @NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        return this.delegate.restoreState(savedBundle, classLoader);
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate
    public boolean saveState(@NotNull Bundle outState, @NotNull String screenGuid) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        Intrinsics.checkNotNullParameter(screenGuid, "screenGuid");
        String string = outState.getString("persisted_state_item_key");
        if (string == null) {
            return false;
        }
        return this.delegate.save(outState, string, screenGuid);
    }
}
