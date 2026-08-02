package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageButton.v5.presentation;

import androidx.lifecycle.w0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.scrollAnchor.ScrollUpdate;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageButton/v5/presentation/HotelsPageButtonV5ViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "anchorsPositionCache", "Ljava/util/Map;", "getAnchorsPositionCache", "()Ljava/util/Map;", "startWidgetScrollAnchorPosition", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "getStartWidgetScrollAnchorPosition", "()Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "setStartWidgetScrollAnchorPosition", "(Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;)V", "endWidgetScrollAnchorPosition", "getEndWidgetScrollAnchorPosition", "setEndWidgetScrollAnchorPosition", "endCellScrollAnchorPosition", "getEndCellScrollAnchorPosition", "setEndCellScrollAnchorPosition", "startCellScrollAnchorPosition", "getStartCellScrollAnchorPosition", "setStartCellScrollAnchorPosition", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsPageButtonV5ViewModel extends w0 {

    @NotNull
    private final Map<String, ScrollUpdate.AnchorPosition> anchorsPositionCache = new LinkedHashMap();

    @NotNull
    private ScrollUpdate.AnchorPosition endCellScrollAnchorPosition;

    @NotNull
    private ScrollUpdate.AnchorPosition endWidgetScrollAnchorPosition;

    @NotNull
    private ScrollUpdate.AnchorPosition startCellScrollAnchorPosition;

    @NotNull
    private ScrollUpdate.AnchorPosition startWidgetScrollAnchorPosition;

    public HotelsPageButtonV5ViewModel() {
        ScrollUpdate.AnchorPosition anchorPosition = ScrollUpdate.AnchorPosition.UNSPECIFIED;
        this.startWidgetScrollAnchorPosition = anchorPosition;
        this.endWidgetScrollAnchorPosition = anchorPosition;
        this.endCellScrollAnchorPosition = anchorPosition;
        this.startCellScrollAnchorPosition = anchorPosition;
    }

    @NotNull
    public final Map<String, ScrollUpdate.AnchorPosition> getAnchorsPositionCache() {
        return this.anchorsPositionCache;
    }

    @NotNull
    public final ScrollUpdate.AnchorPosition getEndCellScrollAnchorPosition() {
        return this.endCellScrollAnchorPosition;
    }

    @NotNull
    public final ScrollUpdate.AnchorPosition getEndWidgetScrollAnchorPosition() {
        return this.endWidgetScrollAnchorPosition;
    }

    @NotNull
    public final ScrollUpdate.AnchorPosition getStartCellScrollAnchorPosition() {
        return this.startCellScrollAnchorPosition;
    }

    @NotNull
    public final ScrollUpdate.AnchorPosition getStartWidgetScrollAnchorPosition() {
        return this.startWidgetScrollAnchorPosition;
    }

    public final void setEndCellScrollAnchorPosition(@NotNull ScrollUpdate.AnchorPosition anchorPosition) {
        Intrinsics.checkNotNullParameter(anchorPosition, "<set-?>");
        this.endCellScrollAnchorPosition = anchorPosition;
    }

    public final void setEndWidgetScrollAnchorPosition(@NotNull ScrollUpdate.AnchorPosition anchorPosition) {
        Intrinsics.checkNotNullParameter(anchorPosition, "<set-?>");
        this.endWidgetScrollAnchorPosition = anchorPosition;
    }

    public final void setStartCellScrollAnchorPosition(@NotNull ScrollUpdate.AnchorPosition anchorPosition) {
        Intrinsics.checkNotNullParameter(anchorPosition, "<set-?>");
        this.startCellScrollAnchorPosition = anchorPosition;
    }

    public final void setStartWidgetScrollAnchorPosition(@NotNull ScrollUpdate.AnchorPosition anchorPosition) {
        Intrinsics.checkNotNullParameter(anchorPosition, "<set-?>");
        this.startWidgetScrollAnchorPosition = anchorPosition;
    }
}
