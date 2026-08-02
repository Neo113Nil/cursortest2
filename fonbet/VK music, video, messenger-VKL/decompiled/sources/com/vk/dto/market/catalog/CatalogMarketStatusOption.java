package com.vk.dto.market.catalog;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogMarketFilter.kt */
/* loaded from: classes18.dex */
public final class CatalogMarketStatusOption extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogMarketStatusOption> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogMarketStatusOption> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogMarketStatusOption a(Serializer serializer) {
            return new CatalogMarketStatusOption(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogMarketStatusOption[i];
        }
    }

    public CatalogMarketStatusOption(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogMarketStatusOption)) {
            return false;
        }
        CatalogMarketStatusOption catalogMarketStatusOption = (CatalogMarketStatusOption) obj;
        return epx.f(this.b, catalogMarketStatusOption.b) && epx.f(this.c, catalogMarketStatusOption.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogMarketStatusOption(title=");
        sb.append(this.b);
        sb.append(", statusOptionId=");
        return ho8.a(sb, this.c, ')');
    }

    public CatalogMarketStatusOption(JSONObject jSONObject) {
        this(jSONObject.getString("title"), jSONObject.getString("id"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogMarketStatusOption(Serializer serializer) {
        this(r0, r3 != null ? r3 : "");
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}
