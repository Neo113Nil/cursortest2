package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.internal.AFj1tSDK;
import com.twilio.voice.PublisherMetadata;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1rSDK extends AFi1cSDK {

    @NotNull
    private final ExecutorService getCurrencyIso4217Code;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(@NotNull ExecutorService executorService, @NotNull AFc1oSDK aFc1oSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFc1oSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getCurrencyIso4217Code = executorService;
    }

    private static boolean C_(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("RESULT");
        if (columnIndex != -1) {
            return Boolean.parseBoolean(cursor.getString(columnIndex));
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
        return false;
    }

    private static boolean getCurrencyIso4217Code(Context context) {
        return context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x011d, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0108, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1rSDK aFj1rSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClient;
        Cursor query;
        Date monetizationNetwork;
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1rSDK.component1 = System.currentTimeMillis();
        aFj1rSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1rSDK.addObserver(new AFj1tSDK.AnonymousClass1());
        Cursor cursor = null;
        r2 = null;
        Long l10 = null;
        cursor = null;
        try {
            Uri parse = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            if (acquireUnstableContentProviderClient != null) {
                try {
                    query = acquireUnstableContentProviderClient.query(parse, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th3) {
                    th2 = th3;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                        if (cursor != null) {
                        }
                        if (contentProviderClient != null) {
                        }
                        aFj1rSDK.getMediationNetwork();
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
                            String P_ = AFj1eSDK.P_(query, "INSTALLED_TIME_TEXT");
                            if (P_ != null && (monetizationNetwork = AFj1jSDK.getMonetizationNetwork(P_, "yy:MM:dd:hh:mm")) != null) {
                                l10 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(monetizationNetwork.getTime()));
                            }
                            if (l10 != null) {
                                long longValue = l10.longValue();
                                Map<String, Object> map = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map, "");
                                map.put("install_begin_ts", Long.valueOf(longValue));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String P_2 = AFj1eSDK.P_(query, "MAPS_ID");
                            if (P_2 != null) {
                                linkedHashMap.put("maps_id", P_2);
                            }
                            String P_3 = AFj1eSDK.P_(query, "DEVICE_NAME");
                            if (P_3 != null) {
                                linkedHashMap.put(PublisherMetadata.DEVICE_MODEL, P_3);
                            }
                            String P_4 = AFj1eSDK.P_(query, "COUNTRY");
                            if (P_4 != null) {
                                linkedHashMap.put(AdRevenueScheme.COUNTRY, P_4);
                            }
                            String P_5 = AFj1eSDK.P_(query, "CAMPAIGN_ID");
                            if (P_5 != null) {
                                linkedHashMap.put("campaign_id", P_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                Map<String, Object> map2 = aFj1rSDK.getMediationNetwork;
                                Intrinsics.checkNotNullExpressionValue(map2, "");
                                map2.put("samsung_custom", linkedHashMap);
                            }
                            Map<String, Object> map3 = aFj1rSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map3, "");
                            map3.put("api_ver", Long.valueOf(AFj1kSDK.AFAdRevenueData(context, "com.samsung.android.mapsagent")));
                            Map<String, Object> map4 = aFj1rSDK.getMediationNetwork;
                            Intrinsics.checkNotNullExpressionValue(map4, "");
                            map4.put("api_ver_name", AFj1kSDK.getRevenue(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFh1ySDK.i$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        query.close();
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    cursor = query;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    aFj1rSDK.getMediationNetwork();
                    return;
                }
            }
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
            if (query != null) {
                query.close();
            }
        } catch (Throwable th5) {
            th2 = th5;
            contentProviderClient = null;
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData() {
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull final Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (AFAdRevenueData(context)) {
            this.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.F
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1rSDK.getRevenue(AFj1rSDK.this, context);
                }
            });
        }
    }

    private final boolean AFAdRevenueData(Context context) {
        if (!getRevenue()) {
            AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by counter.", false, 4, null);
            return false;
        }
        if (getCurrencyIso4217Code(context)) {
            return true;
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        return false;
    }
}
