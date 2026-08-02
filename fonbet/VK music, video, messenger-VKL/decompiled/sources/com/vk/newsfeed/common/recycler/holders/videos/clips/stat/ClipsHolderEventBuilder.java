package com.vk.newsfeed.common.recycler.holders.videos.clips.stat;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.asp;
import xsna.l5m;
import xsna.qrk0;
import xsna.zrp;

/* compiled from: ClipsHolderEventBuilder.kt */
/* loaded from: classes4.dex */
public final class ClipsHolderEventBuilder extends l5m {
    public final Event h;
    public final String i;
    public final HolderType j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsHolderEventBuilder.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event EMPTY_PLACEHOLDER_SHOWN;
        public static final Event ITEMS_SHOWN;
        public static final Event SKELETON_SHOWN;
        private final String value;

        static {
            Event event = new Event("SKELETON_SHOWN", 0, "skeleton_shown");
            SKELETON_SHOWN = event;
            Event event2 = new Event("EMPTY_PLACEHOLDER_SHOWN", 1, "empty_placeholder_shown");
            EMPTY_PLACEHOLDER_SHOWN = event2;
            Event event3 = new Event("ITEMS_SHOWN", 2, "items_shown");
            ITEMS_SHOWN = event3;
            Event[] eventArr = {event, event2, event3};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        public Event(String str, int i, String str2) {
            this.value = str2;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsHolderEventBuilder.kt */
    public static final class HolderType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ HolderType[] $VALUES;
        public static final HolderType RECOMMENDATION_BLOCK;
        public static final HolderType RETENTION_BLOCK;
        private final String value;

        static {
            HolderType holderType = new HolderType("RECOMMENDATION_BLOCK", 0, "recommendation_block");
            RECOMMENDATION_BLOCK = holderType;
            HolderType holderType2 = new HolderType("RETENTION_BLOCK", 1, "retention_block");
            RETENTION_BLOCK = holderType2;
            HolderType[] holderTypeArr = {holderType, holderType2};
            $VALUES = holderTypeArr;
            $ENTRIES = new asp(holderTypeArr);
        }

        public HolderType(String str, int i, String str2) {
            this.value = str2;
        }

        public static HolderType valueOf(String str) {
            return (HolderType) Enum.valueOf(HolderType.class, str);
        }

        public static HolderType[] values() {
            return (HolderType[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    public ClipsHolderEventBuilder(Event event, String str, HolderType holderType) {
        super(null, null, 3);
        this.h = event;
        this.i = str;
        this.j = holderType;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_NEWSFEED_BLOCK.h(), null, this.h.h(), null, this.i, null, this.j.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -86, 3, null);
        return super.p();
    }
}
