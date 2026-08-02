package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1jSDK;
import com.appsflyer.internal.AFi1sSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* loaded from: classes.dex */
public class AFi1sSDK extends AFi1rSDK {

    @NonNull
    private final ExecutorService AFInAppEventType;
    public final Map<String, Object> values;

    /* renamed from: com.appsflyer.internal.AFi1sSDK$5, reason: invalid class name */
    /* loaded from: classes8.dex */
    final class AnonymousClass5 implements InstallReferrerStateListener {
        final /* synthetic */ Context val$context;
        final /* synthetic */ InstallReferrerClient val$referrerClient;

        AnonymousClass5(InstallReferrerClient installReferrerClient, Context context) {
            this.val$referrerClient = installReferrerClient;
            this.val$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInstallReferrerSetupFinished$0(InstallReferrerClient installReferrerClient, Context context, int i11) {
            AFi1sSDK.this.AFKeystoreWrapper(installReferrerClient, context, i11);
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerServiceDisconnected() {
            AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Install Referrer service disconnected");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public final void onInstallReferrerSetupFinished(final int i11) {
            ExecutorService executorService = AFi1sSDK.this.AFInAppEventType;
            final InstallReferrerClient installReferrerClient = this.val$referrerClient;
            final Context context = this.val$context;
            executorService.execute(new Runnable() { // from class: com.appsflyer.internal.w
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1sSDK.AnonymousClass5.this.lambda$onInstallReferrerSetupFinished$0(installReferrerClient, context, i11);
                }
            });
        }
    }

    public AFi1sSDK(@NonNull Runnable runnable, @NonNull ExecutorService executorService, @NonNull AFd1sSDK aFd1sSDK) {
        super("store", "google", aFd1sSDK, runnable);
        this.values = new HashMap();
        this.AFInAppEventType = executorService;
    }

    private boolean AFInAppEventType(@NonNull Context context) {
        if (!AFInAppEventType()) {
            return false;
        }
        try {
            if (AFb1uSDK.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Install referrer is allowed");
                return true;
            }
            AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e11) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e11);
            AFLogger.INSTANCE.v(AFg1gSDK.REFERRER, "Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1gSDK.REFERRER, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th2);
            return false;
        }
    }

    protected final void AFKeystoreWrapper(InstallReferrerClient installReferrerClient, Context context, int i11) {
        this.values.put("code", String.valueOf(i11));
        this.valueOf.put("api_ver", Long.valueOf(AFb1uSDK.values(context, "com.android.vending")));
        this.valueOf.put("api_ver_name", AFb1uSDK.AFKeystoreWrapper(context, "com.android.vending"));
        if (i11 == -1) {
            AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "InstallReferrer SERVICE_DISCONNECTED");
            this.valueOf.put("response", "SERVICE_DISCONNECTED");
        } else if (i11 == 0) {
            this.valueOf.put("response", DiscountCodeResponse.RESULT_OK);
            try {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1gSDK aFg1gSDK = AFg1gSDK.REFERRER;
                aFLogger.d(aFg1gSDK, "InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        this.values.put("val", installReferrer2);
                        this.valueOf.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    this.values.put("clk", Long.toString(referrerClickTimestampSeconds));
                    this.valueOf.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    this.values.put("install", Long.toString(installBeginTimestampSeconds));
                    this.valueOf.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    try {
                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                        this.values.put("instant", Boolean.valueOf(googlePlayInstantParam));
                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    } catch (NoSuchMethodError e11) {
                        AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e11);
                    }
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e12) {
                        AFLogger.INSTANCE.e(AFg1gSDK.REFERRER, "some method not exist", e12, false, false);
                    }
                    if (!hashMap.isEmpty()) {
                        this.valueOf.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    aFLogger.w(aFg1gSDK, "ReferrerClient: InstallReferrer is not ready");
                    this.values.put("err", "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (Throwable th2) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFg1gSDK aFg1gSDK2 = AFg1gSDK.REFERRER;
                StringBuilder sb2 = new StringBuilder("Failed to get install referrer: ");
                sb2.append(th2.getMessage());
                aFLogger2.w(aFg1gSDK2, sb2.toString());
                this.values.put("err", th2.getMessage());
                aFLogger2.e(aFg1gSDK2, "Failed to get install referrer", th2, false, false);
            }
        } else if (i11 == 1) {
            this.valueOf.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "InstallReferrer not supported");
        } else if (i11 == 2) {
            AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "InstallReferrer FEATURE_NOT_SUPPORTED");
            this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i11 != 3) {
            AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "responseCode not found.");
        } else {
            AFLogger.INSTANCE.w(AFg1gSDK.REFERRER, "InstallReferrer DEVELOPER_ERROR");
            this.valueOf.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Install Referrer collected locally");
        AFKeystoreWrapper();
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void valueOf(Context context) {
        if (AFInAppEventType(context)) {
            this.registerClient = System.currentTimeMillis();
            this.f57489d = AFi1jSDK.AFa1tSDK.STARTED;
            addObserver(new AFi1jSDK.AnonymousClass4());
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.INSTANCE.d(AFg1gSDK.REFERRER, "Connecting to Install Referrer Library...");
                build.startConnection(new AnonymousClass5(build, context));
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1gSDK.REFERRER, "referrerClient -> startConnection", th2);
            }
        }
    }
}
