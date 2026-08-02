package com.vk.voip.ui.scheduled.callslist;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.lists.CustomSwipeRefreshLayout;
import com.vk.log.L;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a201;
import xsna.adz;
import xsna.aig;
import xsna.ao50;
import xsna.aqt0;
import xsna.bwt0;
import xsna.c7h0;
import xsna.cd9;
import xsna.cim0;
import xsna.dhr0;
import xsna.eci0;
import xsna.ef90;
import xsna.ejf0;
import xsna.emu;
import xsna.fm50;
import xsna.fpf0;
import xsna.g2v;
import xsna.ghn0;
import xsna.gm50;
import xsna.hmj0;
import xsna.j59;
import xsna.k59;
import xsna.kj50;
import xsna.km50;
import xsna.lng;
import xsna.lyb0;
import xsna.m7m;
import xsna.mf90;
import xsna.mk50;
import xsna.mlh0;
import xsna.mo3;
import xsna.msy;
import xsna.o25;
import xsna.o7h0;
import xsna.os8;
import xsna.oz50;
import xsna.pgh0;
import xsna.phh0;
import xsna.q6h0;
import xsna.q7h0;
import xsna.qyi0;
import xsna.r49;
import xsna.r6h0;
import xsna.r7h0;
import xsna.rd9;
import xsna.rls0;
import xsna.rte0;
import xsna.s7h0;
import xsna.skj0;
import xsna.t6h0;
import xsna.t7h0;
import xsna.tyw0;
import xsna.u6h0;
import xsna.uyw0;
import xsna.v7h0;
import xsna.vg20;
import xsna.vhg;
import xsna.vhs0;
import xsna.vk50;
import xsna.wii0;
import xsna.xn50;
import xsna.y5h0;
import xsna.yhg;
import xsna.zqu;

/* compiled from: VoipScheduledCallsFragment.kt */
/* loaded from: classes7.dex */
public final class VoipScheduledCallsFragment extends MviImplFragment<c7h0, v7h0, r49> {
    public static final /* synthetic */ int c0 = 0;
    public final lng Q = new lng();
    public final r6h0 R = new r6h0();
    public final t7h0 S = new t7h0();
    public final c T;
    public final ArrayList<WeakReference<phh0>> U;
    public final u6h0 V;
    public final mf90 W;
    public yhg X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final adz b0;

    /* compiled from: VoipScheduledCallsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: VoipScheduledCallsFragment.kt */
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

    /* compiled from: VoipScheduledCallsFragment.kt */
    public static final class c implements k59<j59> {
        public c() {
        }

        @Override // xsna.k59
        public final void a(j59 j59Var) {
            y5h0 aVar;
            boolean z = j59Var instanceof aig;
            VoipScheduledCallsFragment voipScheduledCallsFragment = VoipScheduledCallsFragment.this;
            if (z) {
                voipScheduledCallsFragment.Q.getClass();
                xn50.a.d(voipScheduledCallsFragment, (kj50[]) Arrays.copyOf(lng.a((aig) j59Var), 1));
                return;
            }
            if (!(j59Var instanceof q6h0)) {
                if (!(j59Var instanceof s7h0)) {
                    L.G("Unhandled event " + j59Var);
                    return;
                } else {
                    voipScheduledCallsFragment.S.getClass();
                    if (!((s7h0) j59Var).equals(s7h0.a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xn50.a.d(voipScheduledCallsFragment, (kj50[]) Arrays.copyOf(new t6h0[]{t6h0.a.b}, 1));
                    return;
                }
            }
            q6h0 q6h0Var = (q6h0) j59Var;
            voipScheduledCallsFragment.R.getClass();
            if (q6h0Var instanceof q6h0.b) {
                q6h0.b bVar = (q6h0.b) q6h0Var;
                aVar = new y5h0.b(bVar.a, bVar.b);
            } else if (q6h0Var instanceof q6h0.d.a) {
                aVar = new y5h0.d.a();
            } else if (q6h0Var instanceof q6h0.d.b) {
                aVar = new y5h0.d.b(((q6h0.d.b) q6h0Var).a);
            } else if (q6h0Var instanceof q6h0.d.c) {
                aVar = new y5h0.d.c(((q6h0.d.c) q6h0Var).a);
            } else if (q6h0Var instanceof q6h0.d.C3550d) {
                aVar = new y5h0.d.C4077d(((q6h0.d.C3550d) q6h0Var).a);
            } else if (q6h0Var instanceof q6h0.c.b) {
                aVar = new y5h0.c.b(((q6h0.c.b) q6h0Var).a);
            } else if (q6h0Var instanceof q6h0.c.a) {
                aVar = new y5h0.c.a(((q6h0.c.a) q6h0Var).a);
            } else {
                if (!(q6h0Var instanceof q6h0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new y5h0.a(((q6h0.a) q6h0Var).a);
            }
            xn50.a.d(voipScheduledCallsFragment, (kj50[]) Arrays.copyOf(new y5h0[]{aVar}, 1));
        }
    }

    public VoipScheduledCallsFragment() {
        c cVar = new c();
        this.T = cVar;
        this.U = new ArrayList<>();
        u6h0 u6h0Var = new u6h0(cVar);
        u6h0Var.k = new wii0(this, 19);
        this.V = u6h0Var;
        this.W = new mf90(cVar);
        ghn0 ghn0Var = new ghn0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Y = msy.a(lazyThreadSafetyMode, ghn0Var);
        this.Z = msy.a(lazyThreadSafetyMode, new ejf0(this, 26));
        this.a0 = msy.a(lazyThreadSafetyMode, new uyw0(this, 0));
        this.b0 = new adz(this, 21);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_scheduled_calls_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        v7h0 v7h0Var = (v7h0) ao50Var;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = (CustomSwipeRefreshLayout) view.findViewById(R.id.voip_history_recycler_swipe_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_history_recycler);
        View findViewById = view.findViewById(R.id.container_scheduled_calls_empty);
        View findViewById2 = view.findViewById(R.id.voip_history_loading_state_container);
        View findViewById3 = view.findViewById(R.id.voip_history_error_state_container);
        TextView textView = (TextView) view.findViewById(R.id.voip_history_error_state_title);
        View findViewById4 = view.findViewById(R.id.voip_history_error_state_retry_button);
        customSwipeRefreshLayout.setOnRefreshListener(new mlh0(this, 10));
        mo2getContext();
        recyclerView.setLayoutManager(new StickyHeadersLinearLayoutManager(this));
        pgh0 pgh0Var = new pgh0(recyclerView);
        u6h0 u6h0Var = this.V;
        u6h0Var.registerAdapterDataObserver(pgh0Var);
        recyclerView.setAdapter(u6h0Var);
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new ef90(this.W));
        recyclerView.addOnScrollListener(new os8(this.U));
        bwt0.i0(findViewById4, new cim0(this, 18));
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent_themed));
        dhr0.a.V(toolbar);
        toolbar.setNavigationOnClickListener(new mo3(this, 20));
        b bVar = new b(customSwipeRefreshLayout, findViewById, findViewById2, findViewById3, textView);
        gm50.a.b(this, v7h0Var.d, new eci0(12, this, bVar));
        gm50.a.b(this, v7h0Var.a, new hmj0(11, this, bVar));
        gm50.a.b(this, v7h0Var.c, new tyw0(0, this, bVar));
        gm50.a.b(this, v7h0Var.b, new lyb0(9, this, bVar));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        c7h0 c7h0Var = (c7h0) vk50Var;
        c7h0Var.o.a(new skj0(this, 27), this);
        c7h0Var.q.a(new qyi0(this, 29), this);
        c7h0Var.p.a(new vhs0(this, 14), this);
    }

    public final void fo(fm50<? extends r7h0> fm50Var, b bVar) {
        CustomSwipeRefreshLayout customSwipeRefreshLayout = bVar.a;
        View view = bVar.b;
        View view2 = bVar.c;
        View view3 = bVar.d;
        TextView textView = bVar.e;
        if (fm50Var instanceof v7h0.c) {
            bwt0.p0(view2, true);
            bwt0.p0(customSwipeRefreshLayout, false);
            bwt0.p0(view, false);
            bwt0.p0(view3, false);
            return;
        }
        if (fm50Var instanceof v7h0.b) {
            bwt0.p0(view3, true);
            bwt0.p0(customSwipeRefreshLayout, false);
            bwt0.p0(view2, false);
            bwt0.p0(view, false);
            gm50.a.a(this, ((v7h0.b) fm50Var).a, new rls0(6, textView, this));
            return;
        }
        if (fm50Var instanceof v7h0.d) {
            bwt0.p0(view, true);
            bwt0.p0(customSwipeRefreshLayout, false);
            bwt0.p0(view2, false);
            bwt0.p0(view3, false);
            return;
        }
        if (fm50Var instanceof v7h0.a) {
            bwt0.p0(customSwipeRefreshLayout, true);
            bwt0.p0(view2, false);
            bwt0.p0(view, false);
            bwt0.p0(view3, false);
            gm50.a.a(this, ((v7h0.a) fm50Var).a, new aqt0(2, this, customSwipeRefreshLayout));
        }
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.X = new yhg(requireContext(), In(), g2v.c(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a(), ((VoipStereoRouterComponent) m7m.d(this).a(fpf0.a(VoipStereoRouterComponent.class))).a(), ((MaxUtilityComponent) m7m.d(this).mo408a(fpf0.a(MaxUtilityComponent.class))).j7());
        FragmentManager parentFragmentManager = getParentFragmentManager();
        adz adzVar = this.b0;
        parentFragmentManager.l0("EditScheduledCall", this, adzVar);
        getChildFragmentManager().l0("select_calls_from", this, adzVar);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        xn50.a.c(this, vhg.a.b);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        cd9 e = a201.b().e();
        vg20 vg20Var = new vg20();
        zqu zquVar = new zqu();
        rd9 rd9Var = new rd9();
        rte0 rte0Var = new rte0(vg20Var);
        return new c7h0(new o7h0(kn()), new emu(vg20Var, zquVar), rte0Var, new q7h0(vg20Var, rd9Var), o25.a(), a201.b().b(), e);
    }
}
