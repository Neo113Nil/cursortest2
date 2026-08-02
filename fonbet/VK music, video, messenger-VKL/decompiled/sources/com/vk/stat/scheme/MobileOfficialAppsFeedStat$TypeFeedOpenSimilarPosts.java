package com.vk.stat.scheme;

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
public final class MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0("actions_menu")
        public static final EntryPoint ACTIONS_MENU;

        @pmi0("comments_block")
        public static final EntryPoint COMMENTS_BLOCK;

        @pmi0("post_icon")
        public static final EntryPoint POST_ICON;

        static {
            EntryPoint entryPoint = new EntryPoint("ACTIONS_MENU", 0);
            ACTIONS_MENU = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("POST_ICON", 1);
            POST_ICON = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("COMMENTS_BLOCK", 2);
            COMMENTS_BLOCK = entryPoint3;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts>, a9y<MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts((EntryPoint) dq.f(x9yVar, "entry_point", tru.a(), EntryPoint.class), fai.s(x9yVar, "track_code"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts = (MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("entry_point", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts.a()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts(EntryPoint entryPoint, String str) {
        this.entryPoint = entryPoint;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final EntryPoint a() {
        return this.entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts = (MobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts.entryPoint && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedOpenSimilarPosts.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.entryPoint.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedOpenSimilarPosts(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", trackCode=");
        return ho8.a(sb, this.a, ')');
    }
}
