package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1qSDK;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import io.sentry.protocol.Response;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class AFj1rSDK extends AFi1bSDK {
    public AFj1rSDK(AFd1rSDK aFd1rSDK, Runnable runnable) {
        super("store", "xiaomi", aFd1rSDK, runnable);
    }

    private boolean getMediationNetwork() {
        if (!AFAdRevenueData()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFh1xSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork(final Context context) {
        if (getMediationNetwork()) {
            this.component4 = System.currentTimeMillis();
            this.component2 = AFj1qSDK.AFa1vSDK.STARTED;
            addObserver(new AFj1qSDK.AnonymousClass3());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1rSDK.5
                public final void onGetAppsServiceDisconnected() {
                }

                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFj1rSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1rSDK.this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1rSDK.this.AFAdRevenueData.put(Response.TYPE, "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFj1rSDK aFj1rSDK = AFj1rSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFj1rSDK.AFAdRevenueData.put(Response.TYPE, "OK");
                        try {
                            AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1rSDK.AFAdRevenueData.put("referrer", installReferrer2);
                                }
                                aFj1rSDK.AFAdRevenueData.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1rSDK.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFj1rSDK.AFAdRevenueData.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger aFLogger = AFLogger.INSTANCE;
                            AFh1xSDK aFh1xSDK = AFh1xSDK.REFERRER;
                            StringBuilder sb = new StringBuilder("Failed to get Xiaomi install referrer: ");
                            sb.append(th.getMessage());
                            aFLogger.w(aFh1xSDK, sb.toString());
                        }
                    } else if (i == 1) {
                        AFj1rSDK.this.AFAdRevenueData.put(Response.TYPE, "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1rSDK.this.AFAdRevenueData.put(Response.TYPE, "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1rSDK.this.AFAdRevenueData.put(Response.TYPE, "DEVELOPER_ERROR");
                    } else if (i == 4) {
                        AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1rSDK.this.AFAdRevenueData.put(Response.TYPE, "PERMISSION_ERROR");
                    } else {
                        AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "responseCode not found.");
                    }
                    AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1rSDK.this.getRevenue();
                    build.endConnection();
                }
            });
        }
    }
}
