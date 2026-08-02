package com.vk.newsfeed.impl.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stat.recycler.Measurement;
import com.vk.stat.recycler.d;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.a4r;
import xsna.b1j;
import xsna.b25;
import xsna.bd70;
import xsna.bin0;
import xsna.bpn0;
import xsna.bzj;
import xsna.c5f;
import xsna.cj4;
import xsna.cn70;
import xsna.cnh;
import xsna.cwg;
import xsna.d3f0;
import xsna.dne;
import xsna.dqp;
import xsna.ehv;
import xsna.elg0;
import xsna.epx;
import xsna.f5z;
import xsna.fb80;
import xsna.fhl;
import xsna.fpf0;
import xsna.fqp;
import xsna.fsk;
import xsna.fxc0;
import xsna.g0t;
import xsna.ghl;
import xsna.gii0;
import xsna.gzs;
import xsna.h3p0;
import xsna.hjf0;
import xsna.hnv;
import xsna.hux;
import xsna.i5f;
import xsna.irp;
import xsna.j4c0;
import xsna.jc60;
import xsna.jjc;
import xsna.jqp;
import xsna.jrh;
import xsna.jz60;
import xsna.k5r0;
import xsna.krh;
import xsna.ldl;
import xsna.m7m;
import xsna.mhy;
import xsna.mqp;
import xsna.mrp;
import xsna.msy;
import xsna.n0n;
import xsna.p870;
import xsna.p90;
import xsna.pds;
import xsna.peh0;
import xsna.pwc0;
import xsna.qql0;
import xsna.qqp;
import xsna.qt3;
import xsna.rru;
import xsna.rwc0;
import xsna.s1c0;
import xsna.s3q0;
import xsna.sje;
import xsna.tlo0;
import xsna.tq;
import xsna.u1c0;
import xsna.v3n;
import xsna.vi0;
import xsna.w3r;
import xsna.w5r0;
import xsna.wh1;
import xsna.x0;
import xsna.x16;
import xsna.x5i;
import xsna.xdx;
import xsna.xm60;
import xsna.xqf;
import xsna.xrj;
import xsna.xzs;
import xsna.y3v;
import xsna.yqf;
import xsna.z1h0;
import xsna.z960;
import xsna.zoj0;

/* compiled from: EntriesListFragment.kt */
/* loaded from: classes4.dex */
public abstract class EntriesListFragment<P extends dqp> extends BaseFragment implements fqp, pds {
    public static final int m0 = cn70.b(102);
    public final Object S;
    public final bpn0 T;
    public VkTopBar U;
    public final bpn0 V;
    public final bpn0 W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final mqp d0;
    public final int e0;
    public final int f0;
    public boolean g0;
    public final jqp h0;
    public final Object i0;
    public final Object j0;
    public AppBarLayout k0;
    public final Object l0;

    /* compiled from: EntriesListFragment.kt */
    public static class FocusableGridLayoutManager extends GridLayoutManager {
        public final d A;
        public final WeakReference<View> B;
        public final int C;

        public FocusableGridLayoutManager(FragmentActivity fragmentActivity, FragmentImpl fragmentImpl, d dVar) {
            super(3);
            this.A = dVar;
            this.B = new WeakReference<>(fragmentImpl.getView());
            this.C = EntriesListFragment.m0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            d dVar = this.A;
            if (dVar != null) {
                dVar.a();
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
            int itemViewType = getItemViewType(view);
            if (dVar != null) {
                dVar.b(itemViewType, Measurement.Type.Layout, (String) j4c0.a().get(Integer.valueOf(itemViewType)));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void measureChildWithMargins(View view, int i, int i2) {
            d dVar = this.A;
            if (dVar != null) {
                dVar.a();
            }
            super.measureChildWithMargins(view, i, i2);
            int itemViewType = getItemViewType(view);
            if (dVar != null) {
                dVar.b(itemViewType, Measurement.Type.Measure, (String) j4c0.a().get(Integer.valueOf(itemViewType)));
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void o(RecyclerView.a0 a0Var, int[] iArr) {
            super.o(a0Var, iArr);
            iArr[1] = iArr[1] + this.C;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void removeAndRecycleViewAt(int i, RecyclerView.v vVar) {
            try {
                super.removeAndRecycleViewAt(i, vVar);
            } catch (Throwable unused) {
                View view = this.B.get();
                if (view != null) {
                    mhy.d(view);
                    view.clearFocus();
                }
            }
        }
    }

    /* compiled from: EntriesListFragment.kt */
    public static final class FocusableLinearLayoutManager extends LinearLayoutManager {
        public final d r;
        public final WeakReference<View> s;
        public final int t = EntriesListFragment.m0;

        public FocusableLinearLayoutManager(Context context, FragmentImpl fragmentImpl, d dVar) {
            this.r = dVar;
            this.s = new WeakReference<>(fragmentImpl.getView());
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final RecyclerView.p generateDefaultLayoutParams() {
            return new RecyclerView.p(-1, -2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            d dVar = this.r;
            if (dVar != null) {
                dVar.a();
            }
            super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
            int itemViewType = getItemViewType(view);
            if (dVar != null) {
                dVar.b(itemViewType, Measurement.Type.Layout, (String) j4c0.a().get(Integer.valueOf(itemViewType)));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void measureChildWithMargins(View view, int i, int i2) {
            d dVar = this.r;
            if (dVar != null) {
                dVar.a();
            }
            super.measureChildWithMargins(view, i, i2);
            int itemViewType = getItemViewType(view);
            if (dVar != null) {
                dVar.b(itemViewType, Measurement.Type.Measure, (String) j4c0.a().get(Integer.valueOf(itemViewType)));
            }
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void o(RecyclerView.a0 a0Var, int[] iArr) {
            super.o(a0Var, iArr);
            iArr[1] = iArr[1] + this.t;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void removeAndRecycleViewAt(int i, RecyclerView.v vVar) {
            try {
                super.removeAndRecycleViewAt(i, vVar);
            } catch (Throwable unused) {
                View view = this.s.get();
                if (view != null) {
                    mhy.d(view);
                    view.clearFocus();
                }
            }
        }
    }

    /* compiled from: EntriesListFragment.kt */
    public static final /* synthetic */ class a implements fb80.a, g0t {
        public final /* synthetic */ P b;

        public a(P p) {
            this.b = p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fb80.a) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, this.b, dqp.class, "getItemViewedScreen", "getItemViewedScreen()Lcom/vk/stat/scheme/MobileOfficialAppsCoreNavStat$EventScreen;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.fb80.a
        public final MobileOfficialAppsCoreNavStat$EventScreen provide() {
            return this.b.x0();
        }
    }

    public EntriesListFragment() {
        cj4 cj4Var = new cj4(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, cj4Var);
        new bpn0(new dne(this, 21));
        this.T = new bpn0(new krh(this, 12));
        this.V = new bpn0(new ldl(this, 9));
        b bVar = new b();
        this.W = new bpn0(new xrj(this, 4));
        this.X = msy.a(lazyThreadSafetyMode, new i5f(this, 20));
        this.Y = msy.a(lazyThreadSafetyMode, new x5i(this, 13));
        this.Z = msy.a(lazyThreadSafetyMode, new xqf(this, 19));
        this.a0 = msy.a(lazyThreadSafetyMode, new sje(this, 25));
        this.b0 = msy.a(lazyThreadSafetyMode, new cwg(this, 16));
        this.c0 = msy.a(lazyThreadSafetyMode, new vi0(17));
        mqp mqpVar = new mqp(ko(), this, this, fsk.c);
        mqpVar.E = bVar;
        this.d0 = mqpVar;
        this.e0 = R.layout.news_entries_fragment;
        this.f0 = R.layout.news_entries_fragment_without_toolbar;
        this.h0 = new jqp(mqpVar);
        this.i0 = msy.a(lazyThreadSafetyMode, new c5f(this, 16));
        this.j0 = msy.a(lazyThreadSafetyMode, new jrh(this, 10));
        this.l0 = msy.a(lazyThreadSafetyMode, new x0(11));
    }

    @Override // xsna.fqp
    public final void Aa(gzs<s3q0> gzsVar) {
        this.d0.y.d(gzsVar);
    }

    @Override // xsna.fqp
    public final void Ak() {
        this.h0.e();
    }

    @Override // xsna.s980
    public final boolean E8(Attachment attachment, NewsEntry newsEntry) {
        return this.d0.i.E8(attachment, newsEntry);
    }

    @Override // xsna.o2u0
    public final void F2(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        z1h0 parentFragment = getParentFragment();
        if (parentFragment instanceof hnv) {
            ((hnv) parentFragment).F2(str);
        }
    }

    @Override // xsna.fqp
    public final <T> bd70<T> F8(bd70<T> bd70Var) {
        return new peh0(bd70Var, new bin0() { // from class: xsna.tqp
            @Override // xsna.bin0
            public final Object get() {
                return EntriesListFragment.this.d0.c();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public void G5(View view, final NewsEntry newsEntry, final NewsEntry newsEntry2, final int i) {
        boolean z = M0().v || M0().w;
        UserId c = ((b25) this.a0.getValue()).c();
        View io2 = io(view, newsEntry, newsEntry2);
        boolean z2 = newsEntry2 instanceof DiscoverMediaBlock;
        final boolean z3 = z;
        this.d0.s = this.h0.n(view, new xm60(newsEntry, newsEntry2, null, ko().s0(), z2, !(newsEntry instanceof DiscoverMediaBlock) && z2 && io2 == null, M0().o, c, z, false, false, false, false, false, false, 125124), new z960() { // from class: xsna.sqp
            @Override // xsna.z960
            public final void g(VkContextMenu vkContextMenu, int i2) {
                int i3 = EntriesListFragment.m0;
                jc60 jc60Var = new jc60(i2, newsEntry, newsEntry2, i, z3, null);
                EntriesListFragment entriesListFragment = EntriesListFragment.this;
                entriesListFragment.ko().w0(entriesListFragment.requireContext(), jc60Var);
                entriesListFragment.d0.s = null;
            }
        }, new cnh(this, 7), io2);
    }

    @Override // xsna.fqp
    public final void Gl(Html5Entry html5Entry) {
        this.d0.b().a(html5Entry);
    }

    @Override // xsna.fqp
    public final void H3(u1c0 u1c0Var, int i) {
        this.h0.k(u1c0Var, i);
    }

    @Override // xsna.s980
    public final void Hh(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.d0.i.Hh(view, u1c0Var, newsEntry, attachment);
    }

    public void J0() {
        this.h0.h();
    }

    @Override // xsna.fqp
    public final void Ke() {
        qt3 qt3Var = this.d0.q;
        if (qt3Var != null) {
            qt3Var.g();
        }
    }

    public s1c0 M0() {
        return (s1c0) this.V.getValue();
    }

    @Override // xsna.s980
    public final void Mg(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        this.d0.i.Mg(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.fqp
    public final void Nc() {
        ehv ehvVar = this.d0.m;
        if (ehvVar != null) {
            ehvVar.m();
        }
    }

    @Override // xsna.fqp
    public final void Ok(UxPollsEntry uxPollsEntry) {
        w5r0 e = this.d0.e();
        Context requireContext = requireContext();
        String str = uxPollsEntry.i;
        e.b(requireContext, str);
        e.b.add(str);
    }

    @Override // xsna.fqp
    public final void Q9(boolean z) {
        qt3 qt3Var = this.d0.q;
        if (qt3Var != null) {
            qt3Var.c(z);
        }
    }

    @Override // xsna.fqp
    public final void R1() {
        this.h0.o();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public void Rn() {
        mqp mqpVar = this.d0;
        mqpVar.v.c();
        VkContextMenu vkContextMenu = mqpVar.s;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        mqpVar.s = null;
    }

    @Override // xsna.fqp
    public final boolean Si() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s980
    public final void U5(NewsEntry newsEntry, boolean z, int i) {
        Context mo2getContext;
        if ((z && jjc.b()) || (mo2getContext = mo2getContext()) == null) {
            return;
        }
        ((mrp) this.i0.getValue()).b(mo2getContext, newsEntry, ko().getRef(), ko().a(), i);
    }

    @Override // xsna.fqp
    public final void Xm(gzs gzsVar) {
        ho(0L, gzsVar);
    }

    @Override // xsna.fqp
    public final void Y1(final int i, final int i2) {
        FragmentActivity activity = getActivity();
        if (activity == null || !p90.f(activity)) {
            AppBarLayout appBarLayout = this.k0;
            if (appBarLayout != null) {
                appBarLayout.g(false, false, true);
            }
            RecyclerView c = this.d0.c();
            if (c != null) {
                c.post(new Runnable() { // from class: xsna.rqp
                    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        EntriesListFragment entriesListFragment = EntriesListFragment.this;
                        entriesListFragment.d0.y.j(i, i2, (View) entriesListFragment.j0.getValue());
                    }
                });
            }
        }
    }

    @Override // xsna.fqp
    public final boolean Y7() {
        return false;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ko().a0();
        return false;
    }

    @Override // xsna.fqp
    public final void cn() {
        this.d0.b().c();
    }

    @Override // xsna.s980
    public final void d9(NewsEntry newsEntry, NewsEntry newsEntry2, int i, int i2) {
        jc60 jc60Var = new jc60(i, newsEntry, newsEntry2, i2, M0().v || M0().w, null);
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            this.d0.b.w0(mo2getContext, jc60Var);
        }
    }

    @Override // xsna.o2u0
    public final void fg(NewsEntry newsEntry, NewsEntry newsEntry2, int i) {
        this.h0.f(newsEntry, newsEntry2, i);
    }

    @Override // xsna.fqp
    public final c fn(c.h hVar) {
        c a2 = f.a(hVar, this.d0.h);
        this.h0.a(a2);
        return a2;
    }

    @Override // xsna.fqp
    public final void g6() {
        this.d0.y.e(true);
    }

    @Override // xsna.fqp, xsna.sjg
    public final String getRef() {
        String a2 = ko().a();
        return a2 == null ? ko().getRef() : a2;
    }

    @Override // xsna.pds
    public final void i5(gzs<s3q0> gzsVar) {
        this.h0.l(gzsVar);
    }

    public View io(View view, NewsEntry newsEntry, NewsEntry newsEntry2) {
        return null;
    }

    public int jo() {
        return this.e0;
    }

    @Override // xsna.fqp
    public final void ka() {
        this.d0.e().a();
    }

    public final P ko() {
        return (P) this.T.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        ro();
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    public void lo(RecyclerView recyclerView, RecyclerPaginatedView recyclerPaginatedView) {
        jqp jqpVar = this.h0;
        a4r a4rVar = jqpVar.a.y;
        a4rVar.f = new ghl(recyclerView, recyclerPaginatedView, new fhl(recyclerView, recyclerPaginatedView));
        if (!(recyclerView instanceof FeedRecyclerView)) {
            if (recyclerView instanceof UsableRecyclerView) {
                ((UsableRecyclerView) recyclerView).setSelectorBoundsProvider(new elg0(recyclerView));
            }
        } else {
            a4rVar.g(hux.c.C3024c.a);
            if (((Boolean) jqpVar.c.getValue()).booleanValue()) {
                recyclerView.addOnScrollListener((y3v) jqpVar.d.getValue());
            }
        }
    }

    @Override // xsna.fqp
    public final int me() {
        return this.d0.O.getItemCount();
    }

    @Override // xsna.fqp
    public final void mk(NewsEntry newsEntry) {
        qt3 qt3Var = this.d0.q;
        if (qt3Var != null) {
            qt3Var.h(newsEntry);
        }
    }

    public zoj0<?, RecyclerView.e0> mo() {
        return this.d0.O;
    }

    public abstract P no();

    public void o1() {
        this.h0.j();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        MarketAttachment.g = CommonMarketStat$TypeRefSource.POST;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qo(this.h0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            mhy.b(activity);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z = bundle != null;
        mqp mqpVar = this.d0;
        mqpVar.t = z;
        super.onCreate(bundle);
        P ko = ko();
        getArguments();
        ko.u0(mqpVar.t);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public RecyclerView.o onCreateLayoutManager() {
        FocusableLinearLayoutManager focusableLinearLayoutManager = new FocusableLinearLayoutManager(kn(), this, (d) this.d0.z.getValue());
        focusableLinearLayoutManager.setOrientation(1);
        return focusableLinearLayoutManager;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView;
        RecyclerView recyclerView;
        RecyclerView.u rruVar;
        ((b25) this.a0.getValue()).N();
        View oo = oo(layoutInflater, viewGroup, bundle);
        this.U = (VkTopBar) oo.findViewById(R.id.toolbar);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) oo.findViewById(R.id.rpb_list);
        mqp mqpVar = this.d0;
        mqpVar.h = recyclerPaginatedView;
        RecyclerView c = mqpVar.c();
        if (c != null) {
            mqpVar.y.h(c);
        }
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        ?? r10 = this.Z;
        p870 p870Var = (p870) r10.getValue();
        b1j b1jVar = new b1j(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        mqpVar.n = new qql0(viewLifecycleOwner, p870Var, msy.a(lazyThreadSafetyMode, b1jVar), msy.a(lazyThreadSafetyMode, new bzj(this, 8)), msy.a(lazyThreadSafetyMode, new v3n(this, 3)));
        mqpVar.o = new xdx(getViewLifecycleOwner(), (p870) r10.getValue());
        RecyclerPaginatedView recyclerPaginatedView2 = mqpVar.h;
        if (recyclerPaginatedView2 != null) {
            recyclerPaginatedView2.getRecyclerView().setLayoutManager(onCreateLayoutManager());
            RecyclerView recyclerView2 = recyclerPaginatedView2.getRecyclerView();
            FragmentActivity activity = getActivity();
            FeedFeatures feedFeatures = FeedFeatures.SHARED_VIEW_POOL;
            feedFeatures.getClass();
            if (!com.vk.toggle.b.A.a(feedFeatures)) {
                rruVar = new rru();
            } else if (activity != null) {
                WeakHashMap<Activity, RecyclerView.u> weakHashMap = jz60.a;
                RecyclerView.u uVar = weakHashMap.get(activity);
                if (uVar == null) {
                    uVar = new rru();
                    weakHashMap.put(activity, uVar);
                }
                rruVar = uVar;
            } else {
                rruVar = new rru();
            }
            recyclerView2.setRecycledViewPool(rruVar);
            recyclerPaginatedView2.getRecyclerView().setHasFixedSize(true);
            recyclerPaginatedView2.getRecyclerView().setItemViewCacheSize(fxc0.B().N().a);
            recyclerPaginatedView2.setAdapter(mo());
            lo(recyclerPaginatedView2.getRecyclerView(), recyclerPaginatedView2);
        }
        qo(this.h0);
        hjf0 hjf0Var = mqpVar.H;
        qqp qqpVar = new qqp(this, 0);
        RecyclerPaginatedView recyclerPaginatedView3 = ((mqp) hjf0Var.a.c).h;
        if (recyclerPaginatedView3 != null) {
            recyclerPaginatedView3.addOnLayoutChangeListener(qqpVar);
        }
        RecyclerPaginatedView recyclerPaginatedView4 = mqpVar.h;
        if (recyclerPaginatedView4 != null && (recyclerView = recyclerPaginatedView4.getRecyclerView()) != null) {
            recyclerView.setAccessibilityDelegateCompat(new w3r(recyclerView));
        }
        RecyclerView c2 = mqpVar.c();
        AppBarLayout appBarLayout = (c2 == null || (rootView = c2.getRootView()) == null) ? null : (AppBarLayout) rootView.findViewById(R.id.app_bar_layout);
        this.k0 = appBarLayout != null ? appBarLayout : null;
        mqpVar.O.N0(((ModerationComponent) m7m.d(this).mo408a(fpf0.a(ModerationComponent.class))).pa().b(requireContext(), this, false));
        return oo;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.h0.c();
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.h0.d();
        this.U = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        VkTopBar vkTopBar = this.U;
        if (vkTopBar != null) {
            vkTopBar.setOnClickListener(null);
        }
        super.onDetach();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        this.h0.g();
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        AppBarLayout appBarLayout;
        super.onResume();
        if (((Boolean) this.c0.getValue()).booleanValue() && (appBarLayout = this.k0) != null) {
            appBarLayout.g(true, false, true);
        }
        this.h0.i();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.g0) {
            bundle.putBoolean("saved_state_without_toolbar", true);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        irp.a(this.d0.c());
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = this.U;
        if (vkTopBar != null) {
            vkTopBar.setOnClickListener(new x16(this, 9));
        }
        ro();
        FragmentActivity kn = kn();
        mqp mqpVar = this.d0;
        a4r a4rVar = mqpVar.y;
        mqp.a aVar = mqpVar.B;
        a4rVar.g.l(aVar);
        mqpVar.A.c(a4rVar);
        mqpVar.f(kn);
        mqpVar.h(kn);
        aVar.l(new k5r0(mqpVar.e()));
        RecyclerPaginatedView recyclerPaginatedView = mqpVar.h;
        if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null && !mqpVar.j()) {
            mqpVar.q = new qt3(recyclerView, ko(), ((NewsfeedOptionalAdsComponent) this.b0.getValue()).d5(), ko().r0(), ko().c(), new a(ko()), false, false);
            mqpVar.g();
        }
        mqpVar.i();
        po();
        ko().D0(getArguments());
        mqpVar.l();
        mqpVar.k(M0());
        mqpVar.O.p.R = mqpVar.R;
        if (((Boolean) this.l0.getValue()).booleanValue()) {
            n0n n0nVar = new n0n();
            RecyclerView recyclerView2 = mqpVar.y.c;
            FeedRecyclerView feedRecyclerView = recyclerView2 instanceof FeedRecyclerView ? (FeedRecyclerView) recyclerView2 : null;
            if (feedRecyclerView != null) {
                feedRecyclerView.setDisclaimerTouchHelper(n0nVar);
            }
        }
    }

    public View oo(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.g0 = bundle.getBoolean("saved_state_without_toolbar", this.g0);
        }
        boolean z = this.g0;
        int i = this.f0;
        int jo = z ? i : jo();
        if (jo != i) {
            return layoutInflater.inflate(jo, viewGroup, false);
        }
        Context context = layoutInflater.getContext();
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context, null);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View feedRecyclerPaginatedView = new FeedRecyclerPaginatedView(context, null, 6, 0);
        feedRecyclerPaginatedView.setId(R.id.rpb_list);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.c(new AppBarLayout.ScrollingViewBehavior());
        feedRecyclerPaginatedView.setLayoutParams(fVar);
        coordinatorLayout.addView(feedRecyclerPaginatedView);
        return coordinatorLayout;
    }

    public void qo(jqp jqpVar) {
        mqp mqpVar = jqpVar.a;
        a4r a4rVar = mqpVar.y;
        a4rVar.g(hux.f.b.a);
        mqpVar.a().d(a4rVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s980
    public final void r8(NewsEntry newsEntry) {
        if (newsEntry == null) {
            return;
        }
        ((mrp) this.i0.getValue()).c(requireContext(), newsEntry, getRef());
    }

    public final void ro() {
        VkTopBar vkTopBar = this.U;
        if (vkTopBar != null) {
            if (!h3p0.a(this) || h3p0.g(this, vkTopBar)) {
                vkTopBar.setBack(null);
                return;
            }
            vkTopBar.setBack(new VkTopBar.b(new yqf(this, 16), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new wh1(17), 3), 12));
        }
    }

    @Override // xsna.fqp
    public final boolean s1() {
        return (isHidden() || Mn()) ? false : true;
    }

    @Override // xsna.fqp
    public final int s9() {
        return this.h0.b();
    }

    @Override // xsna.hi60
    public final void sa(NewsfeedExternalAction newsfeedExternalAction) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext != null) {
            this.d0.b.F0(mo2getContext, newsfeedExternalAction);
        }
    }

    @Override // xsna.fqp
    public final void u1(c cVar) {
        this.h0.a(cVar);
        mqp mqpVar = this.d0;
        cVar.b(mqpVar.h, mqpVar.t, false, 0L, null);
    }

    @Override // xsna.s980
    public final boolean u9(View view, u1c0 u1c0Var, NewsEntry newsEntry, Attachment attachment) {
        return this.d0.i.u9(view, u1c0Var, newsEntry, attachment);
    }

    @Override // xsna.fqp
    public final void va() {
        rwc0<? extends pwc0> rwc0Var = this.d0.r;
        if (rwc0Var != null) {
            rwc0Var.c();
        }
    }

    @Override // xsna.fqp
    public final int zh(int i) {
        return s9() + i;
    }

    public void po() {
    }

    /* compiled from: EntriesListFragment.kt */
    public static final class b implements d3f0 {
        @Override // xsna.d3f0
        public final void a(gii0 gii0Var) {
        }
    }
}
