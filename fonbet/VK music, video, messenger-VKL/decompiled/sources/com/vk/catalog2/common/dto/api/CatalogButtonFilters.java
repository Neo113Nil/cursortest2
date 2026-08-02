package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonFilters extends CatalogButton {
    public static final Serializer.c<CatalogButtonFilters> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<CatalogFilterData> g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonFilters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonFilters a(Serializer serializer) {
            String str;
            String H = serializer.H();
            if (H == null) {
                H = "";
                str = H;
            } else {
                str = "";
            }
            String H2 = serializer.H();
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = str;
            }
            String H4 = serializer.H();
            if (H4 != null) {
                str = H4;
            }
            return new CatalogButtonFilters(H, H2, H3, str, serializer.l(CatalogFilterData.class.getClassLoader()), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonFilters[i];
        }
    }

    public /* synthetic */ CatalogButtonFilters(String str, String str2, String str3, String str4, List list, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, str3, str4, list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.W(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonFilters)) {
            return false;
        }
        CatalogButtonFilters catalogButtonFilters = (CatalogButtonFilters) obj;
        return epx.f(this.c, catalogButtonFilters.c) && epx.f(this.d, catalogButtonFilters.d) && epx.f(this.e, catalogButtonFilters.e) && epx.f(this.f, catalogButtonFilters.f) && epx.f(this.g, catalogButtonFilters.g) && epx.f(this.h, catalogButtonFilters.h) && epx.f(this.i, catalogButtonFilters.i);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        List<CatalogFilterData> list = this.g;
        int hashCode2 = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonFilters(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", filters=");
        sb.append(this.g);
        sb.append(", optionsTitle=");
        sb.append(this.h);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonFilters(String str, String str2, String str3, String str4, List<CatalogFilterData> list, String str5, String str6) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
        this.i = str6;
    }
}
