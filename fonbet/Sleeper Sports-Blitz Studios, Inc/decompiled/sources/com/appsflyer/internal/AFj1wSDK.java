package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import io.sentry.protocol.Response;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class AFj1wSDK extends AFi1bSDK {
    private final AFd1kSDK getMediationNetwork;
    private final AFi1aSDK getMonetizationNetwork;

    public AFj1wSDK(Runnable runnable, AFd1kSDK aFd1kSDK, AFi1aSDK aFi1aSDK) {
        super("store", "huawei", aFd1kSDK.getCurrencyIso4217Code(), runnable);
        this.getMediationNetwork = aFd1kSDK;
        this.getMonetizationNetwork = aFi1aSDK;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getCurrencyIso4217Code(context)) {
            this.getMediationNetwork.getMonetizationNetwork().execute(new Runnable() { // from class: com.appsflyer.internal.AFj1wSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1wSDK.this.getRevenue(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dd, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0104, code lost:
    
        getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0101, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (0 == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void getRevenue(Context context) {
        this.component4 = System.currentTimeMillis();
        this.component2 = AFj1qSDK.AFa1vSDK.STARTED;
        addObserver(new AFj1qSDK.AnonymousClass3());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor != null) {
                if (!cursor.moveToFirst()) {
                    this.AFAdRevenueData.put(Response.TYPE, "FEATURE_NOT_SUPPORTED");
                } else {
                    this.AFAdRevenueData.put(Response.TYPE, "OK");
                    this.AFAdRevenueData.put("referrer", cursor.getString(0));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(cursor.getLong(1)));
                    this.AFAdRevenueData.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                    if (cursor.getColumnCount() > 3) {
                        this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                        HashMap hashMap = new HashMap();
                        String string = cursor.getString(4);
                        if (string != null) {
                            hashMap.put("track_id", string);
                        }
                        hashMap.put("referrer_ex", cursor.getString(5));
                        this.AFAdRevenueData.put("huawei_custom", hashMap);
                    }
                }
            } else {
                this.AFAdRevenueData.put(Response.TYPE, "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put(Response.TYPE, "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFh1xSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
            }
        }
    }

    private boolean getCurrencyIso4217Code(Context context) {
        if (!AFAdRevenueData()) {
            AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMonetizationNetwork.getMediationNetwork(context)) {
            AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMonetizationNetwork.getMonetizationNetwork(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }
}
