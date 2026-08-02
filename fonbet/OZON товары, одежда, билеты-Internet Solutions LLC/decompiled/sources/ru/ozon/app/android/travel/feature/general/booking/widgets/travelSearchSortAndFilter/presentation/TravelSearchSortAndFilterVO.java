package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation;

import Kk.C3532b;
import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelButtonWithIcon.TravelButtonWithIconVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingVO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b\b\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "sorting", "", "isSortingVisible", "Lru/ozon/app/android/travel/molecules/view/travelButtonWithIcon/TravelButtonWithIconVO;", "priceCalendarText", "isTravelFiltersButtonVisible", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "travelFiltersButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;ZLru/ozon/app/android/travel/molecules/view/travelButtonWithIcon/TravelButtonWithIconVO;ZLru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "getSorting", "()Lru/ozon/app/android/travel/molecules/view/travelSorting/TravelSortingVO;", "Z", "()Z", "Lru/ozon/app/android/travel/molecules/view/travelButtonWithIcon/TravelButtonWithIconVO;", "getPriceCalendarText", "()Lru/ozon/app/android/travel/molecules/view/travelButtonWithIcon/TravelButtonWithIconVO;", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "getTravelFiltersButton", "()Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TravelSearchSortAndFilterVO implements c {
    private final long id;
    private final boolean isSortingVisible;
    private final boolean isTravelFiltersButtonVisible;
    private final TravelButtonWithIconVO priceCalendarText;
    private final TravelSortingVO sorting;
    private final TravelFiltersButtonVO travelFiltersButton;
    private final t viewEvent;

    public TravelSearchSortAndFilterVO(long j11, TravelSortingVO travelSortingVO, boolean z11, TravelButtonWithIconVO travelButtonWithIconVO, boolean z12, TravelFiltersButtonVO travelFiltersButtonVO, t tVar) {
        this.id = j11;
        this.sorting = travelSortingVO;
        this.isSortingVisible = z11;
        this.priceCalendarText = travelButtonWithIconVO;
        this.isTravelFiltersButtonVisible = z12;
        this.travelFiltersButton = travelFiltersButtonVO;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSearchSortAndFilterVO)) {
            return false;
        }
        TravelSearchSortAndFilterVO travelSearchSortAndFilterVO = (TravelSearchSortAndFilterVO) other;
        return this.id == travelSearchSortAndFilterVO.id && Intrinsics.d(this.sorting, travelSearchSortAndFilterVO.sorting) && this.isSortingVisible == travelSearchSortAndFilterVO.isSortingVisible && Intrinsics.d(this.priceCalendarText, travelSearchSortAndFilterVO.priceCalendarText) && this.isTravelFiltersButtonVisible == travelSearchSortAndFilterVO.isTravelFiltersButtonVisible && Intrinsics.d(this.travelFiltersButton, travelSearchSortAndFilterVO.travelFiltersButton) && Intrinsics.d(this.viewEvent, travelSearchSortAndFilterVO.viewEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final TravelButtonWithIconVO getPriceCalendarText() {
        return this.priceCalendarText;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TravelSortingVO getSorting() {
        return this.sorting;
    }

    public final TravelFiltersButtonVO getTravelFiltersButton() {
        return this.travelFiltersButton;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TravelSortingVO travelSortingVO = this.sorting;
        int a11 = C3532b.a((hashCode + (travelSortingVO == null ? 0 : travelSortingVO.hashCode())) * 31, 31, this.isSortingVisible);
        TravelButtonWithIconVO travelButtonWithIconVO = this.priceCalendarText;
        int a12 = C3532b.a((a11 + (travelButtonWithIconVO == null ? 0 : travelButtonWithIconVO.hashCode())) * 31, 31, this.isTravelFiltersButtonVisible);
        TravelFiltersButtonVO travelFiltersButtonVO = this.travelFiltersButton;
        int hashCode2 = (a12 + (travelFiltersButtonVO == null ? 0 : travelFiltersButtonVO.hashCode())) * 31;
        t tVar = this.viewEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isSortingVisible, reason: from getter */
    public final boolean getIsSortingVisible() {
        return this.isSortingVisible;
    }

    /* renamed from: isTravelFiltersButtonVisible, reason: from getter */
    public final boolean getIsTravelFiltersButtonVisible() {
        return this.isTravelFiltersButtonVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TravelSortingVO travelSortingVO = this.sorting;
        boolean z11 = this.isSortingVisible;
        TravelButtonWithIconVO travelButtonWithIconVO = this.priceCalendarText;
        boolean z12 = this.isTravelFiltersButtonVisible;
        TravelFiltersButtonVO travelFiltersButtonVO = this.travelFiltersButton;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("TravelSearchSortAndFilterVO(id=");
        sb2.append(j11);
        sb2.append(", sorting=");
        sb2.append(travelSortingVO);
        sb2.append(", isSortingVisible=");
        sb2.append(z11);
        sb2.append(", priceCalendarText=");
        sb2.append(travelButtonWithIconVO);
        sb2.append(", isTravelFiltersButtonVisible=");
        sb2.append(z12);
        sb2.append(", travelFiltersButton=");
        sb2.append(travelFiltersButtonVO);
        return a.b(sb2, ", viewEvent=", tVar, ")");
    }
}
