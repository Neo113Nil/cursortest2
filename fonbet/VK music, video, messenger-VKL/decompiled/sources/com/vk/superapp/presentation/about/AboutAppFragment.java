package com.vk.superapp.presentation.about;

import android.os.Bundle;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.movika.sdk.base.ui.f;
import com.vk.movika.sdk.base.ui.g;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.superapp.di.AboutAppComponent;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bpn0;
import xsna.fpf0;
import xsna.g1;
import xsna.h1;
import xsna.ies;
import xsna.j1;
import xsna.k7m;
import xsna.km50;
import xsna.l1;
import xsna.m1;
import xsna.m7m;
import xsna.mk50;
import xsna.n1;
import xsna.nf3;
import xsna.p3;
import xsna.q1;
import xsna.qcy;
import xsna.u0;
import xsna.v2;
import xsna.vk50;
import xsna.vq;
import xsna.w8i;
import xsna.xds;

/* compiled from: AboutAppFragment.kt */
/* loaded from: classes6.dex */
public final class AboutAppFragment extends MviImplFragment<g1, p3, u0> implements w8i, ies, xds {
    public static final /* synthetic */ qcy<Object>[] X;
    public final bpn0 Q = new bpn0(new j1(this, 0));
    public final bpn0 R = new bpn0(new f(this, 1));
    public final bpn0 S = new bpn0(new l1(this, 0));
    public final bpn0 T = new bpn0(new g(this, 1));
    public final bpn0 U = new bpn0(new m1(this, 0));
    public final bpn0 V = new bpn0(new n1(0));
    public final nf3 W = new nf3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(AboutAppFragment.class, "contentView", "getContentView()Lcom/vk/superapp/presentation/about/compose/AboutAppStateContentView;", 0);
        fpf0.a.getClass();
        X = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        v2 v2Var = new v2(requireContext(), this);
        vq.b(-1, -1, v2Var.d);
        qcy<Object> qcyVar = X[0];
        nf3 nf3Var = this.W;
        nf3Var.c = v2Var;
        return new mk50.c(((v2) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((v2) this.W.getValue(this, X[0])).f((p3) ao50Var, new q1(1, this, AboutAppFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        g1 g1Var = (g1) vk50Var;
        g1Var.j.a(new h1(0, this, g1Var), this);
    }

    @Override // xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new g1(((Number) this.Q.getValue()).intValue(), ((Boolean) this.R.getValue()).booleanValue(), ((AboutAppComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(AboutAppComponent.class))).e6());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = ((Boolean) this.R.getValue()).booleanValue() ? MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP_UNVERIFIED_LAUNCH : MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP_ABOUT;
        uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MINI_APP, Long.valueOf(((Number) this.Q.getValue()).intValue()), null, null, null, null, 60, null);
    }
}
