package ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.InputPayload;
import ru.ozon.app.android.travel.molecules.view.commonInput.v1.view.CommonCheckboxInputView;
import ru.ozon.app.android.travel.utils.TypedViewBinding;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$Checkbox;", "Lru/ozon/app/android/travel/utils/TypedViewBinding;", "Lru/ozon/app/android/travel/molecules/view/commonInput/v1/view/CommonCheckboxInputView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<CommonInputVO.Checkbox, TypedViewBinding<CommonCheckboxInputView>>, Unit> {
    final /* synthetic */ Function2<Long, Boolean, Unit> $onCheckboxChanged;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "payload", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.molecules.view.commonInput.v1.presentation.adapter.CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function2<Long, Boolean, Unit> $onCheckboxChanged;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<CommonInputVO.Checkbox, TypedViewBinding<CommonCheckboxInputView>> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<CommonInputVO.Checkbox, TypedViewBinding<CommonCheckboxInputView>> adapterDelegateViewBindingViewHolder, Function2<? super Long, ? super Boolean, Unit> function2) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onCheckboxChanged = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            CommonCheckboxInputView constraintLayout = this.$this_adapterDelegateViewBinding.getBinding().getConstraintLayout();
            AdapterDelegateViewBindingViewHolder<CommonInputVO.Checkbox, TypedViewBinding<CommonCheckboxInputView>> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function2<Long, Boolean, Unit> function2 = this.$onCheckboxChanged;
            CommonCheckboxInputView commonCheckboxInputView = constraintLayout;
            if (payload.contains(InputPayload.CHANGE_VALUE)) {
                commonCheckboxInputView.updateValue(adapterDelegateViewBindingViewHolder.getItem());
                return;
            }
            if (payload.contains(InputPayload.ERROR)) {
                commonCheckboxInputView.bindError(adapterDelegateViewBindingViewHolder.getItem());
            } else if (!payload.contains(InputPayload.CHANGE_VALUE_WITH_ERROR)) {
                commonCheckboxInputView.bind(adapterDelegateViewBindingViewHolder.getItem(), function2);
            } else {
                commonCheckboxInputView.updateValue(adapterDelegateViewBindingViewHolder.getItem());
                commonCheckboxInputView.bindError(adapterDelegateViewBindingViewHolder.getItem());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CheckboxInputAdapterDelegateKt$checkboxInputAdapterDelegate$2(Function2<? super Long, ? super Boolean, Unit> function2) {
        super(1);
        this.$onCheckboxChanged = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<CommonInputVO.Checkbox, TypedViewBinding<CommonCheckboxInputView>> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<CommonInputVO.Checkbox, TypedViewBinding<CommonCheckboxInputView>> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$onCheckboxChanged));
    }
}
