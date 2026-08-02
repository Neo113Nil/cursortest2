package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("sort_latest")
        public static final Event SORT_LATEST;

        @pmi0("sort_oldest")
        public static final Event SORT_OLDEST;

        @pmi0("sort_popular")
        public static final Event SORT_POPULAR;

        static {
            Event event = new Event("SORT_POPULAR", 0);
            SORT_POPULAR = event;
            Event event2 = new Event("SORT_OLDEST", 1);
            SORT_OLDEST = event2;
            Event event3 = new Event("SORT_LATEST", 2);
            SORT_LATEST = event3;
            Event[] eventArr = {event, event2, event3};
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

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick>, a9y<MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick((Event) dq.f(x9yVar, NotificationCompat.CATEGORY_EVENT, tru.a(), Event.class), fai.s(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick = (MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o(NotificationCompat.CATEGORY_EVENT, tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick(Event event, String str) {
        this.event = event;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final Event a() {
        return this.event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick = (MobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick) obj;
        return this.event == mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick.event && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedCommentsSortTabClick.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.event.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedCommentsSortTabClick(event=");
        sb.append(this.event);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }
}
