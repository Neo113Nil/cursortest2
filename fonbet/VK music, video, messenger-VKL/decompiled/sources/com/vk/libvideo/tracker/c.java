package com.vk.libvideo.tracker;

import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.bjc;
import xsna.hsi0;
import xsna.rts0;
import xsna.uzp0;

/* compiled from: VideoOpenActionMenuStatsTracker.kt */
/* loaded from: classes3.dex */
public final class c {
    public static void a(VideoFile videoFile) {
        if (BuildInfo.q() || BuildInfo.s()) {
            SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoActionMenuButtonClick((MobileOfficialAppsVideoStat$TypeScreenMode) new ScreenModeVideoStatMapper(rts0.b.a()).a(videoFile.o0(), videoFile.I0().b, new hsi0(4)), Long.valueOf(System.currentTimeMillis())), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c, b, uzp0Var.a).q();
        }
    }
}
