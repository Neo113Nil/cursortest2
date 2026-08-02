package androidx.car.app.navigation.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import java.util.Objects;
import xsna.e8o0;
import xsna.ug90;

/* loaded from: classes11.dex */
public final class RoutePreviewNavigationTemplate implements e8o0 {

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final Header mHeader;

    @Nullable
    @Deprecated
    private final Action mHeaderAction;
    private final boolean mIsLoading;

    @Nullable
    private final ItemList mItemList;

    @Nullable
    private final ActionStrip mMapActionStrip;

    @Nullable
    private final Action mNavigateAction;

    @Nullable
    private final ug90 mPanModeDelegate;

    @Nullable
    @Deprecated
    private final CarText mTitle;

    public static final class a {
    }

    public RoutePreviewNavigationTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutePreviewNavigationTemplate)) {
            return false;
        }
        RoutePreviewNavigationTemplate routePreviewNavigationTemplate = (RoutePreviewNavigationTemplate) obj;
        if (this.mIsLoading == routePreviewNavigationTemplate.mIsLoading && Objects.equals(this.mTitle, routePreviewNavigationTemplate.mTitle) && Objects.equals(this.mNavigateAction, routePreviewNavigationTemplate.mNavigateAction) && Objects.equals(this.mItemList, routePreviewNavigationTemplate.mItemList) && Objects.equals(this.mHeaderAction, routePreviewNavigationTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, routePreviewNavigationTemplate.mActionStrip) && Objects.equals(this.mMapActionStrip, routePreviewNavigationTemplate.mMapActionStrip)) {
            if (Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(routePreviewNavigationTemplate.mPanModeDelegate == null)) && Objects.equals(this.mHeader, routePreviewNavigationTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    @Nullable
    public Header getHeader() {
        return this.mHeader;
    }

    @Nullable
    @Deprecated
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @Nullable
    public ItemList getItemList() {
        return this.mItemList;
    }

    @Nullable
    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    @Nullable
    public Action getNavigateAction() {
        return this.mNavigateAction;
    }

    @Nullable
    public ug90 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    @Nullable
    @Deprecated
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(this.mTitle, Boolean.valueOf(this.mIsLoading), this.mNavigateAction, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mMapActionStrip, Boolean.valueOf(this.mPanModeDelegate == null), this.mHeader);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "RoutePreviewNavigationTemplate";
    }

    private RoutePreviewNavigationTemplate() {
        this.mTitle = null;
        this.mIsLoading = false;
        this.mNavigateAction = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mMapActionStrip = null;
        this.mPanModeDelegate = null;
    }
}
