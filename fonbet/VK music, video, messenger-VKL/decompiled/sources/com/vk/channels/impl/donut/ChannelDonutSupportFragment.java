package com.vk.channels.impl.donut;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.channels.impl.donut.a;
import com.vk.dto.common.id.UserId;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import xsna.a8;
import xsna.ao50;
import xsna.bpn0;
import xsna.cya;
import xsna.dy2;
import xsna.ey0;
import xsna.fpf0;
import xsna.gm50;
import xsna.hl1;
import xsna.ikv0;
import xsna.il1;
import xsna.iya;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.mwv;
import xsna.oz50;
import xsna.tyv;
import xsna.vk50;
import xsna.x7;
import xsna.yxa;
import xsna.zt4;

/* compiled from: ChannelDonutSupportFragment.kt */
/* loaded from: classes16.dex */
public final class ChannelDonutSupportFragment extends MviImplFragment<yxa, iya, com.vk.channels.impl.donut.a> {
    public static final /* synthetic */ int V = 0;
    public c R;
    public cya S;
    public b T;
    public final bpn0 Q = new bpn0(new ey0(this, 10));
    public final mwv<mwv.a> U = ((ImReportersComponent) m7m.d(this).a(fpf0.a(ImReportersComponent.class))).K().x();

    /* compiled from: ChannelDonutSupportFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId) {
            super(ChannelDonutSupportFragment.class, null, null);
            s(true);
            this.j.putParcelable("owner_id_key", userId);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        View inflate = getLayoutInflater().inflate(R.layout.im_channel_donut_support_fragment, (ViewGroup) null);
        this.R = new c(inflate, this, new x7(this, 19));
        return new mk50.c(inflate);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        iya iyaVar = (iya) ao50Var;
        c cVar = this.R;
        if (cVar != null) {
            gm50.a.b(this, iyaVar.a, new hl1(4, this, cVar));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        yxa yxaVar = (yxa) vk50Var;
        yxaVar.h.a(new zt4(this, 8), this);
        yxaVar.i.a(new com.vk.movika.sdk.base.observable.a(this, 17), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = new cya(requireContext(), ((LinksBridgeComponent) m7m.d(this).a(fpf0.a(LinksBridgeComponent.class))).p(), new il1(this, 9));
        this.T = new b(requireContext(), new a8(this, 15));
        if (bundle == null) {
            this.U.a(new tyv.a(-((UserId) this.Q.getValue()).b));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ikv0 ikv0Var;
        super.onDestroy();
        b bVar = this.T;
        if (bVar != null && (ikv0Var = bVar.c) != null) {
            ikv0Var.a();
        }
        this.S = null;
        this.T = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getFeature().C(a.d.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new yxa((UserId) this.Q.getValue(), new dy2());
    }
}
