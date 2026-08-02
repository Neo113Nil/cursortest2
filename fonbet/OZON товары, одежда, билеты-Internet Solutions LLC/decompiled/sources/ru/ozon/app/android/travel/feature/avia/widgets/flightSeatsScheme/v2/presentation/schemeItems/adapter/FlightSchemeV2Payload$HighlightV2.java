package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter;

import Ak.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"ru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/adapter/FlightSchemeV2Payload$HighlightV2", "", "", "seatNumber", "", "shouldDelay", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSeatNumber", "Z", "getShouldDelay", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeV2Payload$HighlightV2 {

    @NotNull
    private final String seatNumber;
    private final boolean shouldDelay;

    public FlightSchemeV2Payload$HighlightV2(@NotNull String seatNumber, boolean z11) {
        Intrinsics.checkNotNullParameter(seatNumber, "seatNumber");
        this.seatNumber = seatNumber;
        this.shouldDelay = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeV2Payload$HighlightV2)) {
            return false;
        }
        FlightSchemeV2Payload$HighlightV2 flightSchemeV2Payload$HighlightV2 = (FlightSchemeV2Payload$HighlightV2) other;
        return Intrinsics.d(this.seatNumber, flightSchemeV2Payload$HighlightV2.seatNumber) && this.shouldDelay == flightSchemeV2Payload$HighlightV2.shouldDelay;
    }

    @NotNull
    public final String getSeatNumber() {
        return this.seatNumber;
    }

    public final boolean getShouldDelay() {
        return this.shouldDelay;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldDelay) + (this.seatNumber.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.f("HighlightV2(seatNumber=", this.seatNumber, ", shouldDelay=", ")", this.shouldDelay);
    }

    public /* synthetic */ FlightSchemeV2Payload$HighlightV2(String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? false : z11);
    }
}
