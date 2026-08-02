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
public final class MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("next_from")
    private final FilteredString filteredNextFrom;

    @pmi0("subtype")
    private final Subtype subtype;

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop>, a9y<MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q("subtype");
            return new MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop((Subtype) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Subtype.class)), fai.C(x9yVar, "next_from"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop = (MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("subtype", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop.a()));
            x9yVar.o("next_from", mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop.a);
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

        @pmi0("feed_icon_click")
        public static final Subtype FEED_ICON_CLICK;

        @pmi0("other")
        public static final Subtype OTHER;

        static {
            Subtype subtype = new Subtype("FEED_ICON_CLICK", 0);
            FEED_ICON_CLICK = subtype;
            Subtype subtype2 = new Subtype(NativeAdContent.ViewTag.OTHER, 1);
            OTHER = subtype2;
            Subtype[] subtypeArr = {subtype, subtype2};
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

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Subtype a() {
        return this.subtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop = (MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop) obj;
        return this.subtype == mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop.subtype && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop.a);
    }

    public final int hashCode() {
        Subtype subtype = this.subtype;
        int hashCode = (subtype == null ? 0 : subtype.hashCode()) * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedFeedScrollToTop(subtype=");
        sb.append(this.subtype);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.a, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop(Subtype subtype, String str) {
        this.subtype = subtype;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredNextFrom = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedFeedScrollToTop(Subtype subtype, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : subtype, (i & 2) != 0 ? null : str);
    }
}
