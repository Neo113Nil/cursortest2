package com.vk.clips.viewer.impl.grid.lists.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridPaginatedView;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.lists.AbstractPaginatedView;
import com.vk.movika.sdk.base.ui.f;
import com.vk.movika.sdk.base.ui.g;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.t0;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.awt0;
import xsna.bpn0;
import xsna.dhr0;
import xsna.f4m;
import xsna.gd;
import xsna.h9e;
import xsna.hd;
import xsna.hee;
import xsna.i0q0;
import xsna.iah0;
import xsna.id;
import xsna.ide;
import xsna.ie;
import xsna.j5g;
import xsna.jd;
import xsna.l1;
import xsna.lpj;
import xsna.msy;
import xsna.nmv;
import xsna.nzc;
import xsna.rde;
import xsna.sde;

/* compiled from: AbstractClipsGridListFragment.kt */
/* loaded from: classes17.dex */
public abstract class AbstractClipsGridListFragment extends BaseFragment implements rde {
    public static final /* synthetic */ int e0 = 0;
    public final ClipsGridTabData S;
    public int V;
    public boolean W;
    public ClipsGridPaginatedView X;
    public hee Z;
    public final String T = t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID);
    public final nzc U = new nzc();
    public final bpn0 Y = new bpn0(new g(this, 2));
    public final a a0 = new a();
    public final id b0 = new id(this, 0);
    public final b c0 = new b();
    public final Object d0 = msy.a(LazyThreadSafetyMode.NONE, new jd(this, 0));

    /* compiled from: AbstractClipsGridListFragment.kt */
    public static final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            AbstractClipsGridListFragment abstractClipsGridListFragment = AbstractClipsGridListFragment.this;
            ClipsGridPaginatedView clipsGridPaginatedView = abstractClipsGridListFragment.X;
            if (clipsGridPaginatedView == null) {
                clipsGridPaginatedView = null;
            }
            int computeVerticalScrollOffset = clipsGridPaginatedView.getRecyclerView().computeVerticalScrollOffset();
            if (abstractClipsGridListFragment.W) {
                ((ide) abstractClipsGridListFragment.getParentFragment()).Je(computeVerticalScrollOffset);
            } else if (computeVerticalScrollOffset >= 10) {
                ((ide) abstractClipsGridListFragment.getParentFragment()).Je(0);
            } else {
                abstractClipsGridListFragment.W = true;
                ((ide) abstractClipsGridListFragment.getParentFragment()).Je(computeVerticalScrollOffset);
            }
        }
    }

    /* compiled from: AbstractClipsGridListFragment.kt */
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            return AbstractClipsGridListFragment.this.jo().v(i);
        }
    }

    public AbstractClipsGridListFragment(ClipsGridTabData clipsGridTabData) {
        this.S = clipsGridTabData;
    }

    public static lpj io(AbstractClipsGridListFragment abstractClipsGridListFragment) {
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext == null) {
            throw new IllegalStateException("Empty context!");
        }
        dhr0.a.getClass();
        return new lpj(mo2getContext, dhr0.u().c);
    }

    @Override // xsna.rde
    public final void Mc() {
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        if (clipsGridPaginatedView == null) {
            clipsGridPaginatedView = null;
        }
        clipsGridPaginatedView.getRecyclerView().stopScroll();
        ClipsGridPaginatedView clipsGridPaginatedView2 = this.X;
        if (clipsGridPaginatedView2 == null) {
            clipsGridPaginatedView2 = null;
        }
        clipsGridPaginatedView2.getRecyclerView().stopNestedScroll();
        ClipsGridPaginatedView clipsGridPaginatedView3 = this.X;
        RecyclerView.o layoutManager = (clipsGridPaginatedView3 != null ? clipsGridPaginatedView3 : null).getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.scrollToPosition(0);
        }
    }

    @Override // xsna.rde
    public final void Qf() {
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        if (clipsGridPaginatedView == null) {
            clipsGridPaginatedView = null;
        }
        clipsGridPaginatedView.getRecyclerView().scrollToPosition(0);
    }

    public final void g0() {
        if (jo().getItemCount() == 0) {
            i0q0.d(300L, this.b0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return no() ? (Context) this.d0.getValue() : super.mo2getContext();
    }

    public abstract gd jo();

    public final sde ko() {
        return (sde) this.Y.getValue();
    }

    public final void lb() {
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        if (clipsGridPaginatedView == null) {
            clipsGridPaginatedView = null;
        }
        clipsGridPaginatedView.setAlpha(1.0f);
        ClipsGridPaginatedView clipsGridPaginatedView2 = this.X;
        (clipsGridPaginatedView2 != null ? clipsGridPaginatedView2 : null).lb();
    }

    public abstract ie lo();

    public final UserId mo() {
        UserId userId;
        ClipGridParams f = ko().f();
        ClipGridParams.OnlyId zb = f != null ? f.zb() : null;
        ClipGridParams.OnlyId.Profile profile = zb instanceof ClipGridParams.OnlyId.Profile ? (ClipGridParams.OnlyId.Profile) zb : null;
        return (profile == null || (userId = profile.b) == null) ? UserId.d : userId;
    }

    public boolean no() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (no()) {
            layoutInflater = layoutInflater.cloneInContext(mo2getContext());
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_clips_profile_grid_list, viewGroup, false);
        this.X = (ClipsGridPaginatedView) inflate.findViewById(R.id.clips_grid_list_paginated_view);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ko().g();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Z = new hee(jo(), new hd(this, 0));
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        if (clipsGridPaginatedView == null) {
            clipsGridPaginatedView = null;
        }
        ie lo = lo();
        if (lo != null) {
            clipsGridPaginatedView.setFooterEmptyViewProvider(lo);
        }
        clipsGridPaginatedView.setFooterLoadingViewProvider(new h9e());
        clipsGridPaginatedView.setFooterErrorViewProvider(this.U);
        clipsGridPaginatedView.setOnLoadNextRetryClickListener(new f(this, 2));
        clipsGridPaginatedView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, clipsGridPaginatedView);
        jo().getClass();
        dVar.c(3);
        dVar.e = this.c0;
        dVar.a();
        clipsGridPaginatedView.setAdapter(jo());
        clipsGridPaginatedView.setSwipeRefreshEnabled(false);
        RecyclerView recyclerView = clipsGridPaginatedView.getRecyclerView();
        recyclerView.setClipToPadding(false);
        recyclerView.setMotionEventSplittingEnabled(false);
        hee heeVar = this.Z;
        recyclerView.addOnScrollListener(heeVar != null ? heeVar : null);
        ko().e(this);
    }

    public final void oo(boolean z) {
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        if (clipsGridPaginatedView == null) {
            clipsGridPaginatedView = null;
        }
        RecyclerView recyclerView = clipsGridPaginatedView.getRecyclerView();
        a aVar = this.a0;
        if (!z) {
            f4m.y(0, recyclerView);
            recyclerView.removeOnScrollListener(aVar);
        } else {
            int a2 = iah0.a(10.0f);
            recyclerView.setClipToPadding(false);
            f4m.y(a2, recyclerView);
            recyclerView.addOnScrollListener(aVar);
        }
    }

    public final void po(List<? extends nmv> list, boolean z) {
        i0q0.g(this.b0);
        if (list.isEmpty() || (list.size() == 1 && (j5g.Y(list) instanceof ClipsGridHeaderEntry))) {
            jo().setItems(EmptyList.b);
            if (z) {
                qo();
                return;
            }
            ClipsGridPaginatedView clipsGridPaginatedView = this.X;
            if (clipsGridPaginatedView == null) {
                clipsGridPaginatedView = null;
            }
            clipsGridPaginatedView.setAlpha(1.0f);
            ClipsGridPaginatedView clipsGridPaginatedView2 = this.X;
            (clipsGridPaginatedView2 != null ? clipsGridPaginatedView2 : null).f0();
            return;
        }
        ClipsGridPaginatedView clipsGridPaginatedView3 = this.X;
        if (clipsGridPaginatedView3 == null) {
            clipsGridPaginatedView3 = null;
        }
        clipsGridPaginatedView3.setAlpha(1.0f);
        ClipsGridPaginatedView clipsGridPaginatedView4 = this.X;
        if (clipsGridPaginatedView4 == null) {
            clipsGridPaginatedView4 = null;
        }
        clipsGridPaginatedView4.f0();
        ClipsGridPaginatedView clipsGridPaginatedView5 = this.X;
        if (clipsGridPaginatedView5 == null) {
            clipsGridPaginatedView5 = null;
        }
        RecyclerView.o layoutManager = clipsGridPaginatedView5.getRecyclerView().getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
        jo().setItems(list);
        ClipsGridPaginatedView clipsGridPaginatedView6 = this.X;
        if (clipsGridPaginatedView6 == null) {
            clipsGridPaginatedView6 = null;
        }
        RecyclerView.o layoutManager2 = clipsGridPaginatedView6.getRecyclerView().getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.onRestoreInstanceState(onSaveInstanceState);
        }
        ClipsGridPaginatedView clipsGridPaginatedView7 = this.X;
        awt0.t(clipsGridPaginatedView7 != null ? clipsGridPaginatedView7 : null, new l1(this, 1));
    }

    public void qo() {
        ClipsGridPaginatedView clipsGridPaginatedView = this.X;
        if (clipsGridPaginatedView == null) {
            clipsGridPaginatedView = null;
        }
        clipsGridPaginatedView.setAlpha(1.0f);
        ClipsGridPaginatedView clipsGridPaginatedView2 = this.X;
        (clipsGridPaginatedView2 != null ? clipsGridPaginatedView2 : null).t();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = new SchemeStat$EventItem(com.vk.dto.common.b.c(mo().b) ? SchemeStat$EventItem.Type.GROUP : SchemeStat$EventItem.Type.USER, Long.valueOf(mo().b), null, null, null, null, 52, null);
    }
}
