package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1ySDK;
import com.ironsource.X3;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class AFj1sSDK extends AFi1fSDK {
    public AFj1sSDK(AFc1kSDK aFc1kSDK, Runnable runnable) {
        super(X3.i.U, "xiaomi", aFc1kSDK, runnable);
    }

    private boolean getCurrencyIso4217Code() {
        if (!getRevenue()) {
            return false;
        }
        try {
            Class.forName("com.miui.referrer.api.GetAppsReferrerClient");
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Xiaomi Install Referrer is allowed");
            return true;
        } catch (ClassNotFoundException unused) {
            AFLogger.INSTANCE.v(AFh1zSDK.REFERRER, "Class com.miui.referrer.api.GetAppsReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "An error occurred while trying to access GetAppsReferrerClient", th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(final Context context) {
        if (getCurrencyIso4217Code()) {
            this.areAllFieldsValid = System.currentTimeMillis();
            this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
            addObserver(new AFj1ySDK.AnonymousClass2());
            final GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(context).build();
            build.startConnection(new GetAppsReferrerStateListener() { // from class: com.appsflyer.internal.AFj1sSDK.2
                public final void onGetAppsServiceDisconnected() {
                }

                public final void onGetAppsReferrerSetupFinished(int i) {
                    AFj1sSDK.this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, "com.xiaomi.mipicks")));
                    AFj1sSDK.this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, "com.xiaomi.mipicks"));
                    if (i == -1) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "SERVICE_DISCONNECTED");
                    } else if (i == 0) {
                        AFj1sSDK aFj1sSDK = AFj1sSDK.this;
                        GetAppsReferrerClient getAppsReferrerClient = build;
                        aFj1sSDK.AFAdRevenueData.put("response", "OK");
                        try {
                            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "XiaomiInstallReferrer connected");
                            if (getAppsReferrerClient.isReady()) {
                                GetAppsReferrerDetails installReferrer = getAppsReferrerClient.getInstallReferrer();
                                String installReferrer2 = installReferrer.getInstallReferrer();
                                if (installReferrer2 != null) {
                                    aFj1sSDK.AFAdRevenueData.put("referrer", installReferrer2);
                                }
                                aFj1sSDK.AFAdRevenueData.put("click_ts", Long.valueOf(installReferrer.getReferrerClickTimestampSeconds()));
                                aFj1sSDK.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installReferrer.getInstallBeginTimestampSeconds()));
                                HashMap hashMap = new HashMap();
                                hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                hashMap.put("install_version", installReferrer.getInstallVersion());
                                aFj1sSDK.AFAdRevenueData.put("xiaomi_custom", hashMap);
                            } else {
                                AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                            }
                        } catch (Throwable th) {
                            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, new StringBuilder("Failed to get Xiaomi install referrer: ").append(th.getMessage()).toString());
                        }
                    } else if (i == 1) {
                        AFj1sSDK.this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer not supported");
                    } else if (i == 2) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
                    } else if (i == 3) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
                    } else if (i == 4) {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "XiaomiInstallReferrer DEVELOPER_ERROR");
                        AFj1sSDK.this.AFAdRevenueData.put("response", "PERMISSION_ERROR");
                    } else {
                        AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "responseCode not found.");
                    }
                    AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Xiaomi Install Referrer collected locally");
                    AFj1sSDK.this.getMonetizationNetwork();
                    build.endConnection();
                }
            });
        }
    }
}
