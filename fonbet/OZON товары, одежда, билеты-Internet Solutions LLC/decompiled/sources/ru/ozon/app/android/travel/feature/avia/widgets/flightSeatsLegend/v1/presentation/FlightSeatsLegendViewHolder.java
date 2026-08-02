package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation.adapter.FlightSeatsLegendAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/adapter/FlightSeatsLegendAdapter;", "seatTypeAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/adapter/FlightSeatsLegendAdapter;", "Landroid/widget/LinearLayout;", "container", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Landroidx/recyclerview/widget/RecyclerView;", "listRV", "Landroidx/recyclerview/widget/RecyclerView;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsLegendViewHolder extends k<FlightSeatsLegendVO> {

    @NotNull
    private final LinearLayout container;

    @NotNull
    private final View containerView;

    @NotNull
    private final RecyclerView listRV;

    @NotNull
    private final FlightSeatsLegendAdapter seatTypeAdapter;

    @NotNull
    private final TextAtomView titleTAV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSeatsLegendViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        FlightSeatsLegendAdapter flightSeatsLegendAdapter = new FlightSeatsLegendAdapter();
        this.seatTypeAdapter = flightSeatsLegendAdapter;
        Intrinsics.g(containerView, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) containerView;
        this.container = linearLayout;
        View view = ViewGroupExtKt.get(linearLayout, 0);
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView");
        this.titleTAV = (TextAtomView) view;
        View view2 = ViewGroupExtKt.get(linearLayout, 1);
        Intrinsics.g(view2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) view2;
        this.listRV = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(flightSeatsLegendAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FlightSeatsLegendVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        this.seatTypeAdapter.setItems(item.getSeatTypes());
    }
}
