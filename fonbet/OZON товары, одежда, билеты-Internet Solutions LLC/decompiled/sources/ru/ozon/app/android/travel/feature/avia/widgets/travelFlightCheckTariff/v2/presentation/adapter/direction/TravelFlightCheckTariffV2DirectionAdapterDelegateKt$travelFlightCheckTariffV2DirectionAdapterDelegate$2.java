package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.direction;

import android.content.Context;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemFlightCheckTariffDirectionV2Binding;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff$Direction;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/adapter/direction/Direction;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemFlightCheckTariffDirectionV2Binding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class TravelFlightCheckTariffV2DirectionAdapterDelegateKt$travelFlightCheckTariffV2DirectionAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff.Direction, ItemFlightCheckTariffDirectionV2Binding>, Unit> {
    public static final TravelFlightCheckTariffV2DirectionAdapterDelegateKt$travelFlightCheckTariffV2DirectionAdapterDelegate$2 INSTANCE = new TravelFlightCheckTariffV2DirectionAdapterDelegateKt$travelFlightCheckTariffV2DirectionAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.adapter.direction.TravelFlightCheckTariffV2DirectionAdapterDelegateKt$travelFlightCheckTariffV2DirectionAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AtomsAdapter $atomsAdapter;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff.Direction, ItemFlightCheckTariffDirectionV2Binding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff.Direction, ItemFlightCheckTariffDirectionV2Binding> adapterDelegateViewBindingViewHolder, AtomsAdapter atomsAdapter) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$atomsAdapter = atomsAdapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            TextAtomView directionV2CompoundRouteTextView = this.$this_adapterDelegateViewBinding.getBinding().directionV2CompoundRouteTextView;
            Intrinsics.checkNotNullExpressionValue(directionV2CompoundRouteTextView, "directionV2CompoundRouteTextView");
            TextAtomHolderKt.bindOrGone$default(directionV2CompoundRouteTextView, this.$this_adapterDelegateViewBinding.getItem().getCompoundRoute(), null, 2, null);
            ShapeableImageView directionV2IconImageView = this.$this_adapterDelegateViewBinding.getBinding().directionV2IconImageView;
            Intrinsics.checkNotNullExpressionValue(directionV2IconImageView, "directionV2IconImageView");
            ImageViewExtKt.loadImageOrGone(directionV2IconImageView, this.$this_adapterDelegateViewBinding.getItem().getAirlineIcon());
            this.$atomsAdapter.bind(this.$this_adapterDelegateViewBinding.getContext(), this.$this_adapterDelegateViewBinding.getItem().getFeatures());
        }
    }

    TravelFlightCheckTariffV2DirectionAdapterDelegateKt$travelFlightCheckTariffV2DirectionAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff.Direction, ItemFlightCheckTariffDirectionV2Binding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TravelFlightCheckTariffV2VO.Tariff.Direction, ItemFlightCheckTariffDirectionV2Binding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        VerticalAtomsLayout verticalAtomsLayout = adapterDelegateViewBinding.getBinding().directionV2FeaturesLayout;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new TravelFeatureItemDecoration(context));
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding, atomsAdapter));
    }
}
