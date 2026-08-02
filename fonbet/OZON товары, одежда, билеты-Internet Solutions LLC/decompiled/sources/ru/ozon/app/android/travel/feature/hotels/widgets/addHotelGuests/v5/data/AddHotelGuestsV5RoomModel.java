package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J%\u0010\u000b\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5RoomModel;", "", "guests", "", "", "", "<init>", "(Ljava/util/List;)V", "getGuests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddHotelGuestsV5RoomModel {
    public static final int $stable = 8;

    @NotNull
    private final List<Map<String, String>> guests;

    /* JADX WARN: Multi-variable type inference failed */
    public AddHotelGuestsV5RoomModel(@NotNull List<? extends Map<String, String>> guests) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        this.guests = guests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddHotelGuestsV5RoomModel copy$default(AddHotelGuestsV5RoomModel addHotelGuestsV5RoomModel, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = addHotelGuestsV5RoomModel.guests;
        }
        return addHotelGuestsV5RoomModel.copy(list);
    }

    @NotNull
    public final List<Map<String, String>> component1() {
        return this.guests;
    }

    @NotNull
    public final AddHotelGuestsV5RoomModel copy(@NotNull List<? extends Map<String, String>> guests) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        return new AddHotelGuestsV5RoomModel(guests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddHotelGuestsV5RoomModel) && Intrinsics.d(this.guests, ((AddHotelGuestsV5RoomModel) other).guests);
    }

    @NotNull
    public final List<Map<String, String>> getGuests() {
        return this.guests;
    }

    public int hashCode() {
        return this.guests.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("AddHotelGuestsV5RoomModel(guests=", ")", this.guests);
    }
}
