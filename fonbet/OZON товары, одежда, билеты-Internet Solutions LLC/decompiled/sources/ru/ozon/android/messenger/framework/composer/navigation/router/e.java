package ru.ozon.android.messenger.framework.composer.navigation.router;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.navigation.h;

/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ComponentCallbacksC5392m> f86738a;

    @Override // ru.ozon.android.messenger.framework.composer.navigation.router.c
    public final void a(@NotNull ru.ozon.android.messenger.framework.presentation.messenger.c rootFragment) {
        Intrinsics.checkNotNullParameter(rootFragment, "rootFragment");
        this.f86738a = new WeakReference<>(rootFragment);
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.router.c
    public final void b(@NotNull ru.ozon.android.messenger.framework.composer.navigation.e destination) {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        Intrinsics.checkNotNullParameter(destination, "destination");
        h navigator = destination.getNavigator();
        WeakReference<ComponentCallbacksC5392m> weakReference = this.f86738a;
        if (weakReference == null || (componentCallbacksC5392m = weakReference.get()) == null) {
            return;
        }
        AbstractC5434v lifecycle = componentCallbacksC5392m.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        if (!lifecycle.b().a(AbstractC5434v.b.STARTED)) {
            lifecycle.a(new d(lifecycle, componentCallbacksC5392m, navigator, destination));
        } else if (componentCallbacksC5392m.isAdded()) {
            G childFragmentManager = componentCallbacksC5392m.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            navigator.a(destination, childFragmentManager);
        }
    }

    @Override // ru.ozon.android.messenger.framework.composer.navigation.router.c
    public final ComponentCallbacksC5392m getCurrentFragment() {
        ComponentCallbacksC5392m componentCallbacksC5392m;
        G childFragmentManager;
        int l02;
        WeakReference<ComponentCallbacksC5392m> weakReference = this.f86738a;
        if (weakReference == null || (componentCallbacksC5392m = weakReference.get()) == null || (childFragmentManager = componentCallbacksC5392m.getChildFragmentManager()) == null || (l02 = childFragmentManager.l0()) == 0) {
            return null;
        }
        return childFragmentManager.g0(childFragmentManager.k0(l02 - 1).getName());
    }
}
