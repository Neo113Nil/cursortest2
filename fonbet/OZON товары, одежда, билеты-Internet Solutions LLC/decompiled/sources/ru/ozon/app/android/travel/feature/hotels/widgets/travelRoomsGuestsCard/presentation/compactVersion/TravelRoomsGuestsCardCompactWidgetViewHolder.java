package ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.databinding.WidgetTravelRoomsGuestsCardCompactBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.TravelRoomsGuestsCardVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter.TravelRoomAndGuestsCompactAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.travelRoomsGuestsCard.presentation.compactVersion.adapter.TravelRoomAndGuestsCompactItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/compactVersion/TravelRoomsGuestsCardCompactWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "", "setUpRecyclerView", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/TravelRoomsGuestsCardVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetTravelRoomsGuestsCardCompactBinding;", "binding", "Lru/ozon/app/android/travel/feature/hotels/databinding/WidgetTravelRoomsGuestsCardCompactBinding;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/compactVersion/adapter/TravelRoomAndGuestsCompactAdapter;", "roomAndGuestsAdapter", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/compactVersion/adapter/TravelRoomAndGuestsCompactAdapter;", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/compactVersion/adapter/TravelRoomAndGuestsCompactItemDecoration;", "decoration", "Lru/ozon/app/android/travel/feature/hotels/widgets/travelRoomsGuestsCard/presentation/compactVersion/adapter/TravelRoomAndGuestsCompactItemDecoration;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRoomsGuestsCardCompactWidgetViewHolder extends k<TravelRoomsGuestsCardVO> {

    @NotNull
    private final WidgetTravelRoomsGuestsCardCompactBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TravelRoomAndGuestsCompactItemDecoration decoration;

    @NotNull
    private final TravelRoomAndGuestsCompactAdapter roomAndGuestsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRoomsGuestsCardCompactWidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetTravelRoomsGuestsCardCompactBinding bind = WidgetTravelRoomsGuestsCardCompactBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.roomAndGuestsAdapter = new TravelRoomAndGuestsCompactAdapter();
        this.decoration = new TravelRoomAndGuestsCompactItemDecoration(getContext());
        setUpRecyclerView();
    }

    private final void setUpRecyclerView() {
        RecyclerView recyclerView = this.binding.travelRoomsGuestsCardCompactRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.roomAndGuestsAdapter);
        TravelRoomAndGuestsCompactItemDecoration travelRoomAndGuestsCompactItemDecoration = this.decoration;
        recyclerView.removeItemDecoration(travelRoomAndGuestsCompactItemDecoration);
        recyclerView.addItemDecoration(travelRoomAndGuestsCompactItemDecoration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelRoomsGuestsCardVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView travelRoomsGuestsCardCompactTitleTV = this.binding.travelRoomsGuestsCardCompactTitleTV;
        Intrinsics.checkNotNullExpressionValue(travelRoomsGuestsCardCompactTitleTV, "travelRoomsGuestsCardCompactTitleTV");
        TextAtomHolderKt.bind$default(travelRoomsGuestsCardCompactTitleTV, item.getTitle(), null, 2, null);
        RecyclerView travelRoomsGuestsCardCompactRV = this.binding.travelRoomsGuestsCardCompactRV;
        Intrinsics.checkNotNullExpressionValue(travelRoomsGuestsCardCompactRV, "travelRoomsGuestsCardCompactRV");
        travelRoomsGuestsCardCompactRV.setVisibility(item.getAreDetailsVisible() ? 0 : 8);
        this.roomAndGuestsAdapter.setItems(item.getDetails());
    }
}
