package ai.verisoul.sdk.helpers.sensor.accelerometer;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", "", "getCurrentBufferSnapshot", "", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerData;", "isAccelerometerRegistered", "", "startListening", "", "stopListening", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AccelerometerHelper {
    @NotNull
    List<AccelerometerData> getCurrentBufferSnapshot();

    boolean isAccelerometerRegistered();

    void startListening();

    void stopListening();
}
