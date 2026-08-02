package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.R$drawable;
import ru.ozon.app.android.travel.feature.general.order.databinding.WidgetTravelModalPriceDetailInformationV3Binding;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter.TravelModalPriceDetailInformationV3Adapter;
import ru.ozon.app.android.uikit.view.recycler.decoration.SkipLastDividerItemDecoration;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetTravelModalPriceDetailInformationV3Binding;", "binding", "Lru/ozon/app/android/travel/feature/general/order/databinding/WidgetTravelModalPriceDetailInformationV3Binding;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/adapter/TravelModalPriceDetailInformationV3Adapter;", "priceSectionsAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/adapter/TravelModalPriceDetailInformationV3Adapter;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationV3WidgetViewHolder extends k<TravelModalPriceDetailInformationV3VO> {

    @NotNull
    private final WidgetTravelModalPriceDetailInformationV3Binding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final TravelModalPriceDetailInformationV3Adapter priceSectionsAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelModalPriceDetailInformationV3WidgetViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
        WidgetTravelModalPriceDetailInformationV3Binding bind = WidgetTravelModalPriceDetailInformationV3Binding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TravelModalPriceDetailInformationV3Adapter travelModalPriceDetailInformationV3Adapter = new TravelModalPriceDetailInformationV3Adapter();
        this.priceSectionsAdapter = travelModalPriceDetailInformationV3Adapter;
        RecyclerView recyclerView = bind.priceSectionsRV;
        recyclerView.setAdapter(travelModalPriceDetailInformationV3Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SkipLastDividerItemDecoration skipLastDividerItemDecoration = new SkipLastDividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = a.getDrawable(recyclerView.getContext(), R$drawable.divider_travel_modal_price_detail_information);
        if (drawable != null) {
            skipLastDividerItemDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(skipLastDividerItemDecoration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelModalPriceDetailInformationV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView headerPricesTAV = this.binding.headerPricesTAV;
        Intrinsics.checkNotNullExpressionValue(headerPricesTAV, "headerPricesTAV");
        TextAtomHolderKt.bindOrGone$default(headerPricesTAV, item.getHeader(), null, 2, null);
        this.priceSectionsAdapter.setItems(item.getPriceSections());
    }
}
