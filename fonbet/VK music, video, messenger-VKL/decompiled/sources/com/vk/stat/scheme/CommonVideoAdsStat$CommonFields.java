package com.vk.stat.scheme;

import com.google.gson.Gson;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoAdsStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoAdsStat$CommonFields {
    public final transient String a;
    public final transient String b;

    @pmi0("banner_type")
    private final BannerType bannerType;

    @pmi0("trace_id")
    private final FilteredString filteredTraceId;

    @pmi0("vsid")
    private final FilteredString filteredVsid;

    @pmi0("pad_id")
    private final String padId;

    @pmi0("ts")
    private final int ts;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class BannerType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerType[] $VALUES;

        @pmi0("freebet")
        public static final BannerType FREEBET;

        @pmi0("odds")
        public static final BannerType ODDS;

        static {
            BannerType bannerType = new BannerType("FREEBET", 0);
            FREEBET = bannerType;
            BannerType bannerType2 = new BannerType("ODDS", 1);
            ODDS = bannerType2;
            BannerType[] bannerTypeArr = {bannerType, bannerType2};
            $VALUES = bannerTypeArr;
            $ENTRIES = new asp(bannerTypeArr);
        }

        private BannerType(String str, int i) {
        }

        public static BannerType valueOf(String str) {
            return (BannerType) Enum.valueOf(BannerType.class, str);
        }

        public static BannerType[] values() {
            return (BannerType[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonVideoAdsStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoAdsStat$CommonFields>, a9y<CommonVideoAdsStat$CommonFields> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String s = fai.s(x9yVar, "trace_id");
            int p = fai.p(x9yVar, "ts");
            String s2 = fai.s(x9yVar, "vsid");
            String C = fai.C(x9yVar, "pad_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("banner_type");
            return new CommonVideoAdsStat$CommonFields(s, p, s2, C, (BannerType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), BannerType.class)));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoAdsStat$CommonFields commonVideoAdsStat$CommonFields = (CommonVideoAdsStat$CommonFields) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("trace_id", commonVideoAdsStat$CommonFields.a);
            x9yVar.n("ts", Integer.valueOf(commonVideoAdsStat$CommonFields.d()));
            x9yVar.o("vsid", commonVideoAdsStat$CommonFields.b);
            x9yVar.o("pad_id", commonVideoAdsStat$CommonFields.c());
            x9yVar.o("banner_type", tru.a().toJson(commonVideoAdsStat$CommonFields.b()));
            return x9yVar;
        }
    }

    public CommonVideoAdsStat$CommonFields(String str, int i, String str2, String str3, BannerType bannerType) {
        this.a = str;
        this.ts = i;
        this.b = str2;
        this.padId = str3;
        this.bannerType = bannerType;
        FilteredString filteredString = new FilteredString(lhg.b(63));
        this.filteredTraceId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(14));
        this.filteredVsid = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public static CommonVideoAdsStat$CommonFields a(CommonVideoAdsStat$CommonFields commonVideoAdsStat$CommonFields, int i, String str, BannerType bannerType, int i2) {
        String str2 = commonVideoAdsStat$CommonFields.a;
        if ((i2 & 2) != 0) {
            i = commonVideoAdsStat$CommonFields.ts;
        }
        int i3 = i;
        String str3 = commonVideoAdsStat$CommonFields.b;
        if ((i2 & 8) != 0) {
            str = commonVideoAdsStat$CommonFields.padId;
        }
        String str4 = str;
        if ((i2 & 16) != 0) {
            bannerType = commonVideoAdsStat$CommonFields.bannerType;
        }
        commonVideoAdsStat$CommonFields.getClass();
        return new CommonVideoAdsStat$CommonFields(str2, i3, str3, str4, bannerType);
    }

    public final BannerType b() {
        return this.bannerType;
    }

    public final String c() {
        return this.padId;
    }

    public final int d() {
        return this.ts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$CommonFields)) {
            return false;
        }
        CommonVideoAdsStat$CommonFields commonVideoAdsStat$CommonFields = (CommonVideoAdsStat$CommonFields) obj;
        return epx.f(this.a, commonVideoAdsStat$CommonFields.a) && this.ts == commonVideoAdsStat$CommonFields.ts && epx.f(this.b, commonVideoAdsStat$CommonFields.b) && epx.f(this.padId, commonVideoAdsStat$CommonFields.padId) && this.bannerType == commonVideoAdsStat$CommonFields.bannerType;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.ts, this.a.hashCode() * 31, 31), 31, this.b);
        String str = this.padId;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        BannerType bannerType = this.bannerType;
        return hashCode + (bannerType != null ? bannerType.hashCode() : 0);
    }

    public final String toString() {
        return "CommonFields(traceId=" + this.a + ", ts=" + this.ts + ", vsid=" + this.b + ", padId=" + this.padId + ", bannerType=" + this.bannerType + ')';
    }

    public /* synthetic */ CommonVideoAdsStat$CommonFields(String str, int i, String str2, String str3, BannerType bannerType, int i2, zcl zclVar) {
        this(str, i, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : bannerType);
    }
}
