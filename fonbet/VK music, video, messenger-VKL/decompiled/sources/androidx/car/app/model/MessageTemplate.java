package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.e8o0;

/* loaded from: classes11.dex */
public final class MessageTemplate implements e8o0 {
    private final List<Action> mActionList;

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final CarText mDebugMessage;

    @Nullable
    private final Action mHeaderAction;

    @Nullable
    private final CarIcon mIcon;
    private final boolean mIsLoading;

    @Nullable
    private final CarText mMessage;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public MessageTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTemplate)) {
            return false;
        }
        MessageTemplate messageTemplate = (MessageTemplate) obj;
        return this.mIsLoading == messageTemplate.mIsLoading && Objects.equals(this.mTitle, messageTemplate.mTitle) && Objects.equals(this.mMessage, messageTemplate.mMessage) && Objects.equals(this.mDebugMessage, messageTemplate.mDebugMessage) && Objects.equals(this.mHeaderAction, messageTemplate.mHeaderAction) && Objects.equals(this.mActionList, messageTemplate.mActionList) && Objects.equals(this.mIcon, messageTemplate.mIcon) && Objects.equals(this.mActionStrip, messageTemplate.mActionStrip);
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
    public CarText getDebugMessage() {
        return this.mDebugMessage;
    }

    @Nullable
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @Nullable
    public CarIcon getIcon() {
        return this.mIcon;
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
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mTitle, this.mMessage, this.mDebugMessage, this.mHeaderAction, this.mActionList, this.mIcon, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "MessageTemplate";
    }

    private MessageTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mMessage = null;
        this.mDebugMessage = null;
        this.mIcon = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
    }
}
