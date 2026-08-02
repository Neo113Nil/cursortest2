package com.vk.video.profile.presentation.catalog.holders;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemNoAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.AppBarShadowView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.libvideo.autoplay.e;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutNavgo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.alj;
import xsna.b9s0;
import xsna.bnn0;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.c7t0;
import xsna.cfp0;
import xsna.d7t0;
import xsna.dd80;
import xsna.dei0;
import xsna.e7t0;
import xsna.f4m;
import xsna.f5z;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g3a;
import xsna.h2w;
import xsna.iah0;
import xsna.iml0;
import xsna.j0;
import xsna.j5g;
import xsna.jjt0;
import xsna.kzt0;
import xsna.ltz;
import xsna.mzp0;
import xsna.mzt0;
import xsna.nda;
import xsna.o25;
import xsna.o5a;
import xsna.ofc0;
import xsna.oi40;
import xsna.qcy;
import xsna.qud0;
import xsna.rrn0;
import xsna.s3q0;
import xsna.swp;
import xsna.u4a;
import xsna.wzs;
import xsna.y6t0;
import xsna.yw90;

/* compiled from: VideoProfileCatalogContentVh.kt */
/* loaded from: classes6.dex */
public final class VideoProfileCatalogContentVh extends CatalogRootViewHolder implements CatalogStatesViewHolder, SwitchCatalogVh.b {
    public final mzp0 p;
    public final yw90 q;
    public final e7t0 r;
    public final g3a s;
    public final boolean t;
    public final SearchStatsLoggingInfo u;
    public final ViewPagerVh v;
    public final FirstPinnedTabLayoutVh w;
    public final SwitchCatalogVh x;
    public String y;
    public AppBarShadowView z;

    /* compiled from: VideoProfileCatalogContentVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<CatalogViewHolder, u4a.a, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(CatalogViewHolder catalogViewHolder, u4a.a aVar) {
            VideoItemListLargeVh videoItemListLargeVh;
            CatalogViewHolder catalogViewHolder2 = catalogViewHolder;
            u4a.a aVar2 = aVar;
            ((VideoProfileCatalogContentVh) this.receiver).getClass();
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
            if (catalogViewHolder2 instanceof VideoItemAutoPlayVh) {
                VideoItemVh videoItemVh2 = ((VideoItemAutoPlayVh) catalogViewHolder2).m;
                videoItemListLargeVh = videoItemVh2 instanceof VideoItemListLargeVh ? (VideoItemListLargeVh) videoItemVh2 : null;
                if (videoItemListLargeVh != null) {
                    videoItemListLargeVh.n = false;
                }
            } else if (catalogViewHolder2 instanceof VideoItemNoAutoPlayVh) {
                VideoItemVh videoItemVh3 = ((VideoItemNoAutoPlayVh) catalogViewHolder2).m;
                videoItemListLargeVh = videoItemVh3 instanceof VideoItemListLargeVh ? (VideoItemListLargeVh) videoItemVh3 : null;
                if (videoItemListLargeVh != null) {
                    videoItemListLargeVh.n = false;
                }
            }
            return s3q0.a;
        }
    }

    public VideoProfileCatalogContentVh() {
        throw null;
    }

    public VideoProfileCatalogContentVh(Bundle bundle, FragmentActivity fragmentActivity, mzp0 mzp0Var, yw90 yw90Var, o5a o5aVar, e7t0 e7t0Var) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        SearchStatsLoggingInfo searchStatsLoggingInfo;
        Parcelable parcelable;
        Object parcelable2;
        this.p = mzp0Var;
        this.q = yw90Var;
        this.r = e7t0Var;
        u4a u4aVar = this.m;
        this.s = u4aVar.b.s.S(u4aVar, null);
        VideoProfileCatalogErrorVh videoProfileCatalogErrorVh = new VideoProfileCatalogErrorVh(this, new dei0(this, 29));
        VideoProfileCatalogSkeletonVh videoProfileCatalogSkeletonVh = new VideoProfileCatalogSkeletonVh();
        bpn0 bpn0Var = new bpn0(new iml0(this, 18));
        bpn0 bpn0Var2 = new bpn0(new ofc0(this, 27));
        bpn0 bpn0Var3 = new bpn0(new rrn0(this, 21));
        boolean x0 = fxc0.B().J().x0();
        this.t = x0;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("search_stats_logging_info", SearchStatsLoggingInfo.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("search_stats_logging_info");
                parcelable = (SearchStatsLoggingInfo) (parcelable3 instanceof SearchStatsLoggingInfo ? parcelable3 : null);
            }
            searchStatsLoggingInfo = (SearchStatsLoggingInfo) parcelable;
        } else {
            searchStatsLoggingInfo = null;
        }
        this.u = searchStatsLoggingInfo;
        if (searchStatsLoggingInfo != null) {
            if (searchStatsLoggingInfo.j) {
                SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
                searchStatInfoProvider.getClass();
                searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
            } else {
                SearchStatInfoProvider searchStatInfoProvider2 = this.m.b.m;
                searchStatInfoProvider2.getClass();
                searchStatInfoProvider2.b = SearchStatInfoProvider.Mode.Enabled;
            }
            this.m.b.m.a = searchStatsLoggingInfo.i;
        }
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, (mzt0) bpn0Var3.getValue(), (d7t0) bpn0Var.getValue(), null, N(), null, (c7t0) bpn0Var2.getValue(), 2670);
        this.v = viewPagerVh;
        u4a.a aVar = this.m.b;
        this.w = new FirstPinnedTabLayoutVh(viewPagerVh, aVar.r, new jjt0(), Integer.valueOf(R.drawable.vk_video_profile_v2_tab_indicator), aVar.c && x0, null, null, null, null, 7690);
        this.x = new SwitchCatalogVh(viewPagerVh, null, videoProfileCatalogErrorVh, videoProfileCatalogSkeletonVh, this, R.layout.catalog_root_vh_layout_no_behaviour, null, null, false, false, null, 1986);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.x.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.p;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        boolean z = uIBlock instanceof UIBlockCatalog;
        UIBlockCatalog uIBlockCatalog = z ? (UIBlockCatalog) uIBlock : null;
        this.y = uIBlockCatalog != null ? uIBlockCatalog.D : null;
        this.x.N6(uIBlock);
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.w;
        firstPinnedTabLayoutVh.N6(uIBlock);
        if (z) {
            ArrayList<UIBlock> arrayList = ((UIBlockCatalog) uIBlock).A;
            UIBlock uIBlock2 = (UIBlock) j5g.a0(arrayList);
            if (arrayList.size() != 1 || uIBlock2 == null) {
                firstPinnedTabLayoutVh.show();
            } else {
                firstPinnedTabLayoutVh.hide();
            }
        }
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        b9s0 b9s0Var = catalogConfiguration instanceof b9s0 ? (b9s0) catalogConfiguration : null;
        VideoFile videoFile = b9s0Var != null ? b9s0Var.f0 : null;
        if (videoFile != null) {
            fxc0.B().Y().i(this.b, videoFile, new VideoFeedDialogParams.Discover("from_link", null, null, false, null, null, 0L, false, null, null, 1020, null));
            b9s0Var.f0 = null;
        }
        AppBarShadowView appBarShadowView = this.z;
        if (appBarShadowView != null) {
            appBarShadowView.setVisibility((!z || ((UIBlockCatalog) uIBlock).A.size() <= 1) ? 8 : 0);
        }
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
        yw90 yw90Var = this.q;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        String str;
        SchemeStat$TypeNavgo a2;
        qud0 qud0Var = new qud0();
        Object obj = cfp0Var.b;
        kzt0 kzt0Var = obj instanceof kzt0 ? (kzt0) obj : null;
        if (kzt0Var != null) {
            UIBlock uIBlock = kzt0Var.a;
            UIBlock uIBlock2 = cfp0Var.a;
            UIBlockList uIBlockList = uIBlock2 instanceof UIBlockList ? (UIBlockList) uIBlock2 : null;
            if (uIBlockList != null && !uIBlock.equals(kzt0Var.b) && (str = uIBlockList.M) != null && brm0.v(str, "/donut", false)) {
                UserId userId = uIBlockList.g;
                if (!fkq0.c(userId)) {
                    userId = null;
                }
                if (userId == null) {
                    UIBlock f = dd80.f(uIBlockList, new h2w(21));
                    userId = f != null ? f.g : null;
                    if (userId == null) {
                        userId = uIBlock.g;
                        if (!fkq0.c(userId)) {
                            userId = null;
                        }
                        if (userId == null) {
                            UIBlock f2 = dd80.f(uIBlock, new oi40(10));
                            UserId userId2 = f2 != null ? f2.g : null;
                            userId = userId2 == null ? UserId.d : userId2;
                        }
                    }
                }
                SchemeStat$TypeNavgo.Subtype subtype = SchemeStat$TypeNavgo.Subtype.SHOW;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VK_VIDEO;
                a2 = SchemeStat$TypeNavgo.a.a(subtype, mobileOfficialAppsCoreNavStat$EventScreen, "", null, new SchemeStat$EventItem(SchemeStat$EventItem.Type.DONUT, null, Long.valueOf(userId.b), null, null, null, 58, null), (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, null, new CommonCommunitiesStat$TypeDonutNavgo(CommonCommunitiesStat$TypeDonutNavgo.EventType.OPEN_DONUT_TABBAR, null, null, 6, null));
                qud0Var.f = mobileOfficialAppsCoreNavStat$EventScreen;
                qud0Var.g = a2;
                qud0Var.q();
            }
        }
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.u;
        if (searchStatsLoggingInfo != null) {
            b.a(b.a, cfp0Var.a, cfp0Var.b, searchStatsLoggingInfo.i, null, 16);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VideoProfileCatalogContentVh videoProfileCatalogContentVh;
        u4a u4aVar = this.m;
        u4a.a aVar = u4aVar.b;
        u4a.a aVar2 = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar.s;
        y6t0 y6t0Var = catalogConfiguration instanceof y6t0 ? (y6t0) catalogConfiguration : null;
        if (y6t0Var != null) {
            videoProfileCatalogContentVh = this;
            y6t0Var.u0 = new a(2, videoProfileCatalogContentVh, VideoProfileCatalogContentVh.class, "onViewHolderCreated", "onViewHolderCreated(Lcom/vk/catalog2/common/ui/holders/api/CatalogViewHolder;Lcom/vk/catalog2/common/ui/mvp/CatalogEntryPointParams$CatalogScopeParams;)V", 0);
        } else {
            videoProfileCatalogContentVh = this;
        }
        View k5 = videoProfileCatalogContentVh.x.k5(layoutInflater, viewGroup, null);
        Bundle bundle2 = videoProfileCatalogContentVh.h;
        String string = bundle2.getString("embedded_video_id");
        CatalogConfiguration catalogConfiguration2 = aVar2.s;
        b9s0 b9s0Var = catalogConfiguration2 instanceof b9s0 ? (b9s0) catalogConfiguration2 : null;
        if (b9s0Var != null) {
            b9s0Var.g0 = string;
        }
        if (bundle2.getBoolean("enable_sound")) {
            e eVar = e.a;
            e.f(false);
        }
        k5.post(new j0(this, 16));
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            mzp0 mzp0Var = videoProfileCatalogContentVh.p;
            if (mzp0Var != null) {
                mzp0Var.a();
            }
            i8(ltz.a);
        } else {
            rg(new IOException());
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        f4m.t((int) k5.getResources().getDimension(R.dimen.vk_video_profile_content_videos_margin_top), k5);
        View k52 = videoProfileCatalogContentVh.w.k5(layoutInflater, viewGroup, null);
        AppBarShadowView appBarShadowView = new AppBarShadowView(layoutInflater.getContext(), null, 6, 0);
        f4m.j(appBarShadowView);
        videoProfileCatalogContentVh.z = appBarShadowView;
        if (aVar2.c && videoProfileCatalogContentVh.t) {
            float f = 16;
            appBarShadowView.setPadding(iah0.a(f), 0, iah0.a(f), 0);
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup != null ? viewGroup.getContext() : null);
        linearLayout.setOrientation(1);
        linearLayout.addView(k52);
        linearLayout.addView(appBarShadowView);
        linearLayout.addView(k5);
        return linearLayout;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.v.L();
        this.w.L();
        this.x.L();
        ((io.reactivex.rxjava3.disposables.b) this.m.b.o.b).e();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Z(byte[] bArr) {
        this.v.e(bArr);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final byte[] b0() {
        return this.v.g();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.x.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.x;
        if (bnn0Var.equals(switchCatalogVh.r)) {
            return;
        }
        switchCatalogVh.i8(bnn0Var);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof alj;
        FirstPinnedTabLayoutVh firstPinnedTabLayoutVh = this.w;
        if (z) {
            firstPinnedTabLayoutVh.show();
        } else {
            firstPinnedTabLayoutVh.hide();
        }
        AppBarShadowView appBarShadowView = this.z;
        if (appBarShadowView != null && !z) {
            f4m.j(appBarShadowView);
        }
        this.v.onResume();
        if (z) {
            Bundle bundle = this.h;
            if (bundle.getBoolean("need_show_login_on_launch")) {
                bundle.remove("need_show_login_on_launch");
                o25.a().getClass();
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.w.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        String string;
        String str;
        this.w.onResume();
        Bundle bundle = this.h;
        boolean z = bundle.getBoolean("is_system");
        boolean z2 = bundle.getBoolean("enable_sound");
        if (z && (str = this.y) != null) {
            A(str);
        }
        if (z2) {
            e eVar = e.a;
            e.f(false);
        }
        String string2 = bundle.getString("embedded_video_id");
        g3a g3aVar = this.s;
        u4a u4aVar = this.m;
        if (string2 != null) {
            CatalogConfiguration catalogConfiguration = u4aVar.b.s;
            b9s0 b9s0Var = catalogConfiguration instanceof b9s0 ? (b9s0) catalogConfiguration : null;
            if (b9s0Var != null && !string2.equals(b9s0Var.g0)) {
                b9s0Var.g0 = string2;
                g3aVar.d();
            }
        }
        if (u4aVar.b.s.J() && (string = bundle.getString("key_url")) != null) {
            CatalogConfiguration catalogConfiguration2 = u4aVar.b.s;
            b9s0 b9s0Var2 = catalogConfiguration2 instanceof b9s0 ? (b9s0) catalogConfiguration2 : null;
            if (b9s0Var2 != null && !string.equals(b9s0Var2.h0)) {
                b9s0Var2.h0 = string;
                g3aVar.d();
            }
        }
        bundle.remove("is_system");
        bundle.remove("enable_sound");
        bundle.remove("embedded_video_id");
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.v.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
