package com.vk.catalog2.common.ui.mvp.holder.container;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicPlaylist;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.text.Regex;
import xsna.ayn0;
import xsna.bcd;
import xsna.brm0;
import xsna.cfi0;
import xsna.cfp0;
import xsna.epx;
import xsna.f5z;
import xsna.fha;
import xsna.fpf0;
import xsna.hl10;
import xsna.izs;
import xsna.k7m;
import xsna.m7m;
import xsna.mba;
import xsna.msy;
import xsna.mzp0;
import xsna.nda;
import xsna.rzp0;
import xsna.s3q0;
import xsna.t8a;
import xsna.u4a;
import xsna.wt30;

/* compiled from: ShowAllListRootVh.kt */
/* loaded from: classes16.dex */
public final class ShowAllListRootVh extends CatalogRootViewHolder {
    public final mba p;
    public final String q;
    public final String r;
    public final SearchStatsLoggingInfo s;
    public final bcd t;
    public final mzp0 u;
    public final fha v;
    public final Object w;
    public final Object x;
    public final ShowAllListVh y;

    /* compiled from: ShowAllListRootVh.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((StoriesComponent) this.receiver).Pa();
        }
    }

    /* compiled from: ShowAllListRootVh.kt */
    public static final /* synthetic */ class b extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return ((StoryViewerComponent) this.receiver).tb();
        }
    }

    public ShowAllListRootVh(Class<?> cls, Bundle bundle, Activity activity, nda ndaVar, mba mbaVar) {
        super(bundle, (Class) cls, activity, ndaVar, false, (f5z) null, 112);
        this.p = mbaVar;
        String string = bundle.getString("section");
        String str = string == null ? "" : string;
        this.q = str;
        String string2 = bundle.getString("title");
        String str2 = string2 == null ? "" : string2;
        String string3 = bundle.getString(TtmlNode.TAG_LAYOUT);
        this.r = string3 != null ? string3 : "";
        SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info");
        this.s = searchStatsLoggingInfo;
        this.t = new bcd();
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        this.u = rzp0.d(bundle);
        u4a.a aVar = this.m.b;
        this.v = new fha(aVar.d, aVar.e, new b(((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 0), new a(((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0));
        cfi0 cfi0Var = new cfi0(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, cfi0Var);
        this.x = msy.a(lazyThreadSafetyMode, new wt30(this, 19));
        CatalogConfiguration catalogConfiguration = this.m.b.s;
        CatalogDataType catalogDataType = CatalogDataType.DATA_SYNTHETIC_SHOW_ALL;
        ShowAllListVh showAllListVh = (ShowAllListVh) catalogConfiguration.w(catalogDataType, i0(), null, new UIBlockList(str, i0(), catalogDataType, "", UserId.d, new ArrayList(), EmptySet.b, null, null, str2, EmptyList.b, null, null, null, null, null, null, null, null, null, false, null, false, null, null, false, null, null, null, null, 1072693248, null), this.m);
        this.y = showAllListVh;
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
        showAllListVh.h = searchStatsLoggingInfo;
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        mzp0 mzp0Var = this.u;
        if (mzp0Var != null) {
            UIBlockCatalog uIBlockCatalog = uIBlock instanceof UIBlockCatalog ? (UIBlockCatalog) uIBlock : null;
            boolean z = false;
            if (uIBlockCatalog != null && uIBlockCatalog.E) {
                z = true;
            }
            mzp0Var.c(z);
        }
        this.y.N6(uIBlock);
        if (mzp0Var != null) {
            mzp0Var.d(null);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        this.y.b(cfp0Var);
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.s;
        if (searchStatsLoggingInfo != null) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, searchStatsLoggingInfo.i, null, 16);
        }
        this.t.getClass();
        bcd.a(cfp0Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.y.k5(layoutInflater, viewGroup, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.y.L();
    }

    public final CatalogViewType i0() {
        CatalogViewType catalogViewType = CatalogViewType.DOUBLE_STACKED_LIST;
        String id = catalogViewType.getId();
        String str = this.r;
        if (epx.f(str, id) || epx.f(str, CatalogViewType.SLIDER_CARD.getId()) || epx.f(str, CatalogViewType.ARTIST_MERCH_SLIDER.getId())) {
            return catalogViewType;
        }
        if (epx.f(str, CatalogViewType.SLIDER_MINIMALISTIC_CARD.getId()) || epx.f(str, CatalogViewType.DOUBLE_STACKED_SLIDER_MINIMALISTIC_CARD.getId())) {
            return CatalogViewType.DOUBLE_STACKED_LIST_MINIMALISTIC_CARD;
        }
        if (epx.f(str, CatalogViewType.SLIDER_EVENT.getId())) {
            return CatalogViewType.STACKED_LIST;
        }
        CatalogViewType catalogViewType2 = CatalogViewType.TRIPLE_STACKED_SLIDER;
        return epx.f(str, catalogViewType2.getId()) ? catalogViewType2 : CatalogViewType.LIST;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.mba
    public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
        mba mbaVar = this.p;
        if (i == R.id.bookmark_btn) {
            if (mbaVar != null) {
                mbaVar.m(i, uIBlock, izsVar);
            }
        } else {
            if ((uIBlock != null ? uIBlock.e : null) == CatalogDataType.DATA_SYNTHETIC_SECTION) {
                this.m.b.b.c(false);
            } else if (mbaVar != null) {
                mbaVar.z(i, uIBlock);
            }
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        ShowAllListVh showAllListVh = this.y;
        ayn0 ayn0Var = showAllListVh.p;
        if (ayn0Var != null) {
            ayn0Var.b();
        }
        showAllListVh.t.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.y.onPause();
        this.v.b();
        if (((Boolean) this.w.getValue()).booleanValue()) {
            t8a t8aVar = (t8a) this.x.getValue();
            t8aVar.e = null;
            t8aVar.d.dispose();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.y.onResume();
        this.v.a();
        if (((Boolean) this.w.getValue()).booleanValue()) {
            ((t8a) this.x.getValue()).a();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        mzp0 mzp0Var = this.u;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        this.y.rg(th);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.y.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        mzp0 mzp0Var = this.u;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        this.y.ya();
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.toolbar) {
            this.y.s();
            return;
        }
        if ((uIBlock != null ? uIBlock.e : null) == CatalogDataType.DATA_SYNTHETIC_SECTION) {
            this.m.b.b.c(false);
            return;
        }
        String str = this.q;
        boolean B = brm0.B(str, "synthetic_playlist", false);
        mba mbaVar = this.p;
        if (!B) {
            if (mbaVar != null) {
                mbaVar.z(i, uIBlock);
                return;
            }
            return;
        }
        Serializer.c<UIBlockMusicPlaylist> cVar = UIBlockMusicPlaylist.CREATOR;
        hl10 e = new Regex("synthetic_playlist([-0-9]+)_([0-9]+)_(.+?)_(.+)").e(str);
        if (e != null) {
            AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = new AudioFromMusicCatalogInfo(null, Integer.valueOf(Integer.parseInt((String) ((hl10.a) e.b()).get(2))), Long.valueOf(Long.parseLong((String) ((hl10.a) e.b()).get(1))), false, null, 25, null);
            if (mbaVar != null) {
                mbaVar.q(i, uIBlock, audioFromMusicCatalogInfo);
            }
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
