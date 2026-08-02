package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsPageDetailsFullTextBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.HotelsPageDetailsFullVO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageDetailsFull/presentation/HotelsPageDetailsFullVO$TextDetail;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsPageDetailsFullTextBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsPageDetailsFullTextAdapterDelegateKt$hotelsPageDetailsFullTextAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.TextDetail, ItemHotelsPageDetailsFullTextBinding>, Unit> {
    public static final HotelsPageDetailsFullTextAdapterDelegateKt$hotelsPageDetailsFullTextAdapterDelegate$2 INSTANCE = new HotelsPageDetailsFullTextAdapterDelegateKt$hotelsPageDetailsFullTextAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageDetailsFull.presentation.adapter.HotelsPageDetailsFullTextAdapterDelegateKt$hotelsPageDetailsFullTextAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.TextDetail, ItemHotelsPageDetailsFullTextBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.TextDetail, ItemHotelsPageDetailsFullTextBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ItemHotelsPageDetailsFullTextBinding binding = this.$this_adapterDelegateViewBinding.getBinding();
            AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.TextDetail, ItemHotelsPageDetailsFullTextBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            ItemHotelsPageDetailsFullTextBinding itemHotelsPageDetailsFullTextBinding = binding;
            TextAtomView headerHotelDetailTAV = itemHotelsPageDetailsFullTextBinding.headerHotelDetailTAV;
            Intrinsics.checkNotNullExpressionValue(headerHotelDetailTAV, "headerHotelDetailTAV");
            TextAtomHolderKt.bind$default(headerHotelDetailTAV, adapterDelegateViewBindingViewHolder.getItem().getHeader(), null, 2, null);
            TextAtomView descriptionHotelDetailTAV = itemHotelsPageDetailsFullTextBinding.descriptionHotelDetailTAV;
            Intrinsics.checkNotNullExpressionValue(descriptionHotelDetailTAV, "descriptionHotelDetailTAV");
            TextAtomHolderKt.bind$default(descriptionHotelDetailTAV, adapterDelegateViewBindingViewHolder.getItem().getDescription(), null, 2, null);
        }
    }

    HotelsPageDetailsFullTextAdapterDelegateKt$hotelsPageDetailsFullTextAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.TextDetail, ItemHotelsPageDetailsFullTextBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<HotelsPageDetailsFullVO.TextDetail, ItemHotelsPageDetailsFullTextBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
