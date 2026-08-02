package com.vk.search.ui.impl.catalog.roots;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchAllRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.CommonSearchResultsVh;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.music.SearchSuggestion;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.api.ui.VideoFeedDialogParams;
import com.vk.navigation.marked.FragmentWithGlobalSearch$EntryMethod;
import com.vk.search.ui.api.SearchInputMethod;
import com.vk.search.ui.api.SearchQuery;
import com.vk.search.ui.impl.catalog.SearchAllFeatureCatalogFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.subjects.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b9q0;
import xsna.bpn0;
import xsna.cfp0;
import xsna.cqm0;
import xsna.dfp0;
import xsna.drg;
import xsna.epx;
import xsna.f5z;
import xsna.fha;
import xsna.fpf0;
import xsna.fxc0;
import xsna.gmq;
import xsna.gpt0;
import xsna.hwg0;
import xsna.iu1;
import xsna.izs;
import xsna.j5g;
import xsna.jv;
import xsna.k7m;
import xsna.kwg0;
import xsna.l3a;
import xsna.lt00;
import xsna.lz;
import xsna.m3a;
import xsna.m4r;
import xsna.m7m;
import xsna.msy;
import xsna.nhe;
import xsna.nuj;
import xsna.o5a;
import xsna.orp;
import xsna.pce;
import xsna.pgc;
import xsna.q3a;
import xsna.q530;
import xsna.qyh0;
import xsna.rsg0;
import xsna.rz00;
import xsna.s3q0;
import xsna.sz00;
import xsna.t1u;
import xsna.trf;
import xsna.tu00;
import xsna.u1u;
import xsna.u4a;
import xsna.up2;
import xsna.v1u;
import xsna.wh1;
import xsna.wqf;
import xsna.wy0;
import xsna.x0a;
import xsna.xis;
import xsna.xsq;
import xsna.xv0;
import xsna.xxf0;
import xsna.y710;
import xsna.ydt0;
import xsna.yfb;
import xsna.z0h;
import xsna.zmc;
import xsna.zqh0;

/* compiled from: GlobalSearchAllCatalogRootVh.kt */
/* loaded from: classes5.dex */
public final class GlobalSearchAllCatalogRootVh extends GlobalSearchFeatureCatalogRootVh {
    public final x0a A;
    public final io.reactivex.rxjava3.disposables.b B;
    public final qyh0 C;
    public final bpn0 u;
    public final fha v;
    public final Object w;
    public final lt00 x;
    public final Object y;
    public final zmc z;

    /* compiled from: GlobalSearchAllCatalogRootVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FragmentWithGlobalSearch$EntryMethod.values().length];
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.OtherTab.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.FeedScreenSearchIcon.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.HomeBottomIconLongTap.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.SuperAppScreenSearchIcon.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.SuperAppScreenQueryView.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.SuperAppBottomIconLongTap.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.LeftTabletMenuSearchIconClick.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.OverviewScreenSearchIcon.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FragmentWithGlobalSearch$EntryMethod.OverviewBottomIconLongTap.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: GlobalSearchAllCatalogRootVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<l3a, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(l3a l3aVar) {
            VideoFile videoFile;
            UIBlockMarketItem.a aVar;
            String str;
            Good good;
            l3a l3aVar2 = l3aVar;
            GlobalSearchAllCatalogRootVh globalSearchAllCatalogRootVh = (GlobalSearchAllCatalogRootVh) this.receiver;
            Activity activity = globalSearchAllCatalogRootVh.b;
            u4a u4aVar = globalSearchAllCatalogRootVh.m;
            if (l3aVar2 instanceof tu00) {
                tu00 tu00Var = (tu00) l3aVar2;
                UIBlock uIBlock = tu00Var.a;
                Good good2 = tu00Var.b;
                String r = ((dfp0) uIBlock).r();
                boolean z = uIBlock instanceof UIBlockMarketItem;
                if (z) {
                    aVar = new UIBlockMarketItem.a(good2, r, tu00Var.c);
                } else {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException(String.valueOf(uIBlock)));
                    aVar = null;
                }
                if (aVar != null) {
                    u4aVar.b.f.a(new cfp0(uIBlock, aVar));
                }
                SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
                UIBlockMarketItem uIBlockMarketItem = z ? (UIBlockMarketItem) uIBlock : null;
                if (uIBlockMarketItem == null || (good = uIBlockMarketItem.y) == null || (str = good.d0) == null) {
                    str = uIBlock.f;
                }
                ((sz00) globalSearchAllCatalogRootVh.y.getValue()).e(activity, new rz00(good2, CommonMarketStat$TypeRefSource.SEARCH_GLOBAL, good2.d0, tu00Var.c, searchStatInfoProvider.b(SchemeStat$EventItem.Type.MARKET_ITEM, str, false), null, null, null, null, null, null, null, null, null, null, null, 65504));
            } else if (l3aVar2 instanceof SearchEntityVideoPlaylistAnswerVh.a) {
                SearchEntityVideoPlaylistAnswerVh.a aVar2 = (SearchEntityVideoPlaylistAnswerVh.a) l3aVar2;
                UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = aVar2.a;
                UserId userId = aVar2.b;
                int i = aVar2.c;
                x0a x0aVar = globalSearchAllCatalogRootVh.A;
                List<VideoFile> list = uIBlockActionPlayVideosFromBlock.C;
                if (list != null && (videoFile = (VideoFile) j5g.a0(list)) != null) {
                    SearchStatInfoProvider searchStatInfoProvider2 = u4aVar.b.m;
                    SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO;
                    String r2 = videoFile.r();
                    if (r2 == null) {
                        r2 = "";
                    }
                    SearchStatsLoggingInfo b = searchStatInfoProvider2.b(type, r2, false);
                    if (videoFile.isEmpty() || !(videoFile.w8() || videoFile.isExternal())) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (!((VideoFile) obj).w8()) {
                                arrayList.add(obj);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (epx.f(((VideoFile) it.next()).r1(), videoFile.r1())) {
                                break;
                            }
                            i2++;
                        }
                        int i3 = i2 < 0 ? 0 : i2;
                        VideoFile videoFile2 = (VideoFile) j5g.b0(i3, arrayList);
                        if (videoFile2 != null) {
                            if (gpt0.c(activity)) {
                                ydt0 Y = fxc0.B().Y();
                                Activity activity2 = globalSearchAllCatalogRootVh.b;
                                VideoFile videoFile3 = (VideoFile) arrayList.get(i3);
                                x0a.b(x0aVar, videoFile2, 2);
                                Y.i(activity2, videoFile3, new VideoFeedDialogParams.Playlist("", null, i, userId, arrayList, null, i3, uIBlockActionPlayVideosFromBlock.z, 0, b, false, null, 3360, null));
                            } else {
                                ydt0.s(fxc0.B().Y(), globalSearchAllCatalogRootVh.b, videoFile2, x0a.b(x0aVar, videoFile2, 2), false, b, null, null, null, null, 16288);
                            }
                        }
                    } else {
                        fxc0.B().Y().k(globalSearchAllCatalogRootVh.b, videoFile, (r43 & 4) != 0 ? null : null, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : b, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                    }
                }
            }
            return s3q0.a;
        }
    }

    public GlobalSearchAllCatalogRootVh() {
        throw null;
    }

    public GlobalSearchAllCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar, zqh0 zqh0Var, SearchAllFeatureCatalogFragment searchAllFeatureCatalogFragment) {
        super(bundle, fragmentActivity, o5aVar, zqh0Var, searchAllFeatureCatalogFragment);
        FragmentWithGlobalSearch$EntryMethod.a aVar = FragmentWithGlobalSearch$EntryMethod.Companion;
        this.u = new bpn0(new wy0(this, fragmentActivity, bundle, 2));
        u4a.a aVar2 = this.m.b;
        this.v = new fha(aVar2.d, aVar2.e, new u1u(((k7m) m7m.f(this)).a(fpf0.a(StoryViewerComponent.class)), StoryViewerComponent.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", 0), new v1u(((k7m) m7m.f(this)).a(fpf0.a(StoriesComponent.class)), StoriesComponent.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", 0));
        xv0 xv0Var = new xv0(10);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.w = msy.a(lazyThreadSafetyMode, xv0Var);
        this.x = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).l7();
        this.y = msy.a(lazyThreadSafetyMode, new nuj(this, 11));
        this.z = new zmc(new x0a(new z0h(this, 16), new drg(this, 18)), new wqf(this, 23));
        this.A = new x0a(new trf(this, 28), new pce(this, 29));
        this.B = new io.reactivex.rxjava3.disposables.b();
        this.C = new qyh0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final orp Q() {
        f5z f5zVar = this.d;
        if (f5zVar == null) {
            return null;
        }
        y710 y710Var = new y710(new xis(this, 4));
        q530 e = up2.e(y710Var, this.b, f5zVar, false);
        e.d(y710Var);
        return new pgc(e);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 28);
        UIBlock uIBlock = cfp0Var.a;
        UIBlockMarketItem uIBlockMarketItem = uIBlock instanceof UIBlockMarketItem ? (UIBlockMarketItem) uIBlock : null;
        if (uIBlockMarketItem == null) {
            return;
        }
        Object obj = cfp0Var.b;
        if (obj instanceof UIBlockMarketItem.b) {
            UIBlockMarketItem.b bVar = (UIBlockMarketItem.b) obj;
            Pair pair = new Pair(bVar.b, bVar.a);
            Integer num = (Integer) pair.d();
            gmq gmqVar = (gmq) pair.g();
            if (gmqVar instanceof MarketFavable) {
                this.x.d((MarketFavable) gmqVar, CommonMarketStat$TypeRefSource.SEARCH_GLOBAL, num, uIBlockMarketItem.y.d0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.a();
        View X = super.X(layoutInflater, viewGroup, null);
        m4r m4rVar = (m4r) this.w.getValue();
        CommonSearchResultsVh k0 = k0();
        m4rVar.getClass();
        m4r.a(k0, this.m);
        return X;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.v.b();
        this.B.e();
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c f0(m3a m3aVar) {
        f fVar = (f) m3aVar.b;
        lz lzVar = new lz(new b(1, this, GlobalSearchAllCatalogRootVh.class, "handleCatalogClickEvent", "handleCatalogClickEvent(Lcom/vk/catalog2/common/ui/core/events/click/CatalogClickEvent;)V", 0), 16);
        int i = kwg0.a;
        return fVar.subscribe(lzVar, new hwg0());
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c h0(q3a q3aVar) {
        return q3aVar.a().subscribe(new iu1(new nhe(this, 28), 20));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final SearchRequestFactory i0() {
        return (CatalogGetSearchAllRequestFactory) this.u.getValue();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh
    public final MobileOfficialAppsCoreNavStat$EventScreen l0() {
        return MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_ALL;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.search.GlobalSearchFeatureCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        String str;
        if (i == R.id.search_suggestion) {
            UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion != null) {
                SearchSuggestion searchSuggestion = uIBlockSearchSuggestion.y;
                this.p.e(new SearchQuery(searchSuggestion.c, SearchInputMethod.Suggest, cqm0.a(searchSuggestion.f), cqm0.a(searchSuggestion.k)), b9q0.a.a);
                return;
            }
            return;
        }
        u4a u4aVar = this.m;
        if (i == R.id.search_suggestion_close) {
            UIBlockSearchSuggestion uIBlockSearchSuggestion2 = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
            if (uIBlockSearchSuggestion2 != null) {
                SearchSuggestion searchSuggestion2 = uIBlockSearchSuggestion2.y;
                m1 T = rsg0.T(yfb.x(this.C.b(searchSuggestion2.k, searchSuggestion2.b)));
                new xsq(5);
                this.B.b(T.subscribe(new t1u(), new jv(new wh1(21), 23)));
                u4aVar.b.e.b(new xxf0(uIBlockSearchSuggestion2.Fb()), false);
                return;
            }
            return;
        }
        if (i != R.id.content || uIBlock == null) {
            return;
        }
        SearchStatInfoProvider searchStatInfoProvider = u4aVar.b.m;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIP;
        UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
        if (uIBlockVideo == null || (str = uIBlockVideo.B.r()) == null) {
            str = "";
        }
        this.z.a(this.b, uIBlock, searchStatInfoProvider.b(type, str, false));
    }
}
