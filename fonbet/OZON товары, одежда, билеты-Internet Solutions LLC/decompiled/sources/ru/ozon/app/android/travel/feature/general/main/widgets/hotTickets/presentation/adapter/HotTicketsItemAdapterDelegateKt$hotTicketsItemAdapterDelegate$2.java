package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter;

import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.TicketVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.view.HotTicketsItemView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/TicketVO;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/view/HotTicketsItemView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotTicketsItemAdapterDelegateKt$hotTicketsItemAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<TicketVO, TypedViewBinding<HotTicketsItemView>>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.adapter.HotTicketsItemAdapterDelegateKt$hotTicketsItemAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ int $itemWidthCarousel;
        final /* synthetic */ int $itemWidthSingle;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<TicketVO, TypedViewBinding<HotTicketsItemView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<TicketVO, TypedViewBinding<HotTicketsItemView>> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1, int i11, int i12) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$actionHandler = function1;
            this.$itemWidthSingle = i11;
            this.$itemWidthCarousel = i12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            HotTicketsItemView constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            AdapterDelegateViewBindingViewHolder<TicketVO, TypedViewBinding<HotTicketsItemView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            int i11 = this.$itemWidthSingle;
            int i12 = this.$itemWidthCarousel;
            HotTicketsItemView hotTicketsItemView = constraintLayout;
            hotTicketsItemView.bind(adapterDelegateViewBindingViewHolder.getItem(), function1);
            if (adapterDelegateViewBindingViewHolder.getItem().getIsSingle() && hotTicketsItemView.getWidth() != i11) {
                ViewGroup.LayoutParams layoutParams = hotTicketsItemView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = i11;
                hotTicketsItemView.setLayoutParams(layoutParams);
                return;
            }
            if (adapterDelegateViewBindingViewHolder.getItem().getIsSingle() || hotTicketsItemView.getWidth() == i12) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = hotTicketsItemView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = i12;
            hotTicketsItemView.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HotTicketsItemAdapterDelegateKt$hotTicketsItemAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<TicketVO, TypedViewBinding<HotTicketsItemView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<TicketVO, TypedViewBinding<HotTicketsItemView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$actionHandler, adapterDelegateViewBinding.getContext().getResources().getDisplayMetrics().widthPixels - UiExtKt.toPx(32, adapterDelegateViewBinding.getContext()), UiExtKt.toPx(320, adapterDelegateViewBinding.getContext())));
    }
}
