package com.vk.narratives.impl.highlights;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.r;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bb;
import xsna.bpn0;
import xsna.bu1;
import xsna.c5g;
import xsna.cu1;
import xsna.eb;
import xsna.eu1;
import xsna.fnj;
import xsna.fpf0;
import xsna.gko;
import xsna.gu1;
import xsna.iah0;
import xsna.ikv0;
import xsna.il1;
import xsna.izs;
import xsna.j6v;
import xsna.lu1;
import xsna.m5v;
import xsna.m7m;
import xsna.msy;
import xsna.oc0;
import xsna.oq;
import xsna.pt;
import xsna.py;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.v7;
import xsna.xt1;
import xsna.yt1;
import xsna.yy;
import xsna.zt1;
import xsna.zy;

/* compiled from: AllHighlightsFragment.kt */
/* loaded from: classes3.dex */
public final class AllHighlightsFragment extends BaseMvpFragment<zt1> {
    public static final int g0 = iah0.a(64);
    public VkTopBar T;
    public VkRecyclerPaginatedView U;
    public boolean V;
    public final int W = 3;
    public final b X;
    public final r Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final bpn0 c0;
    public final Object d0;
    public d e0;
    public final Object f0;

    /* compiled from: AllHighlightsFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<RecyclerView.e0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(RecyclerView.e0 e0Var) {
            ((r) this.receiver).x(e0Var);
            return s3q0.a;
        }
    }

    public AllHighlightsFragment() {
        b bVar = new b();
        this.X = bVar;
        this.Y = new r(bVar);
        i iVar = new i(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Z = msy.a(lazyThreadSafetyMode, iVar);
        this.a0 = msy.a(lazyThreadSafetyMode, new bu1(this, 0));
        this.b0 = msy.a(lazyThreadSafetyMode, new h(this, 2));
        this.c0 = new bpn0(new com.vk.movika.sdk.base.model.b(this, 4));
        this.d0 = msy.a(lazyThreadSafetyMode, new cu1(0));
        this.f0 = msy.a(lazyThreadSafetyMode, new bb(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo(boolean z) {
        if (z) {
            VkTopBar vkTopBar = this.T;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            vkTopBar.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_cancel_outline_28), tq.h(tlo0.Companion, R.string.accessibility_cancel), new eb(this, 2), null, com.vk.core.compose.component.semantics.b.a(null, new pt(4), 3), 24));
            VkTopBar vkTopBar2 = this.T;
            if (vkTopBar2 == null) {
                vkTopBar2 = null;
            }
            vkTopBar2.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_done_outline_28), new tlo0.f(R.string.done), new il1(this, 1), null, null, com.vk.core.compose.component.semantics.b.a(null, new py(1), 3), 24), null, 6));
        } else {
            if (fnj.d(requireContext())) {
                VkTopBar vkTopBar3 = this.T;
                if (vkTopBar3 == null) {
                    vkTopBar3 = null;
                }
                vkTopBar3.setBefore(null);
            } else {
                VkTopBar vkTopBar4 = this.T;
                if (vkTopBar4 == null) {
                    vkTopBar4 = null;
                }
                vkTopBar4.setBefore(new VkTopBar.c.f(new gko(R.drawable.vk_icon_arrow_left_outline_28), tq.h(tlo0.Companion, R.string.accessibility_back), new eu1(this, 0), null, com.vk.core.compose.component.semantics.b.a(null, new yy(1), 3), 24));
            }
            zt1 zt1Var = (zt1) this.S;
            if (zt1Var != null && zt1Var.P4()) {
                VkTopBar vkTopBar5 = this.T;
                if (vkTopBar5 == null) {
                    vkTopBar5 = null;
                }
                vkTopBar5.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_edit_outline_28), tq.h(tlo0.Companion, R.string.accessibility_highlights_edit), new zy(this, 2), null, null, com.vk.core.compose.component.semantics.b.a(null, new oc0(1), 3), 24), null, 6));
            }
        }
        yt1 yt1Var = (yt1) this.f0.getValue();
        yt1Var.h = z;
        yt1Var.notifyItemRangeChanged(0, yt1Var.g.size() - 1);
        this.X.f = z ? this.W : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    public final void ko(List<Narrative> list) {
        ?? r0 = this.f0;
        if (!((yt1) r0.getValue()).h && !((Boolean) this.d0.getValue()).booleanValue() && list.isEmpty()) {
            finish();
        }
        int size = list.size();
        int i = ((zt1) this.S).P4() ? 2 : 1;
        yt1 yt1Var = (yt1) r0.getValue();
        ArrayList arrayList = new ArrayList(size + i);
        if (((zt1) this.S).P4()) {
            arrayList.add(gu1.a.b);
        }
        List<Narrative> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new gu1.b((Narrative) it.next(), false));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new gu1.c(list.size()));
        List<? extends gu1> list3 = yt1Var.g;
        yt1Var.g = arrayList;
        m.a(new xt1(list3, arrayList), true).b(yt1Var);
        if (this.V) {
            this.V = false;
            ((zt1) this.S).R1(true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if ((i == 8764 || i == 8765) && i2 == -1 && intent != null) {
            boolean z = i == 8764;
            Narrative narrative = (Narrative) intent.getParcelableExtra("RESULT_EXTRA_HIGHLIGHT");
            ikv0.a aVar = new ikv0.a(requireContext());
            aVar.u = new ikv0.d(z ? getResources().getQuantityString(R.plurals.highlight_multiple_stories_added_in_one_highlight, narrative.g.size(), Integer.valueOf(narrative.g.size()), narrative.d) : getResources().getString(R.string.highlight_updated, narrative.d), (String) null, (ikv0.d.a) null, 6);
            Serializer.c<Narrative> cVar = Narrative.CREATOR;
            String b2 = Narrative.a.b(narrative, iah0.a(24));
            if (b2 != null) {
                aVar.t = new ikv0.c.e(new c.d(b2, null), null, null, 14);
            }
            aVar.n();
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d dVar = this.e0;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        NarrativeComponent narrativeComponent = (NarrativeComponent) m7m.d(this).a(fpf0.a(NarrativeComponent.class));
        UserId userId = (UserId) requireArguments.getParcelable("owner_id");
        if (userId == null) {
            userId = UserId.d;
        }
        this.S = new lu1(this, userId, (String) this.a0.getValue(), narrativeComponent.Ic(), narrativeComponent.V7(), (j6v) this.b0.getValue(), ((NewsFeedBridgeComponent) m7m.d(this).a(fpf0.a(NewsFeedBridgeComponent.class))).Ad());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_all_highlights, viewGroup, false);
        this.T = (VkTopBar) inflate.findViewById(R.id.toolbar);
        String str = (String) this.Z.getValue();
        tlo0 d = str != null ? oq.d(tlo0.Companion, str) : tq.h(tlo0.Companion, R.string.highlights);
        VkTopBar vkTopBar = this.T;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(d, null, null, null, null, 30), 0 == true ? 1 : 0, 0 == true ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new v7(3), 3), 6));
        VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) inflate.findViewById(R.id.highlights);
        this.U = vkRecyclerPaginatedView;
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        vkRecyclerPaginatedView.setAdapter((yt1) this.f0.getValue());
        RecyclerView recyclerView = vkRecyclerPaginatedView.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.Y.l(recyclerView);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        zt1 zt1Var = (zt1) this.S;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.U;
        if (vkRecyclerPaginatedView == null) {
            vkRecyclerPaginatedView = null;
        }
        zt1Var.K4(vkRecyclerPaginatedView);
        if (bundle == null && requireArguments().getBoolean("edit_mode")) {
            this.V = true;
        }
    }

    /* compiled from: AllHighlightsFragment.kt */
    public static final class b extends r.g {
        public b() {
            super(0, 0);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean a(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            return (e0Var instanceof m5v) && (e0Var2 instanceof m5v);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            if (!(e0Var instanceof m5v) || !(e0Var2 instanceof m5v)) {
                return false;
            }
            ((zt1) AllHighlightsFragment.this.S).g6(((m5v) e0Var).getAdapterPosition() - 1, ((m5v) e0Var2).getAdapterPosition() - 1);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
