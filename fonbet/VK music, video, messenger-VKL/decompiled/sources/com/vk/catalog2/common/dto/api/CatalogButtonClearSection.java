package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonClearSection extends CatalogButton {
    public static final Serializer.c<CatalogButtonClearSection> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonClearSection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonClearSection a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonClearSection(H, serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonClearSection[i];
        }
    }

    public CatalogButtonClearSection(String str, String str2, String str3, String str4) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonClearSection)) {
            return false;
        }
        CatalogButtonClearSection catalogButtonClearSection = (CatalogButtonClearSection) obj;
        return epx.f(this.c, catalogButtonClearSection.c) && epx.f(this.d, catalogButtonClearSection.d) && epx.f(this.e, catalogButtonClearSection.e) && epx.f(this.f, catalogButtonClearSection.f);
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
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonClearSection(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", consumeReason=");
        sb.append(this.e);
        sb.append(", syncWithEvent=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
