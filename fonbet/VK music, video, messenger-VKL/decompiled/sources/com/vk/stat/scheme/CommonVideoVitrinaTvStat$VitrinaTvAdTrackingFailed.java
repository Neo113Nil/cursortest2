package com.vk.stat.scheme;

import com.google.gson.Gson;
import xsna.a9y;
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

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed {
    public final transient String a;

    @pmi0("ad_tracking_failed_error_count")
    private final Integer adTrackingFailedErrorCount;
    public final transient String b;
    public final transient String c;

    @pmi0("common_ad_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonAdInfo;

    @pmi0("creative_num")
    private final int creativeNum;

    @pmi0("creative_src_url")
    private final String creativeSrcUrl;

    @pmi0("ad_tracking_failed_http_status")
    private final FilteredString filteredAdTrackingFailedHttpStatus;

    @pmi0("ad_tracking_url")
    private final FilteredString filteredAdTrackingUrl;

    @pmi0("erid")
    private final FilteredString filteredErid;

    @pmi0("player_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo playerInfo;

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed>, a9y<CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String s = fai.s(x9yVar, "ad_tracking_url");
            String s2 = fai.s(x9yVar, "ad_tracking_failed_http_status");
            String s3 = fai.s(x9yVar, "erid");
            int p = fai.p(x9yVar, "creative_num");
            String s4 = fai.s(x9yVar, "creative_src_url");
            Integer A = fai.A(x9yVar, "ad_tracking_failed_error_count");
            Gson a = tru.a();
            b9y q = x9yVar.q("common_ad_info");
            Object obj = null;
            CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("player_info");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo.class);
            }
            return new CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed(s, s2, s3, p, s4, A, commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, (CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed = (CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("ad_tracking_url", commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.a);
            x9yVar.o("ad_tracking_failed_http_status", commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.b);
            x9yVar.o("erid", commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.c);
            x9yVar.n("creative_num", Integer.valueOf(commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.c()));
            x9yVar.o("creative_src_url", commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.d());
            x9yVar.n("ad_tracking_failed_error_count", commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.a());
            x9yVar.o("common_ad_info", tru.a().toJson(commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.b()));
            x9yVar.o("player_info", tru.a().toJson(commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.e()));
            return x9yVar;
        }
    }

    public CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed(String str, String str2, String str3, int i, String str4, Integer num, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.creativeNum = i;
        this.creativeSrcUrl = str4;
        this.adTrackingFailedErrorCount = num;
        this.commonAdInfo = commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo;
        this.playerInfo = commonVideoVitrinaTvStat$VitrinaTvPlayerInfo;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredAdTrackingUrl = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(3));
        this.filteredAdTrackingFailedHttpStatus = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(300));
        this.filteredErid = filteredString3;
        filteredString.a(str);
        filteredString2.a(str2);
        filteredString3.a(str3);
    }

    public final Integer a() {
        return this.adTrackingFailedErrorCount;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo b() {
        return this.commonAdInfo;
    }

    public final int c() {
        return this.creativeNum;
    }

    public final String d() {
        return this.creativeSrcUrl;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo e() {
        return this.playerInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed = (CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed) obj;
        return epx.f(this.a, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.a) && epx.f(this.b, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.b) && epx.f(this.c, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.c) && this.creativeNum == commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.creativeNum && epx.f(this.creativeSrcUrl, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.creativeSrcUrl) && epx.f(this.adTrackingFailedErrorCount, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.adTrackingFailedErrorCount) && epx.f(this.commonAdInfo, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.commonAdInfo) && epx.f(this.playerInfo, commonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed.playerInfo);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.creativeNum, urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.creativeSrcUrl);
        Integer num = this.adTrackingFailedErrorCount;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = this.commonAdInfo;
        int hashCode2 = (hashCode + (commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = this.playerInfo;
        return hashCode2 + (commonVideoVitrinaTvStat$VitrinaTvPlayerInfo != null ? commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.hashCode() : 0);
    }

    public final String toString() {
        return "VitrinaTvAdTrackingFailed(adTrackingUrl=" + this.a + ", adTrackingFailedHttpStatus=" + this.b + ", erid=" + this.c + ", creativeNum=" + this.creativeNum + ", creativeSrcUrl=" + this.creativeSrcUrl + ", adTrackingFailedErrorCount=" + this.adTrackingFailedErrorCount + ", commonAdInfo=" + this.commonAdInfo + ", playerInfo=" + this.playerInfo + ')';
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$VitrinaTvAdTrackingFailed(String str, String str2, String str3, int i, String str4, Integer num, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, int i2, zcl zclVar) {
        this(str, str2, str3, i, str4, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, (i2 & 128) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPlayerInfo);
    }
}
