package com.vk.voip.ui.calls.presentation.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.log.L;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.voip.api.di.VoipCallComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import com.vk.voip.ui.calls.presentation.base.view.components.VoipBanner;
import com.vk.voip.ui.di.VoipAnalyticsInternalComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.y;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a1w;
import xsna.a4v;
import xsna.abg0;
import xsna.aig;
import xsna.aiw0;
import xsna.ao50;
import xsna.asu0;
import xsna.b25;
import xsna.b8g;
import xsna.biw0;
import xsna.bjm0;
import xsna.bjw0;
import xsna.d02;
import xsna.d7l0;
import xsna.dhr0;
import xsna.dis;
import xsna.dpo0;
import xsna.e1s0;
import xsna.ef90;
import xsna.fnj;
import xsna.fpf0;
import xsna.fuh0;
import xsna.g1s0;
import xsna.g2v;
import xsna.g6m0;
import xsna.g86;
import xsna.gko;
import xsna.gm50;
import xsna.h8n0;
import xsna.hcs0;
import xsna.hg1;
import xsna.i4;
import xsna.iah0;
import xsna.izs;
import xsna.j8n0;
import xsna.jds0;
import xsna.k59;
import xsna.k990;
import xsna.k9u0;
import xsna.km50;
import xsna.kow0;
import xsna.ksq0;
import xsna.lb6;
import xsna.lec;
import xsna.lyl0;
import xsna.m7m;
import xsna.mf90;
import xsna.mk50;
import xsna.msy;
import xsna.mz80;
import xsna.onm0;
import xsna.ots;
import xsna.oz50;
import xsna.ozk0;
import xsna.pnr0;
import xsna.puq0;
import xsna.q1w;
import xsna.rhw0;
import xsna.rw0;
import xsna.s3q0;
import xsna.shw0;
import xsna.tfu0;
import xsna.thw0;
import xsna.tlo0;
import xsna.tq;
import xsna.u0o0;
import xsna.uhw0;
import xsna.vhw0;
import xsna.vk50;
import xsna.whw0;
import xsna.wiw0;
import xsna.wmk;
import xsna.xb20;
import xsna.xga;
import xsna.xn50;
import xsna.ydn0;
import xsna.yhg;
import xsna.yxu;
import xsna.z4t0;
import xsna.zhw0;

/* compiled from: VoipCallServiceFragment.kt */
/* loaded from: classes7.dex */
public final class VoipCallServiceFragment extends MviImplFragment<zhw0, bjw0, rhw0> {
    public static final /* synthetic */ int Y = 0;
    public final Object Q;
    public final thw0 R;
    public final thw0 S;
    public final mf90 T;
    public tfu0 U;
    public final Object V;
    public yhg W;
    public final io.reactivex.rxjava3.disposables.b X;

    /* compiled from: VoipCallServiceFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(VoipCallServiceFragment.class, null, null);
        }
    }

    /* compiled from: VoipCallServiceFragment.kt */
    public final class b implements dis.a, kow0.a, uhw0.a, wmk.b {
        public b() {
        }

        @Override // xsna.kow0.a
        public final void a(UserId userId) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.a(userId));
        }

        @Override // xsna.dis.a
        public final void b(Peer.Member member) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.w(member));
        }

        @Override // xsna.kow0.a
        public final void c(UserId userId) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.n(userId));
        }

        @Override // xsna.kow0.a
        public final void d(UserId userId) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.p(userId));
        }

        @Override // xsna.uhw0.a
        public final void e(vhw0 vhw0Var) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.c(vhw0Var));
        }

        @Override // xsna.dis.a
        public final void f(Peer.Member member) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.t(member));
        }

        @Override // xsna.dis.a
        public final void g(Peer.Member member) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.m(member));
        }

        @Override // xsna.uhw0.a
        public final void h(vhw0 vhw0Var) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.b(vhw0Var));
        }

        @Override // xsna.dis.a
        public final void i(Peer.Member member) {
            xn50.a.c(VoipCallServiceFragment.this, new rhw0.k(member));
        }

        @Override // xsna.wmk.b
        public final void o() {
            rhw0.f fVar = rhw0.f.b;
            VoipCallServiceFragment voipCallServiceFragment = VoipCallServiceFragment.this;
            voipCallServiceFragment.getClass();
            xn50.a.c(voipCallServiceFragment, fVar);
        }

        @Override // xsna.wmk.b
        public final void p() {
            rhw0.z zVar = new rhw0.z(shw0.a.a);
            VoipCallServiceFragment voipCallServiceFragment = VoipCallServiceFragment.this;
            voipCallServiceFragment.getClass();
            xn50.a.c(voipCallServiceFragment, zVar);
        }
    }

    /* compiled from: VoipCallServiceFragment.kt */
    public static final class c {
        public final ViewFlipper a;
        public final a b;
        public final VkPlaceholder c;

        /* compiled from: VoipCallServiceFragment.kt */
        public static final class a {
            public final VoipBanner a;
            public final VkPlaceholder b;

            public a(VoipBanner voipBanner, VkPlaceholder vkPlaceholder) {
                this.a = voipBanner;
                this.b = vkPlaceholder;
            }
        }

        /* compiled from: VoipCallServiceFragment.kt */
        public static final class b {
        }

        public c(b bVar, ViewFlipper viewFlipper, a aVar, VkPlaceholder vkPlaceholder) {
            this.a = viewFlipper;
            this.b = aVar;
            this.c = vkPlaceholder;
        }
    }

    /* compiled from: VoipCallServiceFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: VoipCallServiceFragment.kt */
    public static final class e implements k59<aig.c> {
        public e() {
        }

        @Override // xsna.k59
        public final void a(aig.c cVar) {
            rhw0.o oVar = rhw0.o.b;
            VoipCallServiceFragment voipCallServiceFragment = VoipCallServiceFragment.this;
            voipCallServiceFragment.getClass();
            xn50.a.c(voipCallServiceFragment, oVar);
        }
    }

    public VoipCallServiceFragment() {
        jds0 jds0Var = new jds0(this, 9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, jds0Var);
        b bVar = new b();
        this.R = new thw0(bVar);
        this.S = new thw0(bVar);
        this.T = new mf90(new e());
        this.V = msy.a(lazyThreadSafetyMode, new e1s0(this, 10));
        this.X = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.voip_calls_vkapp_service_fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        bjw0 bjw0Var = (bjw0) ao50Var;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.voip_topbar);
        VkSearchView vkSearchView = (VkSearchView) view.findViewById(R.id.voip_search_view);
        ViewFlipper viewFlipper = (ViewFlipper) view.findViewById(R.id.voip_flipper);
        AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        alphaAnimation.setDuration(200L);
        viewFlipper.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        alphaAnimation2.setDuration(200L);
        viewFlipper.setOutAnimation(alphaAnimation2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_service_content);
        recyclerView.setAdapter(this.R);
        requireContext();
        recyclerView.setLayoutManager(new StickyHeadersLinearLayoutManager(this));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.voip_service_search);
        recyclerView2.setAdapter(this.S);
        requireContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        int i = 4;
        this.U = new tfu0(recyclerView2, i);
        recyclerView2.addOnScrollListener(new ef90(this.T));
        int i2 = 20;
        recyclerView2.addOnScrollListener(new a4v(requireContext(), new lyl0(this, i2), true));
        VoipBanner voipBanner = (VoipBanner) view.findViewById(R.id.voip_banner);
        voipBanner.setImportClickListener(new pnr0(this, 8));
        voipBanner.setCloseClickListener(new h8n0(this, 18));
        c cVar = new c(new c.b(), viewFlipper, new c.a(voipBanner, (VkPlaceholder) view.findViewById(R.id.empty_placeholder)), (VkPlaceholder) view.findViewById(R.id.voip_service_error));
        vkSearchView.X4(false);
        vkSearchView.setVoiceInputEnabled(false);
        int i3 = 27;
        hg1.a(d02.y(vkSearchView, 300L, 2).U(new xb20(new d7l0(i2), i3)).subscribe(new u0o0(new z4t0(this, 11), 14)), this);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        vkTopBar.setBack(!fnj.d(requireContext) ? new VkTopBar.b(new ksq0(this, 15), tq.h(tlo0.Companion, R.string.back), null, null, com.vk.core.compose.component.semantics.b.a(null, new hcs0(i), 3), 12) : null);
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.voip_history_root_tab_calls), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new fuh0(12), 3), 14), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        gko.b bVar = gko.Companion;
        abg0 abg0Var = dhr0.t;
        int i4 = 6;
        vkTopBar.setAfter(new VkTopBar.a.d(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_horizontal_28), new tlo0.f(R.string.voip_accessibility_more_options), new i4(19, this, vkTopBar), null, new b8g(abg0Var.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new puq0(10), 3), 8), new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_phone_add_outline_28), new tlo0.f(R.string.accessibility_actions), new lb6(28, this, vkTopBar), null, new b8g(abg0Var.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new k990(29), 3), 8), new VkTopBar.a.b.C0877b(new gko(R.drawable.vk_icon_clock_outline_28), null, new j8n0(this, 26), null, new b8g(abg0Var.c(R.attr.vk_ui_icon_accent_themed)), com.vk.core.compose.component.semantics.b.a(null, new g1s0(i4), 3), 8)));
        gm50.a.b(this, bjw0Var.a, new ozk0(i4, cVar, this));
        gm50.a.b(this, bjw0Var.b, new g86(i3, cVar, this));
        gm50.a.b(this, bjw0Var.c, new mz80(23, cVar, this));
        gm50.a.b(this, bjw0Var.e, new ydn0(4, cVar, this));
        gm50.a.b(this, bjw0Var.d, new aiw0(cVar, 0));
        gm50.a.b(this, bjw0Var.f, new g6m0(8, cVar, this));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((zhw0) vk50Var).k.a(new whw0(this, 1), this);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.W = new yhg(requireContext(), In(), g2v.c(), ((VoipCallComponent) m7m.d(this).a(fpf0.a(VoipCallComponent.class))).a(), ((VoipStereoRouterComponent) m7m.d(this).a(fpf0.a(VoipStereoRouterComponent.class))).a(), ((MaxUtilityComponent) m7m.d(this).mo408a(fpf0.a(MaxUtilityComponent.class))).j7());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.X.e();
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getFeature().l.a(new bjm0(this, 21), getViewLifecycleOwner());
        g2v.c().getClass();
        y c2 = k9u0.a.c(view.getContext());
        asu0 asu0Var = asu0.a;
        this.X.b(c2.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new onm0(new biw0(this, 0), 13), new dpo0(new d(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 10)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        return new zhw0(a1wVar, new rw0(new yxu(new xga()), new wiw0((b25) this.Q.getValue()), new lec(new ots())), ((VoipAnalyticsInternalComponent) m7m.d(this).mo408a(fpf0.a(VoipAnalyticsInternalComponent.class))).Df());
    }
}
