package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {
    public final transient String a;
    public final transient String b;

    @pmi0("description")
    private final FilteredString filteredDescription;

    @pmi0("type")
    private final FilteredString filteredType;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError>, a9y<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError(fai.s(x9yVar, "type"), fai.C(x9yVar, "description"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError = (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError.a);
            x9yVar.o("description", mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError.b);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError(String str, String str2) {
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredType = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredDescription = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError = (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError) obj;
        return epx.f(this.a, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError.a) && epx.f(this.b, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedTimelineEventNewsItemParsingError(type=");
        sb.append(this.a);
        sb.append(", description=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemParsingError(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
