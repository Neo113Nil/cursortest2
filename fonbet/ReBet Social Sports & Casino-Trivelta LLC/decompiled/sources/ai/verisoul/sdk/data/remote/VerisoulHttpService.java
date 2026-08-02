package ai.verisoul.sdk.data.remote;

import ai.verisoul.sdk.data.remote.model.ResponseData;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerSensorData;
import com.twilio.voice.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "", "submitAccelerometerData", "Lai/verisoul/sdk/data/remote/model/ResponseData;", "requestData", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerSensorData;", "(Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerSensorData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitDeviceData", "Lai/verisoul/sdk/data/remote/DeviceNativeSubmitRequest;", "(Lai/verisoul/sdk/data/remote/DeviceNativeSubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitIntegrityData", "Lai/verisoul/sdk/data/remote/IntegritySubmitRequest;", "(Lai/verisoul/sdk/data/remote/IntegritySubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VerisoulHttpService {
    @POST("accelerometer")
    @Nullable
    Object submitAccelerometerData(@Body @NotNull AccelerometerSensorData accelerometerSensorData, @NotNull Continuation<? super ResponseData> continuation);

    @POST(Constants.PLATFORM_ANDROID)
    @Nullable
    Object submitDeviceData(@Body @NotNull DeviceNativeSubmitRequest deviceNativeSubmitRequest, @NotNull Continuation<? super ResponseData> continuation);

    @POST("integrity")
    @Nullable
    Object submitIntegrityData(@Body @NotNull IntegritySubmitRequest integritySubmitRequest, @NotNull Continuation<? super ResponseData> continuation);
}
