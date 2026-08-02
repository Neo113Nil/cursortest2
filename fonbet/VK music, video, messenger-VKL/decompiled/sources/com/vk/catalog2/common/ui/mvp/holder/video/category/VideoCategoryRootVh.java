package com.vk.catalog2.common.ui.mvp.holder.video.category;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.NonBouncedAppBarLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoCategory;
import com.vk.catalog2.common.ui.core.view.CatalogRecyclerPaginatedView;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.catalog2.common.ui.mvp.holder.video.category.VideoCategoryRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.video.LiveCategory;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.f;
import java.util.WeakHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.alj;
import xsna.asu0;
import xsna.ayn0;
import xsna.b0u0;
import xsna.b25;
import xsna.bnn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.df90;
import xsna.e43;
import xsna.epx;
import xsna.est0;
import xsna.f1p0;
import xsna.f5z;
import xsna.fpf0;
import xsna.g380;
import xsna.g3a;
import xsna.iut0;
import xsna.j5g;
import xsna.k7m;
import xsna.ltz;
import xsna.m7m;
import xsna.nda;
import xsna.o5a;
import xsna.o7y;
import xsna.oyp0;
import xsna.q3a;
import xsna.s3q0;
import xsna.sas0;
import xsna.sba;
import xsna.swp;
import xsna.u080;
import xsna.u4a;
import xsna.uyq0;
import xsna.vu5;
import xsna.vyq0;
import xsna.wc2;
import xsna.wzs;
import xsna.yqd0;

/* compiled from: VideoCategoryRootVh.kt */
/* loaded from: classes16.dex */
public final class VideoCategoryRootVh extends CatalogRootViewHolder implements CatalogStatesViewHolder, df90, ViewPager.j {
    public final String A;
    public c B;
    public final SearchStatsLoggingInfo C;
    public final SwitchCatalogVh D;
    public ViewGroup E;
    public final boolean p;
    public final int q;
    public CatalogRecyclerPaginatedView r;
    public final VideoCategoryHeaderVh s;
    public final g3a t;
    public final ViewPagerVh u;
    public UIBlockCatalog v;
    public View w;
    public CoordinatorLayout.c<View> x;
    public yqd0 y;
    public final sas0 z;

    /* compiled from: VideoCategoryRootVh.kt */
    public static final class a {
        public final UIBlockVideoCategory a;
        public final int b;

        public a(UIBlockVideoCategory uIBlockVideoCategory, int i) {
            this.a = uIBlockVideoCategory;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            UIBlockVideoCategory uIBlockVideoCategory = this.a;
            return Integer.hashCode(this.b) + ((uIBlockVideoCategory == null ? 0 : uIBlockVideoCategory.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CoverData(uiBlockVideoCategory=");
            sb.append(this.a);
            sb.append(", videosCount=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: VideoCategoryRootVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<CatalogViewHolder, u4a.a, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(CatalogViewHolder catalogViewHolder, u4a.a aVar) {
            CatalogViewHolder catalogViewHolder2 = catalogViewHolder;
            u4a.a aVar2 = aVar;
            ((VideoCategoryRootVh) this.receiver).getClass();
            if (catalogViewHolder2 instanceof VideoItemVh) {
                VideoItemVh videoItemVh = (VideoItemVh) catalogViewHolder2;
                if (videoItemVh instanceof VideoItemNoAutoPlayVh) {
                    videoItemVh = ((VideoItemNoAutoPlayVh) catalogViewHolder2).m;
                } else if ((videoItemVh instanceof VideoItemAutoPlayVh) && (videoItemVh = ((VideoItemAutoPlayVh) catalogViewHolder2).m) == null) {
                    videoItemVh = null;
                }
                if (videoItemVh != null) {
                    videoItemVh.i = aVar2;
                }
            }
            return s3q0.a;
        }
    }

    public VideoCategoryRootVh() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [xsna.sas0] */
    public VideoCategoryRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, boolean z) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        Parcelable parcelable;
        Object parcelable2;
        this.p = z;
        this.q = R.layout.catalog2_category;
        this.s = new VideoCategoryHeaderVh(this.m);
        u4a u4aVar = this.m;
        this.t = u4aVar.b.s.S(u4aVar, null);
        ErrorStateVh errorStateVh = new ErrorStateVh(this, new uyq0(this, 3));
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, true, null, false, null, null, null, null, null, null, 8188);
        this.u = viewPagerVh;
        this.z = new b25.a() { // from class: xsna.sas0
            @Override // xsna.b25.a
            public final void d(tbu0 tbu0Var) {
                if (tbu0Var.b()) {
                    VideoCategoryRootVh videoCategoryRootVh = VideoCategoryRootVh.this;
                    if (videoCategoryRootVh.p) {
                        videoCategoryRootVh.t.d();
                    }
                }
            }
        };
        this.A = bundle != null ? bundle.getString("category_id") : null;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("search_stats_logging_info", SearchStatsLoggingInfo.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                ?? parcelable3 = bundle.getParcelable("search_stats_logging_info");
                parcelable = parcelable3 instanceof SearchStatsLoggingInfo ? parcelable3 : null;
            }
            r4 = (SearchStatsLoggingInfo) parcelable;
        }
        this.C = r4;
        if (r4 != null) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.Enabled;
        }
        this.D = new SwitchCatalogVh(viewPagerVh, null, errorStateVh, null, null, R.layout.catalog_frame_layout_with_scrolling_non_bounced, null, null, false, false, null, 2010);
    }

    public static a i0(UIBlockList uIBlockList) {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        for (Object obj : uIBlockList.y) {
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlock uIBlock = (UIBlock) obj;
            if (uIBlock instanceof UIBlockVideoCategory) {
                i3 = i;
            } else if (uIBlock instanceof UIBlockVideo) {
                i2++;
            }
            i = i4;
        }
        return i3 != -1 ? new a((UIBlockVideoCategory) uIBlockList.y.get(i3), i2) : new a(null, i2);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.D.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        boolean z = uIBlock instanceof UIBlockCatalog;
        if (z) {
            this.v = (UIBlockCatalog) uIBlock;
            if (z) {
                j0(uIBlock);
            }
            this.D.N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.C != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, true, null, 16);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoCategoryRootVh videoCategoryRootVh;
        View inflate = layoutInflater.inflate(this.q, viewGroup, false);
        ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s().b0(this.z);
        final ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.E = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.category_root_coordinator);
        SwitchCatalogVh switchCatalogVh = this.D;
        View k5 = switchCatalogVh.k5(layoutInflater, viewGroup3, null);
        this.w = k5;
        if (k5.getLayoutParams() instanceof CoordinatorLayout.f) {
            View view = this.w;
            this.x = ((CoordinatorLayout.f) (view != null ? view.getLayoutParams() : null)).a;
        }
        viewGroup3.addView(this.s.k5(layoutInflater, viewGroup3, null), 0);
        viewGroup3.addView(this.w, 1);
        switchCatalogVh.i8(ltz.a);
        u080 u080Var = new u080() { // from class: xsna.ras0
            @Override // xsna.u080
            public final bqx0 b(View view2, bqx0 bqx0Var) {
                boolean q = BuildInfo.q();
                ViewGroup viewGroup4 = viewGroup2;
                if (!q) {
                    awt0.x(viewGroup4, 0, 0, 0, 0, 13);
                    return bqx0Var;
                }
                h4x j = bqx0Var.a.j(130);
                viewGroup4.setPadding(j.a, 0, j.c, j.d);
                return bqx0Var;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(viewGroup2, u080Var);
        viewGroup3.post(new wc2(this, 20));
        u4a u4aVar = this.m;
        this.B = u4aVar.b.e.a().b0(oyp0.class).a0(asu0.a.d()).subscribe(new o7y(new vyq0(this, 2), 25));
        CatalogConfiguration catalogConfiguration = u4aVar.b.s;
        est0 est0Var = catalogConfiguration instanceof est0 ? (est0) catalogConfiguration : null;
        if (est0Var != null) {
            videoCategoryRootVh = this;
            est0Var.K = new b(2, videoCategoryRootVh, VideoCategoryRootVh.class, "onViewHolderCreated", "onViewHolderCreated(Lcom/vk/catalog2/common/ui/holders/api/CatalogViewHolder;Lcom/vk/catalog2/common/ui/mvp/CatalogEntryPointParams$CatalogScopeParams;)V", 0);
        } else {
            videoCategoryRootVh = this;
        }
        DisableableViewPager disableableViewPager = videoCategoryRootVh.u.o;
        (disableableViewPager != null ? disableableViewPager : null).addOnPageChangeListener(this);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.s.L();
        this.D.L();
        this.t.b();
        c cVar = this.B;
        if (cVar != null) {
            cVar.dispose();
        }
        ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).s().B(this.z);
        DisableableViewPager disableableViewPager = this.u.o;
        if (disableableViewPager == null) {
            disableableViewPager = null;
        }
        disableableViewPager.removeOnPageChangeListener(this);
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        VideoCategoryHeaderVh videoCategoryHeaderVh = this.s;
        if (i2 <= 1 && videoCategoryHeaderVh.g) {
            videoCategoryHeaderVh.g = false;
            videoCategoryHeaderVh.a(true);
        } else if (i2 <= 1) {
            videoCategoryHeaderVh.getClass();
        } else {
            if (videoCategoryHeaderVh.g) {
                return;
            }
            videoCategoryHeaderVh.g = true;
            videoCategoryHeaderVh.a(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.D.r;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return new f(io.reactivex.rxjava3.internal.functions.a.b);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.D.i8(bnn0Var);
    }

    public final void j0(UIBlock uIBlock) {
        a aVar;
        if (uIBlock instanceof UIBlockList) {
            aVar = i0((UIBlockList) uIBlock);
        } else {
            if (uIBlock instanceof UIBlockCatalog) {
                Object a0 = j5g.a0(((UIBlockCatalog) uIBlock).A);
                UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
                if (uIBlockList != null) {
                    aVar = i0(uIBlockList);
                }
            }
            aVar = null;
        }
        if (aVar != null) {
            UIBlockVideoCategory uIBlockVideoCategory = aVar.a;
            int i = aVar.b;
            if (uIBlockVideoCategory != null) {
                LiveCategory liveCategory = uIBlockVideoCategory.y;
                if (epx.f(liveCategory.b, String.valueOf(this.A))) {
                    VideoCategoryHeaderVh videoCategoryHeaderVh = this.s;
                    videoCategoryHeaderVh.N6(uIBlockVideoCategory);
                    if (i == 0) {
                        NonBouncedAppBarLayout nonBouncedAppBarLayout = videoCategoryHeaderVh.d;
                        if (nonBouncedAppBarLayout == null) {
                            nonBouncedAppBarLayout = null;
                        }
                        nonBouncedAppBarLayout.setVisibility(0);
                        CollapsingToolbarLayout collapsingToolbarLayout = videoCategoryHeaderVh.c;
                        if (collapsingToolbarLayout == null) {
                            collapsingToolbarLayout = null;
                        }
                        collapsingToolbarLayout.setScrimAnimationDuration(0L);
                        NonBouncedAppBarLayout nonBouncedAppBarLayout2 = videoCategoryHeaderVh.d;
                        (nonBouncedAppBarLayout2 != null ? nonBouncedAppBarLayout2 : null).h(true, false, true);
                        videoCategoryHeaderVh.a(true ^ videoCategoryHeaderVh.i);
                        VideoCategoryToolbarVh videoCategoryToolbarVh = videoCategoryHeaderVh.e;
                        ImageView imageView = videoCategoryToolbarVh.f;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                            bwt0.i0(imageView, new f1p0(3, liveCategory, videoCategoryToolbarVh));
                        }
                    }
                }
            }
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.m.b.c) {
            return;
        }
        this.D.onConfigurationChanged(configuration);
        VideoCategoryHeaderVh videoCategoryHeaderVh = this.s;
        videoCategoryHeaderVh.getClass();
        boolean z = true;
        videoCategoryHeaderVh.i = configuration.orientation == 1;
        NonBouncedAppBarLayout nonBouncedAppBarLayout = videoCategoryHeaderVh.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        nonBouncedAppBarLayout.setExpanded(videoCategoryHeaderVh.g);
        if (videoCategoryHeaderVh.h && videoCategoryHeaderVh.i) {
            z = false;
        }
        videoCategoryHeaderVh.a(z);
        sba sbaVar = this.u.s;
        if (sbaVar != null) {
            SparseArray<ayn0> sparseArray = sbaVar.t;
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                sparseArray.valueAt(i).b();
            }
            SparseArray<CatalogViewHolder> sparseArray2 = sbaVar.r;
            SparseArray sparseArray3 = new SparseArray();
            int size2 = sparseArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int keyAt = sparseArray2.keyAt(i2);
                CatalogViewHolder valueAt = sparseArray2.valueAt(i2);
                g380 g380Var = valueAt instanceof g380 ? (g380) valueAt : null;
                if (g380Var != null) {
                    sparseArray3.put(keyAt, g380Var);
                }
            }
            int size3 = sparseArray3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                ((g380) sparseArray3.valueAt(i3)).onConfigurationChanged(configuration);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
        yqd0 yqd0Var = this.y;
        if (yqd0Var != null) {
            yqd0Var.invoke();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        CatalogRecyclerPaginatedView catalogRecyclerPaginatedView = this.r;
        if (catalogRecyclerPaginatedView != null) {
            catalogRecyclerPaginatedView.M9(this);
        }
        this.y = null;
        this.u.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        UIBlockCatalog uIBlockCatalog;
        this.u.onResume();
        VideoCategoryHeaderVh videoCategoryHeaderVh = this.s;
        videoCategoryHeaderVh.g = false;
        videoCategoryHeaderVh.a(true);
        NonBouncedAppBarLayout nonBouncedAppBarLayout = videoCategoryHeaderVh.d;
        if (nonBouncedAppBarLayout == null) {
            nonBouncedAppBarLayout = null;
        }
        nonBouncedAppBarLayout.h(true, false, true);
        if ((this.D.r instanceof alj) && (uIBlockCatalog = this.v) != null) {
            N6(uIBlockCatalog);
        }
        this.y = new yqd0(this, 17);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        this.D.i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.D.i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            this.u.s();
        } else if (i == -1) {
            this.m.b.b.c(false);
        }
    }

    @Override // xsna.df90
    public final void l(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
