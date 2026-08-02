package com.vk.feed.settings.impl.presentation.filtered;

import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.DefaultErrorView;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.f540;
import xsna.fz60;
import xsna.gf60;
import xsna.gm50;
import xsna.gzs;
import xsna.h3p0;
import xsna.km50;
import xsna.ko00;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.oz50;
import xsna.qi00;
import xsna.qw30;
import xsna.rzp0;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.uq50;
import xsna.vk50;
import xsna.w8i;
import xsna.wt30;
import xsna.xc50;
import xsna.yi60;
import xsna.yw90;
import xsna.zrd0;

/* compiled from: NewsfeedFilteredSourcesFragment.kt */
/* loaded from: classes18.dex */
public final class NewsfeedFilteredSourcesFragment extends MviImplFragment<com.vk.feed.settings.impl.presentation.filtered.b, f, com.vk.feed.settings.impl.presentation.filtered.a> implements w8i {
    public static final /* synthetic */ int a0 = 0;
    public VkTopBar Q;
    public VkTabLayout R;
    public ViewPager S;
    public View T;
    public View U;
    public DefaultErrorView V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final mzp0 Z;

    /* compiled from: NewsfeedFilteredSourcesFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: NewsfeedFilteredSourcesFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            NewsfeedFilteredSourcesFragment newsfeedFilteredSourcesFragment = (NewsfeedFilteredSourcesFragment) this.receiver;
            int i = NewsfeedFilteredSourcesFragment.a0;
            newsfeedFilteredSourcesFragment.getClass();
            h3p0.b(newsfeedFilteredSourcesFragment);
            return s3q0.a;
        }
    }

    public NewsfeedFilteredSourcesFragment() {
        int i = 3;
        uq50 uq50Var = new uq50(this, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.W = msy.a(lazyThreadSafetyMode, uq50Var);
        this.X = msy.a(lazyThreadSafetyMode, new ko00(this, 10));
        this.Y = msy.a(lazyThreadSafetyMode, new wt30(this, i));
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.SETTINGS_FILTER_NEWSFEED, null, false, 62).j();
        this.Z = mzp0Var;
        this.J = mzp0Var;
        mzp0Var.init();
        zrd0 zrd0Var = zrd0.a;
        yw90 yw90Var = (yw90) zrd0.a(PerformanceScoreProduct.SETTINGS_FILTER_NEWSFEED).j();
        yw90Var.init();
        this.L = yw90Var;
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_filtered_sources);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((f) ao50Var).a, new xc50(this, 3));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.feed.settings.impl.presentation.filtered.b) vk50Var).g.a(new qi00(this, 14), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fo() {
        VkTopBar.b bVar;
        boolean a2 = h3p0.a(this);
        VkTopBar vkTopBar = this.Q;
        if (vkTopBar != null) {
            if (a2) {
                bVar = new VkTopBar.b(new b(0, this, NewsfeedFilteredSourcesFragment.class, "onBackClick", "onBackClick()V", 0), tq.h(tlo0.Companion, R.string.accessibility_back), null, null, null, 28);
            } else {
                bVar = null;
            }
            vkTopBar.setBack(bVar);
            VkTopBar.Middle.Text.c cVar = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.sett_news_banned), null, null, null, null, 30), cVar, objArr, objArr2, 14));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.fy50
    public final void lf() {
        fo();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Q = (VkTopBar) view.findViewById(R.id.toolbar);
        fo();
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        this.S = viewPager;
        viewPager.setAdapter((yi60) this.Y.getValue());
        VkTabLayout vkTabLayout = (VkTabLayout) view.findViewById(R.id.tabs);
        this.R = vkTabLayout;
        if (vkTabLayout != null) {
            ViewPager viewPager2 = this.S;
            if (viewPager2 == null) {
                viewPager2 = null;
            }
            vkTabLayout.setupWithViewPager(viewPager2);
        }
        VkTabLayout vkTabLayout2 = this.R;
        if (vkTabLayout2 != null) {
            vkTabLayout2.setCustomTabContent(new qw30(this, 6));
        }
        this.T = view.findViewById(R.id.loader);
        this.U = view.findViewById(R.id.empty_view);
        DefaultErrorView defaultErrorView = (DefaultErrorView) view.findViewById(R.id.error_view);
        this.V = defaultErrorView;
        defaultErrorView.setRetryClickListener(new gf60(1, this));
        ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
        com.vk.mvi.core.internal.executors.a.b(new f540(this, 4));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new com.vk.feed.settings.impl.presentation.filtered.b((fz60) this.W.getValue(), new d());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.SETTINGS_FILTER_NEWSFEED;
    }
}
