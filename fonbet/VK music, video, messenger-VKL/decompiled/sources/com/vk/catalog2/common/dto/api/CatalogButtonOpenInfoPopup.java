package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.er;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonOpenInfoPopup extends CatalogButton {
    public static final Serializer.c<CatalogButtonOpenInfoPopup> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Image h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonOpenInfoPopup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonOpenInfoPopup a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            String H4 = serializer.H();
            return new CatalogButtonOpenInfoPopup(H, H2, H3, H4 != null ? H4 : "", serializer.I(), (Image) serializer.G(Image.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonOpenInfoPopup[i];
        }
    }

    public CatalogButtonOpenInfoPopup(String str, String str2, String str3, String str4, String str5, Image image) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.m0(this.g);
        serializer.i0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonOpenInfoPopup)) {
            return false;
        }
        CatalogButtonOpenInfoPopup catalogButtonOpenInfoPopup = (CatalogButtonOpenInfoPopup) obj;
        return epx.f(this.c, catalogButtonOpenInfoPopup.c) && epx.f(this.d, catalogButtonOpenInfoPopup.d) && epx.f(this.e, catalogButtonOpenInfoPopup.e) && epx.f(this.f, catalogButtonOpenInfoPopup.f) && epx.f(this.g, catalogButtonOpenInfoPopup.g) && epx.f(this.h, catalogButtonOpenInfoPopup.h);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.h;
        return hashCode + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonOpenInfoPopup(type=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", actionTitle=");
        sb.append(this.f);
        sb.append(", icon=");
        sb.append(this.g);
        sb.append(", images=");
        return er.d(sb, this.h, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return null;
    }
}
