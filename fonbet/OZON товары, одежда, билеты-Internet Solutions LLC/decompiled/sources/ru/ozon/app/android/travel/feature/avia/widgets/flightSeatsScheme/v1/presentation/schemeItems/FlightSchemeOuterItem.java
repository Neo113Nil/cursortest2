package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import B4.V;
import Pk0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeOuterItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "", "id", "", "topRadius", "bottomRadius", "<init>", "(Ljava/lang/String;FF)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "F", "getTopRadius", "()F", "getBottomRadius", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeOuterItem implements FlightSeatsSchemeItem {
    private final float bottomRadius;

    @NotNull
    private final String id;
    private final float topRadius;

    public FlightSchemeOuterItem(@NotNull String id2, float f7, float f11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.topRadius = f7;
        this.bottomRadius = f11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeOuterItem)) {
            return false;
        }
        FlightSchemeOuterItem flightSchemeOuterItem = (FlightSchemeOuterItem) other;
        return Intrinsics.d(this.id, flightSchemeOuterItem.id) && Float.compare(this.topRadius, flightSchemeOuterItem.topRadius) == 0 && Float.compare(this.bottomRadius, flightSchemeOuterItem.bottomRadius) == 0;
    }

    public final float getBottomRadius() {
        return this.bottomRadius;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem
    @NotNull
    public String getId() {
        return this.id;
    }

    public final float getTopRadius() {
        return this.topRadius;
    }

    public int hashCode() {
        return Float.hashCode(this.bottomRadius) + b.a(this.topRadius, this.id.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        float f7 = this.topRadius;
        float f11 = this.bottomRadius;
        StringBuilder sb2 = new StringBuilder("FlightSchemeOuterItem(id=");
        sb2.append(str);
        sb2.append(", topRadius=");
        sb2.append(f7);
        sb2.append(", bottomRadius=");
        return V.b(f11, ")", sb2);
    }
}
