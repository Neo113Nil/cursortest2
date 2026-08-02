package com.vk.stickers.settings.popup;

import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import xsna.ao50;
import xsna.gm50;
import xsna.km50;
import xsna.kn20;
import xsna.kxb0;
import xsna.mk50;
import xsna.mxb0;
import xsna.nxb0;
import xsna.oz50;
import xsna.q130;
import xsna.qxb0;
import xsna.rxb0;
import xsna.sxb0;
import xsna.txb0;
import xsna.vk50;
import xsna.zb60;

/* compiled from: PopupSettingsFragment.kt */
/* loaded from: classes6.dex */
public final class PopupSettingsFragment extends MviImplFragment<mxb0, txb0, kxb0> {
    public static final /* synthetic */ int R = 0;
    public sxb0 Q;

    /* compiled from: PopupSettingsFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        sxb0 sxb0Var = new sxb0(requireContext(), getViewLifecycleOwner(), new kn20(this, 24));
        this.Q = sxb0Var;
        return new mk50.c(sxb0Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        txb0 txb0Var = (txb0) ao50Var;
        sxb0 sxb0Var = this.Q;
        if (sxb0Var != null) {
            gm50.a.b(sxb0Var, txb0Var.a, new q130(sxb0Var, 16));
            gm50.a.b(sxb0Var, txb0Var.b, new zb60(sxb0Var, 10));
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new mxb0(new nxb0(), new qxb0(rxb0.b.b));
    }
}
