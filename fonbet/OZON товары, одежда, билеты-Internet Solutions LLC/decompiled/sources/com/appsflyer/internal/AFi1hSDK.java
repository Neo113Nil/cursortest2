package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1jSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes.dex */
public final class AFi1hSDK extends AFi1rSDK {
    public AFi1hSDK(AFd1sSDK aFd1sSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1sSDK, runnable);
    }

    private boolean AFInAppEventParameterName() {
        if (!AFInAppEventType()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFg1gSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1gSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th2);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void valueOf(final Context context) {
        if (AFInAppEventParameterName()) {
            this.registerClient = System.currentTimeMillis();
            this.f57489d = AFi1jSDK.AFa1tSDK.STARTED;
            addObserver(new AFi1jSDK.AnonymousClass4());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFi1hSDK.5
                public final void onGetAppsReferrerSetupFinished(int i11) {
                    AFi1hSDK.this.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, "com.xiaomi.mipicks")));
                    AFi1hSDK.this.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, "com.xiaomi.mipicks"));
                    if (i11 == -1) {
                        AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFi1hSDK.this.valueOf.put("response", "SERVICE_DISCONNECTED");
                    } else if (i11 == 0) {
                        AFi1hSDK aFi1hSDK = AFi1hSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFi1hSDK.valueOf.put("response", DiscountCodeResponse.RESULT_OK);
                        try {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK = AFg1gSDK.REFERRER;
                            aFLogger.d(aFg1gSDK, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFi1hSDK.valueOf.put("referrer", installReferrer2);
                                }
                                aFi1hSDK.valueOf.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFi1hSDK.valueOf.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFi1hSDK.valueOf.put("xiaomi_custom", hashMap);
                            } else {
                                aFLogger.w(aFg1gSDK, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th2) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            AFg1gSDK aFg1gSDK2 = AFg1gSDK.REFERRER;
                            StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb2.append(th2.getMessage());
                            aFLogger2.w(aFg1gSDK2, sb2.toString());
                        }
                    } else if (i11 == 1) {
                        AFi1hSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i11 == 2) {
                        AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFi1hSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i11 == 3) {
                        AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFi1hSDK.this.valueOf.put("response", "DEVELOPER_ERROR");
                    } else if (i11 != 4) {
                        AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "responseCode not found.");
                    } else {
                        AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFi1hSDK.this.valueOf.put("response", "PERMISSION_ERROR");
                    }
                    AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFi1hSDK.this.AFKeystoreWrapper();
                    build.endConnection();
                }

                public final void onGetAppsServiceDisconnected() {
                }
            });
        }
    }
}
