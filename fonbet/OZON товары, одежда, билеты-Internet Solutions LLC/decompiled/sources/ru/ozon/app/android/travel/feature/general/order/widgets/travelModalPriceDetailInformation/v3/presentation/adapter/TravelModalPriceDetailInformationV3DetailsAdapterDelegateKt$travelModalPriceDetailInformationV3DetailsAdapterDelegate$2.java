package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.general.order.databinding.ItemTravelModalPriceDetailInformationV3DetailsBinding;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/databinding/ItemTravelModalPriceDetailInformationV3DetailsBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelModalPriceDetailInformationV3DetailsAdapterDelegateKt$travelModalPriceDetailInformationV3DetailsAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceDetailsVO, ItemTravelModalPriceDetailInformationV3DetailsBinding>, Unit> {
    public static final TravelModalPriceDetailInformationV3DetailsAdapterDelegateKt$travelModalPriceDetailInformationV3DetailsAdapterDelegate$2 INSTANCE = new TravelModalPriceDetailInformationV3DetailsAdapterDelegateKt$travelModalPriceDetailInformationV3DetailsAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter.TravelModalPriceDetailInformationV3DetailsAdapterDelegateKt$travelModalPriceDetailInformationV3DetailsAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ TravelModalPriceDetailInformationV3Adapter $pricesAdapter;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceDetailsVO, ItemTravelModalPriceDetailInformationV3DetailsBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceDetailsVO, ItemTravelModalPriceDetailInformationV3DetailsBinding> adapterDelegateViewBindingViewHolder, TravelModalPriceDetailInformationV3Adapter travelModalPriceDetailInformationV3Adapter) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$pricesAdapter = travelModalPriceDetailInformationV3Adapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TextAtomView detailsTitleTAV = this.$this_adapterDelegateViewBinding.getBinding().detailsTitleTAV;
            Intrinsics.checkNotNullExpressionValue(detailsTitleTAV, "detailsTitleTAV");
            TextAtomHolderKt.bindOrGone$default(detailsTitleTAV, this.$this_adapterDelegateViewBinding.getItem().getTitle(), null, 2, null);
            TextAtomView detailsTotalPriceTAV = this.$this_adapterDelegateViewBinding.getBinding().detailsTotalPriceTAV;
            Intrinsics.checkNotNullExpressionValue(detailsTotalPriceTAV, "detailsTotalPriceTAV");
            TextAtomHolderKt.bindOrGone$default(detailsTotalPriceTAV, this.$this_adapterDelegateViewBinding.getItem().getTotalPrice(), null, 2, null);
            RecyclerView pricesInformationRV = this.$this_adapterDelegateViewBinding.getBinding().pricesInformationRV;
            Intrinsics.checkNotNullExpressionValue(pricesInformationRV, "pricesInformationRV");
            pricesInformationRV.setVisibility(this.$this_adapterDelegateViewBinding.getItem().getIsPricesVisible() ? 0 : 8);
            this.$pricesAdapter.setItems(this.$this_adapterDelegateViewBinding.getItem().getPrices());
        }
    }

    TravelModalPriceDetailInformationV3DetailsAdapterDelegateKt$travelModalPriceDetailInformationV3DetailsAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceDetailsVO, ItemTravelModalPriceDetailInformationV3DetailsBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceDetailsVO, ItemTravelModalPriceDetailInformationV3DetailsBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        int px = ResourceExtKt.toPx(8, adapterDelegateViewBinding.getContext());
        TravelModalPriceDetailInformationV3Adapter travelModalPriceDetailInformationV3Adapter = new TravelModalPriceDetailInformationV3Adapter();
        RecyclerView recyclerView = adapterDelegateViewBinding.getBinding().pricesInformationRV;
        recyclerView.setAdapter(travelModalPriceDetailInformationV3Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new TravelModalPriceDetailInformationV3Decoration(px));
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, travelModalPriceDetailInformationV3Adapter));
    }
}
