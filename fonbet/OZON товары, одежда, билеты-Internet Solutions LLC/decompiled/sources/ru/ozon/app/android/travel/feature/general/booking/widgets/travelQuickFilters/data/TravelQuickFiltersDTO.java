package ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelQuickFilters/data/TravelQuickFiltersDTO;", "", "tags", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "isSticky", "", "<init>", "(Ljava/util/List;Z)V", "getTags", "()Ljava/util/List;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelQuickFiltersDTO {
    private final boolean isSticky;

    @NotNull
    private final List<AtomDTO> tags;

    public TravelQuickFiltersDTO() {
        this(null, false, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelQuickFiltersDTO copy$default(TravelQuickFiltersDTO travelQuickFiltersDTO, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelQuickFiltersDTO.tags;
        }
        if ((i11 & 2) != 0) {
            z11 = travelQuickFiltersDTO.isSticky;
        }
        return travelQuickFiltersDTO.copy(list, z11);
    }

    @NotNull
    public final List<AtomDTO> component1() {
        return this.tags;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    @NotNull
    public final TravelQuickFiltersDTO copy(@NotNull List<? extends AtomDTO> tags, boolean isSticky) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return new TravelQuickFiltersDTO(tags, isSticky);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelQuickFiltersDTO)) {
            return false;
        }
        TravelQuickFiltersDTO travelQuickFiltersDTO = (TravelQuickFiltersDTO) other;
        return Intrinsics.d(this.tags, travelQuickFiltersDTO.tags) && this.isSticky == travelQuickFiltersDTO.isSticky;
    }

    @NotNull
    public final List<AtomDTO> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSticky) + (this.tags.hashCode() * 31);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        return "TravelQuickFiltersDTO(tags=" + this.tags + ", isSticky=" + this.isSticky + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TravelQuickFiltersDTO(@NotNull List<? extends AtomDTO> tags, boolean z11) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.tags = tags;
        this.isSticky = z11;
    }

    public TravelQuickFiltersDTO(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? K.f71697a : list, (i11 & 2) != 0 ? false : z11);
    }
}
