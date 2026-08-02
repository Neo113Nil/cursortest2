package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.urd0;
import xsna.vu5;
import xsna.w9y;

/* compiled from: CatalogText.kt */
/* loaded from: classes16.dex */
public final class CatalogText extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CatalogText> CREATOR = new b();
    public static final a f = new a();
    public final String b;
    public final String c;
    public final String d;
    public final int e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogText> {
        @Override // xsna.aay
        public final CatalogText a(JSONObject jSONObject) {
            return new CatalogText(jSONObject.optString("id"), jSONObject.optString("header"), jSONObject.optString("text"), jSONObject.optInt("collapsed_lines"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogText> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogText a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            return new CatalogText(H, H2, H3 != null ? H3 : "", serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogText[i];
        }
    }

    public CatalogText(String str, String str2, String str3, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.S(this.e);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "id");
        w9yVar.e(this.d, "text");
        w9yVar.e(this.c, "header");
        w9yVar.c(Integer.valueOf(this.e), "collapsed_lines");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogText)) {
            return false;
        }
        CatalogText catalogText = (CatalogText) obj;
        return epx.f(this.b, catalogText.b) && epx.f(this.c, catalogText.c) && epx.f(this.d, catalogText.d) && this.e == catalogText.e;
    }

    public final String getText() {
        return this.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogText(id=");
        sb.append(this.b);
        sb.append(", header=");
        sb.append(this.c);
        sb.append(", text=");
        sb.append(this.d);
        sb.append(", collapsedLines=");
        return vu5.b(sb, this.e, ')');
    }
}
