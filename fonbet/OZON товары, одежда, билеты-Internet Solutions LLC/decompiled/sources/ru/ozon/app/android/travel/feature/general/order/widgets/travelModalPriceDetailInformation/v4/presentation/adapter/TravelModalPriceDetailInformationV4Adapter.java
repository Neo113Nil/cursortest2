package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.adapter;

import Sc.C4005g;
import Sc.o;
import T7.E;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.R$id;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.TravelModalPriceDetailInformationV4VO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view.PriceDetailInformationDetailsView;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view.PriceDetailInformationPriceView;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.view.PriceDetailInformationSectionView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/adapter/TravelModalPriceDetailInformationV4Adapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v4/presentation/TravelModalPriceDetailInformationV4VO$PriceItem;", "Landroidx/recyclerview/widget/RecyclerView$C;", "<init>", "()V", "", "viewType", "", "unsupportedViewTypeError", "(I)Ljava/lang/Void;", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelModalPriceDetailInformationV4Adapter extends t<TravelModalPriceDetailInformationV4VO.PriceItem, RecyclerView.C> {
    public TravelModalPriceDetailInformationV4Adapter() {
        super(new i.d<TravelModalPriceDetailInformationV4VO.PriceItem>() { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.adapter.TravelModalPriceDetailInformationV4Adapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(TravelModalPriceDetailInformationV4VO.PriceItem oldItem, TravelModalPriceDetailInformationV4VO.PriceItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(TravelModalPriceDetailInformationV4VO.PriceItem oldItem, TravelModalPriceDetailInformationV4VO.PriceItem newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
    }

    private final Void unsupportedViewTypeError(int viewType) {
        throw new IllegalArgumentException(E.a(viewType, "Unsupported viewType: ", ". Check getItemViewType() implementation."));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        TravelModalPriceDetailInformationV4VO.PriceItem item = getItem(position);
        if (item instanceof TravelModalPriceDetailInformationV4VO.PriceDetailsVO) {
            return R$id.travelModalPriceDetailInformationDetails;
        }
        if (item instanceof TravelModalPriceDetailInformationV4VO.PriceItemVO) {
            return R$id.travelModalPriceDetailInformationPrice;
        }
        if (item instanceof TravelModalPriceDetailInformationV4VO.PriceSectionVO) {
            return R$id.travelModalPriceDetailInformationSection;
        }
        if (item instanceof TravelModalPriceDetailInformationV4VO.PriceSpacer) {
            return R$id.travelModalPriceDetailInformationSpacer;
        }
        throw new o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TravelModalPriceDetailInformationViewHolder travelModalPriceDetailInformationViewHolder = holder instanceof TravelModalPriceDetailInformationViewHolder ? (TravelModalPriceDetailInformationViewHolder) holder : null;
        if (travelModalPriceDetailInformationViewHolder != null) {
            TravelModalPriceDetailInformationV4VO.PriceItem item = getItem(position);
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            travelModalPriceDetailInformationViewHolder.bind(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (viewType == R$id.travelModalPriceDetailInformationSection) {
            Intrinsics.f(context);
            return new TravelModalPriceDetailInformationViewHolder(new PriceDetailInformationSectionView(context));
        }
        if (viewType == R$id.travelModalPriceDetailInformationDetails) {
            Intrinsics.f(context);
            return new TravelModalPriceDetailInformationViewHolder(new PriceDetailInformationDetailsView(context));
        }
        if (viewType == R$id.travelModalPriceDetailInformationPrice) {
            Intrinsics.f(context);
            return new TravelModalPriceDetailInformationViewHolder(new PriceDetailInformationPriceView(context));
        }
        if (viewType == R$id.travelModalPriceDetailInformationSpacer) {
            final View view = new View(context);
            return new RecyclerView.C(view) { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v4.presentation.adapter.TravelModalPriceDetailInformationV4Adapter$onCreateViewHolder$1
            };
        }
        unsupportedViewTypeError(viewType);
        throw new C4005g();
    }
}
