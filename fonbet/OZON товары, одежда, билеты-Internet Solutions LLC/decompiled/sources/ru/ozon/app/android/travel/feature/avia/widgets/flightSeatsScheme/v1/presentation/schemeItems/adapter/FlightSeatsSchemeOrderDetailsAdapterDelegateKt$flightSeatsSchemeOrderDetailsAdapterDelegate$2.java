package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSeatsSchemeOrderDetailsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeOrderDetailsView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSeatsSchemeOrderDetailsVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeOrderDetailsView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeOrderDetailsAdapterDelegateKt$flightSeatsSchemeOrderDetailsAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeOrderDetailsVO, TypedViewBinding<FlightSchemeOrderDetailsView>>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSeatsSchemeOrderDetailsAdapterDelegateKt$flightSeatsSchemeOrderDetailsAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $onAction;
        final /* synthetic */ FlightSchemeOrderDetailsView $orderDetailsView;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeOrderDetailsVO, TypedViewBinding<FlightSchemeOrderDetailsView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(FlightSchemeOrderDetailsView flightSchemeOrderDetailsView, AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeOrderDetailsVO, TypedViewBinding<FlightSchemeOrderDetailsView>> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$orderDetailsView = flightSchemeOrderDetailsView;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onAction = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (payloads.contains("FlightSchemePayloadOrderDetailsUpdate")) {
                this.$orderDetailsView.update(this.$this_adapterDelegateViewBinding.getItem().getFlightPrices(), this.$this_adapterDelegateViewBinding.getItem().getTotalPrice());
            } else {
                this.$orderDetailsView.bind(this.$this_adapterDelegateViewBinding.getItem(), this.$onAction);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSeatsSchemeOrderDetailsAdapterDelegateKt$flightSeatsSchemeOrderDetailsAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeOrderDetailsVO, TypedViewBinding<FlightSchemeOrderDetailsView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeOrderDetailsVO, TypedViewBinding<FlightSchemeOrderDetailsView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding.getBinding().getConstraintLayout(), adapterDelegateViewBinding, this.$onAction));
    }
}
