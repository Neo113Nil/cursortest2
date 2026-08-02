package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class VerificationEdoCheckingOperatorViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ VerificationEdoCheckingOperatorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationEdoCheckingOperatorViewHolder$actionHandler$2(VerificationEdoCheckingOperatorViewHolder verificationEdoCheckingOperatorViewHolder) {
        super(1);
        this.this$0 = verificationEdoCheckingOperatorViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        String str;
        String str2;
        VerificationEdoCheckingOperatorViewModel verificationEdoCheckingOperatorViewModel;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean d11 = Intrinsics.d(action.getActionName(), "b2bCreateOwnerVerificationRequest");
        Map<String, String> params = action.getParams();
        if (params == null || (str = params.get("position")) == null) {
            return;
        }
        if (d11) {
            Map<String, String> params2 = action.getParams();
            if (params2 == null || (str2 = params2.get("type")) == null) {
                return;
            }
        } else {
            str2 = null;
        }
        verificationEdoCheckingOperatorViewModel = this.this$0.viewModel;
        verificationEdoCheckingOperatorViewModel.createVerificationRequest(action.getActionName(), str, str2);
    }
}
