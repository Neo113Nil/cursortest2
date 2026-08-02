package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import A00.a;
import H3.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/UpdateIsInputV2ChangedByClient;", "LA00/a$J$a;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "inputItems", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInputItems", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateIsInputV2ChangedByClient implements a.J.InterfaceC0007a {

    @NotNull
    private final List<TravelAddNewPassengerFormV3VO.InputItemVO> inputItems;

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateIsInputV2ChangedByClient(@NotNull List<? extends TravelAddNewPassengerFormV3VO.InputItemVO> inputItems) {
        Intrinsics.checkNotNullParameter(inputItems, "inputItems");
        this.inputItems = inputItems;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateIsInputV2ChangedByClient) && Intrinsics.d(this.inputItems, ((UpdateIsInputV2ChangedByClient) other).inputItems);
    }

    @NotNull
    public final List<TravelAddNewPassengerFormV3VO.InputItemVO> getInputItems() {
        return this.inputItems;
    }

    public int hashCode() {
        return this.inputItems.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("UpdateIsInputV2ChangedByClient(inputItems=", ")", this.inputItems);
    }
}
