package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import Am.C2438a;
import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeTextContentV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentV2;", "", "width", "height", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;", "fuselageType", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "<init>", "(IILru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getWidth", "getHeight", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;", "getFuselageType", "()Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeTextContentV2 implements FlightSchemeContentV2 {

    @NotNull
    private final AirplaneSeatTypeV2VI.FuselageType fuselageType;
    private final int height;

    @NotNull
    private final TextDTO text;
    private final int width;

    public FlightSchemeTextContentV2(int i11, int i12, @NotNull AirplaneSeatTypeV2VI.FuselageType fuselageType, @NotNull TextDTO text) {
        Intrinsics.checkNotNullParameter(fuselageType, "fuselageType");
        Intrinsics.checkNotNullParameter(text, "text");
        this.width = i11;
        this.height = i12;
        this.fuselageType = fuselageType;
        this.text = text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeTextContentV2)) {
            return false;
        }
        FlightSchemeTextContentV2 flightSchemeTextContentV2 = (FlightSchemeTextContentV2) other;
        return this.width == flightSchemeTextContentV2.width && this.height == flightSchemeTextContentV2.height && this.fuselageType == flightSchemeTextContentV2.fuselageType && Intrinsics.d(this.text, flightSchemeTextContentV2.text);
    }

    @NotNull
    public final AirplaneSeatTypeV2VI.FuselageType getFuselageType() {
        return this.fuselageType;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2
    public int getHeight() {
        return this.height;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentV2
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.text.hashCode() + ((this.fuselageType.hashCode() + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        AirplaneSeatTypeV2VI.FuselageType fuselageType = this.fuselageType;
        TextDTO textDTO = this.text;
        StringBuilder a11 = C2438a.a("FlightSchemeTextContentV2(width=", i11, ", height=", ", fuselageType=", i12);
        a11.append(fuselageType);
        a11.append(", text=");
        a11.append(textDTO);
        a11.append(")");
        return a11.toString();
    }
}
