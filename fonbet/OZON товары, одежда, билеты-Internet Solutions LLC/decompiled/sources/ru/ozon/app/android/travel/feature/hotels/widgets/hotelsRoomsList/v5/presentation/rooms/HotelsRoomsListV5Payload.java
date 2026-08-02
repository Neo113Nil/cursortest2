package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\tJ\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\u0007J\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0007J\u0006\u0010\u0019\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/HotelsRoomsListV5Payload;", "", "<init>", "()V", "changes", "Ljava/util/BitSet;", "setNameChanged", "", "isNameChanged", "", "setImagesChanged", "areImagesChanged", "setTagsChanged", "areTagsChanged", "setDetailBadgeChanged", "isDetailBadgeChanged", "setTariffsChanged", "areTariffsChanged", "setAccommodationChanged", "isAccommodationChanged", "setRoomBadgesChanged", "areRoomBadgesChanged", "setButtonChanged", "areButtonChanged", "setRoomsLeftBadgeChanged", "isRoomsLeftBadgeChanged", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsRoomsListV5Payload {

    @NotNull
    private final BitSet changes = new BitSet();

    public final boolean areButtonChanged() {
        return this.changes.get(8);
    }

    public final boolean areImagesChanged() {
        return this.changes.get(2);
    }

    public final boolean areRoomBadgesChanged() {
        return this.changes.get(7);
    }

    public final boolean areTagsChanged() {
        return this.changes.get(3);
    }

    public final boolean areTariffsChanged() {
        return this.changes.get(5);
    }

    public final boolean isAccommodationChanged() {
        return this.changes.get(6);
    }

    public final boolean isDetailBadgeChanged() {
        return this.changes.get(4);
    }

    public final boolean isNameChanged() {
        return this.changes.get(1);
    }

    public final boolean isRoomsLeftBadgeChanged() {
        return this.changes.get(9);
    }

    public final void setAccommodationChanged() {
        this.changes.set(6, true);
    }

    public final void setButtonChanged() {
        this.changes.set(8, true);
    }

    public final void setDetailBadgeChanged() {
        this.changes.set(4, true);
    }

    public final void setImagesChanged() {
        this.changes.set(2, true);
    }

    public final void setNameChanged() {
        this.changes.set(1, true);
    }

    public final void setRoomBadgesChanged() {
        this.changes.set(7, true);
    }

    public final void setRoomsLeftBadgeChanged() {
        this.changes.set(9, true);
    }

    public final void setTagsChanged() {
        this.changes.set(3, true);
    }

    public final void setTariffsChanged() {
        this.changes.set(5, true);
    }
}
