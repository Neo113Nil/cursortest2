package com.vk.story.viewer.stat.data.cache;

import androidx.room.e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.b290;
import xsna.bpn0;
import xsna.c9m0;
import xsna.cfm0;
import xsna.cmg0;
import xsna.dcy;
import xsna.egm0;
import xsna.fpf0;
import xsna.in60;
import xsna.lva0;
import xsna.mem0;
import xsna.phm0;
import xsna.rem0;
import xsna.rfc;
import xsna.u110;
import xsna.y3l0;
import xsna.yfm0;
import xsna.zhm0;

/* compiled from: StoryStatisticsDatabase_Impl.kt */
/* loaded from: classes6.dex */
public final class StoryStatisticsDatabase_Impl extends StoryStatisticsDatabase {
    public final bpn0 m = new bpn0(new y3l0(this, 5));
    public final bpn0 n = new bpn0(new c9m0(this, 1));
    public final bpn0 o = new bpn0(new u110(this, 19));
    public final bpn0 p = new bpn0(new b290(this, 24));
    public final bpn0 q = new bpn0(new in60(this, 23));
    public final bpn0 r = new bpn0(new lva0(this, 25));

    @Override // com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase
    public final yfm0 A() {
        return (yfm0) this.q.getValue();
    }

    @Override // com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase
    public final egm0 B() {
        return (egm0) this.r.getValue();
    }

    @Override // com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase
    public final phm0 C() {
        return (phm0) this.n.getValue();
    }

    @Override // com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase
    public final zhm0 D() {
        return (zhm0) this.o.getValue();
    }

    @Override // androidx.room.RoomDatabase
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final e e() {
        return new e(this, new LinkedHashMap(), new LinkedHashMap(), "story_statistics_info", "story_statistics_viewer", "story_statistics_viewers_meta", "story_statistics_excluded_users", "story_statistics_question", "story_statistics_questions_meta");
    }

    @Override // androidx.room.RoomDatabase
    public final cmg0 f() {
        return new mem0(this);
    }

    @Override // androidx.room.RoomDatabase
    public final Set<dcy<Object>> k() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final LinkedHashMap m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rfc a = fpf0.a(cfm0.class);
        EmptyList emptyList = EmptyList.b;
        linkedHashMap.put(a, emptyList);
        linkedHashMap.put(fpf0.a(phm0.class), emptyList);
        linkedHashMap.put(fpf0.a(zhm0.class), emptyList);
        linkedHashMap.put(fpf0.a(rem0.class), emptyList);
        linkedHashMap.put(fpf0.a(yfm0.class), emptyList);
        linkedHashMap.put(fpf0.a(egm0.class), emptyList);
        return linkedHashMap;
    }

    @Override // com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase
    public final rem0 y() {
        return (rem0) this.p.getValue();
    }

    @Override // com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase
    public final cfm0 z() {
        return (cfm0) this.m.getValue();
    }
}
