package ai.verisoul.sdk.helpers.sensor.get_all;

import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/get_all/SensorsHelperImpl;", "Lai/verisoul/sdk/helpers/sensor/get_all/SensorsHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "logTag", "", "getAllSensors", "", "Lai/verisoul/sdk/helpers/sensor/get_all/SensorData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSensorsHelperImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorsHelperImpl.kt\nai/verisoul/sdk/helpers/sensor/get_all/SensorsHelperImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n1#3:32\n*S KotlinDebug\n*F\n+ 1 SensorsHelperImpl.kt\nai/verisoul/sdk/helpers/sensor/get_all/SensorsHelperImpl\n*L\n19#1:28\n19#1:29,3\n*E\n"})
/* loaded from: classes.dex */
public final class SensorsHelperImpl implements SensorsHelper {

    @NotNull
    private final Context context;

    @NotNull
    private final String logTag;

    public SensorsHelperImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.logTag = "Verisoul-[" + SensorsHelperImpl.class.getSimpleName() + "]";
    }

    @Override // ai.verisoul.sdk.helpers.sensor.get_all.SensorsHelper
    @Nullable
    public List<SensorData> getAllSensors() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Object systemService = this.context.getSystemService("sensor");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
            Logger.INSTANCE.metricLog(this.logTag, "sensors_duration", System.currentTimeMillis() - currentTimeMillis);
            Intrinsics.checkNotNull(sensorList);
            List<Sensor> list = sensorList;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Sensor sensor : list) {
                String name = sensor.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String vendor = sensor.getVendor();
                Intrinsics.checkNotNullExpressionValue(vendor, "getVendor(...)");
                arrayList.add(new SensorData(name, vendor));
            }
            return arrayList;
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                return null;
            }
            Logger.INSTANCE.error(this.logTag, message);
            return null;
        }
    }
}
