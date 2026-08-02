package com.vk.voip.ui.asr.ui.list;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vk.voip.ui.asr.ui.list.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.b1a;
import xsna.ba40;
import xsna.bn90;
import xsna.bp7;
import xsna.bwt0;
import xsna.d05;
import xsna.dv3;
import xsna.ef90;
import xsna.ev3;
import xsna.fm50;
import xsna.fn90;
import xsna.fpf0;
import xsna.g2v;
import xsna.gm50;
import xsna.gn90;
import xsna.h57;
import xsna.h7u0;
import xsna.hn90;
import xsna.in90;
import xsna.jjx;
import xsna.jp5;
import xsna.jvi;
import xsna.km50;
import xsna.lx60;
import xsna.m7m;
import xsna.mau;
import xsna.mk50;
import xsna.oz50;
import xsna.pgh0;
import xsna.pn90;
import xsna.r820;
import xsna.s3q0;
import xsna.um90;
import xsna.vk50;
import xsna.vm90;
import xsna.w440;
import xsna.xn50;
import xsna.yhg;
import xsna.ym90;
import xsna.z00;

/* compiled from: PastAsrListFragment.kt */
/* loaded from: classes7.dex */
public final class PastAsrListFragment extends MviImplFragment<bn90, com.vk.voip.ui.asr.ui.list.a, um90> {
    public static final /* synthetic */ int U = 0;
    public final c Q;
    public final vm90 R;
    public final pn90 S;
    public yhg T;

    /* compiled from: PastAsrListFragment.kt */
    public static class a extends oz50 {
    }

    /* compiled from: PastAsrListFragment.kt */
    public static final class b {
        public final CustomSwipeRefreshLayout a;
        public final View b;
        public final View c;
        public final View d;
        public final TextView e;

        public b(CustomSwipeRefreshLayout customSwipeRefreshLayout, View view, View view2, View view3, TextView textView) {
            this.a = customSwipeRefreshLayout;
            this.b = view;
            this.c = view2;
            this.d = view3;
            this.e = textView;
        }
    }

    /* compiled from: PastAsrListFragment.kt */
    public static final class c implements in90<hn90> {
        public c() {
        }

        @Override // xsna.in90
        public final void a(hn90 hn90Var) {
            boolean z = hn90Var instanceof hn90.d;
            final PastAsrListFragment pastAsrListFragment = PastAsrListFragment.this;
            if (z) {
                xn50.a.c(pastAsrListFragment, um90.e.b);
            } else if ((hn90Var instanceof hn90.e) || (hn90Var instanceof hn90.g)) {
                xn50.a.c(pastAsrListFragment, um90.f.b);
            } else if (hn90Var instanceof hn90.a) {
                xn50.a.c(pastAsrListFragment, new um90.a(((hn90.a) hn90Var).a));
            } else if (hn90Var instanceof hn90.c) {
                ev3 ev3Var = ((hn90.c) hn90Var).a;
                int i = PastAsrListFragment.U;
                new ym90(pastAsrListFragment.kn(), ev3Var, pastAsrListFragment.Q).c();
            } else if (hn90Var instanceof hn90.b) {
                xn50.a.c(pastAsrListFragment, new um90.b(((hn90.b) hn90Var).a));
            } else {
                if (!(hn90Var instanceof hn90.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                final ev3 ev3Var2 = ((hn90.f) hn90Var).a;
                int i2 = PastAsrListFragment.U;
                FragmentActivity activity = pastAsrListFragment.getActivity();
                if (activity != null) {
                    int i3 = h7u0.p;
                    h7u0.a c = h7u0.b.c(activity);
                    c.g0(R.string.voip_asr_list_menu_remove_dialog_title);
                    c.U(R.string.voip_asr_list_menu_remove_dialog_subtitle);
                    c.c0(R.string.voip_asr_list_menu_remove_dialog_yes, new DialogInterface.OnClickListener() { // from class: xsna.cn90
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            int i5 = PastAsrListFragment.U;
                            xn50.a.c(PastAsrListFragment.this, new um90.g(ev3Var2));
                        }
                    });
                    c.W(R.string.cancel, new w440(1));
                    c.m();
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public PastAsrListFragment() {
        c cVar = new c();
        this.Q = cVar;
        this.R = new vm90(cVar);
        this.S = new pn90(cVar);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_past_asr_list_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        com.vk.voip.ui.asr.ui.list.a aVar = (com.vk.voip.ui.asr.ui.list.a) ao50Var;
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.past_asr_list_root_toolbar);
        if (toolbar == null) {
            toolbar = null;
        }
        toolbar.setNavigationOnClickListener(new z00(this, 9));
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) view.findViewById(R.id.past_asr_list_recycler_swipe_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.past_asr_list_recycler);
        View findViewById = view.findViewById(R.id.past_asr_list_empty_state_container);
        View findViewById2 = view.findViewById(R.id.past_asr_list_empty_state_action_button);
        View findViewById3 = view.findViewById(R.id.past_asr_list_loading_state_container);
        View findViewById4 = view.findViewById(R.id.past_asr_list_error_state_container);
        TextView textView = (TextView) view.findViewById(R.id.past_asr_list_error_state_title);
        View findViewById5 = view.findViewById(R.id.past_asr_list_error_state_retry_button);
        customSwipeRefreshLayout.setOnRefreshListener(new mau(this, 10));
        mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        pgh0 pgh0Var = new pgh0(recyclerView);
        vm90 vm90Var = this.R;
        vm90Var.registerAdapterDataObserver(pgh0Var);
        recyclerView.setAdapter(vm90Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new ef90(this.S));
        bwt0.i0(findViewById5, new ba40(this, 9));
        bwt0.i0(findViewById2, new r820(this, 9));
        b bVar = new b(customSwipeRefreshLayout, findViewById, findViewById3, findViewById4, textView);
        gm50.a.b(this, aVar.d, new bp7(27, this, bVar));
        gm50.a.b(this, aVar.a, new jp5(18, this, bVar));
        gm50.a.b(this, aVar.c, new b1a(25, this, bVar));
        gm50.a.b(this, aVar.b, new h57(20, this, bVar));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((bn90) vk50Var).h.a(new jjx(this, 21), this);
    }

    public final void fo(fm50<? extends gn90> fm50Var, b bVar) {
        bwt0.p0(bVar.c, fm50Var instanceof a.d);
        boolean z = fm50Var instanceof a.b;
        bwt0.p0(bVar.d, z);
        bwt0.p0(bVar.b, fm50Var instanceof a.c);
        boolean z2 = fm50Var instanceof a.C2010a;
        bwt0.p0(bVar.a, z2);
        if (z) {
            gm50.a.a(this, ((a.b) fm50Var).a, new d05(28, bVar, this));
        } else if (z2) {
            gm50.a.a(this, ((a.C2010a) fm50Var).a, new lx60(3, this, bVar));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.T = new yhg(requireContext(), In(), g2v.c(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a(), ((VoipStereoRouterComponent) m7m.d(this).a(fpf0.a(VoipStereoRouterComponent.class))).a(), ((MaxUtilityComponent) m7m.d(this).mo408a(fpf0.a(MaxUtilityComponent.class))).j7());
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new bn90(new fn90(gn90.d.b), new jvi(), new dv3((Object) kn()));
    }
}
