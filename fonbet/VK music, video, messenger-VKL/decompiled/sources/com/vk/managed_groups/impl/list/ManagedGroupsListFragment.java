package com.vk.managed_groups.impl.list;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Peer;
import com.vk.managed_groups.impl.ManagedGroupsInnerComponent;
import com.vk.managed_groups.impl.list.a;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeMessagingActionItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.c0;
import xsna.a1w;
import xsna.ao50;
import xsna.asu0;
import xsna.bfm;
import xsna.bi00;
import xsna.bpn0;
import xsna.ci00;
import xsna.dhr0;
import xsna.e2s;
import xsna.fpf0;
import xsna.gm50;
import xsna.h2s;
import xsna.h48;
import xsna.h6g;
import xsna.hg1;
import xsna.i2w;
import xsna.iah0;
import xsna.iid0;
import xsna.ji00;
import xsna.km50;
import xsna.lpj;
import xsna.m7m;
import xsna.mk50;
import xsna.ng3;
import xsna.nwy;
import xsna.oz50;
import xsna.pi00;
import xsna.qcy;
import xsna.qfj;
import xsna.tf1;
import xsna.ti00;
import xsna.too0;
import xsna.u6k;
import xsna.uh00;
import xsna.vk50;
import xsna.w4u;
import xsna.xn50;
import xsna.y1z;
import xsna.zqh;

/* compiled from: ManagedGroupsListFragment.kt */
/* loaded from: classes3.dex */
public final class ManagedGroupsListFragment extends MviImplFragment<com.vk.managed_groups.impl.list.c, g, com.vk.managed_groups.impl.list.a> implements too0 {
    public static final /* synthetic */ int X = 0;
    public int S;
    public Integer T;
    public final io.reactivex.rxjava3.disposables.b Q = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 R = new bpn0(new qfj(this, 18));
    public final b U = new b();
    public final c V = new c();
    public final bpn0 W = new bpn0(new w4u(this, 8));

    /* compiled from: ManagedGroupsListFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: ManagedGroupsListFragment.kt */
    public static final class b extends FragmentImpl.b {
        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            int i = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: ManagedGroupsListFragment.kt */
    public static final class c implements pi00 {
        public c() {
        }

        @Override // xsna.pi00
        public final void a(Peer.Group group) {
            xn50.a.c(ManagedGroupsListFragment.this, new a.b(group));
        }
    }

    public static void fo(long j) {
        iid0 iid0Var = (iid0) bi00.a.getValue();
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
        SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeMessagingActionItem(SchemeStat$TypeMessagingActionItem.ActionType.OPEN_COMMUNITY_CHATS, null, null, Long.valueOf(j), null, null, null, null, null, null, null, null, 4086, null), 3);
        iid0Var.f = c2;
        iid0Var.g = b2;
        iid0Var.q();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.managed_groups_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        RecyclerView recyclerView;
        int paddingBottom;
        g gVar = (g) ao50Var;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.managed_groups_recycler);
        ci00 ci00Var = new ci00(requireContext(), this.V);
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setOverScrollMode(2);
        recyclerView2.setAdapter(ci00Var);
        int i = this.S;
        this.S = i;
        View view2 = getView();
        if (view2 != null && (recyclerView = (RecyclerView) view2.findViewById(R.id.managed_groups_recycler)) != null) {
            Integer num = this.T;
            if (num != null) {
                paddingBottom = num.intValue();
            } else {
                paddingBottom = recyclerView.getPaddingBottom();
                this.T = Integer.valueOf(paddingBottom);
            }
            h48.a(recyclerView, paddingBottom, i, iah0.a(16));
        }
        gm50.a.b(this, gVar.a, new ng3(24, this, ci00Var));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.U;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        this.U.b();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.managed_groups.impl.list.c cVar = (com.vk.managed_groups.impl.list.c) vk50Var;
        ti00 ti00Var = cVar.f;
        ti00Var.a();
        ti00Var.e.b(hg1.h(new c0(ti00Var.c.b(), new tf1(new h6g(ti00Var, 29), 26), io.reactivex.rxjava3.internal.functions.a.c), new h2s(ti00Var, 11)));
        this.Q.b(hg1.h(ti00Var.d, new u6k(cVar, 16)));
        cVar.h.a(new zqh(this, 26), this);
        cVar.i.a(new e2s(this, 8), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.Q.dispose();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.S = 0;
        this.T = null;
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        a1w a2 = i2w.a();
        nwy nwyVar = ((ManagedGroupsInnerComponent) m7m.d(this).a(fpf0.a(ManagedGroupsInnerComponent.class))).b;
        qcy<Object> qcyVar = ManagedGroupsInnerComponent.c[0];
        return new com.vk.managed_groups.impl.list.c(new ti00(a2, (ji00) nwyVar.c()), new uh00(i2w.a(), asu0.a, new bfm(this, 17)));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.IM_COMMUNITY_LIST;
    }
}
