package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1iSDK;
import com.appsflyer.internal.AFj1ySDK;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.m;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class AFi1iSDK extends AFi1fSDK {
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getMediationNetwork;

    public AFi1iSDK(Runnable runnable, ExecutorService executorService, AFc1kSDK aFc1kSDK) {
        super(X3.i.U, AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, aFc1kSDK, runnable);
        this.getMediationNetwork = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    private boolean getMonetizationNetwork(Context context) {
        if (!getRevenue()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFj1nSDK.getMediationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFh1zSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat(String.valueOf("com.android.installreferrer.api.InstallReferrerClient")), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final void getRevenue(Context context) {
        if (getMonetizationNetwork(context)) {
            this.areAllFieldsValid = System.currentTimeMillis();
            this.component1 = AFj1ySDK.AFa1vSDK.STARTED;
            addObserver(new AFj1ySDK.AnonymousClass2());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass1(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFi1iSDK$1, reason: invalid class name */
    final class AnonymousClass1 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass1(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1iSDK.this.getMonetizationNetwork(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1iSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1iSDK.AnonymousClass1.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install Referrer service disconnected");
        }
    }

    protected final void getMonetizationNetwork(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.getMediationNetwork.put("code", String.valueOf(i));
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFj1nSDK.AFAdRevenueData(context, "com.android.vending")));
        this.AFAdRevenueData.put("api_ver_name", AFj1nSDK.getCurrencyIso4217Code(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFAdRevenueData.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.AFAdRevenueData.put("response", "OK");
            try {
                AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMediationNetwork.put("val", installReferrer2);
                        this.AFAdRevenueData.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMediationNetwork.put(m.n, Long.toString(referrerClickTimestampSeconds));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMediationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMediationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.AFAdRevenueData.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "ReferrerClient: InstallReferrer is not ready");
                    this.getMediationNetwork.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, new StringBuilder("Failed to get install referrer: ").append(th.getMessage()).toString());
                this.getMediationNetwork.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                AFLogger.INSTANCE.e(AFh1zSDK.REFERRER, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.AFAdRevenueData.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.AFAdRevenueData.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i == 3) {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.AFAdRevenueData.put("response", "DEVELOPER_ERROR");
        } else {
            AFLogger.INSTANCE.w(AFh1zSDK.REFERRER, "responseCode not found.");
        }
        AFLogger.INSTANCE.d(AFh1zSDK.REFERRER, "Install Referrer collected locally");
        getMonetizationNetwork();
    }
}
