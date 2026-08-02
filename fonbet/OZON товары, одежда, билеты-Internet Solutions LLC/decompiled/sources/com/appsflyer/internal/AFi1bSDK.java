package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.activity.RunnableC5048o;
import androidx.annotation.NonNull;
import androidx.compose.ui.platform.RunnableC5273p;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class AFi1bSDK implements AFi1dSDK {
    private static final BitSet AFKeystoreWrapper;
    private final Handler AFInAppEventParameterName;
    private final ExecutorService AFInAppEventType;
    private final Runnable AFLogger;
    private final Runnable afInfoLog;

    /* renamed from: d, reason: collision with root package name */
    private boolean f57482d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<AFi1fSDK, Map<String, Object>> f57483e;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f57484i;
    private final Map<AFi1fSDK, AFi1fSDK> registerClient;
    private boolean unregisterClient;
    private final Object valueOf;
    private final SensorManager values;

    static {
        BitSet bitSet = new BitSet(6);
        AFKeystoreWrapper = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFi1bSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.valueOf = new Object();
        BitSet bitSet = AFKeystoreWrapper;
        this.registerClient = new HashMap(bitSet.size());
        this.f57483e = new ConcurrentHashMap(bitSet.size());
        this.AFLogger = new Runnable() { // from class: com.appsflyer.internal.AFi1bSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1bSDK.this.valueOf) {
                    AFi1bSDK.this.valueOf();
                    AFi1bSDK.this.AFInAppEventParameterName.postDelayed(AFi1bSDK.this.afInfoLog, 150L);
                    AFi1bSDK.this.f57482d = true;
                }
            }
        };
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                AFi1bSDK.this.registerClient();
            }
        };
        this.f57484i = new Runnable() { // from class: com.appsflyer.internal.AFi1bSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1bSDK.this.valueOf) {
                    try {
                        if (AFi1bSDK.this.f57482d) {
                            AFi1bSDK.this.AFInAppEventParameterName.removeCallbacks(AFi1bSDK.this.AFLogger);
                            AFi1bSDK.this.AFInAppEventParameterName.removeCallbacks(AFi1bSDK.this.afInfoLog);
                            AFi1bSDK.this.AFInAppEventType();
                            AFi1bSDK.this.f57482d = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
        this.values = sensorManager;
        this.AFInAppEventParameterName = handler;
        this.AFInAppEventType = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger() {
        try {
            for (Sensor sensor : this.values.getSensorList(-1)) {
                if (values(sensor.getType())) {
                    AFi1fSDK aFi1fSDK = new AFi1fSDK(sensor, this.AFInAppEventType);
                    if (!this.registerClient.containsKey(aFi1fSDK)) {
                        this.registerClient.put(aFi1fSDK, aFi1fSDK);
                    }
                    this.values.registerListener(this.registerClient.get(aFi1fSDK), sensor, 1, this.AFInAppEventParameterName);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th2);
        }
        this.unregisterClient = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        try {
            if (!this.registerClient.isEmpty()) {
                for (AFi1fSDK aFi1fSDK : this.registerClient.values()) {
                    this.values.unregisterListener(aFi1fSDK);
                    aFi1fSDK.values(this.f57483e, true);
                }
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th2);
        }
        this.unregisterClient = false;
    }

    @NonNull
    private List<Map<String, Object>> e() {
        synchronized (this.valueOf) {
            try {
                Iterator<AFi1fSDK> it = this.registerClient.values().iterator();
                while (it.hasNext()) {
                    it.next().values(this.f57483e, true);
                }
                if (this.f57483e.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.f57483e.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void registerClient() {
        synchronized (this.valueOf) {
            this.AFInAppEventParameterName.post(new RunnableC5048o(this, 1));
        }
    }

    @NonNull
    private List<Map<String, Object>> unregisterClient() {
        synchronized (this.valueOf) {
            try {
                if (!this.registerClient.isEmpty() && this.unregisterClient) {
                    Iterator<AFi1fSDK> it = this.registerClient.values().iterator();
                    while (it.hasNext()) {
                        it.next().values(this.f57483e, false);
                    }
                }
                if (this.f57483e.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.f57483e.values());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean values(int i11) {
        return i11 >= 0 && AFKeystoreWrapper.get(i11);
    }

    @Override // com.appsflyer.internal.AFi1dSDK
    public final void AFInAppEventParameterName() {
        this.AFInAppEventParameterName.post(this.f57484i);
        this.AFInAppEventParameterName.post(this.AFLogger);
    }

    final void AFInAppEventType() {
        this.AFInAppEventParameterName.post(new RunnableC5048o(this, 1));
    }

    final void valueOf() {
        this.AFInAppEventParameterName.post(new RunnableC5273p(this, 1));
    }

    @Override // com.appsflyer.internal.AFi1dSDK
    @NonNull
    public final Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> unregisterClient = unregisterClient();
        if (!unregisterClient.isEmpty()) {
            concurrentHashMap.put("sensors", unregisterClient);
            return concurrentHashMap;
        }
        List<Map<String, Object>> e11 = e();
        if (!e11.isEmpty()) {
            concurrentHashMap.put("sensors", e11);
        }
        return concurrentHashMap;
    }

    @Override // com.appsflyer.internal.AFi1dSDK
    public final synchronized void values() {
        this.AFInAppEventParameterName.post(this.f57484i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1bSDK(@NonNull Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
