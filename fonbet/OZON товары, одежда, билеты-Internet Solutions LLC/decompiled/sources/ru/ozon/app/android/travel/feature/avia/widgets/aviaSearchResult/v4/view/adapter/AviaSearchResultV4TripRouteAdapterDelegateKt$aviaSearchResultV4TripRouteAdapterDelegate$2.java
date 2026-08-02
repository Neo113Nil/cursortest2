package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.atoms.af.layout.HorizontalAtomsLayout;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4FlightVO;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomsAdapter;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/presentation/vo/AviaSearchResultV4FlightVO$TripRoute$Transfer;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/atoms/af/layout/HorizontalAtomsLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4TripRouteAdapterDelegateKt$aviaSearchResultV4TripRouteAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AviaSearchResultV4FlightVO.TripRoute.Transfer, TypedViewBinding<HorizontalAtomsLayout>>, Unit> {
    public static final AviaSearchResultV4TripRouteAdapterDelegateKt$aviaSearchResultV4TripRouteAdapterDelegate$2 INSTANCE = new AviaSearchResultV4TripRouteAdapterDelegateKt$aviaSearchResultV4TripRouteAdapterDelegate$2();

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.view.adapter.AviaSearchResultV4TripRouteAdapterDelegateKt$aviaSearchResultV4TripRouteAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AtomsAdapter $atomsAdapter;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AviaSearchResultV4FlightVO.TripRoute.Transfer, TypedViewBinding<HorizontalAtomsLayout>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AtomsAdapter atomsAdapter, AdapterDelegateViewBindingViewHolder<AviaSearchResultV4FlightVO.TripRoute.Transfer, TypedViewBinding<HorizontalAtomsLayout>> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$atomsAdapter = atomsAdapter;
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
            this.$atomsAdapter.bind(this.$this_adapterDelegateViewBinding.getContext(), this.$this_adapterDelegateViewBinding.getItem().getAtoms());
        }
    }

    AviaSearchResultV4TripRouteAdapterDelegateKt$aviaSearchResultV4TripRouteAdapterDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AviaSearchResultV4FlightVO.TripRoute.Transfer, TypedViewBinding<HorizontalAtomsLayout>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AviaSearchResultV4FlightVO.TripRoute.Transfer, TypedViewBinding<HorizontalAtomsLayout>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        adapterDelegateViewBinding.getBinding().getConstraintLayout().setAdapter(atomsAdapter);
        adapterDelegateViewBinding.getBinding().getConstraintLayout().setDecorator(new AviaSearchResultV4TripRouteAtomsDecoration(adapterDelegateViewBinding.getContext()));
        adapterDelegateViewBinding.bind(new AnonymousClass1(atomsAdapter, adapterDelegateViewBinding));
    }
}
