package ai.verisoul.sdk.helpers.sensor.accelerometer;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.Q;
import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0019\u001a\u00020\tH\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelperImpl;", "Landroid/hardware/SensorEventListener;", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "accelerometer", "Landroid/hardware/Sensor;", "bufferSize", "", "isRegistered", "", "logTag", "", "rollingBuffer", "Lkotlin/collections/ArrayDeque;", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerData;", "sensorManager", "Landroid/hardware/SensorManager;", "getCurrentBufferSnapshot", "", "isAccelerometerRegistered", "onAccuracyChanged", "", "sensor", "accuracy", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "startListening", "stopListening", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccelerometerHelperImpl implements SensorEventListener, AccelerometerHelper {

    @Nullable
    private final Sensor accelerometer;
    private final int bufferSize;
    private boolean isRegistered;

    @NotNull
    private final String logTag;

    @NotNull
    private final ArrayDeque<AccelerometerData> rollingBuffer;

    @NotNull
    private final SensorManager sensorManager;

    public AccelerometerHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.logTag = "Verisoul-[" + AccelerometerHelperImpl.class.getSimpleName() + "]";
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.accelerometer = sensorManager.getDefaultSensor(1);
        this.rollingBuffer = new ArrayDeque<>();
        this.bufferSize = 100;
    }

    @Override // ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper
    @NotNull
    public List<AccelerometerData> getCurrentBufferSnapshot() {
        List<AccelerometerData> list;
        synchronized (this.rollingBuffer) {
            list = CollectionsKt.toList(this.rollingBuffer);
        }
        return list;
    }

    @Override // ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper
    /* renamed from: isAccelerometerRegistered, reason: from getter */
    public boolean getIsRegistered() {
        return this.isRegistered;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.sensor.getType() != 1) {
            return;
        }
        try {
            float[] fArr = event.values;
            if (fArr == null) {
                Logger.INSTANCE.error(this.logTag, "Sensor values array is null");
                return;
            }
            if (fArr.length < 3) {
                Logger.INSTANCE.error(this.logTag, "Invalid sensor values array length: " + fArr.length + ", expected 3");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            float[] fArr2 = event.values;
            AccelerometerData accelerometerData = new AccelerometerData(currentTimeMillis, fArr2[0], fArr2[1], fArr2[2]);
            synchronized (this.rollingBuffer) {
                try {
                    this.rollingBuffer.addLast(accelerometerData);
                    if (this.rollingBuffer.size() > this.bufferSize) {
                        this.rollingBuffer.removeFirst();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
        } catch (Exception e10) {
            Logger.INSTANCE.error(this.logTag, "Error processing sensor event: " + e10.getMessage());
        }
    }

    @Override // ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper
    public void startListening() {
        this.sensorManager.registerListener(this, this.accelerometer, 1);
        this.isRegistered = true;
        Logger.INSTANCE.info(this.logTag, "Accelerometer sensor registered");
        AbstractC1459k.d(Q.a(C1452g0.a()), null, null, new AccelerometerHelperImpl$startListening$1(this, null), 3, null);
    }

    @Override // ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper
    public void stopListening() {
        if (this.isRegistered) {
            this.sensorManager.unregisterListener(this);
            Logger.INSTANCE.info(this.logTag, "Accelerometer sensor stopListening");
            this.isRegistered = false;
        }
    }
}
