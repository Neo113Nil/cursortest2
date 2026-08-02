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

/* loaded from: classes5.dex */
public final class AFj1qSDK implements SensorEventListener {
    private final int AFAdRevenueData;
    private final Executor areAllFieldsValid;
    private long component2;
    private final float[][] component3 = new float[2][];
    private final long[] component4 = new long[2];
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private double getRevenue;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFj1qSDK(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.AFAdRevenueData = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.getCurrencyIso4217Code = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.areAllFieldsValid = executorService;
    }

    private static double AFAdRevenueData(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> getRevenue(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.areAllFieldsValid.execute(new Runnable() { // from class: com.appsflyer.internal.AFj1qSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFj1qSDK.this.E_(sensorEvent);
                }
            });
        } else {
            E_(sensorEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D_, reason: merged with bridge method [inline-methods] */
    public void E_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.component3;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.component4[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.component3[1] = copyOf;
            this.component4[1] = currentTimeMillis;
            this.getRevenue = AFAdRevenueData(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.component2) {
            this.component2 = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.component4[1] = currentTimeMillis;
                return;
            }
            double AFAdRevenueData = AFAdRevenueData(fArr3, fArr);
            if (AFAdRevenueData > this.getRevenue) {
                this.component3[1] = Arrays.copyOf(fArr, fArr.length);
                this.component4[1] = currentTimeMillis;
                this.getRevenue = AFAdRevenueData;
            }
        }
    }

    final void getMonetizationNetwork(Map<AFj1qSDK, Map<String, Object>> map, boolean z) {
        if (getMonetizationNetwork()) {
            map.put(this, getRevenue());
            if (z) {
                int length = this.component3.length;
                for (int i = 0; i < length; i++) {
                    this.component3[i] = null;
                }
                int length2 = this.component4.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.component4[i2] = 0;
                }
                this.getRevenue = 0.0d;
                this.component2 = 0L;
                return;
            }
            return;
        }
        if (map.containsKey(this)) {
            return;
        }
        map.put(this, getRevenue());
    }

    private boolean getMonetizationNetwork(int i, String str, String str2) {
        return this.AFAdRevenueData == i && this.getCurrencyIso4217Code.equals(str) && this.getMonetizationNetwork.equals(str2);
    }

    private Map<String, Object> getRevenue() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFAdRevenueData));
        concurrentHashMap.put("sN", this.getCurrencyIso4217Code);
        concurrentHashMap.put("sV", this.getMonetizationNetwork);
        float[] fArr = this.component3[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", getRevenue(fArr));
        }
        float[] fArr2 = this.component3[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", getRevenue(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean getMonetizationNetwork() {
        return this.component3[0] != null;
    }

    public final int hashCode() {
        return this.getMediationNetwork;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFj1qSDK)) {
            return false;
        }
        AFj1qSDK aFj1qSDK = (AFj1qSDK) obj;
        return getMonetizationNetwork(aFj1qSDK.AFAdRevenueData, aFj1qSDK.getCurrencyIso4217Code, aFj1qSDK.getMonetizationNetwork);
    }
}
