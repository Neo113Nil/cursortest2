package com.vk.newsfeed.impl.postmodal.reactions.donut;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import xsna.a0a;
import xsna.a130;
import xsna.ao50;
import xsna.atm;
import xsna.bmy;
import xsna.bpn0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e2s;
import xsna.f4m;
import xsna.gm50;
import xsna.hue;
import xsna.i130;
import xsna.km50;
import xsna.l7s;
import xsna.maz;
import xsna.mk50;
import xsna.mmb;
import xsna.o0r0;
import xsna.oz50;
import xsna.pvh;
import xsna.qxm0;
import xsna.rcs;
import xsna.tcn;
import xsna.up;
import xsna.vk50;
import xsna.w030;
import xsna.xwk;
import xsna.y030;

/* compiled from: ModalPostDonutFragment.kt */
/* loaded from: classes4.dex */
public final class ModalPostDonutFragment extends MviImplFragment<com.vk.newsfeed.impl.postmodal.reactions.donut.b, f, com.vk.newsfeed.impl.postmodal.reactions.donut.a> implements i130, rcs {
    public static final /* synthetic */ int W = 0;
    public VkRecyclerPaginatedView Q;
    public VkButton R;
    public TextView S;
    public com.vk.lists.c T;
    public final w030 U = new w030(new b());
    public final bpn0 V = new bpn0(new pvh(this, 17));

    /* compiled from: ModalPostDonutFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ModalPostDonutFragment.kt */
    public static final class b implements a130 {
        public b() {
        }

        @Override // xsna.a130
        public final void a(UserId userId) {
            Context mo2getContext = ModalPostDonutFragment.this.mo2getContext();
            if (mo2getContext != null) {
                xwk.e().m(mo2getContext, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            }
        }

        @Override // xsna.a130
        public final void b() {
            Context mo2getContext = ModalPostDonutFragment.this.mo2getContext();
            if (mo2getContext != null) {
                maz e = xwk.d().e();
                int i = ModalPostDonutFragment.W;
                maz.c(e, mo2getContext, a0a.d.concat("/@donut-in-posts"), LaunchContext.A, null, null, 24);
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_post_donats);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((f) ao50Var).a, new tcn(this, 21));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.newsfeed.impl.postmodal.reactions.donut.b) vk50Var).h.a(new e2s(this, 12), this);
    }

    @Override // xsna.rcs
    public final void Zh(boolean z) {
        VkButton vkButton = this.R;
        if (vkButton != null) {
            f4m.E(vkButton, z);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        l7s l7sVar;
        LayoutInflater cloneInContext;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("ModalPostCommonFragment.isModalReactionsForceDarkTheme", false) : false) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                dhr0.a.getClass();
                l7sVar = new l7s(mo2getContext, dhr0.u().c);
            } else {
                l7sVar = null;
            }
            if (l7sVar != null && (cloneInContext = onGetLayoutInflater.cloneInContext(l7sVar)) != null) {
                return cloneInContext;
            }
        }
        return onGetLayoutInflater;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r8 == null) goto L15;
     */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        super.onViewCreated(view, bundle);
        this.R = (VkButton) view.findViewById(R.id.donut_button);
        this.S = (TextView) view.findViewById(R.id.donut_text_info);
        this.Q = (VkRecyclerPaginatedView) view.findViewById(R.id.donut_users_recycler_view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("owner_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("owner_id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            userId = (UserId) parcelable;
        }
        userId = UserId.d;
        UserId userId2 = userId;
        Bundle arguments2 = getArguments();
        y030 y030Var = new y030(getFeature().g, userId2, (int) (arguments2 != null ? arguments2.getLong("item_id") : 0L), new hue(this, 7), new atm(this, 19), getFeature().e);
        up upVar = new up(23);
        c.h hVar = new c.h(y030Var);
        hVar.i = 10;
        hVar.m = false;
        hVar.n = new qxm0();
        hVar.o = upVar;
        hVar.q = false;
        hVar.s = 4;
        hVar.l = false;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.Q;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
            vkRecyclerPaginatedView.setItemDecoration(new bmy(cn70.b(60)));
            new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView).a();
            vkRecyclerPaginatedView.setAdapter(this.U);
            com.vk.lists.c a2 = com.vk.lists.f.a(hVar, vkRecyclerPaginatedView);
            this.T = a2;
            a2.n(false);
        }
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("ARG_DONATS_URL") : null;
        if (string != null) {
            VkButton vkButton = this.R;
            if (vkButton != null) {
                vkButton.setOnClickListener(new mmb(2, this, string));
                return;
            }
            return;
        }
        VkButton vkButton2 = this.R;
        if (vkButton2 != null) {
            f4m.j(vkButton2);
        }
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.newsfeed.impl.postmodal.reactions.donut.b(bundle);
    }

    @Override // xsna.i130
    public final void Ri(float f) {
    }
}
