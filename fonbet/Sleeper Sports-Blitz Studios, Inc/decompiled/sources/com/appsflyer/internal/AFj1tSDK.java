package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFj1tSDK extends AFi1bSDK {
    private final ExecutorService getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1tSDK(ExecutorService executorService, AFd1rSDK aFd1rSDK, Runnable runnable) {
        super("preload", "samsung", aFd1rSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFd1rSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getMonetizationNetwork = executorService;
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getMonetizationNetwork.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1tSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1tSDK.getRevenue(AFj1tSDK.this, context);
                }
            });
        }
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!AFAdRevenueData()) {
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0120, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0122, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1tSDK aFj1tSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor query;
        Date monetizationNetwork;
        Intrinsics.checkNotNullParameter(aFj1tSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1tSDK.component4 = System.currentTimeMillis();
        aFj1tSDK.component2 = AFj1qSDK.AFa1vSDK.STARTED;
        aFj1tSDK.addObserver(new AFj1qSDK.AnonymousClass3());
        Cursor cursor = null;
        r2 = null;
        Long l = null;
        cursor = null;
        try {
            Uri parse = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    query = acquireUnstableContentProviderClient.query(parse, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th2) {
                    th = th2;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                        }
                        if (contentProviderClient != null) {
                        }
                        aFj1tSDK.getRevenue();
                        return;
                    } finally {
                    }
                }
            } else {
                query = null;
            }
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        if (C_(query)) {
                            String L_ = AFj1kSDK.L_(query, "INSTALLED_TIME_TEXT");
                            if (L_ != null && (monetizationNetwork = AFa1qSDK.getMonetizationNetwork(L_, "yy:MM:dd:hh:mm")) != null) {
                                l = Long.valueOf(monetizationNetwork.getTime());
                            }
                            if (l != null) {
                                long longValue = l.longValue();
                                Map<String, Object> map = aFj1tSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(longValue));
                            }
                            String L_2 = AFj1kSDK.L_(query, "MAPS_ID");
                            if (L_2 != null) {
                                Map<String, Object> map2 = aFj1tSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("referrer", L_2);
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String L_3 = AFj1kSDK.L_(query, "DEVICE_NAME");
                            if (L_3 != null) {
                                linkedHashMap.put("device_model", L_3);
                            }
                            String L_4 = AFj1kSDK.L_(query, "COUNTRY");
                            if (L_4 != null) {
                                linkedHashMap.put("country", L_4);
                            }
                            String L_5 = AFj1kSDK.L_(query, "CAMPAIGN_ID");
                            if (L_5 != null) {
                                linkedHashMap.put(FirebaseAnalytics.Param.CAMPAIGN_ID, L_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map3 = aFj1tSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map3, "");
                                map3.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map4 = aFj1tSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map5 = aFj1tSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(map5, "");
                            map5.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFh1wSDK.i$default(AFLogger.INSTANCE, AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    aFj1tSDK.getRevenue();
                    return;
                }
            }
            AFh1wSDK.d$default(AFLogger.INSTANCE, AFh1xSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
            if (query != null) {
                query.close();
            }
        } catch (Throwable th4) {
            th = th4;
            contentProviderClient = null;
        }
    }
}
