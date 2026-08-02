package com.vk.voip.ui.watchmovie.selectsource.tabs.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.ui.watchmovie.selectsource.tabs.fragments.VoipVideoListFragment;
import com.vkontakte.android.R;
import xsna.a201;
import xsna.ao50;
import xsna.b1x0;
import xsna.bj50;
import xsna.d1x0;
import xsna.f4z;
import xsna.fhw0;
import xsna.gm50;
import xsna.iid;
import xsna.izw0;
import xsna.km50;
import xsna.mk50;
import xsna.oz50;
import xsna.q0x0;
import xsna.r44;
import xsna.sg3;
import xsna.sub;
import xsna.tmw0;
import xsna.uft0;
import xsna.uzw0;
import xsna.vcw0;
import xsna.vk50;
import xsna.vzw0;
import xsna.w0x0;
import xsna.y0x0;

/* compiled from: VoipVideoListFragment.kt */
/* loaded from: classes7.dex */
public abstract class VoipVideoListFragment extends MviImplFragment<w0x0, d1x0, tmw0> {
    public static final /* synthetic */ int S = 0;
    public final bj50 Q = new bj50(this, 23);
    public final f4z<izw0> R = new f4z<>();

    /* compiled from: VoipVideoListFragment.kt */
    public static abstract class a<T extends VoipVideoListFragment> extends oz50 {
    }

    /* compiled from: VoipVideoListFragment.kt */
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
                recyclerView.post(new r44(this, 21));
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_watch_movie_list);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        uzw0 uzw0Var = new uzw0(this.Q);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_watch_movie_recycler);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setHasFixedSize(true);
        uzw0Var.registerAdapterDataObserver(new b(recyclerView));
        recyclerView.setAdapter(uzw0Var);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.voip_watch_movie_swipe_container);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.n3x0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                VoipVideoListFragment.this.Q.c(vzw0.b.a);
            }
        });
        gm50.a.b(this, ((d1x0) ao50Var).a, new sub(this, uzw0Var, swipeRefreshLayout, 8));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        this.R.a(new vcw0(this, 5), this);
    }

    public abstract y0x0 fo(Context context);

    public abstract q0x0 go(uft0 uft0Var, iid iidVar);

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Context applicationContext = requireContext().getApplicationContext();
        uft0 uft0Var = new uft0();
        iid iidVar = new iid(applicationContext.getResources());
        b1x0 b1x0Var = new b1x0(fo(applicationContext));
        q0x0 go = go(uft0Var, iidVar);
        fhw0 b2 = a201.b().b();
        Bundle arguments = getArguments();
        return new w0x0(b1x0Var, go, this.R, b2, arguments != null ? (UserId) arguments.getParcelable(CommonConstant.RETKEY.USERID) : null, new sg3(1, this, VoipVideoListFragment.class, "onVideoSelected", "onVideoSelected(Lcom/vk/voip/ui/watchmovie/selectsource/common/model/VoipVideoToWatch;)V", 0, 8), false);
    }
}
