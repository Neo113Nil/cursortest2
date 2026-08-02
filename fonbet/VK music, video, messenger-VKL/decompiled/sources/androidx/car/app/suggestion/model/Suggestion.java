package androidx.car.app.suggestion.model;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.ironsource.X3;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class Suggestion {

    @Nullable
    private final PendingIntent mAction;

    @Nullable
    private final CarIcon mIcon;

    @NonNull
    private final String mIdentifier;

    @Nullable
    private final CarText mSubtitle;

    @NonNull
    private final CarText mTitle;

    public static final class a {
    }

    public Suggestion(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Suggestion)) {
            return false;
        }
        Suggestion suggestion = (Suggestion) obj;
        return Objects.equals(this.mIdentifier, suggestion.mIdentifier) && Objects.equals(this.mTitle, suggestion.mTitle) && Objects.equals(this.mSubtitle, suggestion.mSubtitle) && Objects.equals(this.mAction, suggestion.mAction) && Objects.equals(this.mIcon, suggestion.mIcon);
    }

    @Nullable
    public PendingIntent getAction() {
        return this.mAction;
    }

    @Nullable
    public CarIcon getIcon() {
        return this.mIcon;
    }

    @NonNull
    public String getIdentifier() {
        return this.mIdentifier;
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
        return Objects.hash(this.mIdentifier, this.mTitle, this.mSubtitle, this.mIcon, this.mAction);
    }

    @NonNull
    public String toString() {
        return "[id: " + this.mIdentifier + ", title: " + CarText.toShortString(this.mTitle) + ", subtitle: " + CarText.toShortString(this.mSubtitle) + ", pendingIntent: " + this.mAction + ", icon: " + this.mIcon + X3.j.e;
    }

    private Suggestion() {
        this.mIdentifier = "";
        this.mTitle = CarText.create("");
        this.mSubtitle = null;
        this.mIcon = null;
        this.mAction = null;
    }
}
