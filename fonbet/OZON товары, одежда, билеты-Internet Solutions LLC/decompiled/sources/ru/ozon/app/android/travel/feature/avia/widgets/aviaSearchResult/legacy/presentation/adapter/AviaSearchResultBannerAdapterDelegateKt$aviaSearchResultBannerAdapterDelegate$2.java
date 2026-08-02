package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.AviaSearchResultVO;
import ru.ozon.app.android.travel.molecules.view.banner.BannerView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/AviaSearchResultVO$AviaSearchResultItemVO$BannerItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/legacy/presentation/adapter/BannerItem;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/molecules/view/banner/BannerView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>>, Unit> {
    final /* synthetic */ Function2<AtomAction, Integer, Unit> $onAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function2<AtomAction, Integer, Unit> $onAction;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>> $this_adapterDelegateViewBinding;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.legacy.presentation.adapter.AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C18871 extends AbstractC7737t implements Function1<AtomAction, Unit> {
            final /* synthetic */ Function2<AtomAction, Integer, Unit> $onAction;
            final /* synthetic */ AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>> $this_adapterDelegateViewBinding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C18871(Function2<? super AtomAction, ? super Integer, Unit> function2, AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>> adapterDelegateViewBindingViewHolder) {
                super(1);
                this.$onAction = function2;
                this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
                invoke2(atomAction);
                return Unit.f71690a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.$onAction.invoke(action, Integer.valueOf(this.$this_adapterDelegateViewBinding.getAdapterPosition()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>> adapterDelegateViewBindingViewHolder, Function2<? super AtomAction, ? super Integer, Unit> function2) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onAction = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout().bind(this.$this_adapterDelegateViewBinding.getItem().getBanner(), new C18871(this.$onAction, this.$this_adapterDelegateViewBinding));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AviaSearchResultBannerAdapterDelegateKt$aviaSearchResultBannerAdapterDelegate$2(Function2<? super AtomAction, ? super Integer, Unit> function2) {
        super(1);
        this.$onAction = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AviaSearchResultVO.AviaSearchResultItemVO.BannerItem, TypedViewBinding<BannerView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onAction));
    }
}
