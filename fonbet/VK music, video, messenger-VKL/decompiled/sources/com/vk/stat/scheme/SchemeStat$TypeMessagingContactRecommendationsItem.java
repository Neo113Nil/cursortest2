package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMessagingContactRecommendationsItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0(X3.i.L)
    private final int position;

    @pmi0("track_code")
    private final String trackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("click")
        public static final EventType CLICK;

        @pmi0("hide")
        public static final EventType HIDE;

        @pmi0(SignalingProtocol.KEY_REMOVE)
        public static final EventType REMOVE;

        @pmi0("show")
        public static final EventType SHOW;

        static {
            EventType eventType = new EventType(SignalingProtocol.KEY_ROOMS_EVENT_TYPE_REMOVE, 0);
            REMOVE = eventType;
            EventType eventType2 = new EventType("SHOW", 1);
            SHOW = eventType2;
            EventType eventType3 = new EventType("HIDE", 2);
            HIDE = eventType3;
            EventType eventType4 = new EventType("CLICK", 3);
            CLICK = eventType4;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeMessagingContactRecommendationsItem(int i, String str, EventType eventType) {
        this.position = i;
        this.trackCode = str;
        this.eventType = eventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMessagingContactRecommendationsItem)) {
            return false;
        }
        SchemeStat$TypeMessagingContactRecommendationsItem schemeStat$TypeMessagingContactRecommendationsItem = (SchemeStat$TypeMessagingContactRecommendationsItem) obj;
        return this.position == schemeStat$TypeMessagingContactRecommendationsItem.position && epx.f(this.trackCode, schemeStat$TypeMessagingContactRecommendationsItem.trackCode) && this.eventType == schemeStat$TypeMessagingContactRecommendationsItem.eventType;
    }

    public final int hashCode() {
        return this.eventType.hashCode() + urd0.a(Integer.hashCode(this.position) * 31, 31, this.trackCode);
    }

    public final String toString() {
        return "TypeMessagingContactRecommendationsItem(position=" + this.position + ", trackCode=" + this.trackCode + ", eventType=" + this.eventType + ')';
    }
}
