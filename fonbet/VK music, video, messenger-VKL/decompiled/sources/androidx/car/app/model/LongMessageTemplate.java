package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.e8o0;

/* loaded from: classes11.dex */
public final class LongMessageTemplate implements e8o0 {
    private final List<Action> mActionList;

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final Action mHeaderAction;

    @Nullable
    private final CarText mMessage;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public LongMessageTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongMessageTemplate)) {
            return false;
        }
        LongMessageTemplate longMessageTemplate = (LongMessageTemplate) obj;
        return Objects.equals(this.mTitle, longMessageTemplate.mTitle) && Objects.equals(this.mMessage, longMessageTemplate.mMessage) && Objects.equals(this.mHeaderAction, longMessageTemplate.mHeaderAction) && Objects.equals(this.mActionList, longMessageTemplate.mActionList) && Objects.equals(this.mActionStrip, longMessageTemplate.mActionStrip);
    }

    @Nullable
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @NonNull
    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    @Nullable
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @NonNull
    public CarText getMessage() {
        CarText carText = this.mMessage;
        Objects.requireNonNull(carText);
        return carText;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, this.mMessage, this.mHeaderAction, this.mActionList, this.mActionStrip);
    }

    @NonNull
    public String toString() {
        return "LongMessageTemplate";
    }

    private LongMessageTemplate() {
        this.mTitle = null;
        this.mMessage = null;
        this.mActionStrip = null;
        this.mHeaderAction = null;
        this.mActionList = Collections.EMPTY_LIST;
    }
}
