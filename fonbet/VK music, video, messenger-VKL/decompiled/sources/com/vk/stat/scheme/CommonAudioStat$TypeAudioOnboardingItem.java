package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.epx;
import xsna.hay;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeAudioOnboardingItem implements SchemeStat$TypeAction.b {

    @pmi0("artist_count")
    private final Integer artistCount;

    @pmi0("artist_id")
    private final Long artistId;

    @pmi0("client_time")
    private final long clientTime;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("scenario")
    private final Scenario scenario;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Event CLOSE;

        @pmi0("dislike")
        public static final Event DISLIKE;

        @pmi0("finish")
        public static final Event FINISH;

        @pmi0("like")
        public static final Event LIKE;

        @pmi0("offer")
        public static final Event OFFER;

        @pmi0("search")
        public static final Event SEARCH;

        static {
            Event event = new Event("OFFER", 0);
            OFFER = event;
            Event event2 = new Event("LIKE", 1);
            LIKE = event2;
            Event event3 = new Event("DISLIKE", 2);
            DISLIKE = event3;
            Event event4 = new Event("SEARCH", 3);
            SEARCH = event4;
            Event event5 = new Event("FINISH", 4);
            FINISH = event5;
            Event event6 = new Event("CLOSE", 5);
            CLOSE = event6;
            Event[] eventArr = {event, event2, event3, event4, event5, event6};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes11.dex */
    public static final class Scenario {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Scenario[] $VALUES;
        public static final Scenario CA1;
        public static final Scenario CA2;
        public static final Scenario CA3;
        public static final Scenario CA4;
        private final int value;

        /* compiled from: CommonAudioStat.kt */
        public static final class Serializer implements uay<Scenario> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(Integer.valueOf(((Scenario) obj).value));
            }
        }

        static {
            Scenario scenario = new Scenario("CA1", 0, 1);
            CA1 = scenario;
            Scenario scenario2 = new Scenario("CA2", 1, 2);
            CA2 = scenario2;
            Scenario scenario3 = new Scenario("CA3", 2, 3);
            CA3 = scenario3;
            Scenario scenario4 = new Scenario("CA4", 3, 4);
            CA4 = scenario4;
            Scenario[] scenarioArr = {scenario, scenario2, scenario3, scenario4};
            $VALUES = scenarioArr;
            $ENTRIES = new asp(scenarioArr);
        }

        public Scenario(String str, int i, int i2) {
            this.value = i2;
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeAudioOnboardingItem(Event event, Scenario scenario, long j, Long l, Integer num) {
        this.event = event;
        this.scenario = scenario;
        this.clientTime = j;
        this.artistId = l;
        this.artistCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioOnboardingItem)) {
            return false;
        }
        CommonAudioStat$TypeAudioOnboardingItem commonAudioStat$TypeAudioOnboardingItem = (CommonAudioStat$TypeAudioOnboardingItem) obj;
        return this.event == commonAudioStat$TypeAudioOnboardingItem.event && this.scenario == commonAudioStat$TypeAudioOnboardingItem.scenario && this.clientTime == commonAudioStat$TypeAudioOnboardingItem.clientTime && epx.f(this.artistId, commonAudioStat$TypeAudioOnboardingItem.artistId) && epx.f(this.artistCount, commonAudioStat$TypeAudioOnboardingItem.artistCount);
    }

    public final int hashCode() {
        int a = bh10.a((this.scenario.hashCode() + (this.event.hashCode() * 31)) * 31, 31, this.clientTime);
        Long l = this.artistId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.artistCount;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioOnboardingItem(event=");
        sb.append(this.event);
        sb.append(", scenario=");
        sb.append(this.scenario);
        sb.append(", clientTime=");
        sb.append(this.clientTime);
        sb.append(", artistId=");
        sb.append(this.artistId);
        sb.append(", artistCount=");
        return uqi.b(sb, this.artistCount, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioOnboardingItem(Event event, Scenario scenario, long j, Long l, Integer num, int i, zcl zclVar) {
        this(event, scenario, j, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num);
    }
}
