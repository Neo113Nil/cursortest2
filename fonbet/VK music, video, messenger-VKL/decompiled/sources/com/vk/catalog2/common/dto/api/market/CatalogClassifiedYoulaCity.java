package com.vk.catalog2.common.dto.api.market;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ojp0;
import xsna.urd0;
import xsna.zjh0;

/* compiled from: CatalogClassifiedYoulaCity.kt */
/* loaded from: classes16.dex */
public final class CatalogClassifiedYoulaCity extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogClassifiedYoulaCity> CREATOR = new b();
    public static final a f = new a();
    public final String b;
    public final String c;
    public final double d;
    public final double e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogClassifiedYoulaCity> {
        @Override // xsna.aay
        public final CatalogClassifiedYoulaCity a(JSONObject jSONObject) {
            return new CatalogClassifiedYoulaCity(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogClassifiedYoulaCity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogClassifiedYoulaCity a(Serializer serializer) {
            return new CatalogClassifiedYoulaCity(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogClassifiedYoulaCity[i];
        }
    }

    public CatalogClassifiedYoulaCity(String str, String str2, double d, double d2) {
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = d2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.O(this.d);
        serializer.O(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogClassifiedYoulaCity)) {
            return false;
        }
        CatalogClassifiedYoulaCity catalogClassifiedYoulaCity = (CatalogClassifiedYoulaCity) obj;
        return epx.f(this.b, catalogClassifiedYoulaCity.b) && epx.f(this.c, catalogClassifiedYoulaCity.c) && Double.compare(this.d, catalogClassifiedYoulaCity.d) == 0 && Double.compare(this.e, catalogClassifiedYoulaCity.e) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + zjh0.b(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogClassifiedYoulaCity(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", latitude=");
        sb.append(this.d);
        sb.append(", longitude=");
        return ojp0.a(sb, this.e, ')');
    }

    public CatalogClassifiedYoulaCity(JSONObject jSONObject) {
        this(jSONObject.getString("id"), jSONObject.getString("name"), jSONObject.getDouble("latitude"), jSONObject.getDouble("longitude"));
    }

    public CatalogClassifiedYoulaCity(Serializer serializer) {
        this(serializer.H(), serializer.H(), serializer.r(), serializer.r());
    }
}
