package com.vk.stories.design.view.stats.tabs.viewers.mvi;

import android.os.Bundle;
import android.view.View;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stories.design.view.stats.tabs.recycler.TabRecyclerPaginatedView;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.a;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.ahm0;
import xsna.anm0;
import xsna.ao50;
import xsna.b25;
import xsna.bd70;
import xsna.bpn0;
import xsna.d3j0;
import xsna.erl0;
import xsna.fbm0;
import xsna.gm50;
import xsna.gqh0;
import xsna.gul0;
import xsna.h6m0;
import xsna.him0;
import xsna.i6m0;
import xsna.ihm0;
import xsna.ikk0;
import xsna.irc0;
import xsna.jfm0;
import xsna.kf8;
import xsna.kld0;
import xsna.km50;
import xsna.mcj0;
import xsna.mk50;
import xsna.msy;
import xsna.nid0;
import xsna.oz50;
import xsna.p870;
import xsna.t440;
import xsna.tbe0;
import xsna.tql0;
import xsna.vk50;
import xsna.x1e0;
import xsna.x2j0;
import xsna.xhm0;
import xsna.xn50;
import xsna.yhm0;
import xsna.yyl0;

/* compiled from: StoryStatisticsViewersFragment.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsViewersFragment extends MviImplFragment<b, StoryStatisticsViewersViewState, com.vk.stories.design.view.stats.tabs.viewers.mvi.a> implements ihm0 {
    public static final /* synthetic */ int f0 = 0;
    public final Object Q;
    public final bpn0 R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final xhm0 b0;
    public final yhm0 c0;
    public d d0;
    public final him0 e0;

    /* compiled from: StoryStatisticsViewersFragment.kt */
    public static final class a extends oz50 {
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [xsna.xhm0] */
    public StoryStatisticsViewersFragment() {
        gqh0 gqh0Var = new gqh0(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, gqh0Var);
        this.R = new bpn0(new kld0(this, 13));
        this.S = msy.a(lazyThreadSafetyMode, new i6m0(this, 1));
        this.T = msy.a(lazyThreadSafetyMode, new nid0(this, 12));
        this.U = msy.a(lazyThreadSafetyMode, new x1e0(this, 13));
        this.V = msy.a(lazyThreadSafetyMode, new x2j0(this, 3));
        this.W = msy.a(lazyThreadSafetyMode, new h6m0(this, 1));
        this.X = msy.a(lazyThreadSafetyMode, new ikk0(this, 2));
        int i = 16;
        this.Y = msy.a(lazyThreadSafetyMode, new tbe0(this, i));
        this.Z = msy.a(lazyThreadSafetyMode, new irc0(this, i));
        this.a0 = msy.a(lazyThreadSafetyMode, new d3j0(this, 6));
        this.b0 = new bd70() { // from class: xsna.xhm0
            @Override // xsna.bd70
            public final void x0(int i2, int i3, Object obj) {
                StoryEntry storyEntry = (StoryEntry) obj;
                int i4 = StoryStatisticsViewersFragment.f0;
                xn50.a.c(StoryStatisticsViewersFragment.this, new a.b.C1822b(storyEntry.d, storyEntry.c));
            }
        };
        this.c0 = new yhm0(this, 0);
        this.e0 = new him0();
    }

    public static StoryEntry fo(StoryStatisticsViewersFragment storyStatisticsViewersFragment) {
        ahm0 ti = super.ti();
        StoryEntry Id = ti != null ? ti.Id() : null;
        if (Id != null) {
            return Id;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static MobileOfficialAppsConStoriesStat$ViewEntryPoint go(StoryStatisticsViewersFragment storyStatisticsViewersFragment) {
        ahm0 ti = super.ti();
        MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = ti != null ? ti.getViewEntryPoint() : null;
        if (viewEntryPoint != null) {
            return viewEntryPoint;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_story_statistics_tab_viewers);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        getFeature().m.a(new mcj0(this, 7), getViewLifecycleOwner());
        d dVar = new d(view, getViewLifecycleOwner(), (StoryEntry) this.Y.getValue(), getFeature(), (jfm0) this.Q.getValue(), (erl0) this.S.getValue(), (tql0) this.T.getValue(), new kf8(1, this, StoryStatisticsViewersFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 9), new yyl0(this, 3));
        gm50.a.b(dVar, ((StoryStatisticsViewersViewState) ao50Var).a, new t440(dVar, 26));
        this.d0 = dVar;
        ahm0 ti = ti();
        if (ti != null) {
            ti.bc();
        }
    }

    @Override // xsna.ihm0
    public final void K8(StoryEntry storyEntry) {
        xn50.a.c(this, new a.c(storyEntry));
    }

    @Override // xsna.ihm0
    public final boolean f3() {
        return false;
    }

    @Override // xsna.ihm0
    public final void ha(int i) {
        d dVar = this.d0;
        if (dVar != null) {
            d.a(i, dVar.f);
            TabRecyclerPaginatedView tabRecyclerPaginatedView = dVar.e;
            d.a(i, tabRecyclerPaginatedView.getLoadingView());
            d.a(i, tabRecyclerPaginatedView.getErrorView());
            d.a(i, tabRecyclerPaginatedView.getEmptyView());
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        d dVar = this.d0;
        if (dVar != null) {
            dVar.h.d.e();
        }
        this.d0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ?? r0 = this.V;
        ((p870) r0.getValue()).g(this.b0);
        ((p870) r0.getValue()).g(this.c0);
        ((erl0) this.S.getValue()).onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ?? r0 = this.V;
        ((p870) r0.getValue()).b(108, this.b0);
        ((p870) r0.getValue()).b(111, this.c0);
        ((erl0) this.S.getValue()).onResume();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new b((StoryEntry) this.Y.getValue(), (StoryOwner) this.Z.getValue(), (gul0) this.U.getValue(), (jfm0) this.Q.getValue(), ((b25) this.W.getValue()).c(), (anm0) this.R.getValue(), (MobileOfficialAppsConStoriesStat$ViewEntryPoint) this.a0.getValue(), (fbm0) this.X.getValue());
    }

    @Override // xsna.ihm0
    public final void jj() {
    }
}
