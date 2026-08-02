package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import xsna.e8o0;
import xsna.n380;

/* loaded from: classes11.dex */
public final class PlaceListMapTemplate implements e8o0 {

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final Place mAnchor;

    @Nullable
    private final Action mHeaderAction;
    private final boolean mIsLoading;

    @Nullable
    private final ItemList mItemList;

    @Nullable
    private final n380 mOnContentRefreshDelegate;
    private final boolean mShowCurrentLocation;

    @Nullable
    private final CarText mTitle;

    public static final class a {
    }

    public PlaceListMapTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceListMapTemplate)) {
            return false;
        }
        PlaceListMapTemplate placeListMapTemplate = (PlaceListMapTemplate) obj;
        if (this.mShowCurrentLocation == placeListMapTemplate.mShowCurrentLocation && this.mIsLoading == placeListMapTemplate.mIsLoading && Objects.equals(this.mTitle, placeListMapTemplate.mTitle) && Objects.equals(this.mItemList, placeListMapTemplate.mItemList) && Objects.equals(this.mHeaderAction, placeListMapTemplate.mHeaderAction) && Objects.equals(this.mActionStrip, placeListMapTemplate.mActionStrip) && Objects.equals(this.mAnchor, placeListMapTemplate.mAnchor)) {
            if (Boolean.valueOf(this.mOnContentRefreshDelegate == null).equals(Boolean.valueOf(placeListMapTemplate.mOnContentRefreshDelegate == null))) {
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
    public Place getAnchor() {
        return this.mAnchor;
    }

    @Nullable
    public Action getHeaderAction() {
        return this.mHeaderAction;
    }

    @Nullable
    public ItemList getItemList() {
        return this.mItemList;
    }

    @Nullable
    public n380 getOnContentRefreshDelegate() {
        return this.mOnContentRefreshDelegate;
    }

    @Nullable
    public CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.mShowCurrentLocation), Boolean.valueOf(this.mIsLoading), this.mTitle, this.mItemList, this.mHeaderAction, this.mActionStrip, this.mAnchor, Boolean.valueOf(this.mOnContentRefreshDelegate == null));
    }

    public boolean isCurrentLocationEnabled() {
        return this.mShowCurrentLocation;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    @NonNull
    public String toString() {
        return "PlaceListMapTemplate";
    }

    private PlaceListMapTemplate() {
        this.mShowCurrentLocation = false;
        this.mIsLoading = false;
        this.mTitle = null;
        this.mItemList = null;
        this.mHeaderAction = null;
        this.mActionStrip = null;
        this.mAnchor = null;
        this.mOnContentRefreshDelegate = null;
    }
}
