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
import xsna.uqi;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo {
    public final transient String a;

    @pmi0("ad_markup_begin_ts_msec")
    private final Integer adMarkupBeginTsMsec;

    @pmi0("ad_position")
    private final AdPosition adPosition;

    @pmi0("ad_request_num")
    private final int adRequestNum;

    @pmi0("vast_url")
    private final FilteredString filteredVastUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVideoVitrinaTvStat.kt */
    /* loaded from: classes5.dex */
    public static final class AdPosition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdPosition[] $VALUES;

        @pmi0("midroll")
        public static final AdPosition MIDROLL;

        @pmi0("pauseroll")
        public static final AdPosition PAUSEROLL;

        @pmi0("postroll")
        public static final AdPosition POSTROLL;

        @pmi0("preroll")
        public static final AdPosition PREROLL;

        static {
            AdPosition adPosition = new AdPosition("PREROLL", 0);
            PREROLL = adPosition;
            AdPosition adPosition2 = new AdPosition("MIDROLL", 1);
            MIDROLL = adPosition2;
            AdPosition adPosition3 = new AdPosition("POSTROLL", 2);
            POSTROLL = adPosition3;
            AdPosition adPosition4 = new AdPosition("PAUSEROLL", 3);
            PAUSEROLL = adPosition4;
            AdPosition[] adPositionArr = {adPosition, adPosition2, adPosition3, adPosition4};
            $VALUES = adPositionArr;
            $ENTRIES = new asp(adPositionArr);
        }

        private AdPosition(String str, int i) {
        }

        public static AdPosition valueOf(String str) {
            return (AdPosition) Enum.valueOf(AdPosition.class, str);
        }

        public static AdPosition[] values() {
            return (AdPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo>, a9y<CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo((AdPosition) dq.f(x9yVar, "ad_position", tru.a(), AdPosition.class), fai.p(x9yVar, "ad_request_num"), fai.s(x9yVar, "vast_url"), fai.A(x9yVar, "ad_markup_begin_ts_msec"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("ad_position", tru.a().toJson(commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.b()));
            x9yVar.n("ad_request_num", Integer.valueOf(commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.c()));
            x9yVar.o("vast_url", commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.a);
            x9yVar.n("ad_markup_begin_ts_msec", commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.a());
            return x9yVar;
        }
    }

    public CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo(AdPosition adPosition, int i, String str, Integer num) {
        this.adPosition = adPosition;
        this.adRequestNum = i;
        this.a = str;
        this.adMarkupBeginTsMsec = num;
        FilteredString filteredString = new FilteredString(lhg.b(2048));
        this.filteredVastUrl = filteredString;
        filteredString.a(str);
    }

    public final Integer a() {
        return this.adMarkupBeginTsMsec;
    }

    public final AdPosition b() {
        return this.adPosition;
    }

    public final int c() {
        return this.adRequestNum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo) obj;
        return this.adPosition == commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.adPosition && this.adRequestNum == commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.adRequestNum && epx.f(this.a, commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.a) && epx.f(this.adMarkupBeginTsMsec, commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.adMarkupBeginTsMsec);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.adRequestNum, this.adPosition.hashCode() * 31, 31), 31, this.a);
        Integer num = this.adMarkupBeginTsMsec;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VitrinaTvCommonAdInfo(adPosition=");
        sb.append(this.adPosition);
        sb.append(", adRequestNum=");
        sb.append(this.adRequestNum);
        sb.append(", vastUrl=");
        sb.append(this.a);
        sb.append(", adMarkupBeginTsMsec=");
        return uqi.b(sb, this.adMarkupBeginTsMsec, ')');
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo(AdPosition adPosition, int i, String str, Integer num, int i2, zcl zclVar) {
        this(adPosition, i, str, (i2 & 8) != 0 ? null : num);
    }
}
