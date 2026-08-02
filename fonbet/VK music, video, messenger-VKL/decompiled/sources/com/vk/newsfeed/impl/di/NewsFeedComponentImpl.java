package com.vk.newsfeed.impl.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a0c0;
import xsna.a67;
import xsna.am60;
import xsna.bky;
import xsna.bp;
import xsna.bpn0;
import xsna.c8m;
import xsna.ce60;
import xsna.d4c0;
import xsna.dr6;
import xsna.dto;
import xsna.dw0;
import xsna.ep;
import xsna.eu2;
import xsna.fb8;
import xsna.fp;
import xsna.fpf0;
import xsna.fu2;
import xsna.g3j;
import xsna.g67;
import xsna.g8m;
import xsna.gb8;
import xsna.gzs;
import xsna.hpf0;
import xsna.hxq;
import xsna.ib8;
import xsna.ip;
import xsna.iuc0;
import xsna.j90;
import xsna.jb3;
import xsna.jb8;
import xsna.jbc0;
import xsna.jvg;
import xsna.kb8;
import xsna.kdg0;
import xsna.lbs;
import xsna.m73;
import xsna.msy;
import xsna.nwy;
import xsna.nxv;
import xsna.oxv;
import xsna.p870;
import xsna.pwj0;
import xsna.pxv;
import xsna.q57;
import xsna.qb60;
import xsna.qcy;
import xsna.qo;
import xsna.qxv;
import xsna.rv0;
import xsna.rxv;
import xsna.s3a;
import xsna.sb60;
import xsna.t3a;
import xsna.tb60;
import xsna.u3a;
import xsna.uaq0;
import xsna.ub60;
import xsna.uy2;
import xsna.v3a;
import xsna.vb60;
import xsna.vfc0;
import xsna.vy2;
import xsna.w3a;
import xsna.w50;
import xsna.wb3;
import xsna.xh6;
import xsna.xsa;
import xsna.ycc0;
import xsna.yix;
import xsna.zf6;
import xsna.zix;
import xsna.zkv;

/* compiled from: NewsFeedComponentImpl.kt */
/* loaded from: classes.dex */
public final class NewsFeedComponentImpl implements NewsFeedComponent {
    public static final /* synthetic */ qcy<Object>[] D;
    public final nwy A;
    public final nwy B;
    public final nwy C;
    public final bpn0 a;
    public final bpn0 b;
    public final nwy c;
    public final nwy d;
    public final nwy e;
    public final nwy f;
    public final nwy g;
    public final nwy k;
    public final nwy q;
    public final nwy v;
    public final nwy w;
    public final nwy x;
    public final nwy y;
    public final nwy z;
    public final nwy h = new nwy(new bky(this, 4));
    public final nwy i = new nwy(new q57(7));
    public final nwy j = new nwy(new uy2(this, 4));
    public final nwy l = new nwy(new bp(this, 3));
    public final nwy m = new nwy(new qo(6));
    public final nwy n = new nwy(new jvg(6));
    public final nwy o = new nwy(new s3a(4));
    public final nwy p = new nwy(new t3a(this, 2));
    public final nwy r = new nwy(new wb3(3));
    public final nwy s = new nwy(new ip(this, 5));
    public final nwy t = new nwy(new xh6(9));
    public final nwy u = new nwy(new a67(this, 8));

    /* compiled from: NewsFeedComponentImpl.kt */
    public static final class a implements c8m<NewsFeedComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            u3a u3aVar = new u3a(g8mVar, 1);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            Lazy a = msy.a(lazyThreadSafetyMode, u3aVar);
            Lazy a2 = msy.a(lazyThreadSafetyMode, new vb60(g8mVar, 0));
            Lazy a3 = msy.a(lazyThreadSafetyMode, new xsa(g8mVar, 4));
            Lazy a4 = msy.a(lazyThreadSafetyMode, new ib8(g8mVar, 7));
            Lazy a5 = msy.a(lazyThreadSafetyMode, new jb8(g8mVar, 6));
            Lazy a6 = msy.a(lazyThreadSafetyMode, new kb8(g8mVar, 6));
            Lazy a7 = msy.a(lazyThreadSafetyMode, new v3a(g8mVar, 1));
            bpn0 bpn0Var = new bpn0(new w3a(g8mVar, 1));
            return new NewsFeedComponentImpl(a, a2, a3, a4, a5, a6, a7, new bpn0(new g3j(g8mVar, 4)), new bpn0(new gb8(g8mVar, 3)), new bpn0(new g67(g8mVar, 4)), bpn0Var, new bpn0(new fb8(g8mVar, 5)), new bpn0(new zf6(g8mVar, 10)), new bpn0(new ub60(g8mVar, 0)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(NewsFeedComponentImpl.class, "appContextDiComponent", "getAppContextDiComponent()Lcom/vk/di/component/app/AppContextDiComponent;", 0);
        hpf0 hpf0Var = fpf0.a;
        D = new qcy[]{propertyReference1Impl, fp.c(0, NewsFeedComponentImpl.class, "adPixelStatsComponent", "getAdPixelStatsComponent()Lcom/vk/ads/stats/api/di/AdPixelStatsComponent;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "bridgeComponent", "getBridgeComponent()Lcom/vk/bridges/di/BridgeComponent;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "cacheComponent", "getCacheComponent()Lcom/vk/cachecontrol/api/CacheComponent;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "newsfeedMappersComponent", "getNewsfeedMappersComponent()Lcom/vk/mapper/newsfeed/di/NewsfeedMappersComponent;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "wallRemoteRepository", "getWallRemoteRepository()Lcom/vk/newsfeed/impl/data/repository/WallRemoteRepositoryImpl;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "remoteActionRepo", "getRemoteActionRepo()Lcom/vk/newsfeed/impl/domain/repository/ActionRemoteRepository;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "localActionRepo", "getLocalActionRepo()Lcom/vk/newsfeed/impl/data/repository/ActionLocalRepositoryImpl;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "newsfeedInteractor", "getNewsfeedInteractor()Lcom/vk/newsfeed/domain/interactor/NewsfeedInteractor;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "postActivitiesInteractor", "getPostActivitiesInteractor()Lcom/vk/newsfeed/domain/interactor/PostActivitiesInteractor;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "restrictionsUtils", "getRestrictionsUtils()Lcom/vk/restriction/api/RestrictionsUtils;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "postingAnalytics", "getPostingAnalytics()Lcom/vk/newsfeed/analytics/api/PostingAnalytics;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "postingFromNewsfeedAnalytics", "getPostingFromNewsfeedAnalytics()Lcom/vk/newsfeed/analytics/api/PostingFromNewsfeedAnalytics;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "postInteractor", "getPostInteractor()Lcom/vk/newsfeed/domain/interactor/post/PostInteractor;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "newsfeedRouter", "getNewsfeedRouter()Lcom/vk/newsfeed/api/NewsfeedRouter;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "newsfeedController", "getNewsfeedController()Lcom/vk/newsfeed/impl/controllers/NewsfeedController;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "actionSynchronizerInteractor", "getActionSynchronizerInteractor()Lcom/vk/newsfeed/domain/interactor/action/ActionSynchronizerInteractor;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "adsInteractor", "getAdsInteractor()Lcom/vk/newsfeed/domain/interactor/ads/AdsInteractor;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "adsClipsAnalytics", "getAdsClipsAnalytics()Lcom/vk/newsfeed/analytics/api/AdsClipsAnalytics;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "clipEndOverlayAdAnalytics", "getClipEndOverlayAdAnalytics()Lcom/vk/newsfeed/analytics/api/ClipEndOverlayAdAnalytics;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "dzenArticlesBlockAnalytics", "getDzenArticlesBlockAnalytics()Lcom/vk/newsfeed/analytics/api/DzenArticlesBlockAnalytics;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "notificationCenter", "getNotificationCenter()Lcom/vk/core/events/NotificationCenter;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "feedCache", "getFeedCache()Lcom/vk/newsfeed/api/FeedCacheManager;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "internalNativeAdFactory", "getInternalNativeAdFactory()Lcom/my/target/internal/api/InternalNativeAdFactory;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "internalNativeAdControllerFactory", "getInternalNativeAdControllerFactory()Lcom/my/target/internal/api/internalnativead/InternalNativeAdControllerFactory;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "nativeAdEventRepository", "getNativeAdEventRepository()Lcom/vk/newsfeed/api/stats/AppLovinNativeAdEventRepository;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "postingAuthorRepository", "getPostingAuthorRepository()Lcom/vk/newsfeed/api/posting/author/PostingAuthorRepository;", hpf0Var), ep.a(0, NewsFeedComponentImpl.class, "uploadEventsObserver", "getUploadEventsObserver()Lcom/vk/newsfeed/api/posting/UploadEventsObserver;", hpf0Var)};
    }

    public NewsFeedComponentImpl(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, final bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3, bpn0 bpn0Var4, bpn0 bpn0Var5, bpn0 bpn0Var6, bpn0 bpn0Var7) {
        this.a = bpn0Var4;
        this.b = bpn0Var5;
        this.c = new nwy(new j90(lazy, 8));
        this.d = new nwy(new fu2(lazy2, 5));
        this.e = new nwy(new rxv(lazy3, 4));
        this.f = new nwy(new zkv(lazy4, 4));
        this.g = new nwy(new jb3(bpn0Var3, 5));
        this.k = new nwy(new vy2(1, bpn0Var6, this));
        this.q = new nwy(new tb60(lazy7, lazy5, lazy6, 0));
        new nwy(new eu2(10));
        this.v = new nwy(new qb60(bpn0Var7, 0));
        this.w = new nwy(new nxv(this, 3));
        this.x = new nwy(new oxv(this, 6));
        this.y = new nwy(new pxv(this, 4));
        this.z = new nwy(new qxv(this, 3));
        this.A = new nwy(new dr6(10));
        this.B = new nwy(new gzs() { // from class: xsna.rb60
            @Override // xsna.gzs
            public final Object invoke() {
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                max0 d = zq70.d();
                nwy nwyVar = NewsFeedComponentImpl.this.e;
                qcy<Object> qcyVar = NewsFeedComponentImpl.D[2];
                return new com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b(((BridgeComponent) nwyVar.c()).s(), new AdminCommunitiesDataSource(d, ((DataRepositoryComponent) bpn0Var.getValue()).D()), d);
            }
        });
        this.C = new nwy(new sb60(0, this, bpn0Var2));
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final am60 Aa() {
        qcy<Object> qcyVar = D[8];
        return (am60) this.k.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final dw0 B4() {
        qcy<Object> qcyVar = D[17];
        return (dw0) this.t.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final zix C7() {
        qcy<Object> qcyVar = D[23];
        return (zix) this.y.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final vfc0 De() {
        qcy<Object> qcyVar = D[12];
        return (vfc0) this.o.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    /* renamed from: Df, reason: merged with bridge method [inline-methods] */
    public final ce60 Bb() {
        qcy<Object> qcyVar = D[15];
        return (ce60) this.r.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final a0c0 E9() {
        qcy<Object> qcyVar = D[9];
        return (a0c0) this.l.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final kdg0 G2() {
        qcy<Object> qcyVar = D[10];
        return (kdg0) this.m.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final uaq0 N0() {
        qcy<Object> qcyVar = D[27];
        return (uaq0) this.C.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final jbc0 Vb() {
        qcy<Object> qcyVar = D[11];
        return (jbc0) this.n.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final rv0 X5() {
        qcy<Object> qcyVar = D[18];
        return (rv0) this.u.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final hxq Y2() {
        qcy<Object> qcyVar = D[22];
        return (hxq) this.x.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final m73 cc() {
        qcy<Object> qcyVar = D[25];
        return (m73) this.A.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final lbs i5() {
        return new lbs();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final yix ib() {
        qcy<Object> qcyVar = D[24];
        return (yix) this.z.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final NewsfeedRouter l0() {
        qcy<Object> qcyVar = D[14];
        return (NewsfeedRouter) this.q.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final dto m6() {
        qcy<Object> qcyVar = D[20];
        return (dto) this.v.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final void n0() {
        iuc0 iuc0Var = iuc0.b;
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final ycc0 oc() {
        qcy<Object> qcyVar = D[26];
        return (ycc0) this.B.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final p870 w() {
        qcy<Object> qcyVar = D[21];
        return (p870) this.w.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final w50 xb() {
        qcy<Object> qcyVar = D[16];
        return (w50) this.s.c();
    }

    @Override // com.vk.newsfeed.api.di.NewsFeedComponent
    public final d4c0 ze() {
        qcy<Object> qcyVar = D[13];
        return (d4c0) this.p.c();
    }
}
