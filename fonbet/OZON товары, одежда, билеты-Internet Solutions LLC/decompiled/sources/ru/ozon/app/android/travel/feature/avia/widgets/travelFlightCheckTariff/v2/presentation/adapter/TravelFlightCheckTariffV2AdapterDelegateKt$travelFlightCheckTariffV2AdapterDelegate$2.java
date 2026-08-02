package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.view.TravelFlightCheckTariffView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/Tariff;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/view/TravelFlightCheckTariffView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>>, Unit> {
    final /* synthetic */ Function2<AtomActionDTO, Integer, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function2<AtomActionDTO, Integer, Unit> $onAction;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>> $this_adapterDelegateViewBinding;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18921 extends AbstractC7737t implements Function0<Unit> {
            final /* synthetic */ Function2<AtomActionDTO, Integer, Unit> $onAction;
            final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>> $this_adapterDelegateViewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C18921(Function2<? super AtomActionDTO, ? super Integer, Unit> function2, AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>> adapterDelegateViewBindingViewHolder) {
                super(0);
                this.$onAction = function2;
                this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$onAction.invoke(this.$this_adapterDelegateViewBinding.getItem().getSelectAction(), Integer.valueOf(this.$this_adapterDelegateViewBinding.getAdapterPosition()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>> adapterDelegateViewBindingViewHolder, Function2<? super AtomActionDTO, ? super Integer, Unit> function2) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onAction = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().bind(this.$this_adapterDelegateViewBinding.getItem(), new C18921(this.$onAction, this.$this_adapterDelegateViewBinding));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelFlightCheckTariffV2AdapterDelegateKt$travelFlightCheckTariffV2AdapterDelegate$2(Function2<? super AtomActionDTO, ? super Integer, Unit> function2) {
        super(1);
        this.$onAction = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff, TypedViewBinding<TravelFlightCheckTariffView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onAction));
    }
}
