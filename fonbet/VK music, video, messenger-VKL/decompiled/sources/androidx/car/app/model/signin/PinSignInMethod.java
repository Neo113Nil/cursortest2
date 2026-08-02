package androidx.car.app.model.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarText;
import androidx.car.app.model.signin.SignInTemplate;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class PinSignInMethod implements SignInTemplate.b {
    private static final int MAX_PIN_LENGTH = 12;

    @Nullable
    private final CarText mPinCode;

    public PinSignInMethod(@NonNull CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalArgumentException("PIN must not be empty");
        }
        if (length > 12) {
            throw new IllegalArgumentException("PIN must not be longer than 12 characters");
        }
        this.mPinCode = CarText.create(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PinSignInMethod) {
            return Objects.equals(this.mPinCode, ((PinSignInMethod) obj).mPinCode);
        }
        return false;
    }

    @NonNull
    public CarText getPinCode() {
        CarText carText = this.mPinCode;
        Objects.requireNonNull(carText);
        return carText;
    }

    public int hashCode() {
        return Objects.hash(this.mPinCode);
    }

    private PinSignInMethod() {
        this.mPinCode = null;
    }
}
