package ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.presentation;

import java.util.BitSet;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaComplexSearchForm/presentation/AviaComplexSearchFormPayload;", "", "<init>", "()V", "bitSet", "Ljava/util/BitSet;", "setRouteListChanged", "", "setAddFlightButtonChanged", "setPassengerButtonChanged", "setSubmitButtonChanged", "isRouteListChanged", "", "isAddFlightButtonChanged", "isPassengerButtonChanged", "isSubmitButtonChanged", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaComplexSearchFormPayload {

    @NotNull
    private final BitSet bitSet = new BitSet();

    public final boolean isAddFlightButtonChanged() {
        return this.bitSet.get(2);
    }

    public final boolean isPassengerButtonChanged() {
        return this.bitSet.get(3);
    }

    public final boolean isRouteListChanged() {
        return this.bitSet.get(1);
    }

    public final boolean isSubmitButtonChanged() {
        return this.bitSet.get(4);
    }

    public final void setAddFlightButtonChanged() {
        this.bitSet.set(2, true);
    }

    public final void setPassengerButtonChanged() {
        this.bitSet.set(3, true);
    }

    public final void setRouteListChanged() {
        this.bitSet.set(1, true);
    }

    public final void setSubmitButtonChanged() {
        this.bitSet.set(4, true);
    }
}
