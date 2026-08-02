package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonUpdateNonActiveGroups extends CatalogButton {
    public static final Serializer.c<CatalogButtonUpdateNonActiveGroups> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final List<CatalogFilterData> f;
    public final List<String> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonUpdateNonActiveGroups> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonUpdateNonActiveGroups a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonUpdateNonActiveGroups(H, serializer.H(), serializer.H(), serializer.l(CatalogFilterData.class.getClassLoader()), com.vk.core.serialize.a.a(serializer));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonUpdateNonActiveGroups[i];
        }
    }

    public CatalogButtonUpdateNonActiveGroups(String str, String str2, String str3, List<CatalogFilterData> list, List<String> list2) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
        this.g = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.W(this.f);
        serializer.l0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonUpdateNonActiveGroups)) {
            return false;
        }
        CatalogButtonUpdateNonActiveGroups catalogButtonUpdateNonActiveGroups = (CatalogButtonUpdateNonActiveGroups) obj;
        return epx.f(this.c, catalogButtonUpdateNonActiveGroups.c) && epx.f(this.d, catalogButtonUpdateNonActiveGroups.d) && epx.f(this.e, catalogButtonUpdateNonActiveGroups.e) && epx.f(this.f, catalogButtonUpdateNonActiveGroups.f) && epx.f(this.g, catalogButtonUpdateNonActiveGroups.g);
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
        List<CatalogFilterData> list = this.f;
        return this.g.hashCode() + ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonUpdateNonActiveGroups(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", consumeReason=");
        sb.append(this.e);
        sb.append(", options=");
        sb.append(this.f);
        sb.append(", blocksIds=");
        return ms9.a(')', sb, this.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
