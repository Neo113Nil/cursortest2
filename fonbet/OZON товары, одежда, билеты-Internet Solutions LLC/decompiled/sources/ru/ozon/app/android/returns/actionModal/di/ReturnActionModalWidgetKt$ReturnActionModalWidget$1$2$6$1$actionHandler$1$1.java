package ru.ozon.app.android.returns.actionModal.di;

import Tg.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionModalViewModel;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "action", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$actionHandler$1$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ i<ReturnActionModalVO> $this_content;
    final /* synthetic */ ReturnActionModalViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$actionHandler$1$1(ReturnActionModalViewModel returnActionModalViewModel, i<ReturnActionModalVO> iVar) {
        super(1);
        this.$viewModel = returnActionModalViewModel;
        this.$this_content = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b action) {
        boolean z11;
        Intrinsics.checkNotNullParameter(action, "action");
        if ((action instanceof AtomAction.ComposerAction) && Intrinsics.d(((AtomAction.ComposerAction) action).getActionName(), "processReturnActionV2")) {
            this.$viewModel.onSubmitButtonClicked((AtomAction) action, this.$this_content.b());
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}
