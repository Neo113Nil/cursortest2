package com.vk.photos.root.albumdetails.presentation;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.ui.t;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.b3;
import xsna.bpn0;
import xsna.ch1;
import xsna.df1;
import xsna.eha0;
import xsna.el1;
import xsna.f1;
import xsna.f4z;
import xsna.gd60;
import xsna.gg1;
import xsna.h6;
import xsna.hd;
import xsna.j1;
import xsna.j5g;
import xsna.jd;
import xsna.ka0;
import xsna.kd;
import xsna.kdg0;
import xsna.km50;
import xsna.l1;
import xsna.ld;
import xsna.mk50;
import xsna.msy;
import xsna.ng1;
import xsna.ozl;
import xsna.qfa0;
import xsna.qg1;
import xsna.s0e0;
import xsna.s1;
import xsna.t5;
import xsna.too0;
import xsna.u40;
import xsna.v40;
import xsna.vf0;
import xsna.vk50;
import xsna.we0;
import xsna.wg1;
import xsna.wj50;
import xsna.xn50;
import xsna.yc;
import xsna.ysg0;

/* compiled from: AlbumDetailsFragment.kt */
/* loaded from: classes.dex */
public final class AlbumDetailsFragment extends MviImplFragment<gg1, k, a> implements df1, too0 {
    public static final /* synthetic */ int p0 = 0;
    public int Q;
    public final bpn0 R = new bpn0(new ka0(this, 2));
    public final bpn0 S = new bpn0(new l1(this, 2));
    public final bpn0 T = new bpn0(new jd(this, 1));
    public final bpn0 U = new bpn0(new kd(this, 2));
    public final bpn0 V = new bpn0(new ld(this, 1));
    public final bpn0 W = new bpn0(new h6(this, 2));
    public final bpn0 X = new bpn0(new we0(this, 1));
    public final bpn0 Y = new bpn0(new s1(this, 3));
    public final bpn0 Z = new bpn0(new u40(this, 1));
    public final bpn0 a0 = new bpn0(new v40(this, 1));
    public final bpn0 b0 = new bpn0(new vf0(this, 4));
    public final bpn0 c0 = new bpn0(new b3(this, 4));
    public final bpn0 d0 = new bpn0(new t5(this, 3));
    public final bpn0 e0 = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 2));
    public final bpn0 f0 = new bpn0(new f1(this, 4));
    public final bpn0 g0 = new bpn0(new ng1(this, 0));
    public final bpn0 h0 = new bpn0(new yc(this, 2));
    public final Object i0;
    public final bpn0 j0;
    public final bpn0 k0;
    public final Object l0;
    public c m0;
    public int n0;
    public com.vk.core.view.components.spinner.c o0;

    public AlbumDetailsFragment() {
        j1 j1Var = new j1(this, 1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i0 = msy.a(lazyThreadSafetyMode, j1Var);
        this.j0 = new bpn0(new hd(this, 1));
        this.k0 = new bpn0(new com.vk.movika.sdk.base.ui.f(this, 3));
        this.l0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.ui.g(this, 5));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        c cVar = new c(requireContext(), io(), go(), (ch1) this.X.getValue(), this, getViewLifecycleOwner());
        this.m0 = cVar;
        return new mk50.c(cVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        k kVar = (k) ao50Var;
        c cVar = this.m0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.c(kVar);
        wj50<i> x = getFeature().x();
        f4z f4zVar = (f4z) x;
        f4zVar.a(new wg1(this), getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        c cVar = this.m0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.g();
    }

    @Override // xsna.df1
    public final void P7(a aVar) {
        xn50.a.c(this, aVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        c cVar = this.m0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(rect2);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.g.b);
        c cVar = this.m0;
        if (cVar == null) {
            cVar = null;
        }
        return cVar.f();
    }

    public final void fo(i.b bVar) {
        boolean z = bVar instanceof i.b.C1484b;
        bpn0 bpn0Var = this.a0;
        if (z) {
            String a = ((i.b.C1484b) bVar).a();
            ((eha0) bpn0Var.getValue()).b(requireContext(), a, new t(this, 3), new qg1(0, this, a));
        } else {
            if (!(bVar instanceof i.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            List<String> a2 = ((i.b.a) bVar).a();
            if (a2.size() != 1) {
                return;
            }
            ((eha0) bpn0Var.getValue()).b(requireContext(), (String) j5g.Y(a2), new com.vk.movika.sdk.base.logic.interactor.b(this, 2), new com.vk.movika.sdk.base.logic.interactor.c(3, this, a2));
        }
    }

    public final int go() {
        return ((Number) this.T.getValue()).intValue();
    }

    public final PhotosComponent ho() {
        return (PhotosComponent) this.V.getValue();
    }

    public final UserId io() {
        return (UserId) this.R.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1212 && intent != null) {
            xn50.a.c(this, new a.c((PhotoAlbum) intent.getParcelableExtra("album")));
        } else {
            super.onActivityResult(i, i2, intent);
            xn50.a.c(this, new a.C1477a(i, i2, intent));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.Q) {
            c cVar = this.m0;
            if (cVar == null) {
                cVar = null;
            }
            cVar.i();
        }
        this.Q = i;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        c cVar = this.m0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.h();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().onResume();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        xn50.a.c(this, a.n.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new gg1((s0e0) this.W.getValue(), (el1) this.Z.getValue(), (ch1) this.X.getValue(), (PhotoUploadInteractor) this.b0.getValue(), (AlbumsRepository) this.Y.getValue(), io(), (PhotoAlbum) this.S.getValue(), (ysg0) this.d0.getValue(), (gd60) this.h0.getValue(), (kdg0) this.j0.getValue(), (qfa0.b) this.e0.getValue(), go(), ((Boolean) this.U.getValue()).booleanValue());
    }
}
