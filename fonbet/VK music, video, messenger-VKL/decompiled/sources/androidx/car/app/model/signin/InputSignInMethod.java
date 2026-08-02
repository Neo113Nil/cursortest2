package androidx.car.app.model.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarText;
import androidx.car.app.model.signin.SignInTemplate;
import com.ironsource.X3;
import java.util.Objects;
import xsna.h5s;
import xsna.k1x;

/* loaded from: classes11.dex */
public final class InputSignInMethod implements SignInTemplate.b {
    public static final int INPUT_TYPE_DEFAULT = 1;
    public static final int INPUT_TYPE_PASSWORD = 2;
    public static final int KEYBOARD_DEFAULT = 1;
    public static final int KEYBOARD_EMAIL = 2;
    public static final int KEYBOARD_NUMBER = 4;
    public static final int KEYBOARD_PHONE = 3;

    @Nullable
    private final CarText mDefaultValue;

    @Nullable
    private final CarText mErrorMessage;

    @Nullable
    private final CarText mHint;

    @Nullable
    private final k1x mInputCallbackDelegate;
    private final int mInputType;
    private final int mKeyboardType;
    private final boolean mShowKeyboardByDefault;

    public static final class a {
    }

    public InputSignInMethod(a aVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputSignInMethod)) {
            return false;
        }
        InputSignInMethod inputSignInMethod = (InputSignInMethod) obj;
        return this.mInputType == inputSignInMethod.mInputType && this.mKeyboardType == inputSignInMethod.mKeyboardType && this.mShowKeyboardByDefault == inputSignInMethod.mShowKeyboardByDefault && Objects.equals(this.mHint, inputSignInMethod.mHint) && Objects.equals(this.mDefaultValue, inputSignInMethod.mDefaultValue) && Objects.equals(this.mErrorMessage, inputSignInMethod.mErrorMessage);
    }

    @Nullable
    public CarText getDefaultValue() {
        return this.mDefaultValue;
    }

    @Nullable
    public CarText getErrorMessage() {
        return this.mErrorMessage;
    }

    @Nullable
    public CarText getHint() {
        return this.mHint;
    }

    @NonNull
    public k1x getInputCallbackDelegate() {
        k1x k1xVar = this.mInputCallbackDelegate;
        Objects.requireNonNull(k1xVar);
        return k1xVar;
    }

    public int getInputType() {
        return this.mInputType;
    }

    public int getKeyboardType() {
        return this.mKeyboardType;
    }

    public int hashCode() {
        return Objects.hash(this.mHint, this.mDefaultValue, Integer.valueOf(this.mInputType), this.mErrorMessage, Integer.valueOf(this.mKeyboardType), Boolean.valueOf(this.mShowKeyboardByDefault));
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[inputType:");
        sb.append(this.mInputType);
        sb.append(", keyboardType: ");
        return h5s.c(this.mKeyboardType, X3.j.e, sb);
    }

    private InputSignInMethod() {
        this.mHint = null;
        this.mDefaultValue = null;
        this.mInputType = 1;
        this.mErrorMessage = null;
        this.mKeyboardType = 1;
        this.mInputCallbackDelegate = null;
        this.mShowKeyboardByDefault = false;
    }
}
