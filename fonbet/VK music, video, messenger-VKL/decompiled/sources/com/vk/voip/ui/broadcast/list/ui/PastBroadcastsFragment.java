package com.vk.voip.ui.broadcast.list.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a5;
import xsna.ao50;
import xsna.bi0;
import xsna.bo90;
import xsna.bwt0;
import xsna.co90;
import xsna.d410;
import xsna.do90;
import xsna.ef90;
import xsna.fm50;
import xsna.gm50;
import xsna.h7u0;
import xsna.iu4;
import xsna.km50;
import xsna.ku1;
import xsna.lfa;
import xsna.lh;
import xsna.m1y;
import xsna.mk50;
import xsna.mo90;
import xsna.msy;
import xsna.oz50;
import xsna.pc3;
import xsna.pgh0;
import xsna.po90;
import xsna.qo90;
import xsna.ro90;
import xsna.rop;
import xsna.s3q0;
import xsna.sn90;
import xsna.so90;
import xsna.tn90;
import xsna.uh0;
import xsna.vk50;
import xsna.wn90;
import xsna.xn50;

/* compiled from: PastBroadcastsFragment.kt */
/* loaded from: classes7.dex */
public final class PastBroadcastsFragment extends MviImplFragment<bo90, com.vk.voip.ui.broadcast.list.ui.a, sn90> {
    public static final /* synthetic */ int U = 0;
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new m1y(this, 24));
    public final d R;
    public final tn90 S;
    public final mo90 T;

    /* compiled from: PastBroadcastsFragment.kt */
    public static class a extends oz50 {
    }

    /* compiled from: PastBroadcastsFragment.kt */
    public static class b extends oz50 {
    }

    /* compiled from: PastBroadcastsFragment.kt */
    public static final class c {
        public final CustomSwipeRefreshLayout a;
        public final View b;
        public final View c;
        public final View d;
        public final TextView e;

        public c(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view, View view2, View view3, TextView textView) {
            this.a = customSwipeRefreshLayout;
            this.b = view;
            this.c = view2;
            this.d = view3;
            this.e = textView;
        }
    }

    /* compiled from: PastBroadcastsFragment.kt */
    public static final class d implements so90<ro90> {
        public d() {
        }

        @Override // xsna.so90
        public final void a(ro90 ro90Var) {
            boolean z = ro90Var instanceof ro90.b;
            PastBroadcastsFragment pastBroadcastsFragment = PastBroadcastsFragment.this;
            if (z) {
                xn50.a.c(pastBroadcastsFragment, sn90.c.b);
            } else if ((ro90Var instanceof ro90.c) || ro90Var.equals(ro90.e.a)) {
                xn50.a.c(pastBroadcastsFragment, sn90.d.b);
            } else if (ro90Var instanceof ro90.a) {
                VideoFile videoFile = ((ro90.a) ro90Var).a;
                int i = PastBroadcastsFragment.U;
                new wn90(pastBroadcastsFragment.kn(), videoFile, pastBroadcastsFragment.R).c();
            } else {
                if (!(ro90Var instanceof ro90.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                VideoFile videoFile2 = ((ro90.d) ro90Var).a;
                int i2 = PastBroadcastsFragment.U;
                FragmentActivity activity = pastBroadcastsFragment.getActivity();
                if (activity != null) {
                    int i3 = h7u0.p;
                    h7u0.a c = h7u0.b.c(activity);
                    c.g0(R.string.voip_past_broadcasts_video_confirm_remove_title);
                    c.U(R.string.voip_past_broadcasts_video_confirm_remove_description);
                    c.c0(R.string.voip_history_past_call_remove, new co90(0, activity, videoFile2));
                    c.W(R.string.cancel, new do90());
                    c.m();
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public PastBroadcastsFragment() {
        d dVar = new d();
        this.R = dVar;
        this.S = new tn90(dVar);
        this.T = new mo90(dVar);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_past_broadcasts_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.voip.ui.broadcast.list.ui.a aVar = (com.vk.voip.ui.broadcast.list.ui.a) ao50Var;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.past_broadcasts_root_toolbar);
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new pc3(this, 7));
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) view.findViewById(R.id.past_broadcasts_recycler_swipe_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.past_broadcasts_recycler);
        View findViewById = view.findViewById(R.id.past_broadcasts_empty_state_container);
        View findViewById2 = view.findViewById(R.id.past_broadcasts_empty_state_action_button);
        View findViewById3 = view.findViewById(R.id.past_broadcasts_loading_state_container);
        View findViewById4 = view.findViewById(R.id.past_broadcasts_error_state_container);
        TextView textView = (TextView) view.findViewById(R.id.past_broadcasts_error_state_title);
        View findViewById5 = view.findViewById(R.id.past_broadcasts_error_state_retry_button);
        customSwipeRefreshLayout.setOnRefreshListener(new iu4(this, 27));
        mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        pgh0 pgh0Var = new pgh0(recyclerView);
        tn90 tn90Var = this.S;
        tn90Var.registerAdapterDataObserver(pgh0Var);
        recyclerView.setAdapter(tn90Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new ef90(this.T));
        bwt0.i0(findViewById5, new d410(this, 16));
        bwt0.i0(findViewById2, new rop(this, 27));
        c cVar = new c(customSwipeRefreshLayout, findViewById, findViewById3, findViewById4, textView);
        gm50.a.b(this, aVar.d, new bi0(27, this, cVar));
        gm50.a.b(this, aVar.a, new lh(21, this, cVar));
        gm50.a.b(this, aVar.c, new defpackage.c(28, this, cVar));
        gm50.a.b(this, aVar.b, new a5(17, this, cVar));
    }

    public final void fo(fm50<? extends qo90> fm50Var, c cVar) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout = cVar.a;
        View view = cVar.b;
        View view2 = cVar.c;
        View view3 = cVar.d;
        TextView textView = cVar.e;
        if (fm50Var instanceof a.d) {
            bwt0.p0(view2, true);
            bwt0.p0(customSwipeRefreshLayout, false);
            bwt0.p0(view, false);
            bwt0.p0(view3, false);
            return;
        }
        if (fm50Var instanceof a.b) {
            bwt0.p0(view3, true);
            bwt0.p0(customSwipeRefreshLayout, false);
            bwt0.p0(view2, false);
            bwt0.p0(view, false);
            gm50.a.a(this, ((a.b) fm50Var).a, new lfa(12, textView, this));
            return;
        }
        if (fm50Var instanceof a.c) {
            bwt0.p0(view, true);
            bwt0.p0(customSwipeRefreshLayout, false);
            bwt0.p0(view2, false);
            bwt0.p0(view3, false);
            return;
        }
        if (fm50Var instanceof a.C2011a) {
            bwt0.p0(view2, false);
            bwt0.p0(customSwipeRefreshLayout, true);
            bwt0.p0(view, false);
            bwt0.p0(view3, false);
            gm50.a.a(this, ((a.C2011a) fm50Var).a, new ku1(24, this, customSwipeRefreshLayout));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new bo90(new po90(qo90.d.b), new uh0((VideoApiHelperRepository) this.Q.getValue()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_HISTORY_LIST;
    }
}
