package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3;

import WZ.t;
import android.view.View;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.view.v3.LuggageTabV3View;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$LuggageTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/LuggageTabVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/view/v3/LuggageTabV3View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO, TypedViewBinding<LuggageTabV3View>>, Unit> {
    final /* synthetic */ InterfaceC6512o<Long, AtomActionDTO, t, String, Unit> $onBadgeSelectedListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO, TypedViewBinding<LuggageTabV3View>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO, TypedViewBinding<LuggageTabV3View>> adapterDelegateViewBindingViewHolder) {
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
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().bind(this.$this_adapterDelegateViewBinding.getItem());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2(InterfaceC6512o<? super Long, ? super AtomActionDTO, ? super t, ? super String, Unit> interfaceC6512o) {
        super(1);
        this.$onBadgeSelectedListener = interfaceC6512o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AdapterDelegateViewBindingViewHolder adapterDelegateViewBindingViewHolder, InterfaceC6512o interfaceC6512o, View view) {
        if (((AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO) adapterDelegateViewBindingViewHolder.getItem()).getIsSelected()) {
            return;
        }
        interfaceC6512o.invoke(Long.valueOf(((AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO) adapterDelegateViewBindingViewHolder.getItem()).getFlightId()), ((AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO) adapterDelegateViewBindingViewHolder.getItem()).getAction(), ((AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO) adapterDelegateViewBindingViewHolder.getItem()).getTrackingInfo(), ((AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO) adapterDelegateViewBindingViewHolder.getItem()).getTotalPrice());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO, TypedViewBinding<LuggageTabV3View>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.LuggageTabVO, TypedViewBinding<LuggageTabV3View>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        View view = adapterDelegateViewBinding.itemView;
        final InterfaceC6512o<Long, AtomActionDTO, t, String, Unit> interfaceC6512o = this.$onBadgeSelectedListener;
        view.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.v3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AviaSearchResultV3LuggageAdapterDelegateKt$aviaSearchResultV3BonusAdapterDelegate$2.invoke$lambda$0(AdapterDelegateViewBindingViewHolder.this, interfaceC6512o, view2);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
    }
}
