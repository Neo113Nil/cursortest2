package com.vk.video.ui.discovery.minimizable;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogSourceArgs;
import com.vk.video.ui.discovery.minimizable.announce.VideoAnnounceState;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.b;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.discovery.minimizable.player.VideoMiniPlayerAction;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerProgress;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.player.controllers.PlayerRemoteController;
import com.vk.video.ui.discovery.minimizable.q;
import com.vk.video.ui.discovery.minimizable.related_videos.VideoDiscoveryRelatedVideosSourceArgs;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsSourceArgs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.alj0;
import xsna.bpn0;
import xsna.c5g;
import xsna.dm50;
import xsna.e5o;
import xsna.epx;
import xsna.g290;
import xsna.hfz;
import xsna.i31;
import xsna.j5g;
import xsna.l31;
import xsna.lat0;
import xsna.lcq0;
import xsna.o9c0;
import xsna.s620;
import xsna.sdh0;
import xsna.w2a0;
import xsna.wql0;

/* compiled from: VideoMinimizableDiscoveryReducer.kt */
/* loaded from: classes7.dex */
public final class p extends dm50<s, n, q> {
    public final bpn0 d;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
    
        if (r3 == null) goto L63;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(VideoMinimizableDiscoverySavedState videoMinimizableDiscoverySavedState) {
        super(new q(r4, r8, r5, r7, r6, r6, r6, null, r6, r11, r12, r13, r14, r15, r16, false, false, r19, r3, null, null, new q.b(0), null, null, false));
        FullscreenLockState.Unlocked unlocked;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar;
        VideoPlayerState videoPlayerState;
        MiniPlayerControllersWrapper.VideoInfo videoInfo;
        VideoFile videoFile;
        String P;
        MiniPlayerControllersWrapper.VideoInfo videoInfo2;
        VideoFile videoFile2;
        String title;
        EmptyList emptyList = EmptyList.b;
        lat0 lat0Var = new lat0(false, false);
        MiniPlayerControllersWrapper.VideoInfo videoInfo3 = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.b : null;
        VideoMiniPlayerState videoMiniPlayerState = new VideoMiniPlayerState((videoMinimizableDiscoverySavedState == null || (videoInfo2 = videoMinimizableDiscoverySavedState.b) == null || (videoFile2 = videoInfo2.b) == null || (title = videoFile2.getTitle()) == null) ? "" : title, (videoMinimizableDiscoverySavedState == null || (videoInfo = videoMinimizableDiscoverySavedState.b) == null || (videoFile = videoInfo.b) == null || (P = videoFile.P()) == null) ? "" : P, (videoMinimizableDiscoverySavedState == null || (videoPlayerState = videoMinimizableDiscoverySavedState.c.d) == null) ? new VideoPlayerState(new VideoPlayerStatus.Paused(false, 1, null), new VideoPlayerProgress.Vod(0L, 0L), null, null, 12, null) : videoPlayerState, VideoMiniPlayerAction.Pause, true, false, 32, null);
        q.c cVar = new q.c(true, false, false);
        b.a aVar = b.a.a;
        VideoMinimizableState videoMinimizableState = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.d : VideoMinimizableState.Hidden.b;
        VideoAnnounceState.Closed closed = VideoAnnounceState.Closed.b;
        VideoDiscoveryRecommendationsSourceArgs videoDiscoveryRecommendationsSourceArgs = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.e : null;
        VideoDiscoveryCatalogSourceArgs videoDiscoveryCatalogSourceArgs = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.f : null;
        VideoDiscoveryRelatedVideosSourceArgs videoDiscoveryRelatedVideosSourceArgs = videoMinimizableDiscoverySavedState != null ? videoMinimizableDiscoverySavedState.g : null;
        com.vk.video.ui.discovery.minimizable.related_videos.h hVar2 = (videoMinimizableDiscoverySavedState == null || videoMinimizableDiscoverySavedState.g == null || (hVar = h.c.a) == null) ? h.d.a : hVar;
        if (videoMinimizableDiscoverySavedState != null) {
            unlocked = BuildInfo.q() ? videoMinimizableDiscoverySavedState.h : null;
        }
        unlocked = FullscreenLockState.Unlocked.b;
        this.d = new bpn0(new w2a0(15));
    }

    public static q i(q qVar, n.w wVar) {
        q.b bVar = qVar.w;
        Boolean bool = wVar.b;
        boolean booleanValue = bool != null ? bool.booleanValue() : bVar.a;
        Boolean bool2 = wVar.c;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : bVar.b;
        Boolean bool3 = wVar.f;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : bVar.f;
        Boolean bool4 = wVar.d;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : bVar.c;
        Integer num = wVar.e;
        int intValue = num != null ? num.intValue() : bVar.d;
        Boolean bool5 = wVar.g;
        boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : bVar.g;
        Boolean bool6 = wVar.h;
        boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : bVar.h;
        Boolean bool7 = wVar.i;
        boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : bVar.e;
        bVar.getClass();
        return q.a(qVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, new q.b(intValue, booleanValue, booleanValue2, booleanValue4, booleanValue7, booleanValue3, booleanValue5, booleanValue6), null, null, false, 31457279);
    }

    public static q j(q qVar, boolean z) {
        AboutVideoItem.c.a aVar;
        l31 l31Var;
        l31 l31Var2 = null;
        if (z) {
            i31 i31Var = qVar.u;
            if (i31Var == null || (aVar = i31Var.a) == null || (l31Var = aVar.b) == null) {
                List<hfz> list = qVar.f;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof AboutVideoItem.c.a) {
                        arrayList.add(obj);
                    }
                }
                AboutVideoItem.c.a aVar2 = (AboutVideoItem.c.a) j5g.a0(arrayList);
                if (aVar2 != null) {
                    l31Var2 = aVar2.b;
                }
            } else {
                l31Var2 = l31Var;
            }
        }
        return q.a(qVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, l31Var2, null, null, null, false, 32505855);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x046d  */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q c(q qVar, n nVar) {
        FullscreenLockState temporarilyUnlocked;
        FullscreenLockState fullscreenLockState;
        FullscreenLockState fullscreenLockState2;
        String str;
        VideoFile videoFile;
        String title;
        String str2;
        VideoFile videoFile2;
        String P;
        VideoFile videoFile3;
        VideoFile videoFile4;
        VideoFile videoFile5;
        VideoFile videoFile6;
        VideoFile videoFile7;
        VideoMiniPlayerAction videoMiniPlayerAction;
        q qVar2 = qVar;
        n nVar2 = nVar;
        l31 l31Var = qVar2.v;
        List list = qVar2.f;
        VideoAnnounceState videoAnnounceState = qVar2.o;
        q.c cVar = qVar2.m;
        boolean z = qVar2.q;
        VideoMiniPlayerState videoMiniPlayerState = qVar2.l;
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar2.b;
        if (nVar2 instanceof n.a) {
            return q.a(qVar2, null, null, null, null, ((n.a) nVar2).b, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554415);
        }
        if (nVar2 instanceof n.l) {
            return q.a(qVar2, null, null, null, null, null, ((n.l) nVar2).b, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554399);
        }
        if (nVar2 instanceof n.b) {
            return q.a(qVar2, null, null, null, null, null, null, ((n.b) nVar2).b, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554367);
        }
        r10 = null;
        String str3 = null;
        MiniPlayerControllersWrapper.VideoInfo videoInfo2 = null;
        if (nVar2 instanceof n.c) {
            n.c cVar2 = (n.c) nVar2;
            VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section = cVar2.b;
            q.a aVar = videoDiscoveryCatalogRepository$Section != null ? new q.a(videoDiscoveryCatalogRepository$Section.a, videoDiscoveryCatalogRepository$Section.b) : null;
            List<VideoDiscoveryCatalogRepository$Section> list2 = cVar2.c;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (VideoDiscoveryCatalogRepository$Section videoDiscoveryCatalogRepository$Section2 : list2) {
                arrayList.add(new q.a(videoDiscoveryCatalogRepository$Section2.a, videoDiscoveryCatalogRepository$Section2.b));
            }
            return q.a(qVar2, null, null, null, null, null, null, null, aVar, arrayList, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554047);
        }
        if (nVar2 instanceof n.b0) {
            VideoPlayerState videoPlayerState = ((n.b0) nVar2).b;
            boolean z2 = com.vk.video.ui.discovery.minimizable.player.b.c(videoPlayerState.b) && !com.vk.video.ui.discovery.minimizable.player.b.c(videoMiniPlayerState.d.b);
            VideoMiniPlayerState videoMiniPlayerState2 = qVar2.l;
            VideoPlayerStatus videoPlayerStatus = videoPlayerState.b;
            if (epx.f(videoPlayerStatus, VideoPlayerStatus.Playing.b) || epx.f(videoPlayerStatus, VideoPlayerStatus.AdPlaying.b)) {
                videoMiniPlayerAction = VideoMiniPlayerAction.Play;
            } else if (epx.f(videoPlayerStatus, VideoPlayerStatus.Error.b)) {
                videoMiniPlayerAction = VideoMiniPlayerAction.Error;
            } else if (epx.f(videoPlayerStatus, VideoPlayerStatus.Loading.b)) {
                videoMiniPlayerAction = VideoMiniPlayerAction.Loading;
            } else if ((videoPlayerStatus instanceof VideoPlayerStatus.AdPaused) || epx.f(videoPlayerStatus, VideoPlayerStatus.Restricted.b) || (videoPlayerStatus instanceof VideoPlayerStatus.Paused)) {
                videoMiniPlayerAction = VideoMiniPlayerAction.Pause;
            } else {
                if (!(videoPlayerStatus instanceof VideoPlayerStatus.Completed) && !(videoPlayerStatus instanceof VideoPlayerStatus.Announce)) {
                    throw new NoWhenBranchMatchedException();
                }
                videoMiniPlayerAction = videoAnnounceState instanceof VideoAnnounceState.Shown ? VideoMiniPlayerAction.Next : VideoMiniPlayerAction.Replay;
            }
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, VideoMiniPlayerState.a(videoMiniPlayerState2, null, null, videoPlayerState, videoMiniPlayerAction, false, false, 51), null, null, null, null, z2 ? false : z, false, null, null, null, null, null, null, null, false, 33520639);
        }
        if (nVar2 instanceof n.u) {
            n.u uVar = (n.u) nVar2;
            String a1 = (videoInfo == null || (videoFile7 = videoInfo.b) == null) ? null : videoFile7.a1();
            MiniPlayerControllersWrapper.VideoInfo videoInfo3 = uVar.b;
            boolean f = epx.f(a1, (videoInfo3 == null || (videoFile6 = videoInfo3.b) == null) ? null : videoFile6.a1());
            MiniPlayerControllersWrapper.VideoInfo videoInfo4 = uVar.b;
            VideoMiniPlayerState a = VideoMiniPlayerState.a(qVar2.l, (videoInfo4 == null || (videoFile5 = videoInfo4.b) == null) ? null : videoFile5.getTitle(), (videoInfo3 == null || (videoFile4 = videoInfo3.b) == null) ? null : videoFile4.P(), null, null, false, false, 60);
            Boolean valueOf = Boolean.valueOf(cVar.b);
            if (!f) {
                valueOf = null;
            }
            q.c a2 = q.c.a(cVar, valueOf != null ? valueOf.booleanValue() : false, (videoInfo3 == null || (videoFile3 = videoInfo3.b) == null) ? false : e5o.a(videoFile3), 1);
            boolean z3 = uVar.c;
            if (z3) {
                list = EmptyList.b;
            }
            List list3 = z3 ? EmptyList.b : qVar2.g;
            List list4 = z3 ? EmptyList.b : qVar2.h;
            Boolean valueOf2 = f ? Boolean.valueOf(z) : null;
            return q.a(qVar2, videoInfo4, null, null, null, list, list3, list4, null, null, null, a, a2, null, null, null, valueOf2 != null ? valueOf2.booleanValue() : false, false, null, null, null, null, null, null, null, false, 33518478);
        }
        if (nVar2 instanceof n.c0) {
            return q.a(qVar2, null, null, ((n.c0) nVar2).b, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554427);
        }
        if (nVar2 instanceof n.t) {
            return q.a(qVar2, null, null, null, ((n.t) nVar2).b, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554423);
        }
        if (nVar2 instanceof n.i0) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, q.c.a(cVar, ((n.i0) nVar2).b, false, 5), null, null, null, false, false, null, null, null, null, null, null, null, false, 33552383);
        }
        if (nVar2 instanceof n.j0) {
            ((n.j0) nVar2).getClass();
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, q.c.a(cVar, false, false, 5), null, null, null, false, false, null, null, null, null, null, null, null, false, 33552383);
        }
        if (nVar2 instanceof n.s) {
            ((n.s) nVar2).getClass();
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, q.c.a(cVar, false, false, 6), null, null, null, false, false, null, null, null, null, null, null, null, false, 33552383);
        }
        if (nVar2 instanceof n.z) {
            n.z zVar = (n.z) nVar2;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, zVar.b, null, zVar.c, false, false, null, null, null, null, null, null, null, false, 33533951);
        }
        if (nVar2 instanceof n.f0) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((n.f0) nVar2).b, false, null, null, null, null, null, null, null, false, 33521663);
        }
        if (nVar2 instanceof n.h0) {
            n.h0 h0Var = (n.h0) nVar2;
            VideoFile videoFile8 = h0Var.c;
            VideoAnnounceState shown = videoFile8 != null ? new VideoAnnounceState.Shown(h0Var.b, videoFile8, h0Var.d, h0Var.e, h0Var.f) : VideoAnnounceState.Closed.b;
            if (videoFile8 == null || (title = videoFile8.getTitle()) == null) {
                if (videoInfo == null || (videoFile = videoInfo.b) == null) {
                    str = null;
                    if (videoFile8 != null || (P = videoFile8.P()) == null) {
                        if (videoInfo != null && (videoFile2 = videoInfo.b) != null) {
                            str3 = videoFile2.P();
                        }
                        str2 = str3;
                    } else {
                        str2 = P;
                    }
                    return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, new VideoMiniPlayerState(str, str2, new VideoPlayerState(videoFile8 == null ? new VideoPlayerStatus.Announce(h0Var.d, 0L) : VideoPlayerStatus.Completed.b, VideoPlayerProgress.Filled.b, null, null, 12, null), videoFile8 == null ? VideoMiniPlayerAction.Next : VideoMiniPlayerAction.Replay, videoMiniPlayerState.f, false, 32, null), null, null, shown, null, false, false, null, null, null, null, null, null, null, false, 33545215);
                }
                title = videoFile.getTitle();
            }
            str = title;
            if (videoFile8 != null) {
            }
            if (videoInfo != null) {
                str3 = videoFile2.P();
            }
            str2 = str3;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, new VideoMiniPlayerState(str, str2, new VideoPlayerState(videoFile8 == null ? new VideoPlayerStatus.Announce(h0Var.d, 0L) : VideoPlayerStatus.Completed.b, VideoPlayerProgress.Filled.b, null, null, 12, null), videoFile8 == null ? VideoMiniPlayerAction.Next : VideoMiniPlayerAction.Replay, videoMiniPlayerState.f, false, 32, null), null, null, shown, null, false, false, null, null, null, null, null, null, null, false, 33545215);
        }
        if (nVar2 instanceof n.k0) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, ((n.k0) nVar2).b, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33553919);
        }
        if (nVar2 instanceof n.e0) {
            com.vk.video.ui.discovery.minimizable.related_videos.h hVar = ((n.e0) nVar2).b;
            if (videoInfo != null) {
                PlayerRemoteController.Properties properties = videoInfo.g;
                boolean z4 = properties.c;
                properties.getClass();
                videoInfo2 = MiniPlayerControllersWrapper.VideoInfo.a(videoInfo, null, null, new PlayerRemoteController.Properties(hVar instanceof h.a, z4), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            }
            return q.a(qVar2, videoInfo2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, hVar, null, null, null, null, null, null, false, 33423358);
        }
        if (nVar2 instanceof n.d0) {
            return q.a(qVar2, null, ((n.d0) nVar2).b, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554429);
        }
        if (nVar2 instanceof n.o) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, ((n.o) nVar2).b, null, null, null, null, null, null, null, false, 33488895);
        }
        if (nVar2 instanceof n.x) {
            com.vk.video.ui.discovery.minimizable.fullscreen_lock.b bVar = ((n.x) nVar2).b;
            if (!epx.f(bVar, b.a.a)) {
                if (bVar instanceof b.C1987b) {
                    b.C1987b c1987b = (b.C1987b) bVar;
                    temporarilyUnlocked = new FullscreenLockState.Locked(c1987b.a, c1987b.b, c1987b.c);
                } else if (epx.f(bVar, b.d.a)) {
                    fullscreenLockState = FullscreenLockState.Unlocked.b;
                } else {
                    if (!(bVar instanceof b.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b.c cVar3 = (b.c) bVar;
                    temporarilyUnlocked = new FullscreenLockState.TemporarilyUnlocked(cVar3.a, cVar3.b, cVar3.c);
                }
                fullscreenLockState2 = temporarilyUnlocked;
                return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, fullscreenLockState2, null, null, null, null, null, false, 33292287);
            }
            fullscreenLockState = FullscreenLockState.AnimatingToUnlock.b;
            fullscreenLockState2 = fullscreenLockState;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, fullscreenLockState2, null, null, null, null, null, false, 33292287);
        }
        if (nVar2 instanceof n.r) {
            n.r rVar = (n.r) nVar2;
            VideoAnnounceState.Shown shown2 = videoAnnounceState instanceof VideoAnnounceState.Shown ? (VideoAnnounceState.Shown) videoAnnounceState : null;
            if (shown2 != null) {
                VideoFile videoFile9 = shown2.c;
                String a12 = videoFile9 != null ? videoFile9.a1() : null;
                if (a12 == null || a12.equals(rVar.b)) {
                    return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, new VideoAnnounceState.Shown(shown2.b, shown2.c, rVar.c, true, shown2.f), null, false, false, null, null, null, null, null, null, null, false, 33546239);
                }
            }
            return qVar2;
        }
        if (nVar2 instanceof n.g0) {
            n.g0 g0Var = (n.g0) nVar2;
            AboutVideoItem.c.a aVar2 = g0Var.b;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, new i31(aVar2, false, g0Var.c), l31Var != null ? aVar2.b : null, null, null, null, false, 31981567);
        }
        if (nVar2 instanceof n.y) {
            n.y yVar = (n.y) nVar2;
            AboutVideoItem.c.a aVar3 = yVar.b;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, new i31(aVar3, true, yVar.c), l31Var != null ? aVar3.b : null, null, null, null, false, 31981567);
        }
        if (nVar2 instanceof n.i) {
            i31 i31Var = qVar2.u;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, i31Var != null ? new i31(i31Var.a, i31Var.b, false) : null, null, null, null, null, false, 33030143);
        }
        if (nVar2 instanceof n.j) {
            g290 g290Var = qVar2.y;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, g290Var != null ? new g290(g290Var.a, g290Var.b, false) : null, false, 25165823);
        }
        if (nVar2 instanceof n.k) {
            return j(qVar2, true);
        }
        if (nVar2 instanceof n.f) {
            return j(qVar2, false);
        }
        if (nVar2 instanceof n.v) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, VideoMiniPlayerState.a(videoMiniPlayerState, null, null, null, null, ((n.v) nVar2).b, false, 47), null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33553407);
        }
        if (nVar2 instanceof n.e) {
            if (!((n.e) nVar2).b) {
                return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33030143);
            }
            ArrayList arrayList2 = new ArrayList(qVar2.f);
            arrayList2.removeIf(new o9c0(new lcq0(5), 1));
            return q.a(qVar2, null, null, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 31981551);
        }
        if (epx.f(nVar2, n.d.b)) {
            return q.a(qVar2, videoInfo != null ? MiniPlayerControllersWrapper.VideoInfo.a(videoInfo, null, null, null, 191) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33554430);
        }
        if (nVar2 instanceof n.w) {
            return i(qVar2, (n.w) nVar2);
        }
        if (nVar2 instanceof n.q) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, VideoMiniPlayerState.a(qVar2.l, null, null, null, null, false, ((n.q) nVar2).b, 31), null, null, null, null, false, false, null, null, null, null, null, null, null, false, 33553407);
        }
        if (nVar2 instanceof n.C1992n) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, new sdh0.c(((n.C1992n) nVar2).b), null, false, 29360127);
        }
        if (nVar2 instanceof n.h) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, sdh0.a.a, null, false, 29360127);
        }
        if (nVar2 instanceof n.m) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, new sdh0.b(((n.m) nVar2).b, false, false), null, false, 29360127);
        }
        if (nVar2 instanceof n.g) {
            if (!((n.g) nVar2).b) {
                return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 25165823);
            }
            ArrayList arrayList3 = new ArrayList(list);
            arrayList3.removeIf(new s620(new wql0(10), 2));
            return q.a(qVar2, null, null, null, null, arrayList3, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, false, 25165807);
        }
        if (nVar2 instanceof n.a0) {
            n.a0 a0Var = (n.a0) nVar2;
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, new g290(a0Var.b, a0Var.c, a0Var.d), false, 25165823);
        }
        if (nVar2 instanceof n.p) {
            return q.a(qVar2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, ((n.p) nVar2).b, 16777215);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final s d() {
        return new s(e(new alj0(this, 23)));
    }

    @Override // xsna.dm50
    public final void h(q qVar, s sVar) {
        f(sVar.a, qVar);
    }
}
