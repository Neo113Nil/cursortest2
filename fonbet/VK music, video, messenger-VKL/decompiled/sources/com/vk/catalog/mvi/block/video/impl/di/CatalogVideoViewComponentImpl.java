package com.vk.catalog.mvi.block.video.impl.di;

import android.content.Context;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogHintDto;
import com.vk.api.generated.catalog.dto.CatalogLayoutDto;
import com.vk.api.generated.catalog.dto.CatalogStatInfoItemDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsListView$AlbumHorizontalState;
import com.vk.catalog.mvi.block.video.impl.albums.AlbumsSliderView$AlbumVerticalState;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import com.vk.catalog.mvi.block.video.impl.downloaded.DownloadedSliderView$DownloadedSliderState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.actors.MovieActorsView$MovieActorsState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.description.MovieDescriptionView$MovieDescriptionState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.header.entities.MovieHeaderBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.info.MovieInfoView$MovieInfoBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.poster.MoviePosterView$MoviePosterBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.MovieRatingsView$MovieRatingsBlockState;
import com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.c;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.DraftShortVideoListView;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.d;
import com.vk.catalog.mvi.block.video.impl.p002short.draft.f;
import com.vk.catalog.mvi.block.video.impl.upload.UploadListView$UploadListState;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog.mvi.block.video.impl.video.list.VideosListView$State;
import com.vk.catalog.mvi.block.video.impl.video.stackedlist.VideosStackedListView$State;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog.mvi.block.video.impl.video.video.VideoView$State;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VerticalVideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VideoCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.di.component.DiScopedComponent;
import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.donut.video.model.presentation.cardsize.DonutVideoCardSource;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.acq0;
import xsna.ad30;
import xsna.af30;
import xsna.ap1;
import xsna.ar1;
import xsna.bcq0;
import xsna.bd30;
import xsna.bia;
import xsna.c8m;
import xsna.ce30;
import xsna.cf30;
import xsna.cg50;
import xsna.cia;
import xsna.cp1;
import xsna.cqt0;
import xsna.cr1;
import xsna.d9f;
import xsna.dcq0;
import xsna.dia;
import xsna.dot0;
import xsna.dp1;
import xsna.dqt0;
import xsna.dr1;
import xsna.e43;
import xsna.e53;
import xsna.ee30;
import xsna.ef30;
import xsna.eia;
import xsna.ep;
import xsna.er1;
import xsna.er4;
import xsna.ert0;
import xsna.f1u;
import xsna.f25;
import xsna.f2a;
import xsna.f53;
import xsna.f5o;
import xsna.fd30;
import xsna.fe30;
import xsna.fia;
import xsna.fks0;
import xsna.fp;
import xsna.fpf0;
import xsna.fr1;
import xsna.fr4;
import xsna.g25;
import xsna.g2a;
import xsna.g7s0;
import xsna.g8a;
import xsna.g8m;
import xsna.gbo;
import xsna.gd30;
import xsna.ge30;
import xsna.gf30;
import xsna.gia;
import xsna.gkt0;
import xsna.h25;
import xsna.h7v;
import xsna.hd30;
import xsna.hdt0;
import xsna.hf30;
import xsna.hia;
import xsna.hpf0;
import xsna.hrs0;
import xsna.i25;
import xsna.id30;
import xsna.iia;
import xsna.iqt0;
import xsna.irs0;
import xsna.j25;
import xsna.je30;
import xsna.je5;
import xsna.jia;
import xsna.jqt0;
import xsna.jrs0;
import xsna.k25;
import xsna.kbj0;
import xsna.kd30;
import xsna.ke5;
import xsna.kia;
import xsna.l5o;
import xsna.le30;
import xsna.le5;
import xsna.lia;
import xsna.lrs0;
import xsna.m15;
import xsna.m1k0;
import xsna.m66;
import xsna.m7a;
import xsna.ma3;
import xsna.mbo;
import xsna.md30;
import xsna.mdo;
import xsna.me30;
import xsna.mia;
import xsna.mm80;
import xsna.mmt0;
import xsna.msy;
import xsna.n66;
import xsna.nbo;
import xsna.nd30;
import xsna.ne30;
import xsna.ne5;
import xsna.nia;
import xsna.nmt0;
import xsna.nu2;
import xsna.nwy;
import xsna.o45;
import xsna.o66;
import xsna.o8a;
import xsna.od30;
import xsna.oia;
import xsna.ott0;
import xsna.pbo;
import xsna.pia;
import xsna.pwj0;
import xsna.q12;
import xsna.qc30;
import xsna.qcy;
import xsna.qe5;
import xsna.qej;
import xsna.qia;
import xsna.qwe;
import xsna.qzv0;
import xsna.r30;
import xsna.rd30;
import xsna.re30;
import xsna.re5;
import xsna.ria;
import xsna.rpt0;
import xsna.rtt0;
import xsna.s2a;
import xsna.sb8;
import xsna.sc30;
import xsna.se30;
import xsna.sia;
import xsna.smk;
import xsna.so1;
import xsna.srs0;
import xsna.stt0;
import xsna.sz2;
import xsna.tb8;
import xsna.tc30;
import xsna.td30;
import xsna.tia;
import xsna.tmt0;
import xsna.to1;
import xsna.tpt0;
import xsna.tq1;
import xsna.trs0;
import xsna.tyr0;
import xsna.ub8;
import xsna.ubq0;
import xsna.uc30;
import xsna.ud30;
import xsna.ue30;
import xsna.umt0;
import xsna.uo1;
import xsna.uq1;
import xsna.urs0;
import xsna.v5s0;
import xsna.v8f;
import xsna.vb8;
import xsna.vbq0;
import xsna.vd30;
import xsna.vds0;
import xsna.vmt0;
import xsna.vo1;
import xsna.vq1;
import xsna.vst0;
import xsna.vv8;
import xsna.vyd;
import xsna.vyr0;
import xsna.w3k0;
import xsna.w5s0;
import xsna.wbq0;
import xsna.we30;
import xsna.wmt0;
import xsna.wq1;
import xsna.wrs0;
import xsna.wst0;
import xsna.wzs;
import xsna.x4o;
import xsna.xbq0;
import xsna.xe30;
import xsna.xrs0;
import xsna.xst0;
import xsna.yd30;
import xsna.ydt0;
import xsna.ye30;
import xsna.yo1;
import xsna.yqs0;
import xsna.yrs0;
import xsna.zbq0;
import xsna.zc30;
import xsna.zd30;
import xsna.zd5;
import xsna.zdf;
import xsna.ze30;
import xsna.zo1;

/* compiled from: CatalogVideoViewComponentImpl.kt */
/* loaded from: classes.dex */
public final class CatalogVideoViewComponentImpl implements CatalogVideoViewComponent {
    public static final /* synthetic */ qcy<Object>[] y;
    public final nwy a;
    public final nwy b;
    public final nwy c;
    public final nwy d;
    public final nwy e;
    public final nwy f;
    public final nwy g;
    public final nwy h;
    public final nwy i;
    public final nwy j;
    public final nwy k;
    public final nwy l;
    public final nwy n;
    public final nwy o;
    public final nwy p;
    public final nwy q;
    public final nwy r;
    public final nwy s;
    public final nwy t;
    public final nwy u;
    public final nwy v;
    public final nwy w;
    public final nwy m = new nwy(new e53(2));
    public final nwy x = new nwy(new vv8(2));

    /* compiled from: CatalogVideoViewComponentImpl.kt */
    public static final class a implements c8m<CatalogVideoViewComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            g25 g25Var = new g25(g8mVar, 1);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            Lazy a = msy.a(lazyThreadSafetyMode, g25Var);
            Lazy a2 = msy.a(lazyThreadSafetyMode, new sia(g8mVar, 0));
            Lazy a3 = msy.a(lazyThreadSafetyMode, new tia(g8mVar, 0));
            Lazy a4 = msy.a(lazyThreadSafetyMode, new h25(g8mVar, 1));
            Lazy a5 = msy.a(lazyThreadSafetyMode, new i25(g8mVar, 1));
            Lazy a6 = msy.a(lazyThreadSafetyMode, new j25(g8mVar, 1));
            Lazy a7 = msy.a(lazyThreadSafetyMode, new k25(g8mVar, 1));
            Lazy a8 = msy.a(lazyThreadSafetyMode, new iia(g8mVar, 0));
            Lazy a9 = msy.a(lazyThreadSafetyMode, new jia(g8mVar, 0));
            msy.a(lazyThreadSafetyMode, new kia(g8mVar, 0));
            return new CatalogVideoViewComponentImpl(a, a2, a3, a4, a5, a6, a7, a8, a9, msy.a(lazyThreadSafetyMode, new lia(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new mia(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new nia(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new oia(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new pia(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new qia(g8mVar, 0)), msy.a(lazyThreadSafetyMode, new ria(g8mVar, 0)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(CatalogVideoViewComponentImpl.class, "globalCatalogBlockRegister", "getGlobalCatalogBlockRegister()Lcom/vk/catalog/mvi/register/GlobalCatalogBlockRegister;", 0);
        hpf0 hpf0Var = fpf0.a;
        y = new qcy[]{propertyReference1Impl, fp.c(0, CatalogVideoViewComponentImpl.class, "catalogInteractor", "getCatalogInteractor()Lcom/vk/catalog/mvi/section/domain/CatalogInteractor;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "legacyCatalogBlockRegister", "getLegacyCatalogBlockRegister()Lcom/vk/catalog/mvi/legacy/api/CatalogLegacyBlockRegister;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoRestrictionManager", "getVideoRestrictionManager()Lcom/vk/restriction/domain/VideoRestrictionManager;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "applicationContext", "getApplicationContext()Landroid/content/Context;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "smallVideoFormatter", "getSmallVideoFormatter()Lcom/vk/catalog/mvi/block/video/impl/video/SmallVideoFormatter;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "donutVideoActionHandler", "getDonutVideoActionHandler()Lcom/vk/donut/video/api/presentation/handler/donutaction/DonutVideoActionHandler;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "donutVideoUiModelProvider", "getDonutVideoUiModelProvider()Lcom/vk/donut/video/api/presentation/provider/DonutVideoUiModelProvider;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "donutFeaturesRepository", "getDonutFeaturesRepository()Lcom/vk/donut/video/api/domain/repository/feature/DonutVideoFeaturesRepository;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "donutVideoFeaturesRepository", "getDonutVideoFeaturesRepository()Lcom/vk/donut/video/api/domain/repository/feature/DonutVideoFeaturesRepository;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoTimerInteractor", "getVideoTimerInteractor()Lcom/vk/libvideo/api/VideoTimerInteractor;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoFocusInteractor", "getVideoFocusInteractor()Lcom/vk/video/focus/api/VideoFocusInteractor;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "hintsManager", "getHintsManager()Lcom/vk/hints/api/HintsManager;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "sharingBridge", "getSharingBridge()Lcom/vk/bridges/SharingBridge;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoApiHelperRepository", "getVideoApiHelperRepository()Lcom/vk/libvideo/repositories/VideoApiHelperRepository;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoAdFreeSubscriptionInteractor", "getVideoAdFreeSubscriptionInteractor()Lcom/vk/libvideo/adfree/api/domain/VideoAdFreeSubscriptionInteractor;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoAdFreeSubscriptionLauncher", "getVideoAdFreeSubscriptionLauncher()Lcom/vk/libvideo/adfree/api/di/VideoAdFreeSubscriptionLauncher;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "videoAdFreeStatsTracker", "getVideoAdFreeStatsTracker()Lcom/vk/libvideo/adfree/api/VideoAdFreeStatsTracker;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "clipsPrivacyProvider", "getClipsPrivacyProvider()Lcom/vk/clips/edit/privacy/ClipsPrivacy;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "clipsEditorNavigator", "getClipsEditorNavigator()Lcom/vk/camera/clips/api/di/ClipsEditorNavigator;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "clipsTemplatesNavigator", "getClipsTemplatesNavigator()Lcom/vk/clips/editor/templates/api/main/ClipsTemplatesFlowNavigator;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "clipsTemplatesEditorProvider", "getClipsTemplatesEditorProvider()Lcom/vk/clips/editor/templates/api/main/ClipsTemplatesEditorProvider;", hpf0Var), ep.a(0, CatalogVideoViewComponentImpl.class, "clipsActionTracker", "getClipsActionTracker()Lcom/vk/libvideo/bottomsheet/draftclip/VkVideoClipsActionTracker;", hpf0Var)};
    }

    public CatalogVideoViewComponentImpl(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16) {
        this.a = new nwy(new sz2(lazy, 1));
        this.b = new nwy(new m15(lazy2, 1));
        this.c = new nwy(new sb8(lazy3, 1));
        this.d = new nwy(new tb8(lazy4, 1));
        this.e = new nwy(new ub8(lazy6, 1));
        this.f = new nwy(new fia(0, lazy7, lazy8));
        this.g = new nwy(new gia(lazy10, 0));
        this.h = new nwy(new hia(lazy10, 0));
        this.i = new nwy(new m66(lazy10, 1));
        this.j = new nwy(new n66(lazy10, 1));
        this.k = new nwy(new vb8(lazy11, 1));
        this.l = new nwy(new o66(lazy12, 1));
        this.n = new nwy(new f53(lazy14, 4));
        this.o = new nwy(new er4(lazy14, 2));
        this.p = new nwy(new fr4(lazy13, 2));
        this.q = new nwy(new r30(lazy5, 2));
        this.r = new nwy(new f25(lazy5, 1));
        this.s = new nwy(new q12(lazy5, 2));
        this.t = new nwy(new bia(lazy9, 0));
        this.u = new nwy(new cia(lazy15, 0));
        this.v = new nwy(new dia(lazy16, 0));
        this.w = new nwy(new eia(lazy16, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Context Df() {
        qcy<Object> qcyVar = y[4];
        return (Context) this.e.c();
    }

    public final m7a Ef() {
        qcy<Object> qcyVar = y[1];
        return (m7a) this.b.c();
    }

    public final qwe Ff() {
        qcy<Object> qcyVar = y[19];
        return (qwe) this.t.c();
    }

    public final x4o Gf() {
        qcy<Object> qcyVar = y[6];
        return (x4o) this.g.c();
    }

    public final l5o Hf() {
        qcy<Object> qcyVar = y[7];
        return (l5o) this.h.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f1u If() {
        qcy<Object> qcyVar = y[0];
        return (f1u) this.a.c();
    }

    public final com.vk.catalog.mvi.legacy.api.a Jf() {
        qcy<Object> qcyVar = y[2];
        return (com.vk.catalog.mvi.legacy.api.a) this.c.c();
    }

    public final kbj0 Kf() {
        qcy<Object> qcyVar = y[14];
        return (kbj0) this.o.c();
    }

    @Override // com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent
    public final void L5(cg50 cg50Var) {
        final boolean Y0 = Lf().J().Y0();
        qcy<Object> qcyVar = y[9];
        boolean a2 = ((f5o) this.j.c()).a();
        final boolean z = Df().getResources().getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver);
        hdt0 Nf = Nf();
        m7a Ef = Ef();
        x4o Gf = Gf();
        final l5o Hf = Hf();
        Context Df = Df();
        List l = e43.l(CatalogBlockVariant.VideosSliderLargeStyle, CatalogBlockVariant.VideosSliderLibrary, CatalogBlockVariant.VideosSliderLikedLibrary, CatalogBlockVariant.VideosSliderFavoritesLibrary, CatalogBlockVariant.VideosSlider, CatalogBlockVariant.VideosShowcaseWithDescription);
        f2a<?> f2aVar = new f2a() { // from class: xsna.upt0
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
            @Override // xsna.f2a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
                Object obj;
                String str;
                Integer s1;
                CatalogBlockVariant catalogBlockVariant2;
                DonutVideoCardSource donutVideoCardSource;
                Object obj2;
                List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
                List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
                List<String> f3 = catalogBlockDto.f3();
                if (f3 == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : f3) {
                    List<VideoVideoFullDto> p = catalogExtraResponseObjectDto.p();
                    VideoView$State videoView$State = null;
                    if (p != null) {
                        Iterator<T> it = p.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) obj;
                            StringBuilder sb = new StringBuilder();
                            UserId q = videoVideoFullDto.q();
                            sb.append(q != null ? Long.valueOf(q.b) : null);
                            sb.append('_');
                            sb.append(videoVideoFullDto.s1());
                            if (epx.f(str2, sb.toString())) {
                                break;
                            }
                        }
                        VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) obj;
                        if (videoVideoFullDto2 != null) {
                            List<CatalogStatInfoItemDto> M2 = catalogBlockDto.M2();
                            if (M2 != null) {
                                Iterator<T> it2 = M2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (epx.f(((CatalogStatInfoItemDto) obj2).d(), str2)) {
                                        break;
                                    }
                                }
                                CatalogStatInfoItemDto catalogStatInfoItemDto = (CatalogStatInfoItemDto) obj2;
                                if (catalogStatInfoItemDto != null) {
                                    str = catalogStatInfoItemDto.r();
                                    VideoVideoFullDto a3 = str == null ? VideoVideoFullDto.a(videoVideoFullDto2, str) : videoVideoFullDto2;
                                    s1 = videoVideoFullDto2.s1();
                                    if (s1 != null) {
                                        int intValue = s1.intValue();
                                        VideoFile videoFile = (VideoFile) j5g.a0(ums0.e(ums0.a, Collections.singletonList(a3), n, g, Y0, 20));
                                        if (videoFile != null) {
                                            DonutVideoModel a4 = nkt0.a(videoFile);
                                            if (z) {
                                                donutVideoCardSource = DonutVideoCardSource.LARGE_CARD;
                                                catalogBlockVariant2 = catalogBlockVariant;
                                            } else {
                                                catalogBlockVariant2 = catalogBlockVariant;
                                                donutVideoCardSource = catalogBlockVariant2 == CatalogBlockVariant.VideosSlider ? DonutVideoCardSource.LARGE_CARD : DonutVideoCardSource.SMALL_CARD;
                                            }
                                            DonutVideoUiModel a5 = Hf.a(a4, donutVideoCardSource);
                                            BlockId.CompositeId b = com.vk.catalog.mvi.block.a.b(intValue, catalogBlockDto.getId());
                                            String url = catalogBlockDto.getUrl();
                                            if (url == null) {
                                                url = "";
                                            }
                                            videoView$State = new VideoView$State(b, catalogBlockVariant2, videoFile, str, url, a5);
                                        }
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                            s1 = videoVideoFullDto2.s1();
                            if (s1 != null) {
                            }
                        }
                    }
                    if (videoView$State != null) {
                        arrayList.add(videoView$State);
                    }
                }
                return arrayList;
            }
        };
        tpt0 tpt0Var = new tpt0(Ef, Nf);
        ert0 ert0Var = new ert0(z, a2, Df, Nf);
        cqt0 cqt0Var = new cqt0(Nf, Gf);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            cg50Var.a((CatalogBlockVariant) it.next(), f2aVar);
        }
        cg50Var.c(VideoView$State.class, new jqt0(tpt0Var, 0));
        cg50Var.h(VideoView$State.class, ert0Var);
        cg50Var.g(dqt0.class, cqt0Var);
        List l2 = e43.l(CatalogBlockVariant.AlbumsSlider, CatalogBlockVariant.AlbumsSliderLibrary, CatalogBlockVariant.AlbumsSliderProfile);
        vq1 vq1Var = new vq1();
        fr1 fr1Var = fr1.b;
        tq1 tq1Var = new tq1(z);
        ar1 ar1Var = new ar1();
        Iterator it2 = l2.iterator();
        while (it2.hasNext()) {
            cg50Var.a((CatalogBlockVariant) it2.next(), vq1Var);
        }
        cg50Var.c(AlbumsSliderView$AlbumVerticalState.class, new er1(fr1Var));
        cg50Var.h(AlbumsSliderView$AlbumVerticalState.class, tq1Var);
        cg50Var.g(wq1.class, ar1Var);
        if (Lf().J().s0()) {
            ClipListView.c(cg50Var, Ff(), Lf());
        } else {
            ShortVideoListView.b(cg50Var, Ff(), Lf());
        }
        le30 le30Var = new le30(Lf().Y());
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.MoviePostersSlider;
        ne30 ne30Var = new ne30();
        af30 af30Var = af30.b;
        cf30 cf30Var = new cf30();
        re30 re30Var = new re30(le30Var);
        cg50Var.a(catalogBlockVariant, ne30Var);
        cg50Var.c(MoviePosterView$MoviePosterBlockState.class, new ze30(af30Var));
        cg50Var.h(MoviePosterView$MoviePosterBlockState.class, cf30Var);
        cg50Var.g(se30.class, re30Var);
        ydt0 Y = Lf().Y();
        m7a Ef2 = Ef();
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.AuthorsGroupsSliderHorizontal;
        le5 le5Var = new le5();
        je5 je5Var = new je5(Ef2, 0);
        ke5 ke5Var = new ke5();
        qe5 qe5Var = new qe5(new zd5(Y));
        cg50Var.a(catalogBlockVariant2, le5Var);
        cg50Var.c(AuthorsChannelSliderView$AuthorsChannelState.class, new re5(je5Var));
        cg50Var.h(AuthorsChannelSliderView$AuthorsChannelState.class, ke5Var);
        cg50Var.g(ne5.class, qe5Var);
    }

    public final g7s0 Lf() {
        qcy<Object> qcyVar = y[12];
        return (g7s0) this.m.c();
    }

    public final com.vk.video.focus.api.a Mf() {
        qcy<Object> qcyVar = y[11];
        return (com.vk.video.focus.api.a) this.l.c();
    }

    public final hdt0 Nf() {
        qcy<Object> qcyVar = y[3];
        return (hdt0) this.d.c();
    }

    @Override // com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent
    public final vds0 Oa() {
        return new vds0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent
    public final void Q() {
        final boolean z = Df().getResources().getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver);
        final boolean Y0 = Lf().J().Y0();
        final boolean z2 = Df().getResources().getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver);
        f1u If = If();
        hdt0 Nf = Nf();
        x4o Gf = Gf();
        Context Df = Df();
        final g7s0 Lf = Lf();
        m7a Ef = Ef();
        final l5o Hf = Hf();
        qcy<Object>[] qcyVarArr = y;
        qcy<Object> qcyVar = qcyVarArr[5];
        nwy nwyVar = this.f;
        w3k0 w3k0Var = (w3k0) nwyVar.c();
        qcy<Object> qcyVar2 = qcyVarArr[8];
        nwy nwyVar2 = this.i;
        final f5o f5oVar = (f5o) nwyVar2.c();
        qcy<Object> qcyVar3 = qcyVarArr[13];
        final h7v h7vVar = (h7v) this.n.c();
        List l = e43.l(CatalogBlockVariant.VideosList, CatalogBlockVariant.VideosListVisibleAuthors);
        f2a<?> f2aVar = new f2a() { // from class: xsna.tst0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[LOOP:2: B:34:0x00da->B:36:0x00e0, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
            /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
            @Override // xsna.f2a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
                ?? r2;
                List<CatalogHintDto> i;
                Object obj;
                String str;
                VideoVideoFullDto videoVideoFullDto;
                Iterator it;
                Object obj2;
                VideoVideoFullDto videoVideoFullDto2;
                Object obj3;
                List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
                List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
                List<String> f3 = catalogBlockDto.f3();
                if (f3 != null) {
                    r2 = new ArrayList();
                    for (String str2 : f3) {
                        List<VideoVideoFullDto> p = catalogExtraResponseObjectDto.p();
                        if (p != null) {
                            Iterator it2 = p.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it2.next();
                                VideoVideoFullDto videoVideoFullDto3 = (VideoVideoFullDto) obj3;
                                StringBuilder sb = new StringBuilder();
                                UserId q = videoVideoFullDto3.q();
                                sb.append(q != null ? Long.valueOf(q.b) : null);
                                sb.append('_');
                                sb.append(videoVideoFullDto3.s1());
                                if (epx.f(str2, sb.toString())) {
                                    break;
                                }
                            }
                            videoVideoFullDto2 = (VideoVideoFullDto) obj3;
                        } else {
                            videoVideoFullDto2 = null;
                        }
                        if (videoVideoFullDto2 != null) {
                            r2.add(videoVideoFullDto2);
                        }
                    }
                } else {
                    r2 = EmptyList.b;
                }
                if (h7v.this.m(HintId.VIDEO_PIN_FOLLOWERS) && (i = catalogExtraResponseObjectDto.i()) != null) {
                    Iterator it3 = i.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        if (epx.f(((CatalogHintDto) obj).getId(), HintId.VIDEO_PIN_FOLLOWERS.getId())) {
                            break;
                        }
                    }
                    CatalogHintDto catalogHintDto = (CatalogHintDto) obj;
                    if (catalogHintDto != null) {
                        String title = catalogHintDto.getTitle();
                        if (title == null) {
                            title = catalogHintDto.f();
                        }
                        if (title != null && !drm0.N(title)) {
                            str = title;
                            Iterable<VideoVideoFullDto> iterable = (Iterable) r2;
                            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                            for (VideoVideoFullDto videoVideoFullDto4 : iterable) {
                                arrayList.add(new Pair(videoVideoFullDto4, (VideoFile) j5g.Y(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto4), n, g, Y0, 20))));
                            }
                            if (str != null) {
                                Iterator it4 = arrayList.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it4.next();
                                    VideoFile videoFile = (VideoFile) ((Pair) obj2).g();
                                    Boolean Aa = videoFile.Aa();
                                    Boolean bool = Boolean.TRUE;
                                    if (epx.f(Aa, bool) && !epx.f(videoFile.Q(), bool)) {
                                        break;
                                    }
                                }
                                Pair pair = (Pair) obj2;
                                if (pair != null) {
                                    videoVideoFullDto = (VideoVideoFullDto) pair.i();
                                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        Pair pair2 = (Pair) it.next();
                                        VideoVideoFullDto videoVideoFullDto5 = (VideoVideoFullDto) pair2.d();
                                        VideoFile videoFile2 = (VideoFile) pair2.g();
                                        BlockId.CompositeId c = com.vk.catalog.mvi.block.a.c(catalogBlockDto.getId(), videoFile2.r1());
                                        UserId q2 = catalogBlockDto.n1().q();
                                        if (q2 == null) {
                                            q2 = UserId.d;
                                        }
                                        UserId userId = q2;
                                        String title2 = videoVideoFullDto5.getTitle();
                                        String str3 = title2 == null ? "" : title2;
                                        String url = catalogBlockDto.getUrl();
                                        String str4 = url == null ? "" : url;
                                        DonutVideoModel a2 = nkt0.a(videoFile2);
                                        boolean z3 = z2;
                                        DonutVideoUiModel a3 = Hf.a(a2, z3 ? DonutVideoCardSource.LARGE_CARD : DonutVideoCardSource.SMALL_CARD);
                                        f5o f5oVar2 = f5oVar;
                                        boolean z4 = false;
                                        if (f5oVar2 != null && f5oVar2.a()) {
                                            z4 = true;
                                        }
                                        arrayList2.add(new VideosListView$State(c, catalogBlockVariant, userId, str3, videoFile2, str4, false, z3, a3, kpt0.h(videoFile2, z4, Lf.J().Y1()), videoVideoFullDto5.equals(videoVideoFullDto) ? str : null));
                                    }
                                    return arrayList2;
                                }
                            }
                            videoVideoFullDto = null;
                            ArrayList arrayList22 = new ArrayList(c5g.u(arrayList, 10));
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                            }
                            return arrayList22;
                        }
                    }
                }
                str = null;
                Iterable<VideoVideoFullDto> iterable2 = (Iterable) r2;
                ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
                while (r11.hasNext()) {
                }
                if (str != null) {
                }
                videoVideoFullDto = null;
                ArrayList arrayList222 = new ArrayList(c5g.u(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                }
                return arrayList222;
            }
        };
        ma3 ma3Var = new ma3(2, Ef, h7vVar);
        xst0 xst0Var = new xst0(Df, w3k0Var, Nf);
        com.vk.catalog.mvi.block.video.impl.video.list.a aVar = new com.vk.catalog.mvi.block.video.impl.video.list.a(Nf, Gf);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            If.a((CatalogBlockVariant) it.next(), f2aVar);
        }
        If.c(VideosListView$State.class, new wst0(ma3Var));
        If.h(VideosListView$State.class, xst0Var);
        If.g(vst0.class, aVar);
        f1u If2 = If();
        hdt0 Nf2 = Nf();
        Context Df2 = Df();
        final g7s0 Lf2 = Lf();
        m7a Ef2 = Ef();
        x4o Gf2 = Gf();
        final l5o Hf2 = Hf();
        qcy<Object> qcyVar4 = qcyVarArr[5];
        w3k0 w3k0Var2 = (w3k0) nwyVar.c();
        qcy<Object> qcyVar5 = qcyVarArr[8];
        f5o f5oVar2 = (f5o) nwyVar2.c();
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.VideosStackedList;
        f2a<?> f2aVar2 = new f2a() { // from class: xsna.mtt0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x001d A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList] */
            @Override // xsna.f2a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant2) {
                ?? r5;
                VideoVideoImageDto videoVideoImageDto;
                String url;
                VideoVideoFullDto videoVideoFullDto;
                Object obj;
                List<UsersUserFullDto> n = catalogExtraResponseObjectDto.n();
                List<GroupsGroupFullDto> g = catalogExtraResponseObjectDto.g();
                List<String> f3 = catalogBlockDto.f3();
                CatalogViewStyle catalogViewStyle = null;
                if (f3 != null) {
                    r5 = new ArrayList();
                    Iterator it2 = f3.iterator();
                    while (it2.hasNext()) {
                        String str = (String) j5g.k0(drm0.c0((String) it2.next(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                        if (str != null) {
                            int parseInt = Integer.parseInt(str);
                            List<VideoVideoFullDto> p = catalogExtraResponseObjectDto.p();
                            if (p != null) {
                                Iterator it3 = p.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it3.next();
                                    Integer s1 = ((VideoVideoFullDto) obj).s1();
                                    if (s1 != null && s1.intValue() == parseInt) {
                                        break;
                                    }
                                }
                                videoVideoFullDto = (VideoVideoFullDto) obj;
                                if (videoVideoFullDto == null) {
                                    r5.add(videoVideoFullDto);
                                }
                            }
                        }
                        videoVideoFullDto = null;
                        if (videoVideoFullDto == null) {
                        }
                    }
                } else {
                    r5 = EmptyList.b;
                }
                CatalogLayoutDto.StyleDto i = catalogBlockDto.n1().i();
                String i2 = i != null ? i.i() : null;
                CatalogLayoutDto.TypeDto l2 = catalogBlockDto.n1().l();
                if (epx.f(l2 != null ? l2.i() : null, CatalogLayoutDto.NameDto.SHORT_VIDEO_SLIDER.i())) {
                    catalogViewStyle = new VerticalVideoCatalogViewStyle(i2);
                } else if (epx.f(l2 != null ? l2.i() : null, CatalogLayoutDto.NameDto.SLIDER.i()) || Lf2.J().F1()) {
                    catalogViewStyle = new VideoCatalogViewStyle(i2);
                }
                CatalogViewStyle catalogViewStyle2 = catalogViewStyle;
                Iterable<VideoVideoFullDto> iterable = (Iterable) r5;
                ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
                for (VideoVideoFullDto videoVideoFullDto2 : iterable) {
                    VideoFile videoFile = (VideoFile) j5g.Y(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto2), n, g, Y0, 20));
                    ArrayList arrayList2 = arrayList;
                    String id = catalogBlockDto.getId();
                    Integer s12 = videoVideoFullDto2.s1();
                    BlockId.CompositeId b = com.vk.catalog.mvi.block.a.b(s12 != null ? s12.intValue() : 0, id);
                    UserId q = catalogBlockDto.n1().q();
                    if (q == null) {
                        q = UserId.d;
                    }
                    UserId userId = q;
                    String title = videoVideoFullDto2.getTitle();
                    String str2 = title == null ? "" : title;
                    List<VideoVideoImageDto> t1 = videoVideoFullDto2.t1();
                    String str3 = (t1 == null || (videoVideoImageDto = (VideoVideoImageDto) j5g.a0(t1)) == null || (url = videoVideoImageDto.getUrl()) == null) ? "" : url;
                    String url2 = catalogBlockDto.getUrl();
                    arrayList2.add(new VideosStackedListView$State(b, catalogBlockVariant2, userId, str2, str3, videoFile, url2 == null ? "" : url2, catalogViewStyle2, false, Hf2.a(nkt0.a(videoFile), DonutVideoCardSource.LARGE_CARD)));
                    arrayList = arrayList2;
                }
                return arrayList;
            }
        };
        o45 o45Var = new o45(Ef2, 4);
        stt0 stt0Var = new stt0(Df2, Nf2, z2, w3k0Var2, Lf2, f5oVar2);
        ott0 ott0Var = new ott0(Nf2, Gf2);
        If2.a(catalogBlockVariant, f2aVar2);
        If2.c(VideosStackedListView$State.class, new jqt0(o45Var, 1));
        If2.h(VideosStackedListView$State.class, stt0Var);
        If2.g(rtt0.class, ott0Var);
        if (z2) {
            f1u If3 = If();
            hdt0 Nf3 = Nf();
            x4o Gf3 = Gf();
            Context Df3 = Df();
            g7s0 Lf3 = Lf();
            m7a Ef3 = Ef();
            l5o Hf3 = Hf();
            qcy<Object> qcyVar6 = qcyVarArr[5];
            w3k0 w3k0Var3 = (w3k0) nwyVar.c();
            qcy<Object> qcyVar7 = qcyVarArr[8];
            VideoLargeListTabletView.a(If3, Nf3, Gf3, Hf3, Df3, Lf3, Ef3, w3k0Var3, (f5o) nwyVar2.c(), Y0);
        } else {
            f1u If4 = If();
            Context Df4 = Df();
            hdt0 Nf4 = Nf();
            x4o Gf4 = Gf();
            com.vk.video.focus.api.a Mf = Mf();
            qcy<Object> qcyVar8 = qcyVarArr[15];
            VideoApiHelperRepository videoApiHelperRepository = (VideoApiHelperRepository) this.p.c();
            g7s0 Lf4 = Lf();
            kbj0 Kf = Kf();
            l5o Hf4 = Hf();
            yqs0 yqs0Var = new yqs0(Lf4, Kf, Gf4);
            List l2 = e43.l(CatalogBlockVariant.VideosLargeList, CatalogBlockVariant.VideosLargeListInvisibleAuthor);
            lrs0 lrs0Var = new lrs0(Hf4, Lf4, Y0);
            jrs0 jrs0Var = new jrs0(Nf4, Mf, videoApiHelperRepository, Lf4);
            yrs0 yrs0Var = new yrs0(Df4);
            srs0 srs0Var = new srs0(yqs0Var);
            Iterator it2 = l2.iterator();
            while (it2.hasNext()) {
                If4.a((CatalogBlockVariant) it2.next(), lrs0Var);
            }
            If4.c(VideoLargeListState.class, new trs0(jrs0Var));
            If4.h(VideoLargeListState.class, yrs0Var);
            If4.g(xrs0.class, srs0Var);
        }
        if (Lf().J().s0()) {
            ClipListView.b(If(), Ff(), Lf());
        } else {
            ShortVideoListView.a(If(), Ff(), Lf());
        }
        f1u If5 = If();
        hdt0 Nf5 = Nf();
        com.vk.video.focus.api.a Mf2 = Mf();
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.VideoTrailer;
        nmt0 nmt0Var = new nmt0();
        mmt0 mmt0Var = new mmt0(Nf5, Mf2);
        wmt0 wmt0Var = new wmt0();
        tmt0 tmt0Var = new tmt0(fpf0.a(umt0.class));
        If5.a(catalogBlockVariant2, nmt0Var);
        If5.c(VideoTrailerView$State.class, new m1k0(mmt0Var, 1));
        If5.h(VideoTrailerView$State.class, wmt0Var);
        If5.g(vmt0.class, tmt0Var);
        f1u If6 = If();
        List l3 = e43.l(CatalogBlockVariant.AlbumsListSmallCards, CatalogBlockVariant.AlbumsLargeList);
        to1 to1Var = new to1();
        ap1 ap1Var = ap1.b;
        uo1 uo1Var = new uo1(z);
        yo1 yo1Var = new yo1();
        Iterator it3 = l3.iterator();
        while (it3.hasNext()) {
            If6.a((CatalogBlockVariant) it3.next(), to1Var);
        }
        If6.c(AlbumsListView$AlbumHorizontalState.class, new zo1(ap1Var));
        If6.h(AlbumsListView$AlbumHorizontalState.class, uo1Var);
        If6.g(vo1.class, yo1Var);
        f1u If7 = If();
        qcy<Object> qcyVar9 = qcyVarArr[9];
        final boolean a2 = ((f5o) this.j.c()).a();
        final l5o Hf5 = Hf();
        x4o Gf5 = Gf();
        qcy<Object> qcyVar10 = qcyVarArr[10];
        gkt0 gkt0Var = (gkt0) this.k.c();
        mm80 f = Lf().s().f();
        List l4 = e43.l(CatalogBlockVariant.DownloadedVideoSlider, CatalogBlockVariant.DownloadedVideoLargeSlider, CatalogBlockVariant.DownloadedVideoSliderSecondary);
        g2a g2aVar = new g2a(new gbo());
        zdf zdfVar = new zdf(gkt0Var, 2);
        s2a<? super CatalogBlockState, ?> s2aVar = new s2a() { // from class: xsna.hbo
            @Override // xsna.s2a
            public final r2a a(CatalogBlockState catalogBlockState) {
                DownloadedSliderView$DownloadedSliderState downloadedSliderView$DownloadedSliderState = (DownloadedSliderView$DownloadedSliderState) catalogBlockState;
                int i = obo.$EnumSwitchMapping$0[downloadedSliderView$DownloadedSliderState.c.ordinal()];
                boolean z3 = true;
                if (i != 1 && i != 2) {
                    z3 = false;
                }
                boolean z4 = z3;
                String str = downloadedSliderView$DownloadedSliderState.b;
                String str2 = downloadedSliderView$DownloadedSliderState.d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                List<czs0> list = downloadedSliderView$DownloadedSliderState.e;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList.add(dco.a((czs0) it4.next(), downloadedSliderView$DownloadedSliderState, l5o.this, z, a2));
                }
                return new nbo(str, str3, arrayList, downloadedSliderView$DownloadedSliderState.f, z4);
            }
        };
        mbo mboVar = new mbo(Gf5, f);
        Iterator it4 = l4.iterator();
        while (it4.hasNext()) {
            If7.a((CatalogBlockVariant) it4.next(), g2aVar);
        }
        If7.c(DownloadedSliderView$DownloadedSliderState.class, new pbo(zdfVar));
        If7.h(DownloadedSliderView$DownloadedSliderState.class, s2aVar);
        If7.g(nbo.class, mboVar);
        f1u If8 = If();
        dot0 E = Lf().E();
        List l5 = e43.l(CatalogBlockVariant.UploadPublishedList, CatalogBlockVariant.UploadScheduledList, CatalogBlockVariant.UploadDraftsList);
        g2a g2aVar2 = new g2a(new xbq0());
        nu2 nu2Var = new nu2(E, 3);
        vbq0 vbq0Var = new vbq0();
        zbq0 zbq0Var = new zbq0(E);
        Iterator it5 = l5.iterator();
        while (it5.hasNext()) {
            If8.a((CatalogBlockVariant) it5.next(), g2aVar2);
        }
        If8.c(UploadListView$UploadListState.class, new bcq0(nu2Var));
        If8.h(UploadListView$UploadListState.class, vbq0Var);
        If8.g(acq0.class, zbq0Var);
        f1u If9 = If();
        qcy<Object> qcyVar11 = qcyVarArr[21];
        d9f d9fVar = (d9f) this.v.c();
        qcy<Object> qcyVar12 = qcyVarArr[22];
        v8f v8fVar = (v8f) this.w.c();
        qcy<Object> qcyVar13 = qcyVarArr[20];
        vyd vydVar = (vyd) this.u.c();
        fks0 J = Lf().J();
        qcy<Object> qcyVar14 = qcyVarArr[23];
        qzv0 qzv0Var = (qzv0) this.x.c();
        If9.a(CatalogBlockVariant.DraftShortVideoList, DraftShortVideoListView.a);
        DraftShortVideoListView.a aVar2 = new DraftShortVideoListView.a(new d(vydVar, v8fVar, d9fVar, qzv0Var, J));
        f fVar = f.b;
        If9.c(DraftShortVideoListView.State.ClipState.class, fVar);
        If9.h(DraftShortVideoListView.State.ClipState.class, new mdo());
        If9.g(DraftShortVideoListView.d.a.class, aVar2);
        If9.c(DraftShortVideoListView.State.PlaceholderState.class, fVar);
        If9.h(DraftShortVideoListView.State.PlaceholderState.class, new mdo());
        If9.g(DraftShortVideoListView.d.c.class, aVar2);
        If9.c(DraftShortVideoListView.State.LoadingState.class, fVar);
        If9.h(DraftShortVideoListView.State.LoadingState.class, new mdo());
        If9.g(DraftShortVideoListView.d.b.class, aVar2);
        f1u If10 = If();
        qcy<Object> qcyVar15 = qcyVarArr[16];
        vyr0 vyr0Var = (vyr0) this.q.c();
        qcy<Object> qcyVar16 = qcyVarArr[17];
        com.vk.libvideo.adfree.api.di.a aVar3 = (com.vk.libvideo.adfree.api.di.a) this.r.c();
        qcy<Object> qcyVar17 = qcyVarArr[18];
        CatalogBannerView.a(If10, vyr0Var, aVar3, (tyr0) this.s.c());
        f1u If11 = If();
        CatalogBlockVariant catalogBlockVariant3 = CatalogBlockVariant.MovieHeader;
        rd30 rd30Var = new rd30();
        vd30 vd30Var = vd30.b;
        zd30 zd30Var = new zd30();
        td30 td30Var = new td30(fpf0.a(smk.class));
        If11.a(catalogBlockVariant3, rd30Var);
        If11.c(MovieHeaderBlockState.class, new ud30(vd30Var));
        If11.h(MovieHeaderBlockState.class, zd30Var);
        If11.g(yd30.class, td30Var);
        f1u If12 = If();
        w5s0 w5s0Var = new w5s0(new v5s0.a(Lf(), Kf(), Gf()));
        CatalogBlockVariant catalogBlockVariant4 = CatalogBlockVariant.MovieButtons;
        com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.a aVar4 = new com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.a();
        bd30 bd30Var = bd30.b;
        gd30 gd30Var = new gd30();
        zc30 zc30Var = new zc30(w5s0Var);
        If12.a(catalogBlockVariant4, aVar4);
        If12.c(MovieButtonsBlockState.class, new ad30(bd30Var));
        If12.h(MovieButtonsBlockState.class, gd30Var);
        If12.g(fd30.class, zc30Var);
        f1u If13 = If();
        CatalogBlockVariant catalogBlockVariant5 = CatalogBlockVariant.MovieDescription;
        hd30 hd30Var = new hd30();
        od30 od30Var = od30.b;
        id30 id30Var = new id30();
        kd30 kd30Var = new kd30();
        If13.a(catalogBlockVariant5, hd30Var);
        If13.c(MovieDescriptionView$MovieDescriptionState.class, new nd30(od30Var));
        If13.h(MovieDescriptionView$MovieDescriptionState.class, id30Var);
        If13.g(md30.class, kd30Var);
        f1u If14 = If();
        CatalogBlockVariant catalogBlockVariant6 = CatalogBlockVariant.MovieRatings;
        ef30 ef30Var = new ef30();
        new qej(2);
        c cVar = new c();
        gf30 gf30Var = new gf30();
        If14.a(catalogBlockVariant6, ef30Var);
        If14.c(MovieRatingsView$MovieRatingsBlockState.class, new hf30());
        If14.h(MovieRatingsView$MovieRatingsBlockState.class, cVar);
        If14.g(com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a.class, gf30Var);
        f1u If15 = If();
        CatalogBlockVariant catalogBlockVariant7 = CatalogBlockVariant.MovieInfo;
        ce30 ce30Var = new ce30();
        ge30 ge30Var = ge30.b;
        je30 je30Var = new je30();
        com.vk.catalog.mvi.block.video.impl.movies.detail.info.a aVar5 = new com.vk.catalog.mvi.block.video.impl.movies.detail.info.a();
        If15.a(catalogBlockVariant7, ce30Var);
        If15.c(MovieInfoView$MovieInfoBlockState.class, new fe30(ge30Var));
        If15.h(MovieInfoView$MovieInfoBlockState.class, je30Var);
        If15.g(ee30.class, aVar5);
        f1u If16 = If();
        CatalogBlockVariant catalogBlockVariant8 = CatalogBlockVariant.MovieActors;
        qc30 qc30Var = new qc30();
        sc30 sc30Var = new sc30();
        If16.a(catalogBlockVariant8, qc30Var);
        If16.c(MovieActorsView$MovieActorsState.class, tc30.b);
        If16.h(MovieActorsView$MovieActorsState.class, uc30.b);
        If16.g(MovieActorsView$MovieActorsState.class, sc30Var);
    }

    @Override // com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent
    public final void T8(cg50 cg50Var) {
        boolean Y0 = Lf().J().Y0();
        Context Df = Df();
        hdt0 Nf = Nf();
        x4o Gf = Gf();
        com.vk.video.focus.api.a Mf = Mf();
        qcy<Object> qcyVar = y[15];
        VideoApiHelperRepository videoApiHelperRepository = (VideoApiHelperRepository) this.p.c();
        g7s0 Lf = Lf();
        kbj0 Kf = Kf();
        l5o Hf = Hf();
        yqs0 yqs0Var = new yqs0(Lf, Kf, Gf);
        List singletonList = Collections.singletonList(CatalogBlockVariant.VideoLargeSliderVideoPage);
        lrs0 lrs0Var = new lrs0(Hf, Lf, Y0);
        hrs0 hrs0Var = new hrs0(Nf, Mf, videoApiHelperRepository, Lf);
        yrs0 yrs0Var = new yrs0(Df);
        srs0 srs0Var = new srs0(yqs0Var);
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            cg50Var.a((CatalogBlockVariant) it.next(), lrs0Var);
        }
        cg50Var.c(VideoLargeListState.class, new urs0(hrs0Var));
        cg50Var.h(VideoLargeListState.class, yrs0Var);
        cg50Var.g(xrs0.class, srs0Var);
    }

    @Override // com.vk.catalog.mvi.block.video.api.CatalogVideoViewComponent
    public final void y() {
        final boolean z = Df().getResources().getBoolean(R.bool.lenovo_tb_884f_fixed_is_tabled_resolver);
        com.vk.catalog.mvi.legacy.api.a Jf = Jf();
        CatalogBlockVariant catalogBlockVariant = CatalogBlockVariant.AlbumsSlider;
        Jf.b(catalogBlockVariant, new cr1(catalogBlockVariant, new o8a(new uq1(0)), dr1.b, new tq1(z), new ar1(), new g8a(false)));
        qcy<Object>[] qcyVarArr = y;
        qcy<Object> qcyVar = qcyVarArr[9];
        boolean a2 = ((f5o) this.j.c()).a();
        com.vk.catalog.mvi.legacy.api.a Jf2 = Jf();
        hdt0 Nf = Nf();
        m7a Ef = Ef();
        x4o Gf = Gf();
        final l5o Hf = Hf();
        Context Df = Df();
        CatalogBlockVariant catalogBlockVariant2 = CatalogBlockVariant.VideosSlider;
        Jf2.b(catalogBlockVariant2, new iqt0(catalogBlockVariant2, new o8a(new wzs() { // from class: xsna.vpt0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                UIBlock uIBlock = (UIBlock) obj2;
                UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
                if (uIBlockVideo == null) {
                    return null;
                }
                VideoFile A = uIBlockVideo.A();
                return new VideoView$State(com.vk.catalog.mvi.block.a.c(uIBlockVideo.w(), uIBlockVideo.A().a1()), CatalogBlockVariant.VideosSlider, A, uIBlockVideo.r(), uIBlockVideo.Sb(), l5o.this.a(nkt0.a(A), z ? DonutVideoCardSource.LARGE_CARD : DonutVideoCardSource.LARGE_CARD));
            }
        }), new rpt0(Ef, Nf), new ert0(z, a2, Df, Nf), new cqt0(Nf, Gf), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Jf3 = Jf();
        dot0 E = Lf().E();
        CatalogBlockVariant catalogBlockVariant3 = CatalogBlockVariant.UploadPublishedList;
        Jf3.b(catalogBlockVariant3, new dcq0(catalogBlockVariant3, new o8a(new wbq0()), new ubq0(E), new vbq0(), new zbq0(E), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Jf4 = Jf();
        CatalogBlockVariant catalogBlockVariant4 = CatalogBlockVariant.AlbumsTabsList;
        Jf4.b(catalogBlockVariant4, new cp1(catalogBlockVariant4, new o8a(new so1()), dp1.b, new uo1(z), new yo1(), new g8a(false)));
        com.vk.catalog.mvi.legacy.api.a Jf5 = Jf();
        le30 le30Var = new le30(Lf().Y());
        CatalogBlockVariant catalogBlockVariant5 = CatalogBlockVariant.MoviePostersLegacySlider;
        Jf5.b(catalogBlockVariant5, new ue30(catalogBlockVariant5, new me30(), xe30.b, new cf30(), new re30(le30Var), new g8a(false)));
        CatalogBlockVariant catalogBlockVariant6 = CatalogBlockVariant.MoviePostersGrid;
        Jf5.b(catalogBlockVariant6, new we30(catalogBlockVariant6, new me30(), ye30.b, new cf30(), new re30(le30Var), new g8a(false)));
        if (z) {
            return;
        }
        com.vk.catalog.mvi.legacy.api.a Jf6 = Jf();
        Context Df2 = Df();
        hdt0 Nf2 = Nf();
        x4o Gf2 = Gf();
        com.vk.video.focus.api.a Mf = Mf();
        qcy<Object> qcyVar2 = qcyVarArr[15];
        VideoApiHelperRepository videoApiHelperRepository = (VideoApiHelperRepository) this.p.c();
        final g7s0 Lf = Lf();
        kbj0 Kf = Kf();
        final l5o Hf2 = Hf();
        yqs0 yqs0Var = new yqs0(Lf, Kf, Gf2);
        CatalogBlockVariant catalogBlockVariant7 = CatalogBlockVariant.VideosLargeList;
        Jf6.b(catalogBlockVariant7, new wrs0(catalogBlockVariant7, new o8a(new wzs() { // from class: xsna.krs0
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                UIBlock uIBlock = (UIBlock) obj2;
                if (!(uIBlock instanceof UIBlockVideo)) {
                    return null;
                }
                UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                VideoFile A = uIBlockVideo.A();
                gi5 gi5Var = new gi5(A, false, false, false, false, null, false, null, false, false, false, false, false, false, 0L, 0L, 0, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, 268435454);
                com.vk.libvideo.autoplay.a aVar = new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, true, null, SubtitlesConfigurationMode.FROM_PERSISTENT_STORAGE, null, null, PlayerType.INLINE, ScreenType.INLINE, false, null, 289788);
                BlockId.CompositeId c = com.vk.catalog.mvi.block.a.c(uIBlock.w(), A.r1());
                CatalogBlockVariant catalogBlockVariant8 = CatalogBlockVariant.VideosLargeList;
                DonutVideoUiModel a3 = l5o.this.a(nkt0.a(A), DonutVideoCardSource.LARGE_CARD);
                VideoPinType Rb = uIBlockVideo.Rb();
                return new VideoLargeListState(c, catalogBlockVariant8, A, uIBlockVideo.Sb(), uIBlockVideo.r(), a3, Rb, true, false, false, null, null, null, false, null, null, null, aVar, gi5Var, null, null, null, null, null, null, 0, 66715392, null);
            }
        }), new irs0(Nf2, Mf, videoApiHelperRepository, Lf), new yrs0(Df2), new srs0(yqs0Var), new g8a(true)));
    }
}
