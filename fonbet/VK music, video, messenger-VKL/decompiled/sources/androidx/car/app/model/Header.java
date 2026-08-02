package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Header {

    @NonNull
    private final List<Action> mEndHeaderActions;

    @Nullable
    private final Action mStartHeaderAction;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public Header(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Objects.equals(this.mTitle, header.mTitle) && Objects.equals(this.mEndHeaderActions, header.mEndHeaderActions) && Objects.equals(this.mStartHeaderAction, header.mStartHeaderAction);
    }

    @NonNull
    public List<Action> getEndHeaderActions() {
        return this.mEndHeaderActions;
    }

    @Nullable
    public Action getStartHeaderAction() {
        return this.mStartHeaderAction;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mEndHeaderActions, this.mStartHeaderAction);
    }

    @NonNull
    public String toString() {
        return "Header: " + this.mTitle;
    }

    private Header() {
        this.mTitle = null;
        this.mStartHeaderAction = null;
        this.mEndHeaderActions = new ArrayList();
    }
}
