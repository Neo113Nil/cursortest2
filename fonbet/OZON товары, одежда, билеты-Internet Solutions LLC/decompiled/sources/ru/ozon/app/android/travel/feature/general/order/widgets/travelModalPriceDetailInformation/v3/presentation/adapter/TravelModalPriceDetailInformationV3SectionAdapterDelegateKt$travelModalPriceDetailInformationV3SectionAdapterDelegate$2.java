package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.general.order.databinding.ItemTravelModalPriceDetailInformationV3SectionBinding;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/databinding/ItemTravelModalPriceDetailInformationV3SectionBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelModalPriceDetailInformationV3SectionAdapterDelegateKt$travelModalPriceDetailInformationV3SectionAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceSectionVO, ItemTravelModalPriceDetailInformationV3SectionBinding>, Unit> {
    public static final TravelModalPriceDetailInformationV3SectionAdapterDelegateKt$travelModalPriceDetailInformationV3SectionAdapterDelegate$2 INSTANCE = new TravelModalPriceDetailInformationV3SectionAdapterDelegateKt$travelModalPriceDetailInformationV3SectionAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.adapter.TravelModalPriceDetailInformationV3SectionAdapterDelegateKt$travelModalPriceDetailInformationV3SectionAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ TravelModalPriceDetailInformationV3Adapter $detailsAdapter;
        final /* synthetic */ int $dp16;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceSectionVO, ItemTravelModalPriceDetailInformationV3SectionBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceSectionVO, ItemTravelModalPriceDetailInformationV3SectionBinding> adapterDelegateViewBindingViewHolder, TravelModalPriceDetailInformationV3Adapter travelModalPriceDetailInformationV3Adapter, int i11) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$detailsAdapter = travelModalPriceDetailInformationV3Adapter;
            this.$dp16 = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TextAtomView sectionTitleTAV = this.$this_adapterDelegateViewBinding.getBinding().sectionTitleTAV;
            Intrinsics.checkNotNullExpressionValue(sectionTitleTAV, "sectionTitleTAV");
            TextAtomHolderKt.bindOrGone$default(sectionTitleTAV, this.$this_adapterDelegateViewBinding.getItem().getTitle(), null, 2, null);
            TextAtomView sectionSubtitleTAV = this.$this_adapterDelegateViewBinding.getBinding().sectionSubtitleTAV;
            Intrinsics.checkNotNullExpressionValue(sectionSubtitleTAV, "sectionSubtitleTAV");
            TextAtomHolderKt.bindOrGone$default(sectionSubtitleTAV, this.$this_adapterDelegateViewBinding.getItem().getSubtitle(), null, 2, null);
            TextAtomView sectionTotalPriceTAV = this.$this_adapterDelegateViewBinding.getBinding().sectionTotalPriceTAV;
            Intrinsics.checkNotNullExpressionValue(sectionTotalPriceTAV, "sectionTotalPriceTAV");
            TextAtomHolderKt.bindOrGone$default(sectionTotalPriceTAV, this.$this_adapterDelegateViewBinding.getItem().getTotalPrice(), null, 2, null);
            RecyclerView priceDetailsRV = this.$this_adapterDelegateViewBinding.getBinding().priceDetailsRV;
            Intrinsics.checkNotNullExpressionValue(priceDetailsRV, "priceDetailsRV");
            priceDetailsRV.setVisibility(this.$this_adapterDelegateViewBinding.getItem().getIsPriceDetailsVisible() ? 0 : 8);
            RecyclerView priceDetailsRV2 = this.$this_adapterDelegateViewBinding.getBinding().priceDetailsRV;
            Intrinsics.checkNotNullExpressionValue(priceDetailsRV2, "priceDetailsRV");
            AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceSectionVO, ItemTravelModalPriceDetailInformationV3SectionBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            int i11 = this.$dp16;
            ViewGroup.LayoutParams layoutParams = priceDetailsRV2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = adapterDelegateViewBindingViewHolder.getItem().getIsTitleGone() ? 0 : i11;
            priceDetailsRV2.setLayoutParams(marginLayoutParams);
            this.$detailsAdapter.setItems(this.$this_adapterDelegateViewBinding.getItem().getPriceDetails());
        }
    }

    TravelModalPriceDetailInformationV3SectionAdapterDelegateKt$travelModalPriceDetailInformationV3SectionAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceSectionVO, ItemTravelModalPriceDetailInformationV3SectionBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelModalPriceDetailInformationV3VO.PriceSectionVO, ItemTravelModalPriceDetailInformationV3SectionBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        int px = ResourceExtKt.toPx(16, adapterDelegateViewBinding.getContext());
        TravelModalPriceDetailInformationV3Adapter travelModalPriceDetailInformationV3Adapter = new TravelModalPriceDetailInformationV3Adapter();
        RecyclerView recyclerView = adapterDelegateViewBinding.getBinding().priceDetailsRV;
        recyclerView.setAdapter(travelModalPriceDetailInformationV3Adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new TravelModalPriceDetailInformationV3Decoration(px));
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, travelModalPriceDetailInformationV3Adapter, px));
    }
}
