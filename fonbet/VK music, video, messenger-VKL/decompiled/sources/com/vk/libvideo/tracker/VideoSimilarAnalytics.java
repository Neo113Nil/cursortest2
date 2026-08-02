package com.vk.libvideo.tracker;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$VideoEventSource;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.iid0;
import xsna.sp;
import xsna.zrp;

/* compiled from: VideoSimilarAnalytics.kt */
/* loaded from: classes3.dex */
public final class VideoSimilarAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSimilarAnalytics.kt */
    public static final class EventSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventSource[] $VALUES;
        public static final EventSource BUTTON;
        public static final EventSource SWIPE;

        static {
            EventSource eventSource = new EventSource("BUTTON", 0);
            BUTTON = eventSource;
            EventSource eventSource2 = new EventSource("SWIPE", 1);
            SWIPE = eventSource2;
            EventSource[] eventSourceArr = {eventSource, eventSource2};
            $VALUES = eventSourceArr;
            $ENTRIES = new asp(eventSourceArr);
        }

        public EventSource() {
            throw null;
        }

        public static EventSource valueOf(String str) {
            return (EventSource) Enum.valueOf(EventSource.class, str);
        }

        public static EventSource[] values() {
            return (EventSource[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoSimilarAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventSource.values().length];
            try {
                iArr[EventSource.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventSource.SWIPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(VideoMinimizableState videoMinimizableState, VideoFile videoFile, EventSource eventSource) {
        MobileOfficialAppsVideoStat$VideoEventSource mobileOfficialAppsVideoStat$VideoEventSource;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null);
        MobileOfficialAppsVideoStat$TypeScreenMode y = sp.y(videoMinimizableState);
        if (y == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        int i = a.$EnumSwitchMapping$0[eventSource.ordinal()];
        if (i == 1) {
            mobileOfficialAppsVideoStat$VideoEventSource = MobileOfficialAppsVideoStat$VideoEventSource.BUTTON;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsVideoStat$VideoEventSource = MobileOfficialAppsVideoStat$VideoEventSource.SWIPE;
        }
        new iid0(c, SchemeStat$TypeAction.a.b(schemeStat$EventItem, null, new MobileOfficialAppsVideoStat$TypeVideoOpenSimilarsAction(y, mobileOfficialAppsVideoStat$VideoEventSource), 2)).q();
    }
}
