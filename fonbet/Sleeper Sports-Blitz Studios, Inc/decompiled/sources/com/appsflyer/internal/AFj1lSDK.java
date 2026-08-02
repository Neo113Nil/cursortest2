package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
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

/* loaded from: classes6.dex */
public final class AFj1lSDK implements AFj1oSDK {
    private static final BitSet component4;
    final Handler AFAdRevenueData;
    private final Map<AFj1mSDK, AFj1mSDK> areAllFieldsValid;
    private final SensorManager component1;
    private final Map<AFj1mSDK, Map<String, Object>> component2;
    private final ExecutorService component3;
    private final Runnable copy;
    private boolean equals;
    boolean getCurrencyIso4217Code;
    final Object getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Runnable getRevenue;

    static {
        BitSet bitSet = new BitSet(6);
        component4 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void areAllFieldsValid() {
        synchronized (this.getMediationNetwork) {
            this.AFAdRevenueData.post(new AFj1lSDK$$ExternalSyntheticLambda1(this));
        }
    }

    private AFj1lSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMediationNetwork = new Object();
        BitSet bitSet = component4;
        this.areAllFieldsValid = new HashMap(bitSet.size());
        this.component2 = new ConcurrentHashMap(bitSet.size());
        this.getMonetizationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1lSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1lSDK.this.getMediationNetwork) {
                    AFj1lSDK.this.getCurrencyIso4217Code();
                    AFj1lSDK.this.AFAdRevenueData.postDelayed(AFj1lSDK.this.getRevenue, 150L);
                    AFj1lSDK.this.getCurrencyIso4217Code = true;
                }
            }
        };
        this.getRevenue = new Runnable() { // from class: com.appsflyer.internal.AFj1lSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1lSDK.this.areAllFieldsValid();
            }
        };
        this.copy = new Runnable() { // from class: com.appsflyer.internal.AFj1lSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1lSDK.this.getMediationNetwork) {
                    if (AFj1lSDK.this.getCurrencyIso4217Code) {
                        AFj1lSDK.this.AFAdRevenueData.removeCallbacks(AFj1lSDK.this.getMonetizationNetwork);
                        AFj1lSDK.this.AFAdRevenueData.removeCallbacks(AFj1lSDK.this.getRevenue);
                        AFj1lSDK.this.AFAdRevenueData();
                        AFj1lSDK.this.getCurrencyIso4217Code = false;
                    }
                }
            }
        };
        this.component1 = sensorManager;
        this.AFAdRevenueData = handler;
        this.component3 = executorService;
    }

    private static boolean getMonetizationNetwork(int i) {
        return i >= 0 && component4.get(i);
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final void getMonetizationNetwork() {
        this.AFAdRevenueData.post(this.copy);
        this.AFAdRevenueData.post(this.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final synchronized void getRevenue() {
        this.AFAdRevenueData.post(this.copy);
    }

    final void getCurrencyIso4217Code() {
        this.AFAdRevenueData.post(new Runnable() { // from class: com.appsflyer.internal.AFj1lSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1lSDK.this.component3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        try {
            for (Sensor sensor : this.component1.getSensorList(-1)) {
                if (getMonetizationNetwork(sensor.getType())) {
                    AFj1mSDK aFj1mSDK = new AFj1mSDK(sensor, this.component3);
                    if (!this.areAllFieldsValid.containsKey(aFj1mSDK)) {
                        this.areAllFieldsValid.put(aFj1mSDK, aFj1mSDK);
                    }
                    this.component1.registerListener(this.areAllFieldsValid.get(aFj1mSDK), sensor, 1, this.AFAdRevenueData);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.equals = true;
    }

    final void AFAdRevenueData() {
        this.AFAdRevenueData.post(new AFj1lSDK$$ExternalSyntheticLambda1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        try {
            if (!this.areAllFieldsValid.isEmpty()) {
                for (AFj1mSDK aFj1mSDK : this.areAllFieldsValid.values()) {
                    this.component1.unregisterListener(aFj1mSDK);
                    aFj1mSDK.getMonetizationNetwork(this.component2, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.equals = false;
    }

    private List<Map<String, Object>> component2() {
        synchronized (this.getMediationNetwork) {
            Iterator<AFj1mSDK> it = this.areAllFieldsValid.values().iterator();
            while (it.hasNext()) {
                it.next().getMonetizationNetwork(this.component2, true);
            }
            if (this.component2.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
            }
            return new CopyOnWriteArrayList(this.component2.values());
        }
    }

    private List<Map<String, Object>> component1() {
        synchronized (this.getMediationNetwork) {
            if (!this.areAllFieldsValid.isEmpty() && this.equals) {
                Iterator<AFj1mSDK> it = this.areAllFieldsValid.values().iterator();
                while (it.hasNext()) {
                    it.next().getMonetizationNetwork(this.component2, false);
                }
            }
            if (this.component2.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
            }
            return new CopyOnWriteArrayList(this.component2.values());
        }
    }

    @Override // com.appsflyer.internal.AFj1oSDK
    public final Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> component1 = component1();
        if (!component1.isEmpty()) {
            concurrentHashMap.put("sensors", component1);
            return concurrentHashMap;
        }
        List<Map<String, Object>> component2 = component2();
        if (!component2.isEmpty()) {
            concurrentHashMap.put("sensors", component2);
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1lSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
    }
}
