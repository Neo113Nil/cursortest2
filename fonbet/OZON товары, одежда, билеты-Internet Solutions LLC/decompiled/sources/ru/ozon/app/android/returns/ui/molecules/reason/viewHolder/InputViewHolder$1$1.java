package ru.ozon.app.android.returns.ui.molecules.reason.viewHolder;

import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "text", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InputViewHolder$1$1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
    final /* synthetic */ InputViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputViewHolder$1$1(InputViewHolder inputViewHolder) {
        super(4);
        this.this$0 = inputViewHolder;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f71690a;
    }

    public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
        ReasonRow.InputRow inputRow;
        InputViewModel inputViewModel;
        Function1<? super AtomAction, Unit> function1;
        Function2 function2;
        inputRow = this.this$0.boundedData;
        if (inputRow == null) {
            return;
        }
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        inputViewModel = this.this$0.viewModel;
        AtomActionDTO action = inputRow.getAction();
        function1 = this.this$0.onAction;
        inputViewModel.onInputChanged(obj, action, function1);
        function2 = this.this$0.onUpdateComment;
        function2.invoke(Long.valueOf(inputRow.getId()), obj);
    }
}
