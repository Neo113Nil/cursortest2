package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems;

import B0.C2454a;
import B90.C2618u;
import Ek.a;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJH\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeItem;", "", "id", "", "topOffset", "itemsOffset", "schemeWidth", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContent;", "contentList", "<init>", "(Ljava/lang/String;IIILjava/util/List;)V", "copy", "(Ljava/lang/String;IIILjava/util/List;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getTopOffset", "getItemsOffset", "getSchemeWidth", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeContentRow implements FlightSeatsSchemeItem {

    @NotNull
    private final List<FlightSchemeContent> contentList;

    @NotNull
    private final String id;
    private final int itemsOffset;
    private final int schemeWidth;
    private final int topOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSchemeContentRow(@NotNull String id2, int i11, int i12, int i13, @NotNull List<? extends FlightSchemeContent> contentList) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        this.id = id2;
        this.topOffset = i11;
        this.itemsOffset = i12;
        this.schemeWidth = i13;
        this.contentList = contentList;
    }

    public static /* synthetic */ FlightSchemeContentRow copy$default(FlightSchemeContentRow flightSchemeContentRow, String str, int i11, int i12, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = flightSchemeContentRow.id;
        }
        if ((i14 & 2) != 0) {
            i11 = flightSchemeContentRow.topOffset;
        }
        if ((i14 & 4) != 0) {
            i12 = flightSchemeContentRow.itemsOffset;
        }
        if ((i14 & 8) != 0) {
            i13 = flightSchemeContentRow.schemeWidth;
        }
        if ((i14 & 16) != 0) {
            list = flightSchemeContentRow.contentList;
        }
        List list2 = list;
        int i15 = i12;
        return flightSchemeContentRow.copy(str, i11, i15, i13, list2);
    }

    @NotNull
    public final FlightSchemeContentRow copy(@NotNull String id2, int topOffset, int itemsOffset, int schemeWidth, @NotNull List<? extends FlightSchemeContent> contentList) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        return new FlightSchemeContentRow(id2, topOffset, itemsOffset, schemeWidth, contentList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeContentRow)) {
            return false;
        }
        FlightSchemeContentRow flightSchemeContentRow = (FlightSchemeContentRow) other;
        return Intrinsics.d(this.id, flightSchemeContentRow.id) && this.topOffset == flightSchemeContentRow.topOffset && this.itemsOffset == flightSchemeContentRow.itemsOffset && this.schemeWidth == flightSchemeContentRow.schemeWidth && Intrinsics.d(this.contentList, flightSchemeContentRow.contentList);
    }

    @NotNull
    public final List<FlightSchemeContent> getContentList() {
        return this.contentList;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem
    @NotNull
    public String getId() {
        return this.id;
    }

    public final int getItemsOffset() {
        return this.itemsOffset;
    }

    public final int getSchemeWidth() {
        return this.schemeWidth;
    }

    public final int getTopOffset() {
        return this.topOffset;
    }

    public int hashCode() {
        return this.contentList.hashCode() + C2454a.a(this.schemeWidth, C2454a.a(this.itemsOffset, C2454a.a(this.topOffset, this.id.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        int i11 = this.topOffset;
        int i12 = this.itemsOffset;
        int i13 = this.schemeWidth;
        List<FlightSchemeContent> list = this.contentList;
        StringBuilder c11 = C3660k.c(i11, "FlightSchemeContentRow(id=", str, ", topOffset=", ", itemsOffset=");
        a.f(i12, i13, ", schemeWidth=", ", contentList=", c11);
        return C2618u.h(c11, list, ")");
    }
}
