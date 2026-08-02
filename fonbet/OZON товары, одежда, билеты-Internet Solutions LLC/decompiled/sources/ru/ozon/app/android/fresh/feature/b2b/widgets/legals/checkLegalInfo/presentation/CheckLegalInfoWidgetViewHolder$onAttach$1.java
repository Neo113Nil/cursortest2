package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetCheckLegalInfoBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.presentation.CheckLegalInfoViewModel;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;
import ru.ozon.uni.android.cell.text.TextFieldCellView;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/presentation/CheckLegalInfoViewModel$State;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CheckLegalInfoWidgetViewHolder$onAttach$1 extends AbstractC7737t implements Function1<CheckLegalInfoViewModel.State, Unit> {
    final /* synthetic */ CheckLegalInfoWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckLegalInfoWidgetViewHolder$onAttach$1(CheckLegalInfoWidgetViewHolder checkLegalInfoWidgetViewHolder) {
        super(1);
        this.this$0 = checkLegalInfoWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CheckLegalInfoViewModel.State state) {
        invoke2(state);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CheckLegalInfoViewModel.State state) {
        WidgetCheckLegalInfoBinding widgetCheckLegalInfoBinding;
        WidgetCheckLegalInfoBinding widgetCheckLegalInfoBinding2;
        WidgetCheckLegalInfoBinding widgetCheckLegalInfoBinding3;
        LegalRouter legalRouter;
        if (state instanceof CheckLegalInfoViewModel.State.Success) {
            CheckLegalInfoWidgetViewHolder checkLegalInfoWidgetViewHolder = this.this$0;
            widgetCheckLegalInfoBinding2 = checkLegalInfoWidgetViewHolder.binding;
            TextFieldCellView checkLegalInfoKppInputLayout = widgetCheckLegalInfoBinding2.checkLegalInfoKppInputLayout;
            Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppInputLayout, "checkLegalInfoKppInputLayout");
            checkLegalInfoWidgetViewHolder.hideError(checkLegalInfoKppInputLayout);
            widgetCheckLegalInfoBinding3 = this.this$0.binding;
            widgetCheckLegalInfoBinding3.checkLegalInfoKppInputLayout.setInputStatus(OzonTextInputLayoutModel.Status.SUCCESS);
            legalRouter = this.this$0.router;
            legalRouter.completeFlow();
            return;
        }
        if (state instanceof CheckLegalInfoViewModel.State.KppError) {
            this.this$0.showErrorMessage();
            return;
        }
        if (!(state instanceof CheckLegalInfoViewModel.State.KppErrorWithMessage)) {
            throw new o();
        }
        CheckLegalInfoWidgetViewHolder checkLegalInfoWidgetViewHolder2 = this.this$0;
        widgetCheckLegalInfoBinding = checkLegalInfoWidgetViewHolder2.binding;
        TextFieldCellView checkLegalInfoKppInputLayout2 = widgetCheckLegalInfoBinding.checkLegalInfoKppInputLayout;
        Intrinsics.checkNotNullExpressionValue(checkLegalInfoKppInputLayout2, "checkLegalInfoKppInputLayout");
        checkLegalInfoWidgetViewHolder2.showError(checkLegalInfoKppInputLayout2, ((CheckLegalInfoViewModel.State.KppErrorWithMessage) state).getMessage());
    }
}
