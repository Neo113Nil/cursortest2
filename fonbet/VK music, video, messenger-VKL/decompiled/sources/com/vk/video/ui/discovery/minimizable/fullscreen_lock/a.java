package com.vk.video.ui.discovery.minimizable.fullscreen_lock;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoScreenLockAction;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.b;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenLockState;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.b;
import com.vk.video.ui.discovery.minimizable.g;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerState;
import com.vk.video.ui.discovery.minimizable.player.VideoPlayerStatus;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.video.ui.discovery.minimizable.q;
import kotlin.NoWhenBranchMatchedException;
import xsna.dys;
import xsna.epx;
import xsna.r4k;
import xsna.sp;

/* compiled from: FullscreenLockFeatureHelper.kt */
/* loaded from: classes7.dex */
public final class a {
    public final r4k a;

    public a(r4k r4kVar) {
        this.a = r4kVar;
    }

    public static boolean c(VideoPlayerState videoPlayerState, VideoMinimizableState videoMinimizableState) {
        VideoPlayerStatus videoPlayerStatus = videoPlayerState.b;
        if (com.vk.video.ui.discovery.minimizable.player.b.a(videoPlayerStatus) || epx.f(videoPlayerStatus, VideoPlayerStatus.Completed.b) || (videoPlayerStatus instanceof VideoPlayerStatus.Announce)) {
            return true;
        }
        return (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) && ((VideoMinimizableState.FullscreenHorizontal) videoMinimizableState).b;
    }

    public static void e(a aVar, q qVar, VideoMinimizableState videoMinimizableState, VideoPlayerState videoPlayerState, com.vk.video.ui.discovery.minimizable.b bVar, MiniPlayerControllersWrapper.VideoInfo videoInfo, int i) {
        if ((i & 2) != 0) {
            videoMinimizableState = qVar.n;
        }
        if ((i & 4) != 0) {
            videoPlayerState = qVar.l.d;
        }
        if ((i & 8) != 0) {
            bVar = qVar.p;
        }
        if ((i & 16) != 0) {
            videoInfo = qVar.b;
        }
        aVar.getClass();
        FullscreenLockState fullscreenLockState = qVar.t;
        if (fullscreenLockState instanceof FullscreenLockState.Unlocked) {
            return;
        }
        VideoFile videoFile = videoInfo != null ? videoInfo.b : null;
        VideoPlayerStatus videoPlayerStatus = videoPlayerState.b;
        if (videoFile == null || videoFile.W9() || ((videoFile.v() && videoFile.l6() != 6) || (videoPlayerStatus instanceof VideoPlayerStatus.Error) || (videoPlayerStatus instanceof VideoPlayerStatus.Restricted))) {
            aVar.h();
            return;
        }
        boolean z = videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal;
        boolean z2 = true;
        if (z || (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical)) {
            if (!(fullscreenLockState instanceof FullscreenLockState.Locked)) {
                if (fullscreenLockState instanceof FullscreenLockState.TemporarilyUnlocked) {
                    if (!epx.f(bVar, b.a.a)) {
                        aVar.h();
                        return;
                    } else {
                        if (c(videoPlayerState, videoMinimizableState)) {
                            return;
                        }
                        aVar.a(videoMinimizableState, videoInfo, ((FullscreenLockState.TemporarilyUnlocked) fullscreenLockState).b.b, !r4.d);
                        return;
                    }
                }
                return;
            }
            if (!c(videoPlayerState, videoMinimizableState)) {
                FullscreenLockState.Locked locked = (FullscreenLockState.Locked) fullscreenLockState;
                aVar.a(videoMinimizableState, videoInfo, locked.b.b, locked.d);
                return;
            }
            if ((!z || !((VideoMinimizableState.FullscreenHorizontal) videoMinimizableState).b) && !epx.f(videoPlayerState.b, VideoPlayerStatus.Completed.b)) {
                z2 = false;
            }
            FullscreenLockArgs fullscreenLockArgs = ((FullscreenLockState.Locked) fullscreenLockState).b;
            aVar.f(new n.x(new b.c(new FullscreenLockArgs(fullscreenLockArgs.b, fullscreenLockArgs.c, false), z2, false)));
            return;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Expanded) {
            if ((fullscreenLockState instanceof FullscreenLockState.Locked) && ((FullscreenLockState.Locked) fullscreenLockState).b.d) {
                return;
            }
            aVar.h();
            return;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
            VideoMinimizableState.Animating animating = (VideoMinimizableState.Animating) videoMinimizableState;
            if (com.vk.libvideo.api.minimizable.a.g(animating.c) || (animating.c instanceof VideoMinimizableState.Pip)) {
                return;
            }
            aVar.h();
            return;
        }
        if (!(videoMinimizableState instanceof VideoMinimizableState.Pip)) {
            aVar.h();
        } else if (!BuildInfo.q() || !(fullscreenLockState instanceof FullscreenLockState.Locked)) {
            aVar.h();
        } else {
            FullscreenLockArgs fullscreenLockArgs2 = ((FullscreenLockState.Locked) fullscreenLockState).b;
            aVar.f(new n.x(new b.c(new FullscreenLockArgs(fullscreenLockArgs2.b, fullscreenLockArgs2.c, false), true, true)));
        }
    }

    public final void a(VideoMinimizableState videoMinimizableState, MiniPlayerControllersWrapper.VideoInfo videoInfo, boolean z, boolean z2) {
        VideoFile videoFile = videoInfo != null ? videoInfo.b : null;
        if (videoFile == null || (videoFile.v() && videoFile.l6() != 6)) {
            h();
            return;
        }
        if (videoMinimizableState instanceof VideoMinimizableState.FullscreenVertical) {
            f(new n.x(new b.C1987b(new FullscreenLockArgs(z, videoFile.e2(), false), FullscreenOrientationLockType.None, z2)));
            return;
        }
        boolean z3 = videoMinimizableState instanceof VideoMinimizableState.Expanded;
        if (z3 || (videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal)) {
            f(new n.x(new b.C1987b(new FullscreenLockArgs(z, videoFile.e2(), z3), z || videoFile.e2() ? FullscreenOrientationLockType.None : FullscreenOrientationLockType.SensorLandscape, z2)));
        } else {
            if (videoMinimizableState instanceof VideoMinimizableState.Animating) {
                return;
            }
            h();
        }
    }

    public final void b(q qVar, c.n nVar) {
        VideoFile videoFile;
        VideoMinimizableState videoMinimizableState = qVar.n;
        if (!(nVar instanceof c.n.a)) {
            if (nVar instanceof c.n.b) {
                g(VideoMinimizableDiscoverySideEffect.e.b.a);
                return;
            }
            if (!(nVar instanceof c.n.d)) {
                if (!(nVar instanceof c.n.C1976c)) {
                    throw new NoWhenBranchMatchedException();
                }
                f(new n.x(b.d.a));
                return;
            }
            MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventType eventType = MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventType.SCREEN_UNLOCK;
            MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventSource eventSource = MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventSource.BUTTON;
            MobileOfficialAppsVideoStat$TypeScreenMode y = sp.y(videoMinimizableState);
            if (y == null) {
                y = MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
            }
            new dys(new MobileOfficialAppsVideoStat$TypeVideoScreenLockAction(eventType, eventSource, y, null, 8, null)).q();
            f(new n.x(b.a.a));
            return;
        }
        MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventType eventType2 = MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventType.SCREEN_LOCK;
        MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventSource eventSource2 = MobileOfficialAppsVideoStat$TypeVideoScreenLockAction.EventSource.SETTINGS;
        MobileOfficialAppsVideoStat$TypeScreenMode y2 = sp.y(videoMinimizableState);
        if (y2 == null) {
            y2 = MobileOfficialAppsVideoStat$TypeScreenMode.INVISIBLE;
        }
        new dys(new MobileOfficialAppsVideoStat$TypeVideoScreenLockAction(eventType2, eventSource2, y2, null, 8, null)).q();
        boolean z = ((c.n.a) nVar).b;
        d(qVar);
        g(new VideoMinimizableDiscoverySideEffect.j.a(0));
        MiniPlayerControllersWrapper.VideoInfo videoInfo = qVar.b;
        boolean e2 = (videoInfo == null || (videoFile = videoInfo.b) == null) ? false : videoFile.e2();
        if ((videoMinimizableState instanceof VideoMinimizableState.Expanded) && (z || e2)) {
            g(new VideoMinimizableDiscoverySideEffect.k0(e2));
        }
        if ((videoMinimizableState instanceof VideoMinimizableState.FullscreenHorizontal) && ((VideoMinimizableState.FullscreenHorizontal) videoMinimizableState).b) {
            ((g) this.a.b).C(c.d1.b);
        }
        g(new VideoMinimizableDiscoverySideEffect.p.a(false));
        a(videoMinimizableState, videoInfo, z, false);
    }

    public final void d(q qVar) {
        if (com.vk.video.ui.discovery.minimizable.player.b.b(qVar.l.d.b) || epx.f(qVar.l.d.b, VideoPlayerStatus.Completed.b)) {
            g(VideoMinimizableDiscoverySideEffect.p.e.a);
        }
    }

    public final void f(n.x xVar) {
        ((g) this.a.b).T(xVar);
    }

    public final void g(VideoMinimizableDiscoverySideEffect videoMinimizableDiscoverySideEffect) {
        ((g) this.a.b).J.b(videoMinimizableDiscoverySideEffect);
    }

    public final void h() {
        f(new n.x(b.d.a));
    }
}
