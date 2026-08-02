package androidx.car.app.media;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.media.ICarAudioCallback;
import java.util.Objects;
import xsna.ls9;

/* loaded from: classes11.dex */
public class CarAudioCallbackDelegate {

    @Nullable
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(@NonNull ls9 ls9Var) {
        this.mCallback = new CarAudioCallbackStub(ls9Var);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static CarAudioCallbackDelegate create(@NonNull ls9 ls9Var) {
        return new CarAudioCallbackDelegate(ls9Var);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static class CarAudioCallbackStub extends ICarAudioCallback.Stub {

        @Nullable
        private final ls9 mCarAudioCallback;

        public CarAudioCallbackStub(@NonNull ls9 ls9Var) {
            this.mCarAudioCallback = ls9Var;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            ls9 ls9Var = this.mCarAudioCallback;
            Objects.requireNonNull(ls9Var);
            ls9Var.onStopRecording();
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
