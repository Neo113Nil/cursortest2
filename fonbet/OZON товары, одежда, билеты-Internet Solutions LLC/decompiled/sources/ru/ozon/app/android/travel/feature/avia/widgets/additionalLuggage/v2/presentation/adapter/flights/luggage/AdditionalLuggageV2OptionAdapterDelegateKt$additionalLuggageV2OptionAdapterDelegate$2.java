package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.v3.holders.cells.subtitled.CellWithSubtitleCheckboxRadioCounterHolderKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemLuggageOptionV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.FlightLuggageSelectionPayload;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleCheckboxRadioCounterView;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/luggage/LuggageOptionItem;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemLuggageOptionV2Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2OptionAdapterDelegateKt$additionalLuggageV2OptionAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageOptionItem, ItemLuggageOptionV2Binding>, Unit> {
    public static final AdditionalLuggageV2OptionAdapterDelegateKt$additionalLuggageV2OptionAdapterDelegate$2 INSTANCE = new AdditionalLuggageV2OptionAdapterDelegateKt$additionalLuggageV2OptionAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payload", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage.AdditionalLuggageV2OptionAdapterDelegateKt$additionalLuggageV2OptionAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageOptionItem, ItemLuggageOptionV2Binding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageOptionItem, ItemLuggageOptionV2Binding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Object Q11 = C7714v.Q(0, payload);
            if ((Q11 instanceof FlightLuggageSelectionPayload ? (FlightLuggageSelectionPayload) Q11 : null) != null) {
                this.$this_adapterDelegateViewBinding.getBinding().luggageOptionV2CellView.getSelectorView().setSelected(this.$this_adapterDelegateViewBinding.getItem().getOption().isSelected());
                return;
            }
            CellWithSubtitleCheckboxRadioCounterView luggageOptionV2CellView = this.$this_adapterDelegateViewBinding.getBinding().luggageOptionV2CellView;
            Intrinsics.checkNotNullExpressionValue(luggageOptionV2CellView, "luggageOptionV2CellView");
            CellWithSubtitleCheckboxRadioCounterHolderKt.bind$default(luggageOptionV2CellView, this.$this_adapterDelegateViewBinding.getItem().getOption(), null, 2, null);
        }
    }

    AdditionalLuggageV2OptionAdapterDelegateKt$additionalLuggageV2OptionAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageOptionItem, ItemLuggageOptionV2Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.LuggageOptionItem, ItemLuggageOptionV2Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
