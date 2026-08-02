package com.vk.friends.recommendations.impl.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.story.api.di.StoriesComponent;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import defpackage.p;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.a0;
import io.reactivex.rxjava3.internal.operators.observable.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.bpn0;
import xsna.cj50;
import xsna.cq3;
import xsna.dhr0;
import xsna.epx;
import xsna.fpf0;
import xsna.gko;
import xsna.gmp;
import xsna.h3p0;
import xsna.i5f;
import xsna.iah0;
import xsna.izs;
import xsna.ldl;
import xsna.lpj;
import xsna.m7m;
import xsna.mm1;
import xsna.oq;
import xsna.oz50;
import xsna.pr1;
import xsna.rsg0;
import xsna.s3q0;
import xsna.t34;
import xsna.tlo0;
import xsna.tq;
import xsna.tz;
import xsna.vd1;
import xsna.vos;
import xsna.vrs;
import xsna.xrj;
import xsna.xrs;
import xsna.y1z;
import xsna.yrn;
import xsna.zi50;

/* compiled from: FriendsRecommendationsFragment.kt */
/* loaded from: classes16.dex */
public final class FriendsRecommendationsFragment extends BaseFragment implements c.m<VKFromList<Item>> {
    public static final /* synthetic */ int b0 = 0;
    public String U;
    public String V;
    public boolean W;
    public RecommendationsRecyclerPaginatedView Y;
    public final b S = new b();
    public final bpn0 T = new bpn0(new pr1(22));
    public final bpn0 X = new bpn0(new ldl(this, 14));
    public final io.reactivex.rxjava3.disposables.b Z = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 a0 = new bpn0(new xrj(this, 8));

    /* compiled from: FriendsRecommendationsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(FriendsRecommendationsFragment.class, null, null);
        }
    }

    /* compiled from: FriendsRecommendationsFragment.kt */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: FriendsRecommendationsFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<UserId, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UserId userId) {
            RequestUserProfile requestUserProfile;
            Object obj;
            UserId userId2 = userId;
            FriendsRecommendationsFragment friendsRecommendationsFragment = (FriendsRecommendationsFragment) this.receiver;
            int i = FriendsRecommendationsFragment.b0;
            Iterator it = ((ArrayList) friendsRecommendationsFragment.io().y0()).iterator();
            while (true) {
                requestUserProfile = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                RequestUserProfile requestUserProfile2 = ((Item) obj).c;
                if (epx.f(requestUserProfile2 != null ? requestUserProfile2.c : null, userId2)) {
                    break;
                }
            }
            Item item = (Item) obj;
            if (item != null) {
                RequestUserProfile requestUserProfile3 = item.c;
                if (requestUserProfile3 != null) {
                    requestUserProfile3.T = false;
                    s3q0 s3q0Var = s3q0.a;
                    requestUserProfile = requestUserProfile3;
                }
                friendsRecommendationsFragment.io().F0(item, new Item(item.a, item.b, requestUserProfile, item.d));
            }
            return s3q0.a;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.S;
    }

    @Override // com.vk.lists.c.m
    public final q<VKFromList<Item>> O9(String str, com.vk.lists.c cVar) {
        vos vosVar = new vos(str, 20);
        vosVar.C(1, "need_new");
        String str2 = this.V;
        vosVar.s = str2;
        vosVar.K("block_type", str2);
        vosVar.H0(this.U);
        vosVar.F0(epx.f(this.V, "authors_rec") ? "authors_search" : t0.a(MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_SEARCH));
        return cj50.b(rsg0.T(vosVar), (zi50) this.T.getValue()).a0(asu0.a.d()).U(new t34(new mm1(15, this, str), 17));
    }

    @Override // com.vk.lists.c.k
    public final q<VKFromList<Item>> hj(com.vk.lists.c cVar, boolean z) {
        this.U = null;
        return O9(null, cVar);
    }

    public final com.vk.friends.recommendations.impl.presentation.a io() {
        return (com.vk.friends.recommendations.impl.presentation.a) this.a0.getValue();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        eo(((StoriesComponent) m7m.d(this).a(fpf0.a(StoriesComponent.class))).Pa().a(new c(1, this, FriendsRecommendationsFragment.class, "markStoriesAsSeenLocal", "markStoriesAsSeenLocal(Lcom/vk/dto/common/id/UserId;)V", 0)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        RecyclerView recyclerView;
        View inflate = layoutInflater.inflate(R.layout.friends_recommendations_fragment, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        if (vkTopBar != null) {
            vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.vk_accessibility_back), new i5f(this, 27), null, null, 56));
        }
        Bundle arguments = getArguments();
        this.V = arguments != null ? arguments.getString("type") : null;
        Bundle arguments2 = getArguments();
        boolean z = arguments2 != null ? arguments2.getBoolean("show_rec_only", false) : false;
        this.W = z;
        if (z) {
            CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
            catalogFeatures.getClass();
            i = com.vk.toggle.b.A.a(catalogFeatures) ? R.string.friends_recommendations_title_maybe : R.string.friends_recommendations_title;
        } else {
            i = !epx.f(this.V, "authors_rec") ? R.string.friends_recommendations_add_friend_title : R.string.authors_recommendations_title;
        }
        String string = getString(i);
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, string), null, null, null, null, 30), null, null, com.vk.core.compose.component.semantics.b.a(null, new vrs(string, 0), 3), 6));
        }
        h3p0.d(this, vkTopBar);
        final RecommendationsRecyclerPaginatedView recommendationsRecyclerPaginatedView = (RecommendationsRecyclerPaginatedView) inflate.findViewById(R.id.recycler_paginated_view);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recommendationsRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, recommendationsRecyclerPaginatedView).a();
        recommendationsRecyclerPaginatedView.setAdapter(io());
        yrn yrnVar = new yrn(R.attr.vk_ui_separator_primary_alpha, iah0.a(0.5f));
        yrnVar.l(iah0.a(16.0f), iah0.a(8.0f), iah0.a(16.0f), 0);
        RecyclerView recyclerView2 = recommendationsRecyclerPaginatedView.getRecyclerView();
        yrnVar.m = new yrn.a() { // from class: xsna.wrs
            @Override // xsna.yrn.a
            public final boolean Z(RecyclerView.e0 e0Var) {
                int i2 = FriendsRecommendationsFragment.b0;
                return FriendsRecommendationsFragment.this.io().e0(e0Var.getBindingAdapterPosition()) == 4;
            }
        };
        recyclerView2.addItemDecoration(yrnVar);
        if (vkTopBar != null && (recyclerView = recommendationsRecyclerPaginatedView.getRecyclerView()) != null) {
            vkTopBar.setOnClickListener(new gmp(new WeakReference(recyclerView), 9));
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null ? arguments3.getBoolean("sync_contacts") : false) {
            s0 s0Var = new s0(new xrs(0));
            asu0 asu0Var = asu0.a;
            new a0(s0Var.r0(asu0Var.c()).a0(asu0Var.d()), new io.reactivex.rxjava3.functions.a() { // from class: xsna.yrs
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    int i2 = FriendsRecommendationsFragment.b0;
                    com.vk.lists.f.a(new c.h(FriendsRecommendationsFragment.this), recommendationsRecyclerPaginatedView);
                }
            }).subscribe();
        } else {
            f.a(new c.h(this), recommendationsRecyclerPaginatedView);
        }
        RecyclerView recyclerView3 = recommendationsRecyclerPaginatedView.getRecyclerView();
        if (recyclerView3 != null) {
            recyclerView3.setScrollbarFadingEnabled(false);
        }
        this.Y = recommendationsRecyclerPaginatedView;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.Z.e();
        this.Y = null;
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<VKFromList<Item>> qVar, boolean z, com.vk.lists.c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new p(new cq3(12, cVar, this), 28), new tz(new vd1(20), 18));
        if (subscribe != null) {
            eo(subscribe);
        }
    }
}
