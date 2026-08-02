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
public final class MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {
    public final transient String a;

    @pmi0("description")
    private final FilteredString filteredDescription;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError>, a9y<MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            return new MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError(fai.C((x9y) b9yVar, "description"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            x9y x9yVar = new x9y();
            x9yVar.o("description", ((MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError) obj).a);
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError) && epx.f(this.a, ((MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("FeedTimelineEventRenderingError(description="), this.a, ')');
    }

    public MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError(String str) {
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredDescription = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventRenderingError(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
