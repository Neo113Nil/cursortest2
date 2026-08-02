package com.vk.voip.ui.watchmovie.selectsource.tabs.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.a201;
import xsna.a840;
import xsna.ao50;
import xsna.b1x0;
import xsna.cn70;
import xsna.d1x0;
import xsna.dw20;
import xsna.f4z;
import xsna.fhw0;
import xsna.gm50;
import xsna.iid;
import xsna.izw0;
import xsna.km50;
import xsna.mk50;
import xsna.nvw0;
import xsna.rw;
import xsna.tl50;
import xsna.tmw0;
import xsna.ts90;
import xsna.tzp0;
import xsna.uft0;
import xsna.uzw0;
import xsna.vk50;
import xsna.vq3;
import xsna.vs6;
import xsna.vzw0;
import xsna.w0x0;
import xsna.w8i;
import xsna.y0x0;
import xsna.yfb;
import xsna.zyl0;

/* compiled from: VoipPlaylistVideosFragment.kt */
/* loaded from: classes7.dex */
public final class a extends tl50<w0x0, d1x0, tmw0> implements w8i {
    public static final /* synthetic */ int l1 = 0;
    public VoipPlaylistVideosConfig i1;
    public final a840 j1 = new a840(this, 18);
    public final f4z<izw0> k1 = new f4z<>();

    /* compiled from: VoipPlaylistVideosFragment.kt */
    /* renamed from: com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a$a, reason: collision with other inner class name */
    public static final class C2092a extends dw20.b {
        public final VoipPlaylistVideosConfig e;

        public C2092a(Context context, VoipPlaylistVideosConfig voipPlaylistVideosConfig, String str) {
            super(context, tzp0.a(null, 3));
            this.e = voipPlaylistVideosConfig;
            c(new ts90(1.0f, 2));
            w0(str);
            B(cn70.b(12), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            a aVar = new a();
            aVar.setArguments(yfb.b(new Pair("arg_config", this.e)));
            return aVar;
        }
    }

    /* compiled from: VoipPlaylistVideosFragment.kt */
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
                recyclerView.post(new vq3(this, 15));
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(LayoutInflater.from(mo2getContext()).inflate(new mk50.b(R.layout.voip_playlist_videos_bottomsheet).a, (ViewGroup) null, false));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        uzw0 uzw0Var = new uzw0(this.j1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_watch_movie_recycler);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setHasFixedSize(true);
        uzw0Var.registerAdapterDataObserver(new b(recyclerView));
        recyclerView.setAdapter(uzw0Var);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.voip_watch_movie_swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.mvw0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.a.this.j1.c(vzw0.b.a);
            }
        });
        gm50.a.b(this, ((d1x0) ao50Var).a, new rw(this, uzw0Var, swipeRefreshLayout, 14));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        this.k1.a(new zyl0(this, 29), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        VoipPlaylistVideosConfig voipPlaylistVideosConfig;
        Context applicationContext = requireContext().getApplicationContext();
        uft0 uft0Var = new uft0();
        iid iidVar = new iid(applicationContext.getResources());
        Bundle arguments = getArguments();
        if (arguments == null || (voipPlaylistVideosConfig = (VoipPlaylistVideosConfig) arguments.getParcelable("arg_config")) == null) {
            throw new IllegalStateException("No config passed");
        }
        this.i1 = voipPlaylistVideosConfig;
        b1x0 b1x0Var = new b1x0(new y0x0(R.string.empty_list, applicationContext, true));
        VoipPlaylistVideosConfig voipPlaylistVideosConfig2 = this.i1;
        if (voipPlaylistVideosConfig2 == null) {
            throw new IllegalStateException("album id is null");
        }
        nvw0 nvw0Var = new nvw0(uft0Var, iidVar, voipPlaylistVideosConfig2.c);
        fhw0 b2 = a201.b().b();
        VoipPlaylistVideosConfig voipPlaylistVideosConfig3 = this.i1;
        return new w0x0(b1x0Var, nvw0Var, this.k1, b2, voipPlaylistVideosConfig3 != null ? voipPlaylistVideosConfig3.b : null, new vs6(1, this, a.class, "onVideoSelected", "onVideoSelected(Lcom/vk/voip/ui/watchmovie/selectsource/common/model/VoipVideoToWatch;)V", 0, 11), true);
    }
}
