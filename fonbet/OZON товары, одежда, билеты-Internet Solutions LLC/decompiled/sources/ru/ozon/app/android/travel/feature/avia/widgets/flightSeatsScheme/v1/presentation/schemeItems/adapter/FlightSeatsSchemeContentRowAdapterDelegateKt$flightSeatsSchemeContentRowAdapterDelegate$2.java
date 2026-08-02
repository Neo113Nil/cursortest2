package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatVO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.FlightSchemeContentRow;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.view.FlightSchemeContentRowView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/FlightSchemeContentRow;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/schemeItems/view/FlightSchemeContentRowView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>>, Unit> {
    final /* synthetic */ Function2<Integer, AirplaneSeatVO, Unit> $onSeatClickListener;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "seat", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AirplaneSeatVO, Unit> {
        final /* synthetic */ Function2<Integer, AirplaneSeatVO, Unit> $onSeatClickListener;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Integer, ? super AirplaneSeatVO, Unit> function2, AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$onSeatClickListener = function2;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AirplaneSeatVO airplaneSeatVO) {
            invoke2(airplaneSeatVO);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AirplaneSeatVO seat) {
            Intrinsics.checkNotNullParameter(seat, "seat");
            this.$onSeatClickListener.invoke(Integer.valueOf(this.$this_adapterDelegateViewBinding.getAdapterPosition()), seat);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.schemeItems.adapter.FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ FlightSchemeContentRowView $contentView;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FlightSchemeContentRowView flightSchemeContentRowView, AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$contentView = flightSchemeContentRowView;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            Object M11 = C7714v.M(payloads);
            if (Intrinsics.d(M11, "FlightSchemePayloadSeatSelection")) {
                this.$contentView.updateSingleSeat(this.$this_adapterDelegateViewBinding.getItem());
            } else if (!(M11 instanceof FlightSchemePayload$Highlight)) {
                this.$contentView.bind(this.$this_adapterDelegateViewBinding.getItem());
            } else {
                FlightSchemePayload$Highlight flightSchemePayload$Highlight = (FlightSchemePayload$Highlight) M11;
                this.$contentView.highlightSeat(flightSchemePayload$Highlight.getSeatNumber(), flightSchemePayload$Highlight.getShouldDelay());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSeatsSchemeContentRowAdapterDelegateKt$flightSeatsSchemeContentRowAdapterDelegate$2(Function2<? super Integer, ? super AirplaneSeatVO, Unit> function2) {
        super(1);
        this.$onSeatClickListener = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<FlightSchemeContentRow, TypedViewBinding<FlightSchemeContentRowView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        FlightSchemeContentRowView constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        constraintLayout.setOnSeatClickListener(new AnonymousClass1(this.$onSeatClickListener, adapterDelegateViewBinding));
        adapterDelegateViewBinding.bind(new AnonymousClass2(constraintLayout, adapterDelegateViewBinding));
    }
}
