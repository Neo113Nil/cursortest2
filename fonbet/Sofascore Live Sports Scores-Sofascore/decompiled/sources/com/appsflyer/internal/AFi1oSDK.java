package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFi1oSDK implements SensorEventListener {

    @NonNull
    private final String AFKeystoreWrapper;
    private final int AFLogger;

    @NonNull
    private final String d;

    @NonNull
    private final Executor force;
    private final int registerClient;
    private double unregisterClient;
    private long v;
    private final float[][] w = new float[2][];
    private final long[] i = new long[2];

    public AFi1oSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.registerClient = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFKeystoreWrapper = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.d = str;
        this.AFLogger = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.force = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K_, reason: merged with bridge method [inline-methods] */
    public void L_(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.w;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.i[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.w[1] = copyOf;
            this.i[1] = currentTimeMillis;
            this.unregisterClient = AFKeystoreWrapper(fArr3, copyOf);
            return;
        }
        if (50000000 <= j - this.v) {
            this.v = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.i[1] = currentTimeMillis;
                return;
            }
            double AFKeystoreWrapper = AFKeystoreWrapper(fArr3, fArr);
            if (AFKeystoreWrapper > this.unregisterClient) {
                this.w[1] = Arrays.copyOf(fArr, fArr.length);
                this.i[1] = currentTimeMillis;
                this.unregisterClient = AFKeystoreWrapper;
            }
        }
    }

    @NonNull
    private Map<String, Object> unregisterClient() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.registerClient));
        concurrentHashMap.put("sN", this.AFKeystoreWrapper);
        concurrentHashMap.put("sV", this.d);
        float[] fArr = this.w[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFKeystoreWrapper(fArr));
        }
        float[] fArr2 = this.w[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFKeystoreWrapper(fArr2));
        }
        return concurrentHashMap;
    }

    public final void AFKeystoreWrapper(@NonNull Map<AFi1oSDK, Map<String, Object>> map, boolean z) {
        if (this.w[0] == null) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, unregisterClient());
            return;
        }
        map.put(this, unregisterClient());
        if (z) {
            int length = this.w.length;
            for (int i = 0; i < length; i++) {
                this.w[i] = null;
            }
            int length2 = this.i.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.i[i2] = 0;
            }
            this.unregisterClient = 0.0d;
            this.v = 0L;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFi1oSDK) {
            AFi1oSDK aFi1oSDK = (AFi1oSDK) obj;
            int i = aFi1oSDK.registerClient;
            String str = aFi1oSDK.AFKeystoreWrapper;
            String str2 = aFi1oSDK.d;
            if (this.registerClient == i && this.AFKeystoreWrapper.equals(str) && this.d.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.AFLogger;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.force.execute(new n(3, this, sensorEvent));
        } else {
            L_(sensorEvent);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @NonNull
    private static List<Float> AFKeystoreWrapper(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    private static double AFKeystoreWrapper(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }
}
