package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.uay;
import xsna.urd0;
import xsna.vu5;
import xsna.x9y;
import xsna.z8y;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo {
    public final transient String a;
    public final transient String b;
    public final transient String c;

    @pmi0("client_ad_sec")
    private final int clientAdSec;

    @pmi0("creative_num")
    private final int creativeNum;

    @pmi0("ad_creative_banner_id")
    private final FilteredString filteredAdCreativeBannerId;

    @pmi0("creative_src_type")
    private final FilteredString filteredCreativeSrcType;

    @pmi0("creative_src_url")
    private final FilteredString filteredCreativeSrcUrl;

    @pmi0("is_ad_pod")
    private final int isAdPod;

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo>, a9y<CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo(fai.p(x9yVar, "client_ad_sec"), fai.p(x9yVar, "creative_num"), fai.s(x9yVar, "ad_creative_banner_id"), fai.s(x9yVar, "creative_src_url"), fai.s(x9yVar, "creative_src_type"), fai.p(x9yVar, "is_ad_pod"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("client_ad_sec", Integer.valueOf(commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.a()));
            x9yVar.n("creative_num", Integer.valueOf(commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.b()));
            x9yVar.o("ad_creative_banner_id", commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.a);
            x9yVar.o("creative_src_url", commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.b);
            x9yVar.o("creative_src_type", commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.c);
            x9yVar.n("is_ad_pod", Integer.valueOf(commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.c()));
            return x9yVar;
        }
    }

    public CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo(int i, int i2, String str, String str2, String str3, int i3) {
        this.clientAdSec = i;
        this.creativeNum = i2;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.isAdPod = i3;
        FilteredString filteredString = new FilteredString(lhg.b(30));
        this.filteredAdCreativeBannerId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(512));
        this.filteredCreativeSrcUrl = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(50));
        this.filteredCreativeSrcType = filteredString3;
        filteredString.a(str);
        filteredString2.a(str2);
        filteredString3.a(str3);
    }

    public final int a() {
        return this.clientAdSec;
    }

    public final int b() {
        return this.creativeNum;
    }

    public final int c() {
        return this.isAdPod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo = (CommonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo) obj;
        return this.clientAdSec == commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.clientAdSec && this.creativeNum == commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.creativeNum && epx.f(this.a, commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.a) && epx.f(this.b, commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.b) && epx.f(this.c, commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.c) && this.isAdPod == commonVideoVitrinaTvStat$VitrinaTvCommonCreativeInfo.isAdPod;
    }

    public final int hashCode() {
        return Integer.hashCode(this.isAdPod) + urd0.a(urd0.a(urd0.a(shy.a(this.creativeNum, Integer.hashCode(this.clientAdSec) * 31, 31), 31, this.a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VitrinaTvCommonCreativeInfo(clientAdSec=");
        sb.append(this.clientAdSec);
        sb.append(", creativeNum=");
        sb.append(this.creativeNum);
        sb.append(", adCreativeBannerId=");
        sb.append(this.a);
        sb.append(", creativeSrcUrl=");
        sb.append(this.b);
        sb.append(", creativeSrcType=");
        sb.append(this.c);
        sb.append(", isAdPod=");
        return vu5.b(sb, this.isAdPod, ')');
    }
}
