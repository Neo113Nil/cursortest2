package ru.ozon.app.android.travel.molecules.view.quickFiltersRowList;

import K00.b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/quickFiltersRowList/QuickFiltersRowListVO;", "", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "filters", "clearFilters", "hiddenFiltersCount", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewTracking", "", "maxNumberOfFilterLines", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;Ljava/util/Map;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getClearFilters", "()Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "getHiddenFiltersCount", "Ljava/util/Map;", "getViewTracking", "()Ljava/util/Map;", "I", "getMaxNumberOfFilterLines", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class QuickFiltersRowListVO {
    public static final int $stable = 8;
    private final TagButtonDTO clearFilters;

    @NotNull
    private final List<TagButtonDTO> filters;
    private final TagButtonDTO hiddenFiltersCount;
    private final int maxNumberOfFilterLines;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    public QuickFiltersRowListVO(@NotNull List<TagButtonDTO> filters, TagButtonDTO tagButtonDTO, TagButtonDTO tagButtonDTO2, Map<String, TokenizedTrackingInfo> map, int i11) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.filters = filters;
        this.clearFilters = tagButtonDTO;
        this.hiddenFiltersCount = tagButtonDTO2;
        this.viewTracking = map;
        this.maxNumberOfFilterLines = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickFiltersRowListVO)) {
            return false;
        }
        QuickFiltersRowListVO quickFiltersRowListVO = (QuickFiltersRowListVO) other;
        return Intrinsics.d(this.filters, quickFiltersRowListVO.filters) && Intrinsics.d(this.clearFilters, quickFiltersRowListVO.clearFilters) && Intrinsics.d(this.hiddenFiltersCount, quickFiltersRowListVO.hiddenFiltersCount) && Intrinsics.d(this.viewTracking, quickFiltersRowListVO.viewTracking) && this.maxNumberOfFilterLines == quickFiltersRowListVO.maxNumberOfFilterLines;
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

    public final int getMaxNumberOfFilterLines() {
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
        return Integer.hashCode(this.maxNumberOfFilterLines) + ((hashCode3 + (map != null ? map.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        List<TagButtonDTO> list = this.filters;
        TagButtonDTO tagButtonDTO = this.clearFilters;
        TagButtonDTO tagButtonDTO2 = this.hiddenFiltersCount;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        int i11 = this.maxNumberOfFilterLines;
        StringBuilder sb2 = new StringBuilder("QuickFiltersRowListVO(filters=");
        sb2.append(list);
        sb2.append(", clearFilters=");
        sb2.append(tagButtonDTO);
        sb2.append(", hiddenFiltersCount=");
        sb2.append(tagButtonDTO2);
        sb2.append(", viewTracking=");
        sb2.append(map);
        sb2.append(", maxNumberOfFilterLines=");
        return b.e(i11, ")", sb2);
    }
}
