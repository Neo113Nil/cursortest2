package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogShowFiltersButton extends CatalogButton {
    public static final Serializer.c<CatalogShowFiltersButton> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<CatalogFilterData> g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogShowFiltersButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogShowFiltersButton a(Serializer serializer) {
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
            if (H4 == null) {
                H4 = str;
            }
            ArrayList l = serializer.l(CatalogFilterData.class.getClassLoader());
            String str2 = str;
            String str3 = H3;
            String str4 = H4;
            String H5 = serializer.H();
            String H6 = serializer.H();
            if (H6 != null) {
                str2 = H6;
            }
            return new CatalogShowFiltersButton(H, H2, str3, str4, l, H5, str2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogShowFiltersButton[i];
        }
    }

    public CatalogShowFiltersButton(String str, String str2, String str3, String str4, List<CatalogFilterData> list, String str5, String str6) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
        this.i = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.f);
        serializer.W(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogShowFiltersButton)) {
            return false;
        }
        CatalogShowFiltersButton catalogShowFiltersButton = (CatalogShowFiltersButton) obj;
        return epx.f(this.c, catalogShowFiltersButton.c) && epx.f(this.d, catalogShowFiltersButton.d) && epx.f(this.e, catalogShowFiltersButton.e) && epx.f(this.f, catalogShowFiltersButton.f) && epx.f(this.g, catalogShowFiltersButton.g) && epx.f(this.h, catalogShowFiltersButton.h) && epx.f(this.i, catalogShowFiltersButton.i);
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
        List<CatalogFilterData> list = this.g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogShowFiltersButton(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", options=");
        sb.append(this.g);
        sb.append(", id=");
        sb.append(this.h);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
