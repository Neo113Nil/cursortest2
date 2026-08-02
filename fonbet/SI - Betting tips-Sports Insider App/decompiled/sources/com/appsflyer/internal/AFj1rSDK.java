package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.internal.AFj1tSDK;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFj1rSDK extends AFi1cSDK {

    @NotNull
    private final ExecutorService getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFj1rSDK(@NotNull ExecutorService executorService, @NotNull AFc1oSDK aFc1oSDK, @NotNull Runnable runnable) {
        super("preload", "samsung", aFc1oSDK, runnable);
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(runnable, "");
        this.getMonetizationNetwork = executorService;
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

    private final boolean getMediationNetwork(Context context) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x014d, code lost:
    
        if ((r5 instanceof java.util.concurrent.ExecutorService) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0124, code lost:
    
        r5.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x011d, code lost:
    
        com.appsflyer.internal.h.h((java.util.concurrent.ExecutorService) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0150, code lost:
    
        if (r5 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012b, code lost:
    
        r5.release();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011b, code lost:
    
        if ((r5 instanceof java.util.concurrent.ExecutorService) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
    
        if (r5 != 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getRevenue(AFj1rSDK aFj1rSDK, Context context) {
        Throwable th2;
        ContentProviderClient contentProviderClient;
        ContentProviderClient acquireUnstableContentProviderClient;
        Cursor query;
        Date monetizationNetwork;
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        aFj1rSDK.component1 = System.currentTimeMillis();
        aFj1rSDK.component4 = AFj1tSDK.AFa1tSDK.STARTED;
        aFj1rSDK.addObserver(new AFj1tSDK.AnonymousClass1());
        Cursor cursor = null;
        r3 = null;
        Long l6 = null;
        cursor = null;
        try {
            Uri parse = Uri.parse("content://com.samsung.android.mapsagent.providers.apptracking/info");
            acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
            if (acquireUnstableContentProviderClient != 0) {
                try {
                    query = acquireUnstableContentProviderClient.query(parse, null, context.getPackageName(), new String[]{"appsflyer001"}, null);
                } catch (Throwable th3) {
                    th2 = th3;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    try {
                        AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (Build.VERSION.SDK_INT < 24) {
                            if (contentProviderClient != 0) {
                                if (contentProviderClient instanceof AutoCloseable) {
                                    contentProviderClient.close();
                                } else if (contentProviderClient instanceof ExecutorService) {
                                    h.h((ExecutorService) contentProviderClient);
                                } else {
                                    contentProviderClient.release();
                                }
                            }
                        } else if (contentProviderClient != 0) {
                            contentProviderClient.release();
                        }
                        aFj1rSDK.getMediationNetwork();
                    } catch (Throwable th4) {
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (Build.VERSION.SDK_INT < 24) {
                            if (contentProviderClient == 0) {
                                throw th4;
                            }
                            contentProviderClient.release();
                            throw th4;
                        }
                        if (contentProviderClient == 0) {
                            throw th4;
                        }
                        if (contentProviderClient instanceof AutoCloseable) {
                            contentProviderClient.close();
                            throw th4;
                        }
                        if (contentProviderClient instanceof ExecutorService) {
                            h.h((ExecutorService) contentProviderClient);
                            throw th4;
                        }
                        contentProviderClient.release();
                        throw th4;
                    }
                }
            } else {
                query = null;
            }
        } catch (Throwable th5) {
            th2 = th5;
            contentProviderClient = 0;
        }
        if (query != null) {
            try {
            } catch (Throwable th6) {
                th2 = th6;
                cursor = query;
                contentProviderClient = acquireUnstableContentProviderClient;
                AFLogger.INSTANCE.e(AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th2, false, false, true, true);
                if (cursor != null) {
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                aFj1rSDK.getMediationNetwork();
            }
            if (query.moveToFirst()) {
                if (C_(query)) {
                    String P_ = AFj1eSDK.P_(query, "INSTALLED_TIME_TEXT");
                    if (P_ != null && (monetizationNetwork = AFj1jSDK.getMonetizationNetwork(P_, "yy:MM:dd:hh:mm")) != null) {
                        l6 = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(monetizationNetwork.getTime()));
                    }
                    if (l6 != null) {
                        long longValue = l6.longValue();
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
                        linkedHashMap.put("device_model", P_3);
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
                if (Build.VERSION.SDK_INT >= 24) {
                    if (acquireUnstableContentProviderClient != 0) {
                        if (!(acquireUnstableContentProviderClient instanceof AutoCloseable)) {
                        }
                        acquireUnstableContentProviderClient.close();
                    }
                }
                aFj1rSDK.getMediationNetwork();
            }
        }
        AFh1ySDK.d$default(AFLogger.INSTANCE, AFg1cSDK.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
        if (query != null) {
            query.close();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (acquireUnstableContentProviderClient != 0) {
                if (!(acquireUnstableContentProviderClient instanceof AutoCloseable)) {
                }
                acquireUnstableContentProviderClient.close();
            }
        }
        aFj1rSDK.getMediationNetwork();
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (getMediationNetwork(context)) {
            this.getMonetizationNetwork.execute(new f(3, this, context));
        }
    }

    @Override // com.appsflyer.internal.AFj1tSDK
    public final void AFAdRevenueData() {
    }
}
