package com.vk.onboardingscreens.impl.recomthemes.presentation.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import xsna.ao50;
import xsna.bpn0;
import xsna.c63;
import xsna.dyq0;
import xsna.eyq0;
import xsna.f4z;
import xsna.fzq0;
import xsna.hyq0;
import xsna.km50;
import xsna.mk50;
import xsna.n9b;
import xsna.nm60;
import xsna.qyq0;
import xsna.syq0;
import xsna.tyq0;
import xsna.uyq0;
import xsna.vk50;
import xsna.vyq0;
import xsna.w8i;
import xsna.wj50;
import xsna.xn50;
import xsna.xyq0;

/* compiled from: UserRecomThemesFragment.kt */
/* loaded from: classes.dex */
public final class UserRecomThemesFragment extends MviImplFragment<hyq0, tyq0, dyq0> implements w8i {
    public static final /* synthetic */ int U = 0;
    public syq0 R;
    public final a Q = new a();
    public final bpn0 S = new bpn0(new uyq0(this, 0));
    public final bpn0 T = new bpn0(new nm60(this, 27));

    /* compiled from: UserRecomThemesFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c63.b {
        public a() {
        }

        @Override // xsna.c63.b
        public final void u() {
            UserRecomThemesFragment userRecomThemesFragment = UserRecomThemesFragment.this;
            userRecomThemesFragment.getClass();
            xn50.a.c(userRecomThemesFragment, dyq0.a.b);
        }

        @Override // xsna.c63.b
        public final void x(Activity activity) {
            UserRecomThemesFragment userRecomThemesFragment = UserRecomThemesFragment.this;
            userRecomThemesFragment.getClass();
            xn50.a.c(userRecomThemesFragment, dyq0.b.b);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        syq0 syq0Var = new syq0(requireContext(), getViewLifecycleOwner());
        this.R = syq0Var;
        ((xyq0) this.S.getValue()).j();
        return new mk50.c(syq0Var.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        tyq0 tyq0Var = (tyq0) ao50Var;
        syq0 syq0Var = this.R;
        if (syq0Var != null) {
            syq0Var.f(tyq0Var, new n9b(this));
        }
        wj50<qyq0> U2 = getFeature().U();
        f4z f4zVar = (f4z) U2;
        f4zVar.a(new vyq0(this, 0), getViewLifecycleOwner());
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        c63 c63Var = c63.a;
        c63.a(this.Q);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(eyq0.b);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.R = null;
        c63 c63Var = c63.a;
        c63.c(this.Q);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        xyq0 xyq0Var = (xyq0) this.S.getValue();
        bpn0 bpn0Var = this.T;
        return new hyq0(xyq0Var, new fzq0(((Boolean) bpn0Var.getValue()).booleanValue()), ((Boolean) bpn0Var.getValue()).booleanValue() ? "registrations_recom_themes" : "onboarding_recom_themes", ((Boolean) bpn0Var.getValue()).booleanValue());
    }
}
