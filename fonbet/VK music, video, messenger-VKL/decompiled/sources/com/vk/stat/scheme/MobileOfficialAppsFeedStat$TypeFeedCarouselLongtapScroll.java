package com.vk.stat.scheme;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
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
public final class MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)
    private final Direction direction;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class Direction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;

        @pmi0("next")
        public static final Direction NEXT;

        @pmi0("previous")
        public static final Direction PREVIOUS;

        static {
            Direction direction = new Direction("NEXT", 0);
            NEXT = direction;
            Direction direction2 = new Direction("PREVIOUS", 1);
            PREVIOUS = direction2;
            Direction[] directionArr = {direction, direction2};
            $VALUES = directionArr;
            $ENTRIES = new asp(directionArr);
        }

        private Direction(String str, int i) {
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll>, a9y<MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll((Direction) dq.f(x9yVar, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, tru.a(), Direction.class), fai.s(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll = (MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll) obj;
            x9y x9yVar = new x9y();
            x9yVar.o(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll(Direction direction, String str) {
        this.direction = direction;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final Direction a() {
        return this.direction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll = (MobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll) obj;
        return this.direction == mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll.direction && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedCarouselLongtapScroll.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.direction.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedCarouselLongtapScroll(direction=");
        sb.append(this.direction);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }
}
