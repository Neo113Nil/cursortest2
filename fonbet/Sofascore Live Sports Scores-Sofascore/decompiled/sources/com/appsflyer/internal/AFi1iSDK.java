package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1iSDK implements AFi1jSDK {
    private static final BitSet i;
    final Handler AFKeystoreWrapper;
    final Object AFLogger;
    private boolean afErrorLog;
    private final Runnable afInfoLog;
    final Runnable d;
    private final Map<AFi1oSDK, AFi1oSDK> e;
    private final ExecutorService force;
    final Runnable registerClient;
    boolean unregisterClient;
    private final Map<AFi1oSDK, Map<String, Object>> v;
    private final SensorManager w;

    static {
        BitSet bitSet = new BitSet(6);
        i = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFi1iSDK(@NonNull SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.AFLogger = new Object();
        BitSet bitSet = i;
        this.e = new HashMap(bitSet.size());
        this.v = new ConcurrentHashMap(bitSet.size());
        this.d = new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1iSDK.this.AFLogger) {
                    AFi1iSDK.this.d();
                    AFi1iSDK aFi1iSDK = AFi1iSDK.this;
                    aFi1iSDK.AFKeystoreWrapper.postDelayed(aFi1iSDK.registerClient, 150L);
                    AFi1iSDK.this.unregisterClient = true;
                }
            }
        };
        this.registerClient = new t(this, 2);
        this.afInfoLog = new Runnable() { // from class: com.appsflyer.internal.AFi1iSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFi1iSDK.this.AFLogger) {
                    try {
                        AFi1iSDK aFi1iSDK = AFi1iSDK.this;
                        if (aFi1iSDK.unregisterClient) {
                            aFi1iSDK.AFKeystoreWrapper.removeCallbacks(aFi1iSDK.d);
                            AFi1iSDK aFi1iSDK2 = AFi1iSDK.this;
                            aFi1iSDK2.AFKeystoreWrapper.removeCallbacks(aFi1iSDK2.registerClient);
                            AFi1iSDK.this.AFLogger();
                            AFi1iSDK.this.unregisterClient = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.w = sensorManager;
        this.AFKeystoreWrapper = handler;
        this.force = executorService;
    }

    @NonNull
    private List<Map<String, Object>> e() {
        synchronized (this.AFLogger) {
            try {
                if (!this.e.isEmpty() && this.afErrorLog) {
                    Iterator<AFi1oSDK> it = this.e.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFKeystoreWrapper(this.v, false);
                    }
                }
                if (this.v.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.v.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void force() {
        try {
            if (!this.e.isEmpty()) {
                for (AFi1oSDK aFi1oSDK : this.e.values()) {
                    this.w.unregisterListener(aFi1oSDK);
                    aFi1oSDK.AFKeystoreWrapper(this.v, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "Error unregistering sensor listeners", th, false, false);
        }
        this.afErrorLog = false;
    }

    @NonNull
    private List<Map<String, Object>> i() {
        synchronized (this.AFLogger) {
            try {
                Iterator<AFi1oSDK> it = this.e.values().iterator();
                while (it.hasNext()) {
                    it.next().AFKeystoreWrapper(this.v, true);
                }
                if (this.v.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.v.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        try {
            for (Sensor sensor : this.w.getSensorList(-1)) {
                int type = sensor.getType();
                if (type >= 0 && i.get(type)) {
                    AFi1oSDK aFi1oSDK = new AFi1oSDK(sensor, this.force);
                    if (!this.e.containsKey(aFi1oSDK)) {
                        this.e.put(aFi1oSDK, aFi1oSDK);
                    }
                    this.w.registerListener(this.e.get(aFi1oSDK), sensor, 1, this.AFKeystoreWrapper);
                }
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.ANTI_FRAUD, "Error registering sensor listeners", th, false, false);
        }
        this.afErrorLog = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        synchronized (this.AFLogger) {
            this.AFKeystoreWrapper.post(new t(this, 1));
        }
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    @NonNull
    public final Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> e = e();
        if (!e.isEmpty()) {
            concurrentHashMap.put("sensors", e);
            return concurrentHashMap;
        }
        List<Map<String, Object>> i2 = i();
        if (!i2.isEmpty()) {
            concurrentHashMap.put("sensors", i2);
        }
        return concurrentHashMap;
    }

    public final void AFLogger() {
        this.AFKeystoreWrapper.post(new t(this, 1));
    }

    public final void d() {
        this.AFKeystoreWrapper.post(new t(this, 0));
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final void registerClient() {
        this.AFKeystoreWrapper.post(this.afInfoLog);
        this.AFKeystoreWrapper.post(this.d);
    }

    @Override // com.appsflyer.internal.AFi1jSDK
    public final synchronized void unregisterClient() {
        this.AFKeystoreWrapper.post(this.afInfoLog);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFi1iSDK(@NonNull Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
