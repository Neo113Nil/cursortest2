package com.vk.video.profile.presentation.catalog;

import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.e;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import java.util.UUID;
import xsna.bpn0;
import xsna.e7t0;
import xsna.fxc0;
import xsna.mot0;
import xsna.mzp0;
import xsna.o5a;
import xsna.qbe0;
import xsna.qhh0;
import xsna.rzp0;
import xsna.sba;
import xsna.uds;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: VideoProfileCatalogFragment.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCatalogFragment extends BaseCatalogFragment implements qhh0, uds {
    public static final /* synthetic */ int R = 0;
    public final bpn0 Q;

    /* compiled from: VideoProfileCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
    }

    public VideoProfileCatalogFragment() {
        super(VideoProfileCatalogContentVh.class, false);
        if (fxc0.B().J().O0()) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.VIDEO_CATALOG_CHANNEL, "old_video_channel", false, 60).j();
            this.J = mzp0Var;
            if (mzp0Var != null) {
                mzp0Var.init();
            }
            zrd0 zrd0Var = zrd0.a;
            this.L = (yw90) zrd0.a(PerformanceScoreProduct.VIDEO_CHANNEL).j();
        }
        On().init();
        this.Q = new bpn0(new qbe0(10));
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        o5a o5aVar = new o5a(this);
        FragmentActivity kn = kn();
        return new VideoProfileCatalogContentVh(getArguments(), kn, this.J, On(), o5aVar, (e7t0) this.Q.getValue());
    }

    @Override // xsna.woo0
    public final int o7() {
        return 0;
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        e eVar = e.a;
        e.f(true);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        e7t0 e7t0Var = (e7t0) this.Q.getValue();
        if (e7t0Var != null) {
            e7t0Var.d();
        }
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        CatalogRootViewHolder catalogRootViewHolder = this.P;
        bundle.putByteArray("catalog_view_holder_state", catalogRootViewHolder != null ? catalogRootViewHolder.b0() : null);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        super.onViewCreated(view, bundle);
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
        VideoProfileCatalogContentVh videoProfileCatalogContentVh = catalogRootViewHolder instanceof VideoProfileCatalogContentVh ? (VideoProfileCatalogContentVh) catalogRootViewHolder : null;
        if (videoProfileCatalogContentVh == null) {
            return false;
        }
        DisableableViewPager disableableViewPager = videoProfileCatalogContentVh.v.o;
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
