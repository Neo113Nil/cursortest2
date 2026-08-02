package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonSelectorInputView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Selector;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonSelectorInputView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SelectorInputAdapterDelegateKt$selectorInputAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<CommonInputVO.Selector, TypedViewBinding<CommonSelectorInputView>>, Unit> {
    final /* synthetic */ Function1<Long, Unit> $onSelectorClicked;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payload", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.SelectorInputAdapterDelegateKt$selectorInputAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<Long, Unit> $onSelectorClicked;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.Selector, TypedViewBinding<CommonSelectorInputView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<CommonInputVO.Selector, TypedViewBinding<CommonSelectorInputView>> adapterDelegateViewBindingViewHolder, Function1<? super Long, Unit> function1) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onSelectorClicked = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            CommonSelectorInputView constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            AdapterDelegateViewBindingViewHolder<CommonInputVO.Selector, TypedViewBinding<CommonSelectorInputView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<Long, Unit> function1 = this.$onSelectorClicked;
            CommonSelectorInputView commonSelectorInputView = constraintLayout;
            if (payload.contains(InputPayload.CHANGE_VALUE)) {
                commonSelectorInputView.updateValue(adapterDelegateViewBindingViewHolder.getItem());
                return;
            }
            if (payload.contains(InputPayload.ERROR)) {
                commonSelectorInputView.bindError(adapterDelegateViewBindingViewHolder.getItem());
            } else if (!payload.contains(InputPayload.CHANGE_VALUE_WITH_ERROR)) {
                commonSelectorInputView.bind(adapterDelegateViewBindingViewHolder.getItem(), function1);
            } else {
                commonSelectorInputView.updateValue(adapterDelegateViewBindingViewHolder.getItem());
                commonSelectorInputView.bindError(adapterDelegateViewBindingViewHolder.getItem());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SelectorInputAdapterDelegateKt$selectorInputAdapterDelegate$2(Function1<? super Long, Unit> function1) {
        super(1);
        this.$onSelectorClicked = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<CommonInputVO.Selector, TypedViewBinding<CommonSelectorInputView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<CommonInputVO.Selector, TypedViewBinding<CommonSelectorInputView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onSelectorClicked));
    }
}
