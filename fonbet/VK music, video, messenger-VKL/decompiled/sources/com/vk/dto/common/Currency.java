package com.vk.dto.common;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: Price.kt */
/* loaded from: classes18.dex */
public final class Currency implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<Currency> CREATOR;
    public final int b;
    public final String c;
    public final String d;

    /* compiled from: Price.kt */
    public static final class a {
        public static Currency a(JSONObject jSONObject) throws JSONException {
            return new Currency(jSONObject.optInt("id"), jSONObject.optString("name"), jSONObject.optString("title"));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Currency> {
        @Override // xsna.aay
        public final Currency a(JSONObject jSONObject) {
            Serializer.c<Currency> cVar = Currency.CREATOR;
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Currency> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Currency a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            com.vk.core.serialize.a.b(H, "currencyName");
            String H2 = serializer.H();
            com.vk.core.serialize.a.b(H2, "title");
            return new Currency(u, H, H2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Currency[i];
        }
    }

    static {
        new b();
        CREATOR = new c();
    }

    public Currency(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put("name", this.c);
        jSONObject.put("title", this.d);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) obj;
        return this.b == currency.b && epx.f(this.c, currency.c) && epx.f(this.d, currency.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Currency(currencyId=");
        sb.append(this.b);
        sb.append(", currencyName=");
        sb.append(this.c);
        sb.append(", symbol=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
