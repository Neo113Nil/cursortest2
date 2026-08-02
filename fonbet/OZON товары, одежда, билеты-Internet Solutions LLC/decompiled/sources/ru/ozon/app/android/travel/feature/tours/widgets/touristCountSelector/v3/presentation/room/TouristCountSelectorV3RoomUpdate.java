package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomUpdate;", "LA00/a$J$a;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "room", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "getRoom", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TouristCountSelectorV3RoomUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final TouristCountSelectorV3RoomVO room;

    public TouristCountSelectorV3RoomUpdate(@NotNull TouristCountSelectorV3RoomVO room) {
        Intrinsics.checkNotNullParameter(room, "room");
        this.room = room;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TouristCountSelectorV3RoomUpdate) && Intrinsics.d(this.room, ((TouristCountSelectorV3RoomUpdate) other).room);
    }

    @NotNull
    public final TouristCountSelectorV3RoomVO getRoom() {
        return this.room;
    }

    public int hashCode() {
        return this.room.hashCode();
    }

    @NotNull
    public String toString() {
        return "TouristCountSelectorV3RoomUpdate(room=" + this.room + ")";
    }
}
