package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter;

import android.graphics.drawable.Drawable;
import androidx.core.content.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.hotels.R$drawable;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsPageDetailsFullServicesBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.HotelsPageDetailsFullVO;
import ru.ozon.app.android.uikit.view.recycler.decoration.SkipLastDividerItemDecoration;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$ServicesDetail;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsPageDetailsFullServicesBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageDetailsFullDetailServiceAdapterDelegateKt$hotelsPageDetailsFullDetailServiceAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesDetail, ItemHotelsPageDetailsFullServicesBinding>, Unit> {
    public static final HotelsPageDetailsFullDetailServiceAdapterDelegateKt$hotelsPageDetailsFullDetailServiceAdapterDelegate$2 INSTANCE = new HotelsPageDetailsFullDetailServiceAdapterDelegateKt$hotelsPageDetailsFullDetailServiceAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter.HotelsPageDetailsFullDetailServiceAdapterDelegateKt$hotelsPageDetailsFullDetailServiceAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ HotelsPageDetailsFullServiceAdapter $adapterService;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesDetail, ItemHotelsPageDetailsFullServicesBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesDetail, ItemHotelsPageDetailsFullServicesBinding> adapterDelegateViewBindingViewHolder, HotelsPageDetailsFullServiceAdapter hotelsPageDetailsFullServiceAdapter) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$adapterService = hotelsPageDetailsFullServiceAdapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ItemHotelsPageDetailsFullServicesBinding binding = this.$this_adapterDelegateViewBinding.getBinding();
            AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesDetail, ItemHotelsPageDetailsFullServicesBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            HotelsPageDetailsFullServiceAdapter hotelsPageDetailsFullServiceAdapter = this.$adapterService;
            TextAtomView headerHotelDetailServicesTAV = binding.headerHotelDetailServicesTAV;
            Intrinsics.checkNotNullExpressionValue(headerHotelDetailServicesTAV, "headerHotelDetailServicesTAV");
            TextAtomHolderKt.bind$default(headerHotelDetailServicesTAV, adapterDelegateViewBindingViewHolder.getItem().getHeader(), null, 2, null);
            hotelsPageDetailsFullServiceAdapter.setItems(adapterDelegateViewBindingViewHolder.getItem().getServices());
        }
    }

    HotelsPageDetailsFullDetailServiceAdapterDelegateKt$hotelsPageDetailsFullDetailServiceAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesDetail, ItemHotelsPageDetailsFullServicesBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.ServicesDetail, ItemHotelsPageDetailsFullServicesBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        HotelsPageDetailsFullServiceAdapter hotelsPageDetailsFullServiceAdapter = new HotelsPageDetailsFullServiceAdapter();
        RecyclerView recyclerView = adapterDelegateViewBinding.getBinding().servicesHotelDetailRV;
        recyclerView.setAdapter(hotelsPageDetailsFullServiceAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SkipLastDividerItemDecoration skipLastDividerItemDecoration = new SkipLastDividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = a.getDrawable(recyclerView.getContext(), R$drawable.divider_travel_hotels_page_details);
        if (drawable != null) {
            skipLastDividerItemDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(skipLastDividerItemDecoration);
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, hotelsPageDetailsFullServiceAdapter));
    }
}
