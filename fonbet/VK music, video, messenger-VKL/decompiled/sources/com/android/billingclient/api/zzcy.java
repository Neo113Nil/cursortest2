package com.android.billingclient.api;

import android.os.Bundle;
import java.util.ArrayList;
import xsna.bh10;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes12.dex */
final class zzcy {
    public static zzcx zza(Bundle bundle, String str, String str2) {
        BillingResult billingResult = zzcj.zzk;
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", str2 + " got null owned items list");
            return new zzcx(billingResult, 54);
        }
        int zzb = com.google.android.gms.internal.play_billing.zze.zzb(bundle, "BillingClient");
        BillingResult b = bh10.b(zzb, com.google.android.gms.internal.play_billing.zze.zzh(bundle, "BillingClient"));
        if (zzb != 0) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", str2 + " failed. Response code: " + zzb);
            return new zzcx(b, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str2 + " doesn't contain required fields.");
            return new zzcx(billingResult, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str2 + " contains null SKUs list.");
            return new zzcx(billingResult, 56);
        }
        if (stringArrayList2 == null) {
            com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str2 + " contains null purchases list.");
            return new zzcx(billingResult, 57);
        }
        if (stringArrayList3 != null) {
            return new zzcx(zzcj.zzl, 1);
        }
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Bundle returned from " + str2 + " contains null signatures list.");
        return new zzcx(billingResult, 58);
    }
}
