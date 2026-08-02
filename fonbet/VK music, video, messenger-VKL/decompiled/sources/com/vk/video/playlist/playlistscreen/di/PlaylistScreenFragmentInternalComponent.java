package com.vk.video.playlist.playlistscreen.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.section.api.CatalogPerformanceMetrics;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.di.CatalogInteractorComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.cea;
import xsna.da50;
import xsna.ep;
import xsna.f550;
import xsna.f5x;
import xsna.fp;
import xsna.fpf0;
import xsna.g7s0;
import xsna.hj60;
import xsna.hpf0;
import xsna.i440;
import xsna.iz3;
import xsna.m1y;
import xsna.nly;
import xsna.nwy;
import xsna.pr6;
import xsna.qcy;
import xsna.tcb0;
import xsna.tju;
import xsna.vv20;
import xsna.x750;
import xsna.yu60;
import xsna.zf20;

/* compiled from: PlaylistScreenFragmentInternalComponent.kt */
/* loaded from: classes6.dex */
public final class PlaylistScreenFragmentInternalComponent implements DiScopedComponent<tcb0> {
    public static final a x;
    public static final /* synthetic */ qcy<Object>[] y;
    public final tcb0 a;
    public final AppContextDiComponent b;
    public final AuthBridgeComponent c;
    public final CatalogComponent d;
    public final CatalogInteractorComponent e;
    public final VideoBottomSheetComponent f;
    public final VideoRestrictedUserActionsComponent g;
    public final BridgeComponent h;
    public final VideoPlaylistReversionComponent i;
    public final nwy j = new nwy(new yu60(this, 8));
    public final nwy k = new nwy(new iz3(22));
    public final nwy l = new nwy(new nly(this, 27));
    public final nwy m = new nwy(new da50(this, 11));
    public final nwy n = new nwy(new pr6(26));
    public final nwy o = new nwy(new i440(this, 14));
    public final nwy p = new nwy(new zf20(this, 17));
    public final nwy q = new nwy(new hj60(this, 6));
    public final nwy r = new nwy(new f550(this, 12));
    public final nwy s = new nwy(new f5x(this, 29));
    public final nwy t = new nwy(new m1y(this, 26));
    public final nwy u = new nwy(new x750(this, 10));
    public final nwy v = new nwy(new tju(this, 18));
    public final nwy w = new nwy(new vv20(this, 13));

    /* compiled from: PlaylistScreenFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PlaylistScreenFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/playlist/playlistscreen/ui/store/PlaylistScreenViewStateMapper;", 0);
        hpf0 hpf0Var = fpf0.a;
        y = new qcy[]{propertyReference1Impl, fp.c(0, PlaylistScreenFragmentInternalComponent.class, "catalogPerformanceMetrics", "getCatalogPerformanceMetrics()Lcom/vk/catalog/mvi/section/api/CatalogPerformanceMetrics;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "sectionView", "getSectionView()Lcom/vk/catalog/mvi/section/ui/view/CatalogSectionView;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "authBridge", "getAuthBridge()Lcom/vk/bridges/AuthBridge;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "catalogSectionViewEventHandler", "getCatalogSectionViewEventHandler()Lcom/vk/catalog/mvi/section/ui/view/CatalogSectionViewEventHandler;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "playlistBottomSheetActionTracker", "getPlaylistBottomSheetActionTracker()Lcom/vk/video/playlist/playlistscreen/catalog/PlaylistBottomSheetActionTracker;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "groupsBridge", "getGroupsBridge()Lcom/vk/bridges/GroupsBridge;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "playlistCatalogBlockRegister", "getPlaylistCatalogBlockRegister()Lcom/vk/video/playlist/playlistscreen/catalog/PlaylistCatalogBlockRegister;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "catalogSectionFactory", "getCatalogSectionFactory()Lcom/vk/catalog/mvi/section/di/CatalogSectionFactory;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "restrictedUserActionsRepository", "getRestrictedUserActionsRepository()Lcom/vk/video/kidsprofile/restricteduseractions/RestrictedUserActionsRepository;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "catalogSearchStatProvider", "getCatalogSearchStatProvider()Lcom/vk/catalog/mvi/section/analyitcs/CatalogSearchStatProvider;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "catalogAnalytics", "getCatalogAnalytics()Lcom/vk/catalog/mvi/analytics/CatalogAnalytics;", hpf0Var), ep.a(0, PlaylistScreenFragmentInternalComponent.class, "channelScreenInteractor", "getChannelScreenInteractor()Lcom/vk/video/playlist/playlistscreen/domain/PlaylistScreenInteractorImpl;", hpf0Var)};
        x = new a();
    }

    public PlaylistScreenFragmentInternalComponent(tcb0 tcb0Var, AppContextDiComponent appContextDiComponent, AuthBridgeComponent authBridgeComponent, CatalogComponent catalogComponent, CatalogInteractorComponent catalogInteractorComponent, VideoBottomSheetComponent videoBottomSheetComponent, VideoRestrictedUserActionsComponent videoRestrictedUserActionsComponent, BridgeComponent bridgeComponent, VideoPlaylistReversionComponent videoPlaylistReversionComponent) {
        this.a = tcb0Var;
        this.b = appContextDiComponent;
        this.c = authBridgeComponent;
        this.d = catalogComponent;
        this.e = catalogInteractorComponent;
        this.f = videoBottomSheetComponent;
        this.g = videoRestrictedUserActionsComponent;
        this.h = bridgeComponent;
        this.i = videoPlaylistReversionComponent;
    }

    public final CatalogPerformanceMetrics Df() {
        qcy<Object> qcyVar = y[1];
        return (CatalogPerformanceMetrics) this.k.c();
    }

    public final cea Ef() {
        qcy<Object> qcyVar = y[9];
        return (cea) this.s.c();
    }

    public final g7s0 Ff() {
        qcy<Object> qcyVar = y[4];
        return (g7s0) this.n.c();
    }
}
