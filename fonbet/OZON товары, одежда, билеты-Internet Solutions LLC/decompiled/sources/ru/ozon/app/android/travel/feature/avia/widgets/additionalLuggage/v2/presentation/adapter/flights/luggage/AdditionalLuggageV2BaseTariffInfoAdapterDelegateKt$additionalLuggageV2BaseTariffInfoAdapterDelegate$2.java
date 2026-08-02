package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemAdditionalLuggageBaseTariffInfoV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.RoundedBackgroundProducer;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBaseTariffInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/luggage/LuggageBaseTariffInfoItem;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemAdditionalLuggageBaseTariffInfoV2Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2BaseTariffInfoAdapterDelegateKt$additionalLuggageV2BaseTariffInfoAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageBaseTariffInfoItem, ItemAdditionalLuggageBaseTariffInfoV2Binding>, Unit> {
    final /* synthetic */ RoundedBackgroundProducer $backgroundProducer;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage.AdditionalLuggageV2BaseTariffInfoAdapterDelegateKt$additionalLuggageV2BaseTariffInfoAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageBaseTariffInfoItem, ItemAdditionalLuggageBaseTariffInfoV2Binding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageBaseTariffInfoItem, ItemAdditionalLuggageBaseTariffInfoV2Binding> adapterDelegateViewBindingViewHolder) {
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
            AdditionalLuggageV2VO.LuggageBaseTariffInfoItem item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageBaseTariffInfoItem, ItemAdditionalLuggageBaseTariffInfoV2Binding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            AdditionalLuggageV2VO.LuggageBaseTariffInfoItem luggageBaseTariffInfoItem = item;
            TextAtomView baseTariffInfoV2TitleTextView = adapterDelegateViewBindingViewHolder.getBinding().baseTariffInfoV2TitleTextView;
            Intrinsics.checkNotNullExpressionValue(baseTariffInfoV2TitleTextView, "baseTariffInfoV2TitleTextView");
            TextAtomHolderKt.bind$default(baseTariffInfoV2TitleTextView, luggageBaseTariffInfoItem.getTitle(), null, 2, null);
            TextAtomView baseTariffInfoV2SubtitleTextView = adapterDelegateViewBindingViewHolder.getBinding().baseTariffInfoV2SubtitleTextView;
            Intrinsics.checkNotNullExpressionValue(baseTariffInfoV2SubtitleTextView, "baseTariffInfoV2SubtitleTextView");
            TextAtomHolderKt.bindOrGone$default(baseTariffInfoV2SubtitleTextView, luggageBaseTariffInfoItem.getSubtitle(), null, 2, null);
            TextAtomView baseTariffInfoV2HandCarryLabelTextView = adapterDelegateViewBindingViewHolder.getBinding().baseTariffInfoV2HandCarryLabelTextView;
            Intrinsics.checkNotNullExpressionValue(baseTariffInfoV2HandCarryLabelTextView, "baseTariffInfoV2HandCarryLabelTextView");
            TextAtomHolderKt.bind$default(baseTariffInfoV2HandCarryLabelTextView, luggageBaseTariffInfoItem.getHandCarryLabel(), null, 2, null);
            TextAtomView baseTariffInfoV2HandCarryTextView = adapterDelegateViewBindingViewHolder.getBinding().baseTariffInfoV2HandCarryTextView;
            Intrinsics.checkNotNullExpressionValue(baseTariffInfoV2HandCarryTextView, "baseTariffInfoV2HandCarryTextView");
            TextAtomHolderKt.bindOrGone$default(baseTariffInfoV2HandCarryTextView, luggageBaseTariffInfoItem.getHandCarryAmount(), null, 2, null);
            TextAtomView baseTariffInfoV2LuggageLabelTextView = adapterDelegateViewBindingViewHolder.getBinding().baseTariffInfoV2LuggageLabelTextView;
            Intrinsics.checkNotNullExpressionValue(baseTariffInfoV2LuggageLabelTextView, "baseTariffInfoV2LuggageLabelTextView");
            TextAtomHolderKt.bind$default(baseTariffInfoV2LuggageLabelTextView, luggageBaseTariffInfoItem.getLuggageLabel(), null, 2, null);
            TextAtomView baseTariffInfoV2LuggageTextView = adapterDelegateViewBindingViewHolder.getBinding().baseTariffInfoV2LuggageTextView;
            Intrinsics.checkNotNullExpressionValue(baseTariffInfoV2LuggageTextView, "baseTariffInfoV2LuggageTextView");
            TextAtomHolderKt.bindOrGone$default(baseTariffInfoV2LuggageTextView, luggageBaseTariffInfoItem.getLuggageAmount(), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalLuggageV2BaseTariffInfoAdapterDelegateKt$additionalLuggageV2BaseTariffInfoAdapterDelegate$2(RoundedBackgroundProducer roundedBackgroundProducer) {
        super(1);
        this.$backgroundProducer = roundedBackgroundProducer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageBaseTariffInfoItem, ItemAdditionalLuggageBaseTariffInfoV2Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageBaseTariffInfoItem, ItemAdditionalLuggageBaseTariffInfoV2Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.getBinding().baseTariffInfoV2Root.setBackground(this.$backgroundProducer.produce(ThemeExtKt.themeColor(adapterDelegateViewBinding.getContext(), R$attr.layerFloor1), ResourceExtKt.toPxF(20, adapterDelegateViewBinding.getContext())));
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
