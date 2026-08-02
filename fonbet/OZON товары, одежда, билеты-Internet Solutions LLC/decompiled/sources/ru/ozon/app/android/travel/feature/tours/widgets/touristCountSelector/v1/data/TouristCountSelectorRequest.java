package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data;

import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007HÆ\u0003J1\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorRequest;", "", "values", "", "", "", "children", "", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getValues", "()Ljava/util/Map;", "getChildren", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TouristCountSelectorRequest {
    public static final int $stable = 8;

    @NotNull
    private final List<String> children;

    @NotNull
    private final Map<String, Integer> values;

    public TouristCountSelectorRequest(@NotNull Map<String, Integer> values, @NotNull List<String> children) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(children, "children");
        this.values = values;
        this.children = children;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TouristCountSelectorRequest copy$default(TouristCountSelectorRequest touristCountSelectorRequest, Map map, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = touristCountSelectorRequest.values;
        }
        if ((i11 & 2) != 0) {
            list = touristCountSelectorRequest.children;
        }
        return touristCountSelectorRequest.copy(map, list);
    }

    @NotNull
    public final Map<String, Integer> component1() {
        return this.values;
    }

    @NotNull
    public final List<String> component2() {
        return this.children;
    }

    @NotNull
    public final TouristCountSelectorRequest copy(@NotNull Map<String, Integer> values, @NotNull List<String> children) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(children, "children");
        return new TouristCountSelectorRequest(values, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristCountSelectorRequest)) {
            return false;
        }
        TouristCountSelectorRequest touristCountSelectorRequest = (TouristCountSelectorRequest) other;
        return Intrinsics.d(this.values, touristCountSelectorRequest.values) && Intrinsics.d(this.children, touristCountSelectorRequest.children);
    }

    @NotNull
    public final List<String> getChildren() {
        return this.children;
    }

    @NotNull
    public final Map<String, Integer> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.children.hashCode() + (this.values.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "TouristCountSelectorRequest(values=" + this.values + ", children=" + this.children + ")";
    }
}
