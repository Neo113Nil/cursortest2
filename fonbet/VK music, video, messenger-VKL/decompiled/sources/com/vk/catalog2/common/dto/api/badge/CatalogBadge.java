package com.vk.catalog2.common.dto.api.badge;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogBadge.kt */
/* loaded from: classes16.dex */
public final class CatalogBadge extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CatalogBadge> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogBadge> {
        @Override // xsna.aay
        public final CatalogBadge a(JSONObject jSONObject) {
            return new CatalogBadge(jSONObject.optString("text"), jSONObject.optString("type"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogBadge> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBadge a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new CatalogBadge(H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBadge[i];
        }
    }

    public CatalogBadge(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static CatalogBadge zb(CatalogBadge catalogBadge, String str, int i) {
        if ((i & 1) != 0) {
            str = catalogBadge.b;
        }
        String str2 = catalogBadge.c;
        catalogBadge.getClass();
        return new CatalogBadge(str, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", this.b);
        jSONObject.put("type", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBadge)) {
            return false;
        }
        CatalogBadge catalogBadge = (CatalogBadge) obj;
        return epx.f(this.b, catalogBadge.b) && epx.f(this.c, catalogBadge.c);
    }

    public final String getText() {
        return this.b;
    }

    public final String getType() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBadge(text=");
        sb.append(this.b);
        sb.append(", type=");
        return ho8.a(sb, this.c, ')');
    }

    public CatalogBadge(JSONObject jSONObject) {
        this(jSONObject.optString("text"), jSONObject.optString("type"));
    }
}
