package com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding;

import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import xsna.ao50;
import xsna.bpn0;
import xsna.f4z;
import xsna.km50;
import xsna.kzb0;
import xsna.mk50;
import xsna.o67;
import xsna.vds;
import xsna.vk50;
import xsna.w67;
import xsna.w8i;
import xsna.zy;

/* compiled from: BiometricsLockOnboardingFragment.kt */
/* loaded from: classes.dex */
public final class BiometricsLockOnboardingFragment extends MviImplFragment<b, w67, a> implements w8i, vds {
    public static final /* synthetic */ int T = 0;
    public final /* synthetic */ kzb0 Q = new kzb0();
    public final bpn0 R = new bpn0(new zy(this, 9));
    public g S;

    @Override // xsna.xn50
    public final mk50 Fl() {
        g gVar = new g(requireContext(), getViewLifecycleOwner());
        this.S = gVar;
        return new mk50.c(gVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        w67 w67Var = (w67) ao50Var;
        g gVar = this.S;
        if (gVar != null) {
            gVar.f(w67Var, new o67(getFeature()));
        }
        ((f4z) getFeature().U()).a(new com.vk.movika.sdk.base.observable.c(this, 11), this);
    }

    @Override // xsna.vds
    public final int Q0() {
        return this.Q.Q0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.S = null;
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b();
    }
}
