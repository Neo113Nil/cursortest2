package com.vk.superapp.api.dto.identity;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class WebCountry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<WebCountry> CREATOR = new a();
    public int b;
    public String c;
    public final String d;
    public final String e;
    public final boolean f;

    public class a extends Serializer.c<WebCountry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebCountry a(Serializer serializer) {
            return new WebCountry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebCountry[i];
        }
    }

    public WebCountry() {
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
        return obj != null && getClass() == obj.getClass() && this.b == ((WebCountry) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.c;
    }

    public WebCountry(int i, String str, String str2, String str3, boolean z) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    public WebCountry(JSONObject jSONObject) {
        this.b = jSONObject.optInt("id", 0);
        this.c = jSONObject.optString("title", "");
    }

    public WebCountry(Serializer serializer) {
        this.b = serializer.u();
        this.c = serializer.H();
        this.d = serializer.H();
        this.e = serializer.H();
        this.f = serializer.m();
    }
}
