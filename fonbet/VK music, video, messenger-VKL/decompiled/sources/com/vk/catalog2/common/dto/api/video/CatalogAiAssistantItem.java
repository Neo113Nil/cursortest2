package com.vk.catalog2.common.dto.api.video;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: CatalogAiAssistantItem.kt */
/* loaded from: classes16.dex */
public final class CatalogAiAssistantItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<CatalogAiAssistantItem> CREATOR = new b();
    public static final a f = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogAiAssistantItem> {
        @Override // xsna.aay
        public final CatalogAiAssistantItem a(JSONObject jSONObject) {
            return new CatalogAiAssistantItem(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogAiAssistantItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogAiAssistantItem a(Serializer serializer) {
            return new CatalogAiAssistantItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogAiAssistantItem[i];
        }
    }

    public CatalogAiAssistantItem(int i, String str, String str2, String str3) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogAiAssistantItem)) {
            return false;
        }
        CatalogAiAssistantItem catalogAiAssistantItem = (CatalogAiAssistantItem) obj;
        return this.b == catalogAiAssistantItem.b && epx.f(this.c, catalogAiAssistantItem.c) && epx.f(this.d, catalogAiAssistantItem.d) && epx.f(this.e, catalogAiAssistantItem.e);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogAiAssistantItem(id=");
        sb.append(this.b);
        sb.append(", category=");
        sb.append(this.c);
        sb.append(", queryId=");
        sb.append(this.d);
        sb.append(", query=");
        return ho8.a(sb, this.e, ')');
    }

    public CatalogAiAssistantItem(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), jSONObject.optString("category"), jSONObject.optString("query_id"), jSONObject.optString("query"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatalogAiAssistantItem(Serializer serializer) {
        this(r0, r1, r3, r5 != null ? r5 : "");
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        H2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
    }
}
