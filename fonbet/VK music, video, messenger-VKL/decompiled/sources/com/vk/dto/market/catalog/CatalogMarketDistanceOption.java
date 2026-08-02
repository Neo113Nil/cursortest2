package com.vk.dto.market.catalog;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.vu5;

/* compiled from: CatalogMarketFilter.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketDistanceOption extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketDistanceOption> CREATOR = new a();
    public final String b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogMarketDistanceOption> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketDistanceOption a(Serializer serializer) {
            return new CatalogMarketDistanceOption(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketDistanceOption[i];
        }
    }

    public CatalogMarketDistanceOption(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketDistanceOption)) {
            return false;
        }
        CatalogMarketDistanceOption catalogMarketDistanceOption = (CatalogMarketDistanceOption) obj;
        return epx.f(this.b, catalogMarketDistanceOption.b) && this.c == catalogMarketDistanceOption.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMarketDistanceOption(title=");
        sb.append(this.b);
        sb.append(", value=");
        return vu5.b(sb, this.c, ')');
    }

    public CatalogMarketDistanceOption(JSONObject jSONObject) {
        this(jSONObject.getString("title"), jSONObject.getInt("value"));
    }

    public CatalogMarketDistanceOption(Serializer serializer) {
        this(serializer.H(), serializer.u());
    }
}
