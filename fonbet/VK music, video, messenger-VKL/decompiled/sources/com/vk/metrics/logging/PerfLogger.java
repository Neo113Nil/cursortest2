package com.vk.metrics.logging;

import android.os.Build;
import android.util.Log;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.asp;
import xsna.brm0;
import xsna.zrp;

/* compiled from: PerfLogger.kt */
/* loaded from: classes3.dex */
public final class PerfLogger {
    public final boolean a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PerfLogger.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event NEWSFEED_CACHE_RENDERED;
        public static final Event NEWSFEED_CREATED;
        public static final Event NEWSFEED_DISPLAYED;
        public static final Event NEWSFEED_REQUEST_SENT;
        public static final Event NEWSFEED_RESPONSE_RECEIVED;
        public static final Event NEWSFEED_RESPONSE_RENDERED;
        public static final Event START_INIT_STORIES_FEED;
        public static final Event STORIES_FEED_COMPLETED_FOR_DRAW;
        public static final Event STORIES_FEED_DRAW;
        public static final Event STORIES_FINISH_OPEN_STORY_CLICK;
        public static final Event STORIES_FINISH_OPEN_STORY_NEXT;
        public static final Event STORIES_START_OPEN_STORY_CLICK;
        public static final Event STORIES_START_OPEN_STORY_NEXT;
        private final String tag;

        static {
            Event event = new Event("NEWSFEED_CREATED", 0, "feed_created_timestamp");
            NEWSFEED_CREATED = event;
            Event event2 = new Event("NEWSFEED_DISPLAYED", 1, "feed_displayed_timestamp");
            NEWSFEED_DISPLAYED = event2;
            Event event3 = new Event("NEWSFEED_REQUEST_SENT", 2, "feed_initial_request_sent");
            NEWSFEED_REQUEST_SENT = event3;
            Event event4 = new Event("NEWSFEED_RESPONSE_RECEIVED", 3, "feed_initial_response_received");
            NEWSFEED_RESPONSE_RECEIVED = event4;
            Event event5 = new Event("NEWSFEED_CACHE_RENDERED", 4, "feed_cache_rendered");
            NEWSFEED_CACHE_RENDERED = event5;
            Event event6 = new Event("NEWSFEED_RESPONSE_RENDERED", 5, "feed_response_rendered");
            NEWSFEED_RESPONSE_RENDERED = event6;
            Event event7 = new Event("STORIES_START_OPEN_STORY_CLICK", 6, "start_open_story_click");
            STORIES_START_OPEN_STORY_CLICK = event7;
            Event event8 = new Event("STORIES_START_OPEN_STORY_NEXT", 7, "start_open_story_next");
            STORIES_START_OPEN_STORY_NEXT = event8;
            Event event9 = new Event("STORIES_FINISH_OPEN_STORY_CLICK", 8, "finish_open_story_click");
            STORIES_FINISH_OPEN_STORY_CLICK = event9;
            Event event10 = new Event("STORIES_FINISH_OPEN_STORY_NEXT", 9, "finish_open_story_next");
            STORIES_FINISH_OPEN_STORY_NEXT = event10;
            Event event11 = new Event("START_INIT_STORIES_FEED", 10, "start_init_stories_feed");
            START_INIT_STORIES_FEED = event11;
            Event event12 = new Event("STORIES_FEED_DRAW", 11, "stories_feed_draw");
            STORIES_FEED_DRAW = event12;
            Event event13 = new Event("STORIES_FEED_COMPLETED_FOR_DRAW", 12, "stories_feed_completed_for_draw");
            STORIES_FEED_COMPLETED_FOR_DRAW = event13;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12, event13};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        public Event(String str, int i, String str2) {
            this.tag = str2;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final String h() {
            return this.tag;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (xsna.brm0.w(android.os.Build.MANUFACTURER, com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, true) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (xsna.brm0.w(r0, "sdk_gphone64_arm64", true) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PerfLogger() {
        L l = L.a;
        LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
        l.getClass();
        boolean m = L.m(loggerOutputTarget);
        boolean z = true;
        if (m) {
            if (BuildInfo.o()) {
                String str = Build.MODEL;
                if (!brm0.w(str, "sdk_gphone_x86_64", true)) {
                }
            }
            z = false;
        }
        this.a = z;
    }

    public final void a(Event event) {
        if (this.a) {
            Log.println(2, "PERF", event.h() + ": " + System.currentTimeMillis());
        }
    }

    public final void b(long j, String str) {
        if (this.a) {
            Log.println(2, "PERF", str + ": " + j);
        }
    }
}
