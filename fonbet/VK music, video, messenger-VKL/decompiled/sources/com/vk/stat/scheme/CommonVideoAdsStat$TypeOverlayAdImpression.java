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
public final class CommonVideoAdsStat$TypeOverlayAdImpression implements SchemeStat$TypeAction.b {
    public final transient String a;

    @pmi0("common_fields")
    private final Object commonFields;

    @pmi0("template_request_id")
    private final FilteredString filteredTemplateRequestId;

    /* compiled from: CommonVideoAdsStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoAdsStat$TypeOverlayAdImpression>, a9y<CommonVideoAdsStat$TypeOverlayAdImpression> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String C = fai.C(x9yVar, "template_request_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("common_fields");
            return new CommonVideoAdsStat$TypeOverlayAdImpression(C, (q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Object.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoAdsStat$TypeOverlayAdImpression commonVideoAdsStat$TypeOverlayAdImpression = (CommonVideoAdsStat$TypeOverlayAdImpression) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("template_request_id", commonVideoAdsStat$TypeOverlayAdImpression.a);
            x9yVar.o("common_fields", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdImpression.a()));
            return x9yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CommonVideoAdsStat$TypeOverlayAdImpression() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Object a() {
        return this.commonFields;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdImpression)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdImpression commonVideoAdsStat$TypeOverlayAdImpression = (CommonVideoAdsStat$TypeOverlayAdImpression) obj;
        return epx.f(this.a, commonVideoAdsStat$TypeOverlayAdImpression.a) && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdImpression.commonFields);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.commonFields;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdImpression(templateRequestId=");
        sb.append(this.a);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public CommonVideoAdsStat$TypeOverlayAdImpression(String str, Object obj) {
        this.a = str;
        this.commonFields = obj;
        FilteredString filteredString = new FilteredString(lhg.b(63));
        this.filteredTemplateRequestId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdImpression(String str, Object obj, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : obj);
    }
}
