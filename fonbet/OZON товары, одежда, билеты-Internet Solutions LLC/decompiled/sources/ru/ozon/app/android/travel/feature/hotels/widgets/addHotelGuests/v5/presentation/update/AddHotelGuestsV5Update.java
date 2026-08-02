package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.update;

import A00.a;
import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\b\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/update/AddHotelGuestsV5Update;", "LA00/a$J$a;", "", "roomId", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "forms", "", "isAddGuestButtonVisible", "<init>", "(ILjava/util/List;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getRoomId", "Ljava/util/List;", "getForms", "()Ljava/util/List;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AddHotelGuestsV5Update implements a.J.InterfaceC0007a {

    @NotNull
    private final List<AddHotelGuestsV5VO.GuestFormVO> forms;
    private final Boolean isAddGuestButtonVisible;
    private final int roomId;

    public AddHotelGuestsV5Update(int i11, @NotNull List<AddHotelGuestsV5VO.GuestFormVO> forms, Boolean bool) {
        Intrinsics.checkNotNullParameter(forms, "forms");
        this.roomId = i11;
        this.forms = forms;
        this.isAddGuestButtonVisible = bool;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddHotelGuestsV5Update)) {
            return false;
        }
        AddHotelGuestsV5Update addHotelGuestsV5Update = (AddHotelGuestsV5Update) other;
        return this.roomId == addHotelGuestsV5Update.roomId && Intrinsics.d(this.forms, addHotelGuestsV5Update.forms) && Intrinsics.d(this.isAddGuestButtonVisible, addHotelGuestsV5Update.isAddGuestButtonVisible);
    }

    @NotNull
    public final List<AddHotelGuestsV5VO.GuestFormVO> getForms() {
        return this.forms;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        int b11 = g.b(Integer.hashCode(this.roomId) * 31, 31, this.forms);
        Boolean bool = this.isAddGuestButtonVisible;
        return b11 + (bool == null ? 0 : bool.hashCode());
    }

    /* renamed from: isAddGuestButtonVisible, reason: from getter */
    public final Boolean getIsAddGuestButtonVisible() {
        return this.isAddGuestButtonVisible;
    }

    @NotNull
    public String toString() {
        int i11 = this.roomId;
        List<AddHotelGuestsV5VO.GuestFormVO> list = this.forms;
        Boolean bool = this.isAddGuestButtonVisible;
        StringBuilder sb2 = new StringBuilder("AddHotelGuestsV5Update(roomId=");
        sb2.append(i11);
        sb2.append(", forms=");
        sb2.append(list);
        sb2.append(", isAddGuestButtonVisible=");
        return D3.g.d(sb2, bool, ")");
    }
}
