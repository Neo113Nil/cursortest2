package androidx.car.app.navigation.model;

import androidx.annotation.Nullable;
import androidx.car.app.model.ActionStrip;
import java.util.Objects;
import xsna.ug90;

/* loaded from: classes11.dex */
public final class MapController {

    @Nullable
    private final ActionStrip mMapActionStrip;

    @Nullable
    private final ug90 mPanModeDelegate;

    public static final class a {
    }

    public MapController(a aVar) {
        throw null;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    @Nullable
    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    @Nullable
    public ug90 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}
