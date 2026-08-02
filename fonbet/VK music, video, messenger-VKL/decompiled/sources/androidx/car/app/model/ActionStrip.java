package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class ActionStrip {
    private final List<Action> mActions;

    public static final class a {
    }

    public ActionStrip(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    @NonNull
    public List<Action> getActions() {
        List<Action> list = this.mActions;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Nullable
    public Action getFirstActionOfType(int i) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    @NonNull
    public String toString() {
        return "[action count: " + this.mActions.size() + X3.j.e;
    }

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }
}
