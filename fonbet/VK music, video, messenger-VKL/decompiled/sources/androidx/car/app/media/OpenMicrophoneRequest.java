package androidx.car.app.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class OpenMicrophoneRequest {

    @Nullable
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    public static final class a {
    }

    public OpenMicrophoneRequest(@NonNull a aVar) {
        throw null;
    }

    @NonNull
    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
