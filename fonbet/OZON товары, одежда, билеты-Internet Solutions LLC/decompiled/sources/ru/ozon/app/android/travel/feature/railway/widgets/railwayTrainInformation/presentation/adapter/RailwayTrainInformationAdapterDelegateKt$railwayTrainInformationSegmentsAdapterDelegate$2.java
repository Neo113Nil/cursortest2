package ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.railway.databinding.ItemRailwayTrainInformationSegmentBinding;
import ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.RailwayTrainInformationVO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/railway/widgets/railwayTrainInformation/presentation/RailwayTrainInformationVO$SegmentVO;", "Lru/ozon/app/android/travel/feature/railway/databinding/ItemRailwayTrainInformationSegmentBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RailwayTrainInformationAdapterDelegateKt$railwayTrainInformationSegmentsAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<RailwayTrainInformationVO.SegmentVO, ItemRailwayTrainInformationSegmentBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.railway.widgets.railwayTrainInformation.presentation.adapter.RailwayTrainInformationAdapterDelegateKt$railwayTrainInformationSegmentsAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<RailwayTrainInformationVO.SegmentVO, ItemRailwayTrainInformationSegmentBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<RailwayTrainInformationVO.SegmentVO, ItemRailwayTrainInformationSegmentBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$actionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            RailwayTrainInformationVO.SegmentVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<RailwayTrainInformationVO.SegmentVO, ItemRailwayTrainInformationSegmentBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            RailwayTrainInformationVO.SegmentVO segmentVO = item;
            TextAtomView railwayTrainInformationTitleTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationTitleTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationTitleTav, "railwayTrainInformationTitleTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationTitleTav, segmentVO.getTitle(), null, 2, null);
            adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationRouteButtonLbv.bindOrGone(segmentVO.getRouteButton(), function1);
            TextAtomView railwayTrainInformationDepartureStationTimeTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationDepartureStationTimeTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationDepartureStationTimeTav, "railwayTrainInformationDepartureStationTimeTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationDepartureStationTimeTav, segmentVO.getDepartureStation().getTime(), null, 2, null);
            TextAtomView railwayTrainInformationDepartureStationDateTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationDepartureStationDateTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationDepartureStationDateTav, "railwayTrainInformationDepartureStationDateTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationDepartureStationDateTav, segmentVO.getDepartureStation().getDate(), null, 2, null);
            TextAtomView railwayTrainInformationDepartureStationNameTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationDepartureStationNameTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationDepartureStationNameTav, "railwayTrainInformationDepartureStationNameTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationDepartureStationNameTav, segmentVO.getDepartureStation().getName(), null, 2, null);
            TextAtomView textAtomView = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationDepartureStationAdditionalNameTav;
            Intrinsics.checkNotNullExpressionValue(textAtomView, "railwayTrainInformationD…eStationAdditionalNameTav");
            TextAtomHolderKt.bindOrGone$default(textAtomView, segmentVO.getDepartureStation().getAdditionalName(), null, 2, null);
            TextAtomView railwayTrainInformationDurationTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationDurationTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationDurationTav, "railwayTrainInformationDurationTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationDurationTav, segmentVO.getDuration(), null, 2, null);
            TextAtomView railwayTrainInformationArrivalStationTimeTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationArrivalStationTimeTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationArrivalStationTimeTav, "railwayTrainInformationArrivalStationTimeTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationArrivalStationTimeTav, segmentVO.getArrivalStation().getTime(), null, 2, null);
            TextAtomView railwayTrainInformationArrivalStationDateTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationArrivalStationDateTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationArrivalStationDateTav, "railwayTrainInformationArrivalStationDateTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationArrivalStationDateTav, segmentVO.getArrivalStation().getDate(), null, 2, null);
            TextAtomView railwayTrainInformationArrivalStationNameTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationArrivalStationNameTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationArrivalStationNameTav, "railwayTrainInformationArrivalStationNameTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationArrivalStationNameTav, segmentVO.getArrivalStation().getName(), null, 2, null);
            TextAtomView textAtomView2 = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationArrivalStationAdditionalNameTav;
            Intrinsics.checkNotNullExpressionValue(textAtomView2, "railwayTrainInformationA…lStationAdditionalNameTav");
            TextAtomHolderKt.bindOrGone$default(textAtomView2, segmentVO.getArrivalStation().getAdditionalName(), null, 2, null);
            TextAtomView railwayTrainInformationCarriageInfoTav = adapterDelegateViewBindingViewHolder.getBinding().railwayTrainInformationCarriageInfoTav;
            Intrinsics.checkNotNullExpressionValue(railwayTrainInformationCarriageInfoTav, "railwayTrainInformationCarriageInfoTav");
            TextAtomHolderKt.bind$default(railwayTrainInformationCarriageInfoTav, segmentVO.getCarriageInfo(), null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RailwayTrainInformationAdapterDelegateKt$railwayTrainInformationSegmentsAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<RailwayTrainInformationVO.SegmentVO, ItemRailwayTrainInformationSegmentBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<RailwayTrainInformationVO.SegmentVO, ItemRailwayTrainInformationSegmentBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$actionHandler));
    }
}
