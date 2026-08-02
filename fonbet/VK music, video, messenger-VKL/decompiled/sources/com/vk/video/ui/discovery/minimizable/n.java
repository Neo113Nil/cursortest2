package com.vk.video.ui.discovery.minimizable;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.minimizable.announce.author.AuthorAnnounceState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import defpackage.q0;
import java.util.List;
import xsna.bh10;
import xsna.efz;
import xsna.epx;
import xsna.hfz;
import xsna.lat0;
import xsna.ms9;
import xsna.qoy;
import xsna.tn;
import xsna.vu5;
import xsna.xl50;

/* compiled from: VideoMinimizableDiscoveryPatch.kt */
/* loaded from: classes7.dex */
public interface n extends xl50 {

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class a implements n {
        public final List<hfz> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends hfz> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("AboutVideoItemsLoaded(items="), this.b);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class a0 implements n {
        public final AboutVideoItem.q.b b;
        public final boolean c;
        public final boolean d;

        public a0(AboutVideoItem.q.b bVar, boolean z, boolean z2) {
            this.b = bVar;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            return this.b.equals(a0Var.b) && this.c == a0Var.c && this.d == a0Var.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateOverlayAdBanner(banner=");
            sb.append(this.b);
            sb.append(", isLandscape=");
            sb.append(this.c);
            sb.append(", canShow=");
            return q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class b implements n {
        public final List<hfz> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends hfz> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("CatalogItemsLoaded(items="), this.b);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class b0 implements n {
        public final VideoPlayerState b;

        public b0(VideoPlayerState videoPlayerState) {
            this.b = videoPlayerState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && epx.f(this.b, ((b0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePlayerState(playerState=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class c implements n {
        public final VideoDiscoveryCatalogRepository$Section b;
        public final List<VideoDiscoveryCatalogRepository$Section> c;

        public c(VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section, List<VideoDiscoveryCatalogRepository$Section> list) {
            this.b = videoDiscoveryCatalogRepository$Section;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = this.b;
            return this.c.hashCode() + ((videoDiscoveryCatalogRepository$Section == null ? 0 : videoDiscoveryCatalogRepository$Section.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CatalogSectionsLoaded(currentSection=");
            sb.append(this.b);
            sb.append(", sections=");
            return ms9.a(')', sb, this.c);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class c0 implements n {
        public final VideoDiscoveryRecommendationsSourceArgs b;

        public c0(VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs) {
            this.b = videoDiscoveryRecommendationsSourceArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c0) && epx.f(this.b, ((c0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateRecommendationsSourceArgs(args=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class d implements n {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1320831102;
        }

        public final String toString() {
            return "CleanVideoStartPositionState";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class d0 implements n {
        public final VideoDiscoveryRelatedVideosSourceArgs b;

        public d0(VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs) {
            this.b = videoDiscoveryRelatedVideosSourceArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && epx.f(this.b, ((d0) obj).b);
        }

        public final int hashCode() {
            VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = this.b;
            if (videoDiscoveryRelatedVideosSourceArgs == null) {
                return 0;
            }
            return videoDiscoveryRelatedVideosSourceArgs.hashCode();
        }

        public final String toString() {
            return "UpdateRelatedVideosSourceArgs(args=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class e implements n {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("CloseAdvertBanner(byUser="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class e0 implements n {
        public final com.vk.video.ui.discovery.minimizable.related_videos.h b;

        public e0(com.vk.video.ui.discovery.minimizable.related_videos.h hVar) {
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && epx.f(this.b, ((e0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateRelatedVideosState(relatedVideosState=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class f implements n {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -846768531;
        }

        public final String toString() {
            return "CloseAdvertBannerMenu";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class f0 implements n {
        public final boolean b;

        public f0(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && this.b == ((f0) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateShouldPlayAfterDialogMinimization(shouldPlayAfterDialogMinimization="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class g implements n {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("CloseOverlayBanner(byUser="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class g0 implements n {
        public final AboutVideoItem.c.a b;
        public final boolean c;

        public g0(AboutVideoItem.c.a aVar, boolean z) {
            this.b = aVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) obj;
            return epx.f(this.b, g0Var.b) && this.c == g0Var.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateVerticalAdvertBanner(banner=");
            sb.append(this.b);
            sb.append(", canShow=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class h implements n {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1136411080;
        }

        public final String toString() {
            return "CloseScreencastSubscriptionProposal";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class h0 implements n {
        public final VideoFile b;
        public final VideoFile c;
        public final long d;
        public final boolean e;
        public final AuthorAnnounceState f;

        public h0(VideoFile videoFile, VideoFile videoFile2, long j, boolean z, AuthorAnnounceState authorAnnounceState, int i) {
            j = (i & 4) != 0 ? 0L : j;
            z = (i & 16) != 0 ? false : z;
            this.b = videoFile;
            this.c = videoFile2;
            this.d = j;
            this.e = z;
            this.f = authorAnnounceState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h0)) {
                return false;
            }
            h0 h0Var = (h0) obj;
            return epx.f(this.b, h0Var.b) && epx.f(this.c, h0Var.c) && this.d == h0Var.d && this.e == h0Var.e && this.f.equals(h0Var.f);
        }

        public final int hashCode() {
            VideoFile videoFile = this.b;
            int hashCode = (videoFile == null ? 0 : videoFile.hashCode()) * 31;
            VideoFile videoFile2 = this.c;
            return this.f.hashCode() + qoy.b(bh10.a(bh10.a((hashCode + (videoFile2 != null ? videoFile2.hashCode() : 0)) * 31, 31, this.d), 31, 0L), 31, this.e);
        }

        public final String toString() {
            return "UpdateVideoAnnounceState(currentVideo=" + this.b + ", nextVideo=" + this.c + ", timeUntilNextVideo=" + this.d + ", timeTotal=0, isAutoplay=" + this.e + ", authorAnnounceState=" + this.f + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class i implements n {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -825478644;
        }

        public final String toString() {
            return "HideAdvertBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class i0 implements n {
        public final boolean b;

        public i0(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && this.b == ((i0) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateVideoNotInterestedState(isNotInterested="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class j implements n {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 494234416;
        }

        public final String toString() {
            return "HideOverlayBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class j0 implements n {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j0)) {
                return false;
            }
            ((j0) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "UpdateVideoNotRecommendOwnerState(isNotRecommendOwner=false)";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class k implements n {
        public static final k b = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -640610669;
        }

        public final String toString() {
            return "OpenAdvertBannerMenu";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class k0 implements n {
        public final lat0 b;

        public k0(lat0 lat0Var) {
            this.b = lat0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k0) && epx.f(this.b, ((k0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateVideoQueueState(queueState=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class l implements n {
        public final List<hfz> b;

        /* JADX WARN: Multi-variable type inference failed */
        public l(List<? extends hfz> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.b, ((l) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("RecommendationsItemsLoaded(items="), this.b);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class m implements n {
        public final int b;

        public m(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScreencastSubscriptionProposalProgress(progress="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.n$n, reason: collision with other inner class name */
    public static final class C1992n implements n {
        public final long b;

        public C1992n(long j) {
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1992n) && this.b == ((C1992n) obj).b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b);
        }

        public final String toString() {
            return vu5.a(')', this.b, new StringBuilder("ShowScreencastSubscriptionProposal(adDurationSec="));
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class o implements n {
        public final boolean b;

        public o(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.b == ((o) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("TrackAutoPlayFlag(isAuto="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class p implements n {
        public final boolean b;

        public p(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.b == ((p) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateActionLinkVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class q implements n {
        public final boolean b;

        public q(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.b == ((q) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateAdTitle(isAdActive="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class r implements n {
        public final String b;
        public final long c;
        public final long d;

        public r(String str, long j, long j2) {
            this.b = str;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && this.c == rVar.c && this.d == rVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + bh10.a(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateAnnounceCountdown(nextVideoId=");
            sb.append(this.b);
            sb.append(", remainingSeconds=");
            sb.append(this.c);
            sb.append(", totalSeconds=");
            return efz.b(this.d, ", isAutoplay=true)", sb);
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class s implements n {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            ((s) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "UpdateCanMainContainerShowSmallPlayer(canMainContainerShowSmallPlayer=false)";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class t implements n {
        public final VideoDiscoveryCatalogSourceArgs b;

        public t(VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs) {
            this.b = videoDiscoveryCatalogSourceArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && epx.f(this.b, ((t) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateCatalogSourceArgs(args=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class u implements n {
        public final MiniPlayerControllersWrapper.VideoInfo b;
        public final boolean c;

        public u(MiniPlayerControllersWrapper.VideoInfo videoInfo, boolean z) {
            this.b = videoInfo;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return epx.f(this.b, uVar.b) && this.c == uVar.c;
        }

        public final int hashCode() {
            MiniPlayerControllersWrapper.VideoInfo videoInfo = this.b;
            return Boolean.hashCode(this.c) + ((videoInfo == null ? 0 : videoInfo.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateControllerArgs(args=");
            sb.append(this.b);
            sb.append(", shouldClearItems=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class v implements n {
        public final boolean b;

        public v(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.b == ((v) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("UpdateControlsVisibility(isVisible="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class w implements n {
        public final Boolean b;
        public final Boolean c;
        public final Boolean d;
        public final Integer e;
        public final Boolean f;
        public final Boolean g;
        public final Boolean h;
        public final Boolean i;

        public w() {
            this(null, null, null, null, null, null, null, null, 255);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return epx.f(this.b, wVar.b) && epx.f(this.c, wVar.c) && epx.f(this.d, wVar.d) && epx.f(this.e, wVar.e) && epx.f(this.f, wVar.f) && epx.f(this.g, wVar.g) && epx.f(this.h, wVar.h) && epx.f(this.i, wVar.i);
        }

        public final int hashCode() {
            Boolean bool = this.b;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.c;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.d;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num = this.e;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool4 = this.f;
            int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            Boolean bool5 = this.g;
            int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            Boolean bool6 = this.h;
            int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Boolean bool7 = this.i;
            return hashCode7 + (bool7 != null ? bool7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateD2DOnboardingState(shouldShowOnboarding=");
            sb.append(this.b);
            sb.append(", isOnboardingVisible=");
            sb.append(this.c);
            sb.append(", isVerticalScrollIdle=");
            sb.append(this.d);
            sb.append(", scrolledSimilarVideos=");
            sb.append(this.e);
            sb.append(", didUserScrollDoc2Doc=");
            sb.append(this.f);
            sb.append(", areTabsVisible=");
            sb.append(this.g);
            sb.append(", isDefaultTabActive=");
            sb.append(this.h);
            sb.append(", isDoc2DocScrollable=");
            return tn.a(sb, this.i, ')');
        }

        public w(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i) {
            bool = (i & 1) != 0 ? null : bool;
            bool2 = (i & 2) != 0 ? null : bool2;
            bool3 = (i & 4) != 0 ? null : bool3;
            num = (i & 8) != 0 ? null : num;
            bool4 = (i & 16) != 0 ? null : bool4;
            bool5 = (i & 32) != 0 ? null : bool5;
            bool6 = (i & 64) != 0 ? null : bool6;
            bool7 = (i & 128) != 0 ? null : bool7;
            this.b = bool;
            this.c = bool2;
            this.d = bool3;
            this.e = num;
            this.f = bool4;
            this.g = bool5;
            this.h = bool6;
            this.i = bool7;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class x implements n {
        public final com.vk.video.ui.discovery.minimizable.fullscreen_lock.b b;

        public x(com.vk.video.ui.discovery.minimizable.fullscreen_lock.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.b, ((x) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateFullscreenLockState(args=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class y implements n {
        public final AboutVideoItem.c.a b;
        public final boolean c;

        public y(AboutVideoItem.c.a aVar, boolean z) {
            this.b = aVar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            return epx.f(this.b, yVar.b) && this.c == yVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateHorizontalAdvertBanner(banner=");
            sb.append(this.b);
            sb.append(", canShow=");
            return q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryPatch.kt */
    public static final class z implements n {
        public final VideoMinimizableState b;
        public final com.vk.video.ui.discovery.minimizable.b c;

        public z(VideoMinimizableState videoMinimizableState, com.vk.video.ui.discovery.minimizable.b bVar) {
            this.b = videoMinimizableState;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            return epx.f(this.b, zVar.b) && epx.f(this.c, zVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateMinimizableStateWithDialog(minimizableState=" + this.b + ", dialogContainerState=" + this.c + ')';
        }
    }
}
