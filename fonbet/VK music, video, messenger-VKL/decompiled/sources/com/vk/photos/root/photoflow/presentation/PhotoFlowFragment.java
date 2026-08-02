package com.vk.photos.root.photoflow.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.c;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a040;
import xsna.ao50;
import xsna.b290;
import xsna.b8a0;
import xsna.b9a0;
import xsna.bpn0;
import xsna.cf00;
import xsna.eha0;
import xsna.f0z;
import xsna.f4z;
import xsna.fnj;
import xsna.fr20;
import xsna.gd60;
import xsna.gd70;
import xsna.iah0;
import xsna.in60;
import xsna.izs;
import xsna.jz70;
import xsna.k7z;
import xsna.kdg0;
import xsna.kga0;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.nm60;
import xsna.oca0;
import xsna.p6y;
import xsna.qfa0;
import xsna.s0e0;
import xsna.s3q0;
import xsna.su80;
import xsna.tb0;
import xsna.too0;
import xsna.u110;
import xsna.ufk;
import xsna.v0q0;
import xsna.v100;
import xsna.vi3;
import xsna.vk50;
import xsna.w100;
import xsna.w4u;
import xsna.wj50;
import xsna.wm80;
import xsna.x550;
import xsna.x7a0;
import xsna.xn50;
import xsna.ysg0;
import xsna.z260;

/* compiled from: PhotoFlowFragment.kt */
/* loaded from: classes.dex */
public final class PhotoFlowFragment extends MviImplFragment<b, l, com.vk.photos.root.photoflow.presentation.a> implements kga0, v0q0, tb0, too0 {
    public static final /* synthetic */ int m0 = 0;
    public int Q;
    public j R;
    public final bpn0 S = new bpn0(new ufk(this, 26));
    public final bpn0 T = new bpn0(new gd70(this, 5));
    public final bpn0 U = new bpn0(new v100(this, 16));
    public final bpn0 V = new bpn0(new fr20(this, 13));
    public final bpn0 W = new bpn0(new z260(this, 8));
    public final bpn0 X = new bpn0(new w100(this, 20));
    public final bpn0 Y = new bpn0(new a040(this, 15));
    public final bpn0 Z = new bpn0(new p6y(this, 20));
    public final bpn0 a0 = new bpn0(new jz70(this, 5));
    public final bpn0 b0 = new bpn0(new nm60(this, 5));
    public final bpn0 c0 = new bpn0(new x550(this, 12));
    public final bpn0 d0 = new bpn0(new cf00(this, 15));
    public final bpn0 e0 = new bpn0(new u110(this, 8));
    public final bpn0 f0 = new bpn0(new b290(this, 2));
    public final Object g0 = msy.a(LazyThreadSafetyMode.NONE, new in60(this, 6));
    public final bpn0 h0 = new bpn0(new w4u(this, 28));
    public final bpn0 i0 = new bpn0(new su80(this, 2));
    public final bpn0 j0 = new bpn0(new wm80(this, 3));
    public final bpn0 k0 = new bpn0(new k7z(this, 19));
    public boolean l0 = true;

    /* compiled from: PhotoFlowFragment.kt */
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<com.vk.photos.root.photoflow.presentation.a, s3q0> {
        public a(PhotoFlowFragment photoFlowFragment) {
            super(1, photoFlowFragment, PhotoFlowFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(com.vk.photos.root.photoflow.presentation.a aVar) {
            PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.receiver;
            photoFlowFragment.getClass();
            xn50.a.c(photoFlowFragment, aVar);
            return s3q0.a;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        j jVar = new j(requireContext(), (kdg0) this.i0.getValue(), (eha0) this.Y.getValue(), com.vk.lists.c.f((b8a0) this.k0.getValue()), new a(this), getViewLifecycleOwner());
        this.R = jVar;
        return new mk50.c(jVar.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        l lVar = (l) ao50Var;
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        jVar.c(lVar);
        wj50<b9a0> Y = getFeature().Y();
        f4z f4zVar = (f4z) Y;
        f4zVar.a(new f0z(this, 19), getViewLifecycleOwner());
    }

    @Override // xsna.kga0
    public final void La() {
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        jVar.La();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        jVar.Ng();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        return jVar.a0();
    }

    public final PhotosComponent fo() {
        return (PhotosComponent) this.S.getValue();
    }

    @Override // xsna.kga0
    public final RecyclerView getRecyclerView() {
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        return jVar.getRecyclerView();
    }

    public final UserId go() {
        return (UserId) this.j0.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        xn50.a.c(this, new a.C1501a(i, i2, intent));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            int i = this.Q;
            int i2 = configuration.orientation;
            if (i != i2) {
                this.Q = i2;
                j jVar = this.R;
                if (jVar == null) {
                    jVar = null;
                }
                jVar.e();
            }
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        jVar.b();
    }

    @Override // xsna.kga0
    public final void s() {
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        jVar.s();
    }

    @Override // xsna.v0q0
    public final boolean sk() {
        return this.l0;
    }

    @Override // xsna.kga0
    public final AppBarLayout vh() {
        j jVar = this.R;
        if (jVar == null) {
            jVar = null;
        }
        return jVar.vh();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        int i = requireArguments().getInt("PHOTO_TAGS_COUNT", -1);
        int i2 = requireArguments().getInt("RECOGNITION_TAGS_COUNT", -1);
        c.a aVar = new c.a((vi3) this.a0.getValue());
        UserId go = go();
        AlbumsRepository albumsRepository = (AlbumsRepository) this.Z.getValue();
        x7a0 x7a0Var = (x7a0) this.V.getValue();
        PhotoUploadInteractor.a aVar2 = (PhotoUploadInteractor.a) this.c0.getValue();
        ysg0 ysg0Var = (ysg0) this.W.getValue();
        s0e0 s0e0Var = (s0e0) this.X.getValue();
        bpn0 bpn0Var = this.d0;
        return new b(new c(aVar, new c.b(go, albumsRepository, x7a0Var, aVar2, ysg0Var, s0e0Var, ((qfa0) bpn0Var.getValue()).b()), new c.C1507c((gd60) this.h0.getValue(), (kdg0) this.i0.getValue()), new c.d(i, i2, (oca0) this.U.getValue(), ((qfa0) bpn0Var.getValue()).f())));
    }
}
