package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerProp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1kSDK extends Referrer {
    private final AFc1aSDK AFKeystoreWrapper;
    final ProviderInfo AFLogger;

    public AFi1kSDK(ProviderInfo providerInfo, ReferrerProp referrerProp, AFc1aSDK aFc1aSDK) {
        super(Payload.TYPE_AF_REFERRER, providerInfo.authority, referrerProp);
        this.AFKeystoreWrapper = aFc1aSDK;
        this.AFLogger = providerInfo;
    }

    @Nullable
    public static ContentProviderClient J_(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false, true, false);
            return null;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th, false, true, false);
            return null;
        }
    }

    @Override // com.appsflyer.sdk_base.referrer.Referrer
    public final void start(final Context context) {
        this.AFKeystoreWrapper.unregisterClient().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1kSDK.2
            /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0088  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor query;
                AFi1kSDK.this.start();
                StringBuilder sb = new StringBuilder("content://");
                sb.append(AFi1kSDK.this.AFLogger.authority);
                sb.append("/transaction_id");
                Uri parse = Uri.parse(sb.toString());
                ContentProviderClient J_ = AFi1kSDK.J_(context, parse);
                try {
                    if (J_ != null) {
                        try {
                            try {
                                try {
                                    StringBuilder sb2 = new StringBuilder("app_id=");
                                    sb2.append(context.getPackageName());
                                    query = J_.query(parse, null, sb2.toString(), null, null);
                                    J_.close();
                                } catch (RemoteException e) {
                                    AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to query unstable content providerClient", e, false, true, false);
                                    J_.close();
                                    query = null;
                                    if (query != null) {
                                    }
                                    AFi1kSDK aFi1kSDK = AFi1kSDK.this;
                                    aFi1kSDK.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, ((PackageItemInfo) aFi1kSDK.AFLogger).packageName)));
                                    AFi1kSDK aFi1kSDK2 = AFi1kSDK.this;
                                    aFi1kSDK2.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, ((PackageItemInfo) aFi1kSDK2.AFLogger).packageName));
                                    AFi1kSDK.this.finish();
                                }
                            } catch (Throwable th) {
                                AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Error to get data from providerClient ", th, false, true, false);
                                J_.close();
                                query = null;
                                if (query != null) {
                                }
                                AFi1kSDK aFi1kSDK3 = AFi1kSDK.this;
                                aFi1kSDK3.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, ((PackageItemInfo) aFi1kSDK3.AFLogger).packageName)));
                                AFi1kSDK aFi1kSDK22 = AFi1kSDK.this;
                                aFi1kSDK22.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, ((PackageItemInfo) aFi1kSDK22.AFLogger).packageName));
                                AFi1kSDK.this.finish();
                            }
                        } catch (DeadObjectException e2) {
                            AFLogger.INSTANCE.e(LogTag.PREINSTALL, "Failed to acquire unstable content providerClient", e2, false, true, false);
                            J_.close();
                            query = null;
                            if (query != null) {
                            }
                            AFi1kSDK aFi1kSDK32 = AFi1kSDK.this;
                            aFi1kSDK32.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, ((PackageItemInfo) aFi1kSDK32.AFLogger).packageName)));
                            AFi1kSDK aFi1kSDK222 = AFi1kSDK.this;
                            aFi1kSDK222.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, ((PackageItemInfo) aFi1kSDK222.AFLogger).packageName));
                            AFi1kSDK.this.finish();
                        }
                        if (query != null) {
                            int columnIndex = query.getColumnIndex("transaction_id");
                            if (columnIndex == -1) {
                                AFLogger.INSTANCE.w(LogTag.PREINSTALL, "Wrong column name");
                                AFi1kSDK.this.map.put("response", Payload.RESPONSE_FEATURE_NOT_SUPPORTED);
                            } else {
                                AFi1kSDK.this.map.put("response", Payload.RESPONSE_OK);
                                if (query.moveToFirst()) {
                                    String string = query.getString(columnIndex);
                                    query.close();
                                    if (string != null && !string.isEmpty()) {
                                        AFi1kSDK.this.map.put(Payload.RFR, string);
                                    }
                                }
                            }
                            query.close();
                        } else {
                            AFLogger.INSTANCE.w(LogTag.PREINSTALL, "ContentProvider query failed, got null Cursor");
                            AFi1kSDK.this.map.put("response", Payload.RESPONSE_SERVICE_UNAVAILABLE);
                        }
                        AFi1kSDK aFi1kSDK322 = AFi1kSDK.this;
                        aFi1kSDK322.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, ((PackageItemInfo) aFi1kSDK322.AFLogger).packageName)));
                        AFi1kSDK aFi1kSDK2222 = AFi1kSDK.this;
                        aFi1kSDK2222.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, ((PackageItemInfo) aFi1kSDK2222.AFLogger).packageName));
                        AFi1kSDK.this.finish();
                    }
                    query = null;
                    if (query != null) {
                    }
                    AFi1kSDK aFi1kSDK3222 = AFi1kSDK.this;
                    aFi1kSDK3222.map.put(Payload.API, Long.valueOf(AFi1cSDK.unregisterClient(context, ((PackageItemInfo) aFi1kSDK3222.AFLogger).packageName)));
                    AFi1kSDK aFi1kSDK22222 = AFi1kSDK.this;
                    aFi1kSDK22222.map.put(Payload.API_NAME, AFi1cSDK.AFLogger(context, ((PackageItemInfo) aFi1kSDK22222.AFLogger).packageName));
                    AFi1kSDK.this.finish();
                } catch (Throwable th2) {
                    J_.close();
                    throw th2;
                }
            }
        });
    }
}
