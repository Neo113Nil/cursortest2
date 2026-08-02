package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.a;
import com.android.billingclient.api.m;
import com.android.billingclient.api.zzek;
import com.google.android.gms.internal.play_billing.zzar;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzca;
import com.google.android.gms.internal.play_billing.zzjs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lon implements Callable {
    public final /* synthetic */ PurchasesResponseListener a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a d;

    public lon(a aVar, PurchasesResponseListener purchasesResponseListener, String str, boolean z) {
        this.a = purchasesResponseListener;
        this.b = str;
        this.c = z;
        this.d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0148 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Exception exc;
        zzek n;
        List zzb;
        zzar zzarVar;
        Bundle bundle;
        Bundle B1;
        BillingResult h;
        zzjs zzjsVar;
        zzjs zzjsVar2;
        int i;
        a aVar = this.d;
        Exception exc2 = null;
        int i2 = 9;
        if (!aVar.O(yfa.h)) {
            zzjs zzjsVar3 = zzjs.SERVICE_CONNECTION_NOT_READY;
            BillingResult billingResult = m.j;
            aVar.p(9, billingResult, zzjsVar3);
            PurchasesResponseListener purchasesResponseListener = this.a;
            dqn dqnVar = zzca.b;
            purchasesResponseListener.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.a.e);
            return null;
        }
        String str = this.b;
        if (TextUtils.isEmpty(str)) {
            int i3 = zzc.a;
            zzjs zzjsVar4 = zzjs.EMPTY_PRODUCT_TYPE;
            BillingResult billingResult2 = m.e;
            aVar.p(9, billingResult2, zzjsVar4);
            PurchasesResponseListener purchasesResponseListener2 = this.a;
            dqn dqnVar2 = zzca.b;
            purchasesResponseListener2.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.a.e);
            return null;
        }
        boolean z = this.c;
        zzc.h("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z2 = aVar.p;
        boolean z3 = aVar.w;
        PendingPurchasesParams pendingPurchasesParams = aVar.G;
        pendingPurchasesParams.getClass();
        boolean z4 = pendingPurchasesParams.a;
        long longValue = aVar.M.longValue();
        Bundle bundle2 = new Bundle();
        zzc.b(bundle2, aVar.d, longValue);
        if (z2) {
            bundle2.putBoolean("enablePendingPurchases", true);
        }
        if (z3 && z4) {
            bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        if (z) {
            bundle2.putBoolean("includeSuspendedSubscriptions", true);
        }
        String str2 = null;
        while (true) {
            try {
                synchronized (aVar.a) {
                    try {
                        zzarVar = aVar.i;
                    } catch (Throwable th) {
                        th = th;
                        exc = exc2;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (DeadObjectException e) {
                                    e = e;
                                    n = aVar.n(m.j, zzjs.GET_PURCHASE_SERVICE_CALL_EXCEPTION, e);
                                    zzb = n.zzb();
                                    PurchasesResponseListener purchasesResponseListener3 = this.a;
                                    if (zzb != null) {
                                    }
                                    return exc;
                                } catch (Exception e2) {
                                    e = e2;
                                    n = aVar.n(m.h, zzjs.GET_PURCHASE_SERVICE_CALL_EXCEPTION, e);
                                    zzb = n.zzb();
                                    PurchasesResponseListener purchasesResponseListener32 = this.a;
                                    if (zzb != null) {
                                    }
                                    return exc;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                if (zzarVar != null) {
                    if (z && !aVar.C) {
                        n = aVar.n(m.x, zzjs.INCLUDE_SUSPENDED_SUBSCRIPTIONS_NOT_SUPPORTED, exc2);
                        break;
                    }
                    if (aVar.p) {
                        bundle = bundle2;
                        B1 = zzarVar.B1(aVar.C ? 26 : aVar.B ? 24 : aVar.w ? 19 : i2, aVar.g.getPackageName(), str, str2, bundle);
                    } else {
                        B1 = zzarVar.n2(aVar.g.getPackageName(), str, str2);
                        bundle = bundle2;
                    }
                    BillingResult billingResult3 = m.h;
                    if (B1 == null) {
                        int i4 = zzc.a;
                        zzjsVar = zzjs.NULL_OWNED_ITEMS_LIST;
                    } else {
                        int a = zzc.a(B1, "BillingClient");
                        h = x5n.h(a, zzc.g(B1, "BillingClient"));
                        if (a != 0) {
                            zzjsVar2 = zzjs.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                        } else if (B1.containsKey("INAPP_PURCHASE_ITEM_LIST") && B1.containsKey("INAPP_PURCHASE_DATA_LIST") && B1.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                            ArrayList<String> stringArrayList = B1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            ArrayList<String> stringArrayList2 = B1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            ArrayList<String> stringArrayList3 = B1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            if (stringArrayList == null) {
                                zzjsVar = zzjs.NULL_SKUS_LIST;
                            } else if (stringArrayList2 == null) {
                                zzjsVar = zzjs.NULL_PURCHASES_LIST;
                            } else if (stringArrayList3 == null) {
                                zzjsVar = zzjs.NULL_SIGNATURES_LIST;
                            } else {
                                h = m.i;
                                zzjsVar2 = zzjs.REASON_UNSPECIFIED;
                            }
                        } else {
                            zzjsVar = zzjs.MISSING_REQUIRED_PURCHASE_KEY;
                        }
                        if (h == m.i) {
                            n = aVar.n(h, zzjsVar2, exc2);
                            break;
                        }
                        ArrayList<String> stringArrayList4 = B1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList5 = B1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList6 = B1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        int i5 = 0;
                        exc = exc2;
                        boolean z5 = false;
                        while (i5 < stringArrayList5.size()) {
                            String str3 = stringArrayList5.get(i5);
                            String str4 = stringArrayList6.get(i5);
                            boolean z6 = z;
                            ArrayList<String> arrayList2 = stringArrayList4;
                            zzc.h("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i5))));
                            try {
                                Purchase purchase = new Purchase(str3, str4);
                                aVar.J.isEmpty();
                                if (TextUtils.isEmpty(purchase.getPurchaseToken())) {
                                    z5 = true;
                                }
                                arrayList.add(purchase);
                                i5++;
                                z = z6;
                                stringArrayList4 = arrayList2;
                            } catch (JSONException e3) {
                                n = aVar.n(m.h, zzjs.ERROR_DECODING_PURCHASE_DATA, e3);
                            }
                        }
                        boolean z7 = z;
                        if (z5) {
                            i = 9;
                            aVar.p(9, billingResult3, zzjs.EMPTY_PURCHASE_TOKEN);
                        } else {
                            i = 9;
                        }
                        str2 = B1.getString("INAPP_CONTINUATION_TOKEN");
                        zzc.h("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                        if (TextUtils.isEmpty(str2)) {
                            n = new zzek(m.i, arrayList);
                            break;
                        }
                        i2 = i;
                        bundle2 = bundle;
                        exc2 = exc;
                        z = z7;
                    }
                    zzjsVar2 = zzjsVar;
                    h = billingResult3;
                    if (h == m.i) {
                    }
                } else {
                    n = aVar.n(m.j, zzjs.SERVICE_RESET_TO_NULL, exc2);
                    break;
                }
            } catch (DeadObjectException e4) {
                e = e4;
                exc = exc2;
            } catch (Exception e5) {
                e = e5;
                exc = exc2;
            }
        }
        zzb = n.zzb();
        PurchasesResponseListener purchasesResponseListener322 = this.a;
        if (zzb != null) {
            purchasesResponseListener322.onQueryPurchasesResponse(n.zza(), n.zzb());
        } else {
            BillingResult zza = n.zza();
            dqn dqnVar3 = zzca.b;
            purchasesResponseListener322.onQueryPurchasesResponse(zza, com.google.android.gms.internal.play_billing.a.e);
        }
        return exc;
    }
}
