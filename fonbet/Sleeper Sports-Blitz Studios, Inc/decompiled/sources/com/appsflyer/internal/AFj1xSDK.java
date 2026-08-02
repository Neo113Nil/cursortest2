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
import com.appsflyer.internal.AFj1qSDK;
import io.sentry.protocol.Response;

/* loaded from: classes6.dex */
public final class AFj1xSDK extends AFj1qSDK {
    private final AFd1kSDK getCurrencyIso4217Code;
    final ProviderInfo getMediationNetwork;

    public AFj1xSDK(ProviderInfo providerInfo, Runnable runnable, AFd1kSDK aFd1kSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.getCurrencyIso4217Code = aFd1kSDK;
        this.getMediationNetwork = providerInfo;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork(final Context context) {
        this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1xSDK.2
            /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0093  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFj1xSDK aFj1xSDK = AFj1xSDK.this;
                aFj1xSDK.component4 = System.currentTimeMillis();
                aFj1xSDK.component2 = AFj1qSDK.AFa1vSDK.STARTED;
                aFj1xSDK.addObserver(new AFj1qSDK.AnonymousClass3());
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFj1xSDK.this.getMediationNetwork.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient B_ = AFj1xSDK.B_(context, parse);
                try {
                    if (B_ != null) {
                        try {
                            try {
                                try {
                                    StringBuilder sb2 = new StringBuilder("app_id=");
                                    sb2.append(context.getPackageName());
                                    query = B_.query(parse, null, sb2.toString(), null, null);
                                    B_.close();
                                } catch (DeadObjectException e) {
                                    AFLogger.INSTANCE.e(AFh1xSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e, false, true, false);
                                    B_.close();
                                    query = null;
                                    if (query != null) {
                                    }
                                    AFj1xSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName)));
                                    AFj1xSDK.this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName));
                                    AFj1xSDK.this.getRevenue();
                                }
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(AFh1xSDK.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                                B_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFj1xSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName)));
                                AFj1xSDK.this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName));
                                AFj1xSDK.this.getRevenue();
                            }
                        } catch (RemoteException e2) {
                            AFLogger.INSTANCE.e(AFh1xSDK.PREINSTALL, "Failed to query unstable content providerClient", e2, false, true, false);
                            B_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFj1xSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName)));
                            AFj1xSDK.this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName));
                            AFj1xSDK.this.getRevenue();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex != -1) {
                                AFj1xSDK.this.AFAdRevenueData.put(Response.TYPE, "OK");
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFj1xSDK.this.AFAdRevenueData.put("referrer", string);
                                    }
                                }
                            } else {
                                AFLogger.INSTANCE.w(AFh1xSDK.PREINSTALL, "Wrong column name");
                                AFj1xSDK.this.AFAdRevenueData.put(Response.TYPE, "FEATURE_NOT_SUPPORTED");
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(AFh1xSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFj1xSDK.this.AFAdRevenueData.put(Response.TYPE, "SERVICE_UNAVAILABLE");
                        }
                        AFj1xSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName)));
                        AFj1xSDK.this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName));
                        AFj1xSDK.this.getRevenue();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFj1xSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName)));
                    AFj1xSDK.this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, ((PackageItemInfo) AFj1xSDK.this.getMediationNetwork).packageName));
                    AFj1xSDK.this.getRevenue();
                } catch (Throwable th2) {
                    B_.close();
                    throw th2;
                }
            }
        });
    }

    public static ContentProviderClient B_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFh1xSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }
}
