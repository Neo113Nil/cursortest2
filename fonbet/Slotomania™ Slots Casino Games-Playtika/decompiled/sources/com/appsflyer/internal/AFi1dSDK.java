package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.ironsource.X3;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class AFi1dSDK extends AFi1fSDK {
    private final AFi1hSDK getMediationNetwork;
    private final AFc1fSDK getRevenue;

    public AFi1dSDK(Runnable runnable, AFc1fSDK aFc1fSDK, AFi1hSDK aFi1hSDK) {
        super(X3.i.U, "huawei", aFc1fSDK.getRevenue(), runnable);
        this.getRevenue = aFc1fSDK;
        this.getMediationNetwork = aFi1hSDK;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(final Context context) {
        if (getMonetizationNetwork(context)) {
            this.getRevenue.AFAdRevenueData().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1dSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1dSDK.this.getMediationNetwork(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00dd, code lost:
    
        if (r3 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0104, code lost:
    
        getMonetizationNetwork();
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
    public /* synthetic */ void getMediationNetwork(Context context) {
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        addObserver(new AFj1ySDK.AnonymousClass2());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, str)));
        this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, str));
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursor != null) {
                if (!cursor.moveToFirst()) {
                    this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                } else {
                    this.AFAdRevenueData.put("response", "OK");
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
                this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            }
        } catch (Throwable th) {
            try {
                this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, th.getMessage() != null ? th.getMessage() : "", th, false, true);
            } finally {
            }
        }
    }

    private boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.getMediationNetwork.getMediationNetwork(context)) {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.getMediationNetwork.AFAdRevenueData(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }
}
