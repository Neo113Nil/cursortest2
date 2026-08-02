package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenSearchFilters extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenSearchFilters> CREATOR = new a();
    public final String c;
    public final boolean d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenSearchFilters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenSearchFilters a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            boolean m = serializer.m();
            String I = serializer.I();
            return new CatalogButtonOpenSearchFilters(H, m, I != null ? I : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenSearchFilters[i];
        }
    }

    public CatalogButtonOpenSearchFilters(String str, boolean z, String str2) {
        super(null);
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenSearchFilters)) {
            return false;
        }
        CatalogButtonOpenSearchFilters catalogButtonOpenSearchFilters = (CatalogButtonOpenSearchFilters) obj;
        return epx.f(this.c, catalogButtonOpenSearchFilters.c) && this.d == catalogButtonOpenSearchFilters.d && epx.f(this.e, catalogButtonOpenSearchFilters.e);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenSearchFilters(type=");
        sb.append(this.c);
        sb.append(", isEnabled=");
        sb.append(this.d);
        sb.append(", trackCode=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return null;
    }
}
