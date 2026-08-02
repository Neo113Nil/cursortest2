package androidx.car.app.navigation.model;

import androidx.annotation.Nullable;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import java.util.Objects;
import xsna.e8o0;

/* loaded from: classes11.dex */
public final class MapTemplate implements e8o0 {

    @Nullable
    private final ActionStrip mActionStrip;

    @Nullable
    private final Header mHeader;

    @Nullable
    private final ItemList mItemList;

    @Nullable
    private final MapController mMapController;

    @Nullable
    private final Pane mPane;

    public static final class a {
    }

    public MapTemplate(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapTemplate)) {
            return false;
        }
        MapTemplate mapTemplate = (MapTemplate) obj;
        return Objects.equals(this.mPane, mapTemplate.mPane) && Objects.equals(this.mItemList, mapTemplate.mItemList) && Objects.equals(this.mHeader, mapTemplate.mHeader) && Objects.equals(this.mMapController, mapTemplate.mMapController) && Objects.equals(this.mActionStrip, mapTemplate.mActionStrip);
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
    public ItemList getItemList() {
        return this.mItemList;
    }

    @Nullable
    public MapController getMapController() {
        return this.mMapController;
    }

    @Nullable
    public Pane getPane() {
        return this.mPane;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mPane, this.mItemList, this.mHeader, this.mActionStrip);
    }

    private MapTemplate() {
        this.mMapController = null;
        this.mPane = null;
        this.mItemList = null;
        this.mHeader = null;
        this.mActionStrip = null;
    }
}
