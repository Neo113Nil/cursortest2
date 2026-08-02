package com.vk.friends.impl.followers.presentation.fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.toggle.b;
import com.vk.toggle.data.FriendCellButtonType;
import com.vk.toggle.data.FriendCellLayout;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import defpackage.n;
import xsna.ao50;
import xsna.asu0;
import xsna.ayn0;
import xsna.b3;
import xsna.cis;
import xsna.d3s;
import xsna.dhr0;
import xsna.e3s;
import xsna.e4;
import xsna.ef90;
import xsna.eph;
import xsna.eth0;
import xsna.f3s;
import xsna.fpf0;
import xsna.gko;
import xsna.gm50;
import xsna.h3p0;
import xsna.h3s;
import xsna.hg1;
import xsna.iah0;
import xsna.ikv0;
import xsna.izs;
import xsna.jjc;
import xsna.k7m;
import xsna.ka;
import xsna.kf90;
import xsna.l7;
import xsna.la;
import xsna.lpj;
import xsna.m7m;
import xsna.mk50;
import xsna.na;
import xsna.nss;
import xsna.oa;
import xsna.pa;
import xsna.qa;
import xsna.ra;
import xsna.sa;
import xsna.tlo0;
import xsna.tq;
import xsna.ua;
import xsna.ut1;
import xsna.vk50;
import xsna.w3s;
import xsna.w8i;
import xsna.wa;
import xsna.xa;
import xsna.y1z;

/* compiled from: AbsFollowersListFragment.kt */
/* loaded from: classes15.dex */
public abstract class AbsFollowersListFragment extends MviImplFragment<h3s, w3s, e3s> implements w8i {
    public static final /* synthetic */ int Y = 0;
    public final a Q;
    public final UserId R;
    public final pa S;
    public d3s T;
    public final qa U;
    public f3s V;
    public ayn0 W;
    public final kf90 X;

    /* compiled from: AbsFollowersListFragment.kt */
    public static final class a extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    public AbsFollowersListFragment() {
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.Q = new a();
        this.R = UserId.d;
        this.S = new pa(this, 0);
        this.U = new qa(this, 0);
        this.X = new kf90(new ra(this, 0));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.followers_list_v2);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ViewGroup viewGroup;
        w3s w3sVar = (w3s) ao50Var;
        final CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) view.findViewById(R.id.content_state_container);
        final ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.loading_state_container);
        CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
        catalogFeatures.getClass();
        b bVar = b.A;
        if (bVar.a(catalogFeatures)) {
            View findViewById = view.findViewById(R.id.empty_state_placeholder);
            VkPlaceholder vkPlaceholder = (VkPlaceholder) findViewById;
            vkPlaceholder.setTop(new VkPlaceholder.c.d(new c.b(new gko(R.drawable.vk_icon_illustration_cat_closed_wall_78h)), iah0.a(78), 12));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.followers_list_empty_placeholder_title)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.followers_list_empty_placeholder_description))));
            viewGroup = (ViewGroup) findViewById;
        } else {
            viewGroup = (ViewGroup) view.findViewById(R.id.empty_state_container);
        }
        final ViewGroup viewGroup3 = viewGroup;
        final ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.error_state_container);
        final TextView textView = (TextView) viewGroup4.findViewById(R.id.error_text);
        jjc.g(viewGroup4.findViewById(R.id.error_retry), new sa(this, 0));
        RecyclerView recyclerView = (RecyclerView) customSwipeRefreshLayout.findViewById(R.id.followers_list_recycler);
        io.reactivex.rxjava3.disposables.b bVar2 = getFeature().e;
        UiTracker uiTracker = UiTracker.a;
        int i = 1;
        f3s f3sVar = new f3s(FriendsRequestsComponent.K5((FriendsRequestsComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FriendsRequestsComponent.class)), new nss(UiTracker.d(), UiTracker.c(), new cis(true, FriendCellLayout.THREE_LINES_COMPACT, FriendCellButtonType.IMAGES, false), false), new com.vk.movika.sdk.android.defaultplayer.utils.c(new na(this, 0), new oa(0), new b3(recyclerView, i)), this.U, kn(), bVar2, fo(), null, 64), this.S);
        this.V = f3sVar;
        recyclerView.setAdapter(f3sVar);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.addOnScrollListener(new ef90(this.X));
        this.W = new ayn0(recyclerView, new xa(this, AbsFollowersListFragment.class, "isTabletUi", "isTabletUi()Z", 0), 14);
        d3s d3sVar = this.T;
        if (d3sVar == null) {
            d3sVar = null;
        }
        hg1.e(d3sVar.b.e, d3sVar.c.a().a0(asu0.a.d()).subscribe(new n(new eph(d3sVar, 17), 26)));
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        String string = requireArguments().getString("title", "");
        if (bVar.a(catalogFeatures)) {
            toolbar.setVisibility(8);
            vkTopBar.setVisibility(0);
            vkTopBar.setBack(new VkTopBar.b(new j(this, i), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(string, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
            h3p0.d(this, vkTopBar);
        } else {
            vkTopBar.setVisibility(8);
            toolbar.setVisibility(0);
            toolbar.setTitle(string);
            toolbar.setNavigationIcon(R.drawable.vk_icon_arrow_left_outline_28);
            toolbar.setNavigationContentDescription(R.string.back);
            h3p0.c(this, toolbar);
            toolbar.setNavigationOnClickListener(new la(this, 0));
        }
        customSwipeRefreshLayout.setOnRefreshListener(new l7(this, i));
        gm50.a.b(this, w3sVar.c, new izs() { // from class: xsna.ta
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i2 = AbsFollowersListFragment.Y;
                CustomSwipeRefreshLayout customSwipeRefreshLayout2 = CustomSwipeRefreshLayout.this;
                customSwipeRefreshLayout2.setVisibility(0);
                viewGroup2.setVisibility(8);
                viewGroup4.setVisibility(8);
                viewGroup3.setVisibility(8);
                yzt0<w3s.d> yzt0Var = ((w3s.a) obj).a;
                AbsFollowersListFragment absFollowersListFragment = this;
                gm50.a.a(absFollowersListFragment, yzt0Var, new com.vk.movika.sdk.base.logic.interactor.i(2, absFollowersListFragment, customSwipeRefreshLayout2));
                return s3q0.a;
            }
        });
        gm50.a.b(this, w3sVar.a, new ua(customSwipeRefreshLayout, viewGroup2, viewGroup4, viewGroup3, 0));
        gm50.a.b(this, w3sVar.b, new izs() { // from class: xsna.va
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i2 = AbsFollowersListFragment.Y;
                CustomSwipeRefreshLayout.this.setVisibility(8);
                viewGroup2.setVisibility(8);
                viewGroup4.setVisibility(0);
                viewGroup3.setVisibility(8);
                yzt0<Throwable> yzt0Var = ((w3s.c) obj).a;
                TextView textView2 = textView;
                AbsFollowersListFragment absFollowersListFragment = this;
                gm50.a.a(absFollowersListFragment, yzt0Var, new ma(0, textView2, absFollowersListFragment));
                return s3q0.a;
            }
        });
        gm50.a.b(this, w3sVar.d, new wa(customSwipeRefreshLayout, viewGroup2, viewGroup4, viewGroup3, 0));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.Q;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        h3s h3sVar = (h3s) vk50Var;
        h3sVar.h.a(new ka(this, 0), this);
        this.T = new d3s(h3sVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        eth0 go = go();
        return go != null && go.a0();
    }

    public UserId fo() {
        return this.R;
    }

    public eth0 go() {
        return null;
    }

    public final void ho(int i) {
        ikv0.a aVar = new ikv0.a(requireContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
        aVar.u = new ikv0.d(getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        aVar.n();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ayn0 ayn0Var = this.W;
        if (ayn0Var == null) {
            ayn0Var = null;
        }
        ayn0Var.b();
        eth0 go = go();
        if (go != null) {
            go.onConfigurationChanged(configuration);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        eth0 go = go();
        if (go != null) {
            go.onDestroyView();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        eth0 go = go();
        if (go != null) {
            go.onPause();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        eth0 go = go();
        if (go != null) {
            go.onResume();
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        eth0 go = go();
        if (go != null) {
            go.b(new ut1(requireView()));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        eth0 go = go();
        if (go != null) {
            go.y(uiTrackingScreen);
        }
    }
}
