package ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.adapterdelegates.dsl.AdapterDelegateViewBindingViewHolder;
import ru.ozon.app.android.travel.feature.avia.databinding.ItemHelpInsuranceStepBinding;
import ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.HelpInsuranceVO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/adapterdelegates/dsl/AdapterDelegateViewBindingViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/helpInsurance/presentation/HelpInsuranceVO$StepVO;", "Lru/ozon/app/android/travel/feature/avia/databinding/ItemHelpInsuranceStepBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class HelpInsuranceStepAdapterDelegateKt$helpInsuranceStepAdapterDelegate$2 extends AbstractC7737t implements Function1<AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.StepVO, ItemHelpInsuranceStepBinding>, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.helpInsurance.presentation.adapters.HelpInsuranceStepAdapterDelegateKt$helpInsuranceStepAdapterDelegate$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.StepVO, ItemHelpInsuranceStepBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.StepVO, ItemHelpInsuranceStepBinding> adapterDelegateViewBindingViewHolder, Function1<? super AtomAction, Unit> function1) {
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
            HelpInsuranceVO.StepVO item = this.$this_adapterDelegateViewBinding.getItem();
            AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.StepVO, ItemHelpInsuranceStepBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            Function1<AtomAction, Unit> function1 = this.$actionHandler;
            HelpInsuranceVO.StepVO stepVO = item;
            TextAtomView titleStepTAV = adapterDelegateViewBindingViewHolder.getBinding().titleStepTAV;
            Intrinsics.checkNotNullExpressionValue(titleStepTAV, "titleStepTAV");
            TextAtomHolderKt.bind$default(titleStepTAV, stepVO.getTitle(), null, 2, null);
            TextAtomView descriptionStepTAV = adapterDelegateViewBindingViewHolder.getBinding().descriptionStepTAV;
            Intrinsics.checkNotNullExpressionValue(descriptionStepTAV, "descriptionStepTAV");
            TextAtomHolderKt.bind(descriptionStepTAV, stepVO.getDescription(), function1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HelpInsuranceStepAdapterDelegateKt$helpInsuranceStepAdapterDelegate$2(Function1<? super AtomAction, Unit> function1) {
        super(1);
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.StepVO, ItemHelpInsuranceStepBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<HelpInsuranceVO.StepVO, ItemHelpInsuranceStepBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding, this.$actionHandler));
    }
}
