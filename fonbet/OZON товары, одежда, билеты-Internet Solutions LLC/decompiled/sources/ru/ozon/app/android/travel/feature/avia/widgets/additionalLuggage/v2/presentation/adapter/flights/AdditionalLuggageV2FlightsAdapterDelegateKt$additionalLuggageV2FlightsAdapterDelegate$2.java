package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage.AdditionalLuggageV2FlightDecoration;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.luggage.AdditionalLuggageV2FlightSegmentsAdapter;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.app.android.travel.utils.coroutineAdapter.CoroutineListDifferAdapter;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/adapter/flights/FlightVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Landroidx/recyclerview/widget/RecyclerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>>, Unit> {
    final /* synthetic */ Function2<Integer, AdditionalLuggageV2VO.LuggageOptionItem, Unit> $onLuggageOptionClicked;
    final /* synthetic */ Function1<Boolean, Unit> $onVerticalScrollListener;
    final /* synthetic */ int $radiusCompensation;
    final /* synthetic */ RecyclerView.u $recyclerViewPool;
    final /* synthetic */ M $scope;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payloads", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<Boolean, Unit> $onVerticalScrollListener;
        final /* synthetic */ M $scope;
        final /* synthetic */ AdditionalLuggageV2FlightSegmentsAdapter $segmentsAdapter;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Boolean, Unit> function1, AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> adapterDelegateViewBindingViewHolder, AdditionalLuggageV2FlightSegmentsAdapter additionalLuggageV2FlightSegmentsAdapter, M m11) {
            super(1);
            this.$onVerticalScrollListener = function1;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$segmentsAdapter = additionalLuggageV2FlightSegmentsAdapter;
            this.$scope = m11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payloads) {
            Integer optionItemPosition;
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            if (payloads.size() != 1) {
                CoroutineListDifferAdapter.submitList$default(this.$segmentsAdapter, this.$scope, this.$this_adapterDelegateViewBinding.getItem().getLuggageItems(), null, 4, null);
                return;
            }
            Object K11 = C7714v.K(payloads);
            if (Intrinsics.d(K11, "FlightElevationPayload")) {
                this.$onVerticalScrollListener.invoke(Boolean.valueOf(this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().canScrollVertically(-1)));
                return;
            }
            if (!(K11 instanceof FlightLuggageSelectionPayload) || (optionItemPosition = ((FlightLuggageSelectionPayload) K11).getOptionItemPosition()) == null) {
                return;
            }
            AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            AdditionalLuggageV2FlightSegmentsAdapter additionalLuggageV2FlightSegmentsAdapter = this.$segmentsAdapter;
            int intValue = optionItemPosition.intValue();
            AdditionalLuggageV2VO.LuggageItem luggageItem = (AdditionalLuggageV2VO.LuggageItem) C7714v.Q(intValue, adapterDelegateViewBindingViewHolder.getItem().getLuggageItems());
            if (luggageItem != null) {
                additionalLuggageV2FlightSegmentsAdapter.updateItem(intValue, new AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$2$1$1(luggageItem), K11);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1 $scrollListener;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> adapterDelegateViewBindingViewHolder, AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1 additionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1) {
            super(0);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$scrollListener = additionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().addOnScrollListener(this.$scrollListener);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1 $scrollListener;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> adapterDelegateViewBindingViewHolder, AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1 additionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1) {
            super(0);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$scrollListener = additionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().removeOnScrollListener(this.$scrollListener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2(Function2<? super Integer, ? super AdditionalLuggageV2VO.LuggageOptionItem, Unit> function2, RecyclerView.u uVar, int i11, Function1<? super Boolean, Unit> function1, M m11) {
        super(1);
        this.$onLuggageOptionClicked = function2;
        this.$recyclerViewPool = uVar;
        this.$radiusCompensation = i11;
        this.$onVerticalScrollListener = function1;
        this.$scope = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AdditionalLuggageV2VO.FlightVO, TypedViewBinding<RecyclerView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AdditionalLuggageV2FlightSegmentsAdapter additionalLuggageV2FlightSegmentsAdapter = new AdditionalLuggageV2FlightSegmentsAdapter(this.$onLuggageOptionClicked);
        RecyclerView constraintLayout = adapterDelegateViewBinding.getBinding().getConstraintLayout();
        RecyclerView.u uVar = this.$recyclerViewPool;
        int i11 = this.$radiusCompensation;
        RecyclerView recyclerView = constraintLayout;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(additionalLuggageV2FlightSegmentsAdapter);
        recyclerView.setRecycledViewPool(uVar);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new AdditionalLuggageV2FlightDecoration(ResourceExtKt.toPx(8, context), i11));
        final Function1<Boolean, Unit> function1 = this.$onVerticalScrollListener;
        ?? r12 = new RecyclerView.t() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.adapter.flights.AdditionalLuggageV2FlightsAdapterDelegateKt$additionalLuggageV2FlightsAdapterDelegate$2$scrollListener$1
            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrolled(RecyclerView recyclerView2, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView2, "recyclerView");
                function1.invoke(Boolean.valueOf(adapterDelegateViewBinding.getBinding().getConstraintLayout().canScrollVertically(-1)));
            }
        };
        adapterDelegateViewBinding.bind(new AnonymousClass2(this.$onVerticalScrollListener, adapterDelegateViewBinding, additionalLuggageV2FlightSegmentsAdapter, this.$scope));
        adapterDelegateViewBinding.onViewAttachedToWindow(new AnonymousClass3(adapterDelegateViewBinding, r12));
        adapterDelegateViewBinding.onViewDetachedFromWindow(new AnonymousClass4(adapterDelegateViewBinding, r12));
    }
}
