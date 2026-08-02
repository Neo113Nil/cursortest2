package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;
import xsna.ho8;

/* compiled from: OrdAdvertiser.kt */
/* loaded from: classes18.dex */
public final class OrdAdvertiser extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<OrdAdvertiser> CREATOR = new b();
    public static final a d = new a();
    public final String b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<OrdAdvertiser> {
        @Override // xsna.aay
        public final OrdAdvertiser a(JSONObject jSONObject) {
            try {
                String optString = jSONObject.optString("url");
                bpn0 bpn0Var = cqm0.a;
                String str = "";
                if (optString == null) {
                    optString = "";
                }
                String optString2 = jSONObject.optString("er_id");
                if (optString2 != null) {
                    str = optString2;
                }
                return new OrdAdvertiser(optString, str);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<OrdAdvertiser> {
        @Override // com.vk.core.serialize.Serializer.c
        public final OrdAdvertiser a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new OrdAdvertiser(H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrdAdvertiser[i];
        }
    }

    public OrdAdvertiser(String str, String str2) {
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
        if (!(obj instanceof OrdAdvertiser)) {
            return false;
        }
        OrdAdvertiser ordAdvertiser = (OrdAdvertiser) obj;
        return epx.f(this.b, ordAdvertiser.b) && epx.f(this.c, ordAdvertiser.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrdAdvertiser(url=");
        sb.append(this.b);
        sb.append(", erId=");
        return ho8.a(sb, this.c, ')');
    }
}
