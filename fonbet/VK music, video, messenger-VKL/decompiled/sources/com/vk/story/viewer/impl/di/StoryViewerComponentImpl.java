package com.vk.story.viewer.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ag6;
import xsna.anm0;
import xsna.aql0;
import xsna.c24;
import xsna.c8m;
import xsna.cia;
import xsna.egv;
import xsna.ep;
import xsna.erl0;
import xsna.ewy;
import xsna.fnm0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hb8;
import xsna.hnm0;
import xsna.hpf0;
import xsna.ib8;
import xsna.jnm0;
import xsna.k03;
import xsna.kb8;
import xsna.lnm0;
import xsna.m;
import xsna.m15;
import xsna.mnm0;
import xsna.nb8;
import xsna.nwy;
import xsna.p5m;
import xsna.pwj0;
import xsna.qb8;
import xsna.qcy;
import xsna.rb8;
import xsna.s7m0;
import xsna.sb8;
import xsna.tql0;
import xsna.v2m0;
import xsna.vrl0;
import xsna.wvl0;
import xsna.xsa;
import xsna.y45;
import xsna.yjc;
import xsna.z6m0;

/* compiled from: StoryViewerComponentImpl.kt */
/* loaded from: classes11.dex */
public final class StoryViewerComponentImpl implements StoryViewerComponent {
    public static final /* synthetic */ qcy<Object>[] s;
    public final StoriesComponent a;
    public final PhotosComponent b;
    public final nwy c = new nwy(new hb8(10));
    public final nwy d = new nwy(new rb8(this, 7));
    public final nwy e = new nwy(new sb8(this, 9));
    public final nwy f = new nwy(new y45(12));
    public final nwy g = new nwy(new ag6(this, 11));
    public final ewy h = new ewy(new m(13));
    public final ewy i = new ewy(new xsa(this, 10));
    public final nwy j = new nwy(new ib8(this, 12));
    public final nwy k = new nwy(new c24(15));
    public final ewy l = new ewy(new kb8(this, 9));
    public final nwy m = new nwy(new egv(this, 5));
    public final nwy n = new nwy(new nb8(16));
    public final nwy o = new nwy(new p5m(8));
    public final ewy p = new ewy(new m15(this, 12));
    public final nwy q = new nwy(new cia(this, 11));
    public final nwy r = new nwy(new qb8(8));

    /* compiled from: StoryViewerComponentImpl.kt */
    public static final class a implements c8m<StoryViewerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoryViewerComponentImpl((StoriesComponent) g8mVar.a(fpf0.a(StoriesComponent.class)), (PhotosComponent) g8mVar.a(fpf0.a(PhotosComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StoryViewerComponentImpl.class, "templateButtonCache", "getTemplateButtonCache()Lcom/vk/story/viewer/impl/data/TemplateButtonCache;", 0);
        hpf0 hpf0Var = fpf0.a;
        s = new qcy[]{propertyReference1Impl, fp.c(0, StoryViewerComponentImpl.class, "repository", "getRepository()Lcom/vk/story/viewer/impl/data/StoryViewerRepositoryImpl;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storiesRouter", "getStoriesRouter()Lcom/vk/story/viewer/api/StoryViewerRouter;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storyViewerAnalytics", "getStoryViewerAnalytics()Lcom/vk/story/viewer/api/analytics/StoryViewerAnalytics;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storiesBlockHolderFactory", "getStoriesBlockHolderFactory()Lcom/vk/story/viewer/api/view/StoriesBlockHolderFactory;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storyMetricsCollector", "getStoryMetricsCollector()Lcom/vk/story/viewer/api/util/StoryMetricsCollector;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storiesBlocksEventController", "getStoriesBlocksEventController()Lcom/vk/story/viewer/api/util/StoriesBlocksEventController;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storiesUtil", "getStoriesUtil()Lcom/vk/story/viewer/api/util/StoriesUtil;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storyOwnerUtil", "getStoryOwnerUtil()Lcom/vk/story/viewer/api/util/StoryOwnerUtil;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "clickableStickerDelegateFactory", "getClickableStickerDelegateFactory()Lcom/vk/story/viewer/api/view/clickable/ClickableStickerDelegateFactory;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "interactor", "getInteractor()Lcom/vk/story/viewer/impl/domain/StoryViewerInteractorImpl;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "preferenceManager", "getPreferenceManager()Lcom/vk/story/viewer/impl/domain/StoryViewerPreferenceManagerImpl;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storyViewerLifecycleController", "getStoryViewerLifecycleController()Lcom/vk/story/viewer/api/view/StoryViewerLifecycleController;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storiesDownloadTechMetrics", "getStoriesDownloadTechMetrics()Lcom/vk/story/viewer/api/util/StoriesDownloadTechMetrics;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "contentPreLoader", "getContentPreLoader()Lcom/vk/story/viewer/api/domain/StoriesBackgroundContentLoader;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "storyFirstFrameWarmer", "getStoryFirstFrameWarmer()Lcom/vk/story/viewer/api/domain/StoryFirstFrameWarmer;", hpf0Var), ep.a(0, StoryViewerComponentImpl.class, "discoverController", "getDiscoverController()Lcom/vk/story/viewer/api/domain/DiscoverController;", hpf0Var)};
    }

    public StoryViewerComponentImpl(StoriesComponent storiesComponent, PhotosComponent photosComponent) {
        this.a = storiesComponent;
        this.b = photosComponent;
        new nwy(new k03(12));
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final aql0 M1() {
        qcy<Object> qcyVar = s[14];
        return (aql0) this.q.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final z6m0 Me() {
        qcy<Object> qcyVar = s[5];
        return (z6m0) this.h.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final erl0 Nd() {
        qcy<Object> qcyVar = s[6];
        return (erl0) this.i.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final vrl0 V2() {
        qcy<Object> qcyVar = s[13];
        return (vrl0) this.p.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final yjc Wd() {
        qcy<Object> qcyVar = s[9];
        return (yjc) this.l.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final fnm0 b() {
        qcy<Object> qcyVar = s[10];
        return (hnm0) this.m.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final lnm0 g9() {
        qcy<Object> qcyVar = s[11];
        return (mnm0) this.n.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final v2m0 k6() {
        qcy<Object> qcyVar = s[15];
        return (v2m0) this.r.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final anm0 l9() {
        qcy<Object> qcyVar = s[3];
        return (anm0) this.f.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final s7m0 lb() {
        qcy<Object> qcyVar = s[8];
        return (s7m0) this.k.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final StoryViewerRouter tb() {
        qcy<Object> qcyVar = s[2];
        return (StoryViewerRouter) this.e.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final tql0 va() {
        qcy<Object> qcyVar = s[4];
        return (tql0) this.g.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final jnm0 w9() {
        qcy<Object> qcyVar = s[12];
        return (jnm0) this.o.c();
    }

    @Override // com.vk.story.viewer.api.di.StoryViewerComponent
    public final wvl0 z3() {
        qcy<Object> qcyVar = s[7];
        return (wvl0) this.j.c();
    }
}
