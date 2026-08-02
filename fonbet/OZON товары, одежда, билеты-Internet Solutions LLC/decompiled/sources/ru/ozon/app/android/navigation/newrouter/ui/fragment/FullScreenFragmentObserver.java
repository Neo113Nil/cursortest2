package ru.ozon.app.android.navigation.newrouter.ui.fragment;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qZ.C9011c;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/ui/fragment/FullScreenFragmentObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "bottomNavigationStateController", "", "withAnimation", "", "animationDuration", "<init>", "(Landroidx/lifecycle/J;Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;ZJ)V", "owner", "", "onStart", "(Landroidx/lifecycle/J;)V", "onStop", "onDestroy", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Z", "J", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FullScreenFragmentObserver implements DefaultLifecycleObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long animationDuration;

    @NotNull
    private final BottomNavigationStateController bottomNavigationStateController;

    @NotNull
    private final J lifecycleOwner;
    private final boolean withAnimation;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/ui/fragment/FullScreenFragmentObserver$Companion;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "fragment", "", "isInFlow", "(Landroidx/fragment/app/m;)Z", "withAnimation", "", "animationDuration", "", "showFullScreen", "(Landroidx/fragment/app/m;ZJ)V", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean isInFlow(ComponentCallbacksC5392m fragment) {
            while (!(fragment instanceof C9011c)) {
                fragment = fragment.getParentFragment();
                if (fragment == null) {
                    return false;
                }
            }
            return true;
        }

        public static /* synthetic */ void showFullScreen$default(Companion companion, ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            if ((i11 & 4) != 0) {
                j11 = 250;
            }
            companion.showFullScreen(componentCallbacksC5392m, z11, j11);
        }

        public final void showFullScreen(@NotNull ComponentCallbacksC5392m fragment, boolean withAnimation, long animationDuration) {
            BottomNavigationStateController bottomNavigationStateController;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            if (isInFlow(fragment)) {
                return;
            }
            ComponentCallbacksC5392m componentCallbacksC5392m = fragment;
            BottomNavigationStateController bottomNavigationStateController2 = null;
            while (true) {
                if (bottomNavigationStateController2 != null) {
                    bottomNavigationStateController = bottomNavigationStateController2;
                    break;
                }
                if ((componentCallbacksC5392m != null ? componentCallbacksC5392m.getParentFragment() : null) == null) {
                    bottomNavigationStateController = null;
                    break;
                }
                InterfaceC5431s parentFragment = componentCallbacksC5392m.getParentFragment();
                if (!(parentFragment instanceof BottomNavigationStateController)) {
                    parentFragment = null;
                }
                bottomNavigationStateController2 = (BottomNavigationStateController) parentFragment;
                componentCallbacksC5392m = componentCallbacksC5392m.getParentFragment();
            }
            if (bottomNavigationStateController != null) {
                fragment.getLifecycle().a(new FullScreenFragmentObserver(fragment, bottomNavigationStateController, withAnimation, animationDuration, null));
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ FullScreenFragmentObserver(J j11, BottomNavigationStateController bottomNavigationStateController, boolean z11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, bottomNavigationStateController, z11, j12);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.lifecycleOwner.getLifecycle().e(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.withAnimation) {
            this.bottomNavigationStateController.hideBottomNavigationWithAnimation(this.animationDuration);
        } else {
            this.bottomNavigationStateController.hideBottomNavigation();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (this.withAnimation) {
            this.bottomNavigationStateController.showBottomNavigationWithAnimation(this.animationDuration);
        } else {
            this.bottomNavigationStateController.showBottomNavigation();
        }
    }

    private FullScreenFragmentObserver(J j11, BottomNavigationStateController bottomNavigationStateController, boolean z11, long j12) {
        this.lifecycleOwner = j11;
        this.bottomNavigationStateController = bottomNavigationStateController;
        this.withAnimation = z11;
        this.animationDuration = j12;
    }
}
