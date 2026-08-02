package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.adapter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.hotels.databinding.ItemHotelsSearchResultsV5PlaceholderBinding;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5SkeletonVO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelSearchResults/v5/presentation/loading/HotelsSearchResultsV5SkeletonVO$SkeletonItemVO;", "Lru/ozon/app/android/travel/feature/hotels/databinding/ItemHotelsSearchResultsV5PlaceholderBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5LoadingAdapterDelegateKt$hotelsSearchResultV5LoadingAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HotelsSearchResultsV5SkeletonVO.SkeletonItemVO, ItemHotelsSearchResultsV5PlaceholderBinding>, Unit> {
    public static final HotelsSearchResultsV5LoadingAdapterDelegateKt$hotelsSearchResultV5LoadingAdapterDelegate$2 INSTANCE = new HotelsSearchResultsV5LoadingAdapterDelegateKt$hotelsSearchResultV5LoadingAdapterDelegate$2();

    HotelsSearchResultsV5LoadingAdapterDelegateKt$hotelsSearchResultV5LoadingAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HotelsSearchResultsV5SkeletonVO.SkeletonItemVO, ItemHotelsSearchResultsV5PlaceholderBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<HotelsSearchResultsV5SkeletonVO.SkeletonItemVO, ItemHotelsSearchResultsV5PlaceholderBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.getBinding().getConstraintLayout().setBackground(new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerFloor1), ResourceExtKt.toPxF(24, adapterDelegateViewBinding.getContext())));
    }
}
