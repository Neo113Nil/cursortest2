package ru.ozon.app.android.travel.molecules.dto.quickFiltersRowList;

import Ep.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0017JZ\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\fHÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;", "", "filters", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "clearFilters", "hiddenFiltersCount", "viewTracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "maxNumberOfFilterLines", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/util/Map;Ljava/lang/Integer;)V", "getFilters", "()Ljava/util/List;", "getClearFilters", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getHiddenFiltersCount", "getViewTracking", "()Ljava/util/Map;", "getMaxNumberOfFilterLines", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/util/Map;Ljava/lang/Integer;)Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;", "equals", "", "other", "hashCode", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuickFiltersRowListDTO {
    private final TagButtonDTO clearFilters;

    @NotNull
    private final List<TagButtonDTO> filters;
    private final TagButtonDTO hiddenFiltersCount;
    private final Integer maxNumberOfFilterLines;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    public QuickFiltersRowListDTO(@NotNull List<TagButtonDTO> filters, TagButtonDTO tagButtonDTO, TagButtonDTO tagButtonDTO2, Map<String, TokenizedTrackingInfo> map, Integer num) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.filters = filters;
        this.clearFilters = tagButtonDTO;
        this.hiddenFiltersCount = tagButtonDTO2;
        this.viewTracking = map;
        this.maxNumberOfFilterLines = num;
    }

    public static /* synthetic */ QuickFiltersRowListDTO copy$default(QuickFiltersRowListDTO quickFiltersRowListDTO, List list, TagButtonDTO tagButtonDTO, TagButtonDTO tagButtonDTO2, Map map, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = quickFiltersRowListDTO.filters;
        }
        if ((i11 & 2) != 0) {
            tagButtonDTO = quickFiltersRowListDTO.clearFilters;
        }
        if ((i11 & 4) != 0) {
            tagButtonDTO2 = quickFiltersRowListDTO.hiddenFiltersCount;
        }
        if ((i11 & 8) != 0) {
            map = quickFiltersRowListDTO.viewTracking;
        }
        if ((i11 & 16) != 0) {
            num = quickFiltersRowListDTO.maxNumberOfFilterLines;
        }
        Integer num2 = num;
        TagButtonDTO tagButtonDTO3 = tagButtonDTO2;
        return quickFiltersRowListDTO.copy(list, tagButtonDTO, tagButtonDTO3, map, num2);
    }

    @NotNull
    public final List<TagButtonDTO> component1() {
        return this.filters;
    }

    /* renamed from: component2, reason: from getter */
    public final TagButtonDTO getClearFilters() {
        return this.clearFilters;
    }

    /* renamed from: component3, reason: from getter */
    public final TagButtonDTO getHiddenFiltersCount() {
        return this.hiddenFiltersCount;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.viewTracking;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getMaxNumberOfFilterLines() {
        return this.maxNumberOfFilterLines;
    }

    @NotNull
    public final QuickFiltersRowListDTO copy(@NotNull List<TagButtonDTO> filters, TagButtonDTO clearFilters, TagButtonDTO hiddenFiltersCount, Map<String, TokenizedTrackingInfo> viewTracking, Integer maxNumberOfFilterLines) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new QuickFiltersRowListDTO(filters, clearFilters, hiddenFiltersCount, viewTracking, maxNumberOfFilterLines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickFiltersRowListDTO)) {
            return false;
        }
        QuickFiltersRowListDTO quickFiltersRowListDTO = (QuickFiltersRowListDTO) other;
        return Intrinsics.d(this.filters, quickFiltersRowListDTO.filters) && Intrinsics.d(this.clearFilters, quickFiltersRowListDTO.clearFilters) && Intrinsics.d(this.hiddenFiltersCount, quickFiltersRowListDTO.hiddenFiltersCount) && Intrinsics.d(this.viewTracking, quickFiltersRowListDTO.viewTracking) && Intrinsics.d(this.maxNumberOfFilterLines, quickFiltersRowListDTO.maxNumberOfFilterLines);
    }

    public final TagButtonDTO getClearFilters() {
        return this.clearFilters;
    }

    @NotNull
    public final List<TagButtonDTO> getFilters() {
        return this.filters;
    }

    public final TagButtonDTO getHiddenFiltersCount() {
        return this.hiddenFiltersCount;
    }

    public final Integer getMaxNumberOfFilterLines() {
        return this.maxNumberOfFilterLines;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int hashCode = this.filters.hashCode() * 31;
        TagButtonDTO tagButtonDTO = this.clearFilters;
        int hashCode2 = (hashCode + (tagButtonDTO == null ? 0 : tagButtonDTO.hashCode())) * 31;
        TagButtonDTO tagButtonDTO2 = this.hiddenFiltersCount;
        int hashCode3 = (hashCode2 + (tagButtonDTO2 == null ? 0 : tagButtonDTO2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.maxNumberOfFilterLines;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<TagButtonDTO> list = this.filters;
        TagButtonDTO tagButtonDTO = this.clearFilters;
        TagButtonDTO tagButtonDTO2 = this.hiddenFiltersCount;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        Integer num = this.maxNumberOfFilterLines;
        StringBuilder sb2 = new StringBuilder("QuickFiltersRowListDTO(filters=");
        sb2.append(list);
        sb2.append(", clearFilters=");
        sb2.append(tagButtonDTO);
        sb2.append(", hiddenFiltersCount=");
        sb2.append(tagButtonDTO2);
        sb2.append(", viewTracking=");
        sb2.append(map);
        sb2.append(", maxNumberOfFilterLines=");
        return a.c(sb2, num, ")");
    }
}
