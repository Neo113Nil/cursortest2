package com.vk.catalog2.common.dto.api.block;

import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogArtistInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogArtistChip extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogArtistChip> CREATOR = new a();
    public final String b;
    public final String c;
    public final CatalogButton d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogArtistChip> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogArtistChip a(Serializer serializer) {
            return new CatalogArtistChip(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogArtistChip[i];
        }
    }

    public CatalogArtistChip(String str, String str2, CatalogButton catalogButton, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = catalogButton;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.e0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogArtistChip)) {
            return false;
        }
        CatalogArtistChip catalogArtistChip = (CatalogArtistChip) obj;
        return epx.f(this.b, catalogArtistChip.b) && epx.f(this.c, catalogArtistChip.c) && epx.f(this.d, catalogArtistChip.d) && epx.f(this.e, catalogArtistChip.e) && epx.f(this.f, catalogArtistChip.f) && epx.f(this.g, catalogArtistChip.g) && epx.f(this.h, catalogArtistChip.h);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CatalogButton catalogButton = this.d;
        int hashCode3 = (hashCode2 + (catalogButton == null ? 0 : catalogButton.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogArtistChip(title=");
        sb.append(this.b);
        sb.append(", iconName=");
        sb.append(this.c);
        sb.append(", button=");
        sb.append(this.d);
        sb.append(", trackCode=");
        sb.append(this.e);
        sb.append(", mixId=");
        sb.append(this.f);
        sb.append(", entityId=");
        sb.append(this.g);
        sb.append(", blockId=");
        return ho8.a(sb, this.h, ')');
    }

    public CatalogArtistChip(Serializer serializer) {
        this(serializer.H(), serializer.H(), (CatalogButton) serializer.A(CatalogButton.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H());
    }
}
