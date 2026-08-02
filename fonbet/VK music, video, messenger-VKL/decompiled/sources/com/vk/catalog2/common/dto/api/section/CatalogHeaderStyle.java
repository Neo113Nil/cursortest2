package com.vk.catalog2.common.dto.api.section;

import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: CatalogSection.kt */
/* loaded from: classes16.dex */
public final class CatalogHeaderStyle extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogHeaderStyle> CREATOR = new b();
    public final TitleGradient b;

    /* compiled from: CatalogSection.kt */
    public static final class TitleGradient extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<TitleGradient> CREATOR = new b();
        public static final a f = new a();
        public final String b;
        public final String c;
        public final String d;
        public final int e;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<TitleGradient> {
            @Override // xsna.aay
            public final TitleGradient a(JSONObject jSONObject) {
                return new TitleGradient(jSONObject.optString("start_color"), jSONObject.optString("center_color"), jSONObject.optString("end_color"), jSONObject.optInt("angle"));
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<TitleGradient> {
            @Override // com.vk.core.serialize.Serializer.c
            public final TitleGradient a(Serializer serializer) {
                String H = serializer.H();
                if (H == null) {
                    H = "";
                }
                String H2 = serializer.H();
                if (H2 == null) {
                    H2 = "";
                }
                String H3 = serializer.H();
                return new TitleGradient(H, H2, H3 != null ? H3 : "", serializer.u());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TitleGradient[i];
            }
        }

        public TitleGradient(String str, String str2, String str3, int i) {
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleGradient)) {
                return false;
            }
            TitleGradient titleGradient = (TitleGradient) obj;
            return epx.f(this.b, titleGradient.b) && epx.f(this.c, titleGradient.c) && epx.f(this.d, titleGradient.d) && this.e == titleGradient.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TitleGradient(startColor=");
            sb.append(this.b);
            sb.append(", centerColor=");
            sb.append(this.c);
            sb.append(", endColor=");
            sb.append(this.d);
            sb.append(", angle=");
            return vu5.b(sb, this.e, ')');
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogHeaderStyle> {
        @Override // xsna.aay
        public final CatalogHeaderStyle a(JSONObject jSONObject) {
            Object a;
            TitleGradient.a aVar = TitleGradient.f;
            if (jSONObject.has("title_gradient")) {
                try {
                    a = aVar.a(jSONObject.getJSONObject("title_gradient"));
                } catch (JSONException e) {
                    L.i(e);
                }
                return new CatalogHeaderStyle((TitleGradient) a);
            }
            a = null;
            return new CatalogHeaderStyle((TitleGradient) a);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogHeaderStyle> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogHeaderStyle a(Serializer serializer) {
            return new CatalogHeaderStyle((TitleGradient) serializer.G(TitleGradient.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogHeaderStyle[i];
        }
    }

    static {
        new a();
    }

    public CatalogHeaderStyle(TitleGradient titleGradient) {
        this.b = titleGradient;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CatalogHeaderStyle) && epx.f(this.b, ((CatalogHeaderStyle) obj).b);
    }

    public final int hashCode() {
        TitleGradient titleGradient = this.b;
        if (titleGradient == null) {
            return 0;
        }
        return titleGradient.hashCode();
    }

    public final String toString() {
        return "CatalogHeaderStyle(gradient=" + this.b + ')';
    }
}
