package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1eSDK;
import com.appsflyer.internal.AFj1qSDK;
import io.sentry.protocol.Response;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public class AFi1eSDK extends AFi1bSDK {
    final ExecutorService getCurrencyIso4217Code;
    public final Map<String, Object> getMonetizationNetwork;

    public AFi1eSDK(Runnable runnable, ExecutorService executorService, AFd1rSDK aFd1rSDK) {
        super("store", "google", aFd1rSDK, runnable);
        this.getMonetizationNetwork = new HashMap();
        this.getCurrencyIso4217Code = executorService;
    }

    private boolean getMediationNetwork(Context context) {
        if (!AFAdRevenueData()) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFb1qSDK.getMonetizationNetwork(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.INSTANCE.v(AFh1xSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFh1xSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFj1qSDK
    public final void getMonetizationNetwork(Context context) {
        if (getMediationNetwork(context)) {
            this.component4 = System.currentTimeMillis();
            this.component2 = AFj1qSDK.AFa1vSDK.STARTED;
            addObserver(new AFj1qSDK.AnonymousClass3());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass4(build, context));
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1xSDK.REFERRER, "referrerClient -> startConnection", th);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFi1eSDK$4, reason: invalid class name */
    final class AnonymousClass4 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass4(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i) {
            AFi1eSDK.this.AFAdRevenueData(installReferrerClient, context, i);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i) {
            ExecutorService executorService = AFi1eSDK.this.getCurrencyIso4217Code;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.AFi1eSDK$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1eSDK.AnonymousClass4.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i);
                }
            });
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Install Referrer service disconnected");
        }
    }

    protected final void AFAdRevenueData(InstallReferrerClient installReferrerClient, Context context, int i) {
        this.getMonetizationNetwork.put("code", String.valueOf(i));
        this.AFAdRevenueData.put("api_ver", Long.valueOf(AFb1qSDK.AFAdRevenueData(context, "com.android.vending")));
        this.AFAdRevenueData.put("api_ver_name", AFb1qSDK.getMediationNetwork(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.AFAdRevenueData.put(Response.TYPE, "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            this.AFAdRevenueData.put(Response.TYPE, "OK");
            try {
                AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.getMonetizationNetwork.put("val", installReferrer2);
                        this.AFAdRevenueData.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.getMonetizationNetwork.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.AFAdRevenueData.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.getMonetizationNetwork.put("install", Long.toString(installBeginTimestampSeconds));
                    this.AFAdRevenueData.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.getMonetizationNetwork.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e2) {
                        AFLogger.INSTANCE.e(AFh1xSDK.REFERRER, "some method not exist", e2, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.AFAdRevenueData.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "ReferrerClient: InstallReferrer is not ready");
                    this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK = AFh1xSDK.REFERRER;
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                aFLogger.w(aFh1xSDK, sb.toString());
                this.getMonetizationNetwork.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                AFLogger.INSTANCE.e(AFh1xSDK.REFERRER, "Failed to get install referrer", th, false, false);
            }
        } else if (i == 1) {
            this.AFAdRevenueData.put(Response.TYPE, "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.AFAdRevenueData.put(Response.TYPE, "FEATURE_NOT_SUPPORTED");
        } else if (i == 3) {
            AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.AFAdRevenueData.put(Response.TYPE, "DEVELOPER_ERROR");
        } else {
            AFLogger.INSTANCE.w(AFh1xSDK.REFERRER, "responseCode not found.");
        }
        AFLogger.INSTANCE.d(AFh1xSDK.REFERRER, "Install Referrer collected locally");
        getRevenue();
    }
}
