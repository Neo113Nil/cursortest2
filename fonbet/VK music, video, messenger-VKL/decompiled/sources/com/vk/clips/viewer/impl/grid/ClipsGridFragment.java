package com.vk.clips.viewer.impl.grid;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.google.android.material.appbar.NonBouncedCollapsingToolbarLayout;
import com.vk.clips.design.view.grid.skeleton.Skeleton;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.a;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.logic.interactor.l;
import com.vk.movika.sdk.base.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vkontakte.android.R;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.a3p0;
import xsna.abe0;
import xsna.ade;
import xsna.awt0;
import xsna.b25;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c6f;
import xsna.ca;
import xsna.cvk;
import xsna.d3m;
import xsna.dg9;
import xsna.dhr0;
import xsna.e3m;
import xsna.ebd;
import xsna.ees;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.fce;
import xsna.fde;
import xsna.fee;
import xsna.fnj;
import xsna.fpf0;
import xsna.g620;
import xsna.gee;
import xsna.gpo0;
import xsna.gzs;
import xsna.h20;
import xsna.h6;
import xsna.hd;
import xsna.hvt0;
import xsna.iah0;
import xsna.ide;
import xsna.iee;
import xsna.ild;
import xsna.j03;
import xsna.j1;
import xsna.jd;
import xsna.jjc;
import xsna.jo2;
import xsna.k15;
import xsna.ka0;
import xsna.kbe;
import xsna.kbj0;
import xsna.kbk;
import xsna.kd;
import xsna.kes;
import xsna.ko2;
import xsna.kp5;
import xsna.l14;
import xsna.l7s;
import xsna.lbk;
import xsna.ld;
import xsna.m1;
import xsna.m7p0;
import xsna.msy;
import xsna.mx4;
import xsna.nds;
import xsna.ng1;
import xsna.no;
import xsna.nr4;
import xsna.o0q0;
import xsna.o25;
import xsna.oo;
import xsna.oz50;
import xsna.pgn;
import xsna.pq;
import xsna.px0;
import xsna.qcy;
import xsna.qee;
import xsna.qhh0;
import xsna.ql2;
import xsna.rde;
import xsna.ree;
import xsna.s1;
import xsna.s3q0;
import xsna.s6;
import xsna.sde;
import xsna.sjd;
import xsna.tbu0;
import xsna.tde;
import xsna.tee;
import xsna.too0;
import xsna.u1e;
import xsna.u40;
import xsna.uds;
import xsna.uge;
import xsna.v0q0;
import xsna.v40;
import xsna.v6;
import xsna.vds;
import xsna.vpv0;
import xsna.w9f;
import xsna.we0;
import xsna.wfu;
import xsna.wl0;
import xsna.wm1;
import xsna.yc;
import xsna.yce;
import xsna.z1h0;
import xsna.z720;
import xsna.zfu;
import xsna.zhe;
import xsna.zof;

/* compiled from: ClipsGridFragment.kt */
/* loaded from: classes.dex */
public final class ClipsGridFragment extends BaseFragment implements ide, nds, ees, vds, kes, o0q0, qhh0, too0, gee, uds, v0q0 {
    public static final /* synthetic */ qcy<Object>[] H0;
    public static final int I0;
    public int A0;
    public boolean B0;
    public final Object C0;
    public final Object D0;
    public final com.vk.clips.viewer.impl.grid.a E0;
    public final d F0;
    public final vpv0 G0;
    public h20 S;
    public boolean T = true;
    public final pgn U = new pgn();
    public boolean V;
    public final Object W;
    public final bpn0 X;
    public final bpn0 Y;
    public final bpn0 Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final bpn0 e0;
    public final bpn0 f0;
    public final bpn0 g0;
    public final bpn0 h0;
    public final Object i0;
    public final bpn0 j0;
    public final bpn0 k0;
    public final bpn0 l0;
    public final bpn0 m0;
    public ViewPager n0;
    public final bpn0 o0;
    public int p0;
    public NonBouncedAppBarLayout q0;
    public SwipeDrawableRefreshLayout r0;
    public VkTabs s0;
    public FrameLayout t0;
    public sjd u0;
    public u1e v0;
    public final Object w0;
    public final Object x0;
    public boolean y0;
    public boolean z0;

    /* compiled from: ClipsGridFragment.kt */
    /* loaded from: classes17.dex */
    public static final class a extends oz50 {
        public a(ClipGridParams clipGridParams) {
            super(ClipsGridFragment.class, null, null);
            this.j.putParcelable("ClipsGridFragment.params", clipGridParams);
        }
    }

    /* compiled from: ClipsGridFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsGridTabData.values().length];
            try {
                iArr[ClipsGridTabData.OwnerClips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGridTabData.CommonClips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsGridTabData.DelayedPublications.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsGridTabData.Drafts.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsGridTabData.Favorites.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsGridTabData.LikedClips.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipsRouter.GridForcedTab.values().length];
            try {
                iArr2[ClipsRouter.GridForcedTab.LIKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipsGridFragment.kt */
    /* loaded from: classes17.dex */
    public static final class c extends ViewOutlineProvider {
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public c(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int i = (-ClipsGridFragment.this.p0) + this.b;
            int width = view.getWidth();
            int height = view.getHeight();
            int i2 = this.c;
            outline.setRoundRect(0, i, width, height + i2, i2);
        }
    }

    /* compiled from: ClipsGridFragment.kt */
    /* loaded from: classes17.dex */
    public static final class d implements b25.a {
        public d() {
        }

        @Override // xsna.b25.a
        public final void d(tbu0 tbu0Var) {
            boolean b = tbu0Var.b();
            ClipsGridFragment clipsGridFragment = ClipsGridFragment.this;
            if (!b) {
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                clipsGridFragment.qo(epx.f(clipsGridFragment.oo(), Boolean.FALSE));
            } else {
                qcy<Object>[] qcyVarArr2 = ClipsGridFragment.H0;
                clipsGridFragment.mo().e2(true);
                clipsGridFragment.qo(true);
            }
        }
    }

    /* compiled from: ClipsGridFragment.kt */
    /* loaded from: classes17.dex */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements gzs<s3q0> {
        public e(ClipsGridFragment clipsGridFragment) {
            super(0, clipsGridFragment, ClipsGridFragment.class, "showClipsTop", "showClipsTop()V", 0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ClipsGridFragment) this.receiver).I5();
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(ClipsGridFragment.class, "moreMenuActions", "getMoreMenuActions()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        H0 = new qcy[]{mutablePropertyReference1Impl};
        I0 = iah0.a(10);
    }

    public ClipsGridFragment() {
        h6 h6Var = new h6(this, 20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, h6Var);
        this.X = new bpn0(new hd(this, 21));
        this.Y = new bpn0(new m1(this, 27));
        this.Z = new bpn0(new jd(this, 28));
        this.a0 = msy.a(lazyThreadSafetyMode, new kd(this, 23));
        this.b0 = msy.a(lazyThreadSafetyMode, new ld(this, 24));
        this.c0 = msy.a(lazyThreadSafetyMode, new we0(this, 20));
        this.d0 = msy.a(lazyThreadSafetyMode, new s1(this, 25));
        this.e0 = new bpn0(new u40(this, 17));
        this.f0 = new bpn0(new v40(this, 19));
        this.g0 = new bpn0(new v6(this, 17));
        this.h0 = new bpn0(new no(this, 25));
        int i = 19;
        this.i0 = msy.a(lazyThreadSafetyMode, new oo(this, i));
        this.j0 = new bpn0(new h(this, i));
        this.k0 = new bpn0(new wm1(this, 18));
        this.l0 = new bpn0(new j(this, 23));
        this.m0 = new bpn0(new l(11));
        this.o0 = new bpn0(new ka0(this, 25));
        this.w0 = msy.a(lazyThreadSafetyMode, new yc(this, 24));
        this.x0 = msy.a(lazyThreadSafetyMode, new j1(this, 27));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new f(this, 22));
        this.C0 = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new yce(this, 0));
        this.D0 = a3;
        this.E0 = new com.vk.clips.viewer.impl.grid.a(this, a2, a3, new bpn0(new kbe(this, 1)));
        this.F0 = new d();
        this.G0 = new vpv0();
    }

    @Override // xsna.ees
    public final boolean A4() {
        return this.y0;
    }

    @Override // xsna.wee
    public final boolean Aj() {
        u1e u1eVar = this.v0;
        return u1eVar != null && u1eVar.c();
    }

    @Override // xsna.ide
    public final int Ba() {
        VkTabs vkTabs = this.s0;
        if (vkTabs == null) {
            vkTabs = null;
        }
        return vkTabs.getTabsCount();
    }

    @Override // xsna.wee
    public final void Cj(UserId userId, List list) {
        dg9 c2;
        sjd sjdVar = this.u0;
        if (sjdVar == null || (c2 = sjdVar.c()) == null) {
            return;
        }
        c2.b(userId, list);
    }

    @Override // xsna.gee
    public final void Dc(String str, String str2) {
        g620.f().w(kn(), str, str2);
    }

    @Override // xsna.wee
    public final void E0(boolean z) {
        sjd sjdVar;
        dg9 c2;
        d3m.e(this.n0, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        FrameLayout frameLayout = this.t0;
        d3m.e(frameLayout == null ? null : frameLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        VkTabs vkTabs = this.s0;
        d3m.e(vkTabs == null ? null : vkTabs, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        if (!z || (sjdVar = this.u0) == null || (c2 = sjdVar.c()) == null) {
            return;
        }
        c2.d(false);
    }

    @Override // xsna.ide
    public final void I5() {
        ko2 a2;
        FragmentActivity kn = kn();
        if (kn == null) {
            kn = null;
        }
        FragmentActivity fragmentActivity = kn;
        if (fragmentActivity == null) {
            return;
        }
        a2 = jo2.a(requireContext(), jo2.a.b.a);
        ClipsRouter.c(g620.f().a(), fragmentActivity, Collections.singletonList(new ClipFeedTab.TopVideo(null, null, null, null, null, 31, null)), a2, null, null, null, null, ((zof) this.Z.getValue()).H().isEnabled() && k15.r(this), null, 1912);
    }

    @Override // xsna.gee
    public final void J7(View view, Rect rect, ClipGridParams.Data data, gzs<s3q0> gzsVar) {
        if (epx.f(oo(), Boolean.TRUE)) {
            po(view, rect, true, gzsVar);
            return;
        }
        Context requireContext = requireContext();
        io.reactivex.rxjava3.disposables.c subscribe = this.E0.d(no(requireContext), data, new l14(this, requireContext, data, 4)).subscribe();
        qcy<Object> qcyVar = H0[0];
        this.U.b(subscribe);
    }

    @Override // xsna.ide
    public final void Je(int i) {
        this.p0 = i;
        ViewPager viewPager = this.n0;
        if (viewPager != null) {
            viewPager.invalidateOutline();
        }
    }

    @Override // xsna.ide, xsna.gee
    public final void K1(ClipGridParams.Data data, ClipCameraParams clipCameraParams, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, UserId userId) {
        this.E0.b(data, clipCameraParams, str, creationEntryPoint, userId);
    }

    @Override // androidx.fragment.app.d, xsna.gee
    public final void M1() {
        h20 h20Var = this.S;
        if (h20Var != null) {
            h20Var.invoke();
        } else {
            finish();
        }
    }

    @Override // xsna.tds
    public final ColorStateList Oc() {
        return no(requireContext()).getColorStateList(R.color.color_list_bottom_menu_icons);
    }

    @Override // xsna.wee
    public final void Od(wfu.a aVar) {
        if (aVar instanceof wfu.a.d) {
            wfu.a.d dVar = (wfu.a.d) aVar;
            a3p0.c cVar = new a3p0.c(dVar.b(), dVar.a());
            sjd sjdVar = this.u0;
            if (sjdVar != null) {
                sjdVar.h(cVar);
            }
            SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.r0;
            if (swipeDrawableRefreshLayout != null) {
                swipeDrawableRefreshLayout.setRefreshing(false);
            }
        }
    }

    @Override // xsna.vds
    public final int Q0() {
        return fnj.d(kn()) ? -1 : 1;
    }

    @Override // xsna.wee
    public final void T1() {
        Bundle requireArguments = requireArguments();
        requireArguments.putBoolean("ClipsGridFragment.is_owner_grid", false);
        requireArguments.putBoolean("ClipsGridFragment.is_owner_camera_button_enabled", false);
        mo().T1();
    }

    @Override // xsna.wee
    public final void W5() {
        requireArguments().putBoolean("ClipsGridFragment.is_owner_grid", true);
    }

    @Override // xsna.nds
    public final boolean W9() {
        Resources resources;
        FragmentActivity activity = getActivity();
        if (epx.f((activity == null || (resources = activity.getResources()) == null) ? null : Boolean.valueOf(resources.getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver)), Boolean.TRUE)) {
            return false;
        }
        dhr0 dhr0Var = dhr0.a;
        View view = getView();
        return (dhr0Var.c(view != null ? view.getContext() : null) || ko()) ? false : true;
    }

    @Override // xsna.kes
    public final boolean Xf() {
        return false;
    }

    @Override // xsna.wee
    public final void Yi() {
        if (mo().t2()) {
            return;
        }
        VkTabs vkTabs = this.s0;
        if (vkTabs == null) {
            vkTabs = null;
        }
        bwt0.p0(vkTabs, lo().getCount() > 1);
        boolean z = o25.a().b() || epx.f(oo(), Boolean.FALSE);
        ViewPager viewPager = this.n0;
        if (viewPager != null) {
            awt0.v(viewPager, z);
        }
        qo(z);
        FrameLayout frameLayout = this.t0;
        f4m.j(frameLayout != null ? frameLayout : null);
    }

    @Override // xsna.gee
    public final void Z2(String str) {
        if (o25.a().b()) {
            kbj0.c(nr4.b(), requireContext(), str, false, null, null, ko(), 88);
        } else {
            nr4.b().y(requireContext(), str);
        }
    }

    @Override // xsna.wee
    public final void d7(UserId userId, List list) {
        abe0 i;
        sjd sjdVar = this.u0;
        if (sjdVar == null || (i = sjdVar.i()) == null) {
            return;
        }
        i.a(userId, list);
    }

    @Override // xsna.wee
    public final void fh(UserId userId, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((ClipGridParams.Data.Profile) obj).Ab().l(), userId)) {
                    break;
                }
            }
        }
        ClipGridParams.Data.Profile profile = (ClipGridParams.Data.Profile) obj;
        if (profile != null) {
            this.B0 = profile.Ab().d();
        }
    }

    @Override // xsna.wee
    public final void g4(Throwable th) {
        cvk.w(j03.f(requireContext(), th), false);
    }

    @Override // xsna.gee
    public final void ga(SdkClipAudioTemplate sdkClipAudioTemplate) {
        ((lbk) this.Y.getValue()).a(mo().b(), new SecureRandom().nextInt(Integer.MAX_VALUE), (r3 & 4) == 0);
        Serializer.c<ClipFeedTab.MusicTemplate> cVar = ClipFeedTab.MusicTemplate.CREATOR;
        ClipFeedTab.MusicTemplate a2 = ClipFeedTab.MusicTemplate.a.a(sdkClipAudioTemplate.zb());
        Context requireContext = requireContext();
        ClipsRouter.c(g620.f().a(), requireContext, Collections.singletonList(a2), jo2.a(requireContext, jo2.a.C3134a.a), null, fpf0.a(ClipFeedTab.MusicTemplate.class), (SearchStatsLoggingInfo) this.e0.getValue(), null, true, null, 1864);
    }

    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        if (isAdded()) {
            return lo().g();
        }
        return null;
    }

    @Override // xsna.tds
    public final z720.a gf() {
        return new z720.a(R.color.color_list_left_menu_icons, R.color.vk_black);
    }

    public final void io() {
        int a2 = iah0.a(20.0f);
        int a3 = iah0.a(10.0f);
        ViewPager viewPager = this.n0;
        if (viewPager != null) {
            viewPager.setOutlineProvider(new c(a3, a2));
        }
        VkTabs vkTabs = this.s0;
        if (vkTabs == null) {
            vkTabs = null;
        }
        f4m.t(I0, vkTabs);
        VkTabs vkTabs2 = this.s0;
        bwt0.d(vkTabs2 != null ? vkTabs2 : null, a2, false, true);
    }

    @Override // xsna.wee
    public final void jm(Throwable th) {
        sjd sjdVar = this.u0;
        if (sjdVar != null) {
            sjdVar.e();
        }
        u1e u1eVar = this.v0;
        if (u1eVar != null) {
            u1eVar.a(th);
            u1eVar.d();
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.r0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setRefreshing(false);
        }
    }

    public final ClipsGridTabData jo() {
        if (!lo().j().isEmpty() && this.n0 != null) {
            return lo().j().get(this.n0.getCurrentItem()).i();
        }
        if (b.$EnumSwitchMapping$1[((ClipsRouter.GridForcedTab) this.l0.getValue()).ordinal()] == 1) {
            return ClipsGridTabData.LikedClips;
        }
        return null;
    }

    public final boolean ko() {
        return this.z0 || this.y0;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // xsna.wee
    public final void l6(ClipGridParams.Data data) {
        mo().j2(data);
        sjd sjdVar = this.u0;
        if (sjdVar != null) {
            sjdVar.g(data);
        }
    }

    @Override // xsna.wee
    public final void lk() {
        sjd sjdVar = this.u0;
        if (sjdVar != null) {
            sjdVar.a();
        }
    }

    public final tde lo() {
        return (tde) this.o0.getValue();
    }

    @Override // xsna.gee
    public final void mf(boolean z) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.q0;
        if (nonBouncedAppBarLayout != null) {
            nonBouncedAppBarLayout.setExpandingBlocked(!z);
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.r0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setEnabled(z);
        }
    }

    public final fee mo() {
        return (fee) this.j0.getValue();
    }

    @Override // xsna.wee
    public final void n4(fde fdeVar, ild ildVar, a3p0.a.C2519a c2519a) {
        boolean z;
        if (fdeVar.b() == null) {
            return;
        }
        mo().j2(fdeVar.b());
        a3p0 aVar = fdeVar.b() instanceof ClipGridParams.Data.Profile ? new a3p0.b.a((ClipGridParams.Data.Profile) fdeVar.b()) : new a3p0.a(fdeVar.b(), fdeVar.c(), fdeVar.a(), ildVar.a(), c2519a);
        sjd sjdVar = this.u0;
        if (sjdVar != null) {
            sjdVar.b(aVar);
            dg9 c2 = sjdVar.c();
            ClipsGridTabData jo = jo();
            if (jo != null) {
                switch (b.$EnumSwitchMapping$0[jo.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        z = true;
                        break;
                    case 5:
                    case 6:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                c2.d(z);
            }
            z = false;
            c2.d(z);
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.r0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setRefreshing(false);
        }
    }

    public final Context no(Context context) {
        return ko() ? new l7s(context, dhr0.a.v()) : this.A0 != 0 ? new l7s(context, this.A0) : context;
    }

    @Override // xsna.woo0
    public final int o7() {
        return ko() ? e3m.f(R.attr.vk_ui_vkontakte_palette_black, no(requireContext())) : e3m.f(R.attr.vk_ui_background_content, no(requireContext()));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G0.d();
        this.V = true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((zhe) this.w0.getValue()).a(this);
        this.z0 = requireArguments().getBoolean("ClipsGridFragment.force_dark_theme");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b4  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context no;
        LayoutInflater cloneInContext;
        View inflate;
        NonBouncedAppBarLayout nonBouncedAppBarLayout;
        boolean z;
        ebd ebdVar;
        VkTopBar vkTopBar;
        rde rdeVar;
        ConstraintLayout constraintLayout;
        this.A0 = requireArguments().getInt("ClipsGridFragment.theme");
        Context mo2getContext = mo2getContext();
        Integer b2 = mo2getContext != null ? gpo0.b(mo2getContext) : null;
        if (b2 != null && b2.intValue() == R.style.VkWebViewLightTheme) {
            Context requireContext = requireContext();
            dhr0.a.getClass();
            no = new l7s(requireContext, dhr0.z().c);
        } else if (b2 != null && b2.intValue() == R.style.VkWebViewDarkTheme) {
            Context requireContext2 = requireContext();
            dhr0.a.getClass();
            no = new l7s(requireContext2, dhr0.u().c);
        } else {
            no = no(layoutInflater.getContext());
        }
        if (!ko() && this.A0 == 0) {
            Context mo2getContext2 = mo2getContext();
            if ((mo2getContext2 != null ? gpo0.b(mo2getContext2) : null) == null) {
                cloneInContext = layoutInflater;
                boolean z2 = false;
                inflate = cloneInContext.inflate(R.layout.fragment_clips_grid, viewGroup, false);
                if (this.y0) {
                    inflate.setFitsSystemWindows(true);
                }
                bpn0 bpn0Var = this.k0;
                tee.a((ClipGridParams) bpn0Var.getValue());
                Skeleton skeleton = !epx.f(oo(), Boolean.TRUE) ? Skeleton.PROFILE_WITH_TABS : ((ClipGridParams) bpn0Var.getValue()) instanceof ClipGridParams.OnlyId.Profile ? Skeleton.PROFILE : Skeleton.ANOTHER;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.coordinator);
                CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
                fVar.c(new NonBouncedAppBarLayout.ScrollingViewBehavior());
                ((ViewGroup.MarginLayoutParams) fVar).topMargin = iah0.a(10);
                this.t0 = skeleton.b(coordinatorLayout, fVar);
                nonBouncedAppBarLayout = (NonBouncedAppBarLayout) inflate.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
                this.q0 = nonBouncedAppBarLayout;
                if (nonBouncedAppBarLayout != null) {
                    nonBouncedAppBarLayout.a(new NonBouncedAppBarLayout.d() { // from class: xsna.zce
                        @Override // com.google.android.material.appbar.NonBouncedAppBarLayout.d
                        public final void a(NonBouncedAppBarLayout nonBouncedAppBarLayout2, int i) {
                            dg9 c2;
                            qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                            ClipsGridFragment clipsGridFragment = ClipsGridFragment.this;
                            int size = clipsGridFragment.lo().k.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                AbstractClipsGridListFragment h = clipsGridFragment.lo().h(i2);
                                if (h != null) {
                                    h.V = nonBouncedAppBarLayout2.getTotalScrollRange() + i;
                                }
                            }
                            sjd sjdVar = clipsGridFragment.u0;
                            if (sjdVar == null || (c2 = sjdVar.c()) == null) {
                                return;
                            }
                            boolean e2 = nonBouncedAppBarLayout2.e();
                            c2.d.b(e2);
                            c2.e.b(e2);
                        }
                    });
                }
                Bundle arguments = getArguments();
                boolean z3 = (arguments == null && arguments.getBoolean("ClipsGridFragment.is_opened_in_app_tab", false)) || !fnj.d(requireContext());
                f5z viewLifecycleOwner = getViewLifecycleOwner();
                zof zofVar = (zof) this.Z.getValue();
                uge e2 = ((ClipsInterestsComponent) this.W.getValue()).e();
                ca caVar = new ca(this, 22);
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
                int i = 20;
                w9f w9fVar = new w9f(viewLifecycleOwner, inflate, cloneInContext, new w9f.a(zofVar, e2, new fce(), msy.a(lazyThreadSafetyMode, caVar), msy.a(lazyThreadSafetyMode, new px0(this, i))), ko(), new mx4(this));
                fee mo = mo();
                ClipGridParams clipGridParams = (ClipGridParams) bpn0Var.getValue();
                z1h0 parentFragment = getParentFragment();
                c6f c6fVar = !(parentFragment instanceof c6f) ? (c6f) parentFragment : null;
                Bundle arguments2 = getArguments();
                boolean z4 = arguments2 == null && arguments2.getBoolean("ClipsGridFragment.is_opened_in_app_tab", false);
                if (!this.y0) {
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null ? arguments3.getBoolean("ClipsGridFragment.is_parent_fits_system_windows", true) : true) {
                        z = true;
                        sjd a2 = w9fVar.a(mo, clipGridParams, c6fVar, new ree(z4, z3, z));
                        this.u0 = a2;
                        ebdVar = a2 instanceof ebd ? (ebd) a2 : null;
                        if (ebdVar != null) {
                            SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) this.e0.getValue();
                            ebdVar.q(searchStatsLoggingInfo != null ? new iee(searchStatsLoggingInfo) : null);
                        }
                        vkTopBar = (VkTopBar) hvt0.c(R.id.toolbar, inflate);
                        if (vkTopBar != null) {
                            jjc.g(vkTopBar, new s6(this, 21));
                            vkTopBar.setInitialMode(VkTopBar.j.a.a);
                        }
                        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = (SwipeDrawableRefreshLayout) hvt0.c(R.id.swipe_refresh_layout, inflate);
                        int dimensionPixelSize = swipeDrawableRefreshLayout.getResources().getDimensionPixelSize(R.dimen.clips_grid_swipe_to_refresh_offset);
                        int dimensionPixelSize2 = swipeDrawableRefreshLayout.getResources().getDimensionPixelSize(R.dimen.clips_grid_swipe_to_refresh_buttons_offset);
                        int progressViewStartOffset = swipeDrawableRefreshLayout.getProgressViewStartOffset() - dimensionPixelSize;
                        int progressViewEndOffset = (dimensionPixelSize / 2) + swipeDrawableRefreshLayout.getProgressViewEndOffset() + dimensionPixelSize2;
                        swipeDrawableRefreshLayout.setProgressBackgroundColorSchemeColor(e3m.f(R.attr.vk_ui_background_modal, swipeDrawableRefreshLayout.getContext()));
                        swipeDrawableRefreshLayout.setColorSchemeColors(e3m.f(R.attr.vk_ui_icon_accent, swipeDrawableRefreshLayout.getContext()));
                        swipeDrawableRefreshLayout.s(progressViewStartOffset, progressViewEndOffset + progressViewStartOffset);
                        swipeDrawableRefreshLayout.setOnRefreshListener(new ql2(this, 11));
                        this.r0 = swipeDrawableRefreshLayout;
                        ViewPager viewPager = (ViewPager) hvt0.c(R.id.profile_clip_viewpager, inflate);
                        viewPager.setPageMargin(iah0.a(8));
                        viewPager.setAdapter(lo());
                        viewPager.setOffscreenPageLimit(Integer.MAX_VALUE);
                        viewPager.addOnPageChangeListener(new zfu(lo(), this.u0, this.r0));
                        viewPager.addOnPageChangeListener(new ade(this));
                        vpv0 vpv0Var = this.G0;
                        vpv0Var.c(viewPager);
                        this.n0 = viewPager;
                        vpv0Var.a(lo());
                        NonBouncedAppBarLayout nonBouncedAppBarLayout2 = (NonBouncedAppBarLayout) inflate.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
                        ((qee) this.m0.getValue()).getClass();
                        VkTabs a3 = qee.a(nonBouncedAppBarLayout2);
                        vpv0Var.b(a3);
                        this.s0 = a3;
                        this.D.a(lo().e);
                        o25.a().b0(this.F0);
                        androidx.lifecycle.f g = lo().g();
                        rdeVar = g instanceof rde ? (rde) g : null;
                        if (rdeVar != null) {
                            rdeVar.Mc();
                        }
                        VkPlaceholder vkPlaceholder = (VkPlaceholder) inflate.findViewById(R.id.clips_grid_error_placeholder);
                        this.v0 = new u1e(vkPlaceholder, new ng1(this, i), new e(this));
                        constraintLayout = inflate instanceof ConstraintLayout ? (ConstraintLayout) inflate : null;
                        if (constraintLayout != null) {
                            androidx.constraintlayout.widget.b a4 = pq.a(constraintLayout);
                            float f = m7p0.a;
                            int applyDimension = (int) TypedValue.applyDimension(1, m7p0.a.a(), Resources.getSystem().getDisplayMetrics());
                            Bundle arguments4 = getArguments();
                            if (arguments4 != null && arguments4.getBoolean("ClipsGridFragment.is_opened_in_app_tab", false)) {
                                z2 = true;
                            }
                            if (z2) {
                                a4.l(vkPlaceholder.getId(), 3, 0, 3, applyDimension);
                            } else {
                                a4.l(vkPlaceholder.getId(), 3, R.id.clip_feed_top_tab_padding, 4, applyDimension);
                            }
                            a4.l(vkPlaceholder.getId(), 4, 0, 4, 0);
                            a4.l(vkPlaceholder.getId(), 2, 0, 2, 0);
                            a4.l(vkPlaceholder.getId(), 1, 0, 1, 0);
                            a4.b(constraintLayout);
                        }
                        io();
                        return inflate;
                    }
                }
                z = false;
                sjd a22 = w9fVar.a(mo, clipGridParams, c6fVar, new ree(z4, z3, z));
                this.u0 = a22;
                if (a22 instanceof ebd) {
                }
                if (ebdVar != null) {
                }
                vkTopBar = (VkTopBar) hvt0.c(R.id.toolbar, inflate);
                if (vkTopBar != null) {
                }
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout2 = (SwipeDrawableRefreshLayout) hvt0.c(R.id.swipe_refresh_layout, inflate);
                int dimensionPixelSize3 = swipeDrawableRefreshLayout2.getResources().getDimensionPixelSize(R.dimen.clips_grid_swipe_to_refresh_offset);
                int dimensionPixelSize22 = swipeDrawableRefreshLayout2.getResources().getDimensionPixelSize(R.dimen.clips_grid_swipe_to_refresh_buttons_offset);
                int progressViewStartOffset2 = swipeDrawableRefreshLayout2.getProgressViewStartOffset() - dimensionPixelSize3;
                int progressViewEndOffset2 = (dimensionPixelSize3 / 2) + swipeDrawableRefreshLayout2.getProgressViewEndOffset() + dimensionPixelSize22;
                swipeDrawableRefreshLayout2.setProgressBackgroundColorSchemeColor(e3m.f(R.attr.vk_ui_background_modal, swipeDrawableRefreshLayout2.getContext()));
                swipeDrawableRefreshLayout2.setColorSchemeColors(e3m.f(R.attr.vk_ui_icon_accent, swipeDrawableRefreshLayout2.getContext()));
                swipeDrawableRefreshLayout2.s(progressViewStartOffset2, progressViewEndOffset2 + progressViewStartOffset2);
                swipeDrawableRefreshLayout2.setOnRefreshListener(new ql2(this, 11));
                this.r0 = swipeDrawableRefreshLayout2;
                ViewPager viewPager2 = (ViewPager) hvt0.c(R.id.profile_clip_viewpager, inflate);
                viewPager2.setPageMargin(iah0.a(8));
                viewPager2.setAdapter(lo());
                viewPager2.setOffscreenPageLimit(Integer.MAX_VALUE);
                viewPager2.addOnPageChangeListener(new zfu(lo(), this.u0, this.r0));
                viewPager2.addOnPageChangeListener(new ade(this));
                vpv0 vpv0Var2 = this.G0;
                vpv0Var2.c(viewPager2);
                this.n0 = viewPager2;
                vpv0Var2.a(lo());
                NonBouncedAppBarLayout nonBouncedAppBarLayout22 = (NonBouncedAppBarLayout) inflate.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
                ((qee) this.m0.getValue()).getClass();
                VkTabs a32 = qee.a(nonBouncedAppBarLayout22);
                vpv0Var2.b(a32);
                this.s0 = a32;
                this.D.a(lo().e);
                o25.a().b0(this.F0);
                androidx.lifecycle.f g2 = lo().g();
                if (g2 instanceof rde) {
                }
                if (rdeVar != null) {
                }
                VkPlaceholder vkPlaceholder2 = (VkPlaceholder) inflate.findViewById(R.id.clips_grid_error_placeholder);
                this.v0 = new u1e(vkPlaceholder2, new ng1(this, i), new e(this));
                if (inflate instanceof ConstraintLayout) {
                }
                if (constraintLayout != null) {
                }
                io();
                return inflate;
            }
        }
        cloneInContext = layoutInflater.cloneInContext(no);
        boolean z22 = false;
        inflate = cloneInContext.inflate(R.layout.fragment_clips_grid, viewGroup, false);
        if (this.y0) {
        }
        bpn0 bpn0Var2 = this.k0;
        tee.a((ClipGridParams) bpn0Var2.getValue());
        if (!epx.f(oo(), Boolean.TRUE)) {
        }
        CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) inflate.findViewById(R.id.coordinator);
        CoordinatorLayout.f fVar2 = new CoordinatorLayout.f(-1, -1);
        fVar2.c(new NonBouncedAppBarLayout.ScrollingViewBehavior());
        ((ViewGroup.MarginLayoutParams) fVar2).topMargin = iah0.a(10);
        this.t0 = skeleton.b(coordinatorLayout2, fVar2);
        nonBouncedAppBarLayout = (NonBouncedAppBarLayout) inflate.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
        this.q0 = nonBouncedAppBarLayout;
        if (nonBouncedAppBarLayout != null) {
        }
        Bundle arguments5 = getArguments();
        if (arguments5 == null) {
        }
        f5z viewLifecycleOwner2 = getViewLifecycleOwner();
        zof zofVar2 = (zof) this.Z.getValue();
        uge e22 = ((ClipsInterestsComponent) this.W.getValue()).e();
        ca caVar2 = new ca(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        int i2 = 20;
        w9f w9fVar2 = new w9f(viewLifecycleOwner2, inflate, cloneInContext, new w9f.a(zofVar2, e22, new fce(), msy.a(lazyThreadSafetyMode2, caVar2), msy.a(lazyThreadSafetyMode2, new px0(this, i2))), ko(), new mx4(this));
        fee mo2 = mo();
        ClipGridParams clipGridParams2 = (ClipGridParams) bpn0Var2.getValue();
        z1h0 parentFragment2 = getParentFragment();
        if (!(parentFragment2 instanceof c6f)) {
        }
        Bundle arguments22 = getArguments();
        if (arguments22 == null) {
        }
        if (!this.y0) {
        }
        z = false;
        sjd a222 = w9fVar2.a(mo2, clipGridParams2, c6fVar, new ree(z4, z3, z));
        this.u0 = a222;
        if (a222 instanceof ebd) {
        }
        if (ebdVar != null) {
        }
        vkTopBar = (VkTopBar) hvt0.c(R.id.toolbar, inflate);
        if (vkTopBar != null) {
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout22 = (SwipeDrawableRefreshLayout) hvt0.c(R.id.swipe_refresh_layout, inflate);
        int dimensionPixelSize32 = swipeDrawableRefreshLayout22.getResources().getDimensionPixelSize(R.dimen.clips_grid_swipe_to_refresh_offset);
        int dimensionPixelSize222 = swipeDrawableRefreshLayout22.getResources().getDimensionPixelSize(R.dimen.clips_grid_swipe_to_refresh_buttons_offset);
        int progressViewStartOffset22 = swipeDrawableRefreshLayout22.getProgressViewStartOffset() - dimensionPixelSize32;
        int progressViewEndOffset22 = (dimensionPixelSize32 / 2) + swipeDrawableRefreshLayout22.getProgressViewEndOffset() + dimensionPixelSize222;
        swipeDrawableRefreshLayout22.setProgressBackgroundColorSchemeColor(e3m.f(R.attr.vk_ui_background_modal, swipeDrawableRefreshLayout22.getContext()));
        swipeDrawableRefreshLayout22.setColorSchemeColors(e3m.f(R.attr.vk_ui_icon_accent, swipeDrawableRefreshLayout22.getContext()));
        swipeDrawableRefreshLayout22.s(progressViewStartOffset22, progressViewEndOffset22 + progressViewStartOffset22);
        swipeDrawableRefreshLayout22.setOnRefreshListener(new ql2(this, 11));
        this.r0 = swipeDrawableRefreshLayout22;
        ViewPager viewPager22 = (ViewPager) hvt0.c(R.id.profile_clip_viewpager, inflate);
        viewPager22.setPageMargin(iah0.a(8));
        viewPager22.setAdapter(lo());
        viewPager22.setOffscreenPageLimit(Integer.MAX_VALUE);
        viewPager22.addOnPageChangeListener(new zfu(lo(), this.u0, this.r0));
        viewPager22.addOnPageChangeListener(new ade(this));
        vpv0 vpv0Var22 = this.G0;
        vpv0Var22.c(viewPager22);
        this.n0 = viewPager22;
        vpv0Var22.a(lo());
        NonBouncedAppBarLayout nonBouncedAppBarLayout222 = (NonBouncedAppBarLayout) inflate.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
        ((qee) this.m0.getValue()).getClass();
        VkTabs a322 = qee.a(nonBouncedAppBarLayout222);
        vpv0Var22.b(a322);
        this.s0 = a322;
        this.D.a(lo().e);
        o25.a().b0(this.F0);
        androidx.lifecycle.f g22 = lo().g();
        if (g22 instanceof rde) {
        }
        if (rdeVar != null) {
        }
        VkPlaceholder vkPlaceholder22 = (VkPlaceholder) inflate.findViewById(R.id.clips_grid_error_placeholder);
        this.v0 = new u1e(vkPlaceholder22, new ng1(this, i2), new e(this));
        if (inflate instanceof ConstraintLayout) {
        }
        if (constraintLayout != null) {
        }
        io();
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        bpn0 bpn0Var = this.Y;
        kbk context = ((lbk) bpn0Var.getValue()).getContext();
        if (context == null || !context.a()) {
            return;
        }
        ((lbk) bpn0Var.getValue()).i();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo().onDestroyView();
        sjd sjdVar = this.u0;
        if (sjdVar != null) {
            sjdVar.onDestroyView();
        }
        o25.a().B(this.F0);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        qcy<Object>[] qcyVarArr = H0;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.U;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(null);
        mo().onPause();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (mo().W1()) {
            mo().e2(false);
        }
        mo().onResume();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!this.V && this.T) {
            mo().e2(false);
            return;
        }
        this.V = false;
        if (mo().F0()) {
            this.T = true;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo().d();
        this.T = false;
        qo(o25.a().b());
    }

    public final Boolean oo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.getBoolean("ClipsGridFragment.is_owner_grid"));
        }
        return null;
    }

    public final void po(View view, Rect rect, boolean z, gzs<s3q0> gzsVar) {
        if (epx.f(oo(), Boolean.TRUE)) {
            UserId a2 = mo().a();
            this.E0.e(view, rect, no(requireContext()), a2, z, this.B0, gzsVar, new kp5(4, this, a2));
            mo().getClass();
        }
    }

    @Override // xsna.wee
    public final void q3() {
        dg9 c2;
        sjd sjdVar = this.u0;
        if (sjdVar == null || (c2 = sjdVar.c()) == null) {
            return;
        }
        c2.d(true);
    }

    @Override // xsna.tds
    public final int qc() {
        return e3m.f(R.attr.vk_ui_vkontakte_palette_black, no(requireContext()));
    }

    @Override // xsna.wee
    public final void qk(ClipGridParams.Data data, ild ildVar) {
        dg9 c2;
        sjd sjdVar = this.u0;
        if (sjdVar == null || (c2 = sjdVar.c()) == null) {
            return;
        }
        c2.a(data, ildVar.a());
    }

    @Override // xsna.wee
    public final void ql(boolean z, boolean z2, boolean z3, boolean z4) {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.q0;
        if (nonBouncedAppBarLayout != null) {
            bpn0 bpn0Var = this.m0;
            ((qee) bpn0Var.getValue()).getClass();
            if (qee.b(nonBouncedAppBarLayout)) {
                View view = getView();
                if (view != null) {
                    NonBouncedAppBarLayout nonBouncedAppBarLayout2 = (NonBouncedAppBarLayout) view.findViewById(R.id.clips_grid_non_bounced_app_bar_layout);
                    ((qee) bpn0Var.getValue()).getClass();
                    VkTabs a2 = qee.a(nonBouncedAppBarLayout2);
                    this.G0.b(a2);
                    this.s0 = a2;
                }
                io();
            }
        }
        ClipsGridTabData jo = jo();
        a.C0712a c0712a = new a.C0712a(ko(), mo().F0(), z, z2, z3, z4);
        com.vk.clips.viewer.impl.grid.a aVar = this.E0;
        lo().k(aVar.a(c0712a));
        lo().notifyDataSetChanged();
        boolean z5 = lo().getCount() > 1;
        ViewPager viewPager = this.n0;
        if (viewPager != null) {
            boolean z6 = !z5;
            viewPager.setClipToOutline(z6);
            lo().l(z6);
        }
        if (!ro(jo)) {
            ro(ClipsGridTabData.OwnerClips);
        }
        VkTabs vkTabs = this.s0;
        if (vkTabs == null) {
            vkTabs = null;
        }
        aVar.c(vkTabs, lo());
    }

    public final void qo(boolean z) {
        View view = getView();
        NonBouncedCollapsingToolbarLayout nonBouncedCollapsingToolbarLayout = view != null ? (NonBouncedCollapsingToolbarLayout) view.findViewById(R.id.collapsing_layout) : null;
        NonBouncedAppBarLayout.c cVar = (NonBouncedAppBarLayout.c) (nonBouncedCollapsingToolbarLayout != null ? nonBouncedCollapsingToolbarLayout.getLayoutParams() : null);
        if (z) {
            if (cVar != null) {
                cVar.a(19);
            }
        } else if (cVar != null) {
            cVar.a(0);
        }
    }

    public final boolean ro(ClipsGridTabData clipsGridTabData) {
        int count = lo().getCount();
        for (int i = 0; i < count; i++) {
            if (lo().j().get(i).i() == clipsGridTabData) {
                ViewPager viewPager = this.n0;
                if (viewPager == null) {
                    return true;
                }
                viewPager.setCurrentItem(i, false);
                return true;
            }
        }
        return false;
    }

    @Override // xsna.qhh0
    public final boolean s() {
        NonBouncedAppBarLayout nonBouncedAppBarLayout = this.q0;
        if (nonBouncedAppBarLayout != null) {
            nonBouncedAppBarLayout.g();
        }
        androidx.lifecycle.f g = lo().g();
        rde rdeVar = g instanceof rde ? (rde) g : null;
        if (rdeVar != null) {
            rdeVar.Qf();
        }
        return true;
    }

    @Override // xsna.v0q0
    public final boolean sk() {
        if (isAdded()) {
            return true;
        }
        com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("isUiTrackingActive requested but fragment is not attached"));
        return false;
    }

    @Override // xsna.ide
    public final sde w1(ClipsGridTabData clipsGridTabData) {
        return mo().w1(clipsGridTabData);
    }

    @Override // xsna.wee
    public final void y3(UserId userId, ArrayList arrayList, boolean z) {
        a3p0.b.C2520b c2520b = new a3p0.b.C2520b(arrayList, userId, z, new wl0(this, 20));
        sjd sjdVar = this.u0;
        if (sjdVar != null) {
            sjdVar.b(c2520b);
        }
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.r0;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setRefreshing(false);
        }
    }

    @Override // xsna.wee
    public final void z9() {
        if (mo().t2()) {
            return;
        }
        FrameLayout frameLayout = this.t0;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(0);
        ViewPager viewPager = this.n0;
        if (viewPager != null) {
            f4m.j(viewPager);
        }
        VkTabs vkTabs = this.s0;
        f4m.j(vkTabs != null ? vkTabs : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
    }
}
