package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonExpandBlock extends CatalogButton {
    public static final Serializer.c<CatalogButtonExpandBlock> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonExpandBlock> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonExpandBlock a(Serializer serializer) {
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
            String H5 = serializer.H();
            if (H5 != null) {
                str = H5;
            }
            String str2 = H4;
            String str3 = str;
            return new CatalogButtonExpandBlock(H, H2, H3, str2, str3, serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonExpandBlock[i];
        }
    }

    public CatalogButtonExpandBlock(String str, String str2, String str3, String str4, String str5, int i) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.S(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonExpandBlock)) {
            return false;
        }
        CatalogButtonExpandBlock catalogButtonExpandBlock = (CatalogButtonExpandBlock) obj;
        return epx.f(this.c, catalogButtonExpandBlock.c) && epx.f(this.d, catalogButtonExpandBlock.d) && epx.f(this.e, catalogButtonExpandBlock.e) && epx.f(this.f, catalogButtonExpandBlock.f) && epx.f(this.g, catalogButtonExpandBlock.g) && this.h == catalogButtonExpandBlock.h;
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return Integer.hashCode(this.h) + urd0.a(urd0.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonExpandBlock(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", blockId=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", trackCode=");
        sb.append(this.g);
        sb.append(", collapsedShowAmount=");
        return vu5.b(sb, this.h, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
