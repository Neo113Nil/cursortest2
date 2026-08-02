package com.vk.donut.privacy.levels;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.donut.DonutLevel;
import com.vk.mvi.androidx.MviImplFragment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.by20;
import xsna.f4z;
import xsna.fpf0;
import xsna.hk70;
import xsna.ic1;
import xsna.km50;
import xsna.mdd0;
import xsna.mk50;
import xsna.msy;
import xsna.nf3;
import xsna.o1g;
import xsna.oz50;
import xsna.qcy;
import xsna.tdd0;
import xsna.udd0;
import xsna.vk50;
import xsna.xcd0;

/* compiled from: PrivacyEditDonutLevelsFragment.kt */
/* loaded from: classes18.dex */
public final class PrivacyEditDonutLevelsFragment extends MviImplFragment<mdd0, udd0, xcd0> {
    public static final /* synthetic */ qcy<Object>[] T;
    public final nf3 Q = new nf3();
    public final Object R;
    public final Object S;

    /* compiled from: PrivacyEditDonutLevelsFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(PrivacyEditDonutLevelsFragment.class, "contentView", "getContentView()Lcom/vk/donut/privacy/levels/PrivacyEditDonutLevelsView;", 0);
        fpf0.a.getClass();
        T = new qcy[]{mutablePropertyReference1Impl};
    }

    public PrivacyEditDonutLevelsFragment() {
        hk70 hk70Var = new hk70(this, 10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, hk70Var);
        this.S = msy.a(lazyThreadSafetyMode, new by20(this, 20));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        tdd0 tdd0Var = new tdd0(requireContext(), getViewLifecycleOwner());
        qcy<Object> qcyVar = T[0];
        nf3 nf3Var = this.Q;
        nf3Var.c = tdd0Var;
        return new mk50.c(((tdd0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((tdd0) this.Q.getValue(this, T[0])).f((udd0) ao50Var, new o1g(1, this, PrivacyEditDonutLevelsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f4z) ((mdd0) vk50Var).f.b).a(new ic1(1, this, PrivacyEditDonutLevelsFragment.class, "handleSideEffect", "handleSideEffect(Lcom/vk/donut/privacy/levels/action/PrivacyEditDonutLevelsSideEffect;)V", 0, 9), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(xcd0.a.C3994a.b);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        ?? r2 = this.S;
        if (((List) r2.getValue()).isEmpty()) {
            Mf(0, null);
        }
        return new mdd0((DonutLevel) this.R.getValue(), (List) r2.getValue());
    }
}
