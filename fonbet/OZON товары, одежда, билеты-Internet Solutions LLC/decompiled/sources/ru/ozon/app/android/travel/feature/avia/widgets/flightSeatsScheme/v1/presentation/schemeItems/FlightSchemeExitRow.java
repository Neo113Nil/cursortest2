package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import Ak.C2436a;
import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeExitRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "leftText", "rightText", "", "schemeWidth", "topOffset", "exitMarkingColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;IILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getLeftText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRightText", "I", "getSchemeWidth", "getTopOffset", "getExitMarkingColor", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeExitRow implements FlightSeatsSchemeItem {
    public static final int $stable = TextAtom.$stable;

    @NotNull
    private final String exitMarkingColor;

    @NotNull
    private final String id;
    private final TextAtom leftText;
    private final TextAtom rightText;
    private final int schemeWidth;
    private final int topOffset;

    public FlightSchemeExitRow(@NotNull String id2, TextAtom textAtom, TextAtom textAtom2, int i11, int i12, @NotNull String exitMarkingColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(exitMarkingColor, "exitMarkingColor");
        this.id = id2;
        this.leftText = textAtom;
        this.rightText = textAtom2;
        this.schemeWidth = i11;
        this.topOffset = i12;
        this.exitMarkingColor = exitMarkingColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeExitRow)) {
            return false;
        }
        FlightSchemeExitRow flightSchemeExitRow = (FlightSchemeExitRow) other;
        return Intrinsics.d(this.id, flightSchemeExitRow.id) && Intrinsics.d(this.leftText, flightSchemeExitRow.leftText) && Intrinsics.d(this.rightText, flightSchemeExitRow.rightText) && this.schemeWidth == flightSchemeExitRow.schemeWidth && this.topOffset == flightSchemeExitRow.topOffset && Intrinsics.d(this.exitMarkingColor, flightSchemeExitRow.exitMarkingColor);
    }

    @NotNull
    public final String getExitMarkingColor() {
        return this.exitMarkingColor;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem
    @NotNull
    public String getId() {
        return this.id;
    }

    public final TextAtom getLeftText() {
        return this.leftText;
    }

    public final TextAtom getRightText() {
        return this.rightText;
    }

    public final int getSchemeWidth() {
        return this.schemeWidth;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        TextAtom textAtom = this.leftText;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.rightText;
        return this.exitMarkingColor.hashCode() + C2454a.a(this.topOffset, C2454a.a(this.schemeWidth, (hashCode2 + (textAtom2 != null ? textAtom2.hashCode() : 0)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.leftText;
        TextAtom textAtom2 = this.rightText;
        int i11 = this.schemeWidth;
        int i12 = this.topOffset;
        String str2 = this.exitMarkingColor;
        StringBuilder d11 = C2436a.d("FlightSchemeExitRow(id=", str, ", leftText=", ", rightText=", textAtom);
        d11.append(textAtom2);
        d11.append(", schemeWidth=");
        d11.append(i11);
        d11.append(", topOffset=");
        d11.append(i12);
        d11.append(", exitMarkingColor=");
        d11.append(str2);
        d11.append(")");
        return d11.toString();
    }
}
