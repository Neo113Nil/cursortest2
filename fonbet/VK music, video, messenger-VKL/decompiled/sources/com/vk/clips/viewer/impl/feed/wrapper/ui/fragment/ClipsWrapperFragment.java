package com.vk.clips.viewer.impl.feed.wrapper.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.screens.feed.decorator.api.di.ClipsDecorationComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vk.clips.sdk.shared.decoration.ClipsDecorationKey;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.sdk.shared.feed.controller.mvi.model.NoDecoration;
import com.vk.clips.sdk.shared.upload.badge.UploadBadgeComponent;
import com.vk.clips.tool.view.viewer.feed.wrapper.fragment.FragmentContainerFrameLayout;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.presentation.event.ClipsWrapperHintButtonPosition;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vk.clips.viewer.impl.feed.wrapper.ui.transition.ClipsWrapperTransitionState;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.clips.viewer.impl.routing.transition.a;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.core.apps.BuildInfo;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.movika.sdk.base.observable.w;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a7j;
import xsna.aes;
import xsna.ao50;
import xsna.arf;
import xsna.auf;
import xsna.awt0;
import xsna.b00;
import xsna.b0u0;
import xsna.b6f;
import xsna.bkm;
import xsna.bmp0;
import xsna.bpn0;
import xsna.bpr0;
import xsna.bqx0;
import xsna.brf;
import xsna.bv1;
import xsna.bwt0;
import xsna.c1u0;
import xsna.c5g;
import xsna.c6f;
import xsna.cm70;
import xsna.crf;
import xsna.cro0;
import xsna.cuf;
import xsna.cv1;
import xsna.czc;
import xsna.d3m;
import xsna.d6e;
import xsna.d9e;
import xsna.dcd;
import xsna.dne;
import xsna.dof;
import xsna.drm0;
import xsna.duf;
import xsna.e43;
import xsna.epx;
import xsna.eu1;
import xsna.ey50;
import xsna.f4m;
import xsna.f5;
import xsna.fed;
import xsna.fnj;
import xsna.fpf0;
import xsna.fxc0;
import xsna.fyu;
import xsna.g5;
import xsna.gko;
import xsna.gm50;
import xsna.gu0;
import xsna.gy0;
import xsna.gzs;
import xsna.h2f;
import xsna.haf;
import xsna.hd;
import xsna.hfq;
import xsna.hh1;
import xsna.iah0;
import xsna.ife;
import xsna.im0;
import xsna.in0;
import xsna.io2;
import xsna.iqf;
import xsna.isf;
import xsna.itf;
import xsna.iut0;
import xsna.iwc;
import xsna.ix2;
import xsna.iz0;
import xsna.izs;
import xsna.j5;
import xsna.j5g;
import xsna.jaf;
import xsna.ji0;
import xsna.jsf;
import xsna.juf;
import xsna.jwc;
import xsna.jwe;
import xsna.kbk;
import xsna.kd;
import xsna.km50;
import xsna.krv0;
import xsna.kwc;
import xsna.lbe;
import xsna.lbk;
import xsna.lbs;
import xsna.ltf;
import xsna.m4;
import xsna.m6e;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.mu1;
import xsna.nj;
import xsna.no;
import xsna.npf;
import xsna.nuf;
import xsna.nwy;
import xsna.o0q0;
import xsna.oo2;
import xsna.opf;
import xsna.orf;
import xsna.osf;
import xsna.ouf;
import xsna.oz50;
import xsna.pce;
import xsna.pgn;
import xsna.prf;
import xsna.ptf;
import xsna.pu;
import xsna.q;
import xsna.q0f;
import xsna.q8e;
import xsna.qcy;
import xsna.qhh0;
import xsna.qi3;
import xsna.qj80;
import xsna.qrf;
import xsna.r490;
import xsna.ra0;
import xsna.rl3;
import xsna.ry0;
import xsna.rzc;
import xsna.s3q0;
import xsna.s4;
import xsna.s9;
import xsna.sa0;
import xsna.sg3;
import xsna.sje;
import xsna.soc;
import xsna.srf;
import xsna.syc;
import xsna.sz;
import xsna.t9q0;
import xsna.tc;
import xsna.tid;
import xsna.tlo0;
import xsna.tpf;
import xsna.tq;
import xsna.ttf;
import xsna.u080;
import xsna.u40;
import xsna.u6;
import xsna.ud8;
import xsna.ule;
import xsna.urf;
import xsna.uuf;
import xsna.uvc;
import xsna.v6j;
import xsna.vk50;
import xsna.vuf;
import xsna.w8e;
import xsna.wd8;
import xsna.wi3;
import xsna.wp50;
import xsna.wqf;
import xsna.wrf;
import xsna.wuf;
import xsna.ww50;
import xsna.x90;
import xsna.x9q0;
import xsna.xd8;
import xsna.xn50;
import xsna.xne;
import xsna.xpf;
import xsna.xqf;
import xsna.xrf;
import xsna.xuf;
import xsna.y1q0;
import xsna.y9q0;
import xsna.yad;
import xsna.yg5;
import xsna.yp1;
import xsna.yqf;
import xsna.z1h0;
import xsna.z4f;
import xsna.zhe;
import xsna.zjq;
import xsna.zof;
import xsna.zqf;
import xsna.ztf;

/* compiled from: ClipsWrapperFragment.kt */
/* loaded from: classes17.dex */
public final class ClipsWrapperFragment extends MviImplFragment<iqf, uuf, npf> implements jwc, rzc, c6f, tid, aes, qhh0, o0q0 {
    public static final /* synthetic */ int Q0 = 0;
    public final Object A0;
    public final ArrayList B0;
    public final y1q0 C0;
    public cm70 D0;
    public x9q0 E0;
    public io.reactivex.rxjava3.disposables.c F0;
    public xuf G0;
    public ClipFeedTab H0;
    public io.reactivex.rxjava3.disposables.c I0;
    public int J0;
    public int K0;
    public uuf.f L0;
    public final r490 M0;
    public float N0;
    public uuf.j O0;
    public final Object P0;
    public final bpn0 Q = new bpn0(new s4(this, 28));
    public final bpn0 R = new bpn0(new q(this, 27));
    public final Object S;
    public final Object T;
    public final Object U;
    public final bpn0 V;
    public final Object W;
    public final bpn0 X;
    public final bpn0 Y;
    public final bpn0 Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final bpn0 g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;
    public boolean l0;
    public final Object m0;
    public final Object n0;
    public final czc o0;
    public final juf p0;
    public final w8e q0;
    public final Object r0;
    public final Object s0;
    public final e t0;
    public final Object u0;
    public final Object v0;
    public final int w0;
    public ClipSeekBarController x0;
    public final xpf y0;
    public final Object z0;

    /* compiled from: ClipsWrapperFragment.kt */
    public static final class a extends oz50 {
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

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipsWrapperHintButtonPosition.values().length];
            try {
                iArr[ClipsWrapperHintButtonPosition.Main.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsWrapperHintButtonPosition.Extra.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ClipFeedOpenAction.ShowActionButton.State.values().length];
            try {
                iArr2[ClipFeedOpenAction.ShowActionButton.State.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ClipFeedOpenAction.ShowActionButton.State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<d9e> {
        @Override // xsna.gzs
        public final d9e invoke() {
            ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
            int i = ClipsWrapperFragment.Q0;
            return clipsWrapperFragment.ko();
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements gzs<ClipFeedListFragment> {
        @Override // xsna.gzs
        public final ClipFeedListFragment invoke() {
            ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
            int i = ClipsWrapperFragment.Q0;
            return clipsWrapperFragment.lo();
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final class e implements bkm {
        public e() {
        }

        @Override // xsna.bkm
        public final void bb(int i) {
            ClipsWrapperFragment clipsWrapperFragment = ClipsWrapperFragment.this;
            if (clipsWrapperFragment.ec().e()) {
                LayoutInflater.Factory activity = clipsWrapperFragment.getActivity();
                ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y != null) {
                    Y.c0(this);
                }
            }
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class f extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
            int i = ClipsWrapperFragment.Q0;
            clipsWrapperFragment.ho();
            return s3q0.a;
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class g extends FunctionReferenceImpl implements gzs<d9e> {
        @Override // xsna.gzs
        public final d9e invoke() {
            ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
            int i = ClipsWrapperFragment.Q0;
            return clipsWrapperFragment.ko();
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class h extends FunctionReferenceImpl implements gzs<Bundle> {
        @Override // xsna.gzs
        public final Bundle invoke() {
            return ((ClipsWrapperFragment) this.receiver).getArguments();
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class i extends MutablePropertyReference0Impl {
        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((ClipsWrapperFragment) this.receiver).x0;
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
        public final void set(Object obj) {
            ((ClipsWrapperFragment) this.receiver).x0 = (ClipSeekBarController) obj;
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final class j implements gzs<s3q0> {
        public static final j b = new j();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    /* compiled from: ClipsWrapperFragment.kt */
    public static final /* synthetic */ class k extends FunctionReferenceImpl implements gzs<List<? extends View>> {
        @Override // xsna.gzs
        public final List<? extends View> invoke() {
            ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
            int i = ClipsWrapperFragment.Q0;
            return clipsWrapperFragment.oo();
        }
    }

    public ClipsWrapperFragment() {
        xqf xqfVar = new xqf(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, xqfVar);
        this.T = msy.a(lazyThreadSafetyMode, new sje(this, 3));
        this.U = msy.a(lazyThreadSafetyMode, new defpackage.e(this, 25));
        this.V = new bpn0(new defpackage.f(this, 22));
        this.W = msy.a(lazyThreadSafetyMode, new z4f(this, 3));
        this.X = new bpn0(new yqf(this, 0));
        this.Y = new bpn0(new zqf(this, 0));
        this.Z = new bpn0(new defpackage.k(this, 20));
        this.a0 = msy.a(lazyThreadSafetyMode, new defpackage.j(this, 24));
        this.b0 = msy.a(lazyThreadSafetyMode, new dne(this, 1));
        this.c0 = msy.a(lazyThreadSafetyMode, new hd(this, 26));
        this.d0 = msy.a(lazyThreadSafetyMode, new u40(this, 22));
        this.e0 = msy.a(lazyThreadSafetyMode, new no(this, 26));
        this.f0 = msy.a(lazyThreadSafetyMode, new ra0(this, 28));
        this.g0 = new bpn0(new sa0(this, 29));
        this.h0 = msy.a(lazyThreadSafetyMode, new im0(this, 25));
        this.i0 = msy.a(lazyThreadSafetyMode, new gy0(this, 28));
        this.j0 = msy.a(lazyThreadSafetyMode, new eu1(this, 27));
        this.k0 = msy.a(lazyThreadSafetyMode, new wqf(this, 0));
        this.m0 = msy.a(lazyThreadSafetyMode, new gu0(8));
        this.n0 = msy.a(lazyThreadSafetyMode, new pce(this, 5));
        czc czcVar = new czc();
        this.o0 = czcVar;
        this.p0 = new juf(czcVar);
        this.q0 = new w8e(this);
        this.r0 = msy.a(lazyThreadSafetyMode, new dof(this, 1));
        this.s0 = msy.a(lazyThreadSafetyMode, new m4(this, 26));
        this.t0 = new e();
        this.u0 = msy.a(lazyThreadSafetyMode, new pu(this, 28));
        this.v0 = msy.a(lazyThreadSafetyMode, new hh1(this, 20));
        Context context = e43.a;
        this.w0 = (context == null ? null : context).getResources().getDimensionPixelSize(R.dimen.vk_bottom_navigation_height);
        this.y0 = new xpf();
        this.z0 = msy.a(lazyThreadSafetyMode, new ry0(this, 24));
        this.A0 = msy.a(lazyThreadSafetyMode, new ji0(this, 20));
        this.B0 = new ArrayList();
        this.C0 = new y1q0(0);
        this.J0 = -1;
        this.K0 = -1;
        this.M0 = new r490();
        this.N0 = 1.0f;
        this.P0 = msy.a(lazyThreadSafetyMode, new in0(this, 25));
    }

    public static tlo0.f mo(uuf.d dVar) {
        tlo0.a aVar;
        int i2;
        if (dVar instanceof uuf.d.a) {
            aVar = tlo0.Companion;
            i2 = R.string.video_clips_create_clip;
        } else if (dVar instanceof uuf.d.b) {
            aVar = tlo0.Companion;
            i2 = R.string.clips_accessibility_more;
        } else {
            if (!(dVar instanceof uuf.d.c)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = tlo0.Companion;
            i2 = R.string.search;
        }
        return tq.h(aVar, i2);
    }

    public static gko no(uuf.d dVar) {
        if (dVar instanceof uuf.d.a) {
            return new gko(R.drawable.vk_icon_add_outline_28);
        }
        if (dVar instanceof uuf.d.b) {
            return new gko(R.drawable.vk_icon_more_vertical_28);
        }
        if (dVar instanceof uuf.d.c) {
            return new gko(R.drawable.vk_icon_search_outline_28);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.aes
    public final void A0() {
        vo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0177, code lost:
    
        if (r5 == null) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mk50 Fl() {
        View findViewById;
        ClipsWrapperFragment clipsWrapperFragment = this;
        if (((Boolean) clipsWrapperFragment.po().f.getValue()).booleanValue()) {
            bpn0 bpn0Var = clipsWrapperFragment.Z;
            if (((lbk) bpn0Var.getValue()).getContext() == null) {
                ((lbk) bpn0Var.getValue()).a(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.LINK, new SecureRandom().nextInt(Integer.MAX_VALUE), (r3 & 4) == 0);
            }
        }
        ?? r9 = clipsWrapperFragment.v0;
        ife ifeVar = null;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from((cro0) r9.getValue()).inflate(R.layout.clips_wrapper_fragment_lite, (ViewGroup) null, false);
        ClipsWrapperInputArguments po = clipsWrapperFragment.po();
        if (!po.e() && !((Boolean) po.m.getValue()).booleanValue()) {
            b6f b6fVar = new b6f(viewGroup.getContext());
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            clipsWrapperFragment = this;
            b6fVar.setDelegate(new ztf((ouf) clipsWrapperFragment.u0.getValue(), new orf(i4, clipsWrapperFragment, ClipsWrapperFragment.class, "getCurrentFeedListFragment", "getCurrentFeedListFragment()Lcom/vk/clips/viewer/impl/feed/view/ClipFeedListFragment;", i2, i3), new prf(i4, this, ClipsWrapperFragment.class, "getFadeViews", "getFadeViews()Ljava/util/List;", i2, i3), new qrf(0, clipsWrapperFragment, ClipsWrapperFragment.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close()Z", 8, 0)));
            b6fVar.addView(viewGroup);
            viewGroup = b6fVar;
        }
        int scaledPagingTouchSlop = ViewConfiguration.get(viewGroup.getContext()).getScaledPagingTouchSlop();
        jaf jafVar = new jaf(viewGroup.getContext(), null);
        jafVar.setTouchDelegate$impl_release(new bpr0(scaledPagingTouchSlop, scaledPagingTouchSlop * 2, new f5(jafVar, 27)));
        jafVar.addView(viewGroup);
        f4m.q(((Boolean) clipsWrapperFragment.z0.getValue()).booleanValue() ? iah0.a(56) : iah0.a(10), jafVar.findViewById(R.id.clip_feed_lists_container));
        ((ViewGroup) jafVar.findViewById(R.id.clips_wrapper_content_container)).addView((ViewGroup) clipsWrapperFragment.io().Nf().a((cro0) r9.getValue(), (ViewGroup) jafVar.findViewById(R.id.clips_wrapper_content_container_widgets)));
        boolean z = ((zof) clipsWrapperFragment.V.getValue()).I().a;
        ViewStub viewStub = (ViewStub) jafVar.findViewById(R.id.clips_wrapper_top_bar_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource((fxc0.B().J().o1() || fxc0.B().J().N0()) ? R.layout.redesigned_clips_top_bar : R.layout.clips_default_top_bar);
            findViewById = viewStub.inflate();
        }
        findViewById = jafVar.findViewById(R.id.clips_wrapper_top_bar);
        VkTopBar vkTopBar = (VkTopBar) findViewById;
        if (z) {
            ifeVar = new ife(jafVar.getContext());
            ifeVar.setId(R.id.clips_header_view);
            ifeVar.setVisibility(8);
        }
        ife ifeVar2 = ifeVar;
        ViewGroup viewGroup2 = (ViewGroup) jafVar.findViewById(R.id.clips_wrapper_content_container);
        FragmentContainerFrameLayout fragmentContainerFrameLayout = (FragmentContainerFrameLayout) jafVar.findViewById(R.id.clip_feed_lists_container);
        xuf xufVar = new xuf(vkTopBar, ifeVar2, viewGroup2, fragmentContainerFrameLayout, jafVar.findViewById(R.id.clip_feed_status_bar_offset), (VkText) jafVar.findViewById(R.id.clip_feed_subtitle), new c1u0(R.id.clip_feed_download_progress_stub, R.layout.clips_wrapper_fragment_loader, jafVar), jafVar.findViewById(R.id.clip_feed_background), jafVar.findViewById(R.id.clip_feed_bottom_background), (ClipSeekBarView) jafVar.findViewById(R.id.clip_feed_seekbar), jafVar.findViewById(R.id.clip_feed_seekbar_background), (VkButton) jafVar.findViewById(R.id.clip_feed_statistic_button), (VkButton) jafVar.findViewById(R.id.clip_feed_promotion_button), (ViewGroup) jafVar.findViewById(R.id.clips_wrapper_top_bar_placeholder), (ViewGroup) jafVar.findViewById(R.id.clips_wrapper_bottom_bar_placeholder));
        fragmentContainerFrameLayout.b = clipsWrapperFragment.getChildFragmentManager();
        clipsWrapperFragment.G0 = xufVar;
        clipsWrapperFragment.fo();
        return new mk50.c(jafVar);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        uuf uufVar = (uuf) ao50Var;
        fo();
        gm50.a.b(this, uufVar.a, new yad(this, 9));
        gm50.a.b(this, uufVar.b, new w(this, 26));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        iqf iqfVar = (iqf) vk50Var;
        int i2 = 0;
        iqfVar.s.a(new yp1(1, this, ClipsWrapperFragment.class, "handeBackEvent", "handeBackEvent(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/event/ClipsWrapperBackEvent;)V", i2, 5), this);
        iqfVar.t.a(new sg3(1, (ltf) this.n0.getValue(), ltf.class, "navigate", "navigate(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/event/ClipsWrapperNavigationEvent;)V", 0, 3), this);
        int i3 = 1;
        iqfVar.u.a(new qi3(i3, this, ClipsWrapperFragment.class, "renderDownload", "renderDownload(Lcom/vk/clips/viewer/impl/feed/wrapper/domain/model/ClipsWrapperDownloadState;)V", i2, 8), this);
        iqfVar.v.a(new ud8(i3, this, ClipsWrapperFragment.class, "handleUploadState", "handleUploadState(Lcom/vk/clips/viewer/impl/feed/wrapper/domain/model/ClipsWrapperUploadState;)V", i2, 6), this);
        iqfVar.w.a(new wd8(i3, this, ClipsWrapperFragment.class, "trackScreen", "trackScreen(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/event/ClipsWrapperTrackTabEvent;)V", i2, 5), this);
        iqfVar.x.a(new sz(this, 25), this);
        iqfVar.y.a(new iz0(this, 17), this);
        int i4 = 1;
        iqfVar.z.a(new xd8(i4, this, ClipsWrapperFragment.class, "handleOpenAction", "handleOpenAction(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/comment/ClipsWrapperOpenActionEvent;)V", i2, 3), this);
        iqfVar.A.a(new wi3(i4, this, ClipsWrapperFragment.class, "handleShowToolbarHintAction", "handleShowToolbarHintAction(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/event/ClipsWrapperToolbarHintEvent;)V", i2, 5), this);
        iqfVar.B.a(new j5(this, 29), this);
    }

    @Override // xsna.c6f
    public final int T3() {
        xuf xufVar = this.G0;
        Integer valueOf = xufVar != null ? Integer.valueOf(xufVar.getTopBar().getBottom() - xufVar.k().getBottom()) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rzc
    public final com.vk.clips.viewer.impl.routing.transition.a Uh() {
        VideoFile A;
        List<SdkVideoFile> list;
        SdkVideoFile sdkVideoFile;
        VideoFile A2;
        ClipFeedListFragment lo = lo();
        String str = null;
        q8e Bo = lo != null ? lo.Bo() : null;
        io2 io2Var = (io2) po().c.getValue();
        oo2 oo2Var = io2Var != null ? new oo2(io2Var, this.M0) : null;
        if (Bo == null || oo2Var == null) {
            return null;
        }
        Object obj = (ClipFeedTab) j5g.b0(this.J0, po().c());
        if (obj == null) {
            obj = (ClipFeedTab) j5g.a0(po().c());
        }
        ClipFeedListFragment lo2 = lo();
        boolean z = false;
        if (epx.f(obj, lo2 != null ? lo2.Ka() : null)) {
            if (obj instanceof ClipFeedTab.c) {
                String r1 = ((ClipFeedTab.c) obj).A().r1();
                yg5 yg5Var = lo.Eh(lo.to()).a;
                if (yg5Var != null && (A2 = yg5Var.A()) != null) {
                    str = A2.r1();
                }
                z = epx.f(r1, str);
            } else {
                kwc kwcVar = (kwc) po().e.getValue();
                int i2 = kwcVar != null ? kwcVar.c : 0;
                kwc kwcVar2 = (kwc) po().e.getValue();
                String r12 = (kwcVar2 == null || (list = kwcVar2.a) == null || (sdkVideoFile = (SdkVideoFile) j5g.b0(i2, list)) == null) ? null : sdkVideoFile.r1();
                if (r12 != null) {
                    yg5 yg5Var2 = lo.Eh(lo.to()).a;
                    if (yg5Var2 != null && (A = yg5Var2.A()) != null) {
                        str = A.r1();
                    }
                    z = r12.equals(str);
                } else if (i2 == lo.to()) {
                    z = true;
                }
            }
        }
        return new com.vk.clips.viewer.impl.routing.transition.a(new a.b(oo2Var), new a.C0714a(oo(), Bo, z, j()));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        d9e ko = ko();
        if (ko != null && ko.onBack()) {
            return true;
        }
        if (this.J0 != this.K0) {
            xn50.a.c(this, npf.h.a.b);
            return true;
        }
        if (fxc0.B().J().e1() && getParentFragmentManager().c.f().size() == 1) {
            fxc0.B().Y().A(requireContext(), (r27 & 2) != 0 ? null : null, null, (r27 & 8) == 0, (r27 & 16) != 0 ? null : null, (r27 & 32) != 0 ? null : null, (r27 & 64) != 0 ? false : false, (r27 & 128) == 0, (r27 & 256) != 0 ? false : false, (r27 & 512) != 0 ? null : Boolean.TRUE, (r27 & 1024) != 0 ? null : null, (r27 & 2048) != 0 ? null : null);
        }
        return ho();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jwc
    public final iwc ec() {
        return (iwc) this.P0.getValue();
    }

    public final void fo() {
        xuf xufVar = this.G0;
        if (xufVar != null) {
            ArrayList arrayList = this.B0;
            List O0 = j5g.O0(arrayList);
            arrayList.clear();
            Iterator it = O0.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(xufVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.o0q0
    public final Fragment getUiTrackingFragment() {
        Fragment G;
        xuf xufVar = this.G0;
        if (xufVar == null || (G = getChildFragmentManager().G(xufVar.r().getId())) == 0) {
            return null;
        }
        if (!(G instanceof d9e) || epx.f(((d9e) G).Ka(), this.H0)) {
            return G;
        }
        return null;
    }

    public final void go(izs<? super wuf, s3q0> izsVar) {
        xuf xufVar = this.G0;
        if (xufVar != null) {
            izsVar.invoke(xufVar);
        } else {
            this.B0.add(izsVar);
        }
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        vo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00e9, code lost:
    
        if (r2.intValue() != r0) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010a  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ho() {
        ClipsWrapperTransitionState clipsWrapperTransitionState;
        Object[] objArr;
        Object[] objArr2;
        final ClipsOwnerSwipeFragment clipsOwnerSwipeFragment;
        Rect t0;
        if (!po().e() || ((Boolean) po().m.getValue()).booleanValue()) {
            ouf oufVar = (ouf) this.u0.getValue();
            kwc kwcVar = (kwc) po().e.getValue();
            ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.b0(this.J0, po().c());
            if (clipFeedTab == null) {
                clipFeedTab = (ClipFeedTab) j5g.a0(po().c());
            }
            d dVar = new d(0, this, ClipsWrapperFragment.class, "getCurrentFeedListFragment", "getCurrentFeedListFragment()Lcom/vk/clips/viewer/impl/feed/view/ClipFeedListFragment;", 0);
            g5 g5Var = new g5(this, 25);
            ClipsWrapperTransitionState clipsWrapperTransitionState2 = oufVar.g;
            io2 io2Var = oufVar.e;
            clipsWrapperTransitionState2.getClass();
            if (clipsWrapperTransitionState2 != ClipsWrapperTransitionState.SHOW_RUNNING && clipsWrapperTransitionState2 != (clipsWrapperTransitionState = ClipsWrapperTransitionState.HIDE_RUNNING)) {
                if (oufVar.g != ClipsWrapperTransitionState.HIDE_FINISHED) {
                    if (oufVar.c) {
                        Fragment fragment = (Fragment) oufVar.d.invoke();
                        if ((fragment != null ? fragment.getEnterTransition() : null) == null || bmp0.a == null) {
                            FragmentImpl fragmentImpl = fragment instanceof FragmentImpl ? (FragmentImpl) fragment : null;
                            if (fragmentImpl != null) {
                                fragmentImpl.finish();
                            }
                            g5Var.invoke();
                            return true;
                        }
                    } else {
                        oufVar.g = clipsWrapperTransitionState;
                        ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) dVar.invoke();
                        ClipFeedListFragment clipFeedListFragment2 = (clipFeedListFragment == null || !epx.f(clipFeedListFragment.Ka(), clipFeedTab)) ? null : clipFeedListFragment;
                        Integer valueOf = clipFeedListFragment2 != null ? Integer.valueOf(clipFeedListFragment2.to()) : null;
                        if (kwcVar != null || valueOf == null || valueOf.intValue() != 0) {
                            if (kwcVar != null) {
                                int i2 = kwcVar.c;
                                if (valueOf != null) {
                                }
                            }
                            objArr = false;
                            objArr2 = (io2Var != null || (t0 = io2Var.t0()) == null || t0.isEmpty()) ? false : true;
                            Fragment parentFragment = getParentFragment();
                            androidx.fragment.app.d dVar2 = !(parentFragment instanceof androidx.fragment.app.d) ? (androidx.fragment.app.d) parentFragment : null;
                            nuf nufVar = new nuf(oufVar, (dVar2 == null && dVar2.o) ? dVar2 : null, g5Var, this, 0);
                            if (objArr2 != true && objArr == true && clipFeedListFragment2 != null) {
                                int i3 = uvc.c;
                                uvc.c(oufVar.f.invoke(), clipFeedListFragment2.Bo(), io2Var, false, nufVar);
                                return true;
                            }
                            Fragment parentFragment2 = getParentFragment();
                            clipsOwnerSwipeFragment = parentFragment2 instanceof ClipsOwnerSwipeFragment ? (ClipsOwnerSwipeFragment) parentFragment2 : null;
                            if (clipsOwnerSwipeFragment == null) {
                                final kd kdVar = new kd(nufVar, 24);
                                if (clipsOwnerSwipeFragment.ho().b()) {
                                    kdVar.invoke();
                                    return true;
                                }
                                final EmptyList emptyList = EmptyList.b;
                                final int i4 = -iah0.f().widthPixels;
                                final View view = clipsOwnerSwipeFragment.getView();
                                if (view != null) {
                                    if (view.isLaidOut()) {
                                        FragmentImpl.Gn(emptyList, view, kdVar, i4, clipsOwnerSwipeFragment);
                                        return true;
                                    }
                                    qj80.a(view, new Runnable() { // from class: xsna.gbs
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            FragmentImpl.Gn(emptyList, view, kdVar, i4, clipsOwnerSwipeFragment);
                                        }
                                    });
                                    return true;
                                }
                            } else {
                                nufVar.invoke();
                            }
                        }
                        objArr = true;
                        if (io2Var != null) {
                        }
                        Fragment parentFragment3 = getParentFragment();
                        if (!(parentFragment3 instanceof androidx.fragment.app.d)) {
                        }
                        nuf nufVar2 = new nuf(oufVar, (dVar2 == null && dVar2.o) ? dVar2 : null, g5Var, this, 0);
                        if (objArr2 != true) {
                        }
                        Fragment parentFragment22 = getParentFragment();
                        clipsOwnerSwipeFragment = parentFragment22 instanceof ClipsOwnerSwipeFragment ? (ClipsOwnerSwipeFragment) parentFragment22 : null;
                        if (clipsOwnerSwipeFragment == null) {
                        }
                    }
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final ClipsViewerComponentImpl io() {
        return (ClipsViewerComponentImpl) this.Q.getValue();
    }

    @Override // xsna.tid
    public final yg5 j() {
        z1h0 jo = jo();
        tid tidVar = jo instanceof tid ? (tid) jo : null;
        if (tidVar != null) {
            return tidVar.j();
        }
        return null;
    }

    public final Fragment jo() {
        xuf xufVar = this.G0;
        if (xufVar != null) {
            return getChildFragmentManager().G(xufVar.r().getId());
        }
        return null;
    }

    public final d9e ko() {
        z1h0 jo = jo();
        if (jo instanceof d9e) {
            return (d9e) jo;
        }
        return null;
    }

    public final ClipFeedListFragment lo() {
        Fragment jo = jo();
        if (jo instanceof ClipFeedListFragment) {
            return (ClipFeedListFragment) jo;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        ltf ltfVar = (ltf) this.n0.getValue();
        ltfVar.getClass();
        ltfVar.g = new WeakReference<>(context);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((zhe) this.a0.getValue()).a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (((Boolean) po().f.getValue()).booleanValue()) {
            bpn0 bpn0Var = this.Z;
            kbk context = ((lbk) bpn0Var.getValue()).getContext();
            if (context != null && context.c) {
                ((lbk) bpn0Var.getValue()).i();
            }
        }
        ((soc) this.R.getValue()).b(this.p0);
        xuf xufVar = this.G0;
        if (xufVar != null) {
            xufVar.r().b = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.F0;
        if (cVar != null) {
            cVar.dispose();
        }
        x9q0 x9q0Var = this.E0;
        if (x9q0Var != null) {
            x9q0Var.release();
        }
        cm70 cm70Var = this.D0;
        if (cm70Var != null) {
            pgn pgnVar = cm70Var.h;
            qcy<Object>[] qcyVarArr = cm70.j;
            qcy<Object> qcyVar = qcyVarArr[0];
            io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            pgn pgnVar2 = cm70Var.i;
            qcy<Object> qcyVar2 = qcyVarArr[1];
            io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) pgnVar2.b;
            if (cVar3 != null) {
                cVar3.dispose();
            }
        }
        View view = getView();
        if (view != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            iut0.d.c(view, null);
        }
        this.G0 = null;
        this.L0 = null;
        this.l0 = false;
        this.N0 = 1.0f;
        this.O0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        ((ltf) this.n0.getValue()).g = null;
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
        if (Y != null) {
            Y.c0(this.t0);
        }
        super.onDetach();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        View view;
        ClipSeekBarView view2;
        super.onPause();
        ClipSeekBarController clipSeekBarController = this.x0;
        if (clipSeekBarController != null && (view2 = clipSeekBarController.getView()) != null) {
            d3m.e(view2, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        }
        ((syc) this.r0.getValue()).c((ViewGroup) getView());
        osf osfVar = (osf) this.m0.getValue();
        osfVar.a = false;
        VkContextMenu vkContextMenu = osfVar.b;
        if (vkContextMenu != null) {
            vkContextMenu.b();
        }
        osfVar.b = null;
        czc czcVar = this.o0;
        czcVar.a.clear();
        WeakReference<View> weakReference = czcVar.d;
        if (weakReference != null && (view = weakReference.get()) != null) {
            bwt0.U(view, czcVar.e);
        }
        czcVar.d = null;
        czcVar.e = null;
        com.vk.core.tips.b bVar = czcVar.c;
        if (bVar != null) {
            bVar.b(false);
        }
        this.q0.a.uo(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((osf) this.m0.getValue()).a = true;
        vo();
        if (((zof) this.V.getValue()).s().a) {
            this.N0 = 1.0f;
            xuf xufVar = this.G0;
            if (xufVar != null) {
                xufVar.getTopBar().setSlotAlpha(1.0f);
            }
            xn50.a.c(this, npf.j.b);
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View rootView = view.getRootView();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        bqx0 a2 = iut0.e.a(rootView);
        if (a2 != null) {
            go(new ix2(a2.a.i(519), 28));
        }
        iut0.d.c(view, new u080() { // from class: xsna.vqf
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                int i2 = ClipsWrapperFragment.Q0;
                ClipsWrapperFragment.this.go(new ix2(bqx0Var.a.i(519), 28));
                return bqx0.b;
            }
        });
        Float valueOf = Float.valueOf(1.0f);
        if (((io2) po().c.getValue()) != null) {
            valueOf = null;
        }
        float floatValue = valueOf != null ? valueOf.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Iterator<T> it = oo().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(floatValue);
        }
        y1q0 y1q0Var = this.C0;
        if (!y1q0Var.d) {
            y1q0Var.b();
        }
        UploadBadgeComponent uploadBadgeComponent = (UploadBadgeComponent) m7m.d(this).a(fpf0.a(UploadBadgeComponent.class));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        y9q0 S5 = uploadBadgeComponent.S5(new t9q0(new bv1(6, this, ref$ObjectRef), new tc(12)), requireContext());
        this.E0 = S5;
        ((ViewGroup) view.findViewById(R.id.upload_badge_container)).addView(S5.b);
        this.F0 = S5.c.subscribe(new b00(new cv1(this, ref$ObjectRef, S5, 4), 14));
        this.D0 = new cm70(view, (fed) this.e0.getValue(), (hfq) this.b0.getValue());
        xuf xufVar = this.G0;
        this.x0 = xufVar != null ? new dcd(xufVar.h()) : null;
        ((soc) this.R.getValue()).a(this.p0);
        super.onViewCreated(view, bundle);
        xuf xufVar2 = this.G0;
        if (xufVar2 != null) {
            xufVar2.getTopBar().setInitialMode(com.vk.core.view.components.topbar.d.a);
            xufVar2.getTopBar().setTransitionHeaderColor(VkTopBar.m.b.a);
            if (((Boolean) this.z0.getValue()).booleanValue() && xufVar2.j() == null) {
                xufVar2.c().setVisibility(8);
            } else if (!((Boolean) this.Y.getValue()).booleanValue()) {
                xufVar2.c().setVisibility(0);
            } else if (xufVar2.c().getVisibility() != 0) {
                d3m.c(xufVar2.c(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public final List<View> oo() {
        List list;
        xuf xufVar = this.G0;
        ArrayList arrayList = null;
        if (xufVar != null) {
            VkTopBar topBar = xufVar.getTopBar();
            VkText a2 = xufVar.a();
            View background = xufVar.getBackground();
            View c2 = xufVar.c();
            if (c2.getVisibility() != 0) {
                c2 = null;
            }
            View b2 = xufVar.b();
            if (b2.getVisibility() != 0) {
                b2 = null;
            }
            ClipSeekBarController clipSeekBarController = this.x0;
            ClipSeekBarView view = clipSeekBarController != null ? clipSeekBarController.getView() : null;
            d6e s = xufVar.s();
            View view2 = s != null ? s.getView() : null;
            d6e j2 = xufVar.j();
            List I = rl3.I(new View[]{topBar, a2, background, c2, b2, view, view2, j2 != null ? j2.getView() : null});
            ClipFeedListFragment lo = lo();
            if (lo != null) {
                ule uleVar = lo.S;
                List m = e43.m(uleVar != null ? uleVar.a : null);
                if (m != null) {
                    list = m;
                    arrayList = j5g.u0(list, I);
                }
            }
            list = EmptyList.b;
            arrayList = j5g.u0(list, I);
        }
        return arrayList == null ? EmptyList.b : arrayList;
    }

    @Override // xsna.aes
    public final RectF p1() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsWrapperInputArguments po() {
        return (ClipsWrapperInputArguments) this.S.getValue();
    }

    public final boolean qo() {
        Fragment parentFragment = getParentFragment();
        androidx.fragment.app.d dVar = parentFragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment : null;
        return dVar != null && dVar.o;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void ro(uuf.c cVar) {
        if (!(cVar instanceof uuf.c.b)) {
            if (!(cVar instanceof uuf.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.l0) {
                go(new nj(8));
                return;
            }
            return;
        }
        if (this.l0) {
            go(new s9(cVar, 29));
        } else {
            uuf.c.b bVar = (uuf.c.b) cVar;
            ?? r0 = this.h0;
            go(new brf(((ClipsDecorationComponent) r0.getValue()).A8(bVar.f()), this, ((ClipsDecorationComponent) r0.getValue()).N3(bVar.f()), bVar, 0));
            this.l0 = true;
        }
        go(new lbe(cVar, 5));
    }

    @Override // xsna.qhh0
    public final boolean s() {
        ClipFeedListFragment lo = lo();
        if ((lo != null ? lo.Ka() : null) instanceof ClipFeedTab.TopVideo) {
            lo.s();
            return true;
        }
        xn50.a.c(this, new npf.a(fpf0.a(ClipFeedTab.TopVideo.class)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0038  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void so(uuf.f fVar) {
        ClipFeedTab clipFeedTab;
        ClipsWrapperFragment clipsWrapperFragment;
        ClipSeekBarView view;
        List<wrf> items;
        uuf.f fVar2 = this.L0;
        if (fVar2 != null && (items = fVar2.getItems()) != null) {
            uuf.f fVar3 = this.L0;
            wrf wrfVar = (wrf) j5g.b0(fVar3 != null ? fVar3.b() : -1, items);
            if (wrfVar != null) {
                clipFeedTab = wrfVar.c();
                wrf wrfVar2 = (wrf) j5g.b0(fVar.b(), fVar.getItems());
                ClipFeedTab c2 = wrfVar2 == null ? wrfVar2.c() : null;
                if (!epx.f(this.L0, fVar)) {
                    this.L0 = fVar;
                    this.J0 = fVar.a();
                    this.K0 = fVar.b();
                    if (clipFeedTab == null || !clipFeedTab.equals(c2)) {
                        if (c2 != null && c2.Db()) {
                            ((jwe) this.i0.getValue()).f().d();
                        }
                        if (c2 != null) {
                            wrf wrfVar3 = (wrf) j5g.b0(fVar.b(), fVar.getItems());
                            if (wrfVar3 != null) {
                                ClipSeekBarController clipSeekBarController = this.x0;
                                if (clipSeekBarController != null && (view = clipSeekBarController.getView()) != null) {
                                    d3m.e(view, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                                }
                                xuf xufVar = this.G0;
                                if (xufVar != null) {
                                    FragmentImpl a2 = wrfVar3.a();
                                    ClipFeedListFragment clipFeedListFragment = a2 instanceof ClipFeedListFragment ? (ClipFeedListFragment) a2 : null;
                                    if (clipFeedListFragment != null) {
                                        clipsWrapperFragment = this;
                                        clipFeedListFragment.F1 = new i(clipsWrapperFragment, ClipsWrapperFragment.class, "seekBarController", "getSeekBarController()Lcom/vk/clips/sdk/shared/api/ui/ClipSeekBarController;", 0);
                                        clipFeedListFragment.H1 = clipsWrapperFragment;
                                        clipFeedListFragment.G1 = (wp50) po().d.getValue();
                                    } else {
                                        clipsWrapperFragment = this;
                                    }
                                    a2.getLifecycle().addObserver(new tpf());
                                    FragmentManager childFragmentManager = getChildFragmentManager();
                                    childFragmentManager.getClass();
                                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                                    if (getChildFragmentManager().G(xufVar.r().getId()) != null) {
                                        aVar.i(R.anim.clips_wrapper_fragment_anim_fade_in, R.anim.clips_wrapper_fragment_anim_fade_out, 0, 0);
                                    }
                                    aVar.g(xufVar.r().getId(), a2, null);
                                    aVar.l();
                                    y1q0 y1q0Var = clipsWrapperFragment.C0;
                                    if (!y1q0Var.d) {
                                        y1q0Var.b();
                                    }
                                    ClipFeedTab c3 = wrfVar3.c();
                                    if (epx.f(clipsWrapperFragment.H0, c3)) {
                                        return;
                                    }
                                    clipsWrapperFragment.H0 = c3;
                                    go(new arf(this, 0));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        clipFeedTab = null;
        wrf wrfVar22 = (wrf) j5g.b0(fVar.b(), fVar.getItems());
        if (wrfVar22 == null) {
        }
        if (!epx.f(this.L0, fVar)) {
        }
    }

    public final void to(wuf wufVar, uuf.j jVar) {
        ife e2 = wufVar.e();
        int i2 = 8;
        if (e2 != null) {
            e2.setVisibility(8);
        }
        wufVar.getTopBar().setVisibility(0);
        VkTopBar topBar = wufVar.getTopBar();
        RedesignedClipsTopBar redesignedClipsTopBar = topBar instanceof RedesignedClipsTopBar ? (RedesignedClipsTopBar) topBar : null;
        if (redesignedClipsTopBar != null) {
            redesignedClipsTopBar.setOnTabClicked(new u6(11, wufVar, this));
            List<wrf> items = jVar.getItems().getItems();
            ArrayList arrayList = new ArrayList(c5g.u(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(((wrf) it.next()).b().a(requireContext()).toString());
            }
            redesignedClipsTopBar.m80setTabs56N2U88(arrayList);
            redesignedClipsTopBar.setCurrentTabIndex(jVar.getItems().b());
            wrf wrfVar = (wrf) j5g.A0(jVar.getItems().getItems());
            redesignedClipsTopBar.setShowSingleTab((wrfVar != null ? wrfVar.c() : null) instanceof ClipFeedTab.NewsMonotheme);
        }
        if (jVar.isVisible() != (wufVar.getTopBar().getVisibility() == 0)) {
            awt0.u(wufVar.getTopBar(), jVar.isVisible());
        }
        wufVar.getTopBar().setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(jVar.getTitle(), (jVar.m() ? new VkTopBar.Middle.Text.Title.a.C0870a(null) : null) != null ? new crf(this, jVar, wufVar, 0) : null, jVar.m() ? new VkTopBar.Middle.Text.Title.a.C0870a(tq.h(tlo0.Companion, R.string.vk_talkback_trailing_icon_dropdown_menu)) : null, null, null, 24), null, null, com.vk.core.compose.component.semantics.b.a(null, new x90(8), 3), 4));
        wufVar.a().setText(jVar.a());
        VkText a2 = wufVar.a();
        CharSequence a3 = jVar.a();
        if (a3 != null && !drm0.N(a3) && jVar.isVisible()) {
            i2 = 0;
        }
        a2.setVisibility(i2);
    }

    public final void uo(boolean z) {
        ClipFeedListFragment lo = lo();
        if (lo != null) {
            bpn0 bpn0Var = lo.j1;
            if (lo.Eo().G()) {
                ((m6e) lo.i1.getValue()).i.d(z);
            } else if (z) {
                ((q0f) bpn0Var.getValue()).attachToRecyclerView(lo.Bo());
            } else {
                ((q0f) bpn0Var.getValue()).attachToRecyclerView(null);
            }
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        TypedValue typedValue = krv0.a;
        Integer d2 = krv0.d();
        return d2 != null ? d2.intValue() : R.style.ClipFeedDialogStyle;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void vo() {
        if (isAdded()) {
            boolean z = true;
            boolean z2 = po().e() && lbs.q(this) && !((Boolean) po().m.getValue()).booleanValue();
            Fragment parentFragment = getParentFragment();
            FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
            if (!(fragmentImpl != null ? lbs.l(fragmentImpl) : false) && po().e()) {
                z = false;
            }
            xn50.a.c(this, new opf(z2, z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bf  */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Pair b2;
        boolean z;
        List list;
        ClipFeedTab.SingleClipWithDecoration singleClipWithDecoration;
        a7j a7jVar;
        Pair pair;
        ClipFeedOpenAction a2;
        zof zofVar = (zof) this.V.getValue();
        boolean booleanValue = ((Boolean) this.Y.getValue()).booleanValue();
        xne Y = io().Y();
        urf urfVar = (urf) this.U.getValue();
        ClipsInterestsComponent clipsInterestsComponent = (ClipsInterestsComponent) this.c0.getValue();
        h2f h2fVar = (h2f) this.T.getValue();
        jwe jweVar = (jwe) this.i0.getValue();
        nwy nwyVar = io().Z;
        qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[38];
        fyu fyuVar = (fyu) nwyVar.c();
        cuf cufVar = new cuf(fyuVar, zofVar);
        ClipsWrapperInputArguments po = po();
        boolean z2 = po().e() && lbs.q(this) && !((Boolean) po().m.getValue()).booleanValue();
        boolean qo = qo();
        Fragment parentFragment = getParentFragment();
        FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
        boolean l = fragmentImpl != null ? lbs.l(fragmentImpl) : false;
        boolean z3 = (BuildInfo.q() || po.e() || !h2fVar.b || qo) ? false : true;
        haf I = zofVar.I();
        boolean w = zofVar.w();
        if (!I.a) {
            b2 = new Pair(po.c(), Integer.valueOf(po.b()));
        } else if (w) {
            ArrayList a3 = fyuVar.a((ClipFeedTab.WithPayload.Payload) po.k.getValue());
            b2 = !a3.isEmpty() ? po.e() ? cuf.b(a3, po) : cufVar.c(a3, po) : new Pair(po.c(), Integer.valueOf(po.b()));
        } else {
            ArrayList a4 = fyuVar.a((ClipFeedTab.WithPayload.Payload) po.k.getValue());
            b2 = po.e() ? cuf.b(a4, po) : cufVar.c(a4, po);
        }
        List list2 = (List) b2.d();
        int intValue = ((Number) b2.g()).intValue();
        if (I.a && zofVar.w()) {
            if (list2.size() > 1 && !fyuVar.d.get()) {
                z = true;
                boolean e2 = po.e();
                ?? r15 = po.l;
                jsf jsfVar = new jsf(zofVar, booleanValue, Y, e2, (ClipsScreenPerformanceReporter) r15.getValue(), new xrf(this.w0, h2fVar.a, (SearchStatsLoggingInfo) po.h.getValue(), new auf(zofVar.I().a), new zjq(), po.d()), jweVar, list2.size(), zofVar.s());
                vuf vufVar = new vuf();
                duf z4 = urfVar.z(intValue, po.d(), list2);
                list = z4.a;
                ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.b0(z4.b, list != null ? EmptyList.b : list);
                singleClipWithDecoration = !(clipFeedTab instanceof ClipFeedTab.SingleClipWithDecoration) ? (ClipFeedTab.SingleClipWithDecoration) clipFeedTab : null;
                NoDecoration noDecoration = NoDecoration.b;
                if (singleClipWithDecoration != null) {
                    a7jVar = null;
                    pair = new Pair(null, noDecoration);
                } else {
                    a7jVar = null;
                    ClipsFeedDecorationPayload clipsFeedDecorationPayload = singleClipWithDecoration.f;
                    if (clipsFeedDecorationPayload == null) {
                        clipsFeedDecorationPayload = noDecoration;
                    }
                    pair = new Pair(singleClipWithDecoration.e, clipsFeedDecorationPayload);
                }
                if (list == null) {
                    list = EmptyList.b;
                }
                int i2 = z4.b;
                kwc kwcVar = (kwc) po.e.getValue();
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a5 = po.a();
                aVar.getClass();
                a2 = ClipsWrapperInputArguments.a.a(a5);
                if (a2 != null) {
                    a7jVar = new a7j(a2);
                }
                isf b3 = jsfVar.b(new isf(0), new ttf.f(list, i2, kwcVar, a7jVar, (ClipsScreenPerformanceReporter) r15.getValue(), epx.f(pair.j(), noDecoration), z2, !epx.f(pair.j(), noDecoration) && z3, (l && po.e()) ? false : true, ((Boolean) po.n.getValue()).booleanValue(), (ClipsDecorationKey) pair.i(), (ClipsFeedDecorationPayload) pair.j(), z));
                itf itfVar = new itf(b3, jsfVar, vufVar);
                urfVar.f(po.d(), b3.f.b);
                iqf iqfVar = new iqf(po.d(), urfVar, clipsInterestsComponent, itfVar, zofVar.s(), fyuVar, new ptf(zofVar, jweVar, po.e()), new npf.g(po.e(), (ClipFeedTab.WithPayload.Payload) po.k.getValue(), z));
                go(new mu1(9, this, new srf(b3.b, b3.f, b3.c, vuf.a(b3), b3.j, (uuf.c) b3.l)));
                return iqfVar;
            }
        }
        z = false;
        boolean e22 = po.e();
        ?? r152 = po.l;
        jsf jsfVar2 = new jsf(zofVar, booleanValue, Y, e22, (ClipsScreenPerformanceReporter) r152.getValue(), new xrf(this.w0, h2fVar.a, (SearchStatsLoggingInfo) po.h.getValue(), new auf(zofVar.I().a), new zjq(), po.d()), jweVar, list2.size(), zofVar.s());
        vuf vufVar2 = new vuf();
        duf z42 = urfVar.z(intValue, po.d(), list2);
        list = z42.a;
        ClipFeedTab clipFeedTab2 = (ClipFeedTab) j5g.b0(z42.b, list != null ? EmptyList.b : list);
        if (!(clipFeedTab2 instanceof ClipFeedTab.SingleClipWithDecoration)) {
        }
        NoDecoration noDecoration2 = NoDecoration.b;
        if (singleClipWithDecoration != null) {
        }
        if (list == null) {
        }
        int i22 = z42.b;
        kwc kwcVar2 = (kwc) po.e.getValue();
        ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
        Bundle a52 = po.a();
        aVar2.getClass();
        a2 = ClipsWrapperInputArguments.a.a(a52);
        if (a2 != null) {
        }
        if (l) {
        }
        isf b32 = jsfVar2.b(new isf(0), new ttf.f(list, i22, kwcVar2, a7jVar, (ClipsScreenPerformanceReporter) r152.getValue(), epx.f(pair.j(), noDecoration2), z2, !epx.f(pair.j(), noDecoration2) && z3, (l && po.e()) ? false : true, ((Boolean) po.n.getValue()).booleanValue(), (ClipsDecorationKey) pair.i(), (ClipsFeedDecorationPayload) pair.j(), z));
        itf itfVar2 = new itf(b32, jsfVar2, vufVar2);
        urfVar.f(po.d(), b32.f.b);
        iqf iqfVar2 = new iqf(po.d(), urfVar, clipsInterestsComponent, itfVar2, zofVar.s(), fyuVar, new ptf(zofVar, jweVar, po.e()), new npf.g(po.e(), (ClipFeedTab.WithPayload.Payload) po.k.getValue(), z));
        go(new mu1(9, this, new srf(b32.b, b32.f, b32.c, vuf.a(b32), b32.j, (uuf.c) b32.l)));
        return iqfVar2;
    }
}
