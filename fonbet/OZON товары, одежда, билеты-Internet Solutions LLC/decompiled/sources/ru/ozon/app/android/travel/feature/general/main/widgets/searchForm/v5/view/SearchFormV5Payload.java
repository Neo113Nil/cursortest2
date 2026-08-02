package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view;

import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\u0007J\u0006\u0010\u001b\u001a\u00020\tJ\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\u0007J\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\u0007J\u0006\u0010!\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020\u0007J\u0006\u0010#\u001a\u00020\tJ\u0006\u0010$\u001a\u00020\u0007J\u0006\u0010%\u001a\u00020\tJ\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v5/view/SearchFormV5Payload;", "", "<init>", "()V", "changes", "Ljava/util/BitSet;", "setLocationsChanged", "", "areLocationsChanged", "", "setDateChanged", "isDateChanged", "setRightFieldChanged", "isRightFieldChanged", "setTouristFieldChanged", "isTouristFieldChanged", "setSearchButtonChanged", "isSearchButtonChanged", "setBackgroundChanged", "isBackgroundChanged", "setCornerRadiusChanged", "isCornerRadiusChanged", "setLeftPatchChanged", "isLeftPatchChanged", "setRightPatchChanged", "isRightPathcChanged", "setLocationsSwapped", "areLocationsSwapped", "setAnimateDeparture", "isDepartureAnimated", "setAnimateDestination", "isDestinationAnimated", "setDateActionChanged", "isDateActionChanged", "setRightFieldActionChanged", "isRightFieldActionChanged", "setTouristFieldActionChanged", "isTouristFieldActionChanged", "setToggleCellChanged", "isToggleCellChanged", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV5Payload {

    @NotNull
    private final BitSet changes = new BitSet();

    public final boolean areLocationsChanged() {
        return this.changes.get(0);
    }

    public final boolean areLocationsSwapped() {
        return this.changes.get(9);
    }

    public final boolean isBackgroundChanged() {
        return this.changes.get(5);
    }

    public final boolean isCornerRadiusChanged() {
        return this.changes.get(6);
    }

    public final boolean isDateActionChanged() {
        return this.changes.get(12);
    }

    public final boolean isDateChanged() {
        return this.changes.get(1);
    }

    public final boolean isDepartureAnimated() {
        return this.changes.get(10);
    }

    public final boolean isDestinationAnimated() {
        return this.changes.get(11);
    }

    public final boolean isLeftPatchChanged() {
        return this.changes.get(7);
    }

    public final boolean isRightFieldActionChanged() {
        return this.changes.get(13);
    }

    public final boolean isRightFieldChanged() {
        return this.changes.get(2);
    }

    public final boolean isRightPathcChanged() {
        return this.changes.get(8);
    }

    public final boolean isSearchButtonChanged() {
        return this.changes.get(4);
    }

    public final boolean isToggleCellChanged() {
        return this.changes.get(15);
    }

    public final boolean isTouristFieldActionChanged() {
        return this.changes.get(14);
    }

    public final boolean isTouristFieldChanged() {
        return this.changes.get(3);
    }

    public final void setAnimateDeparture() {
        this.changes.set(10, true);
    }

    public final void setAnimateDestination() {
        this.changes.set(11, true);
    }

    public final void setBackgroundChanged() {
        this.changes.set(5, true);
    }

    public final void setCornerRadiusChanged() {
        this.changes.set(6, true);
    }

    public final void setDateActionChanged() {
        this.changes.set(12, true);
    }

    public final void setDateChanged() {
        this.changes.set(1, true);
    }

    public final void setLeftPatchChanged() {
        this.changes.set(7, true);
    }

    public final void setLocationsChanged() {
        this.changes.set(0, true);
    }

    public final void setLocationsSwapped() {
        this.changes.set(9, true);
    }

    public final void setRightFieldActionChanged() {
        this.changes.set(13, true);
    }

    public final void setRightFieldChanged() {
        this.changes.set(2, true);
    }

    public final void setRightPatchChanged() {
        this.changes.set(8, true);
    }

    public final void setSearchButtonChanged() {
        this.changes.set(4, true);
    }

    public final void setToggleCellChanged() {
        this.changes.set(15, true);
    }

    public final void setTouristFieldActionChanged() {
        this.changes.set(14, true);
    }

    public final void setTouristFieldChanged() {
        this.changes.set(3, true);
    }
}
