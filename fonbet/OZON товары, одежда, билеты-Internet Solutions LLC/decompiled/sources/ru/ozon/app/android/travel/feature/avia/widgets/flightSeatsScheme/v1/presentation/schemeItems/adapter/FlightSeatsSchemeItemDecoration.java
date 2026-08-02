package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeOuterItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeItem;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.LegendVO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/adapter/FlightSeatsSchemeItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "firstItemOffset", "offset", "schemeBottomOffsetWithoutDetails", "schemeBottomOffsetWithDetails", "<init>", "(IIII)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeItemDecoration extends RecyclerView.n {
    private final int firstItemOffset;
    private final int offset;
    private final int schemeBottomOffsetWithDetails;
    private final int schemeBottomOffsetWithoutDetails;

    public FlightSeatsSchemeItemDecoration(int i11, int i12, int i13, int i14) {
        this.firstItemOffset = i11;
        this.offset = i12;
        this.schemeBottomOffsetWithoutDetails = i13;
        this.schemeBottomOffsetWithDetails = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        int a11 = Nh.a.a(parent, "parent", state, "state", view);
        if (a11 == -1) {
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        FlightSeatsSchemeAdapter flightSeatsSchemeAdapter = adapter instanceof FlightSeatsSchemeAdapter ? (FlightSeatsSchemeAdapter) adapter : null;
        if (flightSeatsSchemeAdapter == null) {
            return;
        }
        int i11 = 0;
        boolean z11 = a11 == 0;
        boolean z12 = a11 == flightSeatsSchemeAdapter.getCardsCount() - 1;
        FlightSeatsSchemeItem item = flightSeatsSchemeAdapter.getItem(a11);
        boolean z13 = item instanceof LegendVO;
        boolean z14 = item instanceof FlightSchemeOuterItem;
        outRect.top = z11 ? this.firstItemOffset : 0;
        if (z12 && z14) {
            i11 = this.schemeBottomOffsetWithoutDetails;
        } else if (z14 && a11 + 1 == flightSeatsSchemeAdapter.getCardsCount() - 1) {
            i11 = this.schemeBottomOffsetWithDetails;
        } else if (z13 || z12) {
            i11 = this.offset;
        }
        outRect.bottom = i11;
    }
}
