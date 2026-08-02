package com.vk.superapp.api.dto.identity;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.xgx0;

/* loaded from: classes6.dex */
public class WebCity extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebCity> CREATOR = new a();
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    public class a extends Serializer.c<WebCity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebCity a(Serializer serializer) {
            return new WebCity(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebCity[i];
        }
    }

    public WebCity() {
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.b == ((WebCity) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.c;
    }

    public WebCity(int i, String str, String str2, String str3, boolean z) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public WebCity(JSONObject jSONObject) {
        try {
            this.b = jSONObject.getInt("id");
            this.c = jSONObject.getString("title");
            this.d = jSONObject.optString("area");
            this.e = jSONObject.optString(TtmlNode.TAG_REGION);
            boolean z = true;
            if (jSONObject.optInt("important") != 1) {
                z = false;
            }
            this.f = z;
        } catch (Exception e) {
            xgx0.a.getClass();
            xgx0.g("Error parsing city " + e);
        }
    }

    public WebCity(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.H();
        this.d = serializer.H();
        this.e = serializer.H();
        this.f = serializer.m();
    }
}
