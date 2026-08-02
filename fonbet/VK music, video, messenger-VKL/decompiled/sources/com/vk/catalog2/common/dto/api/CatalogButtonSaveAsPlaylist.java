package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonSaveAsPlaylist extends CatalogButton {
    public static final Serializer.c<CatalogButtonSaveAsPlaylist> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final UserId g;
    public final String h;
    public final String i;
    public final String j;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonSaveAsPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonSaveAsPlaylist a(Serializer serializer) {
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
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            String H5 = serializer.H();
            if (H5 != null) {
                str = H5;
            }
            String str2 = str;
            return new CatalogButtonSaveAsPlaylist(H, H2, H3, H4, userId, str2, serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonSaveAsPlaylist[i];
        }
    }

    public CatalogButtonSaveAsPlaylist(String str, String str2, String str3, String str4, UserId userId, String str5, String str6, String str7) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = userId;
        this.h = str5;
        this.i = str6;
        this.j = str7;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.e0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonSaveAsPlaylist)) {
            return false;
        }
        CatalogButtonSaveAsPlaylist catalogButtonSaveAsPlaylist = (CatalogButtonSaveAsPlaylist) obj;
        return epx.f(this.c, catalogButtonSaveAsPlaylist.c) && epx.f(this.d, catalogButtonSaveAsPlaylist.d) && epx.f(this.e, catalogButtonSaveAsPlaylist.e) && epx.f(this.f, catalogButtonSaveAsPlaylist.f) && epx.f(this.g, catalogButtonSaveAsPlaylist.g) && epx.f(this.h, catalogButtonSaveAsPlaylist.h) && epx.f(this.i, catalogButtonSaveAsPlaylist.i) && epx.f(this.j, catalogButtonSaveAsPlaylist.j);
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
        int a3 = urd0.a(bh10.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g.b), 31, this.h);
        String str3 = this.i;
        int hashCode2 = (a3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonSaveAsPlaylist(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", musicTracksPageId=");
        sb.append(this.f);
        sb.append(", ownerId=");
        sb.append(this.g);
        sb.append(", artistId=");
        sb.append(this.h);
        sb.append(", consumeReason=");
        sb.append(this.i);
        sb.append(", searchType=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
