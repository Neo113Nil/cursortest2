package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AFj1wSDK extends AFi1jSDK {
    private final AFc1fSDK getMediationNetwork;

    public AFj1wSDK(Runnable runnable, AFc1fSDK aFc1fSDK) {
        super(X3.i.U, "samsung", runnable);
        this.getMediationNetwork = aFc1fSDK;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(Context context) {
        AFb1uSDK<Map<String, Object>> aFb1uSDK = new AFb1uSDK<Map<String, Object>>(context, this.getMediationNetwork.AFAdRevenueData(), "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFj1wSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
            
                if (r3 != null) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00dc, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.getMonetizationNetwork.getPackageManager().resolveContentProvider(r10.AFAdRevenueData, 128)).packageName;
                r10.getMediationNetwork.AFAdRevenueData.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFj1nSDK.AFAdRevenueData(r10.getMonetizationNetwork, r0)));
                r10.getMediationNetwork.AFAdRevenueData.put("api_ver_name", com.appsflyer.internal.AFj1nSDK.getCurrencyIso4217Code(r10.getMonetizationNetwork, r0));
                r10.getMediationNetwork.getMonetizationNetwork();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0117, code lost:
            
                return r10.getMediationNetwork.AFAdRevenueData;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
            
                r3.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
            
                if (0 == 0) goto L25;
             */
            @Override // com.appsflyer.internal.AFb1uSDK
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Map<String, Object> getRevenue() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.getMonetizationNetwork.getContentResolver().query(Uri.parse(new StringBuilder("content://").append(this.AFAdRevenueData).toString()), null, null, null, null);
                        if (cursor != null) {
                            if (!cursor.moveToFirst()) {
                                AFj1wSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                            } else {
                                AFj1wSDK.this.AFAdRevenueData.put("response", "OK");
                                C_("referrer", AFj1wSDK.this.AFAdRevenueData, cursor);
                                B_("click_ts", AFj1wSDK.this.AFAdRevenueData, cursor);
                                B_("install_begin_ts", AFj1wSDK.this.AFAdRevenueData, cursor);
                                B_("install_end_ts", AFj1wSDK.this.AFAdRevenueData, cursor);
                                C_("organic_keywords", AFj1wSDK.this.AFAdRevenueData, cursor);
                                C_("attr_type", AFj1wSDK.this.AFAdRevenueData, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                B_("click_server_ts", hashMap, cursor);
                                B_("install_begin_server_ts", hashMap, cursor);
                                C_("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    AFj1wSDK.this.AFAdRevenueData.put("custom", hashMap);
                                }
                            }
                        } else {
                            AFj1wSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        AFj1wSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            private static void B_(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            private static void C_(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFc1sSDK component1 = this.getMediationNetwork.component1();
        AFa1zSDK.getMonetizationNetwork();
        if (AFa1zSDK.getRevenue(component1, false) > 0 || !aFb1uSDK.getMonetizationNetwork()) {
            return;
        }
        aFb1uSDK.getRevenue.execute(aFb1uSDK.getCurrencyIso4217Code);
        this.areAllFieldsValid = System.currentTimeMillis();
        this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        addObserver(new AFj1ySDK.AnonymousClass2());
    }
}
