package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.skeleton;

import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemAdditionalLuggageV2SkeletonBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$SkeletonVO;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemAdditionalLuggageV2SkeletonBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2SkeletonAdapterDelegateKt$additionalLuggageV2SkeletonAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.SkeletonVO, ItemAdditionalLuggageV2SkeletonBinding>, Unit> {
    public static final AdditionalLuggageV2SkeletonAdapterDelegateKt$additionalLuggageV2SkeletonAdapterDelegate$2 INSTANCE = new AdditionalLuggageV2SkeletonAdapterDelegateKt$additionalLuggageV2SkeletonAdapterDelegate$2();

    AdditionalLuggageV2SkeletonAdapterDelegateKt$additionalLuggageV2SkeletonAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.SkeletonVO, ItemAdditionalLuggageV2SkeletonBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.SkeletonVO, ItemAdditionalLuggageV2SkeletonBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ShapeDrawable produce = new RoundedBackgroundProducer().produce(ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerFloor1), ResourceExtKt.toPxF(20, adapterDelegateViewBinding.getContext()));
        adapterDelegateViewBinding.getBinding().shimmerGroup1.setBackground(produce);
        adapterDelegateViewBinding.getBinding().shimmerGroup2.setBackground(produce);
    }
}
