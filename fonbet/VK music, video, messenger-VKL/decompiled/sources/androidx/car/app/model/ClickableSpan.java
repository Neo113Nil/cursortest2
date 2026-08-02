package androidx.car.app.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.a380;
import xsna.z280;

/* loaded from: classes11.dex */
public final class ClickableSpan extends CarSpan {

    @Nullable
    private final z280 mOnClickDelegate;

    private ClickableSpan(a380 a380Var) {
        this.mOnClickDelegate = OnClickDelegateImpl.create(a380Var);
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static ClickableSpan create(@NonNull a380 a380Var) {
        Objects.requireNonNull(a380Var);
        return new ClickableSpan(a380Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        return Boolean.valueOf(this.mOnClickDelegate == null).equals(Boolean.valueOf(((ClickableSpan) obj).mOnClickDelegate == null));
    }

    @NonNull
    public z280 getOnClickDelegate() {
        z280 z280Var = this.mOnClickDelegate;
        Objects.requireNonNull(z280Var);
        return z280Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mOnClickDelegate == null));
    }

    @NonNull
    public String toString() {
        return "[clickable]";
    }

    private ClickableSpan() {
        this.mOnClickDelegate = null;
    }
}
