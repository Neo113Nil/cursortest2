package com.vk.feedlikes.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.feedlikes.FeedLikesFilter;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.abg0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.epx;
import xsna.f1r;
import xsna.h1j;
import xsna.h1r;
import xsna.j6r0;
import xsna.k1r;
import xsna.nfa0;
import xsna.om10;
import xsna.oz50;
import xsna.p0q0;
import xsna.p1r;
import xsna.q1r;
import xsna.qhh0;
import xsna.r1r;
import xsna.s1c0;
import xsna.s1r;
import xsna.tlo0;
import xsna.tq;
import xsna.ucc;
import xsna.zoj0;

/* compiled from: FeedLikesFragment.kt */
/* loaded from: classes18.dex */
public final class FeedLikesFragment extends EntriesListFragment<p1r> implements qhh0, p0q0 {
    public static final /* synthetic */ int t0 = 0;
    public h1r n0;
    public s1r r0;
    public final nfa0 o0 = new nfa0(ko().f0);
    public final f1r p0 = new f1r();
    public final k1r q0 = new k1r();
    public final bpn0 s0 = new bpn0(new h1j(this, 11));

    /* compiled from: FeedLikesFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, xsna.fqp
    public final s1c0 M0() {
        return (s1c0) this.s0.getValue();
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final zoj0<?, RecyclerView.e0> mo() {
        h1r h1rVar = this.n0;
        if (h1rVar != null) {
            return h1rVar;
        }
        h1r h1rVar2 = new h1r(new RecyclerView.Adapter[0]);
        h1rVar2.K0(this.o0);
        h1rVar2.K0(this.p0);
        h1rVar2.K0(this.d0.O);
        h1rVar2.K0(this.q0);
        this.n0 = h1rVar2;
        return h1rVar2;
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final p1r no() {
        return new p1r(this);
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p1r ko = ko();
        Bundle arguments = getArguments();
        ko.getClass();
        Object obj = null;
        String string = arguments != null ? arguments.getString("filter_key") : null;
        FeedLikesFilter.Companion.getClass();
        Iterator it = FeedLikesFilter.a.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((FeedLikesFilter) next).i(), string)) {
                obj = next;
                break;
            }
        }
        FeedLikesFilter feedLikesFilter = (FeedLikesFilter) obj;
        if (feedLikesFilter == null) {
            feedLikesFilter = FeedLikesFilter.ALL;
        }
        FeedLikesFilter.Companion.getClass();
        int indexOf = FeedLikesFilter.a.a().indexOf(feedLikesFilter);
        if (indexOf > 0) {
            com.vk.newsfeed.impl.feedlikes.a.g = indexOf;
        } else {
            com.vk.newsfeed.impl.feedlikes.a.g = 0;
        }
        ko.e0 = feedLikesFilter;
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final RecyclerView.o onCreateLayoutManager() {
        getActivity();
        return new StickyHeadersLinearLayoutManager(this);
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s1r s1rVar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        RecyclerPaginatedView recyclerPaginatedView = this.d0.h;
        if (recyclerPaginatedView != null) {
            s1rVar = new s1r();
            Context context = recyclerPaginatedView.getContext();
            abg0 abg0Var = dhr0.t;
            int c = abg0Var.c(R.attr.vk_ui_vkontakte_color_tabbar_background);
            int c2 = abg0Var.c(R.attr.vk_ui_icon_accent);
            ucc uccVar = new ucc(context, c);
            s1rVar.a = uccVar;
            int i = s1r.e * 2;
            uccVar.setLayoutParams(new FrameLayout.LayoutParams(i, i, 1));
            om10 om10Var = new om10(context, recyclerPaginatedView);
            s1rVar.b = om10Var;
            om10.b bVar = om10Var.c;
            bVar.w = c;
            bVar.j = new int[]{c2, c2};
            bVar.b(0);
            bVar.b(0);
            uccVar.setImageDrawable(om10Var);
            uccVar.setVisibility(8);
            bVar.u = 255;
            recyclerPaginatedView.addView(uccVar);
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            q1r q1rVar = new q1r(s1rVar, layoutManager instanceof StickyHeadersLinearLayoutManager ? (StickyHeadersLinearLayoutManager) layoutManager : null);
            RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnScrollListener(q1rVar);
            }
            s1rVar.c = q1rVar;
        } else {
            s1rVar = null;
        }
        this.r0 = s1rVar;
        VkTopBar vkTopBar = this.U;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.sett_reactions), null, null, null, null, 30), new VkTopBar.Middle.Text.c(new tlo0.f(R.string.likes_privacy_description), null, null, 30), null, null, 12));
        }
        return onCreateView;
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        s1r s1rVar;
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.d0.h;
        if (recyclerPaginatedView != null && (s1rVar = this.r0) != null) {
            ucc uccVar = s1rVar.a;
            if (uccVar != null) {
                recyclerPaginatedView.removeView(uccVar);
            }
            q1r q1rVar = s1rVar.c;
            if (q1rVar != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                recyclerView.removeOnScrollListener(q1rVar);
            }
        }
        this.r0 = null;
        super.onDestroyView();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        AppBarLayout appBarLayout;
        View view = getView();
        if (view != null && (appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar_layout)) != null) {
            appBarLayout.g(true, true, true);
        }
        RecyclerView recyclerView = this.d0.y.c;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
        return true;
    }

    public final void so(boolean z) {
        s1r s1rVar = this.r0;
        if (s1rVar != null) {
            j6r0.d(s1rVar.a, z ? 0 : 8, false, 300, new r1r(z, s1rVar));
        }
    }
}
