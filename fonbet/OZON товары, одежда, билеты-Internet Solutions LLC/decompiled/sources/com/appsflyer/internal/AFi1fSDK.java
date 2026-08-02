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

/* loaded from: classes.dex */
public final class AFi1fSDK implements SensorEventListener {

    @NonNull
    private final String AFInAppEventParameterName;
    private final int AFInAppEventType;

    @NonNull
    private final String AFKeystoreWrapper;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final Executor f57488e;
    private long registerClient;
    private double valueOf;
    private final int values;

    /* renamed from: d, reason: collision with root package name */
    private final float[][] f57487d = new float[2][];
    private final long[] AFLogger = new long[2];

    AFi1fSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.AFInAppEventType = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFKeystoreWrapper = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFInAppEventParameterName = str;
        this.values = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.f57488e = executorService;
    }

    @NonNull
    private static List<Float> AFKeystoreWrapper(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f7 : fArr) {
            arrayList.add(Float.valueOf(f7));
        }
        return arrayList;
    }

    private static double valueOf(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d11 = 0.0d;
        for (int i11 = 0; i11 < min; i11++) {
            d11 += StrictMath.pow(fArr[i11] - fArr2[i11], 2.0d);
        }
        return Math.sqrt(d11);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFi1fSDK)) {
            return false;
        }
        AFi1fSDK aFi1fSDK = (AFi1fSDK) obj;
        return values(aFi1fSDK.AFInAppEventType, aFi1fSDK.AFKeystoreWrapper, aFi1fSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return this.values;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f57488e.execute(new Runnable() { // from class: com.appsflyer.internal.q
                @Override // java.lang.Runnable
                public final void run() {
                    AFi1fSDK.this.AFInAppEventParameterName(sensorEvent);
                }
            });
        } else {
            AFInAppEventParameterName(sensorEvent);
        }
    }

    final void values(@NonNull Map<AFi1fSDK, Map<String, Object>> map, boolean z11) {
        if (!values()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFInAppEventParameterName());
            return;
        }
        map.put(this, AFInAppEventParameterName());
        if (z11) {
            int length = this.f57487d.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f57487d[i11] = null;
            }
            int length2 = this.AFLogger.length;
            for (int i12 = 0; i12 < length2; i12++) {
                this.AFLogger[i12] = 0;
            }
            this.valueOf = 0.0d;
            this.registerClient = 0L;
        }
    }

    @NonNull
    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFInAppEventType));
        concurrentHashMap.put("sN", this.AFKeystoreWrapper);
        concurrentHashMap.put("sV", this.AFInAppEventParameterName);
        float[] fArr = this.f57487d[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFKeystoreWrapper(fArr));
        }
        float[] fArr2 = this.f57487d[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFKeystoreWrapper(fArr2));
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public void AFInAppEventParameterName(SensorEvent sensorEvent) {
        long j11 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.f57487d;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFLogger[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.f57487d[1] = copyOf;
            this.AFLogger[1] = currentTimeMillis;
            this.valueOf = valueOf(fArr3, copyOf);
            return;
        }
        if (50000000 <= j11 - this.registerClient) {
            this.registerClient = j11;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFLogger[1] = currentTimeMillis;
                return;
            }
            double valueOf = valueOf(fArr3, fArr);
            if (valueOf > this.valueOf) {
                this.f57487d[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFLogger[1] = currentTimeMillis;
                this.valueOf = valueOf;
            }
        }
    }

    private boolean values(int i11, @NonNull String str, @NonNull String str2) {
        return this.AFInAppEventType == i11 && this.AFKeystoreWrapper.equals(str) && this.AFInAppEventParameterName.equals(str2);
    }

    private boolean values() {
        return this.f57487d[0] != null;
    }
}
