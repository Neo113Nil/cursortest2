package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Objects;
import xsna.n23;
import xsna.x280;

/* loaded from: classes11.dex */
public final class Toggle {
    private final boolean mIsChecked;
    private final boolean mIsEnabled;

    @Nullable
    private final x280 mOnCheckedChangeDelegate;

    public static final class a {
    }

    public interface b {
    }

    public Toggle(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return this.mIsChecked == toggle.mIsChecked && this.mIsEnabled == toggle.mIsEnabled;
    }

    @NonNull
    public x280 getOnCheckedChangeDelegate() {
        x280 x280Var = this.mOnCheckedChangeDelegate;
        Objects.requireNonNull(x280Var);
        return x280Var;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsChecked), Boolean.valueOf(this.mIsEnabled));
    }

    public boolean isChecked() {
        return this.mIsChecked;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[ isChecked: ");
        sb.append(this.mIsChecked);
        sb.append(", isEnabled: ");
        return n23.b(sb, this.mIsEnabled, X3.j.e);
    }

    private Toggle() {
        this.mOnCheckedChangeDelegate = null;
        this.mIsChecked = false;
        this.mIsEnabled = true;
    }
}
