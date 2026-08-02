package com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.libvideo.b;
import com.vk.movika.sdk.android.defaultplayer.utils.c;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.toggle.data.FriendCellButtonType;
import com.vk.toggle.data.FriendCellLayout;
import com.vkontakte.android.R;
import xsna.a8;
import xsna.ao50;
import xsna.ayn0;
import xsna.b8;
import xsna.bb;
import xsna.bhu;
import xsna.bls;
import xsna.cb;
import xsna.cis;
import xsna.db;
import xsna.dhr0;
import xsna.dql;
import xsna.eb;
import xsna.ef90;
import xsna.fb;
import xsna.fks;
import xsna.fpf0;
import xsna.gb;
import xsna.gks;
import xsna.gls;
import xsna.gm50;
import xsna.hb;
import xsna.hks;
import xsna.ib;
import xsna.jjc;
import xsna.k7m;
import xsna.kf90;
import xsna.lpj;
import xsna.m7m;
import xsna.mk50;
import xsna.nss;
import xsna.p2q0;
import xsna.pls;
import xsna.q7;
import xsna.qls;
import xsna.too0;
import xsna.vk50;
import xsna.w8i;
import xsna.wj50;
import xsna.y1z;
import xsna.zoo;

/* compiled from: AbsFriendsAndFollowersTabFragment.kt */
/* loaded from: classes15.dex */
public abstract class AbsFriendsAndFollowersTabFragment extends MviImplFragment<gls, qls, bls> implements w8i, too0 {
    public static final /* synthetic */ int X = 0;
    public final a Q;
    public UserId R;
    public ayn0 S;
    public pls T;
    public final q7 U;
    public hks V;
    public final kf90 W;

    /* compiled from: AbsFriendsAndFollowersTabFragment.kt */
    public static final class a extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public AbsFriendsAndFollowersTabFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.Q = new a();
        this.R = UserId.d;
        this.U = new q7(this, 1);
        this.W = new kf90(new eb(this, 0));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.friends_and_followers_tab_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        dql dqlVar;
        qls qlsVar = (qls) ao50Var;
        this.T = new pls(view);
        jjc.g(fo().i, new a8(this, 1));
        RecyclerView recyclerView = fo().j;
        hks hksVar = new hks(FriendsRequestsComponent.K5((FriendsRequestsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FriendsRequestsComponent.class)), new nss(t0.a(ho()), ho(), new cis(true, FriendCellLayout.THREE_LINES_COMPACT, FriendCellButtonType.IMAGES, false), true), new c(new cb(this, 0), new db(0), new bb(this, 0)), null, requireContext(), ((gls) getFeature()).e, this.R, null, 68), this.U);
        this.V = hksVar;
        recyclerView.setAdapter(hksVar);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.addOnScrollListener(new ef90(this.W));
        this.S = new ayn0(recyclerView, new ib(this, AbsFriendsAndFollowersTabFragment.class, "isTabletUi", "isTabletUi()Z", 0), 12);
        ko(recyclerView);
        fo().a.setOnRefreshListener(new b8(this, 1));
        fo().d.removeAllViews();
        fo().e.removeAllViews();
        p2q0 jo = jo();
        dql dqlVar2 = null;
        if (jo != null) {
            dqlVar = jo.d(requireContext());
            fo().d.addView(dqlVar);
        } else {
            dqlVar = null;
        }
        if (go() != null) {
            dql dqlVar3 = new dql(requireContext());
            fo().e.addView(dqlVar3);
            dqlVar2 = dqlVar3;
        }
        gm50.a.b(this, qlsVar.c, new gb(0, this, dqlVar2));
        gm50.a.b(this, qlsVar.a, new hb(this, 0));
        gm50.a.b(this, qlsVar.b, new com.vk.movika.sdk.base.observable.c(this, 1));
        gm50.a.b(this, qlsVar.d, new b(1, this, dqlVar));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.Q;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        dhr0.W(fo().a);
        dhr0.W(fo().b);
        dhr0.W(fo().c);
        dhr0.W(fo().d);
        dhr0.W(fo().e);
        dhr0.W(fo().f);
        dhr0.W(fo().g);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        gls glsVar = (gls) vk50Var;
        wj50<fks> wj50Var = glsVar.h;
        if (wj50Var != null) {
            wj50Var.a(new fb(this, 0), this);
        }
        glsVar.j.a(new com.vk.im.ui.fragments.b(this, 1), this);
    }

    public final pls fo() {
        pls plsVar = this.T;
        if (plsVar != null) {
            return plsVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public bhu go() {
        return null;
    }

    public abstract MobileOfficialAppsCoreNavStat$EventScreen ho();

    public final wj50<fks> io() {
        gks feature;
        Fragment parentFragment = getParentFragment();
        FriendsAndFollowersRootFragment friendsAndFollowersRootFragment = parentFragment instanceof FriendsAndFollowersRootFragment ? (FriendsAndFollowersRootFragment) parentFragment : null;
        if (friendsAndFollowersRootFragment == null || (feature = friendsAndFollowersRootFragment.getFeature()) == null) {
            return null;
        }
        return feature.g;
    }

    public abstract p2q0 jo();

    public final void ko(RecyclerView recyclerView) {
        recyclerView.setBackground(new InsetDrawable((Drawable) new zoo(R.attr.vk_ui_background_content), recyclerView.getPaddingLeft(), 0, recyclerView.getPaddingRight(), 0));
        ayn0 ayn0Var = this.S;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayn0 ayn0Var = this.S;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
        ko(fo().j);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        this.R = userId;
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.T = null;
    }
}
