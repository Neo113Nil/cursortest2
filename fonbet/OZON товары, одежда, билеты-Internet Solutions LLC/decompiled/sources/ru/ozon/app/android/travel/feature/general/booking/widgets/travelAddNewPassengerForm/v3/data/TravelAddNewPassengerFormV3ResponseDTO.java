package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3ResponseDTO;", "", "inputs", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "<init>", "(Ljava/util/List;)V", "getInputs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelAddNewPassengerFormV3ResponseDTO {
    private final List<TravelAddNewPassengerFormV3DTO.InputItemDTO> inputs;

    public TravelAddNewPassengerFormV3ResponseDTO(List<TravelAddNewPassengerFormV3DTO.InputItemDTO> list) {
        this.inputs = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelAddNewPassengerFormV3ResponseDTO copy$default(TravelAddNewPassengerFormV3ResponseDTO travelAddNewPassengerFormV3ResponseDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelAddNewPassengerFormV3ResponseDTO.inputs;
        }
        return travelAddNewPassengerFormV3ResponseDTO.copy(list);
    }

    public final List<TravelAddNewPassengerFormV3DTO.InputItemDTO> component1() {
        return this.inputs;
    }

    @NotNull
    public final TravelAddNewPassengerFormV3ResponseDTO copy(List<TravelAddNewPassengerFormV3DTO.InputItemDTO> inputs) {
        return new TravelAddNewPassengerFormV3ResponseDTO(inputs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TravelAddNewPassengerFormV3ResponseDTO) && Intrinsics.d(this.inputs, ((TravelAddNewPassengerFormV3ResponseDTO) other).inputs);
    }

    public final List<TravelAddNewPassengerFormV3DTO.InputItemDTO> getInputs() {
        return this.inputs;
    }

    public int hashCode() {
        List<TravelAddNewPassengerFormV3DTO.InputItemDTO> list = this.inputs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TravelAddNewPassengerFormV3ResponseDTO(inputs=", ")", this.inputs);
    }
}
