package com.vk.storycamera.picker.template.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ajm0;
import xsna.ao50;
import xsna.bjm0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.d6m0;
import xsna.e3m;
import xsna.f4z;
import xsna.fpf0;
import xsna.gjm0;
import xsna.ikk0;
import xsna.irc0;
import xsna.km50;
import xsna.ksg0;
import xsna.ljm0;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.nds;
import xsna.ojm0;
import xsna.os30;
import xsna.oz50;
import xsna.rjm0;
import xsna.rvl0;
import xsna.sjm0;
import xsna.tbe0;
import xsna.vim0;
import xsna.vk50;
import xsna.wjm0;

/* compiled from: StoryTemplateFragment.kt */
/* loaded from: classes11.dex */
public final class StoryTemplateFragment extends MviImplFragment<ajm0, sjm0, vim0> implements nds {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R;
    public final bpn0 S;
    public final Object T;

    /* compiled from: StoryTemplateFragment.kt */
    /* loaded from: classes6.dex */
    public static final class a extends oz50 {
    }

    public StoryTemplateFragment() {
        ikk0 ikk0Var = new ikk0(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, ikk0Var);
        int i = 17;
        this.R = msy.a(lazyThreadSafetyMode, new tbe0(this, i));
        this.S = new bpn0(new irc0(this, i));
        this.T = msy.a(lazyThreadSafetyMode, new os30(this, 29));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(LayoutInflater.from(bwt0.u(requireContext())).inflate(R.layout.fragment_story_template, (ViewGroup) null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        new wjm0(view, this, getViewLifecycleOwner()).a((sjm0) ao50Var);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ajm0 ajm0Var = (ajm0) vk50Var;
        ((f4z) ajm0Var.U()).a(new bjm0(this, 0), this);
        ((f4z) ajm0Var.V()).a(new ksg0(this, 9), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    public final void fo(vim0 vim0Var) {
        getFeature().C(vim0Var);
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background_content, bwt0.u(requireContext()));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ((gjm0) this.T.getValue()).b(i, i2);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new ajm0(new ljm0(ojm0.a.a()), new rjm0((rvl0) this.S.getValue(), ((InfoBridgeComponent) m7m.d(this).a(fpf0.a(InfoBridgeComponent.class))).t().b()), new d6m0((StoryCameraParams) this.Q.getValue()));
    }
}
