package ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.cellHorizontalList.presentation.CellHorizontalListVI;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListVI$CellVO;", "cells", "", "position", "getUpdatedCells", "(Ljava/util/List;I)Ljava/util/List;", "", "cacheCells", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "onView", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onClick", "(I)V", "cachedCells", "Ljava/util/List;", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/main/widgets/cellHorizontalList/presentation/CellHorizontalListEvent;", "eventFlow", "LAe/w0;", "LAe/B0;", "getEvent", "()LAe/B0;", "event", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellHorizontalListViewModel extends w0 {
    private List<CellHorizontalListVI.CellVO> cachedCells;

    @NotNull
    private final Ae.w0<CellHorizontalListEvent> eventFlow = E0.b(0, 0, null, 7);

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CellHorizontalListVI.CellVO> getUpdatedCells(List<CellHorizontalListVI.CellVO> cells, int position) {
        if (position == 0) {
            return null;
        }
        ArrayList W02 = C7714v.W0(cells);
        W02.add(0, (CellHorizontalListVI.CellVO) W02.remove(position));
        return W02;
    }

    public final void cacheCells(@NotNull List<CellHorizontalListVI.CellVO> cells) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        this.cachedCells = cells;
    }

    @NotNull
    public final B0<CellHorizontalListEvent> getEvent() {
        return C2399j.a(this.eventFlow);
    }

    public final void onClick(int position) {
        List<CellHorizontalListVI.CellVO> list = this.cachedCells;
        if (list != null) {
            C10727i.c(x0.a(this), null, null, new CellHorizontalListViewModel$onClick$1$1(this, list, position, null), 3);
        }
    }

    public final void onView(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "atomAction");
        C10727i.c(x0.a(this), null, null, new CellHorizontalListViewModel$onView$1(this, atomAction, null), 3);
    }
}
