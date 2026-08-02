package com.vk.clips.viewer.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.download.api.di.ClipsDownloadComponent;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.sdk.shared.api.di.ClipsViewersSdkComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.clips.uploader.api.ClipsUploadSdkUploaderComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.vk.ClipsViewerEventsComponent;
import com.vk.clips.viewer.vk.ClipsViewerSideControlsConfigComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.movika.sdk.base.logic.interactor.j;
import com.vk.movika.sdk.base.logic.processor.actions.i;
import com.vk.movika.sdk.base.model.e;
import com.vk.movika.sdk.base.model.props.c;
import com.vk.movika.sdk.base.model.props.d;
import com.vk.movika.sdk.base.ui.g0;
import com.vk.movika.sdk.base.ui.o0;
import com.vk.movika.sdk.base.ui.t;
import com.vk.movika.sdk.base.ui.v;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import defpackage.f;
import defpackage.h;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b0d;
import xsna.bu0;
import xsna.bu1;
import xsna.c8m;
import xsna.cb;
import xsna.d14;
import xsna.d4;
import xsna.dv2;
import xsna.ek;
import xsna.ep;
import xsna.ewy;
import xsna.f20;
import xsna.f4;
import xsna.f84;
import xsna.f8d;
import xsna.fp;
import xsna.fpf0;
import xsna.g0f;
import xsna.g8d;
import xsna.g8m;
import xsna.h4u0;
import xsna.h6;
import xsna.hpf0;
import xsna.i21;
import xsna.ibr0;
import xsna.ig;
import xsna.im0;
import xsna.iy2;
import xsna.jg0;
import xsna.k930;
import xsna.ka0;
import xsna.kbk;
import xsna.kk1;
import xsna.kof;
import xsna.ld80;
import xsna.lz2;
import xsna.m0x;
import xsna.mtf;
import xsna.n7d;
import xsna.nh;
import xsna.nh0;
import xsna.nwy;
import xsna.ob0;
import xsna.oo;
import xsna.p20;
import xsna.pwj0;
import xsna.q;
import xsna.q20;
import xsna.qcy;
import xsna.ra0;
import xsna.ro10;
import xsna.s1;
import xsna.sl70;
import xsna.soc;
import xsna.soe;
import xsna.t61;
import xsna.tle;
import xsna.ume;
import xsna.uqd;
import xsna.urf;
import xsna.v40;
import xsna.v8d;
import xsna.vf0;
import xsna.vz50;
import xsna.w40;
import xsna.w5e;
import xsna.w9;
import xsna.we0;
import xsna.xm1;
import xsna.xme;
import xsna.xne;
import xsna.xs6;
import xsna.y1e;
import xsna.y6;
import xsna.yv2;
import xsna.z4f;
import xsna.zhe;
import xsna.zid;
import xsna.zq3;

/* compiled from: ClipsViewerComponentImpl.kt */
/* loaded from: classes17.dex */
public final class ClipsViewerComponentImpl implements ClipsViewerComponent {
    public static final /* synthetic */ qcy<Object>[] o0;
    public final ewy A;
    public final nwy B;
    public final nwy C;
    public final nwy D;
    public final nwy E;
    public final nwy F;
    public final nwy G;
    public final nwy H;
    public final nwy I;
    public final nwy J;
    public final nwy K;
    public final nwy L;
    public final nwy M;
    public final nwy N;
    public final nwy O;
    public final nwy P;
    public final nwy Q;
    public final nwy R;
    public final nwy S;
    public final nwy T;
    public final nwy U;
    public final nwy V;
    public final nwy W;
    public final nwy X;
    public final nwy Y;
    public final nwy Z;
    public final ClipsInterestsComponent a;
    public final nwy a0;
    public final ClipsConfigViewersComponent b;
    public final nwy b0;
    public final ClipEditComponent c;
    public final nwy c0;
    public final CameraClipsComponent d;
    public final nwy d0;
    public final SharingComponent e;
    public final nwy e0;
    public final ClipsViewersSdkComponent f;
    public final nwy f0;
    public final ClipsDownloadComponent g;
    public final nwy g0;
    public final ClipsUploadVkComponent h;
    public final nwy h0;
    public final ClipsUploadSdkUploaderComponent i;
    public final nwy i0;
    public final ClipsConfigAuthorsComponent j;
    public final nwy j0;
    public final ClipsViewerSideControlsConfigComponent k;
    public final nwy k0;
    public final ClipsViewerEventsComponent l;
    public final nwy l0;
    public final LinksBridgeComponent m;
    public final nwy m0;
    public final AuthBridgeComponent n;
    public final nwy n0;
    public final nwy o = new nwy(new h6(this, 23));
    public final nwy p = new nwy(new s1(this, 29));
    public final nwy q = new nwy(new iy2(12));
    public final nwy r;
    public final nwy s;
    public final nwy t;
    public final nwy u;
    public final nwy v;
    public final nwy w;
    public final nwy x;
    public final nwy y;
    public final nwy z;

    /* compiled from: ClipsViewerComponentImpl.kt */
    public static final class a implements c8m<ClipsViewerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new ClipsViewerComponentImpl((ClipsInterestsComponent) g8mVar.a(fpf0.a(ClipsInterestsComponent.class)), (ClipsConfigViewersComponent) g8mVar.a(fpf0.a(ClipsConfigViewersComponent.class)), (ClipEditComponent) g8mVar.a(fpf0.a(ClipEditComponent.class)), (CameraClipsComponent) g8mVar.a(fpf0.a(CameraClipsComponent.class)), (SharingComponent) g8mVar.a(fpf0.a(SharingComponent.class)), (ClipsViewersSdkComponent) g8mVar.a(fpf0.a(ClipsViewersSdkComponent.class)), (ClipsDownloadComponent) g8mVar.a(fpf0.a(ClipsDownloadComponent.class)), (ClipsUploadVkComponent) g8mVar.a(fpf0.a(ClipsUploadVkComponent.class)), (ClipsUploadSdkUploaderComponent) g8mVar.a(fpf0.a(ClipsUploadSdkUploaderComponent.class)), (ClipsConfigAuthorsComponent) g8mVar.a(fpf0.a(ClipsConfigAuthorsComponent.class)), (ClipsViewerSideControlsConfigComponent) g8mVar.a(fpf0.a(ClipsViewerSideControlsConfigComponent.class)), (ClipsViewerEventsComponent) g8mVar.a(fpf0.a(ClipsViewerEventsComponent.class)), (LinksBridgeComponent) g8mVar.a(fpf0.a(LinksBridgeComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    /* compiled from: ClipsViewerComponentImpl.kt */
    public static final class b implements f8d {
        public b() {
        }

        @Override // xsna.f8d
        public final k930 a(g8d g8dVar) {
            return new k930(g8dVar, ClipsViewerComponentImpl.this.a, null, 12);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(ClipsViewerComponentImpl.class, "formatter", "getFormatter()Lcom/vk/clips/viewer/api/domain/VKClipsDataFormatter;", 0);
        hpf0 hpf0Var = fpf0.a;
        o0 = new qcy[]{propertyReference1Impl, fp.c(0, ClipsViewerComponentImpl.class, "clipsInterestsResultConsumer", "getClipsInterestsResultConsumer()Lcom/vk/clips/viewer/api/interests/ClipsInterestsResultConsumer;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "npsController", "getNpsController()Lcom/vk/clips/viewer/api/nps/NpsController;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipUpdateListLocker", "getClipUpdateListLocker()Lcom/vk/clips/sdk/shared/api/utils/ClipsFeedUpdatesLocker;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipMainOverlayPreviewFactory", "getClipMainOverlayPreviewFactory()Lcom/vk/clips/viewer/api/feed/item/clip/preview/ClipMainOverlayPreviewFactory;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsOwnerChecker", "getClipsOwnerChecker()Lcom/vk/clips/sdk/shared/api/utils/ClipsOwnerChecker;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsLazyViewInflaterController", "getClipsLazyViewInflaterController()Lcom/vk/clips/viewer/impl/utils/ClipsLazyViewInflateController;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "viewsRepository", "getViewsRepository()Lcom/vk/clips/viewer/api/utils/ViewsRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsNewsFeedEndOverlayAnalytics", "getClipsNewsFeedEndOverlayAnalytics()Lcom/vk/clips/viewer/api/utils/ClipsNewsFeedEndOverlayAnalytics;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipNewsfeedEndOverlayAdBannersInfoFolder", "getClipNewsfeedEndOverlayAdBannersInfoFolder()Lcom/vk/clips/viewer/api/feed/helper/ClipsNewsfeedAdBannersInfoHolder;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipPlayTimeStampRepository", "getClipPlayTimeStampRepository()Lcom/vk/clips/viewer/api/utils/ClipPlayTimeStampRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsExternalActionRepository", "getClipsExternalActionRepository()Lcom/vk/clips/sdk/shared/api/external/action/ClipsExternalActionRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipInternalStateRepository", "getClipInternalStateRepository()Lcom/vk/clips/sdk/shared/api/external/state/ClipInternalStateRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsRecomFeedItemsToSdkMapper", "getClipsRecomFeedItemsToSdkMapper()Lcom/vk/clips/sdk/shared/api/recom/ClipsRecomFeedItemsToSdkMapper;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "remoteSource", "getRemoteSource()Lcom/vk/clips/viewer/api/domain/ShortVideoUserSettingsRemoteSource;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "localSource", "getLocalSource()Lcom/vk/clips/viewer/api/domain/ShortVideoUserSettingsLocalSource;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "maxSkipCountClosingAdInteractor", "getMaxSkipCountClosingAdInteractor()Lcom/vk/clips/viewer/api/domain/MaxSkipCountClosingAdInteractor;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "autoScrollSettingsRepository", "getAutoScrollSettingsRepository()Lcom/vk/clips/viewer/api/domain/ClipsAutoScrollSettingsRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipMoreMenuEntryPointFactory", "getClipMoreMenuEntryPointFactory()Lcom/vk/clips/viewer/api/menu/ClipMoreMenuEntryPointFactory;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipTrendsEngagementUIStateHelper", "getClipTrendsEngagementUIStateHelper()Lcom/vk/clips/sdk/shared/api/trends/ClipTrendsEngagementUIStateHelper;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsViewerEventStore", "getClipsViewerEventStore()Lcom/vk/clips/viewer/api/events/ClipsViewerEventStore;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "actionLinkToEventTypeMapper", "getActionLinkToEventTypeMapper()Lcom/vk/clips/viewer/api/events/ActionLinkToEventTypeMapper;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "activitiesRepository", "getActivitiesRepository$impl_release()Lcom/vk/clips/sdk/shared/api/feed/activities/SdkClipsActivitiesRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "sdkActionLinkToEventTypeMapper", "getSdkActionLinkToEventTypeMapper$impl_release()Lcom/vk/clips/sdk/shared/feed/core/analytics/ActionLinkToEventTypeMapper;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "subtitlesRepository", "getSubtitlesRepository$impl_release()Lcom/vk/clips/viewer/impl/feed/repository/ClipsSubtitlesRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "subtitlesStateFactory", "getSubtitlesStateFactory$impl_release()Lcom/vk/clips/viewer/impl/feed/view/subs/ClipsSubtitlesStateFactory;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipControlsHiderDelegator", "getClipControlsHiderDelegator$impl_release()Lcom/vk/clips/viewer/impl/utils/ClipControlsHiderDelegator;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsFeedAdapterMainThreadExecutorLocker", "getClipsFeedAdapterMainThreadExecutorLocker$impl_release()Lcom/vk/clips/sdk/shared/feed/recycler/adapter/executor/ClipsFeedAdapterMainThreadExecutorLocker;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "internalNpsController", "getInternalNpsController$impl_release()Lcom/vk/clips/viewer/impl/nps/controller/InternalNpsController;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "internalNpsMapper", "getInternalNpsMapper$impl_release()Lcom/vk/clips/viewer/impl/nps/ClipsInternalNpsMapper;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "ownerSwipeInteractor", "getOwnerSwipeInteractor$impl_release()Lcom/vk/clips/viewer/impl/owner/domain/interactor/ClipsOwnerSwipeInteractor;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "wrapperInteractor", "getWrapperInteractor$impl_release()Lcom/vk/clips/viewer/impl/feed/wrapper/domain/interactor/ClipsWrapperInteractor;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "wrapperScreenInfoProvider", "getWrapperScreenInfoProvider$impl_release()Lcom/vk/clips/viewer/impl/feed/wrapper/ui/screen/ClipsWrapperScreenInfoProvider;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "feedListOpenHandler", "getFeedListOpenHandler$impl_release()Lcom/vk/clips/viewer/impl/feed/onboarding/OnboardingFeedOpenTracker;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "onboardingActionsHandler", "getOnboardingActionsHandler$impl_release()Lcom/vk/clips/sdk/shared/feed/onboarding/OnboardingActionsHandler;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "necessaryOnboarding", "getNecessaryOnboarding$impl_release()Lcom/vk/clips/viewer/impl/feed/onboarding/NecessaryOnboarding;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "sharePopupHelper", "getSharePopupHelper$impl_release()Lcom/vk/clips/viewer/impl/feed/view/list/item/controls/side/shares/fast/popup/ClipsFastSharePopupHelper;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "shareRepository", "getShareRepository$impl_release()Lcom/vk/clips/viewer/impl/feed/view/list/item/controls/side/shares/fast/repository/ClipsShareRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "headerTabsRepository", "getHeaderTabsRepository$impl_release()Lcom/vk/clips/viewer/impl/feed/wrapper/data/header/HeaderTabsRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "inlineNpsRepository", "getInlineNpsRepository$impl_release()Lcom/vk/clips/sdk/shared/feed/repository/InlineNpsRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "internalNpsRepository", "getInternalNpsRepository$impl_release()Lcom/vk/clips/viewer/impl/feed/repository/InternalNpsRepositoryImpl;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "videoStateStatistics", "getVideoStateStatistics$impl_release()Lcom/vk/clips/sdk/shared/item/video/ClipsVideoStateStatistics;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "customSideControlsConfig", "getCustomSideControlsConfig$impl_release()Lcom/vk/clips/design/view/sidecontrols/custom/api/SDKViewerSideControlConfig;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "gridProfileInfoRepository", "getGridProfileInfoRepository$impl_release()Lcom/vk/clips/viewer/impl/grid/repository/delegates/ClipsProfileInfoRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "gridChallengeInfoRepository", "getGridChallengeInfoRepository$impl_release()Lcom/vk/clips/viewer/impl/grid/repository/delegates/ClipsChallengeInfoRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsDeviceInfoProvider", "getClipsDeviceInfoProvider$impl_release()Lcom/vk/clips/viewer/impl/utils/ClipsDeviceInfoProvider;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "commentsFormatter", "getCommentsFormatter$impl_release()Lcom/vk/clips/viewer/impl/feed/activities/comments/ClipsCommentsFormatterImpl;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "eventsListener", "getEventsListener$impl_release()Lcom/vk/clips/sdk/shared/api/events/EventsConsumer;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "clipsMemoryCache", "getClipsMemoryCache$impl_release()Landroidx/collection/LruCache;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "wrapperRepository", "getWrapperRepository()Lcom/vk/clips/viewer/impl/feed/wrapper/domain/repository/ClipsWrapperRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "wrapperMemoryStorage", "getWrapperMemoryStorage()Lcom/vk/clips/viewer/impl/feed/wrapper/data/repository/storage/memory/ClipsWrapperMemoryStorage;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "ownerSwipeRepository", "getOwnerSwipeRepository()Lcom/vk/clips/viewer/impl/owner/domain/repository/ClipsOwnerSwipeRepository;", hpf0Var), ep.a(0, ClipsViewerComponentImpl.class, "ownerSwipeMemoryStorage", "getOwnerSwipeMemoryStorage()Lcom/vk/clips/viewer/impl/owner/data/storage/memory/ClipsOwnerSwipeMemoryStorage;", hpf0Var)};
    }

    public ClipsViewerComponentImpl(ClipsInterestsComponent clipsInterestsComponent, ClipsConfigViewersComponent clipsConfigViewersComponent, ClipEditComponent clipEditComponent, CameraClipsComponent cameraClipsComponent, SharingComponent sharingComponent, ClipsViewersSdkComponent clipsViewersSdkComponent, ClipsDownloadComponent clipsDownloadComponent, ClipsUploadVkComponent clipsUploadVkComponent, ClipsUploadSdkUploaderComponent clipsUploadSdkUploaderComponent, ClipsConfigAuthorsComponent clipsConfigAuthorsComponent, ClipsViewerSideControlsConfigComponent clipsViewerSideControlsConfigComponent, ClipsViewerEventsComponent clipsViewerEventsComponent, LinksBridgeComponent linksBridgeComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = clipsInterestsComponent;
        this.b = clipsConfigViewersComponent;
        this.c = clipEditComponent;
        this.d = cameraClipsComponent;
        this.e = sharingComponent;
        this.f = clipsViewersSdkComponent;
        this.g = clipsDownloadComponent;
        this.h = clipsUploadVkComponent;
        this.i = clipsUploadSdkUploaderComponent;
        this.j = clipsConfigAuthorsComponent;
        this.k = clipsViewerSideControlsConfigComponent;
        this.l = clipsViewerEventsComponent;
        this.m = linksBridgeComponent;
        this.n = authBridgeComponent;
        new ewy(new im0(this, 24));
        this.r = new nwy(new e(this, 22));
        this.s = new nwy(new nh0(6));
        this.t = new nwy(new com.vk.movika.sdk.base.model.props.a(5));
        this.u = new nwy(new c(11));
        this.v = new nwy(new d(16));
        this.w = new nwy(new q(this, 26));
        this.x = new nwy(new t61(14));
        this.y = new nwy(new zq3(10));
        this.z = new nwy(new lz2(6));
        this.A = new ewy(new f4(8));
        this.B = new nwy(new yv2(9));
        this.C = new nwy(new nh(7));
        this.D = new nwy(new f(this, 21));
        this.E = new nwy(new z4f(this, 2));
        this.F = new nwy(new h(this, 29));
        this.G = new nwy(new we0(this, 25));
        this.H = new nwy(new w9(6));
        this.I = new nwy(new v40(this, 23));
        this.J = new nwy(new w40(this, 22));
        this.K = new nwy(new xs6(6));
        this.L = new nwy(new d14(7));
        this.M = new nwy(new t(this, 28));
        this.N = new nwy(new v(11));
        this.O = new nwy(new ek(10));
        this.P = new nwy(new y6(this, 25));
        this.Q = new nwy(new g0(14));
        this.R = new nwy(new oo(this, 23));
        this.S = new nwy(new com.vk.movika.sdk.base.logic.interactor.h(this, 23));
        this.T = new nwy(new o0(12));
        this.U = new nwy(new j(this, 29));
        this.V = new nwy(new xm1(this, 25));
        this.W = new nwy(new ka0(this, 27));
        this.X = new nwy(new vf0(this, 25));
        this.Y = new nwy(new f84(7));
        this.Z = new nwy(new ra0(this, 27));
        this.a0 = new nwy(new f20(8));
        this.b0 = new nwy(new dv2(6));
        this.c0 = new nwy(new jg0(6));
        this.d0 = new nwy(new com.vk.movika.sdk.base.logic.processor.actions.d(this, 23));
        this.e0 = new nwy(new kk1(3));
        this.f0 = new nwy(new ig(6));
        this.g0 = new nwy(new i21(6));
        this.h0 = new nwy(new i(this, 20));
        this.i0 = new nwy(new bu1(this, 16));
        this.j0 = new nwy(new ob0(5));
        this.k0 = new nwy(new com.vk.movika.sdk.base.model.b(this, 28));
        this.l0 = new nwy(new bu0(6));
        this.m0 = new nwy(new cb(this, 23));
        this.n0 = new nwy(new d4(10));
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final xme A7() {
        qcy<Object> qcyVar = o0[9];
        return (xme) this.w.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final ro10 Ba() {
        qcy<Object> qcyVar = o0[16];
        return (ro10) this.D.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final soc Df() {
        qcy<Object> qcyVar = o0[26];
        return (soc) this.N.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uqd Ef() {
        qcy<Object> qcyVar = o0[45];
        return (uqd) this.g0.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final w5e Ff() {
        qcy<Object> qcyVar = o0[27];
        return (w5e) this.O.c();
    }

    public final ld80 Gf() {
        qcy<Object> qcyVar = o0[33];
        return (ld80) this.U.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m0x Hf() {
        qcy<Object> qcyVar = o0[39];
        return (m0x) this.a0.c();
    }

    public final tle If() {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        CameraClipsComponent cameraClipsComponent = this.d;
        kbk context = cameraClipsComponent.c4().getContext();
        int i = context != null ? context.b : -1;
        kbk context2 = cameraClipsComponent.c4().getContext();
        if (context2 == null || (creationEntryPoint = context2.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        return new tle(new MobileOfficialAppsClipsStat$ClipsCreateContext(i, creationEntryPoint));
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final b0d J6() {
        qcy<Object> qcyVar = o0[12];
        return (b0d) this.z.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vz50 Jf() {
        qcy<Object> qcyVar = o0[35];
        return (vz50) this.W.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final y1e K0() {
        qcy<Object> qcyVar = o0[11];
        return (y1e) this.y.c();
    }

    public final sl70 Kf() {
        qcy<Object> qcyVar = o0[2];
        return (sl70) this.q.c();
    }

    public final soe Lf() {
        qcy<Object> qcyVar = o0[30];
        return (soe) this.R.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q20 Mf() {
        qcy<Object> qcyVar = o0[23];
        return (q20) this.K.c();
    }

    public final h4u0 Nf() {
        qcy<Object> qcyVar = o0[7];
        return (h4u0) this.u.c();
    }

    public final urf Of() {
        qcy<Object> qcyVar = o0[31];
        return (urf) this.S.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mtf Pf() {
        qcy<Object> qcyVar = o0[32];
        return (mtf) this.T.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final v8d Xb() {
        qcy<Object> qcyVar = o0[10];
        return (v8d) this.x.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final xne Y() {
        qcy<Object> qcyVar = o0[5];
        return (xne) this.s.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final p20 d9() {
        qcy<Object> qcyVar = o0[21];
        return (p20) this.I.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final kof gb() {
        qcy<Object> qcyVar = o0[20];
        return (kof) this.H.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final zhe i6() {
        qcy<Object> qcyVar = o0[1];
        return (zhe) this.p.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final g0f j4() {
        qcy<Object> qcyVar = o0[13];
        return (g0f) this.A.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final n7d k9() {
        qcy<Object> qcyVar = o0[4];
        return (n7d) this.r.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final f8d n6() {
        qcy<Object> qcyVar = o0[18];
        return (f8d) this.F.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final zid p5() {
        qcy<Object> qcyVar = o0[17];
        return (zid) this.E.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final ibr0 pe() {
        qcy<Object> qcyVar = o0[0];
        return (ibr0) this.o.c();
    }

    @Override // com.vk.clips.viewer.api.di.ClipsViewerComponent
    public final ume v1() {
        qcy<Object> qcyVar = o0[8];
        return (ume) this.v.c();
    }
}
