package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import com.safedk.android.analytics.events.RedirectEvent;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public final class AFj1uSDK implements AFj1rSDK {
    private static final BitSet component4;
    final Runnable AFAdRevenueData;
    private final SensorManager areAllFieldsValid;
    private final ExecutorService component1;
    private final Map<AFj1qSDK, Map<String, Object>> component2;
    private final Map<AFj1qSDK, AFj1qSDK> component3;
    boolean getCurrencyIso4217Code;
    final Runnable getMediationNetwork;
    final Object getMonetizationNetwork;
    final Handler getRevenue;
    private boolean hashCode;
    private final Runnable toString;

    static {
        BitSet bitSet = new BitSet(6);
        component4 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        synchronized (this.getMonetizationNetwork) {
            this.getRevenue.post(new AFj1uSDK$$ExternalSyntheticLambda1(this));
        }
    }

    private AFj1uSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMonetizationNetwork = new Object();
        BitSet bitSet = component4;
        this.component3 = new HashMap(bitSet.size());
        this.component2 = new ConcurrentHashMap(bitSet.size());
        this.AFAdRevenueData = new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1uSDK.this.getMonetizationNetwork) {
                    AFj1uSDK.this.AFAdRevenueData();
                    AFj1uSDK.this.getRevenue.postDelayed(AFj1uSDK.this.getMediationNetwork, 150L);
                    AFj1uSDK.this.getCurrencyIso4217Code = true;
                }
            }
        };
        this.getMediationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.component1();
            }
        };
        this.toString = new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1uSDK.this.getMonetizationNetwork) {
                    if (AFj1uSDK.this.getCurrencyIso4217Code) {
                        AFj1uSDK.this.getRevenue.removeCallbacks(AFj1uSDK.this.AFAdRevenueData);
                        AFj1uSDK.this.getRevenue.removeCallbacks(AFj1uSDK.this.getMediationNetwork);
                        AFj1uSDK.this.getMonetizationNetwork();
                        AFj1uSDK.this.getCurrencyIso4217Code = false;
                    }
                }
            }
        };
        this.areAllFieldsValid = sensorManager;
        this.getRevenue = handler;
        this.component1 = executorService;
    }

    private static boolean getRevenue(int i) {
        return i >= 0 && component4.get(i);
    }

    @Override // com.appsflyer.internal.AFj1rSDK
    public final void getMediationNetwork() {
        this.getRevenue.post(this.toString);
        this.getRevenue.post(this.AFAdRevenueData);
    }

    @Override // com.appsflyer.internal.AFj1rSDK
    public final synchronized void getCurrencyIso4217Code() {
        this.getRevenue.post(this.toString);
    }

    final void AFAdRevenueData() {
        this.getRevenue.post(new Runnable() { // from class: com.appsflyer.internal.AFj1uSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFj1uSDK.this.component3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component3() {
        try {
            for (Sensor sensor : this.areAllFieldsValid.getSensorList(-1)) {
                if (getRevenue(sensor.getType())) {
                    AFj1qSDK aFj1qSDK = new AFj1qSDK(sensor, this.component1);
                    if (!this.component3.containsKey(aFj1qSDK)) {
                        this.component3.put(aFj1qSDK, aFj1qSDK);
                    }
                    this.areAllFieldsValid.registerListener(this.component3.get(aFj1qSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.hashCode = true;
    }

    final void getMonetizationNetwork() {
        this.getRevenue.post(new AFj1uSDK$$ExternalSyntheticLambda1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2() {
        try {
            if (!this.component3.isEmpty()) {
                for (AFj1qSDK aFj1qSDK : this.component3.values()) {
                    this.areAllFieldsValid.unregisterListener(aFj1qSDK);
                    aFj1qSDK.getMonetizationNetwork(this.component2, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.hashCode = false;
    }

    private List<Map<String, Object>> component4() {
        synchronized (this.getMonetizationNetwork) {
            Iterator<AFj1qSDK> it = this.component3.values().iterator();
            while (it.hasNext()) {
                it.next().getMonetizationNetwork(this.component2, true);
            }
            if (this.component2.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.component2.values());
        }
    }

    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getMonetizationNetwork) {
            if (!this.component3.isEmpty() && this.hashCode) {
                Iterator<AFj1qSDK> it = this.component3.values().iterator();
                while (it.hasNext()) {
                    it.next().getMonetizationNetwork(this.component2, false);
                }
            }
            if (this.component2.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.component2.values());
        }
    }

    @Override // com.appsflyer.internal.AFj1rSDK
    public final Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> areAllFieldsValid = areAllFieldsValid();
        if (!areAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", areAllFieldsValid);
            return concurrentHashMap;
        }
        List<Map<String, Object>> component42 = component4();
        if (!component42.isEmpty()) {
            concurrentHashMap.put("sensors", component42);
        }
        return concurrentHashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFj1uSDK(Context context, ExecutorService executorService) {
        this(r3, new Handler(r0.getLooper()), executorService);
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread(RedirectEvent.i);
        handlerThread.start();
    }
}
