package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenSearchTab extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenSearchTab> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenSearchTab> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenSearchTab a(Serializer serializer) {
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
            return new CatalogButtonOpenSearchTab(H, H2, H3, str, serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenSearchTab[i];
        }
    }

    public CatalogButtonOpenSearchTab(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenSearchTab)) {
            return false;
        }
        CatalogButtonOpenSearchTab catalogButtonOpenSearchTab = (CatalogButtonOpenSearchTab) obj;
        return epx.f(this.c, catalogButtonOpenSearchTab.c) && epx.f(this.d, catalogButtonOpenSearchTab.d) && epx.f(this.e, catalogButtonOpenSearchTab.e) && epx.f(this.f, catalogButtonOpenSearchTab.f) && epx.f(this.g, catalogButtonOpenSearchTab.g) && epx.f(this.h, catalogButtonOpenSearchTab.h) && epx.f(this.i, catalogButtonOpenSearchTab.i);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode2 = (a2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenSearchTab(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", tabId=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", icon=");
        sb.append(this.h);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
