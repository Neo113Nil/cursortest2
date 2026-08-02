package com.vk.photos.root.presentation;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photos.root.tabs.PhotosRootTab;
import xsna.Cnew;
import xsna.ad0;
import xsna.ao50;
import xsna.bpn0;
import xsna.f4z;
import xsna.fju;
import xsna.ga40;
import xsna.gh1;
import xsna.gzv;
import xsna.h440;
import xsna.h7v;
import xsna.km50;
import xsna.m130;
import xsna.mk50;
import xsna.qfa0;
import xsna.s6y;
import xsna.too0;
import xsna.ux40;
import xsna.vk50;
import xsna.w8i;
import xsna.x4u;
import xsna.ysg0;

/* compiled from: PhotosRootFragment.kt */
/* loaded from: classes.dex */
public final class PhotosRootFragment extends MviImplFragment<b, i, a> implements too0, w8i {
    public static final /* synthetic */ int X = 0;
    public h T;
    public final bpn0 Q = new bpn0(new s6y(this, 23));
    public final bpn0 R = new bpn0(new gzv(this, 28));
    public final bpn0 S = new bpn0(new x4u(this, 29));
    public final bpn0 U = new bpn0(new Cnew(this, 24));
    public final bpn0 V = new bpn0(new m130(this, 16));
    public final ad0 W = new ad0();

    @Override // xsna.xn50
    public final mk50 Fl() {
        h hVar = new h(requireContext(), this, new h440(this, 8), new ux40(this, 13), getViewLifecycleOwner());
        this.T = hVar;
        return new mk50.c(hVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        i iVar = (i) ao50Var;
        h hVar = this.T;
        if (hVar == null) {
            hVar = null;
        }
        hVar.d(requireArguments());
        h hVar2 = this.T;
        (hVar2 != null ? hVar2 : null).e(iVar);
        ((f4z) getFeature().x()).a(new fju(this, 22), getViewLifecycleOwner());
        view.post(new gh1(this, 5));
        getParentFragmentManager().l0("ONBOARDING_KEY", getViewLifecycleOwner(), new ga40(this, 7));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        h hVar = this.T;
        if (hVar == null) {
            hVar = null;
        }
        hVar.Ng();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        h hVar = this.T;
        if (hVar == null) {
            hVar = null;
        }
        hVar.a(rect2);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        h hVar = this.T;
        if (hVar == null) {
            hVar = null;
        }
        return hVar.a0();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        h hVar = this.T;
        if (hVar == null) {
            hVar = null;
        }
        hVar.c();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((ysg0) this.R.getValue(), (qfa0) this.S.getValue(), (h7v) this.U.getValue(), requireArguments().getInt("tab", PhotosRootTab.PHOTO_FLOW.h()));
    }
}
