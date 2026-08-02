package com.android.billingclient.api;

import com.android.billingclient.api.BillingResult;
import xsna.bh10;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes.dex */
final class zzcj {
    static final BillingResult zzA;
    static final BillingResult zzB;
    static final BillingResult zzC;
    static final BillingResult zzD;
    static final BillingResult zzE;
    static final BillingResult zzF;
    static final BillingResult zzG;
    public static final /* synthetic */ int zzH = 0;
    static final BillingResult zza = bh10.b(3, "Google Play In-app Billing API version is less than 3");
    static final BillingResult zzb = bh10.b(3, "Google Play In-app Billing API version is less than 9");
    static final BillingResult zzc = bh10.b(3, "Billing service unavailable on device.");
    static final BillingResult zzd = bh10.b(2, "Billing service unavailable on device.");
    static final BillingResult zze = bh10.b(5, "Client is already in the process of connecting to billing service.");
    static final BillingResult zzf = bh10.b(5, "The list of SKUs can't be empty.");
    static final BillingResult zzg = bh10.b(5, "SKU type can't be empty.");
    static final BillingResult zzh = bh10.b(5, "Product type can't be empty.");
    static final BillingResult zzi = bh10.b(-2, "Client does not support extra params.");
    static final BillingResult zzj = bh10.b(5, "Invalid purchase token.");
    static final BillingResult zzk = bh10.b(6, "An internal error occurred.");
    static final BillingResult zzl;
    static final BillingResult zzm;
    static final BillingResult zzn;
    static final BillingResult zzo;
    static final BillingResult zzp;
    static final BillingResult zzq;
    static final BillingResult zzr;
    static final BillingResult zzs;
    static final BillingResult zzt;
    static final BillingResult zzu;
    static final BillingResult zzv;
    static final BillingResult zzw;
    static final BillingResult zzx;
    static final BillingResult zzy;
    static final BillingResult zzz;

    static {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(5);
        newBuilder.setDebugMessage("SKU can't be null.");
        newBuilder.build();
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(0);
        zzl = newBuilder2.build();
        zzm = bh10.b(-1, "Service connection is disconnected.");
        zzn = bh10.b(2, "Timeout communicating with service.");
        zzo = bh10.b(-2, "Client does not support subscriptions.");
        zzp = bh10.b(-2, "Client does not support subscriptions update.");
        zzq = bh10.b(-2, "Client does not support get purchase history.");
        zzr = bh10.b(-2, "Client does not support price change confirmation.");
        zzs = bh10.b(-2, "Play Store version installed does not support cross selling products.");
        zzt = bh10.b(-2, "Client does not support multi-item purchases.");
        zzu = bh10.b(-2, "Client does not support offer_id_token.");
        zzv = bh10.b(-2, "Client does not support ProductDetails.");
        zzw = bh10.b(-2, "Client does not support in-app messages.");
        BillingResult.Builder newBuilder3 = BillingResult.newBuilder();
        newBuilder3.setResponseCode(-2);
        newBuilder3.setDebugMessage("Client does not support user choice billing.");
        newBuilder3.build();
        BillingResult.Builder newBuilder4 = BillingResult.newBuilder();
        newBuilder4.setResponseCode(-2);
        newBuilder4.setDebugMessage("Play Store version installed does not support external offer.");
        zzx = newBuilder4.build();
        zzy = bh10.b(-2, "Play Store version installed does not support multi-item purchases with season pass in one cart.");
        zzz = bh10.b(5, "Unknown feature");
        zzA = bh10.b(-2, "Play Store version installed does not support get billing config.");
        zzB = bh10.b(-2, "Query product details with serialized docid is not supported.");
        zzC = bh10.b(4, "Item is unavailable for purchase.");
        zzD = bh10.b(-2, "Query product details with developer specified account is not supported.");
        zzE = bh10.b(-2, "Play Store version installed does not support alternative billing only.");
        zzF = bh10.b(5, "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        zzG = bh10.b(6, "An error occurred while retrieving billing override.");
    }

    public static BillingResult zza(int i, String str) {
        return bh10.b(i, str);
    }
}
