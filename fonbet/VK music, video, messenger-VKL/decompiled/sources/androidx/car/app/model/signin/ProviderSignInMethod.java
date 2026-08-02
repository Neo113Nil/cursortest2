package androidx.car.app.model.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.Action;
import androidx.car.app.model.signin.SignInTemplate;
import com.ironsource.X3;
import java.util.Objects;
import xsna.z280;

/* loaded from: classes11.dex */
public final class ProviderSignInMethod implements SignInTemplate.b {

    @Nullable
    private final Action mAction;

    public ProviderSignInMethod(@NonNull Action action) {
        Objects.requireNonNull(action);
        if (action.getType() != 1) {
            throw new IllegalArgumentException("The action must not be a standard action");
        }
        z280 onClickDelegate = action.getOnClickDelegate();
        Objects.requireNonNull(onClickDelegate);
        if (!onClickDelegate.isParkedOnly()) {
            throw new IllegalArgumentException("The action must use a ParkedOnlyOnClickListener");
        }
        this.mAction = action;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderSignInMethod) {
            return Objects.equals(this.mAction, ((ProviderSignInMethod) obj).mAction);
        }
        return false;
    }

    @NonNull
    public Action getAction() {
        Action action = this.mAction;
        Objects.requireNonNull(action);
        return action;
    }

    public int hashCode() {
        return Objects.hash(this.mAction);
    }

    @NonNull
    public String toString() {
        return "[action:" + this.mAction + X3.j.e;
    }

    private ProviderSignInMethod() {
        this.mAction = null;
    }
}
