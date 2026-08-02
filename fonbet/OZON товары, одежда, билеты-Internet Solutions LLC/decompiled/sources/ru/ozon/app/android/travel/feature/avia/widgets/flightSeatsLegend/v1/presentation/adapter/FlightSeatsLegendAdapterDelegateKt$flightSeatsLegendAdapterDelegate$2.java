package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation.adapter;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemFlightSeatsLegendBinding;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatView;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation.FlightSeatsLegendVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsLegend/v1/presentation/FlightSeatsLegendVO$SeatType;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemFlightSeatsLegendBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class FlightSeatsLegendAdapterDelegateKt$flightSeatsLegendAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<FlightSeatsLegendVO.SeatType, ItemFlightSeatsLegendBinding>, Unit> {
    public static final FlightSeatsLegendAdapterDelegateKt$flightSeatsLegendAdapterDelegate$2 INSTANCE = new FlightSeatsLegendAdapterDelegateKt$flightSeatsLegendAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsLegend.v1.presentation.adapter.FlightSeatsLegendAdapterDelegateKt$flightSeatsLegendAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<FlightSeatsLegendVO.SeatType, ItemFlightSeatsLegendBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<FlightSeatsLegendVO.SeatType, ItemFlightSeatsLegendBinding> adapterDelegateViewBindingViewHolder) {
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
            FlightSeatsLegendVO.SeatType item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<FlightSeatsLegendVO.SeatType, ItemFlightSeatsLegendBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            FlightSeatsLegendVO.SeatType seatType = item;
            AirplaneSeatView.bind$default(adapterDelegateViewBindingViewHolder.getBinding().flightSeatsLegendSignASV, seatType.getSign(), false, 2, null);
            TextAtomView flightSeatsLegendDescriptionTAV = adapterDelegateViewBindingViewHolder.getBinding().flightSeatsLegendDescriptionTAV;
            Intrinsics.checkNotNullExpressionValue(flightSeatsLegendDescriptionTAV, "flightSeatsLegendDescriptionTAV");
            TextAtomHolderKt.bind$default(flightSeatsLegendDescriptionTAV, seatType.getDescription(), null, 2, null);
            BadgeView flightSeatsLegendBadgeBV = adapterDelegateViewBindingViewHolder.getBinding().flightSeatsLegendBadgeBV;
            Intrinsics.checkNotNullExpressionValue(flightSeatsLegendBadgeBV, "flightSeatsLegendBadgeBV");
            BadgeHolderKt.bindOrGone$default(flightSeatsLegendBadgeBV, seatType.getPriceFromBadge(), (Function1) null, 2, (Object) null);
            View flightSeatsLegendSeparatorV = adapterDelegateViewBindingViewHolder.getBinding().flightSeatsLegendSeparatorV;
            Intrinsics.checkNotNullExpressionValue(flightSeatsLegendSeparatorV, "flightSeatsLegendSeparatorV");
            flightSeatsLegendSeparatorV.setVisibility(seatType.getIsSeparatorInvisible() ? 4 : 0);
        }
    }

    FlightSeatsLegendAdapterDelegateKt$flightSeatsLegendAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<FlightSeatsLegendVO.SeatType, ItemFlightSeatsLegendBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<FlightSeatsLegendVO.SeatType, ItemFlightSeatsLegendBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
