package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v2.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"ru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v2/presentation/CustomerContactsUpdate$Inputs", "", "", "inputPosition", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "inputText", "<init>", "(ILru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getInputPosition", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "getInputText", "()Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$TextCommonInputVO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CustomerContactsUpdate$Inputs implements a.J.InterfaceC0007a {
    private final int inputPosition;

    @NotNull
    private final CommonInputVO.TextCommonInputVO inputText;

    public CustomerContactsUpdate$Inputs(int i11, @NotNull CommonInputVO.TextCommonInputVO inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        this.inputPosition = i11;
        this.inputText = inputText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerContactsUpdate$Inputs)) {
            return false;
        }
        CustomerContactsUpdate$Inputs customerContactsUpdate$Inputs = (CustomerContactsUpdate$Inputs) other;
        return this.inputPosition == customerContactsUpdate$Inputs.inputPosition && Intrinsics.d(this.inputText, customerContactsUpdate$Inputs.inputText);
    }

    public final int getInputPosition() {
        return this.inputPosition;
    }

    @NotNull
    public final CommonInputVO.TextCommonInputVO getInputText() {
        return this.inputText;
    }

    public int hashCode() {
        return this.inputText.hashCode() + (Integer.hashCode(this.inputPosition) * 31);
    }

    @NotNull
    public String toString() {
        return "Inputs(inputPosition=" + this.inputPosition + ", inputText=" + this.inputText + ")";
    }
}
