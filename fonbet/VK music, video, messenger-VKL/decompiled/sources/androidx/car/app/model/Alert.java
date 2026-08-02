package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import xsna.lr1;

/* loaded from: classes11.dex */
public final class Alert {
    private static final int MAX_ACTION_COUNT = 2;

    @NonNull
    private final List<Action> mActions;

    @Nullable
    private final lr1 mCallbackDelegate;
    private final long mDuration;

    @Nullable
    private final CarIcon mIcon;
    private final int mId;

    @Nullable
    private final CarText mSubtitle;

    @NonNull
    private final CarText mTitle;

    public static final class a {
    }

    public Alert(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Alert) && this.mId == ((Alert) obj).mId;
    }

    @NonNull
    public List<Action> getActions() {
        return this.mActions;
    }

    @Nullable
    public lr1 getCallbackDelegate() {
        return this.mCallbackDelegate;
    }

    public long getDurationMillis() {
        return this.mDuration;
    }

    @Nullable
    public CarIcon getIcon() {
        return this.mIcon;
    }

    public int getId() {
        return this.mId;
    }

    @Nullable
    public CarText getSubtitle() {
        return this.mSubtitle;
    }

    @NonNull
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.mId));
    }

    @NonNull
    public String toString() {
        return "[id: " + this.mId + ", title: " + this.mTitle + ", icon: " + this.mIcon + X3.j.e;
    }

    private Alert() {
        this.mId = 0;
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mActions = new ArrayList();
        this.mDuration = 0L;
        this.mCallbackDelegate = null;
    }
}
