package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.provider.FirebasePerfProvider;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.ckr;
import xsna.f9e0;
import xsna.kt80;
import xsna.kyi;
import xsna.ra2;
import xsna.v5m;
import xsna.yuf0;
import xsna.zjr;

@Keep
/* loaded from: classes13.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, ckr> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final v5m cache;
    private final Executor executor;

    @Nullable
    private zjr firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private f9e0<yuf0> firebaseRemoteConfigProvider;
    private static final ra2 logger = ra2.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    private RemoteConfigManager() {
        this(v5m.b(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, new Random().nextInt(25000) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private ckr getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        ckr ckrVar = this.allRcConfigMap.get(str);
        if (ckrVar.t() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ckrVar.f(), str);
        return ckrVar;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.a().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: xsna.avf0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: xsna.bvf0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                RemoteConfigManager.this.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
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

    public kt80<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a();
            return new kt80<>();
        }
        ckr remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new kt80<>(Boolean.valueOf(remoteConfigValue.g()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.f().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.f(), str);
                }
            }
        }
        return new kt80<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public kt80<Float> getFloat(String str) {
        if (str == null) {
            logger.a();
            return new kt80<>();
        }
        ckr remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new kt80<>(Float.valueOf(Double.valueOf(remoteConfigValue.h()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.f().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.f(), str);
                }
            }
        }
        return new kt80<>();
    }

    public kt80<Long> getLong(String str) {
        if (str == null) {
            logger.a();
            return new kt80<>();
        }
        ckr remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new kt80<>(Long.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.f().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.f(), str);
                }
            }
        }
        return new kt80<>();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        ckr remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(remoteConfigValue.g());
                }
                if (t instanceof Float) {
                    return (T) Float.valueOf(Double.valueOf(remoteConfigValue.h()).floatValue());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) remoteConfigValue.f();
                    }
                    T t2 = (T) remoteConfigValue.f();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        if (!remoteConfigValue.f().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.f(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(remoteConfigValue.e());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public kt80<String> getString(String str) {
        if (str == null) {
            logger.a();
            return new kt80<>();
        }
        ckr remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new kt80<>(remoteConfigValue.f()) : new kt80<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        f9e0<yuf0> f9e0Var;
        yuf0 yuf0Var;
        if (this.firebaseRemoteConfig == null && (f9e0Var = this.firebaseRemoteConfigProvider) != null && (yuf0Var = f9e0Var.get()) != null) {
            this.firebaseRemoteConfig = yuf0Var.a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        int i;
        zjr zjrVar = this.firebaseRemoteConfig;
        if (zjrVar != null) {
            c cVar = zjrVar.g;
            synchronized (cVar.b) {
                try {
                    cVar.a.getLong("last_fetch_time_in_millis", -1L);
                    i = cVar.a.getInt("last_fetch_status", 0);
                    int[] iArr = b.j;
                    long j = cVar.a.getLong("fetch_timeout_in_seconds", 60L);
                    if (j < 0) {
                        throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                    }
                    long j2 = cVar.a.getLong("minimum_fetch_interval_in_seconds", b.i);
                    if (j2 < 0) {
                        throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                    }
                } finally {
                }
            }
            if (i != 1) {
                return false;
            }
        }
        return true;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable f9e0<yuf0> f9e0Var) {
        this.firebaseRemoteConfigProvider = f9e0Var;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, ckr> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        kyi r = kyi.r();
        ConcurrentHashMap<String, ckr> concurrentHashMap = this.allRcConfigMap;
        r.getClass();
        ckr ckrVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (ckrVar == null) {
            logger.a();
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ckrVar.g());
        } catch (Exception unused) {
            logger.a();
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(v5m v5mVar, Executor executor, zjr zjrVar, long j) {
        ConcurrentHashMap<String, ckr> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = v5mVar;
        this.executor = executor;
        this.firebaseRemoteConfig = zjrVar;
        if (zjrVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(zjrVar.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = TimeUnit.MICROSECONDS.toMillis(FirebasePerfProvider.getAppStartTime().b);
        this.appStartConfigFetchDelayInMs = j;
    }
}
