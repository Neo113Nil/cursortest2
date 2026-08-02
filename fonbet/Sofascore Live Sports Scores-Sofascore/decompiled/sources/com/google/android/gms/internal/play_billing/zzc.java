package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import defpackage.dqn;
import defpackage.ljg;
import defpackage.p62;
import defpackage.x5n;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzc {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            h(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        return 6;
    }

    public static void b(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", p62.a);
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(BillingResult billingResult, zzjs zzjsVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", billingResult.getResponseCode());
        bundle.putString("DEBUG_MESSAGE", billingResult.getDebugMessage());
        bundle.putInt("LOG_REASON", zzjsVar.a);
        return bundle;
    }

    public static Bundle d(String str, ArrayList arrayList, zza zzaVar, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        dqn dqnVar = zzca.b;
        Object[] objArr = {BillingClient.ProductType.SUBS, BillingClient.ProductType.INAPP};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                yhk.s(ljg.j(i, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(zzca.s(2, objArr)));
        Object[] objArr2 = {BillingClient.ProductType.INAPP};
        for (int i2 = 0; i2 < 1; i2++) {
            if (objArr2[i2] == null) {
                yhk.s(ljg.j(i2, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_PREORDER_OFFERS", new ArrayList<>(zzca.s(1, objArr2)));
        Object[] objArr3 = {BillingClient.ProductType.INAPP};
        for (int i3 = 0; i3 < 1; i3++) {
            if (objArr3[i3] == null) {
                yhk.s(ljg.j(i3, "at index "));
                return null;
            }
        }
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(zzca.s(1, objArr3)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (zzaVar.a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z2 = false;
        for (int i4 = 0; i4 < size; i4++) {
            QueryProductDetailsParams.Product product = (QueryProductDetailsParams.Product) arrayList.get(i4);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            arrayList4.add(product.getDynamicProductToken());
            z2 |= !TextUtils.isEmpty(product.getDynamicProductToken());
            if (product.zzb().equals("first_party")) {
                yhk.s("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z2) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static Bundle e(long j, String str) {
        Bundle bundle = new Bundle();
        b(bundle, str, j);
        return bundle;
    }

    public static BillingResult f(String str, Intent intent) {
        if (intent == null) {
            return x5n.h(6, "An internal error occurred.");
        }
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(a(intent.getExtras(), str));
        newBuilder.setDebugMessage(g(intent.getExtras(), str));
        return newBuilder.build();
    }

    public static String g(Bundle bundle, String str) {
        if (bundle == null) {
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            h(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        "Unexpected type for debug message: ".concat(obj.getClass().getName());
        return "";
    }

    public static void h(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int min = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, min);
            str2 = str2.substring(min);
            i -= min;
        }
    }

    public static Purchase i(String str, String str2, Set set) {
        Purchase purchase;
        Purchase purchase2 = null;
        if (str == null || str2 == null) {
            h("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            purchase = new Purchase(str, str2);
        } catch (JSONException e) {
            e = e;
        }
        try {
            set.isEmpty();
            return purchase;
        } catch (JSONException e2) {
            e = e2;
            purchase2 = purchase;
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            return purchase2;
        }
    }
}
