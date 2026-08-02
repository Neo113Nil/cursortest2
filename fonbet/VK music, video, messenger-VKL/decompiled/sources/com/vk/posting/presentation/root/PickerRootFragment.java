package com.vk.posting.presentation.root;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.posting.presentation.model.PickerRootParams;
import kotlin.LazyThreadSafetyMode;
import xsna.Cnew;
import xsna.ao50;
import xsna.bpn0;
import xsna.f4z;
import xsna.fhc0;
import xsna.fia0;
import xsna.fjl;
import xsna.gia0;
import xsna.hia0;
import xsna.iia0;
import xsna.kia0;
import xsna.km50;
import xsna.m130;
import xsna.mk50;
import xsna.msy;
import xsna.nia0;
import xsna.oga0;
import xsna.oz50;
import xsna.pr6;
import xsna.qia0;
import xsna.ria0;
import xsna.rop;
import xsna.ux40;
import xsna.vk50;
import xsna.w8i;

/* compiled from: PickerRootFragment.kt */
/* loaded from: classes.dex */
public final class PickerRootFragment extends MviImplFragment<hia0, ria0, fia0> implements gia0, w8i {
    public static final /* synthetic */ int W = 0;
    public qia0 Q;
    public final kia0 R = new kia0();
    public final bpn0 S = new bpn0(new iia0(this, 0));
    public final bpn0 T = new bpn0(new Cnew(this, 25));
    public final bpn0 U = new bpn0(new m130(this, 17));
    public final Object V = msy.a(LazyThreadSafetyMode.NONE, new pr6(25));

    /* compiled from: PickerRootFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        qia0 qia0Var = new qia0(requireContext(), getViewLifecycleOwner(), (PickerRootParams) this.U.getValue(), this, this, (oga0) this.T.getValue(), new rop(this, 29));
        this.Q = qia0Var;
        return new mk50.c(qia0Var.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ria0 ria0Var = (ria0) ao50Var;
        qia0 qia0Var = this.Q;
        if (qia0Var == null) {
            qia0Var = null;
        }
        qia0Var.c(ria0Var);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((f4z) ((hia0) vk50Var).U()).a(new ux40(this, 14), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        qia0 qia0Var = this.Q;
        if (qia0Var == null) {
            qia0Var = null;
        }
        qia0Var.a();
        fo().d(this);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final fjl fo() {
        return (fjl) this.V.getValue();
    }

    @Override // xsna.gia0
    public final void kh() {
        fo().kh();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 != -1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i == 44) {
            if (intent != null) {
                fo().c(intent);
            }
            if (intent != null) {
                fo().e(intent);
            }
            Mf(-1, intent);
            return;
        }
        if (i != 45) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (intent != null) {
            fo().c(intent);
        }
        if (intent != null) {
            fo().e(intent);
        }
        Mf(-1, intent);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            fo().a(bundle);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        qia0 qia0Var = this.Q;
        if (qia0Var == null) {
            qia0Var = null;
        }
        qia0Var.b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        fo().b(bundle);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new hia0(new nia0((PickerRootParams) this.U.getValue()), (fhc0.b) this.S.getValue());
    }
}
