package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation;

import D40.a;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v1.TravelCellListVO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0012R\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010!\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "originCellList", "filteredCellList", "", "isCellListVisible", "", "filterKey", "forceUpdate", "<init>", "(JLru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;ZLjava/lang/String;Z)V", "copy", "(JLru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;ZLjava/lang/String;Z)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/ToursMealVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "getOriginCellList", "()Lru/ozon/app/android/travel/molecules/view/travelCellList/v1/TravelCellListVO;", "getFilteredCellList", "Z", "()Z", "Ljava/lang/String;", "getFilterKey", "getForceUpdate", "setForceUpdate", "(Z)V", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ToursMealVO implements c {
    private final String filterKey;

    @NotNull
    private final TravelCellListVO filteredCellList;
    private boolean forceUpdate;
    private final long id;
    private final boolean isCellListVisible;

    @NotNull
    private final TravelCellListVO originCellList;

    public ToursMealVO(long j11, @NotNull TravelCellListVO originCellList, @NotNull TravelCellListVO filteredCellList, boolean z11, String str, boolean z12) {
        Intrinsics.checkNotNullParameter(originCellList, "originCellList");
        Intrinsics.checkNotNullParameter(filteredCellList, "filteredCellList");
        this.id = j11;
        this.originCellList = originCellList;
        this.filteredCellList = filteredCellList;
        this.isCellListVisible = z11;
        this.filterKey = str;
        this.forceUpdate = z12;
    }

    public static /* synthetic */ ToursMealVO copy$default(ToursMealVO toursMealVO, long j11, TravelCellListVO travelCellListVO, TravelCellListVO travelCellListVO2, boolean z11, String str, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = toursMealVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            travelCellListVO = toursMealVO.originCellList;
        }
        TravelCellListVO travelCellListVO3 = travelCellListVO;
        if ((i11 & 4) != 0) {
            travelCellListVO2 = toursMealVO.filteredCellList;
        }
        TravelCellListVO travelCellListVO4 = travelCellListVO2;
        if ((i11 & 8) != 0) {
            z11 = toursMealVO.isCellListVisible;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            str = toursMealVO.filterKey;
        }
        String str2 = str;
        if ((i11 & 32) != 0) {
            z12 = toursMealVO.forceUpdate;
        }
        return toursMealVO.copy(j12, travelCellListVO3, travelCellListVO4, z13, str2, z12);
    }

    @NotNull
    public final ToursMealVO copy(long id2, @NotNull TravelCellListVO originCellList, @NotNull TravelCellListVO filteredCellList, boolean isCellListVisible, String filterKey, boolean forceUpdate) {
        Intrinsics.checkNotNullParameter(originCellList, "originCellList");
        Intrinsics.checkNotNullParameter(filteredCellList, "filteredCellList");
        return new ToursMealVO(id2, originCellList, filteredCellList, isCellListVisible, filterKey, forceUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToursMealVO)) {
            return false;
        }
        ToursMealVO toursMealVO = (ToursMealVO) other;
        return this.id == toursMealVO.id && Intrinsics.d(this.originCellList, toursMealVO.originCellList) && Intrinsics.d(this.filteredCellList, toursMealVO.filteredCellList) && this.isCellListVisible == toursMealVO.isCellListVisible && Intrinsics.d(this.filterKey, toursMealVO.filterKey) && this.forceUpdate == toursMealVO.forceUpdate;
    }

    public final String getFilterKey() {
        return this.filterKey;
    }

    @NotNull
    public final TravelCellListVO getFilteredCellList() {
        return this.filteredCellList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final TravelCellListVO getOriginCellList() {
        return this.originCellList;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = C3532b.a((this.filteredCellList.hashCode() + ((this.originCellList.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31, 31, this.isCellListVisible);
        String str = this.filterKey;
        return Boolean.hashCode(this.forceUpdate) + ((a11 + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* renamed from: isCellListVisible, reason: from getter */
    public final boolean getIsCellListVisible() {
        return this.isCellListVisible;
    }

    public final void setForceUpdate(boolean z11) {
        this.forceUpdate = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TravelCellListVO travelCellListVO = this.originCellList;
        TravelCellListVO travelCellListVO2 = this.filteredCellList;
        boolean z11 = this.isCellListVisible;
        String str = this.filterKey;
        boolean z12 = this.forceUpdate;
        StringBuilder sb2 = new StringBuilder("ToursMealVO(id=");
        sb2.append(j11);
        sb2.append(", originCellList=");
        sb2.append(travelCellListVO);
        sb2.append(", filteredCellList=");
        sb2.append(travelCellListVO2);
        sb2.append(", isCellListVisible=");
        sb2.append(z11);
        a.g(", filterKey=", str, ", forceUpdate=", sb2, z12);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ ToursMealVO(long j11, TravelCellListVO travelCellListVO, TravelCellListVO travelCellListVO2, boolean z11, String str, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, travelCellListVO, (i11 & 4) != 0 ? travelCellListVO : travelCellListVO2, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? false : z12);
    }
}
