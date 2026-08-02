package io.radar.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: RadarSensorsManager.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lio/radar/sdk/RadarSensorsManager;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SYNC_INTERVAL_MS", "", "lastSyncTime", "pressure", "Landroid/hardware/Sensor;", "sensorManager", "Landroid/hardware/SensorManager;", "shortTermSize", "", "shortTermWindow", "", "", "userAgent", "", "onAccuracyChanged", "", "sensor", "accuracy", "onPause", "onResume", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarSensorsManager implements SensorEventListener {
    private final long SYNC_INTERVAL_MS;
    private final Context context;
    private long lastSyncTime;
    private Sensor pressure;
    private SensorManager sensorManager;
    private final int shortTermSize;
    private final List<Float> shortTermWindow;
    private final String userAgent;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0099, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RadarSensorsManager(Context context) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shortTermWindow = new ArrayList();
        this.shortTermSize = 50;
        this.userAgent = "RadarSDK/Android/4.0.0";
        this.SYNC_INTERVAL_MS = 2000L;
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.pressure = sensorManager.getDefaultSensor(6);
        RadarLogger.d$default(Radar.INSTANCE.getLogger$sdk_release(), "SensorManager initialized: " + this.sensorManager, null, null, 6, null);
        RadarLogger logger$sdk_release = Radar.INSTANCE.getLogger$sdk_release();
        StringBuilder sb = new StringBuilder("Pressure sensor: ");
        Sensor sensor = this.pressure;
        if (sensor != null) {
            str = "Found - Name: " + sensor.getName() + ", Vendor: " + sensor.getVendor() + ", Power: " + sensor.getPower() + ", Resolution: " + sensor.getResolution();
        }
        str = "Not available on device";
        sb.append(str);
        RadarLogger.d$default(logger$sdk_release, sb.toString(), null, null, 6, null);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float f = event.values[0];
        int i = event.accuracy;
        long currentTimeMillis = System.currentTimeMillis();
        this.shortTermWindow.add(Float.valueOf(f));
        if (this.shortTermWindow.size() > this.shortTermSize) {
            this.shortTermWindow.remove(0);
        }
        double averageOfFloat = CollectionsKt.averageOfFloat(this.shortTermWindow);
        if (currentTimeMillis - this.lastSyncTime >= this.SYNC_INTERVAL_MS) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accuracy", i);
            jSONObject.put("pressure", averageOfFloat);
            jSONObject.put("absoluteAltitudeTimestamp", currentTimeMillis / 1000);
            RadarState.INSTANCE.setLastPressure$sdk_release(this.context, jSONObject);
            this.lastSyncTime = currentTimeMillis;
        }
    }

    public final void onResume() {
        Sensor sensor = this.pressure;
        if (sensor != null) {
            this.sensorManager.registerListener(this, sensor, 3);
        }
    }

    public final void onPause() {
        if (this.pressure != null) {
            this.sensorManager.unregisterListener(this);
        }
    }
}
