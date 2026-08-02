package ru.ozon.app.android.orderdetails.radiogroup.data;

import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/orderdetails/radiogroup/data/RadioGroupDTO;", "", "radioButtons", "", "Lru/ozon/app/android/orderdetails/radiogroup/data/RadioButtonDTO;", "<init>", "(Ljava/util/List;)V", "getRadioButtons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RadioGroupDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<RadioButtonDTO> radioButtons;

    public RadioGroupDTO(@NotNull List<RadioButtonDTO> radioButtons) {
        Intrinsics.checkNotNullParameter(radioButtons, "radioButtons");
        this.radioButtons = radioButtons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadioGroupDTO copy$default(RadioGroupDTO radioGroupDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = radioGroupDTO.radioButtons;
        }
        return radioGroupDTO.copy(list);
    }

    @NotNull
    public final List<RadioButtonDTO> component1() {
        return this.radioButtons;
    }

    @NotNull
    public final RadioGroupDTO copy(@NotNull List<RadioButtonDTO> radioButtons) {
        Intrinsics.checkNotNullParameter(radioButtons, "radioButtons");
        return new RadioGroupDTO(radioButtons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RadioGroupDTO) && Intrinsics.d(this.radioButtons, ((RadioGroupDTO) other).radioButtons);
    }

    @NotNull
    public final List<RadioButtonDTO> getRadioButtons() {
        return this.radioButtons;
    }

    public int hashCode() {
        return this.radioButtons.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("RadioGroupDTO(radioButtons=", ")", this.radioButtons);
    }
}
