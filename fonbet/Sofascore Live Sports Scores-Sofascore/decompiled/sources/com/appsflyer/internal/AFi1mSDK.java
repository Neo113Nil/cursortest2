package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import java.util.Date;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1mSDK extends Referrer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1mSDK(@NotNull ReferrerProp referrerProp) {
        super("preload", Payload.SOURCE_SAMSUNG, referrerProp);
        referrerProp.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0111, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fc, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        if (r3 != null) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void registerClient(AFi1mSDK aFi1mSDK, Context context) {
        Throwable th;
        ContentProviderClient contentProviderClient;
        Cursor query;
        boolean z;
        Date AFKeystoreWrapper;
        aFi1mSDK.start();
        Cursor cursor = null;
        r1 = null;
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
                        AFLogger.INSTANCE.e(LogTag.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (contentProviderClient != null) {
                            contentProviderClient.close();
                        }
                        aFi1mSDK.finish();
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
                        int columnIndex = query.getColumnIndex("RESULT");
                        if (columnIndex != -1) {
                            z = Boolean.parseBoolean(query.getString(columnIndex));
                        } else {
                            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "No such column", false, 4, null);
                            z = false;
                        }
                        if (z) {
                            String U_ = AFj1wSDK.U_(query, "INSTALLED_TIME_TEXT");
                            if (U_ != null && (AFKeystoreWrapper = AFi1aSDK.AFKeystoreWrapper(U_, "yy:MM:dd:hh:mm")) != null) {
                                l = Long.valueOf(AFKeystoreWrapper.getTime() / 1000);
                            }
                            if (l != null) {
                                aFi1mSDK.map.put(Payload.INSTALL_BEGIN_TS, Long.valueOf(l.longValue()));
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String U_2 = AFj1wSDK.U_(query, "MAPS_ID");
                            if (U_2 != null) {
                                linkedHashMap.put(Payload.MAPS_ID, U_2);
                            }
                            String U_3 = AFj1wSDK.U_(query, "DEVICE_NAME");
                            if (U_3 != null) {
                                linkedHashMap.put(Payload.DEVICE_MODEL, U_3);
                            }
                            String U_4 = AFj1wSDK.U_(query, "COUNTRY");
                            if (U_4 != null) {
                                linkedHashMap.put("country", U_4);
                            }
                            String U_5 = AFj1wSDK.U_(query, "CAMPAIGN_ID");
                            if (U_5 != null) {
                                linkedHashMap.put(Payload.CAMPAIGN_ID, U_5);
                            }
                            if (!linkedHashMap.isEmpty()) {
                                aFi1mSDK.map.put(Payload.SAMSUNG_CUSTOM, linkedHashMap);
                            }
                            aFi1mSDK.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, "com.samsung.android.mapsagent")));
                            aFi1mSDK.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, "com.samsung.android.mapsagent"));
                        } else {
                            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "App was not installed via Samsung MAPS.", false, 4, null);
                        }
                        query.close();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = query;
                    contentProviderClient = acquireUnstableContentProviderClient;
                    AFLogger.INSTANCE.e(LogTag.SAMSUNG_PRELOAD_REFERRER, "Error while collecting referrer data", th, false, false, true, true);
                    if (cursor != null) {
                    }
                    if (contentProviderClient != null) {
                    }
                    aFi1mSDK.finish();
                    return;
                }
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "Content provider returned no data", false, 4, null);
            if (query != null) {
                query.close();
            }
        } catch (Throwable th4) {
            th = th4;
            contentProviderClient = null;
        }
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void start(@NotNull Context context) {
        context.getClass();
        if (context.getPackageManager().resolveContentProvider("com.samsung.android.mapsagent.providers.apptracking", 0) != null) {
            getProp().getBackgroundExecutor().execute(new n(2, this, context));
        } else {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SAMSUNG_PRELOAD_REFERRER, "Referrer collection disallowed by missing content provider.", false, 4, null);
        }
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void addLatency() {
    }
}
