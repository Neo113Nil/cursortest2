package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems;

import B0.C2454a;
import Ek.a;
import G.g;
import N3.C3660k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJR\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSeatsSchemeV2Item;", "", "id", "", "topOffset", "itemsOffset", "schemeWidth", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentV2;", "contentList", "", "isSticky", "<init>", "(Ljava/lang/String;IIILjava/util/List;Z)V", "copy", "(Ljava/lang/String;IIILjava/util/List;Z)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "I", "getTopOffset", "getItemsOffset", "getSchemeWidth", "Ljava/util/List;", "getContentList", "()Ljava/util/List;", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlightSchemeContentRowV2 implements FlightSeatsSchemeV2Item {

    @NotNull
    private final List<FlightSchemeContentV2> contentList;

    @NotNull
    private final String id;
    private final boolean isSticky;
    private final int itemsOffset;
    private final int schemeWidth;
    private final int topOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public FlightSchemeContentRowV2(@NotNull String id2, int i11, int i12, int i13, @NotNull List<? extends FlightSchemeContentV2> contentList, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        this.id = id2;
        this.topOffset = i11;
        this.itemsOffset = i12;
        this.schemeWidth = i13;
        this.contentList = contentList;
        this.isSticky = z11;
    }

    public static /* synthetic */ FlightSchemeContentRowV2 copy$default(FlightSchemeContentRowV2 flightSchemeContentRowV2, String str, int i11, int i12, int i13, List list, boolean z11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = flightSchemeContentRowV2.id;
        }
        if ((i14 & 2) != 0) {
            i11 = flightSchemeContentRowV2.topOffset;
        }
        if ((i14 & 4) != 0) {
            i12 = flightSchemeContentRowV2.itemsOffset;
        }
        if ((i14 & 8) != 0) {
            i13 = flightSchemeContentRowV2.schemeWidth;
        }
        if ((i14 & 16) != 0) {
            list = flightSchemeContentRowV2.contentList;
        }
        if ((i14 & 32) != 0) {
            z11 = flightSchemeContentRowV2.isSticky;
        }
        List list2 = list;
        boolean z12 = z11;
        return flightSchemeContentRowV2.copy(str, i11, i12, i13, list2, z12);
    }

    @NotNull
    public final FlightSchemeContentRowV2 copy(@NotNull String id2, int topOffset, int itemsOffset, int schemeWidth, @NotNull List<? extends FlightSchemeContentV2> contentList, boolean isSticky) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(contentList, "contentList");
        return new FlightSchemeContentRowV2(id2, topOffset, itemsOffset, schemeWidth, contentList, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlightSchemeContentRowV2)) {
            return false;
        }
        FlightSchemeContentRowV2 flightSchemeContentRowV2 = (FlightSchemeContentRowV2) other;
        return Intrinsics.d(this.id, flightSchemeContentRowV2.id) && this.topOffset == flightSchemeContentRowV2.topOffset && this.itemsOffset == flightSchemeContentRowV2.itemsOffset && this.schemeWidth == flightSchemeContentRowV2.schemeWidth && Intrinsics.d(this.contentList, flightSchemeContentRowV2.contentList) && this.isSticky == flightSchemeContentRowV2.isSticky;
    }

    @NotNull
    public final List<FlightSchemeContentV2> getContentList() {
        return this.contentList;
    }

    @Override // ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSeatsSchemeV2Item
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
        return Boolean.hashCode(this.isSticky) + g.b(C2454a.a(this.schemeWidth, C2454a.a(this.itemsOffset, C2454a.a(this.topOffset, this.id.hashCode() * 31, 31), 31), 31), 31, this.contentList);
    }

    /* renamed from: isSticky, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        int i11 = this.topOffset;
        int i12 = this.itemsOffset;
        int i13 = this.schemeWidth;
        List<FlightSchemeContentV2> list = this.contentList;
        boolean z11 = this.isSticky;
        StringBuilder c11 = C3660k.c(i11, "FlightSchemeContentRowV2(id=", str, ", topOffset=", ", itemsOffset=");
        a.f(i12, i13, ", schemeWidth=", ", contentList=", c11);
        c11.append(list);
        c11.append(", isSticky=");
        c11.append(z11);
        c11.append(")");
        return c11.toString();
    }
}
