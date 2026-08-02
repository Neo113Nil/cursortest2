package com.vk.editor.di;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.stickers.api.di.StickersComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.settings.api.di.StoriesSettingsComponent;
import java.util.ArrayList;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.da50;
import xsna.e6k0;
import xsna.ep;
import xsna.f880;
import xsna.fp;
import xsna.fpf0;
import xsna.g13;
import xsna.g880;
import xsna.g8m;
import xsna.gkc0;
import xsna.gpj0;
import xsna.gqh0;
import xsna.hkm0;
import xsna.hpf0;
import xsna.hrj0;
import xsna.i13;
import xsna.iql0;
import xsna.irc0;
import xsna.izs;
import xsna.k1m0;
import xsna.mrj0;
import xsna.msj0;
import xsna.npe0;
import xsna.nwy;
import xsna.o1m0;
import xsna.os30;
import xsna.psj0;
import xsna.pwj0;
import xsna.qah0;
import xsna.qbc0;
import xsna.qcy;
import xsna.rqj0;
import xsna.s3q0;
import xsna.spj0;
import xsna.tbe0;
import xsna.x9l0;
import xsna.xqj0;
import xsna.y3p;
import xsna.z3p;

/* compiled from: StoryEditorExtDepsComponentImpl.kt */
/* loaded from: classes18.dex */
public final class StoryEditorExtDepsComponentImpl implements StoryEditorExtDepsComponent {
    public static final /* synthetic */ qcy<Object>[] r;
    public final StoriesComponent a;
    public final BridgeComponent b;
    public final StickersComponent c;
    public final StoriesSettingsComponent d;
    public final nwy e = new nwy(new e6k0(1));
    public final nwy f = new nwy(new irc0(this, 14));
    public final nwy g;
    public final nwy h;
    public final nwy i;
    public final nwy j;
    public final nwy k;
    public final nwy l;
    public final nwy m;
    public final nwy n;
    public final nwy o;
    public final nwy p;
    public final nwy q;

    /* compiled from: StoryEditorExtDepsComponentImpl.kt */
    public static final class a implements c8m<StoryEditorExtDepsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new StoryEditorExtDepsComponentImpl((StoriesComponent) g8mVar.a(fpf0.a(StoriesComponent.class)), (BridgeComponent) g8mVar.a(fpf0.a(BridgeComponent.class)), (StickersComponent) g8mVar.a(fpf0.a(StickersComponent.class)), (StoriesSettingsComponent) g8mVar.a(fpf0.a(StoriesSettingsComponent.class)));
        }
    }

    /* compiled from: StoryEditorExtDepsComponentImpl.kt */
    public static final class b implements hkm0 {
        public b() {
        }

        @Override // xsna.hkm0
        public final void b(StoryMultiData storyMultiData) {
            StoryEditorExtDepsComponentImpl.this.a.eb().b(storyMultiData);
        }
    }

    /* compiled from: StoryEditorExtDepsComponentImpl.kt */
    public static final class c implements k1m0 {
        public final ArrayList a = new ArrayList();

        public c(StoryEditorExtDepsComponentImpl storyEditorExtDepsComponentImpl) {
            storyEditorExtDepsComponentImpl.a.f2().d(this);
        }

        @Override // xsna.k1m0
        public final void a(izs<? super Boolean, s3q0> izsVar) {
            this.a.add(izsVar);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(StoryEditorExtDepsComponentImpl.class, "questionsAnalytics", "getQuestionsAnalytics()Lcom/vk/editor/analytics/QuestionAnalytics;", 0);
        hpf0 hpf0Var = fpf0.a;
        r = new qcy[]{propertyReference1Impl, fp.c(0, StoryEditorExtDepsComponentImpl.class, "hintsBridge", "getHintsBridge()Lcom/vk/editor/domain/SimpleHintsBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "storiesBridge", "getStoriesBridge()Lcom/vk/editor/domain/SimpleStoriesBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "storiesUploader", "getStoriesUploader()Lcom/vk/editor/domain/StoryUploader;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "storyEditorCacheController", "getStoryEditorCacheController()Lcom/vk/story/api/domain/interactor/common/StoryEditorCacheController;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "authBridge", "getAuthBridge()Lcom/vk/editor/domain/SimpleAuthBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "clipsBridge", "getClipsBridge()Lcom/vk/editor/domain/SimpleClipsBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "navBridge", "getNavBridge()Lcom/vk/editor/domain/SimpleNavBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "linksBridge", "getLinksBridge()Lcom/vk/editor/domain/SimpleLinksBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "groupsBridge", "getGroupsBridge()Lcom/vk/editor/domain/SimpleGroupsBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "shareBridge", "getShareBridge()Lcom/vk/editor/domain/SimpleShareBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "stickersBridge", "getStickersBridge()Lcom/vk/editor/domain/SimpleStickersBridge;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "backgroundRepository", "getBackgroundRepository()Lcom/vk/editor/domain/StoriesBackgroundRepository;", hpf0Var), ep.a(0, StoryEditorExtDepsComponentImpl.class, "editorMetricsCollector", "getEditorMetricsCollector()Lcom/vk/editor/analytics/StoryEditorMetricsCollector;", hpf0Var)};
    }

    public StoryEditorExtDepsComponentImpl(StoriesComponent storiesComponent, BridgeComponent bridgeComponent, StickersComponent stickersComponent, StoriesSettingsComponent storiesSettingsComponent) {
        this.a = storiesComponent;
        this.b = bridgeComponent;
        this.c = stickersComponent;
        this.d = storiesSettingsComponent;
        new nwy(new os30(this, 27));
        this.g = new nwy(new qah0(this, 8));
        this.h = new nwy(new qbc0(this, 17));
        this.i = new nwy(new gqh0(this, 4));
        this.j = new nwy(new gkc0(this, 13));
        this.k = new nwy(new da50(this, 24));
        this.l = new nwy(new x9l0(this, 3));
        this.m = new nwy(new f880(this, 23));
        this.n = new nwy(new g13(23));
        this.o = new nwy(new g880(this, 29));
        this.p = new nwy(new i13(28));
        this.q = new nwy(new tbe0(this, 14));
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final iql0 Cb() {
        qcy<Object> qcyVar = r[12];
        return (iql0) this.p.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final k1m0 Dd() {
        qcy<Object> qcyVar = r[4];
        return (k1m0) this.h.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final hkm0 Je() {
        qcy<Object> qcyVar = r[3];
        return (hkm0) this.g.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final xqj0 K2() {
        qcy<Object> qcyVar = r[1];
        return (xqj0) this.f.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final y3p M0() {
        return new z3p();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final rqj0 O() {
        qcy<Object> qcyVar = r[9];
        return (rqj0) this.m.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final psj0 R() {
        qcy<Object> qcyVar = r[11];
        return (psj0) this.o.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final msj0 Xd() {
        qcy<Object> qcyVar = r[10];
        return (msj0) this.n.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final gpj0 k7() {
        qcy<Object> qcyVar = r[5];
        return (gpj0) this.i.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final o1m0 l6() {
        qcy<Object> qcyVar = r[13];
        return (o1m0) this.q.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final hrj0 p() {
        qcy<Object> qcyVar = r[8];
        return (hrj0) this.l.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final npe0 r8() {
        qcy<Object> qcyVar = r[0];
        return (npe0) this.e.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final mrj0 w0() {
        qcy<Object> qcyVar = r[7];
        return (mrj0) this.k.c();
    }

    @Override // com.vk.editor.di.StoryEditorExtDepsComponent
    public final spj0 x() {
        qcy<Object> qcyVar = r[6];
        return (spj0) this.j.c();
    }
}
