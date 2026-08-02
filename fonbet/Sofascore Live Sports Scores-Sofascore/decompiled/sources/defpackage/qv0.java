package defpackage;

import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.facebook.appevents.k;
import com.facebook.appevents.l;
import com.facebook.appevents.p;
import com.facebook.appevents.q;
import com.facebook.internal.o;
import com.facebook.internal.s;
import com.facebook.internal.u;
import com.facebook.internal.x;
import com.facebook.k0;
import com.facebook.w;
import com.moloco.sdk.internal.publisher.h0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class qv0 {
    public static final k a = new k(w.a(), 1);

    public static pv0 a(String str, Bundle bundle, p pVar, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str.equals(BillingClient.ProductType.SUBS)) {
            Map map = p.b;
            String bool = Boolean.toString(jSONObject.optBoolean("autoRenewing", false));
            bool.getClass();
            h0.n("fb_iap_subs_auto_renewing", bool, bundle, pVar);
            String optString = jSONObject2.optString("subscriptionPeriod");
            optString.getClass();
            h0.n("fb_iap_subs_period", optString, bundle, pVar);
            String optString2 = jSONObject2.optString("freeTrialPeriod");
            optString2.getClass();
            h0.n("fb_free_trial_period", optString2, bundle, pVar);
            String optString3 = jSONObject2.optString("introductoryPriceCycles");
            optString3.getClass();
            if (optString3.length() > 0) {
                h0.n("fb_intro_price_cycles", optString3, bundle, pVar);
            }
            String optString4 = jSONObject2.optString("introductoryPricePeriod");
            optString4.getClass();
            if (optString4.length() > 0) {
                h0.n("fb_intro_period", optString4, bundle, pVar);
            }
            String optString5 = jSONObject2.optString("introductoryPriceAmountMicros");
            optString5.getClass();
            if (optString5.length() > 0) {
                h0.n("fb_intro_price_amount_micros", optString5, bundle, pVar);
            }
        }
        BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
        Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
        currency.getClass();
        return new pv0(bigDecimal, currency, bundle, pVar);
    }

    public static ArrayList b(String str, Bundle bundle, p pVar, JSONObject jSONObject) {
        if (!str.equals(BillingClient.ProductType.SUBS)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("oneTimePurchaseOfferDetails");
            if (jSONObject2 == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("priceCurrencyCode"));
            currency.getClass();
            return b.l(new pv0(bigDecimal, currency, bundle, pVar));
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "subscriptionOfferDetails";
        JSONArray jSONArray = jSONObject.getJSONArray("subscriptionOfferDetails");
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject3 = jSONObject.getJSONArray(str2).getJSONObject(i);
            if (jSONObject3 == null) {
                return null;
            }
            Bundle bundle2 = new Bundle(bundle);
            p pVar2 = new p();
            LinkedHashMap linkedHashMap = pVar.a;
            for (q qVar : linkedHashMap.keySet()) {
                Map map = (Map) linkedHashMap.get(qVar);
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        String str4 = str2;
                        int i2 = length;
                        Object obj = map.get(str3);
                        if (obj != null) {
                            pVar2.a(qVar, str3, obj);
                        }
                        str2 = str4;
                        length = i2;
                    }
                }
            }
            String str5 = str2;
            int i3 = length;
            String string = jSONObject3.getString("basePlanId");
            Map map2 = p.b;
            string.getClass();
            h0.n("fb_iap_base_plan", string, bundle2, pVar2);
            JSONObject jSONObject4 = jSONObject3.getJSONArray("pricingPhases").getJSONObject(r5.length() - 1);
            if (jSONObject4 == null) {
                return null;
            }
            String optString = jSONObject4.optString("billingPeriod");
            optString.getClass();
            h0.n("fb_iap_subs_period", optString, bundle2, pVar2);
            if (!jSONObject4.has("recurrenceMode") || jSONObject4.getInt("recurrenceMode") == 3) {
                h0.n("fb_iap_subs_auto_renewing", "false", bundle2, pVar2);
            } else {
                h0.n("fb_iap_subs_auto_renewing", "true", bundle2, pVar2);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject4.getLong("priceAmountMicros") / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject4.getString("priceCurrencyCode"));
            currency2.getClass();
            arrayList.add(new pv0(bigDecimal2, currency2, bundle2, pVar2));
            i++;
            str2 = str5;
            length = i3;
        }
        return arrayList;
    }

    public static final boolean c() {
        u b = x.b(w.b());
        return b != null && k0.c() && b.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116 A[Catch: JSONException | Exception -> 0x012b, JSONException | Exception -> 0x012b, TryCatch #3 {JSONException | Exception -> 0x012b, blocks: (B:5:0x0017, B:16:0x0046, B:17:0x003d, B:22:0x0049, B:26:0x00d4, B:26:0x00d4, B:27:0x00db, B:27:0x00db, B:28:0x00e3, B:28:0x00e3, B:30:0x00e9, B:30:0x00e9, B:32:0x0101, B:32:0x0101, B:34:0x0109, B:34:0x0109, B:129:0x0116, B:129:0x0116, B:131:0x011e, B:131:0x011e, B:134:0x0126, B:134:0x0126, B:139:0x00ce, B:139:0x00ce), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4 A[Catch: JSONException | Exception -> 0x012b, JSONException | Exception -> 0x012b, TryCatch #3 {JSONException | Exception -> 0x012b, blocks: (B:5:0x0017, B:16:0x0046, B:17:0x003d, B:22:0x0049, B:26:0x00d4, B:26:0x00d4, B:27:0x00db, B:27:0x00db, B:28:0x00e3, B:28:0x00e3, B:30:0x00e9, B:30:0x00e9, B:32:0x0101, B:32:0x0101, B:34:0x0109, B:34:0x0109, B:129:0x0116, B:129:0x0116, B:131:0x011e, B:131:0x011e, B:134:0x0126, B:134:0x0126, B:139:0x00ce, B:139:0x00ce), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9 A[Catch: JSONException | Exception -> 0x012b, JSONException | Exception -> 0x012b, LOOP:0: B:28:0x00e3->B:30:0x00e9, LOOP_END, TryCatch #3 {JSONException | Exception -> 0x012b, blocks: (B:5:0x0017, B:16:0x0046, B:17:0x003d, B:22:0x0049, B:26:0x00d4, B:26:0x00d4, B:27:0x00db, B:27:0x00db, B:28:0x00e3, B:28:0x00e3, B:30:0x00e9, B:30:0x00e9, B:32:0x0101, B:32:0x0101, B:34:0x0109, B:34:0x0109, B:129:0x0116, B:129:0x0116, B:131:0x011e, B:131:0x011e, B:134:0x0126, B:134:0x0126, B:139:0x00ce, B:139:0x00ce), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[Catch: JSONException | Exception -> 0x012b, JSONException | Exception -> 0x012b, TryCatch #3 {JSONException | Exception -> 0x012b, blocks: (B:5:0x0017, B:16:0x0046, B:17:0x003d, B:22:0x0049, B:26:0x00d4, B:26:0x00d4, B:27:0x00db, B:27:0x00db, B:28:0x00e3, B:28:0x00e3, B:30:0x00e9, B:30:0x00e9, B:32:0x0101, B:32:0x0101, B:34:0x0109, B:34:0x0109, B:129:0x0116, B:129:0x0116, B:131:0x011e, B:131:0x011e, B:134:0x0126, B:134:0x0126, B:139:0x00ce, B:139:0x00ce), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(boolean z, int i, String str, boolean z2, String str2) {
        ArrayList<pv0> arrayList;
        String str3;
        String str4;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Bundle bundle;
        p pVar;
        String optString;
        String str5;
        String str6;
        str.getClass();
        str2.getClass();
        if (!c()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Bundle bundle2 = null;
        try {
            jSONObject = new JSONObject(str);
            jSONObject2 = new JSONObject(str2);
            bundle = new Bundle(1);
            pVar = new p();
            if (i != 0) {
                if (i == 1) {
                    str6 = "none";
                } else if (i == 2) {
                    str6 = "Android-GPBL-V1";
                } else if (i == 3) {
                    str6 = "Android-GPBL-V2-V4";
                } else {
                    if (i != 4) {
                        throw null;
                    }
                    str6 = "Android-GPBL-V5-V7";
                }
                h0.n("fb_iap_sdk_supported_library_versions", str6, bundle, pVar);
            }
            String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            string.getClass();
            h0.n("fb_iap_product_id", string, bundle, pVar);
            String string2 = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            string2.getClass();
            h0.n("fb_content_id", string2, bundle, pVar);
            h0.n("android_dynamic_ads_content_id", "client_implicit", bundle, pVar);
            String string3 = jSONObject.getString("purchaseTime");
            string3.getClass();
            h0.n("fb_iap_purchase_time", string3, bundle, pVar);
            String string4 = jSONObject.getString("purchaseToken");
            string4.getClass();
            h0.n("fb_iap_purchase_token", string4, bundle, pVar);
            String optString2 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
            optString2.getClass();
            h0.n("fb_iap_package_name", optString2, bundle, pVar);
            String optString3 = jSONObject2.optString("title");
            optString3.getClass();
            h0.n("fb_iap_product_title", optString3, bundle, pVar);
            String optString4 = jSONObject2.optString("description");
            optString4.getClass();
            h0.n("fb_iap_product_description", optString4, bundle, pVar);
            optString = jSONObject2.optString("type");
            optString.getClass();
            h0.n("fb_iap_product_type", optString, bundle, pVar);
            nx9 nx9Var = nx9.a;
        } catch (JSONException | Exception unused) {
        }
        if (!cw3.a.contains(nx9.class)) {
            try {
                str5 = nx9.d;
            } catch (Throwable th) {
                cw3.a(nx9.class, th);
            }
            if (str5 != null) {
                Map map = p.b;
                h0.n("fb_iap_client_library_version", str5, bundle, pVar);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str7 = (String) entry.getKey();
                String str8 = (String) entry.getValue();
                Map map2 = p.b;
                h0.n(str7, str8, bundle, pVar);
            }
            if (jSONObject2.has("price_amount_micros")) {
                if (jSONObject2.has("subscriptionOfferDetails") || jSONObject2.has("oneTimePurchaseOfferDetails")) {
                    arrayList = b(optString, bundle, pVar, jSONObject2);
                }
                arrayList = null;
            } else {
                arrayList = b.l(a(optString, bundle, pVar, jSONObject, jSONObject2));
            }
            if (arrayList == null && !arrayList.isEmpty()) {
                if (z || !s.b("app_events_if_auto_log_subs", w.b(), false)) {
                    str3 = !z2 ? "fb_mobile_purchase_restored" : "fb_mobile_purchase";
                } else if (z2) {
                    str3 = "SubscriptionRestore";
                } else {
                    lx9 lx9Var = lx9.a;
                    if (!cw3.a.contains(lx9Var)) {
                        try {
                            String optString5 = new JSONObject(str2).optString("freeTrialPeriod");
                            if (optString5 != null) {
                                if (optString5.length() > 0) {
                                    str3 = "StartTrial";
                                }
                            }
                        } catch (JSONException unused2) {
                        } catch (Throwable th2) {
                            cw3.a(lx9Var, th2);
                        }
                    }
                    str3 = "Subscribe";
                }
                str4 = str3;
                if (!z && com.facebook.internal.q.b(o.AndroidManualImplicitSubsDedupe)) {
                    synchronized (qv0.class) {
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            for (pv0 pv0Var : arrayList) {
                                arrayList2.add(new xw9(str4, pv0Var.a.doubleValue(), pv0Var.b));
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            ArrayList arrayList3 = new ArrayList(k13.r(arrayList, 10));
                            for (pv0 pv0Var2 : arrayList) {
                                arrayList3.add(new Pair(pv0Var2.c, pv0Var2.d));
                            }
                            bundle2 = nx9.c(arrayList2, currentTimeMillis, true, arrayList3);
                        } finally {
                        }
                    }
                } else if (!z && com.facebook.internal.q.b(o.AndroidManualImplicitPurchaseDedupe)) {
                    synchronized (qv0.class) {
                        pv0 pv0Var3 = (pv0) arrayList.get(0);
                        bundle2 = nx9.c(a.c(new xw9("fb_mobile_purchase", pv0Var3.a.doubleValue(), pv0Var3.b)), System.currentTimeMillis(), true, a.c(new Pair(pv0Var3.c, pv0Var3.d)));
                    }
                }
                List list = kx9.a;
                kx9.a(bundle2, ((pv0) arrayList.get(0)).c, ((pv0) arrayList.get(0)).d);
                if (!str4.equals("fb_mobile_purchase")) {
                    k kVar = a;
                    BigDecimal bigDecimal = ((pv0) arrayList.get(0)).a;
                    Currency currency = ((pv0) arrayList.get(0)).b;
                    Bundle bundle3 = ((pv0) arrayList.get(0)).c;
                    p pVar2 = ((pv0) arrayList.get(0)).d;
                    kVar.getClass();
                    w wVar = w.a;
                    if (k0.c()) {
                        l lVar = kVar.a;
                        if (cw3.a.contains(lVar)) {
                            return;
                        }
                        try {
                            lVar.h(bigDecimal, currency, bundle3, pVar2);
                            return;
                        } catch (Throwable th3) {
                            cw3.a(lVar, th3);
                            return;
                        }
                    }
                    return;
                }
                k kVar2 = a;
                BigDecimal bigDecimal2 = ((pv0) arrayList.get(0)).a;
                Currency currency2 = ((pv0) arrayList.get(0)).b;
                Bundle bundle4 = ((pv0) arrayList.get(0)).c;
                p pVar3 = ((pv0) arrayList.get(0)).d;
                kVar2.getClass();
                w wVar2 = w.a;
                if (k0.c()) {
                    l lVar2 = kVar2.a;
                    if (cw3.a.contains(lVar2) || currency2 == null) {
                        return;
                    }
                    try {
                        bundle4.putString("fb_currency", currency2.getCurrencyCode());
                        lVar2.e(str4, Double.valueOf(bigDecimal2.doubleValue()), bundle4, true, md.b(), pVar3);
                        return;
                    } catch (Throwable th4) {
                        cw3.a(lVar2, th4);
                        return;
                    }
                }
                return;
            }
            return;
        }
        str5 = null;
        if (str5 != null) {
        }
        while (r0.hasNext()) {
        }
        if (jSONObject2.has("price_amount_micros")) {
        }
        if (arrayList == null) {
            return;
        }
        if (z) {
        }
        if (!z2) {
        }
        str4 = str3;
        if (!z) {
        }
        if (!z) {
            synchronized (qv0.class) {
            }
        }
        List list2 = kx9.a;
        kx9.a(bundle2, ((pv0) arrayList.get(0)).c, ((pv0) arrayList.get(0)).d);
        if (!str4.equals("fb_mobile_purchase")) {
        }
    }
}
