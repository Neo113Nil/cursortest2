package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tn;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$SuperappItem {
    public final transient String a;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("uid")
    private final String uid;

    @pmi0("visibility")
    private final Integer visibility;

    @pmi0("widget_number")
    private final Integer widgetNumber;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$SuperappItem>, a9y<SchemeStat$SuperappItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$SuperappItem(fai.C(x9yVar, "track_code"), fai.C(x9yVar, "uid"), fai.A(x9yVar, "widget_number"), fai.A(x9yVar, "visibility"), fai.y(x9yVar, "is_promo"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$SuperappItem schemeStat$SuperappItem = (SchemeStat$SuperappItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("track_code", schemeStat$SuperappItem.a);
            x9yVar.o("uid", schemeStat$SuperappItem.a());
            x9yVar.n("widget_number", schemeStat$SuperappItem.c());
            x9yVar.n("visibility", schemeStat$SuperappItem.b());
            x9yVar.m(schemeStat$SuperappItem.d(), "is_promo");
            return x9yVar;
        }
    }

    public SchemeStat$SuperappItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final String a() {
        return this.uid;
    }

    public final Integer b() {
        return this.visibility;
    }

    public final Integer c() {
        return this.widgetNumber;
    }

    public final Boolean d() {
        return this.isPromo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$SuperappItem)) {
            return false;
        }
        SchemeStat$SuperappItem schemeStat$SuperappItem = (SchemeStat$SuperappItem) obj;
        return epx.f(this.a, schemeStat$SuperappItem.a) && epx.f(this.uid, schemeStat$SuperappItem.uid) && epx.f(this.widgetNumber, schemeStat$SuperappItem.widgetNumber) && epx.f(this.visibility, schemeStat$SuperappItem.visibility) && epx.f(this.isPromo, schemeStat$SuperappItem.isPromo);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uid;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.widgetNumber;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.visibility;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isPromo;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperappItem(trackCode=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", widgetNumber=");
        sb.append(this.widgetNumber);
        sb.append(", visibility=");
        sb.append(this.visibility);
        sb.append(", isPromo=");
        return tn.a(sb, this.isPromo, ')');
    }

    public SchemeStat$SuperappItem(String str, String str2, Integer num, Integer num2, Boolean bool) {
        this.a = str;
        this.uid = str2;
        this.widgetNumber = num;
        this.visibility = num2;
        this.isPromo = bool;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredTrackCode = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ SchemeStat$SuperappItem(String str, String str2, Integer num, Integer num2, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool);
    }
}
