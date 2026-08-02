package com.vk.catalog2.common.ui.mvp.clip;

import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.search.suggester.core.SearchServiceWithSuggestCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.libvideo.autoplay.e;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.alj;
import xsna.fxc0;
import xsna.ga40;
import xsna.lbc0;
import xsna.mlf0;
import xsna.mot0;
import xsna.msy;
import xsna.myd0;
import xsna.mzp0;
import xsna.o5a;
import xsna.qhh0;
import xsna.qkd0;
import xsna.qo5;
import xsna.r230;
import xsna.rds;
import xsna.rka0;
import xsna.rzp0;
import xsna.s200;
import xsna.sba;
import xsna.srq0;
import xsna.t9t0;
import xsna.u5e0;
import xsna.uds;
import xsna.vyh0;
import xsna.ww50;
import xsna.wzh0;
import xsna.wzv0;
import xsna.xds;
import xsna.xzv0;
import xsna.yw90;
import xsna.yys0;
import xsna.yzv0;
import xsna.zrd0;

/* compiled from: VideoCatalogSearchFragment.kt */
/* loaded from: classes16.dex */
public final class VideoCatalogSearchFragment extends BaseCatalogFragment implements rds, uds, xds, qhh0, r230 {
    public static final /* synthetic */ int X = 0;
    public wzv0 Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    /* compiled from: VideoCatalogSearchFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public VideoCatalogSearchFragment() {
        super(VideoCatalogSearchRootVh.class, false);
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.VIDEO_CATALOG, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
        zrd0 zrd0Var = zrd0.a;
        this.L = (yw90) zrd0.a(PerformanceScoreProduct.VIDEO_CATALOG).j();
        On().init();
        mlf0 mlf0Var = new mlf0(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, mlf0Var);
        this.S = msy.a(lazyThreadSafetyMode, new rka0(this, 27));
        this.T = msy.a(lazyThreadSafetyMode, new srq0(this, 5));
        this.U = msy.a(lazyThreadSafetyMode, new lbc0(this, 28));
        this.V = msy.a(lazyThreadSafetyMode, new myd0(this, 20));
        this.W = msy.a(lazyThreadSafetyMode, new qkd0(this, 22));
    }

    @Override // xsna.r230
    public final boolean Ya() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (!(catalogRootViewHolder instanceof VideoCatalogSearchRootVh)) {
            return false;
        }
        VideoCatalogSearchRootVh videoCatalogSearchRootVh = (VideoCatalogSearchRootVh) catalogRootViewHolder;
        if (!(videoCatalogSearchRootVh.L.r instanceof vyh0)) {
            return false;
        }
        wzh0 wzh0Var = videoCatalogSearchRootVh.E;
        wzh0Var.c().s();
        ((SearchServiceWithSuggestCatalogRootVh) wzh0Var.b).i8(alj.a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ((u5e0) this.U.getValue()).getClass();
        return super.a0();
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean z;
        ww50 v;
        FragmentActivity activity = getActivity();
        if (!((activity == null || (v = s200.v(activity)) == null) ? true : v.k(this))) {
            Bundle arguments = getArguments();
            if (!(arguments != null ? arguments.getBoolean("catalog_show_navigation_button_key") : false)) {
                z = false;
                return new VideoCatalogSearchRootVh(getArguments(), kn(), new o5a(this), z, (yys0) this.R.getValue(), (t9t0) this.S.getValue(), this.J, On());
            }
        }
        z = true;
        return new VideoCatalogSearchRootVh(getArguments(), kn(), new o5a(this), z, (yys0) this.R.getValue(), (t9t0) this.S.getValue(), this.J, On());
    }

    @Override // xsna.xoo0
    public final int l2() {
        return 0;
    }

    @Override // xsna.woo0
    public final int o7() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        e eVar = e.a;
        e.f(true);
        wzv0 wzv0Var = this.Q;
        if (wzv0Var != null) {
            wzv0Var.onDestroy();
        }
        ((qo5) this.T.getValue()).getClass();
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((u5e0) this.U.getValue()).getClass();
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        bundle.putByteArray("catalog_view_holder_state", catalogRootViewHolder != null ? catalogRootViewHolder.b0() : null);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        super.onViewCreated(view, bundle);
        ((u5e0) this.U.getValue()).getClass();
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
        fxc0.B().s().g(false);
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_AD_FREE_SUBSCRIPTION;
        videoFeatures.getClass();
        b bVar = b.A;
        wzv0 wzv0Var = null;
        if (bVar.a(videoFeatures) && BuildInfo.s()) {
            ?? r7 = this.W;
            ((VideoAdFreeSubscriptionComponent) r7.getValue()).E2().d(null);
            ((VideoAdFreeSubscriptionComponent) r7.getValue()).E2().a(VideoAdFreeTrapEventTrigger.VIDEO_TAB_START, requireContext());
        }
        VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_OPEN_VK_VIDEO_POPUP;
        videoFeatures2.getClass();
        wzv0 a2 = (!bVar.a(videoFeatures2) || BuildInfo.q()) ? null : ((xzv0) this.V.getValue()).a(requireView());
        if (a2 != null) {
            ((yzv0) a2).c();
            wzv0Var = a2;
        }
        this.Q = wzv0Var;
        getParentFragmentManager().l0("SHOW_SUBSCRIPTION_SELECTOR", this, new ga40(this, 16));
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

    @Override // xsna.qhh0
    public final boolean s() {
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        if (!(catalogRootViewHolder instanceof VideoCatalogSearchRootVh)) {
            return false;
        }
        VideoCatalogSearchRootVh videoCatalogSearchRootVh = (VideoCatalogSearchRootVh) catalogRootViewHolder;
        if (videoCatalogSearchRootVh.L.r instanceof vyh0) {
            return false;
        }
        DisableableViewPager disableableViewPager = videoCatalogSearchRootVh.B.o;
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
