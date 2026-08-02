package androidx.car.app.model.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.e8o0;

/* loaded from: classes11.dex */
public final class SignInTemplate implements e8o0 {
    private final List<Action> mActionList;

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final CarText mAdditionalText;

    @Nullable
    private final Action mHeaderAction;

    @Nullable
    private final CarText mInstructions;
    private final boolean mIsLoading;

    @Nullable
    private final b mSignInMethod;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public interface b {
    }

    public SignInTemplate(a aVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInTemplate)) {
            return false;
        }
        SignInTemplate signInTemplate = (SignInTemplate) obj;
        return this.mIsLoading == signInTemplate.mIsLoading && Objects.equals(this.mHeaderAction, signInTemplate.mHeaderAction) && Objects.equals(this.mTitle, signInTemplate.mTitle) && Objects.equals(this.mInstructions, signInTemplate.mInstructions) && Objects.equals(this.mAdditionalText, signInTemplate.mAdditionalText) && Objects.equals(this.mActionStrip, signInTemplate.mActionStrip) && Objects.equals(this.mActionList, signInTemplate.mActionList) && Objects.equals(this.mSignInMethod, signInTemplate.mSignInMethod);
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
    public CarText getAdditionalText() {
        return this.mAdditionalText;
    }

    @Nullable
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @Nullable
    public CarText getInstructions() {
        return this.mInstructions;
    }

    @NonNull
    public b getSignInMethod() {
        b bVar = this.mSignInMethod;
        Objects.requireNonNull(bVar);
        return bVar;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTitle, this.mInstructions, this.mAdditionalText, this.mActionStrip, this.mActionList, this.mSignInMethod);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "SignInTemplate";
    }

    private SignInTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTitle = null;
        this.mInstructions = null;
        this.mAdditionalText = null;
        this.mActionStrip = null;
        this.mActionList = Collections.EMPTY_LIST;
        this.mSignInMethod = null;
    }
}
