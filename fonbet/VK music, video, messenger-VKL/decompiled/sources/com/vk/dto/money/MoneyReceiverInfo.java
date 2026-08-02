package com.vk.dto.money;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: MoneyReceiverInfo.kt */
/* loaded from: classes18.dex */
public final class MoneyReceiverInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MoneyReceiverInfo> CREATOR = new b();
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final int j;
    public final boolean k;
    public final String l;

    /* compiled from: MoneyReceiverInfo.kt */
    public static final class a {
        public static MoneyReceiverInfo a(JSONObject jSONObject) {
            return new MoneyReceiverInfo(jSONObject.optInt("min_amount"), jSONObject.optInt("max_amount"), jSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY), jSONObject.optBoolean("available"), jSONObject.optBoolean("requests_available"), jSONObject.optString("add_card_url"), jSONObject.optString("type"), jSONObject.optBoolean("enabled"), jSONObject.optInt("type_id"), jSONObject.optBoolean("vkpay_available"), jSONObject.optString("vk_pay_offer_uri"));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MoneyReceiverInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MoneyReceiverInfo a(Serializer serializer) {
            return new MoneyReceiverInfo(serializer.u(), serializer.u(), serializer.H(), serializer.m(), serializer.m(), serializer.H(), serializer.H(), serializer.m(), serializer.u(), serializer.m(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyReceiverInfo[i];
        }
    }

    public /* synthetic */ MoneyReceiverInfo(int i, int i2, String str, boolean z, boolean z2, String str2, String str3, boolean z3, int i3, boolean z4, String str4, int i4, zcl zclVar) {
        this(i, i2, str, z, z2, str2, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? false : z3, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? false : z4, (i4 & 1024) != 0 ? null : str4);
    }

    public static final void zb(JSONObject jSONObject) {
        a.a(jSONObject);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.L(this.i ? (byte) 1 : (byte) 0);
        serializer.S(this.j);
        serializer.L(this.k ? (byte) 1 : (byte) 0);
        serializer.j0(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyReceiverInfo)) {
            return false;
        }
        MoneyReceiverInfo moneyReceiverInfo = (MoneyReceiverInfo) obj;
        return this.b == moneyReceiverInfo.b && this.c == moneyReceiverInfo.c && epx.f(this.d, moneyReceiverInfo.d) && this.e == moneyReceiverInfo.e && this.f == moneyReceiverInfo.f && epx.f(this.g, moneyReceiverInfo.g) && epx.f(this.h, moneyReceiverInfo.h) && this.i == moneyReceiverInfo.i && this.j == moneyReceiverInfo.j && this.k == moneyReceiverInfo.k && epx.f(this.l, moneyReceiverInfo.l);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        String str = this.d;
        int b2 = qoy.b(qoy.b((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int hashCode = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int b3 = qoy.b(shy.a(this.j, qoy.b((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i), 31), 31, this.k);
        String str4 = this.l;
        return b3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneyReceiverInfo(minAmount=");
        sb.append(this.b);
        sb.append(", maxAmount=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", transferAvailable=");
        sb.append(this.e);
        sb.append(", requestsAvailable=");
        sb.append(this.f);
        sb.append(", addCardUrl=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(this.h);
        sb.append(", enabled=");
        sb.append(this.i);
        sb.append(", typeId=");
        sb.append(this.j);
        sb.append(", vkpayAvailable=");
        sb.append(this.k);
        sb.append(", vkPayOfferUrl=");
        return ho8.a(sb, this.l, ')');
    }

    public MoneyReceiverInfo(int i, int i2, String str, boolean z, boolean z2, String str2, String str3, boolean z3, int i3, boolean z4, String str4) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = z3;
        this.j = i3;
        this.k = z4;
        this.l = str4;
    }
}
