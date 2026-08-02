package sZ;

import EZ.e;
import EZ.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import wZ.C10460b;
import wZ.C10461c;

/* loaded from: classes3.dex */
public final class d extends AbstractC9644b<c<?>> {

    public static final class a implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f98422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC5392m f98423b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f98424c;

        public a(ComponentCallbacksC5392m componentCallbacksC5392m, ComponentCallbacksC5392m componentCallbacksC5392m2, c cVar) {
            this.f98422a = componentCallbacksC5392m;
            this.f98423b = componentCallbacksC5392m2;
            this.f98424c = cVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f98422a.getLifecycle().e(this);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            InterfaceC8677a interfaceC8677a = (InterfaceC8677a) this.f98423b;
            c cVar = this.f98424c;
            interfaceC8677a.onAnchorReturn(cVar.getTag(), cVar.isAnchorRefreshRequired());
            this.f98422a.getLifecycle().e(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1.getName(), r10.getPath()) != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // sZ.AbstractC9644b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void navigateFragment(@NotNull g navigator, @NotNull e<c<?>> response, int i11) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        Integer containerId = navigator.getContainerId();
        if (containerId == null) {
            navigator.getActivity().finish();
            redirect(response, i11);
            return;
        }
        c<?> b11 = response.b();
        G fragmentManager = navigator.getFragmentManager();
        if (fragmentManager.l0() != 0 && b11.isAnchor()) {
            if (!b11.isAnchor() || !fragmentManager.U0(0, b11.getPath())) {
                G.k k02 = fragmentManager.k0(fragmentManager.l0() - 1);
                Intrinsics.checkNotNullExpressionValue(k02, "getBackStackEntryAt(...)");
            }
            ComponentCallbacksC5392m w02 = fragmentManager.w0();
            if (w02 instanceof InterfaceC8677a) {
                C10461c.a(w02).h0(b11.getTag());
                if (w02.getLifecycle().b().a(AbstractC5434v.b.STARTED)) {
                    ((InterfaceC8677a) w02).onAnchorReturn(b11.getTag(), b11.isAnchorRefreshRequired());
                    return;
                } else {
                    w02.getLifecycle().a(new a(w02, w02, b11));
                    return;
                }
            }
            return;
        }
        Integer requestCode = b11.getRequestCode();
        if (requestCode != null) {
            i11 = requestCode.intValue();
        }
        int intValue = containerId.intValue();
        for (ComponentCallbacksC5392m w03 = fragmentManager.w0(); w03 != null && !C10461c.a(w03).e0(); w03 = fragmentManager.w0()) {
            fragmentManager.S0();
        }
        ComponentCallbacksC5392m f02 = fragmentManager.f0(intValue);
        ComponentCallbacksC5392m fragment = b11.getFragment();
        Q p11 = fragmentManager.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction(...)");
        p11.t(b11.getTransitionAnimations().a(), b11.getTransitionAnimations().b(), b11.getTransitionAnimations().c(), b11.getTransitionAnimations().d());
        if (i11 > 0) {
            fragment.setTargetFragment(f02, i11);
        }
        if (b11.isReorderingAllowed()) {
            p11.w();
        }
        p11.r(intValue, fragment, b11.getTag());
        if (b11.getAddInBackStack()) {
            p11.g(b11.getPath());
        }
        p11.v(fragment);
        p11.i();
        fragmentManager.c0();
        C10460b a11 = C10461c.a(fragment);
        a11.h0(b11.getTag());
        a11.g0(b11.getAddFragmentToBackStack());
    }
}
