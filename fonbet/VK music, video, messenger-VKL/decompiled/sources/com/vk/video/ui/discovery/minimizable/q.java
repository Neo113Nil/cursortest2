package com.vk.video.ui.discovery.minimizable;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import defpackage.q0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.g290;
import xsna.hfz;
import xsna.ho8;
import xsna.i31;
import xsna.km50;
import xsna.l31;
import xsna.lat0;
import xsna.qoy;
import xsna.sdh0;
import xsna.shy;

/* compiled from: VideoMinimizableDiscoveryState.kt */
/* loaded from: classes7.dex */
public final class q implements km50 {
    public final MiniPlayerControllersWrapper.VideoInfo b;
    public final VideoDiscoveryRelatedVideosSourceArgs c;
    public final VideoDiscoveryRecommendationsSourceArgs d;
    public final VideoDiscoveryCatalogSourceArgs e;
    public final List<hfz> f;
    public final List<hfz> g;
    public final List<hfz> h;
    public final a i;
    public final List<a> j;
    public final lat0 k;
    public final VideoMiniPlayerState l;
    public final c m;
    public final VideoMinimizableState n;
    public final VideoAnnounceState o;
    public final com.vk.video.ui.discovery.minimizable.b p;
    public final boolean q;
    public final boolean r;
    public final com.vk.video.ui.discovery.minimizable.related_videos.h s;
    public final FullscreenLockState t;
    public final i31 u;
    public final l31 v;
    public final b w;
    public final sdh0 x;
    public final g290 y;
    public final boolean z;

    /* compiled from: VideoMinimizableDiscoveryState.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CatalogTab(id=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(shy.a(this.d, qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Doc2DocOnboardingState(shouldShowOnboarding=");
            sb.append(this.a);
            sb.append(", isOnboardingVisible=");
            sb.append(this.b);
            sb.append(", isVerticalScrollIdle=");
            sb.append(this.c);
            sb.append(", scrolledSimilarVideos=");
            sb.append(this.d);
            sb.append(", isDoc2DocScrollable=");
            sb.append(this.e);
            sb.append(", didUserScrollDoc2Doc=");
            sb.append(this.f);
            sb.append(", areTabsVisible=");
            sb.append(this.g);
            sb.append(", isDefaultTabActive=");
            return q0.a(sb, this.h, ')');
        }

        public /* synthetic */ b(int i) {
            this(0, false, false, false, false, false, false, false);
        }

        public b(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = i;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = z7;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryState.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public static c a(c cVar, boolean z, boolean z2, int i) {
            boolean z3 = (i & 1) != 0 ? cVar.a : false;
            if ((i & 2) != 0) {
                z = cVar.b;
            }
            if ((i & 4) != 0) {
                z2 = cVar.c;
            }
            cVar.getClass();
            return new c(z3, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenRestrictions(canMainContainerShowSmallPlayer=");
            sb.append(this.a);
            sb.append(", isNotInterested=");
            sb.append(this.b);
            sb.append(", isDonutRestricted=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(MiniPlayerControllersWrapper.VideoInfo videoInfo, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs, List<? extends hfz> list, List<? extends hfz> list2, List<? extends hfz> list3, a aVar, List<a> list4, lat0 lat0Var, VideoMiniPlayerState videoMiniPlayerState, c cVar, VideoMinimizableState videoMinimizableState, VideoAnnounceState videoAnnounceState, com.vk.video.ui.discovery.minimizable.b bVar, boolean z, boolean z2, com.vk.video.ui.discovery.minimizable.related_videos.h hVar, FullscreenLockState fullscreenLockState, i31 i31Var, l31 l31Var, b bVar2, sdh0 sdh0Var, g290 g290Var, boolean z3) {
        this.b = videoInfo;
        this.c = videoDiscoveryRelatedVideosSourceArgs;
        this.d = videoDiscoveryRecommendationsSourceArgs;
        this.e = videoDiscoveryCatalogSourceArgs;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = aVar;
        this.j = list4;
        this.k = lat0Var;
        this.l = videoMiniPlayerState;
        this.m = cVar;
        this.n = videoMinimizableState;
        this.o = videoAnnounceState;
        this.p = bVar;
        this.q = z;
        this.r = z2;
        this.s = hVar;
        this.t = fullscreenLockState;
        this.u = i31Var;
        this.v = l31Var;
        this.w = bVar2;
        this.x = sdh0Var;
        this.y = g290Var;
        this.z = z3;
    }

    public static q a(q qVar, MiniPlayerControllersWrapper.VideoInfo videoInfo, VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs, VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs, VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs, List list, List list2, List list3, a aVar, ArrayList arrayList, lat0 lat0Var, VideoMiniPlayerState videoMiniPlayerState, c cVar, VideoMinimizableState videoMinimizableState, VideoAnnounceState videoAnnounceState, com.vk.video.ui.discovery.minimizable.b bVar, boolean z, boolean z2, com.vk.video.ui.discovery.minimizable.related_videos.h hVar, FullscreenLockState fullscreenLockState, i31 i31Var, l31 l31Var, b bVar2, sdh0 sdh0Var, g290 g290Var, boolean z3, int i) {
        MiniPlayerControllersWrapper.VideoInfo videoInfo2 = (i & 1) != 0 ? qVar.b : videoInfo;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs2 = (i & 2) != 0 ? qVar.c : videoDiscoveryRelatedVideosSourceArgs;
        VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs2 = (i & 4) != 0 ? qVar.d : videoDiscoveryRecommendationsSourceArgs;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs2 = (i & 8) != 0 ? qVar.e : videoDiscoveryCatalogSourceArgs;
        List list4 = (i & 16) != 0 ? qVar.f : list;
        List list5 = (i & 32) != 0 ? qVar.g : list2;
        List list6 = (i & 64) != 0 ? qVar.h : list3;
        a aVar2 = (i & 128) != 0 ? qVar.i : aVar;
        List<a> list7 = (i & 256) != 0 ? qVar.j : arrayList;
        lat0 lat0Var2 = (i & 512) != 0 ? qVar.k : lat0Var;
        VideoMiniPlayerState videoMiniPlayerState2 = (i & 1024) != 0 ? qVar.l : videoMiniPlayerState;
        c cVar2 = (i & 2048) != 0 ? qVar.m : cVar;
        VideoMinimizableState videoMinimizableState2 = (i & 4096) != 0 ? qVar.n : videoMinimizableState;
        VideoAnnounceState videoAnnounceState2 = (i & 8192) != 0 ? qVar.o : videoAnnounceState;
        MiniPlayerControllersWrapper.VideoInfo videoInfo3 = videoInfo2;
        com.vk.video.ui.discovery.minimizable.b bVar3 = (i & 16384) != 0 ? qVar.p : bVar;
        boolean z4 = (i & 32768) != 0 ? qVar.q : z;
        boolean z5 = (i & 65536) != 0 ? qVar.r : z2;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar2 = (i & 131072) != 0 ? qVar.s : hVar;
        FullscreenLockState fullscreenLockState2 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? qVar.t : fullscreenLockState;
        i31 i31Var2 = (i & 524288) != 0 ? qVar.u : i31Var;
        l31 l31Var2 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? qVar.v : l31Var;
        b bVar4 = (i & 2097152) != 0 ? qVar.w : bVar2;
        sdh0 sdh0Var2 = (i & 4194304) != 0 ? qVar.x : sdh0Var;
        g290 g290Var2 = (i & 8388608) != 0 ? qVar.y : g290Var;
        boolean z6 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? qVar.z : z3;
        qVar.getClass();
        return new q(videoInfo3, videoDiscoveryRelatedVideosSourceArgs2, videoDiscoveryRecommendationsSourceArgs2, videoDiscoveryCatalogSourceArgs2, list4, list5, list6, aVar2, list7, lat0Var2, videoMiniPlayerState2, cVar2, videoMinimizableState2, videoAnnounceState2, bVar3, z4, z5, hVar2, fullscreenLockState2, i31Var2, l31Var2, bVar4, sdh0Var2, g290Var2, z6);
    }

    public final VideoMinimizableState b() {
        return this.n;
    }

    public final g290 c() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return epx.f(this.b, qVar.b) && epx.f(this.c, qVar.c) && epx.f(this.d, qVar.d) && epx.f(this.e, qVar.e) && epx.f(this.f, qVar.f) && epx.f(this.g, qVar.g) && epx.f(this.h, qVar.h) && epx.f(this.i, qVar.i) && epx.f(this.j, qVar.j) && epx.f(this.k, qVar.k) && epx.f(this.l, qVar.l) && epx.f(this.m, qVar.m) && epx.f(this.n, qVar.n) && epx.f(this.o, qVar.o) && epx.f(this.p, qVar.p) && this.q == qVar.q && this.r == qVar.r && epx.f(this.s, qVar.s) && epx.f(this.t, qVar.t) && epx.f(this.u, qVar.u) && epx.f(this.v, qVar.v) && epx.f(this.w, qVar.w) && epx.f(this.x, qVar.x) && epx.f(this.y, qVar.y) && this.z == qVar.z;
    }

    public final int hashCode() {
        MiniPlayerControllersWrapper.VideoInfo videoInfo = this.b;
        int hashCode = (videoInfo == null ? 0 : videoInfo.hashCode()) * 31;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = this.c;
        int hashCode2 = (hashCode + (videoDiscoveryRelatedVideosSourceArgs == null ? 0 : videoDiscoveryRelatedVideosSourceArgs.hashCode())) * 31;
        VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs = this.d;
        int hashCode3 = (hashCode2 + (videoDiscoveryRecommendationsSourceArgs == null ? 0 : videoDiscoveryRecommendationsSourceArgs.hashCode())) * 31;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs = this.e;
        int a2 = fw3.a(fw3.a(fw3.a((hashCode3 + (videoDiscoveryCatalogSourceArgs == null ? 0 : videoDiscoveryCatalogSourceArgs.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        a aVar = this.i;
        int hashCode4 = (this.t.hashCode() + ((this.s.hashCode() + qoy.b(qoy.b((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + fw3.a((a2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.j)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.q), 31, this.r)) * 31)) * 31;
        i31 i31Var = this.u;
        int hashCode5 = (hashCode4 + (i31Var == null ? 0 : i31Var.hashCode())) * 31;
        l31 l31Var = this.v;
        int hashCode6 = (this.w.hashCode() + ((hashCode5 + (l31Var == null ? 0 : l31Var.hashCode())) * 31)) * 31;
        sdh0 sdh0Var = this.x;
        int hashCode7 = (hashCode6 + (sdh0Var == null ? 0 : sdh0Var.hashCode())) * 31;
        g290 g290Var = this.y;
        return Boolean.hashCode(this.z) + ((hashCode7 + (g290Var != null ? g290Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMinimizableDiscoveryState(controllerArgs=");
        sb.append(this.b);
        sb.append(", relatedVideosSourceArgs=");
        sb.append(this.c);
        sb.append(", recommendationsSourceArgs=");
        sb.append(this.d);
        sb.append(", catalogSourceArgs=");
        sb.append(this.e);
        sb.append(", aboutVideoItems=");
        sb.append(this.f);
        sb.append(", recommendationsItems=");
        sb.append(this.g);
        sb.append(", catalogItems=");
        sb.append(this.h);
        sb.append(", selectedTab=");
        sb.append(this.i);
        sb.append(", catalogTabs=");
        sb.append(this.j);
        sb.append(", videoQueueState=");
        sb.append(this.k);
        sb.append(", miniPlayerState=");
        sb.append(this.l);
        sb.append(", restrictions=");
        sb.append(this.m);
        sb.append(", minimizableState=");
        sb.append(this.n);
        sb.append(", videoAnnounceState=");
        sb.append(this.o);
        sb.append(", dialogContainerState=");
        sb.append(this.p);
        sb.append(", shouldPlayAfterDialogMinimization=");
        sb.append(this.q);
        sb.append(", shouldTrackAutoPlayEvent=");
        sb.append(this.r);
        sb.append(", relatedVideosState=");
        sb.append(this.s);
        sb.append(", fullscreenLockState=");
        sb.append(this.t);
        sb.append(", videoAdBanner=");
        sb.append(this.u);
        sb.append(", showVideoAdBannerMenu=");
        sb.append(this.v);
        sb.append(", d2dOnboardingState=");
        sb.append(this.w);
        sb.append(", screencastSubscriptionProposal=");
        sb.append(this.x);
        sb.append(", overlayBanner=");
        sb.append(this.y);
        sb.append(", isActionLinkVisible=");
        return q0.a(sb, this.z, ')');
    }
}
