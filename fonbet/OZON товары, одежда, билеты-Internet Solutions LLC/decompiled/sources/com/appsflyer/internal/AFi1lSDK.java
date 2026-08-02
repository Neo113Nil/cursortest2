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
import com.appsflyer.internal.AFi1jSDK;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes8.dex */
public final class AFi1lSDK extends AFi1jSDK {
    final ProviderInfo AFInAppEventType;
    private final AFd1mSDK values;

    public AFi1lSDK(ProviderInfo providerInfo, Runnable runnable, AFd1mSDK aFd1mSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.values = aFd1mSDK;
        this.AFInAppEventType = providerInfo;
    }

    public static ContentProviderClient values(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e11) {
            AFLogger.INSTANCE.e(AFg1gSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e11, false);
            return null;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1gSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th2, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void valueOf(final Context context) {
        this.values.AFInAppEventParameterName().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1lSDK.4
            /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x008b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                Cursor cursor;
                AFi1lSDK aFi1lSDK = AFi1lSDK.this;
                aFi1lSDK.registerClient = System.currentTimeMillis();
                aFi1lSDK.f57489d = AFi1jSDK.AFa1tSDK.STARTED;
                aFi1lSDK.addObserver(new AFi1jSDK.AnonymousClass4());
                StringBuilder sb2 = new StringBuilder("content://");
                sb2.append(AFi1lSDK.this.AFInAppEventType.authority);
                sb2.append("/transaction_id");
                Uri parse = Uri.parse(sb2.toString());
                ContentProviderClient values = AFi1lSDK.values(context, parse);
                if (values != null) {
                    try {
                        try {
                            StringBuilder sb3 = new StringBuilder("app_id=");
                            sb3.append(context.getPackageName());
                            cursor = values.query(parse, null, sb3.toString(), null, null);
                        } finally {
                            values.close();
                        }
                    } catch (DeadObjectException e11) {
                        AFLogger.INSTANCE.e(AFg1gSDK.PREINSTALL, "Failed to acquire unstable content providerClient", e11, false);
                        values.close();
                        cursor = null;
                        if (cursor != null) {
                        }
                        AFi1lSDK aFi1lSDK2 = AFi1lSDK.this;
                        aFi1lSDK2.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1lSDK2.AFInAppEventType).packageName)));
                        AFi1lSDK aFi1lSDK3 = AFi1lSDK.this;
                        aFi1lSDK3.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFi1lSDK3.AFInAppEventType).packageName));
                        AFi1lSDK.this.AFKeystoreWrapper();
                    } catch (RemoteException e12) {
                        AFLogger.INSTANCE.e(AFg1gSDK.PREINSTALL, "Failed to query unstable content providerClient", e12, false);
                        values.close();
                        cursor = null;
                        if (cursor != null) {
                        }
                        AFi1lSDK aFi1lSDK22 = AFi1lSDK.this;
                        aFi1lSDK22.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1lSDK22.AFInAppEventType).packageName)));
                        AFi1lSDK aFi1lSDK32 = AFi1lSDK.this;
                        aFi1lSDK32.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFi1lSDK32.AFInAppEventType).packageName));
                        AFi1lSDK.this.AFKeystoreWrapper();
                    } catch (Throwable th2) {
                        AFLogger.INSTANCE.e(AFg1gSDK.PREINSTALL, "Error to get data from providerClient ", th2, false);
                        values.close();
                        cursor = null;
                        if (cursor != null) {
                        }
                        AFi1lSDK aFi1lSDK222 = AFi1lSDK.this;
                        aFi1lSDK222.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1lSDK222.AFInAppEventType).packageName)));
                        AFi1lSDK aFi1lSDK322 = AFi1lSDK.this;
                        aFi1lSDK322.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFi1lSDK322.AFInAppEventType).packageName));
                        AFi1lSDK.this.AFKeystoreWrapper();
                    }
                    if (cursor != null) {
                        int columnIndex = cursor.getColumnIndex("transaction_id");
                        if (columnIndex == -1) {
                            AFLogger.INSTANCE.w(AFg1gSDK.PREINSTALL, "Wrong column name");
                            AFi1lSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        } else {
                            AFi1lSDK.this.valueOf.put("response", DiscountCodeResponse.RESULT_OK);
                            if (cursor.moveToFirst()) {
                                String string = cursor.getString(columnIndex);
                                cursor.close();
                                if (string != null && !string.isEmpty()) {
                                    AFi1lSDK.this.valueOf.put("referrer", string);
                                }
                            }
                        }
                        cursor.close();
                    } else {
                        AFLogger.INSTANCE.w(AFg1gSDK.PREINSTALL, "ContentProvider query failed, got null Cursor");
                        AFi1lSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                    }
                    AFi1lSDK aFi1lSDK2222 = AFi1lSDK.this;
                    aFi1lSDK2222.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1lSDK2222.AFInAppEventType).packageName)));
                    AFi1lSDK aFi1lSDK3222 = AFi1lSDK.this;
                    aFi1lSDK3222.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFi1lSDK3222.AFInAppEventType).packageName));
                    AFi1lSDK.this.AFKeystoreWrapper();
                }
                cursor = null;
                if (cursor != null) {
                }
                AFi1lSDK aFi1lSDK22222 = AFi1lSDK.this;
                aFi1lSDK22222.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, ((PackageItemInfo) aFi1lSDK22222.AFInAppEventType).packageName)));
                AFi1lSDK aFi1lSDK32222 = AFi1lSDK.this;
                aFi1lSDK32222.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, ((PackageItemInfo) aFi1lSDK32222.AFInAppEventType).packageName));
                AFi1lSDK.this.AFKeystoreWrapper();
            }
        });
    }
}
