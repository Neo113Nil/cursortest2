package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import defpackage.e58;
import defpackage.jvd;
import defpackage.l10;
import defpackage.lxf;
import defpackage.m58;
import defpackage.n58;
import defpackage.oxf;
import defpackage.u05;
import defpackage.vff;
import defpackage.wi3;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
/* loaded from: classes3.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, m58> allRcConfigMap;
    private final u05 cache;
    private final Executor executor;

    @Nullable
    private e58 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private vff firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final l10 logger = l10.c();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;

    private RemoteConfigManager() {
        this(u05.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(25000) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private m58 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        m58 m58Var = this.allRcConfigMap.get(str);
        if (((n58) m58Var).b != 2) {
            return null;
        }
        logger.a("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ((n58) m58Var).d(), str);
        return m58Var;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.e("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.a().addOnSuccessListener(this.executor, new oxf(this)).addOnFailureListener(this.executor, new oxf(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.b());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public jvd getBoolean(String str) {
        if (str == null) {
            logger.getClass();
            return new jvd();
        }
        m58 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new jvd(Boolean.valueOf(((n58) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                n58 n58Var = (n58) remoteConfigValue;
                if (!n58Var.d().isEmpty()) {
                    logger.a("Could not parse value: '%s' for key: '%s'.", n58Var.d(), str);
                }
            }
        }
        return new jvd();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public jvd getDouble(String str) {
        if (str == null) {
            logger.getClass();
            return new jvd();
        }
        m58 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new jvd(Double.valueOf(((n58) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                n58 n58Var = (n58) remoteConfigValue;
                if (!n58Var.d().isEmpty()) {
                    logger.a("Could not parse value: '%s' for key: '%s'.", n58Var.d(), str);
                }
            }
        }
        return new jvd();
    }

    public jvd getLong(String str) {
        if (str == null) {
            logger.getClass();
            return new jvd();
        }
        m58 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new jvd(Long.valueOf(((n58) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                n58 n58Var = (n58) remoteConfigValue;
                if (!n58Var.d().isEmpty()) {
                    logger.a("Could not parse value: '%s' for key: '%s'.", n58Var.d(), str);
                }
            }
        }
        return new jvd();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        m58 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(((n58) remoteConfigValue).a());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(((n58) remoteConfigValue).b());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) ((n58) remoteConfigValue).d();
                    }
                    T t2 = (T) ((n58) remoteConfigValue).d();
                    try {
                        logger.a("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        n58 n58Var = (n58) remoteConfigValue;
                        if (!n58Var.d().isEmpty()) {
                            logger.a("Could not parse value: '%s' for key: '%s'.", n58Var.d(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(((n58) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public jvd getString(String str) {
        if (str == null) {
            logger.getClass();
            return new jvd();
        }
        m58 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new jvd(((n58) remoteConfigValue).d()) : new jvd();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        vff vffVar;
        lxf lxfVar;
        if (this.firebaseRemoteConfig == null && (vffVar = this.firebaseRemoteConfigProvider) != null && (lxfVar = (lxf) vffVar.get()) != null) {
            this.firebaseRemoteConfig = lxfVar.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        e58 e58Var = this.firebaseRemoteConfig;
        return e58Var == null || e58Var.e().b == 1 || this.firebaseRemoteConfig.e().b == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable vff vffVar) {
        this.firebaseRemoteConfigProvider = vffVar;
    }

    public void syncConfigValues(Map<String, m58> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        wi3 Q = wi3.Q();
        ConcurrentHashMap<String, m58> concurrentHashMap = this.allRcConfigMap;
        Q.getClass();
        m58 m58Var = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (m58Var == null) {
            logger.getClass();
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ((n58) m58Var).a());
        } catch (Exception unused) {
            logger.getClass();
        }
    }

    public RemoteConfigManager(u05 u05Var, Executor executor, e58 e58Var, long j) {
        ConcurrentHashMap<String, m58> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = u05Var;
        this.executor = executor;
        this.firebaseRemoteConfig = e58Var;
        if (e58Var == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(e58Var.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
