package androidx.car.app.model;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import java.util.Objects;
import xsna.a380;

@SuppressLint({"ListenerInterface"})
/* loaded from: classes11.dex */
public final class ParkedOnlyOnClickListener implements a380 {
    private final a380 mListener;

    private ParkedOnlyOnClickListener(a380 a380Var) {
        this.mListener = a380Var;
    }

    @NonNull
    @SuppressLint({"ExecutorRegistration"})
    public static ParkedOnlyOnClickListener create(@NonNull a380 a380Var) {
        Objects.requireNonNull(a380Var);
        return new ParkedOnlyOnClickListener(a380Var);
    }

    @Override // xsna.a380
    public void onClick() {
        this.mListener.onClick();
    }
}
