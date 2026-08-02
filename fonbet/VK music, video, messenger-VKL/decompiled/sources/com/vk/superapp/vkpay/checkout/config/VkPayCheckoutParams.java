package com.vk.superapp.vkpay.checkout.config;

import android.os.Parcel;
import com.ironsource.B5;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: VkPayCheckoutParams.kt */
/* loaded from: classes6.dex */
public final class VkPayCheckoutParams implements Serializer.StreamParcelable {
    public static final Serializer.c<VkPayCheckoutParams> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final String m;
    public final String n;
    public final String o;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkPayCheckoutParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkPayCheckoutParams a(Serializer serializer) {
            return new VkPayCheckoutParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkPayCheckoutParams[i];
        }
    }

    public VkPayCheckoutParams(int i, String str, String str2, String str3, int i2, String str4, boolean z, String str5, boolean z2, String str6, boolean z3, String str7, String str8, String str9) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i2;
        this.g = str4;
        this.h = z;
        this.i = str5;
        this.j = z2;
        this.k = str6;
        this.l = z3;
        this.m = str7;
        this.n = str8;
        this.o = str9;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.j0(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.L(this.j ? (byte) 1 : (byte) 0);
        serializer.j0(this.k);
        serializer.L(this.l ? (byte) 1 : (byte) 0);
        serializer.j0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPayCheckoutParams)) {
            return false;
        }
        VkPayCheckoutParams vkPayCheckoutParams = (VkPayCheckoutParams) obj;
        return this.b == vkPayCheckoutParams.b && epx.f(this.c, vkPayCheckoutParams.c) && epx.f(this.d, vkPayCheckoutParams.d) && epx.f(this.e, vkPayCheckoutParams.e) && this.f == vkPayCheckoutParams.f && epx.f(this.g, vkPayCheckoutParams.g) && this.h == vkPayCheckoutParams.h && epx.f(this.i, vkPayCheckoutParams.i) && this.j == vkPayCheckoutParams.j && epx.f(this.k, vkPayCheckoutParams.k) && this.l == vkPayCheckoutParams.l && epx.f(this.m, vkPayCheckoutParams.m) && epx.f(this.n, vkPayCheckoutParams.n) && epx.f(this.o, vkPayCheckoutParams.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + urd0.a(urd0.a(qoy.b(urd0.a(qoy.b(urd0.a(qoy.b(urd0.a(shy.a(this.f, urd0.a(urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkPayCheckoutParams(merchantId=");
        sb.append(this.b);
        sb.append(", merchantSignature=");
        sb.append(this.c);
        sb.append(", merchantUserId=");
        sb.append(this.d);
        sb.append(", orderId=");
        sb.append(this.e);
        sb.append(", amount=");
        sb.append(this.f);
        sb.append(", currency=");
        sb.append(this.g);
        sb.append(", needHold=");
        sb.append(this.h);
        sb.append(", description=");
        sb.append(this.i);
        sb.append(", forceNativePay=");
        sb.append(this.j);
        sb.append(", environmentName=");
        sb.append(this.k);
        sb.append(", hideGooglePay=");
        sb.append(this.l);
        sb.append(", title=");
        sb.append(this.m);
        sb.append(", subtitle=");
        sb.append(this.n);
        sb.append(", extra=");
        return ho8.a(sb, this.o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkPayCheckoutParams(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, (r0 == null || (r0 = r0.toString()) == null) ? "" : r0);
        String jSONObject2;
        int optInt = jSONObject.optInt("merchant_id");
        String optString = jSONObject.optString("merchant_signature");
        String optString2 = jSONObject.optString("merchant_user_id");
        String optString3 = jSONObject.optString("order_id");
        int optInt2 = jSONObject.optInt("amount");
        String optString4 = jSONObject.optString(InAppPurchaseMetaData.KEY_CURRENCY);
        boolean optBoolean = jSONObject.optBoolean("need_hold");
        String optString5 = jSONObject.optString("description");
        String optString6 = jSONObject.optString("title");
        String optString7 = jSONObject.optString("subtitle");
        boolean optBoolean2 = jSONObject.optBoolean("force_native_pay");
        String optString8 = jSONObject.optString("environment", B5.t);
        boolean optBoolean3 = jSONObject.optBoolean("hide_native_pay");
        JSONObject optJSONObject = jSONObject.optJSONObject("extra");
    }

    public VkPayCheckoutParams(Serializer serializer) {
        this(serializer.u(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), serializer.H(), serializer.m(), serializer.H(), serializer.m(), serializer.H(), serializer.m(), serializer.H(), serializer.H(), serializer.H());
    }
}
