package com.facebook.drawee.components;

import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class DraweeEventTracker {
    public static final DraweeEventTracker b = new DraweeEventTracker();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Event {
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event ON_ACTIVITY_START;
        public static final Event ON_ACTIVITY_STOP;
        public static final Event ON_ATTACH_CONTROLLER;
        public static final Event ON_CLEAR_CONTROLLER;
        public static final Event ON_CLEAR_HIERARCHY;
        public static final Event ON_CLEAR_OLD_CONTROLLER;
        public static final Event ON_DATASOURCE_FAILURE;
        public static final Event ON_DATASOURCE_FAILURE_INT;
        public static final Event ON_DATASOURCE_RESULT;
        public static final Event ON_DATASOURCE_RESULT_INT;
        public static final Event ON_DATASOURCE_SUBMIT;
        public static final Event ON_DETACH_CONTROLLER;
        public static final Event ON_DRAWABLE_HIDE;
        public static final Event ON_DRAWABLE_SHOW;
        public static final Event ON_HOLDER_ATTACH;
        public static final Event ON_HOLDER_DETACH;
        public static final Event ON_INIT_CONTROLLER;
        public static final Event ON_RELEASE_CONTROLLER;
        public static final Event ON_RUN_CLEAR_CONTROLLER;
        public static final Event ON_SAME_CONTROLLER_SKIPPED;
        public static final Event ON_SCHEDULE_CLEAR_CONTROLLER;
        public static final Event ON_SET_CONTROLLER;
        public static final Event ON_SET_HIERARCHY;
        public static final Event ON_SUBMIT_CACHE_HIT;

        static {
            Event event = new Event("ON_SET_HIERARCHY", 0);
            ON_SET_HIERARCHY = event;
            Event event2 = new Event("ON_CLEAR_HIERARCHY", 1);
            ON_CLEAR_HIERARCHY = event2;
            Event event3 = new Event("ON_SET_CONTROLLER", 2);
            ON_SET_CONTROLLER = event3;
            Event event4 = new Event("ON_CLEAR_OLD_CONTROLLER", 3);
            ON_CLEAR_OLD_CONTROLLER = event4;
            Event event5 = new Event("ON_CLEAR_CONTROLLER", 4);
            ON_CLEAR_CONTROLLER = event5;
            Event event6 = new Event("ON_INIT_CONTROLLER", 5);
            ON_INIT_CONTROLLER = event6;
            Event event7 = new Event("ON_ATTACH_CONTROLLER", 6);
            ON_ATTACH_CONTROLLER = event7;
            Event event8 = new Event("ON_DETACH_CONTROLLER", 7);
            ON_DETACH_CONTROLLER = event8;
            Event event9 = new Event("ON_RELEASE_CONTROLLER", 8);
            ON_RELEASE_CONTROLLER = event9;
            Event event10 = new Event("ON_DATASOURCE_SUBMIT", 9);
            ON_DATASOURCE_SUBMIT = event10;
            Event event11 = new Event("ON_DATASOURCE_RESULT", 10);
            ON_DATASOURCE_RESULT = event11;
            Event event12 = new Event("ON_DATASOURCE_RESULT_INT", 11);
            ON_DATASOURCE_RESULT_INT = event12;
            Event event13 = new Event("ON_DATASOURCE_FAILURE", 12);
            ON_DATASOURCE_FAILURE = event13;
            Event event14 = new Event("ON_DATASOURCE_FAILURE_INT", 13);
            ON_DATASOURCE_FAILURE_INT = event14;
            Event event15 = new Event("ON_HOLDER_ATTACH", 14);
            ON_HOLDER_ATTACH = event15;
            Event event16 = new Event("ON_HOLDER_DETACH", 15);
            ON_HOLDER_DETACH = event16;
            Event event17 = new Event("ON_DRAWABLE_SHOW", 16);
            ON_DRAWABLE_SHOW = event17;
            Event event18 = new Event("ON_DRAWABLE_HIDE", 17);
            ON_DRAWABLE_HIDE = event18;
            Event event19 = new Event("ON_ACTIVITY_START", 18);
            ON_ACTIVITY_START = event19;
            Event event20 = new Event("ON_ACTIVITY_STOP", 19);
            ON_ACTIVITY_STOP = event20;
            Event event21 = new Event("ON_RUN_CLEAR_CONTROLLER", 20);
            ON_RUN_CLEAR_CONTROLLER = event21;
            Event event22 = new Event("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
            ON_SCHEDULE_CLEAR_CONTROLLER = event22;
            Event event23 = new Event("ON_SAME_CONTROLLER_SKIPPED", 22);
            ON_SAME_CONTROLLER_SKIPPED = event23;
            Event event24 = new Event("ON_SUBMIT_CACHE_HIT", 23);
            ON_SUBMIT_CACHE_HIT = event24;
            $VALUES = new Event[]{event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11, event12, event13, event14, event15, event16, event17, event18, event19, event20, event21, event22, event23, event24};
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public final void a(Event event) {
        if (!c) {
            return;
        }
        int i = 5;
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.a;
            if (arrayBlockingQueue.offer(event) || i <= 0) {
                return;
            }
            arrayBlockingQueue.poll();
            i--;
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
