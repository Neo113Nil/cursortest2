package com.vk.voip.ui.watchmovie.selectsource.tabs.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipSelectVideoPlaylistsFragment;
import com.vkontakte.android.R;
import xsna.aad0;
import xsna.ao50;
import xsna.c5;
import xsna.d810;
import xsna.gm50;
import xsna.h0x0;
import xsna.iid;
import xsna.j0;
import xsna.j0x0;
import xsna.km50;
import xsna.kvw0;
import xsna.l0x0;
import xsna.mk50;
import xsna.n0x0;
import xsna.oz50;
import xsna.p0x0;
import xsna.p3x0;
import xsna.szw0;
import xsna.t6x0;
import xsna.uft0;
import xsna.vk50;
import xsna.wx40;
import xsna.xn50;
import xsna.z1h0;

/* compiled from: VoipSelectVideoPlaylistsFragment.kt */
/* loaded from: classes7.dex */
public final class VoipSelectVideoPlaylistsFragment extends MviImplFragment<j0x0, p0x0, h0x0> implements t6x0 {
    public static final /* synthetic */ int S = 0;
    public final d810 Q = new d810(this, 19);
    public final aad0 R = new aad0(this, 16);

    /* compiled from: VoipSelectVideoPlaylistsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VoipSelectVideoPlaylistsFragment.kt */
    public static final class b extends RecyclerView.i {
        public final RecyclerView a;

        public b(RecyclerView recyclerView) {
            this.a = recyclerView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            RecyclerView recyclerView = this.a;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && i == 0 && linearLayoutManager.v() == 0) {
                recyclerView.post(new j0(this, 19));
            }
        }
    }

    @Override // xsna.t6x0
    public final void Ab(p3x0 p3x0Var) {
        z1h0 parentFragment = getParentFragment();
        t6x0 t6x0Var = parentFragment instanceof t6x0 ? (t6x0) parentFragment : null;
        if (t6x0Var == null) {
            return;
        }
        t6x0Var.Ab(p3x0Var);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_select_movie_playlists_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        szw0 szw0Var = new szw0(this.Q, this.R);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_watch_playlist_recycler);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setHasFixedSize(true);
        szw0Var.registerAdapterDataObserver(new b(recyclerView));
        recyclerView.setAdapter(szw0Var);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.voip_watch_playlist_swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.k0x0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                int i = VoipSelectVideoPlaylistsFragment.S;
                xn50.a.c(VoipSelectVideoPlaylistsFragment.this, new h0x0.a(true));
            }
        });
        gm50.a.b(this, ((p0x0) ao50Var).a, new c5(this, szw0Var, swipeRefreshLayout, 7));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getChildFragmentManager().l0("PLAYLIST_VIDEO_SELECTED", this, new wx40(this, 18));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        n0x0 n0x0Var = new n0x0(new l0x0(requireContext()));
        Bundle arguments = getArguments();
        return new j0x0(n0x0Var, arguments != null ? (UserId) arguments.getParcelable(CommonConstant.RETKEY.USERID) : null, new kvw0(new uft0(), new iid(requireContext().getResources())));
    }
}
