package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public final class AFj1mSDK implements SensorEventListener {
    private final int AFAdRevenueData;
    private final Executor component1;
    private long component2;
    private double getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private final String getRevenue;
    private final float[][] component4 = new float[2][];
    private final long[] areAllFieldsValid = new long[2];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFj1mSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.getMediationNetwork = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getMonetizationNetwork = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getRevenue = str;
        this.AFAdRevenueData = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.component1 = executorService;
    }

    private static double AFAdRevenueData(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> getMediationNetwork(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.component1.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1mSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1mSDK.this.G_(sensorEvent);
                }
            });
        } else {
            G_(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F_, reason: merged with bridge method [inline-methods] */
    public void G_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component4;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.areAllFieldsValid[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component4[1] = copyOf;
            this.areAllFieldsValid[1] = currentTimeMillis;
            this.getCurrencyIso4217Code = AFAdRevenueData(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.component2) {
            this.component2 = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.areAllFieldsValid[1] = currentTimeMillis;
                return;
            }
            double AFAdRevenueData = AFAdRevenueData(fArr3, fArr);
            if (AFAdRevenueData > this.getCurrencyIso4217Code) {
                this.component4[1] = Arrays.copyOf(fArr, fArr.length);
                this.areAllFieldsValid[1] = currentTimeMillis;
                this.getCurrencyIso4217Code = AFAdRevenueData;
            }
        }
    }

    final void getMonetizationNetwork(Map<AFj1mSDK, Map<String, Object>> map, boolean z) {
        if (getMonetizationNetwork()) {
            map.put(this, getCurrencyIso4217Code());
            if (z) {
                int length = this.component4.length;
                for (int i = 0; i < length; i++) {
                    this.component4[i] = null;
                }
                int length2 = this.areAllFieldsValid.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.areAllFieldsValid[i2] = 0;
                }
                this.getCurrencyIso4217Code = 0.0d;
                this.component2 = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, getCurrencyIso4217Code());
    }

    private boolean getMonetizationNetwork(int i, String str, String str2) {
        return this.getMediationNetwork == i && this.getMonetizationNetwork.equals(str) && this.getRevenue.equals(str2);
    }

    private Map<String, Object> getCurrencyIso4217Code() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.getMediationNetwork));
        concurrentHashMap.put("sN", this.getMonetizationNetwork);
        concurrentHashMap.put("sV", this.getRevenue);
        float[] fArr = this.component4[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getMediationNetwork(fArr));
        }
        float[] fArr2 = this.component4[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getMediationNetwork(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork() {
        return this.component4[0] != null;
    }

    public final int hashCode() {
        return this.AFAdRevenueData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1mSDK)) {
            return false;
        }
        AFj1mSDK aFj1mSDK = (AFj1mSDK) obj;
        return getMonetizationNetwork(aFj1mSDK.getMediationNetwork, aFj1mSDK.getMonetizationNetwork, aFj1mSDK.getRevenue);
    }
}
