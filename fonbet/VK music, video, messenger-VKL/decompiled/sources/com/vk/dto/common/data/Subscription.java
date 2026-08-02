package com.vk.dto.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.PaymentType;
import com.vk.dto.common.data.MerchantRestriction;
import com.vk.dto.photo.Photo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.epx;
import xsna.mge0;
import xsna.z230;

/* loaded from: classes18.dex */
public class Subscription extends Serializer.StreamParcelableAdapter implements mge0 {
    public static final Serializer.c<Subscription> CREATOR = new a();
    public String A;
    public int B;

    @Nullable
    public final Image C;
    public final boolean D;
    public final String b;
    public final int c;
    public String d;
    public String e;
    public double f;
    public final int g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Photo m;
    public final String n;
    public final String o;
    public final String p;

    @Nullable
    public final MerchantRestriction q;
    public final String r;
    public boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final int x;
    public String y;
    public final String z;

    public class a extends Serializer.c<Subscription> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Subscription a(@NonNull Serializer serializer) {
            return new Subscription(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Subscription[i];
        }
    }

    public Subscription(JSONObject jSONObject) throws JSONException {
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = 0;
        JSONObject jSONObject2 = jSONObject.getJSONObject("product");
        this.g = jSONObject2.getInt("id");
        this.i = jSONObject2.optString("title");
        this.j = jSONObject2.optString("subtitle");
        this.l = jSONObject.optString("description");
        this.b = jSONObject.optString("merchant_product_id");
        this.c = jSONObject.optInt("price");
        this.d = jSONObject.optString("price_str");
        this.t = jSONObject.optInt("is_trial", 0) != 0;
        this.u = jSONObject2.optInt("billing_retry_period", 0) != 0;
        this.k = jSONObject2.optString("platform");
        this.h = jSONObject2.optLong("expires_date");
        this.n = jSONObject.optString("management_url");
        this.o = jSONObject.optString("terms_url");
        this.p = jSONObject2.optString("merchant_title");
        this.s = jSONObject2.optInt("purchased", 0) != 0;
        this.v = jSONObject.optString("no_inapp_url");
        this.w = jSONObject.optInt("can_purchase", 1) != 0;
        this.r = jSONObject.optString("no_purchase_reason");
        this.x = jSONObject.optInt("trial_period", 0);
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.matches("photo_[0-9]+")) {
                int parseInt = Integer.parseInt(next.substring(6));
                arrayList.add(new ImageSize(jSONObject.getString(next), parseInt, parseInt, Boolean.FALSE, ImageSize.b.c(parseInt, parseInt)));
            }
        }
        this.m = new Photo(new Image(arrayList));
        if (jSONObject.has("merchant_restrictions")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("merchant_restrictions");
            Serializer.c<MerchantRestriction> cVar = MerchantRestriction.CREATOR;
            this.q = MerchantRestriction.a.a(jSONObject3);
        } else {
            this.q = null;
        }
        this.z = jSONObject2.optString("store_product_id");
        if (jSONObject.has("unavailable_placeholder")) {
            this.C = new Image(jSONObject.getJSONArray("unavailable_placeholder"));
        }
        this.D = jSONObject.optBoolean("can_show_alt_pay_method", false);
    }

    public static String zb(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt == ' ' || charAt == 160) && z) {
                z2 = true;
            } else if (charAt != '0' && z && !z2) {
                return str;
            }
            if (charAt == ',' || charAt == '.') {
                z = true;
            }
            if (!z || z2) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    @Override // xsna.mge0
    public final String L4() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.S(this.g);
        serializer.Y(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.l);
        serializer.i0(this.m);
        serializer.j0(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
        serializer.L(this.s ? (byte) 1 : (byte) 0);
        serializer.j0(this.v);
        serializer.L(this.w ? (byte) 1 : (byte) 0);
        serializer.j0(this.r);
        serializer.j0(this.e);
        serializer.O(this.f);
        this.q.O7(serializer);
        serializer.j0(this.k);
        serializer.S(this.x);
        serializer.j0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A);
        serializer.S(this.B);
        serializer.i0(this.C);
        serializer.L(this.D ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.mge0
    public final String R8() {
        return this.z;
    }

    @Override // xsna.mge0
    public final String W6() {
        StringBuilder sb = new StringBuilder();
        sb.append(z230.b.c());
        sb.append(",3,");
        sb.append(this.g);
        sb.append(",0");
        if (!this.y.isEmpty()) {
            sb.append(StringUtils.COMMA);
            sb.append(this.y);
        }
        return sb.toString();
    }

    @Override // xsna.mge0
    public final void cb(JSONObject jSONObject) {
        this.d = zb(jSONObject.optString("price"));
        this.f = jSONObject.optDouble("price_amount_micros") / 1000000.0d;
        this.e = jSONObject.optString("priceCurrencyCode");
        this.A = zb(jSONObject.optString("introductoryPrice"));
        String optString = jSONObject.optString("introductoryPricePeriod");
        int optInt = jSONObject.optInt("introductoryPriceCycles", 1);
        int i = 0;
        if (optString != null && !optString.isEmpty()) {
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (i2 < optString.length()) {
                char charAt = optString.charAt(i2);
                if (charAt == 'T') {
                    z = false;
                } else if (charAt == 'P') {
                    z = true;
                } else if (charAt >= '0' && charAt <= '9' && z) {
                    int i4 = i2 + 1;
                    while (true) {
                        if (!((charAt >= '0' && charAt <= '9') || charAt == '.' || charAt == ',') || i4 >= optString.length()) {
                            break;
                        }
                        int i5 = i4 + 1;
                        char charAt2 = optString.charAt(i4);
                        i4 = i5;
                        charAt = charAt2;
                    }
                    int i6 = i4 - 1;
                    i3 = (int) ((Float.parseFloat(optString.substring(i2, i6)) * (charAt == 'Y' ? 360 : charAt == 'M' ? 30 : charAt == 'W' ? 7 : charAt == 'D' ? 1 : 0)) + i3);
                    i2 = i6;
                }
                i2++;
            }
            i = i3;
        }
        this.B = i * optInt;
    }

    @Override // xsna.mge0
    public final boolean d1() {
        return false;
    }

    @Override // xsna.mge0
    public final int getId() {
        return this.g;
    }

    @Override // xsna.mge0
    public final String getType() {
        return BillingClient.FeatureType.SUBSCRIPTIONS;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // xsna.mge0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ma() {
        boolean z;
        Double d;
        if (!this.w) {
            return false;
        }
        MerchantRestriction merchantRestriction = this.q;
        if (merchantRestriction != null) {
            String str = this.e;
            double d2 = this.f;
            Map<String, Double> map = merchantRestriction.b;
            if (!map.isEmpty() && (str == null || !map.containsKey(str) || ((d = map.get(str)) != null && !epx.b(d, ConnectivityTracker.DEFAULT_UPLINK_BITRATE) && d2 > d.doubleValue()))) {
                z = false;
                return !z;
            }
        }
        z = true;
        if (!z) {
        }
    }

    @Override // xsna.mge0
    public final String n() {
        return null;
    }

    @Override // xsna.mge0
    public final PaymentType u3() {
        return PaymentType.Subs;
    }

    public Subscription(Serializer serializer) {
        this.y = "";
        this.z = "";
        this.A = "";
        this.B = 0;
        this.b = serializer.H();
        this.c = serializer.u();
        this.d = serializer.H();
        this.g = serializer.u();
        this.h = serializer.w();
        this.i = serializer.H();
        this.j = serializer.H();
        this.l = serializer.H();
        this.m = (Photo) serializer.G(Photo.class.getClassLoader());
        this.n = serializer.H();
        this.o = serializer.H();
        this.p = serializer.H();
        this.s = serializer.m();
        this.v = serializer.H();
        this.w = serializer.m();
        this.r = serializer.H();
        this.e = serializer.H();
        this.f = serializer.r();
        this.q = (MerchantRestriction) serializer.G(MerchantRestriction.class.getClassLoader());
        this.k = serializer.H();
        this.x = serializer.u();
        this.y = serializer.H();
        this.z = serializer.H();
        this.A = serializer.H();
        this.B = serializer.u();
        this.C = (Image) serializer.G(Image.class.getClassLoader());
        this.D = serializer.m();
    }
}
