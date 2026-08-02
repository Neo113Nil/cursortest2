package com.vk.common.links;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.api.base.Document;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.SchemeStat$TypeAwayItem;
import java.util.Map;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.zrp;

/* compiled from: LaunchContext.kt */
/* loaded from: classes17.dex */
public final class LaunchContext {
    public static final LaunchContext A = new LaunchContext(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Document g;
    public final String h;
    public final String i;
    public final String j;
    public final SchemeStat$TypeAwayItem k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ActivityNextState q;
    public final Integer r;
    public final SearchStatsLoggingInfo s;
    public final String t;
    public final CommonMarketStat$TypeRefSource u;
    public final boolean v;
    public final boolean w;
    public final Map<String, Object> x;
    public final Boolean y;
    public final String z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LaunchContext.kt */
    public static final class ActivityNextState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActivityNextState[] $VALUES;
        public static final ActivityNextState ALIVE;
        public static final ActivityNextState FINISH;
        public static final ActivityNextState UNKNOWN;

        static {
            ActivityNextState activityNextState = new ActivityNextState("FINISH", 0);
            FINISH = activityNextState;
            ActivityNextState activityNextState2 = new ActivityNextState("ALIVE", 1);
            ALIVE = activityNextState2;
            ActivityNextState activityNextState3 = new ActivityNextState(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
            UNKNOWN = activityNextState3;
            ActivityNextState[] activityNextStateArr = {activityNextState, activityNextState2, activityNextState3};
            $VALUES = activityNextStateArr;
            $ENTRIES = new asp(activityNextStateArr);
        }

        public ActivityNextState() {
            throw null;
        }

        public static ActivityNextState valueOf(String str) {
            return (ActivityNextState) Enum.valueOf(ActivityNextState.class, str);
        }

        public static ActivityNextState[] values() {
            return (ActivityNextState[]) $VALUES.clone();
        }
    }

    /* compiled from: LaunchContext.kt */
    public static final class a {
        public boolean a;
        public boolean b;
        public boolean c;
        public String d;
        public String e;
        public Document f;
        public String g;
        public String h;
        public boolean i;
        public boolean k;
        public SearchStatsLoggingInfo m;
        public CommonMarketStat$TypeRefSource n;
        public Boolean o;
        public boolean j = true;
        public ActivityNextState l = ActivityNextState.UNKNOWN;

        public final LaunchContext a() {
            return new LaunchContext(this.a, this.b, this.c, this.d, this.e, null, this.f, this.g, this.h, null, null, this.i, this.j, this.k, this.l, null, this.m, null, this.n, false, false, null, this.o, null, 2234400);
        }

        public final void b() {
            this.k = true;
        }
    }

    /* compiled from: LaunchContext.kt */
    public static final class b {
        public static LaunchContext a() {
            return LaunchContext.A;
        }
    }

    public LaunchContext() {
        this(false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108863);
    }

    public static LaunchContext a(LaunchContext launchContext, String str, int i) {
        boolean z = launchContext.a;
        boolean z2 = launchContext.b;
        boolean z3 = (i & 4) != 0 ? launchContext.c : true;
        String str2 = launchContext.d;
        boolean z4 = z3;
        String str3 = launchContext.e;
        String str4 = launchContext.f;
        Document document = launchContext.g;
        String str5 = launchContext.h;
        String str6 = (i & 256) != 0 ? launchContext.i : str;
        String str7 = launchContext.j;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = launchContext.k;
        boolean z5 = launchContext.l;
        boolean z6 = launchContext.m;
        boolean z7 = launchContext.n;
        boolean z8 = launchContext.o;
        String str8 = str6;
        boolean z9 = launchContext.p;
        ActivityNextState activityNextState = launchContext.q;
        Integer num = launchContext.r;
        SearchStatsLoggingInfo searchStatsLoggingInfo = launchContext.s;
        String str9 = launchContext.t;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = launchContext.u;
        boolean z10 = launchContext.v;
        boolean z11 = launchContext.w;
        Map<String, Object> map = launchContext.x;
        Boolean bool = launchContext.y;
        String str10 = launchContext.z;
        launchContext.getClass();
        return new LaunchContext(z, z2, z4, str2, str3, str4, document, str5, str8, str7, schemeStat$TypeAwayItem, z5, z6, z7, z8, z9, activityNextState, num, searchStatsLoggingInfo, str9, commonMarketStat$TypeRefSource, z10, z11, map, bool, str10);
    }

    public final ActivityNextState b() {
        return this.q;
    }

    public final String c() {
        return this.t;
    }

    public final Document d() {
        return this.g;
    }

    public final String e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaunchContext)) {
            return false;
        }
        LaunchContext launchContext = (LaunchContext) obj;
        return this.a == launchContext.a && this.b == launchContext.b && this.c == launchContext.c && epx.f(this.d, launchContext.d) && epx.f(this.e, launchContext.e) && epx.f(this.f, launchContext.f) && epx.f(this.g, launchContext.g) && epx.f(this.h, launchContext.h) && epx.f(this.i, launchContext.i) && epx.f(this.j, launchContext.j) && epx.f(this.k, launchContext.k) && this.l == launchContext.l && this.m == launchContext.m && this.n == launchContext.n && this.o == launchContext.o && this.p == launchContext.p && this.q == launchContext.q && epx.f(this.r, launchContext.r) && epx.f(this.s, launchContext.s) && epx.f(this.t, launchContext.t) && this.u == launchContext.u && this.v == launchContext.v && this.w == launchContext.w && epx.f(this.x, launchContext.x) && epx.f(this.y, launchContext.y) && epx.f(this.z, launchContext.z);
    }

    public final Integer f() {
        return this.r;
    }

    public final boolean g() {
        return this.w;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        int b2 = qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Document document = this.g;
        int hashCode4 = (hashCode3 + (document == null ? 0 : document.hashCode())) * 31;
        String str4 = this.h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = this.k;
        int hashCode8 = (this.q.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode7 + (schemeStat$TypeAwayItem == null ? 0 : schemeStat$TypeAwayItem.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p)) * 31;
        Integer num = this.r;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        SearchStatsLoggingInfo searchStatsLoggingInfo = this.s;
        int hashCode10 = (hashCode9 + (searchStatsLoggingInfo == null ? 0 : searchStatsLoggingInfo.hashCode())) * 31;
        String str7 = this.t;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = this.u;
        int b3 = qoy.b(qoy.b((hashCode11 + (commonMarketStat$TypeRefSource == null ? 0 : commonMarketStat$TypeRefSource.hashCode())) * 31, 31, this.v), 31, this.w);
        Map<String, Object> map = this.x;
        int hashCode12 = (b3 + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.y;
        int hashCode13 = (hashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.z;
        return hashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.m;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.i;
    }

    public final String m() {
        return this.z;
    }

    public final String n() {
        return this.d;
    }

    public final SearchStatsLoggingInfo o() {
        return this.s;
    }

    public final boolean p() {
        return this.n;
    }

    public final SchemeStat$TypeAwayItem q() {
        return this.k;
    }

    public final String r() {
        return this.h;
    }

    public final boolean s() {
        return this.b;
    }

    public final boolean t() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchContext(fromPush=");
        sb.append(this.a);
        sb.append(", isBrowser=");
        sb.append(this.b);
        sb.append(", forceInternal=");
        sb.append(this.c);
        sb.append(", refer=");
        sb.append(this.d);
        sb.append(", openFrom=");
        sb.append(this.e);
        sb.append(", refId=");
        sb.append(this.f);
        sb.append(", document=");
        sb.append(this.g);
        sb.append(", trackCode=");
        sb.append(this.h);
        sb.append(", originalUrl=");
        sb.append(this.i);
        sb.append(", entryPoint=");
        sb.append(this.j);
        sb.append(", statAwayItem=");
        sb.append(this.k);
        sb.append(", forceBrowser=");
        sb.append(this.l);
        sb.append(", makeAwayLink=");
        sb.append(this.m);
        sb.append(", skipCustomTabs=");
        sb.append(this.n);
        sb.append(", isLoginUser=");
        sb.append(this.o);
        sb.append(", fromExternal=");
        sb.append(this.p);
        sb.append(", activityNextState=");
        sb.append(this.q);
        sb.append(", forResultReqCode=");
        sb.append(this.r);
        sb.append(", searchStatsLoggingInfo=");
        sb.append(this.s);
        sb.append(", adsLabel=");
        sb.append(this.t);
        sb.append(", marketRefSource=");
        sb.append(this.u);
        sb.append(", isUserBanned=");
        sb.append(this.v);
        sb.append(", forceAlwaysOnTop=");
        sb.append(this.w);
        sb.append(", extrasMap=");
        sb.append(this.x);
        sb.append(", withoutBottomNavigation=");
        sb.append(this.y);
        sb.append(", pushType=");
        return ho8.a(sb, this.z, ')');
    }

    public final boolean u() {
        return this.v;
    }

    public LaunchContext(boolean z, boolean z2, boolean z3, String str, String str2, String str3, Document document, String str4, String str5, String str6, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, ActivityNextState activityNextState, Integer num, SearchStatsLoggingInfo searchStatsLoggingInfo, String str7, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, boolean z9, boolean z10, Map<String, ? extends Object> map, Boolean bool, String str8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = document;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = schemeStat$TypeAwayItem;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = activityNextState;
        this.r = num;
        this.s = searchStatsLoggingInfo;
        this.t = str7;
        this.u = commonMarketStat$TypeRefSource;
        this.v = z9;
        this.w = z10;
        this.x = map;
        this.y = bool;
        this.z = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LaunchContext(boolean z, boolean z2, boolean z3, String str, String str2, String str3, Document document, String str4, String str5, String str6, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem, boolean z4, boolean z5, boolean z6, ActivityNextState activityNextState, Integer num, SearchStatsLoggingInfo searchStatsLoggingInfo, String str7, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, boolean z7, boolean z8, Map map, Boolean bool, String str8, int i) {
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, (i & 4096) != 0, (i & 8192) != 0 ? false : z4, (i & 16384) != 0 ? true : z5, (32768 & i) != 0 ? false : z6, (65536 & i) != 0 ? ActivityNextState.UNKNOWN : activityNextState, (131072 & i) != 0 ? null : num, (262144 & i) != 0 ? null : searchStatsLoggingInfo, (524288 & i) != 0 ? null : str7, (1048576 & i) != 0 ? null : commonMarketStat$TypeRefSource, (2097152 & i) != 0 ? false : z7, (4194304 & i) != 0 ? false : z8, (8388608 & i) != 0 ? null : map, (16777216 & i) != 0 ? null : bool, (i & 33554432) != 0 ? null : str8);
        boolean z9 = (i & 1) != 0 ? false : z;
        boolean z10 = (i & 2) != 0 ? false : z2;
        boolean z11 = (i & 4) != 0 ? false : z3;
        String str9 = (i & 8) != 0 ? null : str;
        String str10 = (i & 16) != 0 ? null : str2;
        String str11 = (i & 32) != 0 ? null : str3;
        Document document2 = (i & 64) != 0 ? null : document;
        String str12 = (i & 128) != 0 ? null : str4;
        String str13 = (i & 256) != 0 ? null : str5;
        String str14 = (i & 512) != 0 ? null : str6;
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem2 = (i & 1024) != 0 ? null : schemeStat$TypeAwayItem;
        boolean z12 = true;
        if ((i & 2048) != 0) {
            z12 = false;
        }
    }
}
