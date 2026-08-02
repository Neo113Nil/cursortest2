package com.vk.dto.common;

import android.os.Parcel;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Currency;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bh10;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Price.kt */
/* loaded from: classes18.dex */
public final class Price implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<Price> CREATOR;
    public final long b;
    public final long c;
    public final Currency d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;

    /* compiled from: Price.kt */
    public static final class a {
        public static Price a(JSONObject jSONObject) throws JSONException {
            long optLong = jSONObject.optLong("amount");
            long optLong2 = jSONObject.optLong("old_amount");
            Serializer.c<Currency> cVar = Currency.CREATOR;
            return new Price(optLong, optLong2, Currency.a.a(jSONObject.getJSONObject(InAppPurchaseMetaData.KEY_CURRENCY)), jSONObject.optString("text"), jSONObject.optString("old_amount_text"), jSONObject.optInt("discount_rate"), jSONObject.optString("loyalty_amount"), jSONObject.optString("loyalty_amount_text"), jSONObject.optString("loyalty_amount_text_color"));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Price> {
        @Override // xsna.aay
        public final Price a(JSONObject jSONObject) {
            Serializer.c<Price> cVar = Price.CREATOR;
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Price> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Price a(Serializer serializer) {
            long w = serializer.w();
            long w2 = serializer.w();
            Serializer.StreamParcelable G = serializer.G(Currency.class.getClassLoader());
            com.vk.core.serialize.a.b(G, InAppPurchaseMetaData.KEY_CURRENCY);
            String H = serializer.H();
            com.vk.core.serialize.a.b(H, "amountText");
            return new Price(w, w2, (Currency) G, H, serializer.H(), serializer.u(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Price[i];
        }
    }

    static {
        new b();
        CREATOR = new c();
    }

    public Price(long j, long j2, Currency currency, String str, String str2, int i, String str3, String str4, String str5) {
        this.b = j;
        this.c = j2;
        this.d = currency;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.Y(this.c);
        serializer.i0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.S(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("amount", this.b);
        jSONObject.put("old_amount", this.c);
        jSONObject.put(InAppPurchaseMetaData.KEY_CURRENCY, this.d.e5());
        jSONObject.put("text", this.e);
        jSONObject.put("old_amount_text", this.f);
        jSONObject.put("discount_rate", this.g);
        jSONObject.put("loyalty_amount", this.h);
        jSONObject.put("loyalty_amount_text", this.i);
        jSONObject.put("loyalty_amount_text_color", this.j);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return this.b == price.b && this.c == price.c && epx.f(this.d, price.d) && epx.f(this.e, price.e) && epx.f(this.f, price.f) && this.g == price.g && epx.f(this.h, price.h) && epx.f(this.i, price.i) && epx.f(this.j, price.j);
    }

    public final int hashCode() {
        int a2 = urd0.a((this.d.hashCode() + bh10.a(Long.hashCode(this.b) * 31, 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        int a3 = shy.a(this.g, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.h;
        int hashCode = (a3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Price(amount=");
        sb.append(this.b);
        sb.append(", oldAmount=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", amountText=");
        sb.append(this.e);
        sb.append(", oldAmountText=");
        sb.append(this.f);
        sb.append(", discountRate=");
        sb.append(this.g);
        sb.append(", loyaltyAmount=");
        sb.append(this.h);
        sb.append(", loyaltyTextAmount=");
        sb.append(this.i);
        sb.append(", loyaltyTextColor=");
        return ho8.a(sb, this.j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ Price(long j, long j2, Currency currency, String str, String str2, int i, String str3, String str4, String str5, int i2, zcl zclVar) {
        this(j, j2, currency, str, str2, i, str3, str4, (i2 & 256) != 0 ? null : str5);
    }
}
