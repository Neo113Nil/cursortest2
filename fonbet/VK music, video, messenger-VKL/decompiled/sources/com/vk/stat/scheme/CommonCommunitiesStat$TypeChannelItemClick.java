package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.bh10;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeChannelItemClick implements SchemeStat$TypeClick.b {

    @pmi0("content_id")
    private final long contentId;

    @pmi0("content_owner_id")
    private final long contentOwnerId;

    @pmi0("content_type")
    private final ContentType contentType;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0(X3.i.L)
    private final int position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class ContentType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @pmi0("channel_preview")
        public static final ContentType CHANNEL_PREVIEW;

        static {
            ContentType contentType = new ContentType("CHANNEL_PREVIEW", 0);
            CHANNEL_PREVIEW = contentType;
            ContentType[] contentTypeArr = {contentType};
            $VALUES = contentTypeArr;
            $ENTRIES = new asp(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("open_channel")
        public static final Event OPEN_CHANNEL;

        static {
            Event event = new Event("OPEN_CHANNEL", 0);
            OPEN_CHANNEL = event;
            Event[] eventArr = {event};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public CommonCommunitiesStat$TypeChannelItemClick(Event event, long j, long j2, ContentType contentType, int i) {
        this.event = event;
        this.contentOwnerId = j;
        this.contentId = j2;
        this.contentType = contentType;
        this.position = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonCommunitiesStat$TypeChannelItemClick)) {
            return false;
        }
        CommonCommunitiesStat$TypeChannelItemClick commonCommunitiesStat$TypeChannelItemClick = (CommonCommunitiesStat$TypeChannelItemClick) obj;
        return this.event == commonCommunitiesStat$TypeChannelItemClick.event && this.contentOwnerId == commonCommunitiesStat$TypeChannelItemClick.contentOwnerId && this.contentId == commonCommunitiesStat$TypeChannelItemClick.contentId && this.contentType == commonCommunitiesStat$TypeChannelItemClick.contentType && this.position == commonCommunitiesStat$TypeChannelItemClick.position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position) + ((this.contentType.hashCode() + bh10.a(bh10.a(this.event.hashCode() * 31, 31, this.contentOwnerId), 31, this.contentId)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeChannelItemClick(event=");
        sb.append(this.event);
        sb.append(", contentOwnerId=");
        sb.append(this.contentOwnerId);
        sb.append(", contentId=");
        sb.append(this.contentId);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", position=");
        return vu5.b(sb, this.position, ')');
    }
}
