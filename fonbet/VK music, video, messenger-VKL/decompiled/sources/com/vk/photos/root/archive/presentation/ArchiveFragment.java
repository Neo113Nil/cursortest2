package com.vk.photos.root.archive.presentation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.android.defaultplayer.view.timeline.a;
import com.vk.movika.sdk.base.ui.f;
import com.vk.movika.sdk.base.ui.g;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vkontakte.android.R;
import xsna.ao50;
import xsna.bpn0;
import xsna.eha0;
import xsna.f4z;
import xsna.fpf0;
import xsna.gd60;
import xsna.hd;
import xsna.ic;
import xsna.ig3;
import xsna.jd;
import xsna.k7m;
import xsna.kd;
import xsna.kdg0;
import xsna.ki3;
import xsna.km50;
import xsna.l1;
import xsna.ld;
import xsna.m1;
import xsna.m7m;
import xsna.mk50;
import xsna.ng1;
import xsna.nj3;
import xsna.oj3;
import xsna.q1;
import xsna.qfa0;
import xsna.rh3;
import xsna.sh3;
import xsna.vi3;
import xsna.vk50;
import xsna.w8i;
import xsna.wj50;
import xsna.x7a0;
import xsna.yh;
import xsna.ysg0;
import xsna.zi3;

/* compiled from: ArchiveFragment.kt */
/* loaded from: classes.dex */
public final class ArchiveFragment extends MviImplFragment<rh3, oj3, ig3> implements w8i {
    public static final /* synthetic */ int e0 = 0;
    public int Z;
    public nj3 a0;
    public final bpn0 Q = new bpn0(new ng1(this, 1));
    public final bpn0 R = new bpn0(new l1(this, 6));
    public final bpn0 S = new bpn0(new g(this, 8));
    public final bpn0 T = new bpn0(new m1(this, 2));
    public final bpn0 U = new bpn0(new jd(this, 3));
    public final bpn0 V = new bpn0(new kd(this, 5));
    public final bpn0 W = new bpn0(new ld(this, 5));
    public final bpn0 X = new bpn0(new yh(this, 2));
    public final bpn0 Y = new bpn0(new ic(this, 7));
    public final bpn0 b0 = new bpn0(new a(this, 3));
    public final bpn0 c0 = new bpn0(new hd(this, 4));
    public final bpn0 d0 = new bpn0(new f(this, 5));

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_photo_archive);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        nj3 nj3Var = new nj3(view, (ki3) this.d0.getValue(), ((NewsFeedComponent) ((k7m) m7m.f(this)).a(fpf0.a(NewsFeedComponent.class))).G2(), (eha0) this.X.getValue(), getViewLifecycleOwner(), new q1(this));
        nj3Var.b((oj3) ao50Var);
        wj50<zi3> W = getFeature().W();
        f4z f4zVar = (f4z) W;
        f4zVar.a(new sh3(0, this, nj3Var), getViewLifecycleOwner());
        this.a0 = nj3Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        getFeature().C(ig3.b.b);
        return true;
    }

    public final PhotosComponent fo() {
        return (PhotosComponent) this.S.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        nj3 nj3Var;
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.Z && (nj3Var = this.a0) != null) {
            nj3Var.a();
        }
        this.Z = i;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.a0 = null;
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new rh3((UserId) this.Q.getValue(), (x7a0) this.U.getValue(), (vi3) this.T.getValue(), (ysg0) this.V.getValue(), (gd60) this.b0.getValue(), (kdg0) this.c0.getValue(), (qfa0.d) this.Y.getValue(), ((Boolean) this.R.getValue()).booleanValue());
    }
}
