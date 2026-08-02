package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.tn;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonAllFilters extends CatalogButton {
    public static final Serializer.c<CatalogButtonAllFilters> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonAllFilters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonAllFilters a(Serializer serializer) {
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
            if (H3 != null) {
                str = H3;
            }
            return new CatalogButtonAllFilters(H, H2, str, serializer.H(), serializer.n());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonAllFilters[i];
        }
    }

    public CatalogButtonAllFilters(String str, String str2, String str3, String str4, Boolean bool) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bool;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.J(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonAllFilters)) {
            return false;
        }
        CatalogButtonAllFilters catalogButtonAllFilters = (CatalogButtonAllFilters) obj;
        return epx.f(this.c, catalogButtonAllFilters.c) && epx.f(this.d, catalogButtonAllFilters.d) && epx.f(this.e, catalogButtonAllFilters.e) && epx.f(this.f, catalogButtonAllFilters.f) && epx.f(this.g, catalogButtonAllFilters.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonAllFilters(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", enabled=");
        return tn.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
