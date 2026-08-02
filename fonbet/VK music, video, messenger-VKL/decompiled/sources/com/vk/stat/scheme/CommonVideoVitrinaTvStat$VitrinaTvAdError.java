package com.vk.stat.scheme;

import com.google.gson.Gson;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
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
public final class CommonVideoVitrinaTvStat$VitrinaTvAdError {
    public final transient String a;
    public final transient String b;

    @pmi0("common_ad_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonAdInfo;

    @pmi0("common_creative_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonCreativeInfo;

    @pmi0("error")
    private final FilteredString filteredError;

    @pmi0("error_adv")
    private final FilteredString filteredErrorAdv;

    @pmi0("player_info")
    private final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo playerInfo;

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$VitrinaTvAdError>, a9y<CommonVideoVitrinaTvStat$VitrinaTvAdError> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String s = fai.s(x9yVar, "error");
            String s2 = fai.s(x9yVar, "error_adv");
            Gson a = tru.a();
            b9y q = x9yVar.q("common_creative_info");
            Object obj = null;
            CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("common_ad_info");
            CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("player_info");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo.class);
            }
            return new CommonVideoVitrinaTvStat$VitrinaTvAdError(s, s2, commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, (CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo) obj);
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$VitrinaTvAdError commonVideoVitrinaTvStat$VitrinaTvAdError = (CommonVideoVitrinaTvStat$VitrinaTvAdError) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("error", commonVideoVitrinaTvStat$VitrinaTvAdError.a);
            x9yVar.o("error_adv", commonVideoVitrinaTvStat$VitrinaTvAdError.b);
            x9yVar.o("common_creative_info", tru.a().toJson(commonVideoVitrinaTvStat$VitrinaTvAdError.b()));
            x9yVar.o("common_ad_info", tru.a().toJson(commonVideoVitrinaTvStat$VitrinaTvAdError.a()));
            x9yVar.o("player_info", tru.a().toJson(commonVideoVitrinaTvStat$VitrinaTvAdError.c()));
            return x9yVar;
        }
    }

    public CommonVideoVitrinaTvStat$VitrinaTvAdError(String str, String str2, CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo) {
        this.a = str;
        this.b = str2;
        this.commonCreativeInfo = commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo;
        this.commonAdInfo = commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo;
        this.playerInfo = commonVideoVitrinaTvStat$VitrinaTvPlayerInfo;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredError = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(512));
        this.filteredErrorAdv = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo a() {
        return this.commonAdInfo;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo b() {
        return this.commonCreativeInfo;
    }

    public final CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo c() {
        return this.playerInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvAdError)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvAdError commonVideoVitrinaTvStat$VitrinaTvAdError = (CommonVideoVitrinaTvStat$VitrinaTvAdError) obj;
        return epx.f(this.a, commonVideoVitrinaTvStat$VitrinaTvAdError.a) && epx.f(this.b, commonVideoVitrinaTvStat$VitrinaTvAdError.b) && epx.f(this.commonCreativeInfo, commonVideoVitrinaTvStat$VitrinaTvAdError.commonCreativeInfo) && epx.f(this.commonAdInfo, commonVideoVitrinaTvStat$VitrinaTvAdError.commonAdInfo) && epx.f(this.playerInfo, commonVideoVitrinaTvStat$VitrinaTvAdError.playerInfo);
    }

    public final int hashCode() {
        int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
        CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo = this.commonCreativeInfo;
        int hashCode = (a + (commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo = this.commonAdInfo;
        int hashCode2 = (hashCode + (commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo == null ? 0 : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo.hashCode())) * 31;
        CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo = this.playerInfo;
        return hashCode2 + (commonVideoVitrinaTvStat$VitrinaTvPlayerInfo != null ? commonVideoVitrinaTvStat$VitrinaTvPlayerInfo.hashCode() : 0);
    }

    public final String toString() {
        return "VitrinaTvAdError(error=" + this.a + ", errorAdv=" + this.b + ", commonCreativeInfo=" + this.commonCreativeInfo + ", commonAdInfo=" + this.commonAdInfo + ", playerInfo=" + this.playerInfo + ')';
    }

    public /* synthetic */ CommonVideoVitrinaTvStat$VitrinaTvAdError(String str, String str2, CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, CommonVideoVitrinaTvStat$VitrinaTvCommonAdInfo commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, CommonVideoVitrinaTvStat$VitrinaTvPlayerInfo commonVideoVitrinaTvStat$VitrinaTvPlayerInfo, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo, (i & 8) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvCommonAdInfo, (i & 16) != 0 ? null : commonVideoVitrinaTvStat$VitrinaTvPlayerInfo);
    }
}
