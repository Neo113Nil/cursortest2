package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.e8o0;
import xsna.esn0;

/* loaded from: classes11.dex */
public class TabTemplate implements e8o0 {

    @Nullable
    private final String mActiveTabContentId;

    @Nullable
    private final Action mHeaderAction;
    private final boolean mIsLoading;

    @Nullable
    private final esn0 mTabCallbackDelegate;

    @Nullable
    private final TabContents mTabContents;

    @Nullable
    private final List<Tab> mTabs;

    public static final class a {
    }

    public interface b {
    }

    public TabTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabTemplate)) {
            return false;
        }
        TabTemplate tabTemplate = (TabTemplate) obj;
        return this.mIsLoading == tabTemplate.mIsLoading && Objects.equals(this.mHeaderAction, tabTemplate.mHeaderAction) && Objects.equals(this.mTabs, tabTemplate.mTabs) && Objects.equals(this.mTabContents, tabTemplate.mTabContents) && Objects.equals(this.mActiveTabContentId, tabTemplate.getActiveTabContentId());
    }

    @NonNull
    public String getActiveTabContentId() {
        String str = this.mActiveTabContentId;
        Objects.requireNonNull(str);
        return str;
    }

    @NonNull
    public Action getHeaderAction() {
        Action action = this.mHeaderAction;
        Objects.requireNonNull(action);
        return action;
    }

    @NonNull
    public esn0 getTabCallbackDelegate() {
        esn0 esn0Var = this.mTabCallbackDelegate;
        Objects.requireNonNull(esn0Var);
        return esn0Var;
    }

    @NonNull
    public TabContents getTabContents() {
        TabContents tabContents = this.mTabContents;
        Objects.requireNonNull(tabContents);
        return tabContents;
    }

    @NonNull
    public List<Tab> getTabs() {
        List<Tab> list = this.mTabs;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mIsLoading), this.mHeaderAction, this.mTabs, this.mTabContents, this.mActiveTabContentId);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "TabTemplate";
    }

    private TabTemplate() {
        this.mIsLoading = false;
        this.mHeaderAction = null;
        this.mTabs = Collections.EMPTY_LIST;
        this.mTabContents = null;
        this.mTabCallbackDelegate = null;
        this.mActiveTabContentId = null;
    }
}
