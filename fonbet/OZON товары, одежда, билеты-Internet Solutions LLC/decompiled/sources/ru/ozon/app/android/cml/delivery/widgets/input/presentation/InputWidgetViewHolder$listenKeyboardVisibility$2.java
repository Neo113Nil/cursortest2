package ru.ozon.app.android.cml.delivery.widgets.input.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cml.delivery.widgets.input.presentation.InputWidgetViewHolder$listenKeyboardVisibility$2", f = "InputWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class InputWidgetViewHolder$listenKeyboardVisibility$2 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ InputWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputWidgetViewHolder$listenKeyboardVisibility$2(InputWidgetViewHolder inputWidgetViewHolder, d<? super InputWidgetViewHolder$listenKeyboardVisibility$2> dVar) {
        super(2, dVar);
        this.this$0 = inputWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new InputWidgetViewHolder$listenKeyboardVisibility$2(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TextFieldCellView input;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        input = this.this$0.getInput();
        OzonTextInputLayoutExtKt.getEditText(input.getMainView()).clearFocus();
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((InputWidgetViewHolder$listenKeyboardVisibility$2) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
