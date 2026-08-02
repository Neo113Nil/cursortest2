package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.uqi;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("comment_id")
    private final Integer commentId;

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

        @pmi0("button")
        public static final EntryPoint BUTTON;

        @pmi0("friend_icon")
        public static final EntryPoint FRIEND_ICON;

        @pmi0("friend_inline_comment")
        public static final EntryPoint FRIEND_INLINE_COMMENT;

        @pmi0("inline_comment")
        public static final EntryPoint INLINE_COMMENT;

        @pmi0("non_friend_icon")
        public static final EntryPoint NON_FRIEND_ICON;

        static {
            EntryPoint entryPoint = new EntryPoint("BUTTON", 0);
            BUTTON = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("INLINE_COMMENT", 1);
            INLINE_COMMENT = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("FRIEND_INLINE_COMMENT", 2);
            FRIEND_INLINE_COMMENT = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("FRIEND_ICON", 3);
            FRIEND_ICON = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("NON_FRIEND_ICON", 4);
            NON_FRIEND_ICON = entryPoint5;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5};
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
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal>, a9y<MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal((EntryPoint) dq.f(x9yVar, "entry_point", tru.a(), EntryPoint.class), fai.s(x9yVar, "track_code"), fai.A(x9yVar, "comment_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal = (MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("entry_point", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.b()));
            x9yVar.o("track_code", mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.a);
            x9yVar.n("comment_id", mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.a());
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal(EntryPoint entryPoint, String str, Integer num) {
        this.entryPoint = entryPoint;
        this.a = str;
        this.commentId = num;
        FilteredString filteredString = new FilteredString(lhg.b(1024));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public final Integer a() {
        return this.commentId;
    }

    public final EntryPoint b() {
        return this.entryPoint;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal = (MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal) obj;
        return this.entryPoint == mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.entryPoint && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.a) && epx.f(this.commentId, mobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal.commentId);
    }

    public final int hashCode() {
        int a = urd0.a(this.entryPoint.hashCode() * 31, 31, this.a);
        Integer num = this.commentId;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedOpenCommentsModal(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", commentId=");
        return uqi.b(sb, this.commentId, ')');
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedOpenCommentsModal(EntryPoint entryPoint, String str, Integer num, int i, zcl zclVar) {
        this(entryPoint, str, (i & 4) != 0 ? null : num);
    }
}
