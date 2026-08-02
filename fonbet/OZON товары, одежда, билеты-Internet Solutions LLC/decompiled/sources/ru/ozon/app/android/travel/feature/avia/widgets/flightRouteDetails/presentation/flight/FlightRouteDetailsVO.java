package ru.ozon.app.android.travel.feature.avia.widgets.flightRouteDetails.presentation.flight;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightRouteDetails/presentation/flight/FlightRouteDetailsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "flight", "", "marginBetweenFlights", "Lkotlin/Pair;", "Lru/ozon/uni/atoms/af/AtomAction;", "modalAction", "<init>", "(JLru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;ILkotlin/Pair;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "getFlight", "()Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "I", "getMarginBetweenFlights", "Lkotlin/Pair;", "getModalAction", "()Lkotlin/Pair;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightRouteDetailsVO implements c {

    @NotNull
    private final FlightDetailsVO flight;
    private final long id;
    private final int marginBetweenFlights;
    private final Pair<Long, AtomAction> modalAction;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightRouteDetailsVO(long j11, @NotNull FlightDetailsVO flight, int i11, Pair<Long, ? extends AtomAction> pair) {
        Intrinsics.checkNotNullParameter(flight, "flight");
        this.id = j11;
        this.flight = flight;
        this.marginBetweenFlights = i11;
        this.modalAction = pair;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightRouteDetailsVO)) {
            return false;
        }
        FlightRouteDetailsVO flightRouteDetailsVO = (FlightRouteDetailsVO) other;
        return this.id == flightRouteDetailsVO.id && Intrinsics.d(this.flight, flightRouteDetailsVO.flight) && this.marginBetweenFlights == flightRouteDetailsVO.marginBetweenFlights && Intrinsics.d(this.modalAction, flightRouteDetailsVO.modalAction);
    }

    @NotNull
    public final FlightDetailsVO getFlight() {
        return this.flight;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getMarginBetweenFlights() {
        return this.marginBetweenFlights;
    }

    public final Pair<Long, AtomAction> getModalAction() {
        return this.modalAction;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C2454a.a(this.marginBetweenFlights, (this.flight.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        Pair<Long, AtomAction> pair = this.modalAction;
        return a11 + (pair == null ? 0 : pair.hashCode());
    }

    @NotNull
    public String toString() {
        return "FlightRouteDetailsVO(id=" + this.id + ", flight=" + this.flight + ", marginBetweenFlights=" + this.marginBetweenFlights + ", modalAction=" + this.modalAction + ")";
    }
}
