package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
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
public final class CommonVideoAdsStat$TypeOverlayAdClick implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("common_fields")
    private final Object commonFields;

    @pmi0("template_request_id")
    private final FilteredString filteredTemplateRequestId;

    @pmi0("target_id")
    private final Long targetId;

    /* compiled from: CommonVideoAdsStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoAdsStat$TypeOverlayAdClick>, a9y<CommonVideoAdsStat$TypeOverlayAdClick> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            String C = fai.C(x9yVar, "template_request_id");
            Long B = fai.B(x9yVar, "target_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("common_fields");
            return new CommonVideoAdsStat$TypeOverlayAdClick(C, B, (q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Object.class));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick = (CommonVideoAdsStat$TypeOverlayAdClick) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("template_request_id", commonVideoAdsStat$TypeOverlayAdClick.a);
            x9yVar.n("target_id", commonVideoAdsStat$TypeOverlayAdClick.b());
            x9yVar.o("common_fields", tru.a().toJson(commonVideoAdsStat$TypeOverlayAdClick.a()));
            return x9yVar;
        }
    }

    public CommonVideoAdsStat$TypeOverlayAdClick() {
        this(null, null, null, 7, null);
    }

    public final Object a() {
        return this.commonFields;
    }

    public final Long b() {
        return this.targetId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoAdsStat$TypeOverlayAdClick)) {
            return false;
        }
        CommonVideoAdsStat$TypeOverlayAdClick commonVideoAdsStat$TypeOverlayAdClick = (CommonVideoAdsStat$TypeOverlayAdClick) obj;
        return epx.f(this.a, commonVideoAdsStat$TypeOverlayAdClick.a) && epx.f(this.targetId, commonVideoAdsStat$TypeOverlayAdClick.targetId) && epx.f(this.commonFields, commonVideoAdsStat$TypeOverlayAdClick.commonFields);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.targetId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Object obj = this.commonFields;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeOverlayAdClick(templateRequestId=");
        sb.append(this.a);
        sb.append(", targetId=");
        sb.append(this.targetId);
        sb.append(", commonFields=");
        return k73.c(sb, this.commonFields, ')');
    }

    public CommonVideoAdsStat$TypeOverlayAdClick(String str, Long l, Object obj) {
        this.a = str;
        this.targetId = l;
        this.commonFields = obj;
        FilteredString filteredString = new FilteredString(lhg.b(63));
        this.filteredTemplateRequestId = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ CommonVideoAdsStat$TypeOverlayAdClick(String str, Long l, Object obj, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : obj);
    }
}
