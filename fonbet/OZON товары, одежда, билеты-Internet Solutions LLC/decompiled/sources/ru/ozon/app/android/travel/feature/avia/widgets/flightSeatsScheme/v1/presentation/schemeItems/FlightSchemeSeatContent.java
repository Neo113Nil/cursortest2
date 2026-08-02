package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import Am.C2438a;
import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeSeatContent;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContent;", "", "width", "height", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "seat", "<init>", "(IILru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;)V", "copy", "(IILru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeSeatContent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "getSeat", "()Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeSeatContent implements FlightSchemeContent {
    public static final int $stable = TextAtom.$stable;
    private final int height;

    @NotNull
    private final AirplaneSeatVO seat;
    private final int width;

    public FlightSchemeSeatContent(int i11, int i12, @NotNull AirplaneSeatVO seat) {
        Intrinsics.checkNotNullParameter(seat, "seat");
        this.width = i11;
        this.height = i12;
        this.seat = seat;
    }

    public static /* synthetic */ FlightSchemeSeatContent copy$default(FlightSchemeSeatContent flightSchemeSeatContent, int i11, int i12, AirplaneSeatVO airplaneSeatVO, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = flightSchemeSeatContent.width;
        }
        if ((i13 & 2) != 0) {
            i12 = flightSchemeSeatContent.height;
        }
        if ((i13 & 4) != 0) {
            airplaneSeatVO = flightSchemeSeatContent.seat;
        }
        return flightSchemeSeatContent.copy(i11, i12, airplaneSeatVO);
    }

    @NotNull
    public final FlightSchemeSeatContent copy(int width, int height, @NotNull AirplaneSeatVO seat) {
        Intrinsics.checkNotNullParameter(seat, "seat");
        return new FlightSchemeSeatContent(width, height, seat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeSeatContent)) {
            return false;
        }
        FlightSchemeSeatContent flightSchemeSeatContent = (FlightSchemeSeatContent) other;
        return this.width == flightSchemeSeatContent.width && this.height == flightSchemeSeatContent.height && Intrinsics.d(this.seat, flightSchemeSeatContent.seat);
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContent
    public int getHeight() {
        return this.height;
    }

    @NotNull
    public final AirplaneSeatVO getSeat() {
        return this.seat;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContent
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.seat.hashCode() + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        AirplaneSeatVO airplaneSeatVO = this.seat;
        StringBuilder a11 = C2438a.a("FlightSchemeSeatContent(width=", i11, ", height=", ", seat=", i12);
        a11.append(airplaneSeatVO);
        a11.append(")");
        return a11.toString();
    }
}
