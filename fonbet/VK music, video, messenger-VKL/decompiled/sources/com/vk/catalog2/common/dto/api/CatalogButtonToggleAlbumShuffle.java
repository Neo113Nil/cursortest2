package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonToggleAlbumShuffle extends CatalogButton {
    public static final Serializer.c<CatalogButtonToggleAlbumShuffle> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonToggleAlbumShuffle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonToggleAlbumShuffle a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonToggleAlbumShuffle(H, serializer.H(), serializer.H(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonToggleAlbumShuffle[i];
        }
    }

    public /* synthetic */ CatalogButtonToggleAlbumShuffle(String str, String str2, String str3, long j, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, j);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.Y(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonToggleAlbumShuffle)) {
            return false;
        }
        CatalogButtonToggleAlbumShuffle catalogButtonToggleAlbumShuffle = (CatalogButtonToggleAlbumShuffle) obj;
        return epx.f(this.c, catalogButtonToggleAlbumShuffle.c) && epx.f(this.d, catalogButtonToggleAlbumShuffle.d) && epx.f(this.e, catalogButtonToggleAlbumShuffle.e) && this.f == catalogButtonToggleAlbumShuffle.f;
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
        return Long.hashCode(this.f) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonToggleAlbumShuffle(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", consumeReason=");
        sb.append(this.e);
        sb.append(", ownerId=");
        return vu5.a(')', this.f, sb);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }

    public CatalogButtonToggleAlbumShuffle(String str, String str2, String str3, long j) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
    }
}
