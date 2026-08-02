package com.vk.newsfeed.impl.stats;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemScreenView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.bvt0;
import xsna.c5g;
import xsna.di60;
import xsna.izs;
import xsna.k9q0;
import xsna.k9x;
import xsna.qni0;
import xsna.qoy;
import xsna.vu5;
import xsna.zrp;

/* compiled from: PostViewFragmentTimeSpentTracker.kt */
/* loaded from: classes4.dex */
public final class PostViewFragmentTimeSpentTracker {
    public final izs<Integer, SectionType> a;
    public NewsEntry c;
    public MobileOfficialAppsCoreNavStat$EventScreen d;
    public final LinkedHashMap b = new LinkedHashMap();
    public final Rect e = new Rect();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostViewFragmentTimeSpentTracker.kt */
    public static final class SectionType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SectionType[] $VALUES;
        public static final SectionType Comments;
        public static final SectionType Post;

        static {
            SectionType sectionType = new SectionType("Post", 0);
            Post = sectionType;
            SectionType sectionType2 = new SectionType("Comments", 1);
            Comments = sectionType2;
            SectionType[] sectionTypeArr = {sectionType, sectionType2};
            $VALUES = sectionTypeArr;
            $ENTRIES = new asp(sectionTypeArr);
        }

        public SectionType() {
            throw null;
        }

        public static SectionType valueOf(String str) {
            return (SectionType) Enum.valueOf(SectionType.class, str);
        }

        public static SectionType[] values() {
            return (SectionType[]) $VALUES.clone();
        }
    }

    /* compiled from: PostViewFragmentTimeSpentTracker.kt */
    public static final class a {
        public final SectionType a;
        public final boolean b;
        public final int c;

        public a(SectionType sectionType, boolean z, int i) {
            this.a = sectionType;
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SectionData(sectionType=");
            sb.append(this.a);
            sb.append(", isFullyVisible=");
            sb.append(this.b);
            sb.append(", visibleHeight=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: PostViewFragmentTimeSpentTracker.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SectionType.values().length];
            try {
                iArr[SectionType.Post.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SectionType.Comments.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostViewFragmentTimeSpentTracker(izs<? super Integer, ? extends SectionType> izsVar) {
        this.a = izsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        if (r13 <= r12) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(RecyclerView recyclerView) {
        izs<Integer, SectionType> izsVar;
        Object obj;
        ?? singletonList;
        long a2 = qni0.a();
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        LinkedHashMap linkedHashMap = this.f;
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.g;
        linkedHashMap2.clear();
        LinkedHashMap linkedHashMap3 = this.h;
        linkedHashMap3.clear();
        LinkedHashMap linkedHashMap4 = this.i;
        linkedHashMap4.clear();
        LinkedHashMap linkedHashMap5 = this.j;
        linkedHashMap5.clear();
        int i = 0;
        while (true) {
            izsVar = this.a;
            if (i >= itemCount) {
                break;
            }
            SectionType invoke = izsVar.invoke(Integer.valueOf(i));
            if (invoke != null) {
                linkedHashMap.putIfAbsent(invoke, Integer.valueOf(i));
                linkedHashMap2.put(invoke, Integer.valueOf(i));
            }
            i++;
        }
        int i2 = 0;
        while (i2 < recyclerView.getChildCount()) {
            int i3 = i2 + 1;
            View childAt = recyclerView.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            SectionType invoke2 = izsVar.invoke(Integer.valueOf(childAdapterPosition));
            if (invoke2 != null) {
                Rect rect = this.e;
                childAt.getGlobalVisibleRect(rect);
                Integer num = (Integer) linkedHashMap5.get(invoke2);
                linkedHashMap5.put(invoke2, Integer.valueOf(rect.height() + (num != null ? num.intValue() : 0)));
                if (childAt.getMeasuredHeight() == rect.height()) {
                    linkedHashMap3.putIfAbsent(invoke2, Integer.valueOf(childAdapterPosition));
                    linkedHashMap4.put(invoke2, Integer.valueOf(childAdapterPosition));
                }
            }
            i2 = i3;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            SectionType sectionType = (SectionType) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            Integer num2 = (Integer) linkedHashMap2.get(sectionType);
            if (num2 != null) {
                int intValue2 = num2.intValue();
                Integer num3 = (Integer) linkedHashMap3.get(sectionType);
                Integer num4 = (Integer) linkedHashMap4.get(sectionType);
                if (num3 != null && num4 != null) {
                    int intValue3 = num3.intValue();
                    int i4 = new k9x(intValue3, num4.intValue(), 1).c;
                    if (intValue <= i4) {
                        if (intValue3 <= intValue) {
                            if (intValue2 <= i4) {
                            }
                        }
                    }
                }
                z = false;
                Integer num5 = (Integer) linkedHashMap5.get(sectionType);
                arrayList.add(new a(sectionType, z, num5 != null ? num5.intValue() : 0));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((a) next).b) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                Object next2 = it3.next();
                if (it3.hasNext()) {
                    int i5 = ((a) next2).c;
                    do {
                        Object next3 = it3.next();
                        int i6 = ((a) next3).c;
                        if (i5 < i6) {
                            next2 = next3;
                            i5 = i6;
                        }
                    } while (it3.hasNext());
                }
                obj = next2;
            } else {
                obj = null;
            }
            a aVar = (a) obj;
            singletonList = (aVar == null || aVar.c == 0) ? EmptyList.b : Collections.singletonList(aVar.a);
        } else {
            singletonList = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                singletonList.add(((a) it4.next()).a);
            }
        }
        for (SectionType sectionType2 : SectionType.values()) {
            if (singletonList.contains(sectionType2)) {
                b(sectionType2, a2, true);
            } else {
                b(sectionType2, a2, false);
            }
        }
    }

    public final void b(SectionType sectionType, long j, boolean z) {
        MobileOfficialAppsFeedStat$TypeFeedItemScreenView.Section section;
        UserId o;
        NewsEntry.TrackData Cb;
        LinkedHashMap linkedHashMap = this.b;
        if (z) {
            linkedHashMap.putIfAbsent(sectionType, Long.valueOf(j));
            return;
        }
        Long l = (Long) linkedHashMap.remove(sectionType);
        if (l != null) {
            long longValue = l.longValue();
            int i = b.$EnumSwitchMapping$0[sectionType.ordinal()];
            if (i == 1) {
                section = MobileOfficialAppsFeedStat$TypeFeedItemScreenView.Section.POST;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                section = MobileOfficialAppsFeedStat$TypeFeedItemScreenView.Section.COMMENTS;
            }
            MobileOfficialAppsFeedStat$TypeFeedItemScreenView mobileOfficialAppsFeedStat$TypeFeedItemScreenView = new MobileOfficialAppsFeedStat$TypeFeedItemScreenView(section);
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.d;
            if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                UiTracker uiTracker = UiTracker.a;
                mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
            }
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen2 = mobileOfficialAppsCoreNavStat$EventScreen;
            SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.FEED_ITEM;
            NewsEntry newsEntry = this.c;
            String str = (newsEntry == null || (Cb = newsEntry.Cb()) == null) ? null : Cb.b;
            NewsEntry newsEntry2 = this.c;
            new bvt0(mobileOfficialAppsCoreNavStat$EventScreen2, SchemeStat$TypeView.a.b(new SchemeStat$EventItem(type, this.c != null ? Long.valueOf(di60.n(r4)) : null, (newsEntry2 == null || (o = k9q0.o(newsEntry2)) == null) ? null : Long.valueOf(o.b), null, str, null, 40, null), String.valueOf(longValue), String.valueOf(j), null, mobileOfficialAppsFeedStat$TypeFeedItemScreenView, 8)).q();
        }
    }
}
