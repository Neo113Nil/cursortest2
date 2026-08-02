package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonPlayMix extends CatalogButton {
    public static final Serializer.c<CatalogButtonPlayMix> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final Image f;
    public final Image g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonPlayMix> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonPlayMix a(Serializer serializer) {
            String str;
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            Image image2 = (Image) serializer.G(Image.class.getClassLoader());
            str = "";
            String str2 = H3;
            String H4 = serializer.H();
            String H5 = serializer.H();
            if (H5 == null) {
                H5 = str;
            }
            String H6 = serializer.H();
            if (H6 == null) {
                H6 = str;
            }
            String str3 = H;
            String str4 = H5;
            String H7 = serializer.H();
            String H8 = serializer.H();
            if (H8 == null) {
                H8 = str;
            }
            String H9 = serializer.H();
            return new CatalogButtonPlayMix(str3, H2, str2, image, image2, H4, str4, H6, H7, H8, H9 != null ? H9 : "", serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonPlayMix[i];
        }
    }

    public CatalogButtonPlayMix(String str, String str2, String str3, Image image, Image image2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = image;
        this.g = image2;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = str11;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonPlayMix)) {
            return false;
        }
        CatalogButtonPlayMix catalogButtonPlayMix = (CatalogButtonPlayMix) obj;
        return epx.f(this.c, catalogButtonPlayMix.c) && epx.f(this.d, catalogButtonPlayMix.d) && epx.f(this.e, catalogButtonPlayMix.e) && epx.f(this.f, catalogButtonPlayMix.f) && epx.f(this.g, catalogButtonPlayMix.g) && epx.f(this.h, catalogButtonPlayMix.h) && epx.f(this.i, catalogButtonPlayMix.i) && epx.f(this.j, catalogButtonPlayMix.j) && epx.f(this.k, catalogButtonPlayMix.k) && epx.f(this.l, catalogButtonPlayMix.l) && epx.f(this.m, catalogButtonPlayMix.m) && epx.f(this.n, catalogButtonPlayMix.n) && epx.f(this.o, catalogButtonPlayMix.o);
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
        Image image = this.f;
        int hashCode4 = (hashCode3 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.g;
        int hashCode5 = (hashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str3 = this.h;
        int a2 = urd0.a(urd0.a((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31, this.j);
        String str4 = this.k;
        int a3 = urd0.a((a2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l);
        String str5 = this.m;
        int hashCode6 = (a3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonPlayMix(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", refLayoutName=");
        sb.append(this.e);
        sb.append(", images=");
        sb.append(this.f);
        sb.append(", foregroundImages=");
        sb.append(this.g);
        sb.append(", entityId=");
        sb.append(this.h);
        sb.append(", id=");
        sb.append(this.i);
        sb.append(", mixId=");
        sb.append(this.j);
        sb.append(", mixOptions=");
        sb.append(this.k);
        sb.append(", title=");
        sb.append(this.l);
        sb.append(", description=");
        sb.append(this.m);
        sb.append(", style=");
        sb.append(this.n);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.o, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
