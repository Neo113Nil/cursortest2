package ru.ozon.app.android.account.orders.core;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.platform.orientation.ScreenOrientationDelegate;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/orders/core/OrientationLockConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;", "screenOrientationDelegate", "<init>", "(Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;)V", "Landroidx/lifecycle/J;", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "Lru/ozon/app/android/platform/orientation/ScreenOrientationDelegate;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrientationLockConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final ScreenOrientationDelegate screenOrientationDelegate;

    public OrientationLockConfigurator(@NotNull ScreenOrientationDelegate screenOrientationDelegate) {
        Intrinsics.checkNotNullParameter(screenOrientationDelegate, "screenOrientationDelegate");
        this.screenOrientationDelegate = screenOrientationDelegate;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.screenOrientationDelegate.requestTabletOrientation(getContainer().i());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.screenOrientationDelegate.requestOrientation(getContainer().i());
    }
}
