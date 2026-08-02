package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;

/* compiled from: CommonVideoVitrinaTvStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad {
    public final transient String a;

    @pmi0("api_url")
    private final FilteredString filteredApiUrl;

    @pmi0("socdem_result")
    private final String socdemResult;

    /* compiled from: CommonVideoVitrinaTvStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad>, a9y<CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad(fai.s(x9yVar, "api_url"), fai.s(x9yVar, "socdem_result"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad commonVideoVitrinaTvStat$VitrinaTvSocdemLoad = (CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("api_url", commonVideoVitrinaTvStat$VitrinaTvSocdemLoad.a);
            x9yVar.o("socdem_result", commonVideoVitrinaTvStat$VitrinaTvSocdemLoad.a());
            return x9yVar;
        }
    }

    public CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad(String str, String str2) {
        this.a = str;
        this.socdemResult = str2;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredApiUrl = filteredString;
        filteredString.a(str);
    }

    public final String a() {
        return this.socdemResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad)) {
            return false;
        }
        CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad commonVideoVitrinaTvStat$VitrinaTvSocdemLoad = (CommonVideoVitrinaTvStat$VitrinaTvSocdemLoad) obj;
        return epx.f(this.a, commonVideoVitrinaTvStat$VitrinaTvSocdemLoad.a) && epx.f(this.socdemResult, commonVideoVitrinaTvStat$VitrinaTvSocdemLoad.socdemResult);
    }

    public final int hashCode() {
        return this.socdemResult.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VitrinaTvSocdemLoad(apiUrl=");
        sb.append(this.a);
        sb.append(", socdemResult=");
        return ho8.a(sb, this.socdemResult, ')');
    }
}
