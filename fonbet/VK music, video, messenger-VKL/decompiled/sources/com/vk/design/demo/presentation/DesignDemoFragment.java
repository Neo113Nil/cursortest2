package com.vk.design.demo.presentation;

import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.fpf0;
import xsna.h3m;
import xsna.i3m;
import xsna.ifg;
import xsna.km50;
import xsna.mk50;
import xsna.nf3;
import xsna.oz50;
import xsna.p99;
import xsna.qcy;
import xsna.r3m;
import xsna.vk50;
import xsna.y3m;

/* compiled from: DesignDemoFragment.kt */
/* loaded from: classes18.dex */
public final class DesignDemoFragment extends MviImplFragment<i3m, y3m, h3m> {
    public static final /* synthetic */ qcy<Object>[] S;
    public final nf3 Q = new nf3();
    public boolean R;

    /* compiled from: DesignDemoFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(DesignDemoFragment.class, "contentView", "getContentView()Lcom/vk/design/demo/presentation/DesignDemoMviView;", 0);
        fpf0.a.getClass();
        S = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        r3m r3mVar = new r3m(requireContext(), getViewLifecycleOwner());
        qcy<Object> qcyVar = S[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = r3mVar;
        return new mk50.c(((r3m) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((r3m) this.Q.getValue(this, S[0])).f((y3m) ao50Var, new p99(1, this, DesignDemoFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2));
        getFeature().f.a(new ifg(this, 5), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (this.R) {
            kn().getOnBackPressedDispatcher().d();
        }
        return this.R;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new i3m();
    }
}
