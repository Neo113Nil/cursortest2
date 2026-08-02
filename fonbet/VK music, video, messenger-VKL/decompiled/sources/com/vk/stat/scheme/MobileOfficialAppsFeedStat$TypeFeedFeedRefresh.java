package com.vk.stat.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedFeedRefresh implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;

    @pmi0("new_next_from")
    private final FilteredString filteredNewNextFrom;

    @pmi0("prev_next_from")
    private final FilteredString filteredPrevNextFrom;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedFeedRefresh>, a9y<MobileOfficialAppsFeedStat$TypeFeedFeedRefresh> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("subtype");
            return new MobileOfficialAppsFeedStat$TypeFeedFeedRefresh((Subtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Subtype.class)), fai.C(x9yVar, "prev_next_from"), fai.C(x9yVar, "new_next_from"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedFeedRefresh mobileOfficialAppsFeedStat$TypeFeedFeedRefresh = (MobileOfficialAppsFeedStat$TypeFeedFeedRefresh) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("subtype", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.a()));
            x9yVar.o("prev_next_from", mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.a);
            x9yVar.o("new_next_from", mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class Subtype {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subtype[] $VALUES;

        @pmi0("app_start")
        public static final Subtype APP_START;

        @pmi0("feed_icon_click")
        public static final Subtype FEED_ICON_CLICK;

        @pmi0("fresh_news_auto")
        public static final Subtype FRESH_NEWS_AUTO;

        @pmi0("fresh_news_click")
        public static final Subtype FRESH_NEWS_CLICK;

        @pmi0("offscreen")
        public static final Subtype OFFSCREEN;

        @pmi0("on_appear_feed")
        public static final Subtype ON_APPEAR_FEED;

        @pmi0("other")
        public static final Subtype OTHER;

        @pmi0("ptr")
        public static final Subtype PTR;

        @pmi0("reset_cache")
        public static final Subtype RESET_CACHE;

        static {
            Subtype subtype = new Subtype("PTR", 0);
            PTR = subtype;
            Subtype subtype2 = new Subtype("FRESH_NEWS_CLICK", 1);
            FRESH_NEWS_CLICK = subtype2;
            Subtype subtype3 = new Subtype("FEED_ICON_CLICK", 2);
            FEED_ICON_CLICK = subtype3;
            Subtype subtype4 = new Subtype("APP_START", 3);
            APP_START = subtype4;
            Subtype subtype5 = new Subtype("FRESH_NEWS_AUTO", 4);
            FRESH_NEWS_AUTO = subtype5;
            Subtype subtype6 = new Subtype("RESET_CACHE", 5);
            RESET_CACHE = subtype6;
            Subtype subtype7 = new Subtype("OFFSCREEN", 6);
            OFFSCREEN = subtype7;
            Subtype subtype8 = new Subtype("ON_APPEAR_FEED", 7);
            ON_APPEAR_FEED = subtype8;
            Subtype subtype9 = new Subtype(NativeAdContent.ViewTag.OTHER, 8);
            OTHER = subtype9;
            Subtype[] subtypeArr = {subtype, subtype2, subtype3, subtype4, subtype5, subtype6, subtype7, subtype8, subtype9};
            $VALUES = subtypeArr;
            $ENTRIES = new asp(subtypeArr);
        }

        private Subtype(String str, int i) {
        }

        public static Subtype valueOf(String str) {
            return (Subtype) Enum.valueOf(Subtype.class, str);
        }

        public static Subtype[] values() {
            return (Subtype[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedFeedRefresh() {
        this(null, null, null, 7, null);
    }

    public final Subtype a() {
        return this.subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedFeedRefresh)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedFeedRefresh mobileOfficialAppsFeedStat$TypeFeedFeedRefresh = (MobileOfficialAppsFeedStat$TypeFeedFeedRefresh) obj;
        return this.subtype == mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.subtype && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.a) && epx.f(this.b, mobileOfficialAppsFeedStat$TypeFeedFeedRefresh.b);
    }

    public final int hashCode() {
        Subtype subtype = this.subtype;
        int hashCode = (subtype == null ? 0 : subtype.hashCode()) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedFeedRefresh(subtype=");
        sb.append(this.subtype);
        sb.append(", prevNextFrom=");
        sb.append(this.a);
        sb.append(", newNextFrom=");
        return ho8.a(sb, this.b, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedFeedRefresh(Subtype subtype, String str, String str2) {
        this.subtype = subtype;
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredPrevNextFrom = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredNewNextFrom = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedFeedRefresh(Subtype subtype, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : subtype, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
