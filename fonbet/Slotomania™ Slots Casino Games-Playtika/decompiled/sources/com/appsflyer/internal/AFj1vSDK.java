package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;

/* loaded from: classes2.dex */
public final class AFj1vSDK extends AFj1ySDK {
    private final AFc1fSDK getMediationNetwork;
    final ProviderInfo getRevenue;

    public AFj1vSDK(ProviderInfo providerInfo, Runnable runnable, AFc1fSDK aFc1fSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getMediationNetwork = aFc1fSDK;
        this.getRevenue = providerInfo;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(final Context context) {
        this.getMediationNetwork.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1vSDK.1
            /* JADX WARN: Removed duplicated region for block: B:21:0x00df  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0096  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1vSDK aFj1vSDK = AFj1vSDK.this;
                aFj1vSDK.areAllFieldsValid = System.currentTimeMillis();
                aFj1vSDK.component1 = AFj1ySDK.AFa1vSDK.STARTED;
                aFj1vSDK.addObserver(new AFj1ySDK.AnonymousClass2());
                Uri parse = Uri.parse(new StringBuilder("content://").append(AFj1vSDK.this.getRevenue.authority).append("/transaction_id").toString());
                ContentProviderClient z_ = AFj1vSDK.z_(context, parse);
                try {
                    if (z_ != null) {
                        try {
                            try {
                                query = z_.query(parse, null, new StringBuilder("app_id=").append(context.getPackageName()).toString(), null, null);
                                z_.close();
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                                z_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1vSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName)));
                                AFj1vSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName));
                                AFj1vSDK.this.getMonetizationNetwork();
                            }
                        } catch (DeadObjectException e) {
                            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e, false, true, false);
                            z_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1vSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName)));
                            AFj1vSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName));
                            AFj1vSDK.this.getMonetizationNetwork();
                        } catch (RemoteException e2) {
                            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to query unstable content providerClient", e2, false, true, false);
                            z_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1vSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName)));
                            AFj1vSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName));
                            AFj1vSDK.this.getMonetizationNetwork();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex != -1) {
                                AFj1vSDK.this.AFAdRevenueData.put("response", "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1vSDK.this.AFAdRevenueData.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFh1zSDK.PREINSTALL, "Wrong column name");
                                AFj1vSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFh1zSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1vSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        }
                        AFj1vSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName)));
                        AFj1vSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName));
                        AFj1vSDK.this.getMonetizationNetwork();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1vSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName)));
                    AFj1vSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, ((PackageItemInfo) AFj1vSDK.this.getRevenue).packageName));
                    AFj1vSDK.this.getMonetizationNetwork();
                } catch (Throwable th2) {
                    z_.close();
                    throw th2;
                }
            }
        });
    }

    public static ContentProviderClient z_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }
}
