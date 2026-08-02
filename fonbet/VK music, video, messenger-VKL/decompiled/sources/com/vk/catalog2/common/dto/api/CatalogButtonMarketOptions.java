package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.shy;

/* compiled from: CatalogButton.kt */
/* loaded from: classes16.dex */
public final class CatalogButtonMarketOptions extends CatalogButton {
    public static final Serializer.c<CatalogButtonMarketOptions> CREATOR = new a();
    public final String c;
    public final String d;
    public final UserId e;
    public final int f;
    public final List<String> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogButtonMarketOptions> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogButtonMarketOptions a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new CatalogButtonMarketOptions(H, serializer.H(), (UserId) serializer.A(UserId.class.getClassLoader()), serializer.u(), com.vk.core.serialize.a.a(serializer));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogButtonMarketOptions[i];
        }
    }

    public CatalogButtonMarketOptions(String str, String str2, UserId userId, int i, List<String> list) {
        super(null);
        this.c = str;
        this.d = str2;
        this.e = userId;
        this.f = i;
        this.g = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.e0(this.e);
        serializer.S(this.f);
        serializer.l0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogButtonMarketOptions)) {
            return false;
        }
        CatalogButtonMarketOptions catalogButtonMarketOptions = (CatalogButtonMarketOptions) obj;
        return epx.f(this.c, catalogButtonMarketOptions.c) && epx.f(this.d, catalogButtonMarketOptions.d) && epx.f(this.e, catalogButtonMarketOptions.e) && this.f == catalogButtonMarketOptions.f && epx.f(this.g, catalogButtonMarketOptions.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return this.g.hashCode() + shy.a(this.f, bh10.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogButtonMarketOptions(type=");
        sb.append(this.c);
        sb.append(", hintId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", albumId=");
        sb.append(this.f);
        sb.append(", marketAlbumOptions=");
        return ms9.a(')', sb, this.g);
    }

    @Override // com.vk.catalog2.common.dto.api.CatalogButton
    public final String zb() {
        return this.d;
    }
}
