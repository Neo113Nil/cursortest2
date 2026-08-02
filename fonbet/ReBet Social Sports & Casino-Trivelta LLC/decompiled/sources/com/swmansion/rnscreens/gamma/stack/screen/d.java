package com.swmansion.rnscreens.gamma.stack.screen;

import L2.C1387l;
import Sc.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC2193s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends Fragment {

    /* renamed from: m, reason: collision with root package name */
    public final b f41858m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f41859n;

    /* renamed from: o, reason: collision with root package name */
    public StackScreenAppearanceEventsEmitter f41860o;

    /* renamed from: p, reason: collision with root package name */
    public PreventNativeDismissCallback f41861p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f41862q;

    public d(b stackScreen, boolean z10) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f41858m = stackScreen;
        this.f41859n = z10;
    }

    public final PreventNativeDismissCallback d0() {
        PreventNativeDismissCallback preventNativeDismissCallback = this.f41861p;
        if (preventNativeDismissCallback != null) {
            return preventNativeDismissCallback;
        }
        throw new IllegalStateException("[RNScreens] Attempt to require nullish OnBackPressedCallback");
    }

    public final b e0() {
        return this.f41858m;
    }

    public final void f0() {
        if (this.f41862q) {
            return;
        }
        this.f41862q = true;
        d0().d(true);
    }

    public final void g0() {
        if (this.f41862q) {
            this.f41862q = false;
            d0().d(false);
        }
    }

    public final void h0() {
        this.f41861p = new PreventNativeDismissCallback(this, this.f41858m, false);
        requireActivity().getOnBackPressedDispatcher().h(d0());
    }

    public final void j0() {
        d0().remove();
        this.f41861p = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0();
        setAllowEnterTransitionOverlap(true);
        setAllowReturnTransitionOverlap(true);
        setEnterTransition(new C1387l(5));
        setExitTransition(new C1387l(3));
        setReturnTransition(new C1387l(5));
        setReenterTransition(new C1387l(3));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        return new l(requireContext, this.f41858m, this.f41859n);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f41858m.f();
        j0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f41860o = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        b bVar = this.f41858m;
        InterfaceC2193s viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f41860o = bVar.b(viewLifecycleOwner);
    }
}
