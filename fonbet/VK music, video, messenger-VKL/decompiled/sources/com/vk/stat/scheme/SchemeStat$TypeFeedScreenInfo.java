package com.vk.stat.scheme;

import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeFeedScreenInfo {
    public final transient String a;

    @pmi0("feed_type")
    private final FeedType feedType;

    @pmi0("feed_id")
    private final FilteredString filteredFeedId;

    @pmi0("page_size")
    private final int pageSize;

    @pmi0("start_from")
    private final String startFrom;

    @pmi0("state")
    private final State state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class FeedType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FeedType[] $VALUES;

        @pmi0("live_recommended")
        public static final FeedType LIVE_RECOMMENDED;

        @pmi0("recent")
        public static final FeedType RECENT;

        @pmi0("top")
        public static final FeedType TOP;

        static {
            FeedType feedType = new FeedType("TOP", 0);
            TOP = feedType;
            FeedType feedType2 = new FeedType("RECENT", 1);
            RECENT = feedType2;
            FeedType feedType3 = new FeedType("LIVE_RECOMMENDED", 2);
            LIVE_RECOMMENDED = feedType3;
            FeedType[] feedTypeArr = {feedType, feedType2, feedType3};
            $VALUES = feedTypeArr;
            $ENTRIES = new asp(feedTypeArr);
        }

        private FeedType(String str, int i) {
        }

        public static FeedType valueOf(String str) {
            return (FeedType) Enum.valueOf(FeedType.class, str);
        }

        public static FeedType[] values() {
            return (FeedType[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeFeedScreenInfo>, a9y<SchemeStat$TypeFeedScreenInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$TypeFeedScreenInfo((FeedType) dq.f(x9yVar, "feed_type", tru.a(), FeedType.class), fai.s(x9yVar, "start_from"), fai.p(x9yVar, "page_size"), fai.s(x9yVar, "feed_id"), (State) dq.f(x9yVar, "state", tru.a(), State.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeFeedScreenInfo schemeStat$TypeFeedScreenInfo = (SchemeStat$TypeFeedScreenInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("feed_type", tru.a().toJson(schemeStat$TypeFeedScreenInfo.a()));
            x9yVar.o("start_from", schemeStat$TypeFeedScreenInfo.c());
            x9yVar.n("page_size", Integer.valueOf(schemeStat$TypeFeedScreenInfo.b()));
            x9yVar.o("feed_id", schemeStat$TypeFeedScreenInfo.a);
            x9yVar.o("state", tru.a().toJson(schemeStat$TypeFeedScreenInfo.d()));
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;

        @pmi0("fresh")
        public static final State FRESH;

        @pmi0("initial")
        public static final State INITIAL;

        @pmi0("reload")
        public static final State RELOAD;

        static {
            State state = new State("INITIAL", 0);
            INITIAL = state;
            State state2 = new State("RELOAD", 1);
            RELOAD = state2;
            State state3 = new State("FRESH", 2);
            FRESH = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        private State(String str, int i) {
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeFeedScreenInfo(FeedType feedType, String str, int i, String str2, State state) {
        this.feedType = feedType;
        this.startFrom = str;
        this.pageSize = i;
        this.a = str2;
        this.state = state;
        FilteredString filteredString = new FilteredString(lhg.b(128));
        this.filteredFeedId = filteredString;
        filteredString.a(str2);
    }

    public final FeedType a() {
        return this.feedType;
    }

    public final int b() {
        return this.pageSize;
    }

    public final String c() {
        return this.startFrom;
    }

    public final State d() {
        return this.state;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeFeedScreenInfo)) {
            return false;
        }
        SchemeStat$TypeFeedScreenInfo schemeStat$TypeFeedScreenInfo = (SchemeStat$TypeFeedScreenInfo) obj;
        return this.feedType == schemeStat$TypeFeedScreenInfo.feedType && epx.f(this.startFrom, schemeStat$TypeFeedScreenInfo.startFrom) && this.pageSize == schemeStat$TypeFeedScreenInfo.pageSize && epx.f(this.a, schemeStat$TypeFeedScreenInfo.a) && this.state == schemeStat$TypeFeedScreenInfo.state;
    }

    public final int hashCode() {
        return this.state.hashCode() + urd0.a(shy.a(this.pageSize, urd0.a(this.feedType.hashCode() * 31, 31, this.startFrom), 31), 31, this.a);
    }

    public final String toString() {
        return "TypeFeedScreenInfo(feedType=" + this.feedType + ", startFrom=" + this.startFrom + ", pageSize=" + this.pageSize + ", feedId=" + this.a + ", state=" + this.state + ')';
    }
}
