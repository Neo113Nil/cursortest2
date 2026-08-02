package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3.AviaSearchV3BonusToggleView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BonusToggleItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/BonusToggleItem;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/v3/AviaSearchV3BonusToggleView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem, TypedViewBinding<AviaSearchV3BonusToggleView>>, Unit> {
    final /* synthetic */ InterfaceC6511n<Boolean, AtomAction, t, Unit> $onBonusPayStateChangeListener;
    final /* synthetic */ Function1<t, Unit> $processViewEvent;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ InterfaceC6511n<Boolean, AtomAction, t, Unit> $onBonusPayStateChangeListener;
        final /* synthetic */ Function1<t, Unit> $processViewEvent;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem, TypedViewBinding<AviaSearchV3BonusToggleView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem, TypedViewBinding<AviaSearchV3BonusToggleView>> adapterDelegateViewBindingViewHolder, InterfaceC6511n<? super Boolean, ? super AtomAction, ? super t, Unit> interfaceC6511n, Function1<? super t, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onBonusPayStateChangeListener = interfaceC6511n;
            this.$processViewEvent = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().bind(this.$this_adapterDelegateViewBinding.getItem(), this.$onBonusPayStateChangeListener);
            this.$processViewEvent.invoke(this.$this_adapterDelegateViewBinding.getItem().getViewTrackingInfo());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaSearchResultV3BonusPayAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2(InterfaceC6511n<? super Boolean, ? super AtomAction, ? super t, Unit> interfaceC6511n, Function1<? super t, Unit> function1) {
        super(1);
        this.$onBonusPayStateChangeListener = interfaceC6511n;
        this.$processViewEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem, TypedViewBinding<AviaSearchV3BonusToggleView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BonusToggleItem, TypedViewBinding<AviaSearchV3BonusToggleView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onBonusPayStateChangeListener, this.$processViewEvent));
    }
}
