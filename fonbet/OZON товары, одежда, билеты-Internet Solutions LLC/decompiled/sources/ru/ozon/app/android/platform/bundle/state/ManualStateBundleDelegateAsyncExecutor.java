package ru.ozon.app.android.platform.bundle.state;

import He.b;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.platform.bundle.state.ManualStateBundleDelegate;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegateAsyncExecutor;", "Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "delegate", "<init>", "(Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;)V", "Landroid/os/Bundle;", "savedBundle", "Ljava/lang/ClassLoader;", "classLoader", "restoreState", "(Landroid/os/Bundle;Ljava/lang/ClassLoader;)Landroid/os/Bundle;", "outState", "", "screenGuid", "", "saveState", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "Lxe/M;", "scope", "Lxe/M;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManualStateBundleDelegateAsyncExecutor implements ManualStateBundleDelegate {

    @NotNull
    private final ManualSaveRestoreStateDelegate delegate;

    @NotNull
    private final M scope;

    public ManualStateBundleDelegateAsyncExecutor(@NotNull ManualSaveRestoreStateDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(b.f10879b);
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
        if (string == null || h.K(string)) {
            return false;
        }
        C10727i.c(this.scope, null, null, new ManualStateBundleDelegateAsyncExecutor$saveState$1(this, outState, string, screenGuid, null), 3);
        return true;
    }
}
