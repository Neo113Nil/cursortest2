package com.vk.video.ui.discovery.minimizable;

import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.ad.AdChoice;
import com.vk.libvideo.api.minimizable.DiscoveryAction;
import com.vk.libvideo.api.minimizable.VideoMinimizableScreenArgs;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.api.quality.QualitySettingsType;
import com.vk.video.recast.domain.model.PlaybackSnapshot;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.related_videos.data.VideoRelatedVideosPagingType;
import xsna.bh10;
import xsna.epx;
import xsna.fpe0;
import xsna.gp;
import xsna.ho8;
import xsna.kj50;
import xsna.lgs0;
import xsna.lq;
import xsna.mct0;
import xsna.mgs0;
import xsna.nb30;
import xsna.rbt0;
import xsna.vts0;
import xsna.vu5;
import xsna.yfs0;

/* compiled from: VideoMinimizableDiscoveryAction.kt */
/* loaded from: classes7.dex */
public interface c extends kj50 {

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class a implements c {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ActionLinkVisibilityChanged(isVisible="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class a0 implements c {
        public static final a0 b = new a0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a0);
        }

        public final int hashCode() {
            return -1766801835;
        }

        public final String toString() {
            return "OnClickAdvertBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface a1 extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class a implements a1 {
            public final long b;
            public final long c;
            public final String d;

            public a(long j, long j2, String str) {
                this.b = j;
                this.c = j2;
                this.d = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + bh10.a(Long.hashCode(this.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CountdownTick(remainingSeconds=");
                sb.append(this.b);
                sb.append(", totalSeconds=");
                sb.append(this.c);
                sb.append(", nextVideoId=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements a1 {
            public final boolean b;

            public b(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("OnAnimatingStateChange(isAnimating="), this.b, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$a1$c, reason: collision with other inner class name */
        public static final class C1973c implements a1 {
            public static final C1973c b = new C1973c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1973c);
            }

            public final int hashCode() {
                return 117007477;
            }

            public final String toString() {
                return "OnAuthorClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements a1 {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -49076416;
            }

            public final String toString() {
                return "OnClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class e implements a1 {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 762071459;
            }

            public final String toString() {
                return "OnDismiss";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class f implements a1 {
            public final UserId b;
            public final boolean c;

            public f(UserId userId, boolean z) {
                this.b = userId;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.b, fVar.b) && this.c == fVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("OnOwnerSubscriptionChanged(ownerId=");
                sb.append(this.b);
                sb.append(", isSubscribed=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class g implements a1 {
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
                return defpackage.q0.a(new StringBuilder("OnSubscribeClicked(isSubscribed="), this.b, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class h implements a1 {
            public final VideoFile b;

            public h(VideoFile videoFile) {
                this.b = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("StartTimerForAnnounce(video="), this.b, ')');
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class b implements c {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 423032113;
        }

        public final String toString() {
            return "AdBannerChanged";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class b0 implements c {
        public final String b;

        public b0(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("OnClickTrapBanner(activationUrl="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class b1 implements c {
        public final VideoFile b;

        public b1(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b1) && epx.f(this.b, ((b1) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("VideoFileUpdated(videoFile="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    /* renamed from: com.vk.video.ui.discovery.minimizable.c$c, reason: collision with other inner class name */
    public static final class C1974c implements c {
        public final boolean b;

        public C1974c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1974c) && this.b == ((C1974c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("AdStateChanged(isAdActive="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class c0 implements c {
        public static final c0 b = new c0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public final int hashCode() {
            return -231107753;
        }

        public final String toString() {
            return "OnDismiss";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class c1 implements c {
        public final VideoFile b;
        public final boolean c;

        public c1(VideoFile videoFile, boolean z) {
            this.b = videoFile;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c1)) {
                return false;
            }
            c1 c1Var = (c1) obj;
            return epx.f(this.b, c1Var.b) && this.c == c1Var.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoRecommendationClicked(videoFile=");
            sb.append(this.b);
            sb.append(", shouldReload=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class d implements c {
        public final Boolean b;
        public final Boolean c;
        public final String d;

        public d() {
            this(7, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            Boolean bool = this.b;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.c;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.d;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnimationSubscribeButton(enabledAfterPlaying=");
            sb.append(this.b);
            sb.append(", enabledAfterLike=");
            sb.append(this.c);
            sb.append(", videoId=");
            return ho8.a(sb, this.d, ')');
        }

        public d(int i, Boolean bool, Boolean bool2, String str) {
            bool = (i & 1) != 0 ? null : bool;
            bool2 = (i & 2) != 0 ? null : bool2;
            str = (i & 4) != 0 ? null : str;
            this.b = bool;
            this.c = bool2;
            this.d = str;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class d0 implements c {
        public final DonutVideoAction b;

        public d0(DonutVideoAction donutVideoAction) {
            this.b = donutVideoAction;
        }

        public final DonutVideoAction a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && epx.f(this.b, ((d0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnDonutChipClicked(donutAction=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class d1 implements c {
        public static final d1 b = new d1();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d1);
        }

        public final int hashCode() {
            return -681671365;
        }

        public final String toString() {
            return "VkVideoPromoClose";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class e implements c {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CatalogTabSelected(id="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class e0 implements c {
        public final UserId b;

        public e0(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e0) && epx.f(this.b, ((e0) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("OnDonutStateChanged(ownerId="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class f implements c {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CatalogTabShown(id="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class f0 implements c {
        public static final f0 b = new f0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f0);
        }

        public final int hashCode() {
            return 1703683802;
        }

        public final String toString() {
            return "OnDonutVideoPlayerClicked";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class g implements c {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -480633372;
        }

        public final String toString() {
            return "CloseAdvertBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class g0 implements c {
        public final boolean b;
        public final boolean c;

        public g0(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g0)) {
                return false;
            }
            g0 g0Var = (g0) obj;
            return this.b == g0Var.b && this.c == g0Var.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnNetworkStatusChanged(isLastNetworkStatusAvailable=");
            sb.append(this.b);
            sb.append(", isNetworkAvailable=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class h implements c {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -626397469;
        }

        public final String toString() {
            return "CloseMenuAdvertBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class h0 implements c {
        public final yfs0 b;

        public h0(yfs0 yfs0Var) {
            this.b = yfs0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && epx.f(this.b, ((h0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnNewCatalogState(state=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class i implements c {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1700464040;
        }

        public final String toString() {
            return "CloseOverlayBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class i0 implements c {
        public final lgs0 b;

        public i0(lgs0 lgs0Var) {
            this.b = lgs0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i0) && epx.f(this.b, ((i0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnNewRecommendationsState(state=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class j implements c {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -184018051;
        }

        public final String toString() {
            return "CloseTrapBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class j0 implements c {
        public final com.vk.video.ui.discovery.recommendations.a b;

        public j0(com.vk.video.ui.discovery.recommendations.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && epx.f(this.b, ((j0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnRecommendationsEvent(event=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class k implements c {
        public final boolean b;

        public k(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.b == ((k) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ControlsVisibilityChanged(isVisible="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class k0 implements c {
        public final VideoFile b;
        public final String c;

        public k0(VideoFile videoFile, String str) {
            this.b = videoFile;
            this.c = str;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface l extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class a implements l {
            public static final a b = new a();
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements l {
            public static final b b = new b();
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$l$c, reason: collision with other inner class name */
        public static final class C1975c implements l {
            public final boolean b;

            public C1975c(boolean z) {
                this.b = z;
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements l {
            public final boolean b;

            public d(boolean z) {
                this.b = z;
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class e implements l {
            public static final e b = new e();
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class f implements l {
            public final boolean b;

            public f(boolean z) {
                this.b = z;
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class l0 implements c {
        public static final l0 b = new l0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l0);
        }

        public final int hashCode() {
            return 856257117;
        }

        public final String toString() {
            return "OpenMenuAdvertBanner";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class m implements c {
        public static final m b = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -2054161491;
        }

        public final String toString() {
            return "Doc2DocSliderClose";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class m0 implements c {
        public static final m0 b = new m0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m0);
        }

        public final int hashCode() {
            return -1644967959;
        }

        public final String toString() {
            return "OverlayAdBannerChanged";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface n extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class a implements n {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("OnLockClicked(isTablet="), this.b, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements n {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1047783796;
            }

            public final String toString() {
                return "OnLockedScreenClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$n$c, reason: collision with other inner class name */
        public static final class C1976c implements n {
            public static final C1976c b = new C1976c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1976c);
            }

            public final int hashCode() {
                return 1358381285;
            }

            public final String toString() {
                return "OnReadyToUnlock";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements n {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -310978362;
            }

            public final String toString() {
                return "OnUnlockClicked";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class n0 implements c {
        public final boolean b;
        public final DiscoveryAction.EventSource c;

        public n0(boolean z, DiscoveryAction.EventSource eventSource) {
            this.b = z;
            this.c = eventSource;
        }

        public final DiscoveryAction.EventSource a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n0)) {
                return false;
            }
            n0 n0Var = (n0) obj;
            return this.b == n0Var.b && this.c == n0Var.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "PlayNextVideoSettingsChanged(isActive=" + this.b + ", eventSource=" + this.c + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class o implements c {
        public final VideoMinimizableDiscoverySavedState b;

        public o() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState = this.b;
            if (videoMinimizableDiscoverySavedState == null) {
                return 0;
            }
            return videoMinimizableDiscoverySavedState.hashCode();
        }

        public final String toString() {
            return "Init(savedState=" + this.b + ')';
        }

        public o(VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState) {
            this.b = videoMinimizableDiscoverySavedState;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface o0 extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class a implements o0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -84891739;
            }

            public final String toString() {
                return "CastClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements o0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1789565728;
            }

            public final String toString() {
                return "CloseButtonClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$o0$c, reason: collision with other inner class name */
        public static final class C1977c implements o0 {
            public static final C1977c b = new C1977c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1977c);
            }

            public final int hashCode() {
                return -1432134441;
            }

            public final String toString() {
                return "FullscreenButtonClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements o0 {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1750879193;
            }

            public final String toString() {
                return "LeaveFeedback";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class e implements o0 {
            public static final e b = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1736800748;
            }

            public final String toString() {
                return "MinimizeButtonClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class f implements o0 {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 183987468;
            }

            public final String toString() {
                return "MiniplayerClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class g implements o0 {
            public static final g b = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1984336965;
            }

            public final String toString() {
                return "NextVideo";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class h implements o0 {
            public final vts0 b;

            public h(vts0 vts0Var) {
                this.b = vts0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnVideoDialogAction(action=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class i implements o0 {
            public static final i b = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 942784482;
            }

            public final String toString() {
                return "PauseButtonClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class j implements o0 {
            public static final j b = new j();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return 197667774;
            }

            public final String toString() {
                return "PlayButtonClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class k implements o0 {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return 1768275053;
            }

            public final String toString() {
                return "PlaybackCompleted";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class l implements o0 {
            public final VideoPlayerState b;

            public l(VideoPlayerState videoPlayerState) {
                this.b = videoPlayerState;
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
                return "PlayerStateChanged(playerState=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class m implements o0 {
            public static final m b = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return 866648129;
            }

            public final String toString() {
                return "PreviousVideo";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class n implements o0 {
            public static final n b = new n();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof n);
            }

            public final int hashCode() {
                return -1805266243;
            }

            public final String toString() {
                return "ReplayClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class o implements o0 {
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
                return defpackage.q0.a(new StringBuilder("ScaleClicked(isScaled="), this.b, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class p implements o0 {
            public static final p b = new p();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof p);
            }

            public final int hashCode() {
                return 1904752577;
            }

            public final String toString() {
                return "SettingsClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class q implements o0 {
            public static final q b = new q();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof q);
            }

            public final int hashCode() {
                return 1611627509;
            }

            public final String toString() {
                return "ShowPlaylistClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class r implements o0 {
            public final boolean b;

            public r(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && this.b == ((r) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("SimilarPreviewClicked(isHorizontal="), this.b, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class s implements o0 {
            public static final s b = new s();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof s);
            }

            public final int hashCode() {
                return 840160304;
            }

            public final String toString() {
                return "StartPositionConsumed";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class t implements o0 {
            public static final t b = new t();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof t);
            }

            public final int hashCode() {
                return 1862386690;
            }

            public final String toString() {
                return "VideoPlaybackUnsupported";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class p implements c {
        public final boolean b;
        public final String c;

        public p(boolean z, String str) {
            this.b = z;
            this.c = str;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class p0 implements c {
        public final fpe0 b;

        public p0(fpe0 fpe0Var) {
            this.b = fpe0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p0) && epx.f(this.b, ((p0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "QualityChanged(preset=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class q implements c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            ((q) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "MainContainerScreenChanged(canMainContainerShowSmallPlayer=false)";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class q0 implements c {
        public final QualitySettingsType b;

        public q0(QualitySettingsType qualitySettingsType) {
            this.b = qualitySettingsType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q0) && this.b == ((q0) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "QualitySettingsChanged(config=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class r implements c {
        public final VideoMinimizableState b;
        public final com.vk.video.ui.discovery.minimizable.b c;

        public r(VideoMinimizableState videoMinimizableState, com.vk.video.ui.discovery.minimizable.b bVar) {
            this.b = videoMinimizableState;
            this.c = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MinimizableStateChanged(minimizableState=" + this.b + ", dialogContainerState=" + this.c + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface r0 extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class a implements r0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -665141634;
            }

            public final String toString() {
                return "ContinueWatchingClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements r0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1318972755;
            }

            public final String toString() {
                return "OnAddOrRemoveClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$r0$c, reason: collision with other inner class name */
        public static final class C1978c implements r0 {
            public static final C1978c b = new C1978c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1978c);
            }

            public final int hashCode() {
                return -2013511346;
            }

            public final String toString() {
                return "OnRelatedAudioClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements r0 {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1613689214;
            }

            public final String toString() {
                return "OnSimilarTracksClicked";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class e implements r0 {
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class f implements r0 {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 856712444;
            }

            public final String toString() {
                return "OpenPlaylistClicked";
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class s implements c {
        public static final s b = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1872804768;
        }

        public final String toString() {
            return "MoreAuthorVideoClicked";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface s0 extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public interface a extends s0 {

            /* compiled from: VideoMinimizableDiscoveryAction.kt */
            /* renamed from: com.vk.video.ui.discovery.minimizable.c$s0$a$a, reason: collision with other inner class name */
            public static final class C1979a implements a {
                public static final C1979a b = new C1979a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1979a);
                }

                public final int hashCode() {
                    return -1593019056;
                }

                public final String toString() {
                    return "OnChevronClicked";
                }
            }

            /* compiled from: VideoMinimizableDiscoveryAction.kt */
            public static final class b implements a {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1842467658;
                }

                public final String toString() {
                    return "OnContainerClicked";
                }
            }

            /* compiled from: VideoMinimizableDiscoveryAction.kt */
            /* renamed from: com.vk.video.ui.discovery.minimizable.c$s0$a$c, reason: collision with other inner class name */
            public static final class C1980c implements a {
                public static final C1980c b = new C1980c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C1980c);
                }

                public final int hashCode() {
                    return 85460970;
                }

                public final String toString() {
                    return "OnReloadClicked";
                }
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements s0 {
            public final int b;

            public b(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("OnAutoSwitchNewSeason(seasonId="), this.b, ')');
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$s0$c, reason: collision with other inner class name */
        public static final class C1981c implements s0 {
            public static final C1981c b = new C1981c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1981c);
            }

            public final int hashCode() {
                return 641259135;
            }

            public final String toString() {
                return "OnClearRequested";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements s0 {
            public final mgs0 b;

            public d(mgs0 mgs0Var) {
                this.b = mgs0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnInitialInfoWithChunkLoaded(initialLoadedArgs=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class e implements s0 {
            public final com.vk.video.ui.discovery.minimizable.related_videos.m b;

            public e(com.vk.video.ui.discovery.minimizable.related_videos.m mVar) {
                this.b = mVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnLoadNewSeason(pagingState=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class f implements s0 {
            public final com.vk.video.ui.discovery.minimizable.related_videos.h b;

            public f(com.vk.video.ui.discovery.minimizable.related_videos.h hVar) {
                this.b = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnNewState(state=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class g implements s0 {
            public final int b;
            public final rbt0 c;
            public final VideoRelatedVideosPagingType d;

            public g(int i, rbt0 rbt0Var, VideoRelatedVideosPagingType videoRelatedVideosPagingType) {
                this.b = i;
                this.c = rbt0Var;
                this.d = videoRelatedVideosPagingType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return this.b == gVar.b && epx.f(this.c, gVar.c) && this.d == gVar.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31);
            }

            public final String toString() {
                return "OnNextChunkLoaded(playlistId=" + this.b + ", chunk=" + this.c + ", pagingType=" + this.d + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class h implements s0 {
            public final mct0 b;

            public h(mct0 mct0Var) {
                this.b = mct0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnNextVideoQueuePagingLoaded(paging=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class i implements s0 {
            public final com.vk.video.ui.discovery.minimizable.related_videos.m b;

            public i(com.vk.video.ui.discovery.minimizable.related_videos.m mVar) {
                this.b = mVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnPagingStateReloaded(pagingState=" + this.b + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class j implements s0 {
            public final int b;
            public final rbt0 c;
            public final VideoRelatedVideosPagingType d;

            public j(int i, rbt0 rbt0Var, VideoRelatedVideosPagingType videoRelatedVideosPagingType) {
                this.b = i;
                this.c = rbt0Var;
                this.d = videoRelatedVideosPagingType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.b == jVar.b && epx.f(this.c, jVar.c) && this.d == jVar.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31);
            }

            public final String toString() {
                return "OnPreviousChunkLoaded(playlistId=" + this.b + ", chunk=" + this.c + ", pagingType=" + this.d + ')';
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class k implements s0 {
            public final mct0 b;

            public k(mct0 mct0Var) {
                this.b = mct0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnPreviousVideoQueuePagingLoaded(paging=" + this.b + ')';
            }
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class t implements c {
        public final nb30 b;

        public t(nb30 nb30Var) {
            this.b = nb30Var;
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
            return "MotionTransitionStarted(endStateId=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class t0 implements c {
        public static final t0 b = new t0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof t0);
        }

        public final int hashCode() {
            return -1620694733;
        }

        public final String toString() {
            return "RetryClicked";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class u implements c {
        public final VideoMinimizableScreenArgs b;

        public u(VideoMinimizableScreenArgs videoMinimizableScreenArgs) {
            this.b = videoMinimizableScreenArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && epx.f(this.b, ((u) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NewScreenArgsReceived(args=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class u0 implements c {
        public static final u0 b = new u0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof u0);
        }

        public final int hashCode() {
            return -1911685691;
        }

        public final String toString() {
            return "ScreencastAdvertFinished";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class v implements c {
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
            return defpackage.q0.a(new StringBuilder("NotInterestedChanged(isNotInterested="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class v0 implements c {
        public final String b;

        public v0(String str) {
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v0) && epx.f(this.b, ((v0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ScreencastAdvertLinkClicked(link="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class w implements c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            ((w) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "NotRecommendOwnerChanged(isNotRecommendOwner=false)";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class w0 implements c {
        public final int b;

        public w0(int i) {
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w0) && this.b == ((w0) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScreencastAdvertProgress(progress="), this.b, ')');
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class x implements c {
        public static final x b = new x();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof x);
        }

        public final int hashCode() {
            return 1025765256;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class x0 implements c {
        public final PlaybackSnapshot b;

        public x0(PlaybackSnapshot playbackSnapshot) {
            this.b = playbackSnapshot;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x0) && epx.f(this.b, ((x0) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ScreencastTvPlaybackSnapshotChanged(event=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class y implements c {
        public final com.vk.video.ui.discovery.catalog.a b;

        public y(com.vk.video.ui.discovery.catalog.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.b, ((y) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnCatalogEvent(event=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class y0 implements c {
        public final boolean b;
        public final String c;

        public y0(boolean z, String str) {
            this.b = z;
            this.c = str;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public static final class z implements c {
        public final AdChoice b;

        public z(AdChoice adChoice) {
            this.b = adChoice;
        }

        public final AdChoice a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && epx.f(this.b, ((z) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnClickAdChoice(adChoice=" + this.b + ')';
        }
    }

    /* compiled from: VideoMinimizableDiscoveryAction.kt */
    public interface z0 extends c {

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class a implements z0 {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2138787374;
            }

            public final String toString() {
                return "OnResume";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class b implements z0 {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -760376803;
            }

            public final String toString() {
                return "OnStart";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        /* renamed from: com.vk.video.ui.discovery.minimizable.c$z0$c, reason: collision with other inner class name */
        public static final class C1982c implements z0 {
            public static final C1982c b = new C1982c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1982c);
            }

            public final int hashCode() {
                return -1410001177;
            }

            public final String toString() {
                return "OnStop";
            }
        }

        /* compiled from: VideoMinimizableDiscoveryAction.kt */
        public static final class d implements z0 {
            public static final d b = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -385950210;
            }

            public final String toString() {
                return "OnViewCreated";
            }
        }
    }
}
