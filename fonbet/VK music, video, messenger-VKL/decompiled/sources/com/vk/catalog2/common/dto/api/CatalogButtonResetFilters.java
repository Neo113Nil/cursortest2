package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.tn;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonResetFilters extends CatalogButton {
    public static final Serializer.c<CatalogButtonResetFilters> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final Boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonResetFilters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonResetFilters a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            String H3 = serializer.H();
            return new CatalogButtonResetFilters(H, H2, H3 != null ? H3 : "", serializer.n());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonResetFilters[i];
        }
    }

    public CatalogButtonResetFilters(String str, String str2, String str3, Boolean bool) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = bool;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.J(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonResetFilters)) {
            return false;
        }
        CatalogButtonResetFilters catalogButtonResetFilters = (CatalogButtonResetFilters) obj;
        return epx.f(this.c, catalogButtonResetFilters.c) && epx.f(this.d, catalogButtonResetFilters.d) && epx.f(this.e, catalogButtonResetFilters.e) && epx.f(this.f, catalogButtonResetFilters.f);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonResetFilters(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", enabled=");
        return tn.a(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
