package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/luggage/AdditionalLuggageV2FlightDecoration;", "Landroidx/recyclerview/widget/RecyclerView$n;", "", "offset", "radiusCompensation", "<init>", "(II)V", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$A;)V", "I", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2FlightDecoration extends RecyclerView.n {
    private final int offset;
    private final int radiusCompensation;

    public AdditionalLuggageV2FlightDecoration(int i11, int i12) {
        this.offset = i11;
        this.radiusCompensation = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        int i11;
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.g adapter = parent.getAdapter();
        AdditionalLuggageV2FlightSegmentsAdapter additionalLuggageV2FlightSegmentsAdapter = adapter instanceof AdditionalLuggageV2FlightSegmentsAdapter ? (AdditionalLuggageV2FlightSegmentsAdapter) adapter : null;
        if (additionalLuggageV2FlightSegmentsAdapter == null) {
            return;
        }
        AdditionalLuggageV2VO.LuggageItem item = additionalLuggageV2FlightSegmentsAdapter.getItem(childAdapterPosition);
        if (item instanceof AdditionalLuggageV2VO.LuggageTransportationItem) {
            i11 = this.offset;
        } else if (item instanceof AdditionalLuggageV2VO.LuggageHeaderItem) {
            int i12 = childAdapterPosition - 1;
            if (i12 > -1 && !(additionalLuggageV2FlightSegmentsAdapter.getItem(i12) instanceof AdditionalLuggageV2VO.LuggageRouteItem)) {
                i11 = this.offset;
            }
            i11 = 0;
        } else {
            if ((item instanceof AdditionalLuggageV2VO.LuggageRouteItem) && childAdapterPosition == 0) {
                i11 = this.offset + this.radiusCompensation;
            }
            i11 = 0;
        }
        outRect.top = i11;
        outRect.bottom = childAdapterPosition == state.b() + (-1) ? this.offset + this.radiusCompensation : 0;
    }
}
