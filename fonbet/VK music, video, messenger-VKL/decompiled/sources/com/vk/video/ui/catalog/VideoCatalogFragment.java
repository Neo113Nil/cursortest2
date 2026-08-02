package com.vk.video.ui.catalog;

import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.ui.mvp.configuration.reload.CatalogReloadTrigger;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.search.suggester.core.SearchServiceWithSuggestCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.video.VideoCatalogId;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.api.VideoUrlInfo;
import com.vk.libvideo.autoplay.e;
import com.vk.splashscreen.api.di.SplashScreenComponent;
import com.vk.toggle.features.VideoFeatures;
import java.io.Serializable;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.builders.SetBuilder;
import xsna.acp0;
import xsna.aes;
import xsna.ajd0;
import xsna.alj;
import xsna.avj0;
import xsna.b290;
import xsna.be80;
import xsna.c9m0;
import xsna.ccr0;
import xsna.cqr0;
import xsna.e1s0;
import xsna.f0s0;
import xsna.fjs0;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g8n0;
import xsna.i86;
import xsna.ih80;
import xsna.iri0;
import xsna.j8n0;
import xsna.jaa0;
import xsna.ksq0;
import xsna.las0;
import xsna.lbs;
import xsna.mot0;
import xsna.msy;
import xsna.mzp0;
import xsna.nnb0;
import xsna.nrq0;
import xsna.o5a;
import xsna.or20;
import xsna.pnr0;
import xsna.prq0;
import xsna.qhh0;
import xsna.qo5;
import xsna.r230;
import xsna.r6i0;
import xsna.rds;
import xsna.rj01;
import xsna.rzp0;
import xsna.s200;
import xsna.sba;
import xsna.sxq0;
import xsna.t9t0;
import xsna.u110;
import xsna.u5e0;
import xsna.uds;
import xsna.uho0;
import xsna.v6j;
import xsna.vpn0;
import xsna.vr2;
import xsna.vyh0;
import xsna.wmd0;
import xsna.ww50;
import xsna.wzh0;
import xsna.wzv0;
import xsna.x8c;
import xsna.xds;
import xsna.xkk0;
import xsna.xzv0;
import xsna.y3l0;
import xsna.yw90;
import xsna.yys0;
import xsna.yzv0;
import xsna.zrd0;

/* compiled from: VideoCatalogFragment.kt */
/* loaded from: classes7.dex */
public final class VideoCatalogFragment extends BaseCatalogFragment implements rds, aes, uds, xds, qhh0, r230 {
    public static final /* synthetic */ int l0 = 0;
    public yw90 Q;
    public final fjs0 R;
    public final j8n0 S;
    public wzv0 T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a0;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;
    public final Object j0;
    public final Object k0;

    /* compiled from: VideoCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(VideoCatalogFragment.class, null, null);
        }

        public final void B(boolean z) {
            this.j.putBoolean("enable_sound", z);
        }

        public final void C() {
            this.j.putBoolean("is_system", true);
        }

        public final void D(String str) {
            this.j.putString("embedded_video_id", str);
        }

        public final void E(String str) {
            if (str != null) {
                this.j.putString("source", str);
            }
        }

        public final void F(boolean z) {
            this.j.putBoolean("catalog_show_navigation_button_key", z);
        }

        public final void G(String str) {
            this.j.putString("catalog_initial_section_id", str);
        }

        public final void H(UserId userId) {
            this.j.putParcelable("owner_id", userId);
        }

        public final void I(String str) {
            if (str != null) {
                this.j.putString("ref_screen", str);
            }
        }

        public final void J(String str) {
            if (str != null) {
                this.j.putString("ref_source", str);
            }
        }

        public final void K(String str) {
            if (str != null) {
                this.j.putString("ref", str);
            }
        }

        public final void L(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            this.j.putParcelable("search_stats_logging_info", searchStatsLoggingInfo);
        }

        public final void M(String str) {
            this.j.putString("title", str);
        }

        public final void N(String str) {
            this.j.putString("track_code", str);
        }
    }

    /* compiled from: VideoCatalogFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoCatalogId.values().length];
            try {
                iArr[VideoCatalogId.SUBSCRIPTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoCatalogId.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoCatalogFragment() {
        super(VideoCatalogRootVh.class, false);
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.VIDEO_CATALOG, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.VIDEO_CATALOG).j();
        On().init();
        this.R = new fjs0();
        this.S = new j8n0(this, 9);
        y3l0 y3l0Var = new y3l0(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.U = msy.a(lazyThreadSafetyMode, y3l0Var);
        this.V = msy.a(lazyThreadSafetyMode, new c9m0(this, 11));
        this.W = msy.a(lazyThreadSafetyMode, new u110(this, 27));
        this.X = msy.a(lazyThreadSafetyMode, new b290(this, 29));
        this.Y = msy.a(lazyThreadSafetyMode, new e1s0(this, 2));
        this.Z = msy.a(lazyThreadSafetyMode, new pnr0(this, 3));
        this.a0 = msy.a(lazyThreadSafetyMode, new nrq0(this, 3));
        this.b0 = msy.a(lazyThreadSafetyMode, new iri0(this, 17));
        this.c0 = msy.a(lazyThreadSafetyMode, new jaa0(this, 28));
        this.d0 = msy.a(lazyThreadSafetyMode, new cqr0(this, 2));
        this.e0 = msy.a(lazyThreadSafetyMode, new uho0(this, 6));
        this.f0 = msy.a(lazyThreadSafetyMode, new avj0(this, 17));
        this.g0 = msy.a(lazyThreadSafetyMode, new ksq0(this, 2));
        this.h0 = msy.a(lazyThreadSafetyMode, new sxq0(this, 1));
        this.i0 = msy.a(lazyThreadSafetyMode, new ajd0(this, 18));
        this.j0 = msy.a(lazyThreadSafetyMode, new vpn0(this, 10));
        this.k0 = msy.a(lazyThreadSafetyMode, new g8n0(this, 10));
    }

    @Override // xsna.aes
    public final void A0() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        VideoCatalogRootVh videoCatalogRootVh = catalogRootViewHolder instanceof VideoCatalogRootVh ? (VideoCatalogRootVh) catalogRootViewHolder : null;
        if (videoCatalogRootVh == null || videoCatalogRootVh.p0()) {
            return;
        }
        videoCatalogRootVh.v0.A0();
    }

    @Override // xsna.r230
    public final boolean Ya() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (!(catalogRootViewHolder instanceof VideoCatalogRootVh)) {
            return false;
        }
        VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) catalogRootViewHolder;
        if (!(videoCatalogRootVh.y0.r instanceof vyh0)) {
            return false;
        }
        wzh0 wzh0Var = videoCatalogRootVh.f0;
        wzh0Var.c().s();
        ((SearchServiceWithSuggestCatalogRootVh) wzh0Var.b).i8(alj.a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ((u5e0) this.b0.getValue()).getClass();
        return super.a0();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void ao(View view) {
        super.ao(view);
        yw90 yw90Var = this.Q;
        if (yw90Var != null) {
            yw90Var.d3(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean z;
        SetBuilder setBuilder;
        Bundle arguments;
        Bundle arguments2;
        Bundle arguments3;
        UserId userId;
        ww50 v;
        FragmentActivity activity = getActivity();
        boolean z2 = false;
        if (!((activity == null || (v = s200.v(activity)) == null) ? true : v.k(this))) {
            Bundle arguments4 = getArguments();
            if (!(arguments4 != null ? arguments4.getBoolean("catalog_show_navigation_button_key") : false)) {
                z = false;
                o5a o5aVar = new o5a(this);
                FragmentActivity kn = kn();
                Bundle arguments5 = getArguments();
                setBuilder = new SetBuilder();
                arguments = getArguments();
                if (arguments != null && arguments.getBoolean("reload_on_login")) {
                    setBuilder.add(CatalogReloadTrigger.LOGIN);
                }
                arguments2 = getArguments();
                if (arguments2 != null && arguments2.getBoolean("reload_on_donut_subscription")) {
                    setBuilder.add(CatalogReloadTrigger.DONUT_SUBSCRIPTION);
                }
                rj01 rj01Var = new rj01(setBuilder.d());
                i86 i86Var = new i86(1, this, lbs.class, "isNeedShowProfileInHeader", "isNeedShowProfileInHeader(Lcom/vk/core/fragments/FragmentImpl;)Z", 1);
                acp0 acp0Var = !lbs.q(this) ? new acp0(this, 4) : null;
                yys0 yys0Var = (yys0) this.W.getValue();
                t9t0 t9t0Var = (t9t0) this.X.getValue();
                las0 las0Var = (las0) this.Z.getValue();
                arguments3 = getArguments();
                if (arguments3 != null && (userId = (UserId) arguments3.getParcelable("owner_id")) != null) {
                    z2 = fkq0.b(userId);
                }
                r6i0 r6i0Var = z2 ? new r6i0(this, 16) : null;
                mzp0 mzp0Var = this.J;
                yw90 On = On();
                be80 be80Var = (be80) this.c0.getValue();
                ih80 ih80Var = (ih80) this.d0.getValue();
                f0s0 f0s0Var = (f0s0) this.f0.getValue();
                nnb0 nnb0Var = (nnb0) this.g0.getValue();
                x8c x8cVar = new x8c(this);
                yw90 yw90Var = this.Q;
                ?? r5 = this.k0;
                xkk0 stateManager = ((SplashScreenComponent) r5.getValue()).getStateManager();
                ((SplashScreenComponent) r5.getValue()).de().getClass();
                return new VideoCatalogRootVh(arguments5, kn, o5aVar, z, rj01Var, yys0Var, t9t0Var, las0Var, i86Var, acp0Var, new prq0(this, 6), r6i0Var, mzp0Var, On, new wmd0(this, 17), be80Var, ih80Var, f0s0Var, nnb0Var, x8cVar, yw90Var, this.S, stateManager, true, 1);
            }
        }
        z = true;
        o5a o5aVar2 = new o5a(this);
        FragmentActivity kn2 = kn();
        Bundle arguments52 = getArguments();
        setBuilder = new SetBuilder();
        arguments = getArguments();
        if (arguments != null) {
            setBuilder.add(CatalogReloadTrigger.LOGIN);
        }
        arguments2 = getArguments();
        if (arguments2 != null) {
            setBuilder.add(CatalogReloadTrigger.DONUT_SUBSCRIPTION);
        }
        rj01 rj01Var2 = new rj01(setBuilder.d());
        i86 i86Var2 = new i86(1, this, lbs.class, "isNeedShowProfileInHeader", "isNeedShowProfileInHeader(Lcom/vk/core/fragments/FragmentImpl;)Z", 1);
        if (!lbs.q(this)) {
        }
        yys0 yys0Var2 = (yys0) this.W.getValue();
        t9t0 t9t0Var2 = (t9t0) this.X.getValue();
        las0 las0Var2 = (las0) this.Z.getValue();
        arguments3 = getArguments();
        if (arguments3 != null) {
            z2 = fkq0.b(userId);
        }
        r6i0 r6i0Var2 = z2 ? new r6i0(this, 16) : null;
        mzp0 mzp0Var2 = this.J;
        yw90 On2 = On();
        be80 be80Var2 = (be80) this.c0.getValue();
        ih80 ih80Var2 = (ih80) this.d0.getValue();
        f0s0 f0s0Var2 = (f0s0) this.f0.getValue();
        nnb0 nnb0Var2 = (nnb0) this.g0.getValue();
        x8c x8cVar2 = new x8c(this);
        yw90 yw90Var2 = this.Q;
        ?? r52 = this.k0;
        xkk0 stateManager2 = ((SplashScreenComponent) r52.getValue()).getStateManager();
        ((SplashScreenComponent) r52.getValue()).de().getClass();
        return new VideoCatalogRootVh(arguments52, kn2, o5aVar2, z, rj01Var2, yys0Var2, t9t0Var2, las0Var2, i86Var2, acp0Var, new prq0(this, 6), r6i0Var2, mzp0Var2, On2, new wmd0(this, 17), be80Var2, ih80Var2, f0s0Var2, nnb0Var2, x8cVar2, yw90Var2, this.S, stateManager2, true, 1);
    }

    public final void go() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        VideoCatalogRootVh videoCatalogRootVh = catalogRootViewHolder instanceof VideoCatalogRootVh ? (VideoCatalogRootVh) catalogRootViewHolder : null;
        if (videoCatalogRootVh != null) {
            videoCatalogRootVh.P.d();
        }
    }

    @Override // xsna.aes
    public final void h7(v6j v6jVar) {
        ccr0 ccr0Var;
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        VideoCatalogRootVh videoCatalogRootVh = catalogRootViewHolder instanceof VideoCatalogRootVh ? (VideoCatalogRootVh) catalogRootViewHolder : null;
        if (videoCatalogRootVh == null || videoCatalogRootVh.p0() || (ccr0Var = videoCatalogRootVh.l0.s) == null) {
            return;
        }
        ccr0Var.r((String) v6jVar.b);
    }

    public final void ho(String str) {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        VideoCatalogRootVh videoCatalogRootVh = catalogRootViewHolder instanceof VideoCatalogRootVh ? (VideoCatalogRootVh) catalogRootViewHolder : null;
        if (videoCatalogRootVh != null) {
            videoCatalogRootVh.A(str);
        }
    }

    @Override // xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // xsna.woo0
    public final int o7() {
        return 0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        Bundle bundle2;
        Parcelable parcelable;
        String str;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("key_url")) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SWITCH_CATALOG_TO_SPORT;
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures) && (extras = kn().getIntent().getExtras()) != null && (bundle2 = extras.getBundle("args")) != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle2.getParcelable("url_info", VideoUrlInfo.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = bundle2.getParcelable("url_info");
                    if (!(parcelable3 instanceof VideoUrlInfo)) {
                        parcelable3 = null;
                    }
                    parcelable = (VideoUrlInfo) parcelable3;
                }
                VideoUrlInfo videoUrlInfo = (VideoUrlInfo) parcelable;
                if (videoUrlInfo != null && (str = (String) videoUrlInfo.c.getValue()) != null) {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        arguments2.putString("key_url", str);
                    }
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null) {
                        arguments3.putString("video_catalog_id", null);
                    }
                }
            }
        }
        Bundle arguments4 = getArguments();
        Serializable serializable = arguments4 != null ? arguments4.getSerializable("video_catalog_id") : null;
        VideoCatalogId videoCatalogId = serializable instanceof VideoCatalogId ? (VideoCatalogId) serializable : null;
        int i = videoCatalogId == null ? -1 : b.$EnumSwitchMapping$0[videoCatalogId.ordinal()];
        PerformanceScoreProduct performanceScoreProduct = i != 1 ? i != 2 ? null : PerformanceScoreProduct.VIDEO_CATALOG : PerformanceScoreProduct.VIDEO_SUBSCRIPTIONS;
        yw90 yw90Var = performanceScoreProduct != null ? (yw90) zrd0.a(performanceScoreProduct).j() : null;
        this.Q = yw90Var;
        if (yw90Var != null) {
            yw90Var.init();
        }
        super.onCreate(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        e eVar = e.a;
        e.f(true);
        wzv0 wzv0Var = this.T;
        if (wzv0Var != null) {
            wzv0Var.onDestroy();
        }
        ((qo5) this.a0.getValue()).getClass();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((u5e0) this.b0.getValue()).getClass();
        super.onDestroyView();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        if (!((Boolean) this.Y.getValue()).booleanValue()) {
            zrd0.h.set(null);
        }
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.R.a();
        if (!((Boolean) this.Y.getValue()).booleanValue()) {
            zrd0 zrd0Var = zrd0.a;
            zrd0.h.set(this.Q);
        }
        getParentFragmentManager().l0("SHOW_SUBSCRIPTION_SELECTOR", this, new or20(this, 16));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        bundle.putByteArray("catalog_view_holder_state", catalogRootViewHolder != null ? catalogRootViewHolder.b0() : null);
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        UserId userId;
        super.onViewCreated(view, bundle);
        ((u5e0) this.b0.getValue()).getClass();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("open_for_add")) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (userId = (UserId) arguments2.getParcelable("owner_id")) != null) {
                mot0.b(mot0.a.a, kn(), userId, 0, null, 28);
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                arguments3.remove("open_for_add");
            }
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string = arguments4.getString("catalog_initial_section_id")) != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                arguments5.remove("catalog_initial_section_id");
            }
            view.post(new vr2(8, this, string));
        }
        fxc0.B().s().g(false);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_FREE_SUBSCRIPTION;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        wzv0 wzv0Var = null;
        if (bVar.a(videoFeatures) && BuildInfo.s()) {
            ?? r8 = this.h0;
            ((VideoAdFreeSubscriptionComponent) r8.getValue()).E2().d(null);
            ((VideoAdFreeSubscriptionComponent) r8.getValue()).E2().a(VideoAdFreeTrapEventTrigger.VIDEO_TAB_START, requireContext());
        }
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_OPEN_VK_VIDEO_POPUP;
        videoFeatures2.getClass();
        wzv0 a2 = (!bVar.a(videoFeatures2) || BuildInfo.q()) ? null : ((xzv0) this.e0.getValue()).a(requireView());
        if (a2 != null) {
            ((yzv0) a2).c();
            wzv0Var = a2;
        }
        this.T = wzv0Var;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        CatalogRootViewHolder catalogRootViewHolder;
        super.onViewStateRestored(bundle);
        byte[] byteArray = bundle != null ? bundle.getByteArray("catalog_view_holder_state") : null;
        if (byteArray == null || (catalogRootViewHolder = this.P) == null) {
            return;
        }
        catalogRootViewHolder.Z(byteArray);
    }

    @Override // xsna.aes
    public final RectF p1() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        VideoCatalogRootVh videoCatalogRootVh = catalogRootViewHolder instanceof VideoCatalogRootVh ? (VideoCatalogRootVh) catalogRootViewHolder : null;
        if (videoCatalogRootVh == null || videoCatalogRootVh.p0()) {
            return null;
        }
        return videoCatalogRootVh.v0.p1();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (!(catalogRootViewHolder instanceof VideoCatalogRootVh)) {
            return false;
        }
        VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) catalogRootViewHolder;
        if (videoCatalogRootVh.y0.r instanceof vyh0) {
            return false;
        }
        DisableableViewPager disableableViewPager = videoCatalogRootVh.a0.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        PagerAdapter adapter = disableableViewPager.getAdapter();
        sba sbaVar = adapter instanceof sba ? (sba) adapter : null;
        if (sbaVar == null) {
            return true;
        }
        sbaVar.s();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setArguments(Bundle bundle) {
        CatalogRootViewHolder catalogRootViewHolder;
        Bundle bundle2;
        super.setArguments(bundle);
        if (bundle == null || (catalogRootViewHolder = this.P) == null || (bundle2 = catalogRootViewHolder.h) == null) {
            return;
        }
        bundle2.putAll(bundle);
    }
}
