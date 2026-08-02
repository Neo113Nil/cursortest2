package com.vk.catalog2.common.dto.api;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;

/* compiled from: CatalogOnboardingInfo.kt */
/* loaded from: classes16.dex */
public final class CatalogOnboardingInfo extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<CatalogOnboardingInfo> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<CatalogOnboardingInfo> {
        @Override // xsna.aay
        public final CatalogOnboardingInfo a(JSONObject jSONObject) {
            return new CatalogOnboardingInfo(jSONObject.optString("url"), jSONObject.optString("type"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<CatalogOnboardingInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogOnboardingInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new CatalogOnboardingInfo(H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogOnboardingInfo[i];
        }
    }

    public CatalogOnboardingInfo(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public static CatalogOnboardingInfo zb(CatalogOnboardingInfo catalogOnboardingInfo) {
        String str = catalogOnboardingInfo.b;
        String str2 = catalogOnboardingInfo.c;
        catalogOnboardingInfo.getClass();
        return new CatalogOnboardingInfo(str, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", this.b);
        jSONObject.put("type", this.c);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogOnboardingInfo)) {
            return false;
        }
        CatalogOnboardingInfo catalogOnboardingInfo = (CatalogOnboardingInfo) obj;
        return epx.f(this.b, catalogOnboardingInfo.b) && epx.f(this.c, catalogOnboardingInfo.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogOnboardingInfo(url=");
        sb.append(this.b);
        sb.append(", type=");
        return ho8.a(sb, this.c, ')');
    }
}
