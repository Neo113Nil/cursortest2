package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import io.sentry.ProfilingTraceData;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFj1xSDK extends AFi1fSDK {
    private final ExecutorService getRevenue;

    @Override // com.appsflyer.internal.AFj1ySDK
    protected final void AFAdRevenueData() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1xSDK(ExecutorService executorService, AFc1kSDK aFc1kSDK, Runnable runnable) {
        super("preload", "samsung", aFc1kSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getRevenue = executorService;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getRevenue.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1xSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1xSDK.getMediationNetwork(AFj1xSDK.this, context);
                }
            });
        }
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }

    private static boolean A_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0122, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0124, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r4 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getMediationNetwork(AFj1xSDK aFj1xSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor query;
        Date mediationNetwork;
        Intrinsics.checkNotNullParameter(aFj1xSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1xSDK.areAllFieldsValid = System.currentTimeMillis();
        aFj1xSDK.component1 = AFj1ySDK.AFa1vSDK.STARTED;
        aFj1xSDK.addObserver(new AFj1ySDK.AnonymousClass2());
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
                        AFLogger.INSTANCE.e(AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFj1xSDK.getMonetizationNetwork();
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
                        if (A_(query)) {
                            String N_ = AFj1lSDK.N_(query, "INSTALLED_TIME_TEXT");
                            if (N_ != null && (mediationNetwork = AFj1tSDK.getMediationNetwork(N_, "yy:MM:dd:hh:mm")) != null) {
                                l = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(mediationNetwork.getTime()));
                            }
                            if (l != null) {
                                long longValue = l.longValue();
                                Map<String, Object> map = aFj1xSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(longValue));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String N_2 = AFj1lSDK.N_(query, "MAPS_ID");
                            if (N_2 != null) {
                                linkedHashMap.put("maps_id", N_2);
                            }
                            String N_3 = AFj1lSDK.N_(query, "DEVICE_NAME");
                            if (N_3 != null) {
                                linkedHashMap.put(ProfilingTraceData.JsonKeys.DEVICE_MODEL, N_3);
                            }
                            String N_4 = AFj1lSDK.N_(query, "COUNTRY");
                            if (N_4 != null) {
                                linkedHashMap.put("country", N_4);
                            }
                            String N_5 = AFj1lSDK.N_(query, "CAMPAIGN_ID");
                            if (N_5 != null) {
                                linkedHashMap.put(CreativeInfo.D, N_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map2 = aFj1xSDK.AFAdRevenueData;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map3 = aFj1xSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(map3, "");
                            map3.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map4 = aFj1xSDK.AFAdRevenueData;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFg1gSDK.i$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                    }
                    if (contentProviderClient != null) {
                    }
                    aFj1xSDK.getMonetizationNetwork();
                    return;
                }
            }
            AFg1gSDK.d$default(AFLogger.INSTANCE, AFh1zSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
            if (query != null) {
                query.close();
            }
        } catch (Throwable th4) {
            th = th4;
            contentProviderClient = null;
        }
    }
}
