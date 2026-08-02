package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v2.presentation.list;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelCellList.v2.TravelCellListV2VO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelCellList/v2/presentation/list/TravelCellListV2ListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;", "cellList", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;", "getCellList", "()Lru/ozon/app/android/travel/molecules/view/travelCellList/v2/TravelCellListV2VO;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelCellListV2ListVO implements c {

    @NotNull
    private final TravelCellListV2VO cellList;
    private final long id;
    private final t viewEvent;

    public TravelCellListV2ListVO(long j11, @NotNull TravelCellListV2VO cellList, t tVar) {
        Intrinsics.checkNotNullParameter(cellList, "cellList");
        this.id = j11;
        this.cellList = cellList;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelCellListV2ListVO)) {
            return false;
        }
        TravelCellListV2ListVO travelCellListV2ListVO = (TravelCellListV2ListVO) other;
        return this.id == travelCellListV2ListVO.id && Intrinsics.d(this.cellList, travelCellListV2ListVO.cellList) && Intrinsics.d(this.viewEvent, travelCellListV2ListVO.viewEvent);
    }

    @NotNull
    public final TravelCellListV2VO getCellList() {
        return this.cellList;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.cellList.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.viewEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TravelCellListV2VO travelCellListV2VO = this.cellList;
        t tVar = this.viewEvent;
        StringBuilder sb2 = new StringBuilder("TravelCellListV2ListVO(id=");
        sb2.append(j11);
        sb2.append(", cellList=");
        sb2.append(travelCellListV2VO);
        return a.b(sb2, ", viewEvent=", tVar, ")");
    }
}
