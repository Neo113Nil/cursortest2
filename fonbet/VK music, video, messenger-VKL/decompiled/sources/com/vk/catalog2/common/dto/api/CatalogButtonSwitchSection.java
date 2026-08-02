package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonSwitchSection extends CatalogButton {
    public static final Serializer.c<CatalogButtonSwitchSection> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Image j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonSwitchSection> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonSwitchSection a(Serializer serializer) {
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
            return new CatalogButtonSwitchSection(H, H2, H3, str, serializer.H(), serializer.H(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonSwitchSection[i];
        }
    }

    public /* synthetic */ CatalogButtonSwitchSection(String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image, String str8, String str9, String str10, String str11, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : image, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11);
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
        serializer.i0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonSwitchSection)) {
            return false;
        }
        CatalogButtonSwitchSection catalogButtonSwitchSection = (CatalogButtonSwitchSection) obj;
        return epx.f(this.c, catalogButtonSwitchSection.c) && epx.f(this.d, catalogButtonSwitchSection.d) && epx.f(this.e, catalogButtonSwitchSection.e) && epx.f(this.f, catalogButtonSwitchSection.f) && epx.f(this.g, catalogButtonSwitchSection.g) && epx.f(this.h, catalogButtonSwitchSection.h) && epx.f(this.i, catalogButtonSwitchSection.i) && epx.f(this.j, catalogButtonSwitchSection.j) && epx.f(this.k, catalogButtonSwitchSection.k) && epx.f(this.l, catalogButtonSwitchSection.l) && epx.f(this.m, catalogButtonSwitchSection.m) && epx.f(this.n, catalogButtonSwitchSection.n);
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
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Image image = this.j;
        int hashCode5 = (hashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        String str5 = this.k;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.l;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.m;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.n;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonSwitchSection(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", sectionId=");
        sb.append(this.f);
        sb.append(", replacementToBlockId=");
        sb.append(this.g);
        sb.append(", consumeReason=");
        sb.append(this.h);
        sb.append(", clickEventType=");
        sb.append(this.i);
        sb.append(", images=");
        sb.append(this.j);
        sb.append(", style=");
        sb.append(this.k);
        sb.append(", actionUrl=");
        sb.append(this.l);
        sb.append(", trackCode=");
        sb.append(this.m);
        sb.append(", icon=");
        return ho8.a(sb, this.n, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonSwitchSection(String str, String str2, String str3, String str4, String str5, String str6, String str7, Image image, String str8, String str9, String str10, String str11) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = image;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = str11;
    }
}
