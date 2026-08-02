package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.presentation;

import Lh.a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/presentation/CommonLayoutGridVO;", "Ll20/c;", "", "id", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "layoutGrid", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "getLayoutGrid", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonLayoutGridVO implements c {
    private final long id;

    @NotNull
    private final CommonLayoutGridDTO layoutGrid;
    private final t tokenizedEvent;

    public CommonLayoutGridVO(long j11, @NotNull CommonLayoutGridDTO layoutGrid, t tVar) {
        Intrinsics.checkNotNullParameter(layoutGrid, "layoutGrid");
        this.id = j11;
        this.layoutGrid = layoutGrid;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonLayoutGridVO)) {
            return false;
        }
        CommonLayoutGridVO commonLayoutGridVO = (CommonLayoutGridVO) other;
        return this.id == commonLayoutGridVO.id && Intrinsics.d(this.layoutGrid, commonLayoutGridVO.layoutGrid) && Intrinsics.d(this.tokenizedEvent, commonLayoutGridVO.tokenizedEvent);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CommonLayoutGridDTO getLayoutGrid() {
        return this.layoutGrid;
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
        int hashCode = (this.layoutGrid.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CommonLayoutGridDTO commonLayoutGridDTO = this.layoutGrid;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CommonLayoutGridVO(id=");
        sb2.append(j11);
        sb2.append(", layoutGrid=");
        sb2.append(commonLayoutGridDTO);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}
