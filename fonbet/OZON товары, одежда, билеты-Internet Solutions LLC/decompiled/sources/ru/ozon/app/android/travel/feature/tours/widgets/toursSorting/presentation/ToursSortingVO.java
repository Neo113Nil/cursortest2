package ru.ozon.app.android.travel.feature.tours.widgets.toursSorting.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingVO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSorting/presentation/ToursSortingVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "sortingInfo", "Lru/ozon/uni/atoms/data/text/TextDTO;", "searchResultCount", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;Lru/ozon/uni/atoms/data/text/TextDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "getSortingInfo", "()Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSearchResultCount", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ToursSortingVO implements c {
    private final long id;
    private final TextDTO searchResultCount;

    @NotNull
    private final TravelSortingVO sortingInfo;
    private final t viewEvent;

    public ToursSortingVO(long j11, @NotNull TravelSortingVO sortingInfo, TextDTO textDTO, t tVar) {
        Intrinsics.checkNotNullParameter(sortingInfo, "sortingInfo");
        this.id = j11;
        this.sortingInfo = sortingInfo;
        this.searchResultCount = textDTO;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursSortingVO)) {
            return false;
        }
        ToursSortingVO toursSortingVO = (ToursSortingVO) other;
        return this.id == toursSortingVO.id && Intrinsics.d(this.sortingInfo, toursSortingVO.sortingInfo) && Intrinsics.d(this.searchResultCount, toursSortingVO.searchResultCount) && Intrinsics.d(this.viewEvent, toursSortingVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSearchResultCount() {
        return this.searchResultCount;
    }

    @NotNull
    public final TravelSortingVO getSortingInfo() {
        return this.sortingInfo;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.sortingInfo.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        TextDTO textDTO = this.searchResultCount;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ToursSortingVO(id=" + this.id + ", sortingInfo=" + this.sortingInfo + ", searchResultCount=" + this.searchResultCount + ", viewEvent=" + this.viewEvent + ")";
    }
}
