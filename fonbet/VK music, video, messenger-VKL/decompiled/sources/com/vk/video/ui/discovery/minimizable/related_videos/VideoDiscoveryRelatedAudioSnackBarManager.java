package com.vk.video.ui.discovery.minimizable.related_videos;

import android.content.Context;
import xsna.asp;
import xsna.ikv0;
import xsna.zrp;

/* compiled from: VideoDiscoveryRelatedAudioSnackBarManager.kt */
/* loaded from: classes7.dex */
public final class VideoDiscoveryRelatedAudioSnackBarManager {
    public final Context a;
    public ikv0 b;
    public ikv0.d c;
    public io.reactivex.rxjava3.disposables.c d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDiscoveryRelatedAudioSnackBarManager.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event Added;
        public static final Event Removed;

        static {
            Event event = new Event("Added", 0);
            Added = event;
            Event event2 = new Event("Removed", 1);
            Removed = event2;
            Event[] eventArr = {event, event2};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
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

    /* compiled from: VideoDiscoveryRelatedAudioSnackBarManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Event.values().length];
            try {
                iArr[Event.Added.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Event.Removed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoDiscoveryRelatedAudioSnackBarManager(Context context) {
        this.a = context;
    }
}
