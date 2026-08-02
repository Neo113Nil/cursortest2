package ru.ozon.app.android.navigation.miniapp;

import BZ.h;
import androidx.lifecycle.InterfaceC5431s;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import fk0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationStateListener;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.navigation.newrouter.ui.TranslateAnimationState;
import ru.ozon.uni.atoms.af.pool.CacheHolder;
import ru.ozon.uni.atoms.af.pool.RecycledAtomPool;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/navigation/miniapp/MiniAppHostFragment;", "LBZ/h;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "Lru/ozon/uni/atoms/af/pool/CacheHolder;", "<init>", "()V", "getBottomNavigationStateController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "getBottomNavigationAnimationController", "()Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationController;", "", "showBottomNavigation", "hideBottomNavigation", "", "duration", "showBottomNavigationWithAnimation", "(J)V", "hideBottomNavigationWithAnimation", "showBottomNavigationWithTranslationAnimation", "hideBottomNavigationWithTranslationAnimation", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "(Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationAnimationStateListener;)V", "removeListener", "Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "getBottomNavigationAnimationState", "()Lru/ozon/app/android/navigation/newrouter/ui/TranslateAnimationState;", "Lfk0/c;", "getViewPool", "()Lfk0/c;", "Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "getRecycledAtomPool", "()Lru/ozon/uni/atoms/af/pool/RecycledAtomPool;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MiniAppHostFragment extends h implements BottomNavigationStateController, BottomNavigationAnimationController, CacheHolder {
    private final BottomNavigationAnimationController getBottomNavigationAnimationController() {
        InterfaceC5431s w02 = getChildFragmentManager().w0();
        if (w02 instanceof BottomNavigationAnimationController) {
            return (BottomNavigationAnimationController) w02;
        }
        return null;
    }

    private final BottomNavigationStateController getBottomNavigationStateController() {
        InterfaceC5431s w02 = getChildFragmentManager().w0();
        if (w02 instanceof BottomNavigationStateController) {
            return (BottomNavigationStateController) w02;
        }
        return null;
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void addListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.addListener(listener);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    @NotNull
    public TranslateAnimationState getBottomNavigationAnimationState() {
        TranslateAnimationState bottomNavigationAnimationState;
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        return (bottomNavigationAnimationController == null || (bottomNavigationAnimationState = bottomNavigationAnimationController.getBottomNavigationAnimationState()) == null) ? TranslateAnimationState.NONE : bottomNavigationAnimationState;
    }

    @Override // ru.ozon.uni.atoms.af.pool.CacheHolder
    /* renamed from: getRecycledAtomPool */
    public final RecycledAtomPool getAtomPool() {
        if (getHost() == null) {
            return null;
        }
        InterfaceC5431s w02 = getChildFragmentManager().w0();
        CacheHolder cacheHolder = w02 instanceof CacheHolder ? (CacheHolder) w02 : null;
        if (cacheHolder != null) {
            return cacheHolder.getAtomPool();
        }
        return null;
    }

    @Override // fk0.d
    /* renamed from: getViewPool */
    public final c getPrefetchViewPool() {
        if (getHost() == null) {
            return null;
        }
        InterfaceC5431s w02 = getChildFragmentManager().w0();
        CacheHolder cacheHolder = w02 instanceof CacheHolder ? (CacheHolder) w02 : null;
        if (cacheHolder != null) {
            return cacheHolder.getPrefetchViewPool();
        }
        return null;
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigation() {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.hideBottomNavigation();
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void hideBottomNavigationWithAnimation(long duration) {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.hideBottomNavigationWithAnimation(duration);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void hideBottomNavigationWithTranslationAnimation(long duration) {
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.hideBottomNavigationWithTranslationAnimation(duration);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void removeListener(@NotNull BottomNavigationAnimationStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.removeListener(listener);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigation() {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.showBottomNavigation();
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController
    public void showBottomNavigationWithAnimation(long duration) {
        BottomNavigationStateController bottomNavigationStateController = getBottomNavigationStateController();
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.showBottomNavigationWithAnimation(duration);
        }
    }

    @Override // ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationAnimationController
    public void showBottomNavigationWithTranslationAnimation(long duration) {
        BottomNavigationAnimationController bottomNavigationAnimationController = getBottomNavigationAnimationController();
        if (bottomNavigationAnimationController != null) {
            bottomNavigationAnimationController.showBottomNavigationWithTranslationAnimation(duration);
        }
    }
}
