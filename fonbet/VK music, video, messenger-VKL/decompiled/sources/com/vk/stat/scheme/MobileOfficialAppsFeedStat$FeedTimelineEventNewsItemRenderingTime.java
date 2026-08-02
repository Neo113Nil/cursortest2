package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.ironsource.X3;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedTimelineEvent;
import java.util.List;
import xsna.a9y;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ju20;
import xsna.lhg;
import xsna.ms9;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime implements MobileOfficialAppsFeedStat$FeedTimelineEvent.b {
    public final transient String a;

    @pmi0("feed_time_range")
    private final MobileOfficialAppsFeedStat$FeedTimeRange feedTimeRange;

    @pmi0("type")
    private final FilteredString filteredType;

    @pmi0("items")
    private final List<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> items;

    @pmi0(X3.i.L)
    private final Integer position;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime>, a9y<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange = (MobileOfficialAppsFeedStat$FeedTimeRange) dq.f(x9yVar, "feed_time_range", tru.a(), MobileOfficialAppsFeedStat$FeedTimeRange.class);
            String s = fai.s(x9yVar, "type");
            Integer A = fai.A(x9yVar, X3.i.L);
            Gson a = tru.a();
            b9y q = x9yVar.q("items");
            return new MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime(mobileOfficialAppsFeedStat$FeedTimeRange, s, A, (List) ((q == null || (q instanceof u9y)) ? null : a.fromJson(x9yVar.q("items").k(), new ju20().getType())));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime = (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("feed_time_range", tru.a().toJson(mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.a()));
            x9yVar.o("type", mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.a);
            x9yVar.n(X3.i.L, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.c());
            x9yVar.o("items", tru.a().toJson(mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.b()));
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, String str, Integer num, List<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> list) {
        this.feedTimeRange = mobileOfficialAppsFeedStat$FeedTimeRange;
        this.a = str;
        this.position = num;
        this.items = list;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredType = filteredString;
        filteredString.a(str);
    }

    public final MobileOfficialAppsFeedStat$FeedTimeRange a() {
        return this.feedTimeRange;
    }

    public final List<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> b() {
        return this.items;
    }

    public final Integer c() {
        return this.position;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime)) {
            return false;
        }
        MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime = (MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime) obj;
        return epx.f(this.feedTimeRange, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.feedTimeRange) && epx.f(this.a, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.a) && epx.f(this.position, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.position) && epx.f(this.items, mobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime.items);
    }

    public final int hashCode() {
        int a = urd0.a(this.feedTimeRange.hashCode() * 31, 31, this.a);
        Integer num = this.position;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        List<MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedTimelineEventNewsItemRenderingTime(feedTimeRange=");
        sb.append(this.feedTimeRange);
        sb.append(", type=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$FeedTimelineEventNewsItemRenderingTime(MobileOfficialAppsFeedStat$FeedTimeRange mobileOfficialAppsFeedStat$FeedTimeRange, String str, Integer num, List list, int i, zcl zclVar) {
        this(mobileOfficialAppsFeedStat$FeedTimeRange, str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : list);
    }
}
