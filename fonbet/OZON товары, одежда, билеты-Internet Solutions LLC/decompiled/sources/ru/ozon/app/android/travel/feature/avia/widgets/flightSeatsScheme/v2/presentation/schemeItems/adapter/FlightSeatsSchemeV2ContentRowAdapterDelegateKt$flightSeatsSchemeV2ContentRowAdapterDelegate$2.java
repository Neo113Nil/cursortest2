package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.FlightSchemeContentRowV2;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.view.FlightSchemeContentRowViewV2;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/FlightSchemeContentRowV2;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/schemeItems/view/FlightSchemeContentRowViewV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $emergencySeatsActionHandler;
    final /* synthetic */ Function2<Integer, AirplaneSeatTypeV2VI, Unit> $onSeatClickListener;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "seat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AirplaneSeatTypeV2VI, Unit> {
        final /* synthetic */ Function2<Integer, AirplaneSeatTypeV2VI, Unit> $onSeatClickListener;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Integer, ? super AirplaneSeatTypeV2VI, Unit> function2, AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$onSeatClickListener = function2;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AirplaneSeatTypeV2VI airplaneSeatTypeV2VI) {
            invoke2(airplaneSeatTypeV2VI);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AirplaneSeatTypeV2VI seat) {
            Intrinsics.checkNotNullParameter(seat, "seat");
            this.$onSeatClickListener.invoke(Integer.valueOf(this.$this_adapterDelegateViewBinding.getAdapterPosition()), seat);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.schemeItems.adapter.FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ FlightSchemeContentRowViewV2 $contentView;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(FlightSchemeContentRowViewV2 flightSchemeContentRowViewV2, AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$contentView = flightSchemeContentRowViewV2;
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
            } else if (!(M11 instanceof FlightSchemeV2Payload$HighlightV2)) {
                this.$contentView.bind(this.$this_adapterDelegateViewBinding.getItem());
            } else {
                FlightSchemeV2Payload$HighlightV2 flightSchemeV2Payload$HighlightV2 = (FlightSchemeV2Payload$HighlightV2) M11;
                this.$contentView.highlightSeat(flightSchemeV2Payload$HighlightV2.getSeatNumber(), flightSchemeV2Payload$HighlightV2.getShouldDelay());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSeatsSchemeV2ContentRowAdapterDelegateKt$flightSeatsSchemeV2ContentRowAdapterDelegate$2(Function1<? super AtomAction, Unit> function1, Function2<? super Integer, ? super AirplaneSeatTypeV2VI, Unit> function2) {
        super(1);
        this.$emergencySeatsActionHandler = function1;
        this.$onSeatClickListener = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<FlightSchemeContentRowV2, TypedViewBinding<FlightSchemeContentRowViewV2>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        FlightSchemeContentRowViewV2 constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        constraintLayout.setOnSeatClickListener(new AnonymousClass1(this.$onSeatClickListener, adapterDelegateViewBinding));
        constraintLayout.setEmergencySeatsActionHandler(this.$emergencySeatsActionHandler);
        adapterDelegateViewBinding.bind(new AnonymousClass2(constraintLayout, adapterDelegateViewBinding));
    }
}
