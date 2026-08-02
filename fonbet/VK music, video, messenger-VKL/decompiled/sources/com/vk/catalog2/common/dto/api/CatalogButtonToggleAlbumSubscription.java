package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonToggleAlbumSubscription extends CatalogButton {
    public static final Serializer.c<CatalogButtonToggleAlbumSubscription> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonToggleAlbumSubscription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonToggleAlbumSubscription a(Serializer serializer) {
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
            if (H3 != null) {
                str = H3;
            }
            return new CatalogButtonToggleAlbumSubscription(H, H2, str, serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonToggleAlbumSubscription[i];
        }
    }

    public CatalogButtonToggleAlbumSubscription(String str, String str2, String str3, String str4, int i) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.S(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonToggleAlbumSubscription)) {
            return false;
        }
        CatalogButtonToggleAlbumSubscription catalogButtonToggleAlbumSubscription = (CatalogButtonToggleAlbumSubscription) obj;
        return epx.f(this.c, catalogButtonToggleAlbumSubscription.c) && epx.f(this.d, catalogButtonToggleAlbumSubscription.d) && epx.f(this.e, catalogButtonToggleAlbumSubscription.e) && epx.f(this.f, catalogButtonToggleAlbumSubscription.f) && this.g == catalogButtonToggleAlbumSubscription.g;
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
        return Integer.hashCode(this.g) + ((a2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonToggleAlbumSubscription(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", consumeReason=");
        sb.append(this.f);
        sb.append(", albumId=");
        return vu5.b(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
