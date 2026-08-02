package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import com.google.android.gms.common.Scopes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ChangeEmailViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.ComposerAction, Unit> {
    final /* synthetic */ ChangeEmailViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewHolder$actionHandler$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<String> {
        final /* synthetic */ ChangeEmailViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChangeEmailViewHolder changeEmailViewHolder) {
            super(0);
            this.this$0 = changeEmailViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            ChangeEmailView changeEmailView;
            changeEmailView = this.this$0.view;
            return changeEmailView.getEmail();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewHolder$actionHandler$2(ChangeEmailViewHolder changeEmailViewHolder) {
        super(1);
        this.this$0 = changeEmailViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.ComposerAction composerAction) {
        invoke2(composerAction);
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.ComposerAction action) {
        ChangeEmailViewModel changeEmailViewModel;
        List<ChangeEmailVO.InputVO> inputs;
        Intrinsics.checkNotNullParameter(action, "action");
        ChangeEmailVO boundData = this.this$0.getBoundData();
        ChangeEmailVO.InputVO inputVO = null;
        if (boundData != null && (inputs = boundData.getInputs()) != null) {
            Iterator<T> it = inputs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(((ChangeEmailVO.InputVO) next).getName(), Scopes.EMAIL)) {
                    inputVO = next;
                    break;
                }
            }
            inputVO = inputVO;
        }
        changeEmailViewModel = this.this$0.viewModel;
        changeEmailViewModel.onComposerAction(action, inputVO, new AnonymousClass1(this.this$0));
    }
}
