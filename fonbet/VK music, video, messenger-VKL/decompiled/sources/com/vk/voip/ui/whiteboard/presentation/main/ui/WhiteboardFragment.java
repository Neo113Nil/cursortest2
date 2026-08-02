package com.vk.voip.ui.whiteboard.presentation.main.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vkontakte.android.R;
import xsna.a201;
import xsna.ao50;
import xsna.bpn0;
import xsna.c4q0;
import xsna.evw0;
import xsna.flx0;
import xsna.fpf0;
import xsna.gm50;
import xsna.gvw0;
import xsna.ivw0;
import xsna.j8n0;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.oz50;
import xsna.plx0;
import xsna.sqf0;
import xsna.vds;
import xsna.vk50;
import xsna.w5k0;
import xsna.w8i;
import xsna.xsw0;
import xsna.z2v;
import xsna.z4t0;

/* compiled from: WhiteboardFragment.kt */
/* loaded from: classes7.dex */
public final class WhiteboardFragment extends MviImplFragment<plx0, b, flx0> implements w8i, vds {
    public static final /* synthetic */ int R = 0;
    public com.vk.voip.ui.whiteboard.presentation.main.ui.a Q;

    /* compiled from: WhiteboardFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_whiteboard);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gvw0 gvw0Var;
        b bVar = (b) ao50Var;
        FragmentManager childFragmentManager = getChildFragmentManager();
        xsw0 s4 = ((VoipCallComponent) ((k7m) m7m.f(this)).a(fpf0.a(VoipCallComponent.class))).s4();
        z2v z2vVar = new z2v(1, getFeature(), plx0.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0, 1);
        LayoutInflater.Factory kn = kn();
        evw0 evw0Var = kn instanceof evw0 ? (evw0) kn : null;
        if (evw0Var == null || (gvw0Var = evw0Var.getPermissions()) == null) {
            gvw0Var = new gvw0(requireContext(), new ivw0());
        }
        this.Q = new com.vk.voip.ui.whiteboard.presentation.main.ui.a(childFragmentManager, view, s4, gvw0Var, z2vVar);
        gm50.a.b(this, bVar.a, new c4q0(this, 13));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((plx0) vk50Var).k.a(new z4t0(this, 15), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.vk.voip.ui.whiteboard.presentation.main.ui.a aVar = this.Q;
        if (aVar != null) {
            aVar.d.dispose();
        }
        this.Q = null;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new plx0(a201.b().b(), new bpn0(new w5k0(14)), new bpn0(new j8n0(this, 29)), new bpn0(new sqf0(18)));
    }
}
