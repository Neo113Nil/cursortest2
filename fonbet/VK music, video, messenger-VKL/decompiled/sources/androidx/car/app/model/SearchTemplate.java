package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.e8o0;
import xsna.nnh0;

/* loaded from: classes11.dex */
public final class SearchTemplate implements e8o0 {

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final Action mHeaderAction;

    @Nullable
    private final String mInitialSearchText;
    private final boolean mIsLoading;

    @Nullable
    private final ItemList mItemList;

    @Nullable
    private final nnh0 mSearchCallbackDelegate;

    @Nullable
    private final String mSearchHint;
    private final boolean mShowKeyboardByDefault;

    public static final class a {
    }

    public interface b {
    }

    public SearchTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchTemplate)) {
            return false;
        }
        SearchTemplate searchTemplate = (SearchTemplate) obj;
        return this.mIsLoading == searchTemplate.mIsLoading && Objects.equals(this.mInitialSearchText, searchTemplate.mInitialSearchText) && Objects.equals(this.mSearchHint, searchTemplate.mSearchHint) && Objects.equals(this.mItemList, searchTemplate.mItemList) && Objects.equals(this.mHeaderAction, searchTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, searchTemplate.mActionStrip) && this.mShowKeyboardByDefault == searchTemplate.mShowKeyboardByDefault;
    }

    @Nullable
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @Nullable
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @Nullable
    public String getInitialSearchText() {
        return this.mInitialSearchText;
    }

    @Nullable
    public ItemList getItemList() {
        return this.mItemList;
    }

    @NonNull
    public nnh0 getSearchCallbackDelegate() {
        nnh0 nnh0Var = this.mSearchCallbackDelegate;
        Objects.requireNonNull(nnh0Var);
        return nnh0Var;
    }

    @Nullable
    public String getSearchHint() {
        return this.mSearchHint;
    }

    public int hashCode() {
        return Objects.hash(this.mInitialSearchText, Boolean.valueOf(this.mIsLoading), this.mSearchHint, this.mItemList, Boolean.valueOf(this.mShowKeyboardByDefault), this.mHeaderAction, this.mActionStrip);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public boolean isShowKeyboardByDefault() {
        return this.mShowKeyboardByDefault;
    }

    @NonNull
    public String toString() {
        return "SearchTemplate";
    }

    private SearchTemplate() {
        this.mInitialSearchText = null;
        this.mSearchHint = null;
        this.mIsLoading = false;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mSearchCallbackDelegate = null;
        this.mShowKeyboardByDefault = true;
    }
}
