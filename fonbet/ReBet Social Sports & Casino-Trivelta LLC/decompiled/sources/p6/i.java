package p6;

import T7.A;
import T7.C1681v;
import T7.C1682w;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import g6.C4331C;
import h6.C4470F;
import h6.p;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f63074a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final String f63075b = i.class.getCanonicalName();

    /* renamed from: c, reason: collision with root package name */
    public static final C4470F f63076c = new C4470F(C4331C.l());

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public BigDecimal f63077a;

        /* renamed from: b, reason: collision with root package name */
        public Currency f63078b;

        /* renamed from: c, reason: collision with root package name */
        public Bundle f63079c;

        public a(BigDecimal purchaseAmount, Currency currency, Bundle param) {
            Intrinsics.checkNotNullParameter(purchaseAmount, "purchaseAmount");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(param, "param");
            this.f63077a = purchaseAmount;
            this.f63078b = currency;
            this.f63079c = param;
        }

        public final Currency a() {
            return this.f63078b;
        }

        public final Bundle b() {
            return this.f63079c;
        }

        public final BigDecimal c() {
            return this.f63077a;
        }
    }

    public static final boolean c() {
        C1682w f10 = A.f(C4331C.m());
        return f10 != null && C4331C.p() && f10.f();
    }

    public static final void d() {
        Context l10 = C4331C.l();
        String m10 = C4331C.m();
        if (C4331C.p()) {
            if (l10 instanceof Application) {
                p.f47798b.a((Application) l10, m10);
            } else {
                Log.w(f63075b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void e(String str, long j10) {
        Context l10 = C4331C.l();
        C1682w q10 = A.q(C4331C.m(), false);
        if (q10 == null || !q10.a() || j10 <= 0) {
            return;
        }
        C4470F c4470f = new C4470F(l10);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence("fb_aa_time_spent_view_name", str);
        c4470f.c("fb_aa_time_spent_on_view", j10, bundle);
    }

    public static final void f(String purchase, String skuDetails, boolean z10) {
        a a10;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(skuDetails, "skuDetails");
        if (c() && (a10 = f63074a.a(purchase, skuDetails)) != null) {
            if (z10) {
                C1681v c1681v = C1681v.f11207a;
                if (C1681v.d("app_events_if_auto_log_subs", C4331C.m(), false)) {
                    f63076c.i(n6.i.f57053a.m(skuDetails) ? "StartTrial" : "Subscribe", a10.c(), a10.a(), a10.b());
                    return;
                }
            }
            f63076c.j(a10.c(), a10.a(), a10.b());
        }
    }

    public final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    public final a b(String str, String str2, Map map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (Intrinsics.areEqual(optString, "subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String introductoryPriceCycles = jSONObject2.optString("introductoryPriceCycles");
                Intrinsics.checkNotNullExpressionValue(introductoryPriceCycles, "introductoryPriceCycles");
                if (introductoryPriceCycles.length() != 0) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", introductoryPriceCycles);
                }
            }
            for (Map.Entry entry : map.entrySet()) {
                bundle.putCharSequence((String) entry.getKey(), (String) entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e10) {
            Log.e(f63075b, "Error parsing in-app subscription data.", e10);
            return null;
        }
    }
}
