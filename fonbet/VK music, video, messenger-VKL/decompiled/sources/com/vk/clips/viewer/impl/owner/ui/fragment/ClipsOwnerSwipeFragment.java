package com.vk.clips.viewer.impl.owner.ui.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.X3;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.utils.ClipFeedScreenType;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.clips.viewer.impl.routing.transition.a;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenProductScoreReporter;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.movika.sdk.base.logic.processor.actions.h;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aes;
import xsna.ale;
import xsna.ao50;
import xsna.b0u0;
import xsna.bhq;
import xsna.bpn0;
import xsna.bqx0;
import xsna.cro0;
import xsna.d7;
import xsna.dhr0;
import xsna.dv2;
import xsna.e43;
import xsna.ees;
import xsna.epx;
import xsna.ey50;
import xsna.fcn;
import xsna.fnj;
import xsna.foe;
import xsna.fpe;
import xsna.fxc0;
import xsna.g620;
import xsna.goe;
import xsna.gzs;
import xsna.h20;
import xsna.h2f;
import xsna.hg;
import xsna.hoe;
import xsna.iah0;
import xsna.im0;
import xsna.io2;
import xsna.ioe;
import xsna.itg0;
import xsna.iut0;
import xsna.j5g;
import xsna.j9x;
import xsna.jes;
import xsna.jgz;
import xsna.k1e;
import xsna.k9x;
import xsna.kes;
import xsna.km50;
import xsna.krv0;
import xsna.l7s;
import xsna.lyd;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.nds;
import xsna.noe;
import xsna.o0q0;
import xsna.ooe;
import xsna.oqx0;
import xsna.pk;
import xsna.q8e;
import xsna.qds;
import xsna.qhh0;
import xsna.roe;
import xsna.rzc;
import xsna.rzp0;
import xsna.s1d;
import xsna.sa0;
import xsna.sds;
import xsna.soe;
import xsna.t9b;
import xsna.u080;
import xsna.uds;
import xsna.ui90;
import xsna.urf;
import xsna.v6j;
import xsna.vbs;
import xsna.vds;
import xsna.vk50;
import xsna.wm1;
import xsna.wod;
import xsna.xn50;
import xsna.xoe;
import xsna.y1r;
import xsna.yoe;
import xsna.yw90;
import xsna.z1h0;
import xsna.z720;
import xsna.zof;
import xsna.zrd0;

/* compiled from: ClipsOwnerSwipeFragment.kt */
/* loaded from: classes.dex */
public final class ClipsOwnerSwipeFragment extends MviImplFragment<goe, fpe, foe> implements vds, nds, uds, ees, kes, sds, qds, aes, jes, y1r, ale, rzc, qhh0, o0q0, fcn {
    public static final Object k0 = msy.a(LazyThreadSafetyMode.NONE, new dv2(4));
    public final bpn0 Q = new bpn0(new com.vk.movika.sdk.base.logic.processor.actions.d(this, 22));
    public final bpn0 R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final xoe W;
    public final Object X;
    public final int Y;
    public final jgz Z;
    public int a0;
    public final ArrayList b0;
    public yoe c0;
    public ViewPager2 d0;
    public final int e0;
    public final int f0;
    public bqx0 g0;
    public fpe.b h0;
    public final ClipsScreenPerformanceReporter i0;
    public final Object j0;

    /* compiled from: ClipsOwnerSwipeFragment.kt */
    /* loaded from: classes17.dex */
    public static final class a extends k1e {
        public final ClipFeedTab[] m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ClipFeedTab[] clipFeedTabArr) {
            super(ClipsOwnerSwipeFragment.class, null, null);
            String uuid = UUID.randomUUID().toString();
            this.m = clipFeedTabArr;
            Bundle bundle = this.j;
            ClipsWrapperInputArguments.r.getClass();
            bundle.putString("ClipsWrapperFragment.clips_wrapper_id_param", uuid);
            this.j.putBoolean("ClipsOwnerSwipeFragment.lazy_owner_grid", true);
            ClipsWrapperInputArguments.a.e(this.j, e43.a(Arrays.copyOf(clipFeedTabArr, clipFeedTabArr.length)));
        }

        @Override // xsna.oz50
        public final Intent n(Context context) {
            Intent n = super.n(context);
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                n.putExtra(X3.i.n, 1);
            }
            return n;
        }
    }

    /* compiled from: ClipsOwnerSwipeFragment.kt */
    /* loaded from: classes17.dex */
    public final class b implements ui90.a {
        public b() {
        }

        @Override // xsna.ui90.a
        public final void b(FragmentImpl fragmentImpl, FragmentImpl fragmentImpl2) {
            vbs Ln;
            com.vk.core.fragments.a aVar;
            ClipFeedListFragment lo;
            q8e Bo;
            ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = ClipsOwnerSwipeFragment.this;
            if (epx.f(fragmentImpl, clipsOwnerSwipeFragment) || epx.f(fragmentImpl2, clipsOwnerSwipeFragment) || (Ln = clipsOwnerSwipeFragment.Ln()) == null || (aVar = Ln.h) == null || aVar.x(clipsOwnerSwipeFragment) < 2) {
                return;
            }
            yoe yoeVar = clipsOwnerSwipeFragment.c0;
            Fragment F0 = yoeVar != null ? yoeVar.F0(0) : null;
            ClipsWrapperFragment clipsWrapperFragment = F0 instanceof ClipsWrapperFragment ? (ClipsWrapperFragment) F0 : null;
            if (clipsWrapperFragment == null || (lo = clipsWrapperFragment.lo()) == null || (Bo = lo.Bo()) == null) {
                return;
            }
            int i = lo.to();
            k9x k9xVar = new k9x(i, i + 1, 1);
            ArrayList arrayList = new ArrayList();
            j9x it = k9xVar.iterator();
            while (it.d) {
                RecyclerView.e0 findViewHolderForAdapterPosition = Bo.findViewHolderForAdapterPosition(it.nextInt());
                if (findViewHolderForAdapterPosition != null) {
                    arrayList.add(findViewHolderForAdapterPosition);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                RecyclerView.e0 e0Var = (RecyclerView.e0) it2.next();
                s1d s1dVar = e0Var instanceof s1d ? (s1d) e0Var : null;
                if (s1dVar != null) {
                    s1dVar.o.Q();
                }
            }
        }
    }

    /* compiled from: ClipsOwnerSwipeFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedScreenType.values().length];
            try {
                iArr[ClipFeedScreenType.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedScreenType.TALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipFeedScreenType.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipsOwnerSwipeFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<Bundle> {
        @Override // xsna.gzs
        public final Bundle invoke() {
            return ((ClipsOwnerSwipeFragment) this.receiver).getArguments();
        }
    }

    /* compiled from: ClipsOwnerSwipeFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<FragmentActivity> {
        public e(ClipsOwnerSwipeFragment clipsOwnerSwipeFragment) {
            super(0, clipsOwnerSwipeFragment, ClipsOwnerSwipeFragment.class, "requireActivity", "requireActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        }

        @Override // xsna.gzs
        public final FragmentActivity invoke() {
            return ((ClipsOwnerSwipeFragment) this.receiver).kn();
        }
    }

    /* compiled from: ClipsOwnerSwipeFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<FragmentImpl> {
        public f(ClipsOwnerSwipeFragment clipsOwnerSwipeFragment) {
            super(0, clipsOwnerSwipeFragment, ClipsOwnerSwipeFragment.class, "getCurrentFragment", "getCurrentFragment()Lcom/vk/core/fragments/FragmentImpl;", 0);
        }

        @Override // xsna.gzs
        public final FragmentImpl invoke() {
            ClipsOwnerSwipeFragment clipsOwnerSwipeFragment = (ClipsOwnerSwipeFragment) this.receiver;
            Object obj = ClipsOwnerSwipeFragment.k0;
            return clipsOwnerSwipeFragment.go();
        }
    }

    public ClipsOwnerSwipeFragment() {
        int i = 23;
        this.R = new bpn0(new hg(this, i));
        com.vk.movika.sdk.base.logic.processor.actions.f fVar = new com.vk.movika.sdk.base.logic.processor.actions.f(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, fVar);
        this.T = msy.a(lazyThreadSafetyMode, new g(this, 28));
        int i2 = 25;
        this.U = msy.a(lazyThreadSafetyMode, new h(this, i2));
        this.V = msy.a(lazyThreadSafetyMode, new wm1(this, 21));
        this.W = new xoe(new e(this), new f(this));
        this.X = msy.a(lazyThreadSafetyMode, new j(this, i2));
        Context context = e43.a;
        this.Y = (context == null ? null : context).getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height);
        this.Z = jgz.c;
        this.a0 = -1;
        this.b0 = new ArrayList();
        this.e0 = R.color.vk_black;
        this.f0 = R.color.color_list_left_menu_icons;
        this.j0 = msy.a(lazyThreadSafetyMode, new l(12));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.CLIPS, null, false, 58).j();
        mzp0Var.init();
        ClipsScreenPerformanceReporter clipsScreenPerformanceReporter = new ClipsScreenPerformanceReporter(mzp0Var);
        this.i0 = clipsScreenPerformanceReporter;
        this.J = mzp0Var;
        zrd0 zrd0Var = zrd0.a;
        Pair a2 = zrd0.a(PerformanceScoreProduct.CLIPS);
        UUID uuid = (UUID) a2.d();
        yw90 yw90Var = (yw90) a2.g();
        yw90Var.init();
        Pair pair = new Pair(uuid, yw90Var);
        clipsScreenPerformanceReporter.b(new ClipsScreenProductScoreReporter((UUID) pair.d(), (yw90) pair.g()));
        this.L = (yw90) pair.j();
        clipsScreenPerformanceReporter.k();
    }

    @Override // xsna.aes
    public final void A0() {
        androidx.lifecycle.f go = go();
        aes aesVar = go instanceof aes ? (aes) go : null;
        if (aesVar != null) {
            aesVar.A0();
        }
    }

    @Override // xsna.ees
    public final boolean A4() {
        z1h0 F0;
        ViewPager2 viewPager2 = this.d0;
        if (viewPager2 != null) {
            int currentItem = viewPager2.getCurrentItem();
            yoe yoeVar = this.c0;
            if (yoeVar != null && (F0 = yoeVar.F0(currentItem)) != null && (F0 instanceof wod)) {
                return !((wod) F0).vl();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        vbs Ln;
        Context requireContext = requireContext();
        dhr0.a.getClass();
        ViewPager2 viewPager2 = new ViewPager2(new l7s(requireContext, dhr0.u().c));
        viewPager2.setFitsSystemWindows(true);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setOrientation(0);
        viewPager2.b(new noe(this, viewPager2));
        u080 u080Var = new u080() { // from class: xsna.koe
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                Object obj = ClipsOwnerSwipeFragment.k0;
                ClipsOwnerSwipeFragment.this.g0 = new bqx0(bqx0Var);
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(viewPager2, u080Var);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        if (recyclerView != null) {
            recyclerView.addOnChildAttachStateChangeListener(new ooe(this, recyclerView));
        }
        h20 h20Var = new h20(viewPager2, 19);
        this.Z.getClass();
        yoe n = jgz.n(this, viewPager2, h20Var);
        if (((zof) this.R.getValue()).H().e()) {
            viewPager2.setTransitionGroup(true);
        }
        viewPager2.setAdapter(n);
        this.c0 = n;
        this.d0 = viewPager2;
        b bVar = (b) this.X.getValue();
        if (bVar != null && (Ln = Ln()) != null) {
            Ln.e.add(bVar);
            ui90.j();
        }
        return new mk50.c(viewPager2);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        fpe fpeVar = (fpe) ao50Var;
        if (this.o) {
            LayoutInflater.Factory kn = kn();
            ey50 ey50Var = kn instanceof ey50 ? (ey50) kn : null;
            if (ey50Var != null) {
                ey50Var.Y().S(this);
            }
        }
        ArrayList arrayList = this.b0;
        List O0 = j5g.O0(arrayList);
        arrayList.clear();
        Iterator it = O0.iterator();
        while (it.hasNext()) {
            ((gzs) it.next()).invoke();
        }
        xn50.a.b(this, fpeVar.a(), new d7(this, 27));
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.tds
    public final ColorStateList Oc() {
        return requireContext().getColorStateList(R.color.color_list_bottom_menu_icons);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vds
    public final int Q0() {
        return ((h2f) this.V.getValue()).b() ? -1 : 1;
    }

    @Override // xsna.y1r
    public final boolean Sc() {
        List<ClipFeedTab> c2 = ho().c();
        if ((c2 instanceof Collection) && c2.isEmpty()) {
            return false;
        }
        for (ClipFeedTab clipFeedTab : c2) {
            ClipFeedTab.SingleClip singleClip = clipFeedTab instanceof ClipFeedTab.SingleClip ? (ClipFeedTab.SingleClip) clipFeedTab : null;
            if (singleClip != null && singleClip.Fb()) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.rzc
    public final com.vk.clips.viewer.impl.routing.transition.a Uh() {
        io2 zb;
        com.vk.clips.viewer.impl.routing.transition.a Uh;
        androidx.lifecycle.f go = go();
        rzc rzcVar = go instanceof rzc ? (rzc) go : null;
        if (rzcVar != null && (Uh = rzcVar.Uh()) != null) {
            return Uh;
        }
        ClipFeedTransientArgumentsContainer d2 = ho().d();
        if (d2 == null || (zb = d2.zb()) == null) {
            return null;
        }
        return new com.vk.clips.viewer.impl.routing.transition.a(new a.b(zb), null);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return false;
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ViewPager2 viewPager2 = this.d0;
        int currentItem = viewPager2 != null ? viewPager2.getCurrentItem() : -1;
        yoe yoeVar = this.c0;
        Fragment F0 = yoeVar != null ? yoeVar.F0(currentItem) : null;
        FragmentImpl fragmentImpl = F0 instanceof FragmentImpl ? (FragmentImpl) F0 : null;
        if (currentItem <= 0) {
            if (fragmentImpl != null) {
                return fragmentImpl.a0();
            }
            return false;
        }
        ViewPager2 viewPager22 = this.d0;
        if (viewPager22 == null) {
            return true;
        }
        viewPager22.setCurrentItem(0);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d
    public final void dismiss() {
        finish();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void finish() {
        xn50.a.c(this, foe.b.b);
        super.finish();
    }

    public final void fo() {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22 = this.d0;
        if ((viewPager22 == null || viewPager22.getOffscreenPageLimit() != 1) && (viewPager2 = this.d0) != null) {
            viewPager2.setOffscreenPageLimit(1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.sds
    public final int getBottomMargin() {
        int i = c.$EnumSwitchMapping$0[((h2f) this.V.getValue()).a().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.Y;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        return go();
    }

    @Override // xsna.tds
    public final z720.a gf() {
        return new z720.a(this.f0, this.e0);
    }

    public final FragmentImpl go() {
        ViewPager2 viewPager2 = this.d0;
        if (viewPager2 != null) {
            Integer valueOf = Integer.valueOf(viewPager2.getCurrentItem());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                yoe yoeVar = this.c0;
                Fragment F0 = yoeVar != null ? yoeVar.F0(intValue) : null;
                if (F0 instanceof FragmentImpl) {
                    return (FragmentImpl) F0;
                }
            }
        }
        return null;
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        androidx.lifecycle.f go = go();
        aes aesVar = go instanceof aes ? (aes) go : null;
        if (aesVar != null) {
            aesVar.h7(v6jVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final roe ho() {
        return (roe) this.S.getValue();
    }

    public final void io(fpe.b bVar) {
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        if (epx.f(this.h0, bVar)) {
            return;
        }
        this.h0 = bVar;
        if (bVar.a() == 0 && (viewPager2 = this.d0) != null && viewPager2.getCurrentItem() == 0 && (viewPager22 = this.d0) != null && viewPager22.getScrollState() == 0 && ho().f()) {
            ViewPager2 viewPager23 = this.d0;
            if (viewPager23 != null) {
                viewPager23.setOffscreenPageLimit(-1);
            }
        } else {
            fo();
        }
        yoe yoeVar = this.c0;
        if (yoeVar != null) {
            yoeVar.K0(bVar.b(), new pk(4, this, bVar));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return ((h2f) this.V.getValue()).b() ? requireContext().getColor(R.color.vk_black) : requireContext().getColor(R.color.vk_clear);
    }

    @Override // xsna.woo0
    public final int o7() {
        return A4() ? requireContext().getColor(R.color.vk_black) : dhr0.t.c(R.attr.vk_ui_background_content);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ale
    public final void oi(Bundle bundle) {
        int i;
        if (epx.f(getArguments(), bundle)) {
            return;
        }
        List<ClipFeedTab> a2 = ((urf) this.U.getValue()).l(ho().e()).a();
        if (a2 == null) {
            a2 = ho().c();
        }
        int b2 = roe.a.b(ho().c(), bundle);
        Integer valueOf = Integer.valueOf(b2);
        if (b2 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
            ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.b0(i, ho().c());
            if (clipFeedTab != null) {
                Iterator<ClipFeedTab> it = a2.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (it.next().getClass() == clipFeedTab.getClass()) {
                        break;
                    } else {
                        i2++;
                    }
                }
                Integer valueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
                if (valueOf2 != null) {
                    i = valueOf2.intValue();
                }
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            xn50.a.c(this, new foe.e(i));
        }
        ClipFeedOpenAction a3 = roe.a.a(bundle);
        if (a3 != null) {
            xn50.a.c(this, new foe.a(a3));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a0 = kn().getRequestedOrientation();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bhq.b.a = 8;
        this.i0.l(bundle == null);
        TypedValue typedValue = krv0.a;
        Integer d2 = krv0.d();
        cro0 cro0Var = d2 != null ? new cro0(requireContext(), d2.intValue()) : new cro0(requireContext(), R.style.ClipFeedDialogStyle);
        itg0.c(((ClipsViewerComponentImpl) this.Q.getValue()).Nf().b(cro0Var, new FrameLayout(cro0Var)), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        vbs Ln;
        b bVar = (b) this.X.getValue();
        if (bVar != null && (Ln = Ln()) != null) {
            Ln.l(bVar);
        }
        super.onDestroyView();
        this.d0 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.a0);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        ViewPager2 viewPager2;
        xoe xoeVar = this.W;
        xoeVar.b();
        FragmentImpl go = go();
        if (go != null) {
            if (!go.isAdded()) {
                go = null;
            }
            if (go != null) {
                go.onHiddenChanged(z);
            }
        }
        super.onHiddenChanged(z);
        if (!z && (viewPager2 = this.d0) != null && viewPager2.getCurrentItem() == 0) {
            g620.f().r();
        }
        xoeVar.a();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kn().setRequestedOrientation(Q0());
        VideoPipStateHolder.a.getClass();
        VideoPipStateHolder.b();
        if (lyd.g().h()) {
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            com.vk.libvideo.autoplay.e.e(true);
        }
        this.W.c();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        On().d3(view);
        if (!ho().f()) {
            fo();
            return;
        }
        ViewPager2 viewPager2 = this.d0;
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(-1);
        }
    }

    @Override // xsna.aes
    public final RectF p1() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.tds
    public final int qc() {
        return requireContext().getColor(((h2f) this.V.getValue()).a().i() ? R.color.vk_clear : R.color.vk_black);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        Fragment fragment;
        ViewPager2 viewPager2 = this.d0;
        if (viewPager2 == null || viewPager2.getCurrentItem() != 0) {
            ViewPager2 viewPager22 = this.d0;
            if (viewPager22 == null) {
                return true;
            }
            viewPager22.setCurrentItem(0);
            return true;
        }
        yoe yoeVar = this.c0;
        if (yoeVar == null || (fragment = yoeVar.F0(0)) == null || !fragment.isAdded()) {
            fragment = null;
        }
        qhh0 qhh0Var = fragment instanceof qhh0 ? (qhh0) fragment : null;
        if (qhh0Var != null) {
            return qhh0Var.s();
        }
        return false;
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.ClipFeedDialogStyle;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        g620.f().r();
        ioe a2 = new hoe((soe) this.T.getValue(), (urf) this.U.getValue()).a(ho(), this.i0, BuildInfo.q() && fxc0.B().J().c2(), new bpn0(new com.vk.movika.sdk.base.logic.interactor.h(this, 21)), new bpn0(new sa0(this, 27)), new bpn0(new im0(this, 21)));
        t9b t9bVar = new t9b(3, this, a2.b());
        if (this.d0 != null) {
            t9bVar.invoke();
        } else {
            this.b0.add(t9bVar);
        }
        return a2.a();
    }

    @Override // androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Window window = yn.getWindow();
        if (window != null) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1024);
            oqx0 oqx0Var = new oqx0(window, window.getDecorView());
            oqx0Var.a(false);
            oqx0Var.b(false);
            window.setStatusBarColor(0);
        }
        yn.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: xsna.joe
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Object obj = ClipsOwnerSwipeFragment.k0;
                if (i == 4 && keyEvent.getAction() == 1) {
                    return ClipsOwnerSwipeFragment.this.a0();
                }
                return false;
            }
        });
        kn().setRequestedOrientation(Q0());
        return yn;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void bo() {
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void co() {
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void ao(View view) {
    }
}
