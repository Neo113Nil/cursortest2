package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenEditMarketAlbum;
import xsna.epx;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonMarketEditAlbum extends CatalogButton {
    public static final Serializer.c<CatalogButtonMarketEditAlbum> CREATOR = new a();
    public final String c;
    public final String d;
    public final String e;
    public final ActionOpenEditMarketAlbum f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonMarketEditAlbum> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonMarketEditAlbum a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonMarketEditAlbum(H, serializer.H(), serializer.H(), (ActionOpenEditMarketAlbum) serializer.G(Action.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonMarketEditAlbum[i];
        }
    }

    public CatalogButtonMarketEditAlbum(String str, String str2, String str3, ActionOpenEditMarketAlbum actionOpenEditMarketAlbum) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = actionOpenEditMarketAlbum;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonMarketEditAlbum)) {
            return false;
        }
        CatalogButtonMarketEditAlbum catalogButtonMarketEditAlbum = (CatalogButtonMarketEditAlbum) obj;
        return epx.f(this.c, catalogButtonMarketEditAlbum.c) && epx.f(this.d, catalogButtonMarketEditAlbum.d) && epx.f(this.e, catalogButtonMarketEditAlbum.e) && epx.f(this.f, catalogButtonMarketEditAlbum.f);
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
        ActionOpenEditMarketAlbum actionOpenEditMarketAlbum = this.f;
        return hashCode3 + (actionOpenEditMarketAlbum != null ? actionOpenEditMarketAlbum.hashCode() : 0);
    }

    public final String toString() {
        return "CatalogButtonMarketEditAlbum(type=" + this.c + ", hintId=" + this.d + ", title=" + this.e + ", action=" + this.f + ')';
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
