package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.k73;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: CommonVideoAdsStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoAdsStat$TypeOverlayAdResponse implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;

    @pmi0("common_fields")
    private final Object commonFields;

    @pmi0("adtech_request_id")
    private final FilteredString filteredAdtechRequestId;

    @pmi0("template_request_id")
    private final FilteredString filteredTemplateRequestId;

    @pmi0("has_fill")
    private final boolean hasFill;

    /* compiled from: CommonVideoAdsStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoAdsStat$TypeOverlayAdResponse>, a9y<CommonVideoAdsStat$TypeOverlayAdResponse> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            boolean m = fai.m(x9yVar, "has_fill");
            String C = fai.C(x9yVar, "adtech_request_id");
            String C2 = fai.C(x9yVar, "template_request_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("common_fields");
            return new CommonVideoAdsStat$TypeOverlayAdResponse(m, C, C2, (q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Object.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoAdsStat$TypeOverlayAdResponse commonVideoAdsStat$TypeOverlayAdResponse = (CommonVideoAdsStat$TypeOverlayAdResponse) obj;
            x9y x9yVar = new x9y();
            x9yVar.m(Boolean.valueOf(commonVideoAdsStat$TypeOverlayAdResponse.b()), "has_fill");
            x9yVar.o("adtech_request_id", commonVideoAdsStat$TypeOverlayAdResponse.a);
            x9yVar.o("template_request_id", commonVideoAdsStat$TypeOverlayAdResponse.b);
            x9yVar.o("common_fields", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdResponse.a()));
            return x9yVar;
        }
    }

    public CommonVideoAdsStat$TypeOverlayAdResponse(boolean z, String str, String str2, Object obj) {
        this.hasFill = z;
        this.a = str;
        this.b = str2;
        this.commonFields = obj;
        FilteredString filteredString = new FilteredString(lhg.b(63));
        this.filteredAdtechRequestId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(63));
        this.filteredTemplateRequestId = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final Object a() {
        return this.commonFields;
    }

    public final boolean b() {
        return this.hasFill;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdResponse)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdResponse commonVideoAdsStat$TypeOverlayAdResponse = (CommonVideoAdsStat$TypeOverlayAdResponse) obj;
        return this.hasFill == commonVideoAdsStat$TypeOverlayAdResponse.hasFill && epx.f(this.a, commonVideoAdsStat$TypeOverlayAdResponse.a) && epx.f(this.b, commonVideoAdsStat$TypeOverlayAdResponse.b) && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdResponse.commonFields);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.hasFill) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.commonFields;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdResponse(hasFill=");
        sb.append(this.hasFill);
        sb.append(", adtechRequestId=");
        sb.append(this.a);
        sb.append(", templateRequestId=");
        sb.append(this.b);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdResponse(boolean z, String str, String str2, Object obj, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : obj);
    }
}
