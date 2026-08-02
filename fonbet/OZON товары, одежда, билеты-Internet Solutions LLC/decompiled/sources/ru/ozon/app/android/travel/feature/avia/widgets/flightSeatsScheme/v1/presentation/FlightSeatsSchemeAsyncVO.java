package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeBlockVO;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/FlightSeatsSchemeAsyncVO;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "schemeBlock", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "passengersBlock", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "emptyState", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "getSchemeBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeBlockVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "getPassengersBlock", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSeatsSchemeAsyncVO {
    private final EmptyStateVO emptyState;

    @NotNull
    private final FlightSeatsSchemePassengersBlockVO passengersBlock;

    @NotNull
    private final FlightSeatsSchemeBlockVO schemeBlock;

    public FlightSeatsSchemeAsyncVO(@NotNull FlightSeatsSchemeBlockVO schemeBlock, @NotNull FlightSeatsSchemePassengersBlockVO passengersBlock, EmptyStateVO emptyStateVO) {
        Intrinsics.checkNotNullParameter(schemeBlock, "schemeBlock");
        Intrinsics.checkNotNullParameter(passengersBlock, "passengersBlock");
        this.schemeBlock = schemeBlock;
        this.passengersBlock = passengersBlock;
        this.emptyState = emptyStateVO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSeatsSchemeAsyncVO)) {
            return false;
        }
        FlightSeatsSchemeAsyncVO flightSeatsSchemeAsyncVO = (FlightSeatsSchemeAsyncVO) other;
        return Intrinsics.d(this.schemeBlock, flightSeatsSchemeAsyncVO.schemeBlock) && Intrinsics.d(this.passengersBlock, flightSeatsSchemeAsyncVO.passengersBlock) && Intrinsics.d(this.emptyState, flightSeatsSchemeAsyncVO.emptyState);
    }

    public final EmptyStateVO getEmptyState() {
        return this.emptyState;
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO getPassengersBlock() {
        return this.passengersBlock;
    }

    @NotNull
    public final FlightSeatsSchemeBlockVO getSchemeBlock() {
        return this.schemeBlock;
    }

    public int hashCode() {
        int hashCode = (this.passengersBlock.hashCode() + (this.schemeBlock.hashCode() * 31)) * 31;
        EmptyStateVO emptyStateVO = this.emptyState;
        return hashCode + (emptyStateVO == null ? 0 : emptyStateVO.hashCode());
    }

    @NotNull
    public String toString() {
        return "FlightSeatsSchemeAsyncVO(schemeBlock=" + this.schemeBlock + ", passengersBlock=" + this.passengersBlock + ", emptyState=" + this.emptyState + ")";
    }
}
