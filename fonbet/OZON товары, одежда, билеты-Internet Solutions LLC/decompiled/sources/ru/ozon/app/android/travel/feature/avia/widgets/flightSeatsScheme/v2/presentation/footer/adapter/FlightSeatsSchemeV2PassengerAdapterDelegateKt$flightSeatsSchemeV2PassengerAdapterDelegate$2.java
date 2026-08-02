package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengersPayload;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.view.FlightSeatsSchemeV2PassengerTabView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/view/FlightSeatsSchemeV2PassengerTabView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, TypedViewBinding<FlightSeatsSchemeV2PassengerTabView>>, Unit> {
    final /* synthetic */ Function2<Integer, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> $onPassengerSelected;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AccelerateDecelerateInterpolator $changeInterpolator;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, TypedViewBinding<FlightSeatsSchemeV2PassengerTabView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, TypedViewBinding<FlightSeatsSchemeV2PassengerTabView>> adapterDelegateViewBindingViewHolder, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$changeInterpolator = accelerateDecelerateInterpolator;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (payloads.isEmpty()) {
                this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().bind(this.$this_adapterDelegateViewBinding.getItem());
                return;
            }
            for (Object obj : payloads) {
                if (obj instanceof FlightSeatsSchemeV2PassengersPayload.TabSelection) {
                    FlightSeatsSchemeV2PassengersPayload.TabSelection tabSelection = (FlightSeatsSchemeV2PassengersPayload.TabSelection) obj;
                    FlightSeatsSchemeV2PassengerAdapterDelegateKt.updateTabColors(this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout(), this.$changeInterpolator, tabSelection.getOldPassenger(), tabSelection.getNewPassenger());
                } else if (obj instanceof FlightSeatsSchemeV2PassengersPayload.SeatSelection) {
                    FlightSeatsSchemeV2PassengersPayload.SeatSelection seatSelection = (FlightSeatsSchemeV2PassengersPayload.SeatSelection) obj;
                    FlightSeatsSchemeV2PassengerAdapterDelegateKt.updateSelectedSeat(this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout(), this.$changeInterpolator, seatSelection.getOldSeat(), seatSelection.getNewSeat());
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$2(Function2<? super Integer, ? super FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> function2) {
        super(1);
        this.$onPassengerSelected = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function2 function2, AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, View view) {
        function2.invoke(Integer.valueOf(adapterDelegateViewBindingViewHolder.getAdapterPosition()), adapterDelegateViewBindingViewHolder.getItem());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, TypedViewBinding<FlightSeatsSchemeV2PassengerTabView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, TypedViewBinding<FlightSeatsSchemeV2PassengerTabView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        FlightSeatsSchemeV2PassengerTabView constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        final Function2<Integer, FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI, Unit> function2 = this.$onPassengerSelected;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.adapter.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlightSeatsSchemeV2PassengerAdapterDelegateKt$flightSeatsSchemeV2PassengerAdapterDelegate$2.invoke$lambda$0(Function2.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, accelerateDecelerateInterpolator));
    }
}
