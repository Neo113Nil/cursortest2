package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonCreateVideoAlbum extends CatalogButton {
    public static final Serializer.c<CatalogButtonCreateVideoAlbum> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final UserId f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonCreateVideoAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonCreateVideoAlbum a(Serializer serializer) {
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
            return new CatalogButtonCreateVideoAlbum(H, H2, str, (UserId) serializer.A(UserId.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonCreateVideoAlbum[i];
        }
    }

    public CatalogButtonCreateVideoAlbum(String str, String str2, String str3, UserId userId, String str4) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = userId;
        this.g = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.e0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonCreateVideoAlbum)) {
            return false;
        }
        CatalogButtonCreateVideoAlbum catalogButtonCreateVideoAlbum = (CatalogButtonCreateVideoAlbum) obj;
        return epx.f(this.c, catalogButtonCreateVideoAlbum.c) && epx.f(this.d, catalogButtonCreateVideoAlbum.d) && epx.f(this.e, catalogButtonCreateVideoAlbum.e) && epx.f(this.f, catalogButtonCreateVideoAlbum.f) && epx.f(this.g, catalogButtonCreateVideoAlbum.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int a2 = bh10.a(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f.b);
        String str2 = this.g;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonCreateVideoAlbum(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", ownerId=");
        sb.append(this.f);
        sb.append(", consumeReason=");
        return ho8.a(sb, this.g, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
