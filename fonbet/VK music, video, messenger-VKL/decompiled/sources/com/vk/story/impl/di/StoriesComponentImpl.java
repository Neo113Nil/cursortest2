package com.vk.story.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.cachecontrol.api.CacheComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import io.reactivex.rxjava3.core.q;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ab3;
import xsna.an;
import xsna.apf;
import xsna.asl0;
import xsna.b5o;
import xsna.bdd;
import xsna.bn;
import xsna.bpf;
import xsna.bsl0;
import xsna.bvl0;
import xsna.c5o;
import xsna.c8m;
import xsna.cd3;
import xsna.cuq;
import xsna.d53;
import xsna.dr4;
import xsna.ep;
import xsna.er4;
import xsna.ewy;
import xsna.f53;
import xsna.fat;
import xsna.fn2;
import xsna.fp;
import xsna.fpf0;
import xsna.fr4;
import xsna.fsl0;
import xsna.g8m;
import xsna.gat;
import xsna.gul0;
import xsna.hpf0;
import xsna.i070;
import xsna.i1q;
import xsna.ifr;
import xsna.j55;
import xsna.jnf;
import xsna.knf;
import xsna.l8c0;
import xsna.lnf;
import xsna.lrl0;
import xsna.lul0;
import xsna.m3t;
import xsna.n2m0;
import xsna.nwy;
import xsna.o66;
import xsna.otl0;
import xsna.oul0;
import xsna.p870;
import xsna.pam0;
import xsna.pwj0;
import xsna.q03;
import xsna.qcy;
import xsna.qn6;
import xsna.qpl0;
import xsna.qy8;
import xsna.r03;
import xsna.r12;
import xsna.rul0;
import xsna.rvl0;
import xsna.s0f;
import xsna.scd;
import xsna.t0f;
import xsna.tkj;
import xsna.utl0;
import xsna.uvl0;
import xsna.v5m0;
import xsna.w94;
import xsna.x2m0;
import xsna.xa3;
import xsna.xsl0;
import xsna.yaa;
import xsna.ysg0;
import xsna.zix;
import xsna.ztl0;

/* compiled from: StoriesComponentImpl.kt */
/* loaded from: classes11.dex */
public class StoriesComponentImpl implements StoriesComponent {
    public static final /* synthetic */ qcy<Object>[] N;
    public final SessionManagementComponent a;
    public final AuthBridgeComponent b;
    public final CacheComponent c;
    public final StoryStatisticsComponent d;
    public final StoriesSettingsComponent e;
    public final AppContextDiComponent f;
    public final nwy g = new nwy(new q03(11));
    public final nwy h = new nwy(new d53(5));
    public final nwy i = new nwy(new j55(10));
    public final nwy j = new nwy(new w94(15));
    public final nwy k = new nwy(new cd3(10));
    public final nwy l = new nwy(new tkj(this, 4));
    public final nwy m = new nwy(new b5o(this, 5));
    public final nwy n = new nwy(new i1q(this, 3));
    public final nwy o = new nwy(new qn6(6));
    public final nwy p = new nwy(new t0f(9));
    public final nwy q = new nwy(new r12(11));
    public final nwy r = new nwy(new c5o(this, 7));
    public final nwy s = new nwy(new yaa(this, 6));
    public final nwy t = new nwy(new cuq(this, 6));
    public final nwy u = new nwy(new xa3(7));
    public final nwy v = new nwy(new fat(this, 8));
    public final nwy w = new nwy(new gat(this, 11));
    public final nwy x = new nwy(new qy8(this, 15));
    public final nwy y = new nwy(new ab3(13));
    public final nwy z = new nwy(new r03(10));
    public final nwy A = new nwy(new o66(this, 5));
    public final nwy B = new nwy(new dr4(this, 8));
    public final nwy C = new nwy(new f53(this, 11));
    public final nwy D = new nwy(new er4(this, 5));
    public final ewy E = new ewy(new fr4(this, 8));
    public final nwy F = new nwy(new jnf(9));
    public final nwy G = new nwy(new knf(13));
    public final nwy H = new nwy(new lnf(10));
    public final nwy I = new nwy(new apf(this, 7));
    public final nwy J = new nwy(new bpf(this, 4));
    public final ewy K = new ewy(new s0f(this, 9));
    public final ewy L = new ewy(new an(this, 7));
    public final ewy M = new ewy(new bn(this, 4));

    /* compiled from: StoriesComponentImpl.kt */
    public static final class a implements c8m<StoriesComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoriesComponentImpl((SessionManagementComponent) g8mVar.a(fpf0.a(SessionManagementComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (CacheComponent) g8mVar.a(fpf0.a(CacheComponent.class)), (StoryStatisticsComponent) g8mVar.a(fpf0.a(StoryStatisticsComponent.class)), (StoriesSettingsComponent) g8mVar.a(fpf0.a(StoriesSettingsComponent.class)), (AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StoriesComponentImpl.class, "storiesRxBus", "getStoriesRxBus()Lcom/vk/rx/RxBus;", 0);
        hpf0 hpf0Var = fpf0.a;
        N = new qcy[]{propertyReference1Impl, fp.c(0, StoriesComponentImpl.class, "repository", "getRepository()Lcom/vk/story/impl/data/repository/common/StoriesRepositoryImpl;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "communityRepository", "getCommunityRepository()Lcom/vk/repository/data/api/CommunityRepository;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "uploadDelegate", "getUploadDelegate()Lcom/vk/storycamera/upload/StoriesUploadDelegate;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storiesTemplateRepository", "getStoriesTemplateRepository()Lcom/vk/story/api/domain/repository/common/StoriesTemplateRepository;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "loadInteractor", "getLoadInteractor()Lcom/vk/story/api/domain/interactor/common/StoriesLoadInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "uploadInteractor", "getUploadInteractor()Lcom/vk/story/api/domain/interactor/common/StoriesUploadInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "sessionInteractor", "getSessionInteractor()Lcom/vk/story/api/domain/interactor/common/StoriesSessionInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storyLoaderContent", "getStoryLoaderContent()Lcom/vk/story/api/domain/preload/StoryLoaderContent;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "stickerStyleProvider", "getStickerStyleProvider()Lcom/vk/stickers/api/styles/StickerStyleProvider;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storiesFeedMetrics", "getStoriesFeedMetrics()Lcom/vk/story/api/util/StoriesFeedMetrics;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "newsfeedStoriesDaemon", "getNewsfeedStoriesDaemon()Lcom/vk/story/api/domain/NewsfeedStoriesDaemon;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "rearranger", "getRearranger()Lcom/vk/story/api/domain/interactor/common/StoriesRearranger;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "seenInteractor", "getSeenInteractor()Lcom/vk/story/api/domain/interactor/common/StoriesSeenInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "filteringUtils", "getFilteringUtils()Lcom/vk/story/api/util/FilteringUtils;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "myTargetInternalNativeAdFactory", "getMyTargetInternalNativeAdFactory()Lcom/my/target/internal/api/InternalNativeAdFactory;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "myTargetAdPrefetcher", "getMyTargetAdPrefetcher()Lcom/vk/story/api/domain/preload/StoriesMyTargetAdPrefetcher;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "adsController", "getAdsController()Lcom/vk/story/api/domain/interactor/common/StoriesAdsController;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "notificationCenter", "getNotificationCenter()Lcom/vk/core/events/NotificationCenter;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "pixelController", "getPixelController()Lcom/vk/story/api/domain/interactor/common/StoriesPixelsController;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "cacheInteractor", "getCacheInteractor()Lcom/vk/story/api/domain/interactor/cache/StoriesCacheInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "interactor", "getInteractor()Lcom/vk/story/api/domain/interactor/common/StoriesInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "feedInteractor", "getFeedInteractor()Lcom/vk/story/api/domain/interactor/feed/StoriesFeedInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storiesEvents", "getStoriesEvents()Lio/reactivex/rxjava3/core/Observable;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storiesSeenController", "getStoriesSeenController()Lcom/vk/story/api/domain/repository/StoriesSeenController;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storyFlexboxFactory", "getStoryFlexboxFactory()Lcom/vk/story/api/storyflexboxfactory/StoryFlexboxFactory;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "galleryFilesCounter", "getGalleryFilesCounter()Lcom/vk/story/api/domain/filescounter/GalleryFilesCounter;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "simpleLayersProvider", "getSimpleLayersProvider()Lcom/vk/media/layers/LayersProvider;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storyPublishProcessNotifier", "getStoryPublishProcessNotifier()Lcom/vk/story/api/domain/interactor/repost/StoryPublishProcessNotifier;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "clipsToStoryRepostInteractor", "getClipsToStoryRepostInteractor()Lcom/vk/story/api/domain/interactor/repost/ClipToStoryRepostInteractor;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "postToStoryRepostPublisher", "getPostToStoryRepostPublisher()Lcom/vk/story/api/domain/interactor/repost/PostToStoryRepostPublisher;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "clipStickerFactory", "getClipStickerFactory()Lcom/vk/story/api/domain/interactor/repost/ClipStickerFactory;", hpf0Var), ep.a(0, StoriesComponentImpl.class, "storyEncoderParamsFactory", "getStoryEncoderParamsFactory()Lcom/vk/story/api/domain/interactor/repost/StoryEncoderParamsFactory;", hpf0Var)};
    }

    public StoriesComponentImpl(SessionManagementComponent sessionManagementComponent, AuthBridgeComponent authBridgeComponent, CacheComponent cacheComponent, StoryStatisticsComponent storyStatisticsComponent, StoriesSettingsComponent storiesSettingsComponent, AppContextDiComponent appContextDiComponent) {
        this.a = sessionManagementComponent;
        this.b = authBridgeComponent;
        this.c = cacheComponent;
        this.d = storyStatisticsComponent;
        this.e = storiesSettingsComponent;
        this.f = appContextDiComponent;
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final m3t Ca() {
        qcy<Object> qcyVar = N[26];
        return (m3t) this.G.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lul0 Df() {
        qcy<Object> qcyVar = N[1];
        return (lul0) this.h.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ysg0<asl0> Ef() {
        qcy<Object> qcyVar = N[0];
        return (ysg0) this.g.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final ifr F8() {
        qcy<Object> qcyVar = N[14];
        return (ifr) this.u.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final pam0 I2() {
        qcy<Object> qcyVar = N[28];
        return (pam0) this.I.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final ysg0<asl0> L2() {
        return Ef();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final scd L6() {
        qcy<Object> qcyVar = N[31];
        return (scd) this.L.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final oul0 Pa() {
        qcy<Object> qcyVar = N[24];
        return (oul0) this.E.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final utl0 R5() {
        qcy<Object> qcyVar = N[16];
        return (utl0) this.w.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final bdd S9() {
        qcy<Object> qcyVar = N[29];
        return (bdd) this.J.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final l8c0 V5() {
        qcy<Object> qcyVar = N[30];
        return (l8c0) this.K.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final xsl0 b() {
        qcy<Object> qcyVar = N[21];
        return (xsl0) this.B.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final gul0 b7() {
        qcy<Object> qcyVar = N[12];
        return (gul0) this.s.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final ztl0 bb() {
        qcy<Object> qcyVar = N[19];
        return (ztl0) this.z.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final lrl0 bf() {
        qcy<Object> qcyVar = N[20];
        return (lrl0) this.A.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final uvl0 eb() {
        qcy<Object> qcyVar = N[6];
        return (uvl0) this.m.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final bvl0 f2() {
        qcy<Object> qcyVar = N[7];
        return (bvl0) this.n.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.story.api.di.StoriesComponent
    public final q<asl0> f6() {
        qcy<Object> qcyVar = N[23];
        return (q) this.D.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final qpl0 fb() {
        qcy<Object> qcyVar = N[17];
        return (qpl0) this.x.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final i070 gd() {
        qcy<Object> qcyVar = N[11];
        return (i070) this.r.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final n2m0 j5() {
        qcy<Object> qcyVar = N[32];
        return (n2m0) this.M.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final rul0 o7() {
        qcy<Object> qcyVar = N[13];
        return (rul0) this.t.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final zix od() {
        qcy<Object> qcyVar = N[15];
        return (zix) this.v.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final otl0 r2() {
        qcy<Object> qcyVar = N[5];
        return (otl0) this.l.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final com.vk.stickers.api.styles.b t0() {
        qcy<Object> qcyVar = N[9];
        return (com.vk.stickers.api.styles.b) this.p.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final x2m0 t7() {
        qcy<Object> qcyVar = N[25];
        return (x2m0) this.F.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final rvl0 td() {
        qcy<Object> qcyVar = N[4];
        return (rvl0) this.k.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final fsl0 te() {
        qcy<Object> qcyVar = N[10];
        return (fsl0) this.q.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final v5m0 u5() {
        qcy<Object> qcyVar = N[8];
        return (v5m0) this.o.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.story.api.di.StoriesComponent
    public final p870 w() {
        qcy<Object> qcyVar = N[18];
        return (p870) this.y.c();
    }

    @Override // com.vk.story.api.di.StoriesComponent
    public final bsl0 w3() {
        qcy<Object> qcyVar = N[22];
        return (bsl0) this.C.c();
    }

    /* compiled from: StoriesComponentImpl.kt */
    /* loaded from: classes6.dex */
    public static final class b implements fn2 {
        @Override // xsna.fn2
        public final void a(boolean z) {
        }
    }
}
